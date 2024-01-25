import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!il;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "Lclient!iq;")
	public static Class104 aClass104_53;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Lclient!lq;")
	public static final Class129 aClass129_2 = new Class129();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BILjava/awt/Component;Lclient!sc;I)Lclient!il;")
	public static Class88 method1590(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class179 arg2, @OriginalArg(4) int arg3) {
		if (Static36.anInt551 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class88 local31 = (Class88) Class.forName("Class88_Sub1").getDeclaredConstructor().newInstance();
			local31.anInt3031 = arg3;
			local31.anIntArray244 = new int[(Static226.aBoolean429 ? 2 : 1) * 256];
			local31.method2717(arg1);
			local31.anInt3036 = (arg3 & 0xFFFFFC00) + 1024;
			if (local31.anInt3036 > 16384) {
				local31.anInt3036 = 16384;
			}
			local31.method2716(local31.anInt3036);
			if (Static308.anInt6110 > 0 && Static9.aClass149_1 == null) {
				Static9.aClass149_1 = new Class149();
				Static9.aClass149_1.aClass179_6 = arg2;
				arg2.method4875(Static308.anInt6110, Static9.aClass149_1);
			}
			if (Static9.aClass149_1 != null) {
				if (Static9.aClass149_1.aClass88Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static9.aClass149_1.aClass88Array1[arg0] = local31;
			}
			return local31;
		} catch (@Pc(101) Throwable local101) {
			try {
				@Pc(107) Class88_Sub2 local107 = new Class88_Sub2(arg2, arg0);
				local107.anInt3031 = arg3;
				local107.anIntArray244 = new int[(Static226.aBoolean429 ? 2 : 1) * 256];
				local107.method2717(arg1);
				local107.anInt3036 = 16384;
				local107.method2716(local107.anInt3036);
				if (Static308.anInt6110 > 0 && Static9.aClass149_1 == null) {
					Static9.aClass149_1 = new Class149();
					Static9.aClass149_1.aClass179_6 = arg2;
					arg2.method4875(Static308.anInt6110, Static9.aClass149_1);
				}
				if (Static9.aClass149_1 != null) {
					if (Static9.aClass149_1.aClass88Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static9.aClass149_1.aClass88Array1[arg0] = local107;
				}
				return local107;
			} catch (@Pc(171) Throwable local171) {
				return new Class88();
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!mf;Lclient!dc;)V")
	public static void method1591(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class51 arg1) {
		if (!arg1.aBoolean99) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort23;
		@Pc(9) short local9 = arg1.aShort22;
		@Pc(12) byte local12 = arg1.aByte10;
		@Pc(15) byte local15 = arg1.aByte9;
		@Pc(21) int local21 = (local6 << Static325.anInt6336) + Static31.anInt496;
		@Pc(27) int local27 = (local9 << Static325.anInt6336) + Static31.anInt496;
		@Pc(31) Class51[][] local31 = Static196.aClass51ArrayArrayArray3[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static121.aClass105Array3 == Static9.aClass105Array1) {
			local40 = Static26.anIntArrayArray35[local6][local9];
			Static145.aClass37_8.method3730(Static101.aClass105Array2[0].method4452(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static145.aClass37_8.method3662(3000.0F, local58 * 1.5F);
		@Pc(621) Class57_Sub5 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class51 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class57_Sub5 local382;
		@Pc(413) int local413;
		@Pc(416) Class1_Sub1 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean100) {
			if (Static251.aBoolean456) {
				if (local12 > 0) {
					local91 = Static196.aClass51ArrayArrayArray3[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean99) {
						return;
					}
				}
				if (local6 <= Static250.anInt5229 && local6 > Static360.anInt6859) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean99 && (local91.aBoolean100 || (arg1.aByte7 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static250.anInt5229 && local6 < Static275.anInt5641 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean99 && (local91.aBoolean100 || (arg1.aByte7 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static328.anInt6686 && local9 > Static174.anInt5316) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean99 && (local91.aBoolean100 || (arg1.aByte7 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static328.anInt6686 && local9 < Static51.anInt874 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean99 && (local91.aBoolean100 || (arg1.aByte7 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static251.aBoolean456 = true;
			}
			arg1.aBoolean100 = false;
			if (arg1.aClass51_1 != null) {
				local91 = arg1.aClass51_1;
				Static145.aClass37_8.method3662(3000.0F, (201.5F - (float) (local91.aByte9 + 1) * 50.0F) * 1.5F);
				if (!Static118.method2302(local91.aByte9, local6, local9)) {
					Static9.aClass105Array1[local91.aByte9].method4444(local6, local9);
				}
				@Pc(254) Class1_Sub1 local254 = local91.aClass1_Sub1_2;
				if (local254 != null) {
					if (Static74.aBoolean316) {
						if ((local254.anInt5239 & arg1.aShort21) == 0) {
							Static140.method2709(arg0, local12, local6, local9);
						} else {
							Static279.method3543(arg0, local254.anInt5239, local15, local6, local9);
						}
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					local254.method5758(Static145.aClass37_8);
				}
				for (@Pc(291) Class11 local291 = local91.aClass11_2; local291 != null; local291 = local291.aClass11_1) {
					@Pc(295) Class1_Sub2 local295 = local291.aClass1_Sub2_1;
					if (local295 != null) {
						if (Static74.aBoolean316) {
							Static140.method2709(arg0, local12, local6, local9);
							Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
						}
						local295.method5758(Static145.aClass37_8);
					}
				}
				Static145.aClass37_8.method3662(3000.0F, local58 * 1.5F);
			}
			local335 = !Static118.method2302(local15, local6, local9);
			if (local335) {
				Static9.aClass105Array1[local15].method4444(local6, local9);
				@Pc(346) Class1_Sub4 local346 = arg1.aClass1_Sub4_1;
				if (local346 != null && local346.aBoolean587) {
					if (local346.aBoolean586) {
						Static145.aClass37_8.method3662(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					local382 = local346.method5758(Static145.aClass37_8);
					if (local382 != null) {
						local382.aClass1_1 = local346;
						local382.anInt3961 = local12;
						local382.anInt3962 = local6;
						local382.anInt3963 = local9;
						Static45.aClass193_4.method5222(local382);
					}
					if (local346.aBoolean586) {
						Static145.aClass37_8.method3662(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass1_Sub1_2;
			@Pc(419) Class1_Sub3 local419 = arg1.aClass1_Sub3_2;
			if (local416 != null || local419 != null) {
				if (Static250.anInt5229 == local6) {
					local411++;
				} else if (Static250.anInt5229 < local6) {
					local411 += 2;
				}
				if (Static328.anInt6686 == local9) {
					local411 += 3;
				} else if (Static328.anInt6686 > local9) {
					local411 += 6;
				}
				local413 = Static110.anIntArray184[local411];
				arg1.aShort21 = Static55.aShortArray18[local411];
			}
			if (local416 != null) {
				if ((local416.anInt5239 & Static195.anIntArray321[local411]) == 0) {
					arg1.aByte12 = 0;
				} else if (local416.anInt5239 == 16) {
					arg1.aByte12 = 3;
					arg1.aByte8 = Static48.aByteArray48[local411];
					arg1.aByte13 = (byte) (3 - arg1.aByte8);
				} else if (local416.anInt5239 == 32) {
					arg1.aByte12 = 6;
					arg1.aByte8 = Static232.aByteArray69[local411];
					arg1.aByte13 = (byte) (6 - arg1.aByte8);
				} else if (local416.anInt5239 == 64) {
					arg1.aByte12 = 12;
					arg1.aByte8 = Static309.aByteArray86[local411];
					arg1.aByte13 = (byte) (12 - arg1.aByte8);
				} else {
					arg1.aByte12 = 9;
					arg1.aByte8 = Static352.aByteArray91[local411];
					arg1.aByte13 = (byte) (9 - arg1.aByte8);
				}
				if ((local416.anInt5239 & local413) != 0 && !method1595(local15, local6, local9, local416.anInt5239)) {
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					@Pc(568) Class57_Sub5 local568 = local416.method5758(Static145.aClass37_8);
					if (local568 != null) {
						local568.aClass1_1 = local416;
						local568.anInt3961 = local12;
						local568.anInt3962 = local6;
						local568.anInt3963 = local9;
						Static45.aClass193_4.method5222(local568);
					}
				}
				@Pc(589) Class1_Sub1 local589 = arg1.aClass1_Sub1_1;
				if (local589 != null && (local589.anInt5239 & local413) != 0 && !method1595(local15, local6, local9, local589.anInt5239)) {
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					local621 = local589.method5758(Static145.aClass37_8);
					if (local621 != null) {
						local621.aClass1_1 = local589;
						local621.anInt3961 = local12;
						local621.anInt3962 = local6;
						local621.anInt3963 = local9;
						Static45.aClass193_4.method5222(local621);
					}
				}
			}
			if (local419 != null && !Static209.method5783(local15, local6, local9, local419.method4509())) {
				@Pc(652) Class1_Sub3 local652 = arg1.aClass1_Sub3_1;
				Static145.aClass37_8.method3662(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5323 & local413) != 0) {
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					local621 = local419.method5758(Static145.aClass37_8);
					if (local621 != null) {
						local621.aClass1_1 = local419;
						local621.anInt3961 = local12;
						local621.anInt3962 = local6;
						local621.anInt3963 = local9;
						Static45.aClass193_4.method5222(local621);
					}
				} else if (local419.anInt5323 == 256) {
					local711 = local419.anInt5325 - Static353.anInt5915;
					local716 = local419.anInt5321 - Static84.anInt1566;
					local719 = local419.anInt5317;
					if (local719 == 1 || local719 == 2) {
						local728 = -local711;
					} else {
						local728 = local711;
					}
					if (local719 == 2 || local719 == 3) {
						local740 = -local716;
					} else {
						local740 = local716;
					}
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					@Pc(764) Class57_Sub5 local764;
					if (local740 < local728) {
						local764 = local419.method5758(Static145.aClass37_8);
						if (local764 != null) {
							local764.aClass1_1 = local419;
							local764.anInt3961 = local12;
							local764.anInt3962 = local6;
							local764.anInt3963 = local9;
							Static45.aClass193_4.method5222(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5758(Static145.aClass37_8);
						if (local764 != null) {
							local764.aClass1_1 = local652;
							local764.anInt3961 = local12;
							local764.anInt3962 = local6;
							local764.anInt3963 = local9;
							Static45.aClass193_4.method5222(local764);
						}
					}
				}
				Static145.aClass37_8.method3662(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class1_Sub4 local819 = arg1.aClass1_Sub4_1;
				if (local819 != null && !local819.aBoolean587) {
					if (local819.aBoolean586) {
						Static145.aClass37_8.method3662(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					local621 = local819.method5758(Static145.aClass37_8);
					if (local621 != null) {
						local621.aClass1_1 = local819;
						local621.anInt3961 = local12;
						local621.anInt3962 = local6;
						local621.anInt3963 = local9;
						Static45.aClass193_4.method5222(local621);
					}
					if (local819.aBoolean586) {
						Static145.aClass37_8.method3662(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class1_Sub5 local885 = arg1.aClass1_Sub5_1;
				if (local885 != null && !local885.aBoolean548) {
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					@Pc(908) Class57_Sub5 local908 = local885.method5758(Static145.aClass37_8);
					if (local908 != null) {
						local908.aClass1_1 = local885;
						local908.anInt3961 = local12;
						local908.anInt3962 = local6;
						local908.anInt3963 = local9;
						Static45.aClass193_4.method5222(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte7;
			if (local929 != 0) {
				@Pc(946) Class51 local946;
				if (local6 < Static250.anInt5229 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean99) {
						Static328.aClass80_29.method3929(local946);
					}
				}
				if (local9 < Static328.anInt6686 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean99) {
						Static328.aClass80_29.method3929(local946);
					}
				}
				if (local6 > Static250.anInt5229 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean99) {
						Static328.aClass80_29.method3929(local946);
					}
				}
				if (local9 > Static328.anInt6686 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean99) {
						Static328.aClass80_29.method3929(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class1_Sub1 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class11 local1035;
		if (arg1.aByte12 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass11_2; local1035 != null; local1035 = local1035.aClass11_1) {
				if (local1035.aClass1_Sub2_1.anInt6890 != Static2.anInt57 && (local1035.anInt217 & arg1.aByte12) == arg1.aByte8) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass1_Sub1_2;
				if (!method1595(local15, local6, local9, local1062.anInt5239)) {
					if (Static74.aBoolean316) {
						label687: {
							if (local1062.anInt5239 >= 16) {
								local1079 = local6 - Static250.anInt5229;
								local1083 = local9 - Static328.anInt6686;
								if (local1062.anInt5239 == 16) {
									local1079 -= Static31.anInt496;
									local1083 += Static31.anInt496;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static63.anInt1129) {
										Static140.method2709(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5239 == 32) {
									local1079 += Static31.anInt496;
									local1083 += Static31.anInt496;
									if (local1083 < -local1079 && local6 < Static344.anInt6692 && local9 < Static63.anInt1129) {
										Static140.method2709(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5239 == 64) {
									local1079 += Static31.anInt496;
									local1083 -= Static31.anInt496;
									if (local1083 > local1079 && local6 < Static344.anInt6692 && local9 > 0) {
										Static140.method2709(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt5239 == 128) {
									local1079 -= Static31.anInt496;
									local1083 -= Static31.anInt496;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static140.method2709(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static140.method2709(arg0, local12, local6, local9);
						}
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					@Pc(1221) Class57_Sub5 local1221 = local1062.method5758(Static145.aClass37_8);
					if (local1221 != null) {
						local1221.aClass1_1 = local1062;
						local1221.anInt3961 = local12;
						local1221.anInt3962 = local6;
						local1221.anInt3963 = local9;
						Static45.aClass193_4.method5222(local1221);
					}
				}
				arg1.aByte12 = 0;
			}
		}
		@Pc(1338) int local1338;
		if (arg1.aBoolean98) {
			try {
				arg1.aBoolean98 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass11_2; local1035 != null; local1035 = local1035.aClass11_1) {
					@Pc(1257) Class1_Sub2 local1257 = local1035.aClass1_Sub2_1;
					if (local1257.anInt6890 != Static2.anInt57) {
						for (local1079 = local1257.aShort89; local1079 <= local1257.aShort88; local1079++) {
							for (local1083 = local1257.aShort90; local1083 <= local1257.aShort87; local1083++) {
								@Pc(1275) Class51 local1275 = local31[local1079][local1083];
								if (local1275.aBoolean100) {
									arg1.aBoolean98 = true;
									continue label630;
								}
								if (local1275.aByte12 != 0) {
									local711 = 0;
									if (local1079 > local1257.aShort89) {
										local711++;
									}
									if (local1079 < local1257.aShort88) {
										local711 += 4;
									}
									if (local1083 > local1257.aShort90) {
										local711 += 8;
									}
									if (local1083 < local1257.aShort87) {
										local711 += 2;
									}
									if ((local711 & local1275.aByte12) == arg1.aByte13) {
										arg1.aBoolean98 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static250.anInt5229 - local1257.aShort89;
						local1338 = local1257.aShort88 - Static250.anInt5229;
						if (local1338 > local1083) {
							local1083 = local1338;
						}
						local711 = Static328.anInt6686 - local1257.aShort90;
						local716 = local1257.aShort87 - Static328.anInt6686;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass1_Sub2Array4[local40] = local1257;
						arg0.anIntArray342[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1389) Class1_Sub2 local1389;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1389 = arg0.aClass1_Sub2Array4[local1083];
						if (local1389.anInt6890 != Static2.anInt57) {
							local711 = arg0.anIntArray342[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1389.anInt6893 - Static353.anInt5915;
								local719 = local1389.anInt6888 - Static84.anInt1566;
								local728 = arg0.aClass1_Sub2Array4[local1079].anInt6893 - Static353.anInt5915;
								local740 = arg0.aClass1_Sub2Array4[local1079].anInt6888 - Static84.anInt1566;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1389 = arg0.aClass1_Sub2Array4[local1079];
					local1389.anInt6890 = Static2.anInt57;
					if (!Static275.method4758(local15, local1389.aShort89, local1389.aShort88, local1389.aShort90, local1389.aShort87, local1389.method5766())) {
						if (Static74.aBoolean316) {
							if (local1389.aByte76 == 0) {
								Static25.method331(arg0, local12, local1389.aShort89, local1389.aShort90, local1389.aShort88, local1389.aShort87);
							} else {
								Static140.method2709(arg0, local12, local6, local9);
								local711 = local6 - Static250.anInt5229;
								local716 = local9 - Static328.anInt6686;
								if (local1389.aByte76 == 2) {
									if (local716 > -local711) {
										Static75.method1564(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static75.method1564(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static75.method1564(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static75.method1564(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
						}
						local621 = local1389.method5758(Static145.aClass37_8);
						if (local621 != null) {
							local621.aClass1_1 = local1389;
							local621.anInt3961 = local12;
							local621.anInt3962 = local1389.aShort89;
							local621.anInt3963 = local1389.aShort90;
							Static45.aClass193_4.method5222(local621);
						}
					}
					for (local711 = local1389.aShort89; local711 <= local1389.aShort88; local711++) {
						for (local716 = local1389.aShort90; local716 <= local1389.aShort87; local716++) {
							@Pc(1614) Class51 local1614 = local31[local711][local716];
							if (local1614.aByte12 != 0) {
								Static328.aClass80_29.method3929(local1614);
							} else if ((local711 != local6 || local716 != local9) && local1614.aBoolean99) {
								Static328.aClass80_29.method3929(local1614);
							}
						}
					}
				}
				if (arg1.aBoolean98) {
					return;
				}
			} catch (@Pc(1652) Exception local1652) {
				arg1.aBoolean98 = false;
			}
		}
		if (arg1.aClass214_1 != null) {
			if (arg1.aByte11 == (byte) (Static250.anInt5230 & 0xFF)) {
				@Pc(1669) Class214 local1669 = arg1.aClass214_1;
				local411 = Static9.aClass105Array1[local12].method4453(local6, local9);
				if (local12 < Static32.anInt516 - 1) {
					local413 = Static9.aClass105Array1[local12].method4453(local6, local9) - Static9.aClass105Array1[local12 + 1].method4453(local6, local9);
				} else {
					local413 = 1024;
				}
				Static299.aClass38_5.method4478(local21, local411, local27, arg0.anIntArray343);
				local1079 = arg0.anIntArray343[2];
				Static299.aClass38_5.method4478(local21, local411 - local413, local27, arg0.anIntArray343);
				local1083 = arg0.anIntArray343[2];
				local1338 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1338 = local1083;
					local711 = local1079;
				}
				local1338 -= Static312.anInt6196;
				local711 += Static312.anInt6196;
				if (local1338 < local711 - 1597) {
					local1338 = local711 - 1597;
				}
				local1669.anInt6765 = local1338;
				local1669.anInt6764 = local711;
				local1669.aBoolean603 = true;
				Static145.aClass37_8.method3743(local1669);
			} else {
				arg1.aClass214_1 = null;
			}
		}
		if (!arg1.aBoolean99) {
			return;
		}
		if (arg1.aByte12 != 0) {
			return;
		}
		if (local6 <= Static250.anInt5229 && local6 > Static360.anInt6859) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean99) {
				return;
			}
		}
		if (local6 >= Static250.anInt5229 && local6 < Static275.anInt5641 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean99) {
				return;
			}
		}
		if (local9 <= Static328.anInt6686 && local9 > Static174.anInt5316) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean99) {
				return;
			}
		}
		if (local9 >= Static328.anInt6686 && local9 < Static51.anInt874 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean99) {
				return;
			}
		}
		arg1.aBoolean99 = false;
		Static179.anInt3996--;
		@Pc(1871) Class1_Sub5 local1871 = arg1.aClass1_Sub5_1;
		if (local1871 != null && local1871.aBoolean548) {
			if (Static74.aBoolean316) {
				Static140.method2709(arg0, local12, local6, local9);
				Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
			}
			@Pc(1894) Class57_Sub5 local1894 = local1871.method5758(Static145.aClass37_8);
			if (local1894 != null) {
				local1894.aClass1_1 = local1871;
				local1894.anInt3961 = local12;
				local1894.anInt3962 = local6;
				local1894.anInt3963 = local9;
				Static45.aClass193_4.method5222(local1894);
			}
		}
		if (arg1.aShort21 != 0) {
			@Pc(1918) Class1_Sub3 local1918 = arg1.aClass1_Sub3_2;
			if (local1918 != null && !Static209.method5783(local15, local6, local9, local1918.method4509())) {
				if ((local1918.anInt5323 & arg1.aShort21) != 0) {
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					local382 = local1918.method5758(Static145.aClass37_8);
					if (local382 != null) {
						local382.aClass1_1 = local1918;
						local382.anInt3961 = local12;
						local382.anInt3962 = local6;
						local382.anInt3963 = local9;
						Static45.aClass193_4.method5222(local382);
					}
				} else if (local1918.anInt5323 == 256) {
					local413 = local1918.anInt5325 - Static353.anInt5915;
					local1079 = local1918.anInt5321 - Static84.anInt1566;
					local1083 = local1918.anInt5317;
					if (local1083 == 1 || local1083 == 2) {
						local1338 = -local413;
					} else {
						local1338 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static74.aBoolean316) {
						Static140.method2709(arg0, local12, local6, local9);
						Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
					}
					@Pc(2028) Class1_Sub3 local2028 = arg1.aClass1_Sub3_1;
					@Pc(2036) Class57_Sub5 local2036;
					if (local711 > local1338) {
						local2036 = local1918.method5758(Static145.aClass37_8);
						if (local2036 != null) {
							local2036.aClass1_1 = local1918;
							local2036.anInt3961 = local12;
							local2036.anInt3962 = local6;
							local2036.anInt3963 = local9;
							Static45.aClass193_4.method5222(local2036);
						}
					} else if (local2028 != null) {
						local2036 = local2028.method5758(Static145.aClass37_8);
						if (local2036 != null) {
							local2036.aClass1_1 = local2028;
							local2036.anInt3961 = local12;
							local2036.anInt3962 = local6;
							local2036.anInt3963 = local9;
							Static45.aClass193_4.method5222(local2036);
						}
					}
				}
			}
			local1062 = arg1.aClass1_Sub1_2;
			local416 = arg1.aClass1_Sub1_1;
			@Pc(2121) Class57_Sub5 local2121;
			if (local416 != null && (local416.anInt5239 & arg1.aShort21) != 0 && !method1595(local15, local6, local9, local416.anInt5239)) {
				if (Static74.aBoolean316) {
					Static279.method3543(arg0, local416.anInt5239, local12, local6, local9);
					Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
				}
				local2121 = local416.method5758(Static145.aClass37_8);
				if (local2121 != null) {
					local2121.aClass1_1 = local416;
					local2121.anInt3961 = local12;
					local2121.anInt3962 = local6;
					local2121.anInt3963 = local9;
					Static45.aClass193_4.method5222(local2121);
				}
			}
			if (local1062 != null && (local1062.anInt5239 & arg1.aShort21) != 0 && !method1595(local15, local6, local9, local1062.anInt5239)) {
				if (Static74.aBoolean316) {
					Static279.method3543(arg0, local1062.anInt5239, local12, local6, local9);
					Static145.aClass37_8.method3652(arg0.anInt4637, arg0.aClass2_Sub10_Sub1Array4);
				}
				local2121 = local1062.method5758(Static145.aClass37_8);
				if (local2121 != null) {
					local2121.aClass1_1 = local1062;
					local2121.anInt3961 = local12;
					local2121.anInt3962 = local6;
					local2121.anInt3963 = local9;
					Static45.aClass193_4.method5222(local2121);
				}
			}
		}
		@Pc(2207) Class51 local2207;
		if (local12 < Static32.anInt516 - 1) {
			local2207 = Static196.aClass51ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2207 != null && local2207.aBoolean99) {
				Static328.aClass80_29.method3930(local2207);
			}
		}
		if (local6 < Static250.anInt5229) {
			local2207 = local31[local6 + 1][local9];
			if (local2207 != null && local2207.aBoolean99) {
				Static328.aClass80_29.method3929(local2207);
			}
		}
		if (local9 < Static328.anInt6686) {
			local2207 = local31[local6][local9 + 1];
			if (local2207 != null && local2207.aBoolean99) {
				Static328.aClass80_29.method3929(local2207);
			}
		}
		if (local6 > Static250.anInt5229) {
			local2207 = local31[local6 - 1][local9];
			if (local2207 != null && local2207.aBoolean99) {
				Static328.aClass80_29.method3929(local2207);
			}
		}
		if (local9 > Static328.anInt6686) {
			local2207 = local31[local6][local9 - 1];
			if (local2207 != null && local2207.aBoolean99) {
				Static328.aClass80_29.method3929(local2207);
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBII)V")
	public static void method1592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static108.anInt2266 <= arg3 - arg2 && Static205.anInt4504 >= arg2 + arg3 && Static197.anInt4298 <= arg0 - arg2 && arg0 + arg2 <= Static38.anInt553) {
			Static346.method5009(arg0, arg3, arg1, arg2);
		} else {
			Static321.method1018(arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	public static void method1594() {
		Static231.method4259((long) Static6.anInt91, Static51.aClass37_1);
		if (Static269.anInt6658 != -1) {
			Static94.method1859(Static269.anInt6658);
		}
		for (@Pc(27) int local27 = 0; local27 < Static236.anInt928; local27++) {
			if (Static269.aBooleanArray29[local27]) {
				Static286.aBooleanArray25[local27] = true;
			}
			Static286.aBooleanArray24[local27] = Static269.aBooleanArray29[local27];
			Static269.aBooleanArray29[local27] = false;
		}
		Static328.anInt6687 = Static6.anInt91;
		if (Static51.aClass37_1.method3738()) {
			Static236.aBoolean94 = true;
		}
		if (Static269.anInt6658 != -1) {
			Static236.anInt928 = 0;
			Static269.method5576();
		}
		Static51.aClass37_1.method3709();
		Static32.method441(Static128.anInt2760);
		Static170.anInt5086 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)Z")
	private static boolean method1595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static118.method2302(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static325.anInt6336;
		@Pc(14) int local14 = arg2 << Static325.anInt6336;
		@Pc(23) int local23 = Static9.aClass105Array1[arg0].method4453(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static353.anInt5915) {
				if (!Static283.method4806(local10, local23, local14)) {
					return false;
				}
				if (!Static283.method4806(local10, local23, local14 + Static6.anInt96)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static283.method4806(local10, local27, local14)) {
					return false;
				}
				if (!Static283.method4806(local10, local27, local14 + Static6.anInt96)) {
					return false;
				}
			}
			if (Static283.method4806(local10, local31, local14)) {
				return Static283.method4806(local10, local31, local14 + Static6.anInt96);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static84.anInt1566) {
				if (!Static283.method4806(local10, local23, local14 + Static6.anInt96)) {
					return false;
				}
				if (!Static283.method4806(local10 + Static6.anInt96, local23, local14 + Static6.anInt96)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static283.method4806(local10, local27, local14 + Static6.anInt96)) {
					return false;
				}
				if (!Static283.method4806(local10 + Static6.anInt96, local27, local14 + Static6.anInt96)) {
					return false;
				}
			}
			if (Static283.method4806(local10, local31, local14 + Static6.anInt96)) {
				return Static283.method4806(local10 + Static6.anInt96, local31, local14 + Static6.anInt96);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static353.anInt5915) {
				if (!Static283.method4806(local10 + Static6.anInt96, local23, local14)) {
					return false;
				}
				if (!Static283.method4806(local10 + Static6.anInt96, local23, local14 + Static6.anInt96)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static283.method4806(local10 + Static6.anInt96, local27, local14)) {
					return false;
				}
				if (!Static283.method4806(local10 + Static6.anInt96, local27, local14 + Static6.anInt96)) {
					return false;
				}
			}
			if (Static283.method4806(local10 + Static6.anInt96, local31, local14)) {
				return Static283.method4806(local10 + Static6.anInt96, local31, local14 + Static6.anInt96);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static84.anInt1566) {
				if (!Static283.method4806(local10, local23, local14)) {
					return false;
				}
				if (!Static283.method4806(local10 + Static6.anInt96, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static283.method4806(local10, local27, local14)) {
					return false;
				}
				if (!Static283.method4806(local10 + Static6.anInt96, local27, local14)) {
					return false;
				}
			}
			if (Static283.method4806(local10, local31, local14)) {
				return Static283.method4806(local10 + Static6.anInt96, local31, local14);
			} else {
				return false;
			}
		} else if (!Static283.method4806(local10 + Static31.anInt496, local35, local14 + Static31.anInt496)) {
			return false;
		} else if (arg3 == 16) {
			return Static283.method4806(local10, local31, local14 + Static6.anInt96);
		} else if (arg3 == 32) {
			return Static283.method4806(local10 + Static6.anInt96, local31, local14 + Static6.anInt96);
		} else if (arg3 == 64) {
			return Static283.method4806(local10 + Static6.anInt96, local31, local14);
		} else if (arg3 == 128) {
			return Static283.method4806(local10, local31, local14);
		} else {
			return true;
		}
	}
}
