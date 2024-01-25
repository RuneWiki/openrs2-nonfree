import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class103_Sub2_Sub3 extends Class103_Sub2 {

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
	private final int[] anIntArray548;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!fga;[B[III)V")
	public Class103_Sub2_Sub3(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg3, arg4);
		this.aByteArray87 = arg1;
		this.anIntArray548 = arg2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass82_Sub2_11.method2700()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass82_Sub2_11.anInt3098;
			@Pc(29) int local29 = super.anInt8644 + super.anInt8627 + super.anInt8637;
			@Pc(38) int local38 = super.anInt8630 + super.anInt8649 + super.anInt8646;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt8644 > 0) {
				local64 = ((super.anInt8644 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 = local64 * local44 - (super.anInt8644 << 16);
			}
			if (super.anInt8630 > 0) {
				local64 = ((super.anInt8630 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 = local64 * local50 - (super.anInt8630 << 16);
			}
			if (super.anInt8627 < local29) {
				arg2 = ((super.anInt8627 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt8649 < local38) {
				arg3 = ((super.anInt8649 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass82_Sub2_11.anInt3091) {
				arg3 -= arg1 + arg3 - super.aClass82_Sub2_11.anInt3091;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass82_Sub2_11.anInt3083) {
				local180 = super.aClass82_Sub2_11.anInt3083 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass82_Sub2_11.anInt3096) {
				local180 = arg0 + arg2 - super.aClass82_Sub2_11.anInt3096;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass82_Sub2_11.anInt3103) {
				local180 = super.aClass82_Sub2_11.anInt3103 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass82_Sub2_11.anIntArray193;
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
							local270 = (local16 >> 16) * super.anInt8627;
							for (local273 = -arg2; local273 < 0; local273++) {
								local446 = this.aByteArray87[(local14 >> 16) + local270];
								if (local446 == 0) {
									local64++;
								} else {
									local252[local64++] = this.anIntArray548[local446 & 0xFF];
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
									local335 = (local16 >> 16) * super.anInt8627;
									for (local343 = -arg2; local343 < 0; local343++) {
										local735 = this.aByteArray87[(local14 >> 16) + local335];
										if (local735 == 0) {
											local64++;
										} else {
											local361 = this.anIntArray548[local735 & 0xFF];
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
									local361 = (local16 >> 16) * super.anInt8627;
									for (local369 = -arg2; local369 < 0; local369++) {
										@Pc(852) byte local852 = this.aByteArray87[(local14 >> 16) + local361];
										if (local852 == 0) {
											local64++;
										} else {
											local385 = this.anIntArray548[local852 & 0xFF];
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
								local335 = (local16 >> 16) * super.anInt8627;
								for (local343 = -arg2; local343 < 0; local343++) {
									local735 = this.aByteArray87[(local14 >> 16) + local335];
									local361 = local735 > 0 ? this.anIntArray548[local735] : 0;
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
								local346 = (local16 >> 16) * super.anInt8627;
								for (local361 = -arg2; local361 < 0; local361++) {
									local1196 = this.aByteArray87[(local14 >> 16) + local346];
									if (local1196 == 0) {
										local64++;
									} else {
										local377 = this.anIntArray548[local1196 & 0xFF];
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
						local270 = (local16 >> 16) * super.anInt8627;
						for (local273 = -arg2; local273 < 0; local273++) {
							local446 = this.aByteArray87[(local14 >> 16) + local270];
							if (local446 == 0) {
								local64++;
							} else {
								local343 = this.anIntArray548[local446 & 0xFF];
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
						local343 = (local16 >> 16) * super.anInt8627;
						for (local346 = -arg2; local346 < 0; local346++) {
							@Pc(1406) byte local1406 = this.aByteArray87[(local14 >> 16) + local343];
							if (local1406 == 0) {
								local64++;
							} else {
								local369 = this.anIntArray548[local1406 & 0xFF];
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
						local270 = (local16 >> 16) * super.anInt8627;
						for (local273 = -arg2; local273 < 0; local273++) {
							local446 = this.aByteArray87[(local14 >> 16) + local270];
							local343 = local446 > 0 ? this.anIntArray548[local446] : 0;
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
						local346 = (local16 >> 16) * super.anInt8627;
						for (local361 = -arg2; local361 < 0; local361++) {
							local1196 = this.aByteArray87[(local14 >> 16) + local346];
							if (local1196 == 0) {
								local64++;
							} else {
								local377 = this.anIntArray548[local1196 & 0xFF];
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
					local270 = (local16 >> 16) * super.anInt8627;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray548[this.aByteArray87[(local14 >> 16) + local270] & 0xFF];
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
					local343 = (local16 >> 16) * super.anInt8627;
					for (local346 = -arg2; local346 < 0; local346++) {
						local361 = this.anIntArray548[this.aByteArray87[(local14 >> 16) + local343] & 0xFF];
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
					local270 = (local16 >> 16) * super.anInt8627;
					for (local273 = -arg2; local273 < 0; local273++) {
						local446 = this.aByteArray87[(local14 >> 16) + local270];
						local343 = local446 > 0 ? this.anIntArray548[local446] : 0;
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
					local346 = (local16 >> 16) * super.anInt8627;
					for (local361 = -arg2; local361 < 0; local361++) {
						local369 = this.anIntArray548[this.aByteArray87[(local14 >> 16) + local346] & 0xFF];
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

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
	@Override
	protected void method7467(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass82_Sub2_11.anIntArray193;
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
		if (Static593.anInt8648 == 0) {
			if (Static593.anInt8653 == 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local12 = Static593.anInt8642;
					local14 = Static593.anInt8643;
					local16 = Static593.anInt8650;
					local18 = Static593.anInt8652;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt8627 << 12) < 0 && local16 - (super.anInt8649 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray548[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
										local264 = Static593.anInt8631 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static593.anInt8638 == 255) {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray87[local48];
								local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
								local264 = Static593.anInt8631;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static593.anInt8638 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else if (Static593.anInt8653 < 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local12 = Static593.anInt8642;
					local14 = Static593.anInt8643;
					local16 = Static593.anInt8650 + Static593.anInt8656;
					local18 = Static593.anInt8652;
					if (local14 >= 0 && local14 - (super.anInt8627 << 12) < 0) {
						@Pc(928) int local928;
						if ((local928 = local16 - (super.anInt8649 << 12)) >= 0) {
							local935 = (Static593.anInt8653 - local928) / Static593.anInt8653;
							local18 += local935;
							local16 += Static593.anInt8653 * local935;
							local12 += local935;
						}
						@Pc(956) int local956;
						if ((local956 = (local16 - Static593.anInt8653) / Static593.anInt8653) > local18) {
							local18 = local956;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray548[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
										local264 = Static593.anInt8631 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static593.anInt8638 == 255) {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray87[local48];
								local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
								local264 = Static593.anInt8631;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static593.anInt8638 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static593.anInt8653;
							local18++;
						}
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local12 = Static593.anInt8642;
					local14 = Static593.anInt8643;
					local16 = Static593.anInt8650 + Static593.anInt8656;
					local18 = Static593.anInt8652;
					if (local14 >= 0 && local14 - (super.anInt8627 << 12) < 0) {
						if (local16 < 0) {
							local935 = (Static593.anInt8653 - local16 - 1) / Static593.anInt8653;
							local18 += local935;
							local16 += Static593.anInt8653 * local935;
							local12 += local935;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local16 + 1 - (super.anInt8649 << 12) - Static593.anInt8653) / Static593.anInt8653) > local18) {
							local18 = local1888;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray548[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
										local264 = Static593.anInt8631 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static593.anInt8638 == 255) {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray87[local48];
								local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
								local264 = Static593.anInt8631;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static593.anInt8638 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static593.anInt8653;
							local18++;
						}
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8642 += Static593.anInt8640;
				}
			}
		} else if (Static593.anInt8648 < 0) {
			if (Static593.anInt8653 == 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local12 = Static593.anInt8642;
					local14 = Static593.anInt8643 + Static593.anInt8635;
					local16 = Static593.anInt8650;
					local18 = Static593.anInt8652;
					if (local16 >= 0 && local16 - (super.anInt8649 << 12) < 0) {
						@Pc(2794) int local2794;
						if ((local2794 = local14 - (super.anInt8627 << 12)) >= 0) {
							local935 = (Static593.anInt8648 - local2794) / Static593.anInt8648;
							local18 += local935;
							local14 += Static593.anInt8648 * local935;
							local12 += local935;
						}
						@Pc(2822) int local2822;
						if ((local2822 = (local14 - Static593.anInt8648) / Static593.anInt8648) > local18) {
							local18 = local2822;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray548[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
										local264 = Static593.anInt8631 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static593.anInt8638 == 255) {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray87[local48];
								local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
								local264 = Static593.anInt8631;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static593.anInt8638 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray87[local48];
								if (local227 != 0) {
									local255 = this.anIntArray548[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static593.anInt8648;
							local18++;
						}
					}
					local9++;
					Static593.anInt8650 += Static593.anInt8651;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else if (Static593.anInt8653 < 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local12 = Static593.anInt8642;
					local14 = Static593.anInt8643 + Static593.anInt8635;
					local16 = Static593.anInt8650 + Static593.anInt8656;
					local18 = Static593.anInt8652;
					@Pc(3719) int local3719;
					if ((local3719 = local14 - (super.anInt8627 << 12)) >= 0) {
						local935 = (Static593.anInt8648 - local3719) / Static593.anInt8648;
						local18 += local935;
						local14 += Static593.anInt8648 * local935;
						local16 += Static593.anInt8653 * local935;
						local12 += local935;
					}
					@Pc(3753) int local3753;
					if ((local3753 = (local14 - Static593.anInt8648) / Static593.anInt8648) > local18) {
						local18 = local3753;
					}
					@Pc(3765) int local3765;
					if ((local3765 = local16 - (super.anInt8649 << 12)) >= 0) {
						local935 = (Static593.anInt8653 - local3765) / Static593.anInt8653;
						local18 += local935;
						local14 += Static593.anInt8648 * local935;
						local16 += Static593.anInt8653 * local935;
						local12 += local935;
					}
					@Pc(3799) int local3799;
					if ((local3799 = (local16 - Static593.anInt8653) / Static593.anInt8653) > local18) {
						local18 = local3799;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray548[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local255 = this.anIntArray548[local227 & 0xFF];
								if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
									local264 = Static593.anInt8631 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static593.anInt8638 == 255) {
									local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray87[local48];
							local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
							local264 = Static593.anInt8631;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static593.anInt8638 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local255 = this.anIntArray548[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static593.anInt8648;
						local16 += Static593.anInt8653;
						local18++;
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8650 += Static593.anInt8651;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local12 = Static593.anInt8642;
					local14 = Static593.anInt8643 + Static593.anInt8635;
					local16 = Static593.anInt8650 + Static593.anInt8656;
					local18 = Static593.anInt8652;
					@Pc(4702) int local4702;
					if ((local4702 = local14 - (super.anInt8627 << 12)) >= 0) {
						local935 = (Static593.anInt8648 - local4702) / Static593.anInt8648;
						local18 += local935;
						local14 += Static593.anInt8648 * local935;
						local16 += Static593.anInt8653 * local935;
						local12 += local935;
					}
					@Pc(4736) int local4736;
					if ((local4736 = (local14 - Static593.anInt8648) / Static593.anInt8648) > local18) {
						local18 = local4736;
					}
					if (local16 < 0) {
						local935 = (Static593.anInt8653 - local16 - 1) / Static593.anInt8653;
						local18 += local935;
						local14 += Static593.anInt8648 * local935;
						local16 += Static593.anInt8653 * local935;
						local12 += local935;
					}
					@Pc(4784) int local4784;
					if ((local4784 = (local16 + 1 - (super.anInt8649 << 12) - Static593.anInt8653) / Static593.anInt8653) > local18) {
						local18 = local4784;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray548[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local255 = this.anIntArray548[local227 & 0xFF];
								if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
									local264 = Static593.anInt8631 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static593.anInt8638 == 255) {
									local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray87[local48];
							local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
							local264 = Static593.anInt8631;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static593.anInt8638 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local255 = this.anIntArray548[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static593.anInt8648;
						local16 += Static593.anInt8653;
						local18++;
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8650 += Static593.anInt8651;
					Static593.anInt8642 += Static593.anInt8640;
				}
			}
		} else if (Static593.anInt8653 == 0) {
			local9 = Static593.anInt8632;
			while (local9 < 0) {
				local12 = Static593.anInt8642;
				local14 = Static593.anInt8643 + Static593.anInt8635;
				local16 = Static593.anInt8650;
				local18 = Static593.anInt8652;
				if (local16 >= 0 && local16 - (super.anInt8649 << 12) < 0) {
					if (local14 < 0) {
						local935 = (Static593.anInt8648 - local14 - 1) / Static593.anInt8648;
						local18 += local935;
						local14 += Static593.anInt8648 * local935;
						local12 += local935;
					}
					@Pc(5726) int local5726;
					if ((local5726 = (local14 + 1 - (super.anInt8627 << 12) - Static593.anInt8648) / Static593.anInt8648) > local18) {
						local18 = local5726;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray548[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local255 = this.anIntArray548[local227 & 0xFF];
								if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
									local264 = Static593.anInt8631 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static593.anInt8638 == 255) {
									local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray87[local48];
							local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
							local264 = Static593.anInt8631;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static593.anInt8638 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray87[local48];
							if (local227 != 0) {
								local255 = this.anIntArray548[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static593.anInt8648;
						local18++;
					}
				}
				local9++;
				Static593.anInt8643 += Static593.anInt8636;
				Static593.anInt8650 += Static593.anInt8651;
				Static593.anInt8642 += Static593.anInt8640;
			}
		} else if (Static593.anInt8653 < 0) {
			for (local9 = Static593.anInt8632; local9 < 0; local9++) {
				local12 = Static593.anInt8642;
				local14 = Static593.anInt8643 + Static593.anInt8635;
				local16 = Static593.anInt8650 + Static593.anInt8656;
				local18 = Static593.anInt8652;
				if (local14 < 0) {
					local935 = (Static593.anInt8648 - local14 - 1) / Static593.anInt8648;
					local18 += local935;
					local14 += Static593.anInt8648 * local935;
					local16 += Static593.anInt8653 * local935;
					local12 += local935;
				}
				@Pc(6663) int local6663;
				if ((local6663 = (local14 + 1 - (super.anInt8627 << 12) - Static593.anInt8648) / Static593.anInt8648) > local18) {
					local18 = local6663;
				}
				@Pc(6675) int local6675;
				if ((local6675 = local16 - (super.anInt8649 << 12)) >= 0) {
					local935 = (Static593.anInt8653 - local6675) / Static593.anInt8653;
					local18 += local935;
					local14 += Static593.anInt8648 * local935;
					local16 += Static593.anInt8653 * local935;
					local12 += local935;
				}
				@Pc(6709) int local6709;
				if ((local6709 = (local16 - Static593.anInt8653) / Static593.anInt8653) > local18) {
					local18 = local6709;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local227 = this.aByteArray87[local48];
						if (local227 != 0) {
							local3[local51] = this.anIntArray548[local227 & 0xFF];
						}
					} else if (arg0 == 0) {
						local227 = this.aByteArray87[local48];
						if (local227 != 0) {
							local255 = this.anIntArray548[local227 & 0xFF];
							if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
								local264 = Static593.anInt8631 >>> 24;
								local268 = 256 - local264;
								local272 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
							} else if (Static593.anInt8638 == 255) {
								local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
								local3[local51] = (local264 | local268 | local272) >>> 8;
							} else {
								local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
								local255 = (local264 | local268 | local272) >>> 8;
								local344 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local227 = this.aByteArray87[local48];
						local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
						local264 = Static593.anInt8631;
						local268 = local255 + local264;
						local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
						local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
						local344 = local268 - local344 | local344 - (local344 >>> 8);
						if (local255 == 0 && Static593.anInt8638 != 255) {
							local255 = local344;
							local344 = local3[local51];
							local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
						}
						local3[local51] = local344;
					} else if (arg0 == 2) {
						local227 = this.aByteArray87[local48];
						if (local227 != 0) {
							local255 = this.anIntArray548[local227 & 0xFF];
							local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
							local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
							local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static593.anInt8648;
					local16 += Static593.anInt8653;
					local18++;
				}
				Static593.anInt8643 += Static593.anInt8636;
				Static593.anInt8650 += Static593.anInt8651;
				Static593.anInt8642 += Static593.anInt8640;
			}
		} else {
			for (local9 = Static593.anInt8632; local9 < 0; local9++) {
				local12 = Static593.anInt8642;
				local14 = Static593.anInt8643 + Static593.anInt8635;
				local16 = Static593.anInt8650 + Static593.anInt8656;
				local18 = Static593.anInt8652;
				if (local14 < 0) {
					local935 = (Static593.anInt8648 - local14 - 1) / Static593.anInt8648;
					local18 += local935;
					local14 += Static593.anInt8648 * local935;
					local16 += Static593.anInt8653 * local935;
					local12 += local935;
				}
				@Pc(7648) int local7648;
				if ((local7648 = (local14 + 1 - (super.anInt8627 << 12) - Static593.anInt8648) / Static593.anInt8648) > local18) {
					local18 = local7648;
				}
				if (local16 < 0) {
					local935 = (Static593.anInt8653 - local16 - 1) / Static593.anInt8653;
					local18 += local935;
					local14 += Static593.anInt8648 * local935;
					local16 += Static593.anInt8653 * local935;
					local12 += local935;
				}
				@Pc(7696) int local7696;
				if ((local7696 = (local16 + 1 - (super.anInt8649 << 12) - Static593.anInt8653) / Static593.anInt8653) > local18) {
					local18 = local7696;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt8627 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local227 = this.aByteArray87[local48];
						if (local227 != 0) {
							local3[local51] = this.anIntArray548[local227 & 0xFF];
						}
					} else if (arg0 == 0) {
						local227 = this.aByteArray87[local48];
						if (local227 != 0) {
							local255 = this.anIntArray548[local227 & 0xFF];
							if ((Static593.anInt8631 & 0xFFFFFF) == 16777215) {
								local264 = Static593.anInt8631 >>> 24;
								local268 = 256 - local264;
								local272 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
							} else if (Static593.anInt8638 == 255) {
								local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
								local3[local51] = (local264 | local268 | local272) >>> 8;
							} else {
								local264 = (local255 & 0xFF0000) * Static593.anInt8628 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static593.anInt8633 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static593.anInt8654 & 0xFF00;
								local255 = (local264 | local268 | local272) >>> 8;
								local344 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local227 = this.aByteArray87[local48];
						local255 = local227 > 0 ? this.anIntArray548[local227] : 0;
						local264 = Static593.anInt8631;
						local268 = local255 + local264;
						local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
						local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
						local344 = local268 - local344 | local344 - (local344 >>> 8);
						if (local255 == 0 && Static593.anInt8638 != 255) {
							local255 = local344;
							local344 = local3[local51];
							local344 = ((local255 & 0xFF00FF) * Static593.anInt8638 + (local344 & 0xFF00FF) * Static593.anInt8639 & 0xFF00FF00) + ((local255 & 0xFF00) * Static593.anInt8638 + (local344 & 0xFF00) * Static593.anInt8639 & 0xFF0000) >> 8;
						}
						local3[local51] = local344;
					} else if (arg0 == 2) {
						local227 = this.aByteArray87[local48];
						if (local227 != 0) {
							local255 = this.anIntArray548[local227 & 0xFF];
							local264 = (local255 & 0xFF00FF) * Static593.anInt8638 & 0xFF00FF00;
							local268 = (local255 & 0xFF00) * Static593.anInt8638 & 0xFF0000;
							local3[local51++] = ((local264 | local268) >>> 8) + Static593.anInt8647;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static593.anInt8648;
					local16 += Static593.anInt8653;
					local18++;
				}
				Static593.anInt8643 += Static593.anInt8636;
				Static593.anInt8650 += Static593.anInt8651;
				Static593.anInt8642 += Static593.anInt8640;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass82_Sub2_11.method2700()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt8644;
		arg1 += super.anInt8630;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass82_Sub2_11.anInt3098;
		@Pc(26) int local26 = super.anInt8627;
		@Pc(29) int local29 = super.anInt8649;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass82_Sub2_11.anInt3083) {
			local52 = super.aClass82_Sub2_11.anInt3083 - arg1;
			local29 -= local52;
			arg1 = super.aClass82_Sub2_11.anInt3083;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass82_Sub2_11.anInt3091) {
			local29 -= arg1 + local29 - super.aClass82_Sub2_11.anInt3091;
		}
		if (arg0 < super.aClass82_Sub2_11.anInt3103) {
			local52 = super.aClass82_Sub2_11.anInt3103 - arg0;
			local26 -= local52;
			arg0 = super.aClass82_Sub2_11.anInt3103;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass82_Sub2_11.anInt3096) {
			local52 = arg0 + local26 - super.aClass82_Sub2_11.anInt3096;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class1_Sub3 local159 = (Class1_Sub3) arg2;
		@Pc(162) int[] local162 = local159.anIntArray590;
		@Pc(165) int[] local165 = local159.anIntArray591;
		@Pc(169) int[] local169 = super.aClass82_Sub2_11.anIntArray193;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt8627;
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
				@Pc(311) byte local311 = this.aByteArray87[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = this.anIntArray548[local311 & 0xFF];
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17 = super.anInt8644 + super.anInt8627 + super.anInt8637;
		@Pc(26) int local26 = super.anInt8630 + super.anInt8649 + super.anInt8646;
		@Pc(32) int local32 = (local17 << 16) / arg3;
		@Pc(38) int local38 = (local26 << 16) / arg4;
		@Pc(52) int local52;
		if (super.anInt8644 > 0) {
			local52 = ((super.anInt8644 << 16) + local32 - 1) / local32;
			arg0 += local52;
			local6 = local52 * local32 - (super.anInt8644 << 16);
		}
		if (super.anInt8630 > 0) {
			local52 = ((super.anInt8630 << 16) + local38 - 1) / local38;
			arg1 += local52;
			local8 = local52 * local38 - (super.anInt8630 << 16);
		}
		if (super.anInt8627 < local17) {
			arg3 = ((super.anInt8627 << 16) + local32 - local6 - 1) / local32;
		}
		if (super.anInt8649 < local26) {
			arg4 = ((super.anInt8649 << 16) + local38 - local8 - 1) / local38;
		}
		local52 = arg0 + arg1 * super.aClass82_Sub2_11.anInt3098;
		@Pc(144) int local144 = super.aClass82_Sub2_11.anInt3098 - arg3;
		if (arg1 + arg4 > super.aClass82_Sub2_11.anInt3091) {
			arg4 -= arg1 + arg4 - super.aClass82_Sub2_11.anInt3091;
		}
		@Pc(172) int local172;
		if (arg1 < super.aClass82_Sub2_11.anInt3083) {
			local172 = super.aClass82_Sub2_11.anInt3083 - arg1;
			arg4 -= local172;
			local52 += local172 * super.aClass82_Sub2_11.anInt3098;
			local8 += local38 * local172;
		}
		if (arg0 + arg3 > super.aClass82_Sub2_11.anInt3096) {
			local172 = arg0 + arg3 - super.aClass82_Sub2_11.anInt3096;
			arg3 -= local172;
			local144 += local172;
		}
		if (arg0 < super.aClass82_Sub2_11.anInt3103) {
			local172 = super.aClass82_Sub2_11.anInt3103 - arg0;
			arg3 -= local172;
			local52 += local172;
			local6 += local32 * local172;
			local144 += local172;
		}
		@Pc(246) float[] local246 = super.aClass82_Sub2_11.aFloatArray16;
		@Pc(250) int[] local250 = super.aClass82_Sub2_11.anIntArray193;
		@Pc(257) int local257;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(271) int local271;
		@Pc(345) int local345;
		@Pc(353) int local353;
		@Pc(356) int local356;
		@Pc(378) int local378;
		@Pc(394) int local394;
		@Pc(402) int local402;
		@Pc(578) int local578;
		@Pc(475) byte local475;
		@Pc(386) int local386;
		if (arg7 != 0) {
			@Pc(1295) byte local1295;
			@Pc(945) int local945;
			@Pc(953) int local953;
			@Pc(961) int local961;
			@Pc(973) int local973;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local257 = local6;
					for (local260 = -arg4; local260 < 0; local260++) {
						local268 = (local8 >> 16) * super.anInt8627;
						for (local271 = -arg3; local271 < 0; local271++) {
							if ((float) arg2 < local246[local52]) {
								local475 = this.aByteArray87[(local6 >> 16) + local268];
								if (local475 != 0) {
									local250[local52] = this.anIntArray548[local475 & 0xFF];
									local246[local52] = (float) arg2;
								}
							}
							local6 += local32;
							local52++;
						}
						local8 += local38;
						local6 = local257;
						local52 += local144;
					}
				} else {
					@Pc(798) byte local798;
					if (arg5 == 0) {
						local257 = local6;
						if ((arg6 & 0xFFFFFF) == 16777215) {
							local260 = arg6 >>> 24;
							local268 = 256 - local260;
							for (local271 = -arg4; local271 < 0; local271++) {
								local345 = (local8 >> 16) * super.anInt8627;
								for (local353 = -arg3; local353 < 0; local353++) {
									if ((float) arg2 < local246[local52]) {
										local798 = this.aByteArray87[(local6 >> 16) + local345];
										if (local798 != 0) {
											local378 = this.anIntArray548[local798 & 0xFF];
											local386 = local250[local52];
											local250[local52] = ((local378 & 0xFF00FF) * local260 + (local386 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local378 & 0xFF00) * local260 + (local386 & 0xFF00) * local268 & 0xFF0000) >> 8;
											local246[local52] = (float) arg2;
										}
									}
									local6 += local32;
									local52++;
								}
								local8 += local38;
								local6 = local257;
								local52 += local144;
							}
						} else {
							local260 = arg6 >> 16 & 0xFF;
							local268 = arg6 >> 8 & 0xFF;
							local271 = arg6 & 0xFF;
							local345 = arg6 >>> 24;
							local353 = 256 - local345;
							for (local356 = -arg4; local356 < 0; local356++) {
								local378 = (local8 >> 16) * super.anInt8627;
								for (local386 = -arg3; local386 < 0; local386++) {
									if ((float) arg2 < local246[local52]) {
										@Pc(925) byte local925 = this.aByteArray87[(local6 >> 16) + local378];
										if (local925 != 0) {
											local402 = this.anIntArray548[local925 & 0xFF];
											if (local345 == 255) {
												local945 = (local402 & 0xFF0000) * local260 & 0xFF000000;
												local953 = (local402 & 0xFF00) * local268 & 0xFF0000;
												local961 = (local402 & 0xFF) * local271 & 0xFF00;
												local250[local52] = (local945 | local953 | local961) >>> 8;
												local246[local52] = (float) arg2;
											} else {
												local945 = (local402 & 0xFF0000) * local260 & 0xFF000000;
												local953 = (local402 & 0xFF00) * local268 & 0xFF0000;
												local961 = (local402 & 0xFF) * local271 & 0xFF00;
												local402 = (local945 | local953 | local961) >>> 8;
												local973 = local250[local52];
												local250[local52] = ((local402 & 0xFF00FF) * local345 + (local973 & 0xFF00FF) * local353 & 0xFF00FF00) + ((local402 & 0xFF00) * local345 + (local973 & 0xFF00) * local353 & 0xFF0000) >> 8;
												local246[local52] = (float) arg2;
											}
										}
									}
									local6 += local32;
									local52++;
								}
								local8 += local38;
								local6 = local257;
								local52 += local144;
							}
						}
					} else if (arg5 == 3) {
						local257 = local6;
						local260 = arg6 >>> 24;
						local268 = 256 - local260;
						for (local271 = -arg4; local271 < 0; local271++) {
							local345 = (local8 >> 16) * super.anInt8627;
							for (local353 = -arg3; local353 < 0; local353++) {
								if ((float) arg2 < local246[local52]) {
									local798 = this.aByteArray87[(local6 >> 16) + local345];
									local378 = local798 > 0 ? this.anIntArray548[local798] : 0;
									local386 = local378 + arg6;
									local394 = (local378 & 0xFF00FF) + (arg6 & 0xFF00FF);
									local402 = (local394 & 0x1000100) + (local386 - local394 & 0x10000);
									local402 = local386 - local402 | local402 - (local402 >>> 8);
									if (local378 == 0 && local260 != 255) {
										local378 = local402;
										local402 = local250[local52];
										local402 = ((local378 & 0xFF00FF) * local260 + (local402 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local378 & 0xFF00) * local260 + (local402 & 0xFF00) * local268 & 0xFF0000) >> 8;
									}
									local250[local52] = local402;
									local246[local52] = (float) arg2;
								}
								local6 += local32;
								local52++;
							}
							local8 += local38;
							local6 = local257;
							local52 += local144;
						}
					} else if (arg5 == 2) {
						local257 = arg6 >>> 24;
						local260 = 256 - local257;
						local268 = (arg6 & 0xFF00FF) * local260 & 0xFF00FF00;
						local271 = (arg6 & 0xFF00) * local260 & 0xFF0000;
						local578 = (local268 | local271) >>> 8;
						local345 = local6;
						for (local353 = -arg4; local353 < 0; local353++) {
							local356 = (local8 >> 16) * super.anInt8627;
							for (local378 = -arg3; local378 < 0; local378++) {
								if ((float) arg2 < local246[local52]) {
									local1295 = this.aByteArray87[(local6 >> 16) + local356];
									if (local1295 != 0) {
										local394 = this.anIntArray548[local1295 & 0xFF];
										local268 = (local394 & 0xFF00FF) * local257 & 0xFF00FF00;
										local271 = (local394 & 0xFF00) * local257 & 0xFF0000;
										local250[local52] = ((local268 | local271) >>> 8) + local578;
										local246[local52] = (float) arg2;
									}
								}
								local6 += local32;
								local52++;
							}
							local8 += local38;
							local6 = local345;
							local52 += local144;
						}
					} else {
						throw new IllegalArgumentException();
					}
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local257 = local6;
				for (local260 = -arg4; local260 < 0; local260++) {
					local268 = (local8 >> 16) * super.anInt8627;
					for (local271 = -arg3; local271 < 0; local271++) {
						if ((float) arg2 < local246[local52]) {
							local475 = this.aByteArray87[(local6 >> 16) + local268];
							if (local475 != 0) {
								local353 = this.anIntArray548[local475 & 0xFF];
								local356 = local250[local52];
								local378 = local353 + local356;
								local386 = (local353 & 0xFF00FF) + (local356 & 0xFF00FF);
								local356 = (local386 & 0x1000100) + (local378 - local386 & 0x10000);
								local250[local52] = local378 - local356 | local356 - (local356 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local257;
					local52 += local144;
				}
			} else if (arg5 == 0) {
				local257 = local6;
				local260 = arg6 >> 16 & 0xFF;
				local268 = arg6 >> 8 & 0xFF;
				local271 = arg6 & 0xFF;
				for (local345 = -arg4; local345 < 0; local345++) {
					local353 = (local8 >> 16) * super.anInt8627;
					for (local356 = -arg3; local356 < 0; local356++) {
						if ((float) arg2 < local246[local52]) {
							@Pc(1525) byte local1525 = this.aByteArray87[(local6 >> 16) + local353];
							if (local1525 != 0) {
								local386 = this.anIntArray548[local1525 & 0xFF];
								local394 = (local386 & 0xFF0000) * local260 & 0xFF000000;
								local402 = (local386 & 0xFF00) * local268 & 0xFF0000;
								local945 = (local386 & 0xFF) * local271 & 0xFF00;
								local386 = (local394 | local402 | local945) >>> 8;
								local953 = local250[local52];
								local961 = local386 + local953;
								local973 = (local386 & 0xFF00FF) + (local953 & 0xFF00FF);
								local953 = (local973 & 0x1000100) + (local961 - local973 & 0x10000);
								local250[local52] = local961 - local953 | local953 - (local953 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local257;
					local52 += local144;
				}
			} else if (arg5 == 3) {
				local257 = local6;
				for (local260 = -arg4; local260 < 0; local260++) {
					local268 = (local8 >> 16) * super.anInt8627;
					for (local271 = -arg3; local271 < 0; local271++) {
						if ((float) arg2 < local246[local52]) {
							local475 = this.aByteArray87[(local6 >> 16) + local268];
							local353 = local475 > 0 ? this.anIntArray548[local475] : 0;
							local356 = local353 + arg6;
							local378 = (local353 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local386 = (local378 & 0x1000100) + (local356 - local378 & 0x10000);
							local353 = local356 - local386 | local386 - (local386 >>> 8);
							@Pc(1712) int local1712 = local250[local52];
							local356 = local353 + local1712;
							local378 = (local353 & 0xFF00FF) + (local1712 & 0xFF00FF);
							@Pc(1734) int local1734 = (local378 & 0x1000100) + (local356 - local378 & 0x10000);
							local250[local52] = local356 - local1734 | local1734 - (local1734 >>> 8);
							local246[local52] = (float) arg2;
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local257;
					local52 += local144;
				}
			} else if (arg5 == 2) {
				local257 = arg6 >>> 24;
				local260 = 256 - local257;
				local268 = (arg6 & 0xFF00FF) * local260 & 0xFF00FF00;
				local271 = (arg6 & 0xFF00) * local260 & 0xFF0000;
				local578 = (local268 | local271) >>> 8;
				local345 = local6;
				for (local353 = -arg4; local353 < 0; local353++) {
					local356 = (local8 >> 16) * super.anInt8627;
					for (local378 = -arg3; local378 < 0; local378++) {
						if ((float) arg2 < local246[local52]) {
							local1295 = this.aByteArray87[(local6 >> 16) + local356];
							if (local1295 != 0) {
								local394 = this.anIntArray548[local1295 & 0xFF];
								local268 = (local394 & 0xFF00FF) * local257 & 0xFF00FF00;
								local271 = (local394 & 0xFF00) * local257 & 0xFF0000;
								@Pc(1872) int local1872 = ((local268 | local271) >>> 8) + local578;
								local402 = local250[local52];
								local945 = local1872 + local402;
								local953 = (local1872 & 0xFF00FF) + (local402 & 0xFF00FF);
								@Pc(1898) int local1898 = (local953 & 0x1000100) + (local945 - local953 & 0x10000);
								local250[local52] = local945 - local1898 | local1898 - (local1898 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local345;
					local52 += local144;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local257 = local6;
			for (local260 = -arg4; local260 < 0; local260++) {
				local268 = (local8 >> 16) * super.anInt8627;
				for (local271 = -arg3; local271 < 0; local271++) {
					if ((float) arg2 < local246[local52]) {
						local250[local52] = this.anIntArray548[this.aByteArray87[(local6 >> 16) + local268] & 0xFF];
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local257;
				local52 += local144;
			}
		} else if (arg5 == 0) {
			local257 = arg6 >> 16 & 0xFF;
			local260 = arg6 >> 8 & 0xFF;
			local268 = arg6 & 0xFF;
			local271 = local6;
			for (local345 = -arg4; local345 < 0; local345++) {
				local353 = (local8 >> 16) * super.anInt8627;
				for (local356 = -arg3; local356 < 0; local356++) {
					if ((float) arg2 < local246[local52]) {
						local378 = this.anIntArray548[this.aByteArray87[(local6 >> 16) + local353] & 0xFF];
						local386 = (local378 & 0xFF0000) * local257 & 0xFF000000;
						local394 = (local378 & 0xFF00) * local260 & 0xFF0000;
						local402 = (local378 & 0xFF) * local268 & 0xFF00;
						local250[local52] = (local386 | local394 | local402) >>> 8;
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local271;
				local52 += local144;
			}
		} else if (arg5 == 3) {
			local257 = local6;
			for (local260 = -arg4; local260 < 0; local260++) {
				local268 = (local8 >> 16) * super.anInt8627;
				for (local271 = -arg3; local271 < 0; local271++) {
					if ((float) arg2 < local246[local52]) {
						local475 = this.aByteArray87[(local6 >> 16) + local268];
						local353 = local475 > 0 ? this.anIntArray548[local475] : 0;
						local356 = local353 + arg6;
						local378 = (local353 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local386 = (local378 & 0x1000100) + (local356 - local378 & 0x10000);
						local250[local52] = local356 - local386 | local386 - (local386 >>> 8);
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local257;
				local52 += local144;
			}
		} else if (arg5 == 2) {
			local257 = arg6 >>> 24;
			local260 = 256 - local257;
			local268 = (arg6 & 0xFF00FF) * local260 & 0xFF00FF00;
			local271 = (arg6 & 0xFF00) * local260 & 0xFF0000;
			local578 = (local268 | local271) >>> 8;
			local345 = local6;
			for (local353 = -arg4; local353 < 0; local353++) {
				local356 = (local8 >> 16) * super.anInt8627;
				for (local378 = -arg3; local378 < 0; local378++) {
					if ((float) arg2 < local246[local52]) {
						local386 = this.anIntArray548[this.aByteArray87[(local6 >> 16) + local356] & 0xFF];
						local268 = (local386 & 0xFF00FF) * local257 & 0xFF00FF00;
						local271 = (local386 & 0xFF00) * local257 & 0xFF0000;
						local250[local52] = ((local268 | local271) >>> 8) + local578;
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local345;
				local52 += local144;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method7466(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass82_Sub2_11.anIntArray193;
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
		if (Static593.anInt8648 == 0) {
			if (Static593.anInt8653 == 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static593.anInt8642;
						local25 = Static593.anInt8643;
						local27 = Static593.anInt8650;
						local29 = Static593.anInt8652;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt8627 << 12) < 0 && local27 - (super.anInt8649 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static593.anInt8642 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static593.anInt8648 * local64;
								local27 += Static593.anInt8653 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray548[local111 & 0xFF];
								}
								local29++;
							}
						}
					}
					local9++;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else if (Static593.anInt8653 < 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static593.anInt8642;
						local25 = Static593.anInt8643;
						local27 = Static593.anInt8650 + Static593.anInt8656;
						local29 = Static593.anInt8652;
						if (local25 >= 0 && local25 - (super.anInt8627 << 12) < 0) {
							@Pc(179) int local179;
							if ((local179 = local27 - (super.anInt8649 << 12)) >= 0) {
								local186 = (Static593.anInt8653 - local179) / Static593.anInt8653;
								local29 += local186;
								local27 += Static593.anInt8653 * local186;
								local23 += local186;
							}
							@Pc(207) int local207;
							if ((local207 = (local27 - Static593.anInt8653) / Static593.anInt8653) > local29) {
								local29 = local207;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static593.anInt8642 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static593.anInt8648 * local64;
								local27 += Static593.anInt8653 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray548[local111 & 0xFF];
								}
								local27 += Static593.anInt8653;
								local29++;
							}
						}
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static593.anInt8642;
						local25 = Static593.anInt8643;
						local27 = Static593.anInt8650 + Static593.anInt8656;
						local29 = Static593.anInt8652;
						if (local25 >= 0 && local25 - (super.anInt8627 << 12) < 0) {
							if (local27 < 0) {
								local186 = (Static593.anInt8653 - local27 - 1) / Static593.anInt8653;
								local29 += local186;
								local27 += Static593.anInt8653 * local186;
								local23 += local186;
							}
							@Pc(379) int local379;
							if ((local379 = (local27 + 1 - (super.anInt8649 << 12) - Static593.anInt8653) / Static593.anInt8653) > local29) {
								local29 = local379;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static593.anInt8642 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static593.anInt8648 * local64;
								local27 += Static593.anInt8653 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray548[local111 & 0xFF];
								}
								local27 += Static593.anInt8653;
								local29++;
							}
						}
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8642 += Static593.anInt8640;
				}
			}
		} else if (Static593.anInt8648 < 0) {
			if (Static593.anInt8653 == 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static593.anInt8642;
						local25 = Static593.anInt8643 + Static593.anInt8635;
						local27 = Static593.anInt8650;
						local29 = Static593.anInt8652;
						if (local27 >= 0 && local27 - (super.anInt8649 << 12) < 0) {
							@Pc(525) int local525;
							if ((local525 = local25 - (super.anInt8627 << 12)) >= 0) {
								local186 = (Static593.anInt8648 - local525) / Static593.anInt8648;
								local29 += local186;
								local25 += Static593.anInt8648 * local186;
								local23 += local186;
							}
							@Pc(553) int local553;
							if ((local553 = (local25 - Static593.anInt8648) / Static593.anInt8648) > local29) {
								local29 = local553;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static593.anInt8642 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static593.anInt8648 * local64;
								local27 += Static593.anInt8653 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray548[local111 & 0xFF];
								}
								local25 += Static593.anInt8648;
								local29++;
							}
						}
					}
					local9++;
					Static593.anInt8650 += Static593.anInt8651;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else if (Static593.anInt8653 < 0) {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static593.anInt8642;
						local25 = Static593.anInt8643 + Static593.anInt8635;
						local27 = Static593.anInt8650 + Static593.anInt8656;
						local29 = Static593.anInt8652;
						@Pc(690) int local690;
						if ((local690 = local25 - (super.anInt8627 << 12)) >= 0) {
							local186 = (Static593.anInt8648 - local690) / Static593.anInt8648;
							local29 += local186;
							local25 += Static593.anInt8648 * local186;
							local27 += Static593.anInt8653 * local186;
							local23 += local186;
						}
						@Pc(724) int local724;
						if ((local724 = (local25 - Static593.anInt8648) / Static593.anInt8648) > local29) {
							local29 = local724;
						}
						@Pc(736) int local736;
						if ((local736 = local27 - (super.anInt8649 << 12)) >= 0) {
							local186 = (Static593.anInt8653 - local736) / Static593.anInt8653;
							local29 += local186;
							local25 += Static593.anInt8648 * local186;
							local27 += Static593.anInt8653 * local186;
							local23 += local186;
						}
						@Pc(770) int local770;
						if ((local770 = (local27 - Static593.anInt8653) / Static593.anInt8653) > local29) {
							local29 = local770;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static593.anInt8642 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static593.anInt8648 * local64;
							local27 += Static593.anInt8653 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray548[local111 & 0xFF];
							}
							local25 += Static593.anInt8648;
							local27 += Static593.anInt8653;
							local29++;
						}
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8650 += Static593.anInt8651;
					Static593.anInt8642 += Static593.anInt8640;
				}
			} else {
				local9 = Static593.anInt8632;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static593.anInt8642;
						local25 = Static593.anInt8643 + Static593.anInt8635;
						local27 = Static593.anInt8650 + Static593.anInt8656;
						local29 = Static593.anInt8652;
						@Pc(913) int local913;
						if ((local913 = local25 - (super.anInt8627 << 12)) >= 0) {
							local186 = (Static593.anInt8648 - local913) / Static593.anInt8648;
							local29 += local186;
							local25 += Static593.anInt8648 * local186;
							local27 += Static593.anInt8653 * local186;
							local23 += local186;
						}
						@Pc(947) int local947;
						if ((local947 = (local25 - Static593.anInt8648) / Static593.anInt8648) > local29) {
							local29 = local947;
						}
						if (local27 < 0) {
							local186 = (Static593.anInt8653 - local27 - 1) / Static593.anInt8653;
							local29 += local186;
							local25 += Static593.anInt8648 * local186;
							local27 += Static593.anInt8653 * local186;
							local23 += local186;
						}
						@Pc(995) int local995;
						if ((local995 = (local27 + 1 - (super.anInt8649 << 12) - Static593.anInt8653) / Static593.anInt8653) > local29) {
							local29 = local995;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static593.anInt8642 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static593.anInt8648 * local64;
							local27 += Static593.anInt8653 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray548[local111 & 0xFF];
							}
							local25 += Static593.anInt8648;
							local27 += Static593.anInt8653;
							local29++;
						}
					}
					local9++;
					Static593.anInt8643 += Static593.anInt8636;
					Static593.anInt8650 += Static593.anInt8651;
					Static593.anInt8642 += Static593.anInt8640;
				}
			}
		} else if (Static593.anInt8653 == 0) {
			local9 = Static593.anInt8632;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static593.anInt8642;
					local25 = Static593.anInt8643 + Static593.anInt8635;
					local27 = Static593.anInt8650;
					local29 = Static593.anInt8652;
					if (local27 >= 0 && local27 - (super.anInt8649 << 12) < 0) {
						if (local25 < 0) {
							local186 = (Static593.anInt8648 - local25 - 1) / Static593.anInt8648;
							local29 += local186;
							local25 += Static593.anInt8648 * local186;
							local23 += local186;
						}
						@Pc(1177) int local1177;
						if ((local1177 = (local25 + 1 - (super.anInt8627 << 12) - Static593.anInt8648) / Static593.anInt8648) > local29) {
							local29 = local1177;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static593.anInt8642 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static593.anInt8648 * local64;
							local27 += Static593.anInt8653 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray548[local111 & 0xFF];
							}
							local25 += Static593.anInt8648;
							local29++;
						}
					}
				}
				local9++;
				Static593.anInt8643 += Static593.anInt8636;
				Static593.anInt8650 += Static593.anInt8651;
				Static593.anInt8642 += Static593.anInt8640;
			}
		} else if (Static593.anInt8653 < 0) {
			local9 = Static593.anInt8632;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static593.anInt8642;
					local25 = Static593.anInt8643 + Static593.anInt8635;
					local27 = Static593.anInt8650 + Static593.anInt8656;
					local29 = Static593.anInt8652;
					if (local25 < 0) {
						local186 = (Static593.anInt8648 - local25 - 1) / Static593.anInt8648;
						local29 += local186;
						local25 += Static593.anInt8648 * local186;
						local27 += Static593.anInt8653 * local186;
						local23 += local186;
					}
					@Pc(1354) int local1354;
					if ((local1354 = (local25 + 1 - (super.anInt8627 << 12) - Static593.anInt8648) / Static593.anInt8648) > local29) {
						local29 = local1354;
					}
					@Pc(1366) int local1366;
					if ((local1366 = local27 - (super.anInt8649 << 12)) >= 0) {
						local186 = (Static593.anInt8653 - local1366) / Static593.anInt8653;
						local29 += local186;
						local25 += Static593.anInt8648 * local186;
						local27 += Static593.anInt8653 * local186;
						local23 += local186;
					}
					@Pc(1400) int local1400;
					if ((local1400 = (local27 - Static593.anInt8653) / Static593.anInt8653) > local29) {
						local29 = local1400;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static593.anInt8642 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static593.anInt8648 * local64;
						local27 += Static593.anInt8653 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray548[local111 & 0xFF];
						}
						local25 += Static593.anInt8648;
						local27 += Static593.anInt8653;
						local29++;
					}
				}
				local9++;
				Static593.anInt8643 += Static593.anInt8636;
				Static593.anInt8650 += Static593.anInt8651;
				Static593.anInt8642 += Static593.anInt8640;
			}
		} else {
			local9 = Static593.anInt8632;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static593.anInt8642;
					local25 = Static593.anInt8643 + Static593.anInt8635;
					local27 = Static593.anInt8650 + Static593.anInt8656;
					local29 = Static593.anInt8652;
					if (local25 < 0) {
						local186 = (Static593.anInt8648 - local25 - 1) / Static593.anInt8648;
						local29 += local186;
						local25 += Static593.anInt8648 * local186;
						local27 += Static593.anInt8653 * local186;
						local23 += local186;
					}
					@Pc(1579) int local1579;
					if ((local1579 = (local25 + 1 - (super.anInt8627 << 12) - Static593.anInt8648) / Static593.anInt8648) > local29) {
						local29 = local1579;
					}
					if (local27 < 0) {
						local186 = (Static593.anInt8653 - local27 - 1) / Static593.anInt8653;
						local29 += local186;
						local25 += Static593.anInt8648 * local186;
						local27 += Static593.anInt8653 * local186;
						local23 += local186;
					}
					@Pc(1627) int local1627;
					if ((local1627 = (local27 + 1 - (super.anInt8649 << 12) - Static593.anInt8653) / Static593.anInt8653) > local29) {
						local29 = local1627;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static593.anInt8642 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static593.anInt8648 * local64;
						local27 += Static593.anInt8653 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.aByteArray87[(local27 >> 12) * super.anInt8627 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray548[local111 & 0xFF];
						}
						local25 += Static593.anInt8648;
						local27 += Static593.anInt8653;
						local29++;
					}
				}
				local9++;
				Static593.anInt8643 += Static593.anInt8636;
				Static593.anInt8650 += Static593.anInt8651;
				Static593.anInt8642 += Static593.anInt8640;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass82_Sub2_11.method2700()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass82_Sub2_11.anInt3098;
		arg0 += super.anInt8644;
		arg1 += super.anInt8630;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt8649;
		@Pc(35) int local35 = super.anInt8627;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass82_Sub2_11.anInt3083) {
			local52 = super.aClass82_Sub2_11.anInt3083 - arg1;
			local32 -= local52;
			arg1 = super.aClass82_Sub2_11.anInt3083;
			local29 = local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass82_Sub2_11.anInt3091) {
			local32 -= arg1 + local32 - super.aClass82_Sub2_11.anInt3091;
		}
		if (arg0 < super.aClass82_Sub2_11.anInt3103) {
			local52 = super.aClass82_Sub2_11.anInt3103 - arg0;
			local35 -= local52;
			arg0 = super.aClass82_Sub2_11.anInt3103;
			local29 += local52;
			local27 += local52;
			local41 = local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass82_Sub2_11.anInt3096) {
			local52 = arg0 + local35 - super.aClass82_Sub2_11.anInt3096;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass82_Sub2_11.anIntArray193;
		@Pc(168) int local168;
		@Pc(175) int local175;
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(291) int local291;
		@Pc(303) int local303;
		@Pc(319) int local319;
		@Pc(327) int local327;
		@Pc(458) int local458;
		@Pc(311) int local311;
		if (arg4 != 0) {
			@Pc(1054) byte local1054;
			@Pc(766) int local766;
			@Pc(774) int local774;
			@Pc(782) int local782;
			@Pc(794) int local794;
			@Pc(543) byte local543;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local168 = -local32; local168 < 0; local168++) {
						for (local175 = -local35; local175 < 0; local175++) {
							local543 = this.aByteArray87[local29++];
							if (local543 == 0) {
								local27++;
							} else {
								local287 = this.anIntArray548[local543 & 0xFF] | 0xFF000000;
								local311 = local160[local27];
								local160[local27++] = ((local287 & 0xFF00FF) * 255 + (local311 & 0xFF00FF) * 0 >> 8 & 0xFFFF00FF) + (((local287 & 0xFF00FF00) >>> 8) * 255 + ((local311 & 0xFF00FF00) >>> 8) * 0 & 0xFF00FF00);
							}
						}
						local27 += local39;
						local29 += local41;
					}
				} else {
					@Pc(645) byte local645;
					if (arg2 == 0) {
						if ((arg3 & 0xFFFFFF) == 16777215) {
							local168 = arg3 >>> 24;
							local175 = 256 - local168;
							for (local284 = -local32; local284 < 0; local284++) {
								for (local287 = -local35; local287 < 0; local287++) {
									local645 = this.aByteArray87[local29++];
									if (local645 == 0) {
										local27++;
									} else {
										local303 = this.anIntArray548[local645 & 0xFF];
										local311 = local160[local27];
										local160[local27++] = ((local303 & 0xFF00FF) * local168 + (local311 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local303 & 0xFF00) * local168 + (local311 & 0xFF00) * local175 & 0xFF0000) >> 8;
									}
								}
								local27 += local39;
								local29 += local41;
							}
						} else {
							local168 = arg3 >> 16 & 0xFF;
							local175 = arg3 >> 8 & 0xFF;
							local284 = arg3 & 0xFF;
							local287 = arg3 >>> 24;
							local291 = 256 - local287;
							for (local303 = -local32; local303 < 0; local303++) {
								for (local311 = -local35; local311 < 0; local311++) {
									@Pc(746) byte local746 = this.aByteArray87[local29++];
									if (local746 == 0) {
										local27++;
									} else {
										local327 = this.anIntArray548[local746 & 0xFF];
										if (local287 == 255) {
											local766 = (local327 & 0xFF0000) * local168 & 0xFF000000;
											local774 = (local327 & 0xFF00) * local175 & 0xFF0000;
											local782 = (local327 & 0xFF) * local284 & 0xFF00;
											local160[local27++] = (local766 | local774 | local782) >>> 8;
										} else {
											local766 = (local327 & 0xFF0000) * local168 & 0xFF000000;
											local774 = (local327 & 0xFF00) * local175 & 0xFF0000;
											local782 = (local327 & 0xFF) * local284 & 0xFF00;
											local327 = (local766 | local774 | local782) >>> 8;
											local794 = local160[local27];
											local160[local27++] = ((local327 & 0xFF00FF) * local287 + (local794 & 0xFF00FF) * local291 & 0xFF00FF00) + ((local327 & 0xFF00) * local287 + (local794 & 0xFF00) * local291 & 0xFF0000) >> 8;
										}
									}
								}
								local27 += local39;
								local29 += local41;
							}
						}
					} else if (arg2 == 3) {
						local168 = arg3 >>> 24;
						local175 = 256 - local168;
						for (local284 = -local32; local284 < 0; local284++) {
							for (local287 = -local35; local287 < 0; local287++) {
								local645 = this.aByteArray87[local29++];
								local303 = local645 > 0 ? this.anIntArray548[local645] : 0;
								local311 = local303 + arg3;
								local319 = (local303 & 0xFF00FF) + (arg3 & 0xFF00FF);
								local327 = (local319 & 0x1000100) + (local311 - local319 & 0x10000);
								local327 = local311 - local327 | local327 - (local327 >>> 8);
								if (local303 == 0 && local168 != 255) {
									local303 = local327;
									local327 = local160[local27];
									local327 = ((local303 & 0xFF00FF) * local168 + (local327 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local303 & 0xFF00) * local168 + (local327 & 0xFF00) * local175 & 0xFF0000) >> 8;
								}
								local160[local27++] = local327;
							}
							local27 += local39;
							local29 += local41;
						}
					} else if (arg2 == 2) {
						local168 = arg3 >>> 24;
						local175 = 256 - local168;
						local284 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
						local287 = (arg3 & 0xFF00) * local175 & 0xFF0000;
						local458 = (local284 | local287) >>> 8;
						for (local291 = -local32; local291 < 0; local291++) {
							for (local303 = -local35; local303 < 0; local303++) {
								local1054 = this.aByteArray87[local29++];
								if (local1054 == 0) {
									local27++;
								} else {
									local319 = this.anIntArray548[local1054 & 0xFF];
									local284 = (local319 & 0xFF00FF) * local168 & 0xFF00FF00;
									local287 = (local319 & 0xFF00) * local168 & 0xFF0000;
									local160[local27++] = ((local284 | local287) >>> 8) + local458;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					} else {
						throw new IllegalArgumentException();
					}
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local543 = this.aByteArray87[local29++];
						if (local543 == 0) {
							local27++;
						} else {
							local287 = this.anIntArray548[local543 & 0xFF];
							local291 = local160[local27];
							local303 = local287 + local291;
							local311 = (local287 & 0xFF00FF) + (local291 & 0xFF00FF);
							local291 = (local311 & 0x1000100) + (local303 - local311 & 0x10000);
							local160[local27++] = local303 - local291 | local291 - (local291 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 0) {
				local168 = arg3 >> 16 & 0xFF;
				local175 = arg3 >> 8 & 0xFF;
				local284 = arg3 & 0xFF;
				for (local287 = -local32; local287 < 0; local287++) {
					for (local291 = -local35; local291 < 0; local291++) {
						@Pc(1228) byte local1228 = this.aByteArray87[local29++];
						if (local1228 == 0) {
							local27++;
						} else {
							local311 = this.anIntArray548[local1228 & 0xFF];
							local319 = (local311 & 0xFF0000) * local168 & 0xFF000000;
							local327 = (local311 & 0xFF00) * local175 & 0xFF0000;
							local766 = (local311 & 0xFF) * local284 & 0xFF00;
							local311 = (local319 | local327 | local766) >>> 8;
							local774 = local160[local27];
							local782 = local311 + local774;
							local794 = (local311 & 0xFF00FF) + (local774 & 0xFF00FF);
							local774 = (local794 & 0x1000100) + (local782 - local794 & 0x10000);
							local160[local27++] = local782 - local774 | local774 - (local774 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 3) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local543 = this.aByteArray87[local29++];
						local287 = local543 > 0 ? this.anIntArray548[local543] : 0;
						local291 = local287 + arg3;
						local303 = (local287 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local311 = (local303 & 0x1000100) + (local291 - local303 & 0x10000);
						local287 = local291 - local311 | local311 - (local311 >>> 8);
						@Pc(1387) int local1387 = local160[local27];
						local291 = local287 + local1387;
						local303 = (local287 & 0xFF00FF) + (local1387 & 0xFF00FF);
						@Pc(1409) int local1409 = (local303 & 0x1000100) + (local291 - local303 & 0x10000);
						local160[local27++] = local291 - local1409 | local1409 - (local1409 >>> 8);
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 2) {
				local168 = arg3 >>> 24;
				local175 = 256 - local168;
				local284 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
				local287 = (arg3 & 0xFF00) * local175 & 0xFF0000;
				local458 = (local284 | local287) >>> 8;
				for (local291 = -local32; local291 < 0; local291++) {
					for (local303 = -local35; local303 < 0; local303++) {
						local1054 = this.aByteArray87[local29++];
						if (local1054 == 0) {
							local27++;
						} else {
							local319 = this.anIntArray548[local1054 & 0xFF];
							local284 = (local319 & 0xFF00FF) * local168 & 0xFF00FF00;
							local287 = (local319 & 0xFF00) * local168 & 0xFF0000;
							@Pc(1517) int local1517 = ((local284 | local287) >>> 8) + local458;
							local327 = local160[local27];
							local766 = local1517 + local327;
							local774 = (local1517 & 0xFF00FF) + (local327 & 0xFF00FF);
							@Pc(1543) int local1543 = (local774 & 0x1000100) + (local766 - local774 & 0x10000);
							local160[local27++] = local766 - local1543 | local1543 - (local1543 >>> 8);
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
					local160[local27++] = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
					local160[local27++] = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
					local160[local27++] = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
					local160[local27++] = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
				}
				local175 += 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 0) {
			local168 = arg3 >> 16 & 0xFF;
			local175 = arg3 >> 8 & 0xFF;
			local284 = arg3 & 0xFF;
			for (local287 = -local32; local287 < 0; local287++) {
				for (local291 = -local35; local291 < 0; local291++) {
					local303 = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
					local311 = (local303 & 0xFF0000) * local168 & 0xFF000000;
					local319 = (local303 & 0xFF00) * local175 & 0xFF0000;
					local327 = (local303 & 0xFF) * local284 & 0xFF00;
					local160[local27++] = (local311 | local319 | local327) >>> 8;
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 3) {
			for (local168 = -local32; local168 < 0; local168++) {
				for (local175 = -local35; local175 < 0; local175++) {
					local284 = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
					local287 = local284 + arg3;
					local291 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local303 = (local291 & 0x1000100) + (local287 - local291 & 0x10000);
					local160[local27++] = local287 - local303 | local303 - (local303 >>> 8);
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 2) {
			local168 = arg3 >>> 24;
			local175 = 256 - local168;
			local284 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
			local287 = (arg3 & 0xFF00) * local175 & 0xFF0000;
			local458 = (local284 | local287) >>> 8;
			for (local291 = -local32; local291 < 0; local291++) {
				for (local303 = -local35; local303 < 0; local303++) {
					local311 = this.anIntArray548[this.aByteArray87[local29++] & 0xFF];
					local284 = (local311 & 0xFF00FF) * local168 & 0xFF00FF00;
					local287 = (local311 & 0xFF00) * local168 & 0xFF0000;
					local160[local27++] = ((local284 | local287) >>> 8) + local458;
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(2) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
