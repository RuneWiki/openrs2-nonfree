import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub10_Sub1 extends Class1_Sub10 {

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!ci;")
	public Class26 aClass26_15 = new Class26();

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!ii;")
	public Class1_Sub10_Sub2 aClass1_Sub10_Sub2_3 = new Class1_Sub10_Sub2();

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "Lclient!of;")
	private Class1_Sub10_Sub3 aClass1_Sub10_Sub3_2;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class1_Sub10_Sub1(@OriginalArg(0) Class1_Sub10_Sub3 arg0) {
		this.aClass1_Sub10_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()Lclient!jk;")
	@Override
	public Class1_Sub10 method4342() {
		@Pc(9) Class1_Sub23 local9 = (Class1_Sub23) this.aClass26_15.method666();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub10_Sub4_3 == null) {
			return this.method4339();
		} else {
			return local9.aClass1_Sub10_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
	@Override
	public int method4343() {
		return 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()Lclient!jk;")
	@Override
	public Class1_Sub10 method4339() {
		while (true) {
			@Pc(9) Class1_Sub23 local9 = (Class1_Sub23) this.aClass26_15.method672();
			if (local9 != null) {
				if (local9.aClass1_Sub10_Sub4_3 == null) {
					continue;
				}
				return local9.aClass1_Sub10_Sub4_3;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!sa;II[II)V")
	private void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if ((this.aClass1_Sub10_Sub3_2.anIntArray373[arg1.anInt5087] & 0x4) != 0 && arg1.anInt5085 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub10_Sub3_2.anIntArray383[arg1.anInt5087] / Static230.anInt3026;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg1.anInt5096) / local25;
				if (local35 > arg2) {
					arg1.anInt5096 += local25 * arg2;
					break;
				}
				@Pc(46) int local46 = 262144 / local25;
				arg2 -= local35;
				arg1.aClass1_Sub10_Sub4_3.method4345(arg4, arg0, local35);
				arg1.anInt5096 += local25 * local35 - 1048576;
				@Pc(70) int local70 = Static230.anInt3026 / 100;
				arg0 += local35;
				if (local70 > local46) {
					local70 = local46;
				}
				@Pc(82) Class1_Sub10_Sub4 local82 = arg1.aClass1_Sub10_Sub4_3;
				if (this.aClass1_Sub10_Sub3_2.anIntArray381[arg1.anInt5087] == 0) {
					arg1.aClass1_Sub10_Sub4_3 = Static327.method4374(arg1.aClass1_Sub11_Sub1_1, local82.method4351(), local82.method4357(), local82.method4361());
				} else {
					arg1.aClass1_Sub10_Sub4_3 = Static327.method4374(arg1.aClass1_Sub11_Sub1_1, local82.method4351(), 0, local82.method4361());
					this.aClass1_Sub10_Sub3_2.method3152(arg1, arg1.aClass1_Sub8_1.aShortArray54[arg1.anInt5079] < 0);
					arg1.aClass1_Sub10_Sub4_3.method4353(local70, local82.method4357());
				}
				if (arg1.aClass1_Sub8_1.aShortArray54[arg1.anInt5079] < 0) {
					arg1.aClass1_Sub10_Sub4_3.method4382(-1);
				}
				local82.method4367(local70);
				local82.method4345(arg4, arg0, arg3 - arg0);
				if (local82.method4380()) {
					this.aClass1_Sub10_Sub2_3.method1863(local82);
				}
			}
		}
		arg1.aClass1_Sub10_Sub4_3.method4345(arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!sa;I)V")
	private void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub23 arg1) {
		if ((this.aClass1_Sub10_Sub3_2.anIntArray373[arg1.anInt5087] & 0x4) != 0 && arg1.anInt5085 < 0) {
			@Pc(39) int local39 = this.aClass1_Sub10_Sub3_2.anIntArray383[arg1.anInt5087] / Static230.anInt3026;
			@Pc(49) int local49 = (local39 + 1048575 - arg1.anInt5096) / local39;
			arg1.anInt5096 = arg1.anInt5096 + arg0 * local39 & 0xFFFFF;
			if (arg0 >= local49) {
				if (this.aClass1_Sub10_Sub3_2.anIntArray381[arg1.anInt5087] == 0) {
					arg1.aClass1_Sub10_Sub4_3 = Static327.method4374(arg1.aClass1_Sub11_Sub1_1, arg1.aClass1_Sub10_Sub4_3.method4351(), arg1.aClass1_Sub10_Sub4_3.method4357(), arg1.aClass1_Sub10_Sub4_3.method4361());
				} else {
					arg1.aClass1_Sub10_Sub4_3 = Static327.method4374(arg1.aClass1_Sub11_Sub1_1, arg1.aClass1_Sub10_Sub4_3.method4351(), 0, arg1.aClass1_Sub10_Sub4_3.method4361());
					this.aClass1_Sub10_Sub3_2.method3152(arg1, arg1.aClass1_Sub8_1.aShortArray54[arg1.anInt5079] < 0);
				}
				if (arg1.aClass1_Sub8_1.aShortArray54[arg1.anInt5079] < 0) {
					arg1.aClass1_Sub10_Sub4_3.method4382(-1);
				}
				arg0 = arg1.anInt5096 / local39;
			}
		}
		arg1.aClass1_Sub10_Sub4_3.method4341(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	@Override
	public void method4341(@OriginalArg(0) int arg0) {
		this.aClass1_Sub10_Sub2_3.method4341(arg0);
		for (@Pc(15) Class1_Sub23 local15 = (Class1_Sub23) this.aClass26_15.method666(); local15 != null; local15 = (Class1_Sub23) this.aClass26_15.method672()) {
			if (!this.aClass1_Sub10_Sub3_2.method3181(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt5082) {
						this.method1460(local25, local15);
						local15.anInt5082 -= local25;
						break;
					}
					this.method1460(local15.anInt5082, local15);
					local25 -= local15.anInt5082;
				} while (!this.aClass1_Sub10_Sub3_2.method3161(null, local25, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V")
	@Override
	public void method4345(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub10_Sub2_3.method4345(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub23 local17 = (Class1_Sub23) this.aClass26_15.method666(); local17 != null; local17 = (Class1_Sub23) this.aClass26_15.method672()) {
			if (!this.aClass1_Sub10_Sub3_2.method3181(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt5082 >= local27) {
						this.method1459(local29, local17, local27, local29 + local27, arg0);
						local17.anInt5082 -= local27;
						break;
					}
					this.method1459(local29, local17, local17.anInt5082, local29 + local27, arg0);
					local27 -= local17.anInt5082;
					local29 += local17.anInt5082;
				} while (!this.aClass1_Sub10_Sub3_2.method3161(arg0, local27, local17, local29));
			}
		}
	}
}
