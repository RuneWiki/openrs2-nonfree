import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!us;")
	private final Class139_Sub2 aClass139_Sub2_1;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_4;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!ls;")
	private final Class1_Sub29 aClass1_Sub29_1;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
	private final int anInt432;

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
	private final int anInt435;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	private final int anInt428;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	private final int anInt433;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Lclient!ff;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Lclient!tg;")
	private final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "Lclient!ik;")
	private final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!ff;")
	private final Class80 aClass80_2;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Lclient!wm;")
	private Class1_Sub19 aClass1_Sub19_1;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Lclient!hi;")
	private Class1_Sub19_Sub1 aClass1_Sub19_Sub1_1;

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "Lclient!qi;")
	private Class208 aClass208_3;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!ih;Lclient!us;Lclient!ls;[I)V")
	public Class1_Sub5(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class139_Sub2 arg1, @OriginalArg(2) Class1_Sub29 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass139_Sub2_1 = arg1;
		this.aClass117_Sub1_4 = arg0;
		this.aClass1_Sub29_1 = arg2;
		@Pc(23) int local23 = this.aClass1_Sub29_1.method5840() - (arg1.anInt6760 >> 1);
		this.anInt432 = this.aClass1_Sub29_1.method5837() - local23 >> arg1.anInt6759;
		this.anInt435 = local23 + this.aClass1_Sub29_1.method5837() >> arg1.anInt6759;
		this.anInt428 = this.aClass1_Sub29_1.method5838() - local23 >> arg1.anInt6759;
		this.anInt433 = this.aClass1_Sub29_1.method5838() + local23 >> arg1.anInt6759;
		@Pc(78) int local78 = this.anInt435 + 1 - this.anInt432;
		@Pc(87) int local87 = this.anInt433 + 1 - this.anInt428;
		this.aFloatArrayArray2 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray1 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray3 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(171) int local171;
		@Pc(186) int local186;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt428 + local116;
			if (local123 > 0 && local123 < this.aClass139_Sub2_1.anInt6758 - 1) {
				for (local138 = 0; local138 <= local78; local138++) {
					local145 = this.anInt432 + local138;
					if (local145 > 0 && this.aClass139_Sub2_1.anInt6757 - 1 > local145) {
						local171 = arg1.ua(local145 + 1, local123) - arg1.ua(local145 - 1, local123);
						local186 = arg1.ua(local145, local123 + 1) - arg1.ua(local145, local123 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + local171 * local171 + 65536)));
						this.aFloatArrayArray3[local138][local116] = local201 * (float) local171;
						this.aFloatArrayArray1[local138][local116] = local201 * -256.0F;
						this.aFloatArrayArray2[local138][local116] = (float) local186 * local201;
					}
				}
			}
		}
		local123 = 0;
		local138 = 0;
		for (local145 = this.anInt428; local145 <= this.anInt433; local145++) {
			if (local145 >= 0 && local145 < arg1.anInt6758) {
				for (local171 = this.anInt432; local171 <= this.anInt435; local171++) {
					if (local171 >= 0 && arg1.anInt6757 > local171) {
						local186 = arg3[local138];
						@Pc(299) int[] local299 = arg1.anIntArrayArrayArray10[local171][local145];
						if (local299 != null && local186 != 0) {
							if (local186 == 1) {
								local123 += local299.length;
							} else {
								local123 += 3;
							}
						}
					}
					local138++;
				}
			} else {
				local138 += this.anInt435 - this.anInt432;
			}
		}
		if (local123 <= 0) {
			this.aClass80_1 = null;
			this.anInterface9_1 = null;
			this.anInterface3_1 = null;
			this.aClass80_2 = null;
		} else {
			this.aClass1_Sub19_1 = new Class1_Sub19(local123 * 2);
			this.aClass1_Sub19_Sub1_1 = new Class1_Sub19_Sub1(local123 * 16);
			this.aClass208_3 = new Class208(Static191.method2764(local123));
			local171 = 0;
			local138 = 0;
			for (local186 = this.anInt428; local186 <= this.anInt433; local186++) {
				if (local186 >= 0 && local186 < arg1.anInt6758) {
					@Pc(389) int local389 = 0;
					for (@Pc(392) int local392 = this.anInt432; local392 <= this.anInt435; local392++) {
						if (local392 >= 0 && arg1.anInt6757 > local392) {
							@Pc(411) int local411 = arg3[local138];
							@Pc(418) int[] local418 = arg1.anIntArrayArrayArray10[local392][local186];
							@Pc(425) int[] local425 = arg1.anIntArrayArrayArray9[local392][local186];
							if (local418 != null && local411 != 0) {
								if (local411 == 1) {
									for (@Pc(436) int local436 = 0; local436 < local418.length; local436++) {
										this.method418(local186, local171, local389, local418[local436], local392, local425[local436]);
									}
								} else if (local411 == 3) {
									this.method418(local186, local171, local389, 0, local392, 0);
									this.method418(local186, local171, local389, arg1.anInt6760, local392, 0);
									this.method418(local186, local171, local389, 0, local392, arg1.anInt6760);
								} else if (local411 == 2) {
									this.method418(local186, local171, local389, arg1.anInt6760, local392, 0);
									this.method418(local186, local171, local389, arg1.anInt6760, local392, arg1.anInt6760);
									this.method418(local186, local171, local389, 0, local392, 0);
								} else if (local411 == 5) {
									this.method418(local186, local171, local389, arg1.anInt6760, local392, arg1.anInt6760);
									this.method418(local186, local171, local389, 0, local392, arg1.anInt6760);
									this.method418(local186, local171, local389, arg1.anInt6760, local392, 0);
								} else if (local411 == 4) {
									this.method418(local186, local171, local389, 0, local392, arg1.anInt6760);
									this.method418(local186, local171, local389, 0, local392, 0);
									this.method418(local186, local171, local389, arg1.anInt6760, local392, arg1.anInt6760);
								}
							}
						}
						local389++;
						local138++;
					}
				} else {
					local138 += this.anInt435 - this.anInt432;
				}
				local171++;
			}
			this.anInterface3_1 = this.aClass117_Sub1_4.method2511(this.aClass1_Sub19_1.aByteArray38, false, this.aClass1_Sub19_1.anInt3698);
			this.anInterface9_1 = this.aClass117_Sub1_4.method2459(16, false, this.aClass1_Sub19_Sub1_1.anInt3698, this.aClass1_Sub19_Sub1_1.aByteArray38);
			this.aClass80_2 = new Class80(this.anInterface9_1, 5126, 3, 0);
			this.aClass80_1 = new Class80(this.anInterface9_1, 5121, 4, 12);
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray1 = this.aFloatArrayArray2 = null;
		this.aClass208_3 = null;
		this.aClass1_Sub19_1 = null;
		this.aClass1_Sub19_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIIIII)V")
	private void method418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg3 + (arg4 << this.aClass139_Sub2_1.anInt6759);
		@Pc(29) int local29 = (arg0 << this.aClass139_Sub2_1.anInt6759) + arg5;
		@Pc(35) int local35 = this.aClass139_Sub2_1.ca(local15, local29);
		if ((arg3 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local29 & 0xFFFFL) << 16;
			@Pc(67) Class1 local67 = this.aClass208_3.method4405(local7);
			if (local67 != null) {
				this.method419(((Class1_Sub31) local67).aShort61);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt431++;
		if (local7 != -1L) {
			this.aClass208_3.method4413(local7, new Class1_Sub31(local85));
		}
		@Pc(160) float local160;
		@Pc(138) float local138;
		@Pc(149) float local149;
		@Pc(181) float local181;
		@Pc(189) float local189;
		@Pc(196) float local196;
		@Pc(203) float local203;
		@Pc(210) float local210;
		@Pc(219) float local219;
		@Pc(228) float local228;
		@Pc(302) float local302;
		if (arg3 == 0 && arg5 == 0) {
			local138 = this.aFloatArrayArray1[arg2][arg1];
			local160 = this.aFloatArrayArray3[arg2][arg1];
			local149 = this.aFloatArrayArray2[arg2][arg1];
		} else if (this.aClass139_Sub2_1.anInt6760 == arg3 && arg5 == 0) {
			local149 = this.aFloatArrayArray2[arg2 + 1][arg1];
			local138 = this.aFloatArrayArray1[arg2 + 1][arg1];
			local160 = this.aFloatArrayArray3[arg2 + 1][arg1];
		} else if (arg3 == this.aClass139_Sub2_1.anInt6760 && arg5 == this.aClass139_Sub2_1.anInt6760) {
			local138 = this.aFloatArrayArray1[arg2 + 1][arg1 + 1];
			local149 = this.aFloatArrayArray2[arg2 + 1][arg1 + 1];
			local160 = this.aFloatArrayArray3[arg2 + 1][arg1 + 1];
		} else if (arg3 == 0 && this.aClass139_Sub2_1.anInt6760 == arg5) {
			local138 = this.aFloatArrayArray1[arg2][arg1 + 1];
			local149 = this.aFloatArrayArray2[arg2][arg1 + 1];
			local160 = this.aFloatArrayArray3[arg2][arg1 + 1];
		} else {
			local181 = (float) arg3 / (float) this.aClass139_Sub2_1.anInt6760;
			local189 = (float) arg5 / (float) this.aClass139_Sub2_1.anInt6760;
			local196 = this.aFloatArrayArray3[arg2][arg1];
			local203 = this.aFloatArrayArray1[arg2][arg1];
			local210 = this.aFloatArrayArray2[arg2][arg1];
			local219 = this.aFloatArrayArray3[arg2 + 1][arg1];
			local228 = this.aFloatArrayArray1[arg2 + 1][arg1];
			@Pc(243) float local243 = local196 + local181 * (this.aFloatArrayArray3[arg2][arg1 + 1] - local196);
			@Pc(260) float local260 = local219 + (this.aFloatArrayArray3[arg2 + 1][arg1 + 1] - local219) * local181;
			@Pc(278) float local278 = local228 + (this.aFloatArrayArray1[arg2 + 1][arg1 + 1] - local228) * local181;
			@Pc(293) float local293 = local210 + local181 * (this.aFloatArrayArray2[arg2][arg1 + 1] - local210);
			local302 = this.aFloatArrayArray2[arg2 + 1][arg1];
			@Pc(318) float local318 = local203 + local181 * (this.aFloatArrayArray1[arg2][arg1 + 1] - local203);
			local138 = local318 + (local278 - local318) * local189;
			@Pc(343) float local343 = local302 + (this.aFloatArrayArray2[arg2 + 1][arg1 + 1] - local302) * local181;
			local160 = local243 + (local260 - local243) * local189;
			local149 = local293 + (local343 - local293) * local189;
		}
		local181 = this.aClass1_Sub29_1.method5837() - local15;
		local189 = this.aClass1_Sub29_1.method5834() - local35;
		local196 = this.aClass1_Sub29_1.method5838() - local29;
		local203 = (float) Math.sqrt((double) (local196 * local196 + local181 * local181 + local189 * local189));
		local210 = 1.0F / local203;
		local181 *= local210;
		local196 *= local210;
		local189 *= local210;
		local219 = local203 / (float) this.aClass1_Sub29_1.method5840();
		local228 = 1.0F - local219 * local219;
		if (local228 < 0.0F) {
			local228 = 0.0F;
		}
		local302 = local149 * local196 + local138 * local189 + local181 * local160;
		if (local302 < 0.0F) {
			local302 = 0.0F;
		}
		@Pc(541) float local541 = local302 * local228 * 2.0F;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass1_Sub29_1.method5836();
		@Pc(562) int local562 = (int) ((float) (local552 >> 16 & 0xFF) * local541);
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(579) int local579 = (int) ((float) (local552 >> 8 & 0xFF) * local541);
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(592) int local592 = (int) (local541 * (float) (local552 & 0xFF));
		if (this.aClass117_Sub1_4.aBoolean291) {
			this.aClass1_Sub19_Sub1_1.method2067((float) local15);
			this.aClass1_Sub19_Sub1_1.method2067((float) local35);
			this.aClass1_Sub19_Sub1_1.method2067((float) local29);
		} else {
			this.aClass1_Sub19_Sub1_1.method2063((float) local15);
			this.aClass1_Sub19_Sub1_1.method2063((float) local35);
			this.aClass1_Sub19_Sub1_1.method2063((float) local29);
		}
		if (local592 > 255) {
			local592 = 255;
		}
		this.aClass1_Sub19_Sub1_1.method2934(local562);
		this.aClass1_Sub19_Sub1_1.method2934(local579);
		this.aClass1_Sub19_Sub1_1.method2934(local592);
		this.aClass1_Sub19_Sub1_1.method2934(255);
		this.method419(local85);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IS)V")
	private void method419(@OriginalArg(1) short arg0) {
		if (this.aClass117_Sub1_4.aBoolean291) {
			this.aClass1_Sub19_1.method2930(arg0);
		} else {
			this.aClass1_Sub19_1.method2936(arg0);
		}
		this.anInt427++;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[[ZII)V")
	public void method420(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface3_1 == null || (this.anInt432 > arg2 + arg0 || (this.anInt435 < arg0 - arg2 || (this.anInt428 > arg3 + arg2 || this.anInt433 < arg3 - arg2)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt428; local57 <= this.anInt433; local57++) {
			for (@Pc(62) int local62 = this.anInt432; local62 <= this.anInt435; local62++) {
				@Pc(69) int local69 = local62 - arg0;
				@Pc(74) int local74 = local57 - arg3;
				if (local69 > -arg2 && local69 < arg2 && -arg2 < local74 && arg2 > local74 && arg1[local69 + arg2][local74 + arg2]) {
					this.aClass117_Sub1_4.method2533((int) (this.aClass1_Sub29_1.method5841() * 255.0F) << 24);
					this.aClass117_Sub1_4.method2475(null, null, this.aClass80_1, this.aClass80_2);
					this.aClass117_Sub1_4.method2534(0, this.anInterface3_1, this.anInt427);
					return;
				}
			}
		}
	}
}
