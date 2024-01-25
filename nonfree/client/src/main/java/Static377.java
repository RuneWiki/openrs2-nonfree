import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
	public static int[] anIntArray796;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_175 = new Class77(17, 2);

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_201 = new Class41(77, -1);

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_202 = new Class41(73, 3);

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method5660() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static57.aBooleanArray108[local7] = false;
		}
		Static26.anInt620 = Static22.anInt547;
		Static53.anInt1096 = -1;
		Static144.anInt2614 = Static295.anInt5281;
		Static213.anInt3924 = 0;
		Static283.anInt5017 = 5;
		Static266.anInt4685 = Static71.anInt1354;
		Static368.anInt6428 = 0;
		Static283.anInt5014 = Static160.anInt2915;
		Static159.anInt2909 = -1;
		Static285.anInt5066 = Static278.anInt1556;
		Static309.anInt5489 = Static392.anInt6749;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!pf;)V")
	public static void method5661(@OriginalArg(1) Class2_Sub13_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static254.anInt4548; local3++) {
			@Pc(9) int local9 = Static367.anIntArray779[local3];
			@Pc(13) Class12_Sub1_Sub2_Sub2 local13 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method4240();
			if ((local17 & 0x8) != 0) {
				local17 += arg0.method4240() << 8;
			}
			Static154.method2586(local13, local17, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method5662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static22.anInt539 = arg0;
		Static76.anInt1484 = arg1;
		Static356.anInt6270 = arg4;
		Static250.anInt4500 = arg3;
		Static239.anInt4366 = arg2;
		if (arg5 && Static76.anInt1484 >= 100) {
			Static22.anInt547 = Static250.anInt4500 * 128 + 64;
			Static160.anInt2915 = Static239.anInt4366 * 128 + 64;
			Static71.anInt1354 = Static18.method508(Static22.anInt547, Static331.anInt5804, Static160.anInt2915) - Static22.anInt539;
		}
		Static283.anInt5017 = 2;
	}
}
