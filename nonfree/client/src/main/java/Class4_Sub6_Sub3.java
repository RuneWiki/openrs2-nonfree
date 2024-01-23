import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!gn", name = "E", descriptor = "Lclient!c;")
	public Class17 aClass17_14 = new Class17();

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "Lclient!rm;")
	public Class4_Sub6_Sub4 aClass4_Sub6_Sub4_2 = new Class4_Sub6_Sub4();

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "Lclient!co;")
	private Class4_Sub6_Sub2 aClass4_Sub6_Sub2_1;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class4_Sub6_Sub3(@OriginalArg(0) Class4_Sub6_Sub2 arg0) {
		this.aClass4_Sub6_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([III)V")
	@Override
	public void method3723(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub6_Sub4_2.method3723(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub3 local17 = (Class4_Sub3) this.aClass17_14.method613(); local17 != null; local17 = (Class4_Sub3) this.aClass17_14.method607()) {
			if (!this.aClass4_Sub6_Sub2_1.method820(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt358 >= local29) {
						this.method1560(arg0, local27, local17, local29, local29 + local27);
						local17.anInt358 -= local29;
						break;
					}
					this.method1560(arg0, local27, local17, local17.anInt358, local27 + local29);
					local27 += local17.anInt358;
					local29 -= local17.anInt358;
				} while (!this.aClass4_Sub6_Sub2_1.method833(local27, arg0, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()I")
	@Override
	public int method3724() {
		return 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!b;)V")
	private void method1559(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3 arg1) {
		if ((this.aClass4_Sub6_Sub2_1.anIntArray109[arg1.anInt344] & 0x4) != 0 && arg1.anInt351 < 0) {
			@Pc(25) int local25 = this.aClass4_Sub6_Sub2_1.anIntArray99[arg1.anInt344] / Static75.anInt1523;
			@Pc(35) int local35 = (local25 + 1048575 - arg1.anInt345) / local25;
			arg1.anInt345 = arg0 * local25 + arg1.anInt345 & 0xFFFFF;
			if (local35 <= arg0) {
				if (this.aClass4_Sub6_Sub2_1.anIntArray96[arg1.anInt344] == 0) {
					arg1.aClass4_Sub6_Sub1_1 = Static310.method520(arg1.aClass4_Sub5_Sub1_1, arg1.aClass4_Sub6_Sub1_1.method513(), arg1.aClass4_Sub6_Sub1_1.method508(), arg1.aClass4_Sub6_Sub1_1.method498());
				} else {
					arg1.aClass4_Sub6_Sub1_1 = Static310.method520(arg1.aClass4_Sub5_Sub1_1, arg1.aClass4_Sub6_Sub1_1.method513(), 0, arg1.aClass4_Sub6_Sub1_1.method498());
					this.aClass4_Sub6_Sub2_1.method824(arg1, arg1.aClass4_Sub32_1.aShortArray94[arg1.anInt361] < 0);
				}
				if (arg1.aClass4_Sub32_1.aShortArray94[arg1.anInt361] < 0) {
					arg1.aClass4_Sub6_Sub1_1.method492(-1);
				}
				arg0 = arg1.anInt345 / local25;
			}
		}
		arg1.aClass4_Sub6_Sub1_1.method3728(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()Lclient!mj;")
	@Override
	public Class4_Sub6 method3725() {
		while (true) {
			@Pc(9) Class4_Sub3 local9 = (Class4_Sub3) this.aClass17_14.method607();
			if (local9 != null) {
				if (local9.aClass4_Sub6_Sub1_1 == null) {
					continue;
				}
				return local9.aClass4_Sub6_Sub1_1;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	@Override
	public void method3728(@OriginalArg(0) int arg0) {
		this.aClass4_Sub6_Sub4_2.method3728(arg0);
		for (@Pc(15) Class4_Sub3 local15 = (Class4_Sub3) this.aClass17_14.method613(); local15 != null; local15 = (Class4_Sub3) this.aClass17_14.method607()) {
			if (!this.aClass4_Sub6_Sub2_1.method820(local15)) {
				@Pc(26) int local26 = arg0;
				do {
					if (local15.anInt358 >= local26) {
						this.method1559(local26, local15);
						local15.anInt358 -= local26;
						break;
					}
					this.method1559(local15.anInt358, local15);
					local26 -= local15.anInt358;
				} while (!this.aClass4_Sub6_Sub2_1.method833(0, null, local26, local15));
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "()Lclient!mj;")
	@Override
	public Class4_Sub6 method3727() {
		@Pc(9) Class4_Sub3 local9 = (Class4_Sub3) this.aClass17_14.method613();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub6_Sub1_1 == null) {
			return this.method3725();
		} else {
			return local9.aClass4_Sub6_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([IZILclient!b;II)V")
	private void method1560(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub6_Sub2_1.anIntArray109[arg2.anInt344] & 0x4) != 0 && arg2.anInt351 < 0) {
			@Pc(29) int local29 = this.aClass4_Sub6_Sub2_1.anIntArray99[arg2.anInt344] / Static75.anInt1523;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg2.anInt345) / local29;
				if (arg3 < local39) {
					arg2.anInt345 += local29 * arg3;
					break;
				}
				arg2.aClass4_Sub6_Sub1_1.method3723(arg0, arg1, local39);
				arg3 -= local39;
				arg1 += local39;
				@Pc(62) int local62 = 262144 / local29;
				@Pc(66) int local66 = Static75.anInt1523 / 100;
				if (local62 < local66) {
					local66 = local62;
				}
				arg2.anInt345 += local29 * local39 - 1048576;
				@Pc(89) Class4_Sub6_Sub1 local89 = arg2.aClass4_Sub6_Sub1_1;
				if (this.aClass4_Sub6_Sub2_1.anIntArray96[arg2.anInt344] == 0) {
					arg2.aClass4_Sub6_Sub1_1 = Static310.method520(arg2.aClass4_Sub5_Sub1_1, local89.method513(), local89.method508(), local89.method498());
				} else {
					arg2.aClass4_Sub6_Sub1_1 = Static310.method520(arg2.aClass4_Sub5_Sub1_1, local89.method513(), 0, local89.method498());
					this.aClass4_Sub6_Sub2_1.method824(arg2, arg2.aClass4_Sub32_1.aShortArray94[arg2.anInt361] < 0);
					arg2.aClass4_Sub6_Sub1_1.method499(local66, local89.method508());
				}
				if (arg2.aClass4_Sub32_1.aShortArray94[arg2.anInt361] < 0) {
					arg2.aClass4_Sub6_Sub1_1.method492(-1);
				}
				local89.method514(local66);
				local89.method3723(arg0, arg1, arg4 - arg1);
				if (local89.method502()) {
					this.aClass4_Sub6_Sub4_2.method3731(local89);
				}
			}
		}
		arg2.aClass4_Sub6_Sub1_1.method3723(arg0, arg1, arg3);
	}
}
