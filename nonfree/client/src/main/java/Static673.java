import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "Lclient!qia;")
	public static Class26 aClass26_2;

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_116 = new Class240(26, 4);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public static void method8966() {
		Static447.anInt7216 = Static459.aClass3_Sub4_Sub1_1.method7914();
		@Pc(20) boolean local20 = Static459.aClass3_Sub4_Sub1_1.method7899() == 1;
		@Pc(24) int local24 = Static459.aClass3_Sub4_Sub1_1.method7954();
		@Pc(28) int local28 = Static459.aClass3_Sub4_Sub1_1.method7926();
		@Pc(32) int local32 = Static459.aClass3_Sub4_Sub1_1.method7926();
		Static105.method1690();
		Static385.method5400(local24);
		Static459.aClass3_Sub4_Sub1_1.method334();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static98.anInt361 >> 3; local46++) {
				for (local50 = 0; local50 < Static438.anInt7120 >> 3; local50++) {
					local57 = Static459.aClass3_Sub4_Sub1_1.method333(1);
					if (local57 == 1) {
						Static63.anIntArrayArrayArray7[local42][local46][local50] = Static459.aClass3_Sub4_Sub1_1.method333(26);
					} else {
						Static63.anIntArrayArrayArray7[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static459.aClass3_Sub4_Sub1_1.method329();
		local46 = (Static147.anInt2709 - Static459.aClass3_Sub4_Sub1_1.anInt9739) / 16;
		Static517.anIntArrayArray49 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static517.anIntArrayArray49[local50][local57] = Static459.aClass3_Sub4_Sub1_1.method7895();
			}
		}
		Static144.anIntArray149 = new int[local46];
		Static448.anIntArray394 = new int[local46];
		Static315.aByteArrayArray15 = new byte[local46][];
		Static312.anIntArray296 = new int[local46];
		Static455.aByteArrayArray21 = new byte[local46][];
		Static322.aByteArrayArray16 = new byte[local46][];
		Static376.aByteArrayArray18 = new byte[local46][];
		Static614.anIntArray542 = null;
		Static572.anIntArray485 = new int[local46];
		Static115.anIntArray118 = new int[local46];
		Static110.aByteArrayArray7 = null;
		local46 = 0;
		for (@Pc(193) int local193 = 0; local193 < 4; local193++) {
			for (@Pc(197) int local197 = 0; local197 < Static98.anInt361 >> 3; local197++) {
				for (@Pc(201) int local201 = 0; local201 < Static438.anInt7120 >> 3; local201++) {
					@Pc(211) int local211 = Static63.anIntArrayArrayArray7[local193][local197][local201];
					if (local211 != -1) {
						@Pc(221) int local221 = local211 >> 14 & 0x3FF;
						@Pc(227) int local227 = local211 >> 3 & 0x7FF;
						@Pc(237) int local237 = local227 / 8 + (local221 / 8 << 8);
						for (@Pc(239) int local239 = 0; local239 < local46; local239++) {
							if (Static448.anIntArray394[local239] == local237) {
								local237 = -1;
								break;
							}
						}
						if (local237 != -1) {
							Static448.anIntArray394[local46] = local237;
							@Pc(271) int local271 = local237 >> 8 & 0xFF;
							@Pc(275) int local275 = local237 & 0xFF;
							Static312.anIntArray296[local46] = Static405.aClass362_87.method8353("m" + local271 + "_" + local275);
							Static144.anIntArray149[local46] = Static405.aClass362_87.method8353("l" + local271 + "_" + local275);
							Static115.anIntArray118[local46] = Static405.aClass362_87.method8353("um" + local271 + "_" + local275);
							Static572.anIntArray485[local46] = Static405.aClass362_87.method8353("ul" + local271 + "_" + local275);
							local46++;
						}
					}
				}
			}
		}
		Static469.method6284(local28, local20, local32, 11);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method8968(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public static void method8970(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub5_Sub20 local16 = Static447.method6065((long) arg0, 17);
		local16.method8834();
	}
}
