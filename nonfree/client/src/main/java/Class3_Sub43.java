import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
	private int anInt7885;

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "Lclient!oj;")
	private final Class3_Sub30 aClass3_Sub30_3;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_34;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Lclient!pf;")
	private final Class52_Sub3 aClass52_Sub3_3;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
	private final int anInt7889;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
	private final int anInt7888;

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
	private final int anInt7891;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	private final int anInt7882;

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray22;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray20;

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray21;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	private int anInt7884;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "Lclient!bo;")
	private final Interface1 anInterface1_7;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!gr;")
	private final Class112 aClass112_15;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!il;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "Lclient!gr;")
	private final Class112 aClass112_16;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Lclient!rt;")
	private final Class3_Sub27 aClass3_Sub27_8;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "Lclient!vw;")
	private final Class3_Sub27_Sub2 aClass3_Sub27_Sub2_3;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Lclient!sd;")
	private Class267 aClass267_38;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!ad;Lclient!pf;Lclient!oj;[I)V")
	public Class3_Sub43(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class52_Sub3 arg1, @OriginalArg(2) Class3_Sub30 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub30_3 = arg2;
		this.aClass5_Sub1_34 = arg0;
		this.aClass52_Sub3_3 = arg1;
		@Pc(22) int local22 = this.aClass3_Sub30_3.method5387() - (arg1.anInt9493 >> 1);
		this.anInt7889 = this.aClass3_Sub30_3.method5386() - local22 >> arg1.anInt9494;
		this.anInt7888 = this.aClass3_Sub30_3.method5386() + local22 >> arg1.anInt9494;
		this.anInt7891 = this.aClass3_Sub30_3.method5388() - local22 >> arg1.anInt9494;
		this.anInt7882 = this.aClass3_Sub30_3.method5388() + local22 >> arg1.anInt9494;
		@Pc(76) int local76 = this.anInt7888 + 1 - this.anInt7889;
		@Pc(85) int local85 = this.anInt7882 + 1 - this.anInt7891;
		this.aFloatArrayArray22 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray20 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray21 = new float[local76 + 1][local85 + 1];
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(170) int local170;
		@Pc(184) int local184;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			@Pc(122) int local122 = local114 + this.anInt7891;
			if (local122 > 0 && this.aClass52_Sub3_3.anInt9492 - 1 > local122) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = this.anInt7889 + local136;
					if (local143 > 0 && local143 < this.aClass52_Sub3_3.anInt9491 - 1) {
						local170 = arg1.JA(local143 + 1, local122) - arg1.JA(local143 - 1, local122);
						local184 = arg1.JA(local143, local122 + 1) - arg1.JA(local143, local122 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local184 * local184 + 65536)));
						this.aFloatArrayArray21[local136][local114] = local199 * (float) local170;
						this.aFloatArrayArray20[local136][local114] = -256.0F * local199;
						this.aFloatArrayArray22[local136][local114] = local199 * (float) local184;
					}
				}
			}
		}
		local136 = 0;
		for (local143 = this.anInt7891; local143 <= this.anInt7882; local143++) {
			if (local143 >= 0 && local143 < arg1.anInt9492) {
				for (local170 = this.anInt7889; local170 <= this.anInt7888; local170++) {
					if (local170 >= 0 && arg1.anInt9491 > local170) {
						local184 = arg3[local136];
						@Pc(299) int[] local299 = arg1.anIntArrayArrayArray19[local170][local143];
						if (local299 != null && local184 != 0) {
							if (local184 == 1) {
								@Pc(316) int local316 = 0;
								while (local316 < local299.length) {
									if (local299[local316++] != -1 && local299[local316++] != -1 && local299[local316++] != -1) {
										this.anInt7884 += 3;
									}
								}
							} else {
								this.anInt7884 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt7888 - this.anInt7889;
			}
		}
		this.anInterface1_7 = null;
		this.aClass112_15 = null;
		this.anInterface10_5 = null;
		this.aClass112_16 = null;
		this.aClass3_Sub27_Sub2_3 = null;
		this.aClass3_Sub27_8 = null;
		this.aClass267_38 = null;
		this.aFloatArrayArray21 = this.aFloatArrayArray20 = this.aFloatArrayArray22 = null;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIIIII)V")
	private void method6538(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg0 + (arg5 << this.aClass52_Sub3_3.anInt9494);
		@Pc(23) int local23 = arg6 + (arg4 << this.aClass52_Sub3_3.anInt9494);
		@Pc(29) int local29 = this.aClass52_Sub3_3.sa(local15, local23);
		if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(58) Class3 local58 = this.aClass267_38.method6644(local7);
			if (local58 != null) {
				this.method6541(((Class3_Sub18) local58).aShort44, -1);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt7885++;
		if (local7 != -1L) {
			this.aClass267_38.method6640(new Class3_Sub18(local76), local7);
		}
		if (arg1 < 74) {
			this.aClass267_38 = null;
		}
		@Pc(130) float local130;
		@Pc(139) float local139;
		@Pc(121) float local121;
		@Pc(203) float local203;
		@Pc(211) float local211;
		@Pc(218) float local218;
		@Pc(225) float local225;
		@Pc(232) float local232;
		@Pc(241) float local241;
		@Pc(250) float local250;
		@Pc(274) float local274;
		if (arg0 == 0 && arg6 == 0) {
			local139 = this.aFloatArrayArray20[arg2][arg3];
			local130 = this.aFloatArrayArray21[arg2][arg3];
			local121 = this.aFloatArrayArray22[arg2][arg3];
		} else if (this.aClass52_Sub3_3.anInt9493 == arg0 && arg6 == 0) {
			local121 = this.aFloatArrayArray22[arg2 + 1][arg3];
			local130 = this.aFloatArrayArray21[arg2 + 1][arg3];
			local139 = this.aFloatArrayArray20[arg2 + 1][arg3];
		} else if (arg0 == this.aClass52_Sub3_3.anInt9493 && arg6 == this.aClass52_Sub3_3.anInt9493) {
			local130 = this.aFloatArrayArray21[arg2 + 1][arg3 + 1];
			local121 = this.aFloatArrayArray22[arg2 + 1][arg3 + 1];
			local139 = this.aFloatArrayArray20[arg2 + 1][arg3 + 1];
		} else if (arg0 == 0 && this.aClass52_Sub3_3.anInt9493 == arg6) {
			local139 = this.aFloatArrayArray20[arg2][arg3 + 1];
			local121 = this.aFloatArrayArray22[arg2][arg3 + 1];
			local130 = this.aFloatArrayArray21[arg2][arg3 + 1];
		} else {
			local203 = (float) arg0 / (float) this.aClass52_Sub3_3.anInt9493;
			local211 = (float) arg6 / (float) this.aClass52_Sub3_3.anInt9493;
			local218 = this.aFloatArrayArray21[arg2][arg3];
			local225 = this.aFloatArrayArray20[arg2][arg3];
			local232 = this.aFloatArrayArray22[arg2][arg3];
			local241 = this.aFloatArrayArray21[arg2 + 1][arg3];
			local250 = this.aFloatArrayArray20[arg2 + 1][arg3];
			@Pc(265) float local265 = local218 + (this.aFloatArrayArray21[arg2][arg3 + 1] - local218) * local203;
			local274 = this.aFloatArrayArray22[arg2 + 1][arg3];
			@Pc(291) float local291 = local250 + (this.aFloatArrayArray20[arg2 + 1][arg3 + 1] - local250) * local203;
			@Pc(306) float local306 = local232 + (this.aFloatArrayArray22[arg2][arg3 + 1] - local232) * local203;
			@Pc(322) float local322 = local225 + (this.aFloatArrayArray20[arg2][arg3 + 1] - local225) * local203;
			@Pc(340) float local340 = local241 + local203 * (this.aFloatArrayArray21[arg2 + 1][arg3 + 1] - local241);
			local130 = local265 + local211 * (local340 - local265);
			local139 = (local291 - local322) * local211 + local322;
			@Pc(373) float local373 = local274 + local203 * (this.aFloatArrayArray22[arg2 + 1][arg3 + 1] - local274);
			local121 = local306 + (local373 - local306) * local211;
		}
		local203 = this.aClass3_Sub30_3.method5386() - local15;
		local211 = this.aClass3_Sub30_3.method5390() - local29;
		local218 = this.aClass3_Sub30_3.method5388() - local23;
		local225 = (float) Math.sqrt((double) (local218 * local218 + local203 * local203 + local211 * local211));
		local232 = 1.0F / local225;
		local218 *= local232;
		local203 *= local232;
		local211 *= local232;
		local241 = local225 / (float) this.aClass3_Sub30_3.method5387();
		local250 = 1.0F - local241 * local241;
		if (local250 < 0.0F) {
			local250 = 0.0F;
		}
		local274 = local218 * local121 + local139 * local211 + local203 * local130;
		if (local274 < 0.0F) {
			local274 = 0.0F;
		}
		@Pc(541) float local541 = local250 * local274 * 2.0F;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass3_Sub30_3.method5391();
		@Pc(562) int local562 = (int) (local541 * (float) (local552 >> 16 & 0xFF));
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(577) int local577 = (int) ((float) (local552 >> 8 & 0xFF) * local541);
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(592) int local592 = (int) ((float) (local552 & 0xFF) * local541);
		if (local592 > 255) {
			local592 = 255;
		}
		if (this.aClass5_Sub1_34.aBoolean39) {
			this.aClass3_Sub27_Sub2_3.method7616((float) local15);
			this.aClass3_Sub27_Sub2_3.method7616((float) local29);
			this.aClass3_Sub27_Sub2_3.method7616((float) local23);
		} else {
			this.aClass3_Sub27_Sub2_3.method7615((float) local15);
			this.aClass3_Sub27_Sub2_3.method7615((float) local29);
			this.aClass3_Sub27_Sub2_3.method7615((float) local23);
		}
		this.aClass3_Sub27_Sub2_3.method7576(local562);
		this.aClass3_Sub27_Sub2_3.method7576(local577);
		this.aClass3_Sub27_Sub2_3.method7576(local592);
		this.aClass3_Sub27_Sub2_3.method7576(255);
		this.method6541(local76, -1);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[[ZII)V")
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface10_5 == null || (arg0 + arg3 < this.anInt7889 || (arg3 - arg0 > this.anInt7888 || (this.anInt7891 > arg1 + arg0 || arg1 - arg0 > this.anInt7882)))) {
			return;
		}
		for (@Pc(58) int local58 = this.anInt7891; local58 <= this.anInt7882; local58++) {
			for (@Pc(63) int local63 = this.anInt7889; local63 <= this.anInt7888; local63++) {
				@Pc(70) int local70 = local63 - arg3;
				@Pc(74) int local74 = local58 - arg1;
				if (local70 > -arg0 && arg0 > local70 && -arg0 < local74 && arg0 > local74 && arg2[arg0 + local70][local74 + arg0]) {
					this.aClass5_Sub1_34.method428((int) (this.aClass3_Sub30_3.method5382() * 255.0F) << 24);
					this.aClass5_Sub1_34.method383(this.aClass112_15, null, this.aClass112_16, null);
					this.aClass5_Sub1_34.method391(0, this.anInt7884, this.anInterface10_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(SI)V")
	private void method6541(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1) {
		if (this.aClass5_Sub1_34.aBoolean39) {
			this.aClass3_Sub27_8.method7600(arg0, arg1 + 30365);
		} else {
			this.aClass3_Sub27_8.method7556(arg0);
		}
		this.anInt7884++;
		if (arg1 != -1) {
			this.method6538(58, (byte) -96, 42, -101, -74, 28, 71);
		}
	}
}
