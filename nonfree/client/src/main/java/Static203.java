import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
	public static int anInt3379;

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "Lclient!th;")
	public static Class188 aClass188_7;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
	public static int anInt3378 = 20;

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray15 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "Lclient!wj;")
	public static final Class212 aClass212_2 = new Class212();

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
	public static int anInt3384 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = arg2; local14 <= arg3; local14++) {
			for (@Pc(18) int local18 = arg4; local18 <= arg1; local18++) {
				if (arg0 == Static10.anIntArrayArray12[local14][local18] && Static320.anIntArrayArray166[local14][local18] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIZ)V")
	public static void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class105 local9 = Static122.aClass105ArrayArray3[arg1][arg0];
		if (local9 != null) {
			Static131.anInt2733 = local9.anInt3253;
			Static349.anInt6922 = local9.anInt3259;
			Static258.anInt5134 = local9.anInt3251;
		}
		Static19.method674();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V")
	public static void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(1, arg1);
		local8.method5537();
		local8.anInt6362 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)Lclient!jj;")
	public static Class98 method3130(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static127.aFloat34 == 3.0D) {
				return Static167.aClass98_6;
			}
			if ((double) Static127.aFloat34 == 4.0D) {
				return Static60.aClass98_3;
			}
			if ((double) Static127.aFloat34 == 6.0D) {
				return Static262.aClass98_7;
			}
			if ((double) Static127.aFloat34 >= 8.0D) {
				return Static66.aClass98_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static127.aFloat34 == 3.0D) {
				return Static262.aClass98_7;
			}
			if ((double) Static127.aFloat34 == 4.0D) {
				return Static66.aClass98_5;
			}
			if ((double) Static127.aFloat34 == 6.0D) {
				return Static293.aClass98_8;
			}
			if ((double) Static127.aFloat34 >= 8.0D) {
				return Static344.aClass98_10;
			}
		} else if (arg0 == 2) {
			if ((double) Static127.aFloat34 == 3.0D) {
				return Static293.aClass98_8;
			}
			if ((double) Static127.aFloat34 == 4.0D) {
				return Static344.aClass98_10;
			}
			if ((double) Static127.aFloat34 == 6.0D) {
				return Static25.aClass98_4;
			}
			if ((double) Static127.aFloat34 >= 8.0D) {
				return Static343.aClass98_9;
			}
		}
		return null;
	}
}
