import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class4_Sub15_Sub4 extends Class4_Sub15 {

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!pk;")
	public final Class183 aClass183_44 = new Class183();

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!jl;")
	public final Class4_Sub15_Sub2 aClass4_Sub15_Sub2_1 = new Class4_Sub15_Sub2();

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!dv;")
	private final Class4_Sub15_Sub1 aClass4_Sub15_Sub1_2;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!dv;)V")
	public Class4_Sub15_Sub4(@OriginalArg(0) Class4_Sub15_Sub1 arg0) {
		this.aClass4_Sub15_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()Lclient!ti;")
	@Override
	public Class4_Sub15 method4857() {
		@Pc(9) Class4_Sub28 local9;
		do {
			local9 = (Class4_Sub28) this.aClass183_44.method4144();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub15_Sub3_3 == null);
		return local9.aClass4_Sub15_Sub3_3;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
	@Override
	public void method4855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub15_Sub2_1.method4855(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub28 local17 = (Class4_Sub28) this.aClass183_44.method4140(); local17 != null; local17 = (Class4_Sub28) this.aClass183_44.method4144()) {
			if (!this.aClass4_Sub15_Sub1_2.method1430(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt4380 >= local29) {
						this.method4863(arg0, local27, local29, local17, local27 + local29);
						local17.anInt4380 -= local29;
						break;
					}
					this.method4863(arg0, local27, local17.anInt4380, local17, local29 + local27);
					local27 += local17.anInt4380;
					local29 -= local17.anInt4380;
				} while (!this.aClass4_Sub15_Sub1_2.method1449(local17, arg0, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!lm;I)V")
	private void method4862(@OriginalArg(1) Class4_Sub28 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass4_Sub15_Sub1_2.anIntArray133[arg0.anInt4386] & 0x4) != 0 && arg0.anInt4394 < 0) {
			@Pc(30) int local30 = this.aClass4_Sub15_Sub1_2.anIntArray129[arg0.anInt4386] / Static261.anInt4928;
			@Pc(39) int local39 = (local30 + 1048575 - arg0.anInt4391) / local30;
			arg0.anInt4391 = arg0.anInt4391 + local30 * arg1 & 0xFFFFF;
			if (local39 <= arg1) {
				if (this.aClass4_Sub15_Sub1_2.anIntArray124[arg0.anInt4386] == 0) {
					arg0.aClass4_Sub15_Sub3_3 = Static462.method4486(arg0.aClass4_Sub4_Sub1_1, arg0.aClass4_Sub15_Sub3_3.method4484(), arg0.aClass4_Sub15_Sub3_3.method4469(), arg0.aClass4_Sub15_Sub3_3.method4474());
				} else {
					arg0.aClass4_Sub15_Sub3_3 = Static462.method4486(arg0.aClass4_Sub4_Sub1_1, arg0.aClass4_Sub15_Sub3_3.method4484(), 0, arg0.aClass4_Sub15_Sub3_3.method4474());
					this.aClass4_Sub15_Sub1_2.method1436(arg0.aClass4_Sub38_1.aShortArray192[arg0.anInt4384] < 0, arg0);
				}
				if (arg0.aClass4_Sub38_1.aShortArray192[arg0.anInt4384] < 0) {
					arg0.aClass4_Sub15_Sub3_3.method4461(-1);
				}
				arg1 = arg0.anInt4391 / local30;
			}
		}
		arg0.aClass4_Sub15_Sub3_3.method4861(arg1);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()Lclient!ti;")
	@Override
	public Class4_Sub15 method4860() {
		@Pc(9) Class4_Sub28 local9 = (Class4_Sub28) this.aClass183_44.method4140();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub15_Sub3_3 == null) {
			return this.method4857();
		} else {
			return local9.aClass4_Sub15_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([IIILclient!lm;II)V")
	private void method4863(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub28 arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass4_Sub15_Sub1_2.anIntArray133[arg3.anInt4386] & 0x4) != 0 && arg3.anInt4394 < 0) {
			@Pc(31) int local31 = this.aClass4_Sub15_Sub1_2.anIntArray129[arg3.anInt4386] / Static261.anInt4928;
			while (true) {
				@Pc(42) int local42 = (local31 + 1048575 - arg3.anInt4391) / local31;
				if (local42 > arg2) {
					arg3.anInt4391 += arg2 * local31;
					break;
				}
				arg3.aClass4_Sub15_Sub3_3.method4855(arg0, arg1, local42);
				arg2 -= local42;
				arg3.anInt4391 += local31 * local42 - 1048576;
				arg1 += local42;
				@Pc(73) int local73 = Static261.anInt4928 / 100;
				@Pc(77) int local77 = 262144 / local31;
				if (local77 < local73) {
					local73 = local77;
				}
				@Pc(85) Class4_Sub15_Sub3 local85 = arg3.aClass4_Sub15_Sub3_3;
				if (this.aClass4_Sub15_Sub1_2.anIntArray124[arg3.anInt4386] == 0) {
					arg3.aClass4_Sub15_Sub3_3 = Static462.method4486(arg3.aClass4_Sub4_Sub1_1, local85.method4484(), local85.method4469(), local85.method4474());
				} else {
					arg3.aClass4_Sub15_Sub3_3 = Static462.method4486(arg3.aClass4_Sub4_Sub1_1, local85.method4484(), 0, local85.method4474());
					this.aClass4_Sub15_Sub1_2.method1436(arg3.aClass4_Sub38_1.aShortArray192[arg3.anInt4384] < 0, arg3);
					arg3.aClass4_Sub15_Sub3_3.method4481(local73, local85.method4469());
				}
				if (arg3.aClass4_Sub38_1.aShortArray192[arg3.anInt4384] < 0) {
					arg3.aClass4_Sub15_Sub3_3.method4461(-1);
				}
				local85.method4490(local73);
				local85.method4855(arg0, arg1, arg4 - arg1);
				if (local85.method4487()) {
					this.aClass4_Sub15_Sub2_1.method2954(local85);
				}
			}
		}
		arg3.aClass4_Sub15_Sub3_3.method4855(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	@Override
	public void method4861(@OriginalArg(0) int arg0) {
		this.aClass4_Sub15_Sub2_1.method4861(arg0);
		for (@Pc(15) Class4_Sub28 local15 = (Class4_Sub28) this.aClass183_44.method4140(); local15 != null; local15 = (Class4_Sub28) this.aClass183_44.method4144()) {
			if (!this.aClass4_Sub15_Sub1_2.method1430(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4380) {
						this.method4862(local15, local25);
						local15.anInt4380 -= local25;
						break;
					}
					this.method4862(local15, local15.anInt4380);
					local25 -= local15.anInt4380;
				} while (!this.aClass4_Sub15_Sub1_2.method1449(local15, null, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()I")
	@Override
	public int method4859() {
		return 0;
	}
}
