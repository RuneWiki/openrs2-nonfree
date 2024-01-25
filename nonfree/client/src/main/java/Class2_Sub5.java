import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ama")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ama", name = "p", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!ama", name = "F", descriptor = "Lclient!bba;")
	private final Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!ama", name = "H", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_1;

	@OriginalMember(owner = "client!ama", name = "E", descriptor = "Lclient!rj;")
	private final Class133_Sub3 aClass133_Sub3_1;

	@OriginalMember(owner = "client!ama", name = "r", descriptor = "I")
	private final int anInt295;

	@OriginalMember(owner = "client!ama", name = "D", descriptor = "I")
	private final int anInt292;

	@OriginalMember(owner = "client!ama", name = "I", descriptor = "I")
	private final int anInt302;

	@OriginalMember(owner = "client!ama", name = "y", descriptor = "I")
	private final int anInt296;

	@OriginalMember(owner = "client!ama", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ama", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ama", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ama", name = "s", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!ama", name = "C", descriptor = "Lclient!lg;")
	private final Interface15 anInterface15_1;

	@OriginalMember(owner = "client!ama", name = "K", descriptor = "Lclient!uh;")
	private final Interface24 anInterface24_1;

	@OriginalMember(owner = "client!ama", name = "u", descriptor = "Lclient!lba;")
	private Class218 aClass218_3;

	@OriginalMember(owner = "client!ama", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!ama", name = "A", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(Lclient!lb;Lclient!rj;Lclient!bba;[I)V")
	public Class2_Sub5(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class133_Sub3 arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub7_1 = arg2;
		this.aClass145_Sub1_1 = arg0;
		this.aClass133_Sub3_1 = arg1;
		@Pc(23) int local23 = this.aClass2_Sub7_1.method8173() - (arg1.anInt9321 >> 1);
		this.anInt295 = this.aClass2_Sub7_1.method8171() - local23 >> arg1.anInt9317;
		this.anInt292 = this.aClass2_Sub7_1.method8171() + local23 >> arg1.anInt9317;
		this.anInt302 = this.aClass2_Sub7_1.method8172() - local23 >> arg1.anInt9317;
		this.anInt296 = local23 + this.aClass2_Sub7_1.method8172() >> arg1.anInt9317;
		@Pc(79) int local79 = this.anInt292 + 1 - this.anInt295;
		@Pc(88) int local88 = this.anInt296 + 1 - this.anInt302;
		this.aFloatArrayArray2 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray1 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray3 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(174) int local174;
		@Pc(190) int local190;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = local117 + this.anInt302;
			if (local124 > 0 && local124 < this.aClass133_Sub3_1.anInt9315 - 1) {
				for (local140 = 0; local140 <= local79; local140++) {
					local147 = this.anInt295 + local140;
					if (local147 > 0 && this.aClass133_Sub3_1.anInt9318 - 1 > local147) {
						local174 = arg1.method8217(local147 + 1, local124) - arg1.method8217(local147 - 1, local124);
						local190 = arg1.method8217(local147, local124 + 1) - arg1.method8217(local147, local124 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local190 * local190 + 65536)));
						this.aFloatArrayArray3[local140][local117] = (float) local174 * local206;
						this.aFloatArrayArray2[local140][local117] = -256.0F * local206;
						this.aFloatArrayArray1[local140][local117] = local206 * (float) local190;
					}
				}
			}
		}
		local124 = 0;
		@Pc(327) int local327;
		for (local140 = this.anInt302; local140 <= this.anInt296; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt9315) {
				for (local147 = this.anInt295; local147 <= this.anInt292; local147++) {
					if (local147 >= 0 && local147 < arg1.anInt9318) {
						local174 = arg3[local124];
						@Pc(302) int[] local302 = arg1.anIntArrayArrayArray21[local147][local140];
						if (local302 != null && local174 != 0) {
							if (local174 == 1) {
								local327 = 0;
								while (local327 < local302.length) {
									if (local302[local327++] != -1 && local302[local327++] != -1 && local302[local327++] != -1) {
										this.anInt297 += 3;
									}
								}
							} else {
								this.anInt297 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt292 - this.anInt295;
			}
		}
		if (this.anInt297 <= 0) {
			this.anInterface15_1 = null;
			this.anInterface24_1 = null;
		} else {
			this.aClass218_3 = new Class218(Static330.method4577(this.anInt297));
			this.anInterface15_1 = this.aClass145_Sub1_1.method9776(false);
			this.anInterface15_1.method9224(this.anInt297);
			@Pc(453) NativeHeapBuffer local453 = this.aClass145_Sub1_1.method9733(this.anInt297 * 16, false);
			this.aStream1 = new Stream(local453);
			while (true) {
				@Pc(465) Buffer local465;
				do {
					local465 = this.anInterface15_1.method4689();
				} while (local465 == null);
				this.aStream2 = new Stream(local465);
				local190 = 0;
				local124 = 0;
				for (local327 = this.anInt302; local327 <= this.anInt296; local327++) {
					if (local327 >= 0 && local327 < arg1.anInt9315) {
						@Pc(508) int local508 = 0;
						for (@Pc(511) int local511 = this.anInt295; local511 <= this.anInt292; local511++) {
							if (local511 >= 0 && arg1.anInt9318 > local511) {
								@Pc(527) int local527 = arg3[local124];
								@Pc(534) int[] local534 = arg1.anIntArrayArrayArray21[local511][local327];
								if (local534 != null && local527 != 0) {
									if (local527 == 1) {
										@Pc(555) int[] local555 = arg1.anIntArrayArrayArray23[local511][local327];
										@Pc(562) int[] local562 = arg1.anIntArrayArrayArray24[local511][local327];
										@Pc(564) int local564 = 0;
										label119: while (true) {
											while (true) {
												if (local564 >= local534.length) {
													break label119;
												}
												if (local534[local564] == -1 || local534[local564 + 1] == -1 || local534[local564 + 2] == -1) {
													local564 += 3;
												} else {
													this.method306(local511, local555[local564], local562[local564], local327, local190, local508);
													local564++;
													this.method306(local511, local555[local564], local562[local564], local327, local190, local508);
													local564++;
													this.method306(local511, local555[local564], local562[local564], local327, local190, local508);
													local564++;
												}
											}
										}
									} else if (local527 == 3) {
										this.method306(local511, 0, 0, local327, local190, local508);
										this.method306(local511, arg1.anInt9321, 0, local327, local190, local508);
										this.method306(local511, 0, arg1.anInt9321, local327, local190, local508);
									} else if (local527 == 2) {
										this.method306(local511, arg1.anInt9321, 0, local327, local190, local508);
										this.method306(local511, arg1.anInt9321, arg1.anInt9321, local327, local190, local508);
										this.method306(local511, 0, 0, local327, local190, local508);
									} else if (local527 == 5) {
										this.method306(local511, arg1.anInt9321, arg1.anInt9321, local327, local190, local508);
										this.method306(local511, 0, arg1.anInt9321, local327, local190, local508);
										this.method306(local511, arg1.anInt9321, 0, local327, local190, local508);
									} else if (local527 == 4) {
										this.method306(local511, 0, arg1.anInt9321, local327, local190, local508);
										this.method306(local511, 0, 0, local327, local190, local508);
										this.method306(local511, arg1.anInt9321, arg1.anInt9321, local327, local190, local508);
									}
								}
							}
							local508++;
							local124++;
						}
					} else {
						local124 += this.anInt292 - this.anInt295;
					}
					local190++;
				}
				this.aStream2.a();
				if (this.anInterface15_1.method4691()) {
					this.aStream1.a();
					this.anInterface24_1 = this.aClass145_Sub1_1.method9825(false);
					this.anInterface24_1.method9229(16, local453, this.anInt301 * 16);
					break;
				}
				this.aStream1.a(0);
				this.aClass218_3.method5097();
			}
		}
		this.aStream2 = null;
		this.aStream1 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
		this.aClass218_3 = null;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(BS)V")
	private void method303(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream2.d(arg0);
		} else {
			this.aStream2.b(arg0);
		}
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(IZ[[ZII)V")
	public void method304(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface15_1 == null || (this.anInt295 > arg2 + arg3 || (arg2 - arg3 > this.anInt292 || (this.anInt302 > arg0 + arg3 || this.anInt296 < arg0 - arg3)))) {
			return;
		}
		for (@Pc(65) int local65 = this.anInt302; local65 <= this.anInt296; local65++) {
			for (@Pc(70) int local70 = this.anInt295; local70 <= this.anInt292; local70++) {
				@Pc(77) int local77 = local70 - arg2;
				@Pc(81) int local81 = local65 - arg0;
				if (local77 > -arg3 && arg3 > local77 && local81 > -arg3 && local81 < arg3 && arg1[local77 + arg3][arg3 + local81]) {
					this.aClass145_Sub1_1.method9747((byte) (int) (this.aClass2_Sub7_1.method8169() * 255.0F));
					this.aClass145_Sub1_1.method9800(0, this.anInterface24_1);
					this.aClass145_Sub1_1.method9766(this.aClass145_Sub1_1.aClass277_19);
					this.aClass145_Sub1_1.method9778(0, Static601.aClass317_8, this.anInt297 / 3, 0, this.anInt301, this.anInterface15_1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(IIIBIII)V")
	private void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg0 << this.aClass133_Sub3_1.anInt9317);
		@Pc(24) int local24 = arg2 + (arg3 << this.aClass133_Sub3_1.anInt9317);
		@Pc(31) int local31 = this.aClass133_Sub3_1.method8214(local16, local24);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(61) Class2 local61 = this.aClass218_3.method5095(local7, 0);
			if (local61 != null) {
				this.method303(((Class2_Sub16) local61).aShort38);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt301++;
		if (local7 != -1L) {
			this.aClass218_3.method5099(new Class2_Sub16(local80), local7);
		}
		@Pc(125) float local125;
		@Pc(111) float local111;
		@Pc(118) float local118;
		@Pc(229) float local229;
		@Pc(237) float local237;
		@Pc(244) float local244;
		@Pc(251) float local251;
		@Pc(258) float local258;
		@Pc(267) float local267;
		@Pc(276) float local276;
		@Pc(285) float local285;
		if (arg1 == 0 && arg2 == 0) {
			local111 = this.aFloatArrayArray2[arg5][arg4];
			local118 = this.aFloatArrayArray1[arg5][arg4];
			local125 = this.aFloatArrayArray3[arg5][arg4];
		} else if (arg1 == this.aClass133_Sub3_1.anInt9321 && arg2 == 0) {
			local111 = this.aFloatArrayArray2[arg5 + 1][arg4];
			local125 = this.aFloatArrayArray3[arg5 + 1][arg4];
			local118 = this.aFloatArrayArray1[arg5 + 1][arg4];
		} else if (arg1 == this.aClass133_Sub3_1.anInt9321 && this.aClass133_Sub3_1.anInt9321 == arg2) {
			local125 = this.aFloatArrayArray3[arg5 + 1][arg4 + 1];
			local118 = this.aFloatArrayArray1[arg5 + 1][arg4 + 1];
			local111 = this.aFloatArrayArray2[arg5 + 1][arg4 + 1];
		} else if (arg1 == 0 && this.aClass133_Sub3_1.anInt9321 == arg2) {
			local111 = this.aFloatArrayArray2[arg5][arg4 + 1];
			local125 = this.aFloatArrayArray3[arg5][arg4 + 1];
			local118 = this.aFloatArrayArray1[arg5][arg4 + 1];
		} else {
			local229 = (float) arg1 / (float) this.aClass133_Sub3_1.anInt9321;
			local237 = (float) arg2 / (float) this.aClass133_Sub3_1.anInt9321;
			local244 = this.aFloatArrayArray3[arg5][arg4];
			local251 = this.aFloatArrayArray2[arg5][arg4];
			local258 = this.aFloatArrayArray1[arg5][arg4];
			local267 = this.aFloatArrayArray3[arg5 + 1][arg4];
			local276 = this.aFloatArrayArray2[arg5 + 1][arg4];
			local285 = this.aFloatArrayArray1[arg5 + 1][arg4];
			@Pc(301) float local301 = local251 + (this.aFloatArrayArray2[arg5][arg4 + 1] - local251) * local229;
			@Pc(318) float local318 = local267 + (this.aFloatArrayArray3[arg5 + 1][arg4 + 1] - local267) * local229;
			@Pc(334) float local334 = local244 + local229 * (this.aFloatArrayArray3[arg5][arg4 + 1] - local244);
			@Pc(351) float local351 = local276 + (this.aFloatArrayArray2[arg5 + 1][arg4 + 1] - local276) * local229;
			@Pc(367) float local367 = local258 + (this.aFloatArrayArray1[arg5][arg4 + 1] - local258) * local229;
			local111 = (local351 - local301) * local237 + local301;
			local125 = local334 + (local318 - local334) * local237;
			@Pc(400) float local400 = local285 + (this.aFloatArrayArray1[arg5 + 1][arg4 + 1] - local285) * local229;
			local118 = (local400 - local367) * local237 + local367;
		}
		local229 = (float) (this.aClass2_Sub7_1.method8171() - local16);
		local237 = (float) (this.aClass2_Sub7_1.method8174() - local31);
		local244 = (float) (this.aClass2_Sub7_1.method8172() - local24);
		local251 = (float) Math.sqrt((double) (local244 * local244 + local229 * local229 + local237 * local237));
		local258 = 1.0F / local251;
		local237 *= local258;
		local229 *= local258;
		local244 *= local258;
		local267 = local251 / (float) this.aClass2_Sub7_1.method8173();
		local276 = 1.0F - local267 * local267;
		if (local276 < 0.0F) {
			local276 = 0.0F;
		}
		local285 = local244 * local118 + local111 * local237 + local125 * local229;
		if (local285 < 0.0F) {
			local285 = 0.0F;
		}
		@Pc(552) float local552 = local285 * local276 * 2.0F;
		if (local552 > 1.0F) {
			local552 = 1.0F;
		}
		@Pc(563) int local563 = this.aClass2_Sub7_1.method8170();
		@Pc(573) int local573 = (int) ((float) (local563 >> 16 & 0xFF) * local552);
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) (local552 * (float) (local563 >> 8 & 0xFF));
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(603) int local603 = (int) (local552 * (float) (local563 & 0xFF));
		if (Stream.b()) {
			this.aStream1.b((float) local16);
			this.aStream1.b((float) local31);
			this.aStream1.b((float) local24);
		} else {
			this.aStream1.a((float) local16);
			this.aStream1.a((float) local31);
			this.aStream1.a((float) local24);
		}
		if (local603 > 255) {
			local603 = 255;
		}
		if (this.aClass145_Sub1_1.anInt11268 == 0) {
			this.aStream1.c(local603);
			this.aStream1.c(local588);
			this.aStream1.c(local573);
		} else {
			this.aStream1.c(local573);
			this.aStream1.c(local588);
			this.aStream1.c(local603);
		}
		this.aStream1.c(255);
		this.method303(local80);
	}
}
