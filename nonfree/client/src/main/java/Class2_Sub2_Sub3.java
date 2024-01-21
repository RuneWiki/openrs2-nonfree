import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Lclient!cd;")
	public final Class13 aClass13_15 = new Class13();

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "Lclient!se;")
	public final Class2_Sub2_Sub4 aClass2_Sub2_Sub4_25 = new Class2_Sub2_Sub4();

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!ie;")
	private final Class2_Sub2_Sub2 aClass2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) Class2_Sub2_Sub2 arg0) {
		this.aClass2_Sub2_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method1765(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2_Sub4_25.method1765(arg0);
		for (@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) this.aClass13_15.method270(); local15 != null; local15 = (Class2_Sub23) this.aClass13_15.method273()) {
			if (!this.aClass2_Sub2_Sub2_1.method801(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2923) {
						this.method1630(local15, local25);
						local15.anInt2923 -= local25;
						break;
					}
					this.method1630(local15, local15.anInt2923);
					local25 -= local15.anInt2923;
				} while (!this.aClass2_Sub2_Sub2_1.method800(0, local15, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub2 method1769() {
		@Pc(5) Class2_Sub23 local5 = (Class2_Sub23) this.aClass13_15.method270();
		if (local5 == null) {
			return null;
		} else if (local5.aClass2_Sub2_Sub1_3 == null) {
			return this.method1766();
		} else {
			return local5.aClass2_Sub2_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method1630(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub2_Sub2_1.anIntArray139[arg0.anInt2911] & 0x4) != 0 && arg0.anInt2904 < 0) {
			@Pc(26) int local26 = this.aClass2_Sub2_Sub2_1.anIntArray150[arg0.anInt2911] / Static107.anInt2405;
			@Pc(36) int local36 = (local26 + 1048575 - arg0.anInt2926) / local26;
			arg0.anInt2926 = arg0.anInt2926 + arg1 * local26 & 0xFFFFF;
			if (arg1 >= local36) {
				if (this.aClass2_Sub2_Sub2_1.anIntArray142[arg0.anInt2911] == 0) {
					arg0.aClass2_Sub2_Sub1_3 = Static137.method493(arg0.aClass2_Sub5_Sub1_1, arg0.aClass2_Sub2_Sub1_3.method500(), arg0.aClass2_Sub2_Sub1_3.method495(), arg0.aClass2_Sub2_Sub1_3.method488());
				} else {
					arg0.aClass2_Sub2_Sub1_3 = Static137.method493(arg0.aClass2_Sub5_Sub1_1, arg0.aClass2_Sub2_Sub1_3.method500(), 0, arg0.aClass2_Sub2_Sub1_3.method488());
					this.aClass2_Sub2_Sub2_1.method815(arg0, arg0.aClass2_Sub15_1.aShortArray33[arg0.anInt2908] < 0);
				}
				if (arg0.aClass2_Sub15_1.aShortArray33[arg0.anInt2908] < 0) {
					arg0.aClass2_Sub2_Sub1_3.method511(-1);
				}
				arg1 = arg0.anInt2926 / local26;
			}
		}
		arg0.aClass2_Sub2_Sub1_3.method1765(arg1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
	@Override
	public int method1763() {
		return 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([ILclient!wd;IIII)V")
	private void method1631(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub2_Sub2_1.anIntArray139[arg1.anInt2911] & 0x4) != 0 && arg1.anInt2904 < 0) {
			@Pc(28) int local28 = this.aClass2_Sub2_Sub2_1.anIntArray150[arg1.anInt2911] / Static107.anInt2405;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg1.anInt2926) / local28;
				if (arg2 < local38) {
					arg1.anInt2926 += arg2 * local28;
					break;
				}
				arg2 -= local38;
				arg1.aClass2_Sub2_Sub1_3.method1764(arg0, arg3, local38);
				arg3 += local38;
				@Pc(63) int local63 = Static107.anInt2405 / 100;
				arg1.anInt2926 += local38 * local28 - 1048576;
				@Pc(77) int local77 = 262144 / local28;
				if (local63 > local77) {
					local63 = local77;
				}
				@Pc(89) Class2_Sub2_Sub1 local89 = arg1.aClass2_Sub2_Sub1_3;
				if (this.aClass2_Sub2_Sub2_1.anIntArray142[arg1.anInt2911] == 0) {
					arg1.aClass2_Sub2_Sub1_3 = Static137.method493(arg1.aClass2_Sub5_Sub1_1, local89.method500(), local89.method495(), local89.method488());
				} else {
					arg1.aClass2_Sub2_Sub1_3 = Static137.method493(arg1.aClass2_Sub5_Sub1_1, local89.method500(), 0, local89.method488());
					this.aClass2_Sub2_Sub2_1.method815(arg1, arg1.aClass2_Sub15_1.aShortArray33[arg1.anInt2908] < 0);
					arg1.aClass2_Sub2_Sub1_3.method509(local63, local89.method495());
				}
				if (arg1.aClass2_Sub15_1.aShortArray33[arg1.anInt2908] < 0) {
					arg1.aClass2_Sub2_Sub1_3.method511(-1);
				}
				local89.method501(local63);
				local89.method1764(arg0, arg3, arg4 - arg3);
				if (local89.method507()) {
					this.aClass2_Sub2_Sub4_25.method1770(local89);
				}
			}
		}
		arg1.aClass2_Sub2_Sub1_3.method1764(arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub2 method1766() {
		@Pc(9) Class2_Sub23 local9;
		do {
			local9 = (Class2_Sub23) this.aClass13_15.method273();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub2_Sub1_3 == null);
		return local9.aClass2_Sub2_Sub1_3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
	@Override
	public void method1764(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_Sub4_25.method1764(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub23 local17 = (Class2_Sub23) this.aClass13_15.method270(); local17 != null; local17 = (Class2_Sub23) this.aClass13_15.method273()) {
			if (!this.aClass2_Sub2_Sub2_1.method801(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt2923) {
						this.method1631(arg0, local17, local29, local27, local27 + local29);
						local17.anInt2923 -= local29;
						break;
					}
					this.method1631(arg0, local17, local17.anInt2923, local27, local27 + local29);
					local27 += local17.anInt2923;
					local29 -= local17.anInt2923;
				} while (!this.aClass2_Sub2_Sub2_1.method800(local27, local17, arg0, local29));
			}
		}
	}
}
