import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
	private int anInt2514;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "Lclient!ne;")
	private final Class259_Sub1 aClass259_Sub1_1;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "Lclient!jw;")
	private final Class3_Sub5 aClass3_Sub5_2;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_4;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	private final int anInt2504;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
	private final int anInt2505;

	@OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
	private final int anInt2506;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	private final int anInt2507;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	private int anInt2513;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "Lclient!qn;")
	private Class313 aClass313_10;

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "Lclient!kl;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Lclient!lq;")
	private final Interface14 anInterface14_1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!jca;Lclient!ne;Lclient!jw;[I)V")
	public Class3_Sub21(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Class259_Sub1 arg1, @OriginalArg(2) Class3_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass259_Sub1_1 = arg1;
		this.aClass3_Sub5_2 = arg2;
		this.aClass22_Sub2_4 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub5_2.method7173() - (arg1.anInt10947 >> 1);
		this.anInt2504 = this.aClass3_Sub5_2.method7174() - local23 >> arg1.anInt10943;
		this.anInt2505 = this.aClass3_Sub5_2.method7174() + local23 >> arg1.anInt10943;
		this.anInt2506 = this.aClass3_Sub5_2.method7177() - local23 >> arg1.anInt10943;
		this.anInt2507 = this.aClass3_Sub5_2.method7177() + local23 >> arg1.anInt10943;
		@Pc(79) int local79 = this.anInt2505 + 1 - this.anInt2504;
		@Pc(88) int local88 = this.anInt2507 + 1 - this.anInt2506;
		this.aFloatArrayArray3 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray2 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray4 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(144) int local144;
		@Pc(151) int local151;
		@Pc(182) int local182;
		@Pc(199) int local199;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt2506 + local117;
			if (local124 > 0 && this.aClass259_Sub1_1.anInt10946 - 1 > local124) {
				for (local144 = 0; local144 <= local79; local144++) {
					local151 = local144 + this.anInt2504;
					if (local151 > 0 && this.aClass259_Sub1_1.anInt10949 - 1 > local151) {
						local182 = arg1.method9295(local124, local151 + 1) - arg1.method9295(local124, local151 - 1);
						local199 = arg1.method9295(local124 + 1, local151) - arg1.method9295(local124 - 1, local151);
						@Pc(214) float local214 = (float) (1.0D / Math.sqrt((double) (local199 * local199 + local182 * local182 + 65536)));
						this.aFloatArrayArray2[local144][local117] = local214 * (float) local182;
						this.aFloatArrayArray4[local144][local117] = local214 * -256.0F;
						this.aFloatArrayArray3[local144][local117] = (float) local199 * local214;
					}
				}
			}
		}
		local124 = 0;
		@Pc(328) int local328;
		for (local144 = this.anInt2506; local144 <= this.anInt2507; local144++) {
			if (local144 >= 0 && local144 < arg1.anInt10946) {
				for (local151 = this.anInt2504; local151 <= this.anInt2505; local151++) {
					if (local151 >= 0 && local151 < arg1.anInt10949) {
						local182 = arg3[local124];
						@Pc(312) int[] local312 = arg1.anIntArrayArrayArray9[local151][local144];
						if (local312 != null && local182 != 0) {
							if (local182 == 1) {
								local328 = 0;
								while (local312.length > local328) {
									if (local312[local328++] != -1 && local312[local328++] != -1 && local312[local328++] != -1) {
										this.anInt2513 += 3;
									}
								}
							} else {
								this.anInt2513 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt2505 - this.anInt2504;
			}
		}
		if (this.anInt2513 > 0) {
			this.aClass313_10 = new Class313(Static92.method1941(this.anInt2513));
			this.anInterface11_1 = this.aClass22_Sub2_4.method8916(false);
			this.anInterface11_1.method6757(this.anInt2513);
			@Pc(446) NativeHeapBuffer local446 = this.aClass22_Sub2_4.method8963(false, this.anInt2513 * 16);
			this.aStream1 = new Stream(local446);
			while (true) {
				@Pc(458) Buffer local458;
				do {
					local458 = this.anInterface11_1.method5367();
				} while (local458 == null);
				this.aStream2 = new Stream(local458);
				local124 = 0;
				local199 = 0;
				for (local328 = this.anInt2506; local328 <= this.anInt2507; local328++) {
					if (local328 >= 0 && local328 < arg1.anInt10946) {
						@Pc(502) int local502 = 0;
						for (@Pc(505) int local505 = this.anInt2504; local505 <= this.anInt2505; local505++) {
							if (local505 >= 0 && arg1.anInt10949 > local505) {
								@Pc(525) int local525 = arg3[local124];
								@Pc(532) int[] local532 = arg1.anIntArrayArrayArray9[local505][local328];
								if (local532 != null && local525 != 0) {
									if (local525 == 1) {
										@Pc(712) int[] local712 = arg1.anIntArrayArrayArray11[local505][local328];
										@Pc(719) int[] local719 = arg1.anIntArrayArrayArray8[local505][local328];
										@Pc(721) int local721 = 0;
										label119: while (true) {
											while (true) {
												if (local721 >= local532.length) {
													break label119;
												}
												if (local532[local721] == -1 || local532[local721 + 1] == -1 || local532[local721 + 2] == -1) {
													local721 += 3;
												} else {
													this.method2292(local712[local721], local199, local719[local721], local502, local328, local505);
													local721++;
													this.method2292(local712[local721], local199, local719[local721], local502, local328, local505);
													local721++;
													this.method2292(local712[local721], local199, local719[local721], local502, local328, local505);
													local721++;
												}
											}
										}
									} else if (local525 == 3) {
										this.method2292(0, local199, 0, local502, local328, local505);
										this.method2292(arg1.anInt10947, local199, 0, local502, local328, local505);
										this.method2292(0, local199, arg1.anInt10947, local502, local328, local505);
									} else if (local525 == 2) {
										this.method2292(arg1.anInt10947, local199, 0, local502, local328, local505);
										this.method2292(arg1.anInt10947, local199, arg1.anInt10947, local502, local328, local505);
										this.method2292(0, local199, 0, local502, local328, local505);
									} else if (local525 == 5) {
										this.method2292(arg1.anInt10947, local199, arg1.anInt10947, local502, local328, local505);
										this.method2292(0, local199, arg1.anInt10947, local502, local328, local505);
										this.method2292(arg1.anInt10947, local199, 0, local502, local328, local505);
									} else if (local525 == 4) {
										this.method2292(0, local199, arg1.anInt10947, local502, local328, local505);
										this.method2292(0, local199, 0, local502, local328, local505);
										this.method2292(arg1.anInt10947, local199, arg1.anInt10947, local502, local328, local505);
									}
								}
							}
							local502++;
							local124++;
						}
					} else {
						local124 += this.anInt2505 - this.anInt2504;
					}
					local199++;
				}
				this.aStream2.b();
				if (this.anInterface11_1.method5366()) {
					this.aStream1.b();
					this.anInterface14_1 = this.aClass22_Sub2_4.method8937(false);
					this.anInterface14_1.method6765(16, this.anInt2514 * 16, local446);
					break;
				}
				this.aStream1.b(0);
				this.aClass313_10.method7101();
			}
		} else {
			this.anInterface11_1 = null;
			this.anInterface14_1 = null;
		}
		this.aFloatArrayArray2 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.aStream1 = null;
		this.aStream2 = null;
		this.aClass313_10 = null;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IS)V")
	private void method2291(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream2.d(arg0);
		} else {
			this.aStream2.a(arg0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIIIZI)V")
	private void method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass259_Sub1_1.anInt10943) + arg0;
		@Pc(23) int local23 = arg2 + (arg4 << this.aClass259_Sub1_1.anInt10943);
		@Pc(30) int local30 = this.aClass259_Sub1_1.method9294(local23, local15);
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(66) Class3 local66 = this.aClass313_10.method7104(local7);
			if (local66 != null) {
				this.method2291(((Class3_Sub11) local66).aShort25);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt2514++;
		if (local7 != -1L) {
			this.aClass313_10.method7107(local7, new Class3_Sub11(local85));
		}
		@Pc(132) float local132;
		@Pc(141) float local141;
		@Pc(150) float local150;
		@Pc(192) float local192;
		@Pc(200) float local200;
		@Pc(207) float local207;
		@Pc(214) float local214;
		@Pc(221) float local221;
		@Pc(230) float local230;
		@Pc(239) float local239;
		@Pc(281) float local281;
		if (arg0 == 0 && arg2 == 0) {
			local150 = this.aFloatArrayArray3[arg3][arg1];
			local132 = this.aFloatArrayArray2[arg3][arg1];
			local141 = this.aFloatArrayArray4[arg3][arg1];
		} else if (arg0 == this.aClass259_Sub1_1.anInt10947 && arg2 == 0) {
			local132 = this.aFloatArrayArray2[arg3 + 1][arg1];
			local141 = this.aFloatArrayArray4[arg3 + 1][arg1];
			local150 = this.aFloatArrayArray3[arg3 + 1][arg1];
		} else if (arg0 == this.aClass259_Sub1_1.anInt10947 && arg2 == this.aClass259_Sub1_1.anInt10947) {
			local150 = this.aFloatArrayArray3[arg3 + 1][arg1 + 1];
			local132 = this.aFloatArrayArray2[arg3 + 1][arg1 + 1];
			local141 = this.aFloatArrayArray4[arg3 + 1][arg1 + 1];
		} else if (arg0 == 0 && this.aClass259_Sub1_1.anInt10947 == arg2) {
			local132 = this.aFloatArrayArray2[arg3][arg1 + 1];
			local141 = this.aFloatArrayArray4[arg3][arg1 + 1];
			local150 = this.aFloatArrayArray3[arg3][arg1 + 1];
		} else {
			local192 = (float) arg0 / (float) this.aClass259_Sub1_1.anInt10947;
			local200 = (float) arg2 / (float) this.aClass259_Sub1_1.anInt10947;
			local207 = this.aFloatArrayArray2[arg3][arg1];
			local214 = this.aFloatArrayArray4[arg3][arg1];
			local221 = this.aFloatArrayArray3[arg3][arg1];
			local230 = this.aFloatArrayArray2[arg3 + 1][arg1];
			local239 = this.aFloatArrayArray4[arg3 + 1][arg1];
			@Pc(254) float local254 = local221 + local192 * (this.aFloatArrayArray3[arg3][arg1 + 1] - local221);
			@Pc(272) float local272 = local239 + local192 * (this.aFloatArrayArray4[arg3 + 1][arg1 + 1] - local239);
			local281 = this.aFloatArrayArray3[arg3 + 1][arg1];
			@Pc(296) float local296 = local207 + (this.aFloatArrayArray2[arg3][arg1 + 1] - local207) * local192;
			@Pc(312) float local312 = local214 + (this.aFloatArrayArray4[arg3][arg1 + 1] - local214) * local192;
			@Pc(330) float local330 = local230 + (this.aFloatArrayArray2[arg3 + 1][arg1 + 1] - local230) * local192;
			@Pc(348) float local348 = local281 + (this.aFloatArrayArray3[arg3 + 1][arg1 + 1] - local281) * local192;
			local141 = local312 + (local272 - local312) * local200;
			local132 = local296 + local200 * (local330 - local296);
			local150 = local200 * (local348 - local254) + local254;
		}
		local192 = (float) (this.aClass3_Sub5_2.method7174() - local15);
		local200 = (float) (this.aClass3_Sub5_2.method7175() - local30);
		local207 = (float) (this.aClass3_Sub5_2.method7177() - local23);
		local214 = (float) Math.sqrt((double) (local207 * local207 + local200 * local200 + local192 * local192));
		local221 = 1.0F / local214;
		local200 *= local221;
		local207 *= local221;
		local192 *= local221;
		local230 = local214 / (float) this.aClass3_Sub5_2.method7173();
		local239 = 1.0F - local230 * local230;
		if (local239 < 0.0F) {
			local239 = 0.0F;
		}
		local281 = local150 * local207 + local200 * local141 + local132 * local192;
		if (local281 < 0.0F) {
			local281 = 0.0F;
		}
		@Pc(568) float local568 = local281 * local239 * 2.0F;
		if (local568 > 1.0F) {
			local568 = 1.0F;
		}
		@Pc(579) int local579 = this.aClass3_Sub5_2.method7172();
		@Pc(589) int local589 = (int) (local568 * (float) (local579 >> 16 & 0xFF));
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(606) int local606 = (int) (local568 * (float) (local579 >> 8 & 0xFF));
		if (local606 > 255) {
			local606 = 255;
		}
		@Pc(621) int local621 = (int) ((float) (local579 & 0xFF) * local568);
		if (local621 > 255) {
			local621 = 255;
		}
		if (Stream.c()) {
			this.aStream1.a((float) local15);
			this.aStream1.a((float) local30);
			this.aStream1.a((float) local23);
		} else {
			this.aStream1.b((float) local15);
			this.aStream1.b((float) local30);
			this.aStream1.b((float) local23);
		}
		if (this.aClass22_Sub2_4.anInt10482 == 0) {
			this.aStream1.f(local621);
			this.aStream1.f(local606);
			this.aStream1.f(local589);
		} else {
			this.aStream1.f(local589);
			this.aStream1.f(local606);
			this.aStream1.f(local621);
		}
		this.aStream1.f(255);
		this.method2291(local85);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([[ZIBII)V")
	public void method2293(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface11_1 == null || (arg3 + arg1 < this.anInt2504 || (this.anInt2505 < arg1 - arg3 || (arg2 + arg3 < this.anInt2506 || arg2 - arg3 > this.anInt2507)))) {
			return;
		}
		for (@Pc(56) int local56 = this.anInt2506; local56 <= this.anInt2507; local56++) {
			for (@Pc(61) int local61 = this.anInt2504; local61 <= this.anInt2505; local61++) {
				@Pc(68) int local68 = local61 - arg1;
				@Pc(73) int local73 = local56 - arg2;
				if (-arg3 < local68 && arg3 > local68 && -arg3 < local73 && arg3 > local73 && arg0[arg3 + local68][local73 + arg3]) {
					this.aClass22_Sub2_4.method8981((byte) (int) (this.aClass3_Sub5_2.method7176() * 255.0F));
					this.aClass22_Sub2_4.method8912(this.anInterface14_1, 0);
					this.aClass22_Sub2_4.method8894(this.aClass22_Sub2_4.aClass36_23);
					this.aClass22_Sub2_4.method8861(Static492.aClass234_6, 0, this.anInt2513 / 3, this.anInt2514, 0, this.anInterface11_1);
					return;
				}
			}
		}
	}
}
