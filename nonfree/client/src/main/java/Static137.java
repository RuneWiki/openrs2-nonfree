import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	public static int anInt2795;

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1300 = Static193.method3027("compass");

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ke;Lclient!ke;IZZ)V")
	public static void method1960(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static14.aClass52_5 = arg1;
		Static109.aBoolean113 = arg2;
		Static108.aClass52_26 = arg0;
		Static40.aBoolean53 = arg3;
		Static123.aClass94_5 = new Class94(30);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z")
	public static boolean method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static208.anIntArrayArrayArray10[arg0][arg1][arg2];
		if (local7 == -Static90.anInt1778) {
			return false;
		} else if (local7 == Static90.anInt1778) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static116.method2444(local22 + 1, Static210.anIntArrayArrayArray12[arg0][arg1][arg2], local26 + 1) && Static116.method2444(local22 + 128 - 1, Static210.anIntArrayArrayArray12[arg0][arg1 + 1][arg2], local26 + 1) && Static116.method2444(local22 + 128 - 1, Static210.anIntArrayArrayArray12[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static116.method2444(local22 + 1, Static210.anIntArrayArrayArray12[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static208.anIntArrayArrayArray10[arg0][arg1][arg2] = Static90.anInt1778;
				return true;
			} else {
				Static208.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static90.anInt1778;
				return false;
			}
		}
	}
}
