import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class2_Sub11_Sub3 extends Class2_Sub11 {

	@OriginalMember(owner = "client!op", name = "F", descriptor = "Lclient!vf;")
	public final Class238 aClass238_26 = new Class238();

	@OriginalMember(owner = "client!op", name = "H", descriptor = "Lclient!rc;")
	public final Class2_Sub11_Sub4 aClass2_Sub11_Sub4_2 = new Class2_Sub11_Sub4();

	@OriginalMember(owner = "client!op", name = "v", descriptor = "Lclient!fi;")
	private final Class2_Sub11_Sub1 aClass2_Sub11_Sub1_2;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!fi;)V")
	public Class2_Sub11_Sub3(@OriginalArg(0) Class2_Sub11_Sub1 arg0) {
		this.aClass2_Sub11_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IBLclient!kb;)V")
	private void method4374(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if ((this.aClass2_Sub11_Sub1_2.anIntArray180[arg1.anInt3549] & 0x4) != 0 && arg1.anInt3564 < 0) {
			@Pc(32) int local32 = this.aClass2_Sub11_Sub1_2.anIntArray183[arg1.anInt3549] / Static392.anInt7144;
			@Pc(42) int local42 = (local32 + 1048575 - arg1.anInt3568) / local32;
			arg1.anInt3568 = arg1.anInt3568 + local32 * arg0 & 0xFFFFF;
			if (local42 <= arg0) {
				if (this.aClass2_Sub11_Sub1_2.anIntArray187[arg1.anInt3549] == 0) {
					arg1.aClass2_Sub11_Sub2_1 = Static397.method2992(arg1.aClass2_Sub20_Sub1_1, arg1.aClass2_Sub11_Sub2_1.method3005(), arg1.aClass2_Sub11_Sub2_1.method3016(), arg1.aClass2_Sub11_Sub2_1.method2993());
				} else {
					arg1.aClass2_Sub11_Sub2_1 = Static397.method2992(arg1.aClass2_Sub20_Sub1_1, arg1.aClass2_Sub11_Sub2_1.method3005(), 0, arg1.aClass2_Sub11_Sub2_1.method2993());
					this.aClass2_Sub11_Sub1_2.method1776(arg1, arg1.aClass2_Sub36_1.aShortArray112[arg1.anInt3558] < 0);
				}
				if (arg1.aClass2_Sub36_1.aShortArray112[arg1.anInt3558] < 0) {
					arg1.aClass2_Sub11_Sub2_1.method2991(-1);
				}
				arg0 = arg1.anInt3568 / local32;
			}
		}
		arg1.aClass2_Sub11_Sub2_1.method4875(arg0);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "([III)V")
	@Override
	public void method4877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub11_Sub4_2.method4877(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub23 local17 = (Class2_Sub23) this.aClass238_26.method5795(); local17 != null; local17 = (Class2_Sub23) this.aClass238_26.method5799()) {
			if (!this.aClass2_Sub11_Sub1_2.method1798(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3555 >= local27) {
						this.method4375(arg0, local29, local27, local27 + local29, local17);
						local17.anInt3555 -= local27;
						break;
					}
					this.method4375(arg0, local29, local17.anInt3555, local29 + local27, local17);
					local27 -= local17.anInt3555;
					local29 += local17.anInt3555;
				} while (!this.aClass2_Sub11_Sub1_2.method1783(local17, local27, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "()I")
	@Override
	public int method4876() {
		return 0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "()Lclient!rk;")
	@Override
	public Class2_Sub11 method4871() {
		@Pc(9) Class2_Sub23 local9 = (Class2_Sub23) this.aClass238_26.method5795();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub11_Sub2_1 == null) {
			return this.method4872();
		} else {
			return local9.aClass2_Sub11_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	@Override
	public void method4875(@OriginalArg(0) int arg0) {
		this.aClass2_Sub11_Sub4_2.method4875(arg0);
		for (@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) this.aClass238_26.method5795(); local15 != null; local15 = (Class2_Sub23) this.aClass238_26.method5799()) {
			if (!this.aClass2_Sub11_Sub1_2.method1798(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3555 >= local25) {
						this.method4374(local25, local15);
						local15.anInt3555 -= local25;
						break;
					}
					this.method4374(local15.anInt3555, local15);
					local25 -= local15.anInt3555;
				} while (!this.aClass2_Sub11_Sub1_2.method1783(local15, local25, 0, null));
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([IIIIILclient!kb;)V")
	private void method4375(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub23 arg4) {
		if ((this.aClass2_Sub11_Sub1_2.anIntArray180[arg4.anInt3549] & 0x4) != 0 && arg4.anInt3564 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub11_Sub1_2.anIntArray183[arg4.anInt3549] / Static392.anInt7144;
			while (true) {
				@Pc(43) int local43 = (local34 + 1048575 - arg4.anInt3568) / local34;
				if (arg2 < local43) {
					arg4.anInt3568 += arg2 * local34;
					break;
				}
				arg4.aClass2_Sub11_Sub2_1.method4877(arg0, arg1, local43);
				arg4.anInt3568 += local43 * local34 - 1048576;
				arg1 += local43;
				arg2 -= local43;
				@Pc(78) int local78 = Static392.anInt7144 / 100;
				@Pc(82) int local82 = 262144 / local34;
				if (local82 < local78) {
					local78 = local82;
				}
				@Pc(90) Class2_Sub11_Sub2 local90 = arg4.aClass2_Sub11_Sub2_1;
				if (this.aClass2_Sub11_Sub1_2.anIntArray187[arg4.anInt3549] == 0) {
					arg4.aClass2_Sub11_Sub2_1 = Static397.method2992(arg4.aClass2_Sub20_Sub1_1, local90.method3005(), local90.method3016(), local90.method2993());
				} else {
					arg4.aClass2_Sub11_Sub2_1 = Static397.method2992(arg4.aClass2_Sub20_Sub1_1, local90.method3005(), 0, local90.method2993());
					this.aClass2_Sub11_Sub1_2.method1776(arg4, arg4.aClass2_Sub36_1.aShortArray112[arg4.anInt3558] < 0);
					arg4.aClass2_Sub11_Sub2_1.method2987(local78, local90.method3016());
				}
				if (arg4.aClass2_Sub36_1.aShortArray112[arg4.anInt3558] < 0) {
					arg4.aClass2_Sub11_Sub2_1.method2991(-1);
				}
				local90.method3018(local78);
				local90.method4877(arg0, arg1, arg3 - arg1);
				if (local90.method3019()) {
					this.aClass2_Sub11_Sub4_2.method4878(local90);
				}
			}
		}
		arg4.aClass2_Sub11_Sub2_1.method4877(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "()Lclient!rk;")
	@Override
	public Class2_Sub11 method4872() {
		@Pc(9) Class2_Sub23 local9;
		do {
			local9 = (Class2_Sub23) this.aClass238_26.method5799();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub11_Sub2_1 == null);
		return local9.aClass2_Sub11_Sub2_1;
	}
}
