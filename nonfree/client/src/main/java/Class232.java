import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class232 {

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "[[Lclient!eg;")
	private Class78[][] aClass78ArrayArray1;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_19;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "Lclient!lw;")
	private final Class199_Sub1 aClass199_Sub1_1;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	public final int anInt7358;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
	private final int anInt7362;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
	private final int anInt7359;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	private final int anInt7354;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
	private final int anInt7355;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!wu;Lclient!lw;)V")
	public Class232(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class199_Sub1 arg1) {
		this.aClass100_Sub1_19 = arg0;
		this.aClass199_Sub1_1 = arg1;
		this.anInt7358 = (this.aClass199_Sub1_1.anInt10112 * this.aClass199_Sub1_1.anInt10111 >> this.aClass100_Sub1_19.anInt7124) + 2;
		this.anInt7362 = (this.aClass199_Sub1_1.anInt10112 * this.aClass199_Sub1_1.anInt10110 >> this.aClass100_Sub1_19.anInt7124) + 2;
		this.aByteArray71 = new byte[this.anInt7362 * this.anInt7358];
		this.anInt7359 = this.aClass100_Sub1_19.anInt7124 + 7 - this.aClass199_Sub1_1.anInt10104;
		this.anInt7354 = this.aClass199_Sub1_1.anInt10111 >> this.anInt7359;
		this.anInt7355 = this.aClass199_Sub1_1.anInt10110 >> this.anInt7359;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLclient!r;II)V")
	public void method6333(@OriginalArg(1) Class6_Sub2_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub16_Sub2 local6 = (Class6_Sub2_Sub16_Sub2) arg0;
		arg2 += local6.anInt10369 + 1;
		arg1 += local6.anInt10364 + 1;
		@Pc(27) int local27 = arg2 * this.anInt7358 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt10367;
		@Pc(41) int local41 = local6.anInt10368;
		@Pc(47) int local47 = this.anInt7358 - local41;
		@Pc(49) int local49 = 0;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local29 = local56 * local41;
			local32 -= local56;
			local27 += this.anInt7358 * local56;
			arg2 = 1;
		}
		if (local32 + arg2 >= this.anInt7362) {
			local56 = local32 + arg2 + 1 - this.anInt7362;
			local32 -= local56;
		}
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local27 += local56;
			local29 += local56;
			arg1 = 1;
			local41 -= local56;
			local47 += local56;
			local49 = local56;
		}
		if (local41 + arg1 >= this.anInt7358) {
			local56 = local41 + arg1 + 1 - this.anInt7358;
			local47 += local56;
			local49 += local56;
			local41 -= local56;
		}
		if (local41 > 0 && local32 > 0) {
			Static286.method4988(this.aByteArray71, local27, local41, local29, local47, local49, local32, local6.aByteArray122);
			this.method6338(local41, local32, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
	public void method6334() {
		this.aClass78ArrayArray1 = new Class78[this.anInt7354][this.anInt7355];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7355; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7354; local18++) {
				this.aClass78ArrayArray1[local18][local14] = new Class78(this.aClass100_Sub1_19, this, this.aClass199_Sub1_1, local18, local14, this.anInt7359, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass78ArrayArray1[local18][local14].anInt2429 == 0) {
					this.aClass78ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[[ZIZIZ)V")
	public void method6335(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass100_Sub1_19.method6075(false);
		this.aClass100_Sub1_19.method6133(false);
		this.aClass100_Sub1_19.method6144(1);
		this.aClass100_Sub1_19.method6092(1);
		this.aClass100_Sub1_19.method6137(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass100_Sub1_19.anInt7141 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg4) {
			for (local45 = 0; local45 < this.anInt7355; local45++) {
				local52 = local45 << this.anInt7359;
				local59 = local45 + 1 << this.anInt7359;
				label138: for (local61 = 0; local61 < this.anInt7354; local61++) {
					if (this.aClass78ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt7359;
						@Pc(82) int local82 = local61 + 1 << this.anInt7359;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (-arg0 <= local84 - arg2 && arg0 >= local84 - arg2) {
								for (@Pc(108) int local108 = local52; local108 < local59; local108++) {
									if (-arg0 <= local108 - arg3 && local108 - arg3 <= arg0 && arg1[arg0 + local84 - arg2][local108 + arg0 - arg3]) {
										@Pc(147) Class154_Sub2 local147 = this.aClass100_Sub1_19.method6038();
										local147.method4517(local41, 1.0F, local41);
										local147.method6570(-local61, -local45, 0);
										this.aClass100_Sub1_19.method6030(Static104.aClass377_2);
										this.aClass78ArrayArray1[local61][local45].method2051();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt7355; local45++) {
				local52 = local45 << this.anInt7359;
				local59 = local45 + 1 << this.anInt7359;
				for (local61 = 0; local61 < this.anInt7354; local61++) {
					@Pc(230) Class78 local230 = this.aClass78ArrayArray1[local61][local45];
					if (local230 != null) {
						@Pc(241) Interface11 local241 = this.aClass100_Sub1_19.method6143(local230.anInt2429 * 3);
						@Pc(246) Buffer local246 = local241.method3077();
						if (local246 != null) {
							@Pc(254) Stream local254 = this.aClass100_Sub1_19.method6131(local246);
							@Pc(256) int local256 = 0;
							@Pc(261) int local261 = local61 << this.anInt7359;
							@Pc(268) int local268 = local61 + 1 << this.anInt7359;
							for (@Pc(270) int local270 = local52; local270 < local59; local270++) {
								if (-arg0 <= local270 - arg3 && local270 - arg3 <= arg0) {
									@Pc(301) int local301 = local270 * this.aClass199_Sub1_1.anInt10111 + local261;
									for (@Pc(303) int local303 = local261; local303 < local268; local303++) {
										if (-arg0 <= local303 - arg2 && local303 - arg2 <= arg0 && arg1[arg0 + local303 - arg2][local270 + arg0 - arg3]) {
											@Pc(344) short[] local344 = this.aClass199_Sub1_1.aShortArrayArray8[local301];
											if (local344 != null) {
												@Pc(350) int local350;
												if (Stream.b()) {
													for (local350 = 0; local350 < local344.length; local350++) {
														local254.d(local344[local350] & 0xFFFF);
														local256++;
													}
												} else {
													for (local350 = 0; local350 < local344.length; local350++) {
														local256++;
														local254.a(local344[local350] & 0xFFFF);
													}
												}
											}
										}
										local301++;
									}
								}
							}
							local254.c();
							if (local241.method3078() && local256 > 0) {
								@Pc(413) Class154_Sub2 local413 = this.aClass100_Sub1_19.method6038();
								local413.method4517(local41, 1.0F, local41);
								local413.method6570(-local61, -local45, 0);
								this.aClass100_Sub1_19.method6030(Static104.aClass377_2);
								local230.method2052(local241, local256 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass100_Sub1_19.method6149();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIII)V")
	private void method6338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass78ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(41) int local41 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class78[] local50 = this.aClass78ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				if (local50[local52] != null) {
					local50[local52].aBoolean180 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBILclient!r;)Z")
	public boolean method6340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub16 arg2) {
		@Pc(20) Class6_Sub2_Sub16_Sub2 local20 = (Class6_Sub2_Sub16_Sub2) arg2;
		arg1 += local20.anInt10364 + 1;
		arg0 += local20.anInt10369 + 1;
		@Pc(41) int local41 = arg0 * this.anInt7358 + arg1;
		@Pc(44) int local44 = local20.anInt10367;
		@Pc(47) int local47 = local20.anInt10368;
		@Pc(53) int local53 = this.anInt7358 - local47;
		@Pc(60) int local60;
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			local44 -= local60;
			local41 += this.anInt7358 * local60;
			arg0 = 1;
		}
		if (local44 + arg0 >= this.anInt7362) {
			local60 = arg0 + local44 + 1 - this.anInt7362;
			local44 -= local60;
		}
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local47 -= local60;
			arg1 = 1;
			local41 += local60;
			local53 += local60;
		}
		if (local47 + arg1 >= this.anInt7358) {
			local60 = local47 + arg1 + 1 - this.anInt7358;
			local47 -= local60;
			local53 += local60;
		}
		if (local47 > 0 && local44 > 0) {
			local53 += this.anInt7358 * 7;
			return Static188.method4863(local47, this.aByteArray71, local44, local53, local41);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!r;I)V")
	public void method6341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub16 arg2) {
		@Pc(6) Class6_Sub2_Sub16_Sub2 local6 = (Class6_Sub2_Sub16_Sub2) arg2;
		arg0 += local6.anInt10369 + 1;
		arg1 += local6.anInt10364 + 1;
		@Pc(27) int local27 = arg1 + this.anInt7358 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt10367;
		@Pc(40) int local40 = local6.anInt10368;
		@Pc(45) int local45 = this.anInt7358 - local40;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local32 -= local55;
			local27 += this.anInt7358 * local55;
			local29 = local55 * local40;
			arg0 = 1;
		}
		@Pc(76) int local76 = 0;
		if (this.anInt7362 <= arg0 + local32) {
			local55 = arg0 + local32 + 1 - this.anInt7362;
			local32 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local27 += local55;
			local76 = local55;
			local40 -= local55;
			local29 += local55;
			local45 += local55;
			arg1 = 1;
		}
		if (arg1 + local40 >= this.anInt7358) {
			local55 = arg1 + local40 + 1 - this.anInt7358;
			local40 -= local55;
			local76 += local55;
			local45 += local55;
		}
		if (local40 > 0 && local32 > 0) {
			Static602.method8462(local45, local32, this.aByteArray71, local6.aByteArray122, local29, local27, local76, local40);
			this.method6338(local40, local32, arg1, arg0);
		}
	}
}
