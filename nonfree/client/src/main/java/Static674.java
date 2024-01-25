import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIILclient!ha;)V")
	public static void method9827(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class101 arg4) {
		Static435.aClass101_11 = arg4;
		Static568.aClass76_15 = Static435.aClass101_11.method8141();
		Static25.aClass76_1 = Static435.aClass101_11.method8141();
		Static481.aClass76_14 = Static435.aClass101_11.method8141();
		Static341.anInt6402 = arg1;
		Static255.anInt4904 = 1;
		Static532.anInt9333 = arg2;
		Static473.anInt8444 = 2;
		Static90.anInt1656 = 2;
		Static64.anInterface17_1 = null;
		Static7.anInt133 = 0;
		Static130.anInt2508 = 0;
		Static474.method7543(arg3, arg0);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!uf;Lclient!ha;B)V")
	public static void method9828(@OriginalArg(0) Class357 arg0, @OriginalArg(1) Class101 arg1) {
		@Pc(33) boolean local33 = Static372.aClass343_1.method8554(arg0.anInt10433, arg0.anInt10400, arg1, arg0.anInt10481 | 0xFF000000, arg0.anInt10398, arg0.aBoolean763 ? Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 : null, arg0.anInt10396) == null;
		if (local33) {
			Static510.aClass271_52.method7174(new Class2_Sub50(arg0.anInt10396, arg0.anInt10398, arg0.anInt10400, arg0.anInt10481 | 0xFF000000, arg0.anInt10433, arg0.aBoolean763));
			Static473.method7526(arg0);
		}
	}
}
