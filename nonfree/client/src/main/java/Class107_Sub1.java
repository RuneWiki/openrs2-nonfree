import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
	public int anInt2758 = 99;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIZ)V")
	public Class107_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static457.aClass227_6, Static171.aClass210_6);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!sj;IIIIIBIIILclient!za;)V")
	public void method2280(@OriginalArg(0) Class225 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class75 arg9) {
		if (!Static434.aClass165_Sub1_1.method3397(Static404.anInt2752) && !Static246.method3418(arg6, Static184.anInt3250, arg4, arg2)) {
			return;
		}
		if (this.anInt2758 > arg3) {
			this.anInt2758 = arg3;
		}
		@Pc(34) Class192 local34 = Static249.aClass39_2.method748(arg7);
		if (arg9.method6021() && Static434.aClass165_Sub1_1.aBoolean297 && local34.aBoolean381) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg8 == 1 || arg8 == 3) {
			local53 = local34.anInt5446;
			local56 = local34.anInt5455;
		} else {
			local53 = local34.anInt5455;
			local56 = local34.anInt5446;
		}
		@Pc(80) int local80;
		@Pc(78) int local78;
		if (super.anInt2744 < local53 + arg2) {
			local78 = arg2 + 1;
			local80 = arg2;
		} else {
			local80 = arg2 + (local53 >> 1);
			local78 = arg2 + (local53 + 1 >> 1);
		}
		@Pc(120) int local120;
		@Pc(114) int local114;
		if (arg4 + local56 <= super.anInt2746) {
			local114 = arg4 + (local56 + 1 >> 1);
			local120 = (local56 >> 1) + arg4;
		} else {
			local120 = arg4;
			local114 = arg4 + 1;
		}
		@Pc(136) Class22 local136 = Static241.aClass22Array3[arg6];
		@Pc(159) int local159 = local136.ua(local80, local120) + local136.ua(local78, local120) + local136.ua(local80, local114) + local136.ua(local78, local114) >> 2;
		@Pc(167) int local167 = (local53 << 6) + (arg2 << 7);
		@Pc(175) int local175 = (arg4 << 7) + (local56 << 6);
		@Pc(187) boolean local187 = Static255.aBoolean324 && !super.aBoolean171 && local34.aBoolean379;
		if (local34.method4309()) {
			Static238.method3230(arg3, local34, arg8, arg4, arg2, null, null);
		}
		@Pc(221) boolean local221 = arg5 == -1 && local34.anInt5415 == -1 && local34.anIntArray459 == null && local34.anIntArray462 == null && !local34.aBoolean382;
		if (Static117.aBoolean125 && (Static408.method1355(arg1) && local34.anInt5433 != 1 || !(!Static228.method4890(arg1) || local34.anInt5433 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(383) Class11_Sub5 local383;
			@Pc(351) Class11_Sub5_Sub6 local351;
			@Pc(387) int local387;
			if (arg1 == 10 || arg1 == 11) {
				local351 = null;
				if (local221) {
					@Pc(381) Class11_Sub5_Sub6 local381 = new Class11_Sub5_Sub6(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg2, local53 + arg2 - 1, arg4, arg4 + local56 - 1, arg1, arg8, local187);
					local383 = local381;
					local387 = local381.method5724();
					local351 = local381;
				} else {
					local383 = new Class11_Sub5_Sub3(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg2, arg2 + local53 - 1, arg4, arg4 + local56 - 1, arg1, arg8, arg5);
					local387 = 15;
				}
				@Pc(434) Class11_Sub5 local434 = Static345.method4857(arg3, arg2, arg4, jq.class);
				@Pc(436) boolean local436 = false;
				if (local434 instanceof Class11_Sub5_Sub5 && arg2 == local434.aShort108 && arg4 == local434.aShort109) {
					((Class11_Sub5_Sub5) local434).aClass11_Sub5_2 = local383;
					local436 = true;
				}
				if (local436 || Static252.method3490(local383, false)) {
					if (local351 != null && local351.method5722()) {
						local351.method5719(arg9);
					}
					if (local34.aBoolean377 && Static255.aBoolean324) {
						if (local387 > 30) {
							local387 = 30;
						}
						for (@Pc(489) int local489 = 0; local489 <= local53; local489++) {
							for (@Pc(493) int local493 = 0; local493 <= local56; local493++) {
								local136.qa(arg2 + local489, arg4 + local493, local387);
							}
						}
					}
				}
				if (local34.anInt5447 != 0 && arg0 != null) {
					arg0.method5195(local53, local34.aBoolean386, arg2, local56, !local34.aBoolean376, arg4);
				}
			} else {
				@Pc(645) Class11_Sub5 local645;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local221) {
						local351 = new Class11_Sub5_Sub6(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg2, arg2 + local53 - 1, arg4, local56 + arg4 - 1, arg1, arg8, local187);
						local383 = local351;
						if (local351.method5722()) {
							local351.method5719(arg9);
						}
					} else {
						local383 = new Class11_Sub5_Sub3(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg2, arg2 + local53 - 1, arg4, arg4 + local56 - 1, arg1, arg8, arg5);
					}
					local645 = Static345.method4857(arg3, arg2, arg4, jq.class);
					if (local645 instanceof Class11_Sub5_Sub5 && arg2 == local645.aShort108 && arg4 == local645.aShort109) {
						((Class11_Sub5_Sub5) local645).aClass11_Sub5_2 = local383;
					} else {
						Static252.method3490(local383, false);
					}
					if (Static255.aBoolean324 && !super.aBoolean171 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0 && local34.anInt5433 != 0) {
						super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x4);
					}
					if (local34.anInt5447 != 0 && arg0 != null) {
						arg0.method5195(local53, local34.aBoolean386, arg2, local56, !local34.aBoolean376, arg4);
					}
				} else {
					@Pc(775) Class11_Sub1 local775;
					if (arg1 == 0) {
						@Pc(740) int local740 = local34.anInt5433;
						if (Static117.aBoolean124 && local34.anInt5433 == -1) {
							local740 = 1;
						}
						if (local221) {
							@Pc(765) Class11_Sub1_Sub3 local765 = new Class11_Sub1_Sub3(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8, local187);
							if (local765.method5722()) {
								local765.method5719(arg9);
							}
							local775 = local765;
						} else {
							local775 = new Class11_Sub1_Sub2(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8, arg5);
						}
						@Pc(798) Class11_Sub1 local798 = Static45.method700(arg3, arg2, arg4);
						if (local798 instanceof Class11_Sub1_Sub1) {
							((Class11_Sub1_Sub1) local798).aClass11_Sub1_1 = local775;
						} else {
							Static462.method3625(arg3, arg2, arg4, local775, null);
						}
						if (Static255.aBoolean324) {
							if (arg8 == 0) {
								if (local34.aBoolean377) {
									local136.qa(arg2, arg4, 50);
									local136.qa(arg2, arg4 + 1, 50);
								}
								if (local740 == 1 && !super.aBoolean171) {
									super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x1);
								}
							} else if (arg8 == 1) {
								if (local34.aBoolean377) {
									local136.qa(arg2, arg4 + 1, 50);
									local136.qa(arg2 + 1, arg4 - -1, 50);
								}
								if (local740 == 1 && !super.aBoolean171) {
									super.aByteArrayArrayArray8[arg3][arg2][arg4 + 1] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4 + 1] | 0x2);
								}
							} else if (arg8 == 2) {
								if (local34.aBoolean377) {
									local136.qa(arg2 + 1, arg4, 50);
									local136.qa(arg2 + 1, arg4 + 1, 50);
								}
								if (local740 == 1 && !super.aBoolean171) {
									super.aByteArrayArrayArray8[arg3][arg2 + 1][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2 + 1][arg4] | 0x1);
								}
							} else if (arg8 == 3) {
								if (local34.aBoolean377) {
									local136.qa(arg2, arg4, 50);
									local136.qa(arg2 + 1, arg4, 50);
								}
								if (local740 == 1 && !super.aBoolean171) {
									super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x2);
								}
							}
						}
						if (local34.anInt5447 != 0 && arg0 != null) {
							arg0.method5198(arg1, arg2, !local34.aBoolean376, arg4, local34.aBoolean386, arg8);
						}
						if (local34.anInt5439 != 16) {
							Static139.method2167(arg3, arg2, arg4, local34.anInt5439);
						}
					} else {
						@Pc(1085) Class11_Sub1_Sub3 local1085;
						@Pc(1068) Class11_Sub1 local1068;
						if (arg1 == 1) {
							if (local221) {
								local1085 = new Class11_Sub1_Sub3(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8, local187);
								if (local1085.method5722()) {
									local1085.method5719(arg9);
								}
								local1068 = local1085;
							} else {
								local1068 = new Class11_Sub1_Sub2(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8, arg5);
							}
							local775 = Static45.method700(arg3, arg2, arg4);
							if (local775 instanceof Class11_Sub1_Sub1) {
								((Class11_Sub1_Sub1) local775).aClass11_Sub1_1 = local1068;
							} else {
								Static462.method3625(arg3, arg2, arg4, local1068, null);
							}
							if (local34.aBoolean377 && Static255.aBoolean324) {
								if (arg8 == 0) {
									local136.qa(arg2, arg4 + 1, 50);
								} else if (arg8 == 1) {
									local136.qa(arg2 + 1, arg4 + 1, 50);
								} else if (arg8 == 2) {
									local136.qa(arg2 + 1, arg4, 50);
								} else if (arg8 == 3) {
									local136.qa(arg2, arg4, 50);
								}
							}
							if (local34.anInt5447 != 0 && arg0 != null) {
								arg0.method5198(arg1, arg2, !local34.aBoolean376, arg4, local34.aBoolean386, arg8);
							}
						} else if (arg1 == 2) {
							local387 = arg8 + 1 & 0x3;
							if (local221) {
								@Pc(1258) Class11_Sub1_Sub3 local1258 = new Class11_Sub1_Sub3(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8 + 4, local187);
								@Pc(1273) Class11_Sub1_Sub3 local1273 = new Class11_Sub1_Sub3(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg1, local387, local187);
								if (local1258.method5722()) {
									local1258.method5719(arg9);
								}
								local1068 = local1258;
								if (local1273.method5722()) {
									local1273.method5719(arg9);
								}
								local775 = local1273;
							} else {
								local1068 = new Class11_Sub1_Sub2(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8 + 4, arg5);
								local775 = new Class11_Sub1_Sub2(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg1, local387, arg5);
							}
							Static462.method3625(arg3, arg2, arg4, local1068, local775);
							if (local34.anInt5433 == 1 && Static255.aBoolean324 && !super.aBoolean171) {
								if (arg8 == 0) {
									super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x1);
									super.aByteArrayArrayArray8[arg3][arg2][arg4 + 1] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4 + 1] | 0x2);
								} else if (arg8 == 1) {
									super.aByteArrayArrayArray8[arg3][arg2][arg4 + 1] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4 + 1] | 0x2);
									super.aByteArrayArrayArray8[arg3][arg2 + 1][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2 + 1][arg4] | 0x1);
								} else if (arg8 == 2) {
									super.aByteArrayArrayArray8[arg3][arg2 + 1][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2 + 1][arg4] | 0x1);
									super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x2);
								} else if (arg8 == 3) {
									super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x2);
									super.aByteArrayArrayArray8[arg3][arg2][arg4] = (byte) (super.aByteArrayArrayArray8[arg3][arg2][arg4] | 0x1);
								}
							}
							if (local34.anInt5447 != 0 && arg0 != null) {
								arg0.method5198(arg1, arg2, !local34.aBoolean376, arg4, local34.aBoolean386, arg8);
							}
							if (local34.anInt5439 != 16) {
								Static139.method2167(arg3, arg2, arg4, local34.anInt5439);
							}
						} else if (arg1 == 3) {
							if (local221) {
								local1085 = new Class11_Sub1_Sub3(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8, local187);
								if (local1085.method5722()) {
									local1085.method5719(arg9);
								}
								local1068 = local1085;
							} else {
								local1068 = new Class11_Sub1_Sub2(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg1, arg8, arg5);
							}
							local775 = Static45.method700(arg3, arg2, arg4);
							if (local775 instanceof Class11_Sub1_Sub1) {
								((Class11_Sub1_Sub1) local775).aClass11_Sub1_1 = local1068;
							} else {
								Static462.method3625(arg3, arg2, arg4, local1068, null);
							}
							if (local34.aBoolean377 && Static255.aBoolean324) {
								if (arg8 == 0) {
									local136.qa(arg2, arg4 + 1, 50);
								} else if (arg8 == 1) {
									local136.qa(arg2 + 1, arg4 + 1, 50);
								} else if (arg8 == 2) {
									local136.qa(arg2 + 1, arg4, 50);
								} else if (arg8 == 3) {
									local136.qa(arg2, arg4, 50);
								}
							}
							if (local34.anInt5447 != 0 && arg0 != null) {
								arg0.method5198(arg1, arg2, !local34.aBoolean376, arg4, local34.aBoolean386, arg8);
							}
						} else if (arg1 == 9) {
							if (local221) {
								local351 = new Class11_Sub5_Sub6(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg2, arg2, arg4, arg4, arg1, arg8, local187);
								if (local351.method5722()) {
									local351.method5719(arg9);
								}
								local383 = local351;
							} else {
								local383 = new Class11_Sub5_Sub3(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg2, local53 + arg2 - 1, arg4, arg4 + local56 - 1, arg1, arg8, arg5);
							}
							local645 = Static345.method4857(arg3, arg2, arg4, jq.class);
							if (local645 instanceof Class11_Sub5_Sub5 && local645.aShort108 == arg2 && local645.aShort109 == arg4) {
								((Class11_Sub5_Sub5) local645).aClass11_Sub5_2 = local383;
							} else {
								Static252.method3490(local383, false);
							}
							if (local34.anInt5447 != 0 && arg0 != null) {
								arg0.method5195(local53, local34.aBoolean386, arg2, local56, !local34.aBoolean376, arg4);
							}
							if (local34.anInt5439 != 16) {
								Static139.method2167(arg3, arg2, arg4, local34.anInt5439);
							}
						} else {
							@Pc(1849) Class11_Sub2 local1849;
							if (arg1 == 4) {
								if (local221) {
									@Pc(1837) Class11_Sub2_Sub2 local1837 = new Class11_Sub2_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, 0, 0, 0, arg1, arg8);
									if (local1837.method5722()) {
										local1837.method5719(arg9);
									}
									local1849 = local1837;
								} else {
									local1849 = new Class11_Sub2_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, 0, 0, 0, arg1, arg8, arg5);
								}
								@Pc(1875) Class11_Sub2 local1875 = Static130.method2044(arg3, arg2, arg4);
								if (local1875 instanceof Class11_Sub2_Sub3) {
									((Class11_Sub2_Sub3) local1875).aClass11_Sub2_3 = local1849;
								} else {
									Static304.method4350(arg3, arg2, arg4, local1849, null);
								}
							} else {
								@Pc(1897) int local1897;
								@Pc(1903) Interface6 local1903;
								@Pc(1973) Class11_Sub2_Sub2 local1973;
								@Pc(1990) Class11_Sub2 local1990;
								if (arg1 == 5) {
									local1897 = 17;
									local1903 = (Interface6) Static45.method700(arg3, arg2, arg4);
									if (local1903 != null) {
										local1897 = Static249.aClass39_2.method748(local1903.method5718()).anInt5439 + 1;
									}
									if (local221) {
										local1973 = new Class11_Sub2_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, 0, Static112.anIntArray146[arg8] * local1897, local1897 * Static259.anIntArray396[arg8], arg1, arg8);
										local1849 = local1973;
										if (local1973.method5722()) {
											local1973.method5719(arg9);
										}
									} else {
										local1849 = new Class11_Sub2_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, 0, Static112.anIntArray146[arg8] * local1897, local1897 * Static259.anIntArray396[arg8], arg1, arg8, arg5);
									}
									local1990 = Static130.method2044(arg3, arg2, arg4);
									if (local1990 instanceof Class11_Sub2_Sub3) {
										((Class11_Sub2_Sub3) local1990).aClass11_Sub2_3 = local1849;
									} else {
										Static304.method4350(arg3, arg2, arg4, local1849, null);
									}
								} else if (arg1 == 6) {
									local1897 = 9;
									local1903 = (Interface6) Static45.method700(arg3, arg2, arg4);
									if (local1903 != null) {
										local1897 = Static249.aClass39_2.method748(local1903.method5718()).anInt5439 / 2 + 1;
									}
									if (local221) {
										local1973 = new Class11_Sub2_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg8, local1897 * Static112.anIntArray146[arg8], Static259.anIntArray396[arg8] * local1897, arg1, arg8 + 4);
										if (local1973.method5722()) {
											local1973.method5719(arg9);
										}
										local1849 = local1973;
									} else {
										local1849 = new Class11_Sub2_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg8, local1897 * Static175.anIntArray262[arg8], Static195.anIntArray281[arg8] * local1897, arg1, arg8 + 4, arg5);
									}
									local1990 = Static130.method2044(arg3, arg2, arg4);
									if (local1990 instanceof Class11_Sub2_Sub3) {
										((Class11_Sub2_Sub3) local1990).aClass11_Sub2_3 = local1849;
									} else {
										Static304.method4350(arg3, arg2, arg4, local1849, null);
									}
								} else if (arg1 == 7) {
									local1897 = arg8 + 2 & 0x3;
									if (local221) {
										@Pc(2154) Class11_Sub2_Sub2 local2154 = new Class11_Sub2_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, local1897, 0, 0, arg1, local1897 + 4);
										local1849 = local2154;
										if (local2154.method5722()) {
											local2154.method5719(arg9);
										}
									} else {
										local1849 = new Class11_Sub2_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, local1897, 0, 0, arg1, local1897 + 4, arg5);
									}
									@Pc(2194) Class11_Sub2 local2194 = Static130.method2044(arg3, arg2, arg4);
									if (local2194 instanceof Class11_Sub2_Sub3) {
										((Class11_Sub2_Sub3) local2194).aClass11_Sub2_3 = local1849;
									} else {
										Static304.method4350(arg3, arg2, arg4, local1849, null);
									}
								} else if (arg1 == 8) {
									local387 = arg8 + 2 & 0x3;
									@Pc(2222) int local2222 = 9;
									@Pc(2228) Interface6 local2228 = (Interface6) Static45.method700(arg3, arg2, arg4);
									if (local2228 != null) {
										local2222 = Static249.aClass39_2.method748(local2228.method5718()).anInt5439 / 2 + 1;
									}
									@Pc(2271) Class11_Sub2 local2271;
									@Pc(2290) Class11_Sub2 local2290;
									if (local221) {
										local2271 = new Class11_Sub2_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg8, Static175.anIntArray262[arg8] * local2222, Static195.anIntArray281[arg8] * local2222, arg1, arg8 + 4);
										local2290 = new Class11_Sub2_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg8, 0, 0, arg1, local387 + 4);
										if (local2271.method5722()) {
											local2271.method5719(arg9);
										}
										if (local2290.method5722()) {
											local2290.method5719(arg9);
										}
									} else {
										local2271 = new Class11_Sub2_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg8, Static175.anIntArray262[arg8] * local2222, local2222 * Static195.anIntArray281[arg8], arg1, arg8 + 4, arg5);
										local2290 = new Class11_Sub2_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg8, 0, 0, arg1, local387 + 4, arg5);
									}
									Static304.method4350(arg3, arg2, arg4, local2271, local2290);
								}
							}
						}
					}
				}
			}
		} else if (Static434.aClass165_Sub1_1.aBoolean303 || local34.anInt5419 != 0 || local34.anInt5447 == 1 || local34.aBoolean388) {
			@Pc(291) Class11_Sub3 local291;
			if (local221) {
				@Pc(279) Class11_Sub3_Sub2 local279 = new Class11_Sub3_Sub2(arg9, local34, arg6, local167, local159, local175, super.aBoolean171, arg8, local187);
				if (local279.method5722()) {
					local279.method5719(arg9);
				}
				local291 = local279;
			} else {
				local291 = new Class11_Sub3_Sub1(arg9, local34, arg3, arg6, local167, local159, local175, super.aBoolean171, arg8, arg5);
			}
			@Pc(313) Class11_Sub3 local313 = Static115.method1883(arg3, arg2, arg4);
			if (local313 instanceof Class11_Sub3_Sub3) {
				((Class11_Sub3_Sub3) local313).aClass11_Sub3_2 = local291;
			} else {
				Static110.method1807(arg3, arg2, arg4, local291);
			}
			if (local34.anInt5447 == 1 && arg0 != null) {
				arg0.method5187(arg2, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!za;B)V")
	public void method2282(@OriginalArg(0) Class75 arg0) {
		Static55.method899(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt2740 > 1) {
			for (local13 = 0; super.anInt2744 > local13; local13++) {
				for (local17 = 0; local17 < super.anInt2746; local17++) {
					if ((Static326.aByteArrayArrayArray15[1][local13][local17] & 0x2) == 2) {
						Static275.method3928(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt2740 > local13; local13++) {
			for (local17 = 0; local17 <= super.anInt2746; local17++) {
				for (@Pc(57) int local57 = 0; local57 <= super.anInt2744; local57++) {
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(101) int local101;
					@Pc(123) int local123;
					@Pc(222) int local222;
					@Pc(231) int local231;
					@Pc(251) int local251;
					@Pc(255) int local255;
					if ((super.aByteArrayArrayArray8[local13][local57][local17] & 0x1) != 0) {
						local75 = local17;
						local77 = local17;
						local79 = local13;
						while (local77 < super.anInt2746 && (super.aByteArrayArrayArray8[local13][local57][local77 + 1] & 0x1) != 0) {
							local77++;
						}
						local101 = local13;
						while (local75 > 0 && (super.aByteArrayArrayArray8[local13][local57][local75 - 1] & 0x1) != 0) {
							local75--;
						}
						label164: while (local79 > 0) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((super.aByteArrayArrayArray8[local79 - 1][local57][local123] & 0x1) == 0) {
									break label164;
								}
							}
							local79--;
						}
						label153: while (local101 < 3) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((super.aByteArrayArrayArray8[local101 + 1][local57][local123] & 0x1) == 0) {
									break label153;
								}
							}
							local101++;
						}
						local123 = (local77 + 1 - local75) * (local101 + 1 - local79);
						if (local123 >= 2) {
							local222 = super.anIntArrayArrayArray6[local101][local57][local75] - 240;
							local231 = super.anIntArrayArrayArray6[local79][local57][local75];
							Static147.method2232(1, local57 << 7, local57 << 7, local75 << 7, (local77 << 7) + 128, local222, local231);
							for (local251 = local79; local251 <= local101; local251++) {
								for (local255 = local75; local255 <= local77; local255++) {
									super.aByteArrayArrayArray8[local251][local57][local255] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray8[local13][local57][local17] & 0x2) != 0) {
						local75 = local57;
						local77 = local57;
						local79 = local13;
						local101 = local13;
						while (local75 > 0 && (super.aByteArrayArrayArray8[local13][local75 - 1][local17] & 0x2) != 0) {
							local75--;
						}
						while (local77 < super.anInt2744 && (super.aByteArrayArrayArray8[local13][local77 + 1][local17] & 0x2) != 0) {
							local77++;
						}
						label218: while (local79 > 0) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((super.aByteArrayArrayArray8[local79 - 1][local123][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local79--;
						}
						label207: while (local101 < 3) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((super.aByteArrayArrayArray8[local101 + 1][local123][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local101++;
						}
						local123 = (local101 + 1 - local79) * (local77 + 1 - local75);
						if (local123 >= 2) {
							local222 = super.anIntArrayArrayArray6[local101][local75][local17] - 240;
							local231 = super.anIntArrayArrayArray6[local79][local75][local17];
							Static147.method2232(2, local75 << 7, (local77 << 7) + 128, local17 << 7, local17 << 7, local222, local231);
							for (local251 = local79; local251 <= local101; local251++) {
								for (local255 = local75; local255 <= local77; local255++) {
									super.aByteArrayArrayArray8[local251][local255][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray8[local13][local57][local17] & 0x4) != 0) {
						local75 = local57;
						local77 = local57;
						for (local79 = local17; local79 > 0 && (super.aByteArrayArrayArray8[local13][local57][local79 - 1] & 0x4) != 0; local79--) {
						}
						for (local101 = local17; local101 < super.anInt2746 && (super.aByteArrayArrayArray8[local13][local57][local101 + 1] & 0x4) != 0; local101++) {
						}
						label271: while (local75 > 0) {
							for (local123 = local79; local123 <= local101; local123++) {
								if ((super.aByteArrayArrayArray8[local13][local75 - 1][local123] & 0x4) == 0) {
									break label271;
								}
							}
							local75--;
						}
						label260: while (super.anInt2744 > local77) {
							for (local123 = local79; local123 <= local101; local123++) {
								if ((super.aByteArrayArrayArray8[local13][local77 + 1][local123] & 0x4) == 0) {
									break label260;
								}
							}
							local77++;
						}
						if ((local101 + 1 - local79) * (local77 - local75 - -1) >= 4) {
							local123 = super.anIntArrayArrayArray6[local13][local75][local79];
							Static147.method2232(4, local75 << 7, (local77 << 7) + 128, local79 << 7, (local101 << 7) + 128, local123, local123);
							for (@Pc(698) int local698 = local75; local698 <= local77; local698++) {
								for (local222 = local79; local222 <= local101; local222++) {
									super.aByteArrayArrayArray8[local13][local698][local222] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!hw;II[ILclient!za;I)V")
	public void method2283(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean171) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(19) Class226 local19 = null;
		while (true) {
			while (true) {
				while (true) {
					@Pc(32) int local32;
					@Pc(118) int local118;
					@Pc(506) int local506;
					@Pc(136) int local136;
					@Pc(140) int local140;
					while (arg0.aByteArray94.length > arg0.anInt7523) {
						local32 = arg0.method6138();
						if (local32 == 0) {
							local19 = new Class226(arg0);
						} else {
							@Pc(142) int local142;
							@Pc(162) int local162;
							@Pc(420) int local420;
							if (local32 == 1) {
								local118 = arg0.method6138();
								if (local118 > 0) {
									for (local506 = 0; local506 < local118; local506++) {
										@Pc(515) Class38 local515 = new Class38(arg3, arg0, 0);
										if (local515.anInt775 == 31) {
											@Pc(528) Class146 local528 = Static379.aClass152_2.method3074(arg0.method6148());
											local515.method736(local528.anInt3695, local528.anInt3698, local528.anInt3692, local528.anInt3693);
										}
										if (arg3.method5994() > 0) {
											@Pc(545) Class2_Sub4 local545 = local515.aClass2_Sub4_1;
											local142 = local545.method4087() + (arg1 << 7);
											local162 = (arg4 << 7) + local545.method4092();
											local420 = local142 >> 7;
											@Pc(569) int local569 = local162 >> 7;
											if (local420 >= 0 && local569 >= 0 && super.anInt2744 > local420 && super.anInt2746 > local569) {
												local545.method4088(super.anIntArrayArrayArray6[local515.anInt779][local420][local569] - local545.method4081(), local162, local142);
												Static11.method174(local515);
											}
										}
									}
								}
							} else if (local32 == 2) {
								if (local19 == null) {
									local19 = new Class226();
								}
								local19.method5204(arg0);
							} else if (local32 != 128) {
								if (local32 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								local11 = true;
								for (local118 = 0; local118 < 4; local118++) {
									@Pc(124) byte local124 = arg0.method6120();
									if (local124 == 0 && super.aByteArrayArrayArray11[local118] != null) {
										local136 = arg1;
										local140 = arg1 + 64;
										local142 = arg4;
										if (arg1 < 0) {
											local136 = 0;
										} else if (super.anInt2744 <= arg1) {
											local136 = super.anInt2744;
										}
										local162 = arg4 + 64;
										if (arg4 < 0) {
											local142 = 0;
										} else if (arg4 >= super.anInt2746) {
											local142 = super.anInt2746;
										}
										if (local140 < 0) {
											local140 = 0;
										} else if (local140 >= super.anInt2744) {
											local140 = super.anInt2744;
										}
										if (local162 < 0) {
											local162 = 0;
										} else if (super.anInt2746 <= local162) {
											local162 = super.anInt2746;
										}
										while (local140 > local136) {
											while (local142 < local162) {
												super.aByteArrayArrayArray11[local118][local136][local142] = 0;
												local142++;
											}
											local136++;
										}
									} else if (local124 == 1) {
										if (super.aByteArrayArrayArray11[local118] == null) {
											super.aByteArrayArrayArray11[local118] = new byte[super.anInt2744 + 1][super.anInt2746 + 1];
										}
										for (local136 = 0; local136 < 64; local136 += 4) {
											for (local140 = 0; local140 < 64; local140 += 4) {
												@Pc(410) byte local410 = arg0.method6120();
												for (local162 = arg1 + local136; local162 < arg1 + local136 + 4; local162++) {
													for (local420 = local140 + arg4; local420 < local140 + arg4 + 4; local420++) {
														if (local162 >= 0 && super.anInt2744 > local162 && local420 >= 0 && local420 < super.anInt2746) {
															super.aByteArrayArrayArray11[local118][local162][local420] = local410;
														}
													}
												}
											}
										}
									} else if (local124 == 2) {
										if (super.aByteArrayArrayArray11[local118] == null) {
											super.aByteArrayArrayArray11[local118] = new byte[super.anInt2744 + 1][super.anInt2746 + 1];
										}
										if (local118 > 0) {
											local136 = arg1;
											local140 = arg1 + 64;
											local142 = arg4;
											if (arg4 < 0) {
												local142 = 0;
											} else if (arg4 >= super.anInt2746) {
												local142 = super.anInt2746;
											}
											local162 = arg4 + 64;
											if (local140 < 0) {
												local140 = 0;
											} else if (local140 >= super.anInt2744) {
												local140 = super.anInt2744;
											}
											if (arg1 < 0) {
												local136 = 0;
											} else if (arg1 >= super.anInt2744) {
												local136 = super.anInt2744;
											}
											if (local162 < 0) {
												local162 = 0;
											} else if (local162 >= super.anInt2746) {
												local162 = super.anInt2746;
											}
											while (local136 < local140) {
												while (local162 > local142) {
													super.aByteArrayArrayArray11[local118][local136][local142] = super.aByteArrayArrayArray11[local118 - 1][local136][local142];
													local142++;
												}
												local136++;
											}
										}
									}
								}
							} else if (arg2 == null) {
								arg0.anInt7523 += 10;
							} else {
								arg2[0] = arg0.method6148();
								arg2[1] = arg0.method6149();
								arg2[2] = arg0.method6149();
								arg2[3] = arg0.method6149();
								arg2[4] = arg0.method6148();
							}
						}
					}
					if (local19 != null) {
						for (local32 = 0; local32 < 8; local32++) {
							for (local118 = 0; local118 < 8; local118++) {
								local506 = (arg1 >> 3) + local32;
								local136 = (arg4 >> 3) + local118;
								if (local506 >= 0 && local506 < super.anInt2744 >> 3 && local136 >= 0 && local136 < super.anInt2746 >> 3) {
									Static374.method5209(local136, local19, local506);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray11 != null) {
						for (local32 = 0; local32 < 4; local32++) {
							if (super.aByteArrayArrayArray11[local32] != null) {
								for (local118 = 0; local118 < 16; local118++) {
									for (local506 = 0; local506 < 16; local506++) {
										local136 = (arg1 >> 2) + local118;
										local140 = (arg4 >> 2) + local506;
										if (local136 >= 0 && local136 < 26 && local140 >= 0 && local140 < 26) {
											super.aByteArrayArrayArray11[local32][local136][local140] = 0;
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
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!za;I[BI[Lclient!sj;BIII)V")
	public void method2284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class225[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method6116();
			if (local22 == 0) {
				return;
			}
			local12 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local10.method6174();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(66) int local66 = local10.method6138();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				if (local62 == arg9 && arg5 <= local58 && local58 < arg5 + 8 && local52 >= arg3 && local52 < arg3 + 8) {
					@Pc(110) Class192 local110 = Static249.aClass39_2.method748(local12);
					@Pc(127) int local127 = Static123.method1962(arg7, local52 & 0x7, local110.anInt5446, local74, local110.anInt5455, local58 & 0x7) + arg8;
					@Pc(145) int local145 = arg1 + Static4.method54(local110.anInt5455, arg7, local110.anInt5446, local74, local58 & 0x7, local52 & 0x7);
					if (local127 > 0 && local145 > 0 && local127 < super.anInt2744 - 1 && super.anInt2746 - 1 > local145) {
						@Pc(177) Class225 local177 = null;
						if (!super.aBoolean171) {
							@Pc(182) int local182 = arg0;
							if ((Static326.aByteArrayArrayArray15[1][local127][local145] & 0x2) == 2) {
								local182 = arg0 - 1;
							}
							if (local182 >= 0) {
								local177 = arg6[local182];
							}
						}
						this.method2280(local177, local70, local127, arg0, local145, -1, arg0, local12, arg7 + local74 & 0x3, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILclient!za;ILclient!sj;Z)V")
	public void method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class225 arg5) {
		@Pc(7) Interface6 local7 = null;
		if (arg4 == 0) {
			local7 = (Interface6) Static45.method700(arg1, arg2, arg0);
		}
		if (arg4 == 1) {
			local7 = (Interface6) Static130.method2044(arg1, arg2, arg0);
		}
		if (arg4 == 2) {
			local7 = (Interface6) Static345.method4857(arg1, arg2, arg0, jq.class);
		}
		if (arg4 == 3) {
			local7 = (Interface6) Static115.method1883(arg1, arg2, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(76) Class192 local76 = Static249.aClass39_2.method748(local7.method5718());
		@Pc(80) int local80 = local7.method5721();
		@Pc(84) int local84 = local7.method5723();
		if (local76.method4309()) {
			Static247.method3421(local76, arg1, arg2, arg0);
		}
		if (local7.method5722()) {
			local7.method5720(arg3);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				@Pc(114) Class11_Sub2 local114 = Static130.method2044(arg1, arg2, arg0);
				if (local114 instanceof Class11_Sub2_Sub3) {
					((Class11_Sub2_Sub3) local114).aClass11_Sub2_3 = null;
					return;
				}
				Static241.method3295(arg1, arg2, arg0);
				return;
			}
			if (arg4 == 2) {
				@Pc(178) Class11_Sub5 local178 = Static345.method4857(arg1, arg2, arg0, jq.class);
				if (local178 instanceof Class11_Sub5_Sub5 && arg2 == local178.aShort108 && arg0 == local178.aShort109) {
					((Class11_Sub5_Sub5) local178).aClass11_Sub5_2 = null;
				} else {
					Static84.method6295(arg1, arg2, arg0, jq.class);
				}
				if (local76.anInt5447 == 0 || super.anInt2744 <= arg2 + local76.anInt5455 || arg0 + local76.anInt5455 >= super.anInt2746 || arg2 + local76.anInt5446 >= super.anInt2744 || local76.anInt5446 + arg0 >= super.anInt2746) {
					return;
				}
				arg5.method5191(local84, local76.anInt5446, local76.anInt5455, !local76.aBoolean376, arg2, arg0, local76.aBoolean386);
			} else if (arg4 == 3) {
				@Pc(140) Class11_Sub3 local140 = Static115.method1883(arg1, arg2, arg0);
				if (local140 instanceof Class11_Sub3_Sub3) {
					((Class11_Sub3_Sub3) local140).aClass11_Sub3_2 = null;
				} else {
					Static166.method2376(arg1, arg2, arg0);
				}
				if (local76.anInt5447 == 1) {
					arg5.method5188(arg0, arg2);
					return;
				}
			}
			return;
		}
		@Pc(286) Class11_Sub1 local286 = Static45.method700(arg1, arg2, arg0);
		if (local286 instanceof Class11_Sub1_Sub1) {
			((Class11_Sub1_Sub1) local286).aClass11_Sub1_1 = null;
		} else {
			Static107.method1784(arg1, arg2, arg0);
		}
		if (local76.anInt5447 != 0) {
			arg5.method5192(local76.aBoolean386, local80, !local76.aBoolean376, arg2, local84, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z[Lclient!sj;IILclient!za;[B)V")
	public void method2287(@OriginalArg(1) Class225[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method6116();
			if (local32 == 0) {
				return;
			}
			local12 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local10.method6174();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(62) int local62 = local43 & 0x3F;
				@Pc(68) int local68 = local43 >> 6 & 0x3F;
				@Pc(72) int local72 = local43 >> 12;
				@Pc(76) int local76 = local10.method6138();
				@Pc(80) int local80 = local76 >> 2;
				@Pc(84) int local84 = local76 & 0x3;
				@Pc(88) int local88 = arg1 + local68;
				@Pc(92) int local92 = arg2 + local62;
				if (local88 > 0 && local92 > 0 && local88 < super.anInt2744 - 1 && local92 < super.anInt2746 - 1) {
					@Pc(116) Class225 local116 = null;
					if (!super.aBoolean171) {
						@Pc(121) int local121 = local72;
						if ((Static326.aByteArrayArrayArray15[1][local88][local92] & 0x2) == 2) {
							local121 = local72 - 1;
						}
						if (local121 >= 0) {
							local116 = arg0[local121];
						}
					}
					this.method2280(local116, local80, local88, local72, local92, -1, local72, local12, local84, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[ILclient!hw;IIZLclient!za;I)V")
	public void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class2_Sub17 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class75 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean171) {
			return;
		}
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(23) Class226 local23 = null;
		@Pc(29) int local29 = (arg3 & 0x7) * 8;
		@Pc(35) int local35 = (arg6 & 0x7) * 8;
		while (true) {
			@Pc(40) int local40;
			@Pc(56) int local56;
			@Pc(300) int local300;
			@Pc(60) int local60;
			while (arg5.aByteArray94.length > arg5.anInt7523) {
				local40 = arg5.method6138();
				if (local40 == 0) {
					local23 = new Class226(arg5);
				} else {
					@Pc(109) int local109;
					@Pc(163) int local163;
					@Pc(182) int local182;
					@Pc(103) int local103;
					if (local40 == 1) {
						local56 = arg5.method6138();
						if (local56 > 0) {
							for (local60 = 0; local60 < local56; local60++) {
								@Pc(69) Class38 local69 = new Class38(arg8, arg5, 0);
								if (local69.anInt775 == 31) {
									@Pc(80) Class146 local80 = Static379.aClass152_2.method3074(arg5.method6148());
									local69.method736(local80.anInt3695, local80.anInt3698, local80.anInt3692, local80.anInt3693);
								}
								if (arg8.method5994() > 0) {
									@Pc(97) Class2_Sub4 local97 = local69.aClass2_Sub4_1;
									local103 = local97.method4087() >> 7;
									local109 = local97.method4092() >> 7;
									if (arg1 == local69.anInt779 && local103 >= local29 && local103 < local29 + 8 && local35 <= local109 && local35 + 8 > local109) {
										local163 = Static321.method4567(arg9, local97.method4087() & 0x3FF, local97.method4092() & 0x3FF) + (arg2 << 7);
										local182 = (arg0 << 7) + Static75.method1142(local97.method4087() & 0x3FF, local97.method4092() & 0x3FF, arg9);
										local103 = local163 >> 7;
										local109 = local182 >> 7;
										if (local103 >= 0 && local109 >= 0 && super.anInt2744 > local103 && super.anInt2746 > local109) {
											local97.method4088(super.anIntArrayArrayArray6[arg1][local103][local109] - local97.method4081(), local182, local163);
											Static11.method174(local69);
										}
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local23 == null) {
							local23 = new Class226();
						}
						local23.method5204(arg5);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						for (local56 = 0; local56 < 4; local56++) {
							@Pc(270) byte local270 = arg5.method6120();
							@Pc(304) int local304;
							if (local270 == 0 && super.aByteArrayArrayArray11[arg7] != null) {
								if (arg1 >= local56) {
									local300 = arg2;
									local304 = arg2 + 7;
									local103 = arg0;
									local109 = arg0 + 7;
									if (arg0 < 0) {
										local103 = 0;
									} else if (arg0 >= super.anInt2746) {
										local103 = super.anInt2746;
									}
									if (local304 < 0) {
										local304 = 0;
									} else if (super.anInt2744 <= local304) {
										local304 = super.anInt2744;
									}
									if (arg2 < 0) {
										local300 = 0;
									} else if (arg2 >= super.anInt2744) {
										local300 = super.anInt2744;
									}
									if (local109 < 0) {
										local109 = 0;
									} else if (super.anInt2746 <= local109) {
										local109 = super.anInt2746;
									}
									while (local300 < local304) {
										while (local109 > local103) {
											super.aByteArrayArrayArray11[arg7][local300][local103] = 0;
											local103++;
										}
										local300++;
									}
								}
							} else if (local270 == 1) {
								if (super.aByteArrayArrayArray11[arg7] == null) {
									super.aByteArrayArrayArray11[arg7] = new byte[super.anInt2744 + 1][super.anInt2746 + 1];
								}
								for (local300 = 0; local300 < 64; local300 += 4) {
									for (local304 = 0; local304 < 64; local304 += 4) {
										@Pc(310) byte local310 = arg5.method6120();
										if (arg1 >= local56) {
											for (local109 = local300; local109 < local300 + 4; local109++) {
												for (local163 = local304; local163 < local304 + 4; local163++) {
													if (local109 >= local29 && local109 < local29 + 8 && local163 >= local35 && local35 < local35 + 8) {
														local182 = Static378.method5926(arg9, local109 & 0x7, local163 & 0x7) + arg2;
														@Pc(370) int local370 = arg0 + Static317.method4504(arg9, local109 & 0x7, local163 & 0x7);
														if (local182 >= 0 && super.anInt2744 > local182 && local370 >= 0 && local370 < super.anInt2746) {
															super.aByteArrayArrayArray11[arg7][local182][local370] = local310;
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
						arg5.anInt7523 += 10;
					} else {
						arg4[0] = arg5.method6148();
						arg4[1] = arg5.method6149();
						arg4[2] = arg5.method6149();
						arg4[3] = arg5.method6149();
						arg4[4] = arg5.method6148();
					}
				}
			}
			if (local23 != null) {
				Static374.method5209(arg0 >> 3, local23, arg2 >> 3);
			}
			if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg7] != null) {
				local40 = arg2 + 7;
				local56 = arg0 + 7;
				for (local60 = arg2; local60 < local40; local60++) {
					for (local300 = arg0; local300 < local56; local300++) {
						super.aByteArrayArrayArray11[arg7][local60][local300] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
