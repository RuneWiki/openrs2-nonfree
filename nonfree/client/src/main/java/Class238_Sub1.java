import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class238_Sub1 extends Class238 {

	@OriginalMember(owner = "client!op", name = "O", descriptor = "I")
	public int anInt6931 = 99;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIZ)V")
	public Class238_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static457.aClass7_6, Static429.aClass41_5);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!oa;ILclient!iaa;II)V")
	public void method5551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class138 arg4, @OriginalArg(5) int arg5) {
		@Pc(19) Interface22 local19 = null;
		if (arg0 == 0) {
			local19 = (Interface22) Static556.method7726(arg3, arg1, arg5);
		}
		if (arg0 == 1) {
			local19 = (Interface22) Static533.method7261(arg3, arg1, arg5);
		}
		if (arg0 == 2) {
			local19 = (Interface22) Static406.method5850(arg3, arg1, arg5, uq.class);
		}
		if (arg0 == 3) {
			local19 = (Interface22) Static361.method5373(arg3, arg1, arg5);
		}
		if (local19 == null) {
			return;
		}
		@Pc(74) Class192 local74 = Static85.aClass27_1.method516(local19.method7171());
		@Pc(78) int local78 = local19.method7176();
		@Pc(82) int local82 = local19.method7175();
		if (local74.method4589()) {
			Static14.method5933(arg1, arg5, local74, arg3);
		}
		if (local19.method7173()) {
			local19.method7177(arg2);
		}
		if (arg0 == 0) {
			@Pc(107) Class15_Sub1 local107 = Static556.method7726(arg3, arg1, arg5);
			if (local107 instanceof Class15_Sub1_Sub2) {
				((Class15_Sub1_Sub2) local107).aClass15_Sub1_3 = null;
			} else {
				Static395.method5727(arg3, arg1, arg5);
			}
			if (local74.anInt5604 != 0) {
				arg4.method3453(arg1, local74.aBoolean396, arg5, local78, !local74.aBoolean387, local82);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			@Pc(150) Class15_Sub4 local150 = Static533.method7261(arg3, arg1, arg5);
			if (!(local150 instanceof Class15_Sub4_Sub3)) {
				Static357.method5353(arg3, arg1, arg5);
				return;
			}
			((Class15_Sub4_Sub3) local150).aClass15_Sub4_3 = null;
			return;
		}
		if (arg0 == 2) {
			@Pc(181) Class15_Sub2 local181 = Static406.method5850(arg3, arg1, arg5, uq.class);
			if (local181 instanceof Class15_Sub2_Sub1 && local181.aShort116 == arg1 && arg5 == local181.aShort114) {
				((Class15_Sub2_Sub1) local181).aClass15_Sub2_1 = null;
			} else {
				Static224.method3524(arg3, arg1, arg5, uq.class);
			}
			if (local74.anInt5604 != 0 && super.anInt6918 > local74.anInt5577 + arg1 && super.anInt6909 > local74.anInt5577 + arg5 && local74.anInt5570 + arg1 < super.anInt6918 && local74.anInt5570 + arg5 < super.anInt6909) {
				arg4.method3450(arg5, local74.anInt5577, !local74.aBoolean387, local74.aBoolean396, local82, local74.anInt5570, arg1);
				return;
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		@Pc(284) Class15_Sub3 local284 = Static361.method5373(arg3, arg1, arg5);
		if (local284 instanceof Class15_Sub3_Sub2) {
			((Class15_Sub3_Sub2) local284).aClass15_Sub3_1 = null;
		} else {
			Static465.method6500(arg3, arg1, arg5);
		}
		if (local74.anInt5604 == 1) {
			arg4.method3455(arg5, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!oa;IIIIIIBIILclient!iaa;)V")
	public void method5552(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class138 arg9) {
		if (!Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700) && !Static163.method2600(arg7, Static558.anInt9704, arg4, arg5)) {
			return;
		}
		if (arg2 < this.anInt6931) {
			this.anInt6931 = arg2;
		}
		@Pc(30) Class192 local30 = Static85.aClass27_1.method516(arg8);
		if (arg0.method7474() && Static58.aClass6_Sub17_Sub1_1.aBoolean605 && local30.aBoolean401) {
			return;
		}
		@Pc(56) int local56;
		@Pc(53) int local53;
		if (arg1 == 1 || arg1 == 3) {
			local53 = local30.anInt5577;
			local56 = local30.anInt5570;
		} else {
			local56 = local30.anInt5577;
			local53 = local30.anInt5570;
		}
		@Pc(85) int local85;
		@Pc(78) int local78;
		if (super.anInt6918 >= local56 + arg7) {
			local78 = arg7 + (local56 + 1 >> 1);
			local85 = arg7 + (local56 >> 1);
		} else {
			local78 = arg7 + 1;
			local85 = arg7;
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		if (arg4 + local53 <= super.anInt6909) {
			local109 = (local53 >> 1) + arg4;
			local117 = arg4 + (local53 + 1 >> 1);
		} else {
			local117 = arg4 + 1;
			local109 = arg4;
		}
		@Pc(129) Class46 local129 = Static205.aClass46Array1[arg5];
		@Pc(152) int local152 = local129.JA(local85, local109) + local129.JA(local78, local109) + local129.JA(local85, local117) + local129.JA(local78, local117) >> 2;
		@Pc(160) int local160 = (local56 << 8) + (arg7 << 9);
		@Pc(168) int local168 = (arg4 << 9) + (local53 << 8);
		@Pc(180) boolean local180 = Static318.aBoolean442 && !super.aBoolean476 && local30.aBoolean400;
		if (local30.method4589()) {
			Static90.method4176(null, arg1, local30, arg7, arg2, null, arg4);
		}
		@Pc(214) boolean local214 = arg3 == -1 && local30.anInt5620 == -1 && local30.anIntArray428 == null && local30.lb == null && !local30.aBoolean394;
		if (Static406.aBoolean497 && (Static233.method3600(arg6) && local30.anInt5575 != 1 || !(!Static571.method7833(arg6) || local30.anInt5575 != 0))) {
			return;
		}
		if (arg6 != 22) {
			@Pc(372) Class15_Sub2 local372;
			@Pc(339) Class15_Sub2_Sub5 local339;
			@Pc(343) int local343;
			if (arg6 == 10 || arg6 == 11) {
				local339 = null;
				if (local214) {
					@Pc(402) Class15_Sub2_Sub5 local402 = new Class15_Sub2_Sub5(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg7, local56 + arg7 - 1, arg4, local53 + arg4 - 1, arg6, arg1, local180);
					local339 = local402;
					local343 = local402.method5633();
					local372 = local402;
				} else {
					local343 = 15;
					local372 = new Class15_Sub2_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg7, arg7 + local56 - 1, arg4, local53 + arg4 - 1, arg6, arg1, arg3);
				}
				@Pc(423) Class15_Sub2 local423 = Static406.method5850(arg2, arg7, arg4, uq.class);
				@Pc(425) boolean local425 = false;
				if (local423 instanceof Class15_Sub2_Sub1 && local423.aShort116 == arg7 && arg4 == local423.aShort114) {
					((Class15_Sub2_Sub1) local423).aClass15_Sub2_1 = local372;
					local425 = true;
				}
				if (local425 || Static176.method7614(local372, false)) {
					if (local339 != null && local339.method7173()) {
						local339.method7170(arg0);
					}
					if (local30.aBoolean386 && Static318.aBoolean442) {
						if (local343 > 30) {
							local343 = 30;
						}
						for (@Pc(476) int local476 = 0; local476 <= local56; local476++) {
							for (@Pc(480) int local480 = 0; local480 <= local53; local480++) {
								local129.EA(local476 + arg7, arg4 - -local480, local343);
							}
						}
					}
				}
				if (local30.anInt5604 != 0 && arg9 != null) {
					arg9.method3437(arg4, local56, local53, arg7, local30.aBoolean396, !local30.aBoolean387);
				}
			} else {
				@Pc(632) Class15_Sub2 local632;
				if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
					if (local214) {
						local339 = new Class15_Sub2_Sub5(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg7, local56 + arg7 - 1, arg4, arg4 + local53 - 1, arg6, arg1, local180);
						local372 = local339;
						if (local339.method7173()) {
							local339.method7170(arg0);
						}
					} else {
						local372 = new Class15_Sub2_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg7, arg7 + local56 - 1, arg4, local53 + arg4 - 1, arg6, arg1, arg3);
					}
					local632 = Static406.method5850(arg2, arg7, arg4, uq.class);
					if (local632 instanceof Class15_Sub2_Sub1 && local632.aShort116 == arg7 && local632.aShort114 == arg4) {
						((Class15_Sub2_Sub1) local632).aClass15_Sub2_1 = local372;
					} else {
						Static176.method7614(local372, false);
					}
					if (Static318.aBoolean442 && !super.aBoolean476 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0 && local30.anInt5575 != 0) {
						super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x4);
					}
					if (local30.anInt5604 != 0 && arg9 != null) {
						arg9.method3437(arg4, local56, local53, arg7, local30.aBoolean396, !local30.aBoolean387);
					}
				} else {
					@Pc(771) Class15_Sub1 local771;
					if (arg6 == 0) {
						@Pc(735) int local735 = local30.anInt5575;
						if (Static191.aBoolean296 && local30.anInt5575 == -1) {
							local735 = 1;
						}
						if (local214) {
							@Pc(761) Class15_Sub1_Sub1 local761 = new Class15_Sub1_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1, local180);
							if (local761.method7173()) {
								local761.method7170(arg0);
							}
							local771 = local761;
						} else {
							local771 = new Class15_Sub1_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1, arg3);
						}
						@Pc(794) Class15_Sub1 local794 = Static556.method7726(arg2, arg7, arg4);
						if (local794 instanceof Class15_Sub1_Sub2) {
							((Class15_Sub1_Sub2) local794).aClass15_Sub1_3 = local771;
						} else {
							Static372.method5468(arg2, arg7, arg4, local771, null);
						}
						if (Static318.aBoolean442) {
							if (arg1 == 0) {
								if (local30.aBoolean386) {
									local129.EA(arg7, arg4, 50);
									local129.EA(arg7, arg4 + 1, 50);
								}
								if (local735 == 1 && !super.aBoolean476) {
									super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x1);
								}
							} else if (arg1 == 1) {
								if (local30.aBoolean386) {
									local129.EA(arg7, arg4 + 1, 50);
									local129.EA(arg7 + 1, arg4 + 1, 50);
								}
								if (local735 == 1 && !super.aBoolean476) {
									super.aByteArrayArrayArray16[arg2][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4 + 1] | 0x2);
								}
							} else if (arg1 == 2) {
								if (local30.aBoolean386) {
									local129.EA(arg7 + 1, arg4, 50);
									local129.EA(arg7 + 1, arg4 - -1, 50);
								}
								if (local735 == 1 && !super.aBoolean476) {
									super.aByteArrayArrayArray16[arg2][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7 + 1][arg4] | 0x1);
								}
							} else if (arg1 == 3) {
								if (local30.aBoolean386) {
									local129.EA(arg7, arg4, 50);
									local129.EA(arg7 + 1, arg4, 50);
								}
								if (local735 == 1 && !super.aBoolean476) {
									super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x2);
								}
							}
						}
						if (local30.anInt5604 != 0 && arg9 != null) {
							arg9.method3451(!local30.aBoolean387, arg6, arg4, local30.aBoolean396, arg7, arg1);
						}
						if (local30.anInt5587 != 64) {
							Static446.method6301(arg2, arg7, arg4, local30.anInt5587);
						}
					} else {
						@Pc(1063) Class15_Sub1_Sub1 local1063;
						@Pc(1065) Class15_Sub1 local1065;
						if (arg6 == 1) {
							if (local214) {
								local1063 = new Class15_Sub1_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1, local180);
								local1065 = local1063;
								if (local1063.method7173()) {
									local1063.method7170(arg0);
								}
							} else {
								local1065 = new Class15_Sub1_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1, arg3);
							}
							local771 = Static556.method7726(arg2, arg7, arg4);
							if (local771 instanceof Class15_Sub1_Sub2) {
								((Class15_Sub1_Sub2) local771).aClass15_Sub1_3 = local1065;
							} else {
								Static372.method5468(arg2, arg7, arg4, local1065, null);
							}
							if (local30.aBoolean386 && Static318.aBoolean442) {
								if (arg1 == 0) {
									local129.EA(arg7, arg4 + 1, 50);
								} else if (arg1 == 1) {
									local129.EA(arg7 + 1, arg4 - -1, 50);
								} else if (arg1 == 2) {
									local129.EA(arg7 + 1, arg4, 50);
								} else if (arg1 == 3) {
									local129.EA(arg7, arg4, 50);
								}
							}
							if (local30.anInt5604 != 0 && arg9 != null) {
								arg9.method3451(!local30.aBoolean387, arg6, arg4, local30.aBoolean396, arg7, arg1);
							}
						} else if (arg6 == 2) {
							local343 = arg1 + 1 & 0x3;
							if (local214) {
								@Pc(1261) Class15_Sub1_Sub1 local1261 = new Class15_Sub1_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1 + 4, local180);
								@Pc(1276) Class15_Sub1_Sub1 local1276 = new Class15_Sub1_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg6, local343, local180);
								if (local1261.method7173()) {
									local1261.method7170(arg0);
								}
								local771 = local1276;
								if (local1276.method7173()) {
									local1276.method7170(arg0);
								}
								local1065 = local1261;
							} else {
								local1065 = new Class15_Sub1_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1 + 4, arg3);
								local771 = new Class15_Sub1_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg6, local343, arg3);
							}
							Static372.method5468(arg2, arg7, arg4, local1065, local771);
							if (local30.anInt5575 == 1 && Static318.aBoolean442 && !super.aBoolean476) {
								if (arg1 == 0) {
									super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x1);
									super.aByteArrayArrayArray16[arg2][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4 + 1] | 0x2);
								} else if (arg1 == 1) {
									super.aByteArrayArrayArray16[arg2][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4 + 1] | 0x2);
									super.aByteArrayArrayArray16[arg2][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7 + 1][arg4] | 0x1);
								} else if (arg1 == 2) {
									super.aByteArrayArrayArray16[arg2][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7 + 1][arg4] | 0x1);
									super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x2);
								} else if (arg1 == 3) {
									super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x2);
									super.aByteArrayArrayArray16[arg2][arg7][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg7][arg4] | 0x1);
								}
							}
							if (local30.anInt5604 != 0 && arg9 != null) {
								arg9.method3451(!local30.aBoolean387, arg6, arg4, local30.aBoolean396, arg7, arg1);
							}
							if (local30.anInt5587 != 64) {
								Static446.method6301(arg2, arg7, arg4, local30.anInt5587);
							}
						} else if (arg6 == 3) {
							if (local214) {
								local1063 = new Class15_Sub1_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1, local180);
								local1065 = local1063;
								if (local1063.method7173()) {
									local1063.method7170(arg0);
								}
							} else {
								local1065 = new Class15_Sub1_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg6, arg1, arg3);
							}
							local771 = Static556.method7726(arg2, arg7, arg4);
							if (local771 instanceof Class15_Sub1_Sub2) {
								((Class15_Sub1_Sub2) local771).aClass15_Sub1_3 = local1065;
							} else {
								Static372.method5468(arg2, arg7, arg4, local1065, null);
							}
							if (local30.aBoolean386 && Static318.aBoolean442) {
								if (arg1 == 0) {
									local129.EA(arg7, arg4 + 1, 50);
								} else if (arg1 == 1) {
									local129.EA(arg7 + 1, arg4 + 1, 50);
								} else if (arg1 == 2) {
									local129.EA(arg7 + 1, arg4, 50);
								} else if (arg1 == 3) {
									local129.EA(arg7, arg4, 50);
								}
							}
							if (local30.anInt5604 != 0 && arg9 != null) {
								arg9.method3451(!local30.aBoolean387, arg6, arg4, local30.aBoolean396, arg7, arg1);
							}
						} else if (arg6 == 9) {
							if (local214) {
								local339 = new Class15_Sub2_Sub5(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg7, arg7, arg4, arg4, arg6, arg1, local180);
								if (local339.method7173()) {
									local339.method7170(arg0);
								}
								local372 = local339;
							} else {
								local372 = new Class15_Sub2_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg7, local56 + arg7 - 1, arg4, arg4 + local53 - 1, arg6, arg1, arg3);
							}
							local632 = Static406.method5850(arg2, arg7, arg4, uq.class);
							if (local632 instanceof Class15_Sub2_Sub1 && local632.aShort116 == arg7 && local632.aShort114 == arg4) {
								((Class15_Sub2_Sub1) local632).aClass15_Sub2_1 = local372;
							} else {
								Static176.method7614(local372, false);
							}
							if (local30.anInt5604 != 0 && arg9 != null) {
								arg9.method3437(arg4, local56, local53, arg7, local30.aBoolean396, !local30.aBoolean387);
							}
							if (local30.anInt5587 != 64) {
								Static446.method6301(arg2, arg7, arg4, local30.anInt5587);
							}
						} else {
							@Pc(1844) Class15_Sub4 local1844;
							if (arg6 == 4) {
								if (local214) {
									@Pc(1842) Class15_Sub4_Sub1 local1842 = new Class15_Sub4_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, 0, 0, 0, arg6, arg1);
									local1844 = local1842;
									if (local1842.method7173()) {
										local1842.method7170(arg0);
									}
								} else {
									local1844 = new Class15_Sub4_Sub2(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, 0, 0, 0, arg6, arg1, arg3);
								}
								@Pc(1878) Class15_Sub4 local1878 = Static533.method7261(arg2, arg7, arg4);
								if (local1878 instanceof Class15_Sub4_Sub3) {
									((Class15_Sub4_Sub3) local1878).aClass15_Sub4_3 = local1844;
								} else {
									Static270.method4038(arg2, arg7, arg4, local1844, null);
								}
							} else {
								@Pc(1898) int local1898;
								@Pc(1904) Interface22 local1904;
								@Pc(1943) Class15_Sub4_Sub1 local1943;
								@Pc(1987) Class15_Sub4 local1987;
								if (arg6 == 5) {
									local1898 = 65;
									local1904 = (Interface22) Static556.method7726(arg2, arg7, arg4);
									if (local1904 != null) {
										local1898 = Static85.aClass27_1.method516(local1904.method7171()).anInt5587 + 1;
									}
									if (local214) {
										local1943 = new Class15_Sub4_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, 0, local1898 * Static546.anIntArray656[arg1], Static471.anIntArray580[arg1] * local1898, arg6, arg1);
										local1844 = local1943;
										if (local1943.method7173()) {
											local1943.method7170(arg0);
										}
									} else {
										local1844 = new Class15_Sub4_Sub2(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, 0, Static546.anIntArray656[arg1] * local1898, Static471.anIntArray580[arg1] * local1898, arg6, arg1, arg3);
									}
									local1987 = Static533.method7261(arg2, arg7, arg4);
									if (local1987 instanceof Class15_Sub4_Sub3) {
										((Class15_Sub4_Sub3) local1987).aClass15_Sub4_3 = local1844;
									} else {
										Static270.method4038(arg2, arg7, arg4, local1844, null);
									}
								} else if (arg6 == 6) {
									local1898 = 33;
									local1904 = (Interface22) Static556.method7726(arg2, arg7, arg4);
									if (local1904 != null) {
										local1898 = Static85.aClass27_1.method516(local1904.method7171()).anInt5587 / 2 + 1;
									}
									if (local214) {
										local1943 = new Class15_Sub4_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg1, Static546.anIntArray656[arg1] * local1898, Static471.anIntArray580[arg1] * local1898, arg6, arg1 + 4);
										if (local1943.method7173()) {
											local1943.method7170(arg0);
										}
										local1844 = local1943;
									} else {
										local1844 = new Class15_Sub4_Sub2(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg1, local1898 * Static151.anIntArray282[arg1], local1898 * Static271.anIntArray393[arg1], arg6, arg1 + 4, arg3);
									}
									local1987 = Static533.method7261(arg2, arg7, arg4);
									if (local1987 instanceof Class15_Sub4_Sub3) {
										((Class15_Sub4_Sub3) local1987).aClass15_Sub4_3 = local1844;
									} else {
										Static270.method4038(arg2, arg7, arg4, local1844, null);
									}
								} else if (arg6 == 7) {
									local1898 = arg1 + 2 & 0x3;
									if (local214) {
										@Pc(2174) Class15_Sub4_Sub1 local2174 = new Class15_Sub4_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, local1898, 0, 0, arg6, local1898 + 4);
										if (local2174.method7173()) {
											local2174.method7170(arg0);
										}
										local1844 = local2174;
									} else {
										local1844 = new Class15_Sub4_Sub2(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, local1898, 0, 0, arg6, local1898 + 4, arg3);
									}
									@Pc(2189) Class15_Sub4 local2189 = Static533.method7261(arg2, arg7, arg4);
									if (local2189 instanceof Class15_Sub4_Sub3) {
										((Class15_Sub4_Sub3) local2189).aClass15_Sub4_3 = local1844;
									} else {
										Static270.method4038(arg2, arg7, arg4, local1844, null);
									}
								} else if (arg6 == 8) {
									local343 = arg1 + 2 & 0x3;
									@Pc(2215) int local2215 = 33;
									@Pc(2221) Interface22 local2221 = (Interface22) Static556.method7726(arg2, arg7, arg4);
									if (local2221 != null) {
										local2215 = Static85.aClass27_1.method516(local2221.method7171()).anInt5587 / 2 + 1;
									}
									@Pc(2266) Class15_Sub4 local2266;
									@Pc(2287) Class15_Sub4 local2287;
									if (local214) {
										local2266 = new Class15_Sub4_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg1, local2215 * Static151.anIntArray282[arg1], local2215 * Static271.anIntArray393[arg1], arg6, arg1 + 4);
										local2287 = new Class15_Sub4_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg1, 0, 0, arg6, local343 + 4);
										if (local2266.method7173()) {
											local2266.method7170(arg0);
										}
										if (local2287.method7173()) {
											local2287.method7170(arg0);
										}
									} else {
										local2266 = new Class15_Sub4_Sub2(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg1, Static151.anIntArray282[arg1] * local2215, Static271.anIntArray393[arg1] * local2215, arg6, arg1 + 4, arg3);
										local2287 = new Class15_Sub4_Sub2(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg1, 0, 0, arg6, local343 + 4, arg3);
									}
									Static270.method4038(arg2, arg7, arg4, local2266, local2287);
								}
							}
						}
					}
				}
			}
		} else if (Static58.aClass6_Sub17_Sub1_1.aBoolean614 || local30.anInt5582 != 0 || local30.anInt5604 == 1 || local30.aBoolean390) {
			@Pc(272) Class15_Sub3 local272;
			if (local214) {
				@Pc(288) Class15_Sub3_Sub1 local288 = new Class15_Sub3_Sub1(arg0, local30, arg5, local160, local152, local168, super.aBoolean476, arg1, local180);
				local272 = local288;
				if (local288.method7173()) {
					local288.method7170(arg0);
				}
			} else {
				local272 = new Class15_Sub3_Sub3(arg0, local30, arg2, arg5, local160, local152, local168, super.aBoolean476, arg1, arg3);
			}
			@Pc(303) Class15_Sub3 local303 = Static361.method5373(arg2, arg7, arg4);
			if (local303 instanceof Class15_Sub3_Sub2) {
				((Class15_Sub3_Sub2) local303).aClass15_Sub3_1 = local272;
			} else {
				Static103.method1600(arg2, arg7, arg4, local272);
			}
			if (local30.anInt5604 == 1 && arg9 != null) {
				arg9.method3443(arg4, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILclient!oa;Lclient!jr;IIIII[I)V")
	public void method5553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) Class6_Sub12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean476) {
			return;
		}
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(24) Class5 local24 = null;
		@Pc(30) int local30 = (arg5 & 0x7) * 8;
		@Pc(36) int local36 = (arg2 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(62) int local62;
			@Pc(306) int local306;
			@Pc(69) int local69;
			while (arg4.anInt7556 < arg4.aByteArray97.length) {
				local41 = arg4.method6019();
				if (local41 == 0) {
					local24 = new Class5(arg4);
				} else {
					@Pc(121) int local121;
					@Pc(168) int local168;
					@Pc(190) int local190;
					@Pc(115) int local115;
					if (local41 == 1) {
						local62 = arg4.method6019();
						if (local62 > 0) {
							for (local69 = 0; local69 < local62; local69++) {
								@Pc(78) Class255 local78 = new Class255(arg3, arg4, 2);
								if (local78.anInt7366 == 31) {
									@Pc(89) Class64 local89 = Static498.aClass271_1.method6193(arg4.method6044());
									local78.method5882(local89.anInt1427, local89.anInt1430, local89.anInt1431, local89.anInt1428);
								}
								if (arg3.method7458() > 0) {
									@Pc(109) Class6_Sub25 local109 = local78.aClass6_Sub25_3;
									local115 = local109.method6405() >> 9;
									local121 = local109.method6400() >> 9;
									if (local78.anInt7361 == arg6 && local30 <= local115 && local115 < local30 + 8 && local36 <= local121 && local121 < local36 + 8) {
										local168 = (arg1 << 9) + Static348.method5290(arg8, local109.method6405() & 0xFFF, local109.method6400() & 0xFFF);
										local115 = local168 >> 9;
										local190 = Static51.method779(local109.method6405() & 0xFFF, arg8, local109.method6400() & 0xFFF) + (arg7 << 9);
										local121 = local190 >> 9;
										if (local115 >= 0 && local121 >= 0 && super.anInt6918 > local115 && local121 < super.anInt6909) {
											local109.method6404(local190, local168, super.anIntArrayArrayArray12[arg6][local115][local121] - local109.method6402());
											Static157.method5358(local78);
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local24 == null) {
							local24 = new Class5();
						}
						local24.method80(arg4);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray19 == null) {
							super.aByteArrayArrayArray19 = new byte[4][][];
						}
						for (local62 = 0; local62 < 4; local62++) {
							@Pc(287) byte local287 = arg4.method6049();
							@Pc(310) int local310;
							if (local287 == 0 && super.aByteArrayArrayArray19[arg0] != null) {
								if (arg6 >= local62) {
									local306 = arg1;
									local310 = arg1 + 7;
									local115 = arg7;
									if (local310 < 0) {
										local310 = 0;
									} else if (local310 >= super.anInt6918) {
										local310 = super.anInt6918;
									}
									if (arg1 < 0) {
										local306 = 0;
									} else if (super.anInt6918 <= arg1) {
										local306 = super.anInt6918;
									}
									if (arg7 < 0) {
										local115 = 0;
									} else if (super.anInt6909 <= arg7) {
										local115 = super.anInt6909;
									}
									local121 = arg7 + 7;
									if (local121 < 0) {
										local121 = 0;
									} else if (super.anInt6909 <= local121) {
										local121 = super.anInt6909;
									}
									while (local306 < local310) {
										while (local115 < local121) {
											super.aByteArrayArrayArray19[arg0][local306][local115] = 0;
											local115++;
										}
										local306++;
									}
								}
							} else if (local287 == 1) {
								if (super.aByteArrayArrayArray19[arg0] == null) {
									super.aByteArrayArrayArray19[arg0] = new byte[super.anInt6918 + 1][super.anInt6909 + 1];
								}
								for (local306 = 0; local306 < 64; local306 += 4) {
									for (local310 = 0; local310 < 64; local310 += 4) {
										@Pc(441) byte local441 = arg4.method6049();
										if (arg6 >= local62) {
											for (local121 = local306; local121 < local306 + 4; local121++) {
												for (local168 = local310; local168 < local310 + 4; local168++) {
													if (local30 <= local121 && local30 + 8 > local121 && local168 >= local36 && local36 < local36 + 8) {
														local190 = arg1 + Static384.method5632(local121 & 0x7, local168 & 0x7, arg8);
														@Pc(496) int local496 = Static152.method1763(local121 & 0x7, local168 & 0x7, arg8) + arg7;
														if (local190 >= 0 && local190 < super.anInt6918 && local496 >= 0 && local496 < super.anInt6909) {
															super.aByteArrayArrayArray19[arg0][local190][local496] = local441;
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
						arg4.anInt7556 += 10;
					} else {
						arg9[0] = arg4.method6044();
						arg9[1] = arg4.method6023();
						arg9[2] = arg4.method6023();
						arg9[3] = arg4.method6023();
						arg9[4] = arg4.method6044();
					}
				}
			}
			if (local24 != null) {
				Static450.method6335(arg7 >> 3, arg1 >> 3, local24);
			}
			if (super.aByteArrayArrayArray19 != null && super.aByteArrayArrayArray19[arg0] != null) {
				local41 = arg1 + 7;
				local62 = arg7 + 7;
				for (local69 = arg1; local69 < local41; local69++) {
					for (local306 = arg7; local306 < local62; local306++) {
						super.aByteArrayArrayArray19[arg0][local69][local306] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!oa;[Lclient!iaa;III[BIIBI)V")
	public void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class138[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class6_Sub12 local10 = new Class6_Sub12(arg6);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method6003();
			if (local32 == 0) {
				return;
			}
			local12 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local10.method6034();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(59) int local59 = local40 & 0x3F;
				@Pc(65) int local65 = local40 >> 6 & 0x3F;
				@Pc(69) int local69 = local40 >> 12;
				@Pc(73) int local73 = local10.method6019();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				if (local69 == arg4 && arg7 <= local65 && local65 < arg7 + 8 && arg3 <= local59 && arg3 + 8 > local59) {
					@Pc(121) Class192 local121 = Static85.aClass27_1.method516(local12);
					@Pc(138) int local138 = Static313.method4910(local81, local121.anInt5570, arg9, local59 & 0x7, local121.anInt5577, local65 & 0x7) + arg8;
					@Pc(155) int local155 = Static318.method4959(local121.anInt5570, local65 & 0x7, arg9, local59 & 0x7, local81, local121.anInt5577) + arg0;
					if (local138 > 0 && local155 > 0 && local138 < super.anInt6918 - 1 && local155 < super.anInt6909 - 1) {
						@Pc(184) Class138 local184 = null;
						if (!super.aBoolean476) {
							@Pc(189) int local189 = arg5;
							if ((Static267.aByteArrayArrayArray8[1][local138][local155] & 0x2) == 2) {
								local189 = arg5 - 1;
							}
							if (local189 >= 0) {
								local184 = arg2[local189];
							}
						}
						this.method5552(arg1, local81 + arg9 & 0x3, arg5, -1, local155, arg5, local77, local138, local12, local184);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!oa;[Lclient!iaa;I[B)V")
	public void method5555(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) Class138[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(10) Class6_Sub12 local10 = new Class6_Sub12(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method6003();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method6034();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method6019();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(69) int local69 = arg0 + local49;
				@Pc(73) int local73 = arg3 + local43;
				if (local69 > 0 && local73 > 0 && super.anInt6918 - 1 > local69 && super.anInt6909 - 1 > local73) {
					@Pc(98) Class138 local98 = null;
					if (!super.aBoolean476) {
						@Pc(103) int local103 = local53;
						if ((Static267.aByteArrayArrayArray8[1][local69][local73] & 0x2) == 2) {
							local103 = local53 - 1;
						}
						if (local103 >= 0) {
							local98 = arg2[local103];
						}
					}
					this.method5552(arg1, local65, local53, -1, local73, local53, local61, local69, local12, local98);
				}
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I[IILclient!oa;Lclient!jr;I)V")
	public void method5556(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class90 arg2, @OriginalArg(4) Class6_Sub12 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean476) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(24) Class5 local24 = null;
		while (true) {
			while (true) {
				while (true) {
					@Pc(29) int local29;
					@Pc(120) int local120;
					@Pc(503) int local503;
					@Pc(158) int local158;
					@Pc(162) int local162;
					while (arg3.aByteArray97.length > arg3.anInt7556) {
						local29 = arg3.method6019();
						if (local29 == 0) {
							local24 = new Class5(arg3);
						} else {
							@Pc(271) int local271;
							@Pc(172) int local172;
							@Pc(178) int local178;
							if (local29 == 1) {
								local120 = arg3.method6019();
								if (local120 > 0) {
									for (local503 = 0; local503 < local120; local503++) {
										@Pc(512) Class255 local512 = new Class255(arg2, arg3, 2);
										if (local512.anInt7366 == 31) {
											@Pc(523) Class64 local523 = Static498.aClass271_1.method6193(arg3.method6044());
											local512.method5882(local523.anInt1427, local523.anInt1430, local523.anInt1431, local523.anInt1428);
										}
										if (arg2.method7458() > 0) {
											@Pc(543) Class6_Sub25 local543 = local512.aClass6_Sub25_3;
											local271 = (arg0 << 9) + local543.method6405();
											local172 = local543.method6400() + (arg4 << 9);
											local178 = local271 >> 9;
											@Pc(568) int local568 = local172 >> 9;
											if (local178 >= 0 && local568 >= 0 && super.anInt6918 > local178 && super.anInt6909 > local568) {
												local543.method6404(local172, local271, super.anIntArrayArrayArray12[local512.anInt7361][local178][local568] - local543.method6402());
												Static157.method5358(local512);
											}
										}
									}
								}
							} else if (local29 == 2) {
								if (local24 == null) {
									local24 = new Class5();
								}
								local24.method80(arg3);
							} else if (local29 != 128) {
								if (local29 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray19 == null) {
									super.aByteArrayArrayArray19 = new byte[4][][];
								}
								for (local120 = 0; local120 < 4; local120++) {
									@Pc(126) byte local126 = arg3.method6049();
									if (local126 == 0 && super.aByteArrayArrayArray19[local120] != null) {
										local158 = arg0;
										local162 = arg0 + 64;
										local271 = arg4;
										local172 = arg4 + 64;
										if (local162 < 0) {
											local162 = 0;
										} else if (super.anInt6918 <= local162) {
											local162 = super.anInt6918;
										}
										if (arg4 < 0) {
											local271 = 0;
										} else if (arg4 >= super.anInt6909) {
											local271 = super.anInt6909;
										}
										if (arg0 < 0) {
											local158 = 0;
										} else if (super.anInt6918 <= arg0) {
											local158 = super.anInt6918;
										}
										if (local172 < 0) {
											local172 = 0;
										} else if (local172 >= super.anInt6909) {
											local172 = super.anInt6909;
										}
										while (local162 > local158) {
											while (local271 < local172) {
												super.aByteArrayArrayArray19[local120][local158][local271] = 0;
												local271++;
											}
											local158++;
										}
									} else if (local126 == 1) {
										if (super.aByteArrayArrayArray19[local120] == null) {
											super.aByteArrayArrayArray19[local120] = new byte[super.anInt6918 + 1][super.anInt6909 + 1];
										}
										for (local158 = 0; local158 < 64; local158 += 4) {
											for (local162 = 0; local162 < 64; local162 += 4) {
												@Pc(168) byte local168 = arg3.method6049();
												for (local172 = arg0 + local158; local172 < local158 + arg0 + 4; local172++) {
													for (local178 = local162 + arg4; local178 < local162 + arg4 + 4; local178++) {
														if (local172 >= 0 && super.anInt6918 > local172 && local178 >= 0 && local178 < super.anInt6909) {
															super.aByteArrayArrayArray19[local120][local172][local178] = local168;
														}
													}
												}
											}
										}
									} else if (local126 == 2) {
										if (super.aByteArrayArrayArray19[local120] == null) {
											super.aByteArrayArrayArray19[local120] = new byte[super.anInt6918 + 1][super.anInt6909 + 1];
										}
										if (local120 > 0) {
											local158 = arg0;
											local162 = arg0 + 64;
											local271 = arg4;
											if (arg4 < 0) {
												local271 = 0;
											} else if (arg4 >= super.anInt6909) {
												local271 = super.anInt6909;
											}
											if (local162 < 0) {
												local162 = 0;
											} else if (local162 >= super.anInt6918) {
												local162 = super.anInt6918;
											}
											local172 = arg4 + 64;
											if (arg0 < 0) {
												local158 = 0;
											} else if (arg0 >= super.anInt6918) {
												local158 = super.anInt6918;
											}
											if (local172 < 0) {
												local172 = 0;
											} else if (local172 >= super.anInt6909) {
												local172 = super.anInt6909;
											}
											while (local162 > local158) {
												while (local172 > local271) {
													super.aByteArrayArrayArray19[local120][local158][local271] = super.aByteArrayArrayArray19[local120 - 1][local158][local271];
													local271++;
												}
												local158++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg1 == null) {
								arg3.anInt7556 += 10;
							} else {
								arg1[0] = arg3.method6044();
								arg1[1] = arg3.method6023();
								arg1[2] = arg3.method6023();
								arg1[3] = arg3.method6023();
								arg1[4] = arg3.method6044();
							}
						}
					}
					if (local24 != null) {
						for (local29 = 0; local29 < 8; local29++) {
							for (local120 = 0; local120 < 8; local120++) {
								local503 = local29 + (arg0 >> 3);
								local158 = local120 + (arg4 >> 3);
								if (local503 >= 0 && super.anInt6918 >> 3 > local503 && local158 >= 0 && super.anInt6909 >> 3 > local158) {
									Static450.method6335(local158, local503, local24);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray19 != null) {
						for (local29 = 0; local29 < 4; local29++) {
							if (super.aByteArrayArrayArray19[local29] != null) {
								for (local120 = 0; local120 < 16; local120++) {
									for (local503 = 0; local503 < 16; local503++) {
										local158 = (arg0 >> 2) + local120;
										local162 = local503 + (arg4 >> 2);
										if (local158 >= 0 && local158 < 26 && local162 >= 0 && local162 < 26) {
											super.aByteArrayArrayArray19[local29][local158][local162] = 0;
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

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!oa;B)V")
	public void method5558(@OriginalArg(0) Class90 arg0) {
		Static518.method7076(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt6912 > 1) {
			for (local13 = 0; local13 < super.anInt6918; local13++) {
				for (local17 = 0; local17 < super.anInt6909; local17++) {
					if ((Static267.aByteArrayArrayArray8[1][local13][local17] & 0x2) == 2) {
						Static18.method4656(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt6912 > local13; local13++) {
			for (local17 = 0; super.anInt6909 >= local17; local17++) {
				for (@Pc(64) int local64 = 0; local64 <= super.anInt6918; local64++) {
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(139) int local139;
					@Pc(143) int local143;
					@Pc(241) int local241;
					@Pc(250) int local250;
					@Pc(270) int local270;
					@Pc(274) int local274;
					if ((super.aByteArrayArrayArray16[local13][local64][local17] & 0x1) != 0) {
						local82 = local17;
						local84 = local17;
						local86 = local13;
						while (local82 > 0 && (super.aByteArrayArrayArray16[local13][local64][local82 - 1] & 0x1) != 0) {
							local82--;
						}
						while (super.anInt6909 > local84 && (super.aByteArrayArrayArray16[local13][local64][local84 + 1] & 0x1) != 0) {
							local84++;
						}
						local139 = local13;
						label164: while (local86 > 0) {
							for (local143 = local82; local143 <= local84; local143++) {
								if ((super.aByteArrayArrayArray16[local86 - 1][local64][local143] & 0x1) == 0) {
									break label164;
								}
							}
							local86--;
						}
						label153: while (local139 < 3) {
							for (local143 = local82; local143 <= local84; local143++) {
								if ((super.aByteArrayArrayArray16[local139 + 1][local64][local143] & 0x1) == 0) {
									break label153;
								}
							}
							local139++;
						}
						local143 = (local139 + 1 - local86) * (local84 + 1 - local82);
						if (local143 >= 2) {
							local241 = super.anIntArrayArrayArray12[local139][local64][local82] - 960;
							local250 = super.anIntArrayArrayArray12[local86][local64][local82];
							Static568.method7828(1, local64 << 9, local64 << 9, local82 << 9, (local84 << 9) + 512, local241, local250);
							for (local270 = local86; local270 <= local139; local270++) {
								for (local274 = local82; local274 <= local84; local274++) {
									super.aByteArrayArrayArray16[local270][local64][local274] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local64][local17] & 0x2) != 0) {
						local82 = local64;
						local84 = local64;
						local86 = local13;
						local139 = local13;
						while (local84 < super.anInt6918 && (super.aByteArrayArrayArray16[local13][local84 + 1][local17] & 0x2) != 0) {
							local84++;
						}
						while (local82 > 0 && (super.aByteArrayArrayArray16[local13][local82 - 1][local17] & 0x2) != 0) {
							local82--;
						}
						label218: while (local86 > 0) {
							for (local143 = local82; local143 <= local84; local143++) {
								if ((super.aByteArrayArrayArray16[local86 - 1][local143][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local86--;
						}
						label207: while (local139 < 3) {
							for (local143 = local82; local143 <= local84; local143++) {
								if ((super.aByteArrayArrayArray16[local139 + 1][local143][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local139++;
						}
						local143 = (local139 + 1 - local86) * (local84 + 1 - local82);
						if (local143 >= 2) {
							local241 = super.anIntArrayArrayArray12[local139][local82][local17] - 960;
							local250 = super.anIntArrayArrayArray12[local86][local82][local17];
							Static568.method7828(2, local82 << 9, (local84 << 9) + 512, local17 << 9, local17 << 9, local241, local250);
							for (local270 = local86; local270 <= local139; local270++) {
								for (local274 = local82; local274 <= local84; local274++) {
									super.aByteArrayArrayArray16[local270][local274][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local64][local17] & 0x4) != 0) {
						local82 = local64;
						local84 = local64;
						for (local86 = local17; local86 > 0 && (super.aByteArrayArrayArray16[local13][local64][local86 - 1] & 0x4) != 0; local86--) {
						}
						for (local139 = local17; super.anInt6909 > local139 && (super.aByteArrayArrayArray16[local13][local64][local139 + 1] & 0x4) != 0; local139++) {
						}
						label271: while (local82 > 0) {
							for (local143 = local86; local143 <= local139; local143++) {
								if ((super.aByteArrayArrayArray16[local13][local82 - 1][local143] & 0x4) == 0) {
									break label271;
								}
							}
							local82--;
						}
						label260: while (local84 < super.anInt6918) {
							for (local143 = local86; local143 <= local139; local143++) {
								if ((super.aByteArrayArrayArray16[local13][local84 + 1][local143] & 0x4) == 0) {
									break label260;
								}
							}
							local84++;
						}
						if ((local139 + 1 - local86) * (local84 - (local82 - 1)) >= 4) {
							local143 = super.anIntArrayArrayArray12[local13][local82][local86];
							Static568.method7828(4, local82 << 9, (local84 << 9) + 512, local86 << 9, (local139 << 9) + 512, local143, local143);
							for (@Pc(722) int local722 = local82; local722 <= local84; local722++) {
								for (local241 = local86; local241 <= local139; local241++) {
									super.aByteArrayArrayArray16[local13][local722][local241] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray16 = null;
	}
}
