import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "Lclient!vb;")
	public Class120 aClass120_16 = new Class120();

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Lclient!ec;")
	public Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2 = new Class1_Sub6_Sub1();

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!hj;")
	private Class1_Sub6_Sub2 aClass1_Sub6_Sub2_2;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class1_Sub6_Sub4(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		this.aClass1_Sub6_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()I")
	@Override
	public int method2184() {
		return 0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	@Override
	public void method2187(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_Sub1_2.method2187(arg0);
		for (@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) this.aClass120_16.method3564(); local15 != null; local15 = (Class1_Sub15) this.aClass120_16.method3561()) {
			if (!this.aClass1_Sub6_Sub2_2.method1458(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2390 >= local25) {
						this.method2190(local15, local25);
						local15.anInt2390 -= local25;
						break;
					}
					this.method2190(local15, local15.anInt2390);
					local25 -= local15.anInt2390;
				} while (!this.aClass1_Sub6_Sub2_2.method1467(null, local25, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lclient!pf;")
	@Override
	public Class1_Sub6 method2182() {
		@Pc(9) Class1_Sub15 local9;
		do {
			local9 = (Class1_Sub15) this.aClass120_16.method3561();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub6_Sub3_1 == null);
		return local9.aClass1_Sub6_Sub3_1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!kc;[III)V")
	private void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub15 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass1_Sub6_Sub2_2.anIntArray190[arg2.anInt2401] & 0x4) != 0 && arg2.anInt2392 < 0) {
			@Pc(31) int local31 = this.aClass1_Sub6_Sub2_2.anIntArray196[arg2.anInt2401] / Static14.anInt334;
			while (true) {
				@Pc(42) int local42 = (local31 + 1048575 - arg2.anInt2394) / local31;
				if (local42 > arg4) {
					arg2.anInt2394 += arg4 * local31;
					break;
				}
				arg4 -= local42;
				arg2.aClass1_Sub6_Sub3_1.method2183(arg3, arg0, local42);
				arg0 += local42;
				@Pc(66) Class1_Sub6_Sub3 local66 = arg2.aClass1_Sub6_Sub3_1;
				arg2.anInt2394 += local31 * local42 - 1048576;
				@Pc(80) int local80 = 262144 / local31;
				@Pc(84) int local84 = Static14.anInt334 / 100;
				if (local84 > local80) {
					local84 = local80;
				}
				if (this.aClass1_Sub6_Sub2_2.anIntArray195[arg2.anInt2401] == 0) {
					arg2.aClass1_Sub6_Sub3_1 = Static238.method1815(arg2.aClass1_Sub7_Sub1_1, local66.method1838(), local66.method1833(), local66.method1823());
				} else {
					arg2.aClass1_Sub6_Sub3_1 = Static238.method1815(arg2.aClass1_Sub7_Sub1_1, local66.method1838(), 0, local66.method1823());
					this.aClass1_Sub6_Sub2_2.method1462(arg2.aClass1_Sub14_1.aShortArray23[arg2.anInt2398] < 0, arg2);
					arg2.aClass1_Sub6_Sub3_1.method1816(local84, local66.method1833());
				}
				if (arg2.aClass1_Sub14_1.aShortArray23[arg2.anInt2398] < 0) {
					arg2.aClass1_Sub6_Sub3_1.method1837(-1);
				}
				local66.method1845(local84);
				local66.method2183(arg3, arg0, arg1 - arg0);
				if (local66.method1819()) {
					this.aClass1_Sub6_Sub1_2.method972(local66);
				}
			}
		}
		arg2.aClass1_Sub6_Sub3_1.method2183(arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kc;II)V")
	private void method2190(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub6_Sub2_2.anIntArray190[arg0.anInt2401] & 0x4) != 0 && arg0.anInt2392 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub6_Sub2_2.anIntArray196[arg0.anInt2401] / Static14.anInt334;
			@Pc(36) int local36 = (local26 + 1048575 - arg0.anInt2394) / local26;
			arg0.anInt2394 = arg1 * local26 + arg0.anInt2394 & 0xFFFFF;
			if (arg1 >= local36) {
				if (this.aClass1_Sub6_Sub2_2.anIntArray195[arg0.anInt2401] == 0) {
					arg0.aClass1_Sub6_Sub3_1 = Static238.method1815(arg0.aClass1_Sub7_Sub1_1, arg0.aClass1_Sub6_Sub3_1.method1838(), arg0.aClass1_Sub6_Sub3_1.method1833(), arg0.aClass1_Sub6_Sub3_1.method1823());
				} else {
					arg0.aClass1_Sub6_Sub3_1 = Static238.method1815(arg0.aClass1_Sub7_Sub1_1, arg0.aClass1_Sub6_Sub3_1.method1838(), 0, arg0.aClass1_Sub6_Sub3_1.method1823());
					this.aClass1_Sub6_Sub2_2.method1462(arg0.aClass1_Sub14_1.aShortArray23[arg0.anInt2398] < 0, arg0);
				}
				if (arg0.aClass1_Sub14_1.aShortArray23[arg0.anInt2398] < 0) {
					arg0.aClass1_Sub6_Sub3_1.method1837(-1);
				}
				arg1 = arg0.anInt2394 / local26;
			}
		}
		arg0.aClass1_Sub6_Sub3_1.method2187(arg1);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()Lclient!pf;")
	@Override
	public Class1_Sub6 method2185() {
		@Pc(5) Class1_Sub15 local5 = (Class1_Sub15) this.aClass120_16.method3564();
		if (local5 == null) {
			return null;
		} else if (local5.aClass1_Sub6_Sub3_1 == null) {
			return this.method2182();
		} else {
			return local5.aClass1_Sub6_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
	@Override
	public void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub6_Sub1_2.method2183(arg0, arg1, arg2);
		for (@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) this.aClass120_16.method3564(); local13 != null; local13 = (Class1_Sub15) this.aClass120_16.method3561()) {
			if (!this.aClass1_Sub6_Sub2_2.method1458(local13)) {
				@Pc(23) int local23 = arg1;
				@Pc(25) int local25 = arg2;
				do {
					if (local13.anInt2390 >= local25) {
						this.method2189(local23, local23 + local25, local13, arg0, local25);
						local13.anInt2390 -= local25;
						break;
					}
					this.method2189(local23, local25 + local23, local13, arg0, local13.anInt2390);
					local23 += local13.anInt2390;
					local25 -= local13.anInt2390;
				} while (!this.aClass1_Sub6_Sub2_2.method1467(arg0, local25, local13, local23));
			}
		}
	}
}
