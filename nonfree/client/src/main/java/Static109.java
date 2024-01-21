import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!kc;")
	public static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 aClass4_Sub3_Sub6_Sub2_5;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!ka;")
	public static Class4_Sub11 aClass4_Sub11_1;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	public static int anInt2592;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "[[S")
	public static short[][] aShortArrayArray34;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!cb;")
	public static Class12 aClass12_25 = new Class12(500);

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "J")
	public static long aLong85 = 0L;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	public static int anInt2593 = 0;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_1008 = Static41.method597("Schlie-8en");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method1802() {
		while (true) {
			if (Static96.aClass4_Sub9_Sub1_2.method825(Static7.anInt79) >= 27) {
				@Pc(16) int local16 = Static96.aClass4_Sub9_Sub1_2.method833(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local16] == null) {
						local21 = true;
						Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local16] = new Class4_Sub3_Sub1_Sub2_Sub2();
					}
					@Pc(37) Class4_Sub3_Sub1_Sub2_Sub2 local37 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local16];
					Static59.anIntArray173[Static36.anInt1010++] = local16;
					local37.anInt1394 = Static118.anInt2741;
					@Pc(53) int local53 = Static96.aClass4_Sub9_Sub1_2.method833(1);
					if (local53 == 1) {
						Static35.anIntArray97[Static9.anInt116++] = local16;
					}
					@Pc(75) int local75 = Static96.aClass4_Sub9_Sub1_2.method833(1);
					@Pc(80) int local80 = Static96.aClass4_Sub9_Sub1_2.method833(5);
					if (local80 > 15) {
						local80 -= 32;
					}
					local37.aClass4_Sub3_Sub13_1 = Static110.method1820(Static96.aClass4_Sub9_Sub1_2.method833(14));
					@Pc(103) int local103 = Static96.aClass4_Sub9_Sub1_2.method833(5);
					@Pc(110) int local110 = Static42.anIntArray115[Static96.aClass4_Sub9_Sub1_2.method833(3)];
					local37.anInt1401 = local37.aClass4_Sub3_Sub13_1.anInt2204;
					local37.anInt1434 = local37.aClass4_Sub3_Sub13_1.anInt2214;
					local37.anInt1405 = local37.aClass4_Sub3_Sub13_1.anInt2208;
					local37.anInt1399 = local37.aClass4_Sub3_Sub13_1.anInt2206;
					local37.anInt1390 = local37.aClass4_Sub3_Sub13_1.anInt2221;
					local37.anInt1429 = local37.aClass4_Sub3_Sub13_1.anInt2226;
					local37.anInt1410 = local37.aClass4_Sub3_Sub13_1.anInt2212;
					local37.anInt1384 = local37.aClass4_Sub3_Sub13_1.anInt2228;
					local37.anInt1435 = local37.aClass4_Sub3_Sub13_1.anInt2217;
					if (local21) {
						local37.anInt1414 = local37.anInt1415 = local110;
					}
					if (local37.anInt1390 == 0) {
						local37.anInt1415 = 0;
					}
					if (local103 > 15) {
						local103 -= 32;
					}
					local37.method856(local75 == 1, local103 + Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], local80 + Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0]);
					continue;
				}
			}
			Static96.aClass4_Sub9_Sub1_2.method828();
			return;
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public static void method1803() {
		aClass4_Sub3_Sub6_Sub2_5 = null;
		aClass4_Sub1_Sub3_1 = null;
		aClass60_1008 = null;
		aClass4_Sub11_1 = null;
		aShortArrayArray34 = null;
		aClass12_25 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	public static void method1804(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub17 local8 = (Class4_Sub17) Static75.aClass75_8.method1896((long) arg0);
		if (local8 != null) {
			for (@Pc(17) int local17 = 0; local17 < local8.anIntArray322.length; local17++) {
				local8.anIntArray322[local17] = -1;
				local8.anIntArray321[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sa;BI)Lclient!od;")
	public static Class60 method1805(@OriginalArg(0) Class4_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (!Static124.method1929(Static38.method575(arg0), arg1) && arg0.anObjectArray4 == null) {
			return null;
		} else if (arg0.aClass60Array18 == null || arg0.aClass60Array18.length <= arg1 || arg0.aClass60Array18[arg1] == null || arg0.aClass60Array18[arg1].method1334().method1345() == 0) {
			return Static62.aBoolean54 ? Static12.method1761(new Class60[] { Static26.aClass60_283, Static65.method1051(arg1) }) : null;
		} else {
			return arg0.aClass60Array18[arg1];
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
	public static int method1806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
