import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	private int anInt10108;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Lclient!pn;")
	private final Class3_Sub28 aClass3_Sub28_3;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!os;")
	private final Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_20;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	private final int anInt10114;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	private final int anInt10113;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
	private final int anInt10115;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
	private final int anInt10112;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt10109;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!cu;")
	private final Interface2 anInterface2_13;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!ui;")
	private final Interface20 anInterface20_7;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!bc;")
	private Class25 aClass25_43;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fc;Lclient!os;Lclient!pn;[I)V")
	public Class3_Sub51(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(2) Class3_Sub28 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub28_3 = arg2;
		this.aClass4_Sub2_3 = arg1;
		this.aClass15_Sub2_20 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub28_3.method8154() - (arg1.anInt10458 >> 1);
		this.anInt10114 = this.aClass3_Sub28_3.method8156() - local22 >> arg1.anInt10463;
		this.anInt10113 = local22 + this.aClass3_Sub28_3.method8156() >> arg1.anInt10463;
		this.anInt10115 = this.aClass3_Sub28_3.method8158() - local22 >> arg1.anInt10463;
		this.anInt10112 = this.aClass3_Sub28_3.method8158() + local22 >> arg1.anInt10463;
		@Pc(77) int local77 = this.anInt10113 + 1 - this.anInt10114;
		@Pc(86) int local86 = this.anInt10112 + 1 - this.anInt10115;
		this.aFloatArrayArray12 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(175) int local175;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt10115;
			if (local122 > 0 && local122 < this.aClass4_Sub2_3.anInt10459 - 1) {
				for (local140 = 0; local140 <= local77; local140++) {
					local148 = local140 + this.anInt10114;
					if (local148 > 0 && local148 < this.aClass4_Sub2_3.anInt10461 - 1) {
						local175 = arg1.JA(local148 + 1, local122) - arg1.JA(local148 - 1, local122);
						local189 = arg1.JA(local148, local122 + 1) - arg1.JA(local148, local122 - 1);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local189 * local189 + 65536)));
						this.aFloatArrayArray11[local140][local115] = (float) local175 * local204;
						this.aFloatArrayArray13[local140][local115] = -256.0F * local204;
						this.aFloatArrayArray12[local140][local115] = local204 * (float) local189;
					}
				}
			}
		}
		local122 = 0;
		@Pc(326) int local326;
		for (local140 = this.anInt10115; local140 <= this.anInt10112; local140++) {
			if (local140 >= 0 && arg1.anInt10459 > local140) {
				for (local148 = this.anInt10114; local148 <= this.anInt10113; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt10461) {
						local175 = arg3[local122];
						@Pc(309) int[] local309 = arg1.anIntArrayArrayArray13[local148][local140];
						if (local309 != null && local175 != 0) {
							if (local175 == 1) {
								local326 = 0;
								while (local309.length > local326) {
									if (local309[local326++] != -1 && local309[local326++] != -1 && local309[local326++] != -1) {
										this.anInt10109 += 3;
									}
								}
							} else {
								this.anInt10109 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt10113 - this.anInt10114;
			}
		}
		if (this.anInt10109 <= 0) {
			this.anInterface2_13 = null;
			this.anInterface20_7 = null;
		} else {
			this.aClass25_43 = new Class25(Static178.method3152(this.anInt10109));
			this.anInterface20_7 = this.aClass15_Sub2_20.method5489(false);
			this.anInterface20_7.method6240(this.anInt10109);
			@Pc(411) NativeHeapBuffer local411 = this.aClass15_Sub2_20.method5423(this.anInt10109 * 16, false);
			this.aStream7 = new Stream(local411);
			while (true) {
				@Pc(423) Buffer local423;
				do {
					local423 = this.anInterface20_7.method6243();
				} while (local423 == null);
				this.aStream6 = new Stream(local423);
				local122 = 0;
				local189 = 0;
				for (local326 = this.anInt10115; local326 <= this.anInt10112; local326++) {
					if (local326 >= 0 && local326 < arg1.anInt10459) {
						@Pc(452) int local452 = 0;
						for (@Pc(455) int local455 = this.anInt10114; local455 <= this.anInt10113; local455++) {
							if (local455 >= 0 && local455 < arg1.anInt10461) {
								@Pc(471) int local471 = arg3[local122];
								@Pc(478) int[] local478 = arg1.anIntArrayArrayArray13[local455][local326];
								if (local478 != null && local471 != 0) {
									if (local471 == 1) {
										@Pc(637) int[] local637 = arg1.anIntArrayArrayArray11[local455][local326];
										@Pc(644) int[] local644 = arg1.anIntArrayArrayArray10[local455][local326];
										@Pc(646) int local646 = 0;
										label118: while (true) {
											while (true) {
												if (local646 >= local478.length) {
													break label118;
												}
												if (local478[local646] == -1 || local478[local646 + 1] == -1 || local478[local646 + 2] == -1) {
													local646 += 3;
												} else {
													this.method8201(local644[local646], local452, local455, local326, local189, local637[local646]);
													local646++;
													this.method8201(local644[local646], local452, local455, local326, local189, local637[local646]);
													local646++;
													this.method8201(local644[local646], local452, local455, local326, local189, local637[local646]);
													local646++;
												}
											}
										}
									} else if (local471 == 3) {
										this.method8201(0, local452, local455, local326, local189, 0);
										this.method8201(0, local452, local455, local326, local189, arg1.anInt10458);
										this.method8201(arg1.anInt10458, local452, local455, local326, local189, 0);
									} else if (local471 == 2) {
										this.method8201(0, local452, local455, local326, local189, arg1.anInt10458);
										this.method8201(arg1.anInt10458, local452, local455, local326, local189, arg1.anInt10458);
										this.method8201(0, local452, local455, local326, local189, 0);
									} else if (local471 == 5) {
										this.method8201(arg1.anInt10458, local452, local455, local326, local189, arg1.anInt10458);
										this.method8201(arg1.anInt10458, local452, local455, local326, local189, 0);
										this.method8201(0, local452, local455, local326, local189, arg1.anInt10458);
									} else if (local471 == 4) {
										this.method8201(arg1.anInt10458, local452, local455, local326, local189, 0);
										this.method8201(0, local452, local455, local326, local189, 0);
										this.method8201(arg1.anInt10458, local452, local455, local326, local189, arg1.anInt10458);
									}
								}
							}
							local452++;
							local122++;
						}
					} else {
						local122 += this.anInt10113 - this.anInt10114;
					}
					local189++;
				}
				this.aStream6.a();
				if (this.anInterface20_7.method6241()) {
					this.aStream7.a();
					this.anInterface2_13 = this.aClass15_Sub2_20.method5383(false);
					this.anInterface2_13.method5803(this.anInt10108 * 16, local411, 16);
					break;
				}
				this.aStream7.b(0);
				this.aClass25_43.method948();
			}
		}
		this.aStream6 = null;
		this.aStream7 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray13 = this.aFloatArrayArray12 = null;
		this.aClass25_43 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIZI)V")
	private void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg2 << this.aClass4_Sub2_3.anInt10463);
		@Pc(23) int local23 = arg0 + (arg3 << this.aClass4_Sub2_3.anInt10463);
		@Pc(29) int local29 = this.aClass4_Sub2_3.sa(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(57) Class3 local57 = this.aClass25_43.method946(local7);
			if (local57 != null) {
				this.method8203(((Class3_Sub39) local57).aShort83);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt10108++;
		if (local7 != -1L) {
			this.aClass25_43.method945(new Class3_Sub39(local75), local7);
		}
		@Pc(99) float local99;
		@Pc(106) float local106;
		@Pc(113) float local113;
		@Pc(184) float local184;
		@Pc(192) float local192;
		@Pc(199) float local199;
		@Pc(206) float local206;
		@Pc(213) float local213;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		if (arg5 == 0 && arg0 == 0) {
			local99 = this.aFloatArrayArray11[arg1][arg4];
			local106 = this.aFloatArrayArray13[arg1][arg4];
			local113 = this.aFloatArrayArray12[arg1][arg4];
		} else if (arg5 == this.aClass4_Sub2_3.anInt10458 && arg0 == 0) {
			local106 = this.aFloatArrayArray13[arg1 + 1][arg4];
			local113 = this.aFloatArrayArray12[arg1 + 1][arg4];
			local99 = this.aFloatArrayArray11[arg1 + 1][arg4];
		} else if (this.aClass4_Sub2_3.anInt10458 == arg5 && this.aClass4_Sub2_3.anInt10458 == arg0) {
			local106 = this.aFloatArrayArray13[arg1 + 1][arg4 + 1];
			local113 = this.aFloatArrayArray12[arg1 + 1][arg4 + 1];
			local99 = this.aFloatArrayArray11[arg1 + 1][arg4 + 1];
		} else if (arg5 == 0 && this.aClass4_Sub2_3.anInt10458 == arg0) {
			local113 = this.aFloatArrayArray12[arg1][arg4 + 1];
			local106 = this.aFloatArrayArray13[arg1][arg4 + 1];
			local99 = this.aFloatArrayArray11[arg1][arg4 + 1];
		} else {
			local184 = (float) arg5 / (float) this.aClass4_Sub2_3.anInt10458;
			local192 = (float) arg0 / (float) this.aClass4_Sub2_3.anInt10458;
			local199 = this.aFloatArrayArray11[arg1][arg4];
			local206 = this.aFloatArrayArray13[arg1][arg4];
			local213 = this.aFloatArrayArray12[arg1][arg4];
			local222 = this.aFloatArrayArray11[arg1 + 1][arg4];
			local231 = this.aFloatArrayArray13[arg1 + 1][arg4];
			local240 = this.aFloatArrayArray12[arg1 + 1][arg4];
			@Pc(257) float local257 = local231 + (this.aFloatArrayArray13[arg1 + 1][arg4 + 1] - local231) * local184;
			@Pc(273) float local273 = local213 + local184 * (this.aFloatArrayArray12[arg1][arg4 + 1] - local213);
			@Pc(288) float local288 = local199 + (this.aFloatArrayArray11[arg1][arg4 + 1] - local199) * local184;
			@Pc(306) float local306 = local222 + (this.aFloatArrayArray11[arg1 + 1][arg4 + 1] - local222) * local184;
			@Pc(322) float local322 = local206 + local184 * (this.aFloatArrayArray13[arg1][arg4 + 1] - local206);
			@Pc(339) float local339 = local240 + local184 * (this.aFloatArrayArray12[arg1 + 1][arg4 + 1] - local240);
			local99 = local192 * (local306 - local288) + local288;
			local106 = local192 * (local257 - local322) + local322;
			local113 = local273 + (local339 - local273) * local192;
		}
		local184 = this.aClass3_Sub28_3.method8156() - local15;
		local192 = this.aClass3_Sub28_3.method8155() - local29;
		local199 = this.aClass3_Sub28_3.method8158() - local23;
		local206 = (float) Math.sqrt((double) (local199 * local199 + local184 * local184 + local192 * local192));
		local213 = 1.0F / local206;
		local184 *= local213;
		local199 *= local213;
		local192 *= local213;
		local222 = local206 / (float) this.aClass3_Sub28_3.method8154();
		local231 = 1.0F - local222 * local222;
		if (local231 < 0.0F) {
			local231 = 0.0F;
		}
		local240 = local113 * local199 + local192 * local106 + local99 * local184;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		@Pc(534) float local534 = local240 * 2.0F * local231;
		if (local534 > 1.0F) {
			local534 = 1.0F;
		}
		@Pc(545) int local545 = this.aClass3_Sub28_3.method8153();
		@Pc(555) int local555 = (int) ((float) (local545 >> 16 & 0xFF) * local534);
		if (local555 > 255) {
			local555 = 255;
		}
		@Pc(572) int local572 = (int) ((float) (local545 >> 8 & 0xFF) * local534);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(585) int local585 = (int) ((float) (local545 & 0xFF) * local534);
		if (local585 > 255) {
			local585 = 255;
		}
		if (Stream.b()) {
			this.aStream7.b((float) local15);
			this.aStream7.b((float) local29);
			this.aStream7.b((float) local23);
		} else {
			this.aStream7.a((float) local15);
			this.aStream7.a((float) local29);
			this.aStream7.a((float) local23);
		}
		if (this.aClass15_Sub2_20.anInt6540 == 0) {
			this.aStream7.c(local585);
			this.aStream7.c(local572);
			this.aStream7.c(local555);
		} else {
			this.aStream7.c(local555);
			this.aStream7.c(local572);
			this.aStream7.c(local585);
		}
		this.aStream7.c(255);
		this.method8203(local75);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(SB)V")
	private void method8203(@OriginalArg(0) short arg0) {
		if (Stream.b()) {
			this.aStream6.f(arg0);
		} else {
			this.aStream6.d(arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[[Z)V")
	public void method8205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface20_7 == null || (this.anInt10114 > arg1 + arg0 || (arg1 - arg0 > this.anInt10113 || (arg2 + arg0 < this.anInt10115 || arg2 - arg0 > this.anInt10112)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt10115; local54 <= this.anInt10112; local54++) {
			for (@Pc(59) int local59 = this.anInt10114; local59 <= this.anInt10113; local59++) {
				@Pc(65) int local65 = local59 - arg1;
				@Pc(70) int local70 = local54 - arg2;
				if (local65 > -arg0 && local65 < arg0 && local70 > -arg0 && local70 < arg0 && arg3[local65 + arg0][local70 + arg0]) {
					this.aClass15_Sub2_20.method5425((byte) (this.aClass3_Sub28_3.method8159() * 255.0F));
					this.aClass15_Sub2_20.method5376(0, this.anInterface2_13);
					this.aClass15_Sub2_20.method5391(this.aClass15_Sub2_20.aClass142_15);
					this.aClass15_Sub2_20.method5375(0, Static18.aClass32_2, 0, this.anInt10109 / 3, this.anInt10108, this.anInterface20_7);
					return;
				}
			}
		}
	}
}
