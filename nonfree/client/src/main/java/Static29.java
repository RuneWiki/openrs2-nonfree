import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ci", name = "Z", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_6;

	@OriginalMember(owner = "client!ci", name = "kb", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!ci", name = "U", descriptor = "Lclient!kh;")
	private static Class60 aClass60_240 = Static200.method3116("Loaded sprites");

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
	public static int anInt699 = 0;

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!ci", name = "eb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_241 = Static200.method3116("rot:");

	@OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
	public static int anInt707 = 0;

	@OriginalMember(owner = "client!ci", name = "hb", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!ci", name = "ib", descriptor = "Lclient!kh;")
	public static Class60 aClass60_242 = aClass60_240;

	@OriginalMember(owner = "client!ci", name = "lb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_243 = Static200.method3116("null");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method538() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		if (Static172.anInt3718 == 198) {
			local12 = Static16.aClass1_Sub9_Sub1_1.method942();
			local20 = Static194.anInt4138 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static180.anInt3843;
			local30 = Static16.aClass1_Sub9_Sub1_1.method885();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(56) Class19 local56 = Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26];
				if (local56 != null) {
					for (@Pc(63) Class1_Sub1_Sub16 local63 = (Class1_Sub1_Sub16) local56.method609(); local63 != null; local63 = (Class1_Sub1_Sub16) local56.method615()) {
						if (local63.aClass9_Sub5_1.anInt1521 == (local30 & 0x7FFF)) {
							local63.method3530();
							break;
						}
					}
					if (local56.method609() == null) {
						Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26] = null;
					}
					Static124.method2105(local26, local20);
				}
			}
			return;
		}
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(163) int local163;
		@Pc(167) int local167;
		@Pc(171) int local171;
		@Pc(143) int local143;
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(159) int local159;
		@Pc(255) Class9_Sub7 local255;
		if (Static172.anInt3718 == 150) {
			local12 = Static16.aClass1_Sub9_Sub1_1.method895();
			local20 = (local12 >> 4 & 0x7) + Static194.anInt4138;
			local26 = Static180.anInt3843 + (local12 & 0x7);
			local30 = Static16.aClass1_Sub9_Sub1_1.method891() + local20;
			local135 = Static16.aClass1_Sub9_Sub1_1.method891() + local26;
			local139 = Static16.aClass1_Sub9_Sub1_1.method932();
			local143 = Static16.aClass1_Sub9_Sub1_1.method946();
			local149 = Static16.aClass1_Sub9_Sub1_1.method895() * 4;
			local155 = Static16.aClass1_Sub9_Sub1_1.method895() * 4;
			local159 = Static16.aClass1_Sub9_Sub1_1.method946();
			local163 = Static16.aClass1_Sub9_Sub1_1.method946();
			local167 = Static16.aClass1_Sub9_Sub1_1.method895();
			local171 = Static16.aClass1_Sub9_Sub1_1.method895();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local30 >= 0 && local135 >= 0 && local30 < 104 && local135 < 104 && local143 != 65535) {
				local26 = local26 * 128 + 64;
				local135 = local135 * 128 + 64;
				local20 = local20 * 128 + 64;
				local30 = local30 * 128 + 64;
				local255 = new Class9_Sub7(local143, Static180.anInt3841, local20, local26, Static165.method2268(local26, Static180.anInt3841, local20) - local149, local159 - -Static42.anInt910, local163 + Static42.anInt910, local167, local171, local139, local155);
				local255.method2740(local30, local135, local159 + Static42.anInt910, Static165.method2268(local135, Static180.anInt3841, local30) - local155);
				Static153.aClass19_14.method620(new Class1_Sub1_Sub8(local255));
			}
		} else if (Static172.anInt3718 == 52) {
			local12 = Static16.aClass1_Sub9_Sub1_1.method895();
			local26 = (local12 & 0x7) + Static180.anInt3843;
			local20 = (local12 >> 4 & 0x7) + Static194.anInt4138;
			local30 = Static16.aClass1_Sub9_Sub1_1.method946();
			if (local30 == 65535) {
				local30 = -1;
			}
			local135 = Static16.aClass1_Sub9_Sub1_1.method895();
			local149 = Static16.aClass1_Sub9_Sub1_1.method895();
			local143 = local135 & 0x7;
			local139 = local135 >> 4 & 0xF;
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local155 = local139 + 1;
				if (local20 - local155 <= Static84.aClass9_Sub4_Sub1_2.anIntArray510[0] && Static84.aClass9_Sub4_Sub1_2.anIntArray510[0] <= local155 + local20 && Static84.aClass9_Sub4_Sub1_2.anIntArray511[0] >= local26 - local155 && local155 + local26 >= Static84.aClass9_Sub4_Sub1_2.anIntArray511[0] && Static79.anInt1900 != 0 && local143 > 0 && Static196.anInt4181 < 50 && local30 != -1) {
					Static158.anIntArray456[Static196.anInt4181] = local30;
					Static4.anIntArray12[Static196.anInt4181] = local143;
					Static32.anIntArray112[Static196.anInt4181] = local149;
					Static73.aClass30Array1[Static196.anInt4181] = null;
					Static154.anIntArray446[Static196.anInt4181] = (local26 << 8) + (local20 << 16) + local139;
					Static196.anInt4181++;
				}
			}
		} else if (Static172.anInt3718 == 232) {
			local12 = Static16.aClass1_Sub9_Sub1_1.method895();
			local20 = (local12 >> 4 & 0x7) + Static194.anInt4138;
			local26 = Static180.anInt3843 + (local12 & 0x7);
			local30 = Static16.aClass1_Sub9_Sub1_1.method946();
			local135 = Static16.aClass1_Sub9_Sub1_1.method946();
			local139 = Static16.aClass1_Sub9_Sub1_1.method946();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(485) Class19 local485 = Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26];
				if (local485 != null) {
					for (@Pc(492) Class1_Sub1_Sub16 local492 = (Class1_Sub1_Sub16) local485.method609(); local492 != null; local492 = (Class1_Sub1_Sub16) local485.method615()) {
						@Pc(497) Class9_Sub5 local497 = local492.aClass9_Sub5_1;
						if ((local30 & 0x7FFF) == local497.anInt1521 && local497.anInt1525 == local135) {
							local497.anInt1525 = local139;
							break;
						}
					}
					Static124.method2105(local26, local20);
				}
			}
		} else {
			if (Static172.anInt3718 == 61) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method946();
				local20 = Static16.aClass1_Sub9_Sub1_1.method939();
				local26 = local20 >> 2;
				local135 = Static66.anIntArray190[local26];
				local139 = Static16.aClass1_Sub9_Sub1_1.method946();
				local30 = local20 & 0x3;
				@Pc(555) byte local555 = Static16.aClass1_Sub9_Sub1_1.method907();
				@Pc(559) byte local559 = Static16.aClass1_Sub9_Sub1_1.method906();
				@Pc(563) byte local563 = Static16.aClass1_Sub9_Sub1_1.method891();
				@Pc(567) byte local567 = Static16.aClass1_Sub9_Sub1_1.method906();
				local163 = Static16.aClass1_Sub9_Sub1_1.method946();
				local167 = Static16.aClass1_Sub9_Sub1_1.method895();
				local171 = (local167 >> 4 & 0x7) + Static194.anInt4138;
				@Pc(589) int local589 = (local167 & 0x7) + Static180.anInt3843;
				@Pc(593) int local593 = Static16.aClass1_Sub9_Sub1_1.method901();
				@Pc(602) Class9_Sub4_Sub1 local602;
				if (local12 == Static65.anInt1615) {
					local602 = Static84.aClass9_Sub4_Sub1_2;
				} else {
					local602 = Static41.aClass9_Sub4_Sub1Array2[local12];
				}
				if (local602 != null) {
					@Pc(614) Class1_Sub1_Sub23 local614 = Static44.method760(local139);
					@Pc(630) int local630;
					@Pc(627) int local627;
					if (local30 == 1 || local30 == 3) {
						local627 = local614.anInt4024;
						local630 = local614.anInt4018;
					} else {
						local630 = local614.anInt4024;
						local627 = local614.anInt4018;
					}
					@Pc(645) int local645 = local171 + (local630 >> 1);
					@Pc(653) int local653 = local171 + (local630 + 1 >> 1);
					@Pc(659) int local659 = (local627 >> 1) + local589;
					@Pc(661) int[][] local661 = null;
					@Pc(665) int[][] local665 = Static138.anIntArrayArrayArray17[Static180.anInt3841];
					@Pc(673) int local673 = (local171 << 7) + (local630 << 6);
					if (Static180.anInt3841 < 3) {
						local661 = Static138.anIntArrayArrayArray17[Static180.anInt3841 + 1];
					}
					@Pc(690) int local690 = (local627 + 1 >> 1) + local589;
					@Pc(717) int local717 = local665[local645][local690] + local665[local653][local659] + local665[local645][local659] + local665[local653][local690] >> 2;
					@Pc(725) int local725 = (local627 << 6) + (local589 << 7);
					@Pc(737) Class1_Sub1_Sub1 local737 = local614.method2943(local717, local665, local661, local673, local26, local725, false, local30);
					if (local737 != null) {
						@Pc(744) byte local744;
						if (local563 < local559) {
							local744 = local559;
							local559 = local563;
							local563 = local744;
						}
						Static177.method2831(local593 + 1, -1, local163 + 1, local135, local171, local589, Static180.anInt3841, 0, 0);
						local602.anInt1406 = local627 * 64 + local589 * 128;
						local602.anInt1405 = local171 + local559;
						local602.anInt1418 = local163 + Static42.anInt910;
						if (local567 > local555) {
							local744 = local567;
							local567 = local555;
							local555 = local744;
						}
						local602.anInt1409 = Static42.anInt910 + local593;
						local602.aClass9_Sub2_1 = (Class9_Sub2) local737.aClass9_1;
						local602.anInt1400 = local563 + local171;
						local602.anInt1407 = local555 + local589;
						local602.anInt1419 = local717;
						local602.anInt1410 = local171 * 128 + local630 * 64;
						local602.anInt1397 = local589 + local567;
					}
				}
			}
			if (Static172.anInt3718 == 171) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method942();
				local26 = local12 & 0x3;
				local20 = local12 >> 2;
				local30 = Static66.anIntArray190[local20];
				local135 = Static16.aClass1_Sub9_Sub1_1.method916();
				if (local135 == 65535) {
					local135 = -1;
				}
				local139 = Static16.aClass1_Sub9_Sub1_1.method930();
				local143 = (local139 >> 4 & 0x7) + Static194.anInt4138;
				local149 = (local139 & 0x7) + Static180.anInt3843;
				Static108.method1886(local135, local143, Static180.anInt3841, local20, local26, local30, local149);
			} else if (Static172.anInt3718 == 99) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method895();
				local20 = Static194.anInt4138 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static180.anInt3843;
				local30 = Static16.aClass1_Sub9_Sub1_1.method901();
				local135 = Static16.aClass1_Sub9_Sub1_1.method885();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					@Pc(944) Class9_Sub5 local944 = new Class9_Sub5();
					local944.anInt1525 = local135;
					local944.anInt1521 = local30;
					if (Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26] == null) {
						Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26] = new Class19();
					}
					Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26].method620(new Class1_Sub1_Sub16(local944));
					Static124.method2105(local26, local20);
				}
			} else if (Static172.anInt3718 == 173) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method895();
				local20 = Static194.anInt4138 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static180.anInt3843;
				local30 = Static16.aClass1_Sub9_Sub1_1.method946();
				local135 = Static16.aClass1_Sub9_Sub1_1.method895();
				local139 = Static16.aClass1_Sub9_Sub1_1.method946();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					local26 = local26 * 128 + 64;
					local20 = local20 * 128 + 64;
					@Pc(1065) Class9_Sub6 local1065 = new Class9_Sub6(local30, Static180.anInt3841, local20, local26, Static165.method2268(local26, Static180.anInt3841, local20) - local135, local139, Static42.anInt910);
					Static107.aClass19_10.method620(new Class1_Sub1_Sub25(local1065));
				}
			} else if (Static172.anInt3718 == 75) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method895();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static66.anIntArray190[local20];
				local135 = Static16.aClass1_Sub9_Sub1_1.method939();
				local139 = Static194.anInt4138 + (local135 >> 4 & 0x7);
				local143 = (local135 & 0x7) + Static180.anInt3843;
				if (local139 >= 0 && local143 >= 0 && local139 < 104 && local143 < 104) {
					Static177.method2831(-1, -1, 0, local30, local139, local143, Static180.anInt3841, local26, local20);
				}
			} else if (Static172.anInt3718 == 135) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method942();
				local26 = (local12 & 0x7) + Static180.anInt3843;
				local20 = Static194.anInt4138 + (local12 >> 4 & 0x7);
				local30 = Static16.aClass1_Sub9_Sub1_1.method885();
				local135 = Static16.aClass1_Sub9_Sub1_1.method901();
				local139 = Static16.aClass1_Sub9_Sub1_1.method901();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && Static65.anInt1615 != local135) {
					@Pc(1191) Class9_Sub5 local1191 = new Class9_Sub5();
					local1191.anInt1521 = local30;
					local1191.anInt1525 = local139;
					if (Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26] == null) {
						Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26] = new Class19();
					}
					Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local20][local26].method620(new Class1_Sub1_Sub16(local1191));
					Static124.method2105(local26, local20);
				}
			} else if (Static172.anInt3718 == 123) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method895();
				local20 = (local12 >> 4 & 0xF) + Static194.anInt4138 * 2;
				local26 = Static180.anInt3843 * 2 + (local12 & 0xF);
				local30 = local20 + Static16.aClass1_Sub9_Sub1_1.method891();
				local135 = Static16.aClass1_Sub9_Sub1_1.method891() + local26;
				local139 = Static16.aClass1_Sub9_Sub1_1.method932();
				local143 = Static16.aClass1_Sub9_Sub1_1.method946();
				local149 = Static16.aClass1_Sub9_Sub1_1.method895() * 4;
				local155 = Static16.aClass1_Sub9_Sub1_1.method895() * 4;
				local159 = Static16.aClass1_Sub9_Sub1_1.method946();
				local163 = Static16.aClass1_Sub9_Sub1_1.method946();
				local167 = Static16.aClass1_Sub9_Sub1_1.method895();
				local171 = Static16.aClass1_Sub9_Sub1_1.method895();
				if (local20 >= 0 && local26 >= 0 && local20 < 208 && local26 < 208 && local30 >= 0 && local135 >= 0 && local30 < 208 && local135 < 208 && local143 != 65535) {
					local20 *= 64;
					local30 *= 64;
					local26 *= 64;
					local255 = new Class9_Sub7(local143, Static180.anInt3841, local20, local26, Static165.method2268(local26, Static180.anInt3841, local20) - local149, local159 + Static42.anInt910, Static42.anInt910 + local163, local167, local171, local139, local155);
					local135 = local135 * 64;
					local255.method2740(local30, local135, Static42.anInt910 + local159, -local155 + Static165.method2268(local135, Static180.anInt3841, local30));
					Static153.aClass19_14.method620(new Class1_Sub1_Sub8(local255));
				}
			} else if (Static172.anInt3718 == 44) {
				local12 = Static16.aClass1_Sub9_Sub1_1.method895();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static66.anIntArray190[local20];
				local135 = Static16.aClass1_Sub9_Sub1_1.method885();
				local139 = Static16.aClass1_Sub9_Sub1_1.method942();
				local143 = (local139 >> 4 & 0x7) + Static194.anInt4138;
				local149 = Static180.anInt3843 + (local139 & 0x7);
				if (local143 >= 0 && local149 >= 0 && local143 < 104 && local149 < 104) {
					Static177.method2831(-1, local135, 0, local30, local143, local149, Static180.anInt3841, local26, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ve;II)V")
	public static void method539(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt3951 > Static42.anInt910) {
			Static139.method2384(arg0);
		} else if (Static42.anInt910 <= arg0.anInt3933) {
			Static13.method238(arg0);
		} else {
			Static186.method2922(arg0);
		}
		if (arg0.anInt3925 < 128 || arg0.anInt3903 < 128 || arg0.anInt3925 >= 13184 || arg0.anInt3903 >= 13184) {
			arg0.anInt3933 = 0;
			arg0.anInt3914 = -1;
			arg0.anInt3925 = arg0.anInt3937 * 64 + arg0.anIntArray510[0] * 128;
			arg0.anInt3896 = -1;
			arg0.anInt3951 = 0;
			arg0.anInt3903 = arg0.anInt3937 * 64 + arg0.anIntArray511[0] * 128;
			arg0.method2908();
		}
		if (Static84.aClass9_Sub4_Sub1_2 == arg0 && (arg0.anInt3925 < 1536 || arg0.anInt3903 < 1536 || arg0.anInt3925 >= 11776 || arg0.anInt3903 >= 11776)) {
			arg0.anInt3896 = -1;
			arg0.anInt3933 = 0;
			arg0.anInt3951 = 0;
			arg0.anInt3914 = -1;
			arg0.anInt3903 = arg0.anIntArray511[0] * 128 + arg0.anInt3937 * 64;
			arg0.anInt3925 = arg0.anIntArray510[0] * 128 + arg0.anInt3937 * 64;
			arg0.method2908();
		}
		Static83.method1457(arg0);
		Static125.method2120(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!nc;I)V")
	public static void method540(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(9) byte[] local9 = new byte[24];
		if (Static80.aClass66_1 != null) {
			@Pc(21) int local21;
			try {
				Static80.aClass66_1.method2030(0L);
				local21 = 0;
				Static80.aClass66_1.method2028(local9);
				while (local21 < 24 && local9[local21] == 0) {
					local21++;
				}
				if (local21 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(52) Exception local52) {
				for (local21 = 0; local21 < 24; local21++) {
					local9[local21] = -1;
				}
			}
		}
		arg0.method944(24, local9);
	}
}
