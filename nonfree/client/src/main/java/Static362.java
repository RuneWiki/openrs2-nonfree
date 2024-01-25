import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static final int anInt6061 = 4;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt6062 = 0;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[200];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public static void method5385(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(11, arg0);
		local8.method8961();
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Z")
	public static boolean method5386(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!wk;B)V")
	public static void method5387(@OriginalArg(0) Class376 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (arg0 == Static277.aClass376_11) {
			local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local20 = (local12 >> 4 & 0x7) + Static385.anInt6359;
			local26 = (local12 & 0x7) + Static587.anInt9873;
			local30 = Static257.aClass5_Sub22_Sub1_1.method5903();
			local34 = local30 >> 2;
			local38 = local30 & 0x3;
			local42 = Static114.anIntArray130[local34];
			if (Static437.method6652(Static412.anInt7175) || local20 >= 0 && local26 >= 0 && local20 < Static326.anInt5541 && local26 < Static448.anInt7637) {
				Static572.method8312(-1, local38, local20, local34, Static520.anInt8959, local42, local26);
			}
			return;
		}
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(154) int local154;
		@Pc(133) int local133;
		if (arg0 == Static446.aClass376_13) {
			local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local20 = (local12 >> 4 & 0x7) + Static385.anInt6359;
			local26 = Static587.anInt9873 + (local12 & 0x7);
			local30 = Static257.aClass5_Sub22_Sub1_1.method5968();
			if (local30 == 65535) {
				local30 = -1;
			}
			local34 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local38 = local34 >> 4 & 0xF;
			local42 = local34 & 0x7;
			local129 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local133 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local137 = Static257.aClass5_Sub22_Sub1_1.method5968();
			if (local20 >= 0 && local26 >= 0 && local20 < Static326.anInt5541 && local26 < Static448.anInt7637) {
				local154 = local38 + 1;
				if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] >= local20 - local154 && local154 + local20 >= Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0] >= local26 - local154 && local26 + local154 >= Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0]) {
					Static236.method3918((Static520.anInt8959 << 24) + (local20 << 16) + (local26 << 8) + local38, local42, local129, local30, local133, local137);
				}
			}
		} else if (Static329.aClass376_8 == arg0) {
			local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local20 = (local12 & 0x7) + Static587.anInt9873;
			local26 = Static567.anInt9589 + local20;
			local30 = Static385.anInt6359 + (local12 >> 4 & 0x7);
			local34 = local30 + Static565.anInt9560;
			local38 = Static257.aClass5_Sub22_Sub1_1.method5968();
			local42 = Static257.aClass5_Sub22_Sub1_1.method5968();
			local129 = Static257.aClass5_Sub22_Sub1_1.method5968();
			if (Static440.aClass273_28 != null) {
				@Pc(282) Class5_Sub18 local282 = (Class5_Sub18) Static440.aClass273_28.method6581((long) (local34 | local26 << 14 | Static520.anInt8959 << 28));
				if (local282 != null) {
					for (@Pc(290) Class5_Sub32 local290 = (Class5_Sub32) local282.aClass330_8.method7908(); local290 != null; local290 = (Class5_Sub32) local282.aClass330_8.method7914()) {
						if (local290.anInt5333 == (local38 & 0x7FFF) && local290.anInt5329 == local42) {
							local290.method9047();
							local290.anInt5329 = local129;
							Static389.method5804(Static520.anInt8959, local26, local34, local290);
							break;
						}
					}
					if (local30 >= 0 && local20 >= 0 && local30 < Static326.anInt5541 && local20 < Static448.anInt7637) {
						Static85.method1401(local30, local20, Static520.anInt8959);
					}
				}
			}
		} else {
			@Pc(415) int local415;
			@Pc(419) int local419;
			@Pc(428) int local428;
			if (arg0 == Static447.aClass376_14) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
				@Pc(361) boolean local361 = (local12 & 0x80) != 0;
				local26 = (local12 >> 3 & 0x7) + Static385.anInt6359;
				local30 = (local12 & 0x7) + Static587.anInt9873;
				local34 = Static257.aClass5_Sub22_Sub1_1.method5963() + local26;
				local38 = Static257.aClass5_Sub22_Sub1_1.method5963() + local30;
				local42 = Static257.aClass5_Sub22_Sub1_1.method5956();
				local129 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local133 = Static257.aClass5_Sub22_Sub1_1.method5966() * 4;
				local137 = Static257.aClass5_Sub22_Sub1_1.method5966() * 4;
				local154 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local415 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local419 = Static257.aClass5_Sub22_Sub1_1.method5966();
				if (local419 == 255) {
					local419 = -1;
				}
				local428 = Static257.aClass5_Sub22_Sub1_1.method5968();
				if (local26 >= 0 && local30 >= 0 && Static326.anInt5541 > local26 && local30 < Static448.anInt7637 && local34 >= 0 && local38 >= 0 && Static326.anInt5541 > local34 && Static448.anInt7637 > local38 && local129 != 65535) {
					local133 <<= 0x2;
					local38 = local38 * 512 + 256;
					local137 <<= 0x2;
					local30 = local30 * 512 + 256;
					local34 = local34 * 512 + 256;
					local26 = local26 * 512 + 256;
					local428 <<= 0x2;
					@Pc(536) Class4_Sub2_Sub1_Sub5 local536 = new Class4_Sub2_Sub1_Sub5(local129, Static520.anInt8959, Static520.anInt8959, local26, local30, local133, Static631.anInt10493 + local154, local415 - -Static631.anInt10493, local419, local428, 0, local42, local137, local361, -1);
					local536.method8174(Static631.anInt10493 + local154, local38, local34, Static644.method9021(local38, local34, Static520.anInt8959) - local137);
					Static202.aClass330_21.method7917(new Class5_Sub5_Sub5(local536));
				}
			} else if (Static160.aClass376_17 == arg0) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local20 = Static385.anInt6359 * 2 + (local12 >> 4 & 0xF);
				local26 = (local12 & 0xF) + Static587.anInt9873 * 2;
				local30 = Static257.aClass5_Sub22_Sub1_1.method5966();
				@Pc(596) boolean local596 = (local30 & 0x1) != 0;
				@Pc(604) boolean local604 = (local30 & 0x2) != 0;
				local42 = local604 ? local30 >> 2 : -1;
				local129 = Static257.aClass5_Sub22_Sub1_1.method5963() + local20;
				local133 = Static257.aClass5_Sub22_Sub1_1.method5963() + local26;
				local137 = Static257.aClass5_Sub22_Sub1_1.method5956();
				local154 = Static257.aClass5_Sub22_Sub1_1.method5956();
				local415 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local419 = Static257.aClass5_Sub22_Sub1_1.method5966();
				if (local604) {
					local419 = (byte) local419;
				} else {
					local419 *= 4;
				}
				local428 = Static257.aClass5_Sub22_Sub1_1.method5966() * 4;
				@Pc(661) int local661 = Static257.aClass5_Sub22_Sub1_1.method5968();
				@Pc(665) int local665 = Static257.aClass5_Sub22_Sub1_1.method5968();
				@Pc(669) int local669 = Static257.aClass5_Sub22_Sub1_1.method5966();
				if (local669 == 255) {
					local669 = -1;
				}
				@Pc(680) int local680 = Static257.aClass5_Sub22_Sub1_1.method5968();
				if (local20 >= 0 && local26 >= 0 && local20 < Static326.anInt5541 * 2 && Static326.anInt5541 * 2 > local26 && local129 >= 0 && local133 >= 0 && Static448.anInt7637 * 2 > local129 && Static448.anInt7637 * 2 > local133 && local415 != 65535) {
					local133 = local133 * 256;
					local419 <<= 0x2;
					local680 <<= 0x2;
					local20 *= 256;
					local428 <<= 0x2;
					local129 = local129 * 256;
					local26 = local26 * 256;
					if (local137 != 0 && local42 != -1) {
						@Pc(764) Class4_Sub2_Sub1_Sub1 local764 = null;
						@Pc(770) int local770;
						if (local137 >= 0) {
							local770 = local137 - 1;
							@Pc(777) Class5_Sub3 local777 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local770);
							if (local777 != null) {
								local764 = local777.aClass4_Sub2_Sub1_Sub1_Sub2_1;
							}
						} else {
							local770 = -local137 - 1;
							if (local770 == Static337.anInt5722) {
								local764 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2;
							} else {
								local764 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local770];
							}
						}
						if (local764 != null) {
							@Pc(808) Class269 local808 = local764.method1025();
							if (local808.anIntArrayArray50 != null && local808.anIntArrayArray50[local42] != null) {
								local419 -= local808.anIntArrayArray50[local42][1];
							}
							if (local808.anIntArrayArray51 != null && local808.anIntArrayArray51[local42] != null) {
								local419 -= local808.anIntArrayArray51[local42][1];
							}
						}
					}
					@Pc(865) Class4_Sub2_Sub1_Sub5 local865 = new Class4_Sub2_Sub1_Sub5(local415, Static520.anInt8959, Static520.anInt8959, local20, local26, local419, Static631.anInt10493 + local661, Static631.anInt10493 + local665, local669, local680, local137, local154, local428, local596, local42);
					local865.method8174(Static631.anInt10493 + local661, local133, local129, Static644.method9021(local133, local129, Static520.anInt8959) - local428);
					Static202.aClass330_21.method7917(new Class5_Sub5_Sub5(local865));
				}
			} else if (Static80.aClass376_3 == arg0) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local20 = Static385.anInt6359 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static587.anInt9873;
				local30 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local34 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local38 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local42 = Static257.aClass5_Sub22_Sub1_1.method5966();
				if (local20 >= 0 && local26 >= 0 && Static326.anInt5541 > local20 && Static448.anInt7637 > local26) {
					local129 = local20 * 512 + 256;
					local133 = local26 * 512 + 256;
					local137 = Static520.anInt8959;
					if (local137 < 3 && Static23.method285(local20, local26)) {
						local137++;
					}
					@Pc(991) Class4_Sub2_Sub1_Sub4 local991 = new Class4_Sub2_Sub1_Sub4(local30, local38, Static631.anInt10493, Static520.anInt8959, local137, local129, Static644.method9021(local133, local129, Static520.anInt8959) - local34, local133, local20, local20, local26, local26, local42);
					Static14.aClass330_4.method7917(new Class5_Sub5_Sub18(local991));
				}
			} else if (arg0 == Static490.aClass376_15) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local20 = (local12 >> 4 & 0x7) + Static385.anInt6359;
				local26 = Static587.anInt9873 + (local12 & 0x7);
				local30 = Static257.aClass5_Sub22_Sub1_1.method5917();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local38 = local34 >> 2;
				local42 = local34 & 0x3;
				local129 = Static114.anIntArray130[local38];
				Static568.method8243(local20, Static520.anInt8959, local26, local38, local129, local30, local42);
			} else if (Static21.aClass376_1 == arg0) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local20 = Static385.anInt6359 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static587.anInt9873;
				local30 = Static257.aClass5_Sub22_Sub1_1.method5968();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local129 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local133 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local137 = Static257.aClass5_Sub22_Sub1_1.method5968();
				if (local20 >= 0 && local26 >= 0 && Static326.anInt5541 > local20 && Static448.anInt7637 > local26) {
					local154 = local38 + 1;
					if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] >= local20 - local154 && local20 + local154 >= Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] && local26 - local154 <= Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0] && local26 + local154 >= Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0]) {
						Static541.method7932(local129, local38 + (local20 << 16) + (Static520.anInt8959 << 24) + (local26 << 8), local137, local133, local30, local42);
					}
				}
			} else if (arg0 == Static177.aClass376_9) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5940();
				local20 = Static257.aClass5_Sub22_Sub1_1.method5967();
				local26 = (local20 & 0x7) + Static587.anInt9873;
				local30 = Static567.anInt9589 + local26;
				local34 = Static385.anInt6359 + (local20 >> 4 & 0x7);
				local38 = Static565.anInt9560 + local34;
				@Pc(1260) Class5_Sub18 local1260 = (Class5_Sub18) Static440.aClass273_28.method6581((long) (local38 | local30 << 14 | Static520.anInt8959 << 28));
				if (local1260 != null) {
					for (@Pc(1268) Class5_Sub32 local1268 = (Class5_Sub32) local1260.aClass330_8.method7908(); local1268 != null; local1268 = (Class5_Sub32) local1260.aClass330_8.method7914()) {
						if ((local12 & 0x7FFF) == local1268.anInt5333) {
							local1268.method9047();
							break;
						}
					}
					if (local1260.aClass330_8.method7918()) {
						local1260.method9047();
					}
					if (local34 >= 0 && local26 >= 0 && Static326.anInt5541 > local34 && local26 < Static448.anInt7637) {
						Static85.method1401(local34, local26, Static520.anInt8959);
					}
				}
			} else if (Static142.aClass376_5 == arg0) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5917();
				local20 = Static257.aClass5_Sub22_Sub1_1.method5917();
				local26 = Static257.aClass5_Sub22_Sub1_1.method5903();
				local30 = (local26 & 0x7) + Static587.anInt9873;
				local34 = Static567.anInt9589 + local30;
				local38 = Static385.anInt6359 + (local26 >> 4 & 0x7);
				local42 = Static565.anInt9560 + local38;
				@Pc(1385) boolean local1385 = local38 >= 0 && local30 >= 0 && Static326.anInt5541 > local38 && Static448.anInt7637 > local30;
				if (local1385 || Static437.method6652(Static412.anInt7175)) {
					Static389.method5804(Static520.anInt8959, local34, local42, new Class5_Sub32(local12, local20));
					if (local1385) {
						Static85.method1401(local38, local30, Static520.anInt8959);
					}
				}
			} else if (Static39.aClass376_2 == arg0) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5903();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static114.anIntArray130[local20];
				local34 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local38 = Static385.anInt6359 + (local34 >> 4 & 0x7);
				local42 = Static587.anInt9873 + (local34 & 0x7);
				local129 = Static257.aClass5_Sub22_Sub1_1.method5940();
				if (Static437.method6652(Static412.anInt7175) || local38 >= 0 && local42 >= 0 && local38 < Static326.anInt5541 && local42 < Static448.anInt7637) {
					Static572.method8312(local129, local26, local38, local20, Static520.anInt8959, local30, local42);
				}
			} else if (arg0 == Static96.aClass376_4) {
				Static257.aClass5_Sub22_Sub1_1.method5966();
				local12 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local20 = Static385.anInt6359 + (local12 >> 4 & 0x7);
				local26 = Static587.anInt9873 + (local12 & 0x7);
				local30 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local34 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local38 = Static257.aClass5_Sub22_Sub1_1.method5931();
				@Pc(1528) String local1528 = Static257.aClass5_Sub22_Sub1_1.method5937();
				Static238.method3974(local26, Static520.anInt8959, local20, local1528, local34, local38, local30);
			} else if (arg0 == Static270.aClass376_10) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5940();
				local20 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local26 = Static257.aClass5_Sub22_Sub1_1.method5967();
				local30 = Static587.anInt9873 + (local26 & 0x7);
				local34 = local30 + Static567.anInt9589;
				local38 = Static385.anInt6359 + (local26 >> 4 & 0x7);
				local42 = local38 + Static565.anInt9560;
				local129 = Static257.aClass5_Sub22_Sub1_1.method5951();
				if (local129 != Static337.anInt5722) {
					@Pc(1606) boolean local1606 = local38 >= 0 && local30 >= 0 && Static326.anInt5541 > local38 && Static448.anInt7637 > local30;
					if (local1606 || Static437.method6652(Static412.anInt7175)) {
						Static389.method5804(Static520.anInt8959, local34, local42, new Class5_Sub32(local20, local12));
						if (local1606) {
							Static85.method1401(local38, local30, Static520.anInt8959);
						}
					}
				}
			} else if (Static532.aClass376_16 == arg0) {
				local12 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local20 = Static257.aClass5_Sub22_Sub1_1.method5966();
				Static61.aClass246_7.method5497(local12).method4276(local20);
			} else {
				Static524.method7740(null, "T3 - " + arg0);
				Static583.method8429(false);
			}
		}
	}
}
