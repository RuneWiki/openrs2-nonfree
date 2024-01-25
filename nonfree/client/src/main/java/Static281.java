import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	public static int anInt7445;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_112 = new Class217(29, 6);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
	public static final int[] anIntArray520 = new int[25];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method5778() {
		@Pc(7) int local7 = Static237.aClass3_Sub7_Sub1_1.method2598();
		@Pc(11) int local11 = Static237.aClass3_Sub7_Sub1_1.method2582();
		@Pc(20) boolean local20 = Static237.aClass3_Sub7_Sub1_1.method2639() == 1;
		Static166.anInt3385 = Static237.aClass3_Sub7_Sub1_1.method2639();
		@Pc(28) int local28 = Static237.aClass3_Sub7_Sub1_1.method2635();
		Static152.method2474(local11);
		Static237.aClass3_Sub7_Sub1_1.method1064();
		@Pc(39) int local39;
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			for (local39 = 0; local39 < Static40.anInt1089 >> 3; local39++) {
				for (local42 = 0; local42 < Static44.anInt7276 >> 3; local42++) {
					local48 = Static237.aClass3_Sub7_Sub1_1.method1063(1);
					if (local48 == 1) {
						Static201.anIntArrayArrayArray6[local36][local39][local42] = Static237.aClass3_Sub7_Sub1_1.method1063(26);
					} else {
						Static201.anIntArrayArrayArray6[local36][local39][local42] = -1;
					}
				}
			}
		}
		Static237.aClass3_Sub7_Sub1_1.method1065();
		local39 = (Static139.anInt7585 - Static237.aClass3_Sub7_Sub1_1.anInt3235) / 16;
		Static295.anIntArrayArray34 = new int[local39][4];
		for (local42 = 0; local42 < local39; local42++) {
			for (local48 = 0; local48 < 4; local48++) {
				Static295.anIntArrayArray34[local42][local48] = Static237.aClass3_Sub7_Sub1_1.method2589();
			}
		}
		Static29.aByteArrayArray18 = new byte[local39][];
		Static242.aByteArrayArray9 = new byte[local39][];
		Static378.aByteArrayArray21 = new byte[local39][];
		Static231.aByteArrayArray8 = new byte[local39][];
		Static322.anIntArray372 = null;
		Static299.aByteArrayArray15 = null;
		Static184.anIntArray230 = new int[local39];
		Static371.anIntArray402 = new int[local39];
		Static319.anIntArray115 = new int[local39];
		Static81.anIntArray204 = new int[local39];
		Static414.anIntArray465 = new int[local39];
		local39 = 0;
		for (local48 = 0; local48 < 4; local48++) {
			for (@Pc(175) int local175 = 0; local175 < Static40.anInt1089 >> 3; local175++) {
				for (@Pc(178) int local178 = 0; local178 < Static44.anInt7276 >> 3; local178++) {
					@Pc(187) int local187 = Static201.anIntArrayArrayArray6[local48][local175][local178];
					if (local187 != -1) {
						@Pc(197) int local197 = local187 >> 14 & 0x3FF;
						@Pc(203) int local203 = local187 >> 3 & 0x7FF;
						@Pc(213) int local213 = local203 / 8 + (local197 / 8 << 8);
						for (@Pc(215) int local215 = 0; local215 < local39; local215++) {
							if (Static81.anIntArray204[local215] == local213) {
								local213 = -1;
								break;
							}
						}
						if (local213 != -1) {
							Static81.anIntArray204[local39] = local213;
							@Pc(241) int local241 = local213 >> 8 & 0xFF;
							@Pc(245) int local245 = local213 & 0xFF;
							Static319.anIntArray115[local39] = Static64.aClass32_28.method807("m" + local241 + "_" + local245);
							Static371.anIntArray402[local39] = Static64.aClass32_28.method807("l" + local241 + "_" + local245);
							Static414.anIntArray465[local39] = Static64.aClass32_28.method807("um" + local241 + "_" + local245);
							Static184.anIntArray230[local39] = Static64.aClass32_28.method807("ul" + local241 + "_" + local245);
							local39++;
						}
					}
				}
			}
		}
		Static226.method3380(false, local7, local20, local28);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method5785() {
		@Pc(1) Class138[] local1 = Class7_Sub4.aClass138Array4;
		synchronized (Class7_Sub4.aClass138Array4) {
			for (@Pc(11) int local11 = 0; local11 < Class7_Sub4.aClass138Array4.length; local11++) {
				Class7_Sub4.aClass138Array4[local11] = new Class138();
				Static47.anIntArray87[local11] = 0;
			}
		}
	}
}
