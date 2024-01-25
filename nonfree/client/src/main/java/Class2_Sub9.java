import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "Lclient!ka;")
	private final Class107_Sub1 aClass107_Sub1_1;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_6;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Lclient!nq;")
	private final Class2_Sub17 aClass2_Sub17_1;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	private final int anInt683;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
	private final int anInt685;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	private final int anInt682;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	private final int anInt680;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "Lclient!fm;")
	private final Class72 aClass72_1;

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "Lclient!pc;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Lclient!fm;")
	private final Class72 aClass72_2;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "Lclient!jj;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "Lclient!kk;")
	private Class2_Sub16 aClass2_Sub16_1;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "Lclient!fi;")
	private Class2_Sub16_Sub1 aClass2_Sub16_Sub1_1;

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "Lclient!wk;")
	private Class246 aClass246_3;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!fu;Lclient!ka;Lclient!nq;[I)V")
	public Class2_Sub9(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class107_Sub1 arg1, @OriginalArg(2) Class2_Sub17 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass107_Sub1_1 = arg1;
		this.aClass63_Sub2_6 = arg0;
		this.aClass2_Sub17_1 = arg2;
		@Pc(20) int local20 = this.aClass2_Sub17_1.anInt2043 - (arg1.anInt3323 >> 1);
		this.anInt683 = this.aClass2_Sub17_1.anInt2042 - local20 >> arg1.anInt3325;
		this.anInt685 = local20 + this.aClass2_Sub17_1.anInt2042 >> arg1.anInt3325;
		this.anInt682 = this.aClass2_Sub17_1.anInt2037 - local20 >> arg1.anInt3325;
		this.anInt680 = local20 + this.aClass2_Sub17_1.anInt2037 >> arg1.anInt3325;
		@Pc(69) int local69 = this.anInt685 + 1 - this.anInt683;
		@Pc(78) int local78 = this.anInt680 + 1 - this.anInt682;
		this.aFloatArrayArray1 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray2 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray3 = new float[local69 + 1][local78 + 1];
		@Pc(107) int local107;
		@Pc(119) int local119;
		@Pc(136) int local136;
		@Pc(148) int local148;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (local107 = 0; local107 <= local78; local107++) {
			local119 = this.anInt682 + local107;
			if (local119 > 0 && this.aClass107_Sub1_1.anInt5378 - 1 > local119) {
				for (local136 = 0; local136 <= local69; local136++) {
					local148 = local136 + this.anInt683;
					if (local148 > 0 && this.aClass107_Sub1_1.anInt5379 - 1 > local148) {
						local172 = arg1.method4685(local148 + 1, local119) - arg1.method4685(local148 - 1, local119);
						local186 = arg1.method4685(local148, local119 + 1) - arg1.method4685(local148, local119 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local186 * local186 + 65536)));
						this.aFloatArrayArray1[local136][local107] = (float) local172 * local201;
						this.aFloatArrayArray2[local136][local107] = -256.0F * local201;
						this.aFloatArrayArray3[local136][local107] = (float) local186 * local201;
					}
				}
			}
		}
		local107 = 0;
		local119 = 0;
		for (local136 = this.anInt682; local136 <= this.anInt680; local136++) {
			if (local136 >= 0 && arg1.anInt5378 > local136) {
				for (local148 = this.anInt683; local148 <= this.anInt685; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt5379) {
						local172 = arg3[local119];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray7[local148][local136];
						if (local286 != null && local172 != 0) {
							if (local172 == 1) {
								local107 += local286.length;
							} else {
								local107 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt685 - this.anInt683;
			}
		}
		if (local107 <= 0) {
			this.aClass72_1 = null;
			this.anInterface6_1 = null;
			this.aClass72_2 = null;
			this.anInterface3_2 = null;
		} else {
			this.aClass2_Sub16_1 = new Class2_Sub16(local107 * 2);
			this.aClass2_Sub16_Sub1_1 = new Class2_Sub16_Sub1(local107 * 16);
			this.aClass246_3 = new Class246(Static6.method148(local107));
			local136 = 0;
			local119 = 0;
			for (local148 = this.anInt682; local148 <= this.anInt680; local148++) {
				if (local148 >= 0 && local148 < arg1.anInt5378) {
					local172 = 0;
					for (local186 = this.anInt683; local186 <= this.anInt685; local186++) {
						if (local186 >= 0 && local186 < arg1.anInt5379) {
							@Pc(412) int local412 = arg3[local119];
							@Pc(419) int[] local419 = arg1.anIntArrayArrayArray7[local186][local148];
							@Pc(426) int[] local426 = arg1.anIntArrayArrayArray9[local186][local148];
							if (local419 != null && local412 != 0) {
								if (local412 == 1) {
									for (@Pc(584) int local584 = 0; local584 < local419.length; local584++) {
										this.method580(local148, local426[local584], local186, local136, local172, local419[local584]);
									}
								} else if (local412 == 3) {
									this.method580(local148, 0, local186, local136, local172, 0);
									this.method580(local148, 0, local186, local136, local172, arg1.anInt3323);
									this.method580(local148, arg1.anInt3323, local186, local136, local172, 0);
								} else if (local412 == 2) {
									this.method580(local148, 0, local186, local136, local172, arg1.anInt3323);
									this.method580(local148, arg1.anInt3323, local186, local136, local172, arg1.anInt3323);
									this.method580(local148, 0, local186, local136, local172, 0);
								} else if (local412 == 5) {
									this.method580(local148, arg1.anInt3323, local186, local136, local172, arg1.anInt3323);
									this.method580(local148, arg1.anInt3323, local186, local136, local172, 0);
									this.method580(local148, 0, local186, local136, local172, arg1.anInt3323);
								} else if (local412 == 4) {
									this.method580(local148, arg1.anInt3323, local186, local136, local172, 0);
									this.method580(local148, 0, local186, local136, local172, 0);
									this.method580(local148, arg1.anInt3323, local186, local136, local172, arg1.anInt3323);
								}
							}
						}
						local172++;
						local119++;
					}
				} else {
					local119 += this.anInt685 - this.anInt683;
				}
				local136++;
			}
			this.anInterface3_2 = this.aClass63_Sub2_6.method2100(this.aClass2_Sub16_1.aByteArray112, this.aClass2_Sub16_1.anInt6145, false);
			this.anInterface6_1 = this.aClass63_Sub2_6.method2112(16, this.aClass2_Sub16_Sub1_1.aByteArray112, this.aClass2_Sub16_Sub1_1.anInt6145, false);
			this.aClass72_2 = new Class72(this.aClass63_Sub2_6, this.anInterface6_1, 5126, 3, 0);
			this.aClass72_1 = new Class72(this.aClass63_Sub2_6, this.anInterface6_1, 5121, 4, 12);
		}
		this.aClass2_Sub16_1 = null;
		this.aClass246_3 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aClass2_Sub16_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IS)V")
	private void method578(@OriginalArg(1) short arg0) {
		if (this.aClass63_Sub2_6.aBoolean153) {
			this.aClass2_Sub16_1.method5351(arg0);
		} else {
			this.aClass2_Sub16_1.method5374(arg0);
		}
		this.anInt681++;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III[[ZI)V")
	public void method579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface3_2 == null || (this.anInt683 > arg1 + arg3 || (this.anInt685 < arg1 - arg3 || (this.anInt682 > arg3 + arg0 || arg0 - arg3 > this.anInt680)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt682; local50 <= this.anInt680; local50++) {
			for (@Pc(61) int local61 = this.anInt683; local61 <= this.anInt685; local61++) {
				@Pc(74) int local74 = local61 - arg1;
				@Pc(78) int local78 = local50 - arg0;
				if (-arg3 < local74 && arg3 > local74 && -arg3 < local78 && arg3 > local78 && arg2[local74 + arg3][arg3 + local78]) {
					this.aClass63_Sub2_6.method2131((int) (this.aClass2_Sub17_1.aFloat17 * 255.0F) << 24);
					this.aClass63_Sub2_6.method2114(this.aClass72_2, null, this.aClass72_1, null);
					this.aClass63_Sub2_6.method2072(this.anInterface3_2, 0, this.anInt681);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIBIII)V")
	private void method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg2 << this.aClass107_Sub1_1.anInt3325) + arg5;
		@Pc(17) int local17 = (arg0 << this.aClass107_Sub1_1.anInt3325) + arg1;
		@Pc(23) int local23 = this.aClass107_Sub1_1.method4673(local9, local17);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local1 = (long) local9 & 0xFFFFL | ((long) local17 & 0xFFFFL) << 16;
			@Pc(53) Class2 local53 = this.aClass246_3.method5613(local1);
			if (local53 != null) {
				this.method578(((Class2_Sub12) local53).aShort6);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt684++;
		if (local1 != -1L) {
			this.aClass246_3.method5609(new Class2_Sub12(local73), local1);
		}
		@Pc(101) float local101;
		@Pc(108) float local108;
		@Pc(115) float local115;
		@Pc(180) float local180;
		@Pc(188) float local188;
		@Pc(195) float local195;
		@Pc(202) float local202;
		@Pc(209) float local209;
		@Pc(218) float local218;
		@Pc(227) float local227;
		@Pc(301) float local301;
		if (arg5 == 0 && arg1 == 0) {
			local101 = this.aFloatArrayArray1[arg4][arg3];
			local108 = this.aFloatArrayArray2[arg4][arg3];
			local115 = this.aFloatArrayArray3[arg4][arg3];
		} else if (this.aClass107_Sub1_1.anInt3323 == arg5 && arg1 == 0) {
			local108 = this.aFloatArrayArray2[arg4 + 1][arg3];
			local101 = this.aFloatArrayArray1[arg4 + 1][arg3];
			local115 = this.aFloatArrayArray3[arg4 + 1][arg3];
		} else if (this.aClass107_Sub1_1.anInt3323 == arg5 && arg1 == this.aClass107_Sub1_1.anInt3323) {
			local108 = this.aFloatArrayArray2[arg4 + 1][arg3 + 1];
			local115 = this.aFloatArrayArray3[arg4 + 1][arg3 + 1];
			local101 = this.aFloatArrayArray1[arg4 + 1][arg3 + 1];
		} else if (arg5 == 0 && arg1 == this.aClass107_Sub1_1.anInt3323) {
			local101 = this.aFloatArrayArray1[arg4][arg3 + 1];
			local115 = this.aFloatArrayArray3[arg4][arg3 + 1];
			local108 = this.aFloatArrayArray2[arg4][arg3 + 1];
		} else {
			local180 = (float) arg5 / (float) this.aClass107_Sub1_1.anInt3323;
			local188 = (float) arg1 / (float) this.aClass107_Sub1_1.anInt3323;
			local195 = this.aFloatArrayArray1[arg4][arg3];
			local202 = this.aFloatArrayArray2[arg4][arg3];
			local209 = this.aFloatArrayArray3[arg4][arg3];
			local218 = this.aFloatArrayArray1[arg4 + 1][arg3];
			local227 = this.aFloatArrayArray2[arg4 + 1][arg3];
			@Pc(244) float local244 = local218 + local180 * (this.aFloatArrayArray1[arg4 + 1][arg3 + 1] - local218);
			@Pc(261) float local261 = local227 + (this.aFloatArrayArray2[arg4 + 1][arg3 + 1] - local227) * local180;
			@Pc(277) float local277 = local209 + (this.aFloatArrayArray3[arg4][arg3 + 1] - local209) * local180;
			@Pc(292) float local292 = local202 + local180 * (this.aFloatArrayArray2[arg4][arg3 + 1] - local202);
			local301 = this.aFloatArrayArray3[arg4 + 1][arg3];
			@Pc(317) float local317 = local195 + local180 * (this.aFloatArrayArray1[arg4][arg3 + 1] - local195);
			local101 = local188 * (local244 - local317) + local317;
			local108 = local292 + local188 * (local261 - local292);
			@Pc(350) float local350 = local301 + (this.aFloatArrayArray3[arg4 + 1][arg3 + 1] - local301) * local180;
			local115 = (local350 - local277) * local188 + local277;
		}
		local180 = this.aClass2_Sub17_1.anInt2042 - local9;
		local188 = this.aClass2_Sub17_1.anInt2041 - local23;
		local195 = this.aClass2_Sub17_1.anInt2037 - local17;
		local202 = (float) Math.sqrt((double) (local188 * local188 + local180 * local180 + local195 * local195));
		local209 = 1.0F / local202;
		local188 *= local209;
		local195 *= local209;
		local180 *= local209;
		local218 = local202 / (float) this.aClass2_Sub17_1.anInt2043;
		local227 = 1.0F - local218 * local218;
		if (local227 < 0.0F) {
			local227 = 0.0F;
		}
		local301 = local180 * local101 + local108 * local188 + local115 * local195;
		if (local301 < 0.0F) {
			local301 = 0.0F;
		}
		@Pc(523) float local523 = local227 * 2.0F * local301;
		if (local523 > 1.0F) {
			local523 = 1.0F;
		}
		@Pc(534) int local534 = this.aClass2_Sub17_1.anInt2040;
		@Pc(544) int local544 = (int) ((float) (local534 >> 16 & 0xFF) * local523);
		if (local544 > 255) {
			local544 = 255;
		}
		@Pc(560) int local560 = (int) (local523 * (float) (local534 >> 8 & 0xFF));
		if (local560 > 255) {
			local560 = 255;
		}
		@Pc(576) int local576 = (int) (local523 * (float) (local534 & 0xFF));
		if (this.aClass63_Sub2_6.aBoolean153) {
			this.aClass2_Sub16_Sub1_1.method1835((float) local9);
			this.aClass2_Sub16_Sub1_1.method1835((float) local23);
			this.aClass2_Sub16_Sub1_1.method1835((float) local17);
		} else {
			this.aClass2_Sub16_Sub1_1.method1836((float) local9);
			this.aClass2_Sub16_Sub1_1.method1836((float) local23);
			this.aClass2_Sub16_Sub1_1.method1836((float) local17);
		}
		if (local576 > 255) {
			local576 = 255;
		}
		this.aClass2_Sub16_Sub1_1.method5358(local544);
		this.aClass2_Sub16_Sub1_1.method5358(local560);
		this.aClass2_Sub16_Sub1_1.method5358(local576);
		this.aClass2_Sub16_Sub1_1.method5358(255);
		this.method578(local73);
	}
}
