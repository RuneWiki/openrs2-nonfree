import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[Lclient!df;")
	public static Class8_Sub1[] aClass8_Sub1Array5;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_124 = new Class387(89, 3);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
	public static boolean aBoolean774 = false;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt10547 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZJ)I")
	public static int method9044(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method9045(@OriginalArg(1) Class57 arg0) {
		for (@Pc(6) Class8_Sub5 local6 = (Class8_Sub5) Static120.aClass98_2.method1777(); local6 != null; local6 = (Class8_Sub5) Static120.aClass98_2.method1782()) {
			if (local6.aBoolean441) {
				local6.method4907(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)V")
	public static void method9047(@OriginalArg(1) long arg0) {
		if (Static260.aClass174ArrayArrayArray2 != null) {
			if (Static79.anInt1216 == 1 || Static79.anInt1216 == 5) {
				Static583.method8401(arg0);
			} else if (Static79.anInt1216 == 4) {
				Static570.method8205(arg0);
			}
		}
		Static323.method4945((long) Static44.anInt740, Static457.aClass57_11);
		if (Static390.anInt6669 != -1) {
			Static91.method1356(Static390.anInt6669);
		}
		for (@Pc(61) int local61 = 0; local61 < Static449.anInt7746; local61++) {
			if (Static386.aBooleanArray13[local61]) {
				Static587.aBooleanArray26[local61] = true;
			}
			Static559.aBooleanArray25[local61] = Static386.aBooleanArray13[local61];
			Static386.aBooleanArray13[local61] = false;
		}
		Static140.anInt2267 = Static44.anInt740;
		Static89.method1350(-1, (Class73) null, -1);
		Static530.method7641(-1, -1, (Class73) null);
		if (Static390.anInt6669 != -1) {
			Static449.anInt7746 = 0;
			Static643.method8969();
		}
		Static457.aClass57_11.la();
		Static38.method661(Static457.aClass57_11);
		@Pc(128) int local128 = Static291.method4317();
		if (local128 == -1) {
			local128 = Static446.anInt7686;
		}
		if (local128 == -1) {
			local128 = Static273.anInt4776;
		}
		Static106.method1540(local128);
		@Pc(148) int local148 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() << 8;
		Static536.method7909(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 + local148, Static315.anInt5591, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 + local148);
		Static315.anInt5591 = 0;
	}
}
