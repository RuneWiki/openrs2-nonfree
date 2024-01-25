import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	private int anInt3832;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	private int anInt3835;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Lclient!kk;")
	private final Class12_Sub2 aClass12_Sub2_2;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_26;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Lclient!wc;")
	private final Class1_Sub19 aClass1_Sub19_1;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	private final int anInt3836;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	private final int anInt3833;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	private final int anInt3834;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	private final int anInt3837;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!ko;")
	private final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "Lclient!gm;")
	private final Class84 aClass84_7;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Lclient!gm;")
	private final Class84 aClass84_8;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "Lclient!na;")
	private final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Lclient!nj;")
	private Class1_Sub21 aClass1_Sub21_4;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!jm;")
	private Class1_Sub21_Sub1 aClass1_Sub21_Sub1_1;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "Lclient!vk;")
	private Class207 aClass207_25;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!nf;Lclient!kk;Lclient!wc;[I)V")
	public Class1_Sub27(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) Class1_Sub19 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass12_Sub2_2 = arg1;
		this.aClass105_Sub1_26 = arg0;
		this.aClass1_Sub19_1 = arg2;
		@Pc(20) int local20 = this.aClass1_Sub19_1.anInt2479 - (arg1.anInt3171 >> 1);
		this.anInt3836 = this.aClass1_Sub19_1.anInt2482 - local20 >> arg1.anInt3170;
		this.anInt3833 = local20 + this.aClass1_Sub19_1.anInt2482 >> arg1.anInt3170;
		this.anInt3834 = this.aClass1_Sub19_1.anInt2484 - local20 >> arg1.anInt3170;
		this.anInt3837 = this.aClass1_Sub19_1.anInt2484 + local20 >> arg1.anInt3170;
		@Pc(70) int local70 = this.anInt3833 + 1 - this.anInt3836;
		@Pc(79) int local79 = this.anInt3837 + 1 - this.anInt3834;
		this.aFloatArrayArray8 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray7 = new float[local70 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(135) int local135;
		@Pc(148) int local148;
		@Pc(178) int local178;
		@Pc(192) int local192;
		for (local108 = 0; local108 <= local79; local108++) {
			local117 = local108 + this.anInt3834;
			if (local117 > 0 && local117 < this.aClass12_Sub2_2.anInt3163 - 1) {
				for (local135 = 0; local135 <= local70; local135++) {
					local148 = local135 + this.anInt3836;
					if (local148 > 0 && this.aClass12_Sub2_2.anInt3162 - 1 > local148) {
						local178 = arg1.method2704(local148 + 1, local117) - arg1.method2704(local148 - 1, local117);
						local192 = arg1.method2704(local148, local117 + 1) - arg1.method2704(local148, local117 - 1);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local178 * local178 + local192 * local192 + 65536)));
						this.aFloatArrayArray7[local135][local108] = local208 * (float) local178;
						this.aFloatArrayArray8[local135][local108] = -256.0F * local208;
						this.aFloatArrayArray6[local135][local108] = local208 * (float) local192;
					}
				}
			}
		}
		local108 = 0;
		local117 = 0;
		for (local135 = this.anInt3834; local135 <= this.anInt3837; local135++) {
			if (local135 >= 0 && arg1.anInt3163 > local135) {
				for (local148 = this.anInt3836; local148 <= this.anInt3833; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt3162) {
						local178 = arg3[local117];
						@Pc(287) int[] local287 = arg1.anIntArrayArrayArray8[local148][local135];
						if (local287 != null && local178 != 0) {
							if (local178 == 1) {
								local108 += local287.length;
							} else {
								local108 += 3;
							}
						}
					}
					local117++;
				}
			} else {
				local117 += this.anInt3833 - this.anInt3836;
			}
		}
		if (local108 <= 0) {
			this.anInterface8_3 = null;
			this.aClass84_7 = null;
			this.aClass84_8 = null;
			this.anInterface9_3 = null;
		} else {
			this.aClass1_Sub21_4 = new Class1_Sub21(local108 * 2);
			this.aClass1_Sub21_Sub1_1 = new Class1_Sub21_Sub1(local108 * 16);
			this.aClass207_25 = new Class207(Static304.method5275(local108));
			local117 = 0;
			local135 = 0;
			for (local148 = this.anInt3834; local148 <= this.anInt3837; local148++) {
				if (local148 >= 0 && local148 < arg1.anInt3163) {
					local178 = 0;
					for (local192 = this.anInt3836; local192 <= this.anInt3833; local192++) {
						if (local192 >= 0 && local192 < arg1.anInt3162) {
							@Pc(409) int local409 = arg3[local117];
							@Pc(416) int[] local416 = arg1.anIntArrayArrayArray8[local192][local148];
							@Pc(423) int[] local423 = arg1.anIntArrayArrayArray5[local192][local148];
							if (local416 != null && local409 != 0) {
								if (local409 == 1) {
									for (@Pc(438) int local438 = 0; local438 < local416.length; local438++) {
										this.method3258(local148, local416[local438], local192, local423[local438], local178, local135);
									}
								} else if (local409 == 3) {
									this.method3258(local148, 0, local192, 0, local178, local135);
									this.method3258(local148, arg1.anInt3171, local192, 0, local178, local135);
									this.method3258(local148, 0, local192, arg1.anInt3171, local178, local135);
								} else if (local409 == 2) {
									this.method3258(local148, arg1.anInt3171, local192, 0, local178, local135);
									this.method3258(local148, arg1.anInt3171, local192, arg1.anInt3171, local178, local135);
									this.method3258(local148, 0, local192, 0, local178, local135);
								} else if (local409 == 5) {
									this.method3258(local148, arg1.anInt3171, local192, arg1.anInt3171, local178, local135);
									this.method3258(local148, 0, local192, arg1.anInt3171, local178, local135);
									this.method3258(local148, arg1.anInt3171, local192, 0, local178, local135);
								} else if (local409 == 4) {
									this.method3258(local148, 0, local192, arg1.anInt3171, local178, local135);
									this.method3258(local148, 0, local192, 0, local178, local135);
									this.method3258(local148, arg1.anInt3171, local192, arg1.anInt3171, local178, local135);
								}
							}
						}
						local178++;
						local117++;
					}
				} else {
					local117 += this.anInt3833 - this.anInt3836;
				}
				local135++;
			}
			this.anInterface8_3 = this.aClass105_Sub1_26.method3598(this.aClass1_Sub21_4.aByteArray82, this.aClass1_Sub21_4.anInt6611, false);
			this.anInterface9_3 = this.aClass105_Sub1_26.method3615(16, this.aClass1_Sub21_Sub1_1.aByteArray82, this.aClass1_Sub21_Sub1_1.anInt6611, false);
			this.aClass84_7 = new Class84(this.aClass105_Sub1_26, this.anInterface9_3, 5126, 3, 0);
			this.aClass84_8 = new Class84(this.aClass105_Sub1_26, this.anInterface9_3, 5121, 4, 12);
		}
		this.aClass207_25 = null;
		this.aClass1_Sub21_4 = null;
		this.aClass1_Sub21_Sub1_1 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray8 = this.aFloatArrayArray6 = null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(SI)V")
	private void method3257(@OriginalArg(0) short arg0) {
		if (this.aClass105_Sub1_26.aBoolean316) {
			this.aClass1_Sub21_4.method5698(arg0);
		} else {
			this.aClass1_Sub21_4.method5731(arg0);
		}
		this.anInt3835++;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBIIII)V")
	private void method3258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = arg1 + (arg2 << this.aClass12_Sub2_2.anInt3170);
		@Pc(17) int local17 = (arg0 << this.aClass12_Sub2_2.anInt3170) + arg3;
		@Pc(23) int local23 = this.aClass12_Sub2_2.method2698(local9, local17);
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(53) Class1 local53 = this.aClass207_25.method5555(local1);
			if (local53 != null) {
				this.method3257(((Class1_Sub36) local53).aShort75);
				return;
			}
		}
		@Pc(71) short local71 = (short) this.anInt3832++;
		if (local1 != -1L) {
			this.aClass207_25.method5552(new Class1_Sub36(local71), local1);
		}
		@Pc(102) float local102;
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(161) float local161;
		@Pc(169) float local169;
		@Pc(176) float local176;
		@Pc(183) float local183;
		@Pc(190) float local190;
		@Pc(199) float local199;
		@Pc(208) float local208;
		@Pc(269) float local269;
		if (arg1 == 0 && arg3 == 0) {
			local102 = this.aFloatArrayArray7[arg4][arg5];
			local109 = this.aFloatArrayArray8[arg4][arg5];
			local116 = this.aFloatArrayArray6[arg4][arg5];
		} else if (this.aClass12_Sub2_2.anInt3171 == arg1 && arg3 == 0) {
			local109 = this.aFloatArrayArray8[arg4 + 1][arg5];
			local102 = this.aFloatArrayArray7[arg4 + 1][arg5];
			local116 = this.aFloatArrayArray6[arg4 + 1][arg5];
		} else if (arg1 == this.aClass12_Sub2_2.anInt3171 && arg3 == this.aClass12_Sub2_2.anInt3171) {
			local102 = this.aFloatArrayArray7[arg4 + 1][arg5 + 1];
			local116 = this.aFloatArrayArray6[arg4 + 1][arg5 + 1];
			local109 = this.aFloatArrayArray8[arg4 + 1][arg5 + 1];
		} else if (arg1 == 0 && this.aClass12_Sub2_2.anInt3171 == arg3) {
			local109 = this.aFloatArrayArray8[arg4][arg5 + 1];
			local116 = this.aFloatArrayArray6[arg4][arg5 + 1];
			local102 = this.aFloatArrayArray7[arg4][arg5 + 1];
		} else {
			local161 = (float) arg1 / (float) this.aClass12_Sub2_2.anInt3171;
			local169 = (float) arg3 / (float) this.aClass12_Sub2_2.anInt3171;
			local176 = this.aFloatArrayArray7[arg4][arg5];
			local183 = this.aFloatArrayArray8[arg4][arg5];
			local190 = this.aFloatArrayArray6[arg4][arg5];
			local199 = this.aFloatArrayArray7[arg4 + 1][arg5];
			local208 = this.aFloatArrayArray8[arg4 + 1][arg5];
			@Pc(226) float local226 = local208 + (this.aFloatArrayArray8[arg4 + 1][arg5 + 1] - local208) * local161;
			@Pc(244) float local244 = local199 + (this.aFloatArrayArray7[arg4 + 1][arg5 + 1] - local199) * local161;
			@Pc(260) float local260 = local190 + (this.aFloatArrayArray6[arg4][arg5 + 1] - local190) * local161;
			local269 = this.aFloatArrayArray6[arg4 + 1][arg5];
			@Pc(285) float local285 = local176 + (this.aFloatArrayArray7[arg4][arg5 + 1] - local176) * local161;
			@Pc(301) float local301 = local183 + (this.aFloatArrayArray8[arg4][arg5 + 1] - local183) * local161;
			local109 = local169 * (local226 - local301) + local301;
			@Pc(326) float local326 = local269 + (this.aFloatArrayArray6[arg4 + 1][arg5 + 1] - local269) * local161;
			local102 = local285 + local169 * (local244 - local285);
			local116 = local260 + local169 * (local326 - local260);
		}
		local161 = this.aClass1_Sub19_1.anInt2482 - local9;
		local169 = this.aClass1_Sub19_1.anInt2481 - local23;
		local176 = this.aClass1_Sub19_1.anInt2484 - local17;
		local183 = (float) Math.sqrt((double) (local161 * local161 + local169 * local169 + local176 * local176));
		local190 = 1.0F / local183;
		local161 *= local190;
		local169 *= local190;
		local176 *= local190;
		local199 = local183 / (float) this.aClass1_Sub19_1.anInt2479;
		local208 = 1.0F - local199 * local199;
		if (local208 < 0.0F) {
			local208 = 0.0F;
		}
		local269 = local176 * local116 + local161 * local102 + local169 * local109;
		if (local269 < 0.0F) {
			local269 = 0.0F;
		}
		@Pc(534) float local534 = local269 * 2.0F * local208;
		if (local534 > 1.0F) {
			local534 = 1.0F;
		}
		@Pc(548) int local548 = this.aClass1_Sub19_1.anInt2483;
		@Pc(558) int local558 = (int) ((float) (local548 >> 16 & 0xFF) * local534);
		if (local558 > 255) {
			local558 = 255;
		}
		@Pc(574) int local574 = (int) ((float) (local548 >> 8 & 0xFF) * local534);
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(588) int local588 = (int) ((float) (local548 & 0xFF) * local534);
		if (this.aClass105_Sub1_26.aBoolean316) {
			this.aClass1_Sub21_Sub1_1.method2551((float) local9);
			this.aClass1_Sub21_Sub1_1.method2551((float) local23);
			this.aClass1_Sub21_Sub1_1.method2551((float) local17);
		} else {
			this.aClass1_Sub21_Sub1_1.method2552((float) local9);
			this.aClass1_Sub21_Sub1_1.method2552((float) local23);
			this.aClass1_Sub21_Sub1_1.method2552((float) local17);
		}
		if (local588 > 255) {
			local588 = 255;
		}
		this.aClass1_Sub21_Sub1_1.method5718(local558);
		this.aClass1_Sub21_Sub1_1.method5718(local574);
		this.aClass1_Sub21_Sub1_1.method5718(local588);
		this.aClass1_Sub21_Sub1_1.method5718(255);
		this.method3257(local71);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III[[ZB)V")
	public void method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface8_3 == null || (this.anInt3836 > arg0 + arg2 || (this.anInt3833 < arg2 - arg0 || (arg0 + arg1 < this.anInt3834 || arg1 - arg0 > this.anInt3837)))) {
			return;
		}
		for (@Pc(49) int local49 = this.anInt3834; local49 <= this.anInt3837; local49++) {
			for (@Pc(56) int local56 = this.anInt3836; local56 <= this.anInt3833; local56++) {
				@Pc(65) int local65 = local56 - arg2;
				@Pc(70) int local70 = local49 - arg1;
				if (local65 > -arg0 && local65 < arg0 && local70 > -arg0 && local70 < arg0 && arg3[local65 + arg0][local70 + arg0]) {
					this.aClass105_Sub1_26.method3627((int) (this.aClass1_Sub19_1.aFloat15 * 255.0F) << 24);
					this.aClass105_Sub1_26.method3611();
					this.aClass105_Sub1_26.method3578(this.aClass84_7);
					this.aClass105_Sub1_26.method3569(this.aClass84_8);
					this.aClass105_Sub1_26.method3590(this.anInterface8_3, 0, this.anInt3835);
					return;
				}
			}
		}
	}
}
