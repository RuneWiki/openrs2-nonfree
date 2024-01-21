import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub9_Sub3 extends Class1_Sub9 {

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Lclient!rc;")
	public final Class61 aClass61_13 = new Class61();

	@OriginalMember(owner = "client!pa", name = "jb", descriptor = "Lclient!ia;")
	public final Class1_Sub9_Sub2 aClass1_Sub9_Sub2_4 = new Class1_Sub9_Sub2();

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "Lclient!h;")
	private final Class1_Sub9_Sub1 aClass1_Sub9_Sub1_23;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class1_Sub9_Sub3(@OriginalArg(0) Class1_Sub9_Sub1 arg0) {
		this.aClass1_Sub9_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!lf;IZ)V")
	private void method1525(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub9_Sub1_23.anIntArray160[arg0.anInt1964] & 0x4) != 0 && arg0.anInt1951 < 0) {
			@Pc(20) int local20 = this.aClass1_Sub9_Sub1_23.anIntArray154[arg0.anInt1964] / Static39.anInt1014;
			@Pc(30) int local30 = (local20 + 1048575 - arg0.anInt1958) / local20;
			arg0.anInt1958 = arg1 * local20 + arg0.anInt1958 & 0xFFFFF;
			if (arg1 >= local30) {
				if (this.aClass1_Sub9_Sub1_23.anIntArray153[arg0.anInt1964] == 0) {
					arg0.aClass1_Sub9_Sub4_3 = Static140.method1577(arg0.aClass1_Sub14_Sub1_1, arg0.aClass1_Sub9_Sub4_3.method1564(), arg0.aClass1_Sub9_Sub4_3.method1593(), arg0.aClass1_Sub9_Sub4_3.method1561());
				} else {
					arg0.aClass1_Sub9_Sub4_3 = Static140.method1577(arg0.aClass1_Sub14_Sub1_1, arg0.aClass1_Sub9_Sub4_3.method1564(), 0, arg0.aClass1_Sub9_Sub4_3.method1561());
					this.aClass1_Sub9_Sub1_23.method817(arg0.aClass1_Sub6_1.aShortArray17[arg0.anInt1952] < 0, arg0);
				}
				if (arg0.aClass1_Sub6_1.aShortArray17[arg0.anInt1952] < 0) {
					arg0.aClass1_Sub9_Sub4_3.method1575(-1);
				}
				arg1 = arg0.anInt1958 / local20;
			}
		}
		arg0.aClass1_Sub9_Sub4_3.method1553(arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class1_Sub9 method1549() {
		@Pc(9) Class1_Sub15 local9 = (Class1_Sub15) this.aClass61_13.method1748();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub9_Sub4_3 == null) {
			return this.method1552();
		} else {
			return local9.aClass1_Sub9_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()I")
	@Override
	public int method1551() {
		return 0;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()Lclient!m;")
	@Override
	public Class1_Sub9 method1552() {
		@Pc(9) Class1_Sub15 local9;
		do {
			local9 = (Class1_Sub15) this.aClass61_13.method1760();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub9_Sub4_3 == null);
		return local9.aClass1_Sub9_Sub4_3;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	@Override
	public void method1553(@OriginalArg(0) int arg0) {
		this.aClass1_Sub9_Sub2_4.method1553(arg0);
		for (@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) this.aClass61_13.method1748(); local15 != null; local15 = (Class1_Sub15) this.aClass61_13.method1760()) {
			if (!this.aClass1_Sub9_Sub1_23.method831(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1963 >= local25) {
						this.method1525(local15, local25);
						local15.anInt1963 -= local25;
						break;
					}
					this.method1525(local15, local15.anInt1963);
					local25 -= local15.anInt1963;
				} while (!this.aClass1_Sub9_Sub1_23.method832(null, local15, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIIILclient!lf;)V")
	private void method1528(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub15 arg4) {
		if ((this.aClass1_Sub9_Sub1_23.anIntArray160[arg4.anInt1964] & 0x4) != 0 && arg4.anInt1951 < 0) {
			@Pc(22) int local22 = this.aClass1_Sub9_Sub1_23.anIntArray154[arg4.anInt1964] / Static39.anInt1014;
			while (true) {
				@Pc(32) int local32 = (local22 + 1048575 - arg4.anInt1958) / local22;
				if (arg2 < local32) {
					arg4.anInt1958 += local22 * arg2;
					break;
				}
				arg4.aClass1_Sub9_Sub4_3.method1554(arg0, arg3, local32);
				arg4.anInt1958 += local22 * local32 - 1048576;
				arg3 += local32;
				arg2 -= local32;
				@Pc(63) int local63 = Static39.anInt1014 / 100;
				@Pc(67) int local67 = 262144 / local22;
				@Pc(70) Class1_Sub9_Sub4 local70 = arg4.aClass1_Sub9_Sub4_3;
				if (local63 > local67) {
					local63 = local67;
				}
				if (this.aClass1_Sub9_Sub1_23.anIntArray153[arg4.anInt1964] == 0) {
					arg4.aClass1_Sub9_Sub4_3 = Static140.method1577(arg4.aClass1_Sub14_Sub1_1, local70.method1564(), local70.method1593(), local70.method1561());
				} else {
					arg4.aClass1_Sub9_Sub4_3 = Static140.method1577(arg4.aClass1_Sub14_Sub1_1, local70.method1564(), 0, local70.method1561());
					this.aClass1_Sub9_Sub1_23.method817(arg4.aClass1_Sub6_1.aShortArray17[arg4.anInt1952] < 0, arg4);
					arg4.aClass1_Sub9_Sub4_3.method1555(local63, local70.method1593());
				}
				if (arg4.aClass1_Sub6_1.aShortArray17[arg4.anInt1952] < 0) {
					arg4.aClass1_Sub9_Sub4_3.method1575(-1);
				}
				local70.method1558(local63);
				local70.method1554(arg0, arg3, arg1 - arg3);
				if (local70.method1579()) {
					this.aClass1_Sub9_Sub2_4.method1016(local70);
				}
			}
		}
		arg4.aClass1_Sub9_Sub4_3.method1554(arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "([III)V")
	@Override
	public void method1554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub9_Sub2_4.method1554(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) this.aClass61_13.method1748(); local17 != null; local17 = (Class1_Sub15) this.aClass61_13.method1760()) {
			if (!this.aClass1_Sub9_Sub1_23.method831(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1963) {
						this.method1528(arg0, local27 + local29, local29, local27, local17);
						local17.anInt1963 -= local29;
						break;
					}
					this.method1528(arg0, local27 + local29, local17.anInt1963, local27, local17);
					local27 += local17.anInt1963;
					local29 -= local17.anInt1963;
				} while (!this.aClass1_Sub9_Sub1_23.method832(arg0, local17, local29, local27));
			}
		}
	}
}
