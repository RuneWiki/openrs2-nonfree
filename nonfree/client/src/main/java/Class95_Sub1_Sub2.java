import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class95_Sub1_Sub2 extends Class95_Sub1 {

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "[I")
	private final int[] anIntArray282;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!ji;[B[III)V")
	public Class95_Sub1_Sub2(@OriginalArg(0) Class135_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg3, arg4);
		this.aByteArray43 = arg1;
		this.anIntArray282 = arg2;
	}

	@OriginalMember(owner = "client!ll", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass135_Sub1_11.method2713()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass135_Sub1_11.anInt3418;
			@Pc(29) int local29 = super.anInt7261 + super.anInt7256 + super.anInt7283;
			@Pc(38) int local38 = super.anInt7281 + super.anInt7275 + super.anInt7257;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt7261 > 0) {
				local64 = ((super.anInt7261 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 += local64 * local44 - (super.anInt7261 << 16);
			}
			if (super.anInt7281 > 0) {
				local64 = ((super.anInt7281 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 += local64 * local50 - (super.anInt7281 << 16);
			}
			if (super.anInt7256 < local29) {
				arg2 = ((super.anInt7256 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt7275 < local38) {
				arg3 = ((super.anInt7275 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass135_Sub1_11.anInt3419) {
				arg3 -= arg1 + arg3 - super.aClass135_Sub1_11.anInt3419;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass135_Sub1_11.anInt3422) {
				local180 = super.aClass135_Sub1_11.anInt3422 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass135_Sub1_11.anInt3423) {
				local180 = arg0 + arg2 - super.aClass135_Sub1_11.anInt3423;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass135_Sub1_11.anInt3430) {
				local180 = super.aClass135_Sub1_11.anInt3430 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass135_Sub1_11.anIntArray260;
			@Pc(259) int local259;
			@Pc(262) int local262;
			@Pc(270) int local270;
			@Pc(273) int local273;
			@Pc(335) int local335;
			@Pc(343) int local343;
			@Pc(346) int local346;
			@Pc(361) int local361;
			@Pc(377) int local377;
			@Pc(385) int local385;
			@Pc(544) int local544;
			@Pc(446) byte local446;
			@Pc(369) int local369;
			if (arg6 != 0) {
				@Pc(1196) byte local1196;
				@Pc(872) int local872;
				@Pc(880) int local880;
				@Pc(888) int local888;
				@Pc(900) int local900;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt7256;
							for (local273 = -arg2; local273 < 0; local273++) {
								local446 = this.aByteArray43[(local14 >> 16) + local270];
								if (local446 == 0) {
									local64++;
								} else {
									local252[local64++] = this.anIntArray282[local446 & 0xFF];
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else {
						@Pc(735) byte local735;
						if (arg4 == 0) {
							local259 = local14;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								local262 = arg5 >>> 24;
								local270 = 256 - local262;
								for (local273 = -arg3; local273 < 0; local273++) {
									local335 = (local16 >> 16) * super.anInt7256;
									for (local343 = -arg2; local343 < 0; local343++) {
										local735 = this.aByteArray43[(local14 >> 16) + local335];
										if (local735 == 0) {
											local64++;
										} else {
											local361 = this.anIntArray282[local735 & 0xFF];
											local369 = local252[local64];
											local252[local64++] = ((local361 & 0xFF00FF) * local262 + (local369 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local361 & 0xFF00) * local262 + (local369 & 0xFF00) * local270 & 0xFF0000) >> 8;
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
								local335 = arg5 >>> 24;
								local343 = 256 - local335;
								for (local346 = -arg3; local346 < 0; local346++) {
									local361 = (local16 >> 16) * super.anInt7256;
									for (local369 = -arg2; local369 < 0; local369++) {
										@Pc(852) byte local852 = this.aByteArray43[(local14 >> 16) + local361];
										if (local852 == 0) {
											local64++;
										} else {
											local385 = this.anIntArray282[local852 & 0xFF];
											if (local335 == 255) {
												local872 = (local385 & 0xFF0000) * local262 & 0xFF000000;
												local880 = (local385 & 0xFF00) * local270 & 0xFF0000;
												local888 = (local385 & 0xFF) * local273 & 0xFF00;
												local252[local64++] = (local872 | local880 | local888) >>> 8;
											} else {
												local872 = (local385 & 0xFF0000) * local262 & 0xFF000000;
												local880 = (local385 & 0xFF00) * local270 & 0xFF0000;
												local888 = (local385 & 0xFF) * local273 & 0xFF00;
												local385 = (local872 | local880 | local888) >>> 8;
												local900 = local252[local64];
												local252[local64++] = ((local385 & 0xFF00FF) * local335 + (local900 & 0xFF00FF) * local343 & 0xFF00FF00) + ((local385 & 0xFF00) * local335 + (local900 & 0xFF00) * local343 & 0xFF0000) >> 8;
											}
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
								local335 = (local16 >> 16) * super.anInt7256;
								for (local343 = -arg2; local343 < 0; local343++) {
									local735 = this.aByteArray43[(local14 >> 16) + local335];
									local361 = local735 > 0 ? this.anIntArray282[local735] : 0;
									local369 = local361 + arg5;
									local377 = (local361 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local385 = (local377 & 0x1000100) + (local369 - local377 & 0x10000);
									local385 = local369 - local385 | local385 - (local385 >>> 8);
									if (local361 == 0 && local262 != 255) {
										local361 = local385;
										local385 = local252[local64];
										local385 = ((local361 & 0xFF00FF) * local262 + (local385 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local361 & 0xFF00) * local262 + (local385 & 0xFF00) * local270 & 0xFF0000) >> 8;
									}
									local252[local64++] = local385;
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
							local544 = (local270 | local273) >>> 8;
							local335 = local14;
							for (local343 = -arg3; local343 < 0; local343++) {
								local346 = (local16 >> 16) * super.anInt7256;
								for (local361 = -arg2; local361 < 0; local361++) {
									local1196 = this.aByteArray43[(local14 >> 16) + local346];
									if (local1196 == 0) {
										local64++;
									} else {
										local377 = this.anIntArray282[local1196 & 0xFF];
										local270 = (local377 & 0xFF00FF) * local259 & 0xFF00FF00;
										local273 = (local377 & 0xFF00) * local259 & 0xFF0000;
										local252[local64++] = ((local270 | local273) >>> 8) + local544;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local335;
								local64 += local152;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7256;
						for (local273 = -arg2; local273 < 0; local273++) {
							local446 = this.aByteArray43[(local14 >> 16) + local270];
							if (local446 == 0) {
								local64++;
							} else {
								local343 = this.anIntArray282[local446 & 0xFF];
								local346 = local252[local64];
								local361 = local343 + local346;
								local369 = (local343 & 0xFF00FF) + (local346 & 0xFF00FF);
								local346 = (local369 & 0x1000100) + (local361 - local369 & 0x10000);
								local252[local64++] = local361 - local346 | local346 - (local346 >>> 8);
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
					for (local335 = -arg3; local335 < 0; local335++) {
						local343 = (local16 >> 16) * super.anInt7256;
						for (local346 = -arg2; local346 < 0; local346++) {
							@Pc(1406) byte local1406 = this.aByteArray43[(local14 >> 16) + local343];
							if (local1406 == 0) {
								local64++;
							} else {
								local369 = this.anIntArray282[local1406 & 0xFF];
								local377 = (local369 & 0xFF0000) * local262 & 0xFF000000;
								local385 = (local369 & 0xFF00) * local270 & 0xFF0000;
								local872 = (local369 & 0xFF) * local273 & 0xFF00;
								local369 = (local377 | local385 | local872) >>> 8;
								local880 = local252[local64];
								local888 = local369 + local880;
								local900 = (local369 & 0xFF00FF) + (local880 & 0xFF00FF);
								local880 = (local900 & 0x1000100) + (local888 - local900 & 0x10000);
								local252[local64++] = local888 - local880 | local880 - (local880 >>> 8);
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
						local270 = (local16 >> 16) * super.anInt7256;
						for (local273 = -arg2; local273 < 0; local273++) {
							local446 = this.aByteArray43[(local14 >> 16) + local270];
							local343 = local446 > 0 ? this.anIntArray282[local446] : 0;
							local346 = local343 + arg5;
							local361 = (local343 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local369 = (local361 & 0x1000100) + (local346 - local361 & 0x10000);
							local343 = local346 - local369 | local369 - (local369 >>> 8);
							@Pc(1583) int local1583 = local252[local64];
							local346 = local343 + local1583;
							local361 = (local343 & 0xFF00FF) + (local1583 & 0xFF00FF);
							@Pc(1605) int local1605 = (local361 & 0x1000100) + (local346 - local361 & 0x10000);
							local252[local64++] = local346 - local1605 | local1605 - (local1605 >>> 8);
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
					local544 = (local270 | local273) >>> 8;
					local335 = local14;
					for (local343 = -arg3; local343 < 0; local343++) {
						local346 = (local16 >> 16) * super.anInt7256;
						for (local361 = -arg2; local361 < 0; local361++) {
							local1196 = this.aByteArray43[(local14 >> 16) + local346];
							if (local1196 == 0) {
								local64++;
							} else {
								local377 = this.anIntArray282[local1196 & 0xFF];
								local270 = (local377 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local377 & 0xFF00) * local259 & 0xFF0000;
								@Pc(1731) int local1731 = ((local270 | local273) >>> 8) + local544;
								local385 = local252[local64];
								local872 = local1731 + local385;
								local880 = (local1731 & 0xFF00FF) + (local385 & 0xFF00FF);
								@Pc(1757) int local1757 = (local880 & 0x1000100) + (local872 - local880 & 0x10000);
								local252[local64++] = local872 - local1757 | local1757 - (local1757 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local335;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 1) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7256;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray282[this.aByteArray43[(local14 >> 16) + local270] & 0xFF];
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
				for (local335 = -arg3; local335 < 0; local335++) {
					local343 = (local16 >> 16) * super.anInt7256;
					for (local346 = -arg2; local346 < 0; local346++) {
						local361 = this.anIntArray282[this.aByteArray43[(local14 >> 16) + local343] & 0xFF];
						local369 = (local361 & 0xFF0000) * local259 & 0xFF000000;
						local377 = (local361 & 0xFF00) * local262 & 0xFF0000;
						local385 = (local361 & 0xFF) * local270 & 0xFF00;
						local252[local64++] = (local369 | local377 | local385) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local273;
					local64 += local152;
				}
			} else if (arg4 == 3) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7256;
					for (local273 = -arg2; local273 < 0; local273++) {
						local446 = this.aByteArray43[(local14 >> 16) + local270];
						local343 = local446 > 0 ? this.anIntArray282[local446] : 0;
						local346 = local343 + arg5;
						local361 = (local343 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local369 = (local361 & 0x1000100) + (local346 - local361 & 0x10000);
						local252[local64++] = local346 - local369 | local369 - (local369 >>> 8);
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
				local544 = (local270 | local273) >>> 8;
				local335 = local14;
				for (local343 = -arg3; local343 < 0; local343++) {
					local346 = (local16 >> 16) * super.anInt7256;
					for (local361 = -arg2; local361 < 0; local361++) {
						local369 = this.anIntArray282[this.aByteArray43[(local14 >> 16) + local346] & 0xFF];
						local270 = (local369 & 0xFF00FF) * local259 & 0xFF00FF00;
						local273 = (local369 & 0xFF00) * local259 & 0xFF0000;
						local252[local64++] = ((local270 | local273) >>> 8) + local544;
						local14 += local44;
					}
					local16 += local50;
					local14 = local335;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V")
	@Override
	protected void method5829(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass135_Sub1_11.anIntArray260;
		@Pc(935) int local935;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(227) byte local227;
		@Pc(255) int local255;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(344) int local344;
		if (Static201.anInt7255 == 0) {
			if (Static201.anInt7271 == 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local12 = Static201.anInt7278;
					local14 = Static201.anInt7259;
					local16 = Static201.anInt7258;
					local18 = Static201.anInt7274;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt7256 << 12) < 0 && local16 - (super.anInt7275 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray282[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
										local264 = Static201.anInt7262 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static201.anInt7263 == 255) {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray43[local48];
								local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
								local264 = Static201.anInt7262;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static201.anInt7263 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else if (Static201.anInt7271 < 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local12 = Static201.anInt7278;
					local14 = Static201.anInt7259;
					local16 = Static201.anInt7258 + Static201.anInt7282;
					local18 = Static201.anInt7274;
					if (local14 >= 0 && local14 - (super.anInt7256 << 12) < 0) {
						@Pc(928) int local928;
						if ((local928 = local16 - (super.anInt7275 << 12)) >= 0) {
							local935 = (Static201.anInt7271 - local928) / Static201.anInt7271;
							local18 += local935;
							local16 += Static201.anInt7271 * local935;
							local12 += local935;
						}
						@Pc(956) int local956;
						if ((local956 = (local16 - Static201.anInt7271) / Static201.anInt7271) > local18) {
							local18 = local956;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray282[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
										local264 = Static201.anInt7262 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static201.anInt7263 == 255) {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray43[local48];
								local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
								local264 = Static201.anInt7262;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static201.anInt7263 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static201.anInt7271;
							local18++;
						}
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local12 = Static201.anInt7278;
					local14 = Static201.anInt7259;
					local16 = Static201.anInt7258 + Static201.anInt7282;
					local18 = Static201.anInt7274;
					if (local14 >= 0 && local14 - (super.anInt7256 << 12) < 0) {
						if (local16 < 0) {
							local935 = (Static201.anInt7271 - local16 - 1) / Static201.anInt7271;
							local18 += local935;
							local16 += Static201.anInt7271 * local935;
							local12 += local935;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local16 + 1 - (super.anInt7275 << 12) - Static201.anInt7271) / Static201.anInt7271) > local18) {
							local18 = local1888;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray282[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
										local264 = Static201.anInt7262 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static201.anInt7263 == 255) {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray43[local48];
								local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
								local264 = Static201.anInt7262;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static201.anInt7263 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static201.anInt7271;
							local18++;
						}
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7278 += Static201.anInt7284;
				}
			}
		} else if (Static201.anInt7255 < 0) {
			if (Static201.anInt7271 == 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local12 = Static201.anInt7278;
					local14 = Static201.anInt7259 + Static201.anInt7272;
					local16 = Static201.anInt7258;
					local18 = Static201.anInt7274;
					if (local16 >= 0 && local16 - (super.anInt7275 << 12) < 0) {
						@Pc(2794) int local2794;
						if ((local2794 = local14 - (super.anInt7256 << 12)) >= 0) {
							local935 = (Static201.anInt7255 - local2794) / Static201.anInt7255;
							local18 += local935;
							local14 += Static201.anInt7255 * local935;
							local12 += local935;
						}
						@Pc(2822) int local2822;
						if ((local2822 = (local14 - Static201.anInt7255) / Static201.anInt7255) > local18) {
							local18 = local2822;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray282[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
										local264 = Static201.anInt7262 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static201.anInt7263 == 255) {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray43[local48];
								local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
								local264 = Static201.anInt7262;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static201.anInt7263 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray43[local48];
								if (local227 != 0) {
									local255 = this.anIntArray282[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static201.anInt7255;
							local18++;
						}
					}
					local9++;
					Static201.anInt7258 += Static201.anInt7276;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else if (Static201.anInt7271 < 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local12 = Static201.anInt7278;
					local14 = Static201.anInt7259 + Static201.anInt7272;
					local16 = Static201.anInt7258 + Static201.anInt7282;
					local18 = Static201.anInt7274;
					@Pc(3719) int local3719;
					if ((local3719 = local14 - (super.anInt7256 << 12)) >= 0) {
						local935 = (Static201.anInt7255 - local3719) / Static201.anInt7255;
						local18 += local935;
						local14 += Static201.anInt7255 * local935;
						local16 += Static201.anInt7271 * local935;
						local12 += local935;
					}
					@Pc(3753) int local3753;
					if ((local3753 = (local14 - Static201.anInt7255) / Static201.anInt7255) > local18) {
						local18 = local3753;
					}
					@Pc(3765) int local3765;
					if ((local3765 = local16 - (super.anInt7275 << 12)) >= 0) {
						local935 = (Static201.anInt7271 - local3765) / Static201.anInt7271;
						local18 += local935;
						local14 += Static201.anInt7255 * local935;
						local16 += Static201.anInt7271 * local935;
						local12 += local935;
					}
					@Pc(3799) int local3799;
					if ((local3799 = (local16 - Static201.anInt7271) / Static201.anInt7271) > local18) {
						local18 = local3799;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray282[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local255 = this.anIntArray282[local227 & 0xFF];
								if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
									local264 = Static201.anInt7262 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static201.anInt7263 == 255) {
									local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray43[local48];
							local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
							local264 = Static201.anInt7262;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static201.anInt7263 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local255 = this.anIntArray282[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static201.anInt7255;
						local16 += Static201.anInt7271;
						local18++;
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7258 += Static201.anInt7276;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local12 = Static201.anInt7278;
					local14 = Static201.anInt7259 + Static201.anInt7272;
					local16 = Static201.anInt7258 + Static201.anInt7282;
					local18 = Static201.anInt7274;
					@Pc(4702) int local4702;
					if ((local4702 = local14 - (super.anInt7256 << 12)) >= 0) {
						local935 = (Static201.anInt7255 - local4702) / Static201.anInt7255;
						local18 += local935;
						local14 += Static201.anInt7255 * local935;
						local16 += Static201.anInt7271 * local935;
						local12 += local935;
					}
					@Pc(4736) int local4736;
					if ((local4736 = (local14 - Static201.anInt7255) / Static201.anInt7255) > local18) {
						local18 = local4736;
					}
					if (local16 < 0) {
						local935 = (Static201.anInt7271 - local16 - 1) / Static201.anInt7271;
						local18 += local935;
						local14 += Static201.anInt7255 * local935;
						local16 += Static201.anInt7271 * local935;
						local12 += local935;
					}
					@Pc(4784) int local4784;
					if ((local4784 = (local16 + 1 - (super.anInt7275 << 12) - Static201.anInt7271) / Static201.anInt7271) > local18) {
						local18 = local4784;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray282[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local255 = this.anIntArray282[local227 & 0xFF];
								if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
									local264 = Static201.anInt7262 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static201.anInt7263 == 255) {
									local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray43[local48];
							local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
							local264 = Static201.anInt7262;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static201.anInt7263 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local255 = this.anIntArray282[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static201.anInt7255;
						local16 += Static201.anInt7271;
						local18++;
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7258 += Static201.anInt7276;
					Static201.anInt7278 += Static201.anInt7284;
				}
			}
		} else if (Static201.anInt7271 == 0) {
			local9 = Static201.anInt7267;
			while (local9 < 0) {
				local12 = Static201.anInt7278;
				local14 = Static201.anInt7259 + Static201.anInt7272;
				local16 = Static201.anInt7258;
				local18 = Static201.anInt7274;
				if (local16 >= 0 && local16 - (super.anInt7275 << 12) < 0) {
					if (local14 < 0) {
						local935 = (Static201.anInt7255 - local14 - 1) / Static201.anInt7255;
						local18 += local935;
						local14 += Static201.anInt7255 * local935;
						local12 += local935;
					}
					@Pc(5726) int local5726;
					if ((local5726 = (local14 + 1 - (super.anInt7256 << 12) - Static201.anInt7255) / Static201.anInt7255) > local18) {
						local18 = local5726;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray282[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local255 = this.anIntArray282[local227 & 0xFF];
								if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
									local264 = Static201.anInt7262 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static201.anInt7263 == 255) {
									local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray43[local48];
							local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
							local264 = Static201.anInt7262;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static201.anInt7263 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray43[local48];
							if (local227 != 0) {
								local255 = this.anIntArray282[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static201.anInt7255;
						local18++;
					}
				}
				local9++;
				Static201.anInt7259 += Static201.anInt7285;
				Static201.anInt7258 += Static201.anInt7276;
				Static201.anInt7278 += Static201.anInt7284;
			}
		} else if (Static201.anInt7271 < 0) {
			for (local9 = Static201.anInt7267; local9 < 0; local9++) {
				local12 = Static201.anInt7278;
				local14 = Static201.anInt7259 + Static201.anInt7272;
				local16 = Static201.anInt7258 + Static201.anInt7282;
				local18 = Static201.anInt7274;
				if (local14 < 0) {
					local935 = (Static201.anInt7255 - local14 - 1) / Static201.anInt7255;
					local18 += local935;
					local14 += Static201.anInt7255 * local935;
					local16 += Static201.anInt7271 * local935;
					local12 += local935;
				}
				@Pc(6663) int local6663;
				if ((local6663 = (local14 + 1 - (super.anInt7256 << 12) - Static201.anInt7255) / Static201.anInt7255) > local18) {
					local18 = local6663;
				}
				@Pc(6675) int local6675;
				if ((local6675 = local16 - (super.anInt7275 << 12)) >= 0) {
					local935 = (Static201.anInt7271 - local6675) / Static201.anInt7271;
					local18 += local935;
					local14 += Static201.anInt7255 * local935;
					local16 += Static201.anInt7271 * local935;
					local12 += local935;
				}
				@Pc(6709) int local6709;
				if ((local6709 = (local16 - Static201.anInt7271) / Static201.anInt7271) > local18) {
					local18 = local6709;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local227 = this.aByteArray43[local48];
						if (local227 != 0) {
							local3[local51] = this.anIntArray282[local227 & 0xFF];
						}
					} else if (arg0 == 0) {
						local227 = this.aByteArray43[local48];
						if (local227 != 0) {
							local255 = this.anIntArray282[local227 & 0xFF];
							if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
								local264 = Static201.anInt7262 >>> 24;
								local268 = 256 - local264;
								local272 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
							} else if (Static201.anInt7263 == 255) {
								local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
								local3[local51] = (local264 | local268 | local272) >>> 8;
							} else {
								local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
								local255 = (local264 | local268 | local272) >>> 8;
								local344 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local227 = this.aByteArray43[local48];
						local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
						local264 = Static201.anInt7262;
						local268 = local255 + local264;
						local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
						local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
						local344 = local268 - local344 | local344 - (local344 >>> 8);
						if (local255 == 0 && Static201.anInt7263 != 255) {
							local255 = local344;
							local344 = local3[local51];
							local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
						}
						local3[local51] = local344;
					} else if (arg0 == 2) {
						local227 = this.aByteArray43[local48];
						if (local227 != 0) {
							local255 = this.anIntArray282[local227 & 0xFF];
							local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
							local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
							local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static201.anInt7255;
					local16 += Static201.anInt7271;
					local18++;
				}
				Static201.anInt7259 += Static201.anInt7285;
				Static201.anInt7258 += Static201.anInt7276;
				Static201.anInt7278 += Static201.anInt7284;
			}
		} else {
			for (local9 = Static201.anInt7267; local9 < 0; local9++) {
				local12 = Static201.anInt7278;
				local14 = Static201.anInt7259 + Static201.anInt7272;
				local16 = Static201.anInt7258 + Static201.anInt7282;
				local18 = Static201.anInt7274;
				if (local14 < 0) {
					local935 = (Static201.anInt7255 - local14 - 1) / Static201.anInt7255;
					local18 += local935;
					local14 += Static201.anInt7255 * local935;
					local16 += Static201.anInt7271 * local935;
					local12 += local935;
				}
				@Pc(7648) int local7648;
				if ((local7648 = (local14 + 1 - (super.anInt7256 << 12) - Static201.anInt7255) / Static201.anInt7255) > local18) {
					local18 = local7648;
				}
				if (local16 < 0) {
					local935 = (Static201.anInt7271 - local16 - 1) / Static201.anInt7271;
					local18 += local935;
					local14 += Static201.anInt7255 * local935;
					local16 += Static201.anInt7271 * local935;
					local12 += local935;
				}
				@Pc(7696) int local7696;
				if ((local7696 = (local16 + 1 - (super.anInt7275 << 12) - Static201.anInt7271) / Static201.anInt7271) > local18) {
					local18 = local7696;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7256 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local227 = this.aByteArray43[local48];
						if (local227 != 0) {
							local3[local51] = this.anIntArray282[local227 & 0xFF];
						}
					} else if (arg0 == 0) {
						local227 = this.aByteArray43[local48];
						if (local227 != 0) {
							local255 = this.anIntArray282[local227 & 0xFF];
							if ((Static201.anInt7262 & 0xFFFFFF) == 16777215) {
								local264 = Static201.anInt7262 >>> 24;
								local268 = 256 - local264;
								local272 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
							} else if (Static201.anInt7263 == 255) {
								local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
								local3[local51] = (local264 | local268 | local272) >>> 8;
							} else {
								local264 = (local255 & 0xFF0000) * Static201.anInt7264 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static201.anInt7279 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static201.anInt7266 & 0xFF00;
								local255 = (local264 | local268 | local272) >>> 8;
								local344 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local227 = this.aByteArray43[local48];
						local255 = local227 > 0 ? this.anIntArray282[local227] : 0;
						local264 = Static201.anInt7262;
						local268 = local255 + local264;
						local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
						local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
						local344 = local268 - local344 | local344 - (local344 >>> 8);
						if (local255 == 0 && Static201.anInt7263 != 255) {
							local255 = local344;
							local344 = local3[local51];
							local344 = ((local255 & 0xFF00FF) * Static201.anInt7263 + (local344 & 0xFF00FF) * Static201.anInt7280 & 0xFF00FF00) + ((local255 & 0xFF00) * Static201.anInt7263 + (local344 & 0xFF00) * Static201.anInt7280 & 0xFF0000) >> 8;
						}
						local3[local51] = local344;
					} else if (arg0 == 2) {
						local227 = this.aByteArray43[local48];
						if (local227 != 0) {
							local255 = this.anIntArray282[local227 & 0xFF];
							local264 = (local255 & 0xFF00FF) * Static201.anInt7263 & 0xFF00FF00;
							local268 = (local255 & 0xFF00) * Static201.anInt7263 & 0xFF0000;
							local3[local51++] = ((local264 | local268) >>> 8) + Static201.anInt7260;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static201.anInt7255;
					local16 += Static201.anInt7271;
					local18++;
				}
				Static201.anInt7259 += Static201.anInt7285;
				Static201.anInt7258 += Static201.anInt7276;
				Static201.anInt7278 += Static201.anInt7284;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass135_Sub1_11.method2713()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass135_Sub1_11.anInt3418;
		arg0 += super.anInt7261;
		arg1 += super.anInt7281;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt7275;
		@Pc(35) int local35 = super.anInt7256;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass135_Sub1_11.anInt3422) {
			local52 = super.aClass135_Sub1_11.anInt3422 - arg1;
			local32 -= local52;
			arg1 = super.aClass135_Sub1_11.anInt3422;
			local29 += local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass135_Sub1_11.anInt3419) {
			local32 -= arg1 + local32 - super.aClass135_Sub1_11.anInt3419;
		}
		if (arg0 < super.aClass135_Sub1_11.anInt3430) {
			local52 = super.aClass135_Sub1_11.anInt3430 - arg0;
			local35 -= local52;
			arg0 = super.aClass135_Sub1_11.anInt3430;
			local29 += local52;
			local27 += local52;
			local41 += local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass135_Sub1_11.anInt3423) {
			local52 = arg0 + local35 - super.aClass135_Sub1_11.anInt3423;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass135_Sub1_11.anIntArray260;
		@Pc(532) int local532;
		@Pc(539) int local539;
		if (arg2 == 1) {
			for (local532 = -local32; local532 < 0; local532++) {
				local539 = local27 + local35 - 3;
				@Pc(546) byte local546;
				while (local27 < local539) {
					local546 = this.aByteArray43[local29++];
					if (local546 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray282[local546 & 0xFF];
					}
					local546 = this.aByteArray43[local29++];
					if (local546 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray282[local546 & 0xFF];
					}
					local546 = this.aByteArray43[local29++];
					if (local546 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray282[local546 & 0xFF];
					}
					local546 = this.aByteArray43[local29++];
					if (local546 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray282[local546 & 0xFF];
					}
				}
				local539 += 3;
				while (local27 < local539) {
					local546 = this.aByteArray43[local29++];
					if (local546 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray282[local546 & 0xFF];
					}
				}
				local27 += local39;
				local29 += local41;
			}
			return;
		}
		@Pc(678) int local678;
		@Pc(682) int local682;
		@Pc(776) int local776;
		@Pc(698) int local698;
		@Pc(799) int local799;
		@Pc(689) byte local689;
		@Pc(702) int local702;
		if (arg2 != 0) {
			@Pc(970) int local970;
			if (arg2 == 3) {
				local532 = arg3 >>> 24;
				local539 = 256 - local532;
				for (local678 = -local32; local678 < 0; local678++) {
					for (local682 = -local35; local682 < 0; local682++) {
						local689 = this.aByteArray43[local29++];
						local698 = local689 > 0 ? this.anIntArray282[local689] : 0;
						local702 = local698 + arg3;
						local970 = (local698 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local799 = (local970 & 0x1000100) + (local702 - local970 & 0x10000);
						local799 = local702 - local799 | local799 - (local799 >>> 8);
						if (local698 == 0 && local532 != 255) {
							local698 = local799;
							local799 = local160[local27];
							local799 = ((local698 & 0xFF00FF) * local532 + (local799 & 0xFF00FF) * local539 & 0xFF00FF00) + ((local698 & 0xFF00) * local532 + (local799 & 0xFF00) * local539 & 0xFF0000) >> 8;
						}
						local160[local27++] = local799;
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 2) {
				local532 = arg3 >>> 24;
				local539 = 256 - local532;
				local678 = (arg3 & 0xFF00FF) * local539 & 0xFF00FF00;
				local682 = (arg3 & 0xFF00) * local539 & 0xFF0000;
				@Pc(1084) int local1084 = (local678 | local682) >>> 8;
				for (local776 = -local32; local776 < 0; local776++) {
					for (local698 = -local35; local698 < 0; local698++) {
						@Pc(1098) byte local1098 = this.aByteArray43[local29++];
						if (local1098 == 0) {
							local27++;
						} else {
							local970 = this.anIntArray282[local1098 & 0xFF];
							local678 = (local970 & 0xFF00FF) * local532 & 0xFF00FF00;
							local682 = (local970 & 0xFF00) * local532 & 0xFF0000;
							local160[local27++] = ((local678 | local682) >>> 8) + local1084;
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if ((arg3 & 0xFFFFFF) == 16777215) {
			local532 = arg3 >>> 24;
			local539 = 256 - local532;
			for (local678 = -local32; local678 < 0; local678++) {
				for (local682 = -local35; local682 < 0; local682++) {
					local689 = this.aByteArray43[local29++];
					if (local689 == 0) {
						local27++;
					} else {
						local698 = this.anIntArray282[local689 & 0xFF];
						local702 = local160[local27];
						local160[local27++] = ((local698 & 0xFF00FF) * local532 + (local702 & 0xFF00FF) * local539 & 0xFF00FF00) + ((local698 & 0xFF00) * local532 + (local702 & 0xFF00) * local539 & 0xFF0000) >> 8;
					}
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			local532 = arg3 >> 16 & 0xFF;
			local539 = arg3 >> 8 & 0xFF;
			local678 = arg3 & 0xFF;
			local682 = arg3 >>> 24;
			local776 = 256 - local682;
			for (local698 = -local32; local698 < 0; local698++) {
				for (local702 = -local35; local702 < 0; local702++) {
					@Pc(790) byte local790 = this.aByteArray43[local29++];
					if (local790 == 0) {
						local27++;
					} else {
						local799 = this.anIntArray282[local790 & 0xFF];
						@Pc(810) int local810;
						@Pc(818) int local818;
						@Pc(826) int local826;
						if (local682 == 255) {
							local810 = (local799 & 0xFF0000) * local532 & 0xFF000000;
							local818 = (local799 & 0xFF00) * local539 & 0xFF0000;
							local826 = (local799 & 0xFF) * local678 & 0xFF00;
							local160[local27++] = (local810 | local818 | local826) >>> 8;
						} else {
							local810 = (local799 & 0xFF0000) * local532 & 0xFF000000;
							local818 = (local799 & 0xFF00) * local539 & 0xFF0000;
							local826 = (local799 & 0xFF) * local678 & 0xFF00;
							local799 = (local810 | local818 | local826) >>> 8;
							@Pc(838) int local838 = local160[local27];
							local160[local27++] = ((local799 & 0xFF00FF) * local682 + (local838 & 0xFF00FF) * local776 & 0xFF00FF00) + ((local799 & 0xFF00) * local682 + (local838 & 0xFF00) * local776 & 0xFF0000) >> 8;
						}
					}
				}
				local27 += local39;
				local29 += local41;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass135_Sub1_11.method2713()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt7261;
		arg1 += super.anInt7281;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass135_Sub1_11.anInt3418;
		@Pc(26) int local26 = super.anInt7256;
		@Pc(29) int local29 = super.anInt7275;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass135_Sub1_11.anInt3422) {
			local52 = super.aClass135_Sub1_11.anInt3422 - arg1;
			local29 -= local52;
			arg1 = super.aClass135_Sub1_11.anInt3422;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass135_Sub1_11.anInt3419) {
			local29 -= arg1 + local29 - super.aClass135_Sub1_11.anInt3419;
		}
		if (arg0 < super.aClass135_Sub1_11.anInt3430) {
			local52 = super.aClass135_Sub1_11.anInt3430 - arg0;
			local26 -= local52;
			arg0 = super.aClass135_Sub1_11.anInt3430;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass135_Sub1_11.anInt3423) {
			local52 = arg0 + local26 - super.aClass135_Sub1_11.anInt3423;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class71_Sub2 local159 = (Class71_Sub2) arg2;
		@Pc(162) int[] local162 = local159.anIntArray445;
		@Pc(165) int[] local165 = local159.anIntArray444;
		@Pc(169) int[] local169 = super.aClass135_Sub1_11.anIntArray260;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt7256;
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
				@Pc(311) byte local311 = this.aByteArray43[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = this.anIntArray282[local311 & 0xFF];
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method5830(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass135_Sub1_11.anIntArray260;
		@Pc(186) int local186;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) byte local111;
		if (Static201.anInt7255 == 0) {
			if (Static201.anInt7271 == 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static201.anInt7278;
						local25 = Static201.anInt7259;
						local27 = Static201.anInt7258;
						local29 = Static201.anInt7274;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt7256 << 12) < 0 && local27 - (super.anInt7275 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static201.anInt7278 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static201.anInt7255 * local64;
								local27 += Static201.anInt7271 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray282[local111 & 0xFF];
								}
								local29++;
							}
						}
					}
					local9++;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else if (Static201.anInt7271 < 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static201.anInt7278;
						local25 = Static201.anInt7259;
						local27 = Static201.anInt7258 + Static201.anInt7282;
						local29 = Static201.anInt7274;
						if (local25 >= 0 && local25 - (super.anInt7256 << 12) < 0) {
							@Pc(179) int local179;
							if ((local179 = local27 - (super.anInt7275 << 12)) >= 0) {
								local186 = (Static201.anInt7271 - local179) / Static201.anInt7271;
								local29 += local186;
								local27 += Static201.anInt7271 * local186;
								local23 += local186;
							}
							@Pc(207) int local207;
							if ((local207 = (local27 - Static201.anInt7271) / Static201.anInt7271) > local29) {
								local29 = local207;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static201.anInt7278 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static201.anInt7255 * local64;
								local27 += Static201.anInt7271 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray282[local111 & 0xFF];
								}
								local27 += Static201.anInt7271;
								local29++;
							}
						}
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static201.anInt7278;
						local25 = Static201.anInt7259;
						local27 = Static201.anInt7258 + Static201.anInt7282;
						local29 = Static201.anInt7274;
						if (local25 >= 0 && local25 - (super.anInt7256 << 12) < 0) {
							if (local27 < 0) {
								local186 = (Static201.anInt7271 - local27 - 1) / Static201.anInt7271;
								local29 += local186;
								local27 += Static201.anInt7271 * local186;
								local23 += local186;
							}
							@Pc(379) int local379;
							if ((local379 = (local27 + 1 - (super.anInt7275 << 12) - Static201.anInt7271) / Static201.anInt7271) > local29) {
								local29 = local379;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static201.anInt7278 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static201.anInt7255 * local64;
								local27 += Static201.anInt7271 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray282[local111 & 0xFF];
								}
								local27 += Static201.anInt7271;
								local29++;
							}
						}
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7278 += Static201.anInt7284;
				}
			}
		} else if (Static201.anInt7255 < 0) {
			if (Static201.anInt7271 == 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static201.anInt7278;
						local25 = Static201.anInt7259 + Static201.anInt7272;
						local27 = Static201.anInt7258;
						local29 = Static201.anInt7274;
						if (local27 >= 0 && local27 - (super.anInt7275 << 12) < 0) {
							@Pc(525) int local525;
							if ((local525 = local25 - (super.anInt7256 << 12)) >= 0) {
								local186 = (Static201.anInt7255 - local525) / Static201.anInt7255;
								local29 += local186;
								local25 += Static201.anInt7255 * local186;
								local23 += local186;
							}
							@Pc(553) int local553;
							if ((local553 = (local25 - Static201.anInt7255) / Static201.anInt7255) > local29) {
								local29 = local553;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static201.anInt7278 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static201.anInt7255 * local64;
								local27 += Static201.anInt7271 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray282[local111 & 0xFF];
								}
								local25 += Static201.anInt7255;
								local29++;
							}
						}
					}
					local9++;
					Static201.anInt7258 += Static201.anInt7276;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else if (Static201.anInt7271 < 0) {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static201.anInt7278;
						local25 = Static201.anInt7259 + Static201.anInt7272;
						local27 = Static201.anInt7258 + Static201.anInt7282;
						local29 = Static201.anInt7274;
						@Pc(690) int local690;
						if ((local690 = local25 - (super.anInt7256 << 12)) >= 0) {
							local186 = (Static201.anInt7255 - local690) / Static201.anInt7255;
							local29 += local186;
							local25 += Static201.anInt7255 * local186;
							local27 += Static201.anInt7271 * local186;
							local23 += local186;
						}
						@Pc(724) int local724;
						if ((local724 = (local25 - Static201.anInt7255) / Static201.anInt7255) > local29) {
							local29 = local724;
						}
						@Pc(736) int local736;
						if ((local736 = local27 - (super.anInt7275 << 12)) >= 0) {
							local186 = (Static201.anInt7271 - local736) / Static201.anInt7271;
							local29 += local186;
							local25 += Static201.anInt7255 * local186;
							local27 += Static201.anInt7271 * local186;
							local23 += local186;
						}
						@Pc(770) int local770;
						if ((local770 = (local27 - Static201.anInt7271) / Static201.anInt7271) > local29) {
							local29 = local770;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static201.anInt7278 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static201.anInt7255 * local64;
							local27 += Static201.anInt7271 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray282[local111 & 0xFF];
							}
							local25 += Static201.anInt7255;
							local27 += Static201.anInt7271;
							local29++;
						}
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7258 += Static201.anInt7276;
					Static201.anInt7278 += Static201.anInt7284;
				}
			} else {
				local9 = Static201.anInt7267;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static201.anInt7278;
						local25 = Static201.anInt7259 + Static201.anInt7272;
						local27 = Static201.anInt7258 + Static201.anInt7282;
						local29 = Static201.anInt7274;
						@Pc(913) int local913;
						if ((local913 = local25 - (super.anInt7256 << 12)) >= 0) {
							local186 = (Static201.anInt7255 - local913) / Static201.anInt7255;
							local29 += local186;
							local25 += Static201.anInt7255 * local186;
							local27 += Static201.anInt7271 * local186;
							local23 += local186;
						}
						@Pc(947) int local947;
						if ((local947 = (local25 - Static201.anInt7255) / Static201.anInt7255) > local29) {
							local29 = local947;
						}
						if (local27 < 0) {
							local186 = (Static201.anInt7271 - local27 - 1) / Static201.anInt7271;
							local29 += local186;
							local25 += Static201.anInt7255 * local186;
							local27 += Static201.anInt7271 * local186;
							local23 += local186;
						}
						@Pc(995) int local995;
						if ((local995 = (local27 + 1 - (super.anInt7275 << 12) - Static201.anInt7271) / Static201.anInt7271) > local29) {
							local29 = local995;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static201.anInt7278 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static201.anInt7255 * local64;
							local27 += Static201.anInt7271 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray282[local111 & 0xFF];
							}
							local25 += Static201.anInt7255;
							local27 += Static201.anInt7271;
							local29++;
						}
					}
					local9++;
					Static201.anInt7259 += Static201.anInt7285;
					Static201.anInt7258 += Static201.anInt7276;
					Static201.anInt7278 += Static201.anInt7284;
				}
			}
		} else if (Static201.anInt7271 == 0) {
			local9 = Static201.anInt7267;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static201.anInt7278;
					local25 = Static201.anInt7259 + Static201.anInt7272;
					local27 = Static201.anInt7258;
					local29 = Static201.anInt7274;
					if (local27 >= 0 && local27 - (super.anInt7275 << 12) < 0) {
						if (local25 < 0) {
							local186 = (Static201.anInt7255 - local25 - 1) / Static201.anInt7255;
							local29 += local186;
							local25 += Static201.anInt7255 * local186;
							local23 += local186;
						}
						@Pc(1177) int local1177;
						if ((local1177 = (local25 + 1 - (super.anInt7256 << 12) - Static201.anInt7255) / Static201.anInt7255) > local29) {
							local29 = local1177;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static201.anInt7278 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static201.anInt7255 * local64;
							local27 += Static201.anInt7271 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray282[local111 & 0xFF];
							}
							local25 += Static201.anInt7255;
							local29++;
						}
					}
				}
				local9++;
				Static201.anInt7259 += Static201.anInt7285;
				Static201.anInt7258 += Static201.anInt7276;
				Static201.anInt7278 += Static201.anInt7284;
			}
		} else if (Static201.anInt7271 < 0) {
			local9 = Static201.anInt7267;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static201.anInt7278;
					local25 = Static201.anInt7259 + Static201.anInt7272;
					local27 = Static201.anInt7258 + Static201.anInt7282;
					local29 = Static201.anInt7274;
					if (local25 < 0) {
						local186 = (Static201.anInt7255 - local25 - 1) / Static201.anInt7255;
						local29 += local186;
						local25 += Static201.anInt7255 * local186;
						local27 += Static201.anInt7271 * local186;
						local23 += local186;
					}
					@Pc(1354) int local1354;
					if ((local1354 = (local25 + 1 - (super.anInt7256 << 12) - Static201.anInt7255) / Static201.anInt7255) > local29) {
						local29 = local1354;
					}
					@Pc(1366) int local1366;
					if ((local1366 = local27 - (super.anInt7275 << 12)) >= 0) {
						local186 = (Static201.anInt7271 - local1366) / Static201.anInt7271;
						local29 += local186;
						local25 += Static201.anInt7255 * local186;
						local27 += Static201.anInt7271 * local186;
						local23 += local186;
					}
					@Pc(1400) int local1400;
					if ((local1400 = (local27 - Static201.anInt7271) / Static201.anInt7271) > local29) {
						local29 = local1400;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static201.anInt7278 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static201.anInt7255 * local64;
						local27 += Static201.anInt7271 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray282[local111 & 0xFF];
						}
						local25 += Static201.anInt7255;
						local27 += Static201.anInt7271;
						local29++;
					}
				}
				local9++;
				Static201.anInt7259 += Static201.anInt7285;
				Static201.anInt7258 += Static201.anInt7276;
				Static201.anInt7278 += Static201.anInt7284;
			}
		} else {
			local9 = Static201.anInt7267;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static201.anInt7278;
					local25 = Static201.anInt7259 + Static201.anInt7272;
					local27 = Static201.anInt7258 + Static201.anInt7282;
					local29 = Static201.anInt7274;
					if (local25 < 0) {
						local186 = (Static201.anInt7255 - local25 - 1) / Static201.anInt7255;
						local29 += local186;
						local25 += Static201.anInt7255 * local186;
						local27 += Static201.anInt7271 * local186;
						local23 += local186;
					}
					@Pc(1579) int local1579;
					if ((local1579 = (local25 + 1 - (super.anInt7256 << 12) - Static201.anInt7255) / Static201.anInt7255) > local29) {
						local29 = local1579;
					}
					if (local27 < 0) {
						local186 = (Static201.anInt7271 - local27 - 1) / Static201.anInt7271;
						local29 += local186;
						local25 += Static201.anInt7255 * local186;
						local27 += Static201.anInt7271 * local186;
						local23 += local186;
					}
					@Pc(1627) int local1627;
					if ((local1627 = (local27 + 1 - (super.anInt7275 << 12) - Static201.anInt7271) / Static201.anInt7271) > local29) {
						local29 = local1627;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static201.anInt7278 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static201.anInt7255 * local64;
						local27 += Static201.anInt7271 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.aByteArray43[(local27 >> 12) * super.anInt7256 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray282[local111 & 0xFF];
						}
						local25 += Static201.anInt7255;
						local27 += Static201.anInt7271;
						local29++;
					}
				}
				local9++;
				Static201.anInt7259 += Static201.anInt7285;
				Static201.anInt7258 += Static201.anInt7276;
				Static201.anInt7278 += Static201.anInt7284;
			}
		}
	}
}
