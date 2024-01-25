import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
	private int anInt6272;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
	private int anInt6273;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_38;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Lclient!eb;")
	private final Class51_Sub1 aClass51_Sub1_3;

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "Lclient!bn;")
	private final Class5_Sub9 aClass5_Sub9_1;

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
	private final int anInt6276;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	private final int anInt6271;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
	private final int anInt6275;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	private final int anInt6274;

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "Lclient!dc;")
	private final Interface1 anInterface1_5;

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "Lclient!q;")
	private final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "Lclient!vl;")
	private final Class203 aClass203_14;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!vl;")
	private final Class203 aClass203_13;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "Lclient!rg;")
	private Class5_Sub12 aClass5_Sub12_8;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!ed;")
	private Class5_Sub12_Sub1 aClass5_Sub12_Sub1_3;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Lclient!tn;")
	private Class190 aClass190_31;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!mm;Lclient!eb;Lclient!bn;[I)V")
	public Class5_Sub43(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class51_Sub1 arg1, @OriginalArg(2) Class5_Sub9 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass55_Sub1_38 = arg0;
		this.aClass51_Sub1_3 = arg1;
		this.aClass5_Sub9_1 = arg2;
		@Pc(20) int local20 = this.aClass5_Sub9_1.anInt705 - (arg1.anInt1186 >> 1);
		this.anInt6276 = this.aClass5_Sub9_1.anInt703 - local20 >> arg1.anInt1185;
		this.anInt6271 = this.aClass5_Sub9_1.anInt703 + local20 >> arg1.anInt1185;
		this.anInt6275 = this.aClass5_Sub9_1.anInt708 - local20 >> arg1.anInt1185;
		this.anInt6274 = local20 + this.aClass5_Sub9_1.anInt708 >> arg1.anInt1185;
		@Pc(71) int local71 = this.anInt6271 + 1 - this.anInt6276;
		@Pc(80) int local80 = this.anInt6274 + 1 - this.anInt6275;
		this.aFloatArrayArray6 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray5 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray4 = new float[local71 + 1][local80 + 1];
		@Pc(109) int local109;
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(153) int local153;
		@Pc(180) int local180;
		@Pc(194) int local194;
		for (local109 = 0; local109 <= local80; local109++) {
			local122 = local109 + this.anInt6275;
			if (local122 > 0 && this.aClass51_Sub1_3.anInt1961 - 1 > local122) {
				for (local140 = 0; local140 <= local71; local140++) {
					local153 = local140 + this.anInt6276;
					if (local153 > 0 && this.aClass51_Sub1_3.anInt1963 - 1 > local153) {
						local180 = arg1.method1856(local153 + 1, local122) - arg1.method1856(local153 - 1, local122);
						local194 = arg1.method1856(local153, local122 + 1) - arg1.method1856(local153, local122 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local180 * local180 + local194 * local194 + 65536)));
						this.aFloatArrayArray5[local140][local109] = (float) local180 * local209;
						this.aFloatArrayArray6[local140][local109] = local209 * -256.0F;
						this.aFloatArrayArray4[local140][local109] = (float) local194 * local209;
					}
				}
			}
		}
		local109 = 0;
		local122 = 0;
		for (local140 = this.anInt6275; local140 <= this.anInt6274; local140++) {
			if (local140 >= 0 && arg1.anInt1961 > local140) {
				for (local153 = this.anInt6276; local153 <= this.anInt6271; local153++) {
					if (local153 >= 0 && arg1.anInt1963 > local153) {
						local180 = arg3[local122];
						@Pc(307) int[] local307 = arg1.anIntArrayArrayArray6[local153][local140];
						if (local307 != null && local180 != 0) {
							if (local180 == 1) {
								local109 += local307.length;
							} else {
								local109 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt6271 - this.anInt6276;
			}
		}
		if (local109 <= 0) {
			this.anInterface1_5 = null;
			this.anInterface8_5 = null;
			this.aClass203_14 = null;
			this.aClass203_13 = null;
		} else {
			this.aClass5_Sub12_8 = new Class5_Sub12(local109 * 2);
			this.aClass5_Sub12_Sub1_3 = new Class5_Sub12_Sub1(local109 * 16);
			this.aClass190_31 = new Class190(Static109.method1929(local109));
			local122 = 0;
			local140 = 0;
			for (local153 = this.anInt6275; local153 <= this.anInt6274; local153++) {
				if (local153 >= 0 && local153 < arg1.anInt1961) {
					local180 = 0;
					for (local194 = this.anInt6276; local194 <= this.anInt6271; local194++) {
						if (local194 >= 0 && arg1.anInt1963 > local194) {
							@Pc(409) int local409 = arg3[local122];
							@Pc(416) int[] local416 = arg1.anIntArrayArrayArray6[local194][local153];
							@Pc(423) int[] local423 = arg1.anIntArrayArrayArray4[local194][local153];
							if (local416 != null && local409 != 0) {
								if (local409 == 1) {
									for (@Pc(439) int local439 = 0; local439 < local416.length; local439++) {
										this.method5627(local140, local423[local439], local416[local439], local180, local153, local194);
									}
								} else if (local409 == 3) {
									this.method5627(local140, 0, 0, local180, local153, local194);
									this.method5627(local140, 0, arg1.anInt1186, local180, local153, local194);
									this.method5627(local140, arg1.anInt1186, 0, local180, local153, local194);
								} else if (local409 == 2) {
									this.method5627(local140, 0, arg1.anInt1186, local180, local153, local194);
									this.method5627(local140, arg1.anInt1186, arg1.anInt1186, local180, local153, local194);
									this.method5627(local140, 0, 0, local180, local153, local194);
								} else if (local409 == 5) {
									this.method5627(local140, arg1.anInt1186, arg1.anInt1186, local180, local153, local194);
									this.method5627(local140, arg1.anInt1186, 0, local180, local153, local194);
									this.method5627(local140, 0, arg1.anInt1186, local180, local153, local194);
								} else if (local409 == 4) {
									this.method5627(local140, arg1.anInt1186, 0, local180, local153, local194);
									this.method5627(local140, 0, 0, local180, local153, local194);
									this.method5627(local140, arg1.anInt1186, arg1.anInt1186, local180, local153, local194);
								}
							}
						}
						local122++;
						local180++;
					}
				} else {
					local122 += this.anInt6271 - this.anInt6276;
				}
				local140++;
			}
			this.anInterface1_5 = this.aClass55_Sub1_38.method3704(this.aClass5_Sub12_8.aByteArray90, this.aClass5_Sub12_8.anInt5731, false);
			this.anInterface8_5 = this.aClass55_Sub1_38.method3674(16, this.aClass5_Sub12_Sub1_3.aByteArray90, this.aClass5_Sub12_Sub1_3.anInt5731, false);
			this.aClass203_14 = new Class203(this.aClass55_Sub1_38, this.anInterface8_5, 5126, 3, 0);
			this.aClass203_13 = new Class203(this.aClass55_Sub1_38, this.anInterface8_5, 5121, 4, 12);
		}
		this.aClass190_31 = null;
		this.aClass5_Sub12_8 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray4 = null;
		this.aClass5_Sub12_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[[ZII)V")
	public void method5625(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface1_5 == null || (arg2 + arg3 < this.anInt6276 || (this.anInt6271 < arg3 - arg2 || (this.anInt6275 > arg2 + arg0 || arg0 - arg2 > this.anInt6274)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt6275; local54 <= this.anInt6274; local54++) {
			for (@Pc(61) int local61 = this.anInt6276; local61 <= this.anInt6271; local61++) {
				@Pc(70) int local70 = local61 - arg3;
				@Pc(74) int local74 = local54 - arg0;
				if (local70 > -arg2 && local70 < arg2 && -arg2 < local74 && local74 < arg2 && arg1[arg2 + local70][local74 + arg2]) {
					this.aClass55_Sub1_38.method3667((int) (this.aClass5_Sub9_1.aFloat8 * 255.0F) << 24);
					this.aClass55_Sub1_38.method3640(this.aClass203_14, null, this.aClass203_13, null);
					this.aClass55_Sub1_38.method3673(this.anInterface1_5, 0, this.anInt6273);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(SI)V")
	private void method5626(@OriginalArg(0) short arg0) {
		if (this.aClass55_Sub1_38.aBoolean308) {
			this.aClass5_Sub12_8.method5084(arg0);
		} else {
			this.aClass5_Sub12_8.method5080(arg0);
		}
		this.anInt6273++;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIIII)V")
	private void method5627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = arg2 + (arg5 << this.aClass51_Sub1_3.anInt1185);
		@Pc(17) int local17 = (arg4 << this.aClass51_Sub1_3.anInt1185) + arg1;
		@Pc(23) int local23 = this.aClass51_Sub1_3.method1844(local9, local17);
		if ((arg2 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(53) Class5 local53 = this.aClass190_31.method5466(local1);
			if (local53 != null) {
				this.method5626(((Class5_Sub2) local53).aShort1);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt6272++;
		if (local1 != -1L) {
			this.aClass190_31.method5464(new Class5_Sub2(local73), local1);
		}
		@Pc(133) float local133;
		@Pc(124) float local124;
		@Pc(115) float local115;
		@Pc(197) float local197;
		@Pc(205) float local205;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(226) float local226;
		@Pc(235) float local235;
		@Pc(244) float local244;
		@Pc(302) float local302;
		if (arg2 == 0 && arg1 == 0) {
			local133 = this.aFloatArrayArray5[arg3][arg0];
			local115 = this.aFloatArrayArray4[arg3][arg0];
			local124 = this.aFloatArrayArray6[arg3][arg0];
		} else if (arg2 == this.aClass51_Sub1_3.anInt1186 && arg1 == 0) {
			local115 = this.aFloatArrayArray4[arg3 + 1][arg0];
			local124 = this.aFloatArrayArray6[arg3 + 1][arg0];
			local133 = this.aFloatArrayArray5[arg3 + 1][arg0];
		} else if (arg2 == this.aClass51_Sub1_3.anInt1186 && arg1 == this.aClass51_Sub1_3.anInt1186) {
			local133 = this.aFloatArrayArray5[arg3 + 1][arg0 + 1];
			local115 = this.aFloatArrayArray4[arg3 + 1][arg0 + 1];
			local124 = this.aFloatArrayArray6[arg3 + 1][arg0 + 1];
		} else if (arg2 == 0 && this.aClass51_Sub1_3.anInt1186 == arg1) {
			local115 = this.aFloatArrayArray4[arg3][arg0 + 1];
			local124 = this.aFloatArrayArray6[arg3][arg0 + 1];
			local133 = this.aFloatArrayArray5[arg3][arg0 + 1];
		} else {
			local197 = (float) arg2 / (float) this.aClass51_Sub1_3.anInt1186;
			local205 = (float) arg1 / (float) this.aClass51_Sub1_3.anInt1186;
			local212 = this.aFloatArrayArray5[arg3][arg0];
			local219 = this.aFloatArrayArray6[arg3][arg0];
			local226 = this.aFloatArrayArray4[arg3][arg0];
			local235 = this.aFloatArrayArray5[arg3 + 1][arg0];
			local244 = this.aFloatArrayArray6[arg3 + 1][arg0];
			@Pc(261) float local261 = local244 + local197 * (this.aFloatArrayArray6[arg3 + 1][arg0 + 1] - local244);
			@Pc(278) float local278 = local235 + local197 * (this.aFloatArrayArray5[arg3 + 1][arg0 + 1] - local235);
			@Pc(293) float local293 = local219 + local197 * (this.aFloatArrayArray6[arg3][arg0 + 1] - local219);
			local302 = this.aFloatArrayArray4[arg3 + 1][arg0];
			@Pc(317) float local317 = local226 + (this.aFloatArrayArray4[arg3][arg0 + 1] - local226) * local197;
			@Pc(332) float local332 = local212 + local197 * (this.aFloatArrayArray5[arg3][arg0 + 1] - local212);
			local133 = local332 + local205 * (local278 - local332);
			local124 = local293 + (local261 - local293) * local205;
			@Pc(367) float local367 = local302 + local197 * (this.aFloatArrayArray4[arg3 + 1][arg0 + 1] - local302);
			local115 = local205 * (local367 - local317) + local317;
		}
		local197 = this.aClass5_Sub9_1.anInt703 - local9;
		local205 = this.aClass5_Sub9_1.anInt704 - local23;
		local212 = this.aClass5_Sub9_1.anInt708 - local17;
		local219 = (float) Math.sqrt((double) (local197 * local197 + local205 * local205 + local212 * local212));
		local226 = 1.0F / local219;
		local197 *= local226;
		local212 *= local226;
		local205 *= local226;
		local235 = local219 / (float) this.aClass5_Sub9_1.anInt705;
		local244 = 1.0F - local235 * local235;
		if (local244 < 0.0F) {
			local244 = 0.0F;
		}
		local302 = local212 * local115 + local133 * local197 + local205 * local124;
		if (local302 < 0.0F) {
			local302 = 0.0F;
		}
		@Pc(525) float local525 = local302 * local244 * 2.0F;
		if (local525 > 1.0F) {
			local525 = 1.0F;
		}
		@Pc(535) int local535 = this.aClass5_Sub9_1.anInt702;
		@Pc(545) int local545 = (int) (local525 * (float) (local535 >> 16 & 0xFF));
		if (local545 > 255) {
			local545 = 255;
		}
		@Pc(562) int local562 = (int) (local525 * (float) (local535 >> 8 & 0xFF));
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(577) int local577 = (int) (local525 * (float) (local535 & 0xFF));
		if (this.aClass55_Sub1_38.aBoolean308) {
			this.aClass5_Sub12_Sub1_3.method1300((float) local9);
			this.aClass5_Sub12_Sub1_3.method1300((float) local23);
			this.aClass5_Sub12_Sub1_3.method1300((float) local17);
		} else {
			this.aClass5_Sub12_Sub1_3.method1301((float) local9);
			this.aClass5_Sub12_Sub1_3.method1301((float) local23);
			this.aClass5_Sub12_Sub1_3.method1301((float) local17);
		}
		if (local577 > 255) {
			local577 = 255;
		}
		this.aClass5_Sub12_Sub1_3.method5089(local545);
		this.aClass5_Sub12_Sub1_3.method5089(local562);
		this.aClass5_Sub12_Sub1_3.method5089(local577);
		this.aClass5_Sub12_Sub1_3.method5089(255);
		this.method5626(local73);
	}
}
