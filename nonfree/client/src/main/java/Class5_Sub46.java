import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class5_Sub46 extends Class5 {

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
	private int anInt8303;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_17;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!uf;")
	private final Class5_Sub43 aClass5_Sub43_3;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!im;")
	private final Class22_Sub2 aClass22_Sub2_2;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	private final int anInt8313;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	private final int anInt8308;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	private final int anInt8307;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	private final int anInt8305;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
	private int anInt8304;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!qha;")
	private Class291 aClass291_34;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!je;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!sfa;")
	private final Interface25 anInterface25_12;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!kd;Lclient!im;Lclient!uf;[I)V")
	public Class5_Sub46(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Class22_Sub2 arg1, @OriginalArg(2) Class5_Sub43 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass57_Sub3_17 = arg0;
		this.aClass5_Sub43_3 = arg2;
		this.aClass22_Sub2_2 = arg1;
		@Pc(23) int local23 = this.aClass5_Sub43_3.method8254() - (arg1.anInt9377 >> 1);
		this.anInt8313 = this.aClass5_Sub43_3.method8251() - local23 >> arg1.anInt9378;
		this.anInt8308 = this.aClass5_Sub43_3.method8251() + local23 >> arg1.anInt9378;
		this.anInt8307 = this.aClass5_Sub43_3.method8255() - local23 >> arg1.anInt9378;
		this.anInt8305 = local23 + this.aClass5_Sub43_3.method8255() >> arg1.anInt9378;
		@Pc(78) int local78 = this.anInt8308 + 1 - this.anInt8313;
		@Pc(86) int local86 = this.anInt8305 + 1 - this.anInt8307;
		this.aFloatArrayArray14 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt8307;
			if (local122 > 0 && this.aClass22_Sub2_2.anInt9375 - 1 > local122) {
				for (local135 = 0; local135 <= local78; local135++) {
					local142 = this.anInt8313 + local135;
					if (local142 > 0 && local142 < this.aClass22_Sub2_2.anInt9376 - 1) {
						local172 = arg1.method8038(local122, local142 + 1) - arg1.method8038(local122, local142 - 1);
						local189 = arg1.method8038(local122 + 1, local142) - arg1.method8038(local122 - 1, local142);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local189 * local189 + 65536)));
						this.aFloatArrayArray14[local135][local115] = (float) local172 * local205;
						this.aFloatArrayArray12[local135][local115] = -256.0F * local205;
						this.aFloatArrayArray13[local135][local115] = (float) local189 * local205;
					}
				}
			}
		}
		local122 = 0;
		@Pc(341) int local341;
		for (local135 = this.anInt8307; local135 <= this.anInt8305; local135++) {
			if (local135 >= 0 && arg1.anInt9375 > local135) {
				for (local142 = this.anInt8313; local142 <= this.anInt8308; local142++) {
					if (local142 >= 0 && arg1.anInt9376 > local142) {
						local172 = arg3[local122];
						@Pc(313) int[] local313 = arg1.anIntArrayArrayArray10[local142][local135];
						if (local313 != null && local172 != 0) {
							if (local172 == 1) {
								local341 = 0;
								while (local341 < local313.length) {
									if (local313[local341++] != -1 && local313[local341++] != -1 && local313[local341++] != -1) {
										this.anInt8304 += 3;
									}
								}
							} else {
								this.anInt8304 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt8308 - this.anInt8313;
			}
		}
		if (this.anInt8304 > 0) {
			this.aClass291_34 = new Class291(Static94.method1393(this.anInt8304));
			this.anInterface9_6 = this.aClass57_Sub3_17.method7762(false);
			this.anInterface9_6.method2925(this.anInt8304);
			@Pc(447) NativeHeapBuffer local447 = this.aClass57_Sub3_17.method7740(false, this.anInt8304 * 16);
			this.aStream5 = new Stream(local447);
			while (true) {
				@Pc(459) Buffer local459;
				do {
					local459 = this.anInterface9_6.method2926();
				} while (local459 == null);
				this.aStream4 = new Stream(local459);
				local122 = 0;
				local189 = 0;
				for (local341 = this.anInt8307; local341 <= this.anInt8305; local341++) {
					if (local341 >= 0 && arg1.anInt9375 > local341) {
						@Pc(495) int local495 = 0;
						for (@Pc(498) int local498 = this.anInt8313; local498 <= this.anInt8308; local498++) {
							if (local498 >= 0 && local498 < arg1.anInt9376) {
								@Pc(517) int local517 = arg3[local122];
								@Pc(524) int[] local524 = arg1.anIntArrayArrayArray10[local498][local341];
								if (local524 != null && local517 != 0) {
									if (local517 == 1) {
										@Pc(704) int[] local704 = arg1.anIntArrayArrayArray12[local498][local341];
										@Pc(711) int[] local711 = arg1.anIntArrayArrayArray13[local498][local341];
										@Pc(713) int local713 = 0;
										label117: while (true) {
											while (true) {
												if (local713 >= local524.length) {
													break label117;
												}
												if (local524[local713] == -1 || local524[local713 + 1] == -1 || local524[local713 + 2] == -1) {
													local713 += 3;
												} else {
													this.method7157(local498, local189, local341, local495, local704[local713], local711[local713]);
													local713++;
													this.method7157(local498, local189, local341, local495, local704[local713], local711[local713]);
													local713++;
													this.method7157(local498, local189, local341, local495, local704[local713], local711[local713]);
													local713++;
												}
											}
										}
									} else if (local517 == 3) {
										this.method7157(local498, local189, local341, local495, 0, 0);
										this.method7157(local498, local189, local341, local495, arg1.anInt9377, 0);
										this.method7157(local498, local189, local341, local495, 0, arg1.anInt9377);
									} else if (local517 == 2) {
										this.method7157(local498, local189, local341, local495, arg1.anInt9377, 0);
										this.method7157(local498, local189, local341, local495, arg1.anInt9377, arg1.anInt9377);
										this.method7157(local498, local189, local341, local495, 0, 0);
									} else if (local517 == 5) {
										this.method7157(local498, local189, local341, local495, arg1.anInt9377, arg1.anInt9377);
										this.method7157(local498, local189, local341, local495, 0, arg1.anInt9377);
										this.method7157(local498, local189, local341, local495, arg1.anInt9377, 0);
									} else if (local517 == 4) {
										this.method7157(local498, local189, local341, local495, 0, arg1.anInt9377);
										this.method7157(local498, local189, local341, local495, 0, 0);
										this.method7157(local498, local189, local341, local495, arg1.anInt9377, arg1.anInt9377);
									}
								}
							}
							local495++;
							local122++;
						}
					} else {
						local122 += this.anInt8308 - this.anInt8313;
					}
					local189++;
				}
				this.aStream4.c();
				if (this.anInterface9_6.method2927()) {
					this.aStream5.c();
					this.anInterface25_12 = this.aClass57_Sub3_17.method7784(false);
					this.anInterface25_12.method2906(16, this.anInt8303 * 16, local447);
					break;
				}
				this.aStream5.b(0);
				this.aClass291_34.method6986(-127);
			}
		} else {
			this.anInterface25_12 = null;
			this.anInterface9_6 = null;
		}
		this.aClass291_34 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray12 = this.aFloatArrayArray13 = null;
		this.aStream5 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IS)V")
	private void method7155(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream4.d(arg0);
		} else {
			this.aStream4.c(arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V")
	private void method7157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg4 + (arg0 << this.aClass22_Sub2_2.anInt9378);
		@Pc(24) int local24 = arg5 + (arg2 << this.aClass22_Sub2_2.anInt9378);
		@Pc(31) int local31 = this.aClass22_Sub2_2.method8032(local16, local24);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(66) Class5 local66 = this.aClass291_34.method6993(local7, 1);
			if (local66 != null) {
				this.method7155(((Class5_Sub17) local66).aShort35);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt8303++;
		if (local7 != -1L) {
			this.aClass291_34.method6984(local7, new Class5_Sub17(local85));
		}
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(130) float local130;
		@Pc(184) float local184;
		@Pc(192) float local192;
		@Pc(199) float local199;
		@Pc(206) float local206;
		@Pc(213) float local213;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		if (arg4 == 0 && arg5 == 0) {
			local116 = this.aFloatArrayArray14[arg3][arg1];
			local123 = this.aFloatArrayArray12[arg3][arg1];
			local130 = this.aFloatArrayArray13[arg3][arg1];
		} else if (this.aClass22_Sub2_2.anInt9377 == arg4 && arg5 == 0) {
			local130 = this.aFloatArrayArray13[arg3 + 1][arg1];
			local123 = this.aFloatArrayArray12[arg3 + 1][arg1];
			local116 = this.aFloatArrayArray14[arg3 + 1][arg1];
		} else if (arg4 == this.aClass22_Sub2_2.anInt9377 && this.aClass22_Sub2_2.anInt9377 == arg5) {
			local130 = this.aFloatArrayArray13[arg3 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray14[arg3 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray12[arg3 + 1][arg1 + 1];
		} else if (arg4 == 0 && this.aClass22_Sub2_2.anInt9377 == arg5) {
			local123 = this.aFloatArrayArray12[arg3][arg1 + 1];
			local116 = this.aFloatArrayArray14[arg3][arg1 + 1];
			local130 = this.aFloatArrayArray13[arg3][arg1 + 1];
		} else {
			local184 = (float) arg4 / (float) this.aClass22_Sub2_2.anInt9377;
			local192 = (float) arg5 / (float) this.aClass22_Sub2_2.anInt9377;
			local199 = this.aFloatArrayArray14[arg3][arg1];
			local206 = this.aFloatArrayArray12[arg3][arg1];
			local213 = this.aFloatArrayArray13[arg3][arg1];
			local222 = this.aFloatArrayArray14[arg3 + 1][arg1];
			local231 = this.aFloatArrayArray12[arg3 + 1][arg1];
			local240 = this.aFloatArrayArray13[arg3 + 1][arg1];
			@Pc(256) float local256 = local213 + (this.aFloatArrayArray13[arg3][arg1 + 1] - local213) * local184;
			@Pc(271) float local271 = local206 + (this.aFloatArrayArray12[arg3][arg1 + 1] - local206) * local184;
			@Pc(289) float local289 = local222 + (this.aFloatArrayArray14[arg3 + 1][arg1 + 1] - local222) * local184;
			@Pc(305) float local305 = local199 + (this.aFloatArrayArray14[arg3][arg1 + 1] - local199) * local184;
			@Pc(322) float local322 = local231 + local184 * (this.aFloatArrayArray12[arg3 + 1][arg1 + 1] - local231);
			local116 = local192 * (local289 - local305) + local305;
			local123 = local271 + local192 * (local322 - local271);
			@Pc(356) float local356 = local240 + (this.aFloatArrayArray13[arg3 + 1][arg1 + 1] - local240) * local184;
			local130 = local256 + (local356 - local256) * local192;
		}
		local184 = (float) (this.aClass5_Sub43_3.method8251() - local16);
		local192 = (float) (this.aClass5_Sub43_3.method8257() - local31);
		local199 = (float) (this.aClass5_Sub43_3.method8255() - local24);
		local206 = (float) Math.sqrt((double) (local199 * local199 + local192 * local192 + local184 * local184));
		local213 = 1.0F / local206;
		local192 *= local213;
		local184 *= local213;
		local199 *= local213;
		local222 = local206 / (float) this.aClass5_Sub43_3.method8254();
		local231 = 1.0F - local222 * local222;
		if (local231 < 0.0F) {
			local231 = 0.0F;
		}
		local240 = local130 * local199 + local116 * local184 + local123 * local192;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		@Pc(561) float local561 = local240 * 2.0F * local231;
		if (local561 > 1.0F) {
			local561 = 1.0F;
		}
		@Pc(572) int local572 = this.aClass5_Sub43_3.method8253();
		@Pc(582) int local582 = (int) (local561 * (float) (local572 >> 16 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(599) int local599 = (int) (local561 * (float) (local572 >> 8 & 0xFF));
		if (local599 > 255) {
			local599 = 255;
		}
		@Pc(614) int local614 = (int) (local561 * (float) (local572 & 0xFF));
		if (Stream.b()) {
			this.aStream5.b((float) local16);
			this.aStream5.b((float) local31);
			this.aStream5.b((float) local24);
		} else {
			this.aStream5.a((float) local16);
			this.aStream5.a((float) local31);
			this.aStream5.a((float) local24);
		}
		if (local614 > 255) {
			local614 = 255;
		}
		if (this.aClass57_Sub3_17.anInt9165 == 0) {
			this.aStream5.a(local614);
			this.aStream5.a(local599);
			this.aStream5.a(local582);
		} else {
			this.aStream5.a(local582);
			this.aStream5.a(local599);
			this.aStream5.a(local614);
		}
		this.aStream5.a(255);
		this.method7155(local85);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZI[[Z)V")
	public void method7158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface9_6 == null || (arg2 + arg0 < this.anInt8313 || (this.anInt8308 < arg0 - arg2 || (this.anInt8307 > arg1 + arg2 || arg1 - arg2 > this.anInt8305)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt8307; local54 <= this.anInt8305; local54++) {
			for (@Pc(59) int local59 = this.anInt8313; local59 <= this.anInt8308; local59++) {
				@Pc(66) int local66 = local59 - arg0;
				@Pc(71) int local71 = local54 - arg1;
				if (-arg2 < local66 && arg2 > local66 && local71 > -arg2 && arg2 > local71 && arg3[local66 + arg2][arg2 + local71]) {
					this.aClass57_Sub3_17.method7786((byte) (int) (this.aClass5_Sub43_3.method8250() * 255.0F));
					this.aClass57_Sub3_17.method7807(0, this.anInterface25_12);
					this.aClass57_Sub3_17.method7745(this.aClass57_Sub3_17.aClass147_19);
					this.aClass57_Sub3_17.method7814(this.anInt8303, this.anInterface9_6, 0, 0, Static175.aClass85_1, this.anInt8304 / 3);
					return;
				}
			}
		}
	}
}
