import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!di", name = "Y", descriptor = "B")
	public static byte aByte29;

	@OriginalMember(owner = "client!di", name = "db", descriptor = "I")
	public static int anInt1889;

	@OriginalMember(owner = "client!di", name = "fb", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray5;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "[I")
	public static int[] anIntArray132 = new int[2];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!hg;I)V")
	public static void method1529(@OriginalArg(1) Class13_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (Static262.anInt5597 < arg0.anInt4619) {
			Static50.method814(arg0);
		} else if (arg0.anInt4630 < Static262.anInt5597) {
			Static512.method7195(arg0, false);
			local14 = Static41.anInt827;
			local12 = Static512.anInt8551;
		} else {
			Static84.method1200(arg0);
		}
		if (arg0.anInt10090 < 512 || arg0.anInt10089 < 512 || arg0.anInt10090 >= Static228.anInt3704 * 512 - 512 || arg0.anInt10089 >= Static162.anInt2911 * 512 - 512) {
			local12 = -1;
			arg0.anInt4559 = -1;
			arg0.anInt4624 = -1;
			arg0.anInt4630 = 0;
			arg0.anIntArray300 = null;
			arg0.anInt4619 = 0;
			local14 = 0;
			arg0.anInt4556 = -1;
			arg0.anInt10090 = arg0.anIntArray307[0] * 512 + arg0.method3950() * 256;
			arg0.anInt10089 = arg0.anIntArray306[0] * 512 + arg0.method3950() * 256;
			arg0.method3957();
		}
		if (arg0 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt10090 < 6144 || arg0.anInt10089 < 6144 || Static228.anInt3704 * 512 - 6144 <= arg0.anInt10090 || arg0.anInt10089 >= Static162.anInt2911 * 512 - 6144)) {
			arg0.anInt4624 = -1;
			arg0.anInt4559 = -1;
			arg0.anInt4630 = 0;
			local14 = 0;
			arg0.anInt4556 = -1;
			local12 = -1;
			arg0.anIntArray300 = null;
			arg0.anInt4619 = 0;
			arg0.anInt10090 = arg0.anIntArray307[0] * 512 + arg0.method3950() * 256;
			arg0.anInt10089 = arg0.anIntArray306[0] * 512 + arg0.method3950() * 256;
			arg0.method3957();
		}
		@Pc(216) int local216 = Static308.method4204(arg0);
		Static223.method3043(arg0);
		Static550.method7574(local216, local14, arg0, local12);
		Static309.method4209(arg0, local12);
		Static339.method4575(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIILclient!ep;IIZ[I)Lclient!dd;")
	public static Class65_Sub1_Sub1 method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class95_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg2.aBoolean173 || Static485.method6790(arg4) && Static485.method6790(arg3)) {
			return new Class65_Sub1_Sub1(arg2, 3553, arg4, arg3, false, arg5, arg0, 0);
		} else if (arg2.aBoolean176) {
			return new Class65_Sub1_Sub1(arg2, 34037, arg4, arg3, false, arg5, arg0, 0);
		} else {
			return new Class65_Sub1_Sub1(arg2, arg4, arg3, Static350.method4699(arg4), Static350.method4699(arg3), arg5);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	public static void method1531() {
		for (@Pc(1) int local1 = 0; local1 < Static332.anInt5259; local1++) {
			@Pc(6) Class13_Sub1_Sub1 local6 = Static335.aClass13_Sub1_Sub1Array1[local1];
			Static12.method182(local6, true);
			Static335.aClass13_Sub1_Sub1Array1[local1] = null;
		}
		Static332.anInt5259 = 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
	public static void method1534(@OriginalArg(0) int arg0) {
		Static514.method7200();
		@Pc(24) int local24 = Static361.aClass106_1.method2248(arg0).anInt7687;
		if (local24 == 0) {
			return;
		}
		@Pc(32) int local32 = Static431.aClass205_1.anIntArray348[arg0];
		if (local24 == 6) {
			Static61.anInt1163 = local32;
		}
		if (local24 == 5) {
			Static95.anInt1810 = local32;
		}
	}
}
