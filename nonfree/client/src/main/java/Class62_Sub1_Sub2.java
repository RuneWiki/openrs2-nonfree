import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class62_Sub1_Sub2 extends Class62_Sub1 {

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!uq;IIII[[I[[II)V")
	public Class62_Sub1_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([II[[ZIIZI[ILclient!qaa;III)V")
	private void method3722(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int[] arg4, @OriginalArg(8) Class258 arg5, @OriginalArg(9) int arg6, @OriginalArg(11) int arg7) {
		@Pc(13) int local13 = (arg1 - arg7) * 1024 / 256;
		arg5.aBoolean557 = false;
		arg5.aBoolean558 = false;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = local13;
		for (@Pc(31) int local31 = arg3; local31 < arg6; local31++) {
			for (@Pc(35) int local35 = arg7; local35 < arg1; local35++) {
				if (arg2[local31 - arg3][local35 - arg7]) {
					@Pc(72) int local72;
					if (super.aClass53ArrayArray3[local31][local35] != null) {
						@Pc(286) Class53 local286 = super.aClass53ArrayArray3[local31][local35];
						if (local286.aShort15 != -1 && (local286.aByte23 & 0x2) == 0 && local286.anInt1511 == 0) {
							local72 = super.aClass9_Sub1_6.method1644(local286.aShort15);
							arg5.method6342(local29 - 4, local29 + -4, local29, local25 + 4, local25, local25 + 4, Static499.method7465(local72, local286.anInt1509), Static499.method7465(local72, local286.anInt1508), Static499.method7465(local72, local286.anInt1507));
							arg5.method6342(local29, local29, local29 - 4, local25, local25 + 4, local25, Static499.method7465(local72, local286.anInt1510), Static499.method7465(local72, local286.anInt1507), Static499.method7465(local72, local286.anInt1508));
						} else if (local286.anInt1511 == 0) {
							arg5.method6344(local29 - 4, local29 + -4, local29, local25 + 4, local25, local25 + 4, local286.anInt1509, local286.anInt1508, local286.anInt1507);
							arg5.method6344(local29, local29, local29 - 4, local25, local25 + 4, local25, local286.anInt1510, local286.anInt1507, local286.anInt1508);
						} else {
							local72 = local286.anInt1511;
							arg5.method6344(local29 - 4, local29 + -4, local29, local25 + 4, local25, local25 + 4, Static571.method8046(local72, local286.anInt1509 & 0xFF000000), Static571.method8046(local72, local286.anInt1508 & 0xFF000000), Static571.method8046(local72, local286.anInt1507 & 0xFF000000));
							arg5.method6344(local29, local29, local29 - 4, local25, local25 + 4, local25, Static571.method8046(local72, local286.anInt1510 & 0xFF000000), Static571.method8046(local72, local286.anInt1507 & 0xFF000000), Static571.method8046(local72, local286.anInt1508 & 0xFF000000));
						}
					} else if (super.aClass239ArrayArray3[local31][local35] != null) {
						@Pc(70) Class239 local70 = super.aClass239ArrayArray3[local31][local35];
						for (local72 = 0; local72 < local70.aShort70; local72++) {
							arg4[local72] = local70.aShortArray82[local72] * 4 / super.anInt9884 + local25;
							arg0[local72] = local29 - local70.aShortArray81[local72] * 4 / super.anInt9884;
						}
						for (@Pc(110) int local110 = 0; local110 < local70.aShort69; local110++) {
							@Pc(116) int local116 = local110 * 3;
							@Pc(120) int local120 = local116 + 1;
							@Pc(124) int local124 = local120 + 1;
							@Pc(128) int local128 = arg4[local116];
							@Pc(132) int local132 = arg4[local120];
							@Pc(136) int local136 = arg4[local124];
							@Pc(140) int local140 = arg0[local116];
							@Pc(144) int local144 = arg0[local120];
							@Pc(148) int local148 = arg0[local124];
							@Pc(211) int local211;
							if (local70.anIntArray499 != null && local70.anIntArray499[local110] != 0 && (local70.aShortArray79 == null || local70.aShortArray79 != null && local70.aShortArray79[local110] == -1)) {
								local211 = local70.anIntArray499[local110];
								arg5.method6344(local140, local144, local148, local128, local132, local136, Static571.method8046(local211, -(-16777216 & local70.anIntArray500[local116]) - 16777216), Static571.method8046(local211, -(local70.anIntArray500[local120] & 0xFF000000) - 16777216), Static571.method8046(local211, -(local70.anIntArray500[local124] & 0xFF000000) - 16777216));
							} else if (local70.aShortArray79 == null || local70.aShortArray79[local110] == -1) {
								arg5.method6344(local140, local144, local148, local128, local132, local136, local70.anIntArray500[local116], local70.anIntArray500[local120], local70.anIntArray500[local124]);
							} else {
								local211 = super.aClass9_Sub1_6.method1644(local70.aShortArray79[local110]);
								arg5.method6342(local140, local144, local148, local128, local132, local136, local211, local211, local211);
							}
						}
					}
				}
				local29 -= 4;
			}
			local29 = local13;
			local25 += 4;
		}
		arg5.aBoolean557 = true;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([ILclient!qaa;III[IZ[I)V")
	private void method3723(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class53 local12 = super.aClass53ArrayArray3[arg3][arg2];
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(490) int local490;
		@Pc(555) int local555;
		@Pc(619) int local619;
		@Pc(682) int local682;
		@Pc(501) int local501;
		@Pc(587) int local587;
		@Pc(630) int local630;
		@Pc(693) int local693;
		@Pc(458) int local458;
		@Pc(522) int local522;
		@Pc(575) int local575;
		@Pc(650) int local650;
		@Pc(479) int local479;
		@Pc(544) int local544;
		@Pc(607) int local607;
		@Pc(671) int local671;
		@Pc(121) int local121;
		@Pc(148) int local148;
		@Pc(178) int local178;
		@Pc(208) int local208;
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(236) int local236;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(257) int local257;
		if (local12 == null) {
			@Pc(1611) Class239 local1611 = super.aClass239ArrayArray3[arg3][arg2];
			if (local1611 != null) {
				if (super.anInt4255 == -1) {
					for (local682 = 0; local682 < local1611.aShort70; local682++) {
						local31 = local1611.aShortArray82[local682] + (arg3 << super.anInt9883);
						local36 = local1611.aShortArray77[local682];
						local41 = local1611.aShortArray81[local682] + (arg2 << super.anInt9883);
						local619 = super.anInt4246 + (local41 * super.anInt4251 + super.anInt4254 * local31 + super.anInt4256 * local36 >> 14);
						if (super.aClass9_Sub1_6.anInt1811 >= local619) {
							return;
						}
						arg0[local682] = 0;
						if (arg5) {
							local501 = local619 - super.aClass9_Sub1_6.anInt1807;
							if (local501 > 255) {
								local501 = 255;
							}
							if (local501 > 0) {
								arg0[local682] = local501;
								local587 = local501 * local1611.aShortArray80[local682] / 255;
								if (local587 > 0) {
									local36 -= local587;
								}
							}
						} else if (super.aClass9_Sub1_6.aBoolean185) {
							local501 = local619 - super.aClass9_Sub1_6.anInt1807;
							if (local501 > 0) {
								arg0[local682] = local501;
								if (arg0[local682] > 255) {
									arg0[local682] = 255;
								}
							}
						}
						local555 = (super.anInt4249 * local41 + super.anInt4257 * local36 + super.anInt4247 * local31 >> 14) + super.anInt4258;
						local490 = super.anInt4253 + (local31 * super.anInt4250 + super.anInt4248 * local36 + local41 * super.anInt4252 >> 14);
						arg4[local682] = local490 * super.aClass9_Sub1_6.anInt1817 / local619 + arg1.anInt7597;
						arg6[local682] = arg1.anInt7599 + local555 * super.aClass9_Sub1_6.anInt1827 / local619;
					}
				} else {
					for (local682 = 0; local682 < local1611.aShort70; local682++) {
						local31 = local1611.aShortArray82[local682] + (arg3 << super.anInt9883);
						local36 = local1611.aShortArray77[local682];
						local41 = local1611.aShortArray81[local682] + (arg2 << super.anInt9883);
						arg0[local682] = 0;
						if (arg5) {
							local501 = -super.aClass9_Sub1_6.anInt1807 + super.anInt4255;
							if (local501 > 255) {
								local501 = 255;
							}
							if (local501 > 0) {
								arg0[local682] = local501;
								local587 = local501 * local1611.aShortArray80[local682] / 255;
								if (local587 > 0) {
									local36 -= local587;
								}
							}
						} else if (super.aClass9_Sub1_6.aBoolean185) {
							local501 = super.anInt4255 - super.aClass9_Sub1_6.anInt1807;
							if (local501 > 0) {
								arg0[local682] = local501;
								if (arg0[local682] > 255) {
									arg0[local682] = 255;
								}
							}
						}
						local490 = (local41 * super.anInt4252 + local36 * super.anInt4248 + local31 * super.anInt4250 >> 14) + super.anInt4253;
						local555 = (super.anInt4249 * local41 + super.anInt4247 * local31 + super.anInt4257 * local36 >> 14) + super.anInt4258;
						arg4[local682] = local490 * super.aClass9_Sub1_6.anInt1817 / super.anInt4255 + arg1.anInt7597;
						arg6[local682] = super.aClass9_Sub1_6.anInt1827 * local555 / super.anInt4255 + arg1.anInt7599;
					}
				}
				if (local1611.aShortArray79 == null) {
					for (local682 = 0; local682 < local1611.aShort69; local682++) {
						local501 = local682 * 3;
						local587 = local501 + 1;
						local630 = local587 + 1;
						local693 = arg4[local501];
						local458 = arg4[local587];
						local522 = arg4[local630];
						local575 = arg6[local501];
						local650 = arg6[local587];
						local479 = arg6[local630];
						local544 = arg0[local501] + arg0[local587] + arg0[local630];
						if (-((local522 - local458) * (local575 + -local650)) + (local693 - local458) * (local479 + -local650) > 0) {
							arg1.aBoolean561 = local693 < 0 || local458 < 0 || local522 < 0 || local693 > arg1.anInt7600 || arg1.anInt7600 < local458 || arg1.anInt7600 < local522;
							if (local544 >= 765) {
								arg1.method6334(local575, local650, local479, local693, local458, local522, super.aClass9_Sub1_6.anInt1822);
							} else if (local544 <= 0) {
								if ((local1611.anIntArray500[local501] & 0xFFFFFF) != 0) {
									arg1.method6344(local575, local650, local479, local693, local458, local522, local1611.anIntArray500[local501], local1611.anIntArray500[local587], local1611.anIntArray500[local630]);
								}
							} else if ((local1611.anIntArray500[local501] & 0xFFFFFF) != 0) {
								arg1.method6344(local575, local650, local479, local693, local458, local522, Static167.method3388(arg0[local501], local1611.anIntArray500[local501], super.aClass9_Sub1_6.anInt1822), Static167.method3388(arg0[local587], local1611.anIntArray500[local587], super.aClass9_Sub1_6.anInt1822), Static167.method3388(arg0[local630], local1611.anIntArray500[local630], super.aClass9_Sub1_6.anInt1822));
							}
						}
					}
				} else {
					local682 = super.anIntArrayArray30[arg3][arg2];
					local501 = super.anIntArrayArray30[arg3 + 1][arg2];
					local587 = super.anIntArrayArray30[arg3][arg2 + 1];
					local630 = super.anInt9884 * arg3;
					local693 = super.anInt9884 + local630;
					local458 = super.anInt9884 * arg2;
					local522 = super.anInt9884 + local458;
					local575 = super.anInt4253 + (local630 * super.anInt4250 + local682 * super.anInt4248 + local458 * super.anInt4252 >> 14);
					local650 = (local630 * super.anInt4247 + super.anInt4257 * local682 + super.anInt4249 * local458 >> 14) + super.anInt4258;
					local479 = (super.anInt4251 * local458 + local682 * super.anInt4256 + local630 * super.anInt4254 >> 14) + super.anInt4246;
					local544 = super.anInt4253 + (local458 * super.anInt4252 + local693 * super.anInt4250 + local501 * super.anInt4248 >> 14);
					local607 = (super.anInt4247 * local693 + super.anInt4257 * local501 + local458 * super.anInt4249 >> 14) + super.anInt4258;
					local671 = (local458 * super.anInt4251 + super.anInt4256 * local501 + super.anInt4254 * local693 >> 14) + super.anInt4246;
					local121 = (super.anInt4248 * local587 + local630 * super.anInt4250 + local522 * super.anInt4252 >> 14) + super.anInt4253;
					local148 = (local587 * super.anInt4257 + local630 * super.anInt4247 + super.anInt4249 * local522 >> 14) + super.anInt4258;
					local178 = super.anInt4246 + (local522 * super.anInt4251 + super.anInt4254 * local630 + local587 * super.anInt4256 >> 14);
					for (local208 = 0; local208 < local1611.aShort69; local208++) {
						local43 = local208 * 3;
						local45 = local43 + 1;
						local47 = local45 + 1;
						local49 = arg4[local43];
						local236 = arg4[local45];
						local66 = arg4[local47];
						local75 = arg6[local43];
						local86 = arg6[local45];
						local95 = arg6[local47];
						local257 = arg0[local43] + arg0[local45] + arg0[local47];
						if ((local95 - local86) * (-local236 + local49) - (local66 - local236) * (local75 - local86) > 0) {
							arg1.aBoolean561 = local49 < 0 || local236 < 0 || local66 < 0 || local49 > arg1.anInt7600 || arg1.anInt7600 < local236 || local66 > arg1.anInt7600;
							@Pc(2357) short local2357 = local1611.aShortArray79[local208];
							if (local257 < 765) {
								if (local2357 != -1 && this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local2357).aByte104)) {
									arg1.anInt7598 = 100;
								}
								if (local257 > 0) {
									if (local2357 != -1) {
										arg1.method6341(local75, local86, local95, local49, local236, local66, super.aClass9_Sub1_6.anInt1822, arg0[local43], arg0[local45], arg0[local47], local1611.anIntArray500[local43], local1611.anIntArray500[local45], local1611.anIntArray500[local47], local575, local544, local121, local650, local607, local148, local479, local671, local178, local2357);
									} else if ((local1611.anIntArray500[local43] & 0xFFFFFF) != 0) {
										arg1.method6344(local75, local86, local95, local49, local236, local66, Static571.method8046(local1611.anIntArray500[local43], super.aClass9_Sub1_6.anInt1822 | arg0[local43] << 24), Static571.method8046(local1611.anIntArray500[local45], arg0[local45] << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local1611.anIntArray500[local47], super.aClass9_Sub1_6.anInt1822 | arg0[local47] << 24));
									}
								} else if (local2357 != -1) {
									arg1.method6347(local75, local86, local95, local49, local236, local66, local1611.anIntArray500[local43], local1611.anIntArray500[local45], local1611.anIntArray500[local47], local575, local544, local121, local650, local607, local148, local479, local671, local178, local2357);
								} else if ((local1611.anIntArray500[local43] & 0xFFFFFF) != 0) {
									arg1.method6344(local75, local86, local95, local49, local236, local66, local1611.anIntArray500[local43], local1611.anIntArray500[local45], local1611.anIntArray500[local47]);
								}
								arg1.anInt7598 = 0;
							} else {
								arg1.method6334(local75, local86, local95, local49, local236, local66, super.aClass9_Sub1_6.anInt1822);
							}
						}
					}
				}
			}
		} else if ((local12.aByte23 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt9884 * arg3;
			local31 = local25 + super.anInt9884;
			local36 = arg2 * super.anInt9884;
			local41 = super.anInt9884 + local36;
			local43 = 0;
			local45 = 0;
			local47 = 0;
			local49 = 0;
			if ((local12.aByte23 & 0x1) == 0 || arg5) {
				local66 = super.anIntArrayArray30[arg3][arg2];
				local75 = super.anIntArrayArray30[arg3 + 1][arg2];
				local86 = super.anIntArrayArray30[arg3 + 1][arg2 + 1];
				local95 = super.anIntArrayArray30[arg3][arg2 + 1];
				if (super.anInt4255 == -1) {
					local121 = (super.anInt4256 * local66 + super.anInt4254 * local25 + local36 * super.anInt4251 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local121) {
						return;
					}
					local148 = (super.anInt4254 * local31 + local75 * super.anInt4256 + local36 * super.anInt4251 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local148) {
						return;
					}
					local178 = super.anInt4246 + (super.anInt4251 * local41 + local31 * super.anInt4254 + super.anInt4256 * local86 >> 14);
					if (local178 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local208 = (local95 * super.anInt4256 + local25 * super.anInt4254 + super.anInt4251 * local41 >> 14) + super.anInt4246;
					if (local208 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
				} else {
					local208 = super.anInt4255;
					local178 = super.anInt4255;
					local148 = super.anInt4255;
					local121 = super.anInt4255;
				}
				if (arg5) {
					local236 = local121 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local43 = local236;
						local257 = local12.aShort14 * local236 / 255;
						if (local257 > 0) {
							local66 -= local257;
						}
					}
					local236 = local148 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local45 = local236;
						local257 = local236 * local12.aShort13 / 255;
						if (local257 > 0) {
							local75 -= local257;
						}
					}
					local236 = local178 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local47 = local236;
						local257 = local12.aShort17 * local236 / 255;
						if (local257 > 0) {
							local86 -= local257;
						}
					}
					local236 = local208 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local49 = local236;
						local257 = local12.aShort16 * local236 / 255;
						if (local257 > 0) {
							local95 -= local257;
						}
					}
				} else if (super.aClass9_Sub1_6.aBoolean185) {
					local236 = local121 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local43 = local236;
						if (local236 > 255) {
							local43 = 255;
						}
					}
					local236 = local148 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local45 = local236;
						if (local236 > 255) {
							local45 = 255;
						}
					}
					local236 = local178 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local47 = local236;
						if (local236 > 255) {
							local47 = 255;
						}
					}
					local236 = local208 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local49 = local236;
						if (local236 > 255) {
							local49 = 255;
						}
					}
				}
				local458 = super.anInt4253 + (local66 * super.anInt4248 + super.anInt4250 * local25 + super.anInt4252 * local36 >> 14);
				local479 = super.anInt4258 + (super.anInt4257 * local66 + super.anInt4247 * local25 + super.anInt4249 * local36 >> 14);
				local490 = local458 * super.aClass9_Sub1_6.anInt1817 / local121 + arg1.anInt7597;
				local501 = local479 * super.aClass9_Sub1_6.anInt1827 / local121 + arg1.anInt7599;
				local522 = super.anInt4253 + (local31 * super.anInt4250 + local75 * super.anInt4248 + super.anInt4252 * local36 >> 14);
				local544 = super.anInt4258 + (local36 * super.anInt4249 + local31 * super.anInt4247 + local75 * super.anInt4257 >> 14);
				local555 = arg1.anInt7597 + super.aClass9_Sub1_6.anInt1817 * local522 / local148;
				local575 = (local86 * super.anInt4248 + super.anInt4250 * local31 + super.anInt4252 * local41 >> 14) + super.anInt4253;
				local587 = arg1.anInt7599 + local544 * super.aClass9_Sub1_6.anInt1827 / local148;
				local607 = super.anInt4258 + (super.anInt4249 * local41 + super.anInt4247 * local31 + super.anInt4257 * local86 >> 14);
				local619 = arg1.anInt7597 + local575 * super.aClass9_Sub1_6.anInt1817 / local178;
				local630 = arg1.anInt7599 + local607 * super.aClass9_Sub1_6.anInt1827 / local178;
				local650 = (local41 * super.anInt4252 + super.anInt4248 * local95 + super.anInt4250 * local25 >> 14) + super.anInt4253;
				local671 = super.anInt4258 + (super.anInt4257 * local95 + local25 * super.anInt4247 + local41 * super.anInt4249 >> 14);
				local682 = super.aClass9_Sub1_6.anInt1817 * local650 / local208 + arg1.anInt7597;
				local693 = arg1.anInt7599 + local671 * super.aClass9_Sub1_6.anInt1827 / local208;
			} else {
				local66 = super.anIntArrayArray30[arg3][arg2];
				if (super.anInt4255 == -1) {
					local75 = local66 * super.anInt4256;
					local121 = super.anInt4246 + (local36 * super.anInt4251 + local75 + local25 * super.anInt4254 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local121) {
						return;
					}
					local148 = (local36 * super.anInt4251 + local31 * super.anInt4254 + local75 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local148) {
						return;
					}
					local178 = (local41 * super.anInt4251 + local31 * super.anInt4254 + local75 >> 14) + super.anInt4246;
					if (local178 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local208 = super.anInt4246 + (super.anInt4251 * local41 + super.anInt4254 * local25 + local75 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local208) {
						return;
					}
				} else {
					local208 = super.anInt4255;
					local178 = super.anInt4255;
					local148 = super.anInt4255;
					local121 = super.anInt4255;
				}
				if (super.aClass9_Sub1_6.aBoolean185) {
					local236 = local121 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local43 = local236;
						if (local236 > 255) {
							local43 = 255;
						}
					}
					local236 = local148 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local45 = local236;
						if (local236 > 255) {
							local45 = 255;
						}
					}
					local236 = local178 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local47 = local236;
						if (local236 > 255) {
							local47 = 255;
						}
					}
					local236 = local208 - super.aClass9_Sub1_6.anInt1807;
					if (local236 > 0) {
						local49 = local236;
						if (local236 > 255) {
							local49 = 255;
						}
					}
				}
				local75 = local66 * super.anInt4248;
				local458 = super.anInt4253 + (local75 + super.anInt4250 * local25 + local36 * super.anInt4252 >> 14);
				local86 = super.anInt4257 * local66;
				local490 = local458 * super.aClass9_Sub1_6.anInt1817 / local121 + arg1.anInt7597;
				local479 = super.anInt4258 + (local86 + super.anInt4247 * local25 + local36 * super.anInt4249 >> 14);
				local501 = super.aClass9_Sub1_6.anInt1827 * local479 / local121 + arg1.anInt7599;
				local522 = super.anInt4253 + (local36 * super.anInt4252 + super.anInt4250 * local31 + local75 >> 14);
				local555 = local522 * super.aClass9_Sub1_6.anInt1817 / local148 + arg1.anInt7597;
				local544 = (local86 + super.anInt4247 * local31 + local36 * super.anInt4249 >> 14) + super.anInt4258;
				local575 = (local41 * super.anInt4252 + super.anInt4250 * local31 + local75 >> 14) + super.anInt4253;
				local587 = arg1.anInt7599 + super.aClass9_Sub1_6.anInt1827 * local544 / local148;
				local607 = (local41 * super.anInt4249 + local86 + local31 * super.anInt4247 >> 14) + super.anInt4258;
				local619 = local575 * super.aClass9_Sub1_6.anInt1817 / local178 + arg1.anInt7597;
				local630 = super.aClass9_Sub1_6.anInt1827 * local607 / local178 + arg1.anInt7599;
				local650 = (super.anInt4250 * local25 + local75 + local41 * super.anInt4252 >> 14) + super.anInt4253;
				local682 = local650 * super.aClass9_Sub1_6.anInt1817 / local208 + arg1.anInt7597;
				local671 = super.anInt4258 + (super.anInt4249 * local41 + super.anInt4247 * local25 + local86 >> 14);
				local693 = arg1.anInt7599 + super.aClass9_Sub1_6.anInt1827 * local671 / local208;
			}
			@Pc(1175) boolean local1175 = local12.aShort15 != -1 && this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local12.aShort15).aByte104);
			local75 = local45 + local47 + local49;
			if ((local619 - local682) * (local587 + -local693) - (local630 - local693) * (local555 - local682) > 0) {
				arg1.aBoolean561 = local619 < 0 || local682 < 0 || local555 < 0 || arg1.anInt7600 < local619 || local682 > arg1.anInt7600 || local555 > arg1.anInt7600;
				if (local75 < 765) {
					if (local1175) {
						arg1.anInt7598 = 100;
					}
					if (local75 <= 0) {
						if (local12.aShort15 < 0) {
							arg1.method6344(local630, local693, local587, local619, local682, local555, local12.anInt1509, local12.anInt1508, local12.anInt1507);
						} else {
							arg1.method6347(local630, local693, local587, local619, local682, local555, local12.anInt1509, local12.anInt1508, local12.anInt1507, local575, local650, local522, local607, local671, local544, local178, local208, local148, local12.aShort15);
						}
					} else if (local12.aShort15 < 0) {
						arg1.method6344(local630, local693, local587, local619, local682, local555, Static571.method8046(local12.anInt1509, local47 << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local12.anInt1508, super.aClass9_Sub1_6.anInt1822 | local49 << 24), Static571.method8046(local12.anInt1507, super.aClass9_Sub1_6.anInt1822 | local45 << 24));
					} else {
						arg1.method6341(local630, local693, local587, local619, local682, local555, super.aClass9_Sub1_6.anInt1822, local47, local49, local45, local12.anInt1509, local12.anInt1508, local12.anInt1507, local575, local650, local522, local607, local671, local544, local178, local208, local148, local12.aShort15);
					}
					arg1.anInt7598 = 0;
				} else {
					arg1.method6334(local630, local693, local587, local619, local682, local555, super.aClass9_Sub1_6.anInt1822);
				}
			}
			local75 = local43 + local45 + local49;
			if ((local490 - local555) * (local693 - local587) - (local501 - local587) * (-local555 + local682) > 0) {
				arg1.aBoolean561 = local490 < 0 || local555 < 0 || local682 < 0 || local490 > arg1.anInt7600 || arg1.anInt7600 < local555 || arg1.anInt7600 < local682;
				if (local75 < 765) {
					if (local1175) {
						arg1.anInt7598 = 100;
					}
					if (local75 > 0) {
						if (local12.aShort15 < 0) {
							arg1.method6344(local501, local587, local693, local490, local555, local682, Static571.method8046(local12.anInt1510, super.aClass9_Sub1_6.anInt1822 | local43 << 24), Static571.method8046(local12.anInt1507, local45 << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local12.anInt1508, local49 << 24 | super.aClass9_Sub1_6.anInt1822));
						} else {
							arg1.method6341(local501, local587, local693, local490, local555, local682, super.aClass9_Sub1_6.anInt1822, local43, local45, local49, local12.anInt1510, local12.anInt1507, local12.anInt1508, local458, local522, local650, local479, local544, local671, local121, local148, local208, local12.aShort15);
						}
					} else if (local12.aShort15 >= 0) {
						arg1.method6347(local501, local587, local693, local490, local555, local682, local12.anInt1510, local12.anInt1507, local12.anInt1508, local458, local522, local650, local479, local544, local671, local121, local148, local208, local12.aShort15);
					} else {
						arg1.method6344(local501, local587, local693, local490, local555, local682, local12.anInt1510, local12.anInt1507, local12.anInt1508);
					}
					arg1.anInt7598 = 0;
					return;
				}
				arg1.method6334(local501, local587, local693, local490, local555, local682, super.aClass9_Sub1_6.anInt1822);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[II[II[ILclient!qaa;)V")
	private void method3724(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class258 arg5) {
		@Pc(12) Class279 local12 = super.aClass279ArrayArray3[arg0][arg2];
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(218) int local218;
		@Pc(276) int local276;
		@Pc(351) int local351;
		@Pc(391) int local391;
		@Pc(247) int local247;
		@Pc(305) int local305;
		@Pc(363) int local363;
		@Pc(421) int local421;
		@Pc(202) int local202;
		@Pc(264) int local264;
		@Pc(323) int local323;
		@Pc(380) int local380;
		@Pc(236) int local236;
		@Pc(294) int local294;
		@Pc(340) int local340;
		@Pc(409) int local409;
		@Pc(81) int local81;
		@Pc(110) int local110;
		@Pc(134) int local134;
		@Pc(163) int local163;
		@Pc(459) int local459;
		if (local12 == null) {
			@Pc(1115) Class282 local1115 = super.aClass282ArrayArray3[arg0][arg2];
			if (local1115 != null) {
				@Pc(1141) short local1141;
				if (super.anInt4255 == -1) {
					for (local391 = 0; local391 < local1115.aShort120; local391++) {
						local33 = local1115.aShortArray145[local391] + (arg0 << super.anInt9883);
						local1141 = local1115.aShortArray141[local391];
						local43 = local1115.aShortArray148[local391] + (arg2 << super.anInt9883);
						local351 = (local33 * super.anInt4254 + local1141 * super.anInt4256 + local43 * super.anInt4251 >> 14) + super.anInt4246;
						if (local351 <= super.aClass9_Sub1_6.anInt1811) {
							return;
						}
						local218 = super.anInt4253 + (super.anInt4248 * local1141 + local33 * super.anInt4250 + super.anInt4252 * local43 >> 14);
						local276 = (local33 * super.anInt4247 + local1141 * super.anInt4257 + super.anInt4249 * local43 >> 14) + super.anInt4258;
						arg3[local391] = local218 * super.aClass9_Sub1_6.anInt1817 / local351 + arg5.anInt7597;
						arg4[local391] = local276 * super.aClass9_Sub1_6.anInt1827 / local351 + arg5.anInt7599;
					}
				} else {
					for (local391 = 0; local391 < local1115.aShort120; local391++) {
						local33 = local1115.aShortArray145[local391] + (arg0 << super.anInt9883);
						local1141 = local1115.aShortArray141[local391];
						local43 = local1115.aShortArray148[local391] + (arg2 << super.anInt9883);
						local218 = super.anInt4253 + (super.anInt4248 * local1141 + local33 * super.anInt4250 + local43 * super.anInt4252 >> 14);
						local276 = super.anInt4258 + (local43 * super.anInt4249 + local33 * super.anInt4247 + local1141 * super.anInt4257 >> 14);
						arg3[local391] = super.aClass9_Sub1_6.anInt1817 * local218 / super.anInt4255 + arg5.anInt7597;
						arg4[local391] = arg5.anInt7599 + local276 * super.aClass9_Sub1_6.anInt1827 / super.anInt4255;
					}
				}
				if (local1115.aShortArray147 == null) {
					for (local391 = 0; local391 < local1115.aShort121; local391++) {
						@Pc(1377) short local1377 = local1115.aShortArray140[local391];
						@Pc(1382) short local1382 = local1115.aShortArray143[local391];
						@Pc(1387) short local1387 = local1115.aShortArray144[local391];
						local421 = arg3[local1377];
						local202 = arg3[local1382];
						local264 = arg3[local1387];
						local323 = arg4[local1377];
						local380 = arg4[local1382];
						local236 = arg4[local1387];
						if (-((local264 - local202) * (local323 + -local380)) + (local421 - local202) * (local236 - local380) > 0) {
							local294 = local1115.anIntArray703[local391];
							if (local294 != -1) {
								arg5.aBoolean561 = local421 < 0 || local202 < 0 || local264 < 0 || arg5.anInt7600 < local421 || local202 > arg5.anInt7600 || arg5.anInt7600 < local264;
								arg5.method6342(local323, local380, local236, local421, local202, local264, Static499.method7465(local294, local1115.aShortArray142[local1377]), Static499.method7465(local294, local1115.aShortArray142[local1382]), Static499.method7465(local294, local1115.aShortArray142[local1387]));
							}
						}
					}
				} else {
					local391 = super.anIntArrayArray30[arg0][arg2];
					local247 = super.anIntArrayArray30[arg0 + 1][arg2];
					local305 = super.anIntArrayArray30[arg0][arg2 + 1];
					local363 = super.anInt9884 * arg0;
					local421 = local363 + super.anInt9884;
					local202 = super.anInt9884 * arg2;
					local264 = super.anInt9884 + local202;
					local323 = super.anInt4253 + (local202 * super.anInt4252 + local363 * super.anInt4250 + local391 * super.anInt4248 >> 14);
					local380 = (local202 * super.anInt4249 + local391 * super.anInt4257 + local363 * super.anInt4247 >> 14) + super.anInt4258;
					local236 = super.anInt4246 + (local363 * super.anInt4254 + local391 * super.anInt4256 + local202 * super.anInt4251 >> 14);
					local294 = (local202 * super.anInt4252 + super.anInt4250 * local421 + super.anInt4248 * local247 >> 14) + super.anInt4253;
					local340 = (super.anInt4257 * local247 + local421 * super.anInt4247 + super.anInt4249 * local202 >> 14) + super.anInt4258;
					local409 = super.anInt4246 + (local202 * super.anInt4251 + super.anInt4256 * local247 + super.anInt4254 * local421 >> 14);
					local81 = super.anInt4253 + (super.anInt4248 * local305 + local363 * super.anInt4250 + super.anInt4252 * local264 >> 14);
					local110 = super.anInt4258 + (local305 * super.anInt4257 + local363 * super.anInt4247 + local264 * super.anInt4249 >> 14);
					local134 = (local305 * super.anInt4256 + local363 * super.anInt4254 + super.anInt4251 * local264 >> 14) + super.anInt4246;
					for (local163 = 0; local163 < local1115.aShort121; local163++) {
						@Pc(1745) short local1745 = local1115.aShortArray140[local163];
						@Pc(1750) short local1750 = local1115.aShortArray143[local163];
						@Pc(1755) short local1755 = local1115.aShortArray144[local163];
						local459 = arg3[local1745];
						@Pc(1763) int local1763 = arg3[local1750];
						@Pc(1767) int local1767 = arg3[local1755];
						@Pc(1771) int local1771 = arg4[local1745];
						@Pc(1775) int local1775 = arg4[local1750];
						@Pc(1779) int local1779 = arg4[local1755];
						if (-((local1771 - local1775) * (-local1763 + local1767)) + (local459 - local1763) * (-local1775 + local1779) > 0) {
							arg5.aBoolean561 = local459 < 0 || local1763 < 0 || local1767 < 0 || arg5.anInt7600 < local459 || arg5.anInt7600 < local1763 || arg5.anInt7600 < local1767;
							@Pc(1842) short local1842 = local1115.aShortArray147[local163];
							if (local1842 == -1) {
								@Pc(1850) int local1850 = local1115.anIntArray703[local163];
								if (local1850 != -1) {
									arg5.method6342(local1771, local1775, local1779, local459, local1763, local1767, Static499.method7465(local1850, local1115.aShortArray142[local1745]), Static499.method7465(local1850, local1115.aShortArray142[local1750]), Static499.method7465(local1850, local1115.aShortArray142[local1755]));
								}
							} else {
								if (this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local1842).aByte104)) {
									arg5.anInt7598 = 100;
								}
								arg5.method6347(local1771, local1775, local1779, local459, local1763, local1767, local1115.aShortArray142[local1745], local1115.aShortArray142[local1750], local1115.aShortArray142[local1755], local323, local294, local81, local380, local340, local110, local236, local409, local134, local1842);
								arg5.anInt7598 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte99 & 0x2) == 0) {
			@Pc(28) int local28 = super.anInt9884 * arg0;
			local33 = super.anInt9884 + local28;
			@Pc(38) int local38 = arg2 * super.anInt9884;
			local43 = local38 + super.anInt9884;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(207) int local207;
			if ((local12.aByte99 & 0x1) == 0) {
				local55 = super.anIntArrayArray30[arg0][arg2];
				local64 = super.anIntArrayArray30[arg0 + 1][arg2];
				local207 = super.anIntArrayArray30[arg0 + 1][arg2 + 1];
				local459 = super.anIntArrayArray30[arg0][arg2 + 1];
				if (super.anInt4255 == -1) {
					local81 = super.anInt4246 + (super.anInt4254 * local28 + local55 * super.anInt4256 + local38 * super.anInt4251 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local81) {
						return;
					}
					local110 = (local38 * super.anInt4251 + local64 * super.anInt4256 + super.anInt4254 * local33 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local110) {
						return;
					}
					local134 = (super.anInt4254 * local33 + super.anInt4256 * local207 + super.anInt4251 * local43 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local134) {
						return;
					}
					local163 = (local28 * super.anInt4254 + local459 * super.anInt4256 + super.anInt4251 * local43 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local163) {
						return;
					}
				} else {
					local163 = super.anInt4255;
					local134 = super.anInt4255;
					local110 = super.anInt4255;
					local81 = super.anInt4255;
				}
				local202 = super.anInt4253 + (super.anInt4250 * local28 + super.anInt4248 * local55 + local38 * super.anInt4252 >> 14);
				local218 = local202 * super.aClass9_Sub1_6.anInt1817 / local81 + arg5.anInt7597;
				local236 = super.anInt4258 + (local38 * super.anInt4249 + super.anInt4247 * local28 + super.anInt4257 * local55 >> 14);
				local247 = arg5.anInt7599 + local236 * super.aClass9_Sub1_6.anInt1827 / local81;
				local264 = super.anInt4253 + (super.anInt4252 * local38 + super.anInt4248 * local64 + super.anInt4250 * local33 >> 14);
				local294 = super.anInt4258 + (local38 * super.anInt4249 + super.anInt4257 * local64 + local33 * super.anInt4247 >> 14);
				local276 = super.aClass9_Sub1_6.anInt1817 * local264 / local110 + arg5.anInt7597;
				local305 = local294 * super.aClass9_Sub1_6.anInt1827 / local110 + arg5.anInt7599;
				local323 = (local43 * super.anInt4252 + local33 * super.anInt4250 + super.anInt4248 * local207 >> 14) + super.anInt4253;
				local340 = (super.anInt4249 * local43 + super.anInt4257 * local207 + local33 * super.anInt4247 >> 14) + super.anInt4258;
				local351 = arg5.anInt7597 + local323 * super.aClass9_Sub1_6.anInt1817 / local134;
				local363 = super.aClass9_Sub1_6.anInt1827 * local340 / local134 + arg5.anInt7599;
				local380 = (super.anInt4250 * local28 + local459 * super.anInt4248 + local43 * super.anInt4252 >> 14) + super.anInt4253;
				local391 = super.aClass9_Sub1_6.anInt1817 * local380 / local163 + arg5.anInt7597;
				local409 = super.anInt4258 + (super.anInt4257 * local459 + super.anInt4247 * local28 + super.anInt4249 * local43 >> 14);
				local421 = arg5.anInt7599 + local409 * super.aClass9_Sub1_6.anInt1827 / local163;
			} else {
				local55 = super.anIntArrayArray30[arg0][arg2];
				if (super.anInt4255 == -1) {
					local64 = super.anInt4256 * local55;
					local81 = super.anInt4246 + (super.anInt4251 * local38 + local64 + local28 * super.anInt4254 >> 14);
					if (local81 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local110 = super.anInt4246 + (super.anInt4254 * local33 + local64 + super.anInt4251 * local38 >> 14);
					if (local110 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local134 = super.anInt4246 + (local43 * super.anInt4251 + local64 + super.anInt4254 * local33 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local134) {
						return;
					}
					local163 = super.anInt4246 + (local64 + super.anInt4254 * local28 + local43 * super.anInt4251 >> 14);
					if (local163 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
				} else {
					local163 = super.anInt4255;
					local134 = super.anInt4255;
					local110 = super.anInt4255;
					local81 = super.anInt4255;
				}
				local64 = local55 * super.anInt4248;
				local202 = super.anInt4253 + (local28 * super.anInt4250 + local64 + local38 * super.anInt4252 >> 14);
				local207 = super.anInt4257 * local55;
				local218 = arg5.anInt7597 + super.aClass9_Sub1_6.anInt1817 * local202 / local81;
				local236 = super.anInt4258 + (super.anInt4247 * local28 + local207 + local38 * super.anInt4249 >> 14);
				local247 = arg5.anInt7599 + local236 * super.aClass9_Sub1_6.anInt1827 / local81;
				local264 = (super.anInt4252 * local38 + super.anInt4250 * local33 + local64 >> 14) + super.anInt4253;
				local276 = arg5.anInt7597 + local264 * super.aClass9_Sub1_6.anInt1817 / local110;
				local294 = super.anInt4258 + (super.anInt4247 * local33 + local207 + super.anInt4249 * local38 >> 14);
				local305 = local294 * super.aClass9_Sub1_6.anInt1827 / local110 + arg5.anInt7599;
				local323 = super.anInt4253 + (local43 * super.anInt4252 + local64 + super.anInt4250 * local33 >> 14);
				local340 = (local43 * super.anInt4249 + local207 + super.anInt4247 * local33 >> 14) + super.anInt4258;
				local351 = local323 * super.aClass9_Sub1_6.anInt1817 / local134 + arg5.anInt7597;
				local363 = arg5.anInt7599 + super.aClass9_Sub1_6.anInt1827 * local340 / local134;
				local380 = (local43 * super.anInt4252 + local64 + local28 * super.anInt4250 >> 14) + super.anInt4253;
				local391 = super.aClass9_Sub1_6.anInt1817 * local380 / local163 + arg5.anInt7597;
				local409 = (local43 * super.anInt4249 + super.anInt4247 * local28 + local207 >> 14) + super.anInt4258;
				local421 = arg5.anInt7599 + super.aClass9_Sub1_6.anInt1827 * local409 / local163;
			}
			if ((local305 - local421) * (-local391 + local351) - (local276 - local391) * (-local421 + local363) > 0) {
				arg5.aBoolean561 = local351 < 0 || local391 < 0 || local276 < 0 || arg5.anInt7600 < local351 || arg5.anInt7600 < local391 || arg5.anInt7600 < local276;
				if (local12.aShort110 < 0) {
					arg5.method6342(local363, local421, local305, local351, local391, local276, local12.aShort109 & 0xFFFF, local12.aShort111 & 0xFFFF, local12.aShort108 & 0xFFFF);
				} else {
					if (this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local12.aShort110).aByte104)) {
						arg5.anInt7598 = 100;
					}
					arg5.method6347(local363, local421, local305, local351, local391, local276, local12.aShort109 & 0xFFFF, local12.aShort111 & 0xFFFF, local12.aShort108 & 0xFFFF, local202, local264, local380, local236, local294, local409, local81, local110, local163, local12.aShort110);
					arg5.anInt7598 = 0;
				}
			}
			if (-((local247 - local305) * (-local276 + local391)) + (local218 - local276) * (local421 - local305) > 0) {
				arg5.aBoolean561 = local218 < 0 || local276 < 0 || local391 < 0 || local218 > arg5.anInt7600 || arg5.anInt7600 < local276 || arg5.anInt7600 < local391;
				if (local12.aShort110 >= 0) {
					if (this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local12.aShort110).aByte104)) {
						arg5.anInt7598 = 100;
					}
					arg5.method6347(local247, local305, local421, local218, local276, local391, local12.aShort112 & 0xFFFF, local12.aShort108 & 0xFFFF, local12.aShort111 & 0xFFFF, local202, local264, local380, local236, local294, local409, local81, local110, local163, local12.aShort110);
					arg5.anInt7598 = 0;
					return;
				}
				arg5.method6342(local247, local305, local421, local218, local276, local391, local12.aShort112 & 0xFFFF, local12.aShort108 & 0xFFFF, local12.aShort111 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class179_Sub2 local9 = (Class179_Sub2) super.aClass9_Sub1_6.method1653(Thread.currentThread());
		local9.aClass258_2.anInt7598 = 0;
		if (super.aClass53ArrayArray3 != null) {
			this.method3723(local9.anIntArray739, local9.aClass258_2, arg1, arg0, local9.anIntArray733, super.aClass9_Sub1_6.aBoolean183, local9.anIntArray738);
		} else if (super.aClass279ArrayArray3 != null) {
			this.method3724(arg0, local9.anIntArray739, arg1, local9.anIntArray733, local9.anIntArray738, local9.aClass258_2);
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class179_Sub2 local9 = (Class179_Sub2) super.aClass9_Sub1_6.method1653(Thread.currentThread());
		@Pc(12) Class258 local12 = local9.aClass258_2;
		local12.anInt7598 = 0;
		local12.aBoolean561 = false;
		if (super.aClass53ArrayArray3 != null) {
			this.method3722(local9.anIntArray738, arg3, arg4, arg0, local9.anIntArray733, local12, arg2, arg1);
		} else if (super.aClass279ArrayArray3 != null) {
			this.method3726(local12, local9.anIntArray738, arg3, arg2, arg1, local9.anIntArray733, arg0, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!qaa;[IIIIII[III[[Z)V")
	private void method3726(@OriginalArg(1) Class258 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) int arg6, @OriginalArg(11) boolean[][] arg7) {
		@Pc(25) int local25 = (arg2 - arg4) * 1024 / 256;
		arg0.aBoolean558 = false;
		arg0.aBoolean557 = false;
		@Pc(37) int local37 = 0;
		@Pc(41) int local41 = local25;
		for (@Pc(43) int local43 = arg6; local43 < arg3; local43++) {
			for (@Pc(47) int local47 = arg4; local47 < arg2; local47++) {
				if (arg7[local43 - arg6][local47 - arg4]) {
					@Pc(96) int local96;
					if (super.aClass279ArrayArray3[local43][local47] != null) {
						@Pc(75) Class279 local75 = super.aClass279ArrayArray3[local43][local47];
						if (local75.aShort110 != -1 && (local75.aByte99 & 0x2) == 0 && local75.anInt8433 == -1) {
							local96 = super.aClass9_Sub1_6.method1644(local75.aShort110);
							arg0.method6342(local41 - 4, local41 + -4, local41, local37 + 4, local37, local37 + 4, Static499.method7465(local96, local75.aShort109 & 0xFFFF), Static499.method7465(local96, local75.aShort111 & 0xFFFF), Static499.method7465(local96, local75.aShort108 & 0xFFFF));
							arg0.method6342(local41, local41, local41 - 4, local37, local37 + 4, local37, Static499.method7465(local96, local75.aShort112 & 0xFFFF), Static499.method7465(local96, local75.aShort108 & 0xFFFF), Static499.method7465(local96, local75.aShort111 & 0xFFFF));
						} else if (local75.anInt8433 == -1) {
							arg0.method6342(local41 - 4, local41 + -4, local41, local37 + 4, local37, local37 + 4, local75.aShort109 & 0xFFFF, local75.aShort111 & 0xFFFF, local75.aShort108 & 0xFFFF);
							arg0.method6342(local41, local41, local41 - 4, local37, local37 + 4, local37, local75.aShort112 & 0xFFFF, local75.aShort108 & 0xFFFF, local75.aShort111 & 0xFFFF);
						} else {
							local96 = local75.anInt8433;
							arg0.method6342(local41 - 4, local41 + -4, local41, local37 + 4, local37, local37 + 4, local96, local96, local96);
							arg0.method6342(local41, local41, local41 - 4, local37, local37 + 4, local37, local96, local96, local96);
						}
					} else if (super.aClass282ArrayArray3[local43][local47] != null) {
						@Pc(287) Class282 local287 = super.aClass282ArrayArray3[local43][local47];
						for (local96 = 0; local96 < local287.aShort120; local96++) {
							arg5[local96] = local287.aShortArray145[local96] * 4 / super.anInt9884 + local37;
							arg1[local96] = local41 - local287.aShortArray148[local96] * 4 / super.anInt9884;
						}
						for (@Pc(327) int local327 = 0; local327 < local287.aShort121; local327++) {
							@Pc(334) short local334 = local287.aShortArray140[local327];
							@Pc(339) short local339 = local287.aShortArray143[local327];
							@Pc(344) short local344 = local287.aShortArray144[local327];
							@Pc(348) int local348 = arg5[local334];
							@Pc(352) int local352 = arg5[local339];
							@Pc(356) int local356 = arg5[local344];
							@Pc(360) int local360 = arg1[local334];
							@Pc(364) int local364 = arg1[local339];
							@Pc(368) int local368 = arg1[local344];
							@Pc(382) int local382;
							if (local287.anIntArray702 != null && local287.anIntArray702[local327] != -1) {
								local382 = local287.anIntArray702[local327];
								arg0.method6342(local360, local364, local368, local348, local352, local356, Static499.method7465(local382, local287.aShortArray142[local334]), Static499.method7465(local382, local287.aShortArray142[local339]), Static499.method7465(local382, local287.aShortArray142[local344]));
							} else if (local287.aShortArray147 == null || local287.aShortArray147[local327] == -1) {
								local382 = local287.anIntArray703[local327];
								arg0.method6342(local360, local364, local368, local348, local352, local356, Static499.method7465(local382, local287.aShortArray142[local334]), Static499.method7465(local382, local287.aShortArray142[local339]), Static499.method7465(local382, local287.aShortArray142[local344]));
							} else {
								local382 = super.aClass9_Sub1_6.method1644(local287.aShortArray147[local327]);
								arg0.method6342(local360, local364, local368, local348, local352, local356, Static499.method7465(local382, local287.aShortArray142[local334]), Static499.method7465(local382, local287.aShortArray142[local339]), Static499.method7465(local382, local287.aShortArray142[local344]));
							}
						}
					}
				}
				local41 -= 4;
			}
			local41 = local25;
			local37 += 4;
		}
		arg0.aBoolean557 = true;
	}
}
