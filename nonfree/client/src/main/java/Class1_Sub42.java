import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!op", name = "E", descriptor = "I")
	private int anInt6457;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!ml;")
	private final Class7_Sub3 aClass7_Sub3_1;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "Lclient!cba;")
	private final Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_12;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	private final int anInt6452;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "I")
	private final int anInt6456;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	private final int anInt6450;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	private final int anInt6455;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!op", name = "H", descriptor = "Lclient!pt;")
	private Class230 aClass230_37;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "Lclient!iaa;")
	private final Interface9 anInterface9_7;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "Lclient!rq;")
	private final Interface16 anInterface16_10;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!bda;Lclient!ml;Lclient!cba;[I)V")
	public Class1_Sub42(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class7_Sub3 arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass7_Sub3_1 = arg1;
		this.aClass1_Sub5_3 = arg2;
		this.aClass4_Sub2_12 = arg0;
		@Pc(23) int local23 = this.aClass1_Sub5_3.method4311() - (arg1.anInt9576 >> 1);
		this.anInt6452 = this.aClass1_Sub5_3.method4306() - local23 >> arg1.anInt9573;
		this.anInt6456 = this.aClass1_Sub5_3.method4306() + local23 >> arg1.anInt9573;
		this.anInt6450 = this.aClass1_Sub5_3.method4314() - local23 >> arg1.anInt9573;
		this.anInt6455 = local23 + this.aClass1_Sub5_3.method4314() >> arg1.anInt9573;
		@Pc(78) int local78 = this.anInt6456 + 1 - this.anInt6452;
		@Pc(87) int local87 = this.anInt6455 + 1 - this.anInt6450;
		this.aFloatArrayArray13 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray12 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray14 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(141) int local141;
		@Pc(168) int local168;
		@Pc(182) int local182;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt6450 + local116;
			if (local123 > 0 && this.aClass7_Sub3_1.anInt9575 - 1 > local123) {
				for (local134 = 0; local134 <= local78; local134++) {
					local141 = local134 + this.anInt6452;
					if (local141 > 0 && local141 < this.aClass7_Sub3_1.anInt9577 - 1) {
						local168 = arg1.ba(local141 + 1, local123) - arg1.ba(local141 - 1, local123);
						local182 = arg1.ba(local141, local123 + 1) - arg1.ba(local141, local123 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local182 * local182 + 65536)));
						this.aFloatArrayArray12[local134][local116] = local198 * (float) local168;
						this.aFloatArrayArray14[local134][local116] = -256.0F * local198;
						this.aFloatArrayArray13[local134][local116] = local198 * (float) local182;
					}
				}
			}
		}
		local123 = 0;
		for (local134 = this.anInt6450; local134 <= this.anInt6455; local134++) {
			if (local134 >= 0 && local134 < arg1.anInt9575) {
				for (local141 = this.anInt6452; local141 <= this.anInt6456; local141++) {
					if (local141 >= 0 && local141 < arg1.anInt9577) {
						local168 = arg3[local123];
						@Pc(293) int[] local293 = arg1.anIntArrayArrayArray14[local141][local134];
						if (local293 != null && local168 != 0) {
							this.anInt6453 += local168 == 1 ? local293.length : 3;
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt6456 - this.anInt6452;
			}
		}
		if (this.anInt6453 > 0) {
			this.aClass230_37 = new Class230(Static184.method3549(this.anInt6453));
			this.anInterface9_7 = this.aClass4_Sub2_12.method7227(false);
			this.anInterface9_7.method7607(this.anInt6453);
			@Pc(361) NativeHeapBuffer local361 = this.aClass4_Sub2_12.method7297(false, this.anInt6453 * 16);
			this.aStream4 = new Stream(local361);
			while (true) {
				@Pc(373) Buffer local373;
				do {
					local373 = this.anInterface9_7.method7613();
				} while (local373 == null);
				this.aStream3 = new Stream(local373);
				local182 = 0;
				local123 = 0;
				for (@Pc(388) int local388 = this.anInt6450; local388 <= this.anInt6455; local388++) {
					if (local388 >= 0 && arg1.anInt9575 > local388) {
						@Pc(405) int local405 = 0;
						for (@Pc(408) int local408 = this.anInt6452; local408 <= this.anInt6456; local408++) {
							if (local408 >= 0 && arg1.anInt9577 > local408) {
								@Pc(423) int local423 = arg3[local123];
								@Pc(430) int[] local430 = arg1.anIntArrayArrayArray14[local408][local388];
								@Pc(437) int[] local437 = arg1.anIntArrayArrayArray12[local408][local388];
								if (local430 != null && local423 != 0) {
									if (local423 == 1) {
										for (@Pc(599) int local599 = 0; local599 < local430.length; local599++) {
											this.method5816(local437[local599], local430[local599], local405, local408, local388, local182);
										}
									} else if (local423 == 3) {
										this.method5816(0, 0, local405, local408, local388, local182);
										this.method5816(0, arg1.anInt9576, local405, local408, local388, local182);
										this.method5816(arg1.anInt9576, 0, local405, local408, local388, local182);
									} else if (local423 == 2) {
										this.method5816(0, arg1.anInt9576, local405, local408, local388, local182);
										this.method5816(arg1.anInt9576, arg1.anInt9576, local405, local408, local388, local182);
										this.method5816(0, 0, local405, local408, local388, local182);
									} else if (local423 == 5) {
										this.method5816(arg1.anInt9576, arg1.anInt9576, local405, local408, local388, local182);
										this.method5816(arg1.anInt9576, 0, local405, local408, local388, local182);
										this.method5816(0, arg1.anInt9576, local405, local408, local388, local182);
									} else if (local423 == 4) {
										this.method5816(arg1.anInt9576, 0, local405, local408, local388, local182);
										this.method5816(0, 0, local405, local408, local388, local182);
										this.method5816(arg1.anInt9576, arg1.anInt9576, local405, local408, local388, local182);
									}
								}
							}
							local405++;
							local123++;
						}
					} else {
						local123 += this.anInt6456 - this.anInt6452;
					}
					local182++;
				}
				this.aStream3.b();
				if (this.anInterface9_7.method7614()) {
					this.aStream4.b();
					this.anInterface16_10 = this.aClass4_Sub2_12.method7250(false);
					this.anInterface16_10.method7615(this.anInt6457 * 16, local361, 16);
					break;
				}
				this.aStream4.b(0);
				this.aClass230_37.method6141();
			}
		} else {
			this.anInterface9_7 = null;
			this.anInterface16_10 = null;
		}
		this.aClass230_37 = null;
		this.aStream4 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIB[[Z)V")
	public void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface9_7 == null || (this.anInt6452 > arg2 + arg0 || (this.anInt6456 < arg2 - arg0 || (arg0 + arg1 < this.anInt6450 || arg1 - arg0 > this.anInt6455)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt6450; local55 <= this.anInt6455; local55++) {
			for (@Pc(60) int local60 = this.anInt6452; local60 <= this.anInt6456; local60++) {
				@Pc(67) int local67 = local60 - arg2;
				@Pc(71) int local71 = local55 - arg1;
				if (local67 > -arg0 && arg0 > local67 && local71 > -arg0 && arg0 > local71 && arg3[local67 + arg0][arg0 + local71]) {
					this.aClass4_Sub2_12.method7244((byte) (this.aClass1_Sub5_3.method4310() * 255.0F));
					this.aClass4_Sub2_12.method7268(this.aClass4_Sub2_12.aClass310_16);
					this.aClass4_Sub2_12.method7251(this.anInterface16_10, 0);
					this.aClass4_Sub2_12.method7291(0, this.anInt6457, Static416.aClass263_5, this.anInterface9_7, this.anInt6453 / 3, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IS)V")
	private void method5813(@OriginalArg(1) short arg0) {
		if (Stream.a()) {
			this.aStream3.c(arg0);
		} else {
			this.aStream3.d(arg0);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII)V")
	private void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg3 << this.aClass7_Sub3_1.anInt9573);
		@Pc(24) int local24 = arg0 + (arg4 << this.aClass7_Sub3_1.anInt9573);
		@Pc(30) int local30 = this.aClass7_Sub3_1.aa(local16, local24);
		if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(59) Class1 local59 = this.aClass230_37.method6144(local7);
			if (local59 != null) {
				this.method5813(((Class1_Sub49) local59).aShort117);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt6457++;
		if (local7 != -1L) {
			this.aClass230_37.method6139(local7, new Class1_Sub49(local77));
		}
		@Pc(123) float local123;
		@Pc(116) float local116;
		@Pc(109) float local109;
		@Pc(223) float local223;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(245) float local245;
		@Pc(252) float local252;
		@Pc(261) float local261;
		@Pc(270) float local270;
		@Pc(279) float local279;
		if (arg1 == 0 && arg0 == 0) {
			local109 = this.aFloatArrayArray13[arg2][arg5];
			local116 = this.aFloatArrayArray14[arg2][arg5];
			local123 = this.aFloatArrayArray12[arg2][arg5];
		} else if (this.aClass7_Sub3_1.anInt9576 == arg1 && arg0 == 0) {
			local116 = this.aFloatArrayArray14[arg2 + 1][arg5];
			local123 = this.aFloatArrayArray12[arg2 + 1][arg5];
			local109 = this.aFloatArrayArray13[arg2 + 1][arg5];
		} else if (this.aClass7_Sub3_1.anInt9576 == arg1 && arg0 == this.aClass7_Sub3_1.anInt9576) {
			local109 = this.aFloatArrayArray13[arg2 + 1][arg5 + 1];
			local116 = this.aFloatArrayArray14[arg2 + 1][arg5 + 1];
			local123 = this.aFloatArrayArray12[arg2 + 1][arg5 + 1];
		} else if (arg1 == 0 && this.aClass7_Sub3_1.anInt9576 == arg0) {
			local116 = this.aFloatArrayArray14[arg2][arg5 + 1];
			local123 = this.aFloatArrayArray12[arg2][arg5 + 1];
			local109 = this.aFloatArrayArray13[arg2][arg5 + 1];
		} else {
			local223 = (float) arg1 / (float) this.aClass7_Sub3_1.anInt9576;
			local231 = (float) arg0 / (float) this.aClass7_Sub3_1.anInt9576;
			local238 = this.aFloatArrayArray12[arg2][arg5];
			local245 = this.aFloatArrayArray14[arg2][arg5];
			local252 = this.aFloatArrayArray13[arg2][arg5];
			local261 = this.aFloatArrayArray12[arg2 + 1][arg5];
			local270 = this.aFloatArrayArray14[arg2 + 1][arg5];
			local279 = this.aFloatArrayArray13[arg2 + 1][arg5];
			@Pc(295) float local295 = local238 + (this.aFloatArrayArray12[arg2][arg5 + 1] - local238) * local223;
			@Pc(313) float local313 = local270 + local223 * (this.aFloatArrayArray14[arg2 + 1][arg5 + 1] - local270);
			@Pc(329) float local329 = local245 + local223 * (this.aFloatArrayArray14[arg2][arg5 + 1] - local245);
			@Pc(347) float local347 = local261 + (this.aFloatArrayArray12[arg2 + 1][arg5 + 1] - local261) * local223;
			@Pc(363) float local363 = local252 + (this.aFloatArrayArray13[arg2][arg5 + 1] - local252) * local223;
			@Pc(380) float local380 = local279 + local223 * (this.aFloatArrayArray13[arg2 + 1][arg5 + 1] - local279);
			local123 = local295 + local231 * (local347 - local295);
			local116 = (local313 - local329) * local231 + local329;
			local109 = local363 + (local380 - local363) * local231;
		}
		local223 = this.aClass1_Sub5_3.method4306() - local16;
		local231 = this.aClass1_Sub5_3.method4305() - local30;
		local238 = this.aClass1_Sub5_3.method4314() - local24;
		local245 = (float) Math.sqrt((double) (local238 * local238 + local231 * local231 + local223 * local223));
		local252 = 1.0F / local245;
		local231 *= local252;
		local238 *= local252;
		local223 *= local252;
		local261 = local245 / (float) this.aClass1_Sub5_3.method4311();
		local270 = 1.0F - local261 * local261;
		if (local270 < 0.0F) {
			local270 = 0.0F;
		}
		local279 = local116 * local231 + local123 * local223 + local238 * local109;
		if (local279 < 0.0F) {
			local279 = 0.0F;
		}
		@Pc(548) float local548 = local279 * local270 * 2.0F;
		if (local548 > 1.0F) {
			local548 = 1.0F;
		}
		@Pc(559) int local559 = this.aClass1_Sub5_3.method4313();
		@Pc(569) int local569 = (int) ((float) (local559 >> 16 & 0xFF) * local548);
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(586) int local586 = (int) (local548 * (float) (local559 >> 8 & 0xFF));
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(601) int local601 = (int) (local548 * (float) (local559 & 0xFF));
		if (local601 > 255) {
			local601 = 255;
		}
		if (Stream.a()) {
			this.aStream4.b((float) local16);
			this.aStream4.b((float) local30);
			this.aStream4.b((float) local24);
		} else {
			this.aStream4.a((float) local16);
			this.aStream4.a((float) local30);
			this.aStream4.a((float) local24);
		}
		if (this.aClass4_Sub2_12.anInt8318 == 0) {
			this.aStream4.a(local601);
			this.aStream4.a(local586);
			this.aStream4.a(local569);
		} else {
			this.aStream4.a(local569);
			this.aStream4.a(local586);
			this.aStream4.a(local601);
		}
		this.aStream4.a(255);
		this.method5813(local77);
	}
}
