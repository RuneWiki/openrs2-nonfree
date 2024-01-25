import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public static int anInt8913 = 0;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "Lclient!ul;")
	public static final Class361 aClass361_15 = new Class361(1);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
	public static boolean method7560() throws IOException {
		if (Static673.aClass160_3 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static39.aClass126_16 == null) {
			if (Static92.aBoolean180) {
				if (!Static673.aClass160_3.method3510(1)) {
					return false;
				}
				Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
				Static92.aBoolean180 = false;
				Static458.anInt7838++;
				Static253.anInt4788 = 0;
			}
			Static67.aClass3_Sub17_Sub2_4.lb = 0;
			if (Static67.aClass3_Sub17_Sub2_4.method4903()) {
				if (!Static673.aClass160_3.method3510(1)) {
					return false;
				}
				Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 1);
				Static458.anInt7838++;
				Static253.anInt4788 = 0;
			}
			Static92.aBoolean180 = true;
			@Pc(69) Class126[] local69 = Static4.method48();
			local73 = Static67.aClass3_Sub17_Sub2_4.method4900();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static67.aClass3_Sub17_Sub2_4.lb);
			}
			Static39.aClass126_16 = local69[local73];
			Static548.anInt8905 = Static39.aClass126_16.anInt3051;
		}
		if (Static548.anInt8905 == -1) {
			if (!Static673.aClass160_3.method3510(1)) {
				return false;
			}
			Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
			Static458.anInt7838++;
			Static548.anInt8905 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
			Static253.anInt4788 = 0;
		}
		if (Static548.anInt8905 == -2) {
			if (!Static673.aClass160_3.method3510(2)) {
				return false;
			}
			Static673.aClass160_3.method3511(2, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
			Static67.aClass3_Sub17_Sub2_4.lb = 0;
			Static548.anInt8905 = Static67.aClass3_Sub17_Sub2_4.method4858();
			Static253.anInt4788 = 0;
			Static458.anInt7838 += 2;
		}
		if (Static548.anInt8905 > 0) {
			if (!Static673.aClass160_3.method3510(Static548.anInt8905)) {
				return false;
			}
			Static67.aClass3_Sub17_Sub2_4.lb = 0;
			Static673.aClass160_3.method3511(Static548.anInt8905, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
			Static253.anInt4788 = 0;
			Static458.anInt7838 += Static548.anInt8905;
		}
		Static3.aClass126_2 = Static215.aClass126_116;
		Static215.aClass126_116 = Static213.aClass126_73;
		Static213.aClass126_73 = Static39.aClass126_16;
		@Pc(229) String local229;
		@Pc(241) boolean local241;
		@Pc(223) boolean local223;
		@Pc(227) String local227;
		@Pc(239) int local239;
		@Pc(276) String local276;
		if (Static39.aClass126_16 == Static409.aClass126_135) {
			local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
			local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
			local229 = local227;
			if (local223) {
				local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
			}
			local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
			local241 = false;
			if (local239 <= 1) {
				if (Static120.aBoolean200 && !Static576.aBoolean681 || Static294.aBoolean272) {
					local241 = true;
				} else if (local239 <= 1 && Static410.method5823(local229)) {
					local241 = true;
				}
			}
			if (!local241 && Static412.anInt6978 == 0) {
				local276 = Static648.method8491(Static151.method2610(Static67.aClass3_Sub17_Sub2_4));
				if (local239 == 2) {
					Static30.method942(0, local276, (String) null, -1, "<img=1>" + local227, 24, local227, "<img=1>" + local229);
				} else if (local239 == 1) {
					Static30.method942(0, local276, (String) null, -1, "<img=0>" + local227, 24, local227, "<img=0>" + local229);
				} else {
					Static30.method942(0, local276, (String) null, -1, local227, 24, local227, local229);
				}
			}
			Static39.aClass126_16 = null;
			return true;
		}
		@Pc(470) String local470;
		@Pc(509) int local509;
		@Pc(353) String local353;
		@Pc(382) boolean local382;
		@Pc(404) int local404;
		@Pc(499) int local499;
		@Pc(362) boolean local362;
		@Pc(474) Class172 local474;
		if (Static527.aClass126_173 == Static39.aClass126_16) {
			local353 = Static67.aClass3_Sub17_Sub2_4.method4847();
			local362 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
			if (local362) {
				local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
			} else {
				local227 = local353;
			}
			local239 = Static67.aClass3_Sub17_Sub2_4.method4858();
			@Pc(380) byte local380 = Static67.aClass3_Sub17_Sub2_4.method4861();
			local382 = false;
			if (local380 == -128) {
				local382 = true;
			}
			if (local382) {
				if (Static168.anInt3046 == 0) {
					Static39.aClass126_16 = null;
					return true;
				}
				for (local404 = 0; Static168.anInt3046 > local404 && (!Static199.aClass172Array30[local404].aString56.equals(local227) || Static199.aClass172Array30[local404].anInt4587 != local239); local404++) {
				}
				if (Static168.anInt3046 > local404) {
					while (Static168.anInt3046 - 1 > local404) {
						Static199.aClass172Array30[local404] = Static199.aClass172Array30[local404 + 1];
						local404++;
					}
					Static168.anInt3046--;
					Static199.aClass172Array30[Static168.anInt3046] = null;
				}
			} else {
				local470 = Static67.aClass3_Sub17_Sub2_4.method4847();
				local474 = new Class172();
				local474.aString56 = local227;
				local474.aString58 = local353;
				local474.aString59 = Static102.method2010(local474.aString56);
				local474.anInt4587 = local239;
				local474.aString57 = local470;
				local474.aByte67 = local380;
				for (local499 = Static168.anInt3046 - 1; local499 >= 0; local499--) {
					local509 = Static199.aClass172Array30[local499].aString59.compareTo(local474.aString59);
					if (local509 == 0) {
						Static199.aClass172Array30[local499].anInt4587 = local239;
						Static199.aClass172Array30[local499].aByte67 = local380;
						Static199.aClass172Array30[local499].aString57 = local470;
						if (local227.equals(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34)) {
							Static186.aByte55 = local380;
						}
						Static162.anInt2990 = Static373.anInt6615;
						Static39.aClass126_16 = null;
						return true;
					}
					if (local509 < 0) {
						break;
					}
				}
				if (Static168.anInt3046 >= Static199.aClass172Array30.length) {
					Static39.aClass126_16 = null;
					return true;
				}
				for (local509 = Static168.anInt3046 - 1; local509 > local499; local509--) {
					Static199.aClass172Array30[local509 + 1] = Static199.aClass172Array30[local509];
				}
				if (Static168.anInt3046 == 0) {
					Static199.aClass172Array30 = new Class172[100];
				}
				Static199.aClass172Array30[local499 + 1] = local474;
				Static168.anInt3046++;
				if (local227.equals(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34)) {
					Static186.aByte55 = local380;
				}
			}
			Static162.anInt2990 = Static373.anInt6615;
			Static39.aClass126_16 = null;
			return true;
		}
		@Pc(655) long local655;
		@Pc(645) long local645;
		@Pc(673) int local673;
		@Pc(739) int local739;
		@Pc(733) String local733;
		@Pc(640) long local640;
		if (Static39.aClass126_16 == Static325.aClass126_109) {
			local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
			local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
			local640 = (long) Static67.aClass3_Sub17_Sub2_4.method4858();
			local645 = (long) Static67.aClass3_Sub17_Sub2_4.method4862();
			local404 = Static67.aClass3_Sub17_Sub2_4.method4888();
			local655 = (local640 << 32) + local645;
			@Pc(657) boolean local657 = false;
			@Pc(665) Class3_Sub20 local665 = local223 ? Static430.aClass3_Sub20_3 : Static656.aClass3_Sub20_2;
			if (local665 == null) {
				local657 = true;
			} else {
				label2102: {
					for (local673 = 0; local673 < 100; local673++) {
						if (Static510.aLongArray16[local673] == local655) {
							local657 = true;
							break label2102;
						}
					}
					if (local404 <= 1) {
						if (Static120.aBoolean200 && !Static576.aBoolean681 || Static294.aBoolean272) {
							local657 = true;
						} else if (Static410.method5823(local227)) {
							local657 = true;
						}
					}
				}
			}
			if (!local657 && Static412.anInt6978 == 0) {
				Static510.aLongArray16[Static330.anInt6097] = local655;
				Static330.anInt6097 = (Static330.anInt6097 + 1) % 100;
				local733 = Static648.method8491(Static151.method2610(Static67.aClass3_Sub17_Sub2_4));
				local739 = local223 ? 41 : 44;
				if (local404 == 2 || local404 == 3) {
					Static30.method942(0, local733, local665.aString43, -1, "<img=1>" + local227, local739, local227, "<img=1>" + local227);
				} else if (local404 == 1) {
					Static30.method942(0, local733, local665.aString43, -1, "<img=0>" + local227, local739, local227, "<img=0>" + local227);
				} else {
					Static30.method942(0, local733, local665.aString43, -1, local227, local739, local227, local227);
				}
			}
			Static39.aClass126_16 = null;
			return true;
		}
		@Pc(820) int local820;
		if (Static408.aClass126_141 == Static39.aClass126_16) {
			local820 = Static67.aClass3_Sub17_Sub2_4.method4850();
			local73 = Static67.aClass3_Sub17_Sub2_4.method4872();
			@Pc(827) int[] local827 = new int[4];
			for (local239 = 0; local239 < 4; local239++) {
				local827[local239] = Static67.aClass3_Sub17_Sub2_4.method4879();
			}
			@Pc(848) Class3_Sub11 local848 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local73);
			if (local848 != null) {
				Static305.method4698(local827, local820, local848.aClass23_Sub2_Sub1_Sub2_Sub2_1);
			}
			Static39.aClass126_16 = null;
			return true;
		} else if (Static478.aClass126_161 == Static39.aClass126_16) {
			local820 = Static67.aClass3_Sub17_Sub2_4.method4888();
			local73 = Static67.aClass3_Sub17_Sub2_4.method4879();
			Static623.method7324();
			Static215.method5254(local820, true, local73);
			Static39.aClass126_16 = null;
			return true;
		} else if (Static39.aClass126_16 == Static436.aClass126_146) {
			local820 = Static67.aClass3_Sub17_Sub2_4.method4868();
			Static216.aClass129_7 = Static499.aClass231_4.method5288(local820);
			Static39.aClass126_16 = null;
			return true;
		} else {
			@Pc(929) int local929;
			@Pc(935) int local935;
			if (Static39.aClass126_16 == Static425.aClass126_143) {
				local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
				local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
				local362 = (local73 & 0x1) == 1;
				Static567.method7680(local820, local362);
				local239 = Static67.aClass3_Sub17_Sub2_4.method4858();
				for (local929 = 0; local929 < local239; local929++) {
					local935 = Static67.aClass3_Sub17_Sub2_4.method4844();
					if (local935 == 255) {
						local935 = Static67.aClass3_Sub17_Sub2_4.method4851();
					}
					local404 = Static67.aClass3_Sub17_Sub2_4.method4884();
					Static558.method7630(local362, local935, local820, local929, local404 - 1);
				}
				Static32.anIntArray32[Static235.anInt4463++ & 0x1F] = local820;
				Static39.aClass126_16 = null;
				return true;
			} else if (Static255.aClass126_87 == Static39.aClass126_16) {
				local820 = Static67.aClass3_Sub17_Sub2_4.method4879();
				Static623.method7324();
				Static492.method7030(local820);
				Static39.aClass126_16 = null;
				return true;
			} else if (Static39.aClass126_16 == Static644.aClass126_201) {
				Static229.anInt9434 = Static373.anInt6615;
				local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
				@Pc(1011) Class253 local1011 = new Class253(Static67.aClass3_Sub17_Sub2_4);
				@Pc(1015) Class3_Sub20 local1015;
				if (local223) {
					local1015 = Static430.aClass3_Sub20_3;
				} else {
					local1015 = Static656.aClass3_Sub20_2;
				}
				local1011.method5784(local1015);
				Static39.aClass126_16 = null;
				return true;
			} else if (Static342.aClass126_113 == Static39.aClass126_16) {
				local820 = Static67.aClass3_Sub17_Sub2_4.method4867();
				Static623.method7324();
				Static370.method5475(local820, -1, -1, 3);
				Static39.aClass126_16 = null;
				return true;
			} else if (Static366.aClass126_126 == Static39.aClass126_16) {
				Static654.method8554(Static300.aClass201_13);
				Static39.aClass126_16 = null;
				return true;
			} else {
				@Pc(1103) long local1103;
				@Pc(1072) int local1072;
				@Pc(1118) Class3_Sub1 local1118;
				@Pc(1109) Class3_Sub1 local1109;
				if (Static39.aClass126_16 == Static369.aClass126_29) {
					local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local73 = Static67.aClass3_Sub17_Sub2_4.method4867();
					local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (local1072 == 65535) {
						local1072 = -1;
					}
					local239 = Static67.aClass3_Sub17_Sub2_4.method4884();
					if (local239 == 65535) {
						local239 = -1;
					}
					Static623.method7324();
					for (local929 = local1072; local929 <= local239; local929++) {
						local1103 = (long) local929 + ((long) local73 << 32);
						local1109 = (Class3_Sub1) Static382.aClass62_30.method1682(local1103);
						if (local1109 != null) {
							local1118 = new Class3_Sub1(local1109.anInt19, local820);
							local1109.method8770();
						} else if (local929 == -1) {
							local1118 = new Class3_Sub1(Static676.method8728(local73).aClass3_Sub1_1.anInt19, local820);
						} else {
							local1118 = new Class3_Sub1(0, local820);
						}
						Static382.aClass62_30.method1686(local1103, local1118);
					}
					Static39.aClass126_16 = null;
					return true;
				} else if (Static195.aClass126_64 == Static39.aClass126_16) {
					Static654.method8554(Static261.aClass201_12);
					Static39.aClass126_16 = null;
					return true;
				} else if (Static315.aClass126_106 == Static39.aClass126_16) {
					Static467.anInt7971 = Static67.aClass3_Sub17_Sub2_4.method4874();
					Static212.anInt3897 = Static67.aClass3_Sub17_Sub2_4.method4861() << 3;
					Static646.anInt9924 = Static67.aClass3_Sub17_Sub2_4.method4866() << 3;
					while (Static67.aClass3_Sub17_Sub2_4.lb < Static548.anInt8905) {
						@Pc(1199) Class201 local1199 = Static253.method4022()[Static67.aClass3_Sub17_Sub2_4.method4888()];
						Static654.method8554(local1199);
					}
					Static39.aClass126_16 = null;
					return true;
				} else {
					@Pc(1235) Class3_Sub28 local1235;
					if (Static623.aClass126_172 == Static39.aClass126_16) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4844();
						local73 = Static67.aClass3_Sub17_Sub2_4.method4884();
						local1072 = Static67.aClass3_Sub17_Sub2_4.method4851();
						Static623.method7324();
						local1235 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local1072);
						if (local1235 != null) {
							Static414.method5937(local1235.anInt5252 != local73, local1235, false);
						}
						Static624.method8248(local73, false, local820, local1072);
						Static39.aClass126_16 = null;
						return true;
					} else if (Static28.aClass126_12 == Static39.aClass126_16) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4872();
						local73 = Static67.aClass3_Sub17_Sub2_4.method4868();
						Static592.aClass47_2.method1432(local73, local820);
						Static39.aClass126_16 = null;
						return true;
					} else if (Static666.aClass126_208 == Static39.aClass126_16) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4888();
						local73 = Static67.aClass3_Sub17_Sub2_4.method4872();
						local362 = (local820 & 0x1) == 1;
						Static250.method3962(local362, local73);
						Static32.anIntArray32[Static235.anInt4463++ & 0x1F] = local73;
						Static39.aClass126_16 = null;
						return true;
					} else if (Static39.aClass126_16 == Static317.aClass126_107) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
						if (local820 == 65535) {
							local820 = -1;
						}
						local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
						local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
						local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
						local929 = Static67.aClass3_Sub17_Sub2_4.method4858();
						Static645.method8448(local239, local73, local820, local1072, local929, false);
						Static39.aClass126_16 = null;
						return true;
					} else if (Static39.aClass126_16 == Static111.aClass126_213) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
						local73 = Static67.aClass3_Sub17_Sub2_4.method4868();
						Static623.method7324();
						Static588.method7907(local73, local820);
						Static39.aClass126_16 = null;
						return true;
					} else if (Static39.aClass126_16 == Static286.aClass126_96) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4874();
						local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
						local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
						if (local1072 == 65535) {
							local1072 = -1;
						}
						local239 = Static67.aClass3_Sub17_Sub2_4.method4844();
						if (local820 >= 1 && local820 <= 8) {
							if (local227.equalsIgnoreCase("null")) {
								local227 = null;
							}
							Static477.aStringArray57[local820 - 1] = local227;
							Static67.anIntArray596[local820 - 1] = local1072;
							Static400.aBooleanArray20[local820 - 1] = local239 == 0;
						}
						Static39.aClass126_16 = null;
						return true;
					} else if (Static672.aClass126_212 == Static39.aClass126_16) {
						local820 = Static67.aClass3_Sub17_Sub2_4.method4879();
						local73 = Static67.aClass3_Sub17_Sub2_4.method4844();
						local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
						local239 = Static67.aClass3_Sub17_Sub2_4.method4891();
						Static623.method7324();
						Static624.method8250(local1072, local239, local820, local73);
						Static39.aClass126_16 = null;
						return true;
					} else {
						@Pc(1484) byte local1484;
						if (Static166.aClass126_54 == Static39.aClass126_16) {
							local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
							local1484 = Static67.aClass3_Sub17_Sub2_4.method4861();
							Static623.method7324();
							Static42.method1220(local820, local1484);
							Static39.aClass126_16 = null;
							return true;
						} else if (Static466.aClass126_156 == Static39.aClass126_16) {
							Static44.method1231();
							Static39.aClass126_16 = null;
							return false;
						} else if (Static229.aClass126_190 == Static39.aClass126_16) {
							local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
							local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
							local229 = local227;
							if (local223) {
								local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
							}
							local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
							local929 = Static67.aClass3_Sub17_Sub2_4.method4858();
							local382 = false;
							if (local239 <= 1 && Static410.method5823(local229)) {
								local382 = true;
							}
							if (!local382 && Static412.anInt6978 == 0) {
								local470 = Static264.aClass263_2.method6363(local929).method1164(Static67.aClass3_Sub17_Sub2_4);
								if (local239 == 2) {
									Static30.method942(0, local470, (String) null, local929, "<img=1>" + local227, 25, local227, "<img=1>" + local229);
								} else if (local239 == 1) {
									Static30.method942(0, local470, (String) null, local929, "<img=0>" + local227, 25, local227, "<img=0>" + local229);
								} else {
									Static30.method942(0, local470, (String) null, local929, local227, 25, local227, local229);
								}
							}
							Static39.aClass126_16 = null;
							return true;
						} else if (Static94.aClass126_32 == Static39.aClass126_16) {
							Static173.anInt3293 = Static67.aClass3_Sub17_Sub2_4.method4888();
							for (local820 = 0; local820 < Static173.anInt3293; local820++) {
								Static564.aStringArray72[local820] = Static67.aClass3_Sub17_Sub2_4.method4847();
								Static614.aStringArray68[local820] = Static67.aClass3_Sub17_Sub2_4.method4847();
								if (Static614.aStringArray68[local820].equals("")) {
									Static614.aStringArray68[local820] = Static564.aStringArray72[local820];
								}
								Static196.aStringArray26[local820] = Static67.aClass3_Sub17_Sub2_4.method4847();
								Static93.aStringArray17[local820] = Static67.aClass3_Sub17_Sub2_4.method4847();
								if (Static93.aStringArray17[local820].equals("")) {
									Static93.aStringArray17[local820] = Static196.aStringArray26[local820];
								}
								Static173.aBooleanArray14[local820] = false;
							}
							Static39.aClass126_16 = null;
							Static221.anInt4055 = Static373.anInt6615;
							return true;
						} else if (Static429.aClass126_145 == Static39.aClass126_16) {
							if (Static277.anInt5201 != -1) {
								Static325.method5063(0, Static277.anInt5201);
							}
							Static39.aClass126_16 = null;
							return true;
						} else {
							@Pc(1752) String local1752;
							@Pc(1750) String local1750;
							if (Static565.aClass126_168 == Static39.aClass126_16) {
								local820 = Static67.aClass3_Sub17_Sub2_4.method4841();
								local73 = Static67.aClass3_Sub17_Sub2_4.method4868();
								local1072 = Static67.aClass3_Sub17_Sub2_4.method4888();
								local1750 = "";
								local1752 = local1750;
								if ((local1072 & 0x1) != 0) {
									local1750 = Static67.aClass3_Sub17_Sub2_4.method4847();
									if ((local1072 & 0x2) == 0) {
										local1752 = local1750;
									} else {
										local1752 = Static67.aClass3_Sub17_Sub2_4.method4847();
									}
								}
								local276 = Static67.aClass3_Sub17_Sub2_4.method4847();
								if (local820 == 99) {
									Static339.method5160(local276);
								} else if (local1752.equals("") || !Static410.method5823(local1752)) {
									Static310.method4784(local820, local276, local1750, local1752, local73, local1750);
								} else {
									Static39.aClass126_16 = null;
									return true;
								}
								Static39.aClass126_16 = null;
								return true;
							}
							@Pc(1852) int local1852;
							if (Static39.aClass126_16 == Static463.aClass126_155) {
								local820 = Static67.aClass3_Sub17_Sub2_4.method4868();
								local73 = local820 >> 28 & 0x3;
								local1072 = local820 >> 14 & 0x3FFF;
								local239 = local820 & 0x3FFF;
								local929 = Static67.aClass3_Sub17_Sub2_4.method4874();
								local935 = local929 >> 2;
								local404 = local929 & 0x3;
								local1852 = Static326.anIntArray387[local935];
								local499 = Static67.aClass3_Sub17_Sub2_4.method4879();
								if (local499 == 65535) {
									local499 = -1;
								}
								local1072 -= Static417.anInt7047;
								local239 -= Static347.anInt7851;
								Static658.method8566(local1072, local73, local1852, local404, local935, local499, local239);
								Static39.aClass126_16 = null;
								return true;
							} else if (Static39.aClass126_16 == Static402.aClass126_140) {
								local820 = Static67.aClass3_Sub17_Sub2_4.method4884();
								local73 = Static67.aClass3_Sub17_Sub2_4.method4851();
								Static623.method7324();
								Static451.method6489(local820, local73);
								Static39.aClass126_16 = null;
								return true;
							} else {
								@Pc(2078) boolean local2078;
								if (Static230.aClass126_80 == Static39.aClass126_16) {
									Static162.anInt2990 = Static373.anInt6615;
									if (Static548.anInt8905 == 0) {
										Static275.aString94 = null;
										Static39.aClass126_16 = null;
										Static199.aClass172Array30 = null;
										Static168.anInt3046 = 0;
										Static58.aString15 = null;
										return true;
									}
									Static275.aString94 = Static67.aClass3_Sub17_Sub2_4.method4847();
									local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
									if (local223) {
										Static67.aClass3_Sub17_Sub2_4.method4847();
									}
									@Pc(1951) long local1951 = Static67.aClass3_Sub17_Sub2_4.method4865();
									Static58.aString15 = Static455.method6553(local1951);
									Static602.aByte133 = Static67.aClass3_Sub17_Sub2_4.method4861();
									local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
									if (local239 == 255) {
										Static39.aClass126_16 = null;
										return true;
									}
									Static168.anInt3046 = local239;
									@Pc(1975) Class172[] local1975 = new Class172[100];
									for (local935 = 0; local935 < Static168.anInt3046; local935++) {
										local1975[local935] = new Class172();
										local1975[local935].aString58 = Static67.aClass3_Sub17_Sub2_4.method4847();
										local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
										if (local223) {
											local1975[local935].aString56 = Static67.aClass3_Sub17_Sub2_4.method4847();
										} else {
											local1975[local935].aString56 = local1975[local935].aString58;
										}
										local1975[local935].aString59 = Static102.method2010(local1975[local935].aString56);
										local1975[local935].anInt4587 = Static67.aClass3_Sub17_Sub2_4.method4858();
										local1975[local935].aByte67 = Static67.aClass3_Sub17_Sub2_4.method4861();
										local1975[local935].aString57 = Static67.aClass3_Sub17_Sub2_4.method4847();
										if (local1975[local935].aString56.equals(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34)) {
											Static186.aByte55 = local1975[local935].aByte67;
										}
									}
									local499 = Static168.anInt3046;
									while (local499 > 0) {
										local2078 = true;
										local499--;
										for (local509 = 0; local509 < local499; local509++) {
											if (local1975[local509].aString59.compareTo(local1975[local509 + 1].aString59) > 0) {
												local474 = local1975[local509];
												local1975[local509] = local1975[local509 + 1];
												local1975[local509 + 1] = local474;
												local2078 = false;
											}
										}
										if (local2078) {
											break;
										}
									}
									Static199.aClass172Array30 = local1975;
									Static39.aClass126_16 = null;
									return true;
								} else if (Static310.aClass126_103 == Static39.aClass126_16) {
									local223 = Static67.aClass3_Sub17_Sub2_4.method4844() == 1;
									Static623.method7324();
									Static47.aBoolean109 = local223;
									Static39.aClass126_16 = null;
									return true;
								} else if (Static39.aClass126_16 == Static359.aClass126_121) {
									if (Static473.method6805(Static520.anInt6836)) {
										Static253.anInt4769 = (int) ((float) Static67.aClass3_Sub17_Sub2_4.method4858() * 2.5F);
									} else {
										Static253.anInt4769 = Static67.aClass3_Sub17_Sub2_4.method4858() * 30;
									}
									Static39.aClass126_16 = null;
									Static431.anInt7596 = Static373.anInt6615;
									return true;
								} else if (Static39.aClass126_16 == Static180.aClass126_58) {
									Static623.method7324();
									Static49.method1304();
									Static39.aClass126_16 = null;
									return true;
								} else if (Static39.aClass126_16 == Static383.aClass126_134) {
									Static293.method4565(Static548.anInt8905, Static67.aClass3_Sub17_Sub2_4);
									Static39.aClass126_16 = null;
									return true;
								} else if (Static510.aClass126_169 == Static39.aClass126_16) {
									local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
									local73 = Static67.aClass3_Sub17_Sub2_4.method4879();
									local1072 = Static67.aClass3_Sub17_Sub2_4.method4872();
									Static623.method7324();
									Static315.method4938(local820, (local73 << 16) + local1072);
									Static39.aClass126_16 = null;
									return true;
								} else {
									@Pc(2268) long local2268;
									@Pc(2289) boolean local2289;
									@Pc(2348) String local2348;
									if (Static39.aClass126_16 == Static442.aClass126_148) {
										local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
										local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
										local229 = local227;
										if (local223) {
											local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
										}
										local2268 = (long) Static67.aClass3_Sub17_Sub2_4.method4858();
										local1103 = (long) Static67.aClass3_Sub17_Sub2_4.method4862();
										local1852 = Static67.aClass3_Sub17_Sub2_4.method4888();
										local499 = Static67.aClass3_Sub17_Sub2_4.method4858();
										@Pc(2287) long local2287 = local1103 + (local2268 << 32);
										local2289 = false;
										local739 = 0;
										while (true) {
											if (local739 >= 100) {
												if (local1852 <= 1 && Static410.method5823(local229)) {
													local2289 = true;
												}
												break;
											}
											if (local2287 == Static510.aLongArray16[local739]) {
												local2289 = true;
												break;
											}
											local739++;
										}
										if (!local2289 && Static412.anInt6978 == 0) {
											Static510.aLongArray16[Static330.anInt6097] = local2287;
											Static330.anInt6097 = (Static330.anInt6097 + 1) % 100;
											local2348 = Static264.aClass263_2.method6363(local499).method1164(Static67.aClass3_Sub17_Sub2_4);
											if (local1852 == 2) {
												Static30.method942(0, local2348, (String) null, local499, "<img=1>" + local227, 18, local227, "<img=1>" + local229);
											} else if (local1852 == 1) {
												Static30.method942(0, local2348, (String) null, local499, "<img=0>" + local227, 18, local227, "<img=0>" + local229);
											} else {
												Static30.method942(0, local2348, (String) null, local499, local227, 18, local227, local229);
											}
										}
										Static39.aClass126_16 = null;
										return true;
									} else if (Static39.aClass126_16 == Static440.aClass126_147) {
										local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
										if (local820 == 65535) {
											local820 = -1;
										}
										local73 = Static67.aClass3_Sub17_Sub2_4.method4867();
										Static623.method7324();
										Static70.method1569(local73, local820);
										Static39.aClass126_16 = null;
										return true;
									} else if (Static679.aClass126_215 == Static39.aClass126_16) {
										Static654.method8554(Static569.aClass201_19);
										Static39.aClass126_16 = null;
										return true;
									} else if (Static39.aClass126_16 == Static89.aClass126_30) {
										Static67.aClass3_Sub17_Sub2_4.lb += 28;
										if (Static67.aClass3_Sub17_Sub2_4.method4860()) {
											Static2.method23(Static67.aClass3_Sub17_Sub2_4.lb - 28, Static67.aClass3_Sub17_Sub2_4);
										}
										Static39.aClass126_16 = null;
										return true;
									} else if (Static39.aClass126_16 == Static671.aClass126_210) {
										for (local820 = 0; local820 < Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1.length; local820++) {
											if (Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local820] != null) {
												Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local820].anIntArray651 = null;
												Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local820].anInt10135 = -1;
											}
										}
										for (local73 = 0; local73 < Static609.anInt6433; local73++) {
											Static43.aClass3_Sub11Array1[local73].aClass23_Sub2_Sub1_Sub2_Sub2_1.anIntArray651 = null;
											Static43.aClass3_Sub11Array1[local73].aClass23_Sub2_Sub1_Sub2_Sub2_1.anInt10135 = -1;
										}
										Static39.aClass126_16 = null;
										return true;
									} else if (Static39.aClass126_16 == Static226.aClass126_125) {
										local820 = Static67.aClass3_Sub17_Sub2_4.method4874();
										Static623.method7324();
										Static380.anInt6677 = local820;
										Static39.aClass126_16 = null;
										return true;
									} else {
										@Pc(2601) boolean local2601;
										@Pc(2599) long local2599;
										if (Static156.aClass126_105 == Static39.aClass126_16) {
											local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
											local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
											local229 = local227;
											if (local223) {
												local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
											}
											local2268 = (long) Static67.aClass3_Sub17_Sub2_4.method4858();
											local1103 = (long) Static67.aClass3_Sub17_Sub2_4.method4862();
											local1852 = Static67.aClass3_Sub17_Sub2_4.method4888();
											local2599 = local1103 + (local2268 << 32);
											local2601 = false;
											local673 = 0;
											while (true) {
												if (local673 >= 100) {
													if (local1852 <= 1) {
														if (Static120.aBoolean200 && !Static576.aBoolean681 || Static294.aBoolean272) {
															local2601 = true;
														} else if (Static410.method5823(local229)) {
															local2601 = true;
														}
													}
													break;
												}
												if (Static510.aLongArray16[local673] == local2599) {
													local2601 = true;
													break;
												}
												local673++;
											}
											if (!local2601 && Static412.anInt6978 == 0) {
												Static510.aLongArray16[Static330.anInt6097] = local2599;
												Static330.anInt6097 = (Static330.anInt6097 + 1) % 100;
												local733 = Static648.method8491(Static151.method2610(Static67.aClass3_Sub17_Sub2_4));
												if (local1852 == 2) {
													Static30.method942(0, local733, (String) null, -1, "<img=1>" + local227, 7, local227, "<img=1>" + local229);
												} else if (local1852 == 1) {
													Static30.method942(0, local733, (String) null, -1, "<img=0>" + local227, 7, local227, "<img=0>" + local229);
												} else {
													Static30.method942(0, local733, (String) null, -1, local227, 3, local227, local229);
												}
											}
											Static39.aClass126_16 = null;
											return true;
										} else if (Static471.aClass126_202 == Static39.aClass126_16) {
											Static654.method8554(Static136.aClass201_7);
											Static39.aClass126_16 = null;
											return true;
										} else if (Static97.aClass126_34 == Static39.aClass126_16) {
											local820 = Static67.aClass3_Sub17_Sub2_4.method4868();
											local73 = Static67.aClass3_Sub17_Sub2_4.method4869();
											local1072 = Static67.aClass3_Sub17_Sub2_4.method4877();
											Static623.method7324();
											Static526.method7370(local820, local73, local1072);
											Static39.aClass126_16 = null;
											return true;
										} else if (Static39.aClass126_16 == Static527.aClass126_174) {
											Static654.method8554(Static197.aClass201_8);
											Static39.aClass126_16 = null;
											return true;
										} else if (Static495.aClass126_165 == Static39.aClass126_16) {
											local353 = Static67.aClass3_Sub17_Sub2_4.method4847();
											local73 = Static67.aClass3_Sub17_Sub2_4.method4872();
											Static623.method7324();
											Static659.method8587(local353, local73);
											Static39.aClass126_16 = null;
											return true;
										} else if (Static39.aClass126_16 == Static660.aClass126_206) {
											local820 = Static67.aClass3_Sub17_Sub2_4.method4879();
											local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
											Static592.aClass47_2.method1432(local73, local820);
											Static39.aClass126_16 = null;
											return true;
										} else if (Static240.aClass126_84 == Static39.aClass126_16) {
											local820 = Static67.aClass3_Sub17_Sub2_4.method4872();
											local73 = Static67.aClass3_Sub17_Sub2_4.method4891();
											Static592.aClass47_2.method1435(local820, local73);
											Static39.aClass126_16 = null;
											return true;
										} else if (Static59.aClass126_19 == Static39.aClass126_16) {
											local820 = Static67.aClass3_Sub17_Sub2_4.method4891();
											local73 = Static67.aClass3_Sub17_Sub2_4.method4884();
											if (local73 == 65535) {
												local73 = -1;
											}
											Static623.method7324();
											Static370.method5475(local820, -1, local73, 1);
											Static39.aClass126_16 = null;
											return true;
										} else {
											@Pc(2992) int local2992;
											if (Static39.aClass126_16 == Static190.aClass126_61) {
												local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
												local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
												local640 = (long) Static67.aClass3_Sub17_Sub2_4.method4858();
												local645 = (long) Static67.aClass3_Sub17_Sub2_4.method4862();
												local404 = Static67.aClass3_Sub17_Sub2_4.method4888();
												local1852 = Static67.aClass3_Sub17_Sub2_4.method4858();
												local2599 = (local640 << 32) + local645;
												local2601 = false;
												@Pc(2923) Class3_Sub20 local2923 = local223 ? Static430.aClass3_Sub20_3 : Static656.aClass3_Sub20_2;
												if (local2923 == null) {
													local2601 = true;
												} else {
													label2128: {
														for (local739 = 0; local739 < 100; local739++) {
															if (local2599 == Static510.aLongArray16[local739]) {
																local2601 = true;
																break label2128;
															}
														}
														if (local404 <= 1 && Static410.method5823(local227)) {
															local2601 = true;
														}
													}
												}
												if (!local2601 && Static412.anInt6978 == 0) {
													Static510.aLongArray16[Static330.anInt6097] = local2599;
													Static330.anInt6097 = (Static330.anInt6097 + 1) % 100;
													local2348 = Static264.aClass263_2.method6363(local1852).method1164(Static67.aClass3_Sub17_Sub2_4);
													local2992 = local223 ? 41 : 44;
													if (local404 == 2 || local404 == 3) {
														Static30.method942(0, local2348, local2923.aString43, -1, "<img=1>" + local227, local2992, local227, "<img=1>" + local227);
													} else if (local404 == 1) {
														Static30.method942(0, local2348, local2923.aString43, -1, "<img=0>" + local227, local2992, local227, "<img=0>" + local227);
													} else {
														Static30.method942(0, local2348, local2923.aString43, -1, local227, local2992, local227, local227);
													}
												}
												Static39.aClass126_16 = null;
												return true;
											} else if (Static39.aClass126_16 == Static485.aClass126_163) {
												Static58.anInt1450 = Static67.aClass3_Sub17_Sub2_4.method4888();
												Static39.aClass126_16 = null;
												Static431.anInt7596 = Static373.anInt6615;
												return true;
											} else if (Static86.aClass126_27 == Static39.aClass126_16) {
												Static654.method8554(Static13.aClass201_1);
												Static39.aClass126_16 = null;
												return true;
											} else if (Static39.aClass126_16 == Static262.aClass126_90) {
												Static431.method6362(Static520.aBoolean516);
												Static39.aClass126_16 = null;
												return false;
											} else if (Static39.aClass126_16 == Static528.aClass126_175) {
												local820 = Static67.aClass3_Sub17_Sub2_4.method4884();
												local73 = Static67.aClass3_Sub17_Sub2_4.method4867();
												local1072 = Static67.aClass3_Sub17_Sub2_4.method4879();
												local239 = Static67.aClass3_Sub17_Sub2_4.method4844();
												Static623.method7324();
												Static13.method133(local1072, local239, local73, local820);
												Static39.aClass126_16 = null;
												return true;
											} else if (Static39.aClass126_16 == Static424.aClass126_142) {
												local820 = Static67.aClass3_Sub17_Sub2_4.method4850();
												local73 = Static67.aClass3_Sub17_Sub2_4.method4851();
												local1072 = Static67.aClass3_Sub17_Sub2_4.method4850();
												Static21.anIntArray15[local1072] = local73;
												Static185.anIntArray238[local1072] = local820;
												Static126.anIntArray159[local1072] = 1;
												local239 = Static196.anIntArray246[local1072] - 1;
												for (local929 = 0; local929 < local239; local929++) {
													if (local73 >= Class3_Sub6.anIntArray637[local929]) {
														Static126.anIntArray159[local1072] = local929 + 2;
													}
												}
												Static427.anIntArray453[Static254.anInt4807++ & 0x1F] = local1072;
												Static39.aClass126_16 = null;
												return true;
											} else if (Static195.aClass126_65 == Static39.aClass126_16) {
												local820 = Static67.aClass3_Sub17_Sub2_4.method4868();
												Static623.method7324();
												Static370.method5475(local820, 0, Static251.anInt4687, 5);
												Static39.aClass126_16 = null;
												return true;
											} else if (Static563.aClass126_186 == Static39.aClass126_16) {
												Static654.method8554(Static312.aClass201_14);
												Static39.aClass126_16 = null;
												return true;
											} else if (Static39.aClass126_16 == Static241.aClass126_85) {
												Static592.aClass47_2.method1438();
												Static39.aClass126_16 = null;
												Static166.anInt3025 += 32;
												return true;
											} else if (Static25.aClass126_8 == Static39.aClass126_16) {
												local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
												local73 = Static67.aClass3_Sub17_Sub2_4.method4872();
												local1072 = Static67.aClass3_Sub17_Sub2_4.method4884();
												local239 = Static67.aClass3_Sub17_Sub2_4.method4879();
												Static623.method7324();
												Static206.method3269(local820, local239, local73, local1072);
												Static39.aClass126_16 = null;
												return true;
											} else if (Static291.aClass126_97 == Static39.aClass126_16) {
												local820 = Static67.aClass3_Sub17_Sub2_4.method4888();
												if (Static67.aClass3_Sub17_Sub2_4.method4888() == 0) {
													Static55.aClass98Array1[local820] = new Class98();
												} else {
													Static67.aClass3_Sub17_Sub2_4.lb--;
													Static55.aClass98Array1[local820] = new Class98(Static67.aClass3_Sub17_Sub2_4);
												}
												Static39.aClass126_16 = null;
												Static5.anInt41 = Static373.anInt6615;
												return true;
											} else if (Static39.aClass126_16 == Static184.aClass126_59) {
												Static654.method8554(Static249.aClass201_11);
												Static39.aClass126_16 = null;
												return true;
											} else if (Static39.aClass126_16 == Static606.aClass126_191) {
												Static654.method8554(Static198.aClass201_9);
												Static39.aClass126_16 = null;
												return true;
											} else {
												@Pc(3387) boolean local3387;
												if (Static39.aClass126_16 == Static117.aClass126_41) {
													local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
													local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
													local229 = local227;
													if (local223) {
														local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
													}
													local2268 = Static67.aClass3_Sub17_Sub2_4.method4865();
													local1103 = (long) Static67.aClass3_Sub17_Sub2_4.method4858();
													local655 = (long) Static67.aClass3_Sub17_Sub2_4.method4862();
													local509 = Static67.aClass3_Sub17_Sub2_4.method4888();
													@Pc(3385) long local3385 = local655 + (local1103 << 32);
													local3387 = false;
													local2992 = 0;
													while (true) {
														if (local2992 >= 100) {
															if (local509 <= 1) {
																if (Static120.aBoolean200 && !Static576.aBoolean681 || Static294.aBoolean272) {
																	local3387 = true;
																} else if (Static410.method5823(local229)) {
																	local3387 = true;
																}
															}
															break;
														}
														if (local3385 == Static510.aLongArray16[local2992]) {
															local3387 = true;
															break;
														}
														local2992++;
													}
													if (!local3387 && Static412.anInt6978 == 0) {
														Static510.aLongArray16[Static330.anInt6097] = local3385;
														Static330.anInt6097 = (Static330.anInt6097 + 1) % 100;
														@Pc(3455) String local3455 = Static648.method8491(Static151.method2610(Static67.aClass3_Sub17_Sub2_4));
														if (local509 == 2 || local509 == 3) {
															Static30.method942(0, local3455, Static477.method6824(local2268), -1, "<img=1>" + local227, 9, local227, "<img=1>" + local229);
														} else if (local509 == 1) {
															Static30.method942(0, local3455, Static477.method6824(local2268), -1, "<img=0>" + local227, 9, local227, "<img=0>" + local229);
														} else {
															Static30.method942(0, local3455, Static477.method6824(local2268), -1, local227, 9, local227, local229);
														}
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static545.aClass126_180) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4868();
													Static623.method7324();
													@Pc(3557) Class3_Sub28 local3557 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local820);
													local1235 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local73);
													if (local1235 != null) {
														Static414.method5937(local3557 == null || local1235.anInt5252 != local3557.anInt5252, local1235, false);
													}
													if (local3557 != null) {
														local3557.method8770();
														Static222.aClass62_21.method1686((long) local73, local3557);
													}
													@Pc(3599) Class208 local3599 = Static676.method8728(local820);
													if (local3599 != null) {
														Static374.method5525(local3599);
													}
													local3599 = Static676.method8728(local73);
													if (local3599 != null) {
														Static374.method5525(local3599);
														Static650.method8523(local3599, true);
													}
													if (Static277.anInt5201 != -1) {
														Static325.method5063(1, Static277.anInt5201);
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static628.aClass126_194) {
													Static239.method3852(Static67.aClass3_Sub17_Sub2_4, Static548.anInt8905, Static499.aClass231_4);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static74.aClass126_26 == Static39.aClass126_16) {
													local353 = Static67.aClass3_Sub17_Sub2_4.method4847();
													local227 = Static648.method8491(Static151.method2610(Static67.aClass3_Sub17_Sub2_4));
													Static310.method4784(6, local227, local353, local353, 0, local353);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static627.aClass126_193) {
													Static646.anInt9924 = Static67.aClass3_Sub17_Sub2_4.method4866() << 3;
													Static212.anInt3897 = Static67.aClass3_Sub17_Sub2_4.method4880() << 3;
													Static467.anInt7971 = Static67.aClass3_Sub17_Sub2_4.method4850();
													for (@Pc(3690) Class3_Sub24 local3690 = (Class3_Sub24) Static421.aClass62_32.method1680(); local3690 != null; local3690 = (Class3_Sub24) Static421.aClass62_32.method1681()) {
														local73 = (int) (local3690.aLong309 >> 28 & 0x3L);
														local1072 = (int) (local3690.aLong309 & 0x3FFFL);
														local239 = local1072 - Static417.anInt7047;
														local929 = (int) (local3690.aLong309 >> 14 & 0x3FFFL);
														local935 = local929 - Static347.anInt7851;
														if (Static467.anInt7971 == local73 && Static646.anInt9924 <= local239 && Static646.anInt9924 + 8 > local239 && local935 >= Static212.anInt3897 && local935 < Static212.anInt3897 + 8) {
															local3690.method8770();
															if (local239 >= 0 && local935 >= 0 && Static251.anInt4680 > local239 && local935 < Static406.anInt6924) {
																Static263.method4141(local239, local935, Static467.anInt7971);
															}
														}
													}
													@Pc(3792) Class3_Sub49 local3792;
													for (local3792 = (Class3_Sub49) Static462.aClass193_48.method4457(); local3792 != null; local3792 = (Class3_Sub49) Static462.aClass193_48.method4459()) {
														if (Static646.anInt9924 <= local3792.anInt8929 && local3792.anInt8929 < Static646.anInt9924 + 8 && local3792.anInt8924 >= Static212.anInt3897 && local3792.anInt8924 < Static212.anInt3897 + 8 && local3792.anInt8927 == Static467.anInt7971) {
															local3792.aBoolean665 = true;
														}
													}
													for (local3792 = (Class3_Sub49) Static647.aClass193_70.method4457(); local3792 != null; local3792 = (Class3_Sub49) Static647.aClass193_70.method4459()) {
														if (Static646.anInt9924 <= local3792.anInt8929 && local3792.anInt8929 < Static646.anInt9924 + 8 && local3792.anInt8924 >= Static212.anInt3897 && Static212.anInt3897 + 8 > local3792.anInt8924 && Static467.anInt7971 == local3792.anInt8927) {
															local3792.aBoolean665 = true;
														}
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static398.aClass126_139 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local1484 = Static67.aClass3_Sub17_Sub2_4.method4880();
													Static592.aClass47_2.method1435(local820, local1484);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static505.aClass126_166) {
													Static92.method1873();
													Static39.aClass126_16 = null;
													return false;
												} else if (Static39.aClass126_16 == Static427.aClass126_144) {
													Static280.anInt5246 = 1;
													Static39.aClass126_16 = null;
													Static221.anInt4055 = Static373.anInt6615;
													return true;
												} else if (Static295.aClass126_99 == Static39.aClass126_16) {
													Static426.anInt7214 = Static373.anInt6615;
													local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
													if (Static548.anInt8905 != 1) {
														if (local223) {
															Static45.aClass308_1 = new Class308(Static67.aClass3_Sub17_Sub2_4);
														} else {
															Static338.aClass308_2 = new Class308(Static67.aClass3_Sub17_Sub2_4);
														}
														Static39.aClass126_16 = null;
														return true;
													}
													Static39.aClass126_16 = null;
													if (local223) {
														Static45.aClass308_1 = null;
													} else {
														Static338.aClass308_2 = null;
													}
													return true;
												} else if (Static39.aClass126_16 == Static559.aClass126_183) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4844();
													local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local929 = Static67.aClass3_Sub17_Sub2_4.method4872() << 2;
													Static623.method7324();
													Static369.method1820(local239, local820, local73, local929, local1072, true);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static106.aClass126_37) {
													local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
													@Pc(4043) byte[] local4043 = new byte[Static548.anInt8905 - 1];
													Static67.aClass3_Sub17_Sub2_4.method4832(local4043, 0, Static548.anInt8905 - 1);
													Static310.method4786(local223, local4043);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static635.aClass126_196) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4879();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4879();
													Static623.method7324();
													Static10.method98(local820, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static259.aClass126_88) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4867();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4884();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4879();
													local239 = Static67.aClass3_Sub17_Sub2_4.method4858();
													Static623.method7324();
													Static370.method5475(local820, local73, local239 << 16 | local1072, 7);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static409.aClass126_136) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													if (local820 == 65535) {
														local820 = -1;
													}
													local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local929 = Static67.aClass3_Sub17_Sub2_4.method4858();
													Static117.method2135(local73, local820, local1072, local239, local929);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static639.aClass126_199 == Static39.aClass126_16) {
													Static654.method8554(Static600.aClass201_22);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static36.aClass126_203 == Static39.aClass126_16) {
													Static426.anInt7214 = Static373.anInt6615;
													local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
													@Pc(4186) Class290 local4186 = new Class290(Static67.aClass3_Sub17_Sub2_4);
													@Pc(4190) Class308 local4190;
													if (local223) {
														local4190 = Static45.aClass308_1;
													} else {
														local4190 = Static338.aClass308_2;
													}
													local4186.method6833(local4190);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static170.aClass126_55) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													if (local820 == 65535) {
														local820 = -1;
													}
													local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
													Static645.method8448(local239, local73, local820, local1072, 256, true);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static544.aClass126_179) {
													local353 = Static67.aClass3_Sub17_Sub2_4.method4847();
													@Pc(4253) Object[] local4253 = new Object[local353.length() + 1];
													for (local1072 = local353.length() - 1; local1072 >= 0; local1072--) {
														if (local353.charAt(local1072) == 's') {
															local4253[local1072 + 1] = Static67.aClass3_Sub17_Sub2_4.method4847();
														} else {
															local4253[local1072 + 1] = Integer.valueOf(Static67.aClass3_Sub17_Sub2_4.method4868());
														}
													}
													local4253[0] = Integer.valueOf(Static67.aClass3_Sub17_Sub2_4.method4868());
													Static623.method7324();
													@Pc(4305) Class3_Sub13 local4305 = new Class3_Sub13();
													local4305.anObjectArray1 = local4253;
													Static543.method7498(local4305);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static120.aClass126_42 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local73 = local820 >> 5;
													local1072 = local820 & 0x1F;
													if (local1072 == 0) {
														Static110.aClass70Array1[local73] = null;
														Static39.aClass126_16 = null;
														return true;
													}
													@Pc(4346) Class70 local4346 = new Class70();
													local4346.anInt2023 = local1072;
													local4346.anInt2024 = Static67.aClass3_Sub17_Sub2_4.method4888();
													if (local4346.anInt2024 >= 0 && Static491.aClass102Array23.length > local4346.anInt2024) {
														if (local4346.anInt2023 == 1 || local4346.anInt2023 == 10) {
															local4346.anInt2021 = Static67.aClass3_Sub17_Sub2_4.method4858();
															Static67.aClass3_Sub17_Sub2_4.lb += 6;
														} else if (local4346.anInt2023 >= 2 && local4346.anInt2023 <= 6) {
															if (local4346.anInt2023 == 2) {
																local4346.anInt2018 = 256;
																local4346.anInt2017 = 256;
															}
															if (local4346.anInt2023 == 3) {
																local4346.anInt2017 = 256;
																local4346.anInt2018 = 0;
															}
															if (local4346.anInt2023 == 4) {
																local4346.anInt2018 = 512;
																local4346.anInt2017 = 256;
															}
															if (local4346.anInt2023 == 5) {
																local4346.anInt2017 = 0;
																local4346.anInt2018 = 256;
															}
															if (local4346.anInt2023 == 6) {
																local4346.anInt2018 = 256;
																local4346.anInt2017 = 512;
															}
															local4346.anInt2023 = 2;
															local4346.anInt2022 = Static67.aClass3_Sub17_Sub2_4.method4888();
															local4346.anInt2018 += Static67.aClass3_Sub17_Sub2_4.method4858() - Static417.anInt7047 << 9;
															local4346.anInt2017 += Static67.aClass3_Sub17_Sub2_4.method4858() - Static347.anInt7851 << 9;
															local4346.anInt2014 = Static67.aClass3_Sub17_Sub2_4.method4888() << 2;
															local4346.anInt2019 = Static67.aClass3_Sub17_Sub2_4.method4858();
														}
														local4346.anInt2015 = Static67.aClass3_Sub17_Sub2_4.method4858();
														if (local4346.anInt2015 == 65535) {
															local4346.anInt2015 = -1;
														}
														Static110.aClass70Array1[local73] = local4346;
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static2.aClass126_1 == Static39.aClass126_16) {
													Static133.anInt2489 = Static67.aClass3_Sub17_Sub2_4.method4864();
													Static120.aBoolean200 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static356.aClass126_120) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
													Static623.method7324();
													if (Static562.aClass208ArrayArray3[local820] != null) {
														for (local239 = local73; local239 < local1072; local239++) {
															local929 = Static67.aClass3_Sub17_Sub2_4.method4862();
															if (local239 < Static562.aClass208ArrayArray3[local820].length && Static562.aClass208ArrayArray3[local820][local239] != null) {
																Static562.aClass208ArrayArray3[local820][local239].anInt5613 = local929;
															}
														}
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static151.aClass126_49) {
													if (Static153.aFrame3 != null) {
														Static211.method8142(-1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), -1, false);
													}
													@Pc(4618) byte[] local4618 = new byte[Static548.anInt8905];
													Static67.aClass3_Sub17_Sub2_4.method4904(local4618, Static548.anInt8905);
													local227 = Static351.method5274(local4618, Static548.anInt8905, 0);
													Static637.method8373(Static499.aClass231_4, true, Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 1, local227);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static237.aClass126_82 == Static39.aClass126_16) {
													Static602.aByte134 = Static67.aClass3_Sub17_Sub2_4.method4880();
													if (Static602.aByte134 == 0 || Static602.aByte134 == 1) {
														Static364.aBoolean496 = true;
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static202.aClass126_67) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4858();
													if (local73 == 65535) {
														local73 = -1;
													}
													Static623.method7324();
													Static370.method5475(local820, -1, local73, 2);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static563.aClass126_187) {
													Static602.aString119 = Static548.anInt8905 > 2 ? Static67.aClass3_Sub17_Sub2_4.method4847() : Static569.aClass335_27.method7694(Static319.anInt5939);
													Static276.anInt5163 = Static548.anInt8905 <= 0 ? -1 : Static67.aClass3_Sub17_Sub2_4.method4858();
													if (Static276.anInt5163 == 65535) {
														Static276.anInt5163 = -1;
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static64.aClass126_24 == Static39.aClass126_16) {
													Static617.method8097();
													Static39.aClass126_16 = null;
													return true;
												} else if (Static378.aClass126_131 == Static39.aClass126_16) {
													Static39.aClass126_16 = null;
													return false;
												} else if (Static54.aClass126_18 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4868();
													Static623.method7324();
													Static679.method8755(local820, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static374.aClass126_129 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4844();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4879();
													if (local73 == 65535) {
														local73 = -1;
													}
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4844();
													Static420.method5994(local1072, local73, local820);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static163.aClass126_53 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4850();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4853();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
													if (local1072 == 65535) {
														local1072 = -1;
													}
													Static310.method4787(local73, local820, local1072);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static312.aClass126_104) {
													Static463.method6658();
													Static39.aClass126_16 = null;
													return true;
												} else if (Static372.aClass126_128 == Static39.aClass126_16) {
													Static364.anInt6467 = Static67.aClass3_Sub17_Sub2_4.method4888();
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static93.aClass126_31) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4874();
													Static623.method7324();
													if (local73 == 2) {
														Static74.method1619();
													}
													Static277.anInt5201 = local820;
													Static117.method2134(local820);
													Static345.method5204(false);
													Static543.method7510(Static277.anInt5201);
													for (local1072 = 0; local1072 < 100; local1072++) {
														Static119.aBooleanArray10[local1072] = true;
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static269.aClass126_93 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4874();
													Static623.method7324();
													Static47.method1250(local820, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static663.aClass126_207 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4888();
													@Pc(4950) boolean local4950 = (local820 & 0x1) == 1;
													local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
													local1750 = Static67.aClass3_Sub17_Sub2_4.method4847();
													if (local1750.equals("")) {
														local1750 = local229;
													}
													local1752 = Static67.aClass3_Sub17_Sub2_4.method4847();
													local276 = Static67.aClass3_Sub17_Sub2_4.method4847();
													if (local276.equals("")) {
														local276 = local1752;
													}
													if (local4950) {
														for (local404 = 0; local404 < Static173.anInt3293; local404++) {
															if (Static614.aStringArray68[local404].equals(local276)) {
																Static564.aStringArray72[local404] = local229;
																Static614.aStringArray68[local404] = local1750;
																Static196.aStringArray26[local404] = local1752;
																Static93.aStringArray17[local404] = local276;
																break;
															}
														}
													} else {
														Static564.aStringArray72[Static173.anInt3293] = local229;
														Static614.aStringArray68[Static173.anInt3293] = local1750;
														Static196.aStringArray26[Static173.anInt3293] = local1752;
														Static93.aStringArray17[Static173.anInt3293] = local276;
														Static173.aBooleanArray14[Static173.anInt3293] = (local820 & 0x2) == 2;
														Static173.anInt3293++;
													}
													Static221.anInt4055 = Static373.anInt6615;
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static537.aClass126_178) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
													local362 = (local73 & 0x1) == 1;
													while (Static67.aClass3_Sub17_Sub2_4.lb < Static548.anInt8905) {
														local239 = Static67.aClass3_Sub17_Sub2_4.method4841();
														local929 = Static67.aClass3_Sub17_Sub2_4.method4858();
														local935 = 0;
														if (local929 != 0) {
															local935 = Static67.aClass3_Sub17_Sub2_4.method4888();
															if (local935 == 255) {
																local935 = Static67.aClass3_Sub17_Sub2_4.method4868();
															}
														}
														Static558.method7630(local362, local935, local820, local239, local929 - 1);
													}
													Static32.anIntArray32[Static235.anInt4463++ & 0x1F] = local820;
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static619.aClass126_192) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4844();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4844();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4850();
													local239 = Static67.aClass3_Sub17_Sub2_4.method4872();
													local929 = Static67.aClass3_Sub17_Sub2_4.method4844();
													Static623.method7324();
													Static115.aBooleanArray9[local929] = true;
													Static454.anIntArray473[local929] = local1072;
													Static421.anIntArray447[local929] = local73;
													Static163.anIntArray195[local929] = local820;
													Static13.anIntArray7[local929] = local239;
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static105.aClass126_36) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
													Static623.method7324();
													Static39.aClass126_16 = null;
													if (local820 == -1) {
														Static65.anInt1581 = -1;
														Static18.anInt682 = -1;
													} else {
														local73 = local820 >> 14 & 0x3FFF;
														local73 -= Static417.anInt7047;
														local1072 = local820 & 0x3FFF;
														local1072 -= Static347.anInt7851;
														if (local73 < 0) {
															local73 = 0;
														} else if (Static251.anInt4680 <= local73) {
															local73 = Static251.anInt4680;
														}
														if (local1072 < 0) {
															local1072 = 0;
														} else if (local1072 >= Static406.anInt6924) {
															local1072 = Static406.anInt6924;
														}
														Static65.anInt1581 = (local73 << 9) + 256;
														Static18.anInt682 = (local1072 << 9) + 256;
													}
													return true;
												} else if (Static39.aClass126_16 == Static376.aClass126_130) {
													Static467.anInt7971 = Static67.aClass3_Sub17_Sub2_4.method4850();
													Static212.anInt3897 = Static67.aClass3_Sub17_Sub2_4.method4880() << 3;
													Static646.anInt9924 = Static67.aClass3_Sub17_Sub2_4.method4866() << 3;
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static562.aClass126_185) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4844();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4888();
													if (local73 == 255) {
														local73 = -1;
														local820 = -1;
													}
													Static660.method8640(local820, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static126.aClass126_43) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
													Static623.method7324();
													Static314.method4934(local820);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static107.aClass126_38) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4850();
													local1484 = Static67.aClass3_Sub17_Sub2_4.method4866();
													Static623.method7324();
													Static325.method5065(local1484, local820);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static341.aClass126_112) {
													Static229.anInt9434 = Static373.anInt6615;
													local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
													if (Static548.anInt8905 != 1) {
														if (local223) {
															Static430.aClass3_Sub20_3 = new Class3_Sub20(Static67.aClass3_Sub17_Sub2_4);
														} else {
															Static656.aClass3_Sub20_2 = new Class3_Sub20(Static67.aClass3_Sub17_Sub2_4);
														}
														Static39.aClass126_16 = null;
														return true;
													}
													Static39.aClass126_16 = null;
													if (local223) {
														Static430.aClass3_Sub20_3 = null;
													} else {
														Static656.aClass3_Sub20_2 = null;
													}
													return true;
												} else if (Static39.aClass126_16 == Static361.aClass126_122) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4868();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4851();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
													Static623.method7324();
													Static370.method5475(local73, local820, local1072, 5);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static136.aClass126_45 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4868();
													if (Static264.anInt4945 != local820) {
														Static264.anInt4945 = local820;
														Static543.method7514(Static2.aClass239_1, -1, -1);
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static209.aClass126_205 == Static39.aClass126_16) {
													Static431.method6362(false);
													Static39.aClass126_16 = null;
													return false;
												} else if (Static214.aClass126_74 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4874();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4850();
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4858() << 2;
													local239 = Static67.aClass3_Sub17_Sub2_4.method4874();
													local929 = Static67.aClass3_Sub17_Sub2_4.method4844();
													Static623.method7324();
													Static162.method2743(local239, local820, local929, local73, local1072);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static45.aClass126_17 == Static39.aClass126_16) {
													local353 = Static67.aClass3_Sub17_Sub2_4.method4847();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4851();
													Static623.method7324();
													Static133.method2279(local353, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static534.aClass126_177) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4884();
													if (local820 == 65535) {
														local820 = -1;
													}
													local73 = Static67.aClass3_Sub17_Sub2_4.method4879();
													if (local73 == 65535) {
														local73 = -1;
													}
													local1072 = Static67.aClass3_Sub17_Sub2_4.method4851();
													local239 = Static67.aClass3_Sub17_Sub2_4.method4851();
													Static623.method7324();
													for (local929 = local820; local929 <= local73; local929++) {
														local1103 = (long) local929 + ((long) local239 << 32);
														local1109 = (Class3_Sub1) Static382.aClass62_30.method1682(local1103);
														if (local1109 != null) {
															local1118 = new Class3_Sub1(local1072, local1109.anInt22);
															local1109.method8770();
														} else if (local929 == -1) {
															local1118 = new Class3_Sub1(local1072, Static676.method8728(local239).aClass3_Sub1_1.anInt22);
														} else {
															local1118 = new Class3_Sub1(local1072, -1);
														}
														Static382.aClass62_30.method1686(local1103, local1118);
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static635.aClass126_195 == Static39.aClass126_16) {
													local353 = Static67.aClass3_Sub17_Sub2_4.method4847();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4858();
													local229 = Static264.aClass263_2.method6363(local73).method1164(Static67.aClass3_Sub17_Sub2_4);
													Static30.method942(0, local229, (String) null, local73, local353, 19, local353, local353);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static395.aClass126_138 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4877();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4851();
													Static623.method7324();
													Static153.method2619(local820, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static445.aClass126_149) {
													Static654.method8554(Static350.aClass201_16);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static308.aClass126_101) {
													@Pc(5755) boolean local5755;
													while (Static67.aClass3_Sub17_Sub2_4.lb < Static548.anInt8905) {
														local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
														local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
														local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
														local239 = Static67.aClass3_Sub17_Sub2_4.method4858();
														local929 = Static67.aClass3_Sub17_Sub2_4.method4888();
														local276 = "";
														local2078 = false;
														if (local239 > 0) {
															local276 = Static67.aClass3_Sub17_Sub2_4.method4847();
															local2078 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
														}
														for (local1852 = 0; local1852 < Static121.anInt2381; local1852++) {
															if (local223) {
																if (local229.equals(Static260.aStringArray36[local1852])) {
																	Static260.aStringArray36[local1852] = local227;
																	local227 = null;
																	Static217.aStringArray32[local1852] = local229;
																	break;
																}
															} else if (local227.equals(Static260.aStringArray36[local1852])) {
																if (Static544.anIntArray579[local1852] != local239) {
																	local5755 = true;
																	for (@Pc(5760) Class23_Sub1_Sub1 local5760 = (Class23_Sub1_Sub1) Static190.aClass105_6.method2444(); local5760 != null; local5760 = (Class23_Sub1_Sub1) Static190.aClass105_6.method2448()) {
																		if (local5760.aString7.equals(local227)) {
																			if (local239 != 0 && local5760.aShort5 == 0) {
																				local5755 = false;
																				local5760.method8588();
																			} else if (local239 == 0 && local5760.aShort5 != 0) {
																				local5755 = false;
																				local5760.method8588();
																			}
																		}
																	}
																	if (local5755) {
																		Static190.aClass105_6.method2447(new Class23_Sub1_Sub1(local227, local239));
																	}
																	Static544.anIntArray579[local1852] = local239;
																}
																Static217.aStringArray32[local1852] = local229;
																Static641.aStringArray73[local1852] = local276;
																Static28.anIntArray21[local1852] = local929;
																Static64.aBooleanArray7[local1852] = local2078;
																local227 = null;
																break;
															}
														}
														if (local227 != null && Static121.anInt2381 < 200) {
															Static260.aStringArray36[Static121.anInt2381] = local227;
															Static217.aStringArray32[Static121.anInt2381] = local229;
															Static544.anIntArray579[Static121.anInt2381] = local239;
															Static641.aStringArray73[Static121.anInt2381] = local276;
															Static28.anIntArray21[Static121.anInt2381] = local929;
															Static64.aBooleanArray7[Static121.anInt2381] = local2078;
															Static121.anInt2381++;
														}
													}
													Static280.anInt5246 = 2;
													Static221.anInt4055 = Static373.anInt6615;
													local73 = Static121.anInt2381;
													while (local73 > 0) {
														local223 = true;
														local73--;
														for (local1072 = 0; local1072 < local73; local1072++) {
															if (Static544.anIntArray579[local1072] != Static605.aClass161_7.anInt4423 && Static544.anIntArray579[local1072 + 1] == Static605.aClass161_7.anInt4423 || Static544.anIntArray579[local1072] == 0 && Static544.anIntArray579[local1072 + 1] != 0) {
																local239 = Static544.anIntArray579[local1072];
																Static544.anIntArray579[local1072] = Static544.anIntArray579[local1072 + 1];
																Static544.anIntArray579[local1072 + 1] = local239;
																local1752 = Static641.aStringArray73[local1072];
																Static641.aStringArray73[local1072] = Static641.aStringArray73[local1072 + 1];
																Static641.aStringArray73[local1072 + 1] = local1752;
																local276 = Static260.aStringArray36[local1072];
																Static260.aStringArray36[local1072] = Static260.aStringArray36[local1072 + 1];
																Static260.aStringArray36[local1072 + 1] = local276;
																local470 = Static217.aStringArray32[local1072];
																Static217.aStringArray32[local1072] = Static217.aStringArray32[local1072 + 1];
																Static217.aStringArray32[local1072 + 1] = local470;
																local1852 = Static28.anIntArray21[local1072];
																Static28.anIntArray21[local1072] = Static28.anIntArray21[local1072 + 1];
																Static28.anIntArray21[local1072 + 1] = local1852;
																local5755 = Static64.aBooleanArray7[local1072];
																Static64.aBooleanArray7[local1072] = Static64.aBooleanArray7[local1072 + 1];
																Static64.aBooleanArray7[local1072 + 1] = local5755;
																local223 = false;
															}
														}
														if (local223) {
															break;
														}
													}
													Static39.aClass126_16 = null;
													return true;
												} else if (Static299.aClass126_100 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4884();
													local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
													Static623.method7324();
													Static659.method8587(local227, local820);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static328.aClass126_111 == Static39.aClass126_16) {
													Static11.aClass270_1 = Static325.method5061(Static67.aClass3_Sub17_Sub2_4.method4888());
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static232.aClass126_81) {
													Static339.anInt6146 = Static67.aClass3_Sub17_Sub2_4.method4869();
													Static431.anInt7596 = Static373.anInt6615;
													Static39.aClass126_16 = null;
													return true;
												} else if (Static111.aClass126_214 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4872();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4867();
													Static623.method7324();
													Static402.method5744(local820, local73);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static481.aClass126_162 == Static39.aClass126_16) {
													Static654.method8554(Static320.aClass201_15);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static533.aClass126_176 == Static39.aClass126_16) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4867();
													local73 = Static67.aClass3_Sub17_Sub2_4.method4872();
													Static623.method7324();
													Static42.method1220(local73, local820);
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static378.aClass126_132) {
													Static70.method1571(Static67.aClass3_Sub17_Sub2_4.method4847());
													Static39.aClass126_16 = null;
													return true;
												} else if (Static39.aClass126_16 == Static80.aClass126_211) {
													local820 = Static67.aClass3_Sub17_Sub2_4.method4851();
													Static623.method7324();
													@Pc(6200) Class3_Sub28 local6200 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local820);
													if (local6200 != null) {
														Static414.method5937(true, local6200, false);
													}
													if (Static339.aClass208_8 != null) {
														Static374.method5525(Static339.aClass208_8);
														Static339.aClass208_8 = null;
													}
													Static39.aClass126_16 = null;
													return true;
												} else {
													@Pc(6729) int local6729;
													@Pc(6465) int local6465;
													if (Static39.aClass126_16 == Static667.aClass126_209) {
														local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
														local73 = Static67.aClass3_Sub17_Sub2_4.method4884();
														local1072 = Static67.aClass3_Sub17_Sub2_4.method4874();
														local239 = Static67.aClass3_Sub17_Sub2_4.method4867();
														local929 = Static67.aClass3_Sub17_Sub2_4.method4844();
														local935 = Static67.aClass3_Sub17_Sub2_4.method4879();
														local404 = local929 & 0x7;
														local1852 = local929 >> 3 & 0xF;
														if (local1852 == 15) {
															local1852 = -1;
														}
														if (local239 >> 30 == 0) {
															@Pc(6381) Class48 local6381;
															@Pc(6328) Class34 local6328;
															@Pc(6348) Class48 local6348;
															if (local239 >> 29 != 0) {
																local499 = local239 & 0xFFFF;
																@Pc(6287) Class3_Sub11 local6287 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local499);
																if (local6287 != null) {
																	@Pc(6292) Class23_Sub2_Sub1_Sub2_Sub2 local6292 = local6287.aClass23_Sub2_Sub1_Sub2_Sub2_1;
																	if (local73 == 65535) {
																		local73 = -1;
																	}
																	@Pc(6304) Class375 local6304 = local6292.aClass375Array3[local1072];
																	local3387 = true;
																	local2992 = local6304.anInt9871;
																	if (local73 != -1 && local2992 != -1) {
																		if (local73 == local2992) {
																			local6328 = Static196.aClass315_2.method7420(local73);
																			if (local6328.aBoolean105 && local6328.anInt1217 != -1) {
																				local6381 = Static483.aClass373_2.method8323(local6328.anInt1217);
																				@Pc(6384) int local6384 = local6381.anInt1546;
																				if (local6384 == 0 || local6384 == 2) {
																					local3387 = false;
																				} else if (local6384 == 1) {
																					local3387 = true;
																				}
																			}
																		} else {
																			local6328 = Static196.aClass315_2.method7420(local73);
																			@Pc(6333) Class34 local6333 = Static196.aClass315_2.method7420(local2992);
																			if (local6328.anInt1217 != -1 && local6333.anInt1217 != -1) {
																				local6348 = Static483.aClass373_2.method8323(local6328.anInt1217);
																				@Pc(6354) Class48 local6354 = Static483.aClass373_2.method8323(local6333.anInt1217);
																				if (local6348.anInt1550 < local6354.anInt1550) {
																					local3387 = false;
																				}
																			}
																		}
																	}
																	if (local3387) {
																		local6304.anInt9874 = 0;
																		local6304.anInt9873 = local404;
																		local6304.anInt9872 = 1;
																		local6304.anInt9871 = local73;
																		local6304.anInt9867 = 0;
																		local6304.anInt9870 = Static621.anInt9665 + local820;
																		local6304.anInt9875 = local935;
																		local6304.anInt9865 = local1852;
																		if (local6304.anInt9870 > Static621.anInt9665) {
																			local6304.anInt9874 = -1;
																		}
																		if (local6304.anInt9871 == 65535) {
																			local6304.anInt9871 = -1;
																		}
																		if (local6304.anInt9871 != -1 && local6304.anInt9870 == Static621.anInt9665) {
																			local6465 = Static196.aClass315_2.method7420(local6304.anInt9871).anInt1217;
																			if (local6465 != -1) {
																				local6381 = Static483.aClass373_2.method8323(local6465);
																				if (local6381 != null && local6381.anIntArray72 != null && !local6292.aBoolean747) {
																					Static4.method49(local6292, local6381, 0);
																				}
																			}
																		}
																	}
																}
															} else if (local239 >> 28 != 0) {
																local499 = local239 & 0xFFFF;
																@Pc(6507) Class23_Sub2_Sub1_Sub2_Sub1 local6507;
																if (local499 == Static251.anInt4687) {
																	local6507 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2;
																} else {
																	local6507 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local499];
																}
																if (local6507 != null) {
																	@Pc(6518) Class375 local6518 = local6507.aClass375Array3[local1072];
																	if (local73 == 65535) {
																		local73 = -1;
																	}
																	local2289 = true;
																	local739 = local6518.anInt9871;
																	@Pc(6556) Class48 local6556;
																	if (local73 != -1 && local739 != -1) {
																		@Pc(6543) Class34 local6543;
																		if (local739 == local73) {
																			local6543 = Static196.aClass315_2.method7420(local73);
																			if (local6543.aBoolean105 && local6543.anInt1217 != -1) {
																				local6556 = Static483.aClass373_2.method8323(local6543.anInt1217);
																				@Pc(6559) int local6559 = local6556.anInt1546;
																				if (local6559 == 0 || local6559 == 2) {
																					local2289 = false;
																				} else if (local6559 == 1) {
																					local2289 = true;
																				}
																			}
																		} else {
																			local6543 = Static196.aClass315_2.method7420(local73);
																			local6328 = Static196.aClass315_2.method7420(local739);
																			if (local6543.anInt1217 != -1 && local6328.anInt1217 != -1) {
																				local6381 = Static483.aClass373_2.method8323(local6543.anInt1217);
																				local6348 = Static483.aClass373_2.method8323(local6328.anInt1217);
																				if (local6348.anInt1550 > local6381.anInt1550) {
																					local2289 = false;
																				}
																			}
																		}
																	}
																	if (local2289) {
																		local6518.anInt9870 = Static621.anInt9665 + local820;
																		local6518.anInt9873 = local404;
																		local6518.anInt9871 = local73;
																		local6518.anInt9867 = 0;
																		local6518.anInt9875 = local935;
																		local6518.anInt9872 = 1;
																		local6518.anInt9874 = 0;
																		local6518.anInt9865 = local1852;
																		if (local6518.anInt9871 == 65535) {
																			local6518.anInt9871 = -1;
																		}
																		if (Static621.anInt9665 < local6518.anInt9870) {
																			local6518.anInt9874 = -1;
																		}
																		if (local6518.anInt9871 != -1 && Static621.anInt9665 == local6518.anInt9870) {
																			local2992 = Static196.aClass315_2.method7420(local6518.anInt9871).anInt1217;
																			if (local2992 != -1) {
																				local6556 = Static483.aClass373_2.method8323(local2992);
																				if (local6556 != null && local6556.anIntArray72 != null && !local6507.aBoolean747) {
																					Static4.method49(local6507, local6556, 0);
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local499 = local239 >> 28 & 0x3;
															local509 = (local239 >> 14 & 0x3FFF) - Static417.anInt7047;
															local6729 = (local239 & 0x3FFF) - Static347.anInt7851;
															if (local509 >= 0 && local6729 >= 0 && local509 < Static251.anInt4680 && Static406.anInt6924 > local6729) {
																local673 = local509 * 512 + 256;
																local739 = local6729 * 512 + 256;
																local2992 = local499;
																if (local499 < 3 && Static190.method3051(local6729, local509)) {
																	local2992 = local499 + 1;
																}
																@Pc(6796) Class23_Sub2_Sub1_Sub5 local6796 = new Class23_Sub2_Sub1_Sub5(local73, local820, Static621.anInt9665, local499, local2992, local673, Static194.method5133(local673, local739, local499) - local935, local739, local509, local509, local6729, local6729, local404);
																Static514.aClass193_56.method4462(new Class3_Sub6_Sub17(local6796));
															}
														}
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static395.aClass126_137) {
														Static654.method8554(Static211.aClass201_23);
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static263.aClass126_91) {
														local820 = Static67.aClass3_Sub17_Sub2_4.method4867();
														local73 = Static67.aClass3_Sub17_Sub2_4.method4858();
														if (local73 == 65535) {
															local73 = -1;
														}
														local1072 = Static67.aClass3_Sub17_Sub2_4.method4867();
														Static623.method7324();
														Static286.method4510(local73, local820, local1072);
														@Pc(6850) Class146 local6850 = Static237.aClass371_2.method8305(local73);
														Static206.method3269(local820, local6850.anInt3704, local6850.anInt3724, local6850.anInt3686);
														Static271.method4329(local6850.anInt3682, local6850.anInt3710, local6850.anInt3702, local820);
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static513.aClass126_170) {
														local820 = Static67.aClass3_Sub17_Sub2_4.method4858();
														@Pc(6886) Class23_Sub2_Sub1_Sub2_Sub1 local6886;
														if (local820 == Static251.anInt4687) {
															local6886 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2;
														} else {
															local6886 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local820];
														}
														if (local6886 == null) {
															Static39.aClass126_16 = null;
															return true;
														}
														local1072 = Static67.aClass3_Sub17_Sub2_4.method4858();
														local239 = Static67.aClass3_Sub17_Sub2_4.method4888();
														local241 = (local1072 & 0x8000) != 0;
														if (local6886.aString34 != null && local6886.aClass293_1 != null) {
															local382 = false;
															if (local239 <= 1) {
																if (!local241 && (Static120.aBoolean200 && !Static576.aBoolean681 || Static294.aBoolean272)) {
																	local382 = true;
																} else if (Static410.method5823(local6886.aString34)) {
																	local382 = true;
																}
															}
															if (!local382 && Static412.anInt6978 == 0) {
																local1852 = -1;
																if (local241) {
																	local1072 &= 0x7FFF;
																	@Pc(6958) Class186 local6958 = Static210.method3306(Static67.aClass3_Sub17_Sub2_4);
																	local1852 = local6958.anInt5049;
																	local470 = local6958.aClass3_Sub6_Sub1_1.method1164(Static67.aClass3_Sub17_Sub2_4);
																} else {
																	local470 = Static648.method8491(Static151.method2610(Static67.aClass3_Sub17_Sub2_4));
																}
																local6886.aString131 = local470.trim();
																local6886.anInt10154 = local1072 >> 8;
																local6886.anInt10160 = local1072 & 0xFF;
																local6886.anInt10132 = 150;
																if (local239 == 1 || local239 == 2) {
																	local499 = local241 ? 17 : 1;
																} else {
																	local499 = local241 ? 17 : 2;
																}
																if (local239 == 2) {
																	Static30.method942(0, local470, (String) null, local1852, "<img=1>" + local6886.method2903(), local499, local6886.aString33, "<img=1>" + local6886.method2902());
																} else if (local239 == 1) {
																	Static30.method942(0, local470, (String) null, local1852, "<img=0>" + local6886.method2903(), local499, local6886.aString33, "<img=0>" + local6886.method2902());
																} else {
																	Static30.method942(0, local470, (String) null, local1852, local6886.method2903(), local499, local6886.aString33, local6886.method2902());
																}
															}
														}
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static456.aClass126_151) {
														Static579.anInt9187 = Static67.aClass3_Sub17_Sub2_4.method4844();
														Static366.anInt6484 = Static67.aClass3_Sub17_Sub2_4.method4850();
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static486.aClass126_164) {
														Static623.method7324();
														Static480.method6835();
														Static39.aClass126_16 = null;
														return true;
													} else if (Static196.aClass126_66 == Static39.aClass126_16) {
														Static244.aBoolean360 = Static67.aClass3_Sub17_Sub2_4.method4874() == 1;
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static323.aClass126_108) {
														local223 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
														local227 = Static67.aClass3_Sub17_Sub2_4.method4847();
														local229 = local227;
														if (local223) {
															local229 = Static67.aClass3_Sub17_Sub2_4.method4847();
														}
														local2268 = Static67.aClass3_Sub17_Sub2_4.method4865();
														local1103 = (long) Static67.aClass3_Sub17_Sub2_4.method4858();
														local655 = (long) Static67.aClass3_Sub17_Sub2_4.method4862();
														local509 = Static67.aClass3_Sub17_Sub2_4.method4888();
														local6729 = Static67.aClass3_Sub17_Sub2_4.method4858();
														@Pc(7202) long local7202 = (local1103 << 32) + local655;
														@Pc(7204) boolean local7204 = false;
														local6465 = 0;
														while (true) {
															if (local6465 >= 100) {
																if (local509 <= 1 && Static410.method5823(local229)) {
																	local7204 = true;
																}
																break;
															}
															if (local7202 == Static510.aLongArray16[local6465]) {
																local7204 = true;
																break;
															}
															local6465++;
														}
														if (!local7204 && Static412.anInt6978 == 0) {
															Static510.aLongArray16[Static330.anInt6097] = local7202;
															Static330.anInt6097 = (Static330.anInt6097 + 1) % 100;
															@Pc(7264) String local7264 = Static264.aClass263_2.method6363(local6729).method1164(Static67.aClass3_Sub17_Sub2_4);
															if (local509 == 2) {
																Static30.method942(0, local7264, Static477.method6824(local2268), local6729, "<img=1>" + local227, 20, local227, "<img=1>" + local229);
															} else if (local509 == 1) {
																Static30.method942(0, local7264, Static477.method6824(local2268), local6729, "<img=0>" + local227, 20, local227, "<img=0>" + local229);
															} else {
																Static30.method942(0, local7264, Static477.method6824(local2268), local6729, local227, 20, local227, local229);
															}
														}
														Static39.aClass126_16 = null;
														return true;
													} else if (Static457.aClass126_152 == Static39.aClass126_16) {
														Static654.method8554(Static384.aClass201_6);
														Static39.aClass126_16 = null;
														return true;
													} else if (Static39.aClass126_16 == Static185.aClass126_60) {
														Static654.method8554(Static631.aClass201_21);
														Static39.aClass126_16 = null;
														return true;
													} else {
														Static81.method1711("T1 - " + (Static39.aClass126_16 == null ? -1 : Static39.aClass126_16.method2788()) + "," + (Static215.aClass126_116 == null ? -1 : Static215.aClass126_116.method2788()) + "," + (Static3.aClass126_2 == null ? -1 : Static3.aClass126_2.method2788()) + " - " + Static548.anInt8905, (Throwable) null);
														Static431.method6362(false);
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!lda;ILclient!lda;)V")
	public static void method7561(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		if (arg0.aClass3_Sub6_66 != null) {
			arg0.method8342();
		}
		arg0.aClass3_Sub6_66 = arg1.aClass3_Sub6_66;
		arg0.aClass3_Sub6_67 = arg1;
		arg0.aClass3_Sub6_66.aClass3_Sub6_67 = arg0;
		arg0.aClass3_Sub6_67.aClass3_Sub6_66 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIFIBF[F[FIIF)V")
	public static void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float arg12) {
		@Pc(5) int local5 = arg0 - arg2;
		@Pc(9) int local9 = arg1 - arg6;
		@Pc(35) int local35 = arg4 - arg11;
		@Pc(56) float local56 = (float) local35 * arg9[1] + arg9[0] * (float) local9 + arg9[2] * (float) local5;
		@Pc(77) float local77 = (float) local5 * arg9[5] + (float) local35 * arg9[4] + (float) local9 * arg9[3];
		@Pc(98) float local98 = arg9[8] * (float) local5 + arg9[6] * (float) local9 + arg9[7] * (float) local35;
		@Pc(113) float local113;
		@Pc(107) float local107;
		if (arg10 == 0) {
			local107 = arg5 + 0.5F - local98;
			local113 = arg7 + local56 + 0.5F;
		} else if (arg10 == 1) {
			local113 = arg7 + local56 + 0.5F;
			local107 = local98 + arg5 + 0.5F;
		} else if (arg10 == 2) {
			local113 = arg7 + 0.5F - local56;
			local107 = arg12 + 0.5F - local77;
		} else if (arg10 == 3) {
			local113 = local56 + arg7 + 0.5F;
			local107 = arg12 + 0.5F - local77;
		} else if (arg10 == 4) {
			local113 = arg5 + local98 + 0.5F;
			local107 = arg12 + 0.5F - local77;
		} else {
			local107 = arg12 + 0.5F - local77;
			local113 = arg5 + 0.5F - local98;
		}
		@Pc(228) float local228;
		if (arg3 == 1) {
			local228 = local113;
			local113 = -local107;
			local107 = local228;
		} else if (arg3 == 2) {
			local113 = -local113;
			local107 = -local107;
		} else if (arg3 == 3) {
			local228 = local113;
			local113 = local107;
			local107 = -local228;
		}
		arg8[0] = local113;
		arg8[1] = local107;
	}
}
