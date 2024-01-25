import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class73_Sub1_Sub3 extends Class73_Sub1 {

	@OriginalMember(owner = "client!on", name = "H", descriptor = "[I")
	public final int[] anIntArray387;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!wk;[III)V")
	public Class73_Sub1_Sub3(@OriginalArg(0) Class31_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray387 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!wk;[IIIII)V")
	public Class73_Sub1_Sub3(@OriginalArg(0) Class31_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg4, arg5);
		this.anIntArray387 = new int[arg4 * arg5];
		@Pc(15) int local15 = arg3 - super.anInt6867;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg5; local19++) {
			for (@Pc(22) int local22 = 0; local22 < arg4; local22++) {
				@Pc(28) int local28 = arg1[arg2++];
				if (local28 >>> 24 == 255) {
					this.anIntArray387[local17++] = (local28 & 0xFFFFFF) == 0 ? -16777215 : local28;
				} else {
					this.anIntArray387[local17++] = 0;
				}
			}
			arg2 += local15;
		}
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!wk;II)V")
	public Class73_Sub1_Sub3(@OriginalArg(0) Class31_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1, arg2);
		this.anIntArray387 = new int[arg1 * arg2];
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method5471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass31_Sub3_8.anIntArray596;
		@Pc(181) int local181;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) int local111;
		if (Static380.anInt6853 == 0) {
			if (Static380.anInt6848 == 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static380.anInt6847;
						local25 = Static380.anInt6850;
						local27 = Static380.anInt6856;
						local29 = Static380.anInt6849;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt6867 << 12) < 0 && local27 - (super.anInt6852 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static380.anInt6847 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static380.anInt6853 * local64;
								local27 += Static380.anInt6848 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local29++;
							}
						}
					}
					local9++;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else if (Static380.anInt6848 < 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static380.anInt6847;
						local25 = Static380.anInt6850;
						local27 = Static380.anInt6856 + Static380.anInt6844;
						local29 = Static380.anInt6849;
						if (local25 >= 0 && local25 - (super.anInt6867 << 12) < 0) {
							@Pc(174) int local174;
							if ((local174 = local27 - (super.anInt6852 << 12)) >= 0) {
								local181 = (Static380.anInt6848 - local174) / Static380.anInt6848;
								local29 += local181;
								local27 += Static380.anInt6848 * local181;
								local23 += local181;
							}
							@Pc(202) int local202;
							if ((local202 = (local27 - Static380.anInt6848) / Static380.anInt6848) > local29) {
								local29 = local202;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static380.anInt6847 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static380.anInt6853 * local64;
								local27 += Static380.anInt6848 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static380.anInt6848;
								local29++;
							}
						}
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static380.anInt6847;
						local25 = Static380.anInt6850;
						local27 = Static380.anInt6856 + Static380.anInt6844;
						local29 = Static380.anInt6849;
						if (local25 >= 0 && local25 - (super.anInt6867 << 12) < 0) {
							if (local27 < 0) {
								local181 = (Static380.anInt6848 - local27 - 1) / Static380.anInt6848;
								local29 += local181;
								local27 += Static380.anInt6848 * local181;
								local23 += local181;
							}
							@Pc(369) int local369;
							if ((local369 = (local27 + 1 - (super.anInt6852 << 12) - Static380.anInt6848) / Static380.anInt6848) > local29) {
								local29 = local369;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static380.anInt6847 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static380.anInt6853 * local64;
								local27 += Static380.anInt6848 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static380.anInt6848;
								local29++;
							}
						}
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6847 += Static380.anInt6840;
				}
			}
		} else if (Static380.anInt6853 < 0) {
			if (Static380.anInt6848 == 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static380.anInt6847;
						local25 = Static380.anInt6850 + Static380.anInt6863;
						local27 = Static380.anInt6856;
						local29 = Static380.anInt6849;
						if (local27 >= 0 && local27 - (super.anInt6852 << 12) < 0) {
							@Pc(510) int local510;
							if ((local510 = local25 - (super.anInt6867 << 12)) >= 0) {
								local181 = (Static380.anInt6853 - local510) / Static380.anInt6853;
								local29 += local181;
								local25 += Static380.anInt6853 * local181;
								local23 += local181;
							}
							@Pc(538) int local538;
							if ((local538 = (local25 - Static380.anInt6853) / Static380.anInt6853) > local29) {
								local29 = local538;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static380.anInt6847 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static380.anInt6853 * local64;
								local27 += Static380.anInt6848 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local25 += Static380.anInt6853;
								local29++;
							}
						}
					}
					local9++;
					Static380.anInt6856 += Static380.anInt6846;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else if (Static380.anInt6848 < 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static380.anInt6847;
						local25 = Static380.anInt6850 + Static380.anInt6863;
						local27 = Static380.anInt6856 + Static380.anInt6844;
						local29 = Static380.anInt6849;
						@Pc(670) int local670;
						if ((local670 = local25 - (super.anInt6867 << 12)) >= 0) {
							local181 = (Static380.anInt6853 - local670) / Static380.anInt6853;
							local29 += local181;
							local25 += Static380.anInt6853 * local181;
							local27 += Static380.anInt6848 * local181;
							local23 += local181;
						}
						@Pc(704) int local704;
						if ((local704 = (local25 - Static380.anInt6853) / Static380.anInt6853) > local29) {
							local29 = local704;
						}
						@Pc(716) int local716;
						if ((local716 = local27 - (super.anInt6852 << 12)) >= 0) {
							local181 = (Static380.anInt6848 - local716) / Static380.anInt6848;
							local29 += local181;
							local25 += Static380.anInt6853 * local181;
							local27 += Static380.anInt6848 * local181;
							local23 += local181;
						}
						@Pc(750) int local750;
						if ((local750 = (local27 - Static380.anInt6848) / Static380.anInt6848) > local29) {
							local29 = local750;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static380.anInt6847 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static380.anInt6853 * local64;
							local27 += Static380.anInt6848 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static380.anInt6853;
							local27 += Static380.anInt6848;
							local29++;
						}
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6856 += Static380.anInt6846;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static380.anInt6847;
						local25 = Static380.anInt6850 + Static380.anInt6863;
						local27 = Static380.anInt6856 + Static380.anInt6844;
						local29 = Static380.anInt6849;
						@Pc(888) int local888;
						if ((local888 = local25 - (super.anInt6867 << 12)) >= 0) {
							local181 = (Static380.anInt6853 - local888) / Static380.anInt6853;
							local29 += local181;
							local25 += Static380.anInt6853 * local181;
							local27 += Static380.anInt6848 * local181;
							local23 += local181;
						}
						@Pc(922) int local922;
						if ((local922 = (local25 - Static380.anInt6853) / Static380.anInt6853) > local29) {
							local29 = local922;
						}
						if (local27 < 0) {
							local181 = (Static380.anInt6848 - local27 - 1) / Static380.anInt6848;
							local29 += local181;
							local25 += Static380.anInt6853 * local181;
							local27 += Static380.anInt6848 * local181;
							local23 += local181;
						}
						@Pc(970) int local970;
						if ((local970 = (local27 + 1 - (super.anInt6852 << 12) - Static380.anInt6848) / Static380.anInt6848) > local29) {
							local29 = local970;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static380.anInt6847 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static380.anInt6853 * local64;
							local27 += Static380.anInt6848 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static380.anInt6853;
							local27 += Static380.anInt6848;
							local29++;
						}
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6856 += Static380.anInt6846;
					Static380.anInt6847 += Static380.anInt6840;
				}
			}
		} else if (Static380.anInt6848 == 0) {
			local9 = Static380.anInt6860;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static380.anInt6847;
					local25 = Static380.anInt6850 + Static380.anInt6863;
					local27 = Static380.anInt6856;
					local29 = Static380.anInt6849;
					if (local27 >= 0 && local27 - (super.anInt6852 << 12) < 0) {
						if (local25 < 0) {
							local181 = (Static380.anInt6853 - local25 - 1) / Static380.anInt6853;
							local29 += local181;
							local25 += Static380.anInt6853 * local181;
							local23 += local181;
						}
						@Pc(1147) int local1147;
						if ((local1147 = (local25 + 1 - (super.anInt6867 << 12) - Static380.anInt6853) / Static380.anInt6853) > local29) {
							local29 = local1147;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static380.anInt6847 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static380.anInt6853 * local64;
							local27 += Static380.anInt6848 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static380.anInt6853;
							local29++;
						}
					}
				}
				local9++;
				Static380.anInt6850 += Static380.anInt6855;
				Static380.anInt6856 += Static380.anInt6846;
				Static380.anInt6847 += Static380.anInt6840;
			}
		} else if (Static380.anInt6848 < 0) {
			local9 = Static380.anInt6860;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static380.anInt6847;
					local25 = Static380.anInt6850 + Static380.anInt6863;
					local27 = Static380.anInt6856 + Static380.anInt6844;
					local29 = Static380.anInt6849;
					if (local25 < 0) {
						local181 = (Static380.anInt6853 - local25 - 1) / Static380.anInt6853;
						local29 += local181;
						local25 += Static380.anInt6853 * local181;
						local27 += Static380.anInt6848 * local181;
						local23 += local181;
					}
					@Pc(1319) int local1319;
					if ((local1319 = (local25 + 1 - (super.anInt6867 << 12) - Static380.anInt6853) / Static380.anInt6853) > local29) {
						local29 = local1319;
					}
					@Pc(1331) int local1331;
					if ((local1331 = local27 - (super.anInt6852 << 12)) >= 0) {
						local181 = (Static380.anInt6848 - local1331) / Static380.anInt6848;
						local29 += local181;
						local25 += Static380.anInt6853 * local181;
						local27 += Static380.anInt6848 * local181;
						local23 += local181;
					}
					@Pc(1365) int local1365;
					if ((local1365 = (local27 - Static380.anInt6848) / Static380.anInt6848) > local29) {
						local29 = local1365;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static380.anInt6847 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static380.anInt6853 * local64;
						local27 += Static380.anInt6848 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static380.anInt6853;
						local27 += Static380.anInt6848;
						local29++;
					}
				}
				local9++;
				Static380.anInt6850 += Static380.anInt6855;
				Static380.anInt6856 += Static380.anInt6846;
				Static380.anInt6847 += Static380.anInt6840;
			}
		} else {
			local9 = Static380.anInt6860;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static380.anInt6847;
					local25 = Static380.anInt6850 + Static380.anInt6863;
					local27 = Static380.anInt6856 + Static380.anInt6844;
					local29 = Static380.anInt6849;
					if (local25 < 0) {
						local181 = (Static380.anInt6853 - local25 - 1) / Static380.anInt6853;
						local29 += local181;
						local25 += Static380.anInt6853 * local181;
						local27 += Static380.anInt6848 * local181;
						local23 += local181;
					}
					@Pc(1539) int local1539;
					if ((local1539 = (local25 + 1 - (super.anInt6867 << 12) - Static380.anInt6853) / Static380.anInt6853) > local29) {
						local29 = local1539;
					}
					if (local27 < 0) {
						local181 = (Static380.anInt6848 - local27 - 1) / Static380.anInt6848;
						local29 += local181;
						local25 += Static380.anInt6853 * local181;
						local27 += Static380.anInt6848 * local181;
						local23 += local181;
					}
					@Pc(1587) int local1587;
					if ((local1587 = (local27 + 1 - (super.anInt6852 << 12) - Static380.anInt6848) / Static380.anInt6848) > local29) {
						local29 = local1587;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static380.anInt6847 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static380.anInt6853 * local64;
						local27 += Static380.anInt6848 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray387[(local27 >> 12) * super.anInt6867 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static380.anInt6853;
						local27 += Static380.anInt6848;
						local29++;
					}
				}
				local9++;
				Static380.anInt6850 += Static380.anInt6855;
				Static380.anInt6856 += Static380.anInt6846;
				Static380.anInt6847 += Static380.anInt6840;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass31_Sub3_8.method8096()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt6865;
		arg1 += super.anInt6851;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass31_Sub3_8.anInt10243;
		@Pc(26) int local26 = super.anInt6867;
		@Pc(29) int local29 = super.anInt6852;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass31_Sub3_8.anInt10234) {
			local52 = super.aClass31_Sub3_8.anInt10234 - arg1;
			local29 -= local52;
			arg1 = super.aClass31_Sub3_8.anInt10234;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass31_Sub3_8.anInt10254) {
			local29 -= arg1 + local29 - super.aClass31_Sub3_8.anInt10254;
		}
		if (arg0 < super.aClass31_Sub3_8.anInt10259) {
			local52 = super.aClass31_Sub3_8.anInt10259 - arg0;
			local26 -= local52;
			arg0 = super.aClass31_Sub3_8.anInt10259;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass31_Sub3_8.anInt10257) {
			local52 = arg0 + local26 - super.aClass31_Sub3_8.anInt10257;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class53_Sub1 local159 = (Class53_Sub1) arg2;
		@Pc(162) int[] local162 = local159.anIntArray58;
		@Pc(165) int[] local165 = local159.anIntArray57;
		@Pc(169) int[] local169 = super.aClass31_Sub3_8.anIntArray596;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt6867;
		}
		@Pc(210) int local210 = arg4 + local162.length < arg1 + local29 ? arg4 + local162.length : arg1 + local29;
		for (@Pc(212) int local212 = local171; local212 < local210; local212++) {
			@Pc(221) int local221 = local162[local212 - arg4] + arg3;
			@Pc(227) int local227 = local165[local212 - arg4];
			@Pc(229) int local229 = local26;
			@Pc(236) int local236;
			if (arg0 > local221) {
				local236 = arg0 - local221;
				if (local236 >= local227) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local227 -= local236;
			} else {
				local236 = local221 - arg0;
				if (local236 >= local26) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local19 += local236;
				local229 = local26 - local236;
				local41 += local236;
			}
			local236 = 0;
			if (local229 < local227) {
				local227 = local229;
			} else {
				local236 = local229 - local227;
			}
			for (@Pc(304) int local304 = -local227; local304 < 0; local304++) {
				@Pc(311) int local311 = this.anIntArray387[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = local311;
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!on", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (super.aClass31_Sub3_8.method8096()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass31_Sub3_8.anInt10243;
			@Pc(29) int local29 = super.anInt6865 + super.anInt6867 + super.anInt6842;
			@Pc(38) int local38 = super.anInt6851 + super.anInt6852 + super.anInt6854;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt6865 > 0) {
				local64 = ((super.anInt6865 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 += local64 * local44 - (super.anInt6865 << 16);
			}
			if (super.anInt6851 > 0) {
				local64 = ((super.anInt6851 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 += local64 * local50 - (super.anInt6851 << 16);
			}
			if (super.anInt6867 < local29) {
				arg2 = ((super.anInt6867 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt6852 < local38) {
				arg3 = ((super.anInt6852 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass31_Sub3_8.anInt10254) {
				arg3 -= arg1 + arg3 - super.aClass31_Sub3_8.anInt10254;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass31_Sub3_8.anInt10234) {
				local180 = super.aClass31_Sub3_8.anInt10234 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass31_Sub3_8.anInt10257) {
				local180 = arg0 + arg2 - super.aClass31_Sub3_8.anInt10257;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass31_Sub3_8.anInt10259) {
				local180 = super.aClass31_Sub3_8.anInt10259 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass31_Sub3_8.anIntArray596;
			@Pc(259) int local259;
			@Pc(262) int local262;
			@Pc(270) int local270;
			@Pc(273) int local273;
			@Pc(330) int local330;
			@Pc(338) int local338;
			@Pc(341) int local341;
			@Pc(351) int local351;
			@Pc(359) int local359;
			@Pc(367) int local367;
			@Pc(375) int local375;
			@Pc(525) int local525;
			if (arg6 != 0) {
				@Pc(837) int local837;
				@Pc(845) int local845;
				@Pc(857) int local857;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt6867;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray387[(local14 >> 16) + local270];
								if (local330 == 0) {
									local64++;
								} else {
									local252[local64++] = local330;
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 0) {
						local259 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							local262 = arg5 >>> 24;
							local270 = 256 - local262;
							for (local273 = -arg3; local273 < 0; local273++) {
								local330 = (local16 >> 16) * super.anInt6867;
								for (local338 = -arg2; local338 < 0; local338++) {
									local341 = this.anIntArray387[(local14 >> 16) + local330];
									if (local341 == 0) {
										local64++;
									} else {
										local351 = local252[local64];
										local252[local64++] = ((local341 & 0xFF00FF) * local262 + (local351 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local341 & 0xFF00) * local262 + (local351 & 0xFF00) * local270 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						} else {
							local262 = arg5 >> 16 & 0xFF;
							local270 = arg5 >> 8 & 0xFF;
							local273 = arg5 & 0xFF;
							local330 = arg5 >>> 24;
							local338 = 256 - local330;
							for (local341 = -arg3; local341 < 0; local341++) {
								local351 = (local16 >> 16) * super.anInt6867;
								for (local359 = -arg2; local359 < 0; local359++) {
									local367 = this.anIntArray387[(local14 >> 16) + local351];
									if (local367 == 0) {
										local64++;
									} else if (local330 == 255) {
										local375 = (local367 & 0xFF0000) * local262 & 0xFF000000;
										local837 = (local367 & 0xFF00) * local270 & 0xFF0000;
										local845 = (local367 & 0xFF) * local273 & 0xFF00;
										local252[local64++] = (local375 | local837 | local845) >>> 8;
									} else {
										local375 = (local367 & 0xFF0000) * local262 & 0xFF000000;
										local837 = (local367 & 0xFF00) * local270 & 0xFF0000;
										local845 = (local367 & 0xFF) * local273 & 0xFF00;
										local367 = (local375 | local837 | local845) >>> 8;
										local857 = local252[local64];
										local252[local64++] = ((local367 & 0xFF00FF) * local330 + (local857 & 0xFF00FF) * local338 & 0xFF00FF00) + ((local367 & 0xFF00) * local330 + (local857 & 0xFF00) * local338 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						}
					} else if (arg4 == 3) {
						local259 = local14;
						local262 = arg5 >>> 24;
						local270 = 256 - local262;
						for (local273 = -arg3; local273 < 0; local273++) {
							local330 = (local16 >> 16) * super.anInt6867;
							for (local338 = -arg2; local338 < 0; local338++) {
								local341 = this.anIntArray387[(local14 >> 16) + local330];
								local351 = local341 + arg5;
								local359 = (local341 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local367 = (local359 & 0x1000100) + (local351 - local359 & 0x10000);
								local367 = local351 - local367 | local367 - (local367 >>> 8);
								if (local341 == 0 && local262 != 255) {
									local341 = local367;
									local367 = local252[local64];
									local367 = ((local341 & 0xFF00FF) * local262 + (local367 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local341 & 0xFF00) * local262 + (local367 & 0xFF00) * local270 & 0xFF0000) >> 8;
								}
								local252[local64++] = local367;
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 2) {
						local259 = arg5 >>> 24;
						local262 = 256 - local259;
						local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
						local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
						local525 = (local270 | local273) >>> 8;
						local330 = local14;
						for (local338 = -arg3; local338 < 0; local338++) {
							local341 = (local16 >> 16) * super.anInt6867;
							for (local351 = -arg2; local351 < 0; local351++) {
								local359 = this.anIntArray387[(local14 >> 16) + local341];
								if (local359 == 0) {
									local64++;
								} else {
									local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
									local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
									local252[local64++] = ((local270 | local273) >>> 8) + local525;
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local330;
							local64 += local152;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt6867;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray387[(local14 >> 16) + local270];
							if (local330 == 0) {
								local64++;
							} else {
								local338 = local252[local64];
								local341 = local330 + local338;
								local351 = (local330 & 0xFF00FF) + (local338 & 0xFF00FF);
								local338 = (local351 & 0x1000100) + (local341 - local351 & 0x10000);
								local252[local64++] = local341 - local338 | local338 - (local338 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 0) {
					local259 = local14;
					local262 = arg5 >> 16 & 0xFF;
					local270 = arg5 >> 8 & 0xFF;
					local273 = arg5 & 0xFF;
					for (local330 = -arg3; local330 < 0; local330++) {
						local338 = (local16 >> 16) * super.anInt6867;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray387[(local14 >> 16) + local338];
							if (local351 == 0) {
								local64++;
							} else {
								local359 = (local351 & 0xFF0000) * local262 & 0xFF000000;
								local367 = (local351 & 0xFF00) * local270 & 0xFF0000;
								local375 = (local351 & 0xFF) * local273 & 0xFF00;
								local351 = (local359 | local367 | local375) >>> 8;
								local837 = local252[local64];
								local845 = local351 + local837;
								local857 = (local351 & 0xFF00FF) + (local837 & 0xFF00FF);
								local837 = (local857 & 0x1000100) + (local845 - local857 & 0x10000);
								local252[local64++] = local845 - local837 | local837 - (local837 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 3) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt6867;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray387[(local14 >> 16) + local270];
							local338 = local330 + arg5;
							local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
							local330 = local338 - local351 | local351 - (local351 >>> 8);
							local351 = local252[local64];
							local338 = local330 + local351;
							local341 = (local330 & 0xFF00FF) + (local351 & 0xFF00FF);
							local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
							local252[local64++] = local338 - local351 | local351 - (local351 >>> 8);
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 2) {
					local259 = arg5 >>> 24;
					local262 = 256 - local259;
					local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
					local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
					local525 = (local270 | local273) >>> 8;
					local330 = local14;
					for (local338 = -arg3; local338 < 0; local338++) {
						local341 = (local16 >> 16) * super.anInt6867;
						for (local351 = -arg2; local351 < 0; local351++) {
							local359 = this.anIntArray387[(local14 >> 16) + local341];
							if (local359 == 0) {
								local64++;
							} else {
								local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
								local359 = ((local270 | local273) >>> 8) + local525;
								local367 = local252[local64];
								local375 = local359 + local367;
								local837 = (local359 & 0xFF00FF) + (local367 & 0xFF00FF);
								@Pc(1668) int local1668 = (local837 & 0x1000100) + (local375 - local837 & 0x10000);
								local252[local64++] = local375 - local1668 | local1668 - (local1668 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local330;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 1) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt6867;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray387[(local14 >> 16) + local270];
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 0) {
				local259 = arg5 >> 16 & 0xFF;
				local262 = arg5 >> 8 & 0xFF;
				local270 = arg5 & 0xFF;
				local273 = local14;
				for (local330 = -arg3; local330 < 0; local330++) {
					local338 = (local16 >> 16) * super.anInt6867;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray387[(local14 >> 16) + local338];
						local359 = (local351 & 0xFF0000) * local259 & 0xFF000000;
						local367 = (local351 & 0xFF00) * local262 & 0xFF0000;
						local375 = (local351 & 0xFF) * local270 & 0xFF00;
						local252[local64++] = (local359 | local367 | local375) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local273;
					local64 += local152;
				}
			} else if (arg4 == 3) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt6867;
					for (local273 = -arg2; local273 < 0; local273++) {
						local330 = this.anIntArray387[(local14 >> 16) + local270];
						local338 = local330 + arg5;
						local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
						local252[local64++] = local338 - local351 | local351 - (local351 >>> 8);
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 2) {
				local259 = arg5 >>> 24;
				local262 = 256 - local259;
				local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
				local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
				local525 = (local270 | local273) >>> 8;
				local330 = local14;
				for (local338 = -arg3; local338 < 0; local338++) {
					local341 = (local16 >> 16) * super.anInt6867;
					for (local351 = -arg2; local351 < 0; local351++) {
						local359 = this.anIntArray387[(local14 >> 16) + local341];
						local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
						local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
						local252[local64++] = ((local270 | local273) >>> 8) + local525;
						local14 += local44;
					}
					local16 += local50;
					local14 = local330;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method5473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(21) int local21 = super.anInt6865 + super.anInt6867 + super.anInt6842;
		@Pc(30) int local30 = super.anInt6851 + super.anInt6852 + super.anInt6854;
		@Pc(36) int local36 = (local21 << 16) / arg3;
		@Pc(42) int local42 = (local30 << 16) / arg4;
		@Pc(56) int local56;
		if (super.anInt6865 > 0) {
			local56 = ((super.anInt6865 << 16) + local36 - 1) / local36;
			arg0 += local56;
			local10 = local56 * local36 - (super.anInt6865 << 16);
		}
		if (super.anInt6851 > 0) {
			local56 = ((super.anInt6851 << 16) + local42 - 1) / local42;
			arg1 += local56;
			local12 = local56 * local42 - (super.anInt6851 << 16);
		}
		if (super.anInt6867 < local21) {
			arg3 = ((super.anInt6867 << 16) + local36 - local10 - 1) / local36;
		}
		if (super.anInt6852 < local30) {
			arg4 = ((super.anInt6852 << 16) + local42 - local12 - 1) / local42;
		}
		local56 = arg0 + arg1 * super.aClass31_Sub3_8.anInt10243;
		@Pc(148) int local148 = super.aClass31_Sub3_8.anInt10243 - arg3;
		if (arg1 + arg4 > super.aClass31_Sub3_8.anInt10254) {
			arg4 -= arg1 + arg4 - super.aClass31_Sub3_8.anInt10254;
		}
		@Pc(176) int local176;
		if (arg1 < super.aClass31_Sub3_8.anInt10234) {
			local176 = super.aClass31_Sub3_8.anInt10234 - arg1;
			arg4 -= local176;
			local56 += local176 * super.aClass31_Sub3_8.anInt10243;
			local12 += local42 * local176;
		}
		if (arg0 + arg3 > super.aClass31_Sub3_8.anInt10257) {
			local176 = arg0 + arg3 - super.aClass31_Sub3_8.anInt10257;
			arg3 -= local176;
			local148 += local176;
		}
		if (arg0 < super.aClass31_Sub3_8.anInt10259) {
			local176 = super.aClass31_Sub3_8.anInt10259 - arg0;
			arg3 -= local176;
			local56 += local176;
			local10 += local36 * local176;
			local148 += local176;
		}
		@Pc(250) int[] local250 = super.aClass31_Sub3_8.anIntArray597;
		@Pc(254) int[] local254 = super.aClass31_Sub3_8.anIntArray596;
		@Pc(261) int local261;
		@Pc(264) int local264;
		@Pc(272) int local272;
		@Pc(275) int local275;
		@Pc(337) int local337;
		@Pc(345) int local345;
		@Pc(348) int local348;
		@Pc(363) int local363;
		@Pc(371) int local371;
		@Pc(379) int local379;
		@Pc(387) int local387;
		@Pc(542) int local542;
		if (arg7 != 0) {
			@Pc(870) int local870;
			@Pc(878) int local878;
			@Pc(890) int local890;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local261 = local10;
					for (local264 = -arg4; local264 < 0; local264++) {
						local272 = (local12 >> 16) * super.anInt6867;
						for (local275 = -arg3; local275 < 0; local275++) {
							if (local8 < local250[local56]) {
								local337 = this.anIntArray387[(local10 >> 16) + local272];
								if (local337 != 0) {
									local254[local56] = local337;
								}
							}
							local10 += local36;
							local56++;
						}
						local12 += local42;
						local10 = local261;
						local56 += local148;
					}
				} else if (arg5 == 0) {
					local261 = local10;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						local264 = arg6 >>> 24;
						local272 = 256 - local264;
						for (local275 = -arg4; local275 < 0; local275++) {
							local337 = (local12 >> 16) * super.anInt6867;
							for (local345 = -arg3; local345 < 0; local345++) {
								if (local8 < local250[local56]) {
									local348 = this.anIntArray387[(local10 >> 16) + local337];
									if (local348 != 0) {
										local363 = local254[local56];
										local254[local56] = ((local348 & 0xFF00FF) * local264 + (local363 & 0xFF00FF) * local272 & 0xFF00FF00) + ((local348 & 0xFF00) * local264 + (local363 & 0xFF00) * local272 & 0xFF0000) >> 8;
									}
								}
								local10 += local36;
								local56++;
							}
							local12 += local42;
							local10 = local261;
							local56 += local148;
						}
					} else {
						local264 = arg6 >> 16 & 0xFF;
						local272 = arg6 >> 8 & 0xFF;
						local275 = arg6 & 0xFF;
						local337 = arg6 >>> 24;
						local345 = 256 - local337;
						for (local348 = -arg4; local348 < 0; local348++) {
							local363 = (local12 >> 16) * super.anInt6867;
							for (local371 = -arg3; local371 < 0; local371++) {
								if (local8 < local250[local56]) {
									local379 = this.anIntArray387[(local10 >> 16) + local363];
									if (local379 != 0) {
										if (local337 == 255) {
											local387 = (local379 & 0xFF0000) * local264 & 0xFF000000;
											local870 = (local379 & 0xFF00) * local272 & 0xFF0000;
											local878 = (local379 & 0xFF) * local275 & 0xFF00;
											local254[local56] = (local387 | local870 | local878) >>> 8;
										} else {
											local387 = (local379 & 0xFF0000) * local264 & 0xFF000000;
											local870 = (local379 & 0xFF00) * local272 & 0xFF0000;
											local878 = (local379 & 0xFF) * local275 & 0xFF00;
											local379 = (local387 | local870 | local878) >>> 8;
											local890 = local254[local56];
											local254[local56] = ((local379 & 0xFF00FF) * local337 + (local890 & 0xFF00FF) * local345 & 0xFF00FF00) + ((local379 & 0xFF00) * local337 + (local890 & 0xFF00) * local345 & 0xFF0000) >> 8;
										}
									}
								}
								local10 += local36;
								local56++;
							}
							local12 += local42;
							local10 = local261;
							local56 += local148;
						}
					}
				} else if (arg5 == 3) {
					local261 = local10;
					local264 = arg6 >>> 24;
					local272 = 256 - local264;
					for (local275 = -arg4; local275 < 0; local275++) {
						local337 = (local12 >> 16) * super.anInt6867;
						for (local345 = -arg3; local345 < 0; local345++) {
							if (local8 < local250[local56]) {
								local348 = this.anIntArray387[(local10 >> 16) + local337];
								local363 = local348 + arg6;
								local371 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local379 = (local371 & 0x1000100) + (local363 - local371 & 0x10000);
								local379 = local363 - local379 | local379 - (local379 >>> 8);
								if (local348 == 0 && local264 != 255) {
									local348 = local379;
									local379 = local254[local56];
									local379 = ((local348 & 0xFF00FF) * local264 + (local379 & 0xFF00FF) * local272 & 0xFF00FF00) + ((local348 & 0xFF00) * local264 + (local379 & 0xFF00) * local272 & 0xFF0000) >> 8;
								}
								local254[local56] = local379;
							}
							local10 += local36;
							local56++;
						}
						local12 += local42;
						local10 = local261;
						local56 += local148;
					}
				} else if (arg5 == 2) {
					local261 = arg6 >>> 24;
					local264 = 256 - local261;
					local272 = (arg6 & 0xFF00FF) * local264 & 0xFF00FF00;
					local275 = (arg6 & 0xFF00) * local264 & 0xFF0000;
					local542 = (local272 | local275) >>> 8;
					local337 = local10;
					for (local345 = -arg4; local345 < 0; local345++) {
						local348 = (local12 >> 16) * super.anInt6867;
						for (local363 = -arg3; local363 < 0; local363++) {
							if (local8 < local250[local56]) {
								local371 = this.anIntArray387[(local10 >> 16) + local348];
								if (local371 != 0) {
									local272 = (local371 & 0xFF00FF) * local261 & 0xFF00FF00;
									local275 = (local371 & 0xFF00) * local261 & 0xFF0000;
									local254[local56] = ((local272 | local275) >>> 8) + local542;
								}
							}
							local10 += local36;
							local56++;
						}
						local12 += local42;
						local10 = local337;
						local56 += local148;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local261 = local10;
				for (local264 = -arg4; local264 < 0; local264++) {
					local272 = (local12 >> 16) * super.anInt6867;
					for (local275 = -arg3; local275 < 0; local275++) {
						if (local8 < local250[local56]) {
							local337 = this.anIntArray387[(local10 >> 16) + local272];
							if (local337 != 0) {
								local345 = local254[local56];
								local348 = local337 + local345;
								local363 = (local337 & 0xFF00FF) + (local345 & 0xFF00FF);
								local345 = (local363 & 0x1000100) + (local348 - local363 & 0x10000);
								local254[local56] = local348 - local345 | local345 - (local345 >>> 8);
							}
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local261;
					local56 += local148;
				}
			} else if (arg5 == 0) {
				local261 = local10;
				local264 = arg6 >> 16 & 0xFF;
				local272 = arg6 >> 8 & 0xFF;
				local275 = arg6 & 0xFF;
				for (local337 = -arg4; local337 < 0; local337++) {
					local345 = (local12 >> 16) * super.anInt6867;
					for (local348 = -arg3; local348 < 0; local348++) {
						if (local8 < local250[local56]) {
							local363 = this.anIntArray387[(local10 >> 16) + local345];
							if (local363 != 0) {
								local371 = (local363 & 0xFF0000) * local264 & 0xFF000000;
								local379 = (local363 & 0xFF00) * local272 & 0xFF0000;
								local387 = (local363 & 0xFF) * local275 & 0xFF00;
								local363 = (local371 | local379 | local387) >>> 8;
								local870 = local254[local56];
								local878 = local363 + local870;
								local890 = (local363 & 0xFF00FF) + (local870 & 0xFF00FF);
								local870 = (local890 & 0x1000100) + (local878 - local890 & 0x10000);
								local254[local56] = local878 - local870 | local870 - (local870 >>> 8);
							}
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local261;
					local56 += local148;
				}
			} else if (arg5 == 3) {
				local261 = local10;
				for (local264 = -arg4; local264 < 0; local264++) {
					local272 = (local12 >> 16) * super.anInt6867;
					for (local275 = -arg3; local275 < 0; local275++) {
						if (local8 < local250[local56]) {
							local337 = this.anIntArray387[(local10 >> 16) + local272];
							local345 = local337 + arg6;
							local348 = (local337 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local363 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
							local337 = local345 - local363 | local363 - (local363 >>> 8);
							local363 = local254[local56];
							local345 = local337 + local363;
							local348 = (local337 & 0xFF00FF) + (local363 & 0xFF00FF);
							local363 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
							local254[local56] = local345 - local363 | local363 - (local363 >>> 8);
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local261;
					local56 += local148;
				}
			} else if (arg5 == 2) {
				local261 = arg6 >>> 24;
				local264 = 256 - local261;
				local272 = (arg6 & 0xFF00FF) * local264 & 0xFF00FF00;
				local275 = (arg6 & 0xFF00) * local264 & 0xFF0000;
				local542 = (local272 | local275) >>> 8;
				local337 = local10;
				for (local345 = -arg4; local345 < 0; local345++) {
					local348 = (local12 >> 16) * super.anInt6867;
					for (local363 = -arg3; local363 < 0; local363++) {
						if (local8 < local250[local56]) {
							local371 = this.anIntArray387[(local10 >> 16) + local348];
							if (local371 != 0) {
								local272 = (local371 & 0xFF00FF) * local261 & 0xFF00FF00;
								local275 = (local371 & 0xFF00) * local261 & 0xFF0000;
								local371 = ((local272 | local275) >>> 8) + local542;
								local379 = local254[local56];
								local387 = local371 + local379;
								local870 = (local371 & 0xFF00FF) + (local379 & 0xFF00FF);
								@Pc(1722) int local1722 = (local870 & 0x1000100) + (local387 - local870 & 0x10000);
								local254[local56] = local387 - local1722 | local1722 - (local1722 >>> 8);
							}
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local337;
					local56 += local148;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local261 = local10;
			for (local264 = -arg4; local264 < 0; local264++) {
				local272 = (local12 >> 16) * super.anInt6867;
				for (local275 = -arg3; local275 < 0; local275++) {
					if (local8 < local250[local56]) {
						local254[local56] = this.anIntArray387[(local10 >> 16) + local272];
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local261;
				local56 += local148;
			}
		} else if (arg5 == 0) {
			local261 = arg6 >> 16 & 0xFF;
			local264 = arg6 >> 8 & 0xFF;
			local272 = arg6 & 0xFF;
			local275 = local10;
			for (local337 = -arg4; local337 < 0; local337++) {
				local345 = (local12 >> 16) * super.anInt6867;
				for (local348 = -arg3; local348 < 0; local348++) {
					if (local8 < local250[local56]) {
						local363 = this.anIntArray387[(local10 >> 16) + local345];
						local371 = (local363 & 0xFF0000) * local261 & 0xFF000000;
						local379 = (local363 & 0xFF00) * local264 & 0xFF0000;
						local387 = (local363 & 0xFF) * local272 & 0xFF00;
						local254[local56] = (local371 | local379 | local387) >>> 8;
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local275;
				local56 += local148;
			}
		} else if (arg5 == 3) {
			local261 = local10;
			for (local264 = -arg4; local264 < 0; local264++) {
				local272 = (local12 >> 16) * super.anInt6867;
				for (local275 = -arg3; local275 < 0; local275++) {
					if (local8 < local250[local56]) {
						local337 = this.anIntArray387[(local10 >> 16) + local272];
						local345 = local337 + arg6;
						local348 = (local337 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local363 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
						local254[local56] = local345 - local363 | local363 - (local363 >>> 8);
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local261;
				local56 += local148;
			}
		} else if (arg5 == 2) {
			local261 = arg6 >>> 24;
			local264 = 256 - local261;
			local272 = (arg6 & 0xFF00FF) * local264 & 0xFF00FF00;
			local275 = (arg6 & 0xFF00) * local264 & 0xFF0000;
			local542 = (local272 | local275) >>> 8;
			local337 = local10;
			for (local345 = -arg4; local345 < 0; local345++) {
				local348 = (local12 >> 16) * super.anInt6867;
				for (local363 = -arg3; local363 < 0; local363++) {
					if (local8 < local250[local56]) {
						local371 = this.anIntArray387[(local10 >> 16) + local348];
						local272 = (local371 & 0xFF00FF) * local261 & 0xFF00FF00;
						local275 = (local371 & 0xFF00) * local261 & 0xFF0000;
						local254[local56] = ((local272 | local275) >>> 8) + local542;
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local337;
				local56 += local148;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!on", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass31_Sub3_8.anIntArray596;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(15) int local15 = (arg1 + local5) * super.anInt6867 + arg0;
			@Pc(25) int local25 = (arg5 + local5) * super.aClass31_Sub3_8.anInt10243 + arg4;
			for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
				this.anIntArray387[local15 + local27] = local3[local25 + local27];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass31_Sub3_8.method8096()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass31_Sub3_8.anInt10243;
		arg0 += super.anInt6865;
		arg1 += super.anInt6851;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt6852;
		@Pc(35) int local35 = super.anInt6867;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass31_Sub3_8.anInt10234) {
			local52 = super.aClass31_Sub3_8.anInt10234 - arg1;
			local32 -= local52;
			arg1 = super.aClass31_Sub3_8.anInt10234;
			local29 += local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass31_Sub3_8.anInt10254) {
			local32 -= arg1 + local32 - super.aClass31_Sub3_8.anInt10254;
		}
		if (arg0 < super.aClass31_Sub3_8.anInt10259) {
			local52 = super.aClass31_Sub3_8.anInt10259 - arg0;
			local35 -= local52;
			arg0 = super.aClass31_Sub3_8.anInt10259;
			local29 += local52;
			local27 += local52;
			local41 += local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass31_Sub3_8.anInt10257) {
			local52 = arg0 + local35 - super.aClass31_Sub3_8.anInt10257;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass31_Sub3_8.anIntArray596;
		@Pc(168) int local168;
		@Pc(175) int local175;
		@Pc(259) int local259;
		@Pc(262) int local262;
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(289) int local289;
		@Pc(297) int local297;
		@Pc(423) int local423;
		if (arg4 != 0) {
			@Pc(739) int local739;
			@Pc(747) int local747;
			@Pc(759) int local759;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local168 = -local32; local168 < 0; local168++) {
						local175 = local27 + local35 - 3;
						while (local27 < local175) {
							local259 = this.anIntArray387[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
							local259 = this.anIntArray387[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
							local259 = this.anIntArray387[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
							local259 = this.anIntArray387[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
						}
						local175 += 3;
						while (local27 < local175) {
							local259 = this.anIntArray387[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
						}
						local27 += local39;
						local29 += local41;
					}
				} else if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local168 = arg3 >>> 24;
						local175 = 256 - local168;
						for (local259 = -local32; local259 < 0; local259++) {
							for (local262 = -local35; local262 < 0; local262++) {
								local266 = this.anIntArray387[local29++];
								if (local266 == 0) {
									local27++;
								} else {
									local273 = local160[local27];
									local160[local27++] = ((local266 & 0xFF00FF) * local168 + (local273 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local266 & 0xFF00) * local168 + (local273 & 0xFF00) * local175 & 0xFF0000) >> 8;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					} else {
						local168 = arg3 >> 16 & 0xFF;
						local175 = arg3 >> 8 & 0xFF;
						local259 = arg3 & 0xFF;
						local262 = arg3 >>> 24;
						local266 = 256 - local262;
						for (local273 = -local32; local273 < 0; local273++) {
							for (local281 = -local35; local281 < 0; local281++) {
								local289 = this.anIntArray387[local29++];
								if (local289 == 0) {
									local27++;
								} else if (local262 == 255) {
									local297 = (local289 & 0xFF0000) * local168 & 0xFF000000;
									local739 = (local289 & 0xFF00) * local175 & 0xFF0000;
									local747 = (local289 & 0xFF) * local259 & 0xFF00;
									local160[local27++] = (local297 | local739 | local747) >>> 8;
								} else {
									local297 = (local289 & 0xFF0000) * local168 & 0xFF000000;
									local739 = (local289 & 0xFF00) * local175 & 0xFF0000;
									local747 = (local289 & 0xFF) * local259 & 0xFF00;
									local289 = (local297 | local739 | local747) >>> 8;
									local759 = local160[local27];
									local160[local27++] = ((local289 & 0xFF00FF) * local262 + (local759 & 0xFF00FF) * local266 & 0xFF00FF00) + ((local289 & 0xFF00) * local262 + (local759 & 0xFF00) * local266 & 0xFF0000) >> 8;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					}
				} else if (arg2 == 3) {
					local168 = arg3 >>> 24;
					local175 = 256 - local168;
					for (local259 = -local32; local259 < 0; local259++) {
						for (local262 = -local35; local262 < 0; local262++) {
							local266 = this.anIntArray387[local29++];
							local273 = local266 + arg3;
							local281 = (local266 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local289 = (local281 & 0x1000100) + (local273 - local281 & 0x10000);
							local289 = local273 - local289 | local289 - (local289 >>> 8);
							if (local266 == 0 && local168 != 255) {
								local266 = local289;
								local289 = local160[local27];
								local289 = ((local266 & 0xFF00FF) * local168 + (local289 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local266 & 0xFF00) * local168 + (local289 & 0xFF00) * local175 & 0xFF0000) >> 8;
							}
							local160[local27++] = local289;
						}
						local27 += local39;
						local29 += local41;
					}
				} else if (arg2 == 2) {
					local168 = arg3 >>> 24;
					local175 = 256 - local168;
					local259 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
					local262 = (arg3 & 0xFF00) * local175 & 0xFF0000;
					local423 = (local259 | local262) >>> 8;
					for (local266 = -local32; local266 < 0; local266++) {
						for (local273 = -local35; local273 < 0; local273++) {
							local281 = this.anIntArray387[local29++];
							if (local281 == 0) {
								local27++;
							} else {
								local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
								local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
								local160[local27++] = ((local259 | local262) >>> 8) + local423;
							}
						}
						local27 += local39;
						local29 += local41;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local259 = this.anIntArray387[local29++];
						if (local259 == 0) {
							local27++;
						} else {
							local262 = local160[local27];
							local266 = local259 + local262;
							local273 = (local259 & 0xFF00FF) + (local262 & 0xFF00FF);
							local262 = (local273 & 0x1000100) + (local266 - local273 & 0x10000);
							local160[local27++] = local266 - local262 | local262 - (local262 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 0) {
				local168 = arg3 >> 16 & 0xFF;
				local175 = arg3 >> 8 & 0xFF;
				local259 = arg3 & 0xFF;
				for (local262 = -local32; local262 < 0; local262++) {
					for (local266 = -local35; local266 < 0; local266++) {
						local273 = this.anIntArray387[local29++];
						if (local273 == 0) {
							local27++;
						} else {
							local281 = (local273 & 0xFF0000) * local168 & 0xFF000000;
							local289 = (local273 & 0xFF00) * local175 & 0xFF0000;
							local297 = (local273 & 0xFF) * local259 & 0xFF00;
							local273 = (local281 | local289 | local297) >>> 8;
							local739 = local160[local27];
							local747 = local273 + local739;
							local759 = (local273 & 0xFF00FF) + (local739 & 0xFF00FF);
							local739 = (local759 & 0x1000100) + (local747 - local759 & 0x10000);
							local160[local27++] = local747 - local739 | local739 - (local739 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 3) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local259 = this.anIntArray387[local29++];
						local262 = local259 + arg3;
						local266 = (local259 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
						local259 = local262 - local273 | local273 - (local273 >>> 8);
						local273 = local160[local27];
						local262 = local259 + local273;
						local266 = (local259 & 0xFF00FF) + (local273 & 0xFF00FF);
						local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
						local160[local27++] = local262 - local273 | local273 - (local273 >>> 8);
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 2) {
				local168 = arg3 >>> 24;
				local175 = 256 - local168;
				local259 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
				local262 = (arg3 & 0xFF00) * local175 & 0xFF0000;
				local423 = (local259 | local262) >>> 8;
				for (local266 = -local32; local266 < 0; local266++) {
					for (local273 = -local35; local273 < 0; local273++) {
						local281 = this.anIntArray387[local29++];
						if (local281 == 0) {
							local27++;
						} else {
							local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
							local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
							local281 = ((local259 | local262) >>> 8) + local423;
							local289 = local160[local27];
							local297 = local281 + local289;
							local739 = (local281 & 0xFF00FF) + (local289 & 0xFF00FF);
							@Pc(1462) int local1462 = (local739 & 0x1000100) + (local297 - local739 & 0x10000);
							local160[local27++] = local297 - local1462 | local1462 - (local1462 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local168 = -local32; local168 < 0; local168++) {
				local175 = local27 + local35 - 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray387[local29++];
					local160[local27++] = this.anIntArray387[local29++];
					local160[local27++] = this.anIntArray387[local29++];
					local160[local27++] = this.anIntArray387[local29++];
				}
				local175 += 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray387[local29++];
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 0) {
			local168 = arg3 >> 16 & 0xFF;
			local175 = arg3 >> 8 & 0xFF;
			local259 = arg3 & 0xFF;
			for (local262 = -local32; local262 < 0; local262++) {
				for (local266 = -local35; local266 < 0; local266++) {
					local273 = this.anIntArray387[local29++];
					local281 = (local273 & 0xFF0000) * local168 & 0xFF000000;
					local289 = (local273 & 0xFF00) * local175 & 0xFF0000;
					local297 = (local273 & 0xFF) * local259 & 0xFF00;
					local160[local27++] = (local281 | local289 | local297) >>> 8;
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 3) {
			for (local168 = -local32; local168 < 0; local168++) {
				for (local175 = -local35; local175 < 0; local175++) {
					local259 = this.anIntArray387[local29++];
					local262 = local259 + arg3;
					local266 = (local259 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
					local160[local27++] = local262 - local273 | local273 - (local273 >>> 8);
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 2) {
			local168 = arg3 >>> 24;
			local175 = 256 - local168;
			local259 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
			local262 = (arg3 & 0xFF00) * local175 & 0xFF0000;
			local423 = (local259 | local262) >>> 8;
			for (local266 = -local32; local266 < 0; local266++) {
				for (local273 = -local35; local273 < 0; local273++) {
					local281 = this.anIntArray387[local29++];
					local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
					local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
					local160[local27++] = ((local259 | local262) >>> 8) + local423;
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)V")
	@Override
	protected void method5470(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass31_Sub3_8.anIntArray596;
		@Pc(852) int local852;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(209) int local209;
		@Pc(234) int local234;
		@Pc(238) int local238;
		@Pc(242) int local242;
		@Pc(314) int local314;
		if (Static380.anInt6853 == 0) {
			if (Static380.anInt6848 == 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local12 = Static380.anInt6847;
					local14 = Static380.anInt6850;
					local16 = Static380.anInt6856;
					local18 = Static380.anInt6849;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt6867 << 12) < 0 && local16 - (super.anInt6852 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
										local234 = Static380.anInt6857 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static380.anInt6859 == 255) {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray387[local48];
								local234 = Static380.anInt6857;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static380.anInt6859 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else if (Static380.anInt6848 < 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local12 = Static380.anInt6847;
					local14 = Static380.anInt6850;
					local16 = Static380.anInt6856 + Static380.anInt6844;
					local18 = Static380.anInt6849;
					if (local14 >= 0 && local14 - (super.anInt6867 << 12) < 0) {
						@Pc(845) int local845;
						if ((local845 = local16 - (super.anInt6852 << 12)) >= 0) {
							local852 = (Static380.anInt6848 - local845) / Static380.anInt6848;
							local18 += local852;
							local16 += Static380.anInt6848 * local852;
							local12 += local852;
						}
						@Pc(873) int local873;
						if ((local873 = (local16 - Static380.anInt6848) / Static380.anInt6848) > local18) {
							local18 = local873;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
										local234 = Static380.anInt6857 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static380.anInt6859 == 255) {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray387[local48];
								local234 = Static380.anInt6857;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static380.anInt6859 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static380.anInt6848;
							local18++;
						}
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local12 = Static380.anInt6847;
					local14 = Static380.anInt6850;
					local16 = Static380.anInt6856 + Static380.anInt6844;
					local18 = Static380.anInt6849;
					if (local14 >= 0 && local14 - (super.anInt6867 << 12) < 0) {
						if (local16 < 0) {
							local852 = (Static380.anInt6848 - local16 - 1) / Static380.anInt6848;
							local18 += local852;
							local16 += Static380.anInt6848 * local852;
							local12 += local852;
						}
						@Pc(1722) int local1722;
						if ((local1722 = (local16 + 1 - (super.anInt6852 << 12) - Static380.anInt6848) / Static380.anInt6848) > local18) {
							local18 = local1722;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
										local234 = Static380.anInt6857 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static380.anInt6859 == 255) {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray387[local48];
								local234 = Static380.anInt6857;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static380.anInt6859 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static380.anInt6848;
							local18++;
						}
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6847 += Static380.anInt6840;
				}
			}
		} else if (Static380.anInt6853 < 0) {
			if (Static380.anInt6848 == 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local12 = Static380.anInt6847;
					local14 = Static380.anInt6850 + Static380.anInt6863;
					local16 = Static380.anInt6856;
					local18 = Static380.anInt6849;
					if (local16 >= 0 && local16 - (super.anInt6852 << 12) < 0) {
						@Pc(2545) int local2545;
						if ((local2545 = local14 - (super.anInt6867 << 12)) >= 0) {
							local852 = (Static380.anInt6853 - local2545) / Static380.anInt6853;
							local18 += local852;
							local14 += Static380.anInt6853 * local852;
							local12 += local852;
						}
						@Pc(2573) int local2573;
						if ((local2573 = (local14 - Static380.anInt6853) / Static380.anInt6853) > local18) {
							local18 = local2573;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
										local234 = Static380.anInt6857 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static380.anInt6859 == 255) {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray387[local48];
								local234 = Static380.anInt6857;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static380.anInt6859 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray387[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static380.anInt6853;
							local18++;
						}
					}
					local9++;
					Static380.anInt6856 += Static380.anInt6846;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else if (Static380.anInt6848 < 0) {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local12 = Static380.anInt6847;
					local14 = Static380.anInt6850 + Static380.anInt6863;
					local16 = Static380.anInt6856 + Static380.anInt6844;
					local18 = Static380.anInt6849;
					@Pc(3387) int local3387;
					if ((local3387 = local14 - (super.anInt6867 << 12)) >= 0) {
						local852 = (Static380.anInt6853 - local3387) / Static380.anInt6853;
						local18 += local852;
						local14 += Static380.anInt6853 * local852;
						local16 += Static380.anInt6848 * local852;
						local12 += local852;
					}
					@Pc(3421) int local3421;
					if ((local3421 = (local14 - Static380.anInt6853) / Static380.anInt6853) > local18) {
						local18 = local3421;
					}
					@Pc(3433) int local3433;
					if ((local3433 = local16 - (super.anInt6852 << 12)) >= 0) {
						local852 = (Static380.anInt6848 - local3433) / Static380.anInt6848;
						local18 += local852;
						local14 += Static380.anInt6853 * local852;
						local16 += Static380.anInt6848 * local852;
						local12 += local852;
					}
					@Pc(3467) int local3467;
					if ((local3467 = (local16 - Static380.anInt6848) / Static380.anInt6848) > local18) {
						local18 = local3467;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
									local234 = Static380.anInt6857 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static380.anInt6859 == 255) {
									local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray387[local48];
							local234 = Static380.anInt6857;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static380.anInt6859 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static380.anInt6853;
						local16 += Static380.anInt6848;
						local18++;
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6856 += Static380.anInt6846;
					Static380.anInt6847 += Static380.anInt6840;
				}
			} else {
				local9 = Static380.anInt6860;
				while (local9 < 0) {
					local12 = Static380.anInt6847;
					local14 = Static380.anInt6850 + Static380.anInt6863;
					local16 = Static380.anInt6856 + Static380.anInt6844;
					local18 = Static380.anInt6849;
					@Pc(4287) int local4287;
					if ((local4287 = local14 - (super.anInt6867 << 12)) >= 0) {
						local852 = (Static380.anInt6853 - local4287) / Static380.anInt6853;
						local18 += local852;
						local14 += Static380.anInt6853 * local852;
						local16 += Static380.anInt6848 * local852;
						local12 += local852;
					}
					@Pc(4321) int local4321;
					if ((local4321 = (local14 - Static380.anInt6853) / Static380.anInt6853) > local18) {
						local18 = local4321;
					}
					if (local16 < 0) {
						local852 = (Static380.anInt6848 - local16 - 1) / Static380.anInt6848;
						local18 += local852;
						local14 += Static380.anInt6853 * local852;
						local16 += Static380.anInt6848 * local852;
						local12 += local852;
					}
					@Pc(4369) int local4369;
					if ((local4369 = (local16 + 1 - (super.anInt6852 << 12) - Static380.anInt6848) / Static380.anInt6848) > local18) {
						local18 = local4369;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
									local234 = Static380.anInt6857 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static380.anInt6859 == 255) {
									local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray387[local48];
							local234 = Static380.anInt6857;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static380.anInt6859 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static380.anInt6853;
						local16 += Static380.anInt6848;
						local18++;
					}
					local9++;
					Static380.anInt6850 += Static380.anInt6855;
					Static380.anInt6856 += Static380.anInt6846;
					Static380.anInt6847 += Static380.anInt6840;
				}
			}
		} else if (Static380.anInt6848 == 0) {
			local9 = Static380.anInt6860;
			while (local9 < 0) {
				local12 = Static380.anInt6847;
				local14 = Static380.anInt6850 + Static380.anInt6863;
				local16 = Static380.anInt6856;
				local18 = Static380.anInt6849;
				if (local16 >= 0 && local16 - (super.anInt6852 << 12) < 0) {
					if (local14 < 0) {
						local852 = (Static380.anInt6853 - local14 - 1) / Static380.anInt6853;
						local18 += local852;
						local14 += Static380.anInt6853 * local852;
						local12 += local852;
					}
					@Pc(5228) int local5228;
					if ((local5228 = (local14 + 1 - (super.anInt6867 << 12) - Static380.anInt6853) / Static380.anInt6853) > local18) {
						local18 = local5228;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
									local234 = Static380.anInt6857 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static380.anInt6859 == 255) {
									local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray387[local48];
							local234 = Static380.anInt6857;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static380.anInt6859 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray387[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static380.anInt6853;
						local18++;
					}
				}
				local9++;
				Static380.anInt6850 += Static380.anInt6855;
				Static380.anInt6856 += Static380.anInt6846;
				Static380.anInt6847 += Static380.anInt6840;
			}
		} else if (Static380.anInt6848 < 0) {
			for (local9 = Static380.anInt6860; local9 < 0; local9++) {
				local12 = Static380.anInt6847;
				local14 = Static380.anInt6850 + Static380.anInt6863;
				local16 = Static380.anInt6856 + Static380.anInt6844;
				local18 = Static380.anInt6849;
				if (local14 < 0) {
					local852 = (Static380.anInt6853 - local14 - 1) / Static380.anInt6853;
					local18 += local852;
					local14 += Static380.anInt6853 * local852;
					local16 += Static380.anInt6848 * local852;
					local12 += local852;
				}
				@Pc(6082) int local6082;
				if ((local6082 = (local14 + 1 - (super.anInt6867 << 12) - Static380.anInt6853) / Static380.anInt6853) > local18) {
					local18 = local6082;
				}
				@Pc(6094) int local6094;
				if ((local6094 = local16 - (super.anInt6852 << 12)) >= 0) {
					local852 = (Static380.anInt6848 - local6094) / Static380.anInt6848;
					local18 += local852;
					local14 += Static380.anInt6853 * local852;
					local16 += Static380.anInt6848 * local852;
					local12 += local852;
				}
				@Pc(6128) int local6128;
				if ((local6128 = (local16 - Static380.anInt6848) / Static380.anInt6848) > local18) {
					local18 = local6128;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray387[local48];
						if (local209 != 0) {
							local3[local51] = local209;
						}
					} else if (arg0 == 0) {
						local209 = this.anIntArray387[local48];
						if (local209 != 0) {
							if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
								local234 = Static380.anInt6857 >>> 24;
								local238 = 256 - local234;
								local242 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
							} else if (Static380.anInt6859 == 255) {
								local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
								local3[local51] = (local234 | local238 | local242) >>> 8;
							} else {
								local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
								local209 = (local234 | local238 | local242) >>> 8;
								local314 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray387[local48];
						local234 = Static380.anInt6857;
						local238 = local209 + local234;
						local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
						local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
						local314 = local238 - local314 | local314 - (local314 >>> 8);
						if (local209 == 0 && Static380.anInt6859 != 255) {
							local209 = local314;
							local314 = local3[local51];
							local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
						}
						local3[local51] = local314;
					} else if (arg0 == 2) {
						local209 = this.anIntArray387[local48];
						if (local209 != 0) {
							local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
							local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
							local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static380.anInt6853;
					local16 += Static380.anInt6848;
					local18++;
				}
				Static380.anInt6850 += Static380.anInt6855;
				Static380.anInt6856 += Static380.anInt6846;
				Static380.anInt6847 += Static380.anInt6840;
			}
		} else {
			for (local9 = Static380.anInt6860; local9 < 0; local9++) {
				local12 = Static380.anInt6847;
				local14 = Static380.anInt6850 + Static380.anInt6863;
				local16 = Static380.anInt6856 + Static380.anInt6844;
				local18 = Static380.anInt6849;
				if (local14 < 0) {
					local852 = (Static380.anInt6853 - local14 - 1) / Static380.anInt6853;
					local18 += local852;
					local14 += Static380.anInt6853 * local852;
					local16 += Static380.anInt6848 * local852;
					local12 += local852;
				}
				@Pc(6984) int local6984;
				if ((local6984 = (local14 + 1 - (super.anInt6867 << 12) - Static380.anInt6853) / Static380.anInt6853) > local18) {
					local18 = local6984;
				}
				if (local16 < 0) {
					local852 = (Static380.anInt6848 - local16 - 1) / Static380.anInt6848;
					local18 += local852;
					local14 += Static380.anInt6853 * local852;
					local16 += Static380.anInt6848 * local852;
					local12 += local852;
				}
				@Pc(7032) int local7032;
				if ((local7032 = (local16 + 1 - (super.anInt6852 << 12) - Static380.anInt6848) / Static380.anInt6848) > local18) {
					local18 = local7032;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt6867 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray387[local48];
						if (local209 != 0) {
							local3[local51] = local209;
						}
					} else if (arg0 == 0) {
						local209 = this.anIntArray387[local48];
						if (local209 != 0) {
							if ((Static380.anInt6857 & 0xFFFFFF) == 16777215) {
								local234 = Static380.anInt6857 >>> 24;
								local238 = 256 - local234;
								local242 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
							} else if (Static380.anInt6859 == 255) {
								local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
								local3[local51] = (local234 | local238 | local242) >>> 8;
							} else {
								local234 = (local209 & 0xFF0000) * Static380.anInt6841 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static380.anInt6864 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static380.anInt6838 & 0xFF00;
								local209 = (local234 | local238 | local242) >>> 8;
								local314 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray387[local48];
						local234 = Static380.anInt6857;
						local238 = local209 + local234;
						local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
						local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
						local314 = local238 - local314 | local314 - (local314 >>> 8);
						if (local209 == 0 && Static380.anInt6859 != 255) {
							local209 = local314;
							local314 = local3[local51];
							local314 = ((local209 & 0xFF00FF) * Static380.anInt6859 + (local314 & 0xFF00FF) * Static380.anInt6837 & 0xFF00FF00) + ((local209 & 0xFF00) * Static380.anInt6859 + (local314 & 0xFF00) * Static380.anInt6837 & 0xFF0000) >> 8;
						}
						local3[local51] = local314;
					} else if (arg0 == 2) {
						local209 = this.anIntArray387[local48];
						if (local209 != 0) {
							local234 = (local209 & 0xFF00FF) * Static380.anInt6859 & 0xFF00FF00;
							local238 = (local209 & 0xFF00) * Static380.anInt6859 & 0xFF0000;
							local3[local51++] = ((local234 | local238) >>> 8) + Static380.anInt6861;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static380.anInt6853;
					local16 += Static380.anInt6848;
					local18++;
				}
				Static380.anInt6850 += Static380.anInt6855;
				Static380.anInt6856 += Static380.anInt6846;
				Static380.anInt6847 += Static380.anInt6840;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}
}
