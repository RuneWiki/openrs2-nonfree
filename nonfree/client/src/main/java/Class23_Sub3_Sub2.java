import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class23_Sub3_Sub2 extends Class23_Sub3 {

	@OriginalMember(owner = "client!sb", name = "oc", descriptor = "Lclient!qaa;")
	private Class258 aClass258_1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!uq;[Lclient!sb;)V")
	public Class23_Sub3_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class23_Sub3_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class23_Sub3_Sub2(@OriginalArg(0) Class9_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!uq;Lclient!qda;IIII)V")
	public Class23_Sub3_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class23 method7068(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7083(Thread.currentThread());
		@Pc(11) Class23_Sub3 local11;
		@Pc(8) Class23_Sub3 local8;
		if (arg0 == 1) {
			local8 = super.aClass23_Sub3_47;
			local11 = super.aClass23_Sub3_44;
		} else if (arg0 == 2) {
			local8 = super.aClass23_Sub3_49;
			local11 = super.aClass23_Sub3_43;
		} else if (arg0 == 3) {
			local8 = super.aClass23_Sub3_46;
			local11 = super.aClass23_Sub3_45;
		} else if (arg0 == 4) {
			local8 = super.aClass23_Sub3_48;
			local11 = super.aClass23_Sub3_42;
		} else if (arg0 == 5) {
			local8 = super.aClass23_Sub3_41;
			local11 = super.aClass23_Sub3_50;
		} else {
			local11 = local8 = new Class23_Sub3_Sub2(super.aClass9_Sub1_15);
		}
		return this.method7092(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7105(@OriginalArg(0) Thread arg0) {
		super.method7105(arg0);
		@Pc(8) Class179_Sub2 local8 = (Class179_Sub2) super.aClass9_Sub1_15.method1653(arg0);
		this.aClass258_1 = local8.aClass258_2;
		super.anIntArray680 = local8.anIntArray761;
		super.anIntArray668 = local8.anIntArray758;
		super.anIntArrayArray70 = local8.anIntArrayArray74;
		super.anIntArray679 = local8.anIntArray765;
		super.anIntArrayArray69 = local8.anIntArrayArray75;
		super.anIntArray687 = local8.anIntArray759;
		super.anIntArrayArray68 = local8.anIntArrayArray76;
		super.anIntArray694 = local8.anIntArray764;
		super.anIntArray693 = local8.anIntArray763;
		super.anIntArray669 = local8.anIntArray762;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	private void method7106(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray34[arg0]) {
			this.method7107(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray139[arg0];
		@Pc(18) short local18 = super.aShortArray138[arg0];
		@Pc(23) short local23 = super.aShortArray137[arg0];
		this.aClass258_1.aBoolean561 = super.aBooleanArray33[arg0];
		if (super.aByteArray109 == null) {
			this.aClass258_1.anInt7598 = 0;
		} else {
			this.aClass258_1.anInt7598 = super.aByteArray109[arg0] & 0xFF;
		}
		if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray107[arg0] & 0xFF;
				local165 = super.anIntArray691[local160];
				local170 = super.anIntArray678[local160];
				local175 = super.anIntArray692[local160];
			}
			if (super.anIntArray695[arg0] == -1) {
				this.aClass258_1.method6345(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local165], super.anIntArray666[local170], super.anIntArray666[local175], super.anIntArray684[local165], super.anIntArray684[local170], super.anIntArray684[local175], super.anIntArray672[local165], super.anIntArray672[local170], super.anIntArray672[local175], super.aShortArray135[arg0]);
			} else {
				this.aClass258_1.method6345(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], super.anIntArray690[arg0], super.anIntArray685[arg0], super.anIntArray695[arg0], super.anIntArray666[local165], super.anIntArray666[local170], super.anIntArray666[local175], super.anIntArray684[local165], super.anIntArray684[local170], super.anIntArray684[local175], super.anIntArray672[local165], super.anIntArray672[local170], super.anIntArray672[local175], super.aShortArray135[arg0]);
			}
		} else if (super.anIntArray695[arg0] == -1) {
			this.aClass258_1.method6334(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF]);
		} else {
			this.aClass258_1.method6342(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], super.anIntArray690[arg0] & 0xFFFF, super.anIntArray685[arg0] & 0xFFFF, super.anIntArray695[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	@Override
	protected void method7090(@OriginalArg(0) int arg0) {
		this.aClass258_1.aBoolean557 = (arg0 & 0x1) == 0;
		this.aClass258_1.aBoolean558 = false;
	}

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "()V")
	@Override
	protected void method7103() {
		this.aClass258_1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7088(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12;
		if (arg3 + 2 > 2200) {
			local12 = Static330.method5267(arg3) + 1 - Static485.anInt8462;
			arg3 = (arg3 >> local12) + 2;
		} else {
			local12 = 0;
			arg3 += 2;
		}
		for (@Pc(24) int local24 = 0; local24 < 2200; local24++) {
			super.anIntArray668[local24] = 0;
		}
		@Pc(36) int local36 = 0;
		@Pc(41) int local41;
		if (super.aClass263Array3 != null) {
			local41 = 0;
			while (local41 < super.anInt8452) {
				@Pc(47) Class263 local47 = super.aClass263Array3[local41];
				super.anIntArray670[local47.anInt7782] = local41++;
			}
		}
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(113) int local113;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(143) int local143;
		@Pc(148) int local148;
		@Pc(153) int local153;
		@Pc(193) int local193;
		for (local41 = 0; local41 < super.anInt8453; local41++) {
			if (super.anIntArray695[local41] != -2) {
				@Pc(72) short local72 = super.aShortArray139[local41];
				@Pc(77) short local77 = super.aShortArray138[local41];
				@Pc(82) short local82 = super.aShortArray137[local41];
				local87 = super.anIntArray699[local72];
				local92 = super.anIntArray699[local77];
				local97 = super.anIntArray699[local82];
				@Pc(118) int local118;
				if (arg0 && (local87 == -5000 || local92 == -5000 || local97 == -5000)) {
					local113 = super.anIntArray666[local72];
					local118 = super.anIntArray666[local77];
					local123 = super.anIntArray666[local82];
					local128 = super.anIntArray684[local72];
					local133 = super.anIntArray684[local77];
					local138 = super.anIntArray684[local82];
					local143 = super.anIntArray672[local72];
					local148 = super.anIntArray672[local77];
					local153 = super.anIntArray672[local82];
					@Pc(157) int local157 = local113 - local118;
					@Pc(161) int local161 = local123 - local118;
					@Pc(165) int local165 = local128 - local133;
					@Pc(169) int local169 = local138 - local133;
					@Pc(173) int local173 = local143 - local148;
					@Pc(177) int local177 = local153 - local148;
					@Pc(185) int local185 = local165 * local177 - local173 * local169;
					local193 = local173 * local161 - local157 * local177;
					@Pc(201) int local201 = local157 * local169 - local165 * local161;
					if (local118 * local185 + local133 * local193 + local148 * local201 > 0) {
						super.aBooleanArray34[local41] = true;
						@Pc(237) int local237 = (super.anIntArray680[local72] + super.anIntArray680[local77] + super.anIntArray680[local82]) / 3 >> local12;
						if (super.anIntArray668[local237] < 64) {
							super.anIntArrayArray70[local237][super.anIntArray668[local237]++] = local41;
						} else {
							@Pc(264) int local264 = super.anIntArray668[local237];
							if (local264 == 64) {
								if (local36 == 512) {
									continue;
								}
								super.anIntArray679[local36] = 0;
								super.anIntArray668[local237] = local264 = local36++ + 65;
							}
							local264 -= 65;
							super.anIntArrayArray69[local264][super.anIntArray679[local264]++] = local41;
						}
					}
				} else if (super.anIntArray670[local41] != -1 || (local87 - local92) * (super.anIntArray686[local82] - super.anIntArray686[local77]) - (super.anIntArray686[local72] - super.anIntArray686[local77]) * (local97 - local92) > 0) {
					super.aBooleanArray34[local41] = false;
					if (local87 >= 0 && local92 >= 0 && local97 >= 0 && local87 <= super.aClass179_6.anInt8694 && local92 <= super.aClass179_6.anInt8694 && local97 <= super.aClass179_6.anInt8694) {
						super.aBooleanArray33[local41] = false;
					} else {
						super.aBooleanArray33[local41] = true;
					}
					local113 = (super.anIntArray680[local72] + super.anIntArray680[local77] + super.anIntArray680[local82]) / 3 >> local12;
					if (super.anIntArray668[local113] < 64) {
						super.anIntArrayArray70[local113][super.anIntArray668[local113]++] = local41;
					} else {
						local118 = super.anIntArray668[local113];
						if (local118 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray679[local36] = 0;
							super.anIntArray668[local113] = local118 = local36++ + 65;
						}
						local118 -= 65;
						super.anIntArrayArray69[local118][super.anIntArray679[local118]++] = local41;
					}
				}
			}
		}
		@Pc(467) int local467;
		@Pc(477) int local477;
		@Pc(513) int local513;
		if (arg4) {
			for (local467 = 0; local467 < arg5; local467++) {
				local477 = super.anIntArray676[local467] - arg2 >> local12;
				if (local477 >= 0 && local477 < 2200) {
					if (super.anIntArray668[local477] < 64) {
						super.anIntArrayArray70[local477][super.anIntArray668[local477]++] = local467 + 1 << 16;
					} else {
						local513 = super.anIntArray668[local477];
						if (local513 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray679[local36] = 0;
							super.anIntArray668[local477] = local513 = local36++ + 65;
						}
						local513 -= 65;
						super.anIntArrayArray69[local513][super.anIntArray679[local513]++] = local467 + 1 << 16;
					}
				}
			}
		}
		if (super.aByteArray108 == null) {
			@Pc(593) int[] local593;
			if (!arg4 && super.aClass263Array3 == null) {
				if (arg1) {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray668[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray70[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method7109(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray668[local467] - 64 - 1;
							local593 = super.anIntArrayArray69[local513];
							for (local92 = 0; local92 < super.anIntArray679[local513]; local92++) {
								this.method7109(local593[local92]);
							}
						}
					}
				} else {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray668[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray70[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method7106(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray668[local467] - 64 - 1;
							local593 = super.anIntArrayArray69[local513];
							for (local92 = 0; local92 < super.anIntArray679[local513]; local92++) {
								this.method7106(local593[local92]);
							}
						}
					}
				}
			} else if (arg1) {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray668[local467];
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray70[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray670[local97];
								if (local113 == -1 || !super.aClass263Array3[local113].aBoolean571) {
									this.method7109(local97);
								}
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray668[local467] - 64 - 1;
						local593 = super.anIntArrayArray69[local513];
						for (local92 = 0; local92 < super.anIntArray679[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray670[local97];
								if (local113 == -1 || !super.aClass263Array3[local113].aBoolean571) {
									this.method7109(local97);
								}
							}
						}
					}
				}
			} else {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray668[local467];
					@Pc(726) Class263 local726;
					@Pc(780) Class5_Sub1_Sub1 local780;
					@Pc(731) Class329 local731;
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray70[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray670[local97];
								if (local113 == -1) {
									this.method7106(local593[local92]);
								} else {
									local726 = super.aClass263Array3[local113];
									local731 = super.aClass329Array3[local113];
									if (!local726.aBoolean571) {
										this.method7106(local97);
									}
									super.aClass9_Sub1_15.method1648(local731.anInt9268, local731.anInt9271, local731.anInt9281, local731.anInt9272, local731.anInt9270, local731.anInt9280, local726.aShort82 & 0xFFFF, local731.anInt9276, local726.aByte93, local726.aByte94);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass5_Sub1_Sub1Array5[local113];
								local123 = super.anIntArray676[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass9_Sub1_15.method1645(local780, super.lb[local113], super.anIntArray689[local113], local123, (local780.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local123);
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray668[local467] - 64 - 1;
						local593 = super.anIntArrayArray69[local513];
						for (local92 = 0; local92 < super.anIntArray679[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray670[local97];
								if (local113 == -1) {
									this.method7106(local593[local92]);
								} else {
									local726 = super.aClass263Array3[local113];
									local731 = super.aClass329Array3[local113];
									if (!local726.aBoolean571) {
										this.method7106(local97);
									}
									super.aClass9_Sub1_15.method1648(local731.anInt9268, local731.anInt9271, local731.anInt9281, local731.anInt9272, local731.anInt9270, local731.anInt9280, local726.aShort82 & 0xFFFF, local731.anInt9276, local726.aByte93, local726.aByte94);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass5_Sub1_Sub1Array5[local113];
								local123 = super.anIntArray676[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass9_Sub1_15.method1645(local780, super.lb[local113], super.anIntArray689[local113], local123, (local780.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local123);
							}
						}
					}
				}
			}
			return;
		}
		for (local467 = 0; local467 < 12; local467++) {
			super.anIntArray687[local467] = 0;
			super.anIntArray669[local467] = 0;
		}
		@Pc(1143) int[] local1143;
		@Pc(1158) byte local1158;
		if (arg4) {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray668[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray70[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray108[local113];
							local123 = super.anIntArray687[local1158]++;
							super.anIntArrayArray68[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray669[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray694[local123] = local477;
							} else {
								super.anIntArray693[local123] = local477;
							}
						} else {
							local1158 = super.aClass5_Sub1_Sub1Array5[(local113 >> 16) - 1].aByte55;
							local123 = super.anIntArray687[local1158]++;
							super.anIntArrayArray68[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray669[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray694[local123] = local477;
							} else {
								super.anIntArray693[local123] = local477;
							}
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray668[local477] - 64 - 1;
					local1143 = super.anIntArrayArray69[local87];
					for (local97 = 0; local97 < super.anIntArray679[local87]; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray108[local113];
							local123 = super.anIntArray687[local1158]++;
							super.anIntArrayArray68[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray669[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray694[local123] = local477;
							} else {
								super.anIntArray693[local123] = local477;
							}
						} else {
							local1158 = super.aClass5_Sub1_Sub1Array5[(local113 >> 16) - 1].aByte55;
							local123 = super.anIntArray687[local1158]++;
							super.anIntArrayArray68[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray669[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray694[local123] = local477;
							} else {
								super.anIntArray693[local123] = local477;
							}
						}
					}
				}
			}
		} else {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray668[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray70[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray108[local113];
						local123 = super.anIntArray687[local1158]++;
						super.anIntArrayArray68[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray669[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray694[local123] = local477;
						} else {
							super.anIntArray693[local123] = local477;
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray668[local477] - 64 - 1;
					local1143 = super.anIntArrayArray69[local87];
					for (local97 = 0; local97 < super.anIntArray679[local87]; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray108[local113];
						local123 = super.anIntArray687[local1158]++;
						super.anIntArrayArray68[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray669[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray694[local123] = local477;
						} else {
							super.anIntArray693[local123] = local477;
						}
					}
				}
			}
		}
		local477 = 0;
		if (super.anIntArray687[1] > 0 || super.anIntArray687[2] > 0) {
			local477 = (super.anIntArray669[1] + super.anIntArray669[2]) / (super.anIntArray687[1] + super.anIntArray687[2]);
		}
		local513 = 0;
		if (super.anIntArray687[3] > 0 || super.anIntArray687[4] > 0) {
			local513 = (super.anIntArray669[3] + super.anIntArray669[4]) / (super.anIntArray687[3] + super.anIntArray687[4]);
		}
		local87 = 0;
		if (super.anIntArray687[6] > 0 || super.anIntArray687[8] > 0) {
			local87 = (super.anIntArray669[6] + super.anIntArray669[8]) / (super.anIntArray687[6] + super.anIntArray687[8]);
		}
		local97 = 0;
		local113 = super.anIntArray687[10];
		@Pc(1673) int[] local1673 = super.anIntArrayArray68[10];
		@Pc(1676) int[] local1676 = super.anIntArray694;
		if (local113 == 0) {
			local97 = 0;
			local113 = super.anIntArray687[11];
			local1673 = super.anIntArrayArray68[11];
			local1676 = super.anIntArray693;
		}
		if (local113 > 0) {
			local92 = local1676[0];
		} else {
			local92 = -1000;
		}
		@Pc(1928) Class263 local1928;
		@Pc(1980) Class5_Sub1_Sub1 local1980;
		@Pc(1933) Class329 local1933;
		for (local128 = 0; local128 < 10; local128++) {
			if (arg1) {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray670[local133];
						if (local138 == -1 || !super.aClass263Array3[local138].aBoolean571) {
							this.method7109(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local113 = super.anIntArray687[11];
						local1673 = super.anIntArrayArray68[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray670[local133];
						if (local138 == -1 || !super.aClass263Array3[local138].aBoolean571) {
							this.method7109(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local113 = super.anIntArray687[11];
						local1673 = super.anIntArrayArray68[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray670[local133];
						if (local138 == -1 || !super.aClass263Array3[local138].aBoolean571) {
							this.method7109(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local113 = super.anIntArray687[11];
						local1673 = super.anIntArrayArray68[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray670[local133];
						if (local138 == -1) {
							this.method7106(local133);
						} else {
							local1928 = super.aClass263Array3[local138];
							local1933 = super.aClass329Array3[local138];
							if (!local1928.aBoolean571) {
								this.method7106(local133);
							}
							super.aClass9_Sub1_15.method1648(local1933.anInt9268, local1933.anInt9271, local1933.anInt9281, local1933.anInt9272, local1933.anInt9270, local1933.anInt9280, local1928.aShort82 & 0xFFFF, local1933.anInt9276, local1928.aByte93, local1928.aByte94);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass5_Sub1_Sub1Array5[local138];
						local148 = super.anIntArray676[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass9_Sub1_15.method1645(local1980, super.lb[local138], super.anIntArray689[local138], local148, (local1980.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local113 = super.anIntArray687[11];
						local1673 = super.anIntArrayArray68[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray670[local133];
						if (local138 == -1) {
							this.method7106(local133);
						} else {
							local1928 = super.aClass263Array3[local138];
							local1933 = super.aClass329Array3[local138];
							if (!local1928.aBoolean571) {
								this.method7106(local133);
							}
							super.aClass9_Sub1_15.method1648(local1933.anInt9268, local1933.anInt9271, local1933.anInt9281, local1933.anInt9272, local1933.anInt9270, local1933.anInt9280, local1928.aShort82 & 0xFFFF, local1933.anInt9276, local1928.aByte93, local1928.aByte94);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass5_Sub1_Sub1Array5[local138];
						local148 = super.anIntArray676[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass9_Sub1_15.method1645(local1980, super.lb[local138], super.anIntArray689[local138], local148, (local1980.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local113 = super.anIntArray687[11];
						local1673 = super.anIntArrayArray68[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray670[local133];
						if (local138 == -1) {
							this.method7106(local133);
						} else {
							local1928 = super.aClass263Array3[local138];
							local1933 = super.aClass329Array3[local138];
							if (!local1928.aBoolean571) {
								this.method7106(local133);
							}
							super.aClass9_Sub1_15.method1648(local1933.anInt9268, local1933.anInt9271, local1933.anInt9281, local1933.anInt9272, local1933.anInt9270, local1933.anInt9280, local1928.aShort82 & 0xFFFF, local1933.anInt9276, local1928.aByte93, local1928.aByte94);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass5_Sub1_Sub1Array5[local138];
						local148 = super.anIntArray676[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass9_Sub1_15.method1645(local1980, super.lb[local138], super.anIntArray689[local138], local148, (local1980.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local113 = super.anIntArray687[11];
						local1673 = super.anIntArrayArray68[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
			local133 = super.anIntArray687[local128];
			@Pc(2353) int[] local2353 = super.anIntArrayArray68[local128];
			if (!arg4 && super.aClass263Array3 == null) {
				if (arg1) {
					for (local143 = 0; local143 < local133; local143++) {
						this.method7109(local2353[local143]);
					}
				} else {
					for (local143 = 0; local143 < local133; local143++) {
						this.method7106(local2353[local143]);
					}
				}
			} else if (arg1) {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray670[local148];
						if (local153 == -1 || !super.aClass263Array3[local153].aBoolean571) {
							this.method7109(local148);
						}
					}
				}
			} else {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray670[local148];
						if (local153 == -1) {
							this.method7106(local148);
						} else {
							@Pc(2415) Class263 local2415 = super.aClass263Array3[local153];
							@Pc(2420) Class329 local2420 = super.aClass329Array3[local153];
							if (!local2415.aBoolean571) {
								this.method7106(local148);
							}
							super.aClass9_Sub1_15.method1648(local2420.anInt9268, local2420.anInt9271, local2420.anInt9281, local2420.anInt9272, local2420.anInt9270, local2420.anInt9280, local2415.aShort82 & 0xFFFF, local2420.anInt9276, local2415.aByte93, local2415.aByte94);
						}
					} else {
						local153 = (local148 >> 16) - 1;
						@Pc(2467) Class5_Sub1_Sub1 local2467 = super.aClass5_Sub1_Sub1Array5[local153];
						local193 = super.anIntArray676[local153];
						if (local193 == 0) {
							local193 = 1;
						}
						super.aClass9_Sub1_15.method1645(local2467, super.lb[local153], super.anIntArray689[local153], local193, (local2467.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local193);
					}
				}
			}
		}
		if (!arg4 && super.aClass263Array3 == null) {
			if (arg1) {
				while (local92 != -1000) {
					this.method7109(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray68[11];
						local113 = super.anIntArray687[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local92 != -1000) {
					this.method7106(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray68[11];
						local113 = super.anIntArray687[11];
						local1676 = super.anIntArray693;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
		} else if (arg1) {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray670[local133];
					if (local138 == -1 || !super.aClass263Array3[local138].aBoolean571) {
						this.method7109(local133);
					}
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray68[11];
					local113 = super.anIntArray687[11];
					local1676 = super.anIntArray693;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		} else {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray670[local133];
					if (local138 == -1) {
						this.method7106(local133);
					} else {
						local1928 = super.aClass263Array3[local138];
						local1933 = super.aClass329Array3[local138];
						if (!local1928.aBoolean571) {
							this.method7106(local133);
						}
						super.aClass9_Sub1_15.method1648(local1933.anInt9268, local1933.anInt9271, local1933.anInt9281, local1933.anInt9272, local1933.anInt9270, local1933.anInt9280, local1928.aShort82 & 0xFFFF, local1933.anInt9276, local1928.aByte93, local1928.aByte94);
					}
				} else {
					local138 = (local133 >> 16) - 1;
					local1980 = super.aClass5_Sub1_Sub1Array5[local138];
					local148 = super.anIntArray676[local138];
					if (local148 == 0) {
						local148 = 1;
					}
					super.aClass9_Sub1_15.method1645(local1980, super.lb[local138], super.anIntArray689[local138], local148, (local1980.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local148);
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray68[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray68[11];
					local113 = super.anIntArray687[11];
					local1676 = super.anIntArray693;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	private void method7107(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass9_Sub1_15.anInt1811;
		@Pc(10) short local10 = super.aShortArray139[arg0];
		@Pc(15) short local15 = super.aShortArray138[arg0];
		@Pc(20) short local20 = super.aShortArray137[arg0];
		@Pc(25) int local25 = super.anIntArray672[local10];
		@Pc(30) int local30 = super.anIntArray672[local15];
		@Pc(35) int local35 = super.anIntArray672[local20];
		if (super.aByteArray109 == null) {
			this.aClass258_1.anInt7598 = 0;
		} else {
			this.aClass258_1.anInt7598 = super.aByteArray109[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray675[0] = super.anIntArray699[local10];
			super.anIntArray696[0] = super.anIntArray686[local10];
			local1++;
			super.anIntArray667[0] = super.anIntArray690[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray666[local10];
			local93 = super.anIntArray684[local10];
			local100 = super.anIntArray690[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class23_Sub3.anIntArray701[local35 - local25];
				super.anIntArray675[0] = super.aClass179_6.anInt8695 + (local88 + ((super.anIntArray666[local20] - local88) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[0] = super.aClass179_6.anInt8693 + (local93 + ((super.anIntArray684[local20] - local93) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				local1++;
				super.anIntArray667[0] = local100 + (((super.anIntArray695[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class23_Sub3.anIntArray701[local30 - local25];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local88 + ((super.anIntArray666[local15] - local88) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local93 + ((super.anIntArray684[local15] - local93) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray667[local1++] = local100 + (((super.anIntArray685[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray675[local1] = super.anIntArray699[local15];
			super.anIntArray696[local1] = super.anIntArray686[local15];
			super.anIntArray667[local1++] = super.anIntArray685[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray666[local15];
			local93 = super.anIntArray684[local15];
			local100 = super.anIntArray685[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class23_Sub3.anIntArray701[local25 - local30];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local88 + ((super.anIntArray666[local10] - local88) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local93 + ((super.anIntArray684[local10] - local93) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray667[local1++] = local100 + (((super.anIntArray690[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class23_Sub3.anIntArray701[local35 - local30];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local88 + ((super.anIntArray666[local20] - local88) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local93 + ((super.anIntArray684[local20] - local93) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray667[local1++] = local100 + (((super.anIntArray695[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray675[local1] = super.anIntArray699[local20];
			super.anIntArray696[local1] = super.anIntArray686[local20];
			super.anIntArray667[local1++] = super.anIntArray695[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray666[local20];
			local93 = super.anIntArray684[local20];
			local100 = super.anIntArray695[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class23_Sub3.anIntArray701[local30 - local35];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local88 + ((super.anIntArray666[local15] - local88) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local93 + ((super.anIntArray684[local15] - local93) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray667[local1++] = local100 + (((super.anIntArray685[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class23_Sub3.anIntArray701[local25 - local35];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local88 + ((super.anIntArray666[local10] - local88) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local93 + ((super.anIntArray684[local10] - local93) * local113 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray667[local1++] = local100 + (((super.anIntArray690[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray675[0];
		local93 = super.anIntArray675[1];
		local100 = super.anIntArray675[2];
		local113 = super.anIntArray696[0];
		@Pc(725) int local725 = super.anIntArray696[1];
		@Pc(730) int local730 = super.anIntArray696[2];
		this.aClass258_1.aBoolean561 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass179_6.anInt8694 || local93 > super.aClass179_6.anInt8694 || local100 > super.aClass179_6.anInt8694) {
				this.aClass258_1.aBoolean561 = true;
			}
			if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
				if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray107[arg0] & 0xFF;
					local838 = super.anIntArray691[local833];
					local843 = super.anIntArray678[local833];
					local848 = super.anIntArray692[local833];
				}
				if (super.anIntArray695[arg0] == -1) {
					this.aClass258_1.method6345(local113, local725, local730, local88, local93, local100, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local838], super.anIntArray666[local843], super.anIntArray666[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray672[local838], super.anIntArray672[local843], super.anIntArray672[local848], super.aShortArray135[arg0]);
				} else {
					this.aClass258_1.method6345(local113, local725, local730, local88, local93, local100, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2], super.anIntArray666[local838], super.anIntArray666[local843], super.anIntArray666[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray672[local838], super.anIntArray672[local843], super.anIntArray672[local848], super.aShortArray135[arg0]);
				}
			} else if (super.anIntArray695[arg0] == -1) {
				this.aClass258_1.method6334(local113, local725, local730, local88, local93, local100, Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF]);
			} else {
				this.aClass258_1.method6342(local113, local725, local730, local88, local93, local100, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass179_6.anInt8694 || local93 > super.aClass179_6.anInt8694 || local100 > super.aClass179_6.anInt8694 || super.anIntArray675[3] < 0 || super.anIntArray675[3] > super.aClass179_6.anInt8694) {
			this.aClass258_1.aBoolean561 = true;
		}
		if (super.aShortArray135 == null || super.aShortArray135[arg0] == -1) {
			if (super.anIntArray695[arg0] == -1) {
				local838 = Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF];
				this.aClass258_1.method6334(local113, local725, local730, local88, local93, local100, local838);
				this.aClass258_1.method6334(local113, local730, super.anIntArray696[3], local88, local100, super.anIntArray675[3], local838);
				return;
			}
			this.aClass258_1.method6342(local113, local725, local730, local88, local93, local100, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2]);
			this.aClass258_1.method6342(local113, local730, super.anIntArray696[3], local88, local100, super.anIntArray675[3], super.anIntArray667[0], super.anIntArray667[2], super.anIntArray667[3]);
			return;
		}
		if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray107[arg0] & 0xFF;
			local838 = super.anIntArray691[local833];
			local843 = super.anIntArray678[local833];
			local848 = super.anIntArray692[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray135[arg0];
		if (super.anIntArray695[arg0] == -1) {
			this.aClass258_1.method6345(local113, local725, local730, local88, local93, local100, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local838], super.anIntArray666[local843], super.anIntArray666[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray672[local838], super.anIntArray672[local843], super.anIntArray672[local848], local1168);
			this.aClass258_1.method6345(local113, local730, super.anIntArray696[3], local88, local100, super.anIntArray675[3], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local838], super.anIntArray666[local843], super.anIntArray666[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray672[local838], super.anIntArray672[local843], super.anIntArray672[local848], local1168);
			return;
		}
		this.aClass258_1.method6345(local113, local725, local730, local88, local93, local100, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2], super.anIntArray666[local838], super.anIntArray666[local843], super.anIntArray666[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray672[local838], super.anIntArray672[local843], super.anIntArray672[local848], local1168);
		this.aClass258_1.method6345(local113, local730, super.anIntArray696[3], local88, local100, super.anIntArray675[3], super.anIntArray667[0], super.anIntArray667[2], super.anIntArray667[3], super.anIntArray666[local838], super.anIntArray666[local843], super.anIntArray666[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray672[local838], super.anIntArray672[local843], super.anIntArray672[local848], local1168);
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "()V")
	@Override
	protected void method7089() {
		super.aClass179_6.anInt8694 = this.aClass258_1.anInt7600;
		super.aClass179_6.anInt8695 = this.aClass258_1.anInt7597;
		super.aClass179_6.anInt8693 = this.aClass258_1.anInt7599;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	private void method7109(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(319) int local319;
		if (!super.aClass9_Sub1_15.aBoolean183) {
			local8 = super.aShortArray139[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = super.anIntArray682[local8] - super.aClass9_Sub1_15.anInt1807;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray682[local13] - super.aClass9_Sub1_15.anInt1807;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray682[local18] - super.aClass9_Sub1_15.anInt1807;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7106(arg0);
				} else {
					if (super.aByteArray109 == null) {
						this.aClass258_1.anInt7598 = 0;
					} else {
						this.aClass258_1.anInt7598 = super.aByteArray109[arg0] & 0xFF;
					}
					this.aClass258_1.aBoolean561 = super.aBooleanArray33[arg0];
					if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
						if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray107[arg0] & 0xFF;
							local309 = super.anIntArray691[local304];
							local314 = super.anIntArray678[local304];
							local319 = super.anIntArray692[local304];
						}
						if (super.anIntArray695[arg0] == -1) {
							this.aClass258_1.method6341(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local309], super.anIntArray666[local314], super.anIntArray666[local319], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray684[local319], super.anIntArray672[local309], super.anIntArray672[local314], super.anIntArray672[local319], super.aShortArray135[arg0]);
						} else {
							this.aClass258_1.method6341(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray685[arg0], super.anIntArray695[arg0], super.anIntArray666[local309], super.anIntArray666[local314], super.anIntArray666[local319], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray684[local319], super.anIntArray672[local309], super.anIntArray672[local314], super.anIntArray672[local319], super.aShortArray135[arg0]);
						}
					} else if (super.anIntArray695[arg0] == -1) {
						this.aClass258_1.method6344(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
					} else {
						this.aClass258_1.method6344(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray685[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray695[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
					}
				}
			}
		} else if (!super.aBooleanArray34[arg0]) {
			local8 = super.aShortArray139[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray681[local8] > super.aClass9_Sub1_15.anInt1826) {
				local27 = 255;
			} else if (super.anIntArray681[local8] > super.aClass9_Sub1_15.anInt1810) {
				local27 = (super.aClass9_Sub1_15.anInt1810 - super.anIntArray681[local8]) * 255 / (super.aClass9_Sub1_15.anInt1810 - super.aClass9_Sub1_15.anInt1826);
			}
			if (super.anIntArray681[local13] > super.aClass9_Sub1_15.anInt1826) {
				local46 = 255;
			} else if (super.anIntArray681[local13] > super.aClass9_Sub1_15.anInt1810) {
				local46 = (super.aClass9_Sub1_15.anInt1810 - super.anIntArray681[local13]) * 255 / (super.aClass9_Sub1_15.anInt1810 - super.aClass9_Sub1_15.anInt1826);
			}
			if (super.anIntArray681[local18] > super.aClass9_Sub1_15.anInt1826) {
				local65 = 255;
			} else if (super.anIntArray681[local18] > super.aClass9_Sub1_15.anInt1810) {
				local65 = (super.aClass9_Sub1_15.anInt1810 - super.anIntArray681[local18]) * 255 / (super.aClass9_Sub1_15.anInt1810 - super.aClass9_Sub1_15.anInt1826);
			}
			if (super.aByteArray109 == null) {
				this.aClass258_1.anInt7598 = 0;
			} else {
				this.aClass258_1.anInt7598 = super.aByteArray109[arg0] & 0xFF;
			}
			this.aClass258_1.aBoolean561 = super.aBooleanArray33[arg0];
			if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
				if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray107[arg0] & 0xFF;
					local81 = super.anIntArray691[local319];
					local309 = super.anIntArray678[local319];
					local314 = super.anIntArray692[local319];
				}
				if (super.anIntArray695[arg0] == -1) {
					this.aClass258_1.method6341(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local81], super.anIntArray666[local309], super.anIntArray666[local314], super.anIntArray684[local81], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray672[local81], super.anIntArray672[local309], super.anIntArray672[local314], super.aShortArray135[arg0]);
				} else {
					this.aClass258_1.method6341(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray685[arg0], super.anIntArray695[arg0], super.anIntArray666[local81], super.anIntArray666[local309], super.anIntArray666[local314], super.anIntArray684[local81], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray672[local81], super.anIntArray672[local309], super.anIntArray672[local314], super.aShortArray135[arg0]);
				}
			} else if (super.anIntArray695[arg0] == -1) {
				this.aClass258_1.method6344(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
			} else {
				this.aClass258_1.method6344(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray685[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray695[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
			}
		}
	}
}
