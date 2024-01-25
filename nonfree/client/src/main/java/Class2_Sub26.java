import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	private int anInt3148;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	private int anInt3153;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Lclient!sa;")
	private final Class2_Sub29 aClass2_Sub29_1;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_22;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!mr;")
	private final Class162_Sub2 aClass162_Sub2_1;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	private final int anInt3149;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	private final int anInt3151;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	private final int anInt3145;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	private final int anInt3147;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Lclient!hf;")
	private final Class100 aClass100_4;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!nn;")
	private final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!fw;")
	private final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Lclient!hf;")
	private final Class100 aClass100_5;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Lclient!sv;")
	private Class2_Sub13 aClass2_Sub13_4;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!dv;")
	private Class2_Sub13_Sub1 aClass2_Sub13_Sub1_2;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Lclient!ew;")
	private Class72 aClass72_20;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!pg;Lclient!mr;Lclient!sa;[I)V")
	public Class2_Sub26(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class162_Sub2 arg1, @OriginalArg(2) Class2_Sub29 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub29_1 = arg2;
		this.aClass163_Sub2_22 = arg0;
		this.aClass162_Sub2_1 = arg1;
		@Pc(23) int local23 = this.aClass2_Sub29_1.method5691() - (arg1.anInt4134 >> 1);
		this.anInt3149 = this.aClass2_Sub29_1.method5687() - local23 >> arg1.anInt4139;
		this.anInt3151 = this.aClass2_Sub29_1.method5687() + local23 >> arg1.anInt4139;
		this.anInt3145 = this.aClass2_Sub29_1.method5693() - local23 >> arg1.anInt4139;
		this.anInt3147 = local23 + this.aClass2_Sub29_1.method5693() >> arg1.anInt4139;
		@Pc(79) int local79 = this.anInt3151 + 1 - this.anInt3149;
		@Pc(88) int local88 = this.anInt3147 + 1 - this.anInt3145;
		this.aFloatArrayArray5 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray3 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray4 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(142) int local142;
		@Pc(149) int local149;
		@Pc(173) int local173;
		@Pc(188) int local188;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt3145 + local117;
			if (local124 > 0 && this.aClass162_Sub2_1.anInt4137 - 1 > local124) {
				for (local142 = 0; local142 <= local79; local142++) {
					local149 = this.anInt3149 + local142;
					if (local149 > 0 && local149 < this.aClass162_Sub2_1.anInt4138 - 1) {
						local173 = arg1.ua(local149 + 1, local124) - arg1.ua(local149 - 1, local124);
						local188 = arg1.ua(local149, local124 + 1) - arg1.ua(local149, local124 - 1);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local173 * local173 + 65536)));
						this.aFloatArrayArray5[local142][local117] = local203 * (float) local173;
						this.aFloatArrayArray3[local142][local117] = -256.0F * local203;
						this.aFloatArrayArray4[local142][local117] = local203 * (float) local188;
					}
				}
			}
		}
		local124 = 0;
		local142 = 0;
		for (local149 = this.anInt3145; local149 <= this.anInt3147; local149++) {
			if (local149 >= 0 && arg1.anInt4137 > local149) {
				for (local173 = this.anInt3149; local173 <= this.anInt3151; local173++) {
					if (local173 >= 0 && local173 < arg1.anInt4138) {
						local188 = arg3[local142];
						@Pc(285) int[] local285 = arg1.anIntArrayArrayArray6[local173][local149];
						if (local285 != null && local188 != 0) {
							if (local188 == 1) {
								local124 += local285.length;
							} else {
								local124 += 3;
							}
						}
					}
					local142++;
				}
			} else {
				local142 += this.anInt3151 - this.anInt3149;
			}
		}
		if (local124 <= 0) {
			this.aClass100_4 = null;
			this.anInterface11_3 = null;
			this.anInterface5_3 = null;
			this.aClass100_5 = null;
		} else {
			this.aClass2_Sub13_4 = new Class2_Sub13(local124 * 2);
			this.aClass2_Sub13_Sub1_2 = new Class2_Sub13_Sub1(local124 * 16);
			this.aClass72_20 = new Class72(Static29.method453(local124));
			local142 = 0;
			local173 = 0;
			for (local188 = this.anInt3145; local188 <= this.anInt3147; local188++) {
				if (local188 >= 0 && arg1.anInt4137 > local188) {
					@Pc(405) int local405 = 0;
					for (@Pc(408) int local408 = this.anInt3149; local408 <= this.anInt3151; local408++) {
						if (local408 >= 0 && local408 < arg1.anInt4138) {
							@Pc(424) int local424 = arg3[local142];
							@Pc(431) int[] local431 = arg1.anIntArrayArrayArray6[local408][local188];
							@Pc(438) int[] local438 = arg1.anIntArrayArrayArray5[local408][local188];
							if (local431 != null && local424 != 0) {
								if (local424 == 1) {
									for (@Pc(447) int local447 = 0; local447 < local431.length; local447++) {
										this.method2556(local431[local447], local405, local438[local447], local173, local408, local188);
									}
								} else if (local424 == 3) {
									this.method2556(0, local405, 0, local173, local408, local188);
									this.method2556(arg1.anInt4134, local405, 0, local173, local408, local188);
									this.method2556(0, local405, arg1.anInt4134, local173, local408, local188);
								} else if (local424 == 2) {
									this.method2556(arg1.anInt4134, local405, 0, local173, local408, local188);
									this.method2556(arg1.anInt4134, local405, arg1.anInt4134, local173, local408, local188);
									this.method2556(0, local405, 0, local173, local408, local188);
								} else if (local424 == 5) {
									this.method2556(arg1.anInt4134, local405, arg1.anInt4134, local173, local408, local188);
									this.method2556(0, local405, arg1.anInt4134, local173, local408, local188);
									this.method2556(arg1.anInt4134, local405, 0, local173, local408, local188);
								} else if (local424 == 4) {
									this.method2556(0, local405, arg1.anInt4134, local173, local408, local188);
									this.method2556(0, local405, 0, local173, local408, local188);
									this.method2556(arg1.anInt4134, local405, arg1.anInt4134, local173, local408, local188);
								}
							}
						}
						local142++;
						local405++;
					}
				} else {
					local142 += this.anInt3151 - this.anInt3149;
				}
				local173++;
			}
			this.anInterface5_3 = this.aClass163_Sub2_22.method4147(this.aClass2_Sub13_4.aByteArray52, false, this.aClass2_Sub13_4.anInt4347);
			this.anInterface11_3 = this.aClass163_Sub2_22.method4124(this.aClass2_Sub13_Sub1_2.anInt4347, false, 16, this.aClass2_Sub13_Sub1_2.aByteArray52);
			this.aClass100_5 = new Class100(this.anInterface11_3, 5126, 3, 0);
			this.aClass100_4 = new Class100(this.anInterface11_3, 5121, 4, 12);
		}
		this.aClass2_Sub13_Sub1_2 = null;
		this.aClass2_Sub13_4 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray3 = this.aFloatArrayArray4 = null;
		this.aClass72_20 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([[ZIIII)V")
	public void method2554(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface5_3 == null || (this.anInt3149 > arg1 + arg3 || (arg3 - arg1 > this.anInt3151 || (this.anInt3145 > arg2 + arg1 || this.anInt3147 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt3145; local54 <= this.anInt3147; local54++) {
			for (@Pc(59) int local59 = this.anInt3149; local59 <= this.anInt3151; local59++) {
				@Pc(65) int local65 = local59 - arg3;
				@Pc(70) int local70 = local54 - arg2;
				if (local65 > -arg1 && local65 < arg1 && local70 > -arg1 && arg1 > local70 && arg0[arg1 + local65][arg1 + local70]) {
					this.aClass163_Sub2_22.method4129((int) (this.aClass2_Sub29_1.method5694() * 255.0F) << 24);
					this.aClass163_Sub2_22.method4114(null, null, this.aClass100_4, this.aClass100_5);
					this.aClass163_Sub2_22.method4105(0, this.anInterface5_3, this.anInt3153);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IS)V")
	private void method2555(@OriginalArg(1) short arg0) {
		if (this.aClass163_Sub2_22.aBoolean374) {
			this.aClass2_Sub13_4.method3568(arg0);
		} else {
			this.aClass2_Sub13_4.method3540(arg0);
		}
		this.anInt3153++;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
	private void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg0 + (arg4 << this.aClass162_Sub2_1.anInt4139);
		@Pc(23) int local23 = (arg5 << this.aClass162_Sub2_1.anInt4139) + arg2;
		@Pc(29) int local29 = this.aClass162_Sub2_1.ca(local15, local23);
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(60) Class2 local60 = this.aClass72_20.method1659(local7);
			if (local60 != null) {
				this.method2555(((Class2_Sub10) local60).aShort16);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt3148++;
		if (local7 != -1L) {
			this.aClass72_20.method1653(new Class2_Sub10(local80), local7);
		}
		@Pc(107) float local107;
		@Pc(121) float local121;
		@Pc(114) float local114;
		@Pc(165) float local165;
		@Pc(173) float local173;
		@Pc(180) float local180;
		@Pc(187) float local187;
		@Pc(194) float local194;
		@Pc(203) float local203;
		@Pc(212) float local212;
		@Pc(288) float local288;
		if (arg0 == 0 && arg2 == 0) {
			local107 = this.aFloatArrayArray5[arg1][arg3];
			local114 = this.aFloatArrayArray4[arg1][arg3];
			local121 = this.aFloatArrayArray3[arg1][arg3];
		} else if (this.aClass162_Sub2_1.anInt4134 == arg0 && arg2 == 0) {
			local107 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local121 = this.aFloatArrayArray3[arg1 + 1][arg3];
			local114 = this.aFloatArrayArray4[arg1 + 1][arg3];
		} else if (this.aClass162_Sub2_1.anInt4134 == arg0 && this.aClass162_Sub2_1.anInt4134 == arg2) {
			local121 = this.aFloatArrayArray3[arg1 + 1][arg3 + 1];
			local107 = this.aFloatArrayArray5[arg1 + 1][arg3 + 1];
			local114 = this.aFloatArrayArray4[arg1 + 1][arg3 + 1];
		} else if (arg0 == 0 && arg2 == this.aClass162_Sub2_1.anInt4134) {
			local121 = this.aFloatArrayArray3[arg1][arg3 + 1];
			local107 = this.aFloatArrayArray5[arg1][arg3 + 1];
			local114 = this.aFloatArrayArray4[arg1][arg3 + 1];
		} else {
			local165 = (float) arg0 / (float) this.aClass162_Sub2_1.anInt4134;
			local173 = (float) arg2 / (float) this.aClass162_Sub2_1.anInt4134;
			local180 = this.aFloatArrayArray5[arg1][arg3];
			local187 = this.aFloatArrayArray3[arg1][arg3];
			local194 = this.aFloatArrayArray4[arg1][arg3];
			local203 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local212 = this.aFloatArrayArray3[arg1 + 1][arg3];
			@Pc(230) float local230 = local203 + local165 * (this.aFloatArrayArray5[arg1 + 1][arg3 + 1] - local203);
			@Pc(246) float local246 = local187 + (this.aFloatArrayArray3[arg1][arg3 + 1] - local187) * local165;
			@Pc(263) float local263 = local212 + (this.aFloatArrayArray3[arg1 + 1][arg3 + 1] - local212) * local165;
			@Pc(279) float local279 = local194 + (this.aFloatArrayArray4[arg1][arg3 + 1] - local194) * local165;
			local288 = this.aFloatArrayArray4[arg1 + 1][arg3];
			@Pc(303) float local303 = local180 + local165 * (this.aFloatArrayArray5[arg1][arg3 + 1] - local180);
			local121 = local246 + (local263 - local246) * local173;
			@Pc(329) float local329 = local288 + (this.aFloatArrayArray4[arg1 + 1][arg3 + 1] - local288) * local165;
			local107 = local303 + local173 * (local230 - local303);
			local114 = local279 + local173 * (local329 - local279);
		}
		local165 = this.aClass2_Sub29_1.method5687() - local15;
		local173 = this.aClass2_Sub29_1.method5695() - local29;
		local180 = this.aClass2_Sub29_1.method5693() - local23;
		local187 = (float) Math.sqrt((double) (local180 * local180 + local165 * local165 + local173 * local173));
		local194 = 1.0F / local187;
		local165 *= local194;
		local173 *= local194;
		local180 *= local194;
		local203 = local187 / (float) this.aClass2_Sub29_1.method5691();
		local212 = 1.0F - local203 * local203;
		if (local212 < 0.0F) {
			local212 = 0.0F;
		}
		local288 = local114 * local180 + local165 * local107 + local121 * local173;
		if (local288 < 0.0F) {
			local288 = 0.0F;
		}
		@Pc(543) float local543 = local288 * 2.0F * local212;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass2_Sub29_1.method5692();
		@Pc(564) int local564 = (int) (local543 * (float) (local554 >> 16 & 0xFF));
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(579) int local579 = (int) (local543 * (float) (local554 >> 8 & 0xFF));
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(598) int local598 = (int) ((float) (local554 & 0xFF) * local543);
		if (this.aClass163_Sub2_22.aBoolean374) {
			this.aClass2_Sub13_Sub1_2.method1353((float) local15);
			this.aClass2_Sub13_Sub1_2.method1353((float) local29);
			this.aClass2_Sub13_Sub1_2.method1353((float) local23);
		} else {
			this.aClass2_Sub13_Sub1_2.method1354((float) local15);
			this.aClass2_Sub13_Sub1_2.method1354((float) local29);
			this.aClass2_Sub13_Sub1_2.method1354((float) local23);
		}
		if (local598 > 255) {
			local598 = 255;
		}
		this.aClass2_Sub13_Sub1_2.method3602(local564);
		this.aClass2_Sub13_Sub1_2.method3602(local579);
		this.aClass2_Sub13_Sub1_2.method3602(local598);
		this.aClass2_Sub13_Sub1_2.method3602(255);
		this.method2555(local80);
	}
}
