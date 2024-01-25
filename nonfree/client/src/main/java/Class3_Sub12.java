import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	private int anInt1914;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!bh;")
	private final Class34_Sub1 aClass34_Sub1_1;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!eq;")
	private final Class3_Sub10 aClass3_Sub10_1;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_4;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	private final int anInt1906;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "I")
	private final int anInt1909;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	private final int anInt1903;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	private final int anInt1902;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "I")
	private int anInt1911;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "Lclient!wa;")
	private Class354 aClass354_9;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Lclient!mda;")
	private final Interface13 anInterface13_1;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!su;")
	private final Interface19 anInterface19_3;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!mj;Lclient!bh;Lclient!eq;[I)V")
	public Class3_Sub12(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(2) Class3_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass34_Sub1_1 = arg1;
		this.aClass3_Sub10_1 = arg2;
		this.aClass45_Sub2_4 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub10_1.method6018() - (arg1.anInt7850 >> 1);
		this.anInt1906 = this.aClass3_Sub10_1.method6021() - local22 >> arg1.anInt7856;
		this.anInt1909 = local22 + this.aClass3_Sub10_1.method6021() >> arg1.anInt7856;
		this.anInt1903 = this.aClass3_Sub10_1.method6015() - local22 >> arg1.anInt7856;
		this.anInt1902 = local22 + this.aClass3_Sub10_1.method6015() >> arg1.anInt7856;
		@Pc(76) int local76 = this.anInt1909 + 1 - this.anInt1906;
		@Pc(84) int local84 = this.anInt1902 + 1 - this.anInt1903;
		this.aFloatArrayArray4 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray6 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray5 = new float[local76 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(131) int local131;
		@Pc(139) int local139;
		@Pc(164) int local164;
		@Pc(181) int local181;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = this.anInt1903 + local113;
			if (local120 > 0 && local120 < this.aClass34_Sub1_1.anInt7852 - 1) {
				for (local131 = 0; local131 <= local76; local131++) {
					local139 = local131 + this.anInt1906;
					if (local139 > 0 && this.aClass34_Sub1_1.anInt7854 - 1 > local139) {
						local164 = arg1.method6525(local120, local139 + 1) - arg1.method6525(local120, local139 - 1);
						local181 = arg1.method6525(local120 + 1, local139) - arg1.method6525(local120 - 1, local139);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local164 * local164 + local181 * local181 + 65536)));
						this.aFloatArrayArray4[local131][local113] = (float) local164 * local197;
						this.aFloatArrayArray5[local131][local113] = -256.0F * local197;
						this.aFloatArrayArray6[local131][local113] = local197 * (float) local181;
					}
				}
			}
		}
		local120 = 0;
		@Pc(285) int local285;
		for (local131 = this.anInt1903; local131 <= this.anInt1902; local131++) {
			if (local131 >= 0 && arg1.anInt7852 > local131) {
				for (local139 = this.anInt1906; local139 <= this.anInt1909; local139++) {
					if (local139 >= 0 && local139 < arg1.anInt7854) {
						local164 = arg3[local120];
						@Pc(273) int[] local273 = arg1.anIntArrayArrayArray4[local139][local131];
						if (local273 != null && local164 != 0) {
							if (local164 == 1) {
								local285 = 0;
								while (local273.length > local285) {
									if (local273[local285++] != -1 && local273[local285++] != -1 && local273[local285++] != -1) {
										this.anInt1911 += 3;
									}
								}
							} else {
								this.anInt1911 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt1909 - this.anInt1906;
			}
		}
		if (this.anInt1911 > 0) {
			this.aClass354_9 = new Class354(Static371.method5424(this.anInt1911));
			this.anInterface13_1 = this.aClass45_Sub2_4.method4945(false);
			this.anInterface13_1.method6435(this.anInt1911);
			@Pc(385) NativeHeapBuffer local385 = this.aClass45_Sub2_4.method4920(false, this.anInt1911 * 16);
			this.aStream3 = new Stream(local385);
			while (true) {
				@Pc(397) Buffer local397;
				do {
					local397 = this.anInterface13_1.method6437();
				} while (local397 == null);
				this.aStream2 = new Stream(local397);
				local181 = 0;
				local120 = 0;
				for (local285 = this.anInt1903; local285 <= this.anInt1902; local285++) {
					if (local285 >= 0 && local285 < arg1.anInt7852) {
						@Pc(433) int local433 = 0;
						for (@Pc(436) int local436 = this.anInt1906; local436 <= this.anInt1909; local436++) {
							if (local436 >= 0 && arg1.anInt7854 > local436) {
								@Pc(455) int local455 = arg3[local120];
								@Pc(462) int[] local462 = arg1.anIntArrayArrayArray4[local436][local285];
								if (local462 != null && local455 != 0) {
									if (local455 == 1) {
										@Pc(481) int[] local481 = arg1.anIntArrayArrayArray6[local436][local285];
										@Pc(488) int[] local488 = arg1.anIntArrayArrayArray5[local436][local285];
										@Pc(490) int local490 = 0;
										label120: while (true) {
											while (true) {
												if (local490 >= local462.length) {
													break label120;
												}
												if (local462[local490] == -1 || local462[local490 + 1] == -1 || local462[local490 + 2] == -1) {
													local490 += 3;
												} else {
													this.method1719(local481[local490], local433, local181, local436, local285, local488[local490]);
													local490++;
													this.method1719(local481[local490], local433, local181, local436, local285, local488[local490]);
													local490++;
													this.method1719(local481[local490], local433, local181, local436, local285, local488[local490]);
													local490++;
												}
											}
										}
									} else if (local455 == 3) {
										this.method1719(0, local433, local181, local436, local285, 0);
										this.method1719(arg1.anInt7850, local433, local181, local436, local285, 0);
										this.method1719(0, local433, local181, local436, local285, arg1.anInt7850);
									} else if (local455 == 2) {
										this.method1719(arg1.anInt7850, local433, local181, local436, local285, 0);
										this.method1719(arg1.anInt7850, local433, local181, local436, local285, arg1.anInt7850);
										this.method1719(0, local433, local181, local436, local285, 0);
									} else if (local455 == 5) {
										this.method1719(arg1.anInt7850, local433, local181, local436, local285, arg1.anInt7850);
										this.method1719(0, local433, local181, local436, local285, arg1.anInt7850);
										this.method1719(arg1.anInt7850, local433, local181, local436, local285, 0);
									} else if (local455 == 4) {
										this.method1719(0, local433, local181, local436, local285, arg1.anInt7850);
										this.method1719(0, local433, local181, local436, local285, 0);
										this.method1719(arg1.anInt7850, local433, local181, local436, local285, arg1.anInt7850);
									}
								}
							}
							local120++;
							local433++;
						}
					} else {
						local120 += this.anInt1909 - this.anInt1906;
					}
					local181++;
				}
				this.aStream2.a();
				if (this.anInterface13_1.method6433()) {
					this.aStream3.a();
					this.anInterface19_3 = this.aClass45_Sub2_4.method5009(false);
					this.anInterface19_3.method6254(16, local385, this.anInt1914 * 16);
					break;
				}
				this.aStream3.f(0);
				this.aClass354_9.method7687();
			}
		} else {
			this.anInterface13_1 = null;
			this.anInterface19_3 = null;
		}
		this.aStream3 = null;
		this.aClass354_9 = null;
		this.aStream2 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III[[ZI)V")
	public void method1718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface13_1 == null || (this.anInt1906 > arg3 + arg0 || (this.anInt1909 < arg3 - arg0 || (arg0 + arg1 < this.anInt1903 || this.anInt1902 < arg1 - arg0)))) {
			return;
		}
		for (@Pc(61) int local61 = this.anInt1903; local61 <= this.anInt1902; local61++) {
			for (@Pc(66) int local66 = this.anInt1906; local66 <= this.anInt1909; local66++) {
				@Pc(73) int local73 = local66 - arg3;
				@Pc(78) int local78 = local61 - arg1;
				if (-arg0 < local73 && local73 < arg0 && -arg0 < local78 && local78 < arg0 && arg2[local73 + arg0][local78 + arg0]) {
					this.aClass45_Sub2_4.method4909((byte) (this.aClass3_Sub10_1.method6013() * 255.0F));
					this.aClass45_Sub2_4.method4910(this.anInterface19_3, 0);
					this.aClass45_Sub2_4.method4957(this.aClass45_Sub2_4.aClass7_17);
					this.aClass45_Sub2_4.method4967(0, this.anInt1911 / 3, this.anInt1914, Static379.aClass40_9, this.anInterface13_1, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
	private void method1719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass34_Sub1_1.anInt7856) + arg0;
		@Pc(24) int local24 = arg5 + (arg4 << this.aClass34_Sub1_1.anInt7856);
		@Pc(31) int local31 = this.aClass34_Sub1_1.method6530(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(60) Class3 local60 = this.aClass354_9.method7689(local7);
			if (local60 != null) {
				this.method1721(((Class3_Sub40) local60).aShort116);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt1914++;
		if (local7 != -1L) {
			this.aClass354_9.method7691(new Class3_Sub40(local78), local7);
		}
		@Pc(137) float local137;
		@Pc(126) float local126;
		@Pc(148) float local148;
		@Pc(168) float local168;
		@Pc(176) float local176;
		@Pc(183) float local183;
		@Pc(190) float local190;
		@Pc(197) float local197;
		@Pc(206) float local206;
		@Pc(215) float local215;
		@Pc(273) float local273;
		if (arg0 == 0 && arg5 == 0) {
			local126 = this.aFloatArrayArray5[arg1][arg2];
			local137 = this.aFloatArrayArray4[arg1][arg2];
			local148 = this.aFloatArrayArray6[arg1][arg2];
		} else if (arg0 == this.aClass34_Sub1_1.anInt7850 && arg5 == 0) {
			local148 = this.aFloatArrayArray6[arg1 + 1][arg2];
			local137 = this.aFloatArrayArray4[arg1 + 1][arg2];
			local126 = this.aFloatArrayArray5[arg1 + 1][arg2];
		} else if (arg0 == this.aClass34_Sub1_1.anInt7850 && this.aClass34_Sub1_1.anInt7850 == arg5) {
			local126 = this.aFloatArrayArray5[arg1 + 1][arg2 + 1];
			local137 = this.aFloatArrayArray4[arg1 + 1][arg2 + 1];
			local148 = this.aFloatArrayArray6[arg1 + 1][arg2 + 1];
		} else if (arg0 == 0 && this.aClass34_Sub1_1.anInt7850 == arg5) {
			local137 = this.aFloatArrayArray4[arg1][arg2 + 1];
			local126 = this.aFloatArrayArray5[arg1][arg2 + 1];
			local148 = this.aFloatArrayArray6[arg1][arg2 + 1];
		} else {
			local168 = (float) arg0 / (float) this.aClass34_Sub1_1.anInt7850;
			local176 = (float) arg5 / (float) this.aClass34_Sub1_1.anInt7850;
			local183 = this.aFloatArrayArray4[arg1][arg2];
			local190 = this.aFloatArrayArray5[arg1][arg2];
			local197 = this.aFloatArrayArray6[arg1][arg2];
			local206 = this.aFloatArrayArray4[arg1 + 1][arg2];
			local215 = this.aFloatArrayArray5[arg1 + 1][arg2];
			@Pc(230) float local230 = local190 + local168 * (this.aFloatArrayArray5[arg1][arg2 + 1] - local190);
			@Pc(246) float local246 = local183 + local168 * (this.aFloatArrayArray4[arg1][arg2 + 1] - local183);
			@Pc(264) float local264 = local215 + local168 * (this.aFloatArrayArray5[arg1 + 1][arg2 + 1] - local215);
			local273 = this.aFloatArrayArray6[arg1 + 1][arg2];
			@Pc(291) float local291 = local206 + (this.aFloatArrayArray4[arg1 + 1][arg2 + 1] - local206) * local168;
			@Pc(306) float local306 = local197 + local168 * (this.aFloatArrayArray6[arg1][arg2 + 1] - local197);
			local126 = local230 + (local264 - local230) * local176;
			@Pc(333) float local333 = local273 + (this.aFloatArrayArray6[arg1 + 1][arg2 + 1] - local273) * local168;
			local137 = (local291 - local246) * local176 + local246;
			local148 = local176 * (local333 - local306) + local306;
		}
		local168 = this.aClass3_Sub10_1.method6021() - local15;
		local176 = this.aClass3_Sub10_1.method6011() - local31;
		local183 = this.aClass3_Sub10_1.method6015() - local24;
		local190 = (float) Math.sqrt((double) (local168 * local168 + local176 * local176 + local183 * local183));
		local197 = 1.0F / local190;
		local168 *= local197;
		local183 *= local197;
		local176 *= local197;
		local206 = local190 / (float) this.aClass3_Sub10_1.method6018();
		local215 = 1.0F - local206 * local206;
		if (local215 < 0.0F) {
			local215 = 0.0F;
		}
		local273 = local137 * local168 + local176 * local126 + local183 * local148;
		if (local273 < 0.0F) {
			local273 = 0.0F;
		}
		@Pc(541) float local541 = local273 * local215 * 2.0F;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass3_Sub10_1.method6020();
		@Pc(562) int local562 = (int) ((float) (local552 >> 16 & 0xFF) * local541);
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(577) int local577 = (int) ((float) (local552 >> 8 & 0xFF) * local541);
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(590) int local590 = (int) (local541 * (float) (local552 & 0xFF));
		if (Stream.c()) {
			this.aStream3.a((float) local15);
			this.aStream3.a((float) local31);
			this.aStream3.a((float) local24);
		} else {
			this.aStream3.b((float) local15);
			this.aStream3.b((float) local31);
			this.aStream3.b((float) local24);
		}
		if (local590 > 255) {
			local590 = 255;
		}
		if (this.aClass45_Sub2_4.anInt5834 == 0) {
			this.aStream3.d(local590);
			this.aStream3.d(local577);
			this.aStream3.d(local562);
		} else {
			this.aStream3.d(local562);
			this.aStream3.d(local577);
			this.aStream3.d(local590);
		}
		this.aStream3.d(255);
		this.method1721(local78);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(SI)V")
	private void method1721(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream2.b(arg0);
		} else {
			this.aStream2.e(arg0);
		}
	}
}
