import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Lclient!di;")
	public static final Class54 aClass54_37 = new Class54(67, 3);

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "[I")
	public static final int[] anIntArray196 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Lclient!di;")
	public static final Class54 aClass54_38 = new Class54(6, 18);

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Z")
	public static boolean method1962() {
		try {
			return Static131.method2243();
		} catch (@Pc(14) IOException local14) {
			Static76.method1391();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static138.aClass265_54 == null ? -1 : Static138.aClass265_54.method5715()) + "," + (Static171.aClass265_69 == null ? -1 : Static171.aClass265_69.method5715()) + "," + (Static317.aClass265_122 == null ? -1 : Static317.aClass265_122.method5715()) + " - " + Static379.anInt6425 + "," + (Static48.anInt962 + Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0]) + "," + (Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0] + Static324.anInt5624) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static379.anInt6425 && local79 < 50; local79++) {
				local77 = local77 + Static438.aClass2_Sub23_Sub2_2.aByteArray130[local79] + ",";
			}
			Static361.method4904(local19, local77);
			Static220.method3461();
			return true;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public static void method1966() {
		@Pc(9) int local9 = Static438.aClass2_Sub23_Sub2_2.method5452();
		Static402.anInt6692 = Static438.aClass2_Sub23_Sub2_2.method5499();
		@Pc(17) int local17 = Static438.aClass2_Sub23_Sub2_2.method5460();
		@Pc(21) int local21 = Static438.aClass2_Sub23_Sub2_2.method5493();
		@Pc(30) boolean local30 = Static438.aClass2_Sub23_Sub2_2.method5499() == 1;
		Static261.method3930(local9);
		Static438.aClass2_Sub23_Sub2_2.method5515();
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(53) int local53;
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < Static229.anInt4427 >> 3; local42++) {
				for (local46 = 0; local46 < Static379.anInt6422 >> 3; local46++) {
					local53 = Static438.aClass2_Sub23_Sub2_2.method5519(1);
					if (local53 == 1) {
						Static393.anIntArrayArrayArray13[local38][local42][local46] = Static438.aClass2_Sub23_Sub2_2.method5519(26);
					} else {
						Static393.anIntArrayArrayArray13[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static438.aClass2_Sub23_Sub2_2.method5513();
		local42 = (Static379.anInt6425 - Static438.aClass2_Sub23_Sub2_2.anInt6952) / 16;
		Static182.anIntArrayArray34 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static182.anIntArrayArray34[local46][local53] = Static438.aClass2_Sub23_Sub2_2.method5508();
			}
		}
		Static98.anIntArray183 = new int[local42];
		Static300.anIntArray434 = null;
		Static142.anIntArray270 = new int[local42];
		Static334.anIntArray494 = new int[local42];
		Static86.anIntArray372 = new int[local42];
		Static428.aByteArrayArray59 = new byte[local42][];
		Static129.aByteArrayArray22 = new byte[local42][];
		Static423.aByteArrayArray64 = new byte[local42][];
		Static248.aByteArrayArray36 = new byte[local42][];
		Static182.anIntArray313 = new int[local42];
		Static450.aByteArrayArray63 = null;
		local42 = 0;
		for (local53 = 0; local53 < 4; local53++) {
			for (@Pc(185) int local185 = 0; local185 < Static229.anInt4427 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static379.anInt6422 >> 3; local189++) {
					@Pc(199) int local199 = Static393.anIntArrayArrayArray13[local53][local185][local189];
					if (local199 != -1) {
						@Pc(208) int local208 = local199 >> 14 & 0x3FF;
						@Pc(214) int local214 = local199 >> 3 & 0x7FF;
						@Pc(224) int local224 = local214 / 8 + (local208 / 8 << 8);
						for (@Pc(226) int local226 = 0; local226 < local42; local226++) {
							if (Static334.anIntArray494[local226] == local224) {
								local224 = -1;
								break;
							}
						}
						if (local224 != -1) {
							Static334.anIntArray494[local42] = local224;
							@Pc(259) int local259 = local224 >> 8 & 0xFF;
							@Pc(263) int local263 = local224 & 0xFF;
							Static86.anIntArray372[local42] = Static368.aClass160_73.method3704("m" + local259 + "_" + local263);
							Static98.anIntArray183[local42] = Static368.aClass160_73.method3704("l" + local259 + "_" + local263);
							Static142.anIntArray270[local42] = Static368.aClass160_73.method3704("um" + local259 + "_" + local263);
							Static182.anIntArray313[local42] = Static368.aClass160_73.method3704("ul" + local259 + "_" + local263);
							local42++;
						}
					}
				}
			}
		}
		Static187.method2965(false, local21, local17, local30);
	}
}
