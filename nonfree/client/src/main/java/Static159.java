import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!lg;")
	public static Class177 aClass177_3;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt3491 = 0;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_70 = new Class114("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
	public static boolean method3139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static25.aBoolean94) {
			return false;
		}
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(20) int local20 = arg0 & 0xFFFF;
		if (Static352.aClass309ArrayArray2[local11] == null || Static352.aClass309ArrayArray2[local11][local20] == null) {
			return false;
		}
		@Pc(38) Class309 local38 = Static352.aClass309ArrayArray2[local11][local20];
		@Pc(53) Class1_Sub50 local53;
		if (arg1 == -1 && local38.anInt8802 == 0) {
			for (local53 = (Class1_Sub50) Static475.aClass38_69.method1419(); local53 != null; local53 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
				if (local53.anInt8983 == 5 || local53.anInt8983 == 1002 || local53.anInt8983 == 2 || local53.anInt8983 == 16 || local53.anInt8983 == 10) {
					for (@Pc(85) Class309 local85 = Static80.method2005(local53.anInt8979); local85 != null; local85 = Static488.method7056(local85)) {
						if (local85.anInt8750 == local38.anInt8750) {
							return true;
						}
					}
				}
			}
		} else {
			for (local53 = (Class1_Sub50) Static475.aClass38_69.method1419(); local53 != null; local53 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
				if (local53.anInt8981 == arg1 && local38.anInt8750 == local53.anInt8979 && (local53.anInt8983 == 5 || local53.anInt8983 == 1002 || local53.anInt8983 == 2 || local53.anInt8983 == 16 || local53.anInt8983 == 10)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static192.method3615(arg0, arg1) | (arg1 & 0x60000) != 0 || Static163.method3252(arg1, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIIIIIB)V")
	public static void method3142(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 > 0 && !Static183.method3500(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static183.method3500(arg2)) {
			@Pc(37) int local37 = Static72.method1940(arg1);
			@Pc(47) int local47 = 0;
			@Pc(58) int local58 = arg2 > arg3 ? arg3 : arg2;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(66) int local66 = arg2 >> 1;
			@Pc(68) byte[] local68 = arg0;
			@Pc(75) byte[] local75 = new byte[local62 * local66 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local47, arg4, arg3, arg2, 0, arg1, 5121, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(95) int local95 = local37 * arg3;
				for (@Pc(97) int local97 = 0; local97 < local37; local97++) {
					@Pc(100) int local100 = local97;
					@Pc(102) int local102 = local97;
					@Pc(107) int local107 = local97 + local95;
					for (@Pc(109) int local109 = 0; local109 < local66; local109++) {
						for (@Pc(112) int local112 = 0; local112 < local62; local112++) {
							@Pc(117) byte local117 = local68[local102];
							local102 += local37;
							@Pc(127) int local127 = local117 + local68[local102];
							local102 += local37;
							@Pc(137) int local137 = local127 + local68[local107];
							local107 += local37;
							@Pc(147) int local147 = local137 + local68[local107];
							local107 += local37;
							local75[local100] = (byte) (local147 >> 2);
							local100 += local37;
						}
						local102 += local95;
						local107 += local95;
					}
				}
				@Pc(188) byte[] local188 = local75;
				local75 = local68;
				local68 = local188;
				arg2 = local66;
				arg3 = local62;
				local66 >>= 0x1;
				local62 >>= 0x1;
				local47++;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
