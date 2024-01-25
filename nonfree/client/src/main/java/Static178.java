import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public static int anInt3526;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
	public static int anInt3535;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "[[[Lclient!r;")
	public static Class174[][][] aClass174ArrayArrayArray3;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
	public static boolean aBoolean274 = true;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
	public static int anInt3531 = 10;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "[I")
	public static final int[] anIntArray358 = new int[500];

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_81 = new Class85("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ea;Lclient!fk;IILclient!qg;IILclient!wk;)V")
	public static void method3192(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub32 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class215 arg6) {
		@Pc(14) int local14 = arg3.anInt5144 - arg4 / 2 - 5;
		@Pc(23) int local23 = arg5 + 2;
		if (arg6.anInt6759 != 0) {
			arg0.method5254(arg4 + 10, arg6.anInt6759, arg5 + arg1.method1627() * arg2 + 1 - local23, local14, local23);
		}
		if (arg6.anInt6764 != 0) {
			arg0.method5251(local14, arg6.anInt6764, arg4 + 10, arg1.method1627() * arg2 + arg5 + -local23 - -1, local23);
		}
		@Pc(74) int local74 = arg6.anInt6757;
		if (arg3.aBoolean430 && arg6.anInt6748 != -1) {
			local74 = arg6.anInt6748;
		}
		for (@Pc(86) int local86 = 0; local86 < arg2; local86++) {
			@Pc(92) String local92 = Static314.aStringArray62[local86];
			if (arg2 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg1.method1626(arg0, local92, arg3.anInt5144, arg5, local74);
			arg5 += arg1.method1627();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3194(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static125.aClass5_Sub12_Sub2_3.method5125(245);
		Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0) + 1);
		Static125.aClass5_Sub12_Sub2_3.method5089(arg1);
		Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public static void method3195() {
		Static212.aClass109_45.method2859(5);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
	public static void method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static163.anInt3234 <= arg0 && arg1 <= Static353.anInt6760 && Static75.anInt1447 <= arg4 && arg2 <= Static346.anInt6668) {
			Static217.method3998(arg3, arg0, arg1, arg4, arg2);
		} else {
			Static283.method4922(arg1, arg2, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLclient!vg;)V")
	public static void method3197(@OriginalArg(1) Class201 arg0) {
		@Pc(11) Class201 local11 = Static180.method3264(arg0);
		@Pc(19) int local19;
		@Pc(16) int local16;
		if (local11 == null) {
			local16 = Static256.anInt5066;
			local19 = Static168.anInt3376;
		} else {
			local16 = local11.anInt6510;
			local19 = local11.anInt6505;
		}
		Static93.method1721(false, arg0, local19, local16);
		Static187.method3350(local19, local16, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(35) int local35 = Static23.aShort2 + local7 * (Static163.aShort26 - Static23.aShort2) / 100;
		@Pc(41) int local41 = arg2 * local35 >> 8;
		@Pc(48) int local48 = 16384 - arg0 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg1 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local41;
		if (local48 != 0) {
			local58 = Class187.anIntArray571[local48] * -local41 >> 15;
			local60 = Class187.anIntArray570[local48] * local41 >> 15;
		}
		if (local54 != 0) {
			local56 = local60 * Class187.anIntArray571[local54] >> 15;
			local60 = local60 * Class187.anIntArray570[local54] >> 15;
		}
		Static304.anInt5915 = 0;
		Static102.anInt1934 = arg5 - local58;
		Static42.anInt731 = arg0;
		Static271.anInt5301 = arg4 - local56;
		Static21.anInt466 = arg3 - local60;
		Static258.anInt5088 = arg1;
	}
}
