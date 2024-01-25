import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	private int anInt3491;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "Lclient!ap;")
	private final Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "Lclient!dl;")
	private final Class36_Sub1 aClass36_Sub1_2;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_24;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "I")
	private final int anInt3490;

	@OriginalMember(owner = "client!km", name = "G", descriptor = "I")
	private final int anInt3493;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "I")
	private final int anInt3488;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "I")
	private final int anInt3492;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!km", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "Lclient!pa;")
	private final Class161 aClass161_11;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Lclient!d;")
	private final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "Lclient!kd;")
	private final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Lclient!pa;")
	private final Class161 aClass161_10;

	@OriginalMember(owner = "client!km", name = "F", descriptor = "Lclient!at;")
	private Class1_Sub7 aClass1_Sub7_4;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "Lclient!bp;")
	private Class1_Sub7_Sub1 aClass1_Sub7_Sub1_2;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Lclient!dq;")
	private Class38 aClass38_17;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ks;Lclient!dl;Lclient!ap;[I)V")
	public Class1_Sub27(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class36_Sub1 arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub5_1 = arg2;
		this.aClass36_Sub1_2 = arg1;
		this.aClass63_Sub1_24 = arg0;
		@Pc(19) int local19 = this.aClass1_Sub5_1.anInt4963 - (arg1.anInt1467 >> 1);
		this.anInt3490 = this.aClass1_Sub5_1.anInt4966 - local19 >> arg1.anInt1463;
		this.anInt3493 = this.aClass1_Sub5_1.anInt4966 + local19 >> arg1.anInt1463;
		this.anInt3488 = this.aClass1_Sub5_1.anInt4965 - local19 >> arg1.anInt1463;
		this.anInt3492 = local19 + this.aClass1_Sub5_1.anInt4965 >> arg1.anInt1463;
		@Pc(70) int local70 = this.anInt3493 + 1 - this.anInt3490;
		@Pc(79) int local79 = this.anInt3492 + 1 - this.anInt3488;
		this.aFloatArrayArray6 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray5 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray4 = new float[local70 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(120) int local120;
		@Pc(136) int local136;
		@Pc(148) int local148;
		@Pc(173) int local173;
		@Pc(187) int local187;
		for (local108 = 0; local108 <= local79; local108++) {
			local120 = this.anInt3488 + local108;
			if (local120 > 0 && local120 < this.aClass36_Sub1_2.anInt4859 - 1) {
				for (local136 = 0; local136 <= local70; local136++) {
					local148 = this.anInt3490 + local136;
					if (local148 > 0 && local148 < this.aClass36_Sub1_2.anInt4858 - 1) {
						local173 = arg1.method4431(local148 + 1, local120) - arg1.method4431(local148 - 1, local120);
						local187 = arg1.method4431(local148, local120 + 1) - arg1.method4431(local148, local120 - 1);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local173 * local173 + local187 * local187 + 65536)));
						this.aFloatArrayArray4[local136][local108] = (float) local173 * local202;
						this.aFloatArrayArray5[local136][local108] = local202 * -256.0F;
						this.aFloatArrayArray6[local136][local108] = local202 * (float) local187;
					}
				}
			}
		}
		local108 = 0;
		local120 = 0;
		for (local136 = this.anInt3488; local136 <= this.anInt3492; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt4859) {
				for (local148 = this.anInt3490; local148 <= this.anInt3493; local148++) {
					if (local148 >= 0 && arg1.anInt4858 > local148) {
						local173 = arg3[local120];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray41[local148][local136];
						if (local286 != null && local173 != 0) {
							if (local173 == 1) {
								local108 += local286.length;
							} else {
								local108 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt3493 - this.anInt3490;
			}
		}
		if (local108 <= 0) {
			this.aClass161_11 = null;
			this.anInterface1_3 = null;
			this.anInterface6_3 = null;
			this.aClass161_10 = null;
		} else {
			this.aClass1_Sub7_4 = new Class1_Sub7(local108 * 2);
			this.aClass1_Sub7_Sub1_2 = new Class1_Sub7_Sub1(local108 * 16);
			this.aClass38_17 = new Class38(Static73.method1617(local108));
			local136 = 0;
			local120 = 0;
			for (local148 = this.anInt3488; local148 <= this.anInt3492; local148++) {
				if (local148 >= 0 && local148 < arg1.anInt4859) {
					local173 = 0;
					for (local187 = this.anInt3490; local187 <= this.anInt3493; local187++) {
						if (local187 >= 0 && arg1.anInt4858 > local187) {
							@Pc(413) int local413 = arg3[local120];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray41[local187][local148];
							@Pc(427) int[] local427 = arg1.anIntArrayArrayArray40[local187][local148];
							if (local420 != null && local413 != 0) {
								if (local413 == 1) {
									for (@Pc(439) int local439 = 0; local439 < local420.length; local439++) {
										this.method3146(local136, local173, local427[local439], local148, local187, local420[local439]);
									}
								} else if (local413 == 3) {
									this.method3146(local136, local173, 0, local148, local187, 0);
									this.method3146(local136, local173, 0, local148, local187, arg1.anInt1467);
									this.method3146(local136, local173, arg1.anInt1467, local148, local187, 0);
								} else if (local413 == 2) {
									this.method3146(local136, local173, 0, local148, local187, arg1.anInt1467);
									this.method3146(local136, local173, arg1.anInt1467, local148, local187, arg1.anInt1467);
									this.method3146(local136, local173, 0, local148, local187, 0);
								} else if (local413 == 5) {
									this.method3146(local136, local173, arg1.anInt1467, local148, local187, arg1.anInt1467);
									this.method3146(local136, local173, arg1.anInt1467, local148, local187, 0);
									this.method3146(local136, local173, 0, local148, local187, arg1.anInt1467);
								} else if (local413 == 4) {
									this.method3146(local136, local173, arg1.anInt1467, local148, local187, 0);
									this.method3146(local136, local173, 0, local148, local187, 0);
									this.method3146(local136, local173, arg1.anInt1467, local148, local187, arg1.anInt1467);
								}
							}
						}
						local120++;
						local173++;
					}
				} else {
					local120 += this.anInt3493 - this.anInt3490;
				}
				local136++;
			}
			this.anInterface1_3 = this.aClass63_Sub1_24.method3376(this.aClass1_Sub7_4.aByteArray41, this.aClass1_Sub7_4.anInt2219, false);
			this.anInterface6_3 = this.aClass63_Sub1_24.method3360(16, this.aClass1_Sub7_Sub1_2.aByteArray41, this.aClass1_Sub7_Sub1_2.anInt2219, false);
			this.aClass161_11 = new Class161(this.aClass63_Sub1_24, this.anInterface6_3, 5126, 3, 0);
			this.aClass161_10 = new Class161(this.aClass63_Sub1_24, this.anInterface6_3, 5121, 4, 12);
		}
		this.aClass1_Sub7_4 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.aClass38_17 = null;
		this.aClass1_Sub7_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(SI)V")
	private void method3144(@OriginalArg(0) short arg0) {
		if (this.aClass63_Sub1_24.lb) {
			this.aClass1_Sub7_4.method2144(arg0);
		} else {
			this.aClass1_Sub7_4.method2125(arg0);
		}
		this.anInt3489++;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[[ZIII)V")
	public void method3145(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface1_3 == null || (this.anInt3490 > arg1 + arg3 || (arg1 - arg3 > this.anInt3493 || (arg3 + arg2 < this.anInt3488 || arg2 - arg3 > this.anInt3492)))) {
			return;
		}
		for (@Pc(56) int local56 = this.anInt3488; local56 <= this.anInt3492; local56++) {
			for (@Pc(63) int local63 = this.anInt3490; local63 <= this.anInt3493; local63++) {
				@Pc(72) int local72 = local63 - arg1;
				@Pc(77) int local77 = local56 - arg2;
				if (-arg3 < local72 && local72 < arg3 && -arg3 < local77 && local77 < arg3 && arg0[local72 + arg3][arg3 + local77]) {
					this.aClass63_Sub1_24.method3342((int) (this.aClass1_Sub5_1.aFloat52 * 255.0F) << 24);
					this.aClass63_Sub1_24.method3387(this.aClass161_11, null, this.aClass161_10, null);
					this.aClass63_Sub1_24.method3334(this.anInterface1_3, 0, this.anInt3489);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIBIII)V")
	private void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(22) int local22 = arg5 + (arg4 << this.aClass36_Sub1_2.anInt1463);
		@Pc(30) int local30 = arg2 + (arg3 << this.aClass36_Sub1_2.anInt1463);
		@Pc(36) int local36 = this.aClass36_Sub1_2.method4433(local22, local30);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = ((long) local30 & 0xFFFFL) << 16 | (long) local22 & 0xFFFFL;
			@Pc(66) Class1 local66 = this.aClass38_17.method1475(local1);
			if (local66 != null) {
				this.method3144(((Class1_Sub25) local66).aShort46);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt3491++;
		if (local1 != -1L) {
			this.aClass38_17.method1472(new Class1_Sub25(local85), local1);
		}
		@Pc(118) float local118;
		@Pc(132) float local132;
		@Pc(125) float local125;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(265) float local265;
		if (arg5 == 0 && arg2 == 0) {
			local118 = this.aFloatArrayArray4[arg1][arg0];
			local125 = this.aFloatArrayArray6[arg1][arg0];
			local132 = this.aFloatArrayArray5[arg1][arg0];
		} else if (this.aClass36_Sub1_2.anInt1467 == arg5 && arg2 == 0) {
			local125 = this.aFloatArrayArray6[arg1 + 1][arg0];
			local132 = this.aFloatArrayArray5[arg1 + 1][arg0];
			local118 = this.aFloatArrayArray4[arg1 + 1][arg0];
		} else if (this.aClass36_Sub1_2.anInt1467 == arg5 && arg2 == this.aClass36_Sub1_2.anInt1467) {
			local125 = this.aFloatArrayArray6[arg1 + 1][arg0 + 1];
			local132 = this.aFloatArrayArray5[arg1 + 1][arg0 + 1];
			local118 = this.aFloatArrayArray4[arg1 + 1][arg0 + 1];
		} else if (arg5 == 0 && arg2 == this.aClass36_Sub1_2.anInt1467) {
			local118 = this.aFloatArrayArray4[arg1][arg0 + 1];
			local132 = this.aFloatArrayArray5[arg1][arg0 + 1];
			local125 = this.aFloatArrayArray6[arg1][arg0 + 1];
		} else {
			local209 = (float) arg5 / (float) this.aClass36_Sub1_2.anInt1467;
			local217 = (float) arg2 / (float) this.aClass36_Sub1_2.anInt1467;
			local224 = this.aFloatArrayArray4[arg1][arg0];
			local231 = this.aFloatArrayArray5[arg1][arg0];
			local238 = this.aFloatArrayArray6[arg1][arg0];
			local247 = this.aFloatArrayArray4[arg1 + 1][arg0];
			local256 = this.aFloatArrayArray5[arg1 + 1][arg0];
			local265 = this.aFloatArrayArray6[arg1 + 1][arg0];
			@Pc(280) float local280 = local231 + (this.aFloatArrayArray5[arg1][arg0 + 1] - local231) * local209;
			@Pc(295) float local295 = local224 + local209 * (this.aFloatArrayArray4[arg1][arg0 + 1] - local224);
			@Pc(313) float local313 = local247 + local209 * (this.aFloatArrayArray4[arg1 + 1][arg0 + 1] - local247);
			@Pc(328) float local328 = local238 + (this.aFloatArrayArray6[arg1][arg0 + 1] - local238) * local209;
			@Pc(345) float local345 = local256 + (this.aFloatArrayArray5[arg1 + 1][arg0 + 1] - local256) * local209;
			local118 = local217 * (local313 - local295) + local295;
			local132 = (local345 - local280) * local217 + local280;
			@Pc(379) float local379 = local265 + (this.aFloatArrayArray6[arg1 + 1][arg0 + 1] - local265) * local209;
			local125 = local328 + (local379 - local328) * local217;
		}
		local209 = this.aClass1_Sub5_1.anInt4966 - local22;
		local217 = this.aClass1_Sub5_1.anInt4967 - local36;
		local224 = this.aClass1_Sub5_1.anInt4965 - local30;
		local231 = (float) Math.sqrt((double) (local217 * local217 + local209 * local209 + local224 * local224));
		local238 = 1.0F / local231;
		local209 *= local238;
		local224 *= local238;
		local217 *= local238;
		local247 = local231 / (float) this.aClass1_Sub5_1.anInt4963;
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local265 = local132 * local217 + local209 * local118 + local125 * local224;
		if (local265 < 0.0F) {
			local265 = 0.0F;
		}
		@Pc(547) float local547 = local256 * local265 * 2.0F;
		if (local547 > 1.0F) {
			local547 = 1.0F;
		}
		@Pc(558) int local558 = this.aClass1_Sub5_1.anInt4970;
		@Pc(568) int local568 = (int) (local547 * (float) (local558 >> 16 & 0xFF));
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local558 >> 8 & 0xFF) * local547);
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(600) int local600 = (int) ((float) (local558 & 0xFF) * local547);
		if (this.aClass63_Sub1_24.lb) {
			this.aClass1_Sub7_Sub1_2.method790((float) local22);
			this.aClass1_Sub7_Sub1_2.method790((float) local36);
			this.aClass1_Sub7_Sub1_2.method790((float) local30);
		} else {
			this.aClass1_Sub7_Sub1_2.method789((float) local22);
			this.aClass1_Sub7_Sub1_2.method789((float) local36);
			this.aClass1_Sub7_Sub1_2.method789((float) local30);
		}
		if (local600 > 255) {
			local600 = 255;
		}
		this.aClass1_Sub7_Sub1_2.method2121(local568);
		this.aClass1_Sub7_Sub1_2.method2121(local586);
		this.aClass1_Sub7_Sub1_2.method2121(local600);
		this.aClass1_Sub7_Sub1_2.method2121(255);
		this.method3144(local85);
	}
}
