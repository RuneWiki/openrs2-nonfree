import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
	public int anInt3762 = 99;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIZ)V")
	public Class113_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static104.aClass117_2, Static179.aClass116_3);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!za;Lclient!uh;III)V")
	public void method2977(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) Class240 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface2 local11 = null;
		if (arg0 == 0) {
			local11 = (Interface2) Static73.method1080(arg3, arg4, arg5);
		}
		if (arg0 == 1) {
			local11 = (Interface2) Static173.method2392(arg3, arg4, arg5);
		}
		if (arg0 == 2) {
			local11 = (Interface2) Static12.method194(arg3, arg4, arg5, bs.class);
		}
		if (arg0 == 3) {
			local11 = (Interface2) Static285.method3519(arg3, arg4, arg5);
		}
		if (local11 == null) {
			return;
		}
		@Pc(70) Class114 local70 = Static398.aClass256_4.method5782(local11.method6037());
		@Pc(74) int local74 = local11.method6035();
		@Pc(78) int local78 = local11.method6034();
		if (local70.method2394()) {
			Static377.method4936(arg3, local70, arg5, arg4);
		}
		if (local11.method6039()) {
			local11.method6036(arg1);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				@Pc(108) Class2_Sub2 local108 = Static173.method2392(arg3, arg4, arg5);
				if (!(local108 instanceof Class2_Sub2_Sub3)) {
					Static358.method4638(arg3, arg4, arg5);
					return;
				}
				((Class2_Sub2_Sub3) local108).aClass2_Sub2_1 = null;
				return;
			}
			if (arg0 == 2) {
				@Pc(137) Class2_Sub1 local137 = Static12.method194(arg3, arg4, arg5, bs.class);
				if (local137 instanceof Class2_Sub1_Sub5 && local137.aShort107 == arg4 && local137.aShort106 == arg5) {
					((Class2_Sub1_Sub5) local137).aClass2_Sub1_2 = null;
				} else {
					Static281.method5919(arg3, arg4, arg5, bs.class);
				}
				if (local70.anInt2991 != 0 && arg4 + local70.anInt2990 < super.anInt3749 && super.anInt3739 > arg5 + local70.anInt2990 && super.anInt3749 > local70.anInt2993 + arg4 && arg5 + local70.anInt2993 < super.anInt3739) {
					arg2.method5409(local78, local70.anInt2990, arg4, arg5, local70.anInt2993, !local70.aBoolean194, local70.lb);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(229) Class2_Sub3 local229 = Static285.method3519(arg3, arg4, arg5);
				if (local229 instanceof Class2_Sub3_Sub3) {
					((Class2_Sub3_Sub3) local229).aClass2_Sub3_1 = null;
				} else {
					Static395.method5139(arg3, arg4, arg5);
				}
				if (local70.anInt2991 != 1) {
					return;
				}
				arg2.method5415(arg4, arg5);
			} else {
				return;
			}
			return;
		}
		@Pc(257) Class2_Sub4 local257 = Static73.method1080(arg3, arg4, arg5);
		if (local257 instanceof Class2_Sub4_Sub3) {
			((Class2_Sub4_Sub3) local257).aClass2_Sub4_1 = null;
		} else {
			Static39.method634(arg3, arg4, arg5);
		}
		if (local70.anInt2991 != 0) {
			arg2.method5411(arg4, local78, arg5, local70.lb, !local70.aBoolean194, local74);
			return;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZLclient!za;Lclient!fh;[II)V")
	public void method2978(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) Class5_Sub15 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean242) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(17) Class196 local17 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(28) int local28;
			@Pc(47) int local47;
			@Pc(229) int local229;
			@Pc(233) int local233;
			@Pc(51) int local51;
			while (arg2.aByteArray93.length > arg2.anInt7013) {
				local28 = arg2.method5539();
				if (local28 == 0) {
					local17 = new Class196(arg2);
				} else {
					@Pc(100) int local100;
					@Pc(108) int local108;
					@Pc(112) int local112;
					if (local28 == 1) {
						local47 = arg2.method5539();
						if (local47 > 0) {
							for (local51 = 0; local51 < local47; local51++) {
								@Pc(60) Class111 local60 = new Class111(arg1, arg2, 0);
								if (local60.anInt2915 == 31) {
									@Pc(71) Class137 local71 = Static227.aClass265_1.method5913(arg2.method5598());
									local60.method2364(local71.anInt3651, local71.anInt3653, local71.anInt3647, local71.anInt3649);
								}
								if (arg1.method5852() > 0) {
									@Pc(91) Class5_Sub19 local91 = local60.aClass5_Sub19_2;
									local100 = local91.method4977() + (arg4 << 7);
									local108 = (arg0 << 7) + local91.method4979();
									local112 = local100 >> 7;
									@Pc(116) int local116 = local108 >> 7;
									if (local112 >= 0 && local116 >= 0 && super.anInt3749 > local112 && local116 < super.anInt3739) {
										local91.method4984(local100, local108, super.anIntArrayArrayArray11[local60.anInt2911][local112][local116] - local91.method4981());
										Static106.method5678(local60);
									}
								}
							}
						}
					} else if (local28 == 2) {
						if (local17 == null) {
							local17 = new Class196();
						}
						local17.method4005(arg2);
					} else if (local28 != 128) {
						if (local28 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray9 == null) {
							super.aByteArrayArrayArray9 = new byte[4][][];
						}
						local11 = true;
						for (local47 = 0; local47 < 4; local47++) {
							@Pc(197) byte local197 = arg2.method5600();
							if (local197 == 0 && super.aByteArrayArrayArray9[local47] != null) {
								local229 = arg4;
								local233 = arg4 + 64;
								local100 = arg0;
								local108 = arg0 + 64;
								if (arg0 < 0) {
									local100 = 0;
								} else if (arg0 >= super.anInt3739) {
									local100 = super.anInt3739;
								}
								if (arg4 < 0) {
									local229 = 0;
								} else if (arg4 >= super.anInt3749) {
									local229 = super.anInt3749;
								}
								if (local233 < 0) {
									local233 = 0;
								} else if (super.anInt3749 <= local233) {
									local233 = super.anInt3749;
								}
								if (local108 < 0) {
									local108 = 0;
								} else if (super.anInt3739 <= local108) {
									local108 = super.anInt3739;
								}
								while (local229 < local233) {
									while (local100 < local108) {
										super.aByteArrayArrayArray9[local47][local229][local100] = 0;
										local100++;
									}
									local229++;
								}
							} else if (local197 == 1) {
								if (super.aByteArrayArrayArray9[local47] == null) {
									super.aByteArrayArrayArray9[local47] = new byte[super.anInt3749 + 1][super.anInt3739 + 1];
								}
								for (local229 = 0; local229 < 64; local229 += 4) {
									for (local233 = 0; local233 < 64; local233 += 4) {
										@Pc(239) byte local239 = arg2.method5600();
										for (local108 = local229 + arg4; local108 < local229 + arg4 + 4; local108++) {
											for (local112 = local233 + arg0; local112 < arg0 + local233 + 4; local112++) {
												if (local108 >= 0 && local108 < super.anInt3749 && local112 >= 0 && super.anInt3739 > local112) {
													super.aByteArrayArrayArray9[local47][local108][local112] = local239;
												}
											}
										}
									}
								}
							} else if (local197 == 2) {
								if (super.aByteArrayArrayArray9[local47] == null) {
									super.aByteArrayArrayArray9[local47] = new byte[super.anInt3749 + 1][super.anInt3739 + 1];
								}
								if (local47 > 0) {
									local229 = arg4;
									local233 = arg4 + 64;
									local100 = arg0;
									if (arg4 < 0) {
										local229 = 0;
									} else if (arg4 >= super.anInt3749) {
										local229 = super.anInt3749;
									}
									local108 = arg0 + 64;
									if (arg0 < 0) {
										local100 = 0;
									} else if (arg0 >= super.anInt3739) {
										local100 = super.anInt3739;
									}
									if (local233 < 0) {
										local233 = 0;
									} else if (super.anInt3749 <= local233) {
										local233 = super.anInt3749;
									}
									if (local108 < 0) {
										local108 = 0;
									} else if (super.anInt3739 <= local108) {
										local108 = super.anInt3739;
									}
									while (local229 < local233) {
										while (local108 > local100) {
											super.aByteArrayArrayArray9[local47][local229][local100] = super.aByteArrayArrayArray9[local47 - 1][local229][local100];
											local100++;
										}
										local229++;
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg2.anInt7013 += 10;
					} else {
						arg3[0] = arg2.method5598();
						arg3[1] = arg2.method5586();
						arg3[2] = arg2.method5586();
						arg3[3] = arg2.method5586();
						arg3[4] = arg2.method5598();
					}
				}
			}
			if (local17 != null) {
				for (local28 = 0; local28 < 8; local28++) {
					for (local47 = 0; local47 < 8; local47++) {
						local51 = (arg4 >> 3) + local28;
						local229 = (arg0 >> 3) + local47;
						if (local51 >= 0 && local51 < super.anInt3749 >> 3 && local229 >= 0 && local229 < super.anInt3739 >> 3) {
							Static142.method2033(local229, local17, local51);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray9 != null) {
				for (local28 = 0; local28 < 4; local28++) {
					if (super.aByteArrayArrayArray9[local28] != null) {
						for (local47 = 0; local47 < 16; local47++) {
							for (local51 = 0; local51 < 16; local51++) {
								local229 = (arg4 >> 2) + local47;
								local233 = (arg0 >> 2) + local51;
								if (local229 >= 0 && local229 < 26 && local233 >= 0 && local233 < 26) {
									super.aByteArrayArrayArray9[local28][local229][local233] = 0;
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

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZIIIILclient!uh;IILclient!za;I)V")
	public void method2979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class240 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class200 arg8, @OriginalArg(10) int arg9) {
		if (!Static216.aClass1_Sub1_1.method3587(Static146.anInt2644) && !Static364.method4712(arg1, arg2, arg7, Static123.anInt2187)) {
			return;
		}
		if (this.anInt3762 > arg9) {
			this.anInt3762 = arg9;
		}
		@Pc(30) Class114 local30 = Static398.aClass256_4.method5782(arg4);
		if (arg8.method5864() && Static216.aClass1_Sub1_1.aBoolean312 && local30.aBoolean198) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg3 == 1 || arg3 == 3) {
			local53 = local30.anInt2993;
			local56 = local30.anInt2990;
		} else {
			local53 = local30.anInt2990;
			local56 = local30.anInt2993;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (super.anInt3749 < local53 + arg2) {
			local72 = arg2;
			local76 = arg2 + 1;
		} else {
			local76 = (local53 + 1 >> 1) + arg2;
			local72 = (local53 >> 1) + arg2;
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (super.anInt3739 >= arg7 + local56) {
			local105 = (local56 >> 1) + arg7;
			local113 = (local56 + 1 >> 1) + arg7;
		} else {
			local105 = arg7;
			local113 = arg7 + 1;
		}
		@Pc(125) Class125 local125 = Static410.aClass125Array3[arg1];
		@Pc(148) int local148 = local125.ua(local72, local105) + local125.ua(local76, local105) + local125.ua(local72, local113) + local125.ua(local76, local113) >> 2;
		@Pc(156) int local156 = (local53 << 6) + (arg2 << 7);
		@Pc(168) int local168 = (local56 << 6) + (arg7 << 7);
		@Pc(180) boolean local180 = Static316.aBoolean342 && !super.aBoolean242 && local30.aBoolean191;
		if (local30.method2394()) {
			Static168.method3851(null, arg2, local30, arg9, null, arg7, arg3);
		}
		@Pc(214) boolean local214 = arg0 == -1 && local30.anInt2967 == -1 && local30.anIntArray169 == null && local30.anIntArray170 == null && !local30.aBoolean193;
		if (Static257.aBoolean275 && (Static410.method5407(arg6) && local30.anInt2961 != 1 || !(!Static263.method3355(arg6) || local30.anInt2961 != 0))) {
			return;
		}
		if (arg6 != 22) {
			@Pc(372) Class2_Sub1 local372;
			@Pc(338) Class2_Sub1_Sub4 local338;
			@Pc(376) int local376;
			if (arg6 == 10 || arg6 == 11) {
				local338 = null;
				if (local214) {
					@Pc(370) Class2_Sub1_Sub4 local370 = new Class2_Sub1_Sub4(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg2, arg2 + local53 - 1, arg7, arg7 + local56 - 1, arg6, arg3, local180);
					local372 = local370;
					local376 = local370.method4158();
					local338 = local370;
				} else {
					local372 = new Class2_Sub1_Sub6(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg2, arg2 + local53 - 1, arg7, arg7 + local56 - 1, arg6, arg3, arg0);
					local376 = 15;
				}
				@Pc(423) Class2_Sub1 local423 = Static12.method194(arg9, arg2, arg7, bs.class);
				@Pc(425) boolean local425 = false;
				if (local423 instanceof Class2_Sub1_Sub5 && local423.aShort107 == arg2 && local423.aShort106 == arg7) {
					((Class2_Sub1_Sub5) local423).aClass2_Sub1_2 = local372;
					local425 = true;
				}
				if (local425 || Static462.method6056(local372, false)) {
					if (local338 != null && local338.method6039()) {
						local338.method6040(arg8);
					}
					if (local30.aBoolean186 && Static316.aBoolean342) {
						if (local376 > 30) {
							local376 = 30;
						}
						for (@Pc(476) int local476 = 0; local476 <= local53; local476++) {
							for (@Pc(480) int local480 = 0; local480 <= local56; local480++) {
								local125.qa(arg2 + local476, local480 + arg7, local376);
							}
						}
					}
				}
				if (local30.anInt2991 != 0 && arg5 != null) {
					arg5.method5406(arg2, local30.lb, arg7, !local30.aBoolean194, local56, local53);
				}
			} else {
				@Pc(622) Class2_Sub1 local622;
				if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
					if (local214) {
						local338 = new Class2_Sub1_Sub4(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg2, arg2 + local53 - 1, arg7, local56 + arg7 - 1, arg6, arg3, local180);
						local372 = local338;
						if (local338.method6039()) {
							local338.method6040(arg8);
						}
					} else {
						local372 = new Class2_Sub1_Sub6(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg2, arg2 + local53 - 1, arg7, arg7 + local56 - 1, arg6, arg3, arg0);
					}
					local622 = Static12.method194(arg9, arg2, arg7, bs.class);
					if (local622 instanceof Class2_Sub1_Sub5 && arg2 == local622.aShort107 && arg7 == local622.aShort106) {
						((Class2_Sub1_Sub5) local622).aClass2_Sub1_2 = local372;
					} else {
						Static462.method6056(local372, false);
					}
					if (Static316.aBoolean342 && !super.aBoolean242 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg9 > 0 && local30.anInt2961 != 0) {
						super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x4);
					}
					if (local30.anInt2991 != 0 && arg5 != null) {
						arg5.method5406(arg2, local30.lb, arg7, !local30.aBoolean194, local56, local53);
					}
				} else {
					@Pc(761) Class2_Sub4 local761;
					if (arg6 == 0) {
						@Pc(726) int local726 = local30.anInt2961;
						if (Static272.aBoolean284 && local30.anInt2961 == -1) {
							local726 = 1;
						}
						if (local214) {
							@Pc(751) Class2_Sub4_Sub2 local751 = new Class2_Sub4_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3, local180);
							if (local751.method6039()) {
								local751.method6040(arg8);
							}
							local761 = local751;
						} else {
							local761 = new Class2_Sub4_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3, arg0);
						}
						@Pc(784) Class2_Sub4 local784 = Static73.method1080(arg9, arg2, arg7);
						if (local784 instanceof Class2_Sub4_Sub3) {
							((Class2_Sub4_Sub3) local784).aClass2_Sub4_1 = local761;
						} else {
							Static270.method3407(arg9, arg2, arg7, local761, null);
						}
						if (Static316.aBoolean342) {
							if (arg3 == 0) {
								if (local30.aBoolean186) {
									local125.qa(arg2, arg7, 50);
									local125.qa(arg2, arg7 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x1);
								}
							} else if (arg3 == 1) {
								if (local30.aBoolean186) {
									local125.qa(arg2, arg7 + 1, 50);
									local125.qa(arg2 + 1, arg7 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray12[arg9][arg2][arg7 + 1] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7 + 1] | 0x2);
								}
							} else if (arg3 == 2) {
								if (local30.aBoolean186) {
									local125.qa(arg2 + 1, arg7, 50);
									local125.qa(arg2 + 1, arg7 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray12[arg9][arg2 + 1][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2 + 1][arg7] | 0x1);
								}
							} else if (arg3 == 3) {
								if (local30.aBoolean186) {
									local125.qa(arg2, arg7, 50);
									local125.qa(arg2 + 1, arg7, 50);
								}
								if (local726 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x2);
								}
							}
						}
						if (local30.anInt2991 != 0 && arg5 != null) {
							arg5.method5417(arg7, local30.lb, arg6, !local30.aBoolean194, arg3, arg2);
						}
						if (local30.anInt3004 != 16) {
							Static213.method2822(arg9, arg2, arg7, local30.anInt3004);
						}
					} else {
						@Pc(1068) Class2_Sub4_Sub2 local1068;
						@Pc(1051) Class2_Sub4 local1051;
						if (arg6 == 1) {
							if (local214) {
								local1068 = new Class2_Sub4_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3, local180);
								if (local1068.method6039()) {
									local1068.method6040(arg8);
								}
								local1051 = local1068;
							} else {
								local1051 = new Class2_Sub4_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3, arg0);
							}
							local761 = Static73.method1080(arg9, arg2, arg7);
							if (local761 instanceof Class2_Sub4_Sub3) {
								((Class2_Sub4_Sub3) local761).aClass2_Sub4_1 = local1051;
							} else {
								Static270.method3407(arg9, arg2, arg7, local1051, null);
							}
							if (local30.aBoolean186 && Static316.aBoolean342) {
								if (arg3 == 0) {
									local125.qa(arg2, arg7 + 1, 50);
								} else if (arg3 == 1) {
									local125.qa(arg2 + 1, arg7 + 1, 50);
								} else if (arg3 == 2) {
									local125.qa(arg2 + 1, arg7, 50);
								} else if (arg3 == 3) {
									local125.qa(arg2, arg7, 50);
								}
							}
							if (local30.anInt2991 != 0 && arg5 != null) {
								arg5.method5417(arg7, local30.lb, arg6, !local30.aBoolean194, arg3, arg2);
							}
						} else if (arg6 == 2) {
							local376 = arg3 + 1 & 0x3;
							if (local214) {
								@Pc(1203) Class2_Sub4_Sub2 local1203 = new Class2_Sub4_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3 + 4, local180);
								@Pc(1218) Class2_Sub4_Sub2 local1218 = new Class2_Sub4_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg6, local376, local180);
								if (local1203.method6039()) {
									local1203.method6040(arg8);
								}
								local761 = local1218;
								local1051 = local1203;
								if (local1218.method6039()) {
									local1218.method6040(arg8);
								}
							} else {
								local1051 = new Class2_Sub4_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3 + 4, arg0);
								local761 = new Class2_Sub4_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg6, local376, arg0);
							}
							Static270.method3407(arg9, arg2, arg7, local1051, local761);
							if (local30.anInt2961 == 1 && Static316.aBoolean342 && !super.aBoolean242) {
								if (arg3 == 0) {
									super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x1);
									super.aByteArrayArrayArray12[arg9][arg2][arg7 + 1] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7 + 1] | 0x2);
								} else if (arg3 == 1) {
									super.aByteArrayArrayArray12[arg9][arg2][arg7 + 1] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg9][arg2 + 1][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2 + 1][arg7] | 0x1);
								} else if (arg3 == 2) {
									super.aByteArrayArrayArray12[arg9][arg2 + 1][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2 + 1][arg7] | 0x1);
									super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x2);
								} else if (arg3 == 3) {
									super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x2);
									super.aByteArrayArrayArray12[arg9][arg2][arg7] = (byte) (super.aByteArrayArrayArray12[arg9][arg2][arg7] | 0x1);
								}
							}
							if (local30.anInt2991 != 0 && arg5 != null) {
								arg5.method5417(arg7, local30.lb, arg6, !local30.aBoolean194, arg3, arg2);
							}
							if (local30.anInt3004 != 16) {
								Static213.method2822(arg9, arg2, arg7, local30.anInt3004);
							}
						} else if (arg6 == 3) {
							if (local214) {
								local1068 = new Class2_Sub4_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3, local180);
								local1051 = local1068;
								if (local1068.method6039()) {
									local1068.method6040(arg8);
								}
							} else {
								local1051 = new Class2_Sub4_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg6, arg3, arg0);
							}
							local761 = Static73.method1080(arg9, arg2, arg7);
							if (local761 instanceof Class2_Sub4_Sub3) {
								((Class2_Sub4_Sub3) local761).aClass2_Sub4_1 = local1051;
							} else {
								Static270.method3407(arg9, arg2, arg7, local1051, null);
							}
							if (local30.aBoolean186 && Static316.aBoolean342) {
								if (arg3 == 0) {
									local125.qa(arg2, arg7 + 1, 50);
								} else if (arg3 == 1) {
									local125.qa(arg2 + 1, arg7 + 1, 50);
								} else if (arg3 == 2) {
									local125.qa(arg2 + 1, arg7, 50);
								} else if (arg3 == 3) {
									local125.qa(arg2, arg7, 50);
								}
							}
							if (local30.anInt2991 != 0 && arg5 != null) {
								arg5.method5417(arg7, local30.lb, arg6, !local30.aBoolean194, arg3, arg2);
							}
						} else if (arg6 == 9) {
							if (local214) {
								local338 = new Class2_Sub1_Sub4(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg2, arg2, arg7, arg7, arg6, arg3, local180);
								local372 = local338;
								if (local338.method6039()) {
									local338.method6040(arg8);
								}
							} else {
								local372 = new Class2_Sub1_Sub6(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg2, local53 + arg2 - 1, arg7, arg7 + local56 - 1, arg6, arg3, arg0);
							}
							local622 = Static12.method194(arg9, arg2, arg7, bs.class);
							if (local622 instanceof Class2_Sub1_Sub5 && local622.aShort107 == arg2 && arg7 == local622.aShort106) {
								((Class2_Sub1_Sub5) local622).aClass2_Sub1_2 = local372;
							} else {
								Static462.method6056(local372, false);
							}
							if (local30.anInt2991 != 0 && arg5 != null) {
								arg5.method5406(arg2, local30.lb, arg7, !local30.aBoolean194, local56, local53);
							}
							if (local30.anInt3004 != 16) {
								Static213.method2822(arg9, arg2, arg7, local30.anInt3004);
							}
						} else {
							@Pc(1821) Class2_Sub2 local1821;
							if (arg6 == 4) {
								if (local214) {
									@Pc(1840) Class2_Sub2_Sub2 local1840 = new Class2_Sub2_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, 0, 0, 0, arg6, arg3);
									if (local1840.method6039()) {
										local1840.method6040(arg8);
									}
									local1821 = local1840;
								} else {
									local1821 = new Class2_Sub2_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, 0, 0, 0, arg6, arg3, arg0);
								}
								@Pc(1855) Class2_Sub2 local1855 = Static173.method2392(arg9, arg2, arg7);
								if (local1855 instanceof Class2_Sub2_Sub3) {
									((Class2_Sub2_Sub3) local1855).aClass2_Sub2_1 = local1821;
								} else {
									Static189.method2559(arg9, arg2, arg7, local1821, null);
								}
							} else {
								@Pc(1877) int local1877;
								@Pc(1883) Interface2 local1883;
								@Pc(1922) Class2_Sub2_Sub2 local1922;
								@Pc(1966) Class2_Sub2 local1966;
								if (arg6 == 5) {
									local1877 = 17;
									local1883 = (Interface2) Static73.method1080(arg9, arg2, arg7);
									if (local1883 != null) {
										local1877 = Static398.aClass256_4.method5782(local1883.method6037()).anInt3004 + 1;
									}
									if (local214) {
										local1922 = new Class2_Sub2_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, 0, Static153.anIntArray442[arg3] * local1877, Static363.anIntArray422[arg3] * local1877, arg6, arg3);
										local1821 = local1922;
										if (local1922.method6039()) {
											local1922.method6040(arg8);
										}
									} else {
										local1821 = new Class2_Sub2_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, 0, local1877 * Static153.anIntArray442[arg3], Static363.anIntArray422[arg3] * local1877, arg6, arg3, arg0);
									}
									local1966 = Static173.method2392(arg9, arg2, arg7);
									if (local1966 instanceof Class2_Sub2_Sub3) {
										((Class2_Sub2_Sub3) local1966).aClass2_Sub2_1 = local1821;
									} else {
										Static189.method2559(arg9, arg2, arg7, local1821, null);
									}
								} else if (arg6 == 6) {
									local1877 = 9;
									local1883 = (Interface2) Static73.method1080(arg9, arg2, arg7);
									if (local1883 != null) {
										local1877 = Static398.aClass256_4.method5782(local1883.method6037()).anInt3004 / 2 + 1;
									}
									if (local214) {
										local1922 = new Class2_Sub2_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg3, Static153.anIntArray442[arg3] * local1877, local1877 * Static363.anIntArray422[arg3], arg6, arg3 + 4);
										local1821 = local1922;
										if (local1922.method6039()) {
											local1922.method6040(arg8);
										}
									} else {
										local1821 = new Class2_Sub2_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg3, Static40.anIntArray35[arg3] * local1877, local1877 * Static285.anIntArray345[arg3], arg6, arg3 + 4, arg0);
									}
									local1966 = Static173.method2392(arg9, arg2, arg7);
									if (local1966 instanceof Class2_Sub2_Sub3) {
										((Class2_Sub2_Sub3) local1966).aClass2_Sub2_1 = local1821;
									} else {
										Static189.method2559(arg9, arg2, arg7, local1821, null);
									}
								} else if (arg6 == 7) {
									local1877 = arg3 + 2 & 0x3;
									if (local214) {
										@Pc(2126) Class2_Sub2_Sub2 local2126 = new Class2_Sub2_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, local1877, 0, 0, arg6, local1877 + 4);
										local1821 = local2126;
										if (local2126.method6039()) {
											local2126.method6040(arg8);
										}
									} else {
										local1821 = new Class2_Sub2_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, local1877, 0, 0, arg6, local1877 + 4, arg0);
									}
									@Pc(2164) Class2_Sub2 local2164 = Static173.method2392(arg9, arg2, arg7);
									if (local2164 instanceof Class2_Sub2_Sub3) {
										((Class2_Sub2_Sub3) local2164).aClass2_Sub2_1 = local1821;
									} else {
										Static189.method2559(arg9, arg2, arg7, local1821, null);
									}
								} else if (arg6 == 8) {
									local376 = arg3 + 2 & 0x3;
									@Pc(2190) int local2190 = 9;
									@Pc(2196) Interface2 local2196 = (Interface2) Static73.method1080(arg9, arg2, arg7);
									if (local2196 != null) {
										local2190 = Static398.aClass256_4.method5782(local2196.method6037()).anInt3004 / 2 + 1;
									}
									@Pc(2239) Class2_Sub2 local2239;
									@Pc(2258) Class2_Sub2 local2258;
									if (local214) {
										local2239 = new Class2_Sub2_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg3, local2190 * Static40.anIntArray35[arg3], Static285.anIntArray345[arg3] * local2190, arg6, arg3 + 4);
										local2258 = new Class2_Sub2_Sub2(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg3, 0, 0, arg6, local376 + 4);
										if (local2239.method6039()) {
											local2239.method6040(arg8);
										}
										if (local2258.method6039()) {
											local2258.method6040(arg8);
										}
									} else {
										local2239 = new Class2_Sub2_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg3, local2190 * Static40.anIntArray35[arg3], local2190 * Static285.anIntArray345[arg3], arg6, arg3 + 4, arg0);
										local2258 = new Class2_Sub2_Sub1(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg3, 0, 0, arg6, local376 + 4, arg0);
									}
									Static189.method2559(arg9, arg2, arg7, local2239, local2258);
								}
							}
						}
					}
				}
			}
		} else if (Static216.aClass1_Sub1_1.aBoolean300 || local30.anInt3001 != 0 || local30.anInt2991 == 1 || local30.aBoolean189) {
			@Pc(280) Class2_Sub3 local280;
			if (local214) {
				@Pc(270) Class2_Sub3_Sub1 local270 = new Class2_Sub3_Sub1(arg8, local30, arg1, local156, local148, local168, super.aBoolean242, arg3, local180);
				if (local270.method6039()) {
					local270.method6040(arg8);
				}
				local280 = local270;
			} else {
				local280 = new Class2_Sub3_Sub2(arg8, local30, arg9, arg1, local156, local148, local168, super.aBoolean242, arg3, arg0);
			}
			@Pc(302) Class2_Sub3 local302 = Static285.method3519(arg9, arg2, arg7);
			if (local302 instanceof Class2_Sub3_Sub3) {
				((Class2_Sub3_Sub3) local302).aClass2_Sub3_1 = local280;
			} else {
				Static324.method3999(arg9, arg2, arg7, local280);
			}
			if (local30.anInt2991 == 1 && arg5 != null) {
				arg5.method5412(arg2, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!za;B)V")
	public void method2980(@OriginalArg(0) Class200 arg0) {
		Static418.method5512(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt3751 > 1) {
			for (local15 = 0; local15 < super.anInt3749; local15++) {
				for (local19 = 0; local19 < super.anInt3739; local19++) {
					if ((Static452.aByteArrayArrayArray16[1][local15][local19] & 0x2) == 2) {
						Static228.method3000(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; super.anInt3751 > local15; local15++) {
			for (local19 = 0; super.anInt3739 >= local19; local19++) {
				for (@Pc(59) int local59 = 0; super.anInt3749 >= local59; local59++) {
					@Pc(74) int local74;
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(80) int local80;
					@Pc(128) int local128;
					@Pc(224) int local224;
					@Pc(233) int local233;
					@Pc(253) int local253;
					@Pc(257) int local257;
					if ((super.aByteArrayArrayArray12[local15][local59][local19] & 0x1) != 0) {
						local74 = local19;
						local76 = local19;
						local78 = local15;
						local80 = local15;
						while (local74 > 0 && (super.aByteArrayArrayArray12[local15][local59][local74 - 1] & 0x1) != 0) {
							local74--;
						}
						while (local76 < super.anInt3739 && (super.aByteArrayArrayArray12[local15][local59][local76 + 1] & 0x1) != 0) {
							local76++;
						}
						label164: while (local78 > 0) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray12[local78 - 1][local59][local128] & 0x1) == 0) {
									break label164;
								}
							}
							local78--;
						}
						label153: while (local80 < 3) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray12[local80 + 1][local59][local128] & 0x1) == 0) {
									break label153;
								}
							}
							local80++;
						}
						local128 = (local80 + 1 - local78) * (local76 + 1 - local74);
						if (local128 >= 2) {
							local224 = super.anIntArrayArrayArray11[local80][local59][local74] - 240;
							local233 = super.anIntArrayArrayArray11[local78][local59][local74];
							Static373.method4883(1, local59 << 7, local59 << 7, local74 << 7, (local76 << 7) + 128, local224, local233);
							for (local253 = local78; local253 <= local80; local253++) {
								for (local257 = local74; local257 <= local76; local257++) {
									super.aByteArrayArrayArray12[local253][local59][local257] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local15][local59][local19] & 0x2) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local15;
						local80 = local15;
						while (super.anInt3749 > local76 && (super.aByteArrayArrayArray12[local15][local76 + 1][local19] & 0x2) != 0) {
							local76++;
						}
						while (local74 > 0 && (super.aByteArrayArrayArray12[local15][local74 - 1][local19] & 0x2) != 0) {
							local74--;
						}
						label217: while (local78 > 0) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray12[local78 - 1][local128][local19] & 0x2) == 0) {
									break label217;
								}
							}
							local78--;
						}
						label206: while (local80 < 3) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray12[local80 + 1][local128][local19] & 0x2) == 0) {
									break label206;
								}
							}
							local80++;
						}
						local128 = (local76 + 1 - local74) * ((local80 - local78) + 1);
						if (local128 >= 2) {
							local224 = super.anIntArrayArrayArray11[local80][local74][local19] - 240;
							local233 = super.anIntArrayArrayArray11[local78][local74][local19];
							Static373.method4883(2, local74 << 7, (local76 << 7) + 128, local19 << 7, local19 << 7, local224, local233);
							for (local253 = local78; local253 <= local80; local253++) {
								for (local257 = local74; local257 <= local76; local257++) {
									super.aByteArrayArrayArray12[local253][local257][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local15][local59][local19] & 0x4) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local19;
						local80 = local19;
						while (local78 > 0 && (super.aByteArrayArrayArray12[local15][local59][local78 - 1] & 0x4) != 0) {
							local78--;
						}
						while (local80 < super.anInt3739 && (super.aByteArrayArrayArray12[local15][local59][local80 + 1] & 0x4) != 0) {
							local80++;
						}
						label270: while (local74 > 0) {
							for (local128 = local78; local128 <= local80; local128++) {
								if ((super.aByteArrayArrayArray12[local15][local74 - 1][local128] & 0x4) == 0) {
									break label270;
								}
							}
							local74--;
						}
						label259: while (local76 < super.anInt3749) {
							for (local128 = local78; local128 <= local80; local128++) {
								if ((super.aByteArrayArrayArray12[local15][local76 + 1][local128] & 0x4) == 0) {
									break label259;
								}
							}
							local76++;
						}
						if ((local80 + 1 - local78) * (local76 + 1 - local74) >= 4) {
							local128 = super.anIntArrayArrayArray11[local15][local74][local78];
							Static373.method4883(4, local74 << 7, (local76 << 7) + 128, local78 << 7, (local80 << 7) + 128, local128, local128);
							for (@Pc(703) int local703 = local74; local703 <= local76; local703++) {
								for (local224 = local78; local224 <= local80; local224++) {
									super.aByteArrayArrayArray12[local15][local703][local224] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([BLclient!za;IIIIIIIB[Lclient!uh;)V")
	public void method2984(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class240[] arg9) {
		@Pc(10) Class5_Sub15 local10 = new Class5_Sub15(arg0);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local10.method5592();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method5542();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local10.method5539();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (arg5 == local61 && arg6 <= local57 && local57 < arg6 + 8 && arg4 <= local51 && arg4 + 8 > local51) {
					@Pc(101) Class114 local101 = Static398.aClass256_4.method5782(local23);
					@Pc(118) int local118 = Static22.method374(local101.anInt2990, local57 & 0x7, arg8, local51 & 0x7, local73, local101.anInt2993) + arg7;
					@Pc(135) int local135 = arg3 + Static17.method283(local101.anInt2993, local101.anInt2990, arg8, local57 & 0x7, local73, local51 & 0x7);
					if (local118 > 0 && local135 > 0 && local118 < super.anInt3749 - 1 && local135 < super.anInt3739 - 1) {
						@Pc(164) Class240 local164 = null;
						if (!super.aBoolean242) {
							@Pc(169) int local169 = arg2;
							if ((Static452.aByteArrayArrayArray16[1][local118][local135] & 0x2) == 2) {
								local169 = arg2 - 1;
							}
							if (local169 >= 0) {
								local164 = arg9[local169];
							}
						}
						this.method2979(-1, arg2, local118, local73 + arg8 & 0x3, local23, local164, local69, local135, arg1, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[IIILclient!za;IBIILclient!fh;)V")
	public void method2985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5_Sub15 arg9) {
		if (super.aBoolean242) {
			return;
		}
		@Pc(21) Class196 local21 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(33) int local33 = (arg4 & 0x7) * 8;
		@Pc(39) int local39 = (arg8 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(44) int local44;
						@Pc(119) int local119;
						@Pc(418) int local418;
						@Pc(158) int local158;
						while (arg9.aByteArray93.length > arg9.anInt7013) {
							local44 = arg9.method5539();
							if (local44 == 0) {
								local21 = new Class196(arg9);
							} else {
								@Pc(294) int local294;
								@Pc(173) int local173;
								@Pc(177) int local177;
								@Pc(215) int local215;
								if (local44 == 1) {
									local119 = arg9.method5539();
									if (local119 > 0) {
										for (local418 = 0; local418 < local119; local418++) {
											@Pc(427) Class111 local427 = new Class111(arg5, arg9, 0);
											if (local427.anInt2915 == 31) {
												@Pc(440) Class137 local440 = Static227.aClass265_1.method5913(arg9.method5598());
												local427.method2364(local440.anInt3651, local440.anInt3653, local440.anInt3647, local440.anInt3649);
											}
											if (arg5.method5852() > 0) {
												@Pc(460) Class5_Sub19 local460 = local427.aClass5_Sub19_2;
												local294 = local460.method4977() >> 7;
												local173 = local460.method4979() >> 7;
												if (local427.anInt2911 == arg1 && local294 >= local33 && local33 + 8 > local294 && local173 >= local39 && local39 + 8 > local173) {
													local177 = (arg0 << 7) + Static213.method2818(arg3, local460.method4977() & 0x3FF, local460.method4979() & 0x3FF);
													local215 = (arg6 << 7) + Static120.method1709(local460.method4979() & 0x3FF, local460.method4977() & 0x3FF, arg3);
													local294 = local177 >> 7;
													local173 = local215 >> 7;
													if (local294 >= 0 && local173 >= 0 && super.anInt3749 > local294 && super.anInt3739 > local173) {
														local460.method4984(local177, local215, super.anIntArrayArrayArray11[arg1][local294][local173] - local460.method4981());
														Static106.method5678(local427);
													}
												}
											}
										}
									}
								} else if (local44 == 2) {
									if (local21 == null) {
										local21 = new Class196();
									}
									local21.method4005(arg9);
								} else if (local44 != 128) {
									if (local44 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray9 == null) {
										super.aByteArrayArrayArray9 = new byte[4][][];
									}
									for (local119 = 0; local119 < 4; local119++) {
										@Pc(125) byte local125 = arg9.method5600();
										@Pc(162) int local162;
										if (local125 == 0 && super.aByteArrayArrayArray9[arg7] != null) {
											if (local119 <= arg1) {
												local158 = arg0;
												local162 = arg0 + 7;
												local294 = arg6;
												if (arg6 < 0) {
													local294 = 0;
												} else if (arg6 >= super.anInt3739) {
													local294 = super.anInt3739;
												}
												local173 = arg6 + 7;
												if (local162 < 0) {
													local162 = 0;
												} else if (local162 >= super.anInt3749) {
													local162 = super.anInt3749;
												}
												if (arg0 < 0) {
													local158 = 0;
												} else if (super.anInt3749 <= arg0) {
													local158 = super.anInt3749;
												}
												if (local173 < 0) {
													local173 = 0;
												} else if (local173 >= super.anInt3739) {
													local173 = super.anInt3739;
												}
												while (local158 < local162) {
													while (local173 > local294) {
														super.aByteArrayArrayArray9[arg7][local158][local294] = 0;
														local294++;
													}
													local158++;
												}
											}
										} else if (local125 == 1) {
											if (super.aByteArrayArrayArray9[arg7] == null) {
												super.aByteArrayArrayArray9[arg7] = new byte[super.anInt3749 + 1][super.anInt3739 + 1];
											}
											for (local158 = 0; local158 < 64; local158 += 4) {
												for (local162 = 0; local162 < 64; local162 += 4) {
													@Pc(168) byte local168 = arg9.method5600();
													if (arg1 >= local119) {
														for (local173 = local158; local173 < local158 + 4; local173++) {
															for (local177 = local162; local177 < local162 + 4; local177++) {
																if (local173 >= local33 && local33 + 8 > local173 && local39 <= local177 && local39 < local39 + 8) {
																	local215 = Static22.method375(local177 & 0x7, arg3, local173 & 0x7) + arg0;
																	@Pc(227) int local227 = Static456.method5987(arg3, local173 & 0x7, local177 & 0x7) + arg6;
																	if (local215 >= 0 && local215 < super.anInt3749 && local227 >= 0 && super.anInt3739 > local227) {
																		super.aByteArrayArrayArray9[arg7][local215][local227] = local168;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg2 == null) {
									arg9.anInt7013 += 10;
								} else {
									arg2[0] = arg9.method5598();
									arg2[1] = arg9.method5586();
									arg2[2] = arg9.method5586();
									arg2[3] = arg9.method5586();
									arg2[4] = arg9.method5598();
								}
							}
						}
						if (local21 != null) {
							Static142.method2033(arg6 >> 3, local21, arg0 >> 3);
						}
						if (super.aByteArrayArrayArray9 != null && super.aByteArrayArrayArray9[arg7] != null) {
							local44 = arg0 + 7;
							local119 = arg6 + 7;
							for (local418 = arg0; local418 < local44; local418++) {
								for (local158 = arg6; local158 < local119; local158++) {
									super.aByteArrayArrayArray9[arg7][local418][local158] = 0;
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

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([BILclient!za;[Lclient!uh;BI)V")
	public void method2986(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) Class240[] arg3, @OriginalArg(5) int arg4) {
		@Pc(18) Class5_Sub15 local18 = new Class5_Sub15(arg0);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method5592();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method5542();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local18.method5539();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(77) int local77 = arg4 + local57;
				@Pc(81) int local81 = arg1 + local51;
				if (local77 > 0 && local81 > 0 && local77 < super.anInt3749 - 1 && super.anInt3739 - 1 > local81) {
					@Pc(102) Class240 local102 = null;
					if (!super.aBoolean242) {
						@Pc(107) int local107 = local61;
						if ((Static452.aByteArrayArrayArray16[1][local77][local81] & 0x2) == 2) {
							local107 = local61 - 1;
						}
						if (local107 >= 0) {
							local102 = arg3[local107];
						}
					}
					this.method2979(-1, local61, local77, local73, local20, local102, local69, local81, arg2, local61);
				}
			}
		}
	}
}
