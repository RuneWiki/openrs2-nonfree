import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Lclient!db;")
	public Class19 aClass19_3 = new Class19();

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Lclient!wb;")
	public Class1_Sub7_Sub2 aClass1_Sub7_Sub2_1 = new Class1_Sub7_Sub2();

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Lclient!wd;")
	private Class1_Sub7_Sub3 aClass1_Sub7_Sub3_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) Class1_Sub7_Sub3 arg0) {
		this.aClass1_Sub7_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([III)V")
	@Override
	public void method3448(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub7_Sub2_1.method3448(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass19_3.method609(); local17 != null; local17 = (Class1_Sub13) this.aClass19_3.method615()) {
			if (!this.aClass1_Sub7_Sub3_1.method3413(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1858) {
						this.method657(local29, local17, local27 + local29, local27, arg0);
						local17.anInt1858 -= local29;
						break;
					}
					this.method657(local17.anInt1858, local17, local29 + local27, local27, arg0);
					local27 += local17.anInt1858;
					local29 -= local17.anInt1858;
				} while (!this.aClass1_Sub7_Sub3_1.method3405(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!hg;IB)V")
	private void method655(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub7_Sub3_1.anIntArray642[arg0.anInt1867] & 0x4) != 0 && arg0.anInt1879 < 0) {
			@Pc(35) int local35 = this.aClass1_Sub7_Sub3_1.anIntArray641[arg0.anInt1867] / Static191.anInt4086;
			@Pc(45) int local45 = (local35 + 1048575 - arg0.anInt1874) / local35;
			arg0.anInt1874 = arg0.anInt1874 + local35 * arg1 & 0xFFFFF;
			if (local45 <= arg1) {
				if (this.aClass1_Sub7_Sub3_1.anIntArray644[arg0.anInt1867] == 0) {
					arg0.aClass1_Sub7_Sub4_1 = Static229.method3480(arg0.aClass1_Sub19_Sub1_1, arg0.aClass1_Sub7_Sub4_1.method3459(), arg0.aClass1_Sub7_Sub4_1.method3463(), arg0.aClass1_Sub7_Sub4_1.method3462());
				} else {
					arg0.aClass1_Sub7_Sub4_1 = Static229.method3480(arg0.aClass1_Sub19_Sub1_1, arg0.aClass1_Sub7_Sub4_1.method3459(), 0, arg0.aClass1_Sub7_Sub4_1.method3462());
					this.aClass1_Sub7_Sub3_1.method3399(arg0.aClass1_Sub3_1.aShortArray2[arg0.anInt1865] < 0, arg0);
				}
				if (arg0.aClass1_Sub3_1.aShortArray2[arg0.anInt1865] < 0) {
					arg0.aClass1_Sub7_Sub4_1.method3470(-1);
				}
				arg1 = arg0.anInt1874 / local35;
			}
		}
		arg0.aClass1_Sub7_Sub4_1.method3450(arg1);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()Lclient!li;")
	@Override
	public Class1_Sub7 method3454() {
		@Pc(9) Class1_Sub13 local9 = (Class1_Sub13) this.aClass19_3.method609();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub7_Sub4_1 == null) {
			return this.method3452();
		} else {
			return local9.aClass1_Sub7_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()Lclient!li;")
	@Override
	public Class1_Sub7 method3452() {
		@Pc(9) Class1_Sub13 local9;
		do {
			local9 = (Class1_Sub13) this.aClass19_3.method615();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub7_Sub4_1 == null);
		return local9.aClass1_Sub7_Sub4_1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!hg;II[I)V")
	private void method657(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub7_Sub3_1.anIntArray642[arg1.anInt1867] & 0x4) != 0 && arg1.anInt1879 < 0) {
			@Pc(37) int local37 = this.aClass1_Sub7_Sub3_1.anIntArray641[arg1.anInt1867] / Static191.anInt4086;
			while (true) {
				@Pc(46) int local46 = (local37 + 1048575 - arg1.anInt1874) / local37;
				if (arg0 < local46) {
					arg1.anInt1874 += arg0 * local37;
					break;
				}
				arg0 -= local46;
				arg1.aClass1_Sub7_Sub4_1.method3448(arg4, arg3, local46);
				arg1.anInt1874 += local37 * local46 - 1048576;
				@Pc(73) int local73 = 262144 / local37;
				@Pc(76) Class1_Sub7_Sub4 local76 = arg1.aClass1_Sub7_Sub4_1;
				@Pc(80) int local80 = Static191.anInt4086 / 100;
				if (local80 > local73) {
					local80 = local73;
				}
				if (this.aClass1_Sub7_Sub3_1.anIntArray644[arg1.anInt1867] == 0) {
					arg1.aClass1_Sub7_Sub4_1 = Static229.method3480(arg1.aClass1_Sub19_Sub1_1, local76.method3459(), local76.method3463(), local76.method3462());
				} else {
					arg1.aClass1_Sub7_Sub4_1 = Static229.method3480(arg1.aClass1_Sub19_Sub1_1, local76.method3459(), 0, local76.method3462());
					this.aClass1_Sub7_Sub3_1.method3399(arg1.aClass1_Sub3_1.aShortArray2[arg1.anInt1865] < 0, arg1);
					arg1.aClass1_Sub7_Sub4_1.method3460(local80, local76.method3463());
				}
				if (arg1.aClass1_Sub3_1.aShortArray2[arg1.anInt1865] < 0) {
					arg1.aClass1_Sub7_Sub4_1.method3470(-1);
				}
				local76.method3465(local80);
				arg3 += local46;
				local76.method3448(arg4, arg3, arg2 - arg3);
				if (local76.method3484()) {
					this.aClass1_Sub7_Sub2_1.method3378(local76);
				}
			}
		}
		arg1.aClass1_Sub7_Sub4_1.method3448(arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	@Override
	public void method3450(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_Sub2_1.method3450(arg0);
		for (@Pc(11) Class1_Sub13 local11 = (Class1_Sub13) this.aClass19_3.method609(); local11 != null; local11 = (Class1_Sub13) this.aClass19_3.method615()) {
			if (!this.aClass1_Sub7_Sub3_1.method3413(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt1858) {
						this.method655(local11, local21);
						local11.anInt1858 -= local21;
						break;
					}
					this.method655(local11, local11.anInt1858);
					local21 -= local11.anInt1858;
				} while (!this.aClass1_Sub7_Sub3_1.method3405(0, local21, null, local11));
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()I")
	@Override
	public int method3453() {
		return 0;
	}
}
