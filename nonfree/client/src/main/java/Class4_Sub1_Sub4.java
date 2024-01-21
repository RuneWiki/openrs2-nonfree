import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!lb;")
	public final Class45 aClass45_15 = new Class45();

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "Lclient!kc;")
	public final Class4_Sub1_Sub3 aClass4_Sub1_Sub3_2 = new Class4_Sub1_Sub3();

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "Lclient!bc;")
	private final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!bc;)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		this.aClass4_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)V")
	@Override
	public void method1813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub1_Sub3_2.method1813(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub19 local17 = (Class4_Sub19) this.aClass45_15.method982(); local17 != null; local17 = (Class4_Sub19) this.aClass45_15.method986()) {
			if (!this.aClass4_Sub1_Sub1_2.method91(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt2643) {
						this.method1818(local27 + local29, local29, local27, local17, arg0);
						local17.anInt2643 -= local29;
						break;
					}
					this.method1818(local29 + local27, local17.anInt2643, local27, local17, arg0);
					local29 -= local17.anInt2643;
					local27 += local17.anInt2643;
				} while (!this.aClass4_Sub1_Sub1_2.method111(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILclient!tc;[I)V")
	private void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub19 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass4_Sub1_Sub1_2.anIntArray14[arg3.anInt2650] & 0x4) != 0 && arg3.anInt2645 < 0) {
			@Pc(25) int local25 = this.aClass4_Sub1_Sub1_2.anIntArray23[arg3.anInt2650] / Static115.anInt2690;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg3.anInt2642) / local25;
				if (local35 > arg1) {
					arg3.anInt2642 += local25 * arg1;
					break;
				}
				arg1 -= local35;
				@Pc(46) int local46 = 262144 / local25;
				arg3.aClass4_Sub1_Sub2_1.method1813(arg4, arg2, local35);
				arg2 += local35;
				@Pc(59) Class4_Sub1_Sub2 local59 = arg3.aClass4_Sub1_Sub2_1;
				@Pc(63) int local63 = Static115.anInt2690 / 100;
				if (local63 > local46) {
					local63 = local46;
				}
				arg3.anInt2642 += local25 * local35 - 1048576;
				if (this.aClass4_Sub1_Sub1_2.anIntArray24[arg3.anInt2650] == 0) {
					arg3.aClass4_Sub1_Sub2_1 = Static137.method904(arg3.aClass4_Sub6_Sub1_1, local59.method933(), local59.method925(), local59.method903());
				} else {
					arg3.aClass4_Sub1_Sub2_1 = Static137.method904(arg3.aClass4_Sub6_Sub1_1, local59.method933(), 0, local59.method903());
					this.aClass4_Sub1_Sub1_2.method126(arg3.aClass4_Sub15_1.aShortArray35[arg3.anInt2630] < 0, arg3);
					arg3.aClass4_Sub1_Sub2_1.method926(local63, local59.method925());
				}
				if (arg3.aClass4_Sub15_1.aShortArray35[arg3.anInt2630] < 0) {
					arg3.aClass4_Sub1_Sub2_1.method899(-1);
				}
				local59.method906(local63);
				local59.method1813(arg4, arg2, arg0 - arg2);
				if (local59.method902()) {
					this.aClass4_Sub1_Sub3_2.method967(local59);
				}
			}
		}
		arg3.aClass4_Sub1_Sub2_1.method1813(arg4, arg2, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!tc;II)V")
	private void method1821(@OriginalArg(0) Class4_Sub19 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass4_Sub1_Sub1_2.anIntArray14[arg0.anInt2650] & 0x4) != 0 && arg0.anInt2645 < 0) {
			@Pc(24) int local24 = this.aClass4_Sub1_Sub1_2.anIntArray23[arg0.anInt2650] / Static115.anInt2690;
			@Pc(34) int local34 = (local24 + 1048575 - arg0.anInt2642) / local24;
			arg0.anInt2642 = arg1 * local24 + arg0.anInt2642 & 0xFFFFF;
			if (arg1 >= local34) {
				if (this.aClass4_Sub1_Sub1_2.anIntArray24[arg0.anInt2650] == 0) {
					arg0.aClass4_Sub1_Sub2_1 = Static137.method904(arg0.aClass4_Sub6_Sub1_1, arg0.aClass4_Sub1_Sub2_1.method933(), arg0.aClass4_Sub1_Sub2_1.method925(), arg0.aClass4_Sub1_Sub2_1.method903());
				} else {
					arg0.aClass4_Sub1_Sub2_1 = Static137.method904(arg0.aClass4_Sub6_Sub1_1, arg0.aClass4_Sub1_Sub2_1.method933(), 0, arg0.aClass4_Sub1_Sub2_1.method903());
					this.aClass4_Sub1_Sub1_2.method126(arg0.aClass4_Sub15_1.aShortArray35[arg0.anInt2630] < 0, arg0);
				}
				if (arg0.aClass4_Sub15_1.aShortArray35[arg0.anInt2630] < 0) {
					arg0.aClass4_Sub1_Sub2_1.method899(-1);
				}
				arg1 = arg0.anInt2642 / local24;
			}
		}
		arg0.aClass4_Sub1_Sub2_1.method1817(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public Class4_Sub1 method1814() {
		@Pc(9) Class4_Sub19 local9 = (Class4_Sub19) this.aClass45_15.method982();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub1_Sub2_1 == null) {
			return this.method1811();
		} else {
			return local9.aClass4_Sub1_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "()I")
	@Override
	public int method1816() {
		return 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()Lclient!ac;")
	@Override
	public Class4_Sub1 method1811() {
		@Pc(9) Class4_Sub19 local9;
		do {
			local9 = (Class4_Sub19) this.aClass45_15.method986();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub1_Sub2_1 == null);
		return local9.aClass4_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	@Override
	public void method1817(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_Sub3_2.method1817(arg0);
		for (@Pc(15) Class4_Sub19 local15 = (Class4_Sub19) this.aClass45_15.method982(); local15 != null; local15 = (Class4_Sub19) this.aClass45_15.method986()) {
			if (!this.aClass4_Sub1_Sub1_2.method91(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2643 >= local25) {
						this.method1821(local15, local25);
						local15.anInt2643 -= local25;
						break;
					}
					this.method1821(local15, local15.anInt2643);
					local25 -= local15.anInt2643;
				} while (!this.aClass4_Sub1_Sub1_2.method111(0, local25, null, local15));
			}
		}
	}
}
