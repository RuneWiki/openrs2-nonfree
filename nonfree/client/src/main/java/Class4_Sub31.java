import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	private int anInt5226;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "I")
	private int anInt5236;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Lclient!dd;")
	private final Class4_Sub8 aClass4_Sub8_2;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_32;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Lclient!lh;")
	private final Class146_Sub1 aClass146_Sub1_2;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	private final int anInt5232;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	private final int anInt5233;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	private final int anInt5235;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "I")
	private final int anInt5230;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "Lclient!tl;")
	private Class4_Sub30 aClass4_Sub30_7;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "Lclient!rp;")
	private Class4_Sub30_Sub2 aClass4_Sub30_Sub2_1;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "Lclient!qo;")
	private Class196 aClass196_26;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "Lclient!tu;")
	private final Interface12 anInterface12_5;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "Lclient!gf;")
	private final Interface6 anInterface6_6;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "Lclient!it;")
	private final Class124 aClass124_13;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "Lclient!it;")
	private final Class124 aClass124_12;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!bv;Lclient!lh;Lclient!dd;[I)V")
	public Class4_Sub31(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class146_Sub1 arg1, @OriginalArg(2) Class4_Sub8 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub8_2 = arg2;
		this.aClass30_Sub1_32 = arg0;
		this.aClass146_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass4_Sub8_2.method5679() - (arg1.anInt4733 >> 1);
		this.anInt5232 = this.aClass4_Sub8_2.method5676() - local22 >> arg1.anInt4734;
		this.anInt5233 = this.aClass4_Sub8_2.method5676() + local22 >> arg1.anInt4734;
		this.anInt5235 = this.aClass4_Sub8_2.method5682() - local22 >> arg1.anInt4734;
		this.anInt5230 = local22 + this.aClass4_Sub8_2.method5682() >> arg1.anInt4734;
		@Pc(76) int local76 = this.anInt5233 + 1 - this.anInt5232;
		@Pc(85) int local85 = this.anInt5230 + 1 - this.anInt5235;
		this.aFloatArrayArray6 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray7 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(166) int local166;
		@Pc(181) int local181;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt5235;
			if (local122 > 0 && local122 < this.aClass146_Sub1_2.anInt4732 - 1) {
				for (local133 = 0; local133 <= local76; local133++) {
					local140 = local133 + this.anInt5232;
					if (local140 > 0 && this.aClass146_Sub1_2.anInt4730 - 1 > local140) {
						local166 = arg1.I(local140 + 1, local122) - arg1.I(local140 - 1, local122);
						local181 = arg1.I(local140, local122 + 1) - arg1.I(local140, local122 - 1);
						@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local181 * local181 + local166 * local166 + 65536)));
						this.aFloatArrayArray8[local133][local114] = (float) local166 * local196;
						this.aFloatArrayArray6[local133][local114] = local196 * -256.0F;
						this.aFloatArrayArray7[local133][local114] = (float) local181 * local196;
					}
				}
			}
		}
		local122 = 0;
		local133 = 0;
		for (local140 = this.anInt5235; local140 <= this.anInt5230; local140++) {
			if (local140 >= 0 && arg1.anInt4732 > local140) {
				for (local166 = this.anInt5232; local166 <= this.anInt5233; local166++) {
					if (local166 >= 0 && arg1.anInt4730 > local166) {
						local181 = arg3[local133];
						@Pc(274) int[] local274 = arg1.anIntArrayArrayArray6[local166][local140];
						if (local274 != null && local181 != 0) {
							if (local181 == 1) {
								local122 += local274.length;
							} else {
								local122 += 3;
							}
						}
					}
					local133++;
				}
			} else {
				local133 += this.anInt5233 - this.anInt5232;
			}
		}
		if (local122 > 0) {
			this.aClass4_Sub30_7 = new Class4_Sub30(local122 * 2);
			this.aClass4_Sub30_Sub2_1 = new Class4_Sub30_Sub2(local122 * 16);
			this.aClass196_26 = new Class196(Static183.method2711(local122));
			local166 = 0;
			local133 = 0;
			for (local181 = this.anInt5235; local181 <= this.anInt5230; local181++) {
				if (local181 >= 0 && local181 < arg1.anInt4732) {
					@Pc(361) int local361 = 0;
					for (@Pc(364) int local364 = this.anInt5232; local364 <= this.anInt5233; local364++) {
						if (local364 >= 0 && arg1.anInt4730 > local364) {
							@Pc(380) int local380 = arg3[local133];
							@Pc(387) int[] local387 = arg1.anIntArrayArrayArray6[local364][local181];
							@Pc(394) int[] local394 = arg1.anIntArrayArrayArray5[local364][local181];
							if (local387 != null && local380 != 0) {
								if (local380 == 1) {
									for (@Pc(553) int local553 = 0; local553 < local387.length; local553++) {
										this.method4022(local361, local166, local394[local553], local387[local553], local364, local181);
									}
								} else if (local380 == 3) {
									this.method4022(local361, local166, 0, 0, local364, local181);
									this.method4022(local361, local166, 0, arg1.anInt4733, local364, local181);
									this.method4022(local361, local166, arg1.anInt4733, 0, local364, local181);
								} else if (local380 == 2) {
									this.method4022(local361, local166, 0, arg1.anInt4733, local364, local181);
									this.method4022(local361, local166, arg1.anInt4733, arg1.anInt4733, local364, local181);
									this.method4022(local361, local166, 0, 0, local364, local181);
								} else if (local380 == 5) {
									this.method4022(local361, local166, arg1.anInt4733, arg1.anInt4733, local364, local181);
									this.method4022(local361, local166, arg1.anInt4733, 0, local364, local181);
									this.method4022(local361, local166, 0, arg1.anInt4733, local364, local181);
								} else if (local380 == 4) {
									this.method4022(local361, local166, arg1.anInt4733, 0, local364, local181);
									this.method4022(local361, local166, 0, 0, local364, local181);
									this.method4022(local361, local166, arg1.anInt4733, arg1.anInt4733, local364, local181);
								}
							}
						}
						local133++;
						local361++;
					}
				} else {
					local133 += this.anInt5233 - this.anInt5232;
				}
				local166++;
			}
			this.anInterface12_5 = this.aClass30_Sub1_32.method945(this.aClass4_Sub30_7.aByteArray79, false, this.aClass4_Sub30_7.anInt6244);
			this.anInterface6_6 = this.aClass30_Sub1_32.method941(16, this.aClass4_Sub30_Sub2_1.aByteArray79, this.aClass4_Sub30_Sub2_1.anInt6244, false);
			this.aClass124_13 = new Class124(this.anInterface6_6, 5126, 3, 0);
			this.aClass124_12 = new Class124(this.anInterface6_6, 5121, 4, 12);
		} else {
			this.anInterface6_6 = null;
			this.aClass124_12 = null;
			this.aClass124_13 = null;
			this.anInterface12_5 = null;
		}
		this.aFloatArrayArray8 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.aClass4_Sub30_7 = null;
		this.aClass4_Sub30_Sub2_1 = null;
		this.aClass196_26 = null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII)V")
	private void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass146_Sub1_2.anInt4734) + arg3;
		@Pc(24) int local24 = arg2 + (arg5 << this.aClass146_Sub1_2.anInt4734);
		@Pc(30) int local30 = this.aClass146_Sub1_2.va(local15, local24);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class4 local59 = this.aClass196_26.method4477(local7);
			if (local59 != null) {
				this.method4024(((Class4_Sub37) local59).aShort86);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt5236++;
		if (local7 != -1L) {
			this.aClass196_26.method4474(local7, new Class4_Sub37(local79));
		}
		@Pc(122) float local122;
		@Pc(140) float local140;
		@Pc(131) float local131;
		@Pc(210) float local210;
		@Pc(218) float local218;
		@Pc(225) float local225;
		@Pc(232) float local232;
		@Pc(239) float local239;
		@Pc(248) float local248;
		@Pc(257) float local257;
		@Pc(311) float local311;
		if (arg3 == 0 && arg2 == 0) {
			local131 = this.aFloatArrayArray7[arg0][arg1];
			local140 = this.aFloatArrayArray6[arg0][arg1];
			local122 = this.aFloatArrayArray8[arg0][arg1];
		} else if (this.aClass146_Sub1_2.anInt4733 == arg3 && arg2 == 0) {
			local122 = this.aFloatArrayArray8[arg0 + 1][arg1];
			local131 = this.aFloatArrayArray7[arg0 + 1][arg1];
			local140 = this.aFloatArrayArray6[arg0 + 1][arg1];
		} else if (this.aClass146_Sub1_2.anInt4733 == arg3 && this.aClass146_Sub1_2.anInt4733 == arg2) {
			local140 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
			local122 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
			local131 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		} else if (arg3 == 0 && arg2 == this.aClass146_Sub1_2.anInt4733) {
			local131 = this.aFloatArrayArray7[arg0][arg1 + 1];
			local122 = this.aFloatArrayArray8[arg0][arg1 + 1];
			local140 = this.aFloatArrayArray6[arg0][arg1 + 1];
		} else {
			local210 = (float) arg3 / (float) this.aClass146_Sub1_2.anInt4733;
			local218 = (float) arg2 / (float) this.aClass146_Sub1_2.anInt4733;
			local225 = this.aFloatArrayArray8[arg0][arg1];
			local232 = this.aFloatArrayArray6[arg0][arg1];
			local239 = this.aFloatArrayArray7[arg0][arg1];
			local248 = this.aFloatArrayArray8[arg0 + 1][arg1];
			local257 = this.aFloatArrayArray6[arg0 + 1][arg1];
			@Pc(272) float local272 = local239 + (this.aFloatArrayArray7[arg0][arg1 + 1] - local239) * local210;
			@Pc(287) float local287 = local232 + local210 * (this.aFloatArrayArray6[arg0][arg1 + 1] - local232);
			@Pc(302) float local302 = local225 + (this.aFloatArrayArray8[arg0][arg1 + 1] - local225) * local210;
			local311 = this.aFloatArrayArray7[arg0 + 1][arg1];
			@Pc(329) float local329 = local248 + local210 * (this.aFloatArrayArray8[arg0 + 1][arg1 + 1] - local248);
			@Pc(346) float local346 = local257 + (this.aFloatArrayArray6[arg0 + 1][arg1 + 1] - local257) * local210;
			local122 = local302 + (local329 - local302) * local218;
			local140 = (local346 - local287) * local218 + local287;
			@Pc(382) float local382 = local311 + (this.aFloatArrayArray7[arg0 + 1][arg1 + 1] - local311) * local210;
			local131 = (local382 - local272) * local218 + local272;
		}
		local210 = this.aClass4_Sub8_2.method5676() - local15;
		local218 = this.aClass4_Sub8_2.method5674() - local30;
		local225 = this.aClass4_Sub8_2.method5682() - local24;
		local232 = (float) Math.sqrt((double) (local218 * local218 + local210 * local210 + local225 * local225));
		local239 = 1.0F / local232;
		local225 *= local239;
		local218 *= local239;
		local210 *= local239;
		local248 = local232 / (float) this.aClass4_Sub8_2.method5679();
		local257 = 1.0F - local248 * local248;
		if (local257 < 0.0F) {
			local257 = 0.0F;
		}
		local311 = local225 * local131 + local218 * local140 + local122 * local210;
		if (local311 < 0.0F) {
			local311 = 0.0F;
		}
		@Pc(551) float local551 = local311 * 2.0F * local257;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass4_Sub8_2.method5683();
		@Pc(572) int local572 = (int) (local551 * (float) (local562 >> 16 & 0xFF));
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(587) int local587 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(602) int local602 = (int) ((float) (local562 & 0xFF) * local551);
		if (local602 > 255) {
			local602 = 255;
		}
		if (this.aClass30_Sub1_32.aBoolean76) {
			this.aClass4_Sub30_Sub2_1.method4896((float) local15);
			this.aClass4_Sub30_Sub2_1.method4896((float) local30);
			this.aClass4_Sub30_Sub2_1.method4896((float) local24);
		} else {
			this.aClass4_Sub30_Sub2_1.method4892((float) local15);
			this.aClass4_Sub30_Sub2_1.method4892((float) local30);
			this.aClass4_Sub30_Sub2_1.method4892((float) local24);
		}
		this.aClass4_Sub30_Sub2_1.method4871(local572);
		this.aClass4_Sub30_Sub2_1.method4871(local587);
		this.aClass4_Sub30_Sub2_1.method4871(local602);
		this.aClass4_Sub30_Sub2_1.method4871(255);
		this.method4024(local79);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[[Z)V")
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface12_5 == null || (arg1 + arg0 < this.anInt5232 || (this.anInt5233 < arg0 - arg1 || (arg2 + arg1 < this.anInt5235 || arg2 - arg1 > this.anInt5230)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt5235; local62 <= this.anInt5230; local62++) {
			for (@Pc(67) int local67 = this.anInt5232; local67 <= this.anInt5233; local67++) {
				@Pc(74) int local74 = local67 - arg0;
				@Pc(79) int local79 = local62 - arg2;
				if (-arg1 < local74 && arg1 > local74 && local79 > -arg1 && arg1 > local79 && arg3[arg1 + local74][local79 + arg1]) {
					this.aClass30_Sub1_32.method921((int) (this.aClass4_Sub8_2.method5675() * 255.0F) << 24);
					this.aClass30_Sub1_32.method919(null, this.aClass124_13, null, this.aClass124_12);
					this.aClass30_Sub1_32.method958(0, this.anInt5226, this.anInterface12_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(SI)V")
	private void method4024(@OriginalArg(0) short arg0) {
		if (this.aClass30_Sub1_32.aBoolean76) {
			this.aClass4_Sub30_7.method4846(arg0);
		} else {
			this.aClass4_Sub30_7.method4874(arg0);
		}
		this.anInt5226++;
	}
}
