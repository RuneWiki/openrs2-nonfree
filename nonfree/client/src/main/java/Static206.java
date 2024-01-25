import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	public static int anInt3592;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_63 = new Class231("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!nd;Z)V")
	public static void method3219(@OriginalArg(0) Class175 arg0) {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		if (arg0 == Static449.aClass175_19) {
			local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
			local21 = Static416.anInt4774 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static30.anInt501;
			local31 = Static55.aClass6_Sub15_Sub1_1.method3108();
			local35 = Static55.aClass6_Sub15_Sub1_1.method3108();
			local39 = Static55.aClass6_Sub15_Sub1_1.method3108();
			if (Static23.aClass137_4 != null && local21 >= 0 && local27 >= 0 && Static84.anInt1632 > local21 && local27 < Static261.anInt4480) {
				@Pc(72) Class6_Sub12 local72 = (Class6_Sub12) Static23.aClass137_4.method3175((long) (local21 | local27 << 14 | Static412.anInt6899 << 28));
				if (local72 != null) {
					for (@Pc(80) Class6_Sub42 local80 = (Class6_Sub42) local72.aClass88_21.method1882(); local80 != null; local80 = (Class6_Sub42) local72.aClass88_21.method1891()) {
						if ((local31 & 0x7FFF) == local80.anInt6905 && local35 == local80.anInt6907) {
							local80.method5977();
							local80.anInt6907 = local39;
							Static398.method5442(local21, local27, Static412.anInt6899, local80);
							break;
						}
					}
					Static316.method5796(local21, local27, Static412.anInt6899);
				}
			}
		} else if (Static56.aClass175_3 == arg0) {
			local12 = Static55.aClass6_Sub15_Sub1_1.method3131();
			local21 = (local12 >> 4 & 0x7) + Static416.anInt4774;
			local27 = Static30.anInt501 + (local12 & 0x7);
			local31 = Static55.aClass6_Sub15_Sub1_1.method3108();
			local35 = Static55.aClass6_Sub15_Sub1_1.method3097();
			if (local21 >= 0 && local27 >= 0 && Static84.anInt1632 > local21 && Static261.anInt4480 > local27) {
				Static398.method5442(local21, local27, Static412.anInt6899, new Class6_Sub42(local31, local35));
				Static316.method5796(local21, local27, Static412.anInt6899);
			}
		} else {
			@Pc(220) int local220;
			@Pc(244) int local244;
			@Pc(250) int local250;
			@Pc(252) int local252;
			if (arg0 == Static322.aClass175_16) {
				local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local21 = Static416.anInt4774 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static30.anInt501;
				local31 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local35 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local39 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local220 = Static55.aClass6_Sub15_Sub1_1.method3111();
				if (local21 >= 0 && local27 >= 0 && local21 < Static84.anInt1632 && Static261.anInt4480 > local27) {
					local244 = local21 * 128 + 64;
					local250 = local27 * 128 + 64;
					local252 = Static412.anInt6899;
					if (local252 < 3 && Static132.method2150(local21, local27)) {
						local252++;
					}
					@Pc(286) Class3_Sub3_Sub5 local286 = new Class3_Sub3_Sub5(local31, local39, Static125.anInt2225, Static412.anInt6899, local252, local244, Static165.method2689(local244, Static412.anInt6899, local250) - local35, local250, local21, local21, local27, local27, local220);
					Static205.aClass88_15.method1878(new Class6_Sub1_Sub7(local286));
				}
			} else if (Static178.aClass175_2 == arg0) {
				local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local21 = Static416.anInt4774 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static30.anInt501;
				local31 = Static55.aClass6_Sub15_Sub1_1.method3108();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local39 = local35 >> 4 & 0xF;
				local220 = local35 & 0x7;
				local244 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local250 = Static55.aClass6_Sub15_Sub1_1.method3111();
				if (local21 >= 0 && local27 >= 0 && Static84.anInt1632 > local21 && local27 < Static261.anInt4480) {
					local252 = local39 + 1;
					if (Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0] >= local21 - local252 && Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0] <= local252 + local21 && Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0] >= local27 - local252 && Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0] <= local27 + local252) {
						Static183.method4961(local31, local220, local244, local39 + (local27 << 8) + (Static412.anInt6899 << 24) + (local21 << 16), local250);
					}
				}
			} else if (Static61.aClass175_4 == arg0) {
				local12 = Static55.aClass6_Sub15_Sub1_1.method3131();
				local21 = local12 >> 2;
				local27 = local12 & 0x3;
				local31 = Static55.aClass6_Sub15_Sub1_1.method3126();
				local35 = Static55.aClass6_Sub15_Sub1_1.method3097();
				local39 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local220 = (local39 >> 4 & 0x7) + Static416.anInt4774;
				local244 = Static30.anInt501 + (local39 & 0x7);
				local250 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local252 = Static55.aClass6_Sub15_Sub1_1.method3132();
				@Pc(475) byte local475 = Static55.aClass6_Sub15_Sub1_1.method3104();
				@Pc(479) byte local479 = Static55.aClass6_Sub15_Sub1_1.method3077();
				@Pc(483) byte local483 = Static55.aClass6_Sub15_Sub1_1.method3116();
				@Pc(491) byte local491 = Static55.aClass6_Sub15_Sub1_1.method3104();
				if (!Static44.aClass28_14.method3481()) {
					Static374.method5184(local491, local21, local250, local483, local475, Static412.anInt6899, local220, local27, local244, local31, local35, local479, local252);
				}
			} else if (Static361.aClass175_17 == arg0) {
				Static55.aClass6_Sub15_Sub1_1.method3111();
				local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local21 = Static416.anInt4774 + (local12 >> 4 & 0x7);
				local27 = Static30.anInt501 + (local12 & 0x7);
				local31 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local35 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local39 = Static55.aClass6_Sub15_Sub1_1.method3078();
				@Pc(557) String local557 = Static55.aClass6_Sub15_Sub1_1.method3093();
				Static396.method5418(local557, local21, Static412.anInt6899, local27, local31, local35, local39);
			} else if (arg0 == Static302.aClass175_15) {
				local12 = Static55.aClass6_Sub15_Sub1_1.method3101();
				local21 = Static55.aClass6_Sub15_Sub1_1.method3086();
				local27 = Static416.anInt4774 + (local21 >> 4 & 0x7);
				local31 = (local21 & 0x7) + Static30.anInt501;
				if (local27 >= 0 && local31 >= 0 && local27 < Static84.anInt1632 && Static261.anInt4480 > local31) {
					@Pc(632) Class6_Sub12 local632 = (Class6_Sub12) Static23.aClass137_4.method3175((long) (local27 | local31 << 14 | Static412.anInt6899 << 28));
					if (local632 != null) {
						for (@Pc(640) Class6_Sub42 local640 = (Class6_Sub42) local632.aClass88_21.method1882(); local640 != null; local640 = (Class6_Sub42) local632.aClass88_21.method1891()) {
							if ((local12 & 0x7FFF) == local640.anInt6905) {
								local640.method5977();
								break;
							}
						}
						if (local632.aClass88_21.method1888()) {
							local632.method5977();
						}
						Static316.method5796(local27, local31, Static412.anInt6899);
					}
				}
			} else if (arg0 == Static373.aClass175_7) {
				local12 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local21 = Static55.aClass6_Sub15_Sub1_1.method3111();
				Static113.aClass127_2.method2820(local12).method2712(local21);
			} else {
				@Pc(769) int local769;
				@Pc(773) int local773;
				@Pc(777) int local777;
				@Pc(781) int local781;
				@Pc(735) boolean local735;
				if (Static442.aClass175_18 == arg0) {
					local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
					local21 = (local12 >> 4 & 0xF) + Static416.anInt4774 * 2;
					local27 = (local12 & 0xF) + Static30.anInt501 * 2;
					local735 = Static55.aClass6_Sub15_Sub1_1.method3111() != 0;
					local35 = Static55.aClass6_Sub15_Sub1_1.method3116() + local21;
					local39 = local27 + Static55.aClass6_Sub15_Sub1_1.method3116();
					local220 = Static55.aClass6_Sub15_Sub1_1.method3103();
					local244 = Static55.aClass6_Sub15_Sub1_1.method3103();
					local250 = Static55.aClass6_Sub15_Sub1_1.method3108();
					@Pc(763) byte local763 = Static55.aClass6_Sub15_Sub1_1.method3116();
					local769 = Static55.aClass6_Sub15_Sub1_1.method3111() * 4;
					local773 = Static55.aClass6_Sub15_Sub1_1.method3108();
					local777 = Static55.aClass6_Sub15_Sub1_1.method3108();
					local781 = Static55.aClass6_Sub15_Sub1_1.method3111();
					@Pc(785) int local785 = Static55.aClass6_Sub15_Sub1_1.method3111();
					if (local781 == 255) {
						local781 = -1;
					}
					if (local21 >= 0 && local27 >= 0 && local21 < Static84.anInt1632 * 2 && local27 < Static84.anInt1632 * 2 && local35 >= 0 && local39 >= 0 && Static261.anInt4480 * 2 > local35 && local39 < Static261.anInt4480 * 2 && local250 != 65535) {
						local27 = local27 * 64;
						local252 = local763 << 0;
						local769 <<= 0x0;
						local39 = local39 * 64;
						local21 = local21 * 64;
						local35 = local35 * 64;
						if (local220 != 0) {
							@Pc(882) int local882;
							@Pc(887) Class3_Sub3_Sub6 local887;
							@Pc(872) int local872;
							@Pc(876) int local876;
							if (local220 < 0) {
								local872 = -local220 - 1;
								local876 = local872 & 0x7FF;
								local882 = local872 >> 11 & 0xF;
								if (Static251.anInt4268 == local876) {
									local887 = Static134.aClass3_Sub3_Sub6_Sub1_1;
								} else {
									local887 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local876];
								}
							} else {
								local872 = local220 - 1;
								local882 = local872 >> 11 & 0xF;
								local876 = local872 & 0x7FF;
								local887 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local876];
							}
							if (local887 != null) {
								@Pc(919) Class208 local919 = local887.method5511();
								if (local919.anIntArrayArray48 != null && local919.anIntArrayArray48[local882] != null) {
									local876 = local919.anIntArrayArray48[local882][0];
									@Pc(941) int local941 = local919.anIntArrayArray48[local882][2];
									@Pc(946) int local946 = local887.aClass191_7.method4332();
									@Pc(950) int local950 = Class6_Sub1_Sub18.anIntArray642[local946];
									@Pc(954) int local954 = Class6_Sub1_Sub18.anIntArray643[local946];
									@Pc(964) int local964 = local876 * local954 + local941 * local950 >> 15;
									@Pc(974) int local974 = local954 * local941 - local950 * local876 >> 15;
									local252 -= local919.anIntArrayArray48[local882][1];
									local21 += local964;
									local27 += local974;
								}
							}
						}
						@Pc(1014) Class3_Sub3_Sub4 local1014 = new Class3_Sub3_Sub4(local250, Static412.anInt6899, local21, local27, local252, local773 + Static125.anInt2225, Static125.anInt2225 + local777, local781, local785, local244, local769, local735);
						local1014.method3908(Static125.anInt2225 + local773, Static165.method2689(local35, Static412.anInt6899, local39) - local769, local39, local35);
						Static439.aClass88_46.method1878(new Class6_Sub1_Sub9(local1014));
					}
				} else if (Static188.aClass175_12 == arg0) {
					local12 = Static55.aClass6_Sub15_Sub1_1.method3097();
					local21 = Static55.aClass6_Sub15_Sub1_1.method3126();
					local27 = Static55.aClass6_Sub15_Sub1_1.method3110();
					local31 = Static416.anInt4774 + (local27 >> 4 & 0x7);
					local35 = Static30.anInt501 + (local27 & 0x7);
					local39 = Static55.aClass6_Sub15_Sub1_1.method3097();
					if (local31 >= 0 && local35 >= 0 && local31 < Static84.anInt1632 && Static261.anInt4480 > local35 && local39 != Static251.anInt4268) {
						Static398.method5442(local31, local35, Static412.anInt6899, new Class6_Sub42(local12, local21));
						Static316.method5796(local31, local35, Static412.anInt6899);
					}
				} else {
					@Pc(1289) Class3_Sub3_Sub4 local1289;
					if (arg0 == Static269.aClass175_14) {
						local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
						@Pc(1136) boolean local1136 = (local12 & 0x80) != 0;
						local27 = (local12 >> 3 & 0x7) + Static416.anInt4774;
						local31 = Static30.anInt501 + (local12 & 0x7);
						local35 = local27 + Static55.aClass6_Sub15_Sub1_1.method3116();
						local39 = Static55.aClass6_Sub15_Sub1_1.method3116() + local31;
						local220 = Static55.aClass6_Sub15_Sub1_1.method3103();
						local244 = Static55.aClass6_Sub15_Sub1_1.method3108();
						local250 = Static55.aClass6_Sub15_Sub1_1.method3111() * 4;
						local252 = Static55.aClass6_Sub15_Sub1_1.method3111() * 4;
						local769 = Static55.aClass6_Sub15_Sub1_1.method3108();
						local773 = Static55.aClass6_Sub15_Sub1_1.method3108();
						local777 = Static55.aClass6_Sub15_Sub1_1.method3111();
						local781 = Static55.aClass6_Sub15_Sub1_1.method3111();
						if (local777 == 255) {
							local777 = -1;
						}
						if (local27 >= 0 && local31 >= 0 && local27 < Static84.anInt1632 && Static261.anInt4480 > local31 && local35 >= 0 && local39 >= 0 && Static84.anInt1632 > local35 && local39 < Static261.anInt4480 && local244 != 65535) {
							local27 = local27 * 128 + 64;
							local252 <<= 0x0;
							local250 <<= 0x0;
							local35 = local35 * 128 + 64;
							local31 = local31 * 128 + 64;
							local39 = local39 * 128 + 64;
							local1289 = new Class3_Sub3_Sub4(local244, Static412.anInt6899, local27, local31, local250, local769 + Static125.anInt2225, Static125.anInt2225 + local773, local777, local781, local220, local252, local1136);
							local1289.method3908(Static125.anInt2225 + local769, -local252 + Static165.method2689(local35, Static412.anInt6899, local39), local39, local35);
							Static439.aClass88_46.method1878(new Class6_Sub1_Sub9(local1289));
						}
					} else if (Static78.aClass175_5 == arg0) {
						local12 = Static55.aClass6_Sub15_Sub1_1.method3131();
						local21 = Static416.anInt4774 + (local12 >> 4 & 0x7);
						local27 = Static30.anInt501 + (local12 & 0x7);
						local31 = Static55.aClass6_Sub15_Sub1_1.method3110();
						local35 = local31 >> 2;
						local39 = local31 & 0x3;
						local220 = Static125.anIntArray233[local35];
						if (Static79.method1462(Static261.anInt4478) || local21 >= 0 && local27 >= 0 && local21 < Static84.anInt1632 && Static261.anInt4480 > local27) {
							Static409.method5586(Static412.anInt6899, local21, local35, local27, -1, local220, local39);
						}
					} else if (arg0 == Static158.aClass175_11) {
						local12 = Static55.aClass6_Sub15_Sub1_1.method3111();
						local21 = Static416.anInt4774 * 2 + (local12 >> 4 & 0xF);
						local27 = (local12 & 0xF) + Static30.anInt501 * 2;
						local735 = Static55.aClass6_Sub15_Sub1_1.method3111() != 0;
						local35 = local21 + Static55.aClass6_Sub15_Sub1_1.method3116();
						local39 = local27 + Static55.aClass6_Sub15_Sub1_1.method3116();
						local220 = Static55.aClass6_Sub15_Sub1_1.method3103();
						local244 = Static55.aClass6_Sub15_Sub1_1.method3108();
						local250 = Static55.aClass6_Sub15_Sub1_1.method3111() * 4;
						local252 = Static55.aClass6_Sub15_Sub1_1.method3111() * 4;
						local769 = Static55.aClass6_Sub15_Sub1_1.method3108();
						local773 = Static55.aClass6_Sub15_Sub1_1.method3108();
						local777 = Static55.aClass6_Sub15_Sub1_1.method3111();
						local781 = Static55.aClass6_Sub15_Sub1_1.method3111();
						if (local777 == 255) {
							local777 = -1;
						}
						if (local21 >= 0 && local27 >= 0 && Static84.anInt1632 * 2 > local21 && local27 < Static84.anInt1632 * 2 && local35 >= 0 && local39 >= 0 && local35 < Static261.anInt4480 * 2 && Static261.anInt4480 * 2 > local39 && local244 != 65535) {
							local35 *= 64;
							local250 <<= 0x0;
							local27 *= 64;
							local21 = local21 * 64;
							local39 = local39 * 64;
							local252 <<= 0x0;
							local1289 = new Class3_Sub3_Sub4(local244, Static412.anInt6899, local21, local27, local250, Static125.anInt2225 + local769, Static125.anInt2225 + local773, local777, local781, local220, local252, local735);
							local1289.method3908(Static125.anInt2225 + local769, Static165.method2689(local35, Static412.anInt6899, local39) + -local252, local39, local35);
							Static439.aClass88_46.method1878(new Class6_Sub1_Sub9(local1289));
						}
					} else if (Static258.aClass175_13 == arg0) {
						local12 = Static55.aClass6_Sub15_Sub1_1.method3108();
						if (local12 == 65535) {
							local12 = -1;
						}
						local21 = Static55.aClass6_Sub15_Sub1_1.method3131();
						local27 = local21 >> 2;
						local31 = local21 & 0x3;
						local35 = Static125.anIntArray233[local27];
						local39 = Static55.aClass6_Sub15_Sub1_1.method3111();
						local220 = (local39 >> 4 & 0x7) + Static416.anInt4774;
						local244 = (local39 & 0x7) + Static30.anInt501;
						Static87.method1530(local27, Static412.anInt6899, local31, local35, local220, local12, local244);
					} else if (Static135.aClass175_8 == arg0) {
						local12 = Static55.aClass6_Sub15_Sub1_1.method3086();
						local21 = local12 >> 2;
						local27 = local12 & 0x3;
						local31 = Static125.anIntArray233[local21];
						local35 = Static55.aClass6_Sub15_Sub1_1.method3110();
						local39 = (local35 >> 4 & 0x7) + Static416.anInt4774;
						local220 = Static30.anInt501 + (local35 & 0x7);
						local244 = Static55.aClass6_Sub15_Sub1_1.method3126();
						if (Static79.method1462(Static261.anInt4478) || local39 >= 0 && local220 >= 0 && Static84.anInt1632 > local39 && local220 < Static261.anInt4480) {
							Static409.method5586(Static412.anInt6899, local39, local21, local220, local244, local31, local27);
						}
					} else {
						Static40.method799(null, "T3 - " + arg0);
						Static44.method825();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!lt;)V")
	public static void method3221(@OriginalArg(1) Class158 arg0) {
		Static77.anInt1540 = arg0.method3677("p11_full");
		Static429.anInt7139 = arg0.method3677("p12_full");
		Static137.anInt2448 = arg0.method3677("b12_full");
		Static328.anInt5546 = arg0.method3677("hitmarks");
		Static360.anInt6058 = arg0.method3677("hitbar_default");
		Static367.anInt7090 = arg0.method3677("timerbar_default");
		Static384.anInt6341 = arg0.method3677("headicons_pk");
		Static394.anInt6532 = arg0.method3677("headicons_prayer");
		Static250.anInt4255 = arg0.method3677("hint_headicons");
		Static133.anInt2346 = arg0.method3677("hint_mapmarkers");
		Static73.anInt1498 = arg0.method3677("mapflag");
		Static56.anInt1175 = arg0.method3677("cross");
		Static1.anInt2 = arg0.method3677("mapdots");
		Static146.anInt2652 = arg0.method3677("scrollbar");
		Static363.anInt6127 = arg0.method3677("name_icons");
		Static130.anInt2322 = arg0.method3677("floorshadows");
		Static108.anInt1930 = arg0.method3677("compass");
		Static139.anInt3474 = arg0.method3677("otherlevel");
		Static376.anInt5183 = arg0.method3677("hint_mapedge");
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!tq;Lclient!qq;IB)V")
	public static void method3222(@OriginalArg(0) int arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class24 local10 = arg1.method5364(arg2);
		if (local10 == null) {
			return;
		}
		arg2.method3570(arg0, arg3, arg0 + arg1.anInt6435, arg1.anInt6408 + arg3);
		if (Static392.anInt6523 == 2 || Static392.anInt6523 == 5 || Static397.aClass12_18 == null) {
			arg2.method3582(local10, arg0, arg3);
			return;
		}
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(58) int local58;
		@Pc(50) int local50;
		if (Static9.anInt164 == 4) {
			local48 = Static375.anInt6234;
			local50 = 4096;
			local52 = Static45.anInt923;
			local58 = (int) -Static397.aFloat99 & 0x3FFF;
		} else {
			local48 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675;
			local58 = (int) -Static397.aFloat99 + Static71.anInt1484 & 0x3FFF;
			local52 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677;
			local50 = 4096 - Static393.anInt5623 * 16;
		}
		@Pc(93) int local93 = local48 / 32 + 48 + 208 - Static84.anInt1632 * 2;
		@Pc(110) int local110 = Static261.anInt4480 * 4 + 48 - local52 / 32 - (Static261.anInt4480 + -104) * 2;
		Static397.aClass12_18.method5653((float) arg0 + (float) arg1.anInt6435 / 2.0F, (float) arg1.anInt6408 / 2.0F + (float) arg3, (float) local93, (float) local110, local50, local58 << 2, local10, arg0, arg3);
		@Pc(161) int local161;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(193) int local193;
		for (@Pc(144) Class6_Sub44 local144 = (Class6_Sub44) Static193.aClass88_30.method1882(); local144 != null; local144 = (Class6_Sub44) Static193.aClass88_30.method1891()) {
			@Pc(149) int local149 = local144.anInt7027;
			local161 = (Static63.aClass267_2.anIntArray636[local149] >> 14 & 0x3FFF) - anInt3592;
			local171 = (Static63.aClass267_2.anIntArray636[local149] & 0x3FFF) - Static99.anInt1814;
			local182 = local161 * 4 + 2 - local48 / 32;
			local193 = local171 * 4 + 2 - local52 / 32;
			Static107.method1779(local182, local10, local193, arg0, Static63.aClass267_2.anIntArray637[local149], arg3, arg2, arg1);
		}
		for (local161 = 0; local161 < Static279.anInt4745; local161++) {
			local171 = Static113.anIntArray214[local161] * 4 + 2 - local48 / 32;
			local182 = Static193.anIntArray305[local161] * 4 + 2 - local52 / 32;
			@Pc(249) Class118 local249 = Static113.aClass127_2.method2820(Static221.anIntArray322[local161]);
			if (local249.anIntArray273 != null) {
				local249 = local249.method2718(Static71.aClass126_1);
				if (local249 == null || local249.anInt3024 == -1) {
					continue;
				}
			}
			Static107.method1779(local171, local10, local182, arg0, local249.anInt3024, arg3, arg2, arg1);
		}
		for (@Pc(289) Class6_Sub12 local289 = (Class6_Sub12) Static23.aClass137_4.method3181(); local289 != null; local289 = (Class6_Sub12) Static23.aClass137_4.method3182()) {
			local182 = (int) (local289.aLong217 >> 28 & 0x3L);
			if (Static451.anInt6251 == local182) {
				local193 = (int) (local289.aLong217 & 0x3FFFL) * 4 + 2 - local48 / 32;
				@Pc(333) int local333 = (int) (local289.aLong217 >> 14 & 0x3FFFL) * 4 + 2 - local52 / 32;
				Static31.method409(local10, Static344.aClass12Array16[0], local333, local193, arg0, arg1, arg3);
			}
		}
		@Pc(403) int local403;
		for (local182 = 0; local182 < Static147.anInt7038; local182++) {
			@Pc(361) Class3_Sub3_Sub6_Sub2 local361 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local182]];
			if (local361 != null && local361.method5527() && local361.aByte93 == Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93) {
				@Pc(375) Class17 local375 = local361.aClass17_1;
				if (local375 != null && local375.anIntArray26 != null) {
					local375 = local375.method288(Static71.aClass126_1);
				}
				if (local375 != null && local375.aBoolean21 && local375.aBoolean19) {
					local403 = local361.anInt6675 / 32 - local48 / 32;
					@Pc(413) int local413 = local361.anInt6677 / 32 - local52 / 32;
					if (local375.anInt339 == -1) {
						Static31.method409(local10, Static344.aClass12Array16[1], local413, local403, arg0, arg1, arg3);
					} else {
						Static107.method1779(local403, local10, local413, arg0, local375.anInt339, arg3, arg2, arg1);
					}
				}
			}
		}
		local193 = Static416.anInt4773;
		@Pc(449) int[] local449 = Static5.anIntArray3;
		@Pc(487) int local487;
		@Pc(497) int local497;
		@Pc(501) int local501;
		for (local403 = 0; local403 < local193; local403++) {
			@Pc(459) Class3_Sub3_Sub6_Sub1 local459 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local449[local403]];
			if (local459 != null && local459.method4693() && Static134.aClass3_Sub3_Sub6_Sub1_1 != local459 && Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 == local459.aByte93) {
				local487 = local459.anInt6675 / 32 - local48 / 32;
				local497 = local459.anInt6677 / 32 - local52 / 32;
				@Pc(499) boolean local499 = false;
				for (local501 = 0; local501 < Static165.anInt2940; local501++) {
					if (local459.aString48.equals(Static208.aStringArray24[local501]) && Static262.anIntArray399[local501] != 0) {
						local499 = true;
						break;
					}
				}
				@Pc(531) boolean local531 = false;
				for (@Pc(533) int local533 = 0; local533 < Static88.anInt1654; local533++) {
					if (local459.aString48.equals(Static41.aClass85Array1[local533].aString17)) {
						local531 = true;
						break;
					}
				}
				@Pc(557) boolean local557 = false;
				if (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5525 != 0 && local459.anInt5525 != 0 && local459.anInt5525 == Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5525) {
					local557 = true;
				}
				if (local459.aBoolean377) {
					Static31.method409(local10, Static344.aClass12Array16[6], local497, local487, arg0, arg1, arg3);
				} else if (local499) {
					Static31.method409(local10, Static344.aClass12Array16[3], local497, local487, arg0, arg1, arg3);
				} else if (local531) {
					Static31.method409(local10, Static344.aClass12Array16[5], local497, local487, arg0, arg1, arg3);
				} else if (local557) {
					Static31.method409(local10, Static344.aClass12Array16[4], local497, local487, arg0, arg1, arg3);
				} else {
					Static31.method409(local10, Static344.aClass12Array16[2], local497, local487, arg0, arg1, arg3);
				}
			}
		}
		@Pc(658) Class107[] local658 = Static190.aClass107Array1;
		@Pc(746) int local746;
		for (local487 = 0; local487 < local658.length; local487++) {
			@Pc(666) Class107 local666 = local658[local487];
			if (local666 != null && local666.anInt2681 != 0 && Static125.anInt2225 % 20 < 10) {
				@Pc(720) int local720;
				if (local666.anInt2681 == 1 && local666.anInt2683 >= 0 && Static450.aClass3_Sub3_Sub6_Sub2Array1.length > local666.anInt2683) {
					@Pc(699) Class3_Sub3_Sub6_Sub2 local699 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local666.anInt2683];
					if (local699 != null) {
						local501 = local699.anInt6675 / 32 - local48 / 32;
						local720 = local699.anInt6677 / 32 - local52 / 32;
						Static359.method5056(local10, local501, local666.anInt2690, 360000L, local720, arg3, arg0, arg1);
					}
				}
				if (local666.anInt2681 == 2) {
					local746 = local666.anInt2688 / 32 - local48 / 32;
					local501 = local666.anInt2684 / 32 - local52 / 32;
					@Pc(762) long local762 = (long) (local666.anInt2687 << 5);
					@Pc(766) long local766 = local762 * local762;
					Static359.method5056(local10, local746, local666.anInt2690, local766, local501, arg3, arg0, arg1);
				}
				if (local666.anInt2681 == 10 && local666.anInt2683 >= 0 && local666.anInt2683 < Static355.aClass3_Sub3_Sub6_Sub1Array1.length) {
					@Pc(803) Class3_Sub3_Sub6_Sub1 local803 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local666.anInt2683];
					if (local803 != null) {
						local501 = local803.anInt6675 / 32 - local48 / 32;
						local720 = local803.anInt6677 / 32 - local52 / 32;
						Static359.method5056(local10, local501, local666.anInt2690, 360000L, local720, arg3, arg0, arg1);
					}
				}
			}
		}
		if (Static9.anInt164 == 4) {
			return;
		}
		if (Static278.anInt4731 != 0) {
			local497 = Static278.anInt4731 * 4 + Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() * 2 + 2 - local48 / 32 - 2;
			local746 = Static58.anInt1221 * 4 + Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() * 2 + 2 - local52 / 32 - 2;
			Static31.method409(local10, Static357.aClass12Array17[Static305.aBoolean353 ? 1 : 0], local746, local497, arg0, arg1, arg3);
		}
		arg2.method3531(arg0 + arg1.anInt6435 / 2 - 1, -1, arg3 + arg1.anInt6408 / 2 - 1, 3, 3);
	}
}
