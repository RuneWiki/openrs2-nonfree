import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!fda", name = "v", descriptor = "Lclient!uca;")
	private final Class5_Sub10 aClass5_Sub10_1;

	@OriginalMember(owner = "client!fda", name = "H", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_6;

	@OriginalMember(owner = "client!fda", name = "F", descriptor = "Lclient!hm;")
	private final Class131_Sub1 aClass131_Sub1_2;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
	private final int anInt2756;

	@OriginalMember(owner = "client!fda", name = "u", descriptor = "I")
	private final int anInt2759;

	@OriginalMember(owner = "client!fda", name = "E", descriptor = "I")
	private final int anInt2763;

	@OriginalMember(owner = "client!fda", name = "r", descriptor = "I")
	private final int anInt2757;

	@OriginalMember(owner = "client!fda", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!fda", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!fda", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
	private int anInt2755;

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "Lclient!up;")
	private final Interface16 anInterface16_7;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "Lclient!sp;")
	private final Interface13 anInterface13_7;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "Lclient!cb;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!fda", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!fda", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!nd;Lclient!hm;Lclient!uca;[I)V")
	public Class5_Sub16(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class131_Sub1 arg1, @OriginalArg(2) Class5_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub10_1 = arg2;
		this.aClass62_Sub1_6 = arg0;
		this.aClass131_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass5_Sub10_1.method5191() - (arg1.anInt8874 >> 1);
		this.anInt2756 = this.aClass5_Sub10_1.method5189() - local22 >> arg1.anInt8869;
		this.anInt2759 = this.aClass5_Sub10_1.method5189() + local22 >> arg1.anInt8869;
		this.anInt2763 = this.aClass5_Sub10_1.method5183() - local22 >> arg1.anInt8869;
		this.anInt2757 = this.aClass5_Sub10_1.method5183() + local22 >> arg1.anInt8869;
		@Pc(79) int local79 = this.anInt2759 + 1 - this.anInt2756;
		@Pc(88) int local88 = this.anInt2757 + 1 - this.anInt2763;
		this.aFloatArrayArray3 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray1 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray2 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(171) int local171;
		@Pc(186) int local186;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt2763 + local117;
			if (local124 > 0 && this.aClass131_Sub1_2.anInt8871 - 1 > local124) {
				for (local138 = 0; local138 <= local79; local138++) {
					local145 = this.anInt2756 + local138;
					if (local145 > 0 && this.aClass131_Sub1_2.anInt8873 - 1 > local145) {
						local171 = arg1.ba(local145 + 1, local124) - arg1.ba(local145 - 1, local124);
						local186 = arg1.ba(local145, local124 + 1) - arg1.ba(local145, local124 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local171 * local171 + local186 * local186 + 65536)));
						this.aFloatArrayArray1[local138][local117] = local201 * (float) local171;
						this.aFloatArrayArray3[local138][local117] = local201 * -256.0F;
						this.aFloatArrayArray2[local138][local117] = local201 * (float) local186;
					}
				}
			}
		}
		local124 = 0;
		for (local138 = this.anInt2763; local138 <= this.anInt2757; local138++) {
			if (local138 >= 0 && arg1.anInt8871 > local138) {
				for (local145 = this.anInt2756; local145 <= this.anInt2759; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt8873) {
						local171 = arg3[local124];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray4[local145][local138];
						if (local298 != null && local171 != 0) {
							this.anInt2755 += local171 == 1 ? local298.length : 3;
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt2759 - this.anInt2756;
			}
		}
		if (this.anInt2755 <= 0) {
			this.anInterface16_7 = null;
			this.anInterface13_7 = null;
		} else {
			this.aClass42_6 = new Class42(Static179.method3071(this.anInt2755));
			this.anInterface13_7 = this.aClass62_Sub1_6.method4657(false);
			this.anInterface13_7.method3488(this.anInt2755);
			@Pc(379) NativeHeapBuffer local379 = this.aClass62_Sub1_6.method4688(false, this.anInt2755 * 16);
			this.aStream5 = new Stream(local379);
			while (true) {
				@Pc(391) Buffer local391;
				do {
					local391 = this.anInterface13_7.method3487();
				} while (local391 == null);
				this.aStream4 = new Stream(local391);
				local124 = 0;
				local186 = 0;
				for (@Pc(406) int local406 = this.anInt2763; local406 <= this.anInt2757; local406++) {
					if (local406 >= 0 && local406 < arg1.anInt8871) {
						@Pc(434) int local434 = 0;
						for (@Pc(437) int local437 = this.anInt2756; local437 <= this.anInt2759; local437++) {
							if (local437 >= 0 && arg1.anInt8873 > local437) {
								@Pc(453) int local453 = arg3[local124];
								@Pc(460) int[] local460 = arg1.anIntArrayArrayArray4[local437][local406];
								@Pc(467) int[] local467 = arg1.anIntArrayArrayArray8[local437][local406];
								if (local460 != null && local453 != 0) {
									if (local453 == 1) {
										for (@Pc(481) int local481 = 0; local481 < local460.length; local481++) {
											this.method2509(local406, local467[local481], local437, local434, local460[local481], local186);
										}
									} else if (local453 == 3) {
										this.method2509(local406, 0, local437, local434, 0, local186);
										this.method2509(local406, 0, local437, local434, arg1.anInt8874, local186);
										this.method2509(local406, arg1.anInt8874, local437, local434, 0, local186);
									} else if (local453 == 2) {
										this.method2509(local406, 0, local437, local434, arg1.anInt8874, local186);
										this.method2509(local406, arg1.anInt8874, local437, local434, arg1.anInt8874, local186);
										this.method2509(local406, 0, local437, local434, 0, local186);
									} else if (local453 == 5) {
										this.method2509(local406, arg1.anInt8874, local437, local434, arg1.anInt8874, local186);
										this.method2509(local406, arg1.anInt8874, local437, local434, 0, local186);
										this.method2509(local406, 0, local437, local434, arg1.anInt8874, local186);
									} else if (local453 == 4) {
										this.method2509(local406, arg1.anInt8874, local437, local434, 0, local186);
										this.method2509(local406, 0, local437, local434, 0, local186);
										this.method2509(local406, arg1.anInt8874, local437, local434, arg1.anInt8874, local186);
									}
								}
							}
							local434++;
							local124++;
						}
					} else {
						local124 += this.anInt2759 - this.anInt2756;
					}
					local186++;
				}
				this.aStream4.b();
				if (this.anInterface13_7.method3492()) {
					this.aStream5.b();
					this.anInterface16_7 = this.aClass62_Sub1_6.method4702(false);
					this.anInterface16_7.method3463(local379, this.anInt2760 * 16, 16);
					break;
				}
				this.aStream5.c(0);
				this.aClass42_6.method1108();
			}
		}
		this.aFloatArrayArray1 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aClass42_6 = null;
		this.aStream5 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIII)V")
	private void method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg4 + (arg2 << this.aClass131_Sub1_2.anInt8869);
		@Pc(23) int local23 = (arg0 << this.aClass131_Sub1_2.anInt8869) + arg1;
		@Pc(29) int local29 = this.aClass131_Sub1_2.aa(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(61) Class5 local61 = this.aClass42_6.method1109(local7);
			if (local61 != null) {
				this.method2512(((Class5_Sub35) local61).aShort88);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt2760++;
		if (local7 != -1L) {
			this.aClass42_6.method1106(local7, new Class5_Sub35(local79));
		}
		@Pc(119) float local119;
		@Pc(105) float local105;
		@Pc(112) float local112;
		@Pc(232) float local232;
		@Pc(240) float local240;
		@Pc(247) float local247;
		@Pc(254) float local254;
		@Pc(261) float local261;
		@Pc(270) float local270;
		@Pc(279) float local279;
		@Pc(369) float local369;
		if (arg4 == 0 && arg1 == 0) {
			local105 = this.aFloatArrayArray3[arg3][arg5];
			local112 = this.aFloatArrayArray2[arg3][arg5];
			local119 = this.aFloatArrayArray1[arg3][arg5];
		} else if (this.aClass131_Sub1_2.anInt8874 == arg4 && arg1 == 0) {
			local119 = this.aFloatArrayArray1[arg3 + 1][arg5];
			local112 = this.aFloatArrayArray2[arg3 + 1][arg5];
			local105 = this.aFloatArrayArray3[arg3 + 1][arg5];
		} else if (arg4 == this.aClass131_Sub1_2.anInt8874 && this.aClass131_Sub1_2.anInt8874 == arg1) {
			local119 = this.aFloatArrayArray1[arg3 + 1][arg5 + 1];
			local112 = this.aFloatArrayArray2[arg3 + 1][arg5 + 1];
			local105 = this.aFloatArrayArray3[arg3 + 1][arg5 + 1];
		} else if (arg4 == 0 && arg1 == this.aClass131_Sub1_2.anInt8874) {
			local105 = this.aFloatArrayArray3[arg3][arg5 + 1];
			local112 = this.aFloatArrayArray2[arg3][arg5 + 1];
			local119 = this.aFloatArrayArray1[arg3][arg5 + 1];
		} else {
			local232 = (float) arg4 / (float) this.aClass131_Sub1_2.anInt8874;
			local240 = (float) arg1 / (float) this.aClass131_Sub1_2.anInt8874;
			local247 = this.aFloatArrayArray1[arg3][arg5];
			local254 = this.aFloatArrayArray3[arg3][arg5];
			local261 = this.aFloatArrayArray2[arg3][arg5];
			local270 = this.aFloatArrayArray1[arg3 + 1][arg5];
			local279 = this.aFloatArrayArray3[arg3 + 1][arg5];
			@Pc(296) float local296 = local270 + (this.aFloatArrayArray1[arg3 + 1][arg5 + 1] - local270) * local232;
			@Pc(312) float local312 = local247 + local232 * (this.aFloatArrayArray1[arg3][arg5 + 1] - local247);
			@Pc(329) float local329 = local279 + (this.aFloatArrayArray3[arg3 + 1][arg5 + 1] - local279) * local232;
			@Pc(344) float local344 = local254 + local232 * (this.aFloatArrayArray3[arg3][arg5 + 1] - local254);
			@Pc(360) float local360 = local261 + local232 * (this.aFloatArrayArray2[arg3][arg5 + 1] - local261);
			local369 = this.aFloatArrayArray2[arg3 + 1][arg5];
			@Pc(386) float local386 = local369 + local232 * (this.aFloatArrayArray2[arg3 + 1][arg5 + 1] - local369);
			local105 = local344 + (local329 - local344) * local240;
			local119 = (local296 - local312) * local240 + local312;
			local112 = local360 + local240 * (local386 - local360);
		}
		local232 = this.aClass5_Sub10_1.method5189() - local15;
		local240 = this.aClass5_Sub10_1.method5190() - local29;
		local247 = this.aClass5_Sub10_1.method5183() - local23;
		local254 = (float) Math.sqrt((double) (local247 * local247 + local240 * local240 + local232 * local232));
		local261 = 1.0F / local254;
		local247 *= local261;
		local240 *= local261;
		local232 *= local261;
		local270 = local254 / (float) this.aClass5_Sub10_1.method5191();
		local279 = 1.0F - local270 * local270;
		if (local279 < 0.0F) {
			local279 = 0.0F;
		}
		local369 = local232 * local119 + local105 * local240 + local247 * local112;
		if (local369 < 0.0F) {
			local369 = 0.0F;
		}
		@Pc(546) float local546 = local279 * 2.0F * local369;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass5_Sub10_1.method5185();
		@Pc(567) int local567 = (int) (local546 * (float) (local557 >> 16 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(584) int local584 = (int) ((float) (local557 >> 8 & 0xFF) * local546);
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(597) int local597 = (int) ((float) (local557 & 0xFF) * local546);
		if (Stream.c()) {
			this.aStream5.b((float) local15);
			this.aStream5.b((float) local29);
			this.aStream5.b((float) local23);
		} else {
			this.aStream5.a((float) local15);
			this.aStream5.a((float) local29);
			this.aStream5.a((float) local23);
		}
		if (local597 > 255) {
			local597 = 255;
		}
		if (this.aClass62_Sub1_6.anInt5684 == 0) {
			this.aStream5.d(local597);
			this.aStream5.d(local584);
			this.aStream5.d(local567);
		} else {
			this.aStream5.d(local567);
			this.aStream5.d(local584);
			this.aStream5.d(local597);
		}
		this.aStream5.d(255);
		this.method2512(local79);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II[[ZII)V")
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface13_7 == null || (arg1 + arg0 < this.anInt2756 || (this.anInt2759 < arg0 - arg1 || (arg3 + arg1 < this.anInt2763 || this.anInt2757 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt2763; local54 <= this.anInt2757; local54++) {
			for (@Pc(59) int local59 = this.anInt2756; local59 <= this.anInt2759; local59++) {
				@Pc(66) int local66 = local59 - arg0;
				@Pc(71) int local71 = local54 - arg3;
				if (local66 > -arg1 && local66 < arg1 && -arg1 < local71 && arg1 > local71 && arg2[local66 + arg1][local71 + arg1]) {
					this.aClass62_Sub1_6.method4723((byte) (this.aClass5_Sub10_1.method5184() * 255.0F));
					this.aClass62_Sub1_6.method4713(this.aClass62_Sub1_6.aClass318_17);
					this.aClass62_Sub1_6.method4673(0, this.anInterface16_7);
					this.aClass62_Sub1_6.method4727(Static403.aClass228_7, 0, this.anInt2760, this.anInt2755 / 3, this.anInterface13_7, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(SB)V")
	private void method2512(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream4.e(arg0);
		} else {
			this.aStream4.a(arg0);
		}
	}
}
