import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	private int anInt4972;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	private int anInt4973;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "Lclient!pe;")
	private final Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_34;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!jt;")
	private final Class136_Sub1 aClass136_Sub1_2;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	private final int anInt4978;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	private final int anInt4976;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
	private final int anInt4970;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
	private final int anInt4974;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "Lclient!lh;")
	private Class1_Sub1 aClass1_Sub1_4;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!om;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "Lclient!bj;")
	private Class27 aClass27_28;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "Lclient!nk;")
	private final Interface8 anInterface8_2;

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!bm;")
	private final Interface1 anInterface1_5;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "Lclient!ds;")
	private final Class58 aClass58_7;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "Lclient!ds;")
	private final Class58 aClass58_8;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!ht;Lclient!jt;Lclient!pe;[I)V")
	public Class1_Sub33(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class136_Sub1 arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub5_2 = arg2;
		this.aClass109_Sub1_34 = arg0;
		this.aClass136_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass1_Sub5_2.method3327() - (arg1.anInt7661 >> 1);
		this.anInt4978 = this.aClass1_Sub5_2.method3333() - local22 >> arg1.anInt7660;
		this.anInt4976 = local22 + this.aClass1_Sub5_2.method3333() >> arg1.anInt7660;
		this.anInt4970 = this.aClass1_Sub5_2.method3325() - local22 >> arg1.anInt7660;
		this.anInt4974 = local22 + this.aClass1_Sub5_2.method3325() >> arg1.anInt7660;
		@Pc(76) int local76 = this.anInt4976 + 1 - this.anInt4978;
		@Pc(84) int local84 = this.anInt4974 + 1 - this.anInt4970;
		this.aFloatArrayArray9 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray8 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray7 = new float[local76 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(176) int local176;
		@Pc(190) int local190;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = this.anInt4970 + local113;
			if (local120 > 0 && local120 < this.aClass136_Sub1_2.anInt7664 - 1) {
				for (local138 = 0; local138 <= local76; local138++) {
					local146 = local138 + this.anInt4978;
					if (local146 > 0 && this.aClass136_Sub1_2.anInt7662 - 1 > local146) {
						local176 = arg1.I(local146 + 1, local120) - arg1.I(local146 - 1, local120);
						local190 = arg1.I(local146, local120 + 1) - arg1.I(local146, local120 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local176 * local176 + local190 * local190 + 65536)));
						this.aFloatArrayArray9[local138][local113] = (float) local176 * local205;
						this.aFloatArrayArray8[local138][local113] = local205 * -256.0F;
						this.aFloatArrayArray7[local138][local113] = (float) local190 * local205;
					}
				}
			}
		}
		local120 = 0;
		local138 = 0;
		for (local146 = this.anInt4970; local146 <= this.anInt4974; local146++) {
			if (local146 >= 0 && local146 < arg1.anInt7664) {
				for (local176 = this.anInt4978; local176 <= this.anInt4976; local176++) {
					if (local176 >= 0 && arg1.anInt7662 > local176) {
						local190 = arg3[local138];
						@Pc(293) int[] local293 = arg1.anIntArrayArrayArray5[local176][local146];
						if (local293 != null && local190 != 0) {
							if (local190 == 1) {
								local120 += local293.length;
							} else {
								local120 += 3;
							}
						}
					}
					local138++;
				}
			} else {
				local138 += this.anInt4976 - this.anInt4978;
			}
		}
		if (local120 > 0) {
			this.aClass1_Sub1_4 = new Class1_Sub1(local120 * 2);
			this.aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2(local120 * 16);
			this.aClass27_28 = new Class27(Static100.method1552(local120));
			local138 = 0;
			local176 = 0;
			for (local190 = this.anInt4970; local190 <= this.anInt4974; local190++) {
				if (local190 >= 0 && arg1.anInt7664 > local190) {
					@Pc(397) int local397 = 0;
					for (@Pc(400) int local400 = this.anInt4978; local400 <= this.anInt4976; local400++) {
						if (local400 >= 0 && local400 < arg1.anInt7662) {
							@Pc(419) int local419 = arg3[local138];
							@Pc(426) int[] local426 = arg1.anIntArrayArrayArray5[local400][local190];
							@Pc(433) int[] local433 = arg1.anIntArrayArrayArray3[local400][local190];
							if (local426 != null && local419 != 0) {
								if (local419 == 1) {
									for (@Pc(442) int local442 = 0; local442 < local426.length; local442++) {
										this.method4033(local176, local426[local442], local433[local442], local397, local400, local190);
									}
								} else if (local419 == 3) {
									this.method4033(local176, 0, 0, local397, local400, local190);
									this.method4033(local176, arg1.anInt7661, 0, local397, local400, local190);
									this.method4033(local176, 0, arg1.anInt7661, local397, local400, local190);
								} else if (local419 == 2) {
									this.method4033(local176, arg1.anInt7661, 0, local397, local400, local190);
									this.method4033(local176, arg1.anInt7661, arg1.anInt7661, local397, local400, local190);
									this.method4033(local176, 0, 0, local397, local400, local190);
								} else if (local419 == 5) {
									this.method4033(local176, arg1.anInt7661, arg1.anInt7661, local397, local400, local190);
									this.method4033(local176, 0, arg1.anInt7661, local397, local400, local190);
									this.method4033(local176, arg1.anInt7661, 0, local397, local400, local190);
								} else if (local419 == 4) {
									this.method4033(local176, 0, arg1.anInt7661, local397, local400, local190);
									this.method4033(local176, 0, 0, local397, local400, local190);
									this.method4033(local176, arg1.anInt7661, arg1.anInt7661, local397, local400, local190);
								}
							}
						}
						local397++;
						local138++;
					}
				} else {
					local138 += this.anInt4976 - this.anInt4978;
				}
				local176++;
			}
			this.anInterface8_2 = this.aClass109_Sub1_34.method2568(this.aClass1_Sub1_4.anInt5056, this.aClass1_Sub1_4.aByteArray66, false);
			this.anInterface1_5 = this.aClass109_Sub1_34.method2555(false, 16, this.aClass1_Sub1_Sub2_1.aByteArray66, this.aClass1_Sub1_Sub2_1.anInt5056);
			this.aClass58_7 = new Class58(this.aClass109_Sub1_34, this.anInterface1_5, 5126, 3, 0);
			this.aClass58_8 = new Class58(this.aClass109_Sub1_34, this.anInterface1_5, 5121, 4, 12);
		} else {
			this.aClass58_8 = null;
			this.anInterface8_2 = null;
			this.anInterface1_5 = null;
			this.aClass58_7 = null;
		}
		this.aClass1_Sub1_Sub2_1 = null;
		this.aClass1_Sub1_4 = null;
		this.aClass27_28 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBIIII)V")
	private void method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass136_Sub1_2.anInt7660) + arg1;
		@Pc(23) int local23 = (arg5 << this.aClass136_Sub1_2.anInt7660) + arg2;
		@Pc(29) int local29 = this.aClass136_Sub1_2.va(local15, local23);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(55) Class1 local55 = this.aClass27_28.method553(local7);
			if (local55 != null) {
				this.method4034(((Class1_Sub40) local55).aShort76);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt4973++;
		if (local7 != -1L) {
			this.aClass27_28.method564(local7, new Class1_Sub40(local73));
		}
		@Pc(130) float local130;
		@Pc(152) float local152;
		@Pc(141) float local141;
		@Pc(172) float local172;
		@Pc(180) float local180;
		@Pc(187) float local187;
		@Pc(194) float local194;
		@Pc(201) float local201;
		@Pc(210) float local210;
		@Pc(219) float local219;
		@Pc(275) float local275;
		if (arg1 == 0 && arg2 == 0) {
			local141 = this.aFloatArrayArray7[arg3][arg0];
			local152 = this.aFloatArrayArray8[arg3][arg0];
			local130 = this.aFloatArrayArray9[arg3][arg0];
		} else if (this.aClass136_Sub1_2.anInt7661 == arg1 && arg2 == 0) {
			local152 = this.aFloatArrayArray8[arg3 + 1][arg0];
			local130 = this.aFloatArrayArray9[arg3 + 1][arg0];
			local141 = this.aFloatArrayArray7[arg3 + 1][arg0];
		} else if (this.aClass136_Sub1_2.anInt7661 == arg1 && this.aClass136_Sub1_2.anInt7661 == arg2) {
			local130 = this.aFloatArrayArray9[arg3 + 1][arg0 + 1];
			local141 = this.aFloatArrayArray7[arg3 + 1][arg0 + 1];
			local152 = this.aFloatArrayArray8[arg3 + 1][arg0 + 1];
		} else if (arg1 == 0 && arg2 == this.aClass136_Sub1_2.anInt7661) {
			local141 = this.aFloatArrayArray7[arg3][arg0 + 1];
			local130 = this.aFloatArrayArray9[arg3][arg0 + 1];
			local152 = this.aFloatArrayArray8[arg3][arg0 + 1];
		} else {
			local172 = (float) arg1 / (float) this.aClass136_Sub1_2.anInt7661;
			local180 = (float) arg2 / (float) this.aClass136_Sub1_2.anInt7661;
			local187 = this.aFloatArrayArray9[arg3][arg0];
			local194 = this.aFloatArrayArray8[arg3][arg0];
			local201 = this.aFloatArrayArray7[arg3][arg0];
			local210 = this.aFloatArrayArray9[arg3 + 1][arg0];
			local219 = this.aFloatArrayArray8[arg3 + 1][arg0];
			@Pc(236) float local236 = local219 + (this.aFloatArrayArray8[arg3 + 1][arg0 + 1] - local219) * local172;
			@Pc(251) float local251 = local187 + (this.aFloatArrayArray9[arg3][arg0 + 1] - local187) * local172;
			@Pc(266) float local266 = local201 + local172 * (this.aFloatArrayArray7[arg3][arg0 + 1] - local201);
			local275 = this.aFloatArrayArray7[arg3 + 1][arg0];
			@Pc(293) float local293 = local210 + local172 * (this.aFloatArrayArray9[arg3 + 1][arg0 + 1] - local210);
			@Pc(308) float local308 = local194 + local172 * (this.aFloatArrayArray8[arg3][arg0 + 1] - local194);
			local152 = local180 * (local236 - local308) + local308;
			@Pc(334) float local334 = local275 + (this.aFloatArrayArray7[arg3 + 1][arg0 + 1] - local275) * local172;
			local130 = local251 + local180 * (local293 - local251);
			local141 = local180 * (local334 - local266) + local266;
		}
		local172 = this.aClass1_Sub5_2.method3333() - local15;
		local180 = this.aClass1_Sub5_2.method3326() - local29;
		local187 = this.aClass1_Sub5_2.method3325() - local23;
		local194 = (float) Math.sqrt((double) (local172 * local172 + local180 * local180 + local187 * local187));
		local201 = 1.0F / local194;
		local172 *= local201;
		local187 *= local201;
		local180 *= local201;
		local210 = local194 / (float) this.aClass1_Sub5_2.method3327();
		local219 = 1.0F - local210 * local210;
		if (local219 < 0.0F) {
			local219 = 0.0F;
		}
		local275 = local152 * local180 + local172 * local130 + local187 * local141;
		if (local275 < 0.0F) {
			local275 = 0.0F;
		}
		@Pc(534) float local534 = local275 * local219 * 2.0F;
		if (local534 > 1.0F) {
			local534 = 1.0F;
		}
		@Pc(547) int local547 = this.aClass1_Sub5_2.method3331();
		@Pc(557) int local557 = (int) (local534 * (float) (local547 >> 16 & 0xFF));
		if (local557 > 255) {
			local557 = 255;
		}
		@Pc(572) int local572 = (int) ((float) (local547 >> 8 & 0xFF) * local534);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(585) int local585 = (int) (local534 * (float) (local547 & 0xFF));
		if (local585 > 255) {
			local585 = 255;
		}
		if (this.aClass109_Sub1_34.aBoolean163) {
			this.aClass1_Sub1_Sub2_1.method4149((float) local15);
			this.aClass1_Sub1_Sub2_1.method4149((float) local29);
			this.aClass1_Sub1_Sub2_1.method4149((float) local23);
		} else {
			this.aClass1_Sub1_Sub2_1.method4148((float) local15);
			this.aClass1_Sub1_Sub2_1.method4148((float) local29);
			this.aClass1_Sub1_Sub2_1.method4148((float) local23);
		}
		this.aClass1_Sub1_Sub2_1.method4115(local557);
		this.aClass1_Sub1_Sub2_1.method4115(local572);
		this.aClass1_Sub1_Sub2_1.method4115(local585);
		this.aClass1_Sub1_Sub2_1.method4115(255);
		this.method4034(local73);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IS)V")
	private void method4034(@OriginalArg(1) short arg0) {
		if (this.aClass109_Sub1_34.aBoolean163) {
			this.aClass1_Sub1_4.method4101(arg0);
		} else {
			this.aClass1_Sub1_4.method4146(arg0);
		}
		this.anInt4972++;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI[[ZI)V")
	public void method4035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface8_2 == null || (arg1 + arg3 < this.anInt4978 || (arg3 - arg1 > this.anInt4976 || (arg0 + arg1 < this.anInt4970 || arg0 - arg1 > this.anInt4974)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt4970; local50 <= this.anInt4974; local50++) {
			for (@Pc(55) int local55 = this.anInt4978; local55 <= this.anInt4976; local55++) {
				@Pc(62) int local62 = local55 - arg3;
				@Pc(66) int local66 = local50 - arg0;
				if (local62 > -arg1 && arg1 > local62 && local66 > -arg1 && local66 < arg1 && arg2[local62 + arg1][local66 + arg1]) {
					this.aClass109_Sub1_34.method2574((int) (this.aClass1_Sub5_2.method3328() * 255.0F) << 24);
					this.aClass109_Sub1_34.method2605(null, this.aClass58_7, this.aClass58_8, null);
					this.aClass109_Sub1_34.method2586(0, this.anInt4972, this.anInterface8_2);
					return;
				}
			}
		}
	}
}
