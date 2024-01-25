import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class33_Sub1_Sub1 extends Class33_Sub1 {

	@OriginalMember(owner = "client!bea", name = "E", descriptor = "[I")
	public final int[] anIntArray75;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!uga;[IIIIIZ)V")
	public Class33_Sub1_Sub1(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.anIntArray75 = new int[arg4 * arg5];
		} else {
			this.anIntArray75 = arg1;
		}
		@Pc(21) int local21 = arg3 - super.anInt4871;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg5; local25++) {
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				this.anIntArray75[local23++] = arg1[arg2++];
			}
			arg2 += local21;
		}
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!uga;[III)V")
	public Class33_Sub1_Sub1(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray75 = arg1;
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!uga;II)V")
	public Class33_Sub1_Sub1(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1, arg2);
		this.anIntArray75 = new int[arg1 * arg2];
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17 = super.anInt4852 + super.anInt4871 + super.anInt4868;
		@Pc(26) int local26 = super.anInt4872 + super.anInt4869 + super.anInt4861;
		@Pc(32) int local32 = (local17 << 16) / arg3;
		@Pc(38) int local38 = (local26 << 16) / arg4;
		@Pc(52) int local52;
		if (super.anInt4852 > 0) {
			local52 = ((super.anInt4852 << 16) + local32 - 1) / local32;
			arg0 += local52;
			local6 = local52 * local32 - (super.anInt4852 << 16);
		}
		if (super.anInt4872 > 0) {
			local52 = ((super.anInt4872 << 16) + local38 - 1) / local38;
			arg1 += local52;
			local8 = local52 * local38 - (super.anInt4872 << 16);
		}
		if (super.anInt4871 < local17) {
			arg3 = ((super.anInt4871 << 16) + local32 - local6 - 1) / local32;
		}
		if (super.anInt4869 < local26) {
			arg4 = ((super.anInt4869 << 16) + local38 - local8 - 1) / local38;
		}
		local52 = arg0 + arg1 * super.aClass13_Sub3_8.anInt9709;
		@Pc(144) int local144 = super.aClass13_Sub3_8.anInt9709 - arg3;
		if (arg1 + arg4 > super.aClass13_Sub3_8.anInt9702) {
			arg4 -= arg1 + arg4 - super.aClass13_Sub3_8.anInt9702;
		}
		@Pc(172) int local172;
		if (arg1 < super.aClass13_Sub3_8.anInt9717) {
			local172 = super.aClass13_Sub3_8.anInt9717 - arg1;
			arg4 -= local172;
			local52 += local172 * super.aClass13_Sub3_8.anInt9709;
			local8 += local38 * local172;
		}
		if (arg0 + arg3 > super.aClass13_Sub3_8.anInt9694) {
			local172 = arg0 + arg3 - super.aClass13_Sub3_8.anInt9694;
			arg3 -= local172;
			local144 += local172;
		}
		if (arg0 < super.aClass13_Sub3_8.anInt9703) {
			local172 = super.aClass13_Sub3_8.anInt9703 - arg0;
			arg3 -= local172;
			local52 += local172;
			local6 += local32 * local172;
			local144 += local172;
		}
		@Pc(246) float[] local246 = super.aClass13_Sub3_8.aFloatArray79;
		@Pc(250) int[] local250 = super.aClass13_Sub3_8.anIntArray840;
		@Pc(257) int local257;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(271) int local271;
		@Pc(340) int local340;
		@Pc(348) int local348;
		@Pc(351) int local351;
		@Pc(368) int local368;
		@Pc(376) int local376;
		@Pc(384) int local384;
		@Pc(392) int local392;
		@Pc(559) int local559;
		if (arg7 != 0) {
			@Pc(960) int local960;
			@Pc(968) int local968;
			@Pc(980) int local980;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local257 = local6;
					for (local260 = -arg4; local260 < 0; local260++) {
						local268 = (local8 >> 16) * super.anInt4871;
						for (local271 = -arg3; local271 < 0; local271++) {
							if ((float) arg2 < local246[local52]) {
								local340 = this.anIntArray75[(local6 >> 16) + local268];
								local348 = local340 >>> 24;
								local351 = 256 - local348;
								local368 = local250[local52];
								local250[local52] = ((local340 & 0xFF00FF) * local348 + (local368 & 0xFF00FF) * local351 >> 8 & 0xFFFF00FF) + (((local340 & 0xFF00FF00) >>> 8) * local348 + ((local368 & 0xFF00FF00) >>> 8) * local351 & 0xFF00FF00);
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
					local257 = local6;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						for (local260 = -arg4; local260 < 0; local260++) {
							local268 = (local8 >> 16) * super.anInt4871;
							for (local271 = -arg3; local271 < 0; local271++) {
								if ((float) arg2 < local246[local52]) {
									local340 = this.anIntArray75[(local6 >> 16) + local268];
									local348 = (local340 >>> 24) * (arg6 >>> 24) >> 8;
									local351 = 256 - local348;
									local368 = local250[local52];
									local250[local52] = ((local340 & 0xFF00FF) * local348 + (local368 & 0xFF00FF) * local351 & 0xFF00FF00) + ((local340 & 0xFF00) * local348 + (local368 & 0xFF00) * local351 & 0xFF0000) >> 8;
									local246[local52] = (float) arg2;
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
						for (local340 = -arg4; local340 < 0; local340++) {
							local348 = (local8 >> 16) * super.anInt4871;
							for (local351 = -arg3; local351 < 0; local351++) {
								if ((float) arg2 < local246[local52]) {
									local368 = this.anIntArray75[(local6 >> 16) + local348];
									local376 = (local368 >>> 24) * (arg6 >>> 24) >> 8;
									local384 = 256 - local376;
									if (local376 == 255) {
										local392 = (local368 & 0xFF0000) * local260 & 0xFF000000;
										local960 = (local368 & 0xFF00) * local268 & 0xFF0000;
										local968 = (local368 & 0xFF) * local271 & 0xFF00;
										local250[local52] = (local392 | local960 | local968) >>> 8;
										local246[local52] = (float) arg2;
									} else {
										local392 = (local368 & 0xFF0000) * local260 & 0xFF000000;
										local960 = (local368 & 0xFF00) * local268 & 0xFF0000;
										local968 = (local368 & 0xFF) * local271 & 0xFF00;
										local368 = (local392 | local960 | local968) >>> 8;
										local980 = local250[local52];
										local250[local52] = ((local368 & 0xFF00FF) * local376 + (local980 & 0xFF00FF) * local384 & 0xFF00FF00) + ((local368 & 0xFF00) * local376 + (local980 & 0xFF00) * local384 & 0xFF0000) >> 8;
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
					}
				} else if (arg5 == 3) {
					local257 = local6;
					for (local260 = -arg4; local260 < 0; local260++) {
						local268 = (local8 >> 16) * super.anInt4871;
						for (local271 = -arg3; local271 < 0; local271++) {
							if ((float) arg2 < local246[local52]) {
								local340 = this.anIntArray75[(local6 >> 16) + local268];
								local348 = local340 + arg6;
								local351 = (local340 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
								local368 = local348 - local368 | local368 - (local368 >>> 8);
								local376 = (local368 >>> 24) * (arg6 >>> 24) >> 8;
								local384 = 256 - local376;
								if (local376 != 255) {
									local340 = local368;
									local368 = local250[local52];
									local368 = ((local340 & 0xFF00FF) * local376 + (local368 & 0xFF00FF) * local384 & 0xFF00FF00) + ((local340 & 0xFF00) * local376 + (local368 & 0xFF00) * local384 & 0xFF0000) >> 8;
								}
								local250[local52] = local368;
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
					local559 = (local268 | local271) >>> 8;
					local340 = local6;
					for (local348 = -arg4; local348 < 0; local348++) {
						local351 = (local8 >> 16) * super.anInt4871;
						for (local368 = -arg3; local368 < 0; local368++) {
							if ((float) arg2 < local246[local52]) {
								local376 = this.anIntArray75[(local6 >> 16) + local351];
								local384 = local376 >>> 24;
								local392 = 256 - local384;
								local268 = (local376 & 0xFF00FF) * local257 & 0xFF00FF00;
								local271 = (local376 & 0xFF00) * local257 & 0xFF0000;
								local376 = ((local268 | local271) >>> 8) + local559;
								local960 = local250[local52];
								local250[local52] = ((local376 & 0xFF00FF) * local384 + (local960 & 0xFF00FF) * local392 & 0xFF00FF00) + ((local376 & 0xFF00) * local384 + (local960 & 0xFF00) * local392 & 0xFF0000) >> 8;
								local246[local52] = (float) arg2;
							}
							local6 += local32;
							local52++;
						}
						local8 += local38;
						local6 = local340;
						local52 += local144;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local257 = local6;
				for (local260 = -arg4; local260 < 0; local260++) {
					local268 = (local8 >> 16) * super.anInt4871;
					for (local271 = -arg3; local271 < 0; local271++) {
						if ((float) arg2 < local246[local52]) {
							local340 = this.anIntArray75[(local6 >> 16) + local268];
							if (local340 != 0) {
								local348 = local250[local52];
								local351 = local340 + local348;
								local368 = (local340 & 0xFF00FF) + (local348 & 0xFF00FF);
								local348 = (local368 & 0x1000100) + (local351 - local368 & 0x10000);
								local250[local52] = local351 - local348 | local348 - (local348 >>> 8);
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
				for (local340 = -arg4; local340 < 0; local340++) {
					local348 = (local8 >> 16) * super.anInt4871;
					for (local351 = -arg3; local351 < 0; local351++) {
						if ((float) arg2 < local246[local52]) {
							local368 = this.anIntArray75[(local6 >> 16) + local348];
							if (local368 != 0) {
								local376 = (local368 & 0xFF0000) * local260 & 0xFF000000;
								local384 = (local368 & 0xFF00) * local268 & 0xFF0000;
								local392 = (local368 & 0xFF) * local271 & 0xFF00;
								local368 = (local376 | local384 | local392) >>> 8;
								local960 = local250[local52];
								local968 = local368 + local960;
								local980 = (local368 & 0xFF00FF) + (local960 & 0xFF00FF);
								local960 = (local980 & 0x1000100) + (local968 - local980 & 0x10000);
								local250[local52] = local968 - local960 | local960 - (local960 >>> 8);
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
					local268 = (local8 >> 16) * super.anInt4871;
					for (local271 = -arg3; local271 < 0; local271++) {
						if ((float) arg2 < local246[local52]) {
							local340 = this.anIntArray75[(local6 >> 16) + local268];
							local348 = local340 + arg6;
							local351 = (local340 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
							local340 = local348 - local368 | local368 - (local368 >>> 8);
							local368 = local250[local52];
							local348 = local340 + local368;
							local351 = (local340 & 0xFF00FF) + (local368 & 0xFF00FF);
							local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
							local250[local52] = local348 - local368 | local368 - (local368 >>> 8);
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
				local559 = (local268 | local271) >>> 8;
				local340 = local6;
				for (local348 = -arg4; local348 < 0; local348++) {
					local351 = (local8 >> 16) * super.anInt4871;
					for (local368 = -arg3; local368 < 0; local368++) {
						if ((float) arg2 < local246[local52]) {
							local376 = this.anIntArray75[(local6 >> 16) + local351];
							if (local376 != 0) {
								local268 = (local376 & 0xFF00FF) * local257 & 0xFF00FF00;
								local271 = (local376 & 0xFF00) * local257 & 0xFF0000;
								local376 = ((local268 | local271) >>> 8) + local559;
								local384 = local250[local52];
								local392 = local376 + local384;
								local960 = (local376 & 0xFF00FF) + (local384 & 0xFF00FF);
								@Pc(1903) int local1903 = (local960 & 0x1000100) + (local392 - local960 & 0x10000);
								local250[local52] = local392 - local1903 | local1903 - (local1903 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local340;
					local52 += local144;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local257 = local6;
			for (local260 = -arg4; local260 < 0; local260++) {
				local268 = (local8 >> 16) * super.anInt4871;
				for (local271 = -arg3; local271 < 0; local271++) {
					if ((float) arg2 < local246[local52]) {
						local250[local52] = this.anIntArray75[(local6 >> 16) + local268];
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
			for (local340 = -arg4; local340 < 0; local340++) {
				local348 = (local8 >> 16) * super.anInt4871;
				for (local351 = -arg3; local351 < 0; local351++) {
					if ((float) arg2 < local246[local52]) {
						local368 = this.anIntArray75[(local6 >> 16) + local348];
						local376 = (local368 & 0xFF0000) * local257 & 0xFF000000;
						local384 = (local368 & 0xFF00) * local260 & 0xFF0000;
						local392 = (local368 & 0xFF) * local268 & 0xFF00;
						local250[local52] = (local376 | local384 | local392) >>> 8;
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
				local268 = (local8 >> 16) * super.anInt4871;
				for (local271 = -arg3; local271 < 0; local271++) {
					if ((float) arg2 < local246[local52]) {
						local340 = this.anIntArray75[(local6 >> 16) + local268];
						local348 = local340 + arg6;
						local351 = (local340 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
						local250[local52] = local348 - local368 | local368 - (local368 >>> 8);
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
			local559 = (local268 | local271) >>> 8;
			local340 = local6;
			for (local348 = -arg4; local348 < 0; local348++) {
				local351 = (local8 >> 16) * super.anInt4871;
				for (local368 = -arg3; local368 < 0; local368++) {
					if ((float) arg2 < local246[local52]) {
						local376 = this.anIntArray75[(local6 >> 16) + local351];
						local268 = (local376 & 0xFF00FF) * local257 & 0xFF00FF00;
						local271 = (local376 & 0xFF00) * local257 & 0xFF0000;
						local250[local52] = ((local268 | local271) >>> 8) + local559;
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local340;
				local52 += local144;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
	@Override
	public void method7643(@OriginalArg(2) int arg0) {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(25) int local25;
		if (arg0 == 0) {
			local5 = super.aClass13_Sub3_8.anIntArray840;
			for (local7 = 0; local7 < super.anInt4869; local7++) {
				local13 = local7 * super.anInt4871;
				local23 = local7 * super.aClass13_Sub3_8.anInt9709;
				for (local25 = 0; local25 < super.anInt4871; local25++) {
					this.anIntArray75[local13 + local25] = this.anIntArray75[local13 + local25] & 0xFFFFFF | (local5[local23 + local25] & 0xFF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			local5 = super.aClass13_Sub3_8.anIntArray840;
			for (local7 = 0; local7 < super.anInt4869; local7++) {
				local13 = local7 * super.anInt4871;
				local23 = local7 * super.aClass13_Sub3_8.anInt9709;
				for (local25 = 0; local25 < super.anInt4871; local25++) {
					this.anIntArray75[local13 + local25] = this.anIntArray75[local13 + local25] & 0xFFFFFF | (local5[local23 + local25] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass13_Sub3_8.anIntArray840;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(14) int local14 = (arg1 + local5) * arg2 + arg0;
			@Pc(22) int local22 = (arg5 + local5) * arg2 + arg4;
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				this.anIntArray75[local14 + local24] = local3[local22 + local24] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass13_Sub3_8.method8532()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass13_Sub3_8.anInt9709;
		arg0 += super.anInt4852;
		arg1 += super.anInt4872;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt4869;
		@Pc(35) int local35 = super.anInt4871;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass13_Sub3_8.anInt9717) {
			local52 = super.aClass13_Sub3_8.anInt9717 - arg1;
			local32 -= local52;
			arg1 = super.aClass13_Sub3_8.anInt9717;
			local29 = local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass13_Sub3_8.anInt9702) {
			local32 -= arg1 + local32 - super.aClass13_Sub3_8.anInt9702;
		}
		if (arg0 < super.aClass13_Sub3_8.anInt9703) {
			local52 = super.aClass13_Sub3_8.anInt9703 - arg0;
			local35 -= local52;
			arg0 = super.aClass13_Sub3_8.anInt9703;
			local29 += local52;
			local27 += local52;
			local41 = local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass13_Sub3_8.anInt9694) {
			local52 = arg0 + local35 - super.aClass13_Sub3_8.anInt9694;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass13_Sub3_8.anIntArray840;
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
			@Pc(717) int local717;
			@Pc(725) int local725;
			@Pc(737) int local737;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local168 = -local32; local168 < 0; local168++) {
						for (local175 = -local35; local175 < 0; local175++) {
							local259 = this.anIntArray75[local29++];
							local262 = local259 >>> 24;
							local266 = 256 - local262;
							local273 = local160[local27];
							local160[local27++] = ((local259 & 0xFF00FF) * local262 + (local273 & 0xFF00FF) * local266 >> 8 & 0xFFFF00FF) + (((local259 & 0xFF00FF00) >>> 8) * local262 + ((local273 & 0xFF00FF00) >>> 8) * local266 & 0xFF00FF00);
						}
						local27 += local39;
						local29 += local41;
					}
				} else if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						for (local168 = -local32; local168 < 0; local168++) {
							for (local175 = -local35; local175 < 0; local175++) {
								local259 = this.anIntArray75[local29++];
								local262 = (local259 >>> 24) * (arg3 >>> 24) >> 8;
								local266 = 256 - local262;
								local273 = local160[local27];
								local160[local27++] = ((local259 & 0xFF00FF) * local262 + (local273 & 0xFF00FF) * local266 & 0xFF00FF00) + ((local259 & 0xFF00) * local262 + (local273 & 0xFF00) * local266 & 0xFF0000) >> 8;
							}
							local27 += local39;
							local29 += local41;
						}
					} else {
						local168 = arg3 >> 16 & 0xFF;
						local175 = arg3 >> 8 & 0xFF;
						local259 = arg3 & 0xFF;
						for (local262 = -local32; local262 < 0; local262++) {
							for (local266 = -local35; local266 < 0; local266++) {
								local273 = this.anIntArray75[local29++];
								local281 = (local273 >>> 24) * (arg3 >>> 24) >> 8;
								local289 = 256 - local281;
								if (local281 == 255) {
									local297 = (local273 & 0xFF0000) * local168 & 0xFF000000;
									local717 = (local273 & 0xFF00) * local175 & 0xFF0000;
									local725 = (local273 & 0xFF) * local259 & 0xFF00;
									local160[local27++] = (local297 | local717 | local725) >>> 8;
								} else {
									local297 = (local273 & 0xFF0000) * local168 & 0xFF000000;
									local717 = (local273 & 0xFF00) * local175 & 0xFF0000;
									local725 = (local273 & 0xFF) * local259 & 0xFF00;
									local273 = (local297 | local717 | local725) >>> 8;
									local737 = local160[local27];
									local160[local27++] = ((local273 & 0xFF00FF) * local281 + (local737 & 0xFF00FF) * local289 & 0xFF00FF00) + ((local273 & 0xFF00) * local281 + (local737 & 0xFF00) * local289 & 0xFF0000) >> 8;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					}
				} else if (arg2 == 3) {
					for (local168 = -local32; local168 < 0; local168++) {
						for (local175 = -local35; local175 < 0; local175++) {
							local259 = this.anIntArray75[local29++];
							local262 = local259 + arg3;
							local266 = (local259 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
							local273 = local262 - local273 | local273 - (local273 >>> 8);
							local281 = (local273 >>> 24) * (arg3 >>> 24) >> 8;
							local289 = 256 - local281;
							if (local281 != 255) {
								local259 = local273;
								local273 = local160[local27];
								local273 = ((local259 & 0xFF00FF) * local281 + (local273 & 0xFF00FF) * local289 & 0xFF00FF00) + ((local259 & 0xFF00) * local281 + (local273 & 0xFF00) * local289 & 0xFF0000) >> 8;
							}
							local160[local27++] = local273;
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
							local281 = this.anIntArray75[local29++];
							local289 = local281 >>> 24;
							local297 = 256 - local289;
							local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
							local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
							local281 = ((local259 | local262) >>> 8) + local423;
							local717 = local160[local27];
							local160[local27++] = ((local281 & 0xFF00FF) * local289 + (local717 & 0xFF00FF) * local297 & 0xFF00FF00) + ((local281 & 0xFF00) * local289 + (local717 & 0xFF00) * local297 & 0xFF0000) >> 8;
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
						local259 = this.anIntArray75[local29++];
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
						local273 = this.anIntArray75[local29++];
						if (local273 == 0) {
							local27++;
						} else {
							local281 = (local273 & 0xFF0000) * local168 & 0xFF000000;
							local289 = (local273 & 0xFF00) * local175 & 0xFF0000;
							local297 = (local273 & 0xFF) * local259 & 0xFF00;
							local273 = (local281 | local289 | local297) >>> 8;
							local717 = local160[local27];
							local725 = local273 + local717;
							local737 = (local273 & 0xFF00FF) + (local717 & 0xFF00FF);
							local717 = (local737 & 0x1000100) + (local725 - local737 & 0x10000);
							local160[local27++] = local725 - local717 | local717 - (local717 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 3) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local259 = this.anIntArray75[local29++];
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
						local281 = this.anIntArray75[local29++];
						if (local281 == 0) {
							local27++;
						} else {
							local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
							local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
							local281 = ((local259 | local262) >>> 8) + local423;
							local289 = local160[local27];
							local297 = local281 + local289;
							local717 = (local281 & 0xFF00FF) + (local289 & 0xFF00FF);
							@Pc(1480) int local1480 = (local717 & 0x1000100) + (local297 - local717 & 0x10000);
							local160[local27++] = local297 - local1480 | local1480 - (local1480 >>> 8);
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
					local160[local27++] = this.anIntArray75[local29++];
					local160[local27++] = this.anIntArray75[local29++];
					local160[local27++] = this.anIntArray75[local29++];
					local160[local27++] = this.anIntArray75[local29++];
				}
				local175 += 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray75[local29++];
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
					local273 = this.anIntArray75[local29++];
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
					local259 = this.anIntArray75[local29++];
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
					local281 = this.anIntArray75[local29++];
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

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method4512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass13_Sub3_8.anIntArray840;
		@Pc(217) int local217;
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
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(123) int local123;
		if (Static591.anInt4870 == 0) {
			if (Static591.anInt4865 == 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static591.anInt4876;
						local25 = Static591.anInt4863;
						local27 = Static591.anInt4858;
						local29 = Static591.anInt4866;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt4871 << 12) < 0 && local27 - (super.anInt4869 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static591.anInt4876 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static591.anInt4870 * local64;
								local27 += Static591.anInt4865 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local29++;
							}
						}
					}
					local9++;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else if (Static591.anInt4865 < 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static591.anInt4876;
						local25 = Static591.anInt4863;
						local27 = Static591.anInt4858 + Static591.anInt4877;
						local29 = Static591.anInt4866;
						if (local25 >= 0 && local25 - (super.anInt4871 << 12) < 0) {
							@Pc(210) int local210;
							if ((local210 = local27 - (super.anInt4869 << 12)) >= 0) {
								local217 = (Static591.anInt4865 - local210) / Static591.anInt4865;
								local29 += local217;
								local27 += Static591.anInt4865 * local217;
								local23 += local217;
							}
							@Pc(238) int local238;
							if ((local238 = (local27 - Static591.anInt4865) / Static591.anInt4865) > local29) {
								local29 = local238;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static591.anInt4876 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static591.anInt4870 * local64;
								local27 += Static591.anInt4865 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local27 += Static591.anInt4865;
								local29++;
							}
						}
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static591.anInt4876;
						local25 = Static591.anInt4863;
						local27 = Static591.anInt4858 + Static591.anInt4877;
						local29 = Static591.anInt4866;
						if (local25 >= 0 && local25 - (super.anInt4871 << 12) < 0) {
							if (local27 < 0) {
								local217 = (Static591.anInt4865 - local27 - 1) / Static591.anInt4865;
								local29 += local217;
								local27 += Static591.anInt4865 * local217;
								local23 += local217;
							}
							@Pc(441) int local441;
							if ((local441 = (local27 + 1 - (super.anInt4869 << 12) - Static591.anInt4865) / Static591.anInt4865) > local29) {
								local29 = local441;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static591.anInt4876 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static591.anInt4870 * local64;
								local27 += Static591.anInt4865 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local27 += Static591.anInt4865;
								local29++;
							}
						}
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4876 += Static591.anInt4850;
				}
			}
		} else if (Static591.anInt4870 < 0) {
			if (Static591.anInt4865 == 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static591.anInt4876;
						local25 = Static591.anInt4863 + Static591.anInt4873;
						local27 = Static591.anInt4858;
						local29 = Static591.anInt4866;
						if (local27 >= 0 && local27 - (super.anInt4869 << 12) < 0) {
							@Pc(618) int local618;
							if ((local618 = local25 - (super.anInt4871 << 12)) >= 0) {
								local217 = (Static591.anInt4870 - local618) / Static591.anInt4870;
								local29 += local217;
								local25 += Static591.anInt4870 * local217;
								local23 += local217;
							}
							@Pc(646) int local646;
							if ((local646 = (local25 - Static591.anInt4870) / Static591.anInt4870) > local29) {
								local29 = local646;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static591.anInt4876 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static591.anInt4870 * local64;
								local27 += Static591.anInt4865 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local25 += Static591.anInt4870;
								local29++;
							}
						}
					}
					local9++;
					Static591.anInt4858 += Static591.anInt4875;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else if (Static591.anInt4865 < 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static591.anInt4876;
						local25 = Static591.anInt4863 + Static591.anInt4873;
						local27 = Static591.anInt4858 + Static591.anInt4877;
						local29 = Static591.anInt4866;
						@Pc(814) int local814;
						if ((local814 = local25 - (super.anInt4871 << 12)) >= 0) {
							local217 = (Static591.anInt4870 - local814) / Static591.anInt4870;
							local29 += local217;
							local25 += Static591.anInt4870 * local217;
							local27 += Static591.anInt4865 * local217;
							local23 += local217;
						}
						@Pc(848) int local848;
						if ((local848 = (local25 - Static591.anInt4870) / Static591.anInt4870) > local29) {
							local29 = local848;
						}
						@Pc(860) int local860;
						if ((local860 = local27 - (super.anInt4869 << 12)) >= 0) {
							local217 = (Static591.anInt4865 - local860) / Static591.anInt4865;
							local29 += local217;
							local25 += Static591.anInt4870 * local217;
							local27 += Static591.anInt4865 * local217;
							local23 += local217;
						}
						@Pc(894) int local894;
						if ((local894 = (local27 - Static591.anInt4865) / Static591.anInt4865) > local29) {
							local29 = local894;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static591.anInt4876 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static591.anInt4870 * local64;
							local27 += Static591.anInt4865 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static591.anInt4870;
							local27 += Static591.anInt4865;
							local29++;
						}
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4858 += Static591.anInt4875;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static591.anInt4876;
						local25 = Static591.anInt4863 + Static591.anInt4873;
						local27 = Static591.anInt4858 + Static591.anInt4877;
						local29 = Static591.anInt4866;
						@Pc(1068) int local1068;
						if ((local1068 = local25 - (super.anInt4871 << 12)) >= 0) {
							local217 = (Static591.anInt4870 - local1068) / Static591.anInt4870;
							local29 += local217;
							local25 += Static591.anInt4870 * local217;
							local27 += Static591.anInt4865 * local217;
							local23 += local217;
						}
						@Pc(1102) int local1102;
						if ((local1102 = (local25 - Static591.anInt4870) / Static591.anInt4870) > local29) {
							local29 = local1102;
						}
						if (local27 < 0) {
							local217 = (Static591.anInt4865 - local27 - 1) / Static591.anInt4865;
							local29 += local217;
							local25 += Static591.anInt4870 * local217;
							local27 += Static591.anInt4865 * local217;
							local23 += local217;
						}
						@Pc(1150) int local1150;
						if ((local1150 = (local27 + 1 - (super.anInt4869 << 12) - Static591.anInt4865) / Static591.anInt4865) > local29) {
							local29 = local1150;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static591.anInt4876 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static591.anInt4870 * local64;
							local27 += Static591.anInt4865 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static591.anInt4870;
							local27 += Static591.anInt4865;
							local29++;
						}
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4858 += Static591.anInt4875;
					Static591.anInt4876 += Static591.anInt4850;
				}
			}
		} else if (Static591.anInt4865 == 0) {
			local9 = Static591.anInt4854;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static591.anInt4876;
					local25 = Static591.anInt4863 + Static591.anInt4873;
					local27 = Static591.anInt4858;
					local29 = Static591.anInt4866;
					if (local27 >= 0 && local27 - (super.anInt4869 << 12) < 0) {
						if (local25 < 0) {
							local217 = (Static591.anInt4870 - local25 - 1) / Static591.anInt4870;
							local29 += local217;
							local25 += Static591.anInt4870 * local217;
							local23 += local217;
						}
						@Pc(1363) int local1363;
						if ((local1363 = (local25 + 1 - (super.anInt4871 << 12) - Static591.anInt4870) / Static591.anInt4870) > local29) {
							local29 = local1363;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static591.anInt4876 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static591.anInt4870 * local64;
							local27 += Static591.anInt4865 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static591.anInt4870;
							local29++;
						}
					}
				}
				local9++;
				Static591.anInt4863 += Static591.anInt4862;
				Static591.anInt4858 += Static591.anInt4875;
				Static591.anInt4876 += Static591.anInt4850;
			}
		} else if (Static591.anInt4865 < 0) {
			local9 = Static591.anInt4854;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static591.anInt4876;
					local25 = Static591.anInt4863 + Static591.anInt4873;
					local27 = Static591.anInt4858 + Static591.anInt4877;
					local29 = Static591.anInt4866;
					if (local25 < 0) {
						local217 = (Static591.anInt4870 - local25 - 1) / Static591.anInt4870;
						local29 += local217;
						local25 += Static591.anInt4870 * local217;
						local27 += Static591.anInt4865 * local217;
						local23 += local217;
					}
					@Pc(1571) int local1571;
					if ((local1571 = (local25 + 1 - (super.anInt4871 << 12) - Static591.anInt4870) / Static591.anInt4870) > local29) {
						local29 = local1571;
					}
					@Pc(1583) int local1583;
					if ((local1583 = local27 - (super.anInt4869 << 12)) >= 0) {
						local217 = (Static591.anInt4865 - local1583) / Static591.anInt4865;
						local29 += local217;
						local25 += Static591.anInt4870 * local217;
						local27 += Static591.anInt4865 * local217;
						local23 += local217;
					}
					@Pc(1617) int local1617;
					if ((local1617 = (local27 - Static591.anInt4865) / Static591.anInt4865) > local29) {
						local29 = local1617;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static591.anInt4876 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static591.anInt4870 * local64;
						local27 += Static591.anInt4865 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
						local115 = local111 >>> 24;
						local119 = 256 - local115;
						local123 = local3[local23];
						local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
						local25 += Static591.anInt4870;
						local27 += Static591.anInt4865;
						local29++;
					}
				}
				local9++;
				Static591.anInt4863 += Static591.anInt4862;
				Static591.anInt4858 += Static591.anInt4875;
				Static591.anInt4876 += Static591.anInt4850;
			}
		} else {
			local9 = Static591.anInt4854;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static591.anInt4876;
					local25 = Static591.anInt4863 + Static591.anInt4873;
					local27 = Static591.anInt4858 + Static591.anInt4877;
					local29 = Static591.anInt4866;
					if (local25 < 0) {
						local217 = (Static591.anInt4870 - local25 - 1) / Static591.anInt4870;
						local29 += local217;
						local25 += Static591.anInt4870 * local217;
						local27 += Static591.anInt4865 * local217;
						local23 += local217;
					}
					@Pc(1827) int local1827;
					if ((local1827 = (local25 + 1 - (super.anInt4871 << 12) - Static591.anInt4870) / Static591.anInt4870) > local29) {
						local29 = local1827;
					}
					if (local27 < 0) {
						local217 = (Static591.anInt4865 - local27 - 1) / Static591.anInt4865;
						local29 += local217;
						local25 += Static591.anInt4870 * local217;
						local27 += Static591.anInt4865 * local217;
						local23 += local217;
					}
					@Pc(1875) int local1875;
					if ((local1875 = (local27 + 1 - (super.anInt4869 << 12) - Static591.anInt4865) / Static591.anInt4865) > local29) {
						local29 = local1875;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static591.anInt4876 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static591.anInt4870 * local64;
						local27 += Static591.anInt4865 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray75[(local27 >> 12) * super.anInt4871 + (local25 >> 12)];
						local115 = local111 >>> 24;
						local119 = 256 - local115;
						local123 = local3[local23];
						local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
						local25 += Static591.anInt4870;
						local27 += Static591.anInt4865;
						local29++;
					}
				}
				local9++;
				Static591.anInt4863 += Static591.anInt4862;
				Static591.anInt4858 += Static591.anInt4875;
				Static591.anInt4876 += Static591.anInt4850;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)V")
	@Override
	protected void method4513(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass13_Sub3_8.anIntArray840;
		@Pc(935) int local935;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(334) int local334;
		@Pc(342) int local342;
		@Pc(354) int local354;
		if (Static591.anInt4870 == 0) {
			if (Static591.anInt4865 == 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local12 = Static591.anInt4876;
					local14 = Static591.anInt4863;
					local16 = Static591.anInt4858;
					local18 = Static591.anInt4866;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt4871 << 12) < 0 && local16 - (super.anInt4869 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray75[local48];
								local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local217 = 256 - local213;
								if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray75[local48];
								local213 = Static591.anInt4847;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else if (Static591.anInt4865 < 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local12 = Static591.anInt4876;
					local14 = Static591.anInt4863;
					local16 = Static591.anInt4858 + Static591.anInt4877;
					local18 = Static591.anInt4866;
					if (local14 >= 0 && local14 - (super.anInt4871 << 12) < 0) {
						@Pc(928) int local928;
						if ((local928 = local16 - (super.anInt4869 << 12)) >= 0) {
							local935 = (Static591.anInt4865 - local928) / Static591.anInt4865;
							local18 += local935;
							local16 += Static591.anInt4865 * local935;
							local12 += local935;
						}
						@Pc(956) int local956;
						if ((local956 = (local16 - Static591.anInt4865) / Static591.anInt4865) > local18) {
							local18 = local956;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray75[local48];
								local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local217 = 256 - local213;
								if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray75[local48];
								local213 = Static591.anInt4847;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static591.anInt4865;
							local18++;
						}
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local12 = Static591.anInt4876;
					local14 = Static591.anInt4863;
					local16 = Static591.anInt4858 + Static591.anInt4877;
					local18 = Static591.anInt4866;
					if (local14 >= 0 && local14 - (super.anInt4871 << 12) < 0) {
						if (local16 < 0) {
							local935 = (Static591.anInt4865 - local16 - 1) / Static591.anInt4865;
							local18 += local935;
							local16 += Static591.anInt4865 * local935;
							local12 += local935;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local16 + 1 - (super.anInt4869 << 12) - Static591.anInt4865) / Static591.anInt4865) > local18) {
							local18 = local1888;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray75[local48];
								local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local217 = 256 - local213;
								if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray75[local48];
								local213 = Static591.anInt4847;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static591.anInt4865;
							local18++;
						}
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4876 += Static591.anInt4850;
				}
			}
		} else if (Static591.anInt4870 < 0) {
			if (Static591.anInt4865 == 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local12 = Static591.anInt4876;
					local14 = Static591.anInt4863 + Static591.anInt4873;
					local16 = Static591.anInt4858;
					local18 = Static591.anInt4866;
					if (local16 >= 0 && local16 - (super.anInt4869 << 12) < 0) {
						@Pc(2794) int local2794;
						if ((local2794 = local14 - (super.anInt4871 << 12)) >= 0) {
							local935 = (Static591.anInt4870 - local2794) / Static591.anInt4870;
							local18 += local935;
							local14 += Static591.anInt4870 * local935;
							local12 += local935;
						}
						@Pc(2822) int local2822;
						if ((local2822 = (local14 - Static591.anInt4870) / Static591.anInt4870) > local18) {
							local18 = local2822;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray75[local48];
								local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local217 = 256 - local213;
								if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray75[local48];
								local213 = Static591.anInt4847;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray75[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static591.anInt4870;
							local18++;
						}
					}
					local9++;
					Static591.anInt4858 += Static591.anInt4875;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else if (Static591.anInt4865 < 0) {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local12 = Static591.anInt4876;
					local14 = Static591.anInt4863 + Static591.anInt4873;
					local16 = Static591.anInt4858 + Static591.anInt4877;
					local18 = Static591.anInt4866;
					@Pc(3719) int local3719;
					if ((local3719 = local14 - (super.anInt4871 << 12)) >= 0) {
						local935 = (Static591.anInt4870 - local3719) / Static591.anInt4870;
						local18 += local935;
						local14 += Static591.anInt4870 * local935;
						local16 += Static591.anInt4865 * local935;
						local12 += local935;
					}
					@Pc(3753) int local3753;
					if ((local3753 = (local14 - Static591.anInt4870) / Static591.anInt4870) > local18) {
						local18 = local3753;
					}
					@Pc(3765) int local3765;
					if ((local3765 = local16 - (super.anInt4869 << 12)) >= 0) {
						local935 = (Static591.anInt4865 - local3765) / Static591.anInt4865;
						local18 += local935;
						local14 += Static591.anInt4870 * local935;
						local16 += Static591.anInt4865 * local935;
						local12 += local935;
					}
					@Pc(3799) int local3799;
					if ((local3799 = (local16 - Static591.anInt4865) / Static591.anInt4865) > local18) {
						local18 = local3799;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray75[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local209 = this.anIntArray75[local48];
							local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
							local217 = 256 - local213;
							if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (local213 == 255) {
								local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
								local3[local51] = (local221 | local334 | local342) >>> 8;
							} else {
								local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
								local209 = (local221 | local334 | local342) >>> 8;
								local354 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray75[local48];
							local213 = Static591.anInt4847;
							local217 = local209 + local213;
							local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
							local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
							local334 = local217 - local334 | local334 - (local334 >>> 8);
							local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
							local354 = 256 - local342;
							if (local342 != 255) {
								local209 = local334;
								local334 = local3[local51];
								local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
							}
							local3[local51] = local334;
						} else if (arg0 == 2) {
							local209 = this.anIntArray75[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
							local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
							local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
							local342 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static591.anInt4870;
						local16 += Static591.anInt4865;
						local18++;
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4858 += Static591.anInt4875;
					Static591.anInt4876 += Static591.anInt4850;
				}
			} else {
				local9 = Static591.anInt4854;
				while (local9 < 0) {
					local12 = Static591.anInt4876;
					local14 = Static591.anInt4863 + Static591.anInt4873;
					local16 = Static591.anInt4858 + Static591.anInt4877;
					local18 = Static591.anInt4866;
					@Pc(4702) int local4702;
					if ((local4702 = local14 - (super.anInt4871 << 12)) >= 0) {
						local935 = (Static591.anInt4870 - local4702) / Static591.anInt4870;
						local18 += local935;
						local14 += Static591.anInt4870 * local935;
						local16 += Static591.anInt4865 * local935;
						local12 += local935;
					}
					@Pc(4736) int local4736;
					if ((local4736 = (local14 - Static591.anInt4870) / Static591.anInt4870) > local18) {
						local18 = local4736;
					}
					if (local16 < 0) {
						local935 = (Static591.anInt4865 - local16 - 1) / Static591.anInt4865;
						local18 += local935;
						local14 += Static591.anInt4870 * local935;
						local16 += Static591.anInt4865 * local935;
						local12 += local935;
					}
					@Pc(4784) int local4784;
					if ((local4784 = (local16 + 1 - (super.anInt4869 << 12) - Static591.anInt4865) / Static591.anInt4865) > local18) {
						local18 = local4784;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray75[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local209 = this.anIntArray75[local48];
							local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
							local217 = 256 - local213;
							if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (local213 == 255) {
								local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
								local3[local51] = (local221 | local334 | local342) >>> 8;
							} else {
								local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
								local209 = (local221 | local334 | local342) >>> 8;
								local354 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray75[local48];
							local213 = Static591.anInt4847;
							local217 = local209 + local213;
							local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
							local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
							local334 = local217 - local334 | local334 - (local334 >>> 8);
							local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
							local354 = 256 - local342;
							if (local342 != 255) {
								local209 = local334;
								local334 = local3[local51];
								local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
							}
							local3[local51] = local334;
						} else if (arg0 == 2) {
							local209 = this.anIntArray75[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
							local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
							local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
							local342 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static591.anInt4870;
						local16 += Static591.anInt4865;
						local18++;
					}
					local9++;
					Static591.anInt4863 += Static591.anInt4862;
					Static591.anInt4858 += Static591.anInt4875;
					Static591.anInt4876 += Static591.anInt4850;
				}
			}
		} else if (Static591.anInt4865 == 0) {
			local9 = Static591.anInt4854;
			while (local9 < 0) {
				local12 = Static591.anInt4876;
				local14 = Static591.anInt4863 + Static591.anInt4873;
				local16 = Static591.anInt4858;
				local18 = Static591.anInt4866;
				if (local16 >= 0 && local16 - (super.anInt4869 << 12) < 0) {
					if (local14 < 0) {
						local935 = (Static591.anInt4870 - local14 - 1) / Static591.anInt4870;
						local18 += local935;
						local14 += Static591.anInt4870 * local935;
						local12 += local935;
					}
					@Pc(5726) int local5726;
					if ((local5726 = (local14 + 1 - (super.anInt4871 << 12) - Static591.anInt4870) / Static591.anInt4870) > local18) {
						local18 = local5726;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray75[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local209 = this.anIntArray75[local48];
							local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
							local217 = 256 - local213;
							if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (local213 == 255) {
								local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
								local3[local51] = (local221 | local334 | local342) >>> 8;
							} else {
								local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
								local209 = (local221 | local334 | local342) >>> 8;
								local354 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray75[local48];
							local213 = Static591.anInt4847;
							local217 = local209 + local213;
							local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
							local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
							local334 = local217 - local334 | local334 - (local334 >>> 8);
							local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
							local354 = 256 - local342;
							if (local342 != 255) {
								local209 = local334;
								local334 = local3[local51];
								local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
							}
							local3[local51] = local334;
						} else if (arg0 == 2) {
							local209 = this.anIntArray75[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
							local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
							local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
							local342 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static591.anInt4870;
						local18++;
					}
				}
				local9++;
				Static591.anInt4863 += Static591.anInt4862;
				Static591.anInt4858 += Static591.anInt4875;
				Static591.anInt4876 += Static591.anInt4850;
			}
		} else if (Static591.anInt4865 < 0) {
			for (local9 = Static591.anInt4854; local9 < 0; local9++) {
				local12 = Static591.anInt4876;
				local14 = Static591.anInt4863 + Static591.anInt4873;
				local16 = Static591.anInt4858 + Static591.anInt4877;
				local18 = Static591.anInt4866;
				if (local14 < 0) {
					local935 = (Static591.anInt4870 - local14 - 1) / Static591.anInt4870;
					local18 += local935;
					local14 += Static591.anInt4870 * local935;
					local16 += Static591.anInt4865 * local935;
					local12 += local935;
				}
				@Pc(6663) int local6663;
				if ((local6663 = (local14 + 1 - (super.anInt4871 << 12) - Static591.anInt4870) / Static591.anInt4870) > local18) {
					local18 = local6663;
				}
				@Pc(6675) int local6675;
				if ((local6675 = local16 - (super.anInt4869 << 12)) >= 0) {
					local935 = (Static591.anInt4865 - local6675) / Static591.anInt4865;
					local18 += local935;
					local14 += Static591.anInt4870 * local935;
					local16 += Static591.anInt4865 * local935;
					local12 += local935;
				}
				@Pc(6709) int local6709;
				if ((local6709 = (local16 - Static591.anInt4865) / Static591.anInt4865) > local18) {
					local18 = local6709;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray75[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else if (arg0 == 0) {
						local209 = this.anIntArray75[local48];
						local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
						local217 = 256 - local213;
						if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (local213 == 255) {
							local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
							local3[local51] = (local221 | local334 | local342) >>> 8;
						} else {
							local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
							local209 = (local221 | local334 | local342) >>> 8;
							local354 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray75[local48];
						local213 = Static591.anInt4847;
						local217 = local209 + local213;
						local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
						local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
						local334 = local217 - local334 | local334 - (local334 >>> 8);
						local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
						local354 = 256 - local342;
						if (local342 != 255) {
							local209 = local334;
							local334 = local3[local51];
							local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
						}
						local3[local51] = local334;
					} else if (arg0 == 2) {
						local209 = this.anIntArray75[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
						local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
						local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
						local342 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static591.anInt4870;
					local16 += Static591.anInt4865;
					local18++;
				}
				Static591.anInt4863 += Static591.anInt4862;
				Static591.anInt4858 += Static591.anInt4875;
				Static591.anInt4876 += Static591.anInt4850;
			}
		} else {
			for (local9 = Static591.anInt4854; local9 < 0; local9++) {
				local12 = Static591.anInt4876;
				local14 = Static591.anInt4863 + Static591.anInt4873;
				local16 = Static591.anInt4858 + Static591.anInt4877;
				local18 = Static591.anInt4866;
				if (local14 < 0) {
					local935 = (Static591.anInt4870 - local14 - 1) / Static591.anInt4870;
					local18 += local935;
					local14 += Static591.anInt4870 * local935;
					local16 += Static591.anInt4865 * local935;
					local12 += local935;
				}
				@Pc(7648) int local7648;
				if ((local7648 = (local14 + 1 - (super.anInt4871 << 12) - Static591.anInt4870) / Static591.anInt4870) > local18) {
					local18 = local7648;
				}
				if (local16 < 0) {
					local935 = (Static591.anInt4865 - local16 - 1) / Static591.anInt4865;
					local18 += local935;
					local14 += Static591.anInt4870 * local935;
					local16 += Static591.anInt4865 * local935;
					local12 += local935;
				}
				@Pc(7696) int local7696;
				if ((local7696 = (local16 + 1 - (super.anInt4869 << 12) - Static591.anInt4865) / Static591.anInt4865) > local18) {
					local18 = local7696;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt4871 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray75[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else if (arg0 == 0) {
						local209 = this.anIntArray75[local48];
						local213 = (local209 >>> 24) * Static591.anInt4849 >> 8;
						local217 = 256 - local213;
						if ((Static591.anInt4847 & 0xFFFFFF) == 16777215) {
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (local213 == 255) {
							local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
							local3[local51] = (local221 | local334 | local342) >>> 8;
						} else {
							local221 = (local209 & 0xFF0000) * Static591.anInt4856 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static591.anInt4867 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static591.anInt4855 & 0xFF00;
							local209 = (local221 | local334 | local342) >>> 8;
							local354 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray75[local48];
						local213 = Static591.anInt4847;
						local217 = local209 + local213;
						local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
						local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
						local334 = local217 - local334 | local334 - (local334 >>> 8);
						local342 = (local209 >>> 24) * Static591.anInt4849 >> 8;
						local354 = 256 - local342;
						if (local342 != 255) {
							local209 = local334;
							local334 = local3[local51];
							local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
						}
						local3[local51] = local334;
					} else if (arg0 == 2) {
						local209 = this.anIntArray75[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = (local209 & 0xFF00FF) * Static591.anInt4849 & 0xFF00FF00;
						local334 = (local209 & 0xFF00) * Static591.anInt4849 & 0xFF0000;
						local209 = ((local221 | local334) >>> 8) + Static591.anInt4851;
						local342 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static591.anInt4870;
					local16 += Static591.anInt4865;
					local18++;
				}
				Static591.anInt4863 += Static591.anInt4862;
				Static591.anInt4858 += Static591.anInt4875;
				Static591.anInt4876 += Static591.anInt4850;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass13_Sub3_8.method8532()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass13_Sub3_8.anInt9709;
			@Pc(29) int local29 = super.anInt4852 + super.anInt4871 + super.anInt4868;
			@Pc(38) int local38 = super.anInt4872 + super.anInt4869 + super.anInt4861;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt4852 > 0) {
				local64 = ((super.anInt4852 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 = local64 * local44 - (super.anInt4852 << 16);
			}
			if (super.anInt4872 > 0) {
				local64 = ((super.anInt4872 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 = local64 * local50 - (super.anInt4872 << 16);
			}
			if (super.anInt4871 < local29) {
				arg2 = ((super.anInt4871 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt4869 < local38) {
				arg3 = ((super.anInt4869 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass13_Sub3_8.anInt9702) {
				arg3 -= arg1 + arg3 - super.aClass13_Sub3_8.anInt9702;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass13_Sub3_8.anInt9717) {
				local180 = super.aClass13_Sub3_8.anInt9717 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass13_Sub3_8.anInt9694) {
				local180 = arg0 + arg2 - super.aClass13_Sub3_8.anInt9694;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass13_Sub3_8.anInt9703) {
				local180 = super.aClass13_Sub3_8.anInt9703 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass13_Sub3_8.anIntArray840;
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
				@Pc(883) int local883;
				@Pc(891) int local891;
				@Pc(903) int local903;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt4871;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray75[(local14 >> 16) + local270];
								local338 = local330 >>> 24;
								local341 = 256 - local338;
								local351 = local252[local64];
								local252[local64++] = ((local330 & 0xFF00FF) * local338 + (local351 & 0xFF00FF) * local341 >> 8 & 0xFFFF00FF) + (((local330 & 0xFF00FF00) >>> 8) * local338 + ((local351 & 0xFF00FF00) >>> 8) * local341 & 0xFF00FF00);
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 0) {
						local259 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local262 = -arg3; local262 < 0; local262++) {
								local270 = (local16 >> 16) * super.anInt4871;
								for (local273 = -arg2; local273 < 0; local273++) {
									local330 = this.anIntArray75[(local14 >> 16) + local270];
									local338 = (local330 >>> 24) * (arg5 >>> 24) >> 8;
									local341 = 256 - local338;
									local351 = local252[local64];
									local252[local64++] = ((local330 & 0xFF00FF) * local338 + (local351 & 0xFF00FF) * local341 & 0xFF00FF00) + ((local330 & 0xFF00) * local338 + (local351 & 0xFF00) * local341 & 0xFF0000) >> 8;
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
							for (local330 = -arg3; local330 < 0; local330++) {
								local338 = (local16 >> 16) * super.anInt4871;
								for (local341 = -arg2; local341 < 0; local341++) {
									local351 = this.anIntArray75[(local14 >> 16) + local338];
									local359 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local367 = 256 - local359;
									if (local359 == 255) {
										local375 = (local351 & 0xFF0000) * local262 & 0xFF000000;
										local883 = (local351 & 0xFF00) * local270 & 0xFF0000;
										local891 = (local351 & 0xFF) * local273 & 0xFF00;
										local252[local64++] = (local375 | local883 | local891) >>> 8;
									} else {
										local375 = (local351 & 0xFF0000) * local262 & 0xFF000000;
										local883 = (local351 & 0xFF00) * local270 & 0xFF0000;
										local891 = (local351 & 0xFF) * local273 & 0xFF00;
										local351 = (local375 | local883 | local891) >>> 8;
										local903 = local252[local64];
										local252[local64++] = ((local351 & 0xFF00FF) * local359 + (local903 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local351 & 0xFF00) * local359 + (local903 & 0xFF00) * local367 & 0xFF0000) >> 8;
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
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt4871;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray75[(local14 >> 16) + local270];
								local338 = local330 + arg5;
								local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
								local351 = local338 - local351 | local351 - (local351 >>> 8);
								local359 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
								local367 = 256 - local359;
								if (local359 != 255) {
									local330 = local351;
									local351 = local252[local64];
									local351 = ((local330 & 0xFF00FF) * local359 + (local351 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local330 & 0xFF00) * local359 + (local351 & 0xFF00) * local367 & 0xFF0000) >> 8;
								}
								local252[local64++] = local351;
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
							local341 = (local16 >> 16) * super.anInt4871;
							for (local351 = -arg2; local351 < 0; local351++) {
								local359 = this.anIntArray75[(local14 >> 16) + local341];
								local367 = local359 >>> 24;
								local375 = 256 - local367;
								local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
								local359 = ((local270 | local273) >>> 8) + local525;
								local883 = local252[local64];
								local252[local64++] = ((local359 & 0xFF00FF) * local367 + (local883 & 0xFF00FF) * local375 & 0xFF00FF00) + ((local359 & 0xFF00) * local367 + (local883 & 0xFF00) * local375 & 0xFF0000) >> 8;
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
						local270 = (local16 >> 16) * super.anInt4871;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray75[(local14 >> 16) + local270];
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
						local338 = (local16 >> 16) * super.anInt4871;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray75[(local14 >> 16) + local338];
							if (local351 == 0) {
								local64++;
							} else {
								local359 = (local351 & 0xFF0000) * local262 & 0xFF000000;
								local367 = (local351 & 0xFF00) * local270 & 0xFF0000;
								local375 = (local351 & 0xFF) * local273 & 0xFF00;
								local351 = (local359 | local367 | local375) >>> 8;
								local883 = local252[local64];
								local891 = local351 + local883;
								local903 = (local351 & 0xFF00FF) + (local883 & 0xFF00FF);
								local883 = (local903 & 0x1000100) + (local891 - local903 & 0x10000);
								local252[local64++] = local891 - local883 | local883 - (local883 >>> 8);
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
						local270 = (local16 >> 16) * super.anInt4871;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray75[(local14 >> 16) + local270];
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
						local341 = (local16 >> 16) * super.anInt4871;
						for (local351 = -arg2; local351 < 0; local351++) {
							local359 = this.anIntArray75[(local14 >> 16) + local341];
							if (local359 == 0) {
								local64++;
							} else {
								local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
								local359 = ((local270 | local273) >>> 8) + local525;
								local367 = local252[local64];
								local375 = local359 + local367;
								local883 = (local359 & 0xFF00FF) + (local367 & 0xFF00FF);
								@Pc(1754) int local1754 = (local883 & 0x1000100) + (local375 - local883 & 0x10000);
								local252[local64++] = local375 - local1754 | local1754 - (local1754 >>> 8);
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
					local270 = (local16 >> 16) * super.anInt4871;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray75[(local14 >> 16) + local270];
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
					local338 = (local16 >> 16) * super.anInt4871;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray75[(local14 >> 16) + local338];
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
					local270 = (local16 >> 16) * super.anInt4871;
					for (local273 = -arg2; local273 < 0; local273++) {
						local330 = this.anIntArray75[(local14 >> 16) + local270];
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
					local341 = (local16 >> 16) * super.anInt4871;
					for (local351 = -arg2; local351 < 0; local351++) {
						local359 = this.anIntArray75[(local14 >> 16) + local341];
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

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass13_Sub3_8.method8532()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt4852;
		arg1 += super.anInt4872;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass13_Sub3_8.anInt9709;
		@Pc(26) int local26 = super.anInt4871;
		@Pc(29) int local29 = super.anInt4869;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass13_Sub3_8.anInt9717) {
			local52 = super.aClass13_Sub3_8.anInt9717 - arg1;
			local29 -= local52;
			arg1 = super.aClass13_Sub3_8.anInt9717;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass13_Sub3_8.anInt9702) {
			local29 -= arg1 + local29 - super.aClass13_Sub3_8.anInt9702;
		}
		if (arg0 < super.aClass13_Sub3_8.anInt9703) {
			local52 = super.aClass13_Sub3_8.anInt9703 - arg0;
			local26 -= local52;
			arg0 = super.aClass13_Sub3_8.anInt9703;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass13_Sub3_8.anInt9694) {
			local52 = arg0 + local26 - super.aClass13_Sub3_8.anInt9694;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class1_Sub2 local159 = (Class1_Sub2) arg2;
		@Pc(162) int[] local162 = local159.anIntArray458;
		@Pc(165) int[] local165 = local159.anIntArray456;
		@Pc(169) int[] local169 = super.aClass13_Sub3_8.anIntArray840;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt4871;
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
				@Pc(311) int local311 = this.anIntArray75[local19++];
				@Pc(315) int local315 = local311 >>> 24;
				@Pc(319) int local319 = 256 - local315;
				@Pc(323) int local323 = local169[local41];
				local169[local41++] = ((local311 & 0xFF00FF) * local315 + (local323 & 0xFF00FF) * local319 & 0xFF00FF00) + ((local311 & 0xFF00) * local315 + (local323 & 0xFF00) * local319 & 0xFF0000) >> 8;
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}
}
