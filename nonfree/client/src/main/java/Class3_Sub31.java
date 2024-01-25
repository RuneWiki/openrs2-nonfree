import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
	private int anInt4997;

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "Lclient!ve;")
	private final Class3_Sub23 aClass3_Sub23_2;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_31;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!eh;")
	private final Class64_Sub1 aClass64_Sub1_2;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	private final int anInt4991;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
	private final int anInt4998;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
	private final int anInt4994;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	private final int anInt4988;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ni", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "Lclient!hh;")
	private final Interface5 anInterface5_6;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "Lclient!tp;")
	private final Class225 aClass225_14;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!cm;")
	private final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "Lclient!tp;")
	private final Class225 aClass225_15;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "Lclient!bt;")
	private Class3_Sub2 aClass3_Sub2_9;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "Lclient!aj;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Lclient!jr;")
	private Class127 aClass127_27;

	static {
		new Class175("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!gk;Lclient!eh;Lclient!ve;[I)V")
	public Class3_Sub31(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class64_Sub1 arg1, @OriginalArg(2) Class3_Sub23 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub23_2 = arg2;
		this.aClass75_Sub2_31 = arg0;
		this.aClass64_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass3_Sub23_2.method3670() - (arg1.anInt7007 >> 1);
		this.anInt4991 = this.aClass3_Sub23_2.method3679() - local22 >> arg1.anInt7004;
		this.anInt4998 = this.aClass3_Sub23_2.method3679() + local22 >> arg1.anInt7004;
		this.anInt4994 = this.aClass3_Sub23_2.method3678() - local22 >> arg1.anInt7004;
		this.anInt4988 = local22 + this.aClass3_Sub23_2.method3678() >> arg1.anInt7004;
		@Pc(78) int local78 = this.anInt4998 + 1 - this.anInt4991;
		@Pc(87) int local87 = this.anInt4988 + 1 - this.anInt4994;
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(141) int local141;
		@Pc(168) int local168;
		@Pc(182) int local182;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = local116 + this.anInt4994;
			if (local123 > 0 && local123 < this.aClass64_Sub1_2.anInt7005 - 1) {
				for (local134 = 0; local134 <= local78; local134++) {
					local141 = this.anInt4991 + local134;
					if (local141 > 0 && this.aClass64_Sub1_2.anInt7006 - 1 > local141) {
						local168 = arg1.I(local141 + 1, local123) - arg1.I(local141 - 1, local123);
						local182 = arg1.I(local141, local123 + 1) - arg1.I(local141, local123 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local182 * local182 + 65536)));
						this.aFloatArrayArray7[local134][local116] = (float) local168 * local198;
						this.aFloatArrayArray8[local134][local116] = -256.0F * local198;
						this.aFloatArrayArray6[local134][local116] = local198 * (float) local182;
					}
				}
			}
		}
		local123 = 0;
		local134 = 0;
		for (local141 = this.anInt4994; local141 <= this.anInt4988; local141++) {
			if (local141 >= 0 && arg1.anInt7005 > local141) {
				for (local168 = this.anInt4991; local168 <= this.anInt4998; local168++) {
					if (local168 >= 0 && local168 < arg1.anInt7006) {
						local182 = arg3[local134];
						@Pc(297) int[] local297 = arg1.anIntArrayArrayArray3[local168][local141];
						if (local297 != null && local182 != 0) {
							if (local182 == 1) {
								local123 += local297.length;
							} else {
								local123 += 3;
							}
						}
					}
					local134++;
				}
			} else {
				local134 += this.anInt4998 - this.anInt4991;
			}
		}
		if (local123 <= 0) {
			this.anInterface5_6 = null;
			this.aClass225_14 = null;
			this.anInterface1_3 = null;
			this.aClass225_15 = null;
		} else {
			this.aClass3_Sub2_9 = new Class3_Sub2(local123 * 2);
			this.aClass3_Sub2_Sub1_4 = new Class3_Sub2_Sub1(local123 * 16);
			this.aClass127_27 = new Class127(Static350.method4984(local123));
			local168 = 0;
			local134 = 0;
			for (local182 = this.anInt4994; local182 <= this.anInt4988; local182++) {
				if (local182 >= 0 && arg1.anInt7005 > local182) {
					@Pc(393) int local393 = 0;
					for (@Pc(396) int local396 = this.anInt4991; local396 <= this.anInt4998; local396++) {
						if (local396 >= 0 && arg1.anInt7006 > local396) {
							@Pc(408) int local408 = arg3[local134];
							@Pc(415) int[] local415 = arg1.anIntArrayArrayArray3[local396][local182];
							@Pc(422) int[] local422 = arg1.anIntArrayArrayArray8[local396][local182];
							if (local415 != null && local408 != 0) {
								if (local408 == 1) {
									for (@Pc(433) int local433 = 0; local433 < local415.length; local433++) {
										this.method4011(local415[local433], local422[local433], local182, local168, local396, local393);
									}
								} else if (local408 == 3) {
									this.method4011(0, 0, local182, local168, local396, local393);
									this.method4011(arg1.anInt7007, 0, local182, local168, local396, local393);
									this.method4011(0, arg1.anInt7007, local182, local168, local396, local393);
								} else if (local408 == 2) {
									this.method4011(arg1.anInt7007, 0, local182, local168, local396, local393);
									this.method4011(arg1.anInt7007, arg1.anInt7007, local182, local168, local396, local393);
									this.method4011(0, 0, local182, local168, local396, local393);
								} else if (local408 == 5) {
									this.method4011(arg1.anInt7007, arg1.anInt7007, local182, local168, local396, local393);
									this.method4011(0, arg1.anInt7007, local182, local168, local396, local393);
									this.method4011(arg1.anInt7007, 0, local182, local168, local396, local393);
								} else if (local408 == 4) {
									this.method4011(0, arg1.anInt7007, local182, local168, local396, local393);
									this.method4011(0, 0, local182, local168, local396, local393);
									this.method4011(arg1.anInt7007, arg1.anInt7007, local182, local168, local396, local393);
								}
							}
						}
						local393++;
						local134++;
					}
				} else {
					local134 += this.anInt4998 - this.anInt4991;
				}
				local168++;
			}
			this.anInterface1_3 = this.aClass75_Sub2_31.method2437(this.aClass3_Sub2_9.aByteArray95, false, this.aClass3_Sub2_9.anInt7620);
			this.anInterface5_6 = this.aClass75_Sub2_31.method2435(this.aClass3_Sub2_Sub1_4.anInt7620, this.aClass3_Sub2_Sub1_4.aByteArray95, false, 16);
			this.aClass225_15 = new Class225(this.aClass75_Sub2_31, this.anInterface5_6, 5126, 3, 0);
			this.aClass225_14 = new Class225(this.aClass75_Sub2_31, this.anInterface5_6, 5121, 4, 12);
		}
		this.aClass127_27 = null;
		this.aClass3_Sub2_Sub1_4 = null;
		this.aClass3_Sub2_9 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray8 = this.aFloatArrayArray6 = null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[ZI)V")
	public void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface1_3 == null || (this.anInt4991 > arg3 + arg0 || (arg0 - arg3 > this.anInt4998 || (arg3 + arg1 < this.anInt4994 || this.anInt4988 < arg1 - arg3)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt4994; local54 <= this.anInt4988; local54++) {
			for (@Pc(59) int local59 = this.anInt4991; local59 <= this.anInt4998; local59++) {
				@Pc(65) int local65 = local59 - arg0;
				@Pc(70) int local70 = local54 - arg1;
				if (local65 > -arg3 && local65 < arg3 && local70 > -arg3 && local70 < arg3 && arg2[local65 + arg3][local70 + arg3]) {
					this.aClass75_Sub2_31.method2405((int) (this.aClass3_Sub23_2.method3677() * 255.0F) << 24);
					this.aClass75_Sub2_31.method2473(null, this.aClass225_15, this.aClass225_14, null);
					this.aClass75_Sub2_31.method2454(0, this.anInterface1_3, this.anInt4997);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(SB)V")
	private void method4010(@OriginalArg(0) short arg0) {
		if (this.aClass75_Sub2_31.aBoolean228) {
			this.aClass3_Sub2_9.method6045(arg0);
		} else {
			this.aClass3_Sub2_9.method6000(arg0);
		}
		this.anInt4997++;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
	private void method4011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass64_Sub1_2.anInt7004) + arg0;
		@Pc(24) int local24 = arg1 + (arg2 << this.aClass64_Sub1_2.anInt7004);
		@Pc(30) int local30 = this.aClass64_Sub1_2.va(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local24 << 16;
			@Pc(68) Class3 local68 = this.aClass127_27.method3246(local7);
			if (local68 != null) {
				this.method4010(((Class3_Sub32) local68).aShort154);
				return;
			}
		}
		@Pc(86) short local86 = (short) this.anInt4992++;
		if (local7 != -1L) {
			this.aClass127_27.method3257(local7, new Class3_Sub32(local86));
		}
		@Pc(122) float local122;
		@Pc(115) float local115;
		@Pc(129) float local129;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(314) float local314;
		if (arg0 == 0 && arg1 == 0) {
			local115 = this.aFloatArrayArray8[arg5][arg3];
			local122 = this.aFloatArrayArray7[arg5][arg3];
			local129 = this.aFloatArrayArray6[arg5][arg3];
		} else if (this.aClass64_Sub1_2.anInt7007 == arg0 && arg1 == 0) {
			local122 = this.aFloatArrayArray7[arg5 + 1][arg3];
			local115 = this.aFloatArrayArray8[arg5 + 1][arg3];
			local129 = this.aFloatArrayArray6[arg5 + 1][arg3];
		} else if (this.aClass64_Sub1_2.anInt7007 == arg0 && arg1 == this.aClass64_Sub1_2.anInt7007) {
			local129 = this.aFloatArrayArray6[arg5 + 1][arg3 + 1];
			local115 = this.aFloatArrayArray8[arg5 + 1][arg3 + 1];
			local122 = this.aFloatArrayArray7[arg5 + 1][arg3 + 1];
		} else if (arg0 == 0 && this.aClass64_Sub1_2.anInt7007 == arg1) {
			local129 = this.aFloatArrayArray6[arg5][arg3 + 1];
			local115 = this.aFloatArrayArray8[arg5][arg3 + 1];
			local122 = this.aFloatArrayArray7[arg5][arg3 + 1];
		} else {
			local209 = (float) arg0 / (float) this.aClass64_Sub1_2.anInt7007;
			local217 = (float) arg1 / (float) this.aClass64_Sub1_2.anInt7007;
			local224 = this.aFloatArrayArray7[arg5][arg3];
			local231 = this.aFloatArrayArray8[arg5][arg3];
			local238 = this.aFloatArrayArray6[arg5][arg3];
			local247 = this.aFloatArrayArray7[arg5 + 1][arg3];
			local256 = this.aFloatArrayArray8[arg5 + 1][arg3];
			@Pc(272) float local272 = local224 + (this.aFloatArrayArray7[arg5][arg3 + 1] - local224) * local209;
			@Pc(288) float local288 = local231 + (this.aFloatArrayArray8[arg5][arg3 + 1] - local231) * local209;
			@Pc(305) float local305 = local256 + local209 * (this.aFloatArrayArray8[arg5 + 1][arg3 + 1] - local256);
			local314 = this.aFloatArrayArray6[arg5 + 1][arg3];
			@Pc(329) float local329 = local238 + local209 * (this.aFloatArrayArray6[arg5][arg3 + 1] - local238);
			@Pc(346) float local346 = local247 + local209 * (this.aFloatArrayArray7[arg5 + 1][arg3 + 1] - local247);
			local122 = local272 + (local346 - local272) * local217;
			local115 = local288 + (local305 - local288) * local217;
			@Pc(380) float local380 = local314 + local209 * (this.aFloatArrayArray6[arg5 + 1][arg3 + 1] - local314);
			local129 = (local380 - local329) * local217 + local329;
		}
		local209 = this.aClass3_Sub23_2.method3679() - local15;
		local217 = this.aClass3_Sub23_2.method3675() - local30;
		local224 = this.aClass3_Sub23_2.method3678() - local24;
		local231 = (float) Math.sqrt((double) (local217 * local217 + local209 * local209 + local224 * local224));
		local238 = 1.0F / local231;
		local217 *= local238;
		local224 *= local238;
		local209 *= local238;
		local247 = local231 / (float) this.aClass3_Sub23_2.method3670();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local314 = local209 * local122 + local217 * local115 + local129 * local224;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(547) float local547 = local256 * local314 * 2.0F;
		if (local547 > 1.0F) {
			local547 = 1.0F;
		}
		@Pc(558) int local558 = this.aClass3_Sub23_2.method3674();
		@Pc(568) int local568 = (int) (local547 * (float) (local558 >> 16 & 0xFF));
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(585) int local585 = (int) (local547 * (float) (local558 >> 8 & 0xFF));
		if (local585 > 255) {
			local585 = 255;
		}
		@Pc(598) int local598 = (int) (local547 * (float) (local558 & 0xFF));
		if (local598 > 255) {
			local598 = 255;
		}
		if (this.aClass75_Sub2_31.aBoolean228) {
			this.aClass3_Sub2_Sub1_4.method400((float) local15);
			this.aClass3_Sub2_Sub1_4.method400((float) local30);
			this.aClass3_Sub2_Sub1_4.method400((float) local24);
		} else {
			this.aClass3_Sub2_Sub1_4.method395((float) local15);
			this.aClass3_Sub2_Sub1_4.method395((float) local30);
			this.aClass3_Sub2_Sub1_4.method395((float) local24);
		}
		this.aClass3_Sub2_Sub1_4.method6001(local568);
		this.aClass3_Sub2_Sub1_4.method6001(local585);
		this.aClass3_Sub2_Sub1_4.method6001(local598);
		this.aClass3_Sub2_Sub1_4.method6001(255);
		this.method4010(local86);
	}
}
