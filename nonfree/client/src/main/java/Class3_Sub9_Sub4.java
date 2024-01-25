import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class3_Sub9_Sub4 extends Class3_Sub9 {

	@OriginalMember(owner = "client!oha", name = "r", descriptor = "Lclient!jia;")
	public final Class193 aClass193_38 = new Class193();

	@OriginalMember(owner = "client!oha", name = "y", descriptor = "Lclient!bt;")
	public final Class3_Sub9_Sub1 aClass3_Sub9_Sub1_1 = new Class3_Sub9_Sub1();

	@OriginalMember(owner = "client!oha", name = "t", descriptor = "Lclient!pt;")
	private final Class3_Sub9_Sub5 aClass3_Sub9_Sub5_4;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!pt;)V")
	public Class3_Sub9_Sub4(@OriginalArg(0) Class3_Sub9_Sub5 arg0) {
		this.aClass3_Sub9_Sub5_4 = arg0;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IILclient!mja;)V")
	private void method6098(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub35 arg1) {
		if ((this.aClass3_Sub9_Sub5_4.anIntArray491[arg1.anInt6582] & 0x4) != 0 && arg1.anInt6576 < 0) {
			@Pc(26) int local26 = this.aClass3_Sub9_Sub5_4.anIntArray493[arg1.anInt6582] / Static656.anInt1392;
			@Pc(35) int local35 = (local26 + 1048575 - arg1.anInt6579) / local26;
			arg1.anInt6579 = arg1.anInt6579 + arg0 * local26 & 0xFFFFF;
			if (arg0 >= local35) {
				if (this.aClass3_Sub9_Sub5_4.anIntArray495[arg1.anInt6582] == 0) {
					arg1.aClass3_Sub9_Sub2_3 = Static684.method3727(arg1.aClass3_Sub12_Sub1_3, arg1.aClass3_Sub9_Sub2_3.method3751(), arg1.aClass3_Sub9_Sub2_3.method3754(), arg1.aClass3_Sub9_Sub2_3.method3752());
				} else {
					arg1.aClass3_Sub9_Sub2_3 = Static684.method3727(arg1.aClass3_Sub12_Sub1_3, arg1.aClass3_Sub9_Sub2_3.method3751(), 0, arg1.aClass3_Sub9_Sub2_3.method3752());
					this.aClass3_Sub9_Sub5_4.method6736(arg1.aClass3_Sub38_1.aShortArray136[arg1.anInt6585] < 0, arg1);
				}
				if (arg1.aClass3_Sub38_1.aShortArray136[arg1.anInt6585] < 0) {
					arg1.aClass3_Sub9_Sub2_3.method3730(-1);
				}
				arg0 = arg1.anInt6579 / local26;
			}
		}
		arg1.aClass3_Sub9_Sub2_3.method6701(arg0);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IBLclient!mja;[III)V")
	private void method6099(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub35 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub9_Sub5_4.anIntArray491[arg1.anInt6582] & 0x4) != 0 && arg1.anInt6576 < 0) {
			@Pc(28) int local28 = this.aClass3_Sub9_Sub5_4.anIntArray493[arg1.anInt6582] / Static656.anInt1392;
			while (true) {
				@Pc(37) int local37 = (local28 + 1048575 - arg1.anInt6579) / local28;
				if (arg4 < local37) {
					arg1.anInt6579 += arg4 * local28;
					break;
				}
				arg1.aClass3_Sub9_Sub2_3.method6702(arg2, arg3, local37);
				arg3 += local37;
				arg4 -= local37;
				arg1.anInt6579 += local37 * local28 - 1048576;
				@Pc(68) int local68 = Static656.anInt1392 / 100;
				@Pc(72) int local72 = 262144 / local28;
				if (local68 > local72) {
					local68 = local72;
				}
				@Pc(84) Class3_Sub9_Sub2 local84 = arg1.aClass3_Sub9_Sub2_3;
				if (this.aClass3_Sub9_Sub5_4.anIntArray495[arg1.anInt6582] == 0) {
					arg1.aClass3_Sub9_Sub2_3 = Static684.method3727(arg1.aClass3_Sub12_Sub1_3, local84.method3751(), local84.method3754(), local84.method3752());
				} else {
					arg1.aClass3_Sub9_Sub2_3 = Static684.method3727(arg1.aClass3_Sub12_Sub1_3, local84.method3751(), 0, local84.method3752());
					this.aClass3_Sub9_Sub5_4.method6736(arg1.aClass3_Sub38_1.aShortArray136[arg1.anInt6585] < 0, arg1);
					arg1.aClass3_Sub9_Sub2_3.method3753(local68, local84.method3754());
				}
				if (arg1.aClass3_Sub38_1.aShortArray136[arg1.anInt6585] < 0) {
					arg1.aClass3_Sub9_Sub2_3.method3730(-1);
				}
				local84.method3757(local68);
				local84.method6702(arg2, arg3, arg0 - arg3);
				if (local84.method3755()) {
					this.aClass3_Sub9_Sub1_1.method1419(local84);
				}
			}
		}
		arg1.aClass3_Sub9_Sub2_3.method6702(arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6696() {
		@Pc(9) Class3_Sub35 local9;
		do {
			local9 = (Class3_Sub35) this.aClass193_38.method4459();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub9_Sub2_3 == null);
		return local9.aClass3_Sub9_Sub2_3;
	}

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "()I")
	@Override
	public int method6699() {
		return 0;
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "([III)V")
	@Override
	public void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub9_Sub1_1.method6702(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub35 local17 = (Class3_Sub35) this.aClass193_38.method4457(); local17 != null; local17 = (Class3_Sub35) this.aClass193_38.method4459()) {
			if (!this.aClass3_Sub9_Sub5_4.method6716(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt6593 >= local29) {
						this.method6099(local27 + local29, local17, arg0, local27, local29);
						local17.anInt6593 -= local29;
						break;
					}
					this.method6099(local29 + local27, local17, arg0, local27, local17.anInt6593);
					local29 -= local17.anInt6593;
					local27 += local17.anInt6593;
				} while (!this.aClass3_Sub9_Sub5_4.method6707(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	@Override
	public void method6701(@OriginalArg(0) int arg0) {
		this.aClass3_Sub9_Sub1_1.method6701(arg0);
		for (@Pc(15) Class3_Sub35 local15 = (Class3_Sub35) this.aClass193_38.method4457(); local15 != null; local15 = (Class3_Sub35) this.aClass193_38.method4459()) {
			if (!this.aClass3_Sub9_Sub5_4.method6716(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6593) {
						this.method6098(local25, local15);
						local15.anInt6593 -= local25;
						break;
					}
					this.method6098(local15.anInt6593, local15);
					local25 -= local15.anInt6593;
				} while (!this.aClass3_Sub9_Sub5_4.method6707((int[]) null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6700() {
		@Pc(9) Class3_Sub35 local9 = (Class3_Sub35) this.aClass193_38.method4457();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub9_Sub2_3 == null) {
			return this.method6696();
		} else {
			return local9.aClass3_Sub9_Sub2_3;
		}
	}
}
