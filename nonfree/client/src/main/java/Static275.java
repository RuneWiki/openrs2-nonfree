import java.awt.Canvas;
import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!js", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "[S")
	public static short[] aShortArray60;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "Lclient!ts;")
	public static final Class329 aClass329_3 = new Class329(true);

	@OriginalMember(owner = "client!js", name = "P", descriptor = "J")
	public static long aLong149 = 0L;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public static void method4410() {
		Static119.aClass185_1 = new Class185(8);
		Static142.anInt3124 = 0;
		for (@Pc(15) Class11_Sub4 local15 = (Class11_Sub4) Static458.aClass143_7.method3536(); local15 != null; local15 = (Class11_Sub4) Static458.aClass143_7.method3528()) {
			local15.method2630();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!rca;B)V")
	public static void method4412(@OriginalArg(0) Class2_Sub34_Sub2 arg0) {
		arg0.method6927();
		@Pc(8) int local8 = Static182.anInt4021;
		@Pc(18) Class11_Sub1_Sub1_Sub2_Sub1 local18 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local8] = new Class11_Sub1_Sub1_Sub2_Sub1();
		local18.anInt3246 = local8;
		@Pc(26) int local26 = arg0.method6925(30);
		@Pc(31) byte local31 = (byte) (local26 >> 28);
		@Pc(37) int local37 = local26 >> 14 & 0x3FFF;
		local18.anIntArray232[0] = local37 - Static451.anInt7933;
		@Pc(48) int local48 = local26 & 0x3FFF;
		local18.anInt9925 = (local18.anIntArray232[0] << 9) + (local18.method2778() << 8);
		local18.anIntArray233[0] = local48 - Static470.anInt8063;
		local18.anInt9929 = (local18.anIntArray233[0] << 9) + (local18.method2778() << 8);
		Static16.anInt308 = local18.aByte124 = local18.aByte125 = local31;
		if (Static471.method6782(local18.anIntArray233[0], local18.anIntArray232[0])) {
			local18.aByte125++;
		}
		if (Static624.aClass2_Sub34Array1[local8] != null) {
			local18.method429(Static624.aClass2_Sub34Array1[local8]);
		}
		Static571.anInt9395 = 0;
		Static131.anIntArray213[Static571.anInt9395++] = local8;
		Static316.aByteArray59[local8] = 0;
		Static45.anInt6804 = 0;
		for (@Pc(140) int local140 = 1; local140 < 2048; local140++) {
			if (local8 != local140) {
				@Pc(153) int local153 = arg0.method6925(18);
				@Pc(157) int local157 = local153 >> 16;
				@Pc(163) int local163 = local153 >> 8 & 0xFF;
				@Pc(167) int local167 = local153 & 0xFF;
				@Pc(175) Class85 local175 = Static428.aClass85Array1[local140] = new Class85();
				local175.aBoolean181 = false;
				local175.anInt2171 = -1;
				local175.anInt2176 = 0;
				local175.anInt2173 = (local163 << 14) + (local157 << 28) + local167;
				Static528.anIntArray611[Static45.anInt6804++] = local140;
				Static316.aByteArray59[local140] = 0;
			}
		}
		arg0.method6923();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	public static void method4418() {
		if (Static226.anInt4630 > 1) {
			Static366.anInt6576 = Static44.anInt975;
			Static226.anInt4630--;
		}
		if (Static578.aBoolean692) {
			Static578.aBoolean692 = false;
			Static98.method1680();
			return;
		}
		if (!Static642.aBoolean757) {
			Static248.method4051();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static320.method4828(); local27++) {
		}
		if (Static538.anInt8985 != 10) {
			return;
		}
		@Pc(47) Class2_Sub50 local47;
		@Pc(56) int local56;
		while (Static589.method8141()) {
			local47 = Static595.method8194(Static610.aClass310_2, Static218.aClass269_46);
			local47.aClass2_Sub34_Sub2_2.method6894(0);
			local56 = local47.aClass2_Sub34_Sub2_2.anInt8188;
			Static164.method3049(local47.aClass2_Sub34_Sub2_2);
			local47.aClass2_Sub34_Sub2_2.method6861(local47.aClass2_Sub34_Sub2_2.anInt8188 - local56);
			Static311.method4754(local47);
		}
		if (Static442.aClass2_Sub35_1 == null) {
			if (Static438.method6517() >= Static308.aLong166) {
				Static442.aClass2_Sub35_1 = Static164.aClass99_1.method2602(Static460.aClass322_3.aString83);
			}
		} else if (Static442.aClass2_Sub35_1.anInt6568 != -1) {
			local47 = Static595.method8194(Static610.aClass310_2, Static438.aClass269_75);
			local47.aClass2_Sub34_Sub2_2.method6854(Static442.aClass2_Sub35_1.anInt6568);
			Static311.method4754(local47);
			Static442.aClass2_Sub35_1 = null;
			Static308.aLong166 = Static438.method6517() + 30000L;
		}
		@Pc(121) Class2_Sub32 local121 = (Class2_Sub32) Static72.aClass238_9.method5833();
		@Pc(134) int local134;
		@Pc(159) int local159;
		@Pc(178) int local178;
		@Pc(223) int local223;
		@Pc(230) int local230;
		@Pc(242) int local242;
		@Pc(132) Class2_Sub50 local132;
		if (local121 != null || Static104.aLong75 < Static438.method6517() - 2000L) {
			local132 = null;
			local134 = 0;
			for (@Pc(139) Class2_Sub32 local139 = (Class2_Sub32) Static113.aClass238_12.method5833(); local139 != null && (local132 == null || local132.aClass2_Sub34_Sub2_2.anInt8188 - local134 < 240); local139 = (Class2_Sub32) Static113.aClass238_12.method5838()) {
				local139.method8599();
				local159 = local139.method8563();
				if (local159 < -1) {
					local159 = -1;
				} else if (local159 > 65534) {
					local159 = 65534;
				}
				local178 = local139.method8558();
				if (local178 < -1) {
					local178 = -1;
				} else if (local178 > 65534) {
					local178 = 65534;
				}
				if (local178 != Static210.anInt4387 || local159 != Static322.anInt5839) {
					if (local132 == null) {
						local132 = Static595.method8194(Static610.aClass310_2, Static229.aClass269_48);
						local132.aClass2_Sub34_Sub2_2.method6894(0);
						local134 = local132.aClass2_Sub34_Sub2_2.anInt8188;
					}
					local223 = local178 - Static210.anInt4387;
					Static210.anInt4387 = local178;
					local230 = local159 - Static322.anInt5839;
					Static322.anInt5839 = local159;
					local242 = (int) ((local139.method8564() - Static104.aLong75) / 20L);
					if (local242 < 8 && local223 >= -32 && local223 <= 31 && local230 >= -32 && local230 <= 31) {
						local223 += 32;
						local230 += 32;
						local132.aClass2_Sub34_Sub2_2.method6854((local223 << 6) + (local242 << 12) + local230);
					} else if (local242 < 32 && local223 >= -128 && local223 <= 127 && local230 >= -128 && local230 <= 127) {
						local223 += 128;
						local132.aClass2_Sub34_Sub2_2.method6894(local242 + 128);
						local230 += 128;
						local132.aClass2_Sub34_Sub2_2.method6854((local223 << 8) + local230);
					} else if (local242 < 32) {
						local132.aClass2_Sub34_Sub2_2.method6894(local242 + 192);
						if (local178 == 1 || local159 == -1) {
							local132.aClass2_Sub34_Sub2_2.method6864(Integer.MIN_VALUE);
						} else {
							local132.aClass2_Sub34_Sub2_2.method6864(local159 << 16 | local178);
						}
					} else {
						local132.aClass2_Sub34_Sub2_2.method6854(local242 + 57344);
						if (local178 == 1 || local159 == -1) {
							local132.aClass2_Sub34_Sub2_2.method6864(Integer.MIN_VALUE);
						} else {
							local132.aClass2_Sub34_Sub2_2.method6864(local178 | local159 << 16);
						}
					}
					Static104.aLong75 = local139.method8564();
				}
			}
			if (local132 != null) {
				local132.aClass2_Sub34_Sub2_2.method6861(local132.aClass2_Sub34_Sub2_2.anInt8188 - local134);
				Static311.method4754(local132);
			}
		}
		@Pc(438) int local438;
		if (local121 != null) {
			@Pc(422) long local422 = (local121.method8564() - Static33.aLong36) / 50L;
			if (local422 > 32767L) {
				local422 = 32767L;
			}
			Static33.aLong36 = local121.method8564();
			local438 = local121.method8563();
			if (local438 < 0) {
				local438 = 0;
			} else if (local438 > 65535) {
				local438 = 65535;
			}
			local159 = local121.method8558();
			if (local159 < 0) {
				local159 = 0;
			} else if (local159 > 65535) {
				local159 = 65535;
			}
			@Pc(469) byte local469 = 0;
			if (local121.method8561() == 2) {
				local469 = 1;
			}
			local223 = (int) local422;
			@Pc(488) Class2_Sub50 local488 = Static595.method8194(Static610.aClass310_2, Static9.aClass269_2);
			local488.aClass2_Sub34_Sub2_2.method6864(local438 << 16 | local159);
			local488.aClass2_Sub34_Sub2_2.method6900(local469 << 15 | local223);
			Static311.method4754(local488);
		}
		if (Static542.anInt9036 > 0) {
			local132 = Static595.method8194(Static610.aClass310_2, Static198.aClass269_41);
			local132.aClass2_Sub34_Sub2_2.method6894(Static542.anInt9036 * 3);
			for (local134 = 0; local134 < Static542.anInt9036; local134++) {
				@Pc(538) Interface16 local538 = Static293.anInterface16Array2[local134];
				@Pc(546) long local546 = (local538.method4738() - Static34.aLong38) / 50L;
				Static34.aLong38 = local538.method4738();
				if (local546 > 65535L) {
					local546 = 65535L;
				}
				local132.aClass2_Sub34_Sub2_2.method6894(local538.method4735());
				local132.aClass2_Sub34_Sub2_2.method6854((int) local546);
			}
			Static311.method4754(local132);
		}
		if (Static425.anInt5332 > 0) {
			Static425.anInt5332--;
		}
		if (Static620.aBoolean745 && Static425.anInt5332 <= 0) {
			Static425.anInt5332 = 20;
			Static620.aBoolean745 = false;
			local132 = Static595.method8194(Static610.aClass310_2, Static257.aClass269_50);
			local132.aClass2_Sub34_Sub2_2.method6854((int) Static378.aFloat160 >> 3);
			local132.aClass2_Sub34_Sub2_2.method6916((int) Static189.aFloat109 >> 3);
			Static311.method4754(local132);
		}
		if (Static540.aBoolean661 != Static94.aBoolean158) {
			Static94.aBoolean158 = Static540.aBoolean661;
			local132 = Static595.method8194(Static610.aClass310_2, Static125.aClass269_30);
			local132.aClass2_Sub34_Sub2_2.method6894(Static540.aBoolean661 ? 1 : 0);
			Static311.method4754(local132);
		}
		if (!Static141.aBoolean267) {
			local132 = Static595.method8194(Static610.aClass310_2, Static262.aClass269_52);
			local132.aClass2_Sub34_Sub2_2.method6894(0);
			local134 = local132.aClass2_Sub34_Sub2_2.anInt8188;
			@Pc(681) Class2_Sub34 local681 = Static404.aClass2_Sub13_2.method1376();
			local132.aClass2_Sub34_Sub2_2.method6914(0, local681.aByteArray77, local681.anInt8188);
			local132.aClass2_Sub34_Sub2_2.method6861(local132.aClass2_Sub34_Sub2_2.anInt8188 - local134);
			Static311.method4754(local132);
			Static141.aBoolean267 = true;
		}
		if (Static440.aClass217ArrayArrayArray3 != null) {
			if (Static2.anInt31 == 2) {
				Static37.method822();
			} else if (Static2.anInt31 == 3) {
				Static257.method4230();
			}
		}
		if (Static354.aBoolean483) {
			Static354.aBoolean483 = false;
		} else {
			Static293.aFloat128 /= 2.0F;
		}
		if (Static490.aBoolean627) {
			Static490.aBoolean627 = false;
		} else {
			Static440.aFloat192 /= 2.0F;
		}
		Static408.method6267();
		if (Static538.anInt8985 != 10) {
			return;
		}
		Static569.method7833();
		Static208.method3616();
		Static345.method5395();
		Static446.anInt7904++;
		if (Static446.anInt7904 > 750) {
			Static98.method1680();
			return;
		}
		Static547.method7779();
		Static529.method7391();
		Static630.method8479();
		for (local56 = Static438.aClass198_1.method4746(true); local56 != -1; local56 = Static438.aClass198_1.method4746(false)) {
			Static207.method3604(local56);
			Static262.anIntArray350[Static372.anInt6644++ & 0x1F] = local56;
		}
		@Pc(854) Class78 local854;
		for (@Pc(799) Class2_Sub5_Sub10 local799 = Static85.method1551(); local799 != null; local799 = Static85.method1551()) {
			local438 = local799.method4389();
			local159 = local799.method4388();
			if (local438 == 1) {
				Static608.anIntArray246[local159] = local799.anInt5255;
				Static179.aBoolean335 |= Static276.aBooleanArray33[local159];
				Static239.anIntArray567[Static571.anInt9391++ & 0x1F] = local159;
			} else if (local438 == 2) {
				Static229.aStringArray11[local159] = local799.aString52;
				Static448.anIntArray542[Static325.anInt5891++ & 0x1F] = local159;
			} else if (local438 == 3) {
				local854 = Static180.method3291(local159);
				if (!local799.aString52.equals(local854.aString25)) {
					local854.aString25 = local799.aString52;
					Static397.method6022(local854);
				}
			} else if (local438 == 4) {
				local854 = Static180.method3291(local159);
				local223 = local799.anInt5255;
				local230 = local799.anInt5246;
				local242 = local799.anInt5245;
				if (local223 != local854.anInt2002 || local230 != local854.anInt1962 || local242 != local854.anInt1983) {
					local854.anInt1983 = local242;
					local854.anInt2002 = local223;
					local854.anInt1962 = local230;
					Static397.method6022(local854);
				}
			} else if (local438 == 5) {
				local854 = Static180.method3291(local159);
				if (local799.anInt5255 != local854.anInt2003 || local799.anInt5255 == -1) {
					local854.anInt2003 = local799.anInt5255;
					local854.anInt1973 = 1;
					local854.anInt1925 = 0;
					local854.anInt1946 = 0;
					@Pc(1335) Class149 local1335 = local854.anInt2003 == -1 ? null : Static185.aClass303_1.method7201(local854.anInt2003);
					if (local1335 != null) {
						Static455.method6662(local1335, local854.anInt1925);
					}
					Static397.method6022(local854);
				}
			} else if (local438 == 6) {
				local178 = local799.anInt5255;
				local223 = local178 >> 10 & 0x1F;
				local230 = local178 >> 5 & 0x1F;
				local242 = local178 & 0x1F;
				@Pc(932) int local932 = (local242 << 3) + (local230 << 11) + (local223 << 19);
				@Pc(936) Class78 local936 = Static180.method3291(local159);
				if (local932 != local936.anInt2013) {
					local936.anInt2013 = local932;
					Static397.method6022(local936);
				}
			} else if (local438 == 7) {
				local854 = Static180.method3291(local159);
				@Pc(969) boolean local969 = local799.anInt5255 == 1;
				if (local854.aBoolean167 != local969) {
					local854.aBoolean167 = local969;
					Static397.method6022(local854);
				}
			} else if (local438 == 8) {
				local854 = Static180.method3291(local159);
				if (local799.anInt5255 != local854.anInt2014 || local799.anInt5246 != local854.anInt1937 || local799.anInt5245 != local854.anInt1947) {
					local854.anInt2014 = local799.anInt5255;
					local854.anInt1937 = local799.anInt5246;
					local854.anInt1947 = local799.anInt5245;
					if (local854.anInt2006 != -1) {
						if (local854.anInt1982 > 0) {
							local854.anInt1947 = local854.anInt1947 * 32 / local854.anInt1982;
						} else if (local854.anInt1929 > 0) {
							local854.anInt1947 = local854.anInt1947 * 32 / local854.anInt1929;
						}
					}
					Static397.method6022(local854);
				}
			} else if (local438 == 9) {
				local854 = Static180.method3291(local159);
				if (local854.anInt2006 != local799.anInt5255 || local854.anInt1944 != local799.anInt5246) {
					local854.anInt2006 = local799.anInt5255;
					local854.anInt1944 = local799.anInt5246;
					Static397.method6022(local854);
				}
			} else if (local438 == 10) {
				local854 = Static180.method3291(local159);
				if (local854.anInt1960 != local799.anInt5255 || local799.anInt5246 != local854.anInt1954 || local854.anInt1995 != local799.anInt5245) {
					local854.anInt1995 = local799.anInt5245;
					local854.anInt1954 = local799.anInt5246;
					local854.anInt1960 = local799.anInt5255;
					Static397.method6022(local854);
				}
			} else if (local438 == 11) {
				local854 = Static180.method3291(local159);
				local854.aByte47 = 0;
				local854.anInt1928 = local854.anInt1924 = local799.anInt5255;
				local854.anInt2005 = local854.anInt2004 = local799.anInt5246;
				local854.aByte46 = 0;
				Static397.method6022(local854);
			} else if (local438 == 12) {
				local854 = Static180.method3291(local159);
				local223 = local799.anInt5255;
				if (local854 != null && local854.anInt1955 == 0) {
					if (local854.anInt1961 - local854.anInt1991 < local223) {
						local223 = local854.anInt1961 - local854.anInt1991;
					}
					if (local223 < 0) {
						local223 = 0;
					}
					if (local223 != local854.anInt2009) {
						local854.anInt2009 = local223;
						Static397.method6022(local854);
					}
				}
			} else if (local438 == 14) {
				local854 = Static180.method3291(local159);
				local854.anInt1986 = local799.anInt5255;
			} else if (local438 == 15) {
				Static129.anInt2985 = local799.anInt5255;
				Static271.anInt5226 = local799.anInt5246;
				Static70.aBoolean136 = true;
			} else if (local438 == 16) {
				local854 = Static180.method3291(local159);
				local854.anInt1975 = local799.anInt5255;
			} else if (local438 == 17) {
				local854 = Static180.method3291(local159);
				local854.anInt1976 = local799.anInt5255;
			}
		}
		if (Static419.anInt7641 != 0) {
			Static76.anInt1679 += 20;
			if (Static76.anInt1679 >= 400) {
				Static419.anInt7641 = 0;
			}
		}
		Static362.anInt6541++;
		if (Static140.aClass78_6 != null) {
			Static195.anInt9445++;
			if (Static195.anInt9445 >= 15) {
				Static397.method6022(Static140.aClass78_6);
				Static140.aClass78_6 = null;
			}
		}
		Static642.aBoolean759 = false;
		Static71.aClass78_1 = null;
		Static112.aClass78_5 = null;
		Static360.aBoolean486 = false;
		Static98.method1679(-1, -1, null);
		Static475.method7387(-1, null, -1);
		if (!Static301.aBoolean423) {
			Static385.anInt6934 = -1;
		}
		Static498.method7093();
		Static44.anInt975++;
		if (Static247.aBoolean410) {
			@Pc(1456) Class2_Sub50 local1456 = Static595.method8194(Static610.aClass310_2, Static608.aClass269_36);
			local1456.aClass2_Sub34_Sub2_2.method6869(Static382.anInt6844 | Static38.anInt932 << 28 | Static635.anInt10177 << 14);
			Static311.method4754(local1456);
			Static247.aBoolean410 = false;
		}
		while (true) {
			@Pc(1479) Class2_Sub42 local1479;
			@Pc(1484) Class78 local1484;
			do {
				local1479 = (Class2_Sub42) Static378.aClass238_41.method5832();
				if (local1479 == null) {
					while (true) {
						do {
							local1479 = (Class2_Sub42) Static98.aClass238_11.method5832();
							if (local1479 == null) {
								while (true) {
									do {
										local1479 = (Class2_Sub42) Static564.aClass238_54.method5832();
										if (local1479 == null) {
											if (Static71.aClass78_1 == null) {
												Static100.anInt2017 = 0;
											}
											if (Static112.aClass78_4 != null) {
												Static401.method6209();
											}
											if (Static278.anInt5322 > 0 && Static63.aClass32_1.method789(82) && Static63.aClass32_1.method789(81) && Static597.anInt9839 != 0) {
												local438 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 - Static597.anInt9839;
												if (local438 < 0) {
													local438 = 0;
												} else if (local438 > 3) {
													local438 = 3;
												}
												Static185.method3333(Static451.anInt7933 + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0], local438, Static470.anInt8063 + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0]);
											}
											Static505.method7156();
											for (local438 = 0; local438 < 5; local438++) {
												@Pc(1673) int local1673 = Static416.anIntArray510[local438]++;
											}
											if (Static179.aBoolean335 && Static438.method6517() - 60000L > Static585.aLong256) {
												Static76.method1454();
											}
											for (@Pc(1698) Class11_Sub5_Sub2 local1698 = (Class11_Sub5_Sub2) Static263.aClass143_6.method3536(); local1698 != null; local1698 = (Class11_Sub5_Sub2) Static263.aClass143_6.method3528()) {
												if ((long) local1698.anInt5858 < Static438.method6517() / 1000L - 5L) {
													if (local1698.aShort84 > 0) {
														Static369.method5571("", "", local1698.aString57 + Static628.aClass369_19.method8475(Static377.anInt6756), 0, 5, "");
													}
													if (local1698.aShort84 == 0) {
														Static369.method5571("", "", local1698.aString57 + Static628.aClass369_20.method8475(Static377.anInt6756), 0, 5, "");
													}
													local1698.method8372();
												}
											}
											Static484.anInt8268++;
											if (Static484.anInt8268 > 500) {
												Static484.anInt8268 = 0;
												local178 = (int) (Math.random() * 8.0D);
												if ((local178 & 0x2) == 2) {
													Static574.anInt9439 += Static262.anInt5103;
												}
												if ((local178 & 0x4) == 4) {
													Static479.anInt9936 += Static88.anInt7012;
												}
												if ((local178 & 0x1) == 1) {
													Static477.anInt8153 += Static514.anInt10180;
												}
											}
											if (Static477.anInt8153 < -50) {
												Static514.anInt10180 = 2;
											}
											if (Static477.anInt8153 > 50) {
												Static514.anInt10180 = -2;
											}
											if (Static574.anInt9439 < -55) {
												Static262.anInt5103 = 2;
											}
											if (Static574.anInt9439 > 55) {
												Static262.anInt5103 = -2;
											}
											if (Static479.anInt9936 < -40) {
												Static88.anInt7012 = 1;
											}
											if (Static479.anInt9936 > 40) {
												Static88.anInt7012 = -1;
											}
											Static640.anInt10240++;
											if (Static640.anInt10240 > 500) {
												Static640.anInt10240 = 0;
												local178 = (int) (Math.random() * 8.0D);
												if ((local178 & 0x1) == 1) {
													Static415.anInt7576 += Static309.anInt5670;
												}
												if ((local178 & 0x2) == 2) {
													Static30.anInt6668 += Static601.anInt9894;
												}
											}
											if (Static415.anInt7576 < -60) {
												Static309.anInt5670 = 2;
											}
											if (Static415.anInt7576 > 60) {
												Static309.anInt5670 = -2;
											}
											if (Static30.anInt6668 < -20) {
												Static601.anInt9894 = 1;
											}
											if (Static30.anInt6668 > 10) {
												Static601.anInt9894 = -1;
											}
											Static362.anInt6546++;
											if (Static362.anInt6546 > 50) {
												@Pc(1923) Class2_Sub50 local1923 = Static595.method8194(Static610.aClass310_2, Static631.aClass269_96);
												Static311.method4754(local1923);
											}
											if (Static38.aBoolean67) {
												Static465.method6729();
												Static38.aBoolean67 = false;
											}
											try {
												Static73.method1380();
												return;
											} catch (@Pc(1936) IOException local1936) {
												Static98.method1680();
												return;
											}
										}
										local1484 = local1479.aClass78_9;
										if (local1484.anInt1978 < 0) {
											break;
										}
										local854 = Static180.method3291(local1484.anInt1967);
									} while (local854 == null || local854.aClass78Array9 == null || local1484.anInt1978 >= local854.aClass78Array9.length || local1484 != local854.aClass78Array9[local1484.anInt1978]);
									Static639.method8539(local1479);
								}
							}
							local1484 = local1479.aClass78_9;
							if (local1484.anInt1978 < 0) {
								break;
							}
							local854 = Static180.method3291(local1484.anInt1967);
						} while (local854 == null || local854.aClass78Array9 == null || local1484.anInt1978 >= local854.aClass78Array9.length || local854.aClass78Array9[local1484.anInt1978] != local1484);
						Static639.method8539(local1479);
					}
				}
				local1484 = local1479.aClass78_9;
				if (local1484.anInt1978 < 0) {
					break;
				}
				local854 = Static180.method3291(local1484.anInt1967);
			} while (local854 == null || local854.aClass78Array9 == null || local1484.anInt1978 >= local854.aClass78Array9.length || local854.aClass78Array9[local1484.anInt1978] != local1484);
			Static639.method8539(local1479);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BIILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class87 method4419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface6 arg3) {
		return new oa(arg2, arg3, arg0, arg1);
	}
}
