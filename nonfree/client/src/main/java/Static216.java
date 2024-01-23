import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!fe;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[Lclient!dj;")
	public static Class12_Sub3_Sub1[] aClass12_Sub3_Sub1Array1 = new Class12_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	public static int anInt4756 = 0;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "Lclient!i;")
	public static Class41 aClass41_1276 = Static184.method2923("Hierhin gehen");

	@OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
	public static int[] anIntArray492 = new int[32];

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method3290() {
		@Pc(18) int local18;
		@Pc(36) int local36;
		@Pc(26) int local26;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(82) int local82;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(165) Class12_Sub4 local165;
		if (Static211.anInt4701 == 123) {
			local18 = Static204.aClass2_Sub3_Sub1_3.method209();
			local26 = Static135.anInt3148 * 2 + (local18 & 0xF);
			local36 = (local18 >> 4 & 0xF) + Static107.anInt2598 * 2;
			local42 = Static204.aClass2_Sub3_Sub1_3.method186() + local36;
			local50 = local26 + Static204.aClass2_Sub3_Sub1_3.method186();
			local54 = Static204.aClass2_Sub3_Sub1_3.method196();
			local58 = Static204.aClass2_Sub3_Sub1_3.method163();
			local66 = Static204.aClass2_Sub3_Sub1_3.method209() * 4;
			local74 = Static204.aClass2_Sub3_Sub1_3.method209() * 4;
			local78 = Static204.aClass2_Sub3_Sub1_3.method163();
			local82 = Static204.aClass2_Sub3_Sub1_3.method163();
			local88 = Static204.aClass2_Sub3_Sub1_3.method209();
			local92 = Static204.aClass2_Sub3_Sub1_3.method209();
			if (local36 >= 0 && local26 >= 0 && local36 < 208 && local26 < 208 && local42 >= 0 && local50 >= 0 && local42 < 208 && local50 < 208 && local58 != 65535) {
				local26 = local26 * 64;
				local36 = local36 * 64;
				local50 = local50 * 64;
				local165 = new Class12_Sub4(local58, Static134.anInt3147, local36, local26, Static212.method3261(local36, local26, Static134.anInt3147) - local66, local78 - -Static103.anInt2511, Static103.anInt2511 + local82, local88, local92, local54, local74);
				local42 = local42 * 64;
				local165.method1234(local42, local78 + Static103.anInt2511, Static212.method3261(local42, local50, Static134.anInt3147) + -local74, local50);
				Static150.aClass108_13.method3334(new Class2_Sub2_Sub3(local165));
			}
		} else if (Static211.anInt4701 == 135) {
			local18 = Static204.aClass2_Sub3_Sub1_3.method181();
			local26 = (local18 & 0x7) + Static135.anInt3148;
			local36 = Static107.anInt2598 + (local18 >> 4 & 0x7);
			local42 = Static204.aClass2_Sub3_Sub1_3.method164();
			local50 = Static204.aClass2_Sub3_Sub1_3.method211();
			local54 = Static204.aClass2_Sub3_Sub1_3.method211();
			if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104 && local50 != Static195.anInt4428) {
				@Pc(255) Class12_Sub7 local255 = new Class12_Sub7();
				local255.anInt2383 = local54;
				local255.anInt2384 = local42;
				if (Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26] == null) {
					Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26] = new Class108();
				}
				Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26].method3334(new Class2_Sub2_Sub23(local255));
				Static27.method1632(local36, local26);
			}
		} else if (Static211.anInt4701 == 173) {
			local18 = Static204.aClass2_Sub3_Sub1_3.method209();
			local26 = Static135.anInt3148 + (local18 & 0x7);
			local36 = (local18 >> 4 & 0x7) + Static107.anInt2598;
			local42 = Static204.aClass2_Sub3_Sub1_3.method163();
			local50 = Static204.aClass2_Sub3_Sub1_3.method209();
			local54 = Static204.aClass2_Sub3_Sub1_3.method163();
			if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104) {
				local36 = local36 * 128 + 64;
				local26 = local26 * 128 + 64;
				@Pc(381) Class12_Sub1 local381 = new Class12_Sub1(local42, Static134.anInt3147, local36, local26, Static212.method3261(local36, local26, Static134.anInt3147) - local50, local54, Static103.anInt2511);
				Static38.aClass108_2.method3334(new Class2_Sub2_Sub27(local381));
			}
		} else if (Static211.anInt4701 == 232) {
			local18 = Static204.aClass2_Sub3_Sub1_3.method209();
			local26 = (local18 & 0x7) + Static135.anInt3148;
			local36 = (local18 >> 4 & 0x7) + Static107.anInt2598;
			local42 = Static204.aClass2_Sub3_Sub1_3.method163();
			local50 = Static204.aClass2_Sub3_Sub1_3.method163();
			local54 = Static204.aClass2_Sub3_Sub1_3.method163();
			if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104) {
				@Pc(448) Class108 local448 = Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26];
				if (local448 != null) {
					for (@Pc(455) Class2_Sub2_Sub23 local455 = (Class2_Sub2_Sub23) local448.method3322(); local455 != null; local455 = (Class2_Sub2_Sub23) local448.method3331()) {
						@Pc(460) Class12_Sub7 local460 = local455.aClass12_Sub7_1;
						if ((local42 & 0x7FFF) == local460.anInt2384 && local460.anInt2383 == local50) {
							local460.anInt2383 = local54;
							break;
						}
					}
					Static27.method1632(local36, local26);
				}
			}
		} else if (Static211.anInt4701 == 44) {
			local18 = Static204.aClass2_Sub3_Sub1_3.method209();
			local36 = local18 >> 2;
			local26 = local18 & 0x3;
			local42 = Static85.anIntArray211[local36];
			local50 = Static204.aClass2_Sub3_Sub1_3.method164();
			local54 = Static204.aClass2_Sub3_Sub1_3.method181();
			local58 = Static107.anInt2598 + (local54 >> 4 & 0x7);
			local66 = Static135.anInt3148 + (local54 & 0x7);
			if (local58 >= 0 && local66 >= 0 && local58 < 104 && local66 < 104) {
				Static195.method3062(0, local66, local42, local26, -1, local36, Static134.anInt3147, local58, local50);
			}
		} else if (Static211.anInt4701 == 171) {
			local18 = Static204.aClass2_Sub3_Sub1_3.method181();
			local26 = local18 & 0x3;
			local36 = local18 >> 2;
			local42 = Static85.anIntArray211[local36];
			local50 = Static204.aClass2_Sub3_Sub1_3.method205();
			if (local50 == 65535) {
				local50 = -1;
			}
			local54 = Static204.aClass2_Sub3_Sub1_3.method214();
			local58 = (local54 >> 4 & 0x7) + Static107.anInt2598;
			local66 = Static135.anInt3148 + (local54 & 0x7);
			Static99.method1711(local36, local58, local42, local26, Static134.anInt3147, local66, local50);
		} else {
			if (Static211.anInt4701 == 61) {
				local18 = Static204.aClass2_Sub3_Sub1_3.method163();
				local36 = Static204.aClass2_Sub3_Sub1_3.method157();
				local26 = local36 >> 2;
				local42 = local36 & 0x3;
				local50 = Static85.anIntArray211[local26];
				local54 = Static204.aClass2_Sub3_Sub1_3.method163();
				@Pc(648) byte local648 = Static204.aClass2_Sub3_Sub1_3.method165();
				@Pc(652) byte local652 = Static204.aClass2_Sub3_Sub1_3.method197();
				@Pc(656) byte local656 = Static204.aClass2_Sub3_Sub1_3.method186();
				@Pc(662) byte local662 = Static204.aClass2_Sub3_Sub1_3.method197();
				local82 = Static204.aClass2_Sub3_Sub1_3.method163();
				local88 = Static204.aClass2_Sub3_Sub1_3.method209();
				@Pc(676) int local676 = Static135.anInt3148 + (local88 & 0x7);
				local92 = (local88 >> 4 & 0x7) + Static107.anInt2598;
				@Pc(688) int local688 = Static204.aClass2_Sub3_Sub1_3.method211();
				@Pc(699) Class12_Sub3_Sub1 local699;
				if (Static195.anInt4428 == local18) {
					local699 = Static213.aClass12_Sub3_Sub1_1;
				} else {
					local699 = aClass12_Sub3_Sub1Array1[local18];
				}
				if (local699 != null) {
					@Pc(709) Class2_Sub2_Sub14 local709 = Static168.method2705(local54);
					@Pc(723) int local723;
					@Pc(720) int local720;
					if (local42 == 1 || local42 == 3) {
						local720 = local709.anInt3040;
						local723 = local709.anInt3050;
					} else {
						local723 = local709.anInt3040;
						local720 = local709.anInt3050;
					}
					@Pc(737) int local737 = (local723 >> 1) + local92;
					@Pc(745) int local745 = local92 + (local723 + 1 >> 1);
					@Pc(751) int local751 = (local720 >> 1) + local676;
					@Pc(759) int local759 = (local720 + 1 >> 1) + local676;
					@Pc(763) int[][] local763 = Static56.anIntArrayArrayArray7[Static134.anInt3147];
					@Pc(771) int local771 = (local723 << 6) + (local92 << 7);
					@Pc(797) int local797 = local763[local745][local759] + local763[local745][local751] + local763[local737][local751] + local763[local737][local759] >> 2;
					@Pc(805) int local805 = (local720 << 6) + (local676 << 7);
					@Pc(807) int[][] local807 = null;
					if (Static134.anInt3147 < 3) {
						local807 = Static56.anIntArrayArrayArray7[Static134.anInt3147 + 1];
					}
					@Pc(830) Class2_Sub2_Sub21 local830 = local709.method2119(local26, local807, local763, local771, false, local805, local42, local797);
					if (local830 != null) {
						Static195.method3062(local82 + 1, local676, local50, 0, local688 + 1, 0, Static134.anInt3147, local92, -1);
						local699.anInt1213 = local797;
						local699.anInt1210 = Static103.anInt2511 + local82;
						local699.anInt1212 = local720 * 64 + local676 * 128;
						local699.aClass12_Sub2_1 = (Class12_Sub2) local830.aClass12_8;
						local699.anInt1222 = local92 * 128 + local723 * 64;
						@Pc(887) byte local887;
						if (local652 > local656) {
							local887 = local652;
							local652 = local656;
							local656 = local887;
						}
						local699.anInt1217 = local652 + local92;
						local699.anInt1200 = local656 + local92;
						if (local648 < local662) {
							local887 = local662;
							local662 = local648;
							local648 = local887;
						}
						local699.anInt1198 = local676 + local662;
						local699.anInt1201 = local676 + local648;
						local699.anInt1215 = Static103.anInt2511 + local688;
					}
				}
			}
			if (Static211.anInt4701 == 99) {
				local18 = Static204.aClass2_Sub3_Sub1_3.method209();
				local26 = (local18 & 0x7) + Static135.anInt3148;
				local36 = (local18 >> 4 & 0x7) + Static107.anInt2598;
				local42 = Static204.aClass2_Sub3_Sub1_3.method211();
				local50 = Static204.aClass2_Sub3_Sub1_3.method164();
				if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104) {
					@Pc(977) Class12_Sub7 local977 = new Class12_Sub7();
					local977.anInt2383 = local50;
					local977.anInt2384 = local42;
					if (Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26] == null) {
						Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26] = new Class108();
					}
					Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26].method3334(new Class2_Sub2_Sub23(local977));
					Static27.method1632(local36, local26);
				}
			} else if (Static211.anInt4701 == 150) {
				local18 = Static204.aClass2_Sub3_Sub1_3.method209();
				local36 = Static107.anInt2598 + (local18 >> 4 & 0x7);
				local26 = (local18 & 0x7) + Static135.anInt3148;
				local42 = local36 + Static204.aClass2_Sub3_Sub1_3.method186();
				local50 = Static204.aClass2_Sub3_Sub1_3.method186() + local26;
				local54 = Static204.aClass2_Sub3_Sub1_3.method196();
				local58 = Static204.aClass2_Sub3_Sub1_3.method163();
				local66 = Static204.aClass2_Sub3_Sub1_3.method209() * 4;
				local74 = Static204.aClass2_Sub3_Sub1_3.method209() * 4;
				local78 = Static204.aClass2_Sub3_Sub1_3.method163();
				local82 = Static204.aClass2_Sub3_Sub1_3.method163();
				local88 = Static204.aClass2_Sub3_Sub1_3.method209();
				local92 = Static204.aClass2_Sub3_Sub1_3.method209();
				if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104 && local42 >= 0 && local50 >= 0 && local42 < 104 && local50 < 104 && local58 != 65535) {
					local36 = local36 * 128 + 64;
					local50 = local50 * 128 + 64;
					local42 = local42 * 128 + 64;
					local26 = local26 * 128 + 64;
					local165 = new Class12_Sub4(local58, Static134.anInt3147, local36, local26, Static212.method3261(local36, local26, Static134.anInt3147) - local66, Static103.anInt2511 + local78, local82 + Static103.anInt2511, local88, local92, local54, local74);
					local165.method1234(local42, local78 + Static103.anInt2511, Static212.method3261(local42, local50, Static134.anInt3147) + -local74, local50);
					Static150.aClass108_13.method3334(new Class2_Sub2_Sub3(local165));
				}
			} else if (Static211.anInt4701 == 198) {
				local18 = Static204.aClass2_Sub3_Sub1_3.method181();
				local36 = Static107.anInt2598 + (local18 >> 4 & 0x7);
				local26 = (local18 & 0x7) + Static135.anInt3148;
				local42 = Static204.aClass2_Sub3_Sub1_3.method164();
				if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104) {
					@Pc(1258) Class108 local1258 = Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26];
					if (local1258 != null) {
						for (@Pc(1265) Class2_Sub2_Sub23 local1265 = (Class2_Sub2_Sub23) local1258.method3322(); local1265 != null; local1265 = (Class2_Sub2_Sub23) local1258.method3331()) {
							if ((local42 & 0x7FFF) == local1265.aClass12_Sub7_1.anInt2384) {
								local1265.method3314();
								break;
							}
						}
						if (local1258.method3322() == null) {
							Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local36][local26] = null;
						}
						Static27.method1632(local36, local26);
					}
				}
			} else if (Static211.anInt4701 == 75) {
				local18 = Static204.aClass2_Sub3_Sub1_3.method209();
				local36 = local18 >> 2;
				local42 = Static85.anIntArray211[local36];
				local26 = local18 & 0x3;
				local50 = Static204.aClass2_Sub3_Sub1_3.method157();
				local58 = Static135.anInt3148 + (local50 & 0x7);
				local54 = Static107.anInt2598 + (local50 >> 4 & 0x7);
				if (local54 >= 0 && local58 >= 0 && local54 < 104 && local58 < 104) {
					Static195.method3062(0, local58, local42, local26, -1, local36, Static134.anInt3147, local54, -1);
				}
			} else if (Static211.anInt4701 == 52) {
				local18 = Static204.aClass2_Sub3_Sub1_3.method209();
				local26 = Static135.anInt3148 + (local18 & 0x7);
				local36 = Static107.anInt2598 + (local18 >> 4 & 0x7);
				local42 = Static204.aClass2_Sub3_Sub1_3.method163();
				local50 = Static204.aClass2_Sub3_Sub1_3.method209();
				if (local42 == 65535) {
					local42 = -1;
				}
				local58 = local50 & 0x7;
				local66 = Static204.aClass2_Sub3_Sub1_3.method209();
				local54 = local50 >> 4 & 0xF;
				if (local36 >= 0 && local26 >= 0 && local36 < 104 && local26 < 104) {
					local74 = local54 + 1;
					if (Static213.aClass12_Sub3_Sub1_1.anIntArray412[0] >= local36 - local74 && local36 + local74 >= Static213.aClass12_Sub3_Sub1_1.anIntArray412[0] && local26 - local74 <= Static213.aClass12_Sub3_Sub1_1.anIntArray414[0] && Static213.aClass12_Sub3_Sub1_1.anIntArray414[0] <= local26 + local74 && Static198.anInt4450 != 0 && local58 > 0 && Static156.anInt3673 < 50 && local42 != -1) {
						Static23.anIntArray46[Static156.anInt3673] = local42;
						Static96.anIntArray238[Static156.anInt3673] = local58;
						Static7.anIntArray14[Static156.anInt3673] = local66;
						Static210.aClass24Array1[Static156.anInt3673] = null;
						Static130.anIntArray409[Static156.anInt3673] = (local36 << 16) + (local26 << 8) + local54;
						Static156.anInt3673++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method3292(@OriginalArg(0) Class12_Sub3 arg0) {
		arg0.anInt3935 = arg0.anInt3934;
		if (arg0.anInt3960 == 0) {
			arg0.anInt3937 = 0;
			return;
		}
		if (arg0.anInt3910 != -1 && arg0.anInt3965 == 0) {
			@Pc(35) Class2_Sub2_Sub9 local35 = Static14.method299(arg0.anInt3910);
			if (arg0.anInt3962 > 0 && local35.anInt2350 == 0) {
				arg0.anInt3937++;
				return;
			}
			if (arg0.anInt3962 <= 0 && local35.anInt2348 == 0) {
				arg0.anInt3937++;
				return;
			}
		}
		@Pc(70) int local70 = arg0.anInt3961;
		@Pc(85) int local85 = arg0.anInt3932 * 64 + arg0.anIntArray412[arg0.anInt3960 - 1] * 128;
		@Pc(88) int local88 = arg0.anInt3949;
		@Pc(103) int local103 = arg0.anIntArray414[arg0.anInt3960 - 1] * 128 + arg0.anInt3932 * 64;
		if (local85 - local70 > 256 || local85 - local70 < -256 || local103 - local88 > 256 || local103 - local88 < -256) {
			arg0.anInt3961 = local85;
			arg0.anInt3949 = local103;
			return;
		}
		if (local70 >= local85) {
			if (local85 >= local70) {
				if (local103 > local88) {
					arg0.anInt3947 = 1024;
				} else if (local103 < local88) {
					arg0.anInt3947 = 0;
				}
			} else if (local88 < local103) {
				arg0.anInt3947 = 768;
			} else if (local103 >= local88) {
				arg0.anInt3947 = 512;
			} else {
				arg0.anInt3947 = 256;
			}
		} else if (local88 < local103) {
			arg0.anInt3947 = 1280;
		} else if (local103 < local88) {
			arg0.anInt3947 = 1792;
		} else {
			arg0.anInt3947 = 1536;
		}
		@Pc(217) int local217 = arg0.anInt3951;
		@Pc(226) int local226 = arg0.anInt3947 - arg0.anInt3916 & 0x7FF;
		if (local226 > 1024) {
			local226 -= 2048;
		}
		if (local226 >= -256 && local226 <= 256) {
			local217 = arg0.anInt3922;
		} else if (local226 >= 256 && local226 < 768) {
			local217 = arg0.anInt3950;
		} else if (local226 >= -768 && local226 <= -256) {
			local217 = arg0.anInt3915;
		}
		if (local217 == -1) {
			local217 = arg0.anInt3922;
		}
		@Pc(278) int local278 = 4;
		@Pc(280) boolean local280 = true;
		arg0.anInt3935 = local217;
		if (arg0 instanceof Class12_Sub3_Sub2) {
			local280 = ((Class12_Sub3_Sub2) arg0).aClass2_Sub2_Sub12_1.aBoolean142;
		}
		if (local280) {
			if (arg0.anInt3947 != arg0.anInt3916 && arg0.anInt3943 == -1 && arg0.anInt3931 != 0) {
				local278 = 2;
			}
			if (arg0.anInt3960 > 2) {
				local278 = 6;
			}
			if (arg0.anInt3960 > 3) {
				local278 = 8;
			}
			if (arg0.anInt3937 > 0 && arg0.anInt3960 > 1) {
				local278 = 8;
				arg0.anInt3937--;
			}
		} else {
			if (arg0.anInt3960 > 1) {
				local278 = 6;
			}
			if (arg0.anInt3960 > 2) {
				local278 = 8;
			}
			if (arg0.anInt3937 > 0 && arg0.anInt3960 > 1) {
				local278 = 8;
				arg0.anInt3937--;
			}
		}
		if (arg0.aBooleanArray19[arg0.anInt3960 - 1]) {
			local278 <<= 0x1;
		}
		if (local85 > local70) {
			arg0.anInt3961 += local278;
			if (arg0.anInt3961 > local85) {
				arg0.anInt3961 = local85;
			}
		} else if (local85 < local70) {
			arg0.anInt3961 -= local278;
			if (local85 > arg0.anInt3961) {
				arg0.anInt3961 = local85;
			}
		}
		if (local278 >= 8 && arg0.anInt3922 == arg0.anInt3935 && arg0.anInt3933 != -1) {
			arg0.anInt3935 = arg0.anInt3933;
		}
		if (local103 > local88) {
			arg0.anInt3949 += local278;
			if (local103 < arg0.anInt3949) {
				arg0.anInt3949 = local103;
			}
		} else if (local103 < local88) {
			arg0.anInt3949 -= local278;
			if (local103 > arg0.anInt3949) {
				arg0.anInt3949 = local103;
			}
		}
		if (local85 != arg0.anInt3961 || arg0.anInt3949 != local103) {
			return;
		}
		arg0.anInt3960--;
		if (arg0.anInt3962 > 0) {
			arg0.anInt3962--;
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[B)V")
	public static void method3293(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		local10.anInt239 = arg0.length - 2;
		Static154.anInt3619 = local10.method163();
		Static60.anIntArray498 = new int[Static154.anInt3619];
		Static102.aByteArrayArray6 = new byte[Static154.anInt3619][];
		Static120.anIntArray310 = new int[Static154.anInt3619];
		Static219.anIntArray501 = new int[Static154.anInt3619];
		Static89.anIntArray224 = new int[Static154.anInt3619];
		local10.anInt239 = arg0.length - Static154.anInt3619 * 8 - 7;
		Static14.anInt415 = local10.method163();
		Static114.anInt2772 = local10.method163();
		@Pc(64) int local64 = (local10.method209() & 0xFF) + 1;
		for (@Pc(66) int local66 = 0; local66 < Static154.anInt3619; local66++) {
			Static219.anIntArray501[local66] = local10.method163();
		}
		for (@Pc(90) int local90 = 0; local90 < Static154.anInt3619; local90++) {
			Static120.anIntArray310[local90] = local10.method163();
		}
		for (@Pc(104) int local104 = 0; local104 < Static154.anInt3619; local104++) {
			Static89.anIntArray224[local104] = local10.method163();
		}
		for (@Pc(120) int local120 = 0; local120 < Static154.anInt3619; local120++) {
			Static60.anIntArray498[local120] = local10.method163();
		}
		local10.anInt239 = arg0.length - Static154.anInt3619 * 8 - (local64 + -1) * 3 - 7;
		Static25.anIntArray494 = new int[local64];
		for (@Pc(154) int local154 = 1; local154 < local64; local154++) {
			Static25.anIntArray494[local154] = local10.method166();
			if (Static25.anIntArray494[local154] == 0) {
				Static25.anIntArray494[local154] = 1;
			}
		}
		local10.anInt239 = 0;
		for (@Pc(183) int local183 = 0; local183 < Static154.anInt3619; local183++) {
			@Pc(189) int local189 = Static60.anIntArray498[local183];
			@Pc(193) int local193 = Static89.anIntArray224[local183];
			@Pc(197) int local197 = local189 * local193;
			@Pc(200) byte[] local200 = new byte[local197];
			Static102.aByteArrayArray6[local183] = local200;
			@Pc(208) int local208 = local10.method209();
			@Pc(215) int local215;
			if (local208 == 0) {
				for (local215 = 0; local215 < local197; local215++) {
					local200[local215] = local10.method186();
				}
			} else if (local208 == 1) {
				for (local215 = 0; local215 < local193; local215++) {
					for (@Pc(242) int local242 = 0; local242 < local189; local242++) {
						local200[local242 * local193 + local215] = local10.method186();
					}
				}
			}
		}
	}
}
