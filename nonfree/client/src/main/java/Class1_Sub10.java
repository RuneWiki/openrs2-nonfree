import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
	private int anInt1372;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "Lclient!rc;")
	private final Class1_Sub18 aClass1_Sub18_1;

	@OriginalMember(owner = "client!cr", name = "B", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_7;

	@OriginalMember(owner = "client!cr", name = "A", descriptor = "Lclient!ni;")
	private final Class47_Sub2 aClass47_Sub2_1;

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
	private final int anInt1378;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
	private final int anInt1375;

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
	private final int anInt1379;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	private final int anInt1371;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
	private int anInt1377;

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Lclient!kea;")
	private Class187 aClass187_7;

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "Lclient!rn;")
	private final Interface20 anInterface20_1;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "Lclient!bca;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!hea;Lclient!ni;Lclient!rc;[I)V")
	public Class1_Sub10(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Class47_Sub2 arg1, @OriginalArg(2) Class1_Sub18 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub18_1 = arg2;
		this.aClass134_Sub1_7 = arg0;
		this.aClass47_Sub2_1 = arg1;
		@Pc(23) int local23 = this.aClass1_Sub18_1.method4104() - (arg1.anInt9208 >> 1);
		this.anInt1378 = this.aClass1_Sub18_1.method4107() - local23 >> arg1.anInt9205;
		this.anInt1375 = local23 + this.aClass1_Sub18_1.method4107() >> arg1.anInt9205;
		this.anInt1379 = this.aClass1_Sub18_1.method4098() - local23 >> arg1.anInt9205;
		this.anInt1371 = local23 + this.aClass1_Sub18_1.method4098() >> arg1.anInt9205;
		@Pc(77) int local77 = this.anInt1375 + 1 - this.anInt1378;
		@Pc(86) int local86 = this.anInt1371 + 1 - this.anInt1379;
		this.aFloatArrayArray1 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(167) int local167;
		@Pc(184) int local184;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt1379;
			if (local123 > 0 && local123 < this.aClass47_Sub2_1.anInt9210 - 1) {
				for (local134 = 0; local134 <= local77; local134++) {
					local142 = local134 + this.anInt1378;
					if (local142 > 0 && this.aClass47_Sub2_1.anInt9209 - 1 > local142) {
						local167 = arg1.method7545(local142 + 1, local123) - arg1.method7545(local142 - 1, local123);
						local184 = arg1.method7545(local142, local123 + 1) - arg1.method7545(local142, local123 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + local167 * local167 + 65536)));
						this.aFloatArrayArray1[local134][local115] = local199 * (float) local167;
						this.aFloatArrayArray2[local134][local115] = -256.0F * local199;
						this.aFloatArrayArray3[local134][local115] = (float) local184 * local199;
					}
				}
			}
		}
		local123 = 0;
		@Pc(300) int local300;
		for (local134 = this.anInt1379; local134 <= this.anInt1371; local134++) {
			if (local134 >= 0 && local134 < arg1.anInt9210) {
				for (local142 = this.anInt1378; local142 <= this.anInt1375; local142++) {
					if (local142 >= 0 && local142 < arg1.anInt9209) {
						local167 = arg3[local123];
						@Pc(288) int[] local288 = arg1.anIntArrayArrayArray8[local142][local134];
						if (local288 != null && local167 != 0) {
							if (local167 == 1) {
								local300 = 0;
								while (local288.length > local300) {
									if (local288[local300++] != -1 && local288[local300++] != -1 && local288[local300++] != -1) {
										this.anInt1377 += 3;
									}
								}
							} else {
								this.anInt1377 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt1375 - this.anInt1378;
			}
		}
		if (this.anInt1377 > 0) {
			this.aClass187_7 = new Class187(Static457.method6299(this.anInt1377));
			this.anInterface20_1 = this.aClass134_Sub1_7.method6804(false);
			this.anInterface20_1.method7376(this.anInt1377);
			@Pc(398) NativeHeapBuffer local398 = this.aClass134_Sub1_7.method6758(this.anInt1377 * 16, false);
			this.aStream1 = new Stream(local398);
			while (true) {
				@Pc(410) Buffer local410;
				do {
					local410 = this.anInterface20_1.method7387();
				} while (local410 == null);
				this.aStream2 = new Stream(local410);
				local123 = 0;
				local184 = 0;
				for (local300 = this.anInt1379; local300 <= this.anInt1371; local300++) {
					if (local300 >= 0 && arg1.anInt9210 > local300) {
						@Pc(442) int local442 = 0;
						for (@Pc(445) int local445 = this.anInt1378; local445 <= this.anInt1375; local445++) {
							if (local445 >= 0 && arg1.anInt9209 > local445) {
								@Pc(457) int local457 = arg3[local123];
								@Pc(464) int[] local464 = arg1.anIntArrayArrayArray8[local445][local300];
								if (local464 != null && local457 != 0) {
									if (local457 == 1) {
										@Pc(478) int[] local478 = arg1.anIntArrayArrayArray9[local445][local300];
										@Pc(485) int[] local485 = arg1.anIntArrayArrayArray11[local445][local300];
										@Pc(487) int local487 = 0;
										label119: while (true) {
											while (true) {
												if (local487 >= local464.length) {
													break label119;
												}
												if (local464[local487] == -1 || local464[local487 + 1] == -1 || local464[local487 + 2] == -1) {
													local487 += 3;
												} else {
													this.method1214(local485[local487], local300, local184, local442, local445, local478[local487]);
													local487++;
													this.method1214(local485[local487], local300, local184, local442, local445, local478[local487]);
													local487++;
													this.method1214(local485[local487], local300, local184, local442, local445, local478[local487]);
													local487++;
												}
											}
										}
									} else if (local457 == 3) {
										this.method1214(0, local300, local184, local442, local445, 0);
										this.method1214(0, local300, local184, local442, local445, arg1.anInt9208);
										this.method1214(arg1.anInt9208, local300, local184, local442, local445, 0);
									} else if (local457 == 2) {
										this.method1214(0, local300, local184, local442, local445, arg1.anInt9208);
										this.method1214(arg1.anInt9208, local300, local184, local442, local445, arg1.anInt9208);
										this.method1214(0, local300, local184, local442, local445, 0);
									} else if (local457 == 5) {
										this.method1214(arg1.anInt9208, local300, local184, local442, local445, arg1.anInt9208);
										this.method1214(arg1.anInt9208, local300, local184, local442, local445, 0);
										this.method1214(0, local300, local184, local442, local445, arg1.anInt9208);
									} else if (local457 == 4) {
										this.method1214(arg1.anInt9208, local300, local184, local442, local445, 0);
										this.method1214(0, local300, local184, local442, local445, 0);
										this.method1214(arg1.anInt9208, local300, local184, local442, local445, arg1.anInt9208);
									}
								}
							}
							local442++;
							local123++;
						}
					} else {
						local123 += this.anInt1375 - this.anInt1378;
					}
					local184++;
				}
				this.aStream2.a();
				if (this.anInterface20_1.method7389()) {
					this.aStream1.a();
					this.anInterface4_1 = this.aClass134_Sub1_7.method6805(false);
					this.anInterface4_1.method2467(this.anInt1372 * 16, 16, local398);
					break;
				}
				this.aStream1.b(0);
				this.aClass187_7.method3801();
			}
		} else {
			this.anInterface4_1 = null;
			this.anInterface20_1 = null;
		}
		this.aClass187_7 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aStream2 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BS)V")
	private void method1211(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream2.c(arg0);
		} else {
			this.aStream2.a(arg0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[[ZII)V")
	public void method1212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface20_1 == null || (arg1 + arg0 < this.anInt1378 || (arg0 - arg1 > this.anInt1375 || (arg3 + arg1 < this.anInt1379 || arg3 - arg1 > this.anInt1371)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt1379; local57 <= this.anInt1371; local57++) {
			for (@Pc(62) int local62 = this.anInt1378; local62 <= this.anInt1375; local62++) {
				@Pc(69) int local69 = local62 - arg0;
				@Pc(74) int local74 = local57 - arg3;
				if (-arg1 < local69 && arg1 > local69 && local74 > -arg1 && arg1 > local74 && arg2[arg1 + local69][local74 + arg1]) {
					this.aClass134_Sub1_7.method6843((byte) (this.aClass1_Sub18_1.method4099() * 255.0F));
					this.aClass134_Sub1_7.method6829(0, this.anInterface4_1);
					this.aClass134_Sub1_7.method6743(this.aClass134_Sub1_7.aClass284_15);
					this.aClass134_Sub1_7.method6765(Static470.aClass185_5, this.anInt1377 / 3, 0, this.anInterface20_1, this.anInt1372, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIB)V")
	private void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg4 << this.aClass47_Sub2_1.anInt9205);
		@Pc(24) int local24 = (arg1 << this.aClass47_Sub2_1.anInt9205) + arg0;
		@Pc(31) int local31 = this.aClass47_Sub2_1.method7550(local16, local24);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(60) Class1 local60 = this.aClass187_7.method3797(local7);
			if (local60 != null) {
				this.method1211(((Class1_Sub24) local60).aShort48);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt1372++;
		if (local7 != -1L) {
			this.aClass187_7.method3795(new Class1_Sub24(local78), local7);
		}
		@Pc(116) float local116;
		@Pc(125) float local125;
		@Pc(134) float local134;
		@Pc(165) float local165;
		@Pc(173) float local173;
		@Pc(180) float local180;
		@Pc(187) float local187;
		@Pc(194) float local194;
		@Pc(203) float local203;
		@Pc(212) float local212;
		@Pc(270) float local270;
		if (arg5 == 0 && arg0 == 0) {
			local116 = this.aFloatArrayArray1[arg3][arg2];
			local125 = this.aFloatArrayArray2[arg3][arg2];
			local134 = this.aFloatArrayArray3[arg3][arg2];
		} else if (this.aClass47_Sub2_1.anInt9208 == arg5 && arg0 == 0) {
			local116 = this.aFloatArrayArray1[arg3 + 1][arg2];
			local125 = this.aFloatArrayArray2[arg3 + 1][arg2];
			local134 = this.aFloatArrayArray3[arg3 + 1][arg2];
		} else if (this.aClass47_Sub2_1.anInt9208 == arg5 && arg0 == this.aClass47_Sub2_1.anInt9208) {
			local134 = this.aFloatArrayArray3[arg3 + 1][arg2 + 1];
			local116 = this.aFloatArrayArray1[arg3 + 1][arg2 + 1];
			local125 = this.aFloatArrayArray2[arg3 + 1][arg2 + 1];
		} else if (arg5 == 0 && arg0 == this.aClass47_Sub2_1.anInt9208) {
			local125 = this.aFloatArrayArray2[arg3][arg2 + 1];
			local134 = this.aFloatArrayArray3[arg3][arg2 + 1];
			local116 = this.aFloatArrayArray1[arg3][arg2 + 1];
		} else {
			local165 = (float) arg5 / (float) this.aClass47_Sub2_1.anInt9208;
			local173 = (float) arg0 / (float) this.aClass47_Sub2_1.anInt9208;
			local180 = this.aFloatArrayArray1[arg3][arg2];
			local187 = this.aFloatArrayArray2[arg3][arg2];
			local194 = this.aFloatArrayArray3[arg3][arg2];
			local203 = this.aFloatArrayArray1[arg3 + 1][arg2];
			local212 = this.aFloatArrayArray2[arg3 + 1][arg2];
			@Pc(227) float local227 = local194 + (this.aFloatArrayArray3[arg3][arg2 + 1] - local194) * local165;
			@Pc(243) float local243 = local187 + (this.aFloatArrayArray2[arg3][arg2 + 1] - local187) * local165;
			@Pc(261) float local261 = local203 + local165 * (this.aFloatArrayArray1[arg3 + 1][arg2 + 1] - local203);
			local270 = this.aFloatArrayArray3[arg3 + 1][arg2];
			@Pc(285) float local285 = local180 + local165 * (this.aFloatArrayArray1[arg3][arg2 + 1] - local180);
			@Pc(302) float local302 = local212 + (this.aFloatArrayArray2[arg3 + 1][arg2 + 1] - local212) * local165;
			@Pc(319) float local319 = local270 + (this.aFloatArrayArray3[arg3 + 1][arg2 + 1] - local270) * local165;
			local116 = local173 * (local261 - local285) + local285;
			local125 = local173 * (local302 - local243) + local243;
			local134 = (local319 - local227) * local173 + local227;
		}
		local165 = this.aClass1_Sub18_1.method4107() - local16;
		local173 = this.aClass1_Sub18_1.method4101() - local31;
		local180 = this.aClass1_Sub18_1.method4098() - local24;
		local187 = (float) Math.sqrt((double) (local180 * local180 + local165 * local165 + local173 * local173));
		local194 = 1.0F / local187;
		local165 *= local194;
		local180 *= local194;
		local173 *= local194;
		local203 = local187 / (float) this.aClass1_Sub18_1.method4104();
		local212 = 1.0F - local203 * local203;
		if (local212 < 0.0F) {
			local212 = 0.0F;
		}
		local270 = local134 * local180 + local116 * local165 + local173 * local125;
		if (local270 < 0.0F) {
			local270 = 0.0F;
		}
		@Pc(541) float local541 = local212 * local270 * 2.0F;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass1_Sub18_1.method4102();
		@Pc(562) int local562 = (int) ((float) (local552 >> 16 & 0xFF) * local541);
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(579) int local579 = (int) ((float) (local552 >> 8 & 0xFF) * local541);
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(592) int local592 = (int) (local541 * (float) (local552 & 0xFF));
		if (local592 > 255) {
			local592 = 255;
		}
		if (Stream.c()) {
			this.aStream1.a((float) local16);
			this.aStream1.a((float) local31);
			this.aStream1.a((float) local24);
		} else {
			this.aStream1.b((float) local16);
			this.aStream1.b((float) local31);
			this.aStream1.b((float) local24);
		}
		if (this.aClass134_Sub1_7.anInt8438 == 0) {
			this.aStream1.f(local592);
			this.aStream1.f(local579);
			this.aStream1.f(local562);
		} else {
			this.aStream1.f(local562);
			this.aStream1.f(local579);
			this.aStream1.f(local592);
		}
		this.aStream1.f(255);
		this.method1211(local78);
	}
}
