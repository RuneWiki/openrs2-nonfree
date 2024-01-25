import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
	private int anInt2915;

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_11;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Lclient!at;")
	private final Class2_Sub5 aClass2_Sub5_2;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Lclient!eo;")
	private final Class75_Sub1 aClass75_Sub1_2;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
	private final int anInt2911;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
	private final int anInt2912;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	private final int anInt2914;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	private final int anInt2905;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!gk", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	private int anInt2908;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "Lclient!tq;")
	private final Interface19 anInterface19_4;

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "Lclient!g;")
	private final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!ica;")
	private Class127 aClass127_24;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!kw;Lclient!eo;Lclient!at;[I)V")
	public Class2_Sub24(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class75_Sub1 arg1, @OriginalArg(2) Class2_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass39_Sub2_11 = arg0;
		this.aClass2_Sub5_2 = arg2;
		this.aClass75_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass2_Sub5_2.method1666() - (arg1.anInt7994 >> 1);
		this.anInt2911 = this.aClass2_Sub5_2.method1672() - local22 >> arg1.anInt7996;
		this.anInt2912 = local22 + this.aClass2_Sub5_2.method1672() >> arg1.anInt7996;
		this.anInt2914 = this.aClass2_Sub5_2.method1662() - local22 >> arg1.anInt7996;
		this.anInt2905 = local22 + this.aClass2_Sub5_2.method1662() >> arg1.anInt7996;
		@Pc(76) int local76 = this.anInt2912 + 1 - this.anInt2911;
		@Pc(85) int local85 = this.anInt2905 + 1 - this.anInt2914;
		this.aFloatArrayArray4 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray6 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray5 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(171) int local171;
		@Pc(186) int local186;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt2914;
			if (local122 > 0 && this.aClass75_Sub1_2.anInt7995 - 1 > local122) {
				for (local133 = 0; local133 <= local76; local133++) {
					local140 = this.anInt2911 + local133;
					if (local140 > 0 && local140 < this.aClass75_Sub1_2.anInt7998 - 1) {
						local171 = arg1.ba(local140 + 1, local122) - arg1.ba(local140 - 1, local122);
						local186 = arg1.ba(local140, local122 + 1) - arg1.ba(local140, local122 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local171 * local171 + local186 * local186 + 65536)));
						this.aFloatArrayArray6[local133][local114] = (float) local171 * local201;
						this.aFloatArrayArray4[local133][local114] = local201 * -256.0F;
						this.aFloatArrayArray5[local133][local114] = (float) local186 * local201;
					}
				}
			}
		}
		local122 = 0;
		for (local133 = this.anInt2914; local133 <= this.anInt2905; local133++) {
			if (local133 >= 0 && local133 < arg1.anInt7995) {
				for (local140 = this.anInt2911; local140 <= this.anInt2912; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt7998) {
						local171 = arg3[local122];
						@Pc(288) int[] local288 = arg1.anIntArrayArrayArray5[local140][local133];
						if (local288 != null && local171 != 0) {
							this.anInt2908 += local171 == 1 ? local288.length : 3;
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt2912 - this.anInt2911;
			}
		}
		if (this.anInt2908 <= 0) {
			this.anInterface19_4 = null;
			this.anInterface7_3 = null;
		} else {
			this.aClass127_24 = new Class127(Static131.method2413(this.anInt2908));
			this.anInterface7_3 = this.aClass39_Sub2_11.method6204(false);
			this.anInterface7_3.method6949(this.anInt2908);
			@Pc(361) NativeHeapBuffer local361 = this.aClass39_Sub2_11.method6115(this.anInt2908 * 16, false);
			this.aStream2 = new Stream(local361);
			while (true) {
				@Pc(373) Buffer local373;
				do {
					local373 = this.anInterface7_3.method6952();
				} while (local373 == null);
				this.aStream3 = new Stream(local373);
				local122 = 0;
				local186 = 0;
				for (@Pc(388) int local388 = this.anInt2914; local388 <= this.anInt2905; local388++) {
					if (local388 >= 0 && local388 < arg1.anInt7995) {
						@Pc(415) int local415 = 0;
						for (@Pc(418) int local418 = this.anInt2911; local418 <= this.anInt2912; local418++) {
							if (local418 >= 0 && local418 < arg1.anInt7998) {
								@Pc(430) int local430 = arg3[local122];
								@Pc(437) int[] local437 = arg1.anIntArrayArrayArray5[local418][local388];
								@Pc(444) int[] local444 = arg1.anIntArrayArrayArray6[local418][local388];
								if (local437 != null && local430 != 0) {
									if (local430 == 1) {
										for (@Pc(599) int local599 = 0; local599 < local437.length; local599++) {
											this.method2724(local418, local444[local599], local437[local599], local186, local388, local415);
										}
									} else if (local430 == 3) {
										this.method2724(local418, 0, 0, local186, local388, local415);
										this.method2724(local418, 0, arg1.anInt7994, local186, local388, local415);
										this.method2724(local418, arg1.anInt7994, 0, local186, local388, local415);
									} else if (local430 == 2) {
										this.method2724(local418, 0, arg1.anInt7994, local186, local388, local415);
										this.method2724(local418, arg1.anInt7994, arg1.anInt7994, local186, local388, local415);
										this.method2724(local418, 0, 0, local186, local388, local415);
									} else if (local430 == 5) {
										this.method2724(local418, arg1.anInt7994, arg1.anInt7994, local186, local388, local415);
										this.method2724(local418, arg1.anInt7994, 0, local186, local388, local415);
										this.method2724(local418, 0, arg1.anInt7994, local186, local388, local415);
									} else if (local430 == 4) {
										this.method2724(local418, arg1.anInt7994, 0, local186, local388, local415);
										this.method2724(local418, 0, 0, local186, local388, local415);
										this.method2724(local418, arg1.anInt7994, arg1.anInt7994, local186, local388, local415);
									}
								}
							}
							local122++;
							local415++;
						}
					} else {
						local122 += this.anInt2912 - this.anInt2911;
					}
					local186++;
				}
				this.aStream3.c();
				if (this.anInterface7_3.method6954()) {
					this.aStream2.c();
					this.anInterface19_4 = this.aClass39_Sub2_11.method6100(false);
					this.anInterface19_4.method6489(local361, this.anInt2915 * 16, 16);
					break;
				}
				this.aStream2.a(0);
				this.aClass127_24.method3204();
			}
		}
		this.aFloatArrayArray6 = this.aFloatArrayArray4 = this.aFloatArrayArray5 = null;
		this.aClass127_24 = null;
		this.aStream2 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(SB)V")
	private void method2723(@OriginalArg(0) short arg0) {
		if (Stream.a()) {
			this.aStream3.f(arg0);
		} else {
			this.aStream3.e(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
	private void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) long local13 = -1L;
		@Pc(21) int local21 = (arg0 << this.aClass75_Sub1_2.anInt7996) + arg2;
		@Pc(29) int local29 = arg1 + (arg4 << this.aClass75_Sub1_2.anInt7996);
		@Pc(35) int local35 = this.aClass75_Sub1_2.aa(local21, local29);
		if ((arg2 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local13 = 0xFFFFL << 16 & (long) local29 << 16 | (long) local21 & 0xFFFFL;
			@Pc(66) Class2 local66 = this.aClass127_24.method3205(local13);
			if (local66 != null) {
				this.method2723(((Class2_Sub15) local66).aShort24);
				return;
			}
		}
		@Pc(84) short local84 = (short) this.anInt2915++;
		if (local13 != -1L) {
			this.aClass127_24.method3213(new Class2_Sub15(local84), local13);
		}
		@Pc(134) float local134;
		@Pc(143) float local143;
		@Pc(125) float local125;
		@Pc(212) float local212;
		@Pc(220) float local220;
		@Pc(227) float local227;
		@Pc(234) float local234;
		@Pc(241) float local241;
		@Pc(250) float local250;
		@Pc(259) float local259;
		@Pc(332) float local332;
		if (arg2 == 0 && arg1 == 0) {
			local143 = this.aFloatArrayArray4[arg5][arg3];
			local125 = this.aFloatArrayArray5[arg5][arg3];
			local134 = this.aFloatArrayArray6[arg5][arg3];
		} else if (arg2 == this.aClass75_Sub1_2.anInt7994 && arg1 == 0) {
			local125 = this.aFloatArrayArray5[arg5 + 1][arg3];
			local134 = this.aFloatArrayArray6[arg5 + 1][arg3];
			local143 = this.aFloatArrayArray4[arg5 + 1][arg3];
		} else if (this.aClass75_Sub1_2.anInt7994 == arg2 && this.aClass75_Sub1_2.anInt7994 == arg1) {
			local143 = this.aFloatArrayArray4[arg5 + 1][arg3 + 1];
			local125 = this.aFloatArrayArray5[arg5 + 1][arg3 + 1];
			local134 = this.aFloatArrayArray6[arg5 + 1][arg3 + 1];
		} else if (arg2 == 0 && this.aClass75_Sub1_2.anInt7994 == arg1) {
			local143 = this.aFloatArrayArray4[arg5][arg3 + 1];
			local125 = this.aFloatArrayArray5[arg5][arg3 + 1];
			local134 = this.aFloatArrayArray6[arg5][arg3 + 1];
		} else {
			local212 = (float) arg2 / (float) this.aClass75_Sub1_2.anInt7994;
			local220 = (float) arg1 / (float) this.aClass75_Sub1_2.anInt7994;
			local227 = this.aFloatArrayArray6[arg5][arg3];
			local234 = this.aFloatArrayArray4[arg5][arg3];
			local241 = this.aFloatArrayArray5[arg5][arg3];
			local250 = this.aFloatArrayArray6[arg5 + 1][arg3];
			local259 = this.aFloatArrayArray4[arg5 + 1][arg3];
			@Pc(275) float local275 = local241 + (this.aFloatArrayArray5[arg5][arg3 + 1] - local241) * local212;
			@Pc(291) float local291 = local227 + (this.aFloatArrayArray6[arg5][arg3 + 1] - local227) * local212;
			@Pc(308) float local308 = local259 + local212 * (this.aFloatArrayArray4[arg5 + 1][arg3 + 1] - local259);
			@Pc(323) float local323 = local234 + (this.aFloatArrayArray4[arg5][arg3 + 1] - local234) * local212;
			local332 = this.aFloatArrayArray5[arg5 + 1][arg3];
			@Pc(350) float local350 = local250 + local212 * (this.aFloatArrayArray6[arg5 + 1][arg3 + 1] - local250);
			local134 = local220 * (local350 - local291) + local291;
			@Pc(376) float local376 = local332 + local212 * (this.aFloatArrayArray5[arg5 + 1][arg3 + 1] - local332);
			local143 = (local308 - local323) * local220 + local323;
			local125 = local275 + local220 * (local376 - local275);
		}
		local212 = this.aClass2_Sub5_2.method1672() - local21;
		local220 = this.aClass2_Sub5_2.method1671() - local35;
		local227 = this.aClass2_Sub5_2.method1662() - local29;
		local234 = (float) Math.sqrt((double) (local212 * local212 + local220 * local220 + local227 * local227));
		local241 = 1.0F / local234;
		local220 *= local241;
		local212 *= local241;
		local227 *= local241;
		local250 = local234 / (float) this.aClass2_Sub5_2.method1666();
		local259 = 1.0F - local250 * local250;
		if (local259 < 0.0F) {
			local259 = 0.0F;
		}
		local332 = local227 * local125 + local212 * local134 + local143 * local220;
		if (local332 < 0.0F) {
			local332 = 0.0F;
		}
		@Pc(546) float local546 = local332 * local259 * 2.0F;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass2_Sub5_2.method1669();
		@Pc(567) int local567 = (int) (local546 * (float) (local557 >> 16 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(584) int local584 = (int) (local546 * (float) (local557 >> 8 & 0xFF));
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(599) int local599 = (int) (local546 * (float) (local557 & 0xFF));
		if (local599 > 255) {
			local599 = 255;
		}
		if (Stream.a()) {
			this.aStream2.a((float) local21);
			this.aStream2.a((float) local35);
			this.aStream2.a((float) local29);
		} else {
			this.aStream2.b((float) local21);
			this.aStream2.b((float) local35);
			this.aStream2.b((float) local29);
		}
		if (this.aClass39_Sub2_11.anInt7313 == 0) {
			this.aStream2.b(local599);
			this.aStream2.b(local584);
			this.aStream2.b(local567);
		} else {
			this.aStream2.b(local567);
			this.aStream2.b(local584);
			this.aStream2.b(local599);
		}
		this.aStream2.b(255);
		this.method2723(local84);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([[ZIBII)V")
	public void method2725(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface7_3 == null || (this.anInt2911 > arg2 + arg3 || (arg3 - arg2 > this.anInt2912 || (this.anInt2914 > arg1 + arg2 || arg1 - arg2 > this.anInt2905)))) {
			return;
		}
		for (@Pc(46) int local46 = this.anInt2914; local46 <= this.anInt2905; local46++) {
			for (@Pc(51) int local51 = this.anInt2911; local51 <= this.anInt2912; local51++) {
				@Pc(58) int local58 = local51 - arg3;
				@Pc(63) int local63 = local46 - arg1;
				if (-arg2 < local58 && arg2 > local58 && local63 > -arg2 && arg2 > local63 && arg0[local58 + arg2][local63 + arg2]) {
					this.aClass39_Sub2_11.method6126((byte) (this.aClass2_Sub5_2.method1665() * 255.0F));
					this.aClass39_Sub2_11.method6200(this.aClass39_Sub2_11.aClass304_18);
					this.aClass39_Sub2_11.method6095(0, this.anInterface19_4);
					this.aClass39_Sub2_11.method6215(this.anInterface7_3, 0, Static514.aClass281_6, this.anInt2908 / 3, 0, this.anInt2915);
					return;
				}
			}
		}
	}
}
