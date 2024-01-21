import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "Lclient!bg;")
	public final Class13 aClass13_2 = new Class13();

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "Lclient!sg;")
	public final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_2 = new Class2_Sub2_Sub3();

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "Lclient!ca;")
	private final Class2_Sub2_Sub1 aClass2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ca;)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		this.aClass2_Sub2_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ib;IB)V")
	private void method944(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub2_Sub1_2.anIntArray51[arg0.anInt1725] & 0x4) != 0 && arg0.anInt1727 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub2_Sub1_2.anIntArray40[arg0.anInt1725] / Static88.anInt1852;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt1724) / local23;
			arg0.anInt1724 = arg1 * local23 + arg0.anInt1724 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass2_Sub2_Sub1_2.anIntArray43[arg0.anInt1725] == 0) {
					arg0.aClass2_Sub2_Sub4_3 = Static223.method2875(arg0.aClass2_Sub20_Sub1_1, arg0.aClass2_Sub2_Sub4_3.method2865(), arg0.aClass2_Sub2_Sub4_3.method2860(), arg0.aClass2_Sub2_Sub4_3.method2883());
				} else {
					arg0.aClass2_Sub2_Sub4_3 = Static223.method2875(arg0.aClass2_Sub20_Sub1_1, arg0.aClass2_Sub2_Sub4_3.method2865(), 0, arg0.aClass2_Sub2_Sub4_3.method2883());
					this.aClass2_Sub2_Sub1_2.method386(arg0.aClass2_Sub15_1.aShortArray102[arg0.anInt1729] < 0, arg0);
				}
				if (arg0.aClass2_Sub15_1.aShortArray102[arg0.anInt1729] < 0) {
					arg0.aClass2_Sub2_Sub4_3.method2888(-1);
				}
				arg1 = arg0.anInt1724 / local23;
			}
		}
		arg0.aClass2_Sub2_Sub4_3.method2850(arg1);
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	@Override
	public void method2850(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2_Sub3_2.method2850(arg0);
		for (@Pc(15) Class2_Sub9 local15 = (Class2_Sub9) this.aClass13_2.method303(); local15 != null; local15 = (Class2_Sub9) this.aClass13_2.method309()) {
			if (!this.aClass2_Sub2_Sub1_2.method368(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1728) {
						this.method944(local15, local25);
						local15.anInt1728 -= local25;
						break;
					}
					this.method944(local15, local15.anInt1728);
					local25 -= local15.anInt1728;
				} while (!this.aClass2_Sub2_Sub1_2.method369(local25, 0, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()Lclient!af;")
	@Override
	public Class2_Sub2 method2847() {
		@Pc(9) Class2_Sub9 local9;
		do {
			local9 = (Class2_Sub9) this.aClass13_2.method309();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub2_Sub4_3 == null);
		return local9.aClass2_Sub2_Sub4_3;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()I")
	@Override
	public int method2849() {
		return 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ib;[IIIBI)V")
	private void method946(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub2_Sub1_2.anIntArray51[arg0.anInt1725] & 0x4) != 0 && arg0.anInt1727 < 0) {
			@Pc(33) int local33 = this.aClass2_Sub2_Sub1_2.anIntArray40[arg0.anInt1725] / Static88.anInt1852;
			while (true) {
				@Pc(42) int local42 = (local33 + 1048575 - arg0.anInt1724) / local33;
				if (arg3 < local42) {
					arg0.anInt1724 += arg3 * local33;
					break;
				}
				arg0.aClass2_Sub2_Sub4_3.method2853(arg1, arg4, local42);
				@Pc(55) int local55 = 262144 / local33;
				@Pc(59) int local59 = Static88.anInt1852 / 100;
				@Pc(62) Class2_Sub2_Sub4 local62 = arg0.aClass2_Sub2_Sub4_3;
				arg3 -= local42;
				if (local55 < local59) {
					local59 = local55;
				}
				arg0.anInt1724 += local33 * local42 - 1048576;
				if (this.aClass2_Sub2_Sub1_2.anIntArray43[arg0.anInt1725] == 0) {
					arg0.aClass2_Sub2_Sub4_3 = Static223.method2875(arg0.aClass2_Sub20_Sub1_1, local62.method2865(), local62.method2860(), local62.method2883());
				} else {
					arg0.aClass2_Sub2_Sub4_3 = Static223.method2875(arg0.aClass2_Sub20_Sub1_1, local62.method2865(), 0, local62.method2883());
					this.aClass2_Sub2_Sub1_2.method386(arg0.aClass2_Sub15_1.aShortArray102[arg0.anInt1729] < 0, arg0);
					arg0.aClass2_Sub2_Sub4_3.method2859(local59, local62.method2860());
				}
				arg4 += local42;
				if (arg0.aClass2_Sub15_1.aShortArray102[arg0.anInt1729] < 0) {
					arg0.aClass2_Sub2_Sub4_3.method2888(-1);
				}
				local62.method2863(local59);
				local62.method2853(arg1, arg4, arg2 - arg4);
				if (local62.method2868()) {
					this.aClass2_Sub2_Sub3_2.method2608(local62);
				}
			}
		}
		arg0.aClass2_Sub2_Sub4_3.method2853(arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()Lclient!af;")
	@Override
	public Class2_Sub2 method2848() {
		@Pc(9) Class2_Sub9 local9 = (Class2_Sub9) this.aClass13_2.method303();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub2_Sub4_3 == null) {
			return this.method2847();
		} else {
			return local9.aClass2_Sub2_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "([III)V")
	@Override
	public void method2853(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_Sub3_2.method2853(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub9 local17 = (Class2_Sub9) this.aClass13_2.method303(); local17 != null; local17 = (Class2_Sub9) this.aClass13_2.method309()) {
			if (!this.aClass2_Sub2_Sub1_2.method368(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt1728 >= local27) {
						this.method946(local17, arg0, local27 + local29, local27, local29);
						local17.anInt1728 -= local27;
						break;
					}
					this.method946(local17, arg0, local29 + local27, local17.anInt1728, local29);
					local29 += local17.anInt1728;
					local27 -= local17.anInt1728;
				} while (!this.aClass2_Sub2_Sub1_2.method369(local27, local29, local17, arg0));
			}
		}
	}
}
