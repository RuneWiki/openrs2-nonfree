import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class194 {

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "[[Lclient!ku;")
	private Class205[][] aClass205ArrayArray1;

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_12;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "Lclient!sl;")
	private final Class18_Sub3 aClass18_Sub3_3;

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
	public final int anInt5546;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
	private final int anInt5543;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	private final int anInt5539;

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
	private final int anInt5544;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
	private final int anInt5541;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!mj;Lclient!sl;)V")
	public Class194(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Class18_Sub3 arg1) {
		this.aClass101_Sub1_12 = arg0;
		this.aClass18_Sub3_3 = arg1;
		this.anInt5546 = (this.aClass18_Sub3_3.anInt9741 * this.aClass18_Sub3_3.anInt9739 >> this.aClass101_Sub1_12.anInt6632) + 2;
		this.anInt5543 = (this.aClass18_Sub3_3.anInt9739 * this.aClass18_Sub3_3.anInt9742 >> this.aClass101_Sub1_12.anInt6632) + 2;
		this.anInt5539 = this.aClass101_Sub1_12.anInt6632 + 7 - this.aClass18_Sub3_3.anInt9740;
		this.aByteArray45 = new byte[this.anInt5543 * this.anInt5546];
		this.anInt5544 = this.aClass18_Sub3_3.anInt9741 >> this.anInt5539;
		this.anInt5541 = this.aClass18_Sub3_3.anInt9742 >> this.anInt5539;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	public void method5021() {
		this.aClass205ArrayArray1 = new Class205[this.anInt5544][this.anInt5541];
		for (@Pc(20) int local20 = 0; local20 < this.anInt5541; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt5544; local24++) {
				this.aClass205ArrayArray1[local24][local20] = new Class205(this.aClass101_Sub1_12, this, this.aClass18_Sub3_3, local24, local20, this.anInt5539, local24 * 128 + 1, local20 * 128 + 1);
				if (this.aClass205ArrayArray1[local24][local20].anInt5936 == 0) {
					this.aClass205ArrayArray1[local24][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I[[ZZIII)V")
	public void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aClass101_Sub1_12.method5836(false);
		this.aClass101_Sub1_12.method5864(false);
		this.aClass101_Sub1_12.method5963(1);
		this.aClass101_Sub1_12.method5840(1);
		this.aClass101_Sub1_12.method5873(-2, false, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass101_Sub1_12.anInt6622 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg2) {
			for (local53 = 0; local53 < this.anInt5541; local53++) {
				local60 = local53 << this.anInt5539;
				local67 = local53 + 1 << this.anInt5539;
				label138: for (local69 = 0; local69 < this.anInt5544; local69++) {
					if (this.aClass205ArrayArray1[local69][local53] != null) {
						@Pc(83) int local83 = local69 << this.anInt5539;
						@Pc(90) int local90 = local69 + 1 << this.anInt5539;
						for (@Pc(92) int local92 = local83; local92 < local90; local92++) {
							if (local92 - arg3 >= -arg0 && local92 - arg3 <= arg0) {
								for (@Pc(112) int local112 = local60; local112 < local67; local112++) {
									if (local112 - arg4 >= -arg0 && local112 - arg4 <= arg0 && arg1[arg0 + local92 - arg3][arg0 + local112 - arg4]) {
										@Pc(150) Class76_Sub2 local150 = this.aClass101_Sub1_12.method5832();
										local150.method7334(local49, 1.0F, local49);
										local150.method9640(-local69, -local53, 0);
										this.aClass101_Sub1_12.method5902(Static174.aClass327_1);
										this.aClass205ArrayArray1[local69][local53].method5372();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt5541; local53++) {
				local60 = local53 << this.anInt5539;
				local67 = local53 + 1 << this.anInt5539;
				for (local69 = 0; local69 < this.anInt5544; local69++) {
					@Pc(241) Class205 local241 = this.aClass205ArrayArray1[local69][local53];
					if (local241 != null) {
						@Pc(252) Interface24 local252 = this.aClass101_Sub1_12.method5830(local241.anInt5936 * 3);
						@Pc(257) Buffer local257 = local252.method6460();
						if (local257 != null) {
							@Pc(265) Stream local265 = this.aClass101_Sub1_12.method5942(local257);
							@Pc(267) int local267 = 0;
							@Pc(272) int local272 = local69 << this.anInt5539;
							@Pc(279) int local279 = local69 + 1 << this.anInt5539;
							for (@Pc(281) int local281 = local60; local281 < local67; local281++) {
								if (-arg0 <= local281 - arg4 && local281 - arg4 <= arg0) {
									@Pc(311) int local311 = local272 + this.aClass18_Sub3_3.anInt9741 * local281;
									for (@Pc(313) int local313 = local272; local313 < local279; local313++) {
										if (local313 - arg3 >= -arg0 && arg0 >= local313 - arg3 && arg1[arg0 + local313 - arg3][local281 + arg0 - arg4]) {
											@Pc(354) short[] local354 = this.aClass18_Sub3_3.aShortArrayArray18[local311];
											if (local354 != null) {
												@Pc(360) int local360;
												if (Stream.c()) {
													for (local360 = 0; local360 < local354.length; local360++) {
														local265.c(local354[local360] & 0xFFFF);
														local267++;
													}
												} else {
													for (local360 = 0; local360 < local354.length; local360++) {
														local267++;
														local265.a(local354[local360] & 0xFFFF);
													}
												}
											}
										}
										local311++;
									}
								}
							}
							local265.a();
							if (local252.method6459() && local267 > 0) {
								@Pc(424) Class76_Sub2 local424 = this.aClass101_Sub1_12.method5832();
								local424.method7334(local49, 1.0F, local49);
								local424.method9640(-local69, -local53, 0);
								this.aClass101_Sub1_12.method5902(Static174.aClass327_1);
								local241.method5368(local252, local267 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass101_Sub1_12.method5952();
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!r;III)V")
	public void method5025(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub1_Sub11_Sub2 local6 = (Class2_Sub1_Sub11_Sub2) arg0;
		arg2 += local6.anInt9352 + 1;
		arg1 += local6.anInt9362 + 1;
		@Pc(27) int local27 = this.anInt5546 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9355;
		@Pc(35) int local35 = local6.anInt9356;
		@Pc(41) int local41 = this.anInt5546 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local27 += local50 * this.anInt5546;
			local32 -= local50;
			arg2 = 1;
			local29 = local50 * local35;
		}
		if (this.anInt5543 <= local32 + arg2) {
			local50 = local32 + arg2 + 1 - this.anInt5543;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local43 = local50;
			arg1 = 1;
			local27 += local50;
			local29 += local50;
			local35 -= local50;
			local41 += local50;
		}
		if (arg1 + local35 >= this.anInt5546) {
			local50 = local35 + arg1 + 1 - this.anInt5546;
			local43 += local50;
			local41 += local50;
			local35 -= local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static24.method453(local41, local29, local43, this.aByteArray45, local27, local32, local35, local6.aByteArray85);
			this.method5028(arg1, arg2, local35, local32);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILclient!r;I)V")
	public void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub11 arg2) {
		@Pc(6) Class2_Sub1_Sub11_Sub2 local6 = (Class2_Sub1_Sub11_Sub2) arg2;
		arg0 += local6.anInt9352 + 1;
		arg1 += local6.anInt9362 + 1;
		@Pc(31) int local31 = arg1 + this.anInt5546 * arg0;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local6.anInt9355;
		@Pc(39) int local39 = local6.anInt9356;
		@Pc(45) int local45 = this.anInt5546 - local39;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			arg0 = 1;
			local36 -= local52;
			local33 = local39 * local52;
			local31 += local52 * this.anInt5546;
		}
		@Pc(73) int local73 = 0;
		if (this.anInt5543 <= local36 + arg0) {
			local52 = local36 + arg0 + 1 - this.anInt5543;
			local36 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local73 = local52;
			local33 += local52;
			local45 += local52;
			arg1 = 1;
			local39 -= local52;
			local31 += local52;
		}
		if (this.anInt5546 <= local39 + arg1) {
			local52 = arg1 + local39 + 1 - this.anInt5546;
			local39 -= local52;
			local45 += local52;
			local73 += local52;
		}
		if (local39 > 0 && local36 > 0) {
			Static31.method524(local45, local31, local73, local33, this.aByteArray45, local6.aByteArray85, local39, local36);
			this.method5028(arg1, arg0, local39, local36);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BIILclient!r;)Z")
	public boolean method5027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub11 arg2) {
		@Pc(6) Class2_Sub1_Sub11_Sub2 local6 = (Class2_Sub1_Sub11_Sub2) arg2;
		arg0 += local6.anInt9362 + 1;
		arg1 += local6.anInt9352 + 1;
		@Pc(32) int local32 = arg1 * this.anInt5546 + arg0;
		@Pc(35) int local35 = local6.anInt9355;
		@Pc(38) int local38 = local6.anInt9356;
		@Pc(44) int local44 = this.anInt5546 - local38;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local35 -= local51;
			arg1 = 1;
			local32 += this.anInt5546 * local51;
		}
		if (this.anInt5543 <= arg1 + local35) {
			local51 = arg1 + local35 + 1 - this.anInt5543;
			local35 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local32 += local51;
			arg0 = 1;
			local44 += local51;
			local38 -= local51;
		}
		if (arg0 + local38 >= this.anInt5546) {
			local51 = arg0 + local38 + 1 - this.anInt5546;
			local44 += local51;
			local38 -= local51;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt5546 * 7;
			return Static540.method8288(local38, local32, this.aByteArray45, local44, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIII)V")
	private void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass205ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(42) int local42 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local25; local52++) {
			@Pc(59) Class205[] local59 = this.aClass205ArrayArray1[local52];
			for (@Pc(61) int local61 = local31; local61 <= local42; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean438 = true;
				}
			}
		}
	}
}
