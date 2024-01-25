import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 {

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "Lclient!ug;")
	public final Class243 aClass243_42 = new Class243();

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "Lclient!ci;")
	public final Class3_Sub5_Sub1 aClass3_Sub5_Sub1_36 = new Class3_Sub5_Sub1();

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "Lclient!ua;")
	private final Class3_Sub5_Sub4 aClass3_Sub5_Sub4_2;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ua;)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) Class3_Sub5_Sub4 arg0) {
		this.aClass3_Sub5_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	@Override
	public void method5119(@OriginalArg(0) int arg0) {
		this.aClass3_Sub5_Sub1_36.method5119(arg0);
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) this.aClass243_42.method5208(); local15 != null; local15 = (Class3_Sub36) this.aClass243_42.method5203()) {
			if (!this.aClass3_Sub5_Sub4_2.method5126(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt5653) {
						this.method5110(local25, local15);
						local15.anInt5653 -= local25;
						break;
					}
					this.method5110(local15.anInt5653, local15);
					local25 -= local15.anInt5653;
				} while (!this.aClass3_Sub5_Sub4_2.method5150(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "()Lclient!bl;")
	@Override
	public Class3_Sub5 method5120() {
		@Pc(9) Class3_Sub36 local9;
		do {
			local9 = (Class3_Sub36) this.aClass243_42.method5203();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub5_Sub2_3 == null);
		return local9.aClass3_Sub5_Sub2_3;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZILclient!qk;)V")
	private void method5110(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub36 arg1) {
		if ((this.aClass3_Sub5_Sub4_2.anIntArray436[arg1.anInt5655] & 0x4) != 0 && arg1.anInt5656 < 0) {
			@Pc(23) int local23 = this.aClass3_Sub5_Sub4_2.anIntArray427[arg1.anInt5655] / Static232.anInt4442;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt5645) / local23;
			arg1.anInt5645 = local23 * arg0 + arg1.anInt5645 & 0xFFFFF;
			if (arg0 >= local33) {
				if (this.aClass3_Sub5_Sub4_2.anIntArray425[arg1.anInt5655] == 0) {
					arg1.aClass3_Sub5_Sub2_3 = Static458.method2104(arg1.aClass3_Sub6_Sub1_1, arg1.aClass3_Sub5_Sub2_3.method2096(), arg1.aClass3_Sub5_Sub2_3.method2102(), arg1.aClass3_Sub5_Sub2_3.method2095());
				} else {
					arg1.aClass3_Sub5_Sub2_3 = Static458.method2104(arg1.aClass3_Sub6_Sub1_1, arg1.aClass3_Sub5_Sub2_3.method2096(), 0, arg1.aClass3_Sub5_Sub2_3.method2095());
					this.aClass3_Sub5_Sub4_2.method5128(arg1, arg1.aClass3_Sub42_1.aShortArray140[arg1.anInt5640] < 0);
				}
				if (arg1.aClass3_Sub42_1.aShortArray140[arg1.anInt5640] < 0) {
					arg1.aClass3_Sub5_Sub2_3.method2100(-1);
				}
				arg0 = arg1.anInt5645 / local23;
			}
		}
		arg1.aClass3_Sub5_Sub2_3.method5119(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([III)V")
	@Override
	public void method5117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub5_Sub1_36.method5117(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) this.aClass243_42.method5208(); local17 != null; local17 = (Class3_Sub36) this.aClass243_42.method5203()) {
			if (!this.aClass3_Sub5_Sub4_2.method5126(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt5653) {
						this.method5111(local29 + local27, arg0, local27, local17, local29);
						local17.anInt5653 -= local29;
						break;
					}
					this.method5111(local27 + local29, arg0, local27, local17, local17.anInt5653);
					local27 += local17.anInt5653;
					local29 -= local17.anInt5653;
				} while (!this.aClass3_Sub5_Sub4_2.method5150(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "()I")
	@Override
	public int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[IBILclient!qk;I)V")
	private void method5111(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub36 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub5_Sub4_2.anIntArray436[arg3.anInt5655] & 0x4) != 0 && arg3.anInt5656 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub5_Sub4_2.anIntArray427[arg3.anInt5655] / Static232.anInt4442;
			while (true) {
				@Pc(40) int local40 = (local29 + 1048575 - arg3.anInt5645) / local29;
				if (arg4 < local40) {
					arg3.anInt5645 += arg4 * local29;
					break;
				}
				arg3.aClass3_Sub5_Sub2_3.method5117(arg1, arg2, local40);
				arg3.anInt5645 += local40 * local29 - 1048576;
				arg4 -= local40;
				arg2 += local40;
				@Pc(75) int local75 = Static232.anInt4442 / 100;
				@Pc(79) int local79 = 262144 / local29;
				if (local75 > local79) {
					local75 = local79;
				}
				@Pc(87) Class3_Sub5_Sub2 local87 = arg3.aClass3_Sub5_Sub2_3;
				if (this.aClass3_Sub5_Sub4_2.anIntArray425[arg3.anInt5655] == 0) {
					arg3.aClass3_Sub5_Sub2_3 = Static458.method2104(arg3.aClass3_Sub6_Sub1_1, local87.method2096(), local87.method2102(), local87.method2095());
				} else {
					arg3.aClass3_Sub5_Sub2_3 = Static458.method2104(arg3.aClass3_Sub6_Sub1_1, local87.method2096(), 0, local87.method2095());
					this.aClass3_Sub5_Sub4_2.method5128(arg3, arg3.aClass3_Sub42_1.aShortArray140[arg3.anInt5640] < 0);
					arg3.aClass3_Sub5_Sub2_3.method2112(local75, local87.method2102());
				}
				if (arg3.aClass3_Sub42_1.aShortArray140[arg3.anInt5640] < 0) {
					arg3.aClass3_Sub5_Sub2_3.method2100(-1);
				}
				local87.method2121(local75);
				local87.method5117(arg1, arg2, arg0 - arg2);
				if (local87.method2113()) {
					this.aClass3_Sub5_Sub1_36.method889(local87);
				}
			}
		}
		arg3.aClass3_Sub5_Sub2_3.method5117(arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "()Lclient!bl;")
	@Override
	public Class3_Sub5 method5123() {
		@Pc(9) Class3_Sub36 local9 = (Class3_Sub36) this.aClass243_42.method5208();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub5_Sub2_3 == null) {
			return this.method5120();
		} else {
			return local9.aClass3_Sub5_Sub2_3;
		}
	}
}
