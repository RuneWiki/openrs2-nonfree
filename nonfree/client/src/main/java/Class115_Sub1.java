import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt3011 = 99;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIZ)V")
	public Class115_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static259.aClass158_6, Static140.aClass214_28);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!re;I[ILclient!tq;)V")
	public void method2460(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class164 arg4) {
		if (super.aBoolean255) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(26) Class161 local26 = null;
		while (true) {
			@Pc(31) int local31;
			@Pc(128) int local128;
			@Pc(176) int local176;
			@Pc(180) int local180;
			@Pc(522) int local522;
			while (arg1.lb < arg1.aByteArray86.length) {
				local31 = arg1.method5174();
				if (local31 == 0) {
					local26 = new Class161(arg1);
				} else {
					@Pc(182) int local182;
					if (local31 == 1) {
						local128 = arg1.method5174();
						if (local128 > 0) {
							for (local522 = 0; local522 < local128; local522++) {
								@Pc(529) Class1_Sub27_Sub1 local529 = new Class1_Sub27_Sub1(arg1);
								if (local529.anInt3877 == 31) {
									@Pc(540) Class121 local540 = Static68.aClass252_1.method5570(arg1.method5177());
									local529.method3204(local540.anInt3189, local540.anInt3190, local540.anInt3193, local540.anInt3195);
								}
								local529.anInt3874 += arg2 << 7;
								local529.anInt3873 += arg0 << 7;
								local180 = local529.anInt3874 >> 7;
								local182 = local529.anInt3873 >> 7;
								if (local180 >= 0 && local182 >= 0 && local180 < super.anInt3002 && local182 < super.anInt2997) {
									local529.anInt3876 = super.anIntArrayArrayArray2[local529.anInt3881][local180][local182] - local529.anInt3876;
									if (arg4.method5337() > 0) {
										Static347.method5310(local529);
									}
								}
							}
						}
					} else if (local31 == 2) {
						if (local26 == null) {
							local26 = new Class161();
						}
						local26.method3213(arg1);
					} else if (local31 != 128) {
						if (local31 != 129) {
							throw new IllegalStateException((String) null);
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						local11 = true;
						for (local128 = 0; local128 < 4; local128++) {
							@Pc(134) byte local134 = arg1.method5188();
							@Pc(219) int local219;
							if (local134 == 0 && super.aByteArrayArrayArray13[local128] != null) {
								local176 = arg2;
								local180 = arg2 + 64;
								local182 = arg0;
								if (arg2 < 0) {
									local176 = 0;
								} else if (super.anInt3002 <= arg2) {
									local176 = super.anInt3002;
								}
								if (arg0 < 0) {
									local182 = 0;
								} else if (arg0 >= super.anInt2997) {
									local182 = super.anInt2997;
								}
								if (local180 < 0) {
									local180 = 0;
								} else if (local180 >= super.anInt3002) {
									local180 = super.anInt3002;
								}
								local219 = arg0 + 64;
								if (local219 < 0) {
									local219 = 0;
								} else if (local219 >= super.anInt2997) {
									local219 = super.anInt2997;
								}
								while (local176 < local180) {
									while (local182 < local219) {
										super.aByteArrayArrayArray13[local128][local176][local182] = 0;
										local182++;
									}
									local176++;
								}
							} else if (local134 == 1) {
								if (super.aByteArrayArrayArray13[local128] == null) {
									super.aByteArrayArrayArray13[local128] = new byte[super.anInt3002 + 1][super.anInt2997 + 1];
								}
								for (local176 = 0; local176 < 64; local176 += 4) {
									for (local180 = 0; local180 < 64; local180 += 4) {
										@Pc(327) byte local327 = arg1.method5188();
										for (local219 = local176 + arg2; local219 < local176 + arg2 + 4; local219++) {
											for (@Pc(338) int local338 = arg0 + local180; local338 < arg0 + local180 + 4; local338++) {
												if (local219 >= 0 && super.anInt3002 > local219 && local338 >= 0 && local338 < super.anInt2997) {
													super.aByteArrayArrayArray13[local128][local219][local338] = local327;
												}
											}
										}
									}
								}
							} else if (local134 == 2) {
								if (super.aByteArrayArrayArray13[local128] == null) {
									super.aByteArrayArrayArray13[local128] = new byte[super.anInt3002 + 1][super.anInt2997 + 1];
								}
								if (local128 > 0) {
									local176 = arg2;
									local180 = arg2 + 64;
									local182 = arg0;
									if (arg0 < 0) {
										local182 = 0;
									} else if (super.anInt2997 <= arg0) {
										local182 = super.anInt2997;
									}
									if (local180 < 0) {
										local180 = 0;
									} else if (local180 >= super.anInt3002) {
										local180 = super.anInt3002;
									}
									local219 = arg0 + 64;
									if (arg2 < 0) {
										local176 = 0;
									} else if (arg2 >= super.anInt3002) {
										local176 = super.anInt3002;
									}
									if (local219 < 0) {
										local219 = 0;
									} else if (local219 >= super.anInt2997) {
										local219 = super.anInt2997;
									}
									while (local180 > local176) {
										while (local182 < local219) {
											super.aByteArrayArrayArray13[local128][local176][local182] = super.aByteArrayArrayArray13[local128 - 1][local176][local182];
											local182++;
										}
										local176++;
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg1.lb += 10;
					} else {
						arg3[0] = arg1.method5177();
						arg3[1] = arg1.method5180();
						arg3[2] = arg1.method5180();
						arg3[3] = arg1.method5180();
						arg3[4] = arg1.method5177();
					}
				}
			}
			if (local26 != null) {
				for (local31 = 0; local31 < 8; local31++) {
					for (local128 = 0; local128 < 8; local128++) {
						local522 = (arg2 >> 3) + local31;
						local176 = (arg0 >> 3) + local128;
						if (local522 >= 0 && local522 < super.anInt3002 >> 3 && local176 >= 0 && local176 < super.anInt2997 >> 3) {
							Static272.method4178(local522, local176, local26);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray13 != null) {
				for (local31 = 0; local31 < 4; local31++) {
					if (super.aByteArrayArrayArray13[local31] != null) {
						for (local128 = 0; local128 < 16; local128++) {
							for (local522 = 0; local522 < 16; local522++) {
								local176 = local128 + (arg2 >> 2);
								local180 = (arg0 >> 2) + local522;
								if (local176 >= 0 && local176 < 26 && local180 >= 0 && local180 < 26) {
									super.aByteArrayArrayArray13[local31][local176][local180] = 0;
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILclient!tf;IIILclient!tq;III)V")
	public void method2461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class222 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class164 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static188.aClass135_Sub1_1.method2747(Static25.anInt394) && !Static96.method1396(Static35.anInt678, arg8, arg7, arg9)) {
			return;
		}
		if (arg9 < this.anInt3011) {
			this.anInt3011 = arg9;
		}
		@Pc(34) Class236 local34 = Static54.aClass153_1.method3081(arg1);
		if (Static25.anInt394 == 1 && local34.aBoolean548) {
			return;
		}
		@Pc(54) int local54;
		@Pc(57) int local57;
		if (arg0 == 1 || arg0 == 3) {
			local54 = local34.anInt5912;
			local57 = local34.anInt5893;
		} else {
			local57 = local34.anInt5912;
			local54 = local34.anInt5893;
		}
		@Pc(77) int local77;
		@Pc(75) int local75;
		if (local54 + arg8 > super.anInt3002) {
			local75 = arg8 + 1;
			local77 = arg8;
		} else {
			local77 = (local54 >> 1) + arg8;
			local75 = arg8 + (local54 + 1 >> 1);
		}
		@Pc(106) int local106;
		@Pc(110) int local110;
		if (super.anInt2997 < arg7 + local57) {
			local106 = arg7;
			local110 = arg7 + 1;
		} else {
			local110 = arg7 + (local57 + 1 >> 1);
			local106 = arg7 + (local57 >> 1);
		}
		@Pc(132) Class42 local132 = Static229.aClass42Array3[arg5];
		@Pc(156) int local156 = local132.method3060(local77, local106) + local132.method3060(local75, local106) + local132.method3060(local77, local110) + local132.method3060(local75, local110) >> 2;
		@Pc(172) int local172 = (local54 << 6) + (arg8 << 7);
		@Pc(181) int local181 = (arg7 << 7) + (local57 << 6);
		@Pc(193) boolean local193 = Static212.aBoolean354 && !super.aBoolean255 && local34.aBoolean546;
		if (local34.method5086()) {
			Static275.method4229(local34, null, arg9, null, arg0, arg7, arg8);
		}
		@Pc(228) boolean local228 = arg3 == -1 && local34.anInt5902 == -1 && local34.anIntArray709 == null && local34.anIntArray706 == null && !local34.aBoolean542;
		if (Static306.aBoolean491 && local34.anInt5907 != 1) {
			return;
		}
		if (arg4 != 22) {
			@Pc(374) Class25_Sub1 local374;
			@Pc(343) Class25_Sub1_Sub6 local343;
			@Pc(376) int local376;
			if (arg4 == 10 || arg4 == 11) {
				local343 = null;
				if (local228) {
					@Pc(406) Class25_Sub1_Sub6 local406 = new Class25_Sub1_Sub6(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg8, local54 + arg8 - 1, arg7, local57 + arg7 - 1, arg4, arg0, local193);
					local376 = local406.method5254();
					local374 = local406;
					local343 = local406;
				} else {
					local374 = new Class25_Sub1_Sub4(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg8, arg8 + local54 - 1, arg7, local57 + arg7 - 1, arg4, arg0, arg3);
					local376 = 15;
				}
				@Pc(427) Class25_Sub1 local427 = Static67.method1123(arg9, arg8, arg7, ki.class);
				@Pc(429) boolean local429 = false;
				if (local427 instanceof Class25_Sub1_Sub5 && local427.aShort88 == arg8 && local427.aShort89 == arg7) {
					local429 = true;
					((Class25_Sub1_Sub5) local427).aClass25_Sub1_2 = local374;
				}
				if (local429 || Static31.method498(local374, false)) {
					if (local343 != null && local343.method5247()) {
						local343.method5248(arg6);
					}
					if (local34.aBoolean549 && Static212.aBoolean354) {
						if (local376 > 30) {
							local376 = 30;
						}
						for (@Pc(484) int local484 = 0; local484 <= local54; local484++) {
							for (@Pc(488) int local488 = 0; local488 <= local57; local488++) {
								local132.method3045(local484 + arg8, local488 + arg7, local376);
							}
						}
					}
				}
				if (local34.anInt5925 != 0 && arg2 != null) {
					arg2.method4833(arg8, !local34.aBoolean545, local57, arg7, local54, local34.aBoolean540);
				}
			} else {
				@Pc(631) Class25_Sub1 local631;
				if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
					if (local228) {
						local343 = new Class25_Sub1_Sub6(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg8, local54 + arg8 - 1, arg7, arg7 + local57 - 1, arg4, arg0, local193);
						if (local343.method5247()) {
							local343.method5248(arg6);
						}
						local374 = local343;
					} else {
						local374 = new Class25_Sub1_Sub4(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg8, local54 + arg8 - 1, arg7, local57 + arg7 - 1, arg4, arg0, arg3);
					}
					local631 = Static67.method1123(arg9, arg8, arg7, ki.class);
					if (local631 instanceof Class25_Sub1_Sub5 && arg8 == local631.aShort88 && arg7 == local631.aShort89) {
						((Class25_Sub1_Sub5) local631).aClass25_Sub1_2 = local374;
					} else {
						Static31.method498(local374, false);
					}
					if (Static212.aBoolean354 && !super.aBoolean255 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg9 > 0 && local34.anInt5907 != 0) {
						super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x4);
					}
					if (local34.anInt5925 != 0 && arg2 != null) {
						arg2.method4833(arg8, !local34.aBoolean545, local57, arg7, local54, local34.aBoolean540);
					}
				} else {
					@Pc(752) Class25_Sub5 local752;
					if (arg4 == 0) {
						@Pc(726) int local726 = local34.anInt5907;
						if (Static186.aBoolean290 && local34.anInt5907 == -1) {
							local726 = 1;
						}
						if (local228) {
							@Pc(769) Class25_Sub5_Sub3 local769 = new Class25_Sub5_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0, local193);
							if (local769.method5247()) {
								local769.method5248(arg6);
							}
							local752 = local769;
						} else {
							local752 = new Class25_Sub5_Sub1(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0, arg3);
						}
						@Pc(784) Class25_Sub5 local784 = Static186.method2676(arg9, arg8, arg7);
						if (local784 instanceof Class25_Sub5_Sub2) {
							((Class25_Sub5_Sub2) local784).aClass25_Sub5_3 = local752;
						} else {
							Static248.method3689(arg9, arg8, arg7, local752, null);
						}
						if (Static212.aBoolean354) {
							if (arg0 == 0) {
								if (local34.aBoolean549) {
									local132.method3045(arg8, arg7, 50);
									local132.method3045(arg8, arg7 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean255) {
									super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local34.aBoolean549) {
									local132.method3045(arg8, arg7 + 1, 50);
									local132.method3045(arg8 + 1, arg7 - -1, 50);
								}
								if (local726 == 1 && !super.aBoolean255) {
									super.aByteArrayArrayArray14[arg9][arg8][arg7 + 1] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local34.aBoolean549) {
									local132.method3045(arg8 + 1, arg7, 50);
									local132.method3045(arg8 + 1, arg7 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean255) {
									super.aByteArrayArrayArray14[arg9][arg8 + 1][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8 + 1][arg7] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local34.aBoolean549) {
									local132.method3045(arg8, arg7, 50);
									local132.method3045(arg8 + 1, arg7, 50);
								}
								if (local726 == 1 && !super.aBoolean255) {
									super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x2);
								}
							}
						}
						if (local34.anInt5925 != 0 && arg2 != null) {
							arg2.method4829(local34.aBoolean540, arg8, arg4, !local34.aBoolean545, arg7, arg0);
						}
						if (local34.anInt5904 != 16) {
							Static343.method4870(arg9, arg8, arg7, local34.anInt5904);
						}
					} else {
						@Pc(1075) Class25_Sub5_Sub3 local1075;
						@Pc(1058) Class25_Sub5 local1058;
						if (arg4 == 1) {
							if (local228) {
								local1075 = new Class25_Sub5_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0, local193);
								local1058 = local1075;
								if (local1075.method5247()) {
									local1075.method5248(arg6);
								}
							} else {
								local1058 = new Class25_Sub5_Sub1(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0, arg3);
							}
							local752 = Static186.method2676(arg9, arg8, arg7);
							if (local752 instanceof Class25_Sub5_Sub2) {
								((Class25_Sub5_Sub2) local752).aClass25_Sub5_3 = local1058;
							} else {
								Static248.method3689(arg9, arg8, arg7, local1058, null);
							}
							if (local34.aBoolean549 && Static212.aBoolean354) {
								if (arg0 == 0) {
									local132.method3045(arg8, arg7 + 1, 50);
								} else if (arg0 == 1) {
									local132.method3045(arg8 + 1, arg7 + 1, 50);
								} else if (arg0 == 2) {
									local132.method3045(arg8 + 1, arg7, 50);
								} else if (arg0 == 3) {
									local132.method3045(arg8, arg7, 50);
								}
							}
							if (local34.anInt5925 != 0 && arg2 != null) {
								arg2.method4829(local34.aBoolean540, arg8, arg4, !local34.aBoolean545, arg7, arg0);
							}
						} else if (arg4 == 2) {
							local376 = arg0 + 1 & 0x3;
							if (local228) {
								@Pc(1216) Class25_Sub5_Sub3 local1216 = new Class25_Sub5_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0 + 4, local193);
								@Pc(1231) Class25_Sub5_Sub3 local1231 = new Class25_Sub5_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg4, local376, local193);
								if (local1216.method5247()) {
									local1216.method5248(arg6);
								}
								local1058 = local1216;
								local752 = local1231;
								if (local1231.method5247()) {
									local1231.method5248(arg6);
								}
							} else {
								local1058 = new Class25_Sub5_Sub1(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0 + 4, arg3);
								local752 = new Class25_Sub5_Sub1(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg4, local376, arg3);
							}
							Static248.method3689(arg9, arg8, arg7, local1058, local752);
							if (local34.anInt5907 == 1 && Static212.aBoolean354 && !super.aBoolean255) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x1);
									super.aByteArrayArrayArray14[arg9][arg8][arg7 + 1] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray14[arg9][arg8][arg7 + 1] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7 + 1] | 0x2);
									super.aByteArrayArrayArray14[arg9][arg8 + 1][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8 + 1][arg7] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray14[arg9][arg8 + 1][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8 + 1][arg7] | 0x1);
									super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x2);
									super.aByteArrayArrayArray14[arg9][arg8][arg7] = (byte) (super.aByteArrayArrayArray14[arg9][arg8][arg7] | 0x1);
								}
							}
							if (local34.anInt5925 != 0 && arg2 != null) {
								arg2.method4829(local34.aBoolean540, arg8, arg4, !local34.aBoolean545, arg7, arg0);
							}
							if (local34.anInt5904 != 16) {
								Static343.method4870(arg9, arg8, arg7, local34.anInt5904);
							}
						} else if (arg4 == 3) {
							if (local228) {
								local1075 = new Class25_Sub5_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0, local193);
								if (local1075.method5247()) {
									local1075.method5248(arg6);
								}
								local1058 = local1075;
							} else {
								local1058 = new Class25_Sub5_Sub1(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg4, arg0, arg3);
							}
							local752 = Static186.method2676(arg9, arg8, arg7);
							if (local752 instanceof Class25_Sub5_Sub2) {
								((Class25_Sub5_Sub2) local752).aClass25_Sub5_3 = local1058;
							} else {
								Static248.method3689(arg9, arg8, arg7, local1058, null);
							}
							if (local34.aBoolean549 && Static212.aBoolean354) {
								if (arg0 == 0) {
									local132.method3045(arg8, arg7 + 1, 50);
								} else if (arg0 == 1) {
									local132.method3045(arg8 + 1, arg7 - -1, 50);
								} else if (arg0 == 2) {
									local132.method3045(arg8 + 1, arg7, 50);
								} else if (arg0 == 3) {
									local132.method3045(arg8, arg7, 50);
								}
							}
							if (local34.anInt5925 != 0 && arg2 != null) {
								arg2.method4829(local34.aBoolean540, arg8, arg4, !local34.aBoolean545, arg7, arg0);
							}
						} else if (arg4 == 9) {
							if (local228) {
								local343 = new Class25_Sub1_Sub6(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg8, arg8, arg7, arg7, arg4, arg0, local193);
								local374 = local343;
								if (local343.method5247()) {
									local343.method5248(arg6);
								}
							} else {
								local374 = new Class25_Sub1_Sub4(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg8, arg8 + local54 - 1, arg7, arg7 + local57 - 1, arg4, arg0, arg3);
							}
							local631 = Static67.method1123(arg9, arg8, arg7, ki.class);
							if (local631 instanceof Class25_Sub1_Sub5 && arg8 == local631.aShort88 && arg7 == local631.aShort89) {
								((Class25_Sub1_Sub5) local631).aClass25_Sub1_2 = local374;
							} else {
								Static31.method498(local374, false);
							}
							if (local34.anInt5925 != 0 && arg2 != null) {
								arg2.method4833(arg8, !local34.aBoolean545, local57, arg7, local54, local34.aBoolean540);
							}
							if (local34.anInt5904 != 16) {
								Static343.method4870(arg9, arg8, arg7, local34.anInt5904);
							}
						} else {
							@Pc(1839) Class25_Sub3 local1839;
							if (arg4 == 4) {
								if (local228) {
									@Pc(1837) Class25_Sub3_Sub3 local1837 = new Class25_Sub3_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, 0, 0, 0, arg4, arg0);
									local1839 = local1837;
									if (local1837.method5247()) {
										local1837.method5248(arg6);
									}
								} else {
									local1839 = new Class25_Sub3_Sub2(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, 0, 0, 0, arg4, arg0, arg3);
								}
								@Pc(1873) Class25_Sub3 local1873 = Static153.method2323(arg9, arg8, arg7);
								if (local1873 instanceof Class25_Sub3_Sub1) {
									((Class25_Sub3_Sub1) local1873).aClass25_Sub3_3 = local1839;
								} else {
									Static313.method4639(arg9, arg8, arg7, local1839, null);
								}
							} else {
								@Pc(1895) int local1895;
								@Pc(1901) Interface6 local1901;
								@Pc(1938) Class25_Sub3_Sub3 local1938;
								@Pc(1982) Class25_Sub3 local1982;
								if (arg4 == 5) {
									local1895 = 16;
									local1901 = (Interface6) Static186.method2676(arg9, arg8, arg7);
									if (local1901 != null) {
										local1895 = Static54.aClass153_1.method3081(local1901.method5250()).anInt5904;
									}
									if (local228) {
										local1938 = new Class25_Sub3_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, 0, Static2.anIntArray3[arg0] * local1895, local1895 * Static208.anIntArray449[arg0], arg4, arg0);
										local1839 = local1938;
										if (local1938.method5247()) {
											local1938.method5248(arg6);
										}
									} else {
										local1839 = new Class25_Sub3_Sub2(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, 0, Static2.anIntArray3[arg0] * local1895, local1895 * Static208.anIntArray449[arg0], arg4, arg0, arg3);
									}
									local1982 = Static153.method2323(arg9, arg8, arg7);
									if (local1982 instanceof Class25_Sub3_Sub1) {
										((Class25_Sub3_Sub1) local1982).aClass25_Sub3_3 = local1839;
									} else {
										Static313.method4639(arg9, arg8, arg7, local1839, null);
									}
								} else if (arg4 == 6) {
									local1895 = 8;
									local1901 = (Interface6) Static186.method2676(arg9, arg8, arg7);
									if (local1901 != null) {
										local1895 = Static54.aClass153_1.method3081(local1901.method5250()).anInt5904 / 2;
									}
									if (local228) {
										local1938 = new Class25_Sub3_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg0, Static2.anIntArray3[arg0] * local1895, Static208.anIntArray449[arg0] * local1895, arg4, arg0 + 4);
										if (local1938.method5247()) {
											local1938.method5248(arg6);
										}
										local1839 = local1938;
									} else {
										local1839 = new Class25_Sub3_Sub2(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg0, local1895 * Static357.anIntArray723[arg0], Static268.anIntArray569[arg0] * local1895, arg4, arg0 + 4, arg3);
									}
									local1982 = Static153.method2323(arg9, arg8, arg7);
									if (local1982 instanceof Class25_Sub3_Sub1) {
										((Class25_Sub3_Sub1) local1982).aClass25_Sub3_3 = local1839;
									} else {
										Static313.method4639(arg9, arg8, arg7, local1839, null);
									}
								} else if (arg4 == 7) {
									local1895 = arg0 + 2 & 0x3;
									if (local228) {
										@Pc(2140) Class25_Sub3_Sub3 local2140 = new Class25_Sub3_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, local1895, 0, 0, arg4, local1895 + 4);
										if (local2140.method5247()) {
											local2140.method5248(arg6);
										}
										local1839 = local2140;
									} else {
										local1839 = new Class25_Sub3_Sub2(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, local1895, 0, 0, arg4, local1895 + 4, arg3);
									}
									@Pc(2178) Class25_Sub3 local2178 = Static153.method2323(arg9, arg8, arg7);
									if (local2178 instanceof Class25_Sub3_Sub1) {
										((Class25_Sub3_Sub1) local2178).aClass25_Sub3_3 = local1839;
									} else {
										Static313.method4639(arg9, arg8, arg7, local1839, null);
									}
								} else if (arg4 == 8) {
									local376 = arg0 + 2 & 0x3;
									@Pc(2206) int local2206 = 8;
									@Pc(2212) Interface6 local2212 = (Interface6) Static186.method2676(arg9, arg8, arg7);
									if (local2212 != null) {
										local2206 = Static54.aClass153_1.method3081(local2212.method5250()).anInt5904 / 2;
									}
									@Pc(2253) Class25_Sub3 local2253;
									@Pc(2272) Class25_Sub3 local2272;
									if (local228) {
										local2253 = new Class25_Sub3_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg0, local2206 * Static357.anIntArray723[arg0], local2206 * Static268.anIntArray569[arg0], arg4, arg0 + 4);
										local2272 = new Class25_Sub3_Sub3(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg0, 0, 0, arg4, local376 + 4);
										if (local2253.method5247()) {
											local2253.method5248(arg6);
										}
										if (local2272.method5247()) {
											local2272.method5248(arg6);
										}
									} else {
										local2253 = new Class25_Sub3_Sub2(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg0, local2206 * Static357.anIntArray723[arg0], local2206 * Static268.anIntArray569[arg0], arg4, arg0 + 4, arg3);
										local2272 = new Class25_Sub3_Sub2(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg0, 0, 0, arg4, local376 + 4, arg3);
									}
									Static313.method4639(arg9, arg8, arg7, local2253, local2272);
								}
							}
						}
					}
				}
			}
		} else if (Static188.aClass135_Sub1_1.aBoolean326 || local34.anInt5915 != 0 || local34.anInt5925 == 1 || local34.aBoolean544) {
			@Pc(285) Class25_Sub4 local285;
			if (local228) {
				@Pc(275) Class25_Sub4_Sub1 local275 = new Class25_Sub4_Sub1(arg6, local34, arg5, local172, local156, local181, super.aBoolean255, arg0, local193);
				if (local275.method5247()) {
					local275.method5248(arg6);
				}
				local285 = local275;
			} else {
				local285 = new Class25_Sub4_Sub3(arg6, local34, arg9, arg5, local172, local156, local181, super.aBoolean255, arg0, arg3);
			}
			@Pc(307) Class25_Sub4 local307 = Static91.method1355(arg9, arg8, arg7);
			if (local307 instanceof Class25_Sub4_Sub2) {
				((Class25_Sub4_Sub2) local307).aClass25_Sub4_1 = local285;
			} else {
				Static227.method4205(arg9, arg8, arg7, local285);
			}
			if (local34.anInt5925 == 1 && arg2 != null) {
				arg2.method4838(arg8, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!tq;IIIIILclient!tf;)V")
	public void method2463(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class222 arg5) {
		@Pc(7) Interface6 local7 = null;
		if (arg4 == 0) {
			local7 = (Interface6) Static186.method2676(arg2, arg1, arg3);
		}
		if (arg4 == 1) {
			local7 = (Interface6) Static153.method2323(arg2, arg1, arg3);
		}
		if (arg4 == 2) {
			local7 = (Interface6) Static67.method1123(arg2, arg1, arg3, ki.class);
		}
		if (arg4 == 3) {
			local7 = (Interface6) Static91.method1355(arg2, arg1, arg3);
		}
		if (local7 == null) {
			return;
		}
		@Pc(63) Class236 local63 = Static54.aClass153_1.method3081(local7.method5250());
		@Pc(67) int local67 = local7.method5246();
		@Pc(71) int local71 = local7.method5251();
		if (local63.method5086()) {
			Static145.method2193(arg3, local63, arg2, arg1);
		}
		if (local7.method5247()) {
			local7.method5245(arg0);
		}
		if (arg4 == 0) {
			@Pc(96) Class25_Sub5 local96 = Static186.method2676(arg2, arg1, arg3);
			if (local96 instanceof Class25_Sub5_Sub2) {
				((Class25_Sub5_Sub2) local96).aClass25_Sub5_3 = null;
			} else {
				Static284.method4331(arg2, arg1, arg3);
			}
			if (local63.anInt5925 != 0) {
				arg5.method4834(local71, arg1, arg3, local67, local63.aBoolean540, !local63.aBoolean545);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			@Pc(141) Class25_Sub3 local141 = Static153.method2323(arg2, arg1, arg3);
			if (!(local141 instanceof Class25_Sub3_Sub1)) {
				Static215.method3003(arg2, arg1, arg3);
				return;
			}
			((Class25_Sub3_Sub1) local141).aClass25_Sub3_3 = null;
			return;
		}
		if (arg4 == 2) {
			@Pc(172) Class25_Sub1 local172 = Static67.method1123(arg2, arg1, arg3, ki.class);
			if (local172 instanceof Class25_Sub1_Sub5 && arg1 == local172.aShort88 && arg3 == local172.aShort89) {
				((Class25_Sub1_Sub5) local172).aClass25_Sub1_2 = null;
			} else {
				Static155.method2335(arg2, arg1, arg3, ki.class);
			}
			if (local63.anInt5925 != 0 && super.anInt3002 > arg1 + local63.anInt5893 && super.anInt2997 > local63.anInt5893 + arg3 && arg1 + local63.anInt5912 < super.anInt3002 && super.anInt2997 > arg3 + local63.anInt5912) {
				arg5.method4825(arg1, local63.aBoolean540, local63.anInt5893, arg3, local63.anInt5912, local71, !local63.aBoolean545);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		@Pc(262) Class25_Sub4 local262 = Static91.method1355(arg2, arg1, arg3);
		if (local262 instanceof Class25_Sub4_Sub2) {
			((Class25_Sub4_Sub2) local262).aClass25_Sub4_1 = null;
		} else {
			Static115.method1701(arg2, arg1, arg3);
		}
		if (local63.anInt5925 == 1) {
			arg5.method4824(arg3, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!tq;[BI[Lclient!tf;I)V")
	public void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class222[] arg4) {
		@Pc(10) Class1_Sub33 local10 = new Class1_Sub33(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5155();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method5181();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method5174();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(69) int local69 = local49 + arg0;
				@Pc(74) int local74 = local43 + arg3;
				if (local69 > 0 && local74 > 0 && local69 < super.anInt3002 - 1 && super.anInt2997 - 1 > local74) {
					@Pc(92) Class222 local92 = null;
					if (!super.aBoolean255) {
						@Pc(97) int local97 = local53;
						if ((Static373.aByteArrayArrayArray16[1][local69][local74] & 0x2) == 2) {
							local97 = local53 - 1;
						}
						if (local97 >= 0) {
							local92 = arg4[local97];
						}
					}
					this.method2461(local65, local12, local92, -1, local61, local53, arg1, local74, local69, local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[Lclient!tf;IIII[BLclient!tq;III)V")
	public void method2465(@OriginalArg(0) int arg0, @OriginalArg(1) Class222[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) Class164 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub33 local10 = new Class1_Sub33(arg5);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5155();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method5181();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(52) int local52 = local27 >> 6 & 0x3F;
				@Pc(56) int local56 = local27 >> 12;
				@Pc(60) int local60 = local10.method5174();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				if (arg2 == local56 && local52 >= arg8 && arg8 + 8 > local52 && arg0 <= local46 && local46 < arg0 + 8) {
					@Pc(104) Class236 local104 = Static54.aClass153_1.method3081(local12);
					@Pc(121) int local121 = Static260.method3997(local46 & 0x7, arg4, local104.anInt5912, local52 & 0x7, local68, local104.anInt5893) + arg7;
					@Pc(138) int local138 = Static3.method17(local104.anInt5912, arg4, local68, local104.anInt5893, local46 & 0x7, local52 & 0x7) + arg9;
					if (local121 > 0 && local138 > 0 && local121 < super.anInt3002 - 1 && local138 < super.anInt2997 - 1) {
						@Pc(167) Class222 local167 = null;
						if (!super.aBoolean255) {
							@Pc(172) int local172 = arg3;
							if ((Static373.aByteArrayArrayArray16[1][local121][local138] & 0x2) == 2) {
								local172 = arg3 - 1;
							}
							if (local172 >= 0) {
								local167 = arg1[local172];
							}
						}
						this.method2461(arg4 + local68 & 0x3, local12, local167, -1, local64, arg3, arg6, local138, local121, arg3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method2466(@OriginalArg(0) Class164 arg0) {
		Static3.method14(arg0);
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (super.anInt2995 > 1) {
			for (local17 = 0; local17 < super.anInt3002; local17++) {
				for (local21 = 0; super.anInt2997 > local21; local21++) {
					if ((Static373.aByteArrayArrayArray16[1][local17][local21] & 0x2) == 2) {
						Static60.method976(local17, local21);
					}
				}
			}
		}
		for (local17 = 0; local17 < super.anInt2995; local17++) {
			for (local21 = 0; local21 <= super.anInt2997; local21++) {
				for (@Pc(59) int local59 = 0; local59 <= super.anInt3002; local59++) {
					@Pc(74) int local74;
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(98) int local98;
					@Pc(129) int local129;
					@Pc(230) int local230;
					@Pc(239) int local239;
					@Pc(259) int local259;
					@Pc(263) int local263;
					if ((super.aByteArrayArrayArray14[local17][local59][local21] & 0x1) != 0) {
						local74 = local21;
						local76 = local21;
						local78 = local17;
						while (local74 > 0 && (super.aByteArrayArrayArray14[local17][local59][local74 - 1] & 0x1) != 0) {
							local74--;
						}
						local98 = local17;
						while (super.anInt2997 > local76 && (super.aByteArrayArrayArray14[local17][local59][local76 + 1] & 0x1) != 0) {
							local76++;
						}
						label164: while (local78 > 0) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray14[local78 - 1][local59][local129] & 0x1) == 0) {
									break label164;
								}
							}
							local78--;
						}
						label153: while (local98 < 3) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray14[local98 + 1][local59][local129] & 0x1) == 0) {
									break label153;
								}
							}
							local98++;
						}
						local129 = (local76 + 1 - local74) * ((local98 + 1) - local78);
						if (local129 >= 2) {
							local230 = super.anIntArrayArrayArray2[local98][local59][local74] - 240;
							local239 = super.anIntArrayArrayArray2[local78][local59][local74];
							Static138.method2079(1, local59 * 128, local59 * 128, local74 * 128, local76 * 128 + 128, local230, local239);
							for (local259 = local78; local259 <= local98; local259++) {
								for (local263 = local74; local263 <= local76; local263++) {
									super.aByteArrayArrayArray14[local259][local59][local263] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local17][local59][local21] & 0x2) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local17;
						while (local74 > 0 && (super.aByteArrayArrayArray14[local17][local74 - 1][local21] & 0x2) != 0) {
							local74--;
						}
						while (super.anInt3002 > local76 && (super.aByteArrayArrayArray14[local17][local76 + 1][local21] & 0x2) != 0) {
							local76++;
						}
						local98 = local17;
						label218: while (local78 > 0) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray14[local78 - 1][local129][local21] & 0x2) == 0) {
									break label218;
								}
							}
							local78--;
						}
						label207: while (local98 < 3) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray14[local98 + 1][local129][local21] & 0x2) == 0) {
									break label207;
								}
							}
							local98++;
						}
						local129 = (local98 + 1 - local78) * (local76 + 1 - local74);
						if (local129 >= 2) {
							local230 = super.anIntArrayArrayArray2[local98][local74][local21] - 240;
							local239 = super.anIntArrayArrayArray2[local78][local74][local21];
							Static138.method2079(2, local74 * 128, local76 * 128 + 128, local21 * 128, local21 * 128, local230, local239);
							for (local259 = local78; local259 <= local98; local259++) {
								for (local263 = local74; local263 <= local76; local263++) {
									super.aByteArrayArrayArray14[local259][local263][local21] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local17][local59][local21] & 0x4) != 0) {
						local74 = local59;
						local76 = local59;
						for (local78 = local21; local78 > 0 && (super.aByteArrayArrayArray14[local17][local59][local78 - 1] & 0x4) != 0; local78--) {
						}
						for (local98 = local21; super.anInt2997 > local98 && (super.aByteArrayArrayArray14[local17][local59][local98 + 1] & 0x4) != 0; local98++) {
						}
						label272: while (local74 > 0) {
							for (local129 = local78; local129 <= local98; local129++) {
								if ((super.aByteArrayArrayArray14[local17][local74 - 1][local129] & 0x4) == 0) {
									break label272;
								}
							}
							local74--;
						}
						label261: while (super.anInt3002 > local76) {
							for (local129 = local78; local129 <= local98; local129++) {
								if ((super.aByteArrayArrayArray14[local17][local76 + 1][local129] & 0x4) == 0) {
									break label261;
								}
							}
							local76++;
						}
						if ((local76 + 1 - local74) * (local98 + 1 - local78) >= 4) {
							local129 = super.anIntArrayArrayArray2[local17][local74][local78];
							Static138.method2079(4, local74 * 128, local76 * 128 + 128, local78 * 128, local98 * 128 + 128, local129, local129);
							for (@Pc(719) int local719 = local74; local719 <= local76; local719++) {
								for (local230 = local78; local230 <= local98; local230++) {
									super.aByteArrayArrayArray14[local17][local719][local230] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILclient!tq;IIIILclient!re;[I)V")
	public void method2469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class164 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub33 arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean255) {
			return;
		}
		@Pc(17) Class161 local17 = null;
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(29) int local29 = (arg6 & 0x7) * 8;
		@Pc(35) int local35 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(40) int local40;
			@Pc(56) int local56;
			@Pc(333) int local333;
			@Pc(63) int local63;
			while (arg8.aByteArray86.length > arg8.lb) {
				local40 = arg8.method5174();
				if (local40 == 0) {
					local17 = new Class161(arg8);
				} else {
					@Pc(99) int local99;
					@Pc(144) int local144;
					@Pc(161) int local161;
					@Pc(104) int local104;
					if (local40 == 1) {
						local56 = arg8.method5174();
						if (local56 > 0) {
							for (local63 = 0; local63 < local56; local63++) {
								@Pc(70) Class1_Sub27_Sub1 local70 = new Class1_Sub27_Sub1(arg8);
								if (local70.anInt3877 == 31) {
									@Pc(83) Class121 local83 = Static68.aClass252_1.method5570(arg8.method5177());
									local70.method3204(local83.anInt3189, local83.anInt3190, local83.anInt3193, local83.anInt3195);
								}
								local99 = local70.anInt3874 >> 7;
								local104 = local70.anInt3873 >> 7;
								if (arg1 == local70.anInt3881 && local99 >= local29 && local99 < local29 + 8 && local104 >= local35 && local35 + 8 > local104) {
									local144 = (arg2 << 7) + Static268.method4136(arg7, local70.anInt3873 & 0x3FF, local70.anInt3874 & 0x3FF);
									local161 = (arg0 << 7) + Static231.method4900(arg7, local70.anInt3873 & 0x3FF, local70.anInt3874 & 0x3FF);
									local70.anInt3873 = local161;
									local70.anInt3874 = local144;
									local99 = local70.anInt3874 >> 7;
									local104 = local70.anInt3873 >> 7;
									if (local99 >= 0 && local104 >= 0 && local99 < super.anInt3002 && super.anInt2997 > local104) {
										local70.anInt3876 = super.anIntArrayArrayArray2[arg1][local99][local104] - local70.anInt3876;
										if (arg3.method5337() > 0) {
											Static347.method5310(local70);
										}
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local17 == null) {
							local17 = new Class161();
						}
						local17.method3213(arg8);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local56 = 0; local56 < 4; local56++) {
							@Pc(301) byte local301 = arg8.method5188();
							if (local301 == 0 && super.aByteArrayArrayArray13[arg4] != null) {
								if (arg1 >= local56) {
									local333 = arg2;
									local99 = arg2 + 7;
									local104 = arg0;
									if (arg0 < 0) {
										local104 = 0;
									} else if (super.anInt2997 <= arg0) {
										local104 = super.anInt2997;
									}
									if (local99 < 0) {
										local99 = 0;
									} else if (super.anInt3002 <= local99) {
										local99 = super.anInt3002;
									}
									local144 = arg0 + 7;
									if (arg2 < 0) {
										local333 = 0;
									} else if (super.anInt3002 <= arg2) {
										local333 = super.anInt3002;
									}
									if (local144 < 0) {
										local144 = 0;
									} else if (local144 >= super.anInt2997) {
										local144 = super.anInt2997;
									}
									while (local99 > local333) {
										while (local104 < local144) {
											super.aByteArrayArrayArray13[arg4][local333][local104] = 0;
											local104++;
										}
										local333++;
									}
								}
							} else if (local301 == 1) {
								if (super.aByteArrayArrayArray13[arg4] == null) {
									super.aByteArrayArrayArray13[arg4] = new byte[super.anInt3002 + 1][super.anInt2997 + 1];
								}
								for (local333 = 0; local333 < 64; local333 += 4) {
									for (local99 = 0; local99 < 64; local99 += 4) {
										@Pc(343) byte local343 = arg8.method5188();
										if (arg1 >= local56) {
											for (local144 = local333; local144 < local333 + 4; local144++) {
												for (local161 = local99; local161 < local99 + 4; local161++) {
													if (local29 <= local144 && local29 + 8 > local144 && local161 >= local35 && local35 < local35 + 8) {
														@Pc(399) int local399 = arg2 + Static55.method897(local161 & 0x7, arg7, local144 & 0x7);
														@Pc(411) int local411 = Static286.method4349(arg7, local144 & 0x7, local161 & 0x7) + arg0;
														if (local399 >= 0 && local399 < super.anInt3002 && local411 >= 0 && super.anInt2997 > local411) {
															super.aByteArrayArrayArray13[arg4][local399][local411] = local343;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg9 == null) {
						arg8.lb += 10;
					} else {
						arg9[0] = arg8.method5177();
						arg9[1] = arg8.method5180();
						arg9[2] = arg8.method5180();
						arg9[3] = arg8.method5180();
						arg9[4] = arg8.method5177();
					}
				}
			}
			if (local17 != null) {
				Static272.method4178(arg2 >> 3, arg0 >> 3, local17);
			}
			if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg4] != null) {
				local40 = arg2 + 7;
				local56 = arg0 + 7;
				for (local63 = arg2; local63 < local40; local63++) {
					for (local333 = arg0; local333 < local56; local333++) {
						super.aByteArrayArrayArray13[arg4][local63][local333] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
