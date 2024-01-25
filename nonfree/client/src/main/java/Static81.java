import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public static int anInt1750;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!nh;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
	public static boolean aBoolean158;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_28 = new Class93("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
	public static final int[] anIntArray194 = new int[5];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method1818() {
		if (Static345.anInt664 == 0) {
			return;
		}
		try {
			if (++Static59.anInt1289 > 2000) {
				if (Static157.aClass173_1 != null) {
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
				}
				if (Static341.anInt6833 >= 1) {
					Static32.anInt582 = -5;
					Static345.anInt664 = 0;
					return;
				}
				if (Static256.anInt5074 == Static165.anInt3323) {
					Static256.anInt5074 = Static163.anInt1490;
				} else {
					Static256.anInt5074 = Static165.anInt3323;
				}
				Static345.anInt664 = 1;
				Static341.anInt6833++;
				Static59.anInt1289 = 0;
			}
			if (Static345.anInt664 == 1) {
				Static107.aClass193_2 = Static177.aClass168_2.method4848(Static85.aString19, Static256.anInt5074);
				Static345.anInt664 = 2;
			}
			@Pc(116) int local116;
			if (Static345.anInt664 == 2) {
				if (Static107.aClass193_2.anInt6293 == 2) {
					throw new IOException();
				}
				if (Static107.aClass193_2.anInt6293 != 1) {
					return;
				}
				Static157.aClass173_1 = new Class173((Socket) Static107.aClass193_2.anObject7, Static177.aClass168_2);
				Static107.aClass193_2 = null;
				Static157.aClass173_1.method5021(Static74.aClass2_Sub10_Sub1_2.anInt4807, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				local116 = Static157.aClass173_1.method5028();
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				if (local116 != 21) {
					Static32.anInt582 = local116;
					Static345.anInt664 = 0;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
					return;
				}
				Static345.anInt664 = 3;
			}
			if (Static345.anInt664 == 3) {
				if (Static157.aClass173_1.method5024() < 1) {
					return;
				}
				Static187.aStringArray32 = new String[Static157.aClass173_1.method5028()];
				Static345.anInt664 = 4;
			}
			if (Static345.anInt664 == 4) {
				if (Static157.aClass173_1.method5024() < Static187.aStringArray32.length * 8) {
					return;
				}
				Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
				Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, Static187.aStringArray32.length * 8);
				for (local116 = 0; local116 < Static187.aStringArray32.length; local116++) {
					Static187.aStringArray32[local116] = Static330.method5776(Static269.aClass2_Sub10_Sub1_3.method4447());
				}
				Static345.anInt664 = 0;
				Static32.anInt582 = 21;
				Static157.aClass173_1.method5027();
				Static157.aClass173_1 = null;
				return;
			}
		} catch (@Pc(220) IOException local220) {
			if (Static157.aClass173_1 != null) {
				Static157.aClass173_1.method5027();
				Static157.aClass173_1 = null;
			}
			if (Static341.anInt6833 >= 1) {
				Static345.anInt664 = 0;
				Static32.anInt582 = -4;
			} else {
				Static345.anInt664 = 1;
				Static341.anInt6833++;
				Static59.anInt1289 = 0;
				if (Static165.anInt3323 == Static256.anInt5074) {
					Static256.anInt5074 = Static163.anInt1490;
				} else {
					Static256.anInt5074 = Static165.anInt3323;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ol;Lclient!ak;)V")
	public static void method1820(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class8 arg1) {
		if (!arg1.aBoolean21) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort10;
		@Pc(9) short local9 = arg1.aShort11;
		@Pc(12) byte local12 = arg1.aByte4;
		@Pc(15) byte local15 = arg1.aByte7;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class8[][] local31 = Static275.aClass8ArrayArrayArray4[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static313.aClass73Array39 == Static301.aClass73Array31) {
			local40 = Static126.anIntArrayArray82[local6][local9];
			Static50.aClass4_5.method4254(Static265.aClass73Array44[0].method4932(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static50.aClass4_5.method4306(3000.0F, local58 * 1.5F);
		@Pc(621) Class55_Sub3 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class8 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class55_Sub3 local382;
		@Pc(413) int local413;
		@Pc(416) Class62_Sub4 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean22) {
			if (Static240.aBoolean420) {
				if (local12 > 0) {
					local91 = Static275.aClass8ArrayArrayArray4[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean21) {
						return;
					}
				}
				if (local6 <= Static250.anInt4943 && local6 > Static30.anInt551) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean21 && (local91.aBoolean22 || (arg1.aByte3 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static250.anInt4943 && local6 < Static282.anInt5713 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean21 && (local91.aBoolean22 || (arg1.aByte3 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static230.anInt4394 && local9 > Static156.anInt3176) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean21 && (local91.aBoolean22 || (arg1.aByte3 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static230.anInt4394 && local9 < Static301.anInt5009 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean21 && (local91.aBoolean22 || (arg1.aByte3 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static240.aBoolean420 = true;
			}
			arg1.aBoolean22 = false;
			if (arg1.aClass8_1 != null) {
				local91 = arg1.aClass8_1;
				Static50.aClass4_5.method4306(3000.0F, (201.5F - (float) (local91.aByte7 + 1) * 50.0F) * 1.5F);
				if (!Static39.method938(local91.aByte7, local6, local9)) {
					Static301.aClass73Array31[local91.aByte7].method4938(local6, local9);
				}
				@Pc(254) Class62_Sub4 local254 = local91.aClass62_Sub4_2;
				if (local254 != null) {
					if (Static299.aBoolean459) {
						if ((local254.anInt6405 & arg1.aShort12) == 0) {
							Static308.method4629(arg0, local12, local6, local9);
						} else {
							Static47.method1119(arg0, local254.anInt6405, local15, local6, local9);
						}
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					local254.method5568(Static50.aClass4_5);
				}
				for (@Pc(291) Class172 local291 = local91.aClass172_1; local291 != null; local291 = local291.aClass172_4) {
					@Pc(295) Class62_Sub1 local295 = local291.aClass62_Sub1_1;
					if (local295 != null) {
						if (Static299.aBoolean459) {
							Static308.method4629(arg0, local12, local6, local9);
							Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
						}
						local295.method5568(Static50.aClass4_5);
					}
				}
				Static50.aClass4_5.method4306(3000.0F, local58 * 1.5F);
			}
			local335 = !Static39.method938(local15, local6, local9);
			if (local335) {
				Static301.aClass73Array31[local15].method4938(local6, local9);
				@Pc(346) Class62_Sub3 local346 = arg1.aClass62_Sub3_1;
				if (local346 != null && local346.aBoolean263) {
					if (local346.aBoolean264) {
						Static50.aClass4_5.method4306(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					local382 = local346.method5568(Static50.aClass4_5);
					if (local382 != null) {
						local382.aClass62_1 = local346;
						local382.anInt3109 = local12;
						local382.anInt3103 = local6;
						local382.anInt3108 = local9;
						Static5.aClass67_7.method2100(local382);
					}
					if (local346.aBoolean264) {
						Static50.aClass4_5.method4306(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass62_Sub4_2;
			@Pc(419) Class62_Sub5 local419 = arg1.aClass62_Sub5_2;
			if (local416 != null || local419 != null) {
				if (Static250.anInt4943 == local6) {
					local411++;
				} else if (Static250.anInt4943 < local6) {
					local411 += 2;
				}
				if (Static230.anInt4394 == local9) {
					local411 += 3;
				} else if (Static230.anInt4394 > local9) {
					local411 += 6;
				}
				local413 = Static19.anIntArray27[local411];
				arg1.aShort12 = Static145.aShortArray114[local411];
			}
			if (local416 != null) {
				if ((local416.anInt6405 & Static187.anIntArray300[local411]) == 0) {
					arg1.aByte8 = 0;
				} else if (local416.anInt6405 == 16) {
					arg1.aByte8 = 3;
					arg1.aByte2 = Static135.aByteArray44[local411];
					arg1.aByte6 = (byte) (3 - arg1.aByte2);
				} else if (local416.anInt6405 == 32) {
					arg1.aByte8 = 6;
					arg1.aByte2 = Static277.aByteArray66[local411];
					arg1.aByte6 = (byte) (6 - arg1.aByte2);
				} else if (local416.anInt6405 == 64) {
					arg1.aByte8 = 12;
					arg1.aByte2 = Static281.aByteArray68[local411];
					arg1.aByte6 = (byte) (12 - arg1.aByte2);
				} else {
					arg1.aByte8 = 9;
					arg1.aByte2 = Static98.aByteArray38[local411];
					arg1.aByte6 = (byte) (9 - arg1.aByte2);
				}
				if ((local416.anInt6405 & local413) != 0 && !Static37.method860(local15, local6, local9, local416.anInt6405)) {
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					@Pc(568) Class55_Sub3 local568 = local416.method5568(Static50.aClass4_5);
					if (local568 != null) {
						local568.aClass62_1 = local416;
						local568.anInt3109 = local12;
						local568.anInt3103 = local6;
						local568.anInt3108 = local9;
						Static5.aClass67_7.method2100(local568);
					}
				}
				@Pc(589) Class62_Sub4 local589 = arg1.aClass62_Sub4_1;
				if (local589 != null && (local589.anInt6405 & local413) != 0 && !Static37.method860(local15, local6, local9, local589.anInt6405)) {
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					local621 = local589.method5568(Static50.aClass4_5);
					if (local621 != null) {
						local621.aClass62_1 = local589;
						local621.anInt3109 = local12;
						local621.anInt3103 = local6;
						local621.anInt3108 = local9;
						Static5.aClass67_7.method2100(local621);
					}
				}
			}
			if (local419 != null && !Static311.method5468(local15, local6, local9, local419.method4631())) {
				@Pc(652) Class62_Sub5 local652 = arg1.aClass62_Sub5_1;
				Static50.aClass4_5.method4306(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5046 & local413) != 0) {
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					local621 = local419.method5568(Static50.aClass4_5);
					if (local621 != null) {
						local621.aClass62_1 = local419;
						local621.anInt3109 = local12;
						local621.anInt3103 = local6;
						local621.anInt3108 = local9;
						Static5.aClass67_7.method2100(local621);
					}
				} else if (local419.anInt5046 == 256) {
					local711 = local419.anInt5056 - Static120.anInt2593;
					local716 = local419.anInt5051 - Static79.anInt1748;
					local719 = local419.anInt5055;
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
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					@Pc(764) Class55_Sub3 local764;
					if (local740 < local728) {
						local764 = local419.method5568(Static50.aClass4_5);
						if (local764 != null) {
							local764.aClass62_1 = local419;
							local764.anInt3109 = local12;
							local764.anInt3103 = local6;
							local764.anInt3108 = local9;
							Static5.aClass67_7.method2100(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5568(Static50.aClass4_5);
						if (local764 != null) {
							local764.aClass62_1 = local652;
							local764.anInt3109 = local12;
							local764.anInt3103 = local6;
							local764.anInt3108 = local9;
							Static5.aClass67_7.method2100(local764);
						}
					}
				}
				Static50.aClass4_5.method4306(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class62_Sub3 local819 = arg1.aClass62_Sub3_1;
				if (local819 != null && !local819.aBoolean263) {
					if (local819.aBoolean264) {
						Static50.aClass4_5.method4306(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					local621 = local819.method5568(Static50.aClass4_5);
					if (local621 != null) {
						local621.aClass62_1 = local819;
						local621.anInt3109 = local12;
						local621.anInt3103 = local6;
						local621.anInt3108 = local9;
						Static5.aClass67_7.method2100(local621);
					}
					if (local819.aBoolean264) {
						Static50.aClass4_5.method4306(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class62_Sub2 local885 = arg1.aClass62_Sub2_1;
				if (local885 != null && !local885.aBoolean221) {
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					@Pc(908) Class55_Sub3 local908 = local885.method5568(Static50.aClass4_5);
					if (local908 != null) {
						local908.aClass62_1 = local885;
						local908.anInt3109 = local12;
						local908.anInt3103 = local6;
						local908.anInt3108 = local9;
						Static5.aClass67_7.method2100(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte3;
			if (local929 != 0) {
				@Pc(946) Class8 local946;
				if (local6 < Static250.anInt4943 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean21) {
						Static42.aClass101_1.method3250(local946);
					}
				}
				if (local9 < Static230.anInt4394 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean21) {
						Static42.aClass101_1.method3250(local946);
					}
				}
				if (local6 > Static250.anInt4943 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean21) {
						Static42.aClass101_1.method3250(local946);
					}
				}
				if (local9 > Static230.anInt4394 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean21) {
						Static42.aClass101_1.method3250(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class62_Sub4 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class172 local1035;
		if (arg1.aByte8 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass172_1; local1035 != null; local1035 = local1035.aClass172_4) {
				if (local1035.aClass62_Sub1_1.anInt5288 != Static90.anInt5360 && (local1035.anInt5621 & arg1.aByte8) == arg1.aByte2) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass62_Sub4_2;
				if (!Static37.method860(local15, local6, local9, local1062.anInt6405)) {
					if (Static299.aBoolean459) {
						label687: {
							if (local1062.anInt6405 >= 16) {
								local1079 = local6 - Static250.anInt4943;
								local1083 = local9 - Static230.anInt4394;
								if (local1062.anInt6405 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static160.anInt3244) {
										Static308.method4629(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6405 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static223.anInt4280 && local9 < Static160.anInt3244) {
										Static308.method4629(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6405 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static223.anInt4280 && local9 > 0) {
										Static308.method4629(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt6405 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static308.method4629(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static308.method4629(arg0, local12, local6, local9);
						}
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					@Pc(1197) Class55_Sub3 local1197 = local1062.method5568(Static50.aClass4_5);
					if (local1197 != null) {
						local1197.aClass62_1 = local1062;
						local1197.anInt3109 = local12;
						local1197.anInt3103 = local6;
						local1197.anInt3108 = local9;
						Static5.aClass67_7.method2100(local1197);
					}
				}
				arg1.aByte8 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean23) {
			try {
				arg1.aBoolean23 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass172_1; local1035 != null; local1035 = local1035.aClass172_4) {
					@Pc(1233) Class62_Sub1 local1233 = local1035.aClass62_Sub1_1;
					if (local1233.anInt5288 != Static90.anInt5360) {
						for (local1079 = local1233.aShort84; local1079 <= local1233.aShort86; local1079++) {
							for (local1083 = local1233.aShort83; local1083 <= local1233.aShort85; local1083++) {
								@Pc(1251) Class8 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean22) {
									arg1.aBoolean23 = true;
									continue label630;
								}
								if (local1251.aByte8 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort84) {
										local711++;
									}
									if (local1079 < local1233.aShort86) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort83) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort85) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte8) == arg1.aByte6) {
										arg1.aBoolean23 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static250.anInt4943 - local1233.aShort84;
						local1314 = local1233.aShort86 - Static250.anInt4943;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static230.anInt4394 - local1233.aShort83;
						local716 = local1233.aShort85 - Static230.anInt4394;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass62_Sub1Array2[local40] = local1233;
						arg0.anIntArray438[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class62_Sub1 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass62_Sub1Array2[local1083];
						if (local1365.anInt5288 != Static90.anInt5360) {
							local711 = arg0.anIntArray438[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5289 - Static120.anInt2593;
								local719 = local1365.anInt5280 - Static79.anInt1748;
								local728 = arg0.aClass62_Sub1Array2[local1079].anInt5289 - Static120.anInt2593;
								local740 = arg0.aClass62_Sub1Array2[local1079].anInt5280 - Static79.anInt1748;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass62_Sub1Array2[local1079];
					local1365.anInt5288 = Static90.anInt5360;
					if (!Static106.method2338(local15, local1365.aShort84, local1365.aShort86, local1365.aShort83, local1365.aShort85, local1365.method4764())) {
						if (Static299.aBoolean459) {
							if (local1365.aByte55 == 0) {
								Static22.method699(arg0, local12, local1365.aShort84, local1365.aShort83, local1365.aShort86, local1365.aShort85);
							} else {
								Static308.method4629(arg0, local12, local6, local9);
								local711 = local6 - Static250.anInt4943;
								local716 = local9 - Static230.anInt4394;
								if (local1365.aByte55 == 2) {
									if (local716 > -local711) {
										Static108.method2345(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static108.method2345(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static108.method2345(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static108.method2345(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
						}
						local621 = local1365.method5568(Static50.aClass4_5);
						if (local621 != null) {
							local621.aClass62_1 = local1365;
							local621.anInt3109 = local12;
							local621.anInt3103 = local1365.aShort84;
							local621.anInt3108 = local1365.aShort83;
							Static5.aClass67_7.method2100(local621);
						}
					}
					for (local711 = local1365.aShort84; local711 <= local1365.aShort86; local711++) {
						for (local716 = local1365.aShort83; local716 <= local1365.aShort85; local716++) {
							@Pc(1590) Class8 local1590 = local31[local711][local716];
							if (local1590.aByte8 != 0) {
								Static42.aClass101_1.method3250(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean21) {
								Static42.aClass101_1.method3250(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean23) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean23 = false;
			}
		}
		if (arg1.aClass75_1 != null) {
			if (arg1.aByte5 == (byte) (Static46.anInt996 & 0xFF)) {
				@Pc(1645) Class75 local1645 = arg1.aClass75_1;
				local411 = Static301.aClass73Array31[local12].method4931(local6, local9);
				if (local12 < 3) {
					local413 = Static301.aClass73Array31[local12].method4931(local6, local9) - Static301.aClass73Array31[local12 + 1].method4931(local6, local9);
				} else {
					local413 = 1024;
				}
				Static293.aClass133_5.method4330(local21, local411, local27, arg0.anIntArray437);
				local1079 = arg0.anIntArray437[2];
				Static293.aClass133_5.method4330(local21, local411 - local413, local27, arg0.anIntArray437);
				local1083 = arg0.anIntArray437[2];
				local1314 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1314 = local1083;
					local711 = local1079;
				}
				local1314 -= 91;
				local711 += 91;
				if (local1314 < local711 - 1597) {
					local1314 = local711 - 1597;
				}
				local1645.anInt2397 = local1314;
				local1645.anInt2398 = local711;
				local1645.aBoolean207 = true;
				Static50.aClass4_5.method4303(local1645);
			} else {
				arg1.aClass75_1 = null;
			}
		}
		if (!arg1.aBoolean21) {
			return;
		}
		if (arg1.aByte8 != 0) {
			return;
		}
		if (local6 <= Static250.anInt4943 && local6 > Static30.anInt551) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean21) {
				return;
			}
		}
		if (local6 >= Static250.anInt4943 && local6 < Static282.anInt5713 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean21) {
				return;
			}
		}
		if (local9 <= Static230.anInt4394 && local9 > Static156.anInt3176) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean21) {
				return;
			}
		}
		if (local9 >= Static230.anInt4394 && local9 < Static301.anInt5009 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean21) {
				return;
			}
		}
		arg1.aBoolean21 = false;
		Static143.anInt2959--;
		@Pc(1839) Class62_Sub2 local1839 = arg1.aClass62_Sub2_1;
		if (local1839 != null && local1839.aBoolean221) {
			if (Static299.aBoolean459) {
				Static308.method4629(arg0, local12, local6, local9);
				Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
			}
			@Pc(1862) Class55_Sub3 local1862 = local1839.method5568(Static50.aClass4_5);
			if (local1862 != null) {
				local1862.aClass62_1 = local1839;
				local1862.anInt3109 = local12;
				local1862.anInt3103 = local6;
				local1862.anInt3108 = local9;
				Static5.aClass67_7.method2100(local1862);
			}
		}
		if (arg1.aShort12 != 0) {
			@Pc(1886) Class62_Sub5 local1886 = arg1.aClass62_Sub5_2;
			if (local1886 != null && !Static311.method5468(local15, local6, local9, local1886.method4631())) {
				if ((local1886.anInt5046 & arg1.aShort12) != 0) {
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					local382 = local1886.method5568(Static50.aClass4_5);
					if (local382 != null) {
						local382.aClass62_1 = local1886;
						local382.anInt3109 = local12;
						local382.anInt3103 = local6;
						local382.anInt3108 = local9;
						Static5.aClass67_7.method2100(local382);
					}
				} else if (local1886.anInt5046 == 256) {
					local413 = local1886.anInt5056 - Static120.anInt2593;
					local1079 = local1886.anInt5051 - Static79.anInt1748;
					local1083 = local1886.anInt5055;
					if (local1083 == 1 || local1083 == 2) {
						local1314 = -local413;
					} else {
						local1314 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static299.aBoolean459) {
						Static308.method4629(arg0, local12, local6, local9);
						Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
					}
					@Pc(1996) Class62_Sub5 local1996 = arg1.aClass62_Sub5_1;
					@Pc(2004) Class55_Sub3 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5568(Static50.aClass4_5);
						if (local2004 != null) {
							local2004.aClass62_1 = local1886;
							local2004.anInt3109 = local12;
							local2004.anInt3103 = local6;
							local2004.anInt3108 = local9;
							Static5.aClass67_7.method2100(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5568(Static50.aClass4_5);
						if (local2004 != null) {
							local2004.aClass62_1 = local1996;
							local2004.anInt3109 = local12;
							local2004.anInt3103 = local6;
							local2004.anInt3108 = local9;
							Static5.aClass67_7.method2100(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass62_Sub4_2;
			local416 = arg1.aClass62_Sub4_1;
			@Pc(2089) Class55_Sub3 local2089;
			if (local416 != null && (local416.anInt6405 & arg1.aShort12) != 0 && !Static37.method860(local15, local6, local9, local416.anInt6405)) {
				if (Static299.aBoolean459) {
					Static47.method1119(arg0, local416.anInt6405, local12, local6, local9);
					Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
				}
				local2089 = local416.method5568(Static50.aClass4_5);
				if (local2089 != null) {
					local2089.aClass62_1 = local416;
					local2089.anInt3109 = local12;
					local2089.anInt3103 = local6;
					local2089.anInt3108 = local9;
					Static5.aClass67_7.method2100(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt6405 & arg1.aShort12) != 0 && !Static37.method860(local15, local6, local9, local1062.anInt6405)) {
				if (Static299.aBoolean459) {
					Static47.method1119(arg0, local1062.anInt6405, local12, local6, local9);
					Static50.aClass4_5.method4284(arg0.anInt6003, arg0.aClass2_Sub36_Sub1Array6);
				}
				local2089 = local1062.method5568(Static50.aClass4_5);
				if (local2089 != null) {
					local2089.aClass62_1 = local1062;
					local2089.anInt3109 = local12;
					local2089.anInt3103 = local6;
					local2089.anInt3108 = local9;
					Static5.aClass67_7.method2100(local2089);
				}
			}
		}
		@Pc(2175) Class8 local2175;
		if (local12 < Static37.anInt696 - 1) {
			local2175 = Static275.aClass8ArrayArrayArray4[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean21) {
				Static42.aClass101_1.method3252(local2175);
			}
		}
		if (local6 < Static250.anInt4943) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean21) {
				Static42.aClass101_1.method3250(local2175);
			}
		}
		if (local9 < Static230.anInt4394) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean21) {
				Static42.aClass101_1.method3250(local2175);
			}
		}
		if (local6 > Static250.anInt4943) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean21) {
				Static42.aClass101_1.method3250(local2175);
			}
		}
		if (local9 > Static230.anInt4394) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean21) {
				Static42.aClass101_1.method3250(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class189[] local7 = Static264.aClass189Array1;
		for (@Pc(13) int local13 = 0; local13 < local7.length; local13++) {
			@Pc(19) Class189 local19 = local7[local13];
			if (local19 != null && local19.anInt6225 == 2) {
				Static194.method3500(arg1 >> 1, (local19.anInt6222 - Static138.anInt2879 << 7) + local19.anInt6213, local19.anInt6221 * 2, local19.anInt6216 + (local19.anInt6227 - Static342.anInt6864 << 7), arg2 >> 1);
				if (Static239.anIntArray366[0] > -1 && Static212.anInt4090 % 20 < 10) {
					Static170.aClass31Array11[local19.anInt6215].method4377(Static239.anIntArray366[0] + arg3 - 12, arg0 - (-Static239.anIntArray366[1] - -28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	public static int method1822(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static84.method1903(arg0);
	}
}
