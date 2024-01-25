import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!m;")
	public final Class127 aClass127_1 = new Class127();

	@OriginalMember(owner = "client!af", name = "A", descriptor = "Lclient!f;")
	public final Class3_Sub2_Sub2 aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2();

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!tm;")
	private final Class3_Sub2_Sub4 aClass3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!tm;)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class3_Sub2_Sub4 arg0) {
		this.aClass3_Sub2_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	@Override
	public void method5108(@OriginalArg(0) int arg0) {
		this.aClass3_Sub2_Sub2_1.method5108(arg0);
		for (@Pc(15) Class3_Sub28 local15 = (Class3_Sub28) this.aClass127_1.method3402(); local15 != null; local15 = (Class3_Sub28) this.aClass127_1.method3400()) {
			if (!this.aClass3_Sub2_Sub4_2.method5128(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3599 >= local25) {
						this.method146(local25, local15);
						local15.anInt3599 -= local25;
						break;
					}
					this.method146(local15.anInt3599, local15);
					local25 -= local15.anInt3599;
				} while (!this.aClass3_Sub2_Sub4_2.method5147(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ko;I)V")
	private void method146(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if ((this.aClass3_Sub2_Sub4_2.anIntArray492[arg1.anInt3594] & 0x4) != 0 && arg1.anInt3595 < 0) {
			@Pc(20) int local20 = this.aClass3_Sub2_Sub4_2.anIntArray505[arg1.anInt3594] / Static244.anInt4835;
			@Pc(30) int local30 = (local20 + 1048575 - arg1.anInt3597) / local20;
			arg1.anInt3597 = local20 * arg0 + arg1.anInt3597 & 0xFFFFF;
			if (arg0 >= local30) {
				if (this.aClass3_Sub2_Sub4_2.anIntArray498[arg1.anInt3594] == 0) {
					arg1.aClass3_Sub2_Sub3_3 = Static364.method2800(arg1.aClass3_Sub17_Sub1_1, arg1.aClass3_Sub2_Sub3_3.method2785(), arg1.aClass3_Sub2_Sub3_3.method2793(), arg1.aClass3_Sub2_Sub3_3.method2782());
				} else {
					arg1.aClass3_Sub2_Sub3_3 = Static364.method2800(arg1.aClass3_Sub17_Sub1_1, arg1.aClass3_Sub2_Sub3_3.method2785(), 0, arg1.aClass3_Sub2_Sub3_3.method2782());
					this.aClass3_Sub2_Sub4_2.method5125(arg1.aClass3_Sub8_1.aShortArray16[arg1.anInt3613] < 0, arg1);
				}
				if (arg1.aClass3_Sub8_1.aShortArray16[arg1.anInt3613] < 0) {
					arg1.aClass3_Sub2_Sub3_3.method2811(-1);
				}
				arg0 = arg1.anInt3597 / local20;
			}
		}
		arg1.aClass3_Sub2_Sub3_3.method5108(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BILclient!ko;[III)V")
	private void method147(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub28 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub2_Sub4_2.anIntArray492[arg1.anInt3594] & 0x4) != 0 && arg1.anInt3595 < 0) {
			@Pc(37) int local37 = this.aClass3_Sub2_Sub4_2.anIntArray505[arg1.anInt3594] / Static244.anInt4835;
			while (true) {
				@Pc(47) int local47 = (local37 + 1048575 - arg1.anInt3597) / local37;
				if (local47 > arg4) {
					arg1.anInt3597 += local37 * arg4;
					break;
				}
				arg1.aClass3_Sub2_Sub3_3.method5109(arg2, arg0, local47);
				arg4 -= local47;
				arg0 += local47;
				arg1.anInt3597 += local37 * local47 - 1048576;
				@Pc(78) int local78 = Static244.anInt4835 / 100;
				@Pc(82) int local82 = 262144 / local37;
				if (local78 > local82) {
					local78 = local82;
				}
				@Pc(94) Class3_Sub2_Sub3 local94 = arg1.aClass3_Sub2_Sub3_3;
				if (this.aClass3_Sub2_Sub4_2.anIntArray498[arg1.anInt3594] == 0) {
					arg1.aClass3_Sub2_Sub3_3 = Static364.method2800(arg1.aClass3_Sub17_Sub1_1, local94.method2785(), local94.method2793(), local94.method2782());
				} else {
					arg1.aClass3_Sub2_Sub3_3 = Static364.method2800(arg1.aClass3_Sub17_Sub1_1, local94.method2785(), 0, local94.method2782());
					this.aClass3_Sub2_Sub4_2.method5125(arg1.aClass3_Sub8_1.aShortArray16[arg1.anInt3613] < 0, arg1);
					arg1.aClass3_Sub2_Sub3_3.method2805(local78, local94.method2793());
				}
				if (arg1.aClass3_Sub8_1.aShortArray16[arg1.anInt3613] < 0) {
					arg1.aClass3_Sub2_Sub3_3.method2811(-1);
				}
				local94.method2797(local78);
				local94.method5109(arg2, arg0, arg3 - arg0);
				if (local94.method2791()) {
					this.aClass3_Sub2_Sub2_1.method1366(local94);
				}
			}
		}
		arg1.aClass3_Sub2_Sub3_3.method5109(arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
	@Override
	public void method5109(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub2_Sub2_1.method5109(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub28 local17 = (Class3_Sub28) this.aClass127_1.method3402(); local17 != null; local17 = (Class3_Sub28) this.aClass127_1.method3400()) {
			if (!this.aClass3_Sub2_Sub4_2.method5128(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt3599) {
						this.method147(local27, local17, arg0, local29 + local27, local29);
						local17.anInt3599 -= local29;
						break;
					}
					this.method147(local27, local17, arg0, local29 + local27, local17.anInt3599);
					local29 -= local17.anInt3599;
					local27 += local17.anInt3599;
				} while (!this.aClass3_Sub2_Sub4_2.method5147(local17, local27, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()Lclient!mq;")
	@Override
	public Class3_Sub2 method5111() {
		@Pc(9) Class3_Sub28 local9;
		do {
			local9 = (Class3_Sub28) this.aClass127_1.method3400();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub2_Sub3_3 == null);
		return local9.aClass3_Sub2_Sub3_3;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()Lclient!mq;")
	@Override
	public Class3_Sub2 method5110() {
		@Pc(9) Class3_Sub28 local9 = (Class3_Sub28) this.aClass127_1.method3402();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub2_Sub3_3 == null) {
			return this.method5111();
		} else {
			return local9.aClass3_Sub2_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
	@Override
	public int method5113() {
		return 0;
	}
}
