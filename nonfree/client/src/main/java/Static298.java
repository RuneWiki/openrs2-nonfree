import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_38 = new Class183();

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_112 = new Class83("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "S")
	public static short aShort67 = 256;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg0; local11++) {
				if (Static50.anIntArrayArray8[local7][local11] == arg3 && Static44.anIntArrayArray7[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method4085() {
		Static70.method1340((long) Static24.anInt5323, Static122.aClass19_16);
		if (Static334.anInt5766 != -1) {
			Static146.method208(Static334.anInt5766);
		}
		for (@Pc(24) int local24 = 0; local24 < Static229.anInt4407; local24++) {
			if (Static416.aBooleanArray21[local24]) {
				Static263.aBooleanArray15[local24] = true;
			}
			Static65.aBooleanArray9[local24] = Static416.aBooleanArray21[local24];
			Static416.aBooleanArray21[local24] = false;
		}
		Static250.anInt4639 = Static24.anInt5323;
		if (Static122.aClass19_16.method4243()) {
			Static401.aBoolean600 = true;
		}
		if (Static334.anInt5766 != -1) {
			Static229.anInt4407 = 0;
			Static445.method5615();
		}
		Static122.aClass19_16.e();
		Static368.method4938(Static343.anInt770);
		Static176.anInt3414 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	public static void method4086() {
		Static342.aClass57Array13 = null;
		Static151.aClass57Array8 = null;
		Static309.aClass57Array10 = null;
		Static410.aClass57Array17 = null;
		Static207.aClass46_9 = null;
		Static43.aClass46_12 = null;
		Static389.aClass57_22 = null;
		Static107.aClass57Array6 = null;
		Static333.aClass57Array12 = null;
		Static59.aClass57Array3 = null;
		Static455.aClass57Array11 = null;
		Static126.aClass57Array7 = null;
		Static429.aClass57Array18 = null;
		Static185.aClass57Array9 = null;
		Static77.aClass57Array4 = null;
		Static331.aClass46_10 = null;
		Static163.aClass57_16 = null;
		Static349.aClass57Array14 = null;
	}
}
