import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub9_Sub2 extends Class2_Sub9 {

	@OriginalMember(owner = "client!re", name = "F", descriptor = "Lclient!cb;")
	public final Class10 aClass10_90 = new Class10();

	@OriginalMember(owner = "client!re", name = "R", descriptor = "Lclient!w;")
	public final Class2_Sub9_Sub4 aClass2_Sub9_Sub4_1 = new Class2_Sub9_Sub4();

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!se;")
	private final Class2_Sub9_Sub3 aClass2_Sub9_Sub3_2;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class2_Sub9_Sub2(@OriginalArg(0) Class2_Sub9_Sub3 arg0) {
		this.aClass2_Sub9_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()Lclient!ig;")
	@Override
	public Class2_Sub9 method2925() {
		@Pc(9) Class2_Sub23 local9 = (Class2_Sub23) this.aClass10_90.method444();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub9_Sub1_1 == null) {
			return this.method2926();
		} else {
			return local9.aClass2_Sub9_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!wd;III[I)V")
	private void method2329(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass2_Sub9_Sub3_2.anIntArray529[arg1.anInt4500] & 0x4) != 0 && arg1.anInt4491 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub9_Sub3_2.anIntArray527[arg1.anInt4500] / Static63.anInt1680;
			while (true) {
				@Pc(38) int local38 = (local29 + 1048575 - arg1.anInt4497) / local29;
				if (local38 > arg3) {
					arg1.anInt4497 += arg3 * local29;
					break;
				}
				arg1.aClass2_Sub9_Sub1_1.method2927(arg4, arg0, local38);
				arg3 -= local38;
				@Pc(55) int local55 = 262144 / local29;
				arg1.anInt4497 += local38 * local29 - 1048576;
				@Pc(69) int local69 = Static63.anInt1680 / 100;
				if (local69 > local55) {
					local69 = local55;
				}
				arg0 += local38;
				@Pc(85) Class2_Sub9_Sub1 local85 = arg1.aClass2_Sub9_Sub1_1;
				if (this.aClass2_Sub9_Sub3_2.anIntArray518[arg1.anInt4500] == 0) {
					arg1.aClass2_Sub9_Sub1_1 = Static187.method1738(arg1.aClass2_Sub5_Sub1_1, local85.method1709(), local85.method1727(), local85.method1705());
				} else {
					arg1.aClass2_Sub9_Sub1_1 = Static187.method1738(arg1.aClass2_Sub5_Sub1_1, local85.method1709(), 0, local85.method1705());
					this.aClass2_Sub9_Sub3_2.method2488(arg1, arg1.aClass2_Sub12_1.aShortArray74[arg1.anInt4499] < 0);
					arg1.aClass2_Sub9_Sub1_1.method1714(local69, local85.method1727());
				}
				if (arg1.aClass2_Sub12_1.aShortArray74[arg1.anInt4499] < 0) {
					arg1.aClass2_Sub9_Sub1_1.method1723(-1);
				}
				local85.method1719(local69);
				local85.method2927(arg4, arg0, arg2 - arg0);
				if (local85.method1716()) {
					this.aClass2_Sub9_Sub4_1.method2932(local85);
				}
			}
		}
		arg1.aClass2_Sub9_Sub1_1.method2927(arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!wd;IB)V")
	private void method2330(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub9_Sub3_2.anIntArray529[arg0.anInt4500] & 0x4) != 0 && arg0.anInt4491 < 0) {
			@Pc(27) int local27 = this.aClass2_Sub9_Sub3_2.anIntArray527[arg0.anInt4500] / Static63.anInt1680;
			@Pc(38) int local38 = (local27 + 1048575 - arg0.anInt4497) / local27;
			arg0.anInt4497 = arg0.anInt4497 + local27 * arg1 & 0xFFFFF;
			if (arg1 >= local38) {
				if (this.aClass2_Sub9_Sub3_2.anIntArray518[arg0.anInt4500] == 0) {
					arg0.aClass2_Sub9_Sub1_1 = Static187.method1738(arg0.aClass2_Sub5_Sub1_1, arg0.aClass2_Sub9_Sub1_1.method1709(), arg0.aClass2_Sub9_Sub1_1.method1727(), arg0.aClass2_Sub9_Sub1_1.method1705());
				} else {
					arg0.aClass2_Sub9_Sub1_1 = Static187.method1738(arg0.aClass2_Sub5_Sub1_1, arg0.aClass2_Sub9_Sub1_1.method1709(), 0, arg0.aClass2_Sub9_Sub1_1.method1705());
					this.aClass2_Sub9_Sub3_2.method2488(arg0, arg0.aClass2_Sub12_1.aShortArray74[arg0.anInt4499] < 0);
				}
				if (arg0.aClass2_Sub12_1.aShortArray74[arg0.anInt4499] < 0) {
					arg0.aClass2_Sub9_Sub1_1.method1723(-1);
				}
				arg1 = arg0.anInt4497 / local27;
			}
		}
		arg0.aClass2_Sub9_Sub1_1.method2930(arg1);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
	@Override
	public int method2931() {
		return 0;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	@Override
	public void method2930(@OriginalArg(0) int arg0) {
		this.aClass2_Sub9_Sub4_1.method2930(arg0);
		for (@Pc(13) Class2_Sub23 local13 = (Class2_Sub23) this.aClass10_90.method444(); local13 != null; local13 = (Class2_Sub23) this.aClass10_90.method451()) {
			if (!this.aClass2_Sub9_Sub3_2.method2476(local13)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local13.anInt4504 >= local22) {
						this.method2330(local13, local22);
						local13.anInt4504 -= local22;
						break;
					}
					this.method2330(local13, local13.anInt4504);
					local22 -= local13.anInt4504;
				} while (!this.aClass2_Sub9_Sub3_2.method2480(local22, local13, 0, null));
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()Lclient!ig;")
	@Override
	public Class2_Sub9 method2926() {
		@Pc(9) Class2_Sub23 local9;
		do {
			local9 = (Class2_Sub23) this.aClass10_90.method451();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub9_Sub1_1 == null);
		return local9.aClass2_Sub9_Sub1_1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
	@Override
	public void method2927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub9_Sub4_1.method2927(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub23 local17 = (Class2_Sub23) this.aClass10_90.method444(); local17 != null; local17 = (Class2_Sub23) this.aClass10_90.method451()) {
			if (!this.aClass2_Sub9_Sub3_2.method2476(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt4504) {
						this.method2329(local27, local17, local27 + local29, local29, arg0);
						local17.anInt4504 -= local29;
						break;
					}
					this.method2329(local27, local17, local29 + local27, local17.anInt4504, arg0);
					local27 += local17.anInt4504;
					local29 -= local17.anInt4504;
				} while (!this.aClass2_Sub9_Sub3_2.method2480(local29, local17, local27, arg0));
			}
		}
	}
}
