import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "[Lclient!ka;")
	public static Class93_Sub1[] aClass93_Sub1Array1;

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
	public static int anInt2705 = -1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V")
	public static void method2045(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(14, arg0);
		local8.method2043();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(10) char[] local10 = new char[arg1];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
			@Pc(33) int local33 = arg2[local18 + arg0] & 0xFF;
			if (local33 != 0) {
				if (local33 >= 128 && local33 < 160) {
					@Pc(55) char local55 = Static169.aCharArray5[local33 - 128];
					if (local55 == '\u0000') {
						local55 = '?';
					}
					local33 = local55;
				}
				local10[local16++] = (char) local33;
			}
		}
		return new String(local10, 0, local16);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!qc;Z)V")
	public static void method2049(@OriginalArg(0) Class15_Sub2 arg0) {
		if (arg0.anInt5307 == 0) {
			return;
		}
		@Pc(14) Class123 local14 = arg0.method4297();
		@Pc(43) int local43;
		@Pc(37) int local37;
		if (arg0.anInt5352 != -1 && arg0.anInt5352 < 32768) {
			@Pc(28) Class15_Sub2_Sub1 local28 = Static35.aClass15_Sub2_Sub1Array2[arg0.anInt5352];
			if (local28 != null) {
				local37 = arg0.anInt5371 - local28.anInt5371;
				local43 = arg0.anInt5358 - local28.anInt5358;
				if (local43 != 0 || local37 != 0) {
					arg0.anInt5313 = (int) (Math.atan2((double) local43, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(93) int local93;
		@Pc(68) int local68;
		if (arg0.anInt5352 >= 32768) {
			local68 = arg0.anInt5352 - 32768;
			if (Static22.anInt504 == local68) {
				local68 = 2047;
			}
			@Pc(78) Class15_Sub2_Sub2 local78 = Static188.aClass15_Sub2_Sub2Array41[local68];
			if (local78 != null) {
				local37 = arg0.anInt5358 - local78.anInt5358;
				local93 = arg0.anInt5371 - local78.anInt5371;
				if (local37 != 0 || local93 != 0) {
					arg0.anInt5313 = (int) (Math.atan2((double) local37, (double) local93) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt5324 != 0 || arg0.anInt5344 != 0) && (arg0.anInt5342 == 0 || arg0.anInt5296 > 0)) {
			local68 = arg0.anInt5358 - (arg0.anInt5324 - Static160.anInt5159 - Static160.anInt5159) * 64;
			local43 = arg0.anInt5371 - (arg0.anInt5344 - Static234.anInt4705 - Static234.anInt4705) * 64;
			if (local68 != 0 || local43 != 0) {
				arg0.anInt5313 = (int) (Math.atan2((double) local68, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt5324 = 0;
			arg0.anInt5344 = 0;
		}
		local68 = arg0.anInt5313 - arg0.anInt5373 & 0x7FF;
		if (local68 == 0) {
			arg0.anInt5315 = 0;
			arg0.anInt5361 = 0;
		} else if (local14.anInt4141 == 0) {
			arg0.anInt5315++;
			@Pc(843) boolean local843;
			if (local68 > 1024) {
				arg0.anInt5373 -= arg0.anInt5307;
				local843 = true;
				if (arg0.anInt5307 > local68 || local68 > 2048 - arg0.anInt5307) {
					arg0.anInt5373 = arg0.anInt5313;
					local843 = false;
				}
				if (arg0.anInt5315 > 25 || local843) {
					arg0.anInt5365 = local14.anInt4120;
					if (arg0.anInt5342 <= 0) {
						if (local14.anInt4127 != -1) {
							arg0.anInt5365 = local14.anInt4127;
						}
					} else if (arg0.aByteArray66[arg0.anInt5342 - 1] == 2) {
						if (local14.anInt4118 != -1) {
							arg0.anInt5365 = local14.anInt4118;
						} else if (local14.anInt4111 != -1) {
							arg0.anInt5365 = local14.anInt4111;
						}
					} else if (arg0.aByteArray66[arg0.anInt5342 - 1] == 0) {
						if (local14.anInt4134 != -1) {
							arg0.anInt5365 = local14.anInt4134;
						} else if (local14.anInt4113 != -1) {
							arg0.anInt5365 = local14.anInt4113;
						}
					} else if (local14.anInt4139 != -1) {
						arg0.anInt5365 = local14.anInt4139;
					}
				}
			} else {
				arg0.anInt5373 += arg0.anInt5307;
				local843 = true;
				if (arg0.anInt5307 > local68 || 2048 - arg0.anInt5307 < local68) {
					local843 = false;
					arg0.anInt5373 = arg0.anInt5313;
				}
				if (arg0.anInt5315 > 25 || local843) {
					arg0.anInt5365 = local14.anInt4120;
					if (arg0.anInt5342 > 0) {
						if (arg0.aByteArray66[arg0.anInt5342 - 1] == 2) {
							if (local14.anInt4123 != -1) {
								arg0.anInt5365 = local14.anInt4123;
							} else if (local14.anInt4111 != -1) {
								arg0.anInt5365 = local14.anInt4111;
							}
						} else if (arg0.aByteArray66[arg0.anInt5342 - 1] == 0) {
							if (local14.anInt4131 != -1) {
								arg0.anInt5365 = local14.anInt4131;
							} else if (local14.anInt4113 != -1) {
								arg0.anInt5365 = local14.anInt4113;
							}
						} else if (local14.anInt4112 != -1) {
							arg0.anInt5365 = local14.anInt4112;
						}
					} else if (local14.anInt4116 != -1) {
						arg0.anInt5365 = local14.anInt4116;
					}
				}
			}
			arg0.anInt5373 &= 0x7FF;
		} else {
			arg0.anInt5365 = -1;
			local43 = arg0.anInt5313 << 5;
			if (local43 != arg0.anInt5351) {
				arg0.anInt5311 = 0;
				local37 = local43 - arg0.anInt5369 & 0xFFFF;
				arg0.anInt5351 = local43;
				local93 = arg0.anInt5361 * arg0.anInt5361 / (local14.anInt4141 * 2);
				@Pc(303) int local303;
				if (arg0.anInt5361 > 0 && local93 <= local37 && local37 - local93 < 32768) {
					arg0.aBoolean353 = true;
					arg0.anInt5349 = local37 / 2;
					local303 = local14.anInt4117 * local14.anInt4117 / (local14.anInt4141 * 2);
					if (local303 > 32767) {
						local303 = 32767;
					}
					if (arg0.anInt5349 > local303) {
						arg0.anInt5349 = local37 - local303;
					}
				} else if (arg0.anInt5361 < 0 && local93 <= 65536 - local37 && 65536 - local37 - local93 < 32768) {
					arg0.aBoolean353 = true;
					arg0.anInt5349 = (65536 - local37) / 2;
					local303 = local14.anInt4117 * local14.anInt4117 / (local14.anInt4141 * 2);
					if (local303 > 32767) {
						local303 = 32767;
					}
					if (arg0.anInt5349 > local303) {
						arg0.anInt5349 = 65536 - local303 - local37;
					}
				} else {
					arg0.aBoolean353 = false;
				}
			}
			if (arg0.anInt5361 == 0) {
				local37 = arg0.anInt5351 - arg0.anInt5369 & 0xFFFF;
				if (local14.anInt4141 <= local37) {
					arg0.aBoolean353 = true;
					arg0.anInt5311 = 0;
					local93 = local14.anInt4117 * local14.anInt4117 / (local14.anInt4141 * 2);
					if (local93 > 32767) {
						local93 = 32767;
					}
					if (local37 < 32768) {
						arg0.anInt5349 = local37 / 2;
						arg0.anInt5361 = local14.anInt4141;
						if (local93 < arg0.anInt5349) {
							arg0.anInt5349 = local37 - local93;
						}
					} else {
						arg0.anInt5361 = -local14.anInt4141;
						arg0.anInt5349 = (65536 - local37) / 2;
						if (local93 < arg0.anInt5349) {
							arg0.anInt5349 = 65536 - local93 - local37;
						}
					}
				} else {
					arg0.anInt5369 = arg0.anInt5351;
				}
			} else if (arg0.anInt5361 > 0) {
				if (arg0.anInt5349 <= arg0.anInt5311) {
					arg0.aBoolean353 = false;
				}
				if (!arg0.aBoolean353) {
					arg0.anInt5361 -= local14.anInt4141;
					if (arg0.anInt5361 < 0) {
						arg0.anInt5361 = 0;
					}
				} else if (arg0.anInt5361 < local14.anInt4117) {
					arg0.anInt5361 += local14.anInt4141;
				}
			} else {
				if (arg0.anInt5311 >= arg0.anInt5349) {
					arg0.aBoolean353 = false;
				}
				if (!arg0.aBoolean353) {
					arg0.anInt5361 += local14.anInt4141;
					if (arg0.anInt5361 > 0) {
						arg0.anInt5361 = 0;
					}
				} else if (-local14.anInt4117 < arg0.anInt5361) {
					arg0.anInt5361 -= local14.anInt4141;
				}
			}
			arg0.anInt5369 += arg0.anInt5361;
			arg0.anInt5369 &= 0xFFFF;
			arg0.anInt5373 = arg0.anInt5369 >> 5;
			if (arg0.anInt5361 > 0) {
				arg0.anInt5311 += arg0.anInt5361;
			} else {
				arg0.anInt5311 -= arg0.anInt5361;
			}
			if (arg0.anInt5361 >= 0) {
				if (arg0.anInt5342 > 0) {
					if (arg0.aByteArray66[arg0.anInt5342 - 1] == 2) {
						if (local14.anInt4123 != -1) {
							arg0.anInt5365 = local14.anInt4123;
						} else if (local14.anInt4111 != -1) {
							arg0.anInt5365 = local14.anInt4111;
						}
					} else if (arg0.aByteArray66[arg0.anInt5342 - 1] == 0) {
						if (local14.anInt4131 != -1) {
							arg0.anInt5365 = local14.anInt4131;
						} else if (local14.anInt4113 != -1) {
							arg0.anInt5365 = local14.anInt4113;
						}
					}
				}
				if (arg0.anInt5365 == -1) {
					if (local14.anInt4112 != -1) {
						arg0.anInt5365 = local14.anInt4112;
					} else if (local14.anInt4116 != -1) {
						arg0.anInt5365 = local14.anInt4116;
					}
				}
			} else {
				if (arg0.anInt5342 > 0) {
					if (arg0.aByteArray66[arg0.anInt5342 - 1] == 2) {
						if (local14.anInt4118 != -1) {
							arg0.anInt5365 = local14.anInt4118;
						} else if (local14.anInt4111 != -1) {
							arg0.anInt5365 = local14.anInt4111;
						}
					} else if (arg0.aByteArray66[arg0.anInt5342 - 1] == 0) {
						if (local14.anInt4134 != -1) {
							arg0.anInt5365 = local14.anInt4134;
						} else if (local14.anInt4113 != -1) {
							arg0.anInt5365 = local14.anInt4113;
						}
					}
				}
				if (arg0.anInt5365 == -1) {
					if (local14.anInt4139 != -1) {
						arg0.anInt5365 = local14.anInt4139;
					} else if (local14.anInt4127 != -1) {
						arg0.anInt5365 = local14.anInt4127;
					}
				}
			}
			if (arg0.anInt5365 == -1) {
				arg0.anInt5365 = local14.anInt4120;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI[Lclient!rm;ZII[BI)[I")
	public static int[] method2051(@OriginalArg(1) int arg0, @OriginalArg(2) Class154[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) byte local9;
		if (arg2) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (!arg2) {
			for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
				for (local37 = 0; local37 < 64; local37++) {
					for (local42 = 0; local42 < 64; local42++) {
						if (local37 + arg4 > 0 && local37 + arg4 < 103 && arg0 + local42 > 0 && local42 + arg0 < 103) {
							arg1[local32].anIntArrayArray32[arg4 + local37][local42 + arg0] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		local37 = arg4 + arg3;
		@Pc(114) Class2_Sub16 local114 = new Class2_Sub16(arg5);
		local42 = arg6 + arg0;
		@Pc(135) int local135;
		for (@Pc(121) int local121 = 0; local121 < local9; local121++) {
			for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
				for (local135 = 0; local135 < 64; local135++) {
					Static218.method3618(local130 + arg4, arg0 + local135, false, arg2, local121, local114, 0, 0, local130 + local37, 0, local42 + local135);
				}
			}
		}
		@Pc(176) boolean local176 = false;
		@Pc(178) boolean local178 = false;
		@Pc(198) int local198;
		@Pc(217) int local217;
		@Pc(222) int local222;
		@Pc(348) int local348;
		@Pc(235) int local235;
		while (local114.anInt2789 < local114.aByteArray17.length) {
			local135 = local114.method2146();
			if (local135 == 128) {
				local176 = true;
				Static9.anIntArray300[0] = local114.method2130();
				Static9.anIntArray300[1] = local114.method2191();
				Static9.anIntArray300[2] = local114.method2191();
				Static9.anIntArray300[3] = local114.method2191();
				Static9.anIntArray300[4] = local114.method2130();
			} else {
				if (local135 != 129) {
					local114.anInt2789--;
					break;
				}
				for (local198 = 0; local198 < 4; local198++) {
					@Pc(207) byte local207 = local114.method2170();
					if (local207 == 0) {
						local217 = arg4;
						if (arg4 < 0) {
							local217 = 0;
						} else if (arg4 >= 104) {
							local217 = 104;
						}
						local222 = arg4 + 64;
						local348 = arg0;
						if (local222 < 0) {
							local222 = 0;
						} else if (local222 >= 104) {
							local222 = 104;
						}
						if (arg0 < 0) {
							local348 = 0;
						} else if (arg0 >= 104) {
							local348 = 104;
						}
						local235 = arg0 + 64;
						if (local235 < 0) {
							local235 = 0;
						} else if (local235 >= 104) {
							local235 = 104;
						}
						while (local217 < local222) {
							while (local348 < local235) {
								Static76.aByteArrayArrayArray5[local198][local217][local348] = 0;
								local348++;
							}
							local217++;
						}
					} else if (local207 == 1) {
						for (local217 = 0; local217 < 64; local217 += 4) {
							for (local222 = 0; local222 < 64; local222 += 4) {
								@Pc(231) byte local231 = local114.method2170();
								for (local235 = arg4 + local217; local235 < arg4 + local217 + 4; local235++) {
									for (@Pc(246) int local246 = arg0 + local222; local246 < local222 + arg0 + 4; local246++) {
										if (local235 >= 0 && local235 < 104 && local246 >= 0 && local246 < 104) {
											Static76.aByteArrayArrayArray5[local198][local235][local246] = local231;
										}
									}
								}
							}
						}
					} else if (local207 == 2 && local198 > 0) {
						local217 = arg4;
						local222 = arg4 + 64;
						if (arg4 < 0) {
							local217 = 0;
						} else if (arg4 >= 104) {
							local217 = 104;
						}
						if (local222 < 0) {
							local222 = 0;
						} else if (local222 >= 104) {
							local222 = 104;
						}
						local235 = arg0 + 64;
						local348 = arg0;
						if (arg0 < 0) {
							local348 = 0;
						} else if (arg0 >= 104) {
							local348 = 104;
						}
						if (local235 < 0) {
							local235 = 0;
						} else if (local235 >= 104) {
							local235 = 104;
						}
						while (local222 > local217) {
							while (local235 > local348) {
								Static76.aByteArrayArrayArray5[local198][local217][local348] = Static76.aByteArrayArrayArray5[local198 - 1][local217][local348];
								local348++;
							}
							local217++;
						}
					}
				}
				local178 = true;
			}
		}
		@Pc(582) int local582;
		if (Static116.aBoolean184 && !arg2) {
			@Pc(559) Class100 local559 = null;
			label291: while (true) {
				label284: do {
					while (true) {
						while (local114.anInt2789 < local114.aByteArray17.length) {
							local198 = local114.method2146();
							if (local198 == 0) {
								local559 = new Class100(local114);
							} else {
								if (local198 == 1) {
									local582 = local114.method2146();
									continue label284;
								}
								if (local198 != 2) {
									throw new IllegalStateException();
								}
								if (local559 == null) {
									local559 = new Class100();
								}
								local559.method2851(local114);
							}
						}
						if (local559 == null) {
							local559 = new Class100();
						}
						for (local198 = 0; local198 < 8; local198++) {
							for (local582 = 0; local582 < 8; local582++) {
								local217 = local198 + (arg4 >> 3);
								local222 = (arg0 >> 3) + local582;
								if (local217 >= 0 && local217 < 13 && local222 >= 0 && local222 < 13) {
									Static90.aClass100ArrayArray1[local217][local222] = local559;
								}
							}
						}
						break label291;
					}
				} while (local582 <= 0);
				for (local217 = 0; local217 < local582; local217++) {
					@Pc(602) Class156 local602 = new Class156(local114);
					if (local602.anInt4991 == 31) {
						@Pc(612) Class36 local612 = Static200.method3400(local114.method2130());
						local602.method3988(local612.anInt1449, local612.anInt1441, local612.anInt1442, local612.anInt1450);
					}
					local602.anInt4995 += arg4 << 7;
					local602.anInt4984 += arg0 << 7;
					local348 = local602.anInt4995 >> 7;
					local235 = local602.anInt4984 >> 7;
					if (local348 >= 0 && local235 >= 0 && local348 < 104 && local235 < 104) {
						local602.aBoolean330 = (Static13.aByteArrayArrayArray2[1][local348][local235] & 0x2) != 0;
						local602.anInt4986 = Static9.anIntArrayArrayArray7[local602.anInt4993][local348][local235] - local602.anInt4986;
						Static212.method3542(local602);
					}
				}
			}
		}
		if (!local178) {
			for (local135 = 0; local135 < 4; local135++) {
				for (local198 = 0; local198 < 16; local198++) {
					for (local582 = 0; local582 < 16; local582++) {
						local222 = local582 + (arg0 >> 2);
						local217 = (arg4 >> 2) + local198;
						if (local217 >= 0 && local217 < 26 && local222 >= 0 && local222 < 26) {
							Static76.aByteArrayArrayArray5[local135][local217][local222] = 0;
						}
					}
				}
			}
		}
		return local176 ? Static9.anIntArray300 : null;
	}
}
