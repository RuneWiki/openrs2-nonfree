import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class80_Sub2_Sub1 extends Class80_Sub2 {

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "[I")
	private final int[] anIntArray441;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!sr;[III)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class50_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray441 = arg1;
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!sr;[IIIII)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class50_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg4, arg5);
		this.anIntArray441 = new int[arg4 * arg5];
		@Pc(15) int local15 = arg3 - super.anInt5712;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg5; local19++) {
			for (@Pc(22) int local22 = 0; local22 < arg4; local22++) {
				@Pc(28) int local28 = arg1[arg2++];
				if (local28 >>> 24 == 255) {
					@Pc(37) int local37 = local28 & 0xFFFFFF;
					if (local37 == 0) {
						this.anIntArray441[local17++] = 1;
					} else {
						this.anIntArray441[local17++] = local37;
					}
				} else {
					this.anIntArray441[local17++] = 0;
				}
			}
			arg2 += local15;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass50_Sub2_8.method5087()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt5717;
		arg1 += super.anInt5709;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass50_Sub2_8.anInt6478;
		@Pc(26) int local26 = super.anInt5712;
		@Pc(29) int local29 = super.anInt5719;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass50_Sub2_8.anInt6471) {
			local52 = super.aClass50_Sub2_8.anInt6471 - arg1;
			local29 -= local52;
			arg1 = super.aClass50_Sub2_8.anInt6471;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass50_Sub2_8.anInt6474) {
			local29 -= arg1 + local29 - super.aClass50_Sub2_8.anInt6474;
		}
		if (arg0 < super.aClass50_Sub2_8.anInt6466) {
			local52 = super.aClass50_Sub2_8.anInt6466 - arg0;
			local26 -= local52;
			arg0 = super.aClass50_Sub2_8.anInt6466;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass50_Sub2_8.anInt6475) {
			local52 = arg0 + local26 - super.aClass50_Sub2_8.anInt6475;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class49_Sub1 local159 = (Class49_Sub1) arg2;
		@Pc(162) int[] local162 = local159.anIntArray102;
		@Pc(165) int[] local165 = local159.anIntArray103;
		@Pc(169) int[] local169 = super.aClass50_Sub2_8.anIntArray628;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt5712;
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
				@Pc(311) int local311 = this.anIntArray441[local19++];
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

	@OriginalMember(owner = "client!lr", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass50_Sub2_8.anIntArray628;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(15) int local15 = (arg1 + local5) * super.anInt5712 + arg0;
			@Pc(25) int local25 = (arg5 + local5) * super.aClass50_Sub2_8.anInt6478 + arg4;
			for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
				this.anIntArray441[local15 + local27] = local3[local25 + local27];
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass50_Sub2_8.method5087()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass50_Sub2_8.anInt6478;
			@Pc(29) int local29 = super.anInt5717 + super.anInt5712 + super.anInt5693;
			@Pc(38) int local38 = super.anInt5709 + super.anInt5719 + super.anInt5705;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt5717 > 0) {
				local64 = ((super.anInt5717 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 += local64 * local44 - (super.anInt5717 << 16);
			}
			if (super.anInt5709 > 0) {
				local64 = ((super.anInt5709 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 += local64 * local50 - (super.anInt5709 << 16);
			}
			if (super.anInt5712 < local29) {
				arg2 = ((super.anInt5712 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt5719 < local38) {
				arg3 = ((super.anInt5719 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass50_Sub2_8.anInt6474) {
				arg3 -= arg1 + arg3 - super.aClass50_Sub2_8.anInt6474;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass50_Sub2_8.anInt6471) {
				local180 = super.aClass50_Sub2_8.anInt6471 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass50_Sub2_8.anInt6475) {
				local180 = arg0 + arg2 - super.aClass50_Sub2_8.anInt6475;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass50_Sub2_8.anInt6466) {
				local180 = super.aClass50_Sub2_8.anInt6466 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass50_Sub2_8.anIntArray628;
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
							local270 = (local16 >> 16) * super.anInt5712;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray441[(local14 >> 16) + local270];
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
								local330 = (local16 >> 16) * super.anInt5712;
								for (local338 = -arg2; local338 < 0; local338++) {
									local341 = this.anIntArray441[(local14 >> 16) + local330];
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
								local351 = (local16 >> 16) * super.anInt5712;
								for (local359 = -arg2; local359 < 0; local359++) {
									local367 = this.anIntArray441[(local14 >> 16) + local351];
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
							local330 = (local16 >> 16) * super.anInt5712;
							for (local338 = -arg2; local338 < 0; local338++) {
								local341 = this.anIntArray441[(local14 >> 16) + local330];
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
							local341 = (local16 >> 16) * super.anInt5712;
							for (local351 = -arg2; local351 < 0; local351++) {
								local359 = this.anIntArray441[(local14 >> 16) + local341];
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
						local270 = (local16 >> 16) * super.anInt5712;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray441[(local14 >> 16) + local270];
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
						local338 = (local16 >> 16) * super.anInt5712;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray441[(local14 >> 16) + local338];
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
						local270 = (local16 >> 16) * super.anInt5712;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray441[(local14 >> 16) + local270];
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
						local341 = (local16 >> 16) * super.anInt5712;
						for (local351 = -arg2; local351 < 0; local351++) {
							local359 = this.anIntArray441[(local14 >> 16) + local341];
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
					local270 = (local16 >> 16) * super.anInt5712;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray441[(local14 >> 16) + local270];
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
					local338 = (local16 >> 16) * super.anInt5712;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray441[(local14 >> 16) + local338];
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
					local270 = (local16 >> 16) * super.anInt5712;
					for (local273 = -arg2; local273 < 0; local273++) {
						local330 = this.anIntArray441[(local14 >> 16) + local270];
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
					local341 = (local16 >> 16) * super.anInt5712;
					for (local351 = -arg2; local351 < 0; local351++) {
						local359 = this.anIntArray441[(local14 >> 16) + local341];
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

	@OriginalMember(owner = "client!lr", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V")
	@Override
	protected void method4543(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass50_Sub2_8.anIntArray628;
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
		if (Static183.anInt5711 == 0) {
			if (Static183.anInt5694 == 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local12 = Static183.anInt5710;
					local14 = Static183.anInt5704;
					local16 = Static183.anInt5700;
					local18 = Static183.anInt5707;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt5712 << 12) < 0 && local16 - (super.anInt5719 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
										local234 = Static183.anInt5692 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static183.anInt5701 == 255) {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray441[local48];
								local234 = Static183.anInt5692;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static183.anInt5701 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else if (Static183.anInt5694 < 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local12 = Static183.anInt5710;
					local14 = Static183.anInt5704;
					local16 = Static183.anInt5700 + Static183.anInt5691;
					local18 = Static183.anInt5707;
					if (local14 >= 0 && local14 - (super.anInt5712 << 12) < 0) {
						@Pc(845) int local845;
						if ((local845 = local16 - (super.anInt5719 << 12)) >= 0) {
							local852 = (Static183.anInt5694 - local845) / Static183.anInt5694;
							local18 += local852;
							local16 += Static183.anInt5694 * local852;
							local12 += local852;
						}
						@Pc(873) int local873;
						if ((local873 = (local16 - Static183.anInt5694) / Static183.anInt5694) > local18) {
							local18 = local873;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
										local234 = Static183.anInt5692 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static183.anInt5701 == 255) {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray441[local48];
								local234 = Static183.anInt5692;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static183.anInt5701 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static183.anInt5694;
							local18++;
						}
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local12 = Static183.anInt5710;
					local14 = Static183.anInt5704;
					local16 = Static183.anInt5700 + Static183.anInt5691;
					local18 = Static183.anInt5707;
					if (local14 >= 0 && local14 - (super.anInt5712 << 12) < 0) {
						if (local16 < 0) {
							local852 = (Static183.anInt5694 - local16 - 1) / Static183.anInt5694;
							local18 += local852;
							local16 += Static183.anInt5694 * local852;
							local12 += local852;
						}
						@Pc(1722) int local1722;
						if ((local1722 = (local16 + 1 - (super.anInt5719 << 12) - Static183.anInt5694) / Static183.anInt5694) > local18) {
							local18 = local1722;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
										local234 = Static183.anInt5692 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static183.anInt5701 == 255) {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray441[local48];
								local234 = Static183.anInt5692;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static183.anInt5701 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static183.anInt5694;
							local18++;
						}
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5710 += Static183.anInt5718;
				}
			}
		} else if (Static183.anInt5711 < 0) {
			if (Static183.anInt5694 == 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local12 = Static183.anInt5710;
					local14 = Static183.anInt5704 + Static183.anInt5716;
					local16 = Static183.anInt5700;
					local18 = Static183.anInt5707;
					if (local16 >= 0 && local16 - (super.anInt5719 << 12) < 0) {
						@Pc(2545) int local2545;
						if ((local2545 = local14 - (super.anInt5712 << 12)) >= 0) {
							local852 = (Static183.anInt5711 - local2545) / Static183.anInt5711;
							local18 += local852;
							local14 += Static183.anInt5711 * local852;
							local12 += local852;
						}
						@Pc(2573) int local2573;
						if ((local2573 = (local14 - Static183.anInt5711) / Static183.anInt5711) > local18) {
							local18 = local2573;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
										local234 = Static183.anInt5692 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static183.anInt5701 == 255) {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray441[local48];
								local234 = Static183.anInt5692;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static183.anInt5701 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray441[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static183.anInt5711;
							local18++;
						}
					}
					local9++;
					Static183.anInt5700 += Static183.anInt5702;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else if (Static183.anInt5694 < 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local12 = Static183.anInt5710;
					local14 = Static183.anInt5704 + Static183.anInt5716;
					local16 = Static183.anInt5700 + Static183.anInt5691;
					local18 = Static183.anInt5707;
					@Pc(3387) int local3387;
					if ((local3387 = local14 - (super.anInt5712 << 12)) >= 0) {
						local852 = (Static183.anInt5711 - local3387) / Static183.anInt5711;
						local18 += local852;
						local14 += Static183.anInt5711 * local852;
						local16 += Static183.anInt5694 * local852;
						local12 += local852;
					}
					@Pc(3421) int local3421;
					if ((local3421 = (local14 - Static183.anInt5711) / Static183.anInt5711) > local18) {
						local18 = local3421;
					}
					@Pc(3433) int local3433;
					if ((local3433 = local16 - (super.anInt5719 << 12)) >= 0) {
						local852 = (Static183.anInt5694 - local3433) / Static183.anInt5694;
						local18 += local852;
						local14 += Static183.anInt5711 * local852;
						local16 += Static183.anInt5694 * local852;
						local12 += local852;
					}
					@Pc(3467) int local3467;
					if ((local3467 = (local16 - Static183.anInt5694) / Static183.anInt5694) > local18) {
						local18 = local3467;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
									local234 = Static183.anInt5692 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static183.anInt5701 == 255) {
									local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray441[local48];
							local234 = Static183.anInt5692;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static183.anInt5701 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static183.anInt5711;
						local16 += Static183.anInt5694;
						local18++;
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5700 += Static183.anInt5702;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local12 = Static183.anInt5710;
					local14 = Static183.anInt5704 + Static183.anInt5716;
					local16 = Static183.anInt5700 + Static183.anInt5691;
					local18 = Static183.anInt5707;
					@Pc(4287) int local4287;
					if ((local4287 = local14 - (super.anInt5712 << 12)) >= 0) {
						local852 = (Static183.anInt5711 - local4287) / Static183.anInt5711;
						local18 += local852;
						local14 += Static183.anInt5711 * local852;
						local16 += Static183.anInt5694 * local852;
						local12 += local852;
					}
					@Pc(4321) int local4321;
					if ((local4321 = (local14 - Static183.anInt5711) / Static183.anInt5711) > local18) {
						local18 = local4321;
					}
					if (local16 < 0) {
						local852 = (Static183.anInt5694 - local16 - 1) / Static183.anInt5694;
						local18 += local852;
						local14 += Static183.anInt5711 * local852;
						local16 += Static183.anInt5694 * local852;
						local12 += local852;
					}
					@Pc(4369) int local4369;
					if ((local4369 = (local16 + 1 - (super.anInt5719 << 12) - Static183.anInt5694) / Static183.anInt5694) > local18) {
						local18 = local4369;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
									local234 = Static183.anInt5692 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static183.anInt5701 == 255) {
									local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray441[local48];
							local234 = Static183.anInt5692;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static183.anInt5701 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static183.anInt5711;
						local16 += Static183.anInt5694;
						local18++;
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5700 += Static183.anInt5702;
					Static183.anInt5710 += Static183.anInt5718;
				}
			}
		} else if (Static183.anInt5694 == 0) {
			local9 = Static183.anInt5695;
			while (local9 < 0) {
				local12 = Static183.anInt5710;
				local14 = Static183.anInt5704 + Static183.anInt5716;
				local16 = Static183.anInt5700;
				local18 = Static183.anInt5707;
				if (local16 >= 0 && local16 - (super.anInt5719 << 12) < 0) {
					if (local14 < 0) {
						local852 = (Static183.anInt5711 - local14 - 1) / Static183.anInt5711;
						local18 += local852;
						local14 += Static183.anInt5711 * local852;
						local12 += local852;
					}
					@Pc(5228) int local5228;
					if ((local5228 = (local14 + 1 - (super.anInt5712 << 12) - Static183.anInt5711) / Static183.anInt5711) > local18) {
						local18 = local5228;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
									local234 = Static183.anInt5692 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static183.anInt5701 == 255) {
									local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray441[local48];
							local234 = Static183.anInt5692;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static183.anInt5701 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray441[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static183.anInt5711;
						local18++;
					}
				}
				local9++;
				Static183.anInt5704 += Static183.anInt5703;
				Static183.anInt5700 += Static183.anInt5702;
				Static183.anInt5710 += Static183.anInt5718;
			}
		} else if (Static183.anInt5694 < 0) {
			for (local9 = Static183.anInt5695; local9 < 0; local9++) {
				local12 = Static183.anInt5710;
				local14 = Static183.anInt5704 + Static183.anInt5716;
				local16 = Static183.anInt5700 + Static183.anInt5691;
				local18 = Static183.anInt5707;
				if (local14 < 0) {
					local852 = (Static183.anInt5711 - local14 - 1) / Static183.anInt5711;
					local18 += local852;
					local14 += Static183.anInt5711 * local852;
					local16 += Static183.anInt5694 * local852;
					local12 += local852;
				}
				@Pc(6082) int local6082;
				if ((local6082 = (local14 + 1 - (super.anInt5712 << 12) - Static183.anInt5711) / Static183.anInt5711) > local18) {
					local18 = local6082;
				}
				@Pc(6094) int local6094;
				if ((local6094 = local16 - (super.anInt5719 << 12)) >= 0) {
					local852 = (Static183.anInt5694 - local6094) / Static183.anInt5694;
					local18 += local852;
					local14 += Static183.anInt5711 * local852;
					local16 += Static183.anInt5694 * local852;
					local12 += local852;
				}
				@Pc(6128) int local6128;
				if ((local6128 = (local16 - Static183.anInt5694) / Static183.anInt5694) > local18) {
					local18 = local6128;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray441[local48];
						if (local209 != 0) {
							local3[local51] = local209;
						}
					} else if (arg0 == 0) {
						local209 = this.anIntArray441[local48];
						if (local209 != 0) {
							if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
								local234 = Static183.anInt5692 >>> 24;
								local238 = 256 - local234;
								local242 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
							} else if (Static183.anInt5701 == 255) {
								local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
								local3[local51] = (local234 | local238 | local242) >>> 8;
							} else {
								local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
								local209 = (local234 | local238 | local242) >>> 8;
								local314 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray441[local48];
						local234 = Static183.anInt5692;
						local238 = local209 + local234;
						local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
						local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
						local314 = local238 - local314 | local314 - (local314 >>> 8);
						if (local209 == 0 && Static183.anInt5701 != 255) {
							local209 = local314;
							local314 = local3[local51];
							local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
						}
						local3[local51] = local314;
					} else if (arg0 == 2) {
						local209 = this.anIntArray441[local48];
						if (local209 != 0) {
							local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
							local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
							local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static183.anInt5711;
					local16 += Static183.anInt5694;
					local18++;
				}
				Static183.anInt5704 += Static183.anInt5703;
				Static183.anInt5700 += Static183.anInt5702;
				Static183.anInt5710 += Static183.anInt5718;
			}
		} else {
			for (local9 = Static183.anInt5695; local9 < 0; local9++) {
				local12 = Static183.anInt5710;
				local14 = Static183.anInt5704 + Static183.anInt5716;
				local16 = Static183.anInt5700 + Static183.anInt5691;
				local18 = Static183.anInt5707;
				if (local14 < 0) {
					local852 = (Static183.anInt5711 - local14 - 1) / Static183.anInt5711;
					local18 += local852;
					local14 += Static183.anInt5711 * local852;
					local16 += Static183.anInt5694 * local852;
					local12 += local852;
				}
				@Pc(6984) int local6984;
				if ((local6984 = (local14 + 1 - (super.anInt5712 << 12) - Static183.anInt5711) / Static183.anInt5711) > local18) {
					local18 = local6984;
				}
				if (local16 < 0) {
					local852 = (Static183.anInt5694 - local16 - 1) / Static183.anInt5694;
					local18 += local852;
					local14 += Static183.anInt5711 * local852;
					local16 += Static183.anInt5694 * local852;
					local12 += local852;
				}
				@Pc(7032) int local7032;
				if ((local7032 = (local16 + 1 - (super.anInt5719 << 12) - Static183.anInt5694) / Static183.anInt5694) > local18) {
					local18 = local7032;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt5712 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray441[local48];
						if (local209 != 0) {
							local3[local51] = local209;
						}
					} else if (arg0 == 0) {
						local209 = this.anIntArray441[local48];
						if (local209 != 0) {
							if ((Static183.anInt5692 & 0xFFFFFF) == 16777215) {
								local234 = Static183.anInt5692 >>> 24;
								local238 = 256 - local234;
								local242 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
							} else if (Static183.anInt5701 == 255) {
								local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
								local3[local51] = (local234 | local238 | local242) >>> 8;
							} else {
								local234 = (local209 & 0xFF0000) * Static183.anInt5706 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static183.anInt5713 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static183.anInt5699 & 0xFF00;
								local209 = (local234 | local238 | local242) >>> 8;
								local314 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray441[local48];
						local234 = Static183.anInt5692;
						local238 = local209 + local234;
						local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
						local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
						local314 = local238 - local314 | local314 - (local314 >>> 8);
						if (local209 == 0 && Static183.anInt5701 != 255) {
							local209 = local314;
							local314 = local3[local51];
							local314 = ((local209 & 0xFF00FF) * Static183.anInt5701 + (local314 & 0xFF00FF) * Static183.anInt5720 & 0xFF00FF00) + ((local209 & 0xFF00) * Static183.anInt5701 + (local314 & 0xFF00) * Static183.anInt5720 & 0xFF0000) >> 8;
						}
						local3[local51] = local314;
					} else if (arg0 == 2) {
						local209 = this.anIntArray441[local48];
						if (local209 != 0) {
							local234 = (local209 & 0xFF00FF) * Static183.anInt5701 & 0xFF00FF00;
							local238 = (local209 & 0xFF00) * Static183.anInt5701 & 0xFF0000;
							local3[local51++] = ((local234 | local238) >>> 8) + Static183.anInt5690;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static183.anInt5711;
					local16 += Static183.anInt5694;
					local18++;
				}
				Static183.anInt5704 += Static183.anInt5703;
				Static183.anInt5700 += Static183.anInt5702;
				Static183.anInt5710 += Static183.anInt5718;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method4545(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass50_Sub2_8.anIntArray628;
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
		if (Static183.anInt5711 == 0) {
			if (Static183.anInt5694 == 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static183.anInt5710;
						local25 = Static183.anInt5704;
						local27 = Static183.anInt5700;
						local29 = Static183.anInt5707;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt5712 << 12) < 0 && local27 - (super.anInt5719 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static183.anInt5710 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static183.anInt5711 * local64;
								local27 += Static183.anInt5694 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
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
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else if (Static183.anInt5694 < 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static183.anInt5710;
						local25 = Static183.anInt5704;
						local27 = Static183.anInt5700 + Static183.anInt5691;
						local29 = Static183.anInt5707;
						if (local25 >= 0 && local25 - (super.anInt5712 << 12) < 0) {
							@Pc(174) int local174;
							if ((local174 = local27 - (super.anInt5719 << 12)) >= 0) {
								local181 = (Static183.anInt5694 - local174) / Static183.anInt5694;
								local29 += local181;
								local27 += Static183.anInt5694 * local181;
								local23 += local181;
							}
							@Pc(202) int local202;
							if ((local202 = (local27 - Static183.anInt5694) / Static183.anInt5694) > local29) {
								local29 = local202;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static183.anInt5710 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static183.anInt5711 * local64;
								local27 += Static183.anInt5694 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static183.anInt5694;
								local29++;
							}
						}
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static183.anInt5710;
						local25 = Static183.anInt5704;
						local27 = Static183.anInt5700 + Static183.anInt5691;
						local29 = Static183.anInt5707;
						if (local25 >= 0 && local25 - (super.anInt5712 << 12) < 0) {
							if (local27 < 0) {
								local181 = (Static183.anInt5694 - local27 - 1) / Static183.anInt5694;
								local29 += local181;
								local27 += Static183.anInt5694 * local181;
								local23 += local181;
							}
							@Pc(369) int local369;
							if ((local369 = (local27 + 1 - (super.anInt5719 << 12) - Static183.anInt5694) / Static183.anInt5694) > local29) {
								local29 = local369;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static183.anInt5710 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static183.anInt5711 * local64;
								local27 += Static183.anInt5694 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static183.anInt5694;
								local29++;
							}
						}
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5710 += Static183.anInt5718;
				}
			}
		} else if (Static183.anInt5711 < 0) {
			if (Static183.anInt5694 == 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static183.anInt5710;
						local25 = Static183.anInt5704 + Static183.anInt5716;
						local27 = Static183.anInt5700;
						local29 = Static183.anInt5707;
						if (local27 >= 0 && local27 - (super.anInt5719 << 12) < 0) {
							@Pc(510) int local510;
							if ((local510 = local25 - (super.anInt5712 << 12)) >= 0) {
								local181 = (Static183.anInt5711 - local510) / Static183.anInt5711;
								local29 += local181;
								local25 += Static183.anInt5711 * local181;
								local23 += local181;
							}
							@Pc(538) int local538;
							if ((local538 = (local25 - Static183.anInt5711) / Static183.anInt5711) > local29) {
								local29 = local538;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static183.anInt5710 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static183.anInt5711 * local64;
								local27 += Static183.anInt5694 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local25 += Static183.anInt5711;
								local29++;
							}
						}
					}
					local9++;
					Static183.anInt5700 += Static183.anInt5702;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else if (Static183.anInt5694 < 0) {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static183.anInt5710;
						local25 = Static183.anInt5704 + Static183.anInt5716;
						local27 = Static183.anInt5700 + Static183.anInt5691;
						local29 = Static183.anInt5707;
						@Pc(670) int local670;
						if ((local670 = local25 - (super.anInt5712 << 12)) >= 0) {
							local181 = (Static183.anInt5711 - local670) / Static183.anInt5711;
							local29 += local181;
							local25 += Static183.anInt5711 * local181;
							local27 += Static183.anInt5694 * local181;
							local23 += local181;
						}
						@Pc(704) int local704;
						if ((local704 = (local25 - Static183.anInt5711) / Static183.anInt5711) > local29) {
							local29 = local704;
						}
						@Pc(716) int local716;
						if ((local716 = local27 - (super.anInt5719 << 12)) >= 0) {
							local181 = (Static183.anInt5694 - local716) / Static183.anInt5694;
							local29 += local181;
							local25 += Static183.anInt5711 * local181;
							local27 += Static183.anInt5694 * local181;
							local23 += local181;
						}
						@Pc(750) int local750;
						if ((local750 = (local27 - Static183.anInt5694) / Static183.anInt5694) > local29) {
							local29 = local750;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static183.anInt5710 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static183.anInt5711 * local64;
							local27 += Static183.anInt5694 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static183.anInt5711;
							local27 += Static183.anInt5694;
							local29++;
						}
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5700 += Static183.anInt5702;
					Static183.anInt5710 += Static183.anInt5718;
				}
			} else {
				local9 = Static183.anInt5695;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static183.anInt5710;
						local25 = Static183.anInt5704 + Static183.anInt5716;
						local27 = Static183.anInt5700 + Static183.anInt5691;
						local29 = Static183.anInt5707;
						@Pc(888) int local888;
						if ((local888 = local25 - (super.anInt5712 << 12)) >= 0) {
							local181 = (Static183.anInt5711 - local888) / Static183.anInt5711;
							local29 += local181;
							local25 += Static183.anInt5711 * local181;
							local27 += Static183.anInt5694 * local181;
							local23 += local181;
						}
						@Pc(922) int local922;
						if ((local922 = (local25 - Static183.anInt5711) / Static183.anInt5711) > local29) {
							local29 = local922;
						}
						if (local27 < 0) {
							local181 = (Static183.anInt5694 - local27 - 1) / Static183.anInt5694;
							local29 += local181;
							local25 += Static183.anInt5711 * local181;
							local27 += Static183.anInt5694 * local181;
							local23 += local181;
						}
						@Pc(970) int local970;
						if ((local970 = (local27 + 1 - (super.anInt5719 << 12) - Static183.anInt5694) / Static183.anInt5694) > local29) {
							local29 = local970;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static183.anInt5710 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static183.anInt5711 * local64;
							local27 += Static183.anInt5694 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static183.anInt5711;
							local27 += Static183.anInt5694;
							local29++;
						}
					}
					local9++;
					Static183.anInt5704 += Static183.anInt5703;
					Static183.anInt5700 += Static183.anInt5702;
					Static183.anInt5710 += Static183.anInt5718;
				}
			}
		} else if (Static183.anInt5694 == 0) {
			local9 = Static183.anInt5695;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static183.anInt5710;
					local25 = Static183.anInt5704 + Static183.anInt5716;
					local27 = Static183.anInt5700;
					local29 = Static183.anInt5707;
					if (local27 >= 0 && local27 - (super.anInt5719 << 12) < 0) {
						if (local25 < 0) {
							local181 = (Static183.anInt5711 - local25 - 1) / Static183.anInt5711;
							local29 += local181;
							local25 += Static183.anInt5711 * local181;
							local23 += local181;
						}
						@Pc(1147) int local1147;
						if ((local1147 = (local25 + 1 - (super.anInt5712 << 12) - Static183.anInt5711) / Static183.anInt5711) > local29) {
							local29 = local1147;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static183.anInt5710 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static183.anInt5711 * local64;
							local27 += Static183.anInt5694 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static183.anInt5711;
							local29++;
						}
					}
				}
				local9++;
				Static183.anInt5704 += Static183.anInt5703;
				Static183.anInt5700 += Static183.anInt5702;
				Static183.anInt5710 += Static183.anInt5718;
			}
		} else if (Static183.anInt5694 < 0) {
			local9 = Static183.anInt5695;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static183.anInt5710;
					local25 = Static183.anInt5704 + Static183.anInt5716;
					local27 = Static183.anInt5700 + Static183.anInt5691;
					local29 = Static183.anInt5707;
					if (local25 < 0) {
						local181 = (Static183.anInt5711 - local25 - 1) / Static183.anInt5711;
						local29 += local181;
						local25 += Static183.anInt5711 * local181;
						local27 += Static183.anInt5694 * local181;
						local23 += local181;
					}
					@Pc(1319) int local1319;
					if ((local1319 = (local25 + 1 - (super.anInt5712 << 12) - Static183.anInt5711) / Static183.anInt5711) > local29) {
						local29 = local1319;
					}
					@Pc(1331) int local1331;
					if ((local1331 = local27 - (super.anInt5719 << 12)) >= 0) {
						local181 = (Static183.anInt5694 - local1331) / Static183.anInt5694;
						local29 += local181;
						local25 += Static183.anInt5711 * local181;
						local27 += Static183.anInt5694 * local181;
						local23 += local181;
					}
					@Pc(1365) int local1365;
					if ((local1365 = (local27 - Static183.anInt5694) / Static183.anInt5694) > local29) {
						local29 = local1365;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static183.anInt5710 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static183.anInt5711 * local64;
						local27 += Static183.anInt5694 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static183.anInt5711;
						local27 += Static183.anInt5694;
						local29++;
					}
				}
				local9++;
				Static183.anInt5704 += Static183.anInt5703;
				Static183.anInt5700 += Static183.anInt5702;
				Static183.anInt5710 += Static183.anInt5718;
			}
		} else {
			local9 = Static183.anInt5695;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static183.anInt5710;
					local25 = Static183.anInt5704 + Static183.anInt5716;
					local27 = Static183.anInt5700 + Static183.anInt5691;
					local29 = Static183.anInt5707;
					if (local25 < 0) {
						local181 = (Static183.anInt5711 - local25 - 1) / Static183.anInt5711;
						local29 += local181;
						local25 += Static183.anInt5711 * local181;
						local27 += Static183.anInt5694 * local181;
						local23 += local181;
					}
					@Pc(1539) int local1539;
					if ((local1539 = (local25 + 1 - (super.anInt5712 << 12) - Static183.anInt5711) / Static183.anInt5711) > local29) {
						local29 = local1539;
					}
					if (local27 < 0) {
						local181 = (Static183.anInt5694 - local27 - 1) / Static183.anInt5694;
						local29 += local181;
						local25 += Static183.anInt5711 * local181;
						local27 += Static183.anInt5694 * local181;
						local23 += local181;
					}
					@Pc(1587) int local1587;
					if ((local1587 = (local27 + 1 - (super.anInt5719 << 12) - Static183.anInt5694) / Static183.anInt5694) > local29) {
						local29 = local1587;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static183.anInt5710 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static183.anInt5711 * local64;
						local27 += Static183.anInt5694 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray441[(local27 >> 12) * super.anInt5712 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static183.anInt5711;
						local27 += Static183.anInt5694;
						local29++;
					}
				}
				local9++;
				Static183.anInt5704 += Static183.anInt5703;
				Static183.anInt5700 += Static183.anInt5702;
				Static183.anInt5710 += Static183.anInt5718;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass50_Sub2_8.method5087()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass50_Sub2_8.anInt6478;
		arg0 += super.anInt5717;
		arg1 += super.anInt5709;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt5719;
		@Pc(35) int local35 = super.anInt5712;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass50_Sub2_8.anInt6471) {
			local52 = super.aClass50_Sub2_8.anInt6471 - arg1;
			local32 -= local52;
			arg1 = super.aClass50_Sub2_8.anInt6471;
			local29 += local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass50_Sub2_8.anInt6474) {
			local32 -= arg1 + local32 - super.aClass50_Sub2_8.anInt6474;
		}
		if (arg0 < super.aClass50_Sub2_8.anInt6466) {
			local52 = super.aClass50_Sub2_8.anInt6466 - arg0;
			local35 -= local52;
			arg0 = super.aClass50_Sub2_8.anInt6466;
			local29 += local52;
			local27 += local52;
			local41 += local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass50_Sub2_8.anInt6475) {
			local52 = arg0 + local35 - super.aClass50_Sub2_8.anInt6475;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass50_Sub2_8.anIntArray628;
		@Pc(492) int local492;
		@Pc(499) int local499;
		@Pc(506) int local506;
		if (arg2 == 1) {
			for (local492 = -local32; local492 < 0; local492++) {
				local499 = local27 + local35 - 3;
				while (local27 < local499) {
					local506 = this.anIntArray441[local29++];
					if (local506 == 0) {
						local27++;
					} else {
						local160[local27++] = local506;
					}
					local506 = this.anIntArray441[local29++];
					if (local506 == 0) {
						local27++;
					} else {
						local160[local27++] = local506;
					}
					local506 = this.anIntArray441[local29++];
					if (local506 == 0) {
						local27++;
					} else {
						local160[local27++] = local506;
					}
					local506 = this.anIntArray441[local29++];
					if (local506 == 0) {
						local27++;
					} else {
						local160[local27++] = local506;
					}
				}
				local499 += 3;
				while (local27 < local499) {
					local506 = this.anIntArray441[local29++];
					if (local506 == 0) {
						local27++;
					} else {
						local160[local27++] = local506;
					}
				}
				local27 += local39;
				local29 += local41;
			}
			return;
		}
		@Pc(617) int local617;
		@Pc(624) int local624;
		@Pc(630) int local630;
		@Pc(711) int local711;
		@Pc(718) int local718;
		if (arg2 == 0) {
			if ((arg3 & 0xFFFFFF) == 16777215) {
				local492 = arg3 >>> 24;
				local499 = 256 - local492;
				for (local506 = -local32; local506 < 0; local506++) {
					for (local617 = -local35; local617 < 0; local617++) {
						local624 = this.anIntArray441[local29++];
						if (local624 == 0) {
							local27++;
						} else {
							local630 = local160[local27];
							local160[local27++] = ((local624 & 0xFF00FF) * local492 + (local630 & 0xFF00FF) * local499 & 0xFF00FF00) + ((local624 & 0xFF00) * local492 + (local630 & 0xFF00) * local499 & 0xFF0000) >> 8;
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				local492 = arg3 >> 16 & 0xFF;
				local499 = arg3 >> 8 & 0xFF;
				local506 = arg3 & 0xFF;
				local617 = arg3 >>> 24;
				local624 = 256 - local617;
				for (local630 = -local32; local630 < 0; local630++) {
					for (local711 = -local35; local711 < 0; local711++) {
						local718 = this.anIntArray441[local29++];
						if (local718 == 0) {
							local27++;
						} else {
							@Pc(731) int local731;
							@Pc(739) int local739;
							@Pc(747) int local747;
							if (local617 == 255) {
								local731 = (local718 & 0xFF0000) * local492 & 0xFF000000;
								local739 = (local718 & 0xFF00) * local499 & 0xFF0000;
								local747 = (local718 & 0xFF) * local506 & 0xFF00;
								local160[local27++] = (local731 | local739 | local747) >>> 8;
							} else {
								local731 = (local718 & 0xFF0000) * local492 & 0xFF000000;
								local739 = (local718 & 0xFF00) * local499 & 0xFF0000;
								local747 = (local718 & 0xFF) * local506 & 0xFF00;
								local718 = (local731 | local739 | local747) >>> 8;
								@Pc(759) int local759 = local160[local27];
								local160[local27++] = ((local718 & 0xFF00FF) * local617 + (local759 & 0xFF00FF) * local624 & 0xFF00FF00) + ((local718 & 0xFF00) * local617 + (local759 & 0xFF00) * local624 & 0xFF0000) >> 8;
							}
						}
					}
					local27 += local39;
					local29 += local41;
				}
			}
		} else if (arg2 == 3) {
			local492 = arg3 >>> 24;
			local499 = 256 - local492;
			for (local506 = -local32; local506 < 0; local506++) {
				for (local617 = -local35; local617 < 0; local617++) {
					local624 = this.anIntArray441[local29++];
					local630 = local624 + arg3;
					local711 = (local624 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local718 = (local711 & 0x1000100) + (local630 - local711 & 0x10000);
					local718 = local630 - local718 | local718 - (local718 >>> 8);
					if (local624 == 0 && local492 != 255) {
						local624 = local718;
						local718 = local160[local27];
						local718 = ((local624 & 0xFF00FF) * local492 + (local718 & 0xFF00FF) * local499 & 0xFF00FF00) + ((local624 & 0xFF00) * local492 + (local718 & 0xFF00) * local499 & 0xFF0000) >> 8;
					}
					local160[local27++] = local718;
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 2) {
			local492 = arg3 >>> 24;
			local499 = 256 - local492;
			local506 = (arg3 & 0xFF00FF) * local499 & 0xFF00FF00;
			local617 = (arg3 & 0xFF00) * local499 & 0xFF0000;
			@Pc(996) int local996 = (local506 | local617) >>> 8;
			for (local624 = -local32; local624 < 0; local624++) {
				for (local630 = -local35; local630 < 0; local630++) {
					local711 = this.anIntArray441[local29++];
					if (local711 == 0) {
						local27++;
					} else {
						local506 = (local711 & 0xFF00FF) * local492 & 0xFF00FF00;
						local617 = (local711 & 0xFF00) * local492 & 0xFF0000;
						local160[local27++] = ((local506 | local617) >>> 8) + local996;
					}
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
