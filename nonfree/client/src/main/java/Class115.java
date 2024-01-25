import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class115 {

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
	private int anInt3482 = 0;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
	private final int[] anIntArray182 = new int[1600];

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "[I")
	private final int[] anIntArray183 = new int[64];

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "[[Lclient!ed;")
	private final Class41_Sub3_Sub1[][] aClass41_Sub3_Sub1ArrayArray4 = new Class41_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "[[Lclient!ed;")
	private final Class41_Sub3_Sub1[][] aClass41_Sub3_Sub1ArrayArray3 = new Class41_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "[I")
	private final int[] anIntArray184 = new int[8191];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!ada;")
	private final Class7 aClass7_14;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!su;")
	private final Interface19 anInterface19_11;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!su;")
	private final Interface19 anInterface19_12;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!mda;")
	private final Interface13 anInterface13_4;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class115(@OriginalArg(0) Class45_Sub2 arg0) {
		this.aClass7_14 = arg0.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_3, Static227.aClass147_5 }), new Class332(Static227.aClass147_2) });
		this.anInterface19_11 = arg0.method5009(true);
		this.anInterface19_12 = arg0.method5009(false);
		this.anInterface19_12.method6255(393168, 12);
		this.anInterface13_4 = arg0.method4945(false);
		this.anInterface13_4.method6435(49146);
		@Pc(98) Buffer local98 = this.anInterface13_4.method6437();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method4901(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			}
			local105.a();
			this.anInterface13_4.method6433();
		}
		@Pc(198) Buffer local198 = this.anInterface19_12.method6252();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method4901(local198);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
				}
			}
			local205.a();
			this.anInterface19_12.method6251();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qw;Lclient!mj;IZ)V")
	public void method3115(@OriginalArg(0) Class283 arg0, @OriginalArg(1) Class45_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aClass11_Sub1_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method3118(arg1, arg2);
		} else {
			this.method3122(arg1);
		}
		@Pc(34) float local34 = arg1.aClass11_Sub1_16.aFloat6;
		@Pc(38) float local38 = arg1.aClass11_Sub1_16.aFloat13;
		@Pc(42) float local42 = arg1.aClass11_Sub1_16.aFloat7;
		@Pc(46) float local46 = arg1.aClass11_Sub1_16.aFloat2;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class41_Sub3 local56 = arg0.aClass206_1.aClass41_Sub3_5;
			@Pc(59) Class41_Sub3 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass41_Sub3_10; local59 != local56; local59 = local59.aClass41_Sub3_10) {
				@Pc(64) Class41_Sub3_Sub1 local64 = (Class41_Sub3_Sub1) local59;
				local91 = (int) (local38 * (float) (local64.anInt6761 >> 12) + (float) (local64.anInt6767 >> 12) * local34 + (float) (local64.anInt6766 >> 12) * local42 + local46);
				if (local91 < local50) {
					local50 = local91;
				}
				if (local52 < local91) {
					local52 = local91;
				}
				this.anIntArray184[local48++] = local91;
			}
			@Pc(122) int local122 = local52 - local50;
			if (local122 + 2 > 1600) {
				local91 = Static565.method7622(local122) + 1 - Static566.anInt9221;
				local122 = (local122 >> local91) + 2;
			} else {
				local91 = 0;
				local122 += 2;
			}
			local59 = local56.aClass41_Sub3_10;
			local48 = 0;
			@Pc(154) int local154 = -2;
			@Pc(156) boolean local156 = true;
			@Pc(158) boolean local158 = true;
			while (local56 != local59) {
				this.anInt3482 = 0;
				for (@Pc(165) int local165 = 0; local165 < local122; local165++) {
					this.anIntArray182[local165] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray183[local178] = 0;
				}
				while (local56 != local59) {
					@Pc(196) Class41_Sub3_Sub1 local196 = (Class41_Sub3_Sub1) local59;
					if (local158) {
						local156 = local196.aBoolean504;
						local158 = false;
						local154 = local196.anInt6764;
					}
					if (local48 > 0 && (local196.anInt6764 != local154 || local196.aBoolean504 != local156)) {
						local158 = true;
						break;
					}
					@Pc(234) int local234 = this.anIntArray184[local48++] - local50 >> local91;
					if (local234 < 1600) {
						if (this.anIntArray182[local234] >= 64) {
							label97: {
								if (this.anIntArray182[local234] == 64) {
									if (this.anInt3482 == 64) {
										break label97;
									}
									this.anIntArray182[local234] += this.anInt3482++ + 1;
								}
								@Pc(287) Class41_Sub3_Sub1[] local287 = this.aClass41_Sub3_Sub1ArrayArray3[this.anIntArray182[local234] - 64 - 1];
								@Pc(297) int local297 = this.anIntArray182[local234] - 1 - 64;
								@Pc(299) int local299 = this.anIntArray183[this.anIntArray182[local234] - 1 - 64];
								this.anIntArray183[local297] = this.anIntArray183[this.anIntArray182[local234] - 1 - 64] + 1;
								local287[local299] = local196;
							}
						} else {
							this.aClass41_Sub3_Sub1ArrayArray4[local234][this.anIntArray182[local234]++] = local196;
						}
					}
					local59 = local59.aClass41_Sub3_10;
				}
				arg1.method4947(false, local154 < 0 ? -1 : local154, false);
				if (local156 && arg1.aFloat134 != Static77.aFloat31) {
					arg1.ra(Static77.aFloat31);
				} else if (arg1.aFloat134 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method3116(local122, arg1);
			}
		} catch (@Pc(368) Exception local368) {
		}
		this.method3124(arg1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!mj;I)V")
	private void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) Class45_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class11_Sub1 local13 = arg1.method4989();
		@Pc(16) float local16 = local13.aFloat3;
		@Pc(19) float local19 = local13.aFloat4;
		@Pc(22) float local22 = local13.aFloat9;
		@Pc(25) float local25 = local13.aFloat8;
		@Pc(28) float local28 = local13.aFloat5;
		@Pc(31) float local31 = local13.aFloat11;
		@Pc(35) float local35 = local25 + local16;
		@Pc(39) float local39 = local19 + local28;
		@Pc(43) float local43 = local22 + local31;
		@Pc(47) float local47 = local16 - local25;
		@Pc(51) float local51 = local19 - local28;
		@Pc(56) float local56 = local22 - local31;
		@Pc(60) float local60 = local25 - local16;
		@Pc(71) float local71 = local28 - local19;
		@Pc(75) float local75 = local31 - local22;
		@Pc(81) Buffer local81 = this.anInterface19_11.method6252();
		if (local81 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg1.method4901(local81);
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class41_Sub3_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(437) float local437;
		@Pc(442) int local442;
		@Pc(382) int local382;
		@Pc(398) Class41_Sub3_Sub1 local398;
		@Pc(401) int local401;
		@Pc(414) byte local414;
		@Pc(419) byte local419;
		@Pc(431) float local431;
		if (Stream.c()) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray182[local95] > 64 ? 64 : this.anIntArray182[local95];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass41_Sub3_Sub1ArrayArray4[local95][local116];
						local128 = local125.anInt6763;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt6767 >> 12;
						local158 = local125.anInt6761 >> 12;
						local164 = local125.anInt6766 >> 12;
						local169 = local125.anInt6765 >> 12;
						local89.a(local152 + local35 * (float) -local169);
						local89.a(local158 + local39 * (float) -local169);
						local89.a(local164 + local43 * (float) -local169);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a((float) local169 * local47 + local152);
						local89.a(local158 + local51 * (float) local169);
						local89.a((float) local169 * local56 + local164);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local35 * (float) local169 + local152);
						local89.a((float) local169 * local39 + local158);
						local89.a((float) local169 * local43 + local164);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a(local152 + local60 * (float) local169);
						local89.a(local71 * (float) local169 + local158);
						local89.a((float) local169 * local75 + local164);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.a(0.0F);
						local89.a(1.0F);
						local7++;
					}
					if (this.anIntArray182[local95] > 64) {
						local382 = this.anIntArray182[local95] - 64 - 1;
						for (local128 = this.anIntArray183[local382] - 1; local128 >= 0; local128--) {
							local398 = this.aClass41_Sub3_Sub1ArrayArray3[local382][local128];
							local401 = local398.anInt6763;
							local141 = (byte) (local401 >> 16);
							local146 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local164 = local398.anInt6767 >> 12;
							local431 = local398.anInt6761 >> 12;
							local437 = local398.anInt6766 >> 12;
							local442 = local398.anInt6765 >> 12;
							local89.a((float) -local442 * local35 + local164);
							local89.a((float) -local442 * local39 + local431);
							local89.a((float) -local442 * local43 + local437);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a((float) local442 * local47 + local164);
							local89.a(local51 * (float) local442 + local431);
							local89.a(local56 * (float) local442 + local437);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a(local164 + local35 * (float) local442);
							local89.a(local431 + local39 * (float) local442);
							local89.a(local437 + local43 * (float) local442);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local60 * (float) local442 + local164);
							local89.a((float) local442 * local71 + local431);
							local89.a((float) local442 * local75 + local437);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.a(0.0F);
							local7++;
							local89.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray182[local95] <= 64 ? this.anIntArray182[local95] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass41_Sub3_Sub1ArrayArray4[local95][local116];
						local128 = local125.anInt6763;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt6767 >> 12;
						local158 = local125.anInt6761 >> 12;
						local164 = local125.anInt6766 >> 12;
						local169 = local125.anInt6765 >> 12;
						local89.b(local35 * (float) -local169 + local152);
						local89.b(local158 + (float) -local169 * local39);
						local89.b(local164 + (float) -local169 * local43);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b(local152 + local47 * (float) local169);
						local89.b(local51 * (float) local169 + local158);
						local89.b(local56 * (float) local169 + local164);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b((float) local169 * local35 + local152);
						local89.b(local158 + local39 * (float) local169);
						local89.b((float) local169 * local43 + local164);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b((float) local169 * local60 + local152);
						local89.b(local71 * (float) local169 + local158);
						local89.b(local75 * (float) local169 + local164);
						if (arg1.anInt5834 == 0) {
							local89.a(local133, local138, local141, local146);
						} else {
							local89.b(local133, local138, local141, local146);
						}
						local89.b(0.0F);
						local89.b(1.0F);
						local7++;
					}
					if (this.anIntArray182[local95] > 64) {
						local382 = this.anIntArray182[local95] - 65;
						for (local128 = this.anIntArray183[local382] - 1; local128 >= 0; local128--) {
							local398 = this.aClass41_Sub3_Sub1ArrayArray3[local382][local128];
							local401 = local398.anInt6763;
							local141 = (byte) (local401 >> 16);
							local146 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local164 = local398.anInt6767 >> 12;
							local431 = local398.anInt6761 >> 12;
							local437 = local398.anInt6766 >> 12;
							local442 = local398.anInt6765 >> 12;
							local89.b(local164 + local35 * (float) -local442);
							local89.b(local39 * (float) -local442 + local431);
							local89.b(local437 + (float) -local442 * local43);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local47 * (float) local442 + local164);
							local89.b((float) local442 * local51 + local431);
							local89.b(local437 + (float) local442 * local56);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b((float) local442 * local35 + local164);
							local89.b(local431 + (float) local442 * local39);
							local89.b((float) local442 * local43 + local437);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local60 * (float) local442 + local164);
							local89.b(local431 + local71 * (float) local442);
							local89.b(local437 + local75 * (float) local442);
							if (arg1.anInt5834 == 0) {
								local89.a(local141, local146, local414, local419);
							} else {
								local89.b(local141, local146, local414, local419);
							}
							local89.b(0.0F);
							local89.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local89.a();
		if (this.anInterface19_11.method6251()) {
			arg1.method4910(this.anInterface19_11, 0);
			arg1.method4910(this.anInterface19_12, 1);
			arg1.method4957(this.aClass7_14);
			arg1.method4967(0, local7 * 2, local7 * 4, Static379.aClass40_9, this.anInterface13_4, 0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public void method3117() {
		this.anInterface19_11.method6436();
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(ILclient!mj;I)V")
	private void method3118(@OriginalArg(1) Class45_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static77.aFloat31 = arg0.aFloat134;
		arg0.method4962((float) arg1);
		arg0.method4938();
		arg0.method4993(false);
		arg0.method4981(false);
		arg0.method4952();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLclient!mj;)V")
	private void method3122(@OriginalArg(1) Class45_Sub2 arg0) {
		Static77.aFloat31 = arg0.aFloat134;
		arg0.method4971();
		arg0.method4993(false);
		arg0.method4981(false);
		arg0.method4952();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!mj;)V")
	public void method3123(@OriginalArg(1) Class45_Sub2 arg0) {
		this.anInterface19_11.method6255(786336, 24);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!mj;B)V")
	private void method3124(@OriginalArg(0) Class45_Sub2 arg0) {
		arg0.method4981(true);
		arg0.method4993(true);
		if (arg0.aFloat134 != Static77.aFloat31) {
			arg0.ra(Static77.aFloat31);
		}
	}
}
