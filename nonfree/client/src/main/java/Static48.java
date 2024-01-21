import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	public static int anInt1280;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "Lclient!ed;")
	public static Class23 aClass23_493 = Static169.method2903("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "Lclient!ed;")
	public static Class23 aClass23_494 = Static169.method2903("::noclip");

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_495 = Static169.method2903("sl_arrows");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
	public static void method783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static38.anInt1037 < 2 && Static144.anInt3643 == 0 && !Static156.aBoolean195) {
			return;
		}
		@Pc(45) Class23 local45;
		if (Static144.anInt3643 == 1 && Static38.anInt1037 < 2) {
			local45 = Static149.method2571(new Class23[] { Static176.aClass23_1596, Static88.aClass23_872, Static170.aClass23_284, Static146.aClass23_1394 });
		} else if (Static156.aBoolean195 && Static38.anInt1037 < 2) {
			local45 = Static149.method2571(new Class23[] { Static123.aClass23_1195, Static88.aClass23_872, Static25.aClass23_277, Static146.aClass23_1394 });
		} else {
			local45 = Static152.method2436(Static38.anInt1037 - 1);
		}
		if (Static38.anInt1037 > 2) {
			local45 = Static149.method2571(new Class23[] { local45, Static86.aClass23_858, Static27.method498(Static38.anInt1037 - 2), Static36.aClass23_385 });
		}
		@Pc(130) int local130 = Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3055(local45, arg0 + 4, arg1 + 15, Static132.aRandom3, Static110.anInt2829);
		Static176.method2991(arg0 + 4, 15, arg1, Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3056(local45) + local130);
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	public static void method785() {
		aClass23_493 = null;
		aClass23_495 = null;
		aClass23_494 = null;
		aBooleanArray6 = null;
	}
}
