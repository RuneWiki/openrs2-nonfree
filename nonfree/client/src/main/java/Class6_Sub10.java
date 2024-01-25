import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
	private int anInt1771;

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
	private int anInt1775;

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "Lclient!ki;")
	private final Class6_Sub6 aClass6_Sub6_2;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_10;

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "Lclient!tn;")
	private final Class84_Sub2 aClass84_Sub2_1;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	private final int anInt1764;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	private final int anInt1767;

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
	private final int anInt1772;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	private final int anInt1770;

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "Lclient!ph;")
	private final Interface8 anInterface8_2;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "Lclient!eo;")
	private final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "Lclient!ot;")
	private final Class195 aClass195_3;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "Lclient!ot;")
	private final Class195 aClass195_4;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "Lclient!ha;")
	private Class6_Sub15 aClass6_Sub15_3;

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "Lclient!ka;")
	private Class6_Sub15_Sub2 aClass6_Sub15_Sub2_2;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "Lclient!ke;")
	private Class137 aClass137_10;

	static {
		new Class231(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!bl;Lclient!tn;Lclient!ki;[I)V")
	public Class6_Sub10(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class84_Sub2 arg1, @OriginalArg(2) Class6_Sub6 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub6_2 = arg2;
		this.aClass28_Sub1_10 = arg0;
		this.aClass84_Sub2_1 = arg1;
		@Pc(23) int local23 = this.aClass6_Sub6_2.method1162() - (arg1.anInt6362 >> 1);
		this.anInt1764 = this.aClass6_Sub6_2.method1163() - local23 >> arg1.anInt6366;
		this.anInt1767 = local23 + this.aClass6_Sub6_2.method1163() >> arg1.anInt6366;
		this.anInt1772 = this.aClass6_Sub6_2.method1169() - local23 >> arg1.anInt6366;
		this.anInt1770 = local23 + this.aClass6_Sub6_2.method1169() >> arg1.anInt6366;
		@Pc(78) int local78 = this.anInt1767 + 1 - this.anInt1764;
		@Pc(87) int local87 = this.anInt1770 + 1 - this.anInt1772;
		this.aFloatArrayArray3 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray4 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray2 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(141) int local141;
		@Pc(169) int local169;
		@Pc(183) int local183;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt1772 + local116;
			if (local123 > 0 && this.aClass84_Sub2_1.anInt6360 - 1 > local123) {
				for (local134 = 0; local134 <= local78; local134++) {
					local141 = this.anInt1764 + local134;
					if (local141 > 0 && local141 < this.aClass84_Sub2_1.anInt6363 - 1) {
						local169 = arg1.method5322(local141 + 1, local123) - arg1.method5322(local141 - 1, local123);
						local183 = arg1.method5322(local141, local123 + 1) - arg1.method5322(local141, local123 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local169 * local169 + local183 * local183 + 65536)));
						this.aFloatArrayArray2[local134][local116] = local199 * (float) local169;
						this.aFloatArrayArray3[local134][local116] = -256.0F * local199;
						this.aFloatArrayArray4[local134][local116] = (float) local183 * local199;
					}
				}
			}
		}
		local123 = 0;
		local134 = 0;
		for (local141 = this.anInt1772; local141 <= this.anInt1770; local141++) {
			if (local141 >= 0 && local141 < arg1.anInt6360) {
				for (local169 = this.anInt1764; local169 <= this.anInt1767; local169++) {
					if (local169 >= 0 && arg1.anInt6363 > local169) {
						local183 = arg3[local134];
						@Pc(287) int[] local287 = arg1.anIntArrayArrayArray7[local169][local141];
						if (local287 != null && local183 != 0) {
							if (local183 == 1) {
								local123 += local287.length;
							} else {
								local123 += 3;
							}
						}
					}
					local134++;
				}
			} else {
				local134 += this.anInt1767 - this.anInt1764;
			}
		}
		if (local123 <= 0) {
			this.anInterface8_2 = null;
			this.anInterface5_3 = null;
			this.aClass195_3 = null;
			this.aClass195_4 = null;
		} else {
			this.aClass6_Sub15_3 = new Class6_Sub15(local123 * 2);
			this.aClass6_Sub15_Sub2_2 = new Class6_Sub15_Sub2(local123 * 16);
			this.aClass137_10 = new Class137(Static420.method5696(local123));
			local134 = 0;
			local169 = 0;
			for (local183 = this.anInt1772; local183 <= this.anInt1770; local183++) {
				if (local183 >= 0 && local183 < arg1.anInt6360) {
					@Pc(382) int local382 = 0;
					for (@Pc(385) int local385 = this.anInt1764; local385 <= this.anInt1767; local385++) {
						if (local385 >= 0 && local385 < arg1.anInt6363) {
							@Pc(397) int local397 = arg3[local134];
							@Pc(404) int[] local404 = arg1.anIntArrayArrayArray7[local385][local183];
							@Pc(411) int[] local411 = arg1.anIntArrayArrayArray8[local385][local183];
							if (local404 != null && local397 != 0) {
								if (local397 == 1) {
									for (@Pc(567) int local567 = 0; local567 < local404.length; local567++) {
										this.method1650(local169, local183, local382, local404[local567], local411[local567], local385);
									}
								} else if (local397 == 3) {
									this.method1650(local169, local183, local382, 0, 0, local385);
									this.method1650(local169, local183, local382, arg1.anInt6362, 0, local385);
									this.method1650(local169, local183, local382, 0, arg1.anInt6362, local385);
								} else if (local397 == 2) {
									this.method1650(local169, local183, local382, arg1.anInt6362, 0, local385);
									this.method1650(local169, local183, local382, arg1.anInt6362, arg1.anInt6362, local385);
									this.method1650(local169, local183, local382, 0, 0, local385);
								} else if (local397 == 5) {
									this.method1650(local169, local183, local382, arg1.anInt6362, arg1.anInt6362, local385);
									this.method1650(local169, local183, local382, 0, arg1.anInt6362, local385);
									this.method1650(local169, local183, local382, arg1.anInt6362, 0, local385);
								} else if (local397 == 4) {
									this.method1650(local169, local183, local382, 0, arg1.anInt6362, local385);
									this.method1650(local169, local183, local382, 0, 0, local385);
									this.method1650(local169, local183, local382, arg1.anInt6362, arg1.anInt6362, local385);
								}
							}
						}
						local382++;
						local134++;
					}
				} else {
					local134 += this.anInt1767 - this.anInt1764;
				}
				local169++;
			}
			this.anInterface8_2 = this.aClass28_Sub1_10.method669(false, this.aClass6_Sub15_3.anInt3487, this.aClass6_Sub15_3.aByteArray51);
			this.anInterface5_3 = this.aClass28_Sub1_10.method682(this.aClass6_Sub15_Sub2_2.aByteArray51, this.aClass6_Sub15_Sub2_2.anInt3487, 16, false);
			this.aClass195_3 = new Class195(this.aClass28_Sub1_10, this.anInterface5_3, 5126, 3, 0);
			this.aClass195_4 = new Class195(this.aClass28_Sub1_10, this.anInterface5_3, 5121, 4, 12);
		}
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray4 = null;
		this.aClass6_Sub15_3 = null;
		this.aClass137_10 = null;
		this.aClass6_Sub15_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IS)V")
	private void method1648(@OriginalArg(1) short arg0) {
		if (this.aClass28_Sub1_10.aBoolean52) {
			this.aClass6_Sub15_3.method3100(arg0);
		} else {
			this.aClass6_Sub15_3.method3114(arg0);
		}
		this.anInt1775++;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B[[ZIII)V")
	public void method1649(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface8_2 == null || (arg1 + arg3 < this.anInt1764 || (arg3 - arg1 > this.anInt1767 || (this.anInt1772 > arg1 + arg2 || arg2 - arg1 > this.anInt1770)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt1772; local50 <= this.anInt1770; local50++) {
			for (@Pc(55) int local55 = this.anInt1764; local55 <= this.anInt1767; local55++) {
				@Pc(62) int local62 = local55 - arg3;
				@Pc(67) int local67 = local50 - arg2;
				if (local62 > -arg1 && arg1 > local62 && -arg1 < local67 && local67 < arg1 && arg0[arg1 + local62][arg1 + local67]) {
					this.aClass28_Sub1_10.method673((int) (this.aClass6_Sub6_2.method1166() * 255.0F) << 24);
					this.aClass28_Sub1_10.method714(null, null, this.aClass195_4, this.aClass195_3);
					this.aClass28_Sub1_10.method661(0, this.anInt1775, this.anInterface8_2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIII)V")
	private void method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass84_Sub2_1.anInt6366) + arg3;
		@Pc(23) int local23 = arg4 + (arg1 << this.aClass84_Sub2_1.anInt6366);
		@Pc(29) int local29 = this.aClass84_Sub2_1.method5334(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(60) Class6 local60 = this.aClass137_10.method3175(local7);
			if (local60 != null) {
				this.method1648(((Class6_Sub36) local60).aShort94);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt1771++;
		if (local7 != -1L) {
			this.aClass137_10.method3179(local7, new Class6_Sub36(local78));
		}
		@Pc(287) float local287;
		@Pc(295) float local295;
		@Pc(322) float local322;
		@Pc(142) float local142;
		@Pc(150) float local150;
		@Pc(157) float local157;
		@Pc(164) float local164;
		@Pc(171) float local171;
		@Pc(180) float local180;
		@Pc(189) float local189;
		@Pc(198) float local198;
		if (arg3 == 0 && arg4 == 0) {
			local322 = this.aFloatArrayArray4[arg2][arg0];
			local295 = this.aFloatArrayArray3[arg2][arg0];
			local287 = this.aFloatArrayArray2[arg2][arg0];
		} else if (this.aClass84_Sub2_1.anInt6362 == arg3 && arg4 == 0) {
			local295 = this.aFloatArrayArray3[arg2 + 1][arg0];
			local322 = this.aFloatArrayArray4[arg2 + 1][arg0];
			local287 = this.aFloatArrayArray2[arg2 + 1][arg0];
		} else if (this.aClass84_Sub2_1.anInt6362 == arg3 && this.aClass84_Sub2_1.anInt6362 == arg4) {
			local287 = this.aFloatArrayArray2[arg2 + 1][arg0 + 1];
			local295 = this.aFloatArrayArray3[arg2 + 1][arg0 + 1];
			local322 = this.aFloatArrayArray4[arg2 + 1][arg0 + 1];
		} else if (arg3 == 0 && arg4 == this.aClass84_Sub2_1.anInt6362) {
			local322 = this.aFloatArrayArray4[arg2][arg0 + 1];
			local295 = this.aFloatArrayArray3[arg2][arg0 + 1];
			local287 = this.aFloatArrayArray2[arg2][arg0 + 1];
		} else {
			local142 = (float) arg3 / (float) this.aClass84_Sub2_1.anInt6362;
			local150 = (float) arg4 / (float) this.aClass84_Sub2_1.anInt6362;
			local157 = this.aFloatArrayArray2[arg2][arg0];
			local164 = this.aFloatArrayArray3[arg2][arg0];
			local171 = this.aFloatArrayArray4[arg2][arg0];
			local180 = this.aFloatArrayArray2[arg2 + 1][arg0];
			local189 = this.aFloatArrayArray3[arg2 + 1][arg0];
			local198 = this.aFloatArrayArray4[arg2 + 1][arg0];
			@Pc(213) float local213 = local157 + local142 * (this.aFloatArrayArray2[arg2][arg0 + 1] - local157);
			@Pc(229) float local229 = local164 + (this.aFloatArrayArray3[arg2][arg0 + 1] - local164) * local142;
			@Pc(246) float local246 = local180 + (this.aFloatArrayArray2[arg2 + 1][arg0 + 1] - local180) * local142;
			@Pc(263) float local263 = local189 + (this.aFloatArrayArray3[arg2 + 1][arg0 + 1] - local189) * local142;
			@Pc(278) float local278 = local171 + local142 * (this.aFloatArrayArray4[arg2][arg0 + 1] - local171);
			local287 = (local246 - local213) * local150 + local213;
			local295 = local229 + (local263 - local229) * local150;
			@Pc(313) float local313 = local198 + (this.aFloatArrayArray4[arg2 + 1][arg0 + 1] - local198) * local142;
			local322 = (local313 - local278) * local150 + local278;
		}
		local142 = this.aClass6_Sub6_2.method1163() - local15;
		local150 = this.aClass6_Sub6_2.method1170() - local29;
		local157 = this.aClass6_Sub6_2.method1169() - local23;
		local164 = (float) Math.sqrt((double) (local157 * local157 + local142 * local142 + local150 * local150));
		local171 = 1.0F / local164;
		local157 *= local171;
		local142 *= local171;
		local150 *= local171;
		local180 = local164 / (float) this.aClass6_Sub6_2.method1162();
		local189 = 1.0F - local180 * local180;
		if (local189 < 0.0F) {
			local189 = 0.0F;
		}
		local198 = local322 * local157 + local295 * local150 + local142 * local287;
		if (local198 < 0.0F) {
			local198 = 0.0F;
		}
		@Pc(538) float local538 = local198 * 2.0F * local189;
		if ((float) 1 < local538) {
			local538 = 1.0F;
		}
		@Pc(550) int local550 = this.aClass6_Sub6_2.method1172();
		@Pc(560) int local560 = (int) (local538 * (float) (local550 >> 16 & 0xFF));
		if (local560 > 255) {
			local560 = 255;
		}
		@Pc(575) int local575 = (int) ((float) (local550 >> 8 & 0xFF) * local538);
		if (local575 > 255) {
			local575 = 255;
		}
		@Pc(588) int local588 = (int) ((float) (local550 & 0xFF) * local538);
		if (local588 > 255) {
			local588 = 255;
		}
		if (this.aClass28_Sub1_10.aBoolean52) {
			this.aClass6_Sub15_Sub2_2.method3139((float) local15);
			this.aClass6_Sub15_Sub2_2.method3139((float) local29);
			this.aClass6_Sub15_Sub2_2.method3139((float) local23);
		} else {
			this.aClass6_Sub15_Sub2_2.method3142((float) local15);
			this.aClass6_Sub15_Sub2_2.method3142((float) local29);
			this.aClass6_Sub15_Sub2_2.method3142((float) local23);
		}
		this.aClass6_Sub15_Sub2_2.method3075(local560);
		this.aClass6_Sub15_Sub2_2.method3075(local575);
		this.aClass6_Sub15_Sub2_2.method3075(local588);
		this.aClass6_Sub15_Sub2_2.method3075(255);
		this.method1648(local78);
	}
}
