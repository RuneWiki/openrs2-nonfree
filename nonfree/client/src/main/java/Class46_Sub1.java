import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
	public int anInt1050 = 99;

	static {
		new Class55("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIZ)V")
	public Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static258.aClass155_5, Static76.aClass233_3);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILclient!ep;IIIIILclient!ya;I)V")
	public void method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class51 arg8, @OriginalArg(10) int arg9) {
		if (!Static130.aClass153_Sub1_1.method4229(Static377.anInt6113) && !Static446.method5667(arg0, arg1, Static179.anInt7446, arg2)) {
			return;
		}
		if (arg7 < this.anInt1050) {
			this.anInt1050 = arg7;
		}
		@Pc(34) Class189 local34 = Static411.aClass142_4.method3148(arg9);
		if (arg8.method5337() && Static130.aClass153_Sub1_1.aBoolean338 && local34.aBoolean312) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg5 == 1 || arg5 == 3) {
			local53 = local34.anInt5110;
			local56 = local34.anInt5073;
		} else {
			local56 = local34.anInt5110;
			local53 = local34.anInt5073;
		}
		@Pc(76) int local76;
		@Pc(74) int local74;
		if (super.anInt1029 < local53 + arg2) {
			local74 = arg2 + 1;
			local76 = arg2;
		} else {
			local76 = (local53 >> 1) + arg2;
			local74 = arg2 + (local53 + 1 >> 1);
		}
		@Pc(117) int local117;
		@Pc(111) int local111;
		if (super.anInt1032 >= local56 + arg1) {
			local111 = (local56 + 1 >> 1) + arg1;
			local117 = arg1 + (local56 >> 1);
		} else {
			local117 = arg1;
			local111 = arg1 + 1;
		}
		@Pc(129) Class165 local129 = Static244.aClass165Array8[arg0];
		@Pc(154) int local154 = local129.l(local76, local117) + local129.l(local74, local117) + local129.l(local76, local111) + local129.l(local74, local111) >> 2;
		@Pc(162) int local162 = (arg2 << 7) + (local53 << 6);
		@Pc(170) int local170 = (local56 << 6) + (arg1 << 7);
		@Pc(182) boolean local182 = Static77.aBoolean90 && !super.aBoolean64 && local34.aBoolean311;
		if (local34.method4035()) {
			Static130.method2096(arg5, local34, null, null, arg7, arg2, arg1);
		}
		@Pc(216) boolean local216 = arg6 == -1 && local34.anInt5063 == -1 && local34.anIntArray447 == null && local34.anIntArray448 == null && !local34.aBoolean323;
		if (Static434.aBoolean485 && (Static215.method3055(arg4) && local34.anInt5058 != 1 || !(!Static189.method4308(arg4) || local34.anInt5058 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(370) Class26_Sub2 local370;
			@Pc(337) Class26_Sub2_Sub6 local337;
			@Pc(341) int local341;
			if (arg4 == 10 || arg4 == 11) {
				local337 = null;
				if (local216) {
					@Pc(400) Class26_Sub2_Sub6 local400 = new Class26_Sub2_Sub6(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg2, arg2 + local53 - 1, arg1, local56 + arg1 - 1, arg4, arg5, local182);
					local337 = local400;
					local370 = local400;
					local341 = local400.method5705();
				} else {
					local341 = 15;
					local370 = new Class26_Sub2_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg2, local53 + arg2 - 1, arg1, arg1 + local56 - 1, arg4, arg5, arg6);
				}
				@Pc(421) Class26_Sub2 local421 = Static14.method152(arg7, arg2, arg1, gf.class);
				@Pc(423) boolean local423 = false;
				if (local421 instanceof Class26_Sub2_Sub5 && local421.aShort105 == arg2 && local421.aShort103 == arg1) {
					local423 = true;
					((Class26_Sub2_Sub5) local421).aClass26_Sub2_1 = local370;
				}
				if (local423 || Static37.method529(local370, false)) {
					if (local337 != null && local337.method5726()) {
						local337.method5728(arg8);
					}
					if (local34.aBoolean317 && Static77.aBoolean90) {
						if (local341 > 30) {
							local341 = 30;
						}
						for (@Pc(472) int local472 = 0; local472 <= local53; local472++) {
							for (@Pc(476) int local476 = 0; local476 <= local56; local476++) {
								local129.i(arg2 + local472, local476 + arg1, local341);
							}
						}
					}
				}
				if (local34.anInt5109 != 0 && arg3 != null) {
					arg3.method1704(arg2, local34.aBoolean321, local53, !local34.aBoolean314, arg1, local56);
				}
			} else {
				@Pc(626) Class26_Sub2 local626;
				if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
					if (local216) {
						local337 = new Class26_Sub2_Sub6(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg2, arg2 + local53 - 1, arg1, arg1 + local56 - 1, arg4, arg5, local182);
						local370 = local337;
						if (local337.method5726()) {
							local337.method5728(arg8);
						}
					} else {
						local370 = new Class26_Sub2_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg2, local53 + arg2 - 1, arg1, local56 + arg1 - 1, arg4, arg5, arg6);
					}
					local626 = Static14.method152(arg7, arg2, arg1, gf.class);
					if (local626 instanceof Class26_Sub2_Sub5 && arg2 == local626.aShort105 && arg1 == local626.aShort103) {
						((Class26_Sub2_Sub5) local626).aClass26_Sub2_1 = local370;
					} else {
						Static37.method529(local370, false);
					}
					if (Static77.aBoolean90 && !super.aBoolean64 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0 && local34.anInt5058 != 0) {
						super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x4);
					}
					if (local34.anInt5109 != 0 && arg3 != null) {
						arg3.method1704(arg2, local34.aBoolean321, local53, !local34.aBoolean314, arg1, local56);
					}
				} else {
					@Pc(752) Class26_Sub3 local752;
					if (arg4 == 0) {
						@Pc(716) int local716 = local34.anInt5058;
						if (Static162.aBoolean177 && local34.anInt5058 == -1) {
							local716 = 1;
						}
						if (local216) {
							@Pc(742) Class26_Sub3_Sub1 local742 = new Class26_Sub3_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5, local182);
							if (local742.method5726()) {
								local742.method5728(arg8);
							}
							local752 = local742;
						} else {
							local752 = new Class26_Sub3_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5, arg6);
						}
						@Pc(775) Class26_Sub3 local775 = Static184.method2673(arg7, arg2, arg1);
						if (local775 instanceof Class26_Sub3_Sub3) {
							((Class26_Sub3_Sub3) local775).aClass26_Sub3_3 = local752;
						} else {
							Static361.method4639(arg7, arg2, arg1, local752, null);
						}
						if (Static77.aBoolean90) {
							if (arg5 == 0) {
								if (local34.aBoolean317) {
									local129.i(arg2, arg1, 50);
									local129.i(arg2, arg1 + 1, 50);
								}
								if (local716 == 1 && !super.aBoolean64) {
									super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x1);
								}
							} else if (arg5 == 1) {
								if (local34.aBoolean317) {
									local129.i(arg2, arg1 + 1, 50);
									local129.i(arg2 + 1, arg1 + 1, 50);
								}
								if (local716 == 1 && !super.aBoolean64) {
									super.aByteArrayArrayArray13[arg7][arg2][arg1 + 1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1 + 1] | 0x2);
								}
							} else if (arg5 == 2) {
								if (local34.aBoolean317) {
									local129.i(arg2 + 1, arg1, 50);
									local129.i(arg2 + 1, arg1 - -1, 50);
								}
								if (local716 == 1 && !super.aBoolean64) {
									super.aByteArrayArrayArray13[arg7][arg2 + 1][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2 + 1][arg1] | 0x1);
								}
							} else if (arg5 == 3) {
								if (local34.aBoolean317) {
									local129.i(arg2, arg1, 50);
									local129.i(arg2 + 1, arg1, 50);
								}
								if (local716 == 1 && !super.aBoolean64) {
									super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x2);
								}
							}
						}
						if (local34.anInt5109 != 0 && arg3 != null) {
							arg3.method1700(local34.aBoolean321, arg2, arg5, arg4, arg1, !local34.aBoolean314);
						}
						if (local34.anInt5095 != 16) {
							Static428.method5536(arg7, arg2, arg1, local34.anInt5095);
						}
					} else {
						@Pc(1051) Class26_Sub3_Sub1 local1051;
						@Pc(1061) Class26_Sub3 local1061;
						if (arg4 == 1) {
							if (local216) {
								local1051 = new Class26_Sub3_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5, local182);
								if (local1051.method5726()) {
									local1051.method5728(arg8);
								}
								local1061 = local1051;
							} else {
								local1061 = new Class26_Sub3_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5, arg6);
							}
							local752 = Static184.method2673(arg7, arg2, arg1);
							if (local752 instanceof Class26_Sub3_Sub3) {
								((Class26_Sub3_Sub3) local752).aClass26_Sub3_3 = local1061;
							} else {
								Static361.method4639(arg7, arg2, arg1, local1061, null);
							}
							if (local34.aBoolean317 && Static77.aBoolean90) {
								if (arg5 == 0) {
									local129.i(arg2, arg1 + 1, 50);
								} else if (arg5 == 1) {
									local129.i(arg2 + 1, arg1 + 1, 50);
								} else if (arg5 == 2) {
									local129.i(arg2 + 1, arg1, 50);
								} else if (arg5 == 3) {
									local129.i(arg2, arg1, 50);
								}
							}
							if (local34.anInt5109 != 0 && arg3 != null) {
								arg3.method1700(local34.aBoolean321, arg2, arg5, arg4, arg1, !local34.aBoolean314);
							}
						} else if (arg4 == 2) {
							local341 = arg5 + 1 & 0x3;
							if (local216) {
								@Pc(1205) Class26_Sub3_Sub1 local1205 = new Class26_Sub3_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5 + 4, local182);
								@Pc(1220) Class26_Sub3_Sub1 local1220 = new Class26_Sub3_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg4, local341, local182);
								if (local1205.method5726()) {
									local1205.method5728(arg8);
								}
								if (local1220.method5726()) {
									local1220.method5728(arg8);
								}
								local1061 = local1205;
								local752 = local1220;
							} else {
								local1061 = new Class26_Sub3_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5 + 4, arg6);
								local752 = new Class26_Sub3_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg4, local341, arg6);
							}
							Static361.method4639(arg7, arg2, arg1, local1061, local752);
							if (local34.anInt5058 == 1 && Static77.aBoolean90 && !super.aBoolean64) {
								if (arg5 == 0) {
									super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x1);
									super.aByteArrayArrayArray13[arg7][arg2][arg1 + 1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1 + 1] | 0x2);
								} else if (arg5 == 1) {
									super.aByteArrayArrayArray13[arg7][arg2][arg1 + 1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1 + 1] | 0x2);
									super.aByteArrayArrayArray13[arg7][arg2 + 1][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2 + 1][arg1] | 0x1);
								} else if (arg5 == 2) {
									super.aByteArrayArrayArray13[arg7][arg2 + 1][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2 + 1][arg1] | 0x1);
									super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x2);
								} else if (arg5 == 3) {
									super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x2);
									super.aByteArrayArrayArray13[arg7][arg2][arg1] = (byte) (super.aByteArrayArrayArray13[arg7][arg2][arg1] | 0x1);
								}
							}
							if (local34.anInt5109 != 0 && arg3 != null) {
								arg3.method1700(local34.aBoolean321, arg2, arg5, arg4, arg1, !local34.aBoolean314);
							}
							if (local34.anInt5095 != 16) {
								Static428.method5536(arg7, arg2, arg1, local34.anInt5095);
							}
						} else if (arg4 == 3) {
							if (local216) {
								local1051 = new Class26_Sub3_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5, local182);
								if (local1051.method5726()) {
									local1051.method5728(arg8);
								}
								local1061 = local1051;
							} else {
								local1061 = new Class26_Sub3_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg4, arg5, arg6);
							}
							local752 = Static184.method2673(arg7, arg2, arg1);
							if (local752 instanceof Class26_Sub3_Sub3) {
								((Class26_Sub3_Sub3) local752).aClass26_Sub3_3 = local1061;
							} else {
								Static361.method4639(arg7, arg2, arg1, local1061, null);
							}
							if (local34.aBoolean317 && Static77.aBoolean90) {
								if (arg5 == 0) {
									local129.i(arg2, arg1 + 1, 50);
								} else if (arg5 == 1) {
									local129.i(arg2 + 1, arg1 + 1, 50);
								} else if (arg5 == 2) {
									local129.i(arg2 + 1, arg1, 50);
								} else if (arg5 == 3) {
									local129.i(arg2, arg1, 50);
								}
							}
							if (local34.anInt5109 != 0 && arg3 != null) {
								arg3.method1700(local34.aBoolean321, arg2, arg5, arg4, arg1, !local34.aBoolean314);
							}
						} else if (arg4 == 9) {
							if (local216) {
								local337 = new Class26_Sub2_Sub6(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg2, arg2, arg1, arg1, arg4, arg5, local182);
								local370 = local337;
								if (local337.method5726()) {
									local337.method5728(arg8);
								}
							} else {
								local370 = new Class26_Sub2_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg2, local53 + arg2 - 1, arg1, local56 + arg1 - 1, arg4, arg5, arg6);
							}
							local626 = Static14.method152(arg7, arg2, arg1, gf.class);
							if (local626 instanceof Class26_Sub2_Sub5 && arg2 == local626.aShort105 && local626.aShort103 == arg1) {
								((Class26_Sub2_Sub5) local626).aClass26_Sub2_1 = local370;
							} else {
								Static37.method529(local370, false);
							}
							if (local34.anInt5109 != 0 && arg3 != null) {
								arg3.method1704(arg2, local34.aBoolean321, local53, !local34.aBoolean314, arg1, local56);
							}
							if (local34.anInt5095 != 16) {
								Static428.method5536(arg7, arg2, arg1, local34.anInt5095);
							}
						} else {
							@Pc(1822) Class26_Sub1 local1822;
							if (arg4 == 4) {
								if (local216) {
									@Pc(1841) Class26_Sub1_Sub1 local1841 = new Class26_Sub1_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, 0, 0, 0, arg4, arg5);
									local1822 = local1841;
									if (local1841.method5726()) {
										local1841.method5728(arg8);
									}
								} else {
									local1822 = new Class26_Sub1_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, 0, 0, 0, arg4, arg5, arg6);
								}
								@Pc(1856) Class26_Sub1 local1856 = Static178.method2592(arg7, arg2, arg1);
								if (local1856 instanceof Class26_Sub1_Sub3) {
									((Class26_Sub1_Sub3) local1856).aClass26_Sub1_3 = local1822;
								} else {
									Static315.method4095(arg7, arg2, arg1, local1822, null);
								}
							} else {
								@Pc(1878) int local1878;
								@Pc(1884) Interface5 local1884;
								@Pc(1923) Class26_Sub1_Sub1 local1923;
								@Pc(1967) Class26_Sub1 local1967;
								if (arg4 == 5) {
									local1878 = 17;
									local1884 = (Interface5) Static184.method2673(arg7, arg2, arg1);
									if (local1884 != null) {
										local1878 = Static411.aClass142_4.method3148(local1884.method5731()).anInt5095 + 1;
									}
									if (local216) {
										local1923 = new Class26_Sub1_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, 0, Static280.anIntArray424[arg5] * local1878, local1878 * Static311.anIntArray462[arg5], arg4, arg5);
										local1822 = local1923;
										if (local1923.method5726()) {
											local1923.method5728(arg8);
										}
									} else {
										local1822 = new Class26_Sub1_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, 0, Static280.anIntArray424[arg5] * local1878, Static311.anIntArray462[arg5] * local1878, arg4, arg5, arg6);
									}
									local1967 = Static178.method2592(arg7, arg2, arg1);
									if (local1967 instanceof Class26_Sub1_Sub3) {
										((Class26_Sub1_Sub3) local1967).aClass26_Sub1_3 = local1822;
									} else {
										Static315.method4095(arg7, arg2, arg1, local1822, null);
									}
								} else if (arg4 == 6) {
									local1878 = 9;
									local1884 = (Interface5) Static184.method2673(arg7, arg2, arg1);
									if (local1884 != null) {
										local1878 = Static411.aClass142_4.method3148(local1884.method5731()).anInt5095 / 2 + 1;
									}
									if (local216) {
										local1923 = new Class26_Sub1_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg5, local1878 * Static280.anIntArray424[arg5], local1878 * Static311.anIntArray462[arg5], arg4, arg5 + 4);
										if (local1923.method5726()) {
											local1923.method5728(arg8);
										}
										local1822 = local1923;
									} else {
										local1822 = new Class26_Sub1_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg5, local1878 * Static86.anIntArray111[arg5], local1878 * Static223.anIntArray342[arg5], arg4, arg5 + 4, arg6);
									}
									local1967 = Static178.method2592(arg7, arg2, arg1);
									if (local1967 instanceof Class26_Sub1_Sub3) {
										((Class26_Sub1_Sub3) local1967).aClass26_Sub1_3 = local1822;
									} else {
										Static315.method4095(arg7, arg2, arg1, local1822, null);
									}
								} else if (arg4 == 7) {
									local1878 = arg5 + 2 & 0x3;
									if (local216) {
										@Pc(2152) Class26_Sub1_Sub1 local2152 = new Class26_Sub1_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, local1878, 0, 0, arg4, local1878 + 4);
										local1822 = local2152;
										if (local2152.method5726()) {
											local2152.method5728(arg8);
										}
									} else {
										local1822 = new Class26_Sub1_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, local1878, 0, 0, arg4, local1878 + 4, arg6);
									}
									@Pc(2167) Class26_Sub1 local2167 = Static178.method2592(arg7, arg2, arg1);
									if (local2167 instanceof Class26_Sub1_Sub3) {
										((Class26_Sub1_Sub3) local2167).aClass26_Sub1_3 = local1822;
									} else {
										Static315.method4095(arg7, arg2, arg1, local1822, null);
									}
								} else if (arg4 == 8) {
									local341 = arg5 + 2 & 0x3;
									@Pc(2198) int local2198 = 9;
									@Pc(2204) Interface5 local2204 = (Interface5) Static184.method2673(arg7, arg2, arg1);
									if (local2204 != null) {
										local2198 = Static411.aClass142_4.method3148(local2204.method5731()).anInt5095 / 2 + 1;
									}
									@Pc(2249) Class26_Sub1 local2249;
									@Pc(2270) Class26_Sub1 local2270;
									if (local216) {
										local2249 = new Class26_Sub1_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg5, local2198 * Static86.anIntArray111[arg5], Static223.anIntArray342[arg5] * local2198, arg4, arg5 + 4);
										local2270 = new Class26_Sub1_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg5, 0, 0, arg4, local341 + 4);
										if (local2249.method5726()) {
											local2249.method5728(arg8);
										}
										if (local2270.method5726()) {
											local2270.method5728(arg8);
										}
									} else {
										local2249 = new Class26_Sub1_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg5, Static86.anIntArray111[arg5] * local2198, local2198 * Static223.anIntArray342[arg5], arg4, arg5 + 4, arg6);
										local2270 = new Class26_Sub1_Sub2(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg5, 0, 0, arg4, local341 + 4, arg6);
									}
									Static315.method4095(arg7, arg2, arg1, local2249, local2270);
								}
							}
						}
					}
				}
			}
		} else if (Static130.aClass153_Sub1_1.aBoolean347 || local34.anInt5106 != 0 || local34.anInt5109 == 1 || local34.aBoolean320) {
			@Pc(268) Class26_Sub4 local268;
			if (local216) {
				@Pc(284) Class26_Sub4_Sub1 local284 = new Class26_Sub4_Sub1(arg8, local34, arg0, local162, local154, local170, super.aBoolean64, arg5, local182);
				if (local284.method5726()) {
					local284.method5728(arg8);
				}
				local268 = local284;
			} else {
				local268 = new Class26_Sub4_Sub3(arg8, local34, arg7, arg0, local162, local154, local170, super.aBoolean64, arg5, arg6);
			}
			@Pc(299) Class26_Sub4 local299 = Static339.method4422(arg7, arg2, arg1);
			if (local299 instanceof Class26_Sub4_Sub2) {
				((Class26_Sub4_Sub2) local299).aClass26_Sub4_1 = local268;
			} else {
				Static384.method5648(arg7, arg2, arg1, local268);
			}
			if (local34.anInt5109 == 1 && arg3 != null) {
				arg3.method1706(arg2, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[Lclient!ep;[BILclient!ya;)V")
	public void method810(@OriginalArg(1) int arg0, @OriginalArg(2) Class70[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class51 arg4) {
		@Pc(26) Class7_Sub14 local26 = new Class7_Sub14(arg2);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local26.method3939();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local26.method3940();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(59) int local59 = local40 & 0x3F;
				@Pc(65) int local65 = local40 >> 6 & 0x3F;
				@Pc(69) int local69 = local40 >> 12;
				@Pc(73) int local73 = local26.method3981();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				@Pc(85) int local85 = local65 + arg3;
				@Pc(89) int local89 = arg0 + local59;
				if (local85 > 0 && local89 > 0 && local85 < super.anInt1029 - 1 && local89 < super.anInt1032 - 1) {
					@Pc(111) Class70 local111 = null;
					if (!super.aBoolean64) {
						@Pc(116) int local116 = local69;
						if ((Static347.aByteArrayArrayArray16[1][local85][local89] & 0x2) == 2) {
							local116 = local69 - 1;
						}
						if (local116 >= 0) {
							local111 = arg1[local116];
						}
					}
					this.method807(local69, local89, local85, local111, local77, local81, -1, local69, arg4, local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ya;IIBILclient!ep;)V")
	public void method812(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class70 arg5) {
		@Pc(7) Interface5 local7 = null;
		if (arg4 == 0) {
			local7 = (Interface5) Static184.method2673(arg2, arg0, arg3);
		}
		if (arg4 == 1) {
			local7 = (Interface5) Static178.method2592(arg2, arg0, arg3);
		}
		if (arg4 == 2) {
			local7 = (Interface5) Static14.method152(arg2, arg0, arg3, gf.class);
		}
		if (arg4 == 3) {
			local7 = (Interface5) Static339.method4422(arg2, arg0, arg3);
		}
		if (local7 == null) {
			return;
		}
		@Pc(70) Class189 local70 = Static411.aClass142_4.method3148(local7.method5731());
		@Pc(74) int local74 = local7.method5732();
		@Pc(78) int local78 = local7.method5729();
		if (local70.method4035()) {
			Static285.method3749(arg0, arg2, local70, arg3);
		}
		if (local7.method5726()) {
			local7.method5730(arg1);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				@Pc(109) Class26_Sub1 local109 = Static178.method2592(arg2, arg0, arg3);
				if (local109 instanceof Class26_Sub1_Sub3) {
					((Class26_Sub1_Sub3) local109).aClass26_Sub1_3 = null;
					return;
				}
				Static115.method1948(arg2, arg0, arg3);
				return;
			}
			if (arg4 == 2) {
				@Pc(138) Class26_Sub2 local138 = Static14.method152(arg2, arg0, arg3, gf.class);
				if (local138 instanceof Class26_Sub2_Sub5 && arg0 == local138.aShort105 && local138.aShort103 == arg3) {
					((Class26_Sub2_Sub5) local138).aClass26_Sub2_1 = null;
				} else {
					Static276.method3689(arg2, arg0, arg3, gf.class);
				}
				if (local70.anInt5109 != 0 && super.anInt1029 > local70.anInt5073 + arg0 && super.anInt1032 > local70.anInt5073 + arg3 && local70.anInt5110 + arg0 < super.anInt1029 && arg3 + local70.anInt5110 < super.anInt1032) {
					arg5.method1705(local70.anInt5110, local70.anInt5073, local78, local70.aBoolean321, arg3, !local70.aBoolean314, arg0);
					return;
				}
			} else if (arg4 == 3) {
				@Pc(232) Class26_Sub4 local232 = Static339.method4422(arg2, arg0, arg3);
				if (local232 instanceof Class26_Sub4_Sub2) {
					((Class26_Sub4_Sub2) local232).aClass26_Sub4_1 = null;
				} else {
					Static118.method1990(arg2, arg0, arg3);
				}
				if (local70.anInt5109 != 1) {
					return;
				}
				arg5.method1702(arg3, arg0);
			} else {
				return;
			}
			return;
		}
		@Pc(262) Class26_Sub3 local262 = Static184.method2673(arg2, arg0, arg3);
		if (local262 instanceof Class26_Sub3_Sub3) {
			((Class26_Sub3_Sub3) local262).aClass26_Sub3_3 = null;
		} else {
			Static354.method4562(arg2, arg0, arg3);
		}
		if (local70.anInt5109 != 0) {
			arg5.method1692(local78, local70.aBoolean321, local74, arg0, !local70.aBoolean314, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!ya;I[IIIIBLclient!gk;I)V")
	public void method813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class7_Sub14 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean64) {
			return;
		}
		@Pc(18) Class156 local18 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(30) int local30 = (arg0 & 0x7) * 8;
		@Pc(36) int local36 = (arg6 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(41) int local41;
						@Pc(75) int local75;
						@Pc(400) int local400;
						@Pc(96) int local96;
						while (arg8.aByteArray75.length > arg8.anInt4989) {
							local41 = arg8.method3981();
							if (local41 == 0) {
								local18 = new Class156(arg8);
							} else {
								@Pc(102) int local102;
								@Pc(152) int local152;
								@Pc(228) int local228;
								@Pc(266) int local266;
								if (local41 == 1) {
									local75 = arg8.method3981();
									if (local75 > 0) {
										for (local400 = 0; local400 < local75; local400++) {
											@Pc(409) Class74 local409 = new Class74(arg2, arg8, 0);
											if (local409.anInt2037 == 31) {
												@Pc(422) Class81 local422 = Static230.aClass152_1.method3298(arg8.method3943());
												local409.method1752(local422.anInt2387, local422.anInt2388, local422.anInt2392, local422.anInt2386);
											}
											if (arg2.method5290() > 0) {
												@Pc(439) Class7_Sub30 local439 = local409.aClass7_Sub30_2;
												local102 = local439.method5032() >> 7;
												local152 = local439.method5023() >> 7;
												if (arg1 == local409.anInt2041 && local30 <= local102 && local30 + 8 > local102 && local36 <= local152 && local36 + 8 > local152) {
													local228 = (arg9 << 7) + Static140.method798(local439.method5023() & 0x3FF, local439.method5032() & 0x3FF, arg3);
													local266 = Static256.method3400(local439.method5023() & 0x3FF, local439.method5032() & 0x3FF, arg3) + (arg7 << 7);
													local102 = local228 >> 7;
													local152 = local266 >> 7;
													if (local102 >= 0 && local152 >= 0 && super.anInt1029 > local102 && local152 < super.anInt1032) {
														local439.method5028(super.anIntArrayArrayArray3[arg1][local102][local152] - local439.method5029(), local228, local266);
														Static21.method222(local409);
													}
												}
											}
										}
									}
								} else if (local41 == 2) {
									if (local18 == null) {
										local18 = new Class156();
									}
									local18.method3351(arg8);
								} else if (local41 != 128) {
									if (local41 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray10 == null) {
										super.aByteArrayArrayArray10 = new byte[4][][];
									}
									for (local75 = 0; local75 < 4; local75++) {
										@Pc(81) byte local81 = arg8.method3930();
										@Pc(100) int local100;
										if (local81 == 0 && super.aByteArrayArrayArray10[arg5] != null) {
											if (local75 <= arg1) {
												local96 = arg9;
												local100 = arg9 + 7;
												local102 = arg7;
												if (arg9 < 0) {
													local96 = 0;
												} else if (super.anInt1029 <= arg9) {
													local96 = super.anInt1029;
												}
												if (arg7 < 0) {
													local102 = 0;
												} else if (arg7 >= super.anInt1032) {
													local102 = super.anInt1032;
												}
												if (local100 < 0) {
													local100 = 0;
												} else if (local100 >= super.anInt1029) {
													local100 = super.anInt1029;
												}
												local152 = arg7 + 7;
												if (local152 < 0) {
													local152 = 0;
												} else if (local152 >= super.anInt1032) {
													local152 = super.anInt1032;
												}
												while (local96 < local100) {
													while (local152 > local102) {
														super.aByteArrayArrayArray10[arg5][local96][local102] = 0;
														local102++;
													}
													local96++;
												}
											}
										} else if (local81 == 1) {
											if (super.aByteArrayArrayArray10[arg5] == null) {
												super.aByteArrayArrayArray10[arg5] = new byte[super.anInt1029 + 1][super.anInt1032 + 1];
											}
											for (local96 = 0; local96 < 64; local96 += 4) {
												for (local100 = 0; local100 < 64; local100 += 4) {
													@Pc(219) byte local219 = arg8.method3930();
													if (arg1 >= local75) {
														for (local152 = local96; local152 < local96 + 4; local152++) {
															for (local228 = local100; local228 < local100 + 4; local228++) {
																if (local152 >= local30 && local30 + 8 > local152 && local228 >= local36 && local36 < local36 + 8) {
																	local266 = Static77.method1378(arg3, local152 & 0x7, local228 & 0x7) + arg9;
																	@Pc(278) int local278 = arg7 + Static48.method618(local152 & 0x7, arg3, local228 & 0x7);
																	if (local266 >= 0 && super.anInt1029 > local266 && local278 >= 0 && super.anInt1032 > local278) {
																		super.aByteArrayArrayArray10[arg5][local266][local278] = local219;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg4 == null) {
									arg8.anInt4989 += 10;
								} else {
									arg4[0] = arg8.method3943();
									arg4[1] = arg8.method3961();
									arg4[2] = arg8.method3961();
									arg4[3] = arg8.method3961();
									arg4[4] = arg8.method3943();
								}
							}
						}
						if (local18 != null) {
							Static342.method4437(local18, arg9 >> 3, arg7 >> 3);
						}
						if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg5] != null) {
							local41 = arg9 + 7;
							local75 = arg7 + 7;
							for (local400 = arg9; local400 < local41; local400++) {
								for (local96 = arg7; local96 < local75; local96++) {
									super.aByteArrayArrayArray10[arg5][local400][local96] = 0;
								}
							}
							return;
						}
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BI[Lclient!ep;IIBILclient!ya;II)V")
	public void method814(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class70[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class51 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class7_Sub14 local10 = new Class7_Sub14(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method3939();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method3940();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local10.method3981();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				if (arg9 == local64 && local60 >= arg0 && local60 < arg0 + 8 && arg4 <= local54 && arg4 + 8 > local54) {
					@Pc(108) Class189 local108 = Static411.aClass142_4.method3148(local20);
					@Pc(126) int local126 = arg6 + Static343.method4442(arg8, local76, local108.anInt5110, local54 & 0x7, local60 & 0x7, local108.anInt5073);
					@Pc(143) int local143 = Static324.method4289(local108.anInt5110, arg8, local54 & 0x7, local108.anInt5073, local76, local60 & 0x7) + arg5;
					if (local126 > 0 && local143 > 0 && local126 < super.anInt1029 - 1 && local143 < super.anInt1032 - 1) {
						@Pc(171) Class70 local171 = null;
						if (!super.aBoolean64) {
							@Pc(176) int local176 = arg2;
							if ((Static347.aByteArrayArrayArray16[1][local126][local143] & 0x2) == 2) {
								local176 = arg2 - 1;
							}
							if (local176 >= 0) {
								local171 = arg3[local176];
							}
						}
						this.method807(arg2, local143, local126, local171, local72, local76 + arg8 & 0x3, -1, arg2, arg7, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ya;I)V")
	public void method815(@OriginalArg(0) Class51 arg0) {
		Static329.method4317(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt1034 > 1) {
			for (local13 = 0; local13 < super.anInt1029; local13++) {
				for (local17 = 0; local17 < super.anInt1032; local17++) {
					if ((Static347.aByteArrayArrayArray16[1][local13][local17] & 0x2) == 2) {
						Static121.method1997(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; local13 < super.anInt1034; local13++) {
			for (local17 = 0; local17 <= super.anInt1032; local17++) {
				for (@Pc(68) int local68 = 0; super.anInt1029 >= local68; local68++) {
					@Pc(83) int local83;
					@Pc(85) int local85;
					@Pc(87) int local87;
					@Pc(89) int local89;
					@Pc(134) int local134;
					@Pc(227) int local227;
					@Pc(236) int local236;
					@Pc(256) int local256;
					@Pc(260) int local260;
					if ((super.aByteArrayArrayArray13[local13][local68][local17] & 0x1) != 0) {
						local83 = local17;
						local85 = local17;
						local87 = local13;
						local89 = local13;
						while (local83 > 0 && (super.aByteArrayArrayArray13[local13][local68][local83 - 1] & 0x1) != 0) {
							local83--;
						}
						while (super.anInt1032 > local85 && (super.aByteArrayArrayArray13[local13][local68][local85 + 1] & 0x1) != 0) {
							local85++;
						}
						label164: while (local87 > 0) {
							for (local134 = local83; local134 <= local85; local134++) {
								if ((super.aByteArrayArrayArray13[local87 - 1][local68][local134] & 0x1) == 0) {
									break label164;
								}
							}
							local87--;
						}
						label153: while (local89 < 3) {
							for (local134 = local83; local134 <= local85; local134++) {
								if ((super.aByteArrayArrayArray13[local89 + 1][local68][local134] & 0x1) == 0) {
									break label153;
								}
							}
							local89++;
						}
						local134 = (local89 + 1 - local87) * (local85 + 1 - local83);
						if (local134 >= 2) {
							local227 = super.anIntArrayArrayArray3[local89][local68][local83] - 240;
							local236 = super.anIntArrayArrayArray3[local87][local68][local83];
							Static251.method3352(1, local68 << 7, local68 << 7, local83 << 7, (local85 << 7) + 128, local227, local236);
							for (local256 = local87; local256 <= local89; local256++) {
								for (local260 = local83; local260 <= local85; local260++) {
									super.aByteArrayArrayArray13[local256][local68][local260] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local13][local68][local17] & 0x2) != 0) {
						local83 = local68;
						local85 = local68;
						local87 = local13;
						local89 = local13;
						while (local85 < super.anInt1029 && (super.aByteArrayArrayArray13[local13][local85 + 1][local17] & 0x2) != 0) {
							local85++;
						}
						while (local83 > 0 && (super.aByteArrayArrayArray13[local13][local83 - 1][local17] & 0x2) != 0) {
							local83--;
						}
						label217: while (local87 > 0) {
							for (local134 = local83; local134 <= local85; local134++) {
								if ((super.aByteArrayArrayArray13[local87 - 1][local134][local17] & 0x2) == 0) {
									break label217;
								}
							}
							local87--;
						}
						label206: while (local89 < 3) {
							for (local134 = local83; local134 <= local85; local134++) {
								if ((super.aByteArrayArrayArray13[local89 + 1][local134][local17] & 0x2) == 0) {
									break label206;
								}
							}
							local89++;
						}
						local134 = (local89 + 1 - local87) * (local85 + 1 - local83);
						if (local134 >= 2) {
							local227 = super.anIntArrayArrayArray3[local89][local83][local17] - 240;
							local236 = super.anIntArrayArrayArray3[local87][local83][local17];
							Static251.method3352(2, local83 << 7, (local85 << 7) + 128, local17 << 7, local17 << 7, local227, local236);
							for (local256 = local87; local256 <= local89; local256++) {
								for (local260 = local83; local260 <= local85; local260++) {
									super.aByteArrayArrayArray13[local256][local260][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local13][local68][local17] & 0x4) != 0) {
						local83 = local68;
						local85 = local68;
						for (local87 = local17; local87 > 0 && (super.aByteArrayArrayArray13[local13][local68][local87 - 1] & 0x4) != 0; local87--) {
						}
						for (local89 = local17; super.anInt1032 > local89 && (super.aByteArrayArrayArray13[local13][local68][local89 + 1] & 0x4) != 0; local89++) {
						}
						label270: while (local83 > 0) {
							for (local134 = local87; local134 <= local89; local134++) {
								if ((super.aByteArrayArrayArray13[local13][local83 - 1][local134] & 0x4) == 0) {
									break label270;
								}
							}
							local83--;
						}
						label259: while (super.anInt1029 > local85) {
							for (local134 = local87; local134 <= local89; local134++) {
								if ((super.aByteArrayArrayArray13[local13][local85 + 1][local134] & 0x4) == 0) {
									break label259;
								}
							}
							local85++;
						}
						if ((local89 + 1 - local87) * (local85 + -local83 + 1) >= 4) {
							local134 = super.anIntArrayArrayArray3[local13][local83][local87];
							Static251.method3352(4, local83 << 7, (local85 << 7) + 128, local87 << 7, (local89 << 7) + 128, local134, local134);
							for (@Pc(707) int local707 = local83; local707 <= local85; local707++) {
								for (local227 = local87; local227 <= local89; local227++) {
									super.aByteArrayArrayArray13[local13][local707][local227] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ya;[IZILclient!gk;)V")
	public void method816(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class7_Sub14 arg4) {
		if (super.aBoolean64) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(17) Class156 local17 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		while (true) {
			@Pc(28) int local28;
			@Pc(118) int local118;
			@Pc(136) int local136;
			@Pc(140) int local140;
			@Pc(509) int local509;
			while (arg4.anInt4989 < arg4.aByteArray75.length) {
				local28 = arg4.method3981();
				if (local28 == 0) {
					local17 = new Class156(arg4);
				} else {
					@Pc(146) int local146;
					@Pc(424) int local424;
					@Pc(142) int local142;
					if (local28 == 1) {
						local118 = arg4.method3981();
						if (local118 > 0) {
							for (local509 = 0; local509 < local118; local509++) {
								@Pc(518) Class74 local518 = new Class74(arg1, arg4, 0);
								if (local518.anInt2037 == 31) {
									@Pc(529) Class81 local529 = Static230.aClass152_1.method3298(arg4.method3943());
									local518.method1752(local529.anInt2387, local529.anInt2388, local529.anInt2392, local529.anInt2386);
								}
								if (arg1.method5290() > 0) {
									@Pc(546) Class7_Sub30 local546 = local518.aClass7_Sub30_2;
									local142 = (arg0 << 7) + local546.method5032();
									local146 = local546.method5023() + (arg3 << 7);
									local424 = local142 >> 7;
									@Pc(570) int local570 = local146 >> 7;
									if (local424 >= 0 && local570 >= 0 && local424 < super.anInt1029 && super.anInt1032 > local570) {
										local546.method5028(super.anIntArrayArrayArray3[local518.anInt2041][local424][local570] - local546.method5029(), local142, local146);
										Static21.method222(local518);
									}
								}
							}
						}
					} else if (local28 == 2) {
						if (local17 == null) {
							local17 = new Class156();
						}
						local17.method3351(arg4);
					} else if (local28 != 128) {
						if (local28 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local118 = 0; local118 < 4; local118++) {
							@Pc(124) byte local124 = arg4.method3930();
							if (local124 == 0 && super.aByteArrayArrayArray10[local118] != null) {
								local136 = arg0;
								local140 = arg0 + 64;
								local142 = arg3;
								local146 = arg3 + 64;
								if (local140 < 0) {
									local140 = 0;
								} else if (local140 >= super.anInt1029) {
									local140 = super.anInt1029;
								}
								if (arg0 < 0) {
									local136 = 0;
								} else if (super.anInt1029 <= arg0) {
									local136 = super.anInt1029;
								}
								if (arg3 < 0) {
									local142 = 0;
								} else if (arg3 >= super.anInt1032) {
									local142 = super.anInt1032;
								}
								if (local146 < 0) {
									local146 = 0;
								} else if (super.anInt1032 <= local146) {
									local146 = super.anInt1032;
								}
								while (local140 > local136) {
									while (local142 < local146) {
										super.aByteArrayArrayArray10[local118][local136][local142] = 0;
										local142++;
									}
									local136++;
								}
							} else if (local124 == 1) {
								if (super.aByteArrayArrayArray10[local118] == null) {
									super.aByteArrayArrayArray10[local118] = new byte[super.anInt1029 + 1][super.anInt1032 + 1];
								}
								for (local136 = 0; local136 < 64; local136 += 4) {
									for (local140 = 0; local140 < 64; local140 += 4) {
										@Pc(414) byte local414 = arg4.method3930();
										for (local146 = local136 + arg0; local146 < local136 + arg0 + 4; local146++) {
											for (local424 = arg3 + local140; local424 < local140 + arg3 + 4; local424++) {
												if (local146 >= 0 && local146 < super.anInt1029 && local424 >= 0 && local424 < super.anInt1032) {
													super.aByteArrayArrayArray10[local118][local146][local424] = local414;
												}
											}
										}
									}
								}
							} else if (local124 == 2) {
								if (super.aByteArrayArrayArray10[local118] == null) {
									super.aByteArrayArrayArray10[local118] = new byte[super.anInt1029 + 1][super.anInt1032 + 1];
								}
								if (local118 > 0) {
									local136 = arg0;
									local140 = arg0 + 64;
									local142 = arg3;
									if (local140 < 0) {
										local140 = 0;
									} else if (local140 >= super.anInt1029) {
										local140 = super.anInt1029;
									}
									if (arg3 < 0) {
										local142 = 0;
									} else if (arg3 >= super.anInt1032) {
										local142 = super.anInt1032;
									}
									if (arg0 < 0) {
										local136 = 0;
									} else if (arg0 >= super.anInt1029) {
										local136 = super.anInt1029;
									}
									local146 = arg3 + 64;
									if (local146 < 0) {
										local146 = 0;
									} else if (super.anInt1032 <= local146) {
										local146 = super.anInt1032;
									}
									while (local136 < local140) {
										while (local146 > local142) {
											super.aByteArrayArrayArray10[local118][local136][local142] = super.aByteArrayArrayArray10[local118 - 1][local136][local142];
											local142++;
										}
										local136++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg2 == null) {
						arg4.anInt4989 += 10;
					} else {
						arg2[0] = arg4.method3943();
						arg2[1] = arg4.method3961();
						arg2[2] = arg4.method3961();
						arg2[3] = arg4.method3961();
						arg2[4] = arg4.method3943();
					}
				}
			}
			if (local17 != null) {
				for (local28 = 0; local28 < 8; local28++) {
					for (local118 = 0; local118 < 8; local118++) {
						local509 = local28 + (arg0 >> 3);
						local136 = local118 + (arg3 >> 3);
						if (local509 >= 0 && local509 < super.anInt1029 >> 3 && local136 >= 0 && local136 < super.anInt1032 >> 3) {
							Static342.method4437(local17, local509, local136);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray10 != null) {
				for (local28 = 0; local28 < 4; local28++) {
					if (super.aByteArrayArrayArray10[local28] != null) {
						for (local118 = 0; local118 < 16; local118++) {
							for (local509 = 0; local509 < 16; local509++) {
								local136 = (arg0 >> 2) + local118;
								local140 = (arg3 >> 2) + local509;
								if (local136 >= 0 && local136 < 26 && local140 >= 0 && local140 < 26) {
									super.aByteArrayArrayArray10[local28][local136][local140] = 0;
								}
							}
						}
					}
				}
				return;
			}
			return;
		}
	}
}
