import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!q", name = "y", descriptor = "Lclient!a;")
	public Class1 aClass1_16 = new Class1();

	@OriginalMember(owner = "client!q", name = "I", descriptor = "Lclient!be;")
	public Class2_Sub5_Sub1 aClass2_Sub5_Sub1_2 = new Class2_Sub5_Sub1();

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!mg;")
	private Class2_Sub5_Sub3 aClass2_Sub5_Sub3_2;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!mg;)V")
	public Class2_Sub5_Sub4(@OriginalArg(0) Class2_Sub5_Sub3 arg0) {
		this.aClass2_Sub5_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()I")
	@Override
	public int method3549() {
		return 0;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "([III)V")
	@Override
	public void method3550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub5_Sub1_2.method3550(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub33 local17 = (Class2_Sub33) this.aClass1_16.method13(); local17 != null; local17 = (Class2_Sub33) this.aClass1_16.method9()) {
			if (!this.aClass2_Sub5_Sub3_2.method2767(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local17.anInt6112 >= local29) {
						this.method3554(local31 + local29, arg0, local29, local17, local31);
						local17.anInt6112 -= local29;
						break;
					}
					this.method3554(local31 + local29, arg0, local17.anInt6112, local17, local31);
					local29 -= local17.anInt6112;
					local31 += local17.anInt6112;
				} while (!this.aClass2_Sub5_Sub3_2.method2752(local29, local31, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!wi;I)V")
	private void method3552(@OriginalArg(1) Class2_Sub33 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub5_Sub3_2.anIntArray245[arg0.anInt6124] & 0x4) != 0 && arg0.anInt6117 < 0) {
			@Pc(33) int local33 = this.aClass2_Sub5_Sub3_2.anIntArray249[arg0.anInt6124] / Static110.anInt2380;
			@Pc(43) int local43 = (local33 + 1048575 - arg0.anInt6107) / local33;
			arg0.anInt6107 = local33 * arg1 + arg0.anInt6107 & 0xFFFFF;
			if (local43 <= arg1) {
				if (this.aClass2_Sub5_Sub3_2.anIntArray244[arg0.anInt6124] == 0) {
					arg0.aClass2_Sub5_Sub2_3 = Static306.method1815(arg0.aClass2_Sub9_Sub1_1, arg0.aClass2_Sub5_Sub2_3.method1804(), arg0.aClass2_Sub5_Sub2_3.method1818(), arg0.aClass2_Sub5_Sub2_3.method1798());
				} else {
					arg0.aClass2_Sub5_Sub2_3 = Static306.method1815(arg0.aClass2_Sub9_Sub1_1, arg0.aClass2_Sub5_Sub2_3.method1804(), 0, arg0.aClass2_Sub5_Sub2_3.method1798());
					this.aClass2_Sub5_Sub3_2.method2750(arg0.aClass2_Sub14_1.aShortArray38[arg0.anInt6102] < 0, arg0);
				}
				if (arg0.aClass2_Sub14_1.aShortArray38[arg0.anInt6102] < 0) {
					arg0.aClass2_Sub5_Sub2_3.method1794(-1);
				}
				arg1 = arg0.anInt6107 / local33;
			}
		}
		arg0.aClass2_Sub5_Sub2_3.method3546(arg1);
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "()Lclient!md;")
	@Override
	public Class2_Sub5 method3551() {
		while (true) {
			@Pc(9) Class2_Sub33 local9 = (Class2_Sub33) this.aClass1_16.method9();
			if (local9 != null) {
				if (local9.aClass2_Sub5_Sub2_3 == null) {
					continue;
				}
				return local9.aClass2_Sub5_Sub2_3;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	@Override
	public void method3546(@OriginalArg(0) int arg0) {
		this.aClass2_Sub5_Sub1_2.method3546(arg0);
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) this.aClass1_16.method13(); local11 != null; local11 = (Class2_Sub33) this.aClass1_16.method9()) {
			if (!this.aClass2_Sub5_Sub3_2.method2767(local11)) {
				@Pc(23) int local23 = arg0;
				do {
					if (local23 <= local11.anInt6112) {
						this.method3552(local11, local23);
						local11.anInt6112 -= local23;
						break;
					}
					this.method3552(local11, local11.anInt6112);
					local23 -= local11.anInt6112;
				} while (!this.aClass2_Sub5_Sub3_2.method2752(local23, 0, local11, null));
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[IIBLclient!wi;I)V")
	private void method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub33 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub5_Sub3_2.anIntArray245[arg3.anInt6124] & 0x4) != 0 && arg3.anInt6117 < 0) {
			@Pc(36) int local36 = this.aClass2_Sub5_Sub3_2.anIntArray249[arg3.anInt6124] / Static110.anInt2380;
			while (true) {
				@Pc(45) int local45 = (local36 + 1048575 - arg3.anInt6107) / local36;
				if (arg2 < local45) {
					arg3.anInt6107 += arg2 * local36;
					break;
				}
				arg3.aClass2_Sub5_Sub2_3.method3550(arg1, arg4, local45);
				arg3.anInt6107 += local45 * local36 - 1048576;
				arg2 -= local45;
				arg4 += local45;
				@Pc(75) Class2_Sub5_Sub2 local75 = arg3.aClass2_Sub5_Sub2_3;
				@Pc(79) int local79 = Static110.anInt2380 / 100;
				@Pc(83) int local83 = 262144 / local36;
				if (local83 < local79) {
					local79 = local83;
				}
				if (this.aClass2_Sub5_Sub3_2.anIntArray244[arg3.anInt6124] == 0) {
					arg3.aClass2_Sub5_Sub2_3 = Static306.method1815(arg3.aClass2_Sub9_Sub1_1, local75.method1804(), local75.method1818(), local75.method1798());
				} else {
					arg3.aClass2_Sub5_Sub2_3 = Static306.method1815(arg3.aClass2_Sub9_Sub1_1, local75.method1804(), 0, local75.method1798());
					this.aClass2_Sub5_Sub3_2.method2750(arg3.aClass2_Sub14_1.aShortArray38[arg3.anInt6102] < 0, arg3);
					arg3.aClass2_Sub5_Sub2_3.method1784(local79, local75.method1818());
				}
				if (arg3.aClass2_Sub14_1.aShortArray38[arg3.anInt6102] < 0) {
					arg3.aClass2_Sub5_Sub2_3.method1794(-1);
				}
				local75.method1808(local79);
				local75.method3550(arg1, arg4, arg0 - arg4);
				if (local75.method1810()) {
					this.aClass2_Sub5_Sub1_2.method403(local75);
				}
			}
		}
		arg3.aClass2_Sub5_Sub2_3.method3550(arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()Lclient!md;")
	@Override
	public Class2_Sub5 method3548() {
		@Pc(5) Class2_Sub33 local5 = (Class2_Sub33) this.aClass1_16.method13();
		if (local5 == null) {
			return null;
		} else if (local5.aClass2_Sub5_Sub2_3 == null) {
			return this.method3551();
		} else {
			return local5.aClass2_Sub5_Sub2_3;
		}
	}
}
