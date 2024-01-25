import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
	private int anInt4851;

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
	private int anInt4856;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Lclient!qp;")
	private final Class1_Sub31 aClass1_Sub31_1;

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_28;

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "Lclient!lk;")
	private final Class149_Sub1 aClass149_Sub1_2;

	@OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
	private final int anInt4854;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	private final int anInt4845;

	@OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
	private final int anInt4855;

	@OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
	private final int anInt4852;

	@OriginalMember(owner = "client!ns", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ns", name = "G", descriptor = "Lclient!hp;")
	private Class1_Sub5 aClass1_Sub5_4;

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "Lclient!uc;")
	private Class1_Sub5_Sub2 aClass1_Sub5_Sub2_2;

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Lclient!gu;")
	private Class96 aClass96_32;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!pl;")
	private final Interface9 anInterface9_4;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!wu;")
	private final Interface12 anInterface12_6;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "Lclient!gi;")
	private final Class89 aClass89_11;

	@OriginalMember(owner = "client!ns", name = "K", descriptor = "Lclient!gi;")
	private final Class89 aClass89_12;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!kd;Lclient!lk;Lclient!qp;[I)V")
	public Class1_Sub33(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class149_Sub1 arg1, @OriginalArg(2) Class1_Sub31 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub31_1 = arg2;
		this.aClass39_Sub2_28 = arg0;
		this.aClass149_Sub1_2 = arg1;
		@Pc(23) int local23 = this.aClass1_Sub31_1.method5910() - (arg1.anInt4318 >> 1);
		this.anInt4854 = this.aClass1_Sub31_1.method5906() - local23 >> arg1.anInt4316;
		this.anInt4845 = this.aClass1_Sub31_1.method5906() + local23 >> arg1.anInt4316;
		this.anInt4855 = this.aClass1_Sub31_1.method5904() - local23 >> arg1.anInt4316;
		this.anInt4852 = local23 + this.aClass1_Sub31_1.method5904() >> arg1.anInt4316;
		@Pc(77) int local77 = this.anInt4845 + 1 - this.anInt4854;
		@Pc(86) int local86 = this.anInt4852 + 1 - this.anInt4855;
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray6 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(168) int local168;
		@Pc(182) int local182;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt4855;
			if (local123 > 0 && this.aClass149_Sub1_2.anInt4319 - 1 > local123) {
				for (local137 = 0; local137 <= local77; local137++) {
					local145 = local137 + this.anInt4854;
					if (local145 > 0 && this.aClass149_Sub1_2.anInt4317 - 1 > local145) {
						local168 = arg1.l(local145 + 1, local123) - arg1.l(local145 - 1, local123);
						local182 = arg1.l(local145, local123 + 1) - arg1.l(local145, local123 - 1);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local182 * local182 + local168 * local168 + 65536)));
						this.aFloatArrayArray7[local137][local115] = (float) local168 * local197;
						this.aFloatArrayArray8[local137][local115] = local197 * -256.0F;
						this.aFloatArrayArray6[local137][local115] = (float) local182 * local197;
					}
				}
			}
		}
		local123 = 0;
		local137 = 0;
		for (local145 = this.anInt4855; local145 <= this.anInt4852; local145++) {
			if (local145 >= 0 && local145 < arg1.anInt4319) {
				for (local168 = this.anInt4854; local168 <= this.anInt4845; local168++) {
					if (local168 >= 0 && local168 < arg1.anInt4317) {
						local182 = arg3[local137];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray9[local168][local145];
						if (local286 != null && local182 != 0) {
							if (local182 == 1) {
								local123 += local286.length;
							} else {
								local123 += 3;
							}
						}
					}
					local137++;
				}
			} else {
				local137 += this.anInt4845 - this.anInt4854;
			}
		}
		if (local123 > 0) {
			this.aClass1_Sub5_4 = new Class1_Sub5(local123 * 2);
			this.aClass1_Sub5_Sub2_2 = new Class1_Sub5_Sub2(local123 * 16);
			this.aClass96_32 = new Class96(Static406.method5434(local123));
			local168 = 0;
			local137 = 0;
			for (local182 = this.anInt4855; local182 <= this.anInt4852; local182++) {
				if (local182 >= 0 && local182 < arg1.anInt4319) {
					@Pc(364) int local364 = 0;
					for (@Pc(367) int local367 = this.anInt4854; local367 <= this.anInt4845; local367++) {
						if (local367 >= 0 && local367 < arg1.anInt4317) {
							@Pc(383) int local383 = arg3[local137];
							@Pc(390) int[] local390 = arg1.anIntArrayArrayArray9[local367][local182];
							@Pc(397) int[] local397 = arg1.anIntArrayArrayArray7[local367][local182];
							if (local390 != null && local383 != 0) {
								if (local383 == 1) {
									for (@Pc(411) int local411 = 0; local411 < local390.length; local411++) {
										this.method4028(local397[local411], local168, local364, local390[local411], local182, local367);
									}
								} else if (local383 == 3) {
									this.method4028(0, local168, local364, 0, local182, local367);
									this.method4028(0, local168, local364, arg1.anInt4318, local182, local367);
									this.method4028(arg1.anInt4318, local168, local364, 0, local182, local367);
								} else if (local383 == 2) {
									this.method4028(0, local168, local364, arg1.anInt4318, local182, local367);
									this.method4028(arg1.anInt4318, local168, local364, arg1.anInt4318, local182, local367);
									this.method4028(0, local168, local364, 0, local182, local367);
								} else if (local383 == 5) {
									this.method4028(arg1.anInt4318, local168, local364, arg1.anInt4318, local182, local367);
									this.method4028(arg1.anInt4318, local168, local364, 0, local182, local367);
									this.method4028(0, local168, local364, arg1.anInt4318, local182, local367);
								} else if (local383 == 4) {
									this.method4028(arg1.anInt4318, local168, local364, 0, local182, local367);
									this.method4028(0, local168, local364, 0, local182, local367);
									this.method4028(arg1.anInt4318, local168, local364, arg1.anInt4318, local182, local367);
								}
							}
						}
						local364++;
						local137++;
					}
				} else {
					local137 += this.anInt4845 - this.anInt4854;
				}
				local168++;
			}
			this.anInterface9_4 = this.aClass39_Sub2_28.method3235(this.aClass1_Sub5_4.aByteArray89, false, this.aClass1_Sub5_4.anInt6475);
			this.anInterface12_6 = this.aClass39_Sub2_28.method3234(16, false, this.aClass1_Sub5_Sub2_2.aByteArray89, this.aClass1_Sub5_Sub2_2.anInt6475);
			this.aClass89_11 = new Class89(this.anInterface12_6, 5126, 3, 0);
			this.aClass89_12 = new Class89(this.anInterface12_6, 5121, 4, 12);
		} else {
			this.anInterface9_4 = null;
			this.anInterface12_6 = null;
			this.aClass89_11 = null;
			this.aClass89_12 = null;
		}
		this.aFloatArrayArray7 = this.aFloatArrayArray8 = this.aFloatArrayArray6 = null;
		this.aClass96_32 = null;
		this.aClass1_Sub5_4 = null;
		this.aClass1_Sub5_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([[ZIZII)V")
	public void method4026(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface9_4 == null || (this.anInt4854 > arg3 + arg1 || (arg3 - arg1 > this.anInt4845 || (arg2 + arg1 < this.anInt4855 || this.anInt4852 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(52) int local52 = this.anInt4855; local52 <= this.anInt4852; local52++) {
			for (@Pc(57) int local57 = this.anInt4854; local57 <= this.anInt4845; local57++) {
				@Pc(64) int local64 = local57 - arg3;
				@Pc(69) int local69 = local52 - arg2;
				if (local64 > -arg1 && arg1 > local64 && -arg1 < local69 && arg1 > local69 && arg0[local64 + arg1][arg1 + local69]) {
					this.aClass39_Sub2_28.method3206((int) (this.aClass1_Sub31_1.method5905() * 255.0F) << 24);
					this.aClass39_Sub2_28.method3181(null, null, this.aClass89_11, this.aClass89_12);
					this.aClass39_Sub2_28.method3184(this.anInterface9_4, this.anInt4856, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIII)V")
	private void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) long local12 = -1L;
		@Pc(20) int local20 = arg3 + (arg5 << this.aClass149_Sub1_2.anInt4316);
		@Pc(28) int local28 = arg0 + (arg4 << this.aClass149_Sub1_2.anInt4316);
		@Pc(34) int local34 = this.aClass149_Sub1_2.a(local20, local28);
		if ((arg3 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local12 = (long) local20 & 0xFFFFL | ((long) local28 & 0xFFFFL) << 16;
			@Pc(63) Class1 local63 = this.aClass96_32.method2335(local12);
			if (local63 != null) {
				this.method4029(((Class1_Sub45) local63).aShort97);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt4851++;
		if (local12 != -1L) {
			this.aClass96_32.method2341(local12, new Class1_Sub45(local81));
		}
		@Pc(154) float local154;
		@Pc(165) float local165;
		@Pc(143) float local143;
		@Pc(218) float local218;
		@Pc(226) float local226;
		@Pc(233) float local233;
		@Pc(240) float local240;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(265) float local265;
		@Pc(355) float local355;
		if (arg3 == 0 && arg0 == 0) {
			local154 = this.aFloatArrayArray7[arg2][arg1];
			local165 = this.aFloatArrayArray8[arg2][arg1];
			local143 = this.aFloatArrayArray6[arg2][arg1];
		} else if (this.aClass149_Sub1_2.anInt4318 == arg3 && arg0 == 0) {
			local143 = this.aFloatArrayArray6[arg2 + 1][arg1];
			local154 = this.aFloatArrayArray7[arg2 + 1][arg1];
			local165 = this.aFloatArrayArray8[arg2 + 1][arg1];
		} else if (arg3 == this.aClass149_Sub1_2.anInt4318 && this.aClass149_Sub1_2.anInt4318 == arg0) {
			local143 = this.aFloatArrayArray6[arg2 + 1][arg1 + 1];
			local154 = this.aFloatArrayArray7[arg2 + 1][arg1 + 1];
			local165 = this.aFloatArrayArray8[arg2 + 1][arg1 + 1];
		} else if (arg3 == 0 && arg0 == this.aClass149_Sub1_2.anInt4318) {
			local154 = this.aFloatArrayArray7[arg2][arg1 + 1];
			local143 = this.aFloatArrayArray6[arg2][arg1 + 1];
			local165 = this.aFloatArrayArray8[arg2][arg1 + 1];
		} else {
			local218 = (float) arg3 / (float) this.aClass149_Sub1_2.anInt4318;
			local226 = (float) arg0 / (float) this.aClass149_Sub1_2.anInt4318;
			local233 = this.aFloatArrayArray7[arg2][arg1];
			local240 = this.aFloatArrayArray8[arg2][arg1];
			local247 = this.aFloatArrayArray6[arg2][arg1];
			local256 = this.aFloatArrayArray7[arg2 + 1][arg1];
			local265 = this.aFloatArrayArray8[arg2 + 1][arg1];
			@Pc(281) float local281 = local233 + local218 * (this.aFloatArrayArray7[arg2][arg1 + 1] - local233);
			@Pc(297) float local297 = local240 + (this.aFloatArrayArray8[arg2][arg1 + 1] - local240) * local218;
			@Pc(312) float local312 = local247 + local218 * (this.aFloatArrayArray6[arg2][arg1 + 1] - local247);
			@Pc(329) float local329 = local265 + local218 * (this.aFloatArrayArray8[arg2 + 1][arg1 + 1] - local265);
			@Pc(346) float local346 = local256 + (this.aFloatArrayArray7[arg2 + 1][arg1 + 1] - local256) * local218;
			local355 = this.aFloatArrayArray6[arg2 + 1][arg1];
			local165 = local297 + local226 * (local329 - local297);
			@Pc(381) float local381 = local355 + (this.aFloatArrayArray6[arg2 + 1][arg1 + 1] - local355) * local218;
			local154 = local281 + local226 * (local346 - local281);
			local143 = (local381 - local312) * local226 + local312;
		}
		local218 = this.aClass1_Sub31_1.method5906() - local20;
		local226 = this.aClass1_Sub31_1.method5902() - local34;
		local233 = this.aClass1_Sub31_1.method5904() - local28;
		local240 = (float) Math.sqrt((double) (local233 * local233 + local218 * local218 + local226 * local226));
		local247 = 1.0F / local240;
		local233 *= local247;
		local226 *= local247;
		local218 *= local247;
		local256 = local240 / (float) this.aClass1_Sub31_1.method5910();
		local265 = 1.0F - local256 * local256;
		if (local265 < 0.0F) {
			local265 = 0.0F;
		}
		local355 = local154 * local218 + local165 * local226 + local143 * local233;
		if (local355 < 0.0F) {
			local355 = 0.0F;
		}
		@Pc(550) float local550 = local265 * local355 * 2.0F;
		if (local550 > 1.0F) {
			local550 = 1.0F;
		}
		@Pc(561) int local561 = this.aClass1_Sub31_1.method5907();
		@Pc(571) int local571 = (int) (local550 * (float) (local561 >> 16 & 0xFF));
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local561 >> 8 & 0xFF) * local550);
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(601) int local601 = (int) (local550 * (float) (local561 & 0xFF));
		if (local601 > 255) {
			local601 = 255;
		}
		if (this.aClass39_Sub2_28.aBoolean250) {
			this.aClass1_Sub5_Sub2_2.method5422((float) local20);
			this.aClass1_Sub5_Sub2_2.method5422((float) local34);
			this.aClass1_Sub5_Sub2_2.method5422((float) local28);
		} else {
			this.aClass1_Sub5_Sub2_2.method5420((float) local20);
			this.aClass1_Sub5_Sub2_2.method5420((float) local34);
			this.aClass1_Sub5_Sub2_2.method5420((float) local28);
		}
		this.aClass1_Sub5_Sub2_2.method5396(local571);
		this.aClass1_Sub5_Sub2_2.method5396(local586);
		this.aClass1_Sub5_Sub2_2.method5396(local601);
		this.aClass1_Sub5_Sub2_2.method5396(255);
		this.method4029(local81);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IS)V")
	private void method4029(@OriginalArg(1) short arg0) {
		if (this.aClass39_Sub2_28.aBoolean250) {
			this.aClass1_Sub5_4.method5393(arg0);
		} else {
			this.aClass1_Sub5_4.method5355(arg0);
		}
		this.anInt4856++;
	}
}
