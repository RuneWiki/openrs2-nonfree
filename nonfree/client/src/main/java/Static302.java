import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
	public static int[] anIntArray607;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!ci;")
	public static Class21 aClass21_6;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!rj;")
	public static Class13 aClass13_7;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "F")
	public static float aFloat90 = 0.0F;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public static int anInt4751 = 0;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString192 = "Attack";

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!eb;I)V")
	public static void method4312(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (Static346.aClass69_7 == null) {
			return;
		}
		try {
			Static346.aClass69_7.method1917(0L);
			Static346.aClass69_7.method1916(arg0.aByteArray58, arg1, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z")
	public static boolean method4313(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!b;Lclient!aa;IILclient!u;Lclient!ne;)V")
	public static void method4314(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class202 arg5, @OriginalArg(7) Class1_Sub25 arg6) {
		@Pc(15) int local15 = arg6.anInt4121 - arg3 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg5.anInt5911 != 0) {
			arg2.method3277(local19, arg1.method435() * arg0 + arg4 + 1 - local19, local15, arg5.anInt5911, arg3 + 10);
		}
		if (arg5.anInt5896 != 0) {
			arg2.method3269(arg5.anInt5896, local19, arg3 + 10, local15, arg4 + arg1.method435() * arg0 + 1 - local19);
		}
		@Pc(71) int local71 = arg5.anInt5906;
		if (arg6.aBoolean349 && arg5.anInt5898 != -1) {
			local71 = arg5.anInt5898;
		}
		for (@Pc(87) int local87 = 0; local87 < arg0; local87++) {
			@Pc(93) String local93 = Static107.aStringArray19[local87];
			if (arg0 - 1 > local87) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg1.method436(arg2, local93, arg6.anInt4121, arg4, local71);
			arg4 += arg1.method435();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIBI)V")
	public static void method4315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static106.anInt2157 <= arg1 - arg3 && arg1 + arg3 <= Static251.anInt6512 && Static49.anInt1124 <= arg0 - arg3 && Static291.anInt5657 >= arg3 + arg0) {
			Static44.method1006(arg3, arg1, arg2, arg0);
		} else {
			Static253.method4497(arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)[Lclient!qi;")
	public static Class164[] method4316() {
		if (Static166.aClass164Array1 == null) {
			@Pc(7) Class164[] local7 = Static293.method5025(Static180.aClass110_6);
			@Pc(11) Class164[] local11 = new Class164[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(66) int local66;
			@Pc(72) Class164 local72;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class164 local21 = local7[local15];
				if ((local21.anInt4852 <= 0 || local21.anInt4852 >= 24) && local21.anInt4856 >= 800 && local21.anInt4851 >= 600 && (Static157.anInt3131 >= 96 || Static258.anInt5029 != 0 || local21.anInt4856 <= 1024 && local21.anInt4851 <= 768)) {
					for (local66 = 0; local66 < local13; local66++) {
						local72 = local11[local66];
						if (local72.anInt4856 == local21.anInt4856 && local21.anInt4851 == local72.anInt4851) {
							if (local21.anInt4852 > local72.anInt4852) {
								local11[local66] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static166.aClass164Array1 = new Class164[local13];
			Static367.method5381(local11, 0, Static166.aClass164Array1, 0, local13);
			@Pc(128) int[] local128 = new int[Static166.aClass164Array1.length];
			for (local66 = 0; local66 < Static166.aClass164Array1.length; local66++) {
				local72 = Static166.aClass164Array1[local66];
				local128[local66] = local72.anInt4851 * local72.anInt4856;
			}
			Static29.method845(local128, Static166.aClass164Array1);
		}
		return Static166.aClass164Array1;
	}
}
