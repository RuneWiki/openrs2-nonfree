import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "Lclient!mf;")
	public static Class69 aClass69_11;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_943 = Static161.method2452("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "S")
	public static short aShort37 = 205;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	public static int method1925(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method1927(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static5.aBoolean5) {
			try {
				@Pc(25) Class68 local25 = (Class68) Class.forName("Class68_Sub1").getDeclaredConstructor().newInstance();
				local25.method2457(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static5.aBoolean5 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[Lclient!p;IBZ[B)V")
	public static void method1929(@OriginalArg(0) int arg0, @OriginalArg(1) Class76[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) Class5_Sub6 local10 = new Class5_Sub6(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method3048();
			if (local16 == 0) {
				return;
			}
			@Pc(20) int local20 = 0;
			local12 += local16;
			while (true) {
				@Pc(28) int local28 = local10.method3033();
				if (local28 == 0) {
					break;
				}
				local20 += local28 - 1;
				@Pc(40) int local40 = local20 >> 12;
				@Pc(44) int local44 = local20 & 0x3F;
				@Pc(48) int local48 = local10.method3062();
				@Pc(52) int local52 = local44 + arg0;
				@Pc(56) int local56 = local48 >> 2;
				@Pc(62) int local62 = local20 >> 6 & 0x3F;
				@Pc(66) int local66 = local48 & 0x3;
				@Pc(71) int local71 = local62 + arg2;
				if (local71 > 0 && local52 > 0 && local71 < 103 && local52 < 103) {
					@Pc(88) Class76 local88 = null;
					@Pc(92) int local92 = local40;
					if ((Static168.aByteArrayArrayArray13[1][local71][local52] & 0x2) == 2) {
						local92 = local40 - 1;
					}
					if (local92 >= 0) {
						local88 = arg1[local92];
					}
					Static72.method1183(local52, local88, local66, Static14.aBoolean14, local40, true, local56, local40, local71, local12);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)I")
	public static int method1937(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
