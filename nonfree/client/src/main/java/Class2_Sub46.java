import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
	private int anInt9368;

	@OriginalMember(owner = "client!sea", name = "v", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_21;

	@OriginalMember(owner = "client!sea", name = "I", descriptor = "Lclient!qm;")
	private final Class65_Sub3 aClass65_Sub3_3;

	@OriginalMember(owner = "client!sea", name = "s", descriptor = "Lclient!ab;")
	private final Class2_Sub1 aClass2_Sub1_3;

	@OriginalMember(owner = "client!sea", name = "M", descriptor = "I")
	private final int anInt9372;

	@OriginalMember(owner = "client!sea", name = "F", descriptor = "I")
	private final int anInt9370;

	@OriginalMember(owner = "client!sea", name = "C", descriptor = "I")
	private final int anInt9369;

	@OriginalMember(owner = "client!sea", name = "y", descriptor = "I")
	private final int anInt9366;

	@OriginalMember(owner = "client!sea", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!sea", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!sea", name = "H", descriptor = "I")
	private int anInt9371;

	@OriginalMember(owner = "client!sea", name = "z", descriptor = "Lclient!eq;")
	private Class99 aClass99_70;

	@OriginalMember(owner = "client!sea", name = "q", descriptor = "Lclient!uq;")
	private final Interface24 anInterface24_7;

	@OriginalMember(owner = "client!sea", name = "L", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!sea", name = "K", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!sea", name = "J", descriptor = "Lclient!tc;")
	private final Interface22 anInterface22_16;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!wga;Lclient!qm;Lclient!ab;[I)V")
	public Class2_Sub46(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class65_Sub3 arg1, @OriginalArg(2) Class2_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass20_Sub2_21 = arg0;
		this.aClass65_Sub3_3 = arg1;
		this.aClass2_Sub1_3 = arg2;
		@Pc(23) int local23 = this.aClass2_Sub1_3.method3968() - (arg1.anInt9620 >> 1);
		this.anInt9372 = this.aClass2_Sub1_3.method3969() - local23 >> arg1.anInt9616;
		this.anInt9370 = this.aClass2_Sub1_3.method3969() + local23 >> arg1.anInt9616;
		this.anInt9369 = this.aClass2_Sub1_3.method3962() - local23 >> arg1.anInt9616;
		this.anInt9366 = this.aClass2_Sub1_3.method3962() + local23 >> arg1.anInt9616;
		@Pc(77) int local77 = this.anInt9370 + 1 - this.anInt9372;
		@Pc(86) int local86 = this.anInt9366 + 1 - this.anInt9369;
		this.aFloatArrayArray17 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray18 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray16 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt9369 + local115;
			if (local122 > 0 && local122 < this.aClass65_Sub3_3.anInt9618 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = this.anInt9372 + local137;
					if (local144 > 0 && local144 < this.aClass65_Sub3_3.anInt9615 - 1) {
						local172 = arg1.method7995(local122, local144 + 1) - arg1.method7995(local122, local144 - 1);
						local189 = arg1.method7995(local122 + 1, local144) - arg1.method7995(local122 - 1, local144);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local172 * local172 + 65536)));
						this.aFloatArrayArray17[local137][local115] = (float) local172 * local204;
						this.aFloatArrayArray18[local137][local115] = -256.0F * local204;
						this.aFloatArrayArray16[local137][local115] = (float) local189 * local204;
					}
				}
			}
		}
		local122 = 0;
		@Pc(299) int local299;
		for (local137 = this.anInt9369; local137 <= this.anInt9366; local137++) {
			if (local137 >= 0 && arg1.anInt9618 > local137) {
				for (local144 = this.anInt9372; local144 <= this.anInt9370; local144++) {
					if (local144 >= 0 && arg1.anInt9615 > local144) {
						local172 = arg3[local122];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray13[local144][local137];
						if (local290 != null && local172 != 0) {
							if (local172 == 1) {
								local299 = 0;
								while (local290.length > local299) {
									if (local290[local299++] != -1 && local290[local299++] != -1 && local290[local299++] != -1) {
										this.anInt9371 += 3;
									}
								}
							} else {
								this.anInt9371 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt9370 - this.anInt9372;
			}
		}
		if (this.anInt9371 > 0) {
			this.aClass99_70 = new Class99(Static231.method4407(this.anInt9371));
			this.anInterface24_7 = this.aClass20_Sub2_21.method1474(false);
			this.anInterface24_7.method6476(this.anInt9371);
			@Pc(403) NativeHeapBuffer local403 = this.aClass20_Sub2_21.method1503(false, this.anInt9371 * 16);
			this.aStream7 = new Stream(local403);
			while (true) {
				@Pc(415) Buffer local415;
				do {
					local415 = this.anInterface24_7.method6477();
				} while (local415 == null);
				this.aStream6 = new Stream(local415);
				local122 = 0;
				local189 = 0;
				for (local299 = this.anInt9369; local299 <= this.anInt9366; local299++) {
					if (local299 >= 0 && arg1.anInt9618 > local299) {
						@Pc(444) int local444 = 0;
						for (@Pc(447) int local447 = this.anInt9372; local447 <= this.anInt9370; local447++) {
							if (local447 >= 0 && arg1.anInt9615 > local447) {
								@Pc(466) int local466 = arg3[local122];
								@Pc(473) int[] local473 = arg1.anIntArrayArrayArray13[local447][local299];
								if (local473 != null && local466 != 0) {
									if (local466 == 1) {
										@Pc(631) int[] local631 = arg1.anIntArrayArrayArray17[local447][local299];
										@Pc(638) int[] local638 = arg1.anIntArrayArrayArray15[local447][local299];
										@Pc(640) int local640 = 0;
										label119: while (true) {
											while (true) {
												if (local640 >= local473.length) {
													break label119;
												}
												if (local473[local640] == -1 || local473[local640 + 1] == -1 || local473[local640 + 2] == -1) {
													local640 += 3;
												} else {
													this.method7830(local189, local447, local638[local640], local299, local631[local640], local444);
													local640++;
													this.method7830(local189, local447, local638[local640], local299, local631[local640], local444);
													local640++;
													this.method7830(local189, local447, local638[local640], local299, local631[local640], local444);
													local640++;
												}
											}
										}
									} else if (local466 == 3) {
										this.method7830(local189, local447, 0, local299, 0, local444);
										this.method7830(local189, local447, 0, local299, arg1.anInt9620, local444);
										this.method7830(local189, local447, arg1.anInt9620, local299, 0, local444);
									} else if (local466 == 2) {
										this.method7830(local189, local447, 0, local299, arg1.anInt9620, local444);
										this.method7830(local189, local447, arg1.anInt9620, local299, arg1.anInt9620, local444);
										this.method7830(local189, local447, 0, local299, 0, local444);
									} else if (local466 == 5) {
										this.method7830(local189, local447, arg1.anInt9620, local299, arg1.anInt9620, local444);
										this.method7830(local189, local447, arg1.anInt9620, local299, 0, local444);
										this.method7830(local189, local447, 0, local299, arg1.anInt9620, local444);
									} else if (local466 == 4) {
										this.method7830(local189, local447, arg1.anInt9620, local299, 0, local444);
										this.method7830(local189, local447, 0, local299, 0, local444);
										this.method7830(local189, local447, arg1.anInt9620, local299, arg1.anInt9620, local444);
									}
								}
							}
							local122++;
							local444++;
						}
					} else {
						local122 += this.anInt9370 - this.anInt9372;
					}
					local189++;
				}
				this.aStream6.a();
				if (this.anInterface24_7.method6474()) {
					this.aStream7.a();
					this.anInterface22_16 = this.aClass20_Sub2_21.method1523(false);
					this.anInterface22_16.method761(local403, 16, this.anInt9368 * 16);
					break;
				}
				this.aStream7.e(0);
				this.aClass99_70.method3057();
			}
		} else {
			this.anInterface22_16 = null;
			this.anInterface24_7 = null;
		}
		this.aFloatArrayArray17 = this.aFloatArrayArray18 = this.aFloatArrayArray16 = null;
		this.aStream7 = null;
		this.aStream6 = null;
		this.aClass99_70 = null;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[[ZZI)V")
	public void method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface24_7 == null || (this.anInt9372 > arg1 + arg3 || (arg3 - arg1 > this.anInt9370 || (arg0 + arg1 < this.anInt9369 || arg0 - arg1 > this.anInt9366)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt9369; local57 <= this.anInt9366; local57++) {
			for (@Pc(62) int local62 = this.anInt9372; local62 <= this.anInt9370; local62++) {
				@Pc(69) int local69 = local62 - arg3;
				@Pc(74) int local74 = local57 - arg0;
				if (local69 > -arg1 && local69 < arg1 && local74 > -arg1 && arg1 > local74 && arg2[local69 + arg1][arg1 + local74]) {
					this.aClass20_Sub2_21.method1543((byte) (this.aClass2_Sub1_3.method3966() * 255.0F));
					this.aClass20_Sub2_21.method1559(this.anInterface22_16, 0);
					this.aClass20_Sub2_21.method1496(this.aClass20_Sub2_21.aClass22_18);
					this.aClass20_Sub2_21.method1572(Static539.aClass134_6, this.anInt9371 / 3, this.anInterface24_7, 0, 0, this.anInt9368);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIIII)V")
	private void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg4 + (arg1 << this.aClass65_Sub3_3.anInt9616);
		@Pc(24) int local24 = arg2 + (arg3 << this.aClass65_Sub3_3.anInt9616);
		@Pc(31) int local31 = this.aClass65_Sub3_3.method7999(local15, local24);
		if ((arg4 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(65) Class2 local65 = this.aClass99_70.method3056(local7);
			if (local65 != null) {
				this.method7831(((Class2_Sub39) local65).aShort87);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt9368++;
		if (local7 != -1L) {
			this.aClass99_70.method3059(local7, new Class2_Sub39(local83));
		}
		@Pc(116) float local116;
		@Pc(109) float local109;
		@Pc(123) float local123;
		@Pc(197) float local197;
		@Pc(205) float local205;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(226) float local226;
		@Pc(235) float local235;
		@Pc(244) float local244;
		@Pc(301) float local301;
		if (arg4 == 0 && arg2 == 0) {
			local109 = this.aFloatArrayArray18[arg5][arg0];
			local116 = this.aFloatArrayArray17[arg5][arg0];
			local123 = this.aFloatArrayArray16[arg5][arg0];
		} else if (arg4 == this.aClass65_Sub3_3.anInt9620 && arg2 == 0) {
			local109 = this.aFloatArrayArray18[arg5 + 1][arg0];
			local123 = this.aFloatArrayArray16[arg5 + 1][arg0];
			local116 = this.aFloatArrayArray17[arg5 + 1][arg0];
		} else if (this.aClass65_Sub3_3.anInt9620 == arg4 && this.aClass65_Sub3_3.anInt9620 == arg2) {
			local116 = this.aFloatArrayArray17[arg5 + 1][arg0 + 1];
			local123 = this.aFloatArrayArray16[arg5 + 1][arg0 + 1];
			local109 = this.aFloatArrayArray18[arg5 + 1][arg0 + 1];
		} else if (arg4 == 0 && arg2 == this.aClass65_Sub3_3.anInt9620) {
			local123 = this.aFloatArrayArray16[arg5][arg0 + 1];
			local109 = this.aFloatArrayArray18[arg5][arg0 + 1];
			local116 = this.aFloatArrayArray17[arg5][arg0 + 1];
		} else {
			local197 = (float) arg4 / (float) this.aClass65_Sub3_3.anInt9620;
			local205 = (float) arg2 / (float) this.aClass65_Sub3_3.anInt9620;
			local212 = this.aFloatArrayArray17[arg5][arg0];
			local219 = this.aFloatArrayArray18[arg5][arg0];
			local226 = this.aFloatArrayArray16[arg5][arg0];
			local235 = this.aFloatArrayArray17[arg5 + 1][arg0];
			local244 = this.aFloatArrayArray18[arg5 + 1][arg0];
			@Pc(259) float local259 = local226 + local197 * (this.aFloatArrayArray16[arg5][arg0 + 1] - local226);
			@Pc(274) float local274 = local219 + (this.aFloatArrayArray18[arg5][arg0 + 1] - local219) * local197;
			@Pc(292) float local292 = local244 + local197 * (this.aFloatArrayArray18[arg5 + 1][arg0 + 1] - local244);
			local301 = this.aFloatArrayArray16[arg5 + 1][arg0];
			@Pc(316) float local316 = local212 + (this.aFloatArrayArray17[arg5][arg0 + 1] - local212) * local197;
			@Pc(333) float local333 = local235 + local197 * (this.aFloatArrayArray17[arg5 + 1][arg0 + 1] - local235);
			local116 = local316 + (local333 - local316) * local205;
			local109 = (local292 - local274) * local205 + local274;
			@Pc(366) float local366 = local301 + local197 * (this.aFloatArrayArray16[arg5 + 1][arg0 + 1] - local301);
			local123 = local259 + (local366 - local259) * local205;
		}
		local197 = this.aClass2_Sub1_3.method3969() - local15;
		local205 = this.aClass2_Sub1_3.method3967() - local31;
		local212 = this.aClass2_Sub1_3.method3962() - local24;
		local219 = (float) Math.sqrt((double) (local212 * local212 + local197 * local197 + local205 * local205));
		local226 = 1.0F / local219;
		local197 *= local226;
		local205 *= local226;
		local212 *= local226;
		local235 = local219 / (float) this.aClass2_Sub1_3.method3968();
		local244 = 1.0F - local235 * local235;
		if (local244 < 0.0F) {
			local244 = 0.0F;
		}
		local301 = local212 * local123 + local197 * local116 + local109 * local205;
		if (local301 < 0.0F) {
			local301 = 0.0F;
		}
		@Pc(545) float local545 = local244 * local301 * 2.0F;
		if (local545 > 1.0F) {
			local545 = 1.0F;
		}
		@Pc(556) int local556 = this.aClass2_Sub1_3.method3965();
		@Pc(566) int local566 = (int) (local545 * (float) (local556 >> 16 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		@Pc(583) int local583 = (int) (local545 * (float) (local556 >> 8 & 0xFF));
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(596) int local596 = (int) ((float) (local556 & 0xFF) * local545);
		if (local596 > 255) {
			local596 = 255;
		}
		if (Stream.c()) {
			this.aStream7.a((float) local15);
			this.aStream7.a((float) local31);
			this.aStream7.a((float) local24);
		} else {
			this.aStream7.b((float) local15);
			this.aStream7.b((float) local31);
			this.aStream7.b((float) local24);
		}
		if (this.aClass20_Sub2_21.anInt1576 == 0) {
			this.aStream7.f(local596);
			this.aStream7.f(local583);
			this.aStream7.f(local566);
		} else {
			this.aStream7.f(local566);
			this.aStream7.f(local583);
			this.aStream7.f(local596);
		}
		this.aStream7.f(255);
		this.method7831(local83);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(SB)V")
	private void method7831(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream6.d(arg0);
		} else {
			this.aStream6.a(arg0);
		}
	}
}
