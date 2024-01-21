import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class5_Sub11_Sub3 extends Class5_Sub11 {

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "Lclient!sg;")
	public final Class91 aClass91_12 = new Class91();

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "Lclient!ub;")
	public final Class5_Sub11_Sub4 aClass5_Sub11_Sub4_2 = new Class5_Sub11_Sub4();

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Lclient!kd;")
	private final Class5_Sub11_Sub2 aClass5_Sub11_Sub2_1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class5_Sub11_Sub3(@OriginalArg(0) Class5_Sub11_Sub2 arg0) {
		this.aClass5_Sub11_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "()Lclient!f;")
	@Override
	public Class5_Sub11 method2865() {
		@Pc(9) Class5_Sub8 local9;
		do {
			local9 = (Class5_Sub8) this.aClass91_12.method2678();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub11_Sub1_1 == null);
		return local9.aClass5_Sub11_Sub1_1;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "()Lclient!f;")
	@Override
	public Class5_Sub11 method2866() {
		@Pc(9) Class5_Sub8 local9 = (Class5_Sub8) this.aClass91_12.method2684();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub11_Sub1_1 == null) {
			return this.method2865();
		} else {
			return local9.aClass5_Sub11_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()I")
	@Override
	public int method2864() {
		return 0;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	@Override
	public void method2870(@OriginalArg(0) int arg0) {
		this.aClass5_Sub11_Sub4_2.method2870(arg0);
		for (@Pc(15) Class5_Sub8 local15 = (Class5_Sub8) this.aClass91_12.method2684(); local15 != null; local15 = (Class5_Sub8) this.aClass91_12.method2678()) {
			if (!this.aClass5_Sub11_Sub2_1.method1657(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt981 >= local25) {
						this.method2212(local15, local25);
						local15.anInt981 -= local25;
						break;
					}
					this.method2212(local15, local15.anInt981);
					local25 -= local15.anInt981;
				} while (!this.aClass5_Sub11_Sub2_1.method1633(local25, null, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[ILclient!ee;II)V")
	private void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class5_Sub8 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub11_Sub2_1.anIntArray203[arg3.anInt983] & 0x4) != 0 && arg3.anInt979 < 0) {
			@Pc(25) int local25 = this.aClass5_Sub11_Sub2_1.anIntArray201[arg3.anInt983] / Static62.anInt1362;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg3.anInt984) / local25;
				if (local35 > arg1) {
					arg3.anInt984 += local25 * arg1;
					break;
				}
				arg3.aClass5_Sub11_Sub1_1.method2869(arg2, arg4, local35);
				arg3.anInt984 += local25 * local35 - 1048576;
				arg1 -= local35;
				@Pc(61) Class5_Sub11_Sub1 local61 = arg3.aClass5_Sub11_Sub1_1;
				@Pc(65) int local65 = Static62.anInt1362 / 100;
				@Pc(69) int local69 = 262144 / local25;
				arg4 += local35;
				if (local69 < local65) {
					local65 = local69;
				}
				if (this.aClass5_Sub11_Sub2_1.anIntArray204[arg3.anInt983] == 0) {
					arg3.aClass5_Sub11_Sub1_1 = Static222.method1599(arg3.aClass5_Sub7_Sub1_1, local61.method1578(), local61.method1582(), local61.method1583());
				} else {
					arg3.aClass5_Sub11_Sub1_1 = Static222.method1599(arg3.aClass5_Sub7_Sub1_1, local61.method1578(), 0, local61.method1583());
					this.aClass5_Sub11_Sub2_1.method1647(arg3.aClass5_Sub4_1.aShortArray4[arg3.anInt992] < 0, arg3);
					arg3.aClass5_Sub11_Sub1_1.method1585(local65, local61.method1582());
				}
				if (arg3.aClass5_Sub4_1.aShortArray4[arg3.anInt992] < 0) {
					arg3.aClass5_Sub11_Sub1_1.method1606(-1);
				}
				local61.method1589(local65);
				local61.method2869(arg2, arg4, arg0 - arg4);
				if (local61.method1596()) {
					this.aClass5_Sub11_Sub4_2.method2872(local61);
				}
			}
		}
		arg3.aClass5_Sub11_Sub1_1.method2869(arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "([III)V")
	@Override
	public void method2869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub11_Sub4_2.method2869(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub8 local17 = (Class5_Sub8) this.aClass91_12.method2684(); local17 != null; local17 = (Class5_Sub8) this.aClass91_12.method2678()) {
			if (!this.aClass5_Sub11_Sub2_1.method1657(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt981 >= local27) {
						this.method2210(local29 + local27, local27, arg0, local17, local29);
						local17.anInt981 -= local27;
						break;
					}
					this.method2210(local29 + local27, local17.anInt981, arg0, local17, local29);
					local29 += local17.anInt981;
					local27 -= local17.anInt981;
				} while (!this.aClass5_Sub11_Sub2_1.method1633(local27, arg0, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ee;IB)V")
	private void method2212(@OriginalArg(0) Class5_Sub8 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass5_Sub11_Sub2_1.anIntArray203[arg0.anInt983] & 0x4) != 0 && arg0.anInt979 < 0) {
			@Pc(29) int local29 = this.aClass5_Sub11_Sub2_1.anIntArray201[arg0.anInt983] / Static62.anInt1362;
			@Pc(40) int local40 = (local29 + 1048575 - arg0.anInt984) / local29;
			arg0.anInt984 = arg0.anInt984 + arg1 * local29 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass5_Sub11_Sub2_1.anIntArray204[arg0.anInt983] == 0) {
					arg0.aClass5_Sub11_Sub1_1 = Static222.method1599(arg0.aClass5_Sub7_Sub1_1, arg0.aClass5_Sub11_Sub1_1.method1578(), arg0.aClass5_Sub11_Sub1_1.method1582(), arg0.aClass5_Sub11_Sub1_1.method1583());
				} else {
					arg0.aClass5_Sub11_Sub1_1 = Static222.method1599(arg0.aClass5_Sub7_Sub1_1, arg0.aClass5_Sub11_Sub1_1.method1578(), 0, arg0.aClass5_Sub11_Sub1_1.method1583());
					this.aClass5_Sub11_Sub2_1.method1647(arg0.aClass5_Sub4_1.aShortArray4[arg0.anInt992] < 0, arg0);
				}
				if (arg0.aClass5_Sub4_1.aShortArray4[arg0.anInt992] < 0) {
					arg0.aClass5_Sub11_Sub1_1.method1606(-1);
				}
				arg1 = arg0.anInt984 / local29;
			}
		}
		arg0.aClass5_Sub11_Sub1_1.method2870(arg1);
	}
}
