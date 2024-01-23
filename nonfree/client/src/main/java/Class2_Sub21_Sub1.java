import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub21_Sub1 extends Class2_Sub21 {

	@OriginalMember(owner = "client!jg", name = "W", descriptor = "Lclient!he;")
	public Class44 aClass44_24 = new Class44();

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "Lclient!sc;")
	public Class2_Sub21_Sub3 aClass2_Sub21_Sub3_2 = new Class2_Sub21_Sub3();

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "Lclient!pc;")
	private Class2_Sub21_Sub2 aClass2_Sub21_Sub2_2;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class2_Sub21_Sub1(@OriginalArg(0) Class2_Sub21_Sub2 arg0) {
		this.aClass2_Sub21_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "([III)V")
	@Override
	public void method3844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub21_Sub3_2.method3844(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) this.aClass44_24.method1359(); local17 != null; local17 = (Class2_Sub20) this.aClass44_24.method1356()) {
			if (!this.aClass2_Sub21_Sub2_2.method2788(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt2120) {
						this.method1786(local29, local27 + local29, local17, arg0, local27);
						local17.anInt2120 -= local29;
						break;
					}
					this.method1786(local17.anInt2120, local27 + local29, local17, arg0, local27);
					local29 -= local17.anInt2120;
					local27 += local17.anInt2120;
				} while (!this.aClass2_Sub21_Sub2_2.method2768(arg0, local27, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILclient!j;[II)V")
	private void method1786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub20 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub21_Sub2_2.anIntArray588[arg2.anInt2124] & 0x4) != 0 && arg2.anInt2121 < 0) {
			@Pc(26) int local26 = this.aClass2_Sub21_Sub2_2.anIntArray584[arg2.anInt2124] / Static161.anInt3727;
			while (true) {
				@Pc(35) int local35 = (local26 + 1048575 - arg2.anInt2118) / local26;
				if (local35 > arg0) {
					arg2.anInt2118 += local26 * arg0;
					break;
				}
				@Pc(42) int local42 = 262144 / local26;
				arg0 -= local35;
				arg2.aClass2_Sub21_Sub4_3.method3844(arg3, arg4, local35);
				arg2.anInt2118 += local26 * local35 - 1048576;
				@Pc(66) int local66 = Static161.anInt3727 / 100;
				arg4 += local35;
				if (local42 < local66) {
					local66 = local42;
				}
				@Pc(82) Class2_Sub21_Sub4 local82 = arg2.aClass2_Sub21_Sub4_3;
				if (this.aClass2_Sub21_Sub2_2.anIntArray592[arg2.anInt2124] == 0) {
					arg2.aClass2_Sub21_Sub4_3 = Static237.method3884(arg2.aClass2_Sub22_Sub1_1, local82.method3861(), local82.method3864(), local82.method3855());
				} else {
					arg2.aClass2_Sub21_Sub4_3 = Static237.method3884(arg2.aClass2_Sub22_Sub1_1, local82.method3861(), 0, local82.method3855());
					this.aClass2_Sub21_Sub2_2.method2791(arg2, arg2.aClass2_Sub13_1.aShortArray24[arg2.anInt2130] < 0);
					arg2.aClass2_Sub21_Sub4_3.method3882(local66, local82.method3864());
				}
				if (arg2.aClass2_Sub13_1.aShortArray24[arg2.anInt2130] < 0) {
					arg2.aClass2_Sub21_Sub4_3.method3849(-1);
				}
				local82.method3885(local66);
				local82.method3844(arg3, arg4, arg1 - arg4);
				if (local82.method3883()) {
					this.aClass2_Sub21_Sub3_2.method3388(local82);
				}
			}
		}
		arg2.aClass2_Sub21_Sub4_3.method3844(arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()Lclient!lc;")
	@Override
	public Class2_Sub21 method3842() {
		@Pc(9) Class2_Sub20 local9;
		do {
			local9 = (Class2_Sub20) this.aClass44_24.method1356();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub21_Sub4_3 == null);
		return local9.aClass2_Sub21_Sub4_3;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!j;II)V")
	private void method1788(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub21_Sub2_2.anIntArray588[arg0.anInt2124] & 0x4) != 0 && arg0.anInt2121 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub21_Sub2_2.anIntArray584[arg0.anInt2124] / Static161.anInt3727;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt2118) / local30;
			arg0.anInt2118 = local30 * arg1 + arg0.anInt2118 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass2_Sub21_Sub2_2.anIntArray592[arg0.anInt2124] == 0) {
					arg0.aClass2_Sub21_Sub4_3 = Static237.method3884(arg0.aClass2_Sub22_Sub1_1, arg0.aClass2_Sub21_Sub4_3.method3861(), arg0.aClass2_Sub21_Sub4_3.method3864(), arg0.aClass2_Sub21_Sub4_3.method3855());
				} else {
					arg0.aClass2_Sub21_Sub4_3 = Static237.method3884(arg0.aClass2_Sub22_Sub1_1, arg0.aClass2_Sub21_Sub4_3.method3861(), 0, arg0.aClass2_Sub21_Sub4_3.method3855());
					this.aClass2_Sub21_Sub2_2.method2791(arg0, arg0.aClass2_Sub13_1.aShortArray24[arg0.anInt2130] < 0);
				}
				if (arg0.aClass2_Sub13_1.aShortArray24[arg0.anInt2130] < 0) {
					arg0.aClass2_Sub21_Sub4_3.method3849(-1);
				}
				arg1 = arg0.anInt2118 / local30;
			}
		}
		arg0.aClass2_Sub21_Sub4_3.method3845(arg1);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
	@Override
	public void method3845(@OriginalArg(0) int arg0) {
		this.aClass2_Sub21_Sub3_2.method3845(arg0);
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) this.aClass44_24.method1359(); local15 != null; local15 = (Class2_Sub20) this.aClass44_24.method1356()) {
			if (!this.aClass2_Sub21_Sub2_2.method2788(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2120 >= local25) {
						this.method1788(local15, local25);
						local15.anInt2120 -= local25;
						break;
					}
					this.method1788(local15, local15.anInt2120);
					local25 -= local15.anInt2120;
				} while (!this.aClass2_Sub21_Sub2_2.method2768(null, 0, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()Lclient!lc;")
	@Override
	public Class2_Sub21 method3840() {
		@Pc(9) Class2_Sub20 local9 = (Class2_Sub20) this.aClass44_24.method1359();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub21_Sub4_3 == null) {
			return this.method3842();
		} else {
			return local9.aClass2_Sub21_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "()I")
	@Override
	public int method3843() {
		return 0;
	}
}
