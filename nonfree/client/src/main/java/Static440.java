import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_10 = new Class352(7, 0, 1, 1);

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "J")
	public static long aLong214 = -1L;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
	public static int anInt7977 = 0;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method6727() {
		if (Static467.aClass5_13 == null) {
			return;
		}
		if (Static238.aBoolean425) {
			Static119.method2560();
		}
		Static418.aClass100_1.method3066();
		Static248.method4432();
		Static485.method7134();
		Static84.method2218();
		Static300.method5130();
		Static294.method5033();
		if (Static406.aClass350_1 != null) {
			Static406.aClass350_1.method8116();
		}
		Static528.method7503();
		Static234.method4283();
		Static332.method5539();
		Static469.method6992();
		Static218.method3848(false);
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(49) Class9_Sub4_Sub2_Sub1_Sub2 local49 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local43];
			if (local49 != null) {
				for (@Pc(53) int local53 = 0; local53 < local49.aClass92Array3.length; local53++) {
					local49.aClass92Array3[local53] = null;
				}
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static337.anInt6701; local72++) {
			@Pc(79) Class9_Sub4_Sub2_Sub1_Sub1 local79 = Static303.aClass6_Sub42Array1[local72].aClass9_Sub4_Sub2_Sub1_Sub1_1;
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aClass92Array3.length; local83++) {
					local79.aClass92Array3[local83] = null;
				}
			}
		}
		Static267.aClass115_2 = null;
		Static469.aClass115_8 = null;
		Static467.aClass5_13.method6106();
		Static467.aClass5_13 = null;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public static void method6728() {
		Static643.anInt10750 = Static84.aClass6_Sub8_Sub1_1.method8253();
		@Pc(13) int local13 = Static84.aClass6_Sub8_Sub1_1.method8253();
		@Pc(19) int local19 = Static84.aClass6_Sub8_Sub1_1.method8229();
		@Pc(23) int local23 = Static84.aClass6_Sub8_Sub1_1.method8245();
		@Pc(32) boolean local32 = Static84.aClass6_Sub8_Sub1_1.method8253() == 1;
		Static203.method3702();
		Static290.method4993(local13);
		Static84.aClass6_Sub8_Sub1_1.method1511();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static306.anInt6176 >> 3; local46++) {
				for (local50 = 0; local50 < Static108.anInt2930 >> 3; local50++) {
					local57 = Static84.aClass6_Sub8_Sub1_1.method1512(1);
					if (local57 == 1) {
						Static316.anIntArrayArrayArray2[local42][local46][local50] = Static84.aClass6_Sub8_Sub1_1.method1512(26);
					} else {
						Static316.anIntArrayArrayArray2[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static84.aClass6_Sub8_Sub1_1.method1509();
		local46 = (Static125.anInt3103 - Static84.aClass6_Sub8_Sub1_1.anInt10061) / 16;
		Static307.anIntArrayArray24 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static307.anIntArrayArray24[local50][local57] = Static84.aClass6_Sub8_Sub1_1.method8236();
			}
		}
		Static296.anIntArray272 = null;
		Static642.aByteArrayArray37 = new byte[local46][];
		Static191.aByteArrayArray7 = null;
		Static75.aByteArrayArray1 = new byte[local46][];
		Static525.anIntArray474 = new int[local46];
		Static228.anIntArray215 = new int[local46];
		anIntArray418 = new int[local46];
		Static502.anIntArray342 = new int[local46];
		Static642.anIntArray572 = new int[local46];
		Static199.aByteArrayArray8 = new byte[local46][];
		Static448.aByteArrayArray24 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(182) int local182 = 0; local182 < Static306.anInt6176 >> 3; local182++) {
				for (@Pc(186) int local186 = 0; local186 < Static108.anInt2930 >> 3; local186++) {
					@Pc(196) int local196 = Static316.anIntArrayArrayArray2[local57][local182][local186];
					if (local196 != -1) {
						@Pc(206) int local206 = local196 >> 14 & 0x3FF;
						@Pc(212) int local212 = local196 >> 3 & 0x7FF;
						@Pc(222) int local222 = local212 / 8 + (local206 / 8 << 8);
						for (@Pc(224) int local224 = 0; local224 < local46; local224++) {
							if (local222 == Static228.anIntArray215[local224]) {
								local222 = -1;
								break;
							}
						}
						if (local222 != -1) {
							Static228.anIntArray215[local46] = local222;
							@Pc(257) int local257 = local222 >> 8 & 0xFF;
							@Pc(261) int local261 = local222 & 0xFF;
							Static502.anIntArray342[local46] = Static415.aClass223_90.method5959("m" + local257 + "_" + local261);
							anIntArray418[local46] = Static415.aClass223_90.method5959("l" + local257 + "_" + local261);
							Static525.anIntArray474[local46] = Static415.aClass223_90.method5959("um" + local257 + "_" + local261);
							Static642.anIntArray572[local46] = Static415.aClass223_90.method5959("ul" + local257 + "_" + local261);
							local46++;
						}
					}
				}
			}
		}
		Static441.method6730(local19, local32, local23, 11);
	}
}
