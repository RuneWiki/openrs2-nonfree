import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public static int anInt966;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)V")
	public static void method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static543.anInt9105 == 1) {
			Static353.method5666(Static445.aClass3_Sub7_Sub19_30, arg0, arg1);
		} else if (Static543.anInt9105 == 2) {
			if (Static80.aBoolean118) {
				Static445.method6663(arg0 + Static211.method3297(), Static551.method7856() + arg1);
			} else {
				Static445.method6663(arg0, arg1);
			}
		}
		Static445.aClass3_Sub7_Sub19_30 = null;
		Static543.anInt9105 = 0;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!cea;BI[I)V")
	public static void method919(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray666 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray666.length; local8++) {
				if (arg0.anIntArray666[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt10193 != -1) {
				@Pc(44) Class267 local44 = Static474.aClass264_2.method6574(arg0.anInt10193);
				@Pc(47) int local47 = local44.anInt7585;
				if (local47 == 1) {
					arg0.anInt10186 = 0;
					arg0.anInt10192 = 0;
					arg0.anInt10214 = 1;
					arg0.anInt10219 = arg1;
					arg0.anInt10189 = 0;
					if (!arg0.aBoolean772) {
						Static522.method7586(arg0.anInt10189, arg0, local44);
					}
				}
				if (local47 == 2) {
					arg0.anInt10186 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray666 == null || arg0.anIntArray666[local8] == -1 || Static474.aClass264_2.method6574(arg2[local8]).anInt7582 >= Static474.aClass264_2.method6574(arg0.anIntArray666[local8]).anInt7582) {
				arg0.anIntArray666 = arg2;
				arg0.anInt10219 = arg1;
				break;
			}
		}
		if (local6) {
			arg0.anIntArray666 = arg2;
			arg0.anInt10219 = arg1;
		}
	}
}
