import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
	public int anInt6300 = 99;

	static {
		new Class221("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIZ)V")
	public Class134_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static236.aClass246_5, Static67.aClass108_3);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIILclient!km;[Lclient!vk;I[BII)V")
	public void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class82 arg5, @OriginalArg(6) Class239[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9) {
		@Pc(15) Class2_Sub13 local15 = new Class2_Sub13(arg8);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4226();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method4211();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method4240();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (arg7 == local55 && local51 >= arg2 && local51 < arg2 + 8 && local45 >= arg0 && arg0 + 8 > local45) {
					@Pc(103) Class34 local103 = Static11.aClass123_5.method2703(local17);
					@Pc(121) int local121 = arg3 + Static122.method2234(local51 & 0x7, local45 & 0x7, local67, local103.anInt808, local103.lb, arg4);
					@Pc(138) int local138 = Static359.method5437(local103.lb, local45 & 0x7, local103.anInt808, arg4, local51 & 0x7, local67) + arg1;
					if (local121 > 0 && local138 > 0 && local121 < super.anInt6292 - 1 && super.anInt6280 - 1 > local138) {
						@Pc(164) Class239 local164 = null;
						if (!super.aBoolean468) {
							@Pc(169) int local169 = arg9;
							if ((Static244.aByteArrayArrayArray4[1][local121][local138] & 0x2) == 2) {
								local169 = arg9 - 1;
							}
							if (local169 >= 0) {
								local164 = arg6[local169];
							}
						}
						this.method5432(arg5, local67 + arg4 & 0x3, local17, -1, local138, local63, arg9, local121, arg9, local164);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[B[Lclient!vk;Lclient!km;I)V")
	public void method5430(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class239[] arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method4226();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method4211();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method4240();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(70) int local70 = local49 + arg0;
				@Pc(74) int local74 = arg4 + local43;
				if (local70 > 0 && local74 > 0 && local70 < super.anInt6292 - 1 && super.anInt6280 - 1 > local74) {
					@Pc(99) Class239 local99 = null;
					if (!super.aBoolean468) {
						@Pc(104) int local104 = local53;
						if ((Static244.aByteArrayArrayArray4[1][local70][local74] & 0x2) == 2) {
							local104 = local53 - 1;
						}
						if (local104 >= 0) {
							local99 = arg2[local104];
						}
					}
					this.method5432(arg3, local65, local12, -1, local74, local61, local53, local70, local53, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILclient!km;IIILclient!vk;)V")
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class239 arg5) {
		@Pc(12) Interface11 local12 = null;
		if (arg4 == 0) {
			local12 = (Interface11) Static252.method4000(arg1, arg3, arg0);
		}
		if (arg4 == 1) {
			local12 = (Interface11) Static221.method3733(arg1, arg3, arg0);
		}
		if (arg4 == 2) {
			local12 = (Interface11) Static86.method4712(arg1, arg3, arg0, wk.class);
		}
		if (arg4 == 3) {
			local12 = (Interface11) Static240.method3889(arg1, arg3, arg0);
		}
		if (local12 == null) {
			return;
		}
		@Pc(70) Class34 local70 = Static11.aClass123_5.method2703(local12.method5025());
		@Pc(74) int local74 = local12.method5027();
		@Pc(78) int local78 = local12.method5024();
		if (local70.method817()) {
			Static191.method3064(arg1, arg3, local70, arg0);
		}
		if (local12.method5026()) {
			local12.method5028(arg2);
		}
		if (arg4 == 0) {
			@Pc(106) Class12_Sub2 local106 = Static252.method4000(arg1, arg3, arg0);
			if (local106 instanceof Class12_Sub2_Sub3) {
				((Class12_Sub2_Sub3) local106).aClass12_Sub2_1 = null;
			} else {
				Static34.method765(arg1, arg3, arg0);
			}
			if (local70.anInt780 != 0) {
				arg5.method5555(arg3, arg0, local78, !local70.aBoolean67, local74, local70.aBoolean66);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			@Pc(150) Class12_Sub4 local150 = Static221.method3733(arg1, arg3, arg0);
			if (!(local150 instanceof Class12_Sub4_Sub3)) {
				Static62.method1135(arg1, arg3, arg0);
				return;
			}
			((Class12_Sub4_Sub3) local150).aClass12_Sub4_1 = null;
			return;
		}
		if (arg4 == 2) {
			@Pc(179) Class12_Sub1 local179 = Static86.method4712(arg1, arg3, arg0, wk.class);
			if (local179 instanceof Class12_Sub1_Sub3 && arg3 == local179.aShort97 && local179.aShort94 == arg0) {
				((Class12_Sub1_Sub3) local179).aClass12_Sub1_1 = null;
			} else {
				Static249.method3984(arg1, arg3, arg0, wk.class);
			}
			if (local70.anInt780 != 0 && super.anInt6292 > arg3 + local70.lb && super.anInt6280 > local70.lb + arg0 && arg3 + local70.anInt808 < super.anInt6292 && super.anInt6280 > local70.anInt808 + arg0) {
				arg5.method5552(!local70.aBoolean67, local70.aBoolean66, local70.lb, local70.anInt808, local78, arg0, arg3);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		@Pc(284) Class12_Sub5 local284 = Static240.method3889(arg1, arg3, arg0);
		if (local284 instanceof Class12_Sub5_Sub3) {
			((Class12_Sub5_Sub3) local284).aClass12_Sub5_1 = null;
		} else {
			Static217.method3693(arg1, arg3, arg0);
		}
		if (local70.anInt780 == 1) {
			arg5.method5560(arg0, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!km;IIIIIIIIILclient!vk;)V")
	public void method5432(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class239 arg9) {
		if (!Static43.method900() && !Static122.method2233(Static303.anInt5442, arg7, arg8, arg4)) {
			return;
		}
		if (this.anInt6300 > arg8) {
			this.anInt6300 = arg8;
		}
		@Pc(32) Class34 local32 = Static11.aClass123_5.method2703(arg2);
		if (Static123.anInt2363 == 1 && local32.aBoolean62) {
			return;
		}
		@Pc(55) int local55;
		@Pc(52) int local52;
		if (arg1 == 1 || arg1 == 3) {
			local52 = local32.lb;
			local55 = local32.anInt808;
		} else {
			local52 = local32.anInt808;
			local55 = local32.lb;
		}
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (super.anInt6292 < arg7 + local55) {
			local76 = arg7;
			local80 = arg7 + 1;
		} else {
			local80 = arg7 + (local55 + 1 >> 1);
			local76 = arg7 + (local55 >> 1);
		}
		@Pc(110) int local110;
		@Pc(119) int local119;
		if (arg4 + local52 <= super.anInt6280) {
			local110 = arg4 + (local52 >> 1);
			local119 = arg4 + (local52 + 1 >> 1);
		} else {
			local119 = arg4 + 1;
			local110 = arg4;
		}
		@Pc(131) Class33 local131 = Static17.aClass33Array1[arg6];
		@Pc(155) int local155 = local131.method4057(local76, local110) + local131.method4057(local80, local110) + local131.method4057(local76, local119) + local131.method4057(local80, local119) >> 2;
		@Pc(168) int local168 = (arg7 << 7) + (local55 << 6);
		@Pc(177) int local177 = (arg4 << 7) + (local52 << 6);
		@Pc(189) boolean local189 = Static99.aBoolean151 && !super.aBoolean468 && local32.aBoolean61;
		if (local32.method817()) {
			Static52.method3357(null, null, arg8, arg7, arg1, local32, arg4);
		}
		@Pc(223) boolean local223 = arg3 == -1 && local32.anInt814 == -1 && local32.anIntArray124 == null && local32.anIntArray122 == null && !local32.aBoolean55;
		if (Static71.aBoolean114 && local32.anInt769 != 1) {
			return;
		}
		if (arg5 != 22) {
			@Pc(366) Class12_Sub1 local366;
			@Pc(336) Class12_Sub1_Sub4 local336;
			@Pc(368) int local368;
			if (arg5 == 10 || arg5 == 11) {
				local336 = null;
				if (local223) {
					@Pc(398) Class12_Sub1_Sub4 local398 = new Class12_Sub1_Sub4(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg7, arg7 + local55 - 1, arg4, arg4 + local52 - 1, arg5, arg1, local189);
					local336 = local398;
					local368 = local398.method3333();
					local366 = local398;
				} else {
					local366 = new Class12_Sub1_Sub5(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg7, arg7 + local55 - 1, arg4, arg4 + local52 - 1, arg5, arg1, arg3);
					local368 = 15;
				}
				@Pc(419) Class12_Sub1 local419 = Static86.method4712(arg8, arg7, arg4, wk.class);
				@Pc(421) boolean local421 = false;
				if (local419 instanceof Class12_Sub1_Sub3 && arg7 == local419.aShort97 && arg4 == local419.aShort94) {
					((Class12_Sub1_Sub3) local419).aClass12_Sub1_1 = local366;
					local421 = true;
				}
				if (local421 || Static326.method5033(local366, false)) {
					if (local336 != null && local336.method5026()) {
						local336.method5021(arg0);
					}
					if (local32.aBoolean60 && Static99.aBoolean151) {
						if (local368 > 30) {
							local368 = 30;
						}
						for (@Pc(472) int local472 = 0; local472 <= local55; local472++) {
							for (@Pc(476) int local476 = 0; local476 <= local52; local476++) {
								local131.method4062(arg7 + local472, arg4 - -local476, local368);
							}
						}
					}
				}
				if (local32.anInt780 != 0 && arg9 != null) {
					arg9.method5549(local52, arg7, !local32.aBoolean67, arg4, local55, local32.aBoolean66);
				}
			} else {
				@Pc(630) Class12_Sub1 local630;
				if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
					if (local223) {
						local336 = new Class12_Sub1_Sub4(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg7, local55 + arg7 - 1, arg4, local52 + arg4 - 1, arg5, arg1, local189);
						if (local336.method5026()) {
							local336.method5021(arg0);
						}
						local366 = local336;
					} else {
						local366 = new Class12_Sub1_Sub5(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg7, arg7 + local55 - 1, arg4, arg4 + local52 - 1, arg5, arg1, arg3);
					}
					local630 = Static86.method4712(arg8, arg7, arg4, wk.class);
					if (local630 instanceof Class12_Sub1_Sub3 && local630.aShort97 == arg7 && arg4 == local630.aShort94) {
						((Class12_Sub1_Sub3) local630).aClass12_Sub1_1 = local366;
					} else {
						Static326.method5033(local366, false);
					}
					if (Static99.aBoolean151 && !super.aBoolean468 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg8 > 0 && local32.anInt769 != 0) {
						super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x4);
					}
					if (local32.anInt780 != 0 && arg9 != null) {
						arg9.method5549(local52, arg7, !local32.aBoolean67, arg4, local55, local32.aBoolean66);
					}
				} else {
					@Pc(762) Class12_Sub2_Sub2 local762;
					@Pc(779) Class12_Sub2 local779;
					@Pc(745) Class12_Sub2 local745;
					if (arg5 == 0) {
						if (local223) {
							local762 = new Class12_Sub2_Sub2(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1, local189);
							local745 = local762;
							if (local762.method5026()) {
								local762.method5021(arg0);
							}
						} else {
							local745 = new Class12_Sub2_Sub1(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1, arg3);
						}
						local779 = Static252.method4000(arg8, arg7, arg4);
						if (local779 instanceof Class12_Sub2_Sub3) {
							((Class12_Sub2_Sub3) local779).aClass12_Sub2_1 = local745;
						} else {
							Static213.method3601(arg8, arg7, arg4, local745, null);
						}
						if (Static99.aBoolean151) {
							if (arg1 == 0) {
								if (local32.aBoolean60) {
									local131.method4062(arg7, arg4, 50);
									local131.method4062(arg7, arg4 + 1, 50);
								}
								if (local32.anInt769 == 1 && !super.aBoolean468) {
									super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x1);
								}
							} else if (arg1 == 1) {
								if (local32.aBoolean60) {
									local131.method4062(arg7, arg4 + 1, 50);
									local131.method4062(arg7 + 1, arg4 + 1, 50);
								}
								if (local32.anInt769 == 1 && !super.aBoolean468) {
									super.aByteArrayArrayArray14[arg8][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4 + 1] | 0x2);
								}
							} else if (arg1 == 2) {
								if (local32.aBoolean60) {
									local131.method4062(arg7 + 1, arg4, 50);
									local131.method4062(arg7 + 1, arg4 - -1, 50);
								}
								if (local32.anInt769 == 1 && !super.aBoolean468) {
									super.aByteArrayArrayArray14[arg8][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7 + 1][arg4] | 0x1);
								}
							} else if (arg1 == 3) {
								if (local32.aBoolean60) {
									local131.method4062(arg7, arg4, 50);
									local131.method4062(arg7 + 1, arg4, 50);
								}
								if (local32.anInt769 == 1 && !super.aBoolean468) {
									super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x2);
								}
							}
						}
						if (local32.anInt780 != 0 && arg9 != null) {
							arg9.method5562(arg1, local32.aBoolean66, !local32.aBoolean67, arg7, arg5, arg4);
						}
						if (local32.anInt800 != 16) {
							Static375.method3801(arg8, arg7, arg4, local32.anInt800);
						}
					} else if (arg5 == 1) {
						if (local223) {
							local762 = new Class12_Sub2_Sub2(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1, local189);
							local745 = local762;
							if (local762.method5026()) {
								local762.method5021(arg0);
							}
						} else {
							local745 = new Class12_Sub2_Sub1(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1, arg3);
						}
						local779 = Static252.method4000(arg8, arg7, arg4);
						if (local779 instanceof Class12_Sub2_Sub3) {
							((Class12_Sub2_Sub3) local779).aClass12_Sub2_1 = local745;
						} else {
							Static213.method3601(arg8, arg7, arg4, local745, null);
						}
						if (local32.aBoolean60 && Static99.aBoolean151) {
							if (arg1 == 0) {
								local131.method4062(arg7, arg4 + 1, 50);
							} else if (arg1 == 1) {
								local131.method4062(arg7 + 1, arg4 - -1, 50);
							} else if (arg1 == 2) {
								local131.method4062(arg7 + 1, arg4, 50);
							} else if (arg1 == 3) {
								local131.method4062(arg7, arg4, 50);
							}
						}
						if (local32.anInt780 != 0 && arg9 != null) {
							arg9.method5562(arg1, local32.aBoolean66, !local32.aBoolean67, arg7, arg5, arg4);
						}
					} else if (arg5 == 2) {
						local368 = arg1 + 1 & 0x3;
						if (local223) {
							@Pc(1251) Class12_Sub2_Sub2 local1251 = new Class12_Sub2_Sub2(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1 + 4, local189);
							@Pc(1266) Class12_Sub2_Sub2 local1266 = new Class12_Sub2_Sub2(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg5, local368, local189);
							if (local1251.method5026()) {
								local1251.method5021(arg0);
							}
							local745 = local1251;
							if (local1266.method5026()) {
								local1266.method5021(arg0);
							}
							local779 = local1266;
						} else {
							local745 = new Class12_Sub2_Sub1(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1 + 4, arg3);
							local779 = new Class12_Sub2_Sub1(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg5, local368, arg3);
						}
						Static213.method3601(arg8, arg7, arg4, local745, local779);
						if (local32.anInt769 == 1 && Static99.aBoolean151 && !super.aBoolean468) {
							if (arg1 == 0) {
								super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x1);
								super.aByteArrayArrayArray14[arg8][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4 + 1] | 0x2);
							} else if (arg1 == 1) {
								super.aByteArrayArrayArray14[arg8][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4 + 1] | 0x2);
								super.aByteArrayArrayArray14[arg8][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7 + 1][arg4] | 0x1);
							} else if (arg1 == 2) {
								super.aByteArrayArrayArray14[arg8][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7 + 1][arg4] | 0x1);
								super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x2);
							} else if (arg1 == 3) {
								super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x2);
								super.aByteArrayArrayArray14[arg8][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg8][arg7][arg4] | 0x1);
							}
						}
						if (local32.anInt780 != 0 && arg9 != null) {
							arg9.method5562(arg1, local32.aBoolean66, !local32.aBoolean67, arg7, arg5, arg4);
						}
						if (local32.anInt800 != 16) {
							Static375.method3801(arg8, arg7, arg4, local32.anInt800);
						}
					} else if (arg5 == 3) {
						if (local223) {
							local762 = new Class12_Sub2_Sub2(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1, local189);
							local745 = local762;
							if (local762.method5026()) {
								local762.method5021(arg0);
							}
						} else {
							local745 = new Class12_Sub2_Sub1(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg5, arg1, arg3);
						}
						local779 = Static252.method4000(arg8, arg7, arg4);
						if (local779 instanceof Class12_Sub2_Sub3) {
							((Class12_Sub2_Sub3) local779).aClass12_Sub2_1 = local745;
						} else {
							Static213.method3601(arg8, arg7, arg4, local745, null);
						}
						if (local32.aBoolean60 && Static99.aBoolean151) {
							if (arg1 == 0) {
								local131.method4062(arg7, arg4 + 1, 50);
							} else if (arg1 == 1) {
								local131.method4062(arg7 + 1, arg4 + 1, 50);
							} else if (arg1 == 2) {
								local131.method4062(arg7 + 1, arg4, 50);
							} else if (arg1 == 3) {
								local131.method4062(arg7, arg4, 50);
							}
						}
						if (local32.anInt780 != 0 && arg9 != null) {
							arg9.method5562(arg1, local32.aBoolean66, !local32.aBoolean67, arg7, arg5, arg4);
						}
					} else if (arg5 == 9) {
						if (local223) {
							local336 = new Class12_Sub1_Sub4(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg7, arg7, arg4, arg4, arg5, arg1, local189);
							if (local336.method5026()) {
								local336.method5021(arg0);
							}
							local366 = local336;
						} else {
							local366 = new Class12_Sub1_Sub5(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg7, arg7 + local55 - 1, arg4, arg4 + local52 - 1, arg5, arg1, arg3);
						}
						local630 = Static86.method4712(arg8, arg7, arg4, wk.class);
						if (local630 instanceof Class12_Sub1_Sub3 && arg7 == local630.aShort97 && arg4 == local630.aShort94) {
							((Class12_Sub1_Sub3) local630).aClass12_Sub1_1 = local366;
						} else {
							Static326.method5033(local366, false);
						}
						if (local32.anInt780 != 0 && arg9 != null) {
							arg9.method5549(local52, arg7, !local32.aBoolean67, arg4, local55, local32.aBoolean66);
						}
						if (local32.anInt800 != 16) {
							Static375.method3801(arg8, arg7, arg4, local32.anInt800);
						}
					} else {
						@Pc(1848) Class12_Sub4 local1848;
						if (arg5 == 4) {
							if (local223) {
								@Pc(1846) Class12_Sub4_Sub1 local1846 = new Class12_Sub4_Sub1(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, 0, 0, 0, arg5, arg1);
								local1848 = local1846;
								if (local1846.method5026()) {
									local1846.method5021(arg0);
								}
							} else {
								local1848 = new Class12_Sub4_Sub2(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, 0, 0, 0, arg5, arg1, arg3);
							}
							@Pc(1882) Class12_Sub4 local1882 = Static221.method3733(arg8, arg7, arg4);
							if (local1882 instanceof Class12_Sub4_Sub3) {
								((Class12_Sub4_Sub3) local1882).aClass12_Sub4_1 = local1848;
							} else {
								Static344.method5461(arg8, arg7, arg4, local1848, null);
							}
						} else {
							@Pc(1902) int local1902;
							@Pc(1908) Interface11 local1908;
							@Pc(1945) Class12_Sub4_Sub1 local1945;
							@Pc(1989) Class12_Sub4 local1989;
							if (arg5 == 5) {
								local1902 = 16;
								local1908 = (Interface11) Static252.method4000(arg8, arg7, arg4);
								if (local1908 != null) {
									local1902 = Static11.aClass123_5.method2703(local1908.method5025()).anInt800;
								}
								if (local223) {
									local1945 = new Class12_Sub4_Sub1(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, 0, local1902 * Static90.anIntArray225[arg1], Static60.anIntArray159[arg1] * local1902, arg5, arg1);
									if (local1945.method5026()) {
										local1945.method5021(arg0);
									}
									local1848 = local1945;
								} else {
									local1848 = new Class12_Sub4_Sub2(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, 0, local1902 * Static90.anIntArray225[arg1], local1902 * Static60.anIntArray159[arg1], arg5, arg1, arg3);
								}
								local1989 = Static221.method3733(arg8, arg7, arg4);
								if (local1989 instanceof Class12_Sub4_Sub3) {
									((Class12_Sub4_Sub3) local1989).aClass12_Sub4_1 = local1848;
								} else {
									Static344.method5461(arg8, arg7, arg4, local1848, null);
								}
							} else if (arg5 == 6) {
								local1902 = 8;
								local1908 = (Interface11) Static252.method4000(arg8, arg7, arg4);
								if (local1908 != null) {
									local1902 = Static11.aClass123_5.method2703(local1908.method5025()).anInt800 / 2;
								}
								if (local223) {
									local1945 = new Class12_Sub4_Sub1(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg1, local1902 * Static90.anIntArray225[arg1], local1902 * Static60.anIntArray159[arg1], arg5, arg1 + 4);
									local1848 = local1945;
									if (local1945.method5026()) {
										local1945.method5021(arg0);
									}
								} else {
									local1848 = new Class12_Sub4_Sub2(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg1, local1902 * Static145.anIntArray302[arg1], Static265.anIntArray571[arg1] * local1902, arg5, arg1 + 4, arg3);
								}
								local1989 = Static221.method3733(arg8, arg7, arg4);
								if (local1989 instanceof Class12_Sub4_Sub3) {
									((Class12_Sub4_Sub3) local1989).aClass12_Sub4_1 = local1848;
								} else {
									Static344.method5461(arg8, arg7, arg4, local1848, null);
								}
							} else if (arg5 == 7) {
								local1902 = arg1 + 2 & 0x3;
								if (local223) {
									@Pc(2149) Class12_Sub4_Sub1 local2149 = new Class12_Sub4_Sub1(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, local1902, 0, 0, arg5, local1902 + 4);
									local1848 = local2149;
									if (local2149.method5026()) {
										local2149.method5021(arg0);
									}
								} else {
									local1848 = new Class12_Sub4_Sub2(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, local1902, 0, 0, arg5, local1902 + 4, arg3);
								}
								@Pc(2189) Class12_Sub4 local2189 = Static221.method3733(arg8, arg7, arg4);
								if (local2189 instanceof Class12_Sub4_Sub3) {
									((Class12_Sub4_Sub3) local2189).aClass12_Sub4_1 = local1848;
								} else {
									Static344.method5461(arg8, arg7, arg4, local1848, null);
								}
							} else if (arg5 == 8) {
								local368 = arg1 + 2 & 0x3;
								@Pc(2217) int local2217 = 8;
								@Pc(2223) Interface11 local2223 = (Interface11) Static252.method4000(arg8, arg7, arg4);
								if (local2223 != null) {
									local2217 = Static11.aClass123_5.method2703(local2223.method5025()).anInt800 / 2;
								}
								@Pc(2266) Class12_Sub4 local2266;
								@Pc(2287) Class12_Sub4 local2287;
								if (local223) {
									local2266 = new Class12_Sub4_Sub1(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg1, local2217 * Static145.anIntArray302[arg1], Static265.anIntArray571[arg1] * local2217, arg5, arg1 + 4);
									local2287 = new Class12_Sub4_Sub1(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg1, 0, 0, arg5, local368 + 4);
									if (local2266.method5026()) {
										local2266.method5021(arg0);
									}
									if (local2287.method5026()) {
										local2287.method5021(arg0);
									}
								} else {
									local2266 = new Class12_Sub4_Sub2(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg1, local2217 * Static145.anIntArray302[arg1], local2217 * Static265.anIntArray571[arg1], arg5, arg1 + 4, arg3);
									local2287 = new Class12_Sub4_Sub2(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg1, 0, 0, arg5, local368 + 4, arg3);
								}
								Static344.method5461(arg8, arg7, arg4, local2266, local2287);
							}
						}
					}
				}
			}
		} else if (Static364.aBoolean378 || local32.anInt788 != 0 || local32.anInt780 == 1 || local32.aBoolean59) {
			@Pc(265) Class12_Sub5 local265;
			if (local223) {
				@Pc(281) Class12_Sub5_Sub2 local281 = new Class12_Sub5_Sub2(arg0, local32, arg6, local168, local155, local177, super.aBoolean468, arg1, local189);
				local265 = local281;
				if (local281.method5026()) {
					local281.method5021(arg0);
				}
			} else {
				local265 = new Class12_Sub5_Sub1(arg0, local32, arg8, arg6, local168, local155, local177, super.aBoolean468, arg1, arg3);
			}
			@Pc(296) Class12_Sub5 local296 = Static240.method3889(arg8, arg7, arg4);
			if (local296 instanceof Class12_Sub5_Sub3) {
				((Class12_Sub5_Sub3) local296).aClass12_Sub5_1 = local265;
			} else {
				Static149.method2527(arg8, arg7, arg4, local265);
			}
			if (local32.anInt780 == 1 && arg9 != null) {
				arg9.method5547(arg4, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!km;I[IIILclient!lk;)V")
	public void method5434(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub13 arg4) {
		if (super.aBoolean468) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class251 local13 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(24) int local24;
						@Pc(61) int local61;
						@Pc(502) int local502;
						@Pc(79) int local79;
						@Pc(83) int local83;
						while (arg4.aByteArray77.length > arg4.anInt4788) {
							local24 = arg4.method4240();
							if (local24 == 0) {
								local13 = new Class251(arg4);
							} else {
								@Pc(85) int local85;
								if (local24 == 1) {
									local61 = arg4.method4240();
									if (local61 > 0) {
										for (local502 = 0; local502 < local61; local502++) {
											@Pc(509) Class2_Sub14_Sub1 local509 = new Class2_Sub14_Sub1(arg4);
											if (local509.anInt2181 == 31) {
												@Pc(520) Class238 local520 = Static336.aClass156_1.method3773(arg4.method4245());
												local509.method2106(local520.anInt6429, local520.anInt6426, local520.anInt6430, local520.anInt6433);
											}
											local509.anInt2170 += arg2 << 7;
											local509.anInt2167 += arg3 << 7;
											local83 = local509.anInt2170 >> 7;
											local85 = local509.anInt2167 >> 7;
											if (local83 >= 0 && local85 >= 0 && super.anInt6292 > local83 && super.anInt6280 > local85) {
												local509.anInt2165 = super.anIntArrayArrayArray15[local509.anInt2183][local83][local85] - local509.anInt2165;
												if (arg0.method4532() > 0) {
													Static366.method5531(local509);
												}
											}
										}
									}
								} else if (local24 == 2) {
									if (local13 == null) {
										local13 = new Class251();
									}
									local13.method5740(arg4);
								} else if (local24 != 128) {
									if (local24 != 129) {
										throw new IllegalStateException((String) null);
									}
									if (super.aByteArrayArrayArray16 == null) {
										super.aByteArrayArrayArray16 = new byte[4][][];
									}
									for (local61 = 0; local61 < 4; local61++) {
										@Pc(67) byte local67 = arg4.method4217();
										@Pc(89) int local89;
										if (local67 == 0 && super.aByteArrayArrayArray16[local61] != null) {
											local79 = arg2;
											local83 = arg2 + 64;
											local85 = arg3;
											local89 = arg3 + 64;
											if (local83 < 0) {
												local83 = 0;
											} else if (local83 >= super.anInt6292) {
												local83 = super.anInt6292;
											}
											if (arg3 < 0) {
												local85 = 0;
											} else if (super.anInt6280 <= arg3) {
												local85 = super.anInt6280;
											}
											if (arg2 < 0) {
												local79 = 0;
											} else if (arg2 >= super.anInt6292) {
												local79 = super.anInt6292;
											}
											if (local89 < 0) {
												local89 = 0;
											} else if (super.anInt6280 <= local89) {
												local89 = super.anInt6280;
											}
											while (local83 > local79) {
												while (local85 < local89) {
													super.aByteArrayArrayArray16[local61][local79][local85] = 0;
													local85++;
												}
												local79++;
											}
										} else if (local67 == 1) {
											if (super.aByteArrayArrayArray16[local61] == null) {
												super.aByteArrayArrayArray16[local61] = new byte[super.anInt6292 + 1][super.anInt6280 + 1];
											}
											for (local79 = 0; local79 < 64; local79 += 4) {
												for (local83 = 0; local83 < 64; local83 += 4) {
													@Pc(210) byte local210 = arg4.method4217();
													for (local89 = arg2 + local79; local89 < local79 + arg2 + 4; local89++) {
														for (@Pc(220) int local220 = arg3 + local83; local220 < arg3 + local83 + 4; local220++) {
															if (local89 >= 0 && local89 < super.anInt6292 && local220 >= 0 && local220 < super.anInt6280) {
																super.aByteArrayArrayArray16[local61][local89][local220] = local210;
															}
														}
													}
												}
											}
										} else if (local67 == 2) {
											if (super.aByteArrayArrayArray16[local61] == null) {
												super.aByteArrayArrayArray16[local61] = new byte[super.anInt6292 + 1][super.anInt6280 + 1];
											}
											if (local61 > 0) {
												local79 = arg2;
												local83 = arg2 + 64;
												local85 = arg3;
												local89 = arg3 + 64;
												if (local83 < 0) {
													local83 = 0;
												} else if (local83 >= super.anInt6292) {
													local83 = super.anInt6292;
												}
												if (arg2 < 0) {
													local79 = 0;
												} else if (arg2 >= super.anInt6292) {
													local79 = super.anInt6292;
												}
												if (arg3 < 0) {
													local85 = 0;
												} else if (arg3 >= super.anInt6280) {
													local85 = super.anInt6280;
												}
												if (local89 < 0) {
													local89 = 0;
												} else if (local89 >= super.anInt6280) {
													local89 = super.anInt6280;
												}
												while (local83 > local79) {
													while (local89 > local85) {
														super.aByteArrayArrayArray16[local61][local79][local85] = super.aByteArrayArrayArray16[local61 - 1][local79][local85];
														local85++;
													}
													local79++;
												}
											}
										}
									}
									local11 = true;
								} else if (arg1 == null) {
									arg4.anInt4788 += 10;
								} else {
									arg1[0] = arg4.method4245();
									arg1[1] = arg4.method4251();
									arg1[2] = arg4.method4251();
									arg1[3] = arg4.method4251();
									arg1[4] = arg4.method4245();
								}
							}
						}
						if (local13 != null) {
							for (local24 = 0; local24 < 8; local24++) {
								for (local61 = 0; local61 < 8; local61++) {
									local502 = (arg2 >> 3) + local24;
									local79 = (arg3 >> 3) + local61;
									if (local502 >= 0 && super.anInt6292 >> 3 > local502 && local79 >= 0 && local79 < super.anInt6280 >> 3) {
										Static265.method4100(local79, local502, local13);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray16 != null) {
							for (local24 = 0; local24 < 4; local24++) {
								if (super.aByteArrayArrayArray16[local24] != null) {
									for (local61 = 0; local61 < 16; local61++) {
										for (local502 = 0; local502 < 16; local502++) {
											local79 = local61 + (arg2 >> 2);
											local83 = (arg3 >> 2) + local502;
											if (local79 >= 0 && local79 < 26 && local83 >= 0 && local83 < 26) {
												super.aByteArrayArrayArray16[local24][local79][local83] = 0;
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
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[IIZILclient!km;IIILclient!lk;I)V")
	public void method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class82 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub13 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean468) {
			return;
		}
		@Pc(20) Class251 local20 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(32) int local32 = (arg7 & 0x7) * 8;
		@Pc(38) int local38 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(43) int local43;
			@Pc(85) int local85;
			@Pc(123) int local123;
			@Pc(430) int local430;
			while (arg8.aByteArray77.length > arg8.anInt4788) {
				local43 = arg8.method4240();
				if (local43 == 0) {
					local20 = new Class251(arg8);
				} else {
					@Pc(127) int local127;
					@Pc(142) int local142;
					@Pc(146) int local146;
					@Pc(277) int local277;
					if (local43 == 1) {
						local85 = arg8.method4240();
						if (local85 > 0) {
							for (local430 = 0; local430 < local85; local430++) {
								@Pc(437) Class2_Sub14_Sub1 local437 = new Class2_Sub14_Sub1(arg8);
								if (local437.anInt2181 == 31) {
									@Pc(450) Class238 local450 = Static336.aClass156_1.method3773(arg8.method4245());
									local437.method2106(local450.anInt6429, local450.anInt6426, local450.anInt6430, local450.anInt6433);
								}
								local127 = local437.anInt2170 >> 7;
								local277 = local437.anInt2167 >> 7;
								if (local437.anInt2183 == arg3 && local32 <= local127 && local127 < local32 + 8 && local277 >= local38 && local38 + 8 > local277) {
									local142 = Static39.method835(local437.anInt2170 & 0x3FF, local437.anInt2167 & 0x3FF, arg2) + (arg6 << 7);
									local146 = (arg5 << 7) + Static343.method5245(arg2, local437.anInt2170 & 0x3FF, local437.anInt2167 & 0x3FF);
									local437.anInt2167 = local146;
									local437.anInt2170 = local142;
									local127 = local437.anInt2170 >> 7;
									local277 = local437.anInt2167 >> 7;
									if (local127 >= 0 && local277 >= 0 && local127 < super.anInt6292 && local277 < super.anInt6280) {
										local437.anInt2165 = super.anIntArrayArrayArray15[arg3][local127][local277] - local437.anInt2165;
										if (arg4.method4532() > 0) {
											Static366.method5531(local437);
										}
									}
								}
							}
						}
					} else if (local43 == 2) {
						if (local20 == null) {
							local20 = new Class251();
						}
						local20.method5740(arg8);
					} else if (local43 != 128) {
						if (local43 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray16 == null) {
							super.aByteArrayArrayArray16 = new byte[4][][];
						}
						for (local85 = 0; local85 < 4; local85++) {
							@Pc(91) byte local91 = arg8.method4217();
							if (local91 == 0 && super.aByteArrayArrayArray16[arg9] != null) {
								if (local85 <= arg3) {
									local123 = arg6;
									local127 = arg6 + 7;
									local277 = arg5;
									local142 = arg5 + 7;
									if (arg6 < 0) {
										local123 = 0;
									} else if (arg6 >= super.anInt6292) {
										local123 = super.anInt6292;
									}
									if (arg5 < 0) {
										local277 = 0;
									} else if (super.anInt6280 <= arg5) {
										local277 = super.anInt6280;
									}
									if (local127 < 0) {
										local127 = 0;
									} else if (super.anInt6292 <= local127) {
										local127 = super.anInt6292;
									}
									if (local142 < 0) {
										local142 = 0;
									} else if (local142 >= super.anInt6280) {
										local142 = super.anInt6280;
									}
									while (local127 > local123) {
										while (local142 > local277) {
											super.aByteArrayArrayArray16[arg9][local123][local277] = 0;
											local277++;
										}
										local123++;
									}
								}
							} else if (local91 == 1) {
								if (super.aByteArrayArrayArray16[arg9] == null) {
									super.aByteArrayArrayArray16[arg9] = new byte[super.anInt6292 + 1][super.anInt6280 + 1];
								}
								for (local123 = 0; local123 < 64; local123 += 4) {
									for (local127 = 0; local127 < 64; local127 += 4) {
										@Pc(133) byte local133 = arg8.method4217();
										if (local85 <= arg3) {
											for (local142 = local123; local142 < local123 + 4; local142++) {
												for (local146 = local127; local146 < local127 + 4; local146++) {
													if (local32 <= local142 && local142 < local32 + 8 && local38 <= local146 && local38 + 8 > local38) {
														@Pc(192) int local192 = Static315.method4888(local142 & 0x7, arg2, local146 & 0x7) + arg6;
														@Pc(204) int local204 = Static58.method4851(arg2, local142 & 0x7, local146 & 0x7) + arg5;
														if (local192 >= 0 && super.anInt6292 > local192 && local204 >= 0 && local204 < super.anInt6280) {
															super.aByteArrayArrayArray16[arg9][local192][local204] = local133;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg1 == null) {
						arg8.anInt4788 += 10;
					} else {
						arg1[0] = arg8.method4245();
						arg1[1] = arg8.method4251();
						arg1[2] = arg8.method4251();
						arg1[3] = arg8.method4251();
						arg1[4] = arg8.method4245();
					}
				}
			}
			if (local20 != null) {
				Static265.method4100(arg5 >> 3, arg6 >> 3, local20);
			}
			if (super.aByteArrayArrayArray16 != null && super.aByteArrayArrayArray16[arg9] != null) {
				local43 = arg6 + 7;
				local85 = arg5 + 7;
				for (local430 = arg6; local430 < local43; local430++) {
					for (local123 = arg5; local123 < local85; local123++) {
						super.aByteArrayArrayArray16[arg9][local430][local123] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!km;I)V")
	public void method5439(@OriginalArg(0) Class82 arg0) {
		Static262.method2721(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt6287 > 1) {
			for (local15 = 0; super.anInt6292 > local15; local15++) {
				for (local19 = 0; local19 < super.anInt6280; local19++) {
					if ((Static244.aByteArrayArrayArray4[1][local15][local19] & 0x2) == 2) {
						Static303.method4755(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; super.anInt6287 > local15; local15++) {
			for (local19 = 0; local19 <= super.anInt6280; local19++) {
				for (@Pc(61) int local61 = 0; super.anInt6292 >= local61; local61++) {
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(112) int local112;
					@Pc(137) int local137;
					@Pc(236) int local236;
					@Pc(245) int local245;
					@Pc(265) int local265;
					@Pc(269) int local269;
					if ((super.aByteArrayArrayArray14[local15][local61][local19] & 0x1) != 0) {
						local79 = local19;
						local81 = local19;
						local83 = local15;
						while (local81 < super.anInt6280 && (super.aByteArrayArrayArray14[local15][local61][local81 + 1] & 0x1) != 0) {
							local81++;
						}
						local112 = local15;
						while (local79 > 0 && (super.aByteArrayArrayArray14[local15][local61][local79 - 1] & 0x1) != 0) {
							local79--;
						}
						label164: while (local83 > 0) {
							for (local137 = local79; local137 <= local81; local137++) {
								if ((super.aByteArrayArrayArray14[local83 - 1][local61][local137] & 0x1) == 0) {
									break label164;
								}
							}
							local83--;
						}
						label153: while (local112 < 3) {
							for (local137 = local79; local137 <= local81; local137++) {
								if ((super.aByteArrayArrayArray14[local112 + 1][local61][local137] & 0x1) == 0) {
									break label153;
								}
							}
							local112++;
						}
						local137 = (local81 + 1 - local79) * (local112 - (local83 - 1));
						if (local137 >= 2) {
							local236 = super.anIntArrayArrayArray15[local112][local61][local79] - 240;
							local245 = super.anIntArrayArrayArray15[local83][local61][local79];
							Static30.method726(1, local61 * 128, local61 * 128, local79 * 128, local81 * 128 + 128, local236, local245);
							for (local265 = local83; local265 <= local112; local265++) {
								for (local269 = local79; local269 <= local81; local269++) {
									super.aByteArrayArrayArray14[local265][local61][local269] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local15][local61][local19] & 0x2) != 0) {
						local79 = local61;
						local81 = local61;
						local83 = local15;
						while (local79 > 0 && (super.aByteArrayArrayArray14[local15][local79 - 1][local19] & 0x2) != 0) {
							local79--;
						}
						local112 = local15;
						while (local81 < super.anInt6292 && (super.aByteArrayArrayArray14[local15][local81 + 1][local19] & 0x2) != 0) {
							local81++;
						}
						label218: while (local83 > 0) {
							for (local137 = local79; local137 <= local81; local137++) {
								if ((super.aByteArrayArrayArray14[local83 - 1][local137][local19] & 0x2) == 0) {
									break label218;
								}
							}
							local83--;
						}
						label207: while (local112 < 3) {
							for (local137 = local79; local137 <= local81; local137++) {
								if ((super.aByteArrayArrayArray14[local112 + 1][local137][local19] & 0x2) == 0) {
									break label207;
								}
							}
							local112++;
						}
						local137 = (local81 + 1 - local79) * (local112 + 1 - local83);
						if (local137 >= 2) {
							local236 = super.anIntArrayArrayArray15[local112][local79][local19] - 240;
							local245 = super.anIntArrayArrayArray15[local83][local79][local19];
							Static30.method726(2, local79 * 128, local81 * 128 + 128, local19 * 128, local19 * 128, local236, local245);
							for (local265 = local83; local265 <= local112; local265++) {
								for (local269 = local79; local269 <= local81; local269++) {
									super.aByteArrayArrayArray14[local265][local269][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local15][local61][local19] & 0x4) != 0) {
						local79 = local61;
						local81 = local61;
						local83 = local19;
						local112 = local19;
						while (local83 > 0 && (super.aByteArrayArrayArray14[local15][local61][local83 - 1] & 0x4) != 0) {
							local83--;
						}
						while (super.anInt6280 > local112 && (super.aByteArrayArrayArray14[local15][local61][local112 + 1] & 0x4) != 0) {
							local112++;
						}
						label272: while (local79 > 0) {
							for (local137 = local83; local137 <= local112; local137++) {
								if ((super.aByteArrayArrayArray14[local15][local79 - 1][local137] & 0x4) == 0) {
									break label272;
								}
							}
							local79--;
						}
						label261: while (super.anInt6292 > local81) {
							for (local137 = local83; local137 <= local112; local137++) {
								if ((super.aByteArrayArrayArray14[local15][local81 + 1][local137] & 0x4) == 0) {
									break label261;
								}
							}
							local81++;
						}
						if ((local112 + 1 - local83) * (local81 + 1 - local79) >= 4) {
							local137 = super.anIntArrayArrayArray15[local15][local79][local83];
							Static30.method726(4, local79 * 128, local81 * 128 + 128, local83 * 128, local112 * 128 + 128, local137, local137);
							for (@Pc(710) int local710 = local79; local710 <= local81; local710++) {
								for (local236 = local83; local236 <= local112; local236++) {
									super.aByteArrayArrayArray14[local15][local710][local236] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}
}
