import java.math.BigInteger;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
	public static int anInt1053;

	@OriginalMember(owner = "client!hf", name = "wb", descriptor = "Lclient!pb;")
	public static Class41 aClass41_26;

	@OriginalMember(owner = "client!hf", name = "xb", descriptor = "Lclient!bb;")
	public static Class8 aClass8_4;

	@OriginalMember(owner = "client!hf", name = "yb", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_7;

	@OriginalMember(owner = "client!hf", name = "Bb", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_9;

	@OriginalMember(owner = "client!hf", name = "gb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_692 = Static69.method1153("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!hf", name = "sb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger18 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!hf", name = "zb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_693 = Static69.method1153("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!hf", name = "Ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_694 = Static69.method1153("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!hf", name = "Cb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hf", name = "Eb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_695 = Static69.method1153("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!hf", name = "Fb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_696 = Static69.method1153("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!hf", name = "Gb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_697 = aClass64_695;

	@OriginalMember(owner = "client!hf", name = "Hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_698 = Static69.method1153("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!hf", name = "Ib", descriptor = "I")
	public static int anInt1060 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	public static void method797() {
		if (Static81.anInt1387 != 0 || Static17.anInt576 != 1) {
			return;
		}
		@Pc(21) int local21 = Static118.anInt2842 - 575;
		@Pc(27) int local27 = Static96.anInt2745 - 5 - 4;
		if (local21 < 0 || local27 < 0 || local21 >= 146 || local27 >= 151) {
			return;
		}
		local27 -= 75;
		local21 -= 73;
		@Pc(53) int local53 = Static75.anInt1770 + Static57.anInt1289 & 0x7FF;
		@Pc(57) int local57 = Class1_Sub1_Sub5_Sub4.anIntArray427[local53];
		@Pc(65) int local65 = local57 * (Static39.anInt912 + 256) >> 8;
		@Pc(69) int local69 = Class1_Sub1_Sub5_Sub4.anIntArray429[local53];
		@Pc(77) int local77 = local69 * (Static39.anInt912 + 256) >> 8;
		@Pc(87) int local87 = local27 * local77 - local21 * local65 >> 11;
		@Pc(97) int local97 = local77 * local21 + local65 * local27 >> 11;
		@Pc(104) int local104 = local97 + Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7;
		@Pc(112) int local112 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 - local87 >> 7;
		@Pc(132) boolean local132 = Static8.method224(local104, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 1, true, local112, 0, 0, 0, 0, 0);
		if (!local132) {
			return;
		}
		Static49.aClass1_Sub6_Sub1_1.method1853(local21);
		Static49.aClass1_Sub6_Sub1_1.method1853(local27);
		Static49.aClass1_Sub6_Sub1_1.method1839(Static75.anInt1770);
		Static49.aClass1_Sub6_Sub1_1.method1853(57);
		Static49.aClass1_Sub6_Sub1_1.method1853(Static57.anInt1289);
		Static49.aClass1_Sub6_Sub1_1.method1853(Static39.anInt912);
		Static49.aClass1_Sub6_Sub1_1.method1853(89);
		Static49.aClass1_Sub6_Sub1_1.method1839(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375);
		Static49.aClass1_Sub6_Sub1_1.method1839(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412);
		Static49.aClass1_Sub6_Sub1_1.method1853(Static13.anInt452);
		Static49.aClass1_Sub6_Sub1_1.method1853(63);
		return;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public static void method798() {
		aClass64_697 = null;
		aClass64_694 = null;
		aClass41_Sub1_9 = null;
		aClass1_Sub1_Sub5_Sub3_7 = null;
		aBigInteger18 = null;
		aCalendar1 = null;
		aClass64_692 = null;
		aClass41_26 = null;
		aClass64_695 = null;
		aClass64_696 = null;
		aClass64_698 = null;
		aClass64_693 = null;
		aClass8_4 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!pb;Lclient!rd;Lclient!rd;B)[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] method799(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class64 arg2) {
		@Pc(8) int local8 = arg0.method1066(arg1);
		@Pc(14) int local14 = arg0.method1050(arg2, local8);
		return Static92.method1455(arg0, local14, local8);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!nd;IB)I")
	public static int method803(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray23 == null || arg0.anIntArrayArray23.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray23[arg1];
			@Pc(26) int local26 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) byte local40 = 0;
			while (true) {
				@Pc(45) int local45 = local24[local38++];
				@Pc(47) int local47 = 0;
				@Pc(49) byte local49 = 0;
				if (local45 == 0) {
					return local26;
				}
				if (local45 == 15) {
					local49 = 1;
				}
				if (local45 == 1) {
					local47 = Static61.anIntArray221[local24[local38++]];
				}
				if (local45 == 2) {
					local47 = Static25.anIntArray438[local24[local38++]];
				}
				if (local45 == 16) {
					local49 = 2;
				}
				if (local45 == 3) {
					local47 = Static79.anIntArray285[local24[local38++]];
				}
				if (local45 == 17) {
					local49 = 3;
				}
				@Pc(119) int local119;
				@Pc(130) Class1_Sub1_Sub11 local130;
				@Pc(135) int local135;
				@Pc(148) int local148;
				if (local45 == 4) {
					local119 = local24[local38++] << 16;
					@Pc(126) int local126 = local119 + local24[local38++];
					local130 = Static12.method1397(local126);
					local135 = local24[local38++];
					if (local135 != -1 && (!Static106.method1739(local135).aBoolean62 || Static113.aBoolean111)) {
						for (local148 = 0; local148 < local130.anIntArray245.length; local148++) {
							if (local130.anIntArray245[local148] == local135 + 1) {
								local47 += local130.anIntArray248[local148];
							}
						}
					}
				}
				if (local45 == 5) {
					local47 = Static101.anIntArray333[local24[local38++]];
				}
				if (local45 == 6) {
					local47 = Class1_Sub1_Sub1.anIntArray8[Static25.anIntArray438[local24[local38++]] - 1];
				}
				if (local45 == 7) {
					local47 = Static101.anIntArray333[local24[local38++]] * 100 / 46875;
				}
				if (local45 == 8) {
					local47 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2429;
				}
				if (local45 == 9) {
					for (local119 = 0; local119 < 25; local119++) {
						if (Static20.aBooleanArray3[local119]) {
							local47 += Static25.anIntArray438[local119];
						}
					}
				}
				if (local45 == 10) {
					local119 = local24[local38++] << 16;
					local119 += local24[local38++];
					local130 = Static12.method1397(local119);
					local135 = local24[local38++];
					if (local135 != -1 && (!Static106.method1739(local135).aBoolean62 || Static113.aBoolean111)) {
						for (local148 = 0; local148 < local130.anIntArray245.length; local148++) {
							if (local130.anIntArray245[local148] == local135 + 1) {
								local47 = 999999999;
								break;
							}
						}
					}
				}
				if (local45 == 11) {
					local47 = Static87.anInt1995;
				}
				if (local45 == 12) {
					local47 = Static109.anInt2637;
				}
				if (local45 == 13) {
					local119 = Static101.anIntArray333[local24[local38++]];
					@Pc(334) int local334 = local24[local38++];
					local47 = (0x1 << local334 & local119) == 0 ? 0 : 1;
				}
				if (local45 == 14) {
					local119 = local24[local38++];
					local47 = Static75.method1253(local119);
				}
				if (local45 == 18) {
					local47 = Static60.anInt1350 + (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7);
				}
				if (local45 == 19) {
					local47 = Static53.anInt1236 + (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 >> 7);
				}
				if (local45 == 20) {
					local47 = local24[local38++];
				}
				if (local49 == 0) {
					if (local40 == 0) {
						local26 += local47;
					}
					if (local40 == 1) {
						local26 -= local47;
					}
					if (local40 == 2 && local47 != 0) {
						local26 /= local47;
					}
					if (local40 == 3) {
						local26 *= local47;
					}
					local40 = 0;
				} else {
					local40 = local49;
				}
			}
		} catch (@Pc(436) Exception local436) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static82.aClass68_1.method1785(arg4, arg1, arg0);
		@Pc(20) int local20;
		@Pc(42) int local42;
		@Pc(24) int local24;
		@Pc(26) int local26;
		@Pc(57) int local57;
		@Pc(63) int local63;
		if (local11 != 0) {
			local20 = Static82.aClass68_1.method1760(arg4, arg1, arg0, local11);
			local24 = local20 & 0x1F;
			local26 = arg2;
			if (local11 > 0) {
				local26 = arg3;
			}
			@Pc(36) int[] local36 = Static83.aClass1_Sub1_Sub5_Sub2_5.anIntArray150;
			local42 = local20 >> 6 & 0x3;
			local57 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
			local63 = local11 >> 14 & 0x7FFF;
			@Pc(69) Class1_Sub1_Sub3 local69 = Static108.method1807(local63);
			if (local69.anInt398 == -1) {
				if (local24 == 0 || local24 == 2) {
					if (local42 == 0) {
						local36[local57] = local26;
						local36[local57 + 512] = local26;
						local36[local57 + 1024] = local26;
						local36[local57 + 1536] = local26;
					} else if (local42 == 1) {
						local36[local57] = local26;
						local36[local57 + 1] = local26;
						local36[local57 + 2] = local26;
						local36[local57 + 3] = local26;
					} else if (local42 == 2) {
						local36[local57 + 3] = local26;
						local36[local57 + 512 + 3] = local26;
						local36[local57 + 1024 + 3] = local26;
						local36[local57 + 1539] = local26;
					} else if (local42 == 3) {
						local36[local57 + 1536] = local26;
						local36[local57 + 1536 + 1] = local26;
						local36[local57 + 1536 + 2] = local26;
						local36[local57 + 3 + 1536] = local26;
					}
				}
				if (local24 == 3) {
					if (local42 == 0) {
						local36[local57] = local26;
					} else if (local42 == 1) {
						local36[local57 + 3] = local26;
					} else if (local42 == 2) {
						local36[local57 + 1539] = local26;
					} else if (local42 == 3) {
						local36[local57 + 1536] = local26;
					}
				}
				if (local24 == 2) {
					if (local42 == 3) {
						local36[local57] = local26;
						local36[local57 + 512] = local26;
						local36[local57 + 1024] = local26;
						local36[local57 + 1536] = local26;
					} else if (local42 == 0) {
						local36[local57] = local26;
						local36[local57 + 1] = local26;
						local36[local57 + 2] = local26;
						local36[local57 + 3] = local26;
					} else if (local42 == 1) {
						local36[local57 + 3] = local26;
						local36[local57 + 515] = local26;
						local36[local57 + 3 + 1024] = local26;
						local36[local57 + 1539] = local26;
					} else if (local42 == 2) {
						local36[local57 + 1536] = local26;
						local36[local57 + 1 + 1536] = local26;
						local36[local57 + 2 + 1536] = local26;
						local36[local57 + 3 + 1536] = local26;
					}
				}
			} else {
				@Pc(79) Class1_Sub1_Sub5_Sub3 local79 = Static58.aClass1_Sub1_Sub5_Sub3Array4[local69.anInt398];
				if (local79 != null) {
					@Pc(92) int local92 = (local69.anInt411 * 4 - local79.anInt1800) / 2;
					@Pc(102) int local102 = (local69.anInt420 * 4 - local79.anInt1799) / 2;
					local79.method1290(arg1 * 4 + local102 + 48, local92 + 48 - -((-arg0 - local69.anInt411 + 104) * 4));
				}
			}
		}
		local11 = Static82.aClass68_1.method1779(arg4, arg1, arg0);
		if (local11 != 0) {
			local20 = Static82.aClass68_1.method1760(arg4, arg1, arg0, local11);
			local42 = local20 >> 6 & 0x3;
			local26 = local11 >> 14 & 0x7FFF;
			local24 = local20 & 0x1F;
			@Pc(472) Class1_Sub1_Sub3 local472 = Static108.method1807(local26);
			@Pc(503) int local503;
			if (local472.anInt398 != -1) {
				@Pc(574) Class1_Sub1_Sub5_Sub3 local574 = Static58.aClass1_Sub1_Sub5_Sub3Array4[local472.anInt398];
				if (local574 != null) {
					local63 = (local472.anInt420 * 4 - local574.anInt1799) / 2;
					local503 = (local472.anInt411 * 4 - local574.anInt1800) / 2;
					local574.method1290(local63 + arg1 * 4 + 48, local503 + (48 - -((-arg0 + (104 - local472.anInt411)) * 4)));
				}
			} else if (local24 == 9) {
				local57 = 15658734;
				if (local11 > 0) {
					local57 = 15597568;
				}
				@Pc(488) int[] local488 = Static83.aClass1_Sub1_Sub5_Sub2_5.anIntArray150;
				local503 = (52736 - arg0 * 512) * 4 + arg1 * 4 + 24624;
				if (local42 == 0 || local42 == 2) {
					local488[local503 + 1536] = local57;
					local488[local503 + 1 + 1024] = local57;
					local488[local503 + 2 + 512] = local57;
					local488[local503 + 3] = local57;
				} else {
					local488[local503] = local57;
					local488[local503 + 1 + 512] = local57;
					local488[local503 + 1026] = local57;
					local488[local503 + 1536 + 3] = local57;
				}
			}
		}
		local11 = Static82.aClass68_1.method1786(arg4, arg1, arg0);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(642) Class1_Sub1_Sub3 local642 = Static108.method1807(local20);
		if (local642.anInt398 == -1) {
			return;
		}
		@Pc(651) Class1_Sub1_Sub5_Sub3 local651 = Static58.aClass1_Sub1_Sub5_Sub3Array4[local642.anInt398];
		if (local651 != null) {
			@Pc(664) int local664 = (local642.anInt411 * 4 - local651.anInt1800) / 2;
			local26 = (local642.anInt420 * 4 - local651.anInt1799) / 2;
			local651.method1290(arg1 * 4 + local26 + 48, local664 + (-arg0 + 104 - local642.anInt411) * 4 + 48);
			return;
		}
	}
}
