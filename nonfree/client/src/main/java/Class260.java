import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class260 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[[Lclient!hi;")
	private Class127[][] aClass127ArrayArray1;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "Lclient!ml;")
	private final Class7_Sub3 aClass7_Sub3_2;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_14;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
	public final int anInt7497;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
	private final int anInt7503;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	private final int anInt7502;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	private final int anInt7504;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
	private final int anInt7505;

	static {
		new Class45("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!bda;Lclient!ml;)V")
	public Class260(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		this.aClass7_Sub3_2 = arg1;
		this.aClass4_Sub2_14 = arg0;
		this.anInt7497 = (this.aClass7_Sub3_2.anInt9577 * this.aClass7_Sub3_2.anInt9576 >> this.aClass4_Sub2_14.anInt8290) + 2;
		this.anInt7503 = (this.aClass7_Sub3_2.anInt9575 * this.aClass7_Sub3_2.anInt9576 >> this.aClass4_Sub2_14.anInt8290) + 2;
		this.aByteArray98 = new byte[this.anInt7503 * this.anInt7497];
		this.anInt7502 = this.aClass4_Sub2_14.anInt8290 + 7 - this.aClass7_Sub3_2.anInt9573;
		this.anInt7504 = this.aClass7_Sub3_2.anInt9577 >> this.anInt7502;
		this.anInt7505 = this.aClass7_Sub3_2.anInt9575 >> this.anInt7502;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIB)V")
	private void method6704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass127ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(39) int local39 = arg2 + arg0 - 2 >> 7;
		for (@Pc(45) int local45 = local15; local45 <= local25; local45++) {
			@Pc(52) Class127[] local52 = this.aClass127ArrayArray1[local45];
			for (@Pc(54) int local54 = local31; local54 <= local39; local54++) {
				local52[local54].aBoolean307 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	public void method6705() {
		this.aClass127ArrayArray1 = new Class127[this.anInt7504][this.anInt7505];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7505; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7504; local18++) {
				this.aClass127ArrayArray1[local18][local14] = new Class127(this.aClass4_Sub2_14, this, this.aClass7_Sub3_2, local18, local14, this.anInt7502, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!k;II)V")
	public void method6707(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub2_Sub2_Sub1 local6 = (Class1_Sub2_Sub2_Sub1) arg1;
		arg2 += local6.anInt1044 + 1;
		arg0 += local6.anInt1048 + 1;
		@Pc(27) int local27 = this.anInt7497 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = local6.anInt1041;
		@Pc(39) int local39 = local6.anInt1043;
		@Pc(45) int local45 = this.anInt7497 - local39;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local36 -= local54;
			local29 = local54 * local39;
			local27 += local54 * this.anInt7497;
			arg0 = 1;
		}
		@Pc(75) int local75 = 0;
		if (local36 + arg0 >= this.anInt7503) {
			local54 = arg0 + local36 + 1 - this.anInt7503;
			local36 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local39 -= local54;
			local45 += local54;
			local27 += local54;
			local29 += local54;
			arg2 = 1;
			local75 = local54;
		}
		if (local39 + arg2 >= this.anInt7497) {
			local54 = arg2 + local39 + 1 - this.anInt7497;
			local75 += local54;
			local45 += local54;
			local39 -= local54;
		}
		if (local39 > 0 && local36 > 0) {
			Static82.method1814(this.aByteArray98, local27, local75, local29, local39, local36, local45, local6.aByteArray10);
			this.method6704(arg0, arg2, local36, local39);
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(ILclient!k;II)V")
	public void method6708(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub2_Sub2_Sub1 local6 = (Class1_Sub2_Sub2_Sub1) arg1;
		arg2 += local6.anInt1044 + 1;
		arg0 += local6.anInt1048 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt7497;
		@Pc(30) int local30 = 0;
		@Pc(41) int local41 = local6.anInt1041;
		@Pc(44) int local44 = local6.anInt1043;
		@Pc(50) int local50 = this.anInt7497 - local44;
		@Pc(52) int local52 = 0;
		@Pc(62) int local62;
		if (arg0 <= 0) {
			local62 = 1 - arg0;
			local28 += this.anInt7497 * local62;
			local30 = local62 * local44;
			local41 -= local62;
			arg0 = 1;
		}
		if (arg0 + local41 >= this.anInt7503) {
			local62 = arg0 + local41 + 1 - this.anInt7503;
			local41 -= local62;
		}
		if (arg2 <= 0) {
			local62 = 1 - arg2;
			local30 += local62;
			arg2 = 1;
			local50 += local62;
			local44 -= local62;
			local52 = local62;
			local28 += local62;
		}
		if (arg2 + local44 >= this.anInt7497) {
			local62 = local44 + arg2 + 1 - this.anInt7497;
			local52 += local62;
			local50 += local62;
			local44 -= local62;
		}
		if (local44 > 0 && local41 > 0) {
			Static384.method6159(local50, local44, local52, local41, local30, this.aByteArray98, local6.aByteArray10, local28);
			this.method6704(arg0, arg2, local41, local44);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILclient!k;)Z")
	public boolean method6709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub2 arg2) {
		@Pc(6) Class1_Sub2_Sub2_Sub1 local6 = (Class1_Sub2_Sub2_Sub1) arg2;
		arg1 += local6.anInt1044 + 1;
		arg0 += local6.anInt1048 + 1;
		@Pc(28) int local28 = arg1 + this.anInt7497 * arg0;
		@Pc(37) int local37 = local6.anInt1041;
		@Pc(40) int local40 = local6.anInt1043;
		@Pc(46) int local46 = this.anInt7497 - local40;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local37 -= local53;
			local28 += this.anInt7497 * local53;
		}
		if (this.anInt7503 <= arg0 + local37) {
			local53 = local37 + arg0 + 1 - this.anInt7503;
			local37 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			arg1 = 1;
			local28 += local53;
			local46 += local53;
			local40 -= local53;
		}
		if (this.anInt7497 <= local40 + arg1) {
			local53 = local40 + arg1 + 1 - this.anInt7497;
			local46 += local53;
			local40 -= local53;
		}
		if (local40 > 0 && local37 > 0) {
			local46 += this.anInt7497 * 7;
			return Static437.method4253(local40, local37, local46, this.aByteArray98, local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BZII[[ZI)V")
	public void method6710(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass4_Sub2_14.method7299(false);
		this.aClass4_Sub2_14.method7348(false);
		this.aClass4_Sub2_14.method7228(1);
		this.aClass4_Sub2_14.method7279(1);
		this.aClass4_Sub2_14.method7281(-2, false, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass4_Sub2_14.anInt8297 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg0) {
			for (local53 = 0; local53 < this.anInt7505; local53++) {
				local60 = local53 << this.anInt7502;
				local67 = local53 + 1 << this.anInt7502;
				label132: for (local69 = 0; local69 < this.anInt7504; local69++) {
					@Pc(76) int local76 = local69 << this.anInt7502;
					@Pc(83) int local83 = local69 + 1 << this.anInt7502;
					for (@Pc(85) int local85 = local76; local85 < local83; local85++) {
						if (-arg4 <= local85 - arg1 && local85 - arg1 <= arg4) {
							for (@Pc(106) int local106 = local60; local106 < local67; local106++) {
								if (local106 - arg2 >= -arg4 && local106 - arg2 <= arg4 && arg3[local85 + arg4 - arg1][arg4 + local106 - arg2]) {
									@Pc(150) Class128_Sub3 local150 = this.aClass4_Sub2_14.method7349();
									local150.method6895(local41, 1.0F, local41);
									local150.TA(-local69, -local53, 0);
									this.aClass4_Sub2_14.method7272(Static333.aClass107_5);
									this.aClass127ArrayArray1[local69][local53].method3513();
									continue label132;
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt7505; local53++) {
				local60 = local53 << this.anInt7502;
				local67 = local53 + 1 << this.anInt7502;
				for (local69 = 0; local69 < this.anInt7504; local69++) {
					@Pc(233) Class127 local233 = this.aClass127ArrayArray1[local69][local53];
					@Pc(242) Interface9 local242 = this.aClass4_Sub2_14.method7262(local233.anInt3755 * 3);
					@Pc(247) Buffer local247 = local242.method7613();
					if (local247 != null) {
						@Pc(255) Stream local255 = this.aClass4_Sub2_14.method7263(local247);
						@Pc(257) int local257 = 0;
						@Pc(262) int local262 = local69 << this.anInt7502;
						@Pc(269) int local269 = local69 + 1 << this.anInt7502;
						for (@Pc(271) int local271 = local60; local271 < local67; local271++) {
							if (-arg4 <= local271 - arg2 && arg4 >= local271 - arg2) {
								@Pc(298) int local298 = local262 + local271 * this.aClass7_Sub3_2.anInt9577;
								for (@Pc(300) int local300 = local262; local300 < local269; local300++) {
									if (local300 - arg1 >= -arg4 && arg4 >= local300 - arg1 && arg3[arg4 + local300 - arg1][arg4 + local271 - arg2]) {
										@Pc(340) short[] local340 = this.aClass7_Sub3_2.aShortArrayArray6[local298];
										if (local340 != null) {
											@Pc(346) int local346;
											if (Stream.a()) {
												for (local346 = 0; local346 < local340.length; local346++) {
													local257++;
													local255.c(local340[local346] & 0xFFFF);
												}
											} else {
												for (local346 = 0; local346 < local340.length; local346++) {
													local255.d(local340[local346] & 0xFFFF);
													local257++;
												}
											}
										}
									}
									local298++;
								}
							}
						}
						local255.b();
						if (local242.method7614() && local257 > 0) {
							@Pc(409) Class128_Sub3 local409 = this.aClass4_Sub2_14.method7349();
							local409.method6895(local41, 1.0F, local41);
							local409.TA(-local69, -local53, 0);
							this.aClass4_Sub2_14.method7272(Static333.aClass107_5);
							local233.method3509(local257 / 3, local242);
						}
					}
				}
			}
		}
		this.aClass4_Sub2_14.method7290();
	}
}
