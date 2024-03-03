import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public static int anInt6181;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "[Lclient!tf;")
	public static Class6[] aClass6Array3;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray3;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)B", line = 38)
	public static byte method5654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)Z", line = 57)
	public static boolean method5655(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IB)Lclient!uo;", line = 90)
	public static Class235 method5656(@OriginalArg(0) int arg0) {
		@Pc(10) Class235 local10 = (Class235) Class11_Sub5_Sub2_Sub1.aClass98_37.method2614((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static266.aClass197_73.method5090(arg0, 0);
		local10 = new Class235();
		if (local28 != null) {
			local10.method5934(new Class2_Sub4(local28));
		}
		local10.method5932();
		Class11_Sub5_Sub2_Sub1.aClass98_37.method2626((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!s;I)V", line = 116)
	public static void method5657(@OriginalArg(0) Class210 arg0) {
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(181) Class11_Sub5_Sub3 local181;
		@Pc(49) int local49;
		@Pc(53) int local53;
		if (Class16.aClass210_1 == arg0) {
			local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
			local23 = Static63.anInt1635 * 2 + (local12 >> 4 & 0xF);
			local32 = Static7.anInt7227 * 2 + (local12 & 0xF);
			local40 = local23 + Class150.aClass2_Sub4_Sub2_3.method4826();
			local49 = local32 + Class150.aClass2_Sub4_Sub2_3.method4826();
			local53 = Class150.aClass2_Sub4_Sub2_3.method4824();
			local57 = Class150.aClass2_Sub4_Sub2_3.method4830();
			local63 = Class150.aClass2_Sub4_Sub2_3.method4816() * 4;
			local69 = Class150.aClass2_Sub4_Sub2_3.method4816() * 4;
			local73 = Class150.aClass2_Sub4_Sub2_3.method4830();
			local77 = Class150.aClass2_Sub4_Sub2_3.method4830();
			local81 = Class150.aClass2_Sub4_Sub2_3.method4816();
			local85 = Class150.aClass2_Sub4_Sub2_3.method4816();
			if (local81 == 255) {
				local81 = -1;
			}
			if (local23 >= 0 && local32 >= 0 && Class241.anInt7020 * 2 > local23 && Class241.anInt7020 * 2 > local32 && local40 >= 0 && local49 >= 0 && OutputStream_Sub1.anInt4442 * 2 > local40 && local49 < OutputStream_Sub1.anInt4442 * 2 && local57 != 65535) {
				local40 *= 64;
				local49 = local49 * 64;
				local23 = local23 * 64;
				local32 *= 64;
				local181 = new Class11_Sub5_Sub3(local57, Static226.anInt4495, local23, local32, Static360.method6033(local23, local32, Static226.anInt4495) - local63, local73 - -Class83.anInt2345, Class83.anInt2345 + local77, local81, local85, local53, local69);
				local181.method4398(Static360.method6033(local40, local49, Static226.anInt4495) - local69, local40, Class83.anInt2345 + local73, local49);
				Class6.aClass135_38.method3541(new Class2_Sub2_Sub9(local181));
			}
		} else if (arg0 == Class191.aClass210_11) {
			local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
			local23 = (local12 >> 4 & 0x7) + Static63.anInt1635;
			local32 = (local12 & 0x7) + Static7.anInt7227;
			local40 = Class150.aClass2_Sub4_Sub2_3.method4830();
			local49 = Class150.aClass2_Sub4_Sub2_3.method4830();
			local53 = Class150.aClass2_Sub4_Sub2_3.method4830();
			if (Class87.aClass4_49 != null && local23 >= 0 && local32 >= 0 && local23 < Class241.anInt7020 && OutputStream_Sub1.anInt4442 > local32) {
				@Pc(269) Class2_Sub32 local269 = (Class2_Sub32) Class87.aClass4_49.method90((long) (local23 | Static226.anInt4495 << 28 | local32 << 14));
				if (local269 != null) {
					for (@Pc(277) Class2_Sub8 local277 = (Class2_Sub8) local269.aClass135_34.method3552(); local277 != null; local277 = (Class2_Sub8) local269.aClass135_34.method3553()) {
						if (local277.anInt1715 == (local40 & 0x7FFF) && local49 == local277.anInt1717) {
							local277.method6469();
							local277.anInt1717 = local53;
							Static128.method2552(local32, local23, local277, Static226.anInt4495);
							break;
						}
					}
					Static155.method3155(local23, Static226.anInt4495, local32);
				}
			}
		} else {
			@Pc(403) int local403;
			if (Class242.aClass210_15 == arg0) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local23 = Static63.anInt1635 * 2 + (local12 >> 4 & 0xF);
				local32 = (local12 & 0xF) + Static7.anInt7227 * 2;
				local40 = Class150.aClass2_Sub4_Sub2_3.method4826() + local23;
				local49 = local32 + Class150.aClass2_Sub4_Sub2_3.method4826();
				local53 = Class150.aClass2_Sub4_Sub2_3.method4824();
				local57 = Class150.aClass2_Sub4_Sub2_3.method4824();
				local63 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local69 = Class150.aClass2_Sub4_Sub2_3.method4826();
				local73 = Class150.aClass2_Sub4_Sub2_3.method4816() * 4;
				local77 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local81 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local85 = Class150.aClass2_Sub4_Sub2_3.method4816();
				if (local85 == 255) {
					local85 = -1;
				}
				local403 = Class150.aClass2_Sub4_Sub2_3.method4816();
				if (local23 >= 0 && local32 >= 0 && local23 < Class241.anInt7020 * 2 && Class241.anInt7020 * 2 > local32 && local40 >= 0 && local49 >= 0 && local40 < OutputStream_Sub1.anInt4442 * 2 && local49 < OutputStream_Sub1.anInt4442 * 2 && local63 != 65535) {
					local32 = local32 * 64;
					local40 *= 64;
					local23 = local23 * 64;
					local49 *= 64;
					if (local53 != 0) {
						@Pc(483) int local483;
						@Pc(491) Class11_Sub5_Sub2 local491;
						@Pc(477) int local477;
						@Pc(487) int local487;
						if (local53 >= 0) {
							local477 = local53 - 1;
							local483 = local477 >> 11 & 0xF;
							local487 = local477 & 0x7FF;
							local491 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local487];
						} else {
							local477 = -local53 - 1;
							local483 = local477 >> 11 & 0xF;
							local487 = local477 & 0x7FF;
							if (Class11_Sub3_Sub2.anInt4220 == local487) {
								local491 = Static17.aClass11_Sub5_Sub2_Sub1_3;
							} else {
								local491 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local487];
							}
						}
						if (local491 != null) {
							@Pc(525) Class222 local525 = local491.method4333();
							if (local525.anIntArrayArray53 != null && local525.anIntArrayArray53[local483] != null) {
								local487 = local525.anIntArrayArray53[local483][0];
								@Pc(547) int local547 = local525.anIntArrayArray53[local483][2];
								@Pc(552) int local552 = local491.aClass248_7.method6442();
								@Pc(556) int local556 = Class19.anIntArray178[local552];
								@Pc(560) int local560 = Class19.anIntArray177[local552];
								@Pc(571) int local571 = local556 * local547 + local487 * local560 >> 15;
								@Pc(582) int local582 = local547 * local560 - local556 * local487 >> 15;
								local69 -= local525.anIntArrayArray53[local483][1];
								local23 += local571;
								local32 += local582;
							}
						}
					}
					@Pc(628) Class11_Sub5_Sub3 local628 = new Class11_Sub5_Sub3(local63, Static226.anInt4495, local23, local32, Static360.method6033(local23, local32, Static226.anInt4495) - local69, Class83.anInt2345 + local77, local81 + Class83.anInt2345, local85, local403, local57, local73);
					local628.method4398(Static360.method6033(local40, local49, Static226.anInt4495) - local73, local40, Class83.anInt2345 + local77, local49);
					Class6.aClass135_38.method3541(new Class2_Sub2_Sub9(local628));
				}
			} else if (Class24.aClass210_2 == arg0) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4805();
				local23 = (local12 >> 4 & 0x7) + Static63.anInt1635;
				local32 = Static7.anInt7227 + (local12 & 0x7);
				local40 = Class150.aClass2_Sub4_Sub2_3.method4854();
				if (local23 >= 0 && local32 >= 0 && local23 < Class241.anInt7020 && local32 < OutputStream_Sub1.anInt4442) {
					@Pc(713) Class2_Sub32 local713 = (Class2_Sub32) Class87.aClass4_49.method90((long) (local23 | Static226.anInt4495 << 28 | local32 << 14));
					if (local713 != null) {
						for (@Pc(721) Class2_Sub8 local721 = (Class2_Sub8) local713.aClass135_34.method3552(); local721 != null; local721 = (Class2_Sub8) local713.aClass135_34.method3553()) {
							if ((local40 & 0x7FFF) == local721.anInt1715) {
								local721.method6469();
								break;
							}
						}
						if (local713.aClass135_34.method3551()) {
							local713.method6469();
						}
						Static155.method3155(local23, Static226.anInt4495, local32);
					}
				}
			} else if (Class98.aClass210_6 == arg0) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4804();
				local23 = Class150.aClass2_Sub4_Sub2_3.method4854();
				local32 = Class150.aClass2_Sub4_Sub2_3.method4812();
				local40 = (local32 >> 4 & 0x7) + Static63.anInt1635;
				local49 = Static7.anInt7227 + (local32 & 0x7);
				local53 = Class150.aClass2_Sub4_Sub2_3.method4854();
				if (local40 >= 0 && local49 >= 0 && Class241.anInt7020 > local40 && local49 < OutputStream_Sub1.anInt4442 && local23 != Class11_Sub3_Sub2.anInt4220) {
					Static128.method2552(local49, local40, new Class2_Sub8(local53, local12), Static226.anInt4495);
					Static155.method3155(local40, Static226.anInt4495, local49);
				}
			} else if (arg0 == Class2_Sub18.aClass210_7) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4805();
				local23 = local12 >> 2;
				local32 = local12 & 0x3;
				local40 = Class2_Sub3_Sub16.anIntArray174[local23];
				local49 = Class150.aClass2_Sub4_Sub2_3.method4807();
				local53 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local57 = Static63.anInt1635 + (local53 >> 4 & 0x7);
				local63 = Static7.anInt7227 + (local53 & 0x7);
				if (local57 >= 0 && local63 >= 0 && local57 < Class241.anInt7020 && OutputStream_Sub1.anInt4442 > local63) {
					Static27.method900(local49, local40, local23, local57, local32, local63, Static226.anInt4495);
				}
			} else if (arg0 == Class11_Sub5_Sub5.aClass210_13) {
				@Pc(916) byte local916 = Class150.aClass2_Sub4_Sub2_3.method4802();
				local23 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local32 = (local23 >> 4 & 0x7) + Static63.anInt1635;
				local40 = (local23 & 0x7) + Static7.anInt7227;
				local49 = Class150.aClass2_Sub4_Sub2_3.method4851();
				@Pc(942) byte local942 = Class150.aClass2_Sub4_Sub2_3.method4842();
				local57 = Class150.aClass2_Sub4_Sub2_3.method4854();
				local63 = Class150.aClass2_Sub4_Sub2_3.method4854();
				@Pc(954) byte local954 = Class150.aClass2_Sub4_Sub2_3.method4802();
				@Pc(958) byte local958 = Class150.aClass2_Sub4_Sub2_3.method4802();
				local77 = Class150.aClass2_Sub4_Sub2_3.method4864();
				local81 = local77 >> 2;
				local85 = local77 & 0x3;
				local403 = Class150.aClass2_Sub4_Sub2_3.method4830();
				if (!Static177.aClass19_8.method2873()) {
					Static226.method4240(local32, local403, local954, local57, local958, local942, local916, local63, local49, local81, local85, local40, Static226.anInt4495);
				}
			} else if (arg0 == Class58.aClass210_3) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local23 = Class150.aClass2_Sub4_Sub2_3.method4816();
				Static334.aClass202_4.method5164(local12).method1523(local23);
			} else if (Class79.aClass210_5 == arg0) {
				Class150.aClass2_Sub4_Sub2_3.method4816();
				local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local23 = (local12 >> 4 & 0x7) + Static63.anInt1635;
				local32 = Static7.anInt7227 + (local12 & 0x7);
				local40 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local49 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local53 = Class150.aClass2_Sub4_Sub2_3.method4834();
				@Pc(1055) String local1055 = Class150.aClass2_Sub4_Sub2_3.method4810();
				Static104.method2279(local40, local49, local53, local1055, Static226.anInt4495, local23, local32);
			} else if (arg0 == Class140.aClass210_9) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4807();
				if (local12 == 65535) {
					local12 = -1;
				}
				local23 = Class150.aClass2_Sub4_Sub2_3.method4812();
				local32 = Static63.anInt1635 + (local23 >> 4 & 0x7);
				local40 = (local23 & 0x7) + Static7.anInt7227;
				local49 = Class150.aClass2_Sub4_Sub2_3.method4812();
				local53 = local49 >> 2;
				local57 = local49 & 0x3;
				local63 = Class2_Sub3_Sub16.anIntArray174[local53];
				Static365.method6453(local53, local12, local40, local63, local57, local32, Static226.anInt4495);
			} else if (arg0 == Class2_Sub3_Sub17.aClass210_8) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local23 = Static63.anInt1635 + (local12 >> 4 & 0x7);
				local32 = Static7.anInt7227 + (local12 & 0x7);
				local40 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local49 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local53 = Class150.aClass2_Sub4_Sub2_3.method4830();
				if (local23 >= 0 && local32 >= 0 && Class241.anInt7020 > local23 && OutputStream_Sub1.anInt4442 > local32) {
					local57 = local23 * 128 + 64;
					local63 = local32 * 128 + 64;
					@Pc(1208) Class11_Sub5_Sub4 local1208 = new Class11_Sub5_Sub4(local40, local53, Class83.anInt2345, Static226.anInt4495, local57, Static360.method6033(local57, local63, Static226.anInt4495) - local49, local63, local23, local23, local32, local32);
					Class92.aClass135_20.method3541(new Class2_Sub2_Sub1(local1208));
				}
			} else if (Class221.aClass210_16 == arg0) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local23 = (local12 >> 4 & 0x7) + Static63.anInt1635;
				local32 = (local12 & 0x7) + Static7.anInt7227;
				local40 = Class150.aClass2_Sub4_Sub2_3.method4830();
				if (local40 == 65535) {
					local40 = -1;
				}
				local49 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local53 = local49 >> 4 & 0xF;
				local57 = local49 & 0x7;
				local63 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local69 = Class150.aClass2_Sub4_Sub2_3.method4816();
				if (local23 >= 0 && local32 >= 0 && local23 < Class241.anInt7020 && OutputStream_Sub1.anInt4442 > local32) {
					local73 = local53 + 1;
					if (local23 - local73 <= Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] && Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] <= local23 + local73 && Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] >= local32 - local73 && local32 + local73 >= Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] && Static203.aClass177_Sub1_2.anInt4872 != 0 && local57 > 0 && Class2_Sub2_Sub13.anInt4496 < 50 && local40 != -1) {
						Class11_Sub5_Sub3.anIntArray321[Class2_Sub2_Sub13.anInt4496] = local40;
						Class2_Sub3_Sub34.anIntArray419[Class2_Sub2_Sub13.anInt4496] = local57;
						Class162.anIntArray283[Class2_Sub2_Sub13.anInt4496] = local63;
						Class119.aClass247Array2[Class2_Sub2_Sub13.anInt4496] = null;
						Class115.anIntArray188[Class2_Sub2_Sub13.anInt4496] = local53 + (local32 << 8) + (local23 << 16) + (Static226.anInt4495 << 24);
						Class156.anIntArray256[Class2_Sub2_Sub13.anInt4496] = local69;
						Class2_Sub2_Sub13.anInt4496++;
					}
				}
			} else if (arg0 == OutputStream_Sub1.aClass210_10) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4864();
				local23 = Static63.anInt1635 + (local12 >> 4 & 0x7);
				local32 = (local12 & 0x7) + Static7.anInt7227;
				local40 = Class150.aClass2_Sub4_Sub2_3.method4805();
				local49 = local40 >> 2;
				local53 = local40 & 0x3;
				local57 = Class2_Sub3_Sub16.anIntArray174[local49];
				if (local23 >= 0 && local32 >= 0 && local23 < Class241.anInt7020 && OutputStream_Sub1.anInt4442 > local32) {
					Static27.method900(-1, local57, local49, local23, local53, local32, Static226.anInt4495);
				}
			} else if (arg0 == Class2_Sub3_Sub25.lb) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local23 = Static63.anInt1635 + (local12 >> 4 & 0x7);
				local32 = (local12 & 0x7) + Static7.anInt7227;
				local40 = local23 + Class150.aClass2_Sub4_Sub2_3.method4826();
				local49 = local32 + Class150.aClass2_Sub4_Sub2_3.method4826();
				local53 = Class150.aClass2_Sub4_Sub2_3.method4824();
				local57 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local63 = Class150.aClass2_Sub4_Sub2_3.method4816() * 4;
				local69 = Class150.aClass2_Sub4_Sub2_3.method4816() * 4;
				local73 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local77 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local81 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local85 = Class150.aClass2_Sub4_Sub2_3.method4816();
				if (local81 == 255) {
					local81 = -1;
				}
				if (local23 >= 0 && local32 >= 0 && Class241.anInt7020 > local23 && local32 < OutputStream_Sub1.anInt4442 && local40 >= 0 && local49 >= 0 && local40 < Class241.anInt7020 && local49 < OutputStream_Sub1.anInt4442 && local57 != 65535) {
					local32 = local32 * 128 + 64;
					local23 = local23 * 128 + 64;
					local49 = local49 * 128 + 64;
					local40 = local40 * 128 + 64;
					local181 = new Class11_Sub5_Sub3(local57, Static226.anInt4495, local23, local32, Static360.method6033(local23, local32, Static226.anInt4495) - local63, local73 + Class83.anInt2345, local77 + Class83.anInt2345, local81, local85, local53, local69);
					local181.method4398(Static360.method6033(local40, local49, Static226.anInt4495) - local69, local40, Class83.anInt2345 + local73, local49);
					Class6.aClass135_38.method3541(new Class2_Sub2_Sub9(local181));
				}
			} else if (Class78_Sub1.aClass210_4 == arg0) {
				local12 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local23 = Class150.aClass2_Sub4_Sub2_3.method4807();
				local32 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local40 = (local32 >> 4 & 0x7) + Static63.anInt1635;
				local49 = Static7.anInt7227 + (local32 & 0x7);
				if (local40 >= 0 && local49 >= 0 && local40 < Class241.anInt7020 && OutputStream_Sub1.anInt4442 > local49) {
					Static128.method2552(local49, local40, new Class2_Sub8(local12, local23), Static226.anInt4495);
					Static155.method3155(local40, Static226.anInt4495, local49);
				}
			} else {
				Static241.method6254(null, "T3 - " + arg0);
				Static92.method2146();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 732)
	public static String method5658(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static159.method3230(Static76.method5986(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
