import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class110 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[[Lclient!po;")
	private Class272[][] aClass272ArrayArray1;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_7;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!ida;")
	private final Class129_Sub2 aClass129_Sub2_2;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public final int anInt2852;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private final int anInt2842;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	private final int anInt2850;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	private final int anInt2843;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	private final int anInt2851;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!nv;Lclient!ida;)V")
	public Class110(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class129_Sub2 arg1) {
		this.aClass78_Sub1_7 = arg0;
		this.aClass129_Sub2_2 = arg1;
		this.anInt2852 = (this.aClass129_Sub2_2.anInt8060 * this.aClass129_Sub2_2.anInt8065 >> this.aClass78_Sub1_7.anInt8562) + 2;
		this.anInt2842 = (this.aClass129_Sub2_2.anInt8058 * this.aClass129_Sub2_2.anInt8060 >> this.aClass78_Sub1_7.anInt8562) + 2;
		this.anInt2850 = this.aClass78_Sub1_7.anInt8562 + 7 - this.aClass129_Sub2_2.anInt8066;
		this.aByteArray14 = new byte[this.anInt2842 * this.anInt2852];
		this.anInt2843 = this.aClass129_Sub2_2.anInt8065 >> this.anInt2850;
		this.anInt2851 = this.aClass129_Sub2_2.anInt8058 >> this.anInt2850;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ha;III)V")
	public void method2493(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub8_Sub4_Sub2 local6 = (Class1_Sub8_Sub4_Sub2) arg0;
		arg1 += local6.anInt9485 + 1;
		arg2 += local6.anInt9482 + 1;
		@Pc(27) int local27 = arg2 * this.anInt2852 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9483;
		@Pc(35) int local35 = local6.anInt9484;
		@Pc(41) int local41 = this.anInt2852 - local35;
		@Pc(43) int local43 = 0;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local32 -= local49;
			local29 = local49 * local35;
			arg2 = 1;
			local27 += local49 * this.anInt2852;
		}
		if (arg2 + local32 >= this.anInt2842) {
			local49 = arg2 + local32 + 1 - this.anInt2842;
			local32 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local43 = local49;
			local27 += local49;
			local41 += local49;
			local29 += local49;
			arg1 = 1;
			local35 -= local49;
		}
		if (this.anInt2852 <= arg1 + local35) {
			local49 = local35 + arg1 + 1 - this.anInt2852;
			local35 -= local49;
			local43 += local49;
			local41 += local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static481.method6667(local27, local43, this.aByteArray14, local32, local41, local29, local6.aByteArray101, local35);
			this.method2495(arg1, local35, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	private void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass272ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class272[] local50 = this.aClass272ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				if (local50[local52] != null) {
					local50[local52].aBoolean554 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ha;IB)V")
	public void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub8_Sub4_Sub2 local6 = (Class1_Sub8_Sub4_Sub2) arg1;
		arg2 += local6.anInt9485 + 1;
		arg0 += local6.anInt9482 + 1;
		@Pc(27) int local27 = this.anInt2852 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9483;
		@Pc(35) int local35 = local6.anInt9484;
		@Pc(41) int local41 = this.anInt2852 - local35;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local32 -= local51;
			local27 += this.anInt2852 * local51;
			arg0 = 1;
			local29 = local51 * local35;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt2842 <= local32 + arg0) {
			local51 = local32 + arg0 + 1 - this.anInt2842;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local41 += local51;
			local29 += local51;
			local27 += local51;
			local35 -= local51;
			arg2 = 1;
			local72 = local51;
		}
		if (this.anInt2852 <= local35 + arg2) {
			local51 = local35 + arg2 + 1 - this.anInt2852;
			local35 -= local51;
			local72 += local51;
			local41 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static186.method3012(local29, local41, local32, local72, local6.aByteArray101, this.aByteArray14, local27, local35);
			this.method2495(arg2, local35, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Lclient!ha;III)Z")
	public boolean method2497(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub8_Sub4_Sub2 local6 = (Class1_Sub8_Sub4_Sub2) arg0;
		arg2 += local6.anInt9485 + 1;
		arg1 += local6.anInt9482 + 1;
		@Pc(28) int local28 = arg2 + arg1 * this.anInt2852;
		@Pc(31) int local31 = local6.anInt9483;
		@Pc(34) int local34 = local6.anInt9484;
		@Pc(44) int local44;
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			arg1 = 1;
			local31 -= local44;
			local28 += local44 * this.anInt2852;
		}
		@Pc(63) int local63 = this.anInt2852 - local34;
		if (this.anInt2842 <= arg1 + local31) {
			local44 = local31 + arg1 + 1 - this.anInt2842;
			local31 -= local44;
		}
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local63 += local44;
			arg2 = 1;
			local28 += local44;
			local34 -= local44;
		}
		if (this.anInt2852 <= local34 + arg2) {
			local44 = arg2 + local34 + 1 - this.anInt2852;
			local63 += local44;
			local34 -= local44;
		}
		if (local34 > 0 && local31 > 0) {
			local63 += this.anInt2852 * 7;
			return Static160.method2619(this.aByteArray14, local63, local34, local31, local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public void method2499() {
		this.aClass272ArrayArray1 = new Class272[this.anInt2843][this.anInt2851];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2851; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2843; local18++) {
				this.aClass272ArrayArray1[local18][local14] = new Class272(this.aClass78_Sub1_7, this, this.aClass129_Sub2_2, local18, local14, this.anInt2850, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass272ArrayArray1[local18][local14].anInt7264 == 0) {
					this.aClass272ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIZ[[Z)V")
	public void method2500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass78_Sub1_7.method6949(false);
		this.aClass78_Sub1_7.method6953(false);
		this.aClass78_Sub1_7.method6913(1);
		this.aClass78_Sub1_7.method6943(1);
		this.aClass78_Sub1_7.method6948(false, false, -2);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass78_Sub1_7.anInt8581 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg3) {
			for (local51 = 0; local51 < this.anInt2851; local51++) {
				local58 = local51 << this.anInt2850;
				local65 = local51 + 1 << this.anInt2850;
				label138: for (local67 = 0; local67 < this.anInt2843; local67++) {
					if (this.aClass272ArrayArray1[local67][local51] != null) {
						@Pc(81) int local81 = local67 << this.anInt2850;
						@Pc(88) int local88 = local67 + 1 << this.anInt2850;
						for (@Pc(90) int local90 = local81; local90 < local88; local90++) {
							if (-arg1 <= local90 - arg0 && arg1 >= local90 - arg0) {
								for (@Pc(115) int local115 = local58; local115 < local65; local115++) {
									if (local115 - arg2 >= -arg1 && local115 - arg2 <= arg1 && arg4[arg1 + local90 - arg0][local115 + arg1 - arg2]) {
										@Pc(155) Class34_Sub1 local155 = this.aClass78_Sub1_7.method6922();
										local155.method894(local47, local47, 1.0F);
										local155.U(-local67, -local51, 0);
										this.aClass78_Sub1_7.method6909(Static175.aClass316_4);
										this.aClass272ArrayArray1[local67][local51].method5838();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt2851; local51++) {
				local58 = local51 << this.anInt2850;
				local65 = local51 + 1 << this.anInt2850;
				for (local67 = 0; local67 < this.anInt2843; local67++) {
					@Pc(238) Class272 local238 = this.aClass272ArrayArray1[local67][local51];
					if (local238 != null) {
						@Pc(249) Interface13 local249 = this.aClass78_Sub1_7.method6974(local238.anInt7264 * 3);
						@Pc(254) Buffer local254 = local249.method5603();
						if (local254 != null) {
							@Pc(262) Stream local262 = this.aClass78_Sub1_7.method6925(local254);
							@Pc(264) int local264 = 0;
							@Pc(269) int local269 = local67 << this.anInt2850;
							@Pc(276) int local276 = local67 + 1 << this.anInt2850;
							for (@Pc(278) int local278 = local58; local278 < local65; local278++) {
								if (local278 - arg2 >= -arg1 && local278 - arg2 <= arg1) {
									@Pc(308) int local308 = local278 * this.aClass129_Sub2_2.anInt8065 + local269;
									for (@Pc(310) int local310 = local269; local310 < local276; local310++) {
										if (-arg1 <= local310 - arg0 && local310 - arg0 <= arg1 && arg4[arg1 + local310 - arg0][arg1 + local278 - arg2]) {
											@Pc(351) short[] local351 = this.aClass129_Sub2_2.aShortArrayArray4[local308];
											if (local351 != null) {
												@Pc(357) int local357;
												if (Stream.b()) {
													for (local357 = 0; local357 < local351.length; local357++) {
														local264++;
														local262.b(local351[local357] & 0xFFFF);
													}
												} else {
													for (local357 = 0; local357 < local351.length; local357++) {
														local264++;
														local262.c(local351[local357] & 0xFFFF);
													}
												}
											}
										}
										local308++;
									}
								}
							}
							local262.a();
							if (local249.method5602() && local264 > 0) {
								@Pc(421) Class34_Sub1 local421 = this.aClass78_Sub1_7.method6922();
								local421.method894(local47, local47, 1.0F);
								local421.U(-local67, -local51, 0);
								this.aClass78_Sub1_7.method6909(Static175.aClass316_4);
								local238.method5837(local249, local264 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass78_Sub1_7.method6920();
	}
}
