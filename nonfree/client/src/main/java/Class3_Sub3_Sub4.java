import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "Lclient!se;")
	public final Class65 aClass65_80 = new Class65();

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "Lclient!ie;")
	public final Class3_Sub3_Sub2 aClass3_Sub3_Sub2_62 = new Class3_Sub3_Sub2();

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!bf;")
	private final Class3_Sub3_Sub1 aClass3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class3_Sub3_Sub4(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		this.aClass3_Sub3_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([III)V")
	@Override
	public void method2146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub3_Sub2_62.method2146(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub12 local17 = (Class3_Sub12) this.aClass65_80.method1958(); local17 != null; local17 = (Class3_Sub12) this.aClass65_80.method1962()) {
			if (!this.aClass3_Sub3_Sub1_2.method228(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1819) {
						this.method2155(local29, local29 + local27, arg0, local17, local27);
						local17.anInt1819 -= local27;
						break;
					}
					this.method2155(local29, local27 + local29, arg0, local17, local17.anInt1819);
					local27 -= local17.anInt1819;
					local29 += local17.anInt1819;
				} while (!this.aClass3_Sub3_Sub1_2.method219(local29, local17, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lclient!da;")
	@Override
	public Class3_Sub3 method2145() {
		@Pc(9) Class3_Sub12 local9 = (Class3_Sub12) this.aClass65_80.method1958();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub3_Sub3_1 == null) {
			return this.method2147();
		} else {
			return local9.aClass3_Sub3_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	@Override
	public void method2148(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3_Sub2_62.method2148(arg0);
		for (@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) this.aClass65_80.method1958(); local15 != null; local15 = (Class3_Sub12) this.aClass65_80.method1962()) {
			if (!this.aClass3_Sub3_Sub1_2.method228(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1819) {
						this.method2153(local25, local15);
						local15.anInt1819 -= local25;
						break;
					}
					this.method2153(local15.anInt1819, local15);
					local25 -= local15.anInt1819;
				} while (!this.aClass3_Sub3_Sub1_2.method219(0, local15, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLclient!kc;)V")
	private void method2153(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		if ((this.aClass3_Sub3_Sub1_2.anIntArray38[arg1.anInt1817] & 0x4) != 0 && arg1.anInt1818 < 0) {
			@Pc(36) int local36 = this.aClass3_Sub3_Sub1_2.anIntArray46[arg1.anInt1817] / Static110.anInt2948;
			@Pc(46) int local46 = (local36 + 1048575 - arg1.anInt1840) / local36;
			arg1.anInt1840 = arg1.anInt1840 + local36 * arg0 & 0xFFFFF;
			if (local46 <= arg0) {
				if (this.aClass3_Sub3_Sub1_2.anIntArray44[arg1.anInt1817] == 0) {
					arg1.aClass3_Sub3_Sub3_1 = Static139.method1826(arg1.aClass3_Sub5_Sub1_1, arg1.aClass3_Sub3_Sub3_1.method1849(), arg1.aClass3_Sub3_Sub3_1.method1815(), arg1.aClass3_Sub3_Sub3_1.method1838());
				} else {
					arg1.aClass3_Sub3_Sub3_1 = Static139.method1826(arg1.aClass3_Sub5_Sub1_1, arg1.aClass3_Sub3_Sub3_1.method1849(), 0, arg1.aClass3_Sub3_Sub3_1.method1838());
					this.aClass3_Sub3_Sub1_2.method234(arg1.aClass3_Sub23_1.aShortArray19[arg1.anInt1836] < 0, arg1);
				}
				if (arg1.aClass3_Sub23_1.aShortArray19[arg1.anInt1836] < 0) {
					arg1.aClass3_Sub3_Sub3_1.method1829(-1);
				}
				arg0 = arg1.anInt1840 / local36;
			}
		}
		arg1.aClass3_Sub3_Sub3_1.method2148(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()Lclient!da;")
	@Override
	public Class3_Sub3 method2147() {
		@Pc(9) Class3_Sub12 local9;
		do {
			local9 = (Class3_Sub12) this.aClass65_80.method1962();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub3_Sub3_1 == null);
		return local9.aClass3_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
	@Override
	public int method2144() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II[IILclient!kc;I)V")
	private void method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class3_Sub12 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub3_Sub1_2.anIntArray38[arg3.anInt1817] & 0x4) != 0 && arg3.anInt1818 < 0) {
			@Pc(28) int local28 = this.aClass3_Sub3_Sub1_2.anIntArray46[arg3.anInt1817] / Static110.anInt2948;
			while (true) {
				@Pc(37) int local37 = (local28 + 1048575 - arg3.anInt1840) / local28;
				if (local37 > arg4) {
					arg3.anInt1840 += arg4 * local28;
					break;
				}
				arg3.aClass3_Sub3_Sub3_1.method2146(arg2, arg0, local37);
				arg4 -= local37;
				arg3.anInt1840 += local37 * local28 - 1048576;
				arg0 += local37;
				@Pc(72) int local72 = Static110.anInt2948 / 100;
				@Pc(76) int local76 = 262144 / local28;
				@Pc(79) Class3_Sub3_Sub3 local79 = arg3.aClass3_Sub3_Sub3_1;
				if (local76 < local72) {
					local72 = local76;
				}
				if (this.aClass3_Sub3_Sub1_2.anIntArray44[arg3.anInt1817] == 0) {
					arg3.aClass3_Sub3_Sub3_1 = Static139.method1826(arg3.aClass3_Sub5_Sub1_1, local79.method1849(), local79.method1815(), local79.method1838());
				} else {
					arg3.aClass3_Sub3_Sub3_1 = Static139.method1826(arg3.aClass3_Sub5_Sub1_1, local79.method1849(), 0, local79.method1838());
					this.aClass3_Sub3_Sub1_2.method234(arg3.aClass3_Sub23_1.aShortArray19[arg3.anInt1836] < 0, arg3);
					arg3.aClass3_Sub3_Sub3_1.method1839(local72, local79.method1815());
				}
				if (arg3.aClass3_Sub23_1.aShortArray19[arg3.anInt1836] < 0) {
					arg3.aClass3_Sub3_Sub3_1.method1829(-1);
				}
				local79.method1851(local72);
				local79.method2146(arg2, arg0, arg1 - arg0);
				if (local79.method1845()) {
					this.aClass3_Sub3_Sub2_62.method1072(local79);
				}
			}
		}
		arg3.aClass3_Sub3_Sub3_1.method2146(arg2, arg0, arg4);
	}
}
