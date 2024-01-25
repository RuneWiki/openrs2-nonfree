import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class277 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "[[Lclient!ms;")
	private Class217[][] aClass217ArrayArray1;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_16;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!os;")
	private final Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public final int anInt8440;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	private final int anInt8437;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	private final int anInt8436;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	private final int anInt8439;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	private final int anInt8435;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!fc;Lclient!os;)V")
	public Class277(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		this.aClass15_Sub2_16 = arg0;
		this.aClass4_Sub2_2 = arg1;
		this.anInt8440 = (this.aClass4_Sub2_2.anInt10458 * this.aClass4_Sub2_2.anInt10461 >> this.aClass15_Sub2_16.anInt6526) + 2;
		this.anInt8437 = (this.aClass4_Sub2_2.anInt10459 * this.aClass4_Sub2_2.anInt10458 >> this.aClass15_Sub2_16.anInt6526) + 2;
		this.aByteArray91 = new byte[this.anInt8440 * this.anInt8437];
		this.anInt8436 = this.aClass15_Sub2_16.anInt6526 + 7 - this.aClass4_Sub2_2.anInt10463;
		this.anInt8439 = this.aClass4_Sub2_2.anInt10461 >> this.anInt8436;
		this.anInt8435 = this.aClass4_Sub2_2.anInt10459 >> this.anInt8436;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method6916() {
		this.aClass217ArrayArray1 = new Class217[this.anInt8439][this.anInt8435];
		for (@Pc(18) int local18 = 0; local18 < this.anInt8435; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt8439; local22++) {
				this.aClass217ArrayArray1[local22][local18] = new Class217(this.aClass15_Sub2_16, this, this.aClass4_Sub2_2, local22, local18, this.anInt8436, local22 * 128 + 1, local18 * 128 + 1);
				if (this.aClass217ArrayArray1[local22][local18].anInt6944 == 0) {
					this.aClass217ArrayArray1[local22][local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!w;III)V")
	public void method6918(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub2_Sub2 local6 = (Class3_Sub4_Sub2_Sub2) arg0;
		arg1 += local6.anInt3343 + 1;
		arg2 += local6.anInt3347 + 1;
		@Pc(27) int local27 = this.anInt8440 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3344;
		@Pc(41) int local41 = local6.anInt3349;
		@Pc(47) int local47 = this.anInt8440 - local41;
		@Pc(49) int local49 = 0;
		@Pc(59) int local59;
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local29 = local41 * local59;
			arg1 = 1;
			local27 += local59 * this.anInt8440;
			local32 -= local59;
		}
		if (this.anInt8437 <= arg1 + local32) {
			local59 = arg1 + local32 + 1 - this.anInt8437;
			local32 -= local59;
		}
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			local47 += local59;
			arg2 = 1;
			local41 -= local59;
			local27 += local59;
			local49 = local59;
			local29 += local59;
		}
		if (this.anInt8440 <= arg2 + local41) {
			local59 = local41 + arg2 + 1 - this.anInt8440;
			local49 += local59;
			local41 -= local59;
			local47 += local59;
		}
		if (local41 > 0 && local32 > 0) {
			Static178.method3155(local41, local27, local32, local49, local6.aByteArray48, local47, this.aByteArray91, local29);
			this.method6919(arg2, local32, local41, arg1);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBI)V")
	private void method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass217ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(41) int local41 = arg3 - 1 >> 7;
		@Pc(52) int local52 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(54) int local54 = local15; local54 <= local25; local54++) {
			@Pc(61) Class217[] local61 = this.aClass217ArrayArray1[local54];
			for (@Pc(63) int local63 = local41; local63 <= local52; local63++) {
				if (local61[local63] != null) {
					local61[local63].aBoolean586 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!w;II)V")
	public void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub4_Sub2_Sub2 local6 = (Class3_Sub4_Sub2_Sub2) arg1;
		arg0 += local6.anInt3347 + 1;
		arg2 += local6.anInt3343 + 1;
		@Pc(27) int local27 = arg0 + this.anInt8440 * arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3344;
		@Pc(35) int local35 = local6.anInt3349;
		@Pc(41) int local41 = this.anInt8440 - local35;
		@Pc(51) int local51;
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local29 = local51 * local35;
			local27 += local51 * this.anInt8440;
			local32 -= local51;
			arg2 = 1;
		}
		@Pc(72) int local72 = 0;
		if (local32 + arg2 >= this.anInt8437) {
			local51 = local32 + arg2 + 1 - this.anInt8437;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local27 += local51;
			arg0 = 1;
			local72 = local51;
			local35 -= local51;
			local41 += local51;
			local29 += local51;
		}
		if (arg0 + local35 >= this.anInt8440) {
			local51 = local35 + arg0 + 1 - this.anInt8440;
			local35 -= local51;
			local41 += local51;
			local72 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static566.method8139(local29, local41, local72, local32, this.aByteArray91, local6.aByteArray48, local27, local35);
			this.method6919(arg0, local32, local35, arg2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III[[ZIZ)V")
	public void method6922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass15_Sub2_16.method5403(false);
		this.aClass15_Sub2_16.method5399(false);
		this.aClass15_Sub2_16.method5460(1);
		this.aClass15_Sub2_16.method5372(1);
		this.aClass15_Sub2_16.method5359(false, false, -2);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass15_Sub2_16.anInt6519 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg4) {
			for (local51 = 0; local51 < this.anInt8435; local51++) {
				local58 = local51 << this.anInt8436;
				local65 = local51 + 1 << this.anInt8436;
				label138: for (local67 = 0; local67 < this.anInt8439; local67++) {
					if (this.aClass217ArrayArray1[local67][local51] != null) {
						@Pc(81) int local81 = local67 << this.anInt8436;
						@Pc(88) int local88 = local67 + 1 << this.anInt8436;
						for (@Pc(90) int local90 = local81; local90 < local88; local90++) {
							if (-arg1 <= local90 - arg0 && local90 - arg0 <= arg1) {
								for (@Pc(107) int local107 = local58; local107 < local65; local107++) {
									if (-arg1 <= local107 - arg3 && arg1 >= local107 - arg3 && arg2[local90 + arg1 - arg0][local107 + arg1 - arg3]) {
										@Pc(147) Class255_Sub3 local147 = this.aClass15_Sub2_16.method5465();
										local147.method8042(1.0F, local47, local47);
										local147.G(-local67, -local51, 0);
										this.aClass15_Sub2_16.method5485(Static317.aClass359_13);
										this.aClass217ArrayArray1[local67][local51].method5782();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt8435; local51++) {
				local58 = local51 << this.anInt8436;
				local65 = local51 + 1 << this.anInt8436;
				for (local67 = 0; local67 < this.anInt8439; local67++) {
					@Pc(230) Class217 local230 = this.aClass217ArrayArray1[local67][local51];
					if (local230 != null) {
						@Pc(241) Interface20 local241 = this.aClass15_Sub2_16.method5474(local230.anInt6944 * 3);
						@Pc(246) Buffer local246 = local241.method6243();
						if (local246 != null) {
							@Pc(254) Stream local254 = this.aClass15_Sub2_16.method5409(local246);
							@Pc(256) int local256 = 0;
							@Pc(261) int local261 = local67 << this.anInt8436;
							@Pc(268) int local268 = local67 + 1 << this.anInt8436;
							for (@Pc(270) int local270 = local58; local270 < local65; local270++) {
								if (-arg1 <= local270 - arg3 && arg1 >= local270 - arg3) {
									@Pc(293) int local293 = local270 * this.aClass4_Sub2_2.anInt10461 + local261;
									for (@Pc(295) int local295 = local261; local295 < local268; local295++) {
										if (-arg1 <= local295 - arg0 && local295 - arg0 <= arg1 && arg2[arg1 + local295 - arg0][arg1 + local270 - arg3]) {
											@Pc(334) short[] local334 = this.aClass4_Sub2_2.aShortArrayArray10[local293];
											if (local334 != null) {
												@Pc(340) int local340;
												if (Stream.b()) {
													for (local340 = 0; local340 < local334.length; local340++) {
														local256++;
														local254.f(local334[local340] & 0xFFFF);
													}
												} else {
													for (local340 = 0; local340 < local334.length; local340++) {
														local254.d(local334[local340] & 0xFFFF);
														local256++;
													}
												}
											}
										}
										local293++;
									}
								}
							}
							local254.a();
							if (local241.method6241() && local256 > 0) {
								@Pc(404) Class255_Sub3 local404 = this.aClass15_Sub2_16.method5465();
								local404.method8042(1.0F, local47, local47);
								local404.G(-local67, -local51, 0);
								this.aClass15_Sub2_16.method5485(Static317.aClass359_13);
								local230.method5781(local256 / 3, local241);
							}
						}
					}
				}
			}
		}
		this.aClass15_Sub2_16.method5442();
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!w;III)Z")
	public boolean method6924(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub2_Sub2 local6 = (Class3_Sub4_Sub2_Sub2) arg0;
		arg1 += local6.anInt3347 + 1;
		arg2 += local6.anInt3343 + 1;
		@Pc(27) int local27 = this.anInt8440 * arg2 + arg1;
		@Pc(30) int local30 = local6.anInt3344;
		@Pc(33) int local33 = local6.anInt3349;
		@Pc(39) int local39;
		if (arg2 <= 0) {
			local39 = 1 - arg2;
			arg2 = 1;
			local30 -= local39;
			local27 += local39 * this.anInt8440;
		}
		@Pc(58) int local58 = this.anInt8440 - local33;
		if (this.anInt8437 <= arg2 + local30) {
			local39 = arg2 + local30 + 1 - this.anInt8437;
			local30 -= local39;
		}
		if (arg1 <= 0) {
			local39 = 1 - arg1;
			local33 -= local39;
			local58 += local39;
			arg1 = 1;
			local27 += local39;
		}
		if (arg1 + local33 >= this.anInt8440) {
			local39 = arg1 + local33 + 1 - this.anInt8440;
			local33 -= local39;
			local58 += local39;
		}
		if (local33 > 0 && local30 > 0) {
			local58 += this.anInt8440 * 7;
			return Static179.method3183(local58, this.aByteArray91, local27, local30, local33);
		} else {
			return false;
		}
	}
}
