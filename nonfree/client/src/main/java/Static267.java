import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
	public static int anInt4392;

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public static int anInt4386 = -1;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
	public static int anInt4400 = 0;

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "[Lclient!rd;")
	public static final Class8_Sub3_Sub1_Sub1[] aClass8_Sub3_Sub1_Sub1Array1 = new Class8_Sub3_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
	public static int anInt4402 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method3511() {
		for (@Pc(7) int local7 = 0; local7 < Static418.anInt7061; local7++) {
			@Pc(18) Class46 local18 = Static246.aClass46Array1[local7];
			@Pc(20) boolean local20 = false;
			@Pc(137) int local137;
			if (local18.aClass4_Sub14_Sub4_1 == null) {
				local18.anInt1156--;
				if ((local18.aByte19 == 2 ? -1500 : -10) > local18.anInt1156) {
					local20 = true;
				} else {
					if (local18.aByte19 == 1 && local18.aClass38_1 == null) {
						local18.aClass38_1 = Static459.method614(Static277.aClass211_67, local18.anInt1153, 0);
						if (local18.aClass38_1 == null) {
							continue;
						}
						local18.anInt1156 += local18.aClass38_1.method613();
					} else if (local18.aByte19 == 2 && (local18.aClass4_Sub35_1 == null || local18.aClass4_Sub15_Sub1_1 == null)) {
						if (local18.aClass4_Sub35_1 == null) {
							local18.aClass4_Sub35_1 = Static316.method4092(Static399.aClass211_87, local18.anInt1153);
						}
						if (local18.aClass4_Sub35_1 == null) {
							continue;
						}
						if (local18.aClass4_Sub15_Sub1_1 == null) {
							local18.aClass4_Sub15_Sub1_1 = local18.aClass4_Sub35_1.method4095(new int[] { 22050 });
							if (local18.aClass4_Sub15_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local18.anInt1156 < 0) {
						if (local18.anInt1158 == 0) {
							local137 = local18.anInt1154 * Static413.aClass49_Sub1_1.anInt3199 >> 8;
						} else {
							@Pc(146) int local146 = local18.anInt1158 >> 24 & 0x3;
							if (local146 == Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99) {
								@Pc(161) int local161 = (local18.anInt1158 & 0xFF) << 7;
								@Pc(168) int local168 = local18.anInt1158 >> 16 & 0xFF;
								@Pc(178) int local178 = (local168 << 7) + 64 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339;
								if (local178 < 0) {
									local178 = -local178;
								}
								@Pc(190) int local190 = local18.anInt1158 >> 8 & 0xFF;
								@Pc(200) int local200 = (local190 << 7) + 64 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343;
								if (local200 < 0) {
									local200 = -local200;
								}
								@Pc(214) int local214 = local178 + local200 - 128;
								if (local214 > local161) {
									local18.anInt1156 = -99999;
									continue;
								}
								if (local214 < 0) {
									local214 = 0;
								}
								local137 = local18.anInt1154 * Static413.aClass49_Sub1_1.anInt3204 * (local161 - local214) / local161 >> 8;
							} else {
								local137 = 0;
							}
						}
						if (local137 > 0) {
							@Pc(251) Class4_Sub15_Sub1 local251 = null;
							if (local18.aByte19 == 1) {
								local251 = local18.aClass38_1.method615().method2508(Static5.aClass17_1);
							} else if (local18.aByte19 == 2) {
								local251 = local18.aClass4_Sub15_Sub1_1;
							}
							@Pc(279) Class4_Sub14_Sub4 local279 = local18.aClass4_Sub14_Sub4_1 = Static466.method4814(local251, local137);
							local279.method4812(local18.anInt1157 - 1);
							Static406.aClass4_Sub14_Sub2_2.method2418(local279);
						}
					}
				}
			} else if (!local18.aClass4_Sub14_Sub4_1.method6060()) {
				local20 = true;
			}
			if (local20) {
				Static418.anInt7061--;
				for (local137 = local7; local137 < Static418.anInt7061; local137++) {
					Static246.aClass46Array1[local137] = Static246.aClass46Array1[local137 + 1];
				}
				local7--;
			}
		}
		if (Static26.aBoolean37 && !Static221.method3007()) {
			if (Static413.aClass49_Sub1_1.anInt3203 != 0 && anInt4386 != -1) {
				Static417.method5641(Static231.aClass211_62, Static413.aClass49_Sub1_1.anInt3203, anInt4386);
			}
			Static26.aBoolean37 = false;
		} else if (Static413.aClass49_Sub1_1.anInt3203 != 0 && anInt4386 != -1 && !Static221.method3007()) {
			Static448.method5935(Static409.aClass146_97);
			Static247.aClass4_Sub9_Sub2_2.method5047(anInt4386);
			anInt4386 = -1;
		}
	}
}
