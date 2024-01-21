import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lclient!ac;")
	public final Class3 aClass3_15 = new Class3();

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Lclient!lb;")
	public final Class2_Sub5_Sub1 aClass2_Sub5_Sub1_2 = new Class2_Sub5_Sub1();

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "Lclient!ub;")
	private final Class2_Sub5_Sub4 aClass2_Sub5_Sub4_1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class2_Sub5_Sub3(@OriginalArg(0) Class2_Sub5_Sub4 arg0) {
		this.aClass2_Sub5_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()Lclient!d;")
	@Override
	public Class2_Sub5 method1954() {
		@Pc(9) Class2_Sub23 local9;
		do {
			local9 = (Class2_Sub23) this.aClass3_15.method74();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub5_Sub2_3 == null);
		return local9.aClass2_Sub5_Sub2_3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!uc;)V")
	private void method1753(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if ((this.aClass2_Sub5_Sub4_1.anIntArray312[arg1.anInt2780] & 0x4) != 0 && arg1.anInt2771 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub5_Sub4_1.anIntArray315[arg1.anInt2780] / Static68.anInt1863;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt2787) / local23;
			arg1.anInt2787 = arg0 * local23 + arg1.anInt2787 & 0xFFFFF;
			if (local33 <= arg0) {
				if (this.aClass2_Sub5_Sub4_1.anIntArray313[arg1.anInt2780] == 0) {
					arg1.aClass2_Sub5_Sub2_3 = Static137.method1294(arg1.aClass2_Sub4_Sub1_1, arg1.aClass2_Sub5_Sub2_3.method1298(), arg1.aClass2_Sub5_Sub2_3.method1319(), arg1.aClass2_Sub5_Sub2_3.method1320());
				} else {
					arg1.aClass2_Sub5_Sub2_3 = Static137.method1294(arg1.aClass2_Sub4_Sub1_1, arg1.aClass2_Sub5_Sub2_3.method1298(), 0, arg1.aClass2_Sub5_Sub2_3.method1320());
					this.aClass2_Sub5_Sub4_1.method1966(arg1, arg1.aClass2_Sub6_1.aShortArray4[arg1.anInt2767] < 0);
				}
				if (arg1.aClass2_Sub6_1.aShortArray4[arg1.anInt2767] < 0) {
					arg1.aClass2_Sub5_Sub2_3.method1326(-1);
				}
				arg0 = arg1.anInt2787 / local23;
			}
		}
		arg1.aClass2_Sub5_Sub2_3.method1959(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!uc;[IIII)V")
	private void method1754(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub5_Sub4_1.anIntArray312[arg0.anInt2780] & 0x4) != 0 && arg0.anInt2771 < 0) {
			@Pc(28) int local28 = this.aClass2_Sub5_Sub4_1.anIntArray315[arg0.anInt2780] / Static68.anInt1863;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg0.anInt2787) / local28;
				if (local38 > arg3) {
					arg0.anInt2787 += local28 * arg3;
					break;
				}
				arg3 -= local38;
				arg0.aClass2_Sub5_Sub2_3.method1957(arg1, arg2, local38);
				@Pc(54) Class2_Sub5_Sub2 local54 = arg0.aClass2_Sub5_Sub2_3;
				arg0.anInt2787 += local28 * local38 - 1048576;
				arg2 += local38;
				@Pc(72) int local72 = Static68.anInt1863 / 100;
				@Pc(76) int local76 = 262144 / local28;
				if (local76 < local72) {
					local72 = local76;
				}
				if (this.aClass2_Sub5_Sub4_1.anIntArray313[arg0.anInt2780] == 0) {
					arg0.aClass2_Sub5_Sub2_3 = Static137.method1294(arg0.aClass2_Sub4_Sub1_1, local54.method1298(), local54.method1319(), local54.method1320());
				} else {
					arg0.aClass2_Sub5_Sub2_3 = Static137.method1294(arg0.aClass2_Sub4_Sub1_1, local54.method1298(), 0, local54.method1320());
					this.aClass2_Sub5_Sub4_1.method1966(arg0, arg0.aClass2_Sub6_1.aShortArray4[arg0.anInt2767] < 0);
					arg0.aClass2_Sub5_Sub2_3.method1307(local72, local54.method1319());
				}
				if (arg0.aClass2_Sub6_1.aShortArray4[arg0.anInt2767] < 0) {
					arg0.aClass2_Sub5_Sub2_3.method1326(-1);
				}
				local54.method1300(local72);
				local54.method1957(arg1, arg2, arg4 - arg2);
				if (local54.method1296()) {
					this.aClass2_Sub5_Sub1_2.method1138(local54);
				}
			}
		}
		arg0.aClass2_Sub5_Sub2_3.method1957(arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()Lclient!d;")
	@Override
	public Class2_Sub5 method1960() {
		@Pc(9) Class2_Sub23 local9 = (Class2_Sub23) this.aClass3_15.method82();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub5_Sub2_3 == null) {
			return this.method1954();
		} else {
			return local9.aClass2_Sub5_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
	@Override
	public int method1955() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
	@Override
	public void method1957(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub5_Sub1_2.method1957(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub23 local17 = (Class2_Sub23) this.aClass3_15.method82(); local17 != null; local17 = (Class2_Sub23) this.aClass3_15.method74()) {
			if (!this.aClass2_Sub5_Sub4_1.method1973(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt2774 >= local27) {
						this.method1754(local17, arg0, local29, local27, local29 + local27);
						local17.anInt2774 -= local27;
						break;
					}
					this.method1754(local17, arg0, local29, local17.anInt2774, local29 + local27);
					local27 -= local17.anInt2774;
					local29 += local17.anInt2774;
				} while (!this.aClass2_Sub5_Sub4_1.method1970(arg0, local27, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	@Override
	public void method1959(@OriginalArg(0) int arg0) {
		this.aClass2_Sub5_Sub1_2.method1959(arg0);
		for (@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) this.aClass3_15.method82(); local15 != null; local15 = (Class2_Sub23) this.aClass3_15.method74()) {
			if (!this.aClass2_Sub5_Sub4_1.method1973(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2774) {
						this.method1753(local25, local15);
						local15.anInt2774 -= local25;
						break;
					}
					this.method1753(local15.anInt2774, local15);
					local25 -= local15.anInt2774;
				} while (!this.aClass2_Sub5_Sub4_1.method1970(null, local25, 0, local15));
			}
		}
	}
}
