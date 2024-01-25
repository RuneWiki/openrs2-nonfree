import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class2_Sub10_Sub3 extends Class2_Sub10 {

	@OriginalMember(owner = "client!eba", name = "w", descriptor = "Lclient!ae;")
	public final Class8 aClass8_14 = new Class8();

	@OriginalMember(owner = "client!eba", name = "B", descriptor = "Lclient!ch;")
	public final Class2_Sub10_Sub1 aClass2_Sub10_Sub1_1 = new Class2_Sub10_Sub1();

	@OriginalMember(owner = "client!eba", name = "y", descriptor = "Lclient!dt;")
	private final Class2_Sub10_Sub2 aClass2_Sub10_Sub2_1;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class2_Sub10_Sub3(@OriginalArg(0) Class2_Sub10_Sub2 arg0) {
		this.aClass2_Sub10_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "([III)V")
	@Override
	public void method3363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub10_Sub1_1.method3363(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub21 local17 = (Class2_Sub21) this.aClass8_14.method210(); local17 != null; local17 = (Class2_Sub21) this.aClass8_14.method218()) {
			if (!this.aClass2_Sub10_Sub2_1.method1535(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt3830) {
						this.method1659(arg0, local17, local29 + local27, local27, local29);
						local17.anInt3830 -= local27;
						break;
					}
					this.method1659(arg0, local17, local27 + local29, local17.anInt3830, local29);
					local27 -= local17.anInt3830;
					local29 += local17.anInt3830;
				} while (!this.aClass2_Sub10_Sub2_1.method1539(arg0, local17, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "()I")
	@Override
	public int method3366() {
		return 0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBLclient!hb;)V")
	private void method1654(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		if ((this.aClass2_Sub10_Sub2_1.anIntArray123[arg1.anInt3828] & 0x4) != 0 && arg1.anInt3844 < 0) {
			@Pc(26) int local26 = this.aClass2_Sub10_Sub2_1.anIntArray121[arg1.anInt3828] / Static162.anInt3474;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt3834) / local26;
			arg1.anInt3834 = local26 * arg0 + arg1.anInt3834 & 0xFFFFF;
			if (local36 <= arg0) {
				if (this.aClass2_Sub10_Sub2_1.anIntArray128[arg1.anInt3828] == 0) {
					arg1.aClass2_Sub10_Sub4_1 = Static600.method3398(arg1.aClass2_Sub7_Sub1_1, arg1.aClass2_Sub10_Sub4_1.method3382(), arg1.aClass2_Sub10_Sub4_1.method3388(), arg1.aClass2_Sub10_Sub4_1.method3376());
				} else {
					arg1.aClass2_Sub10_Sub4_1 = Static600.method3398(arg1.aClass2_Sub7_Sub1_1, arg1.aClass2_Sub10_Sub4_1.method3382(), 0, arg1.aClass2_Sub10_Sub4_1.method3376());
					this.aClass2_Sub10_Sub2_1.method1550(arg1, arg1.aClass2_Sub45_1.aShortArray120[arg1.anInt3840] < 0);
				}
				if (arg1.aClass2_Sub45_1.aShortArray120[arg1.anInt3840] < 0) {
					arg1.aClass2_Sub10_Sub4_1.method3403(-1);
				}
				arg0 = arg1.anInt3834 / local26;
			}
		}
		arg1.aClass2_Sub10_Sub4_1.method3361(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "()Lclient!pn;")
	@Override
	public Class2_Sub10 method3360() {
		@Pc(9) Class2_Sub21 local9 = (Class2_Sub21) this.aClass8_14.method210();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub10_Sub4_1 == null) {
			return this.method3364();
		} else {
			return local9.aClass2_Sub10_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	@Override
	public void method3361(@OriginalArg(0) int arg0) {
		this.aClass2_Sub10_Sub1_1.method3361(arg0);
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) this.aClass8_14.method210(); local15 != null; local15 = (Class2_Sub21) this.aClass8_14.method218()) {
			if (!this.aClass2_Sub10_Sub2_1.method1535(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3830 >= local25) {
						this.method1654(local25, local15);
						local15.anInt3830 -= local25;
						break;
					}
					this.method1654(local15.anInt3830, local15);
					local25 -= local15.anInt3830;
				} while (!this.aClass2_Sub10_Sub2_1.method1539(null, local15, 0, local25));
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([ILclient!hb;IIII)V")
	private void method1659(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass2_Sub10_Sub2_1.anIntArray123[arg1.anInt3828] & 0x4) != 0 && arg1.anInt3844 < 0) {
			@Pc(25) int local25 = this.aClass2_Sub10_Sub2_1.anIntArray121[arg1.anInt3828] / Static162.anInt3474;
			while (true) {
				@Pc(34) int local34 = (local25 + 1048575 - arg1.anInt3834) / local25;
				if (arg3 < local34) {
					arg1.anInt3834 += local25 * arg3;
					break;
				}
				arg1.aClass2_Sub10_Sub4_1.method3363(arg0, arg4, local34);
				arg1.anInt3834 += local25 * local34 - 1048576;
				arg4 += local34;
				arg3 -= local34;
				@Pc(65) int local65 = Static162.anInt3474 / 100;
				@Pc(69) int local69 = 262144 / local25;
				if (local65 > local69) {
					local65 = local69;
				}
				@Pc(77) Class2_Sub10_Sub4 local77 = arg1.aClass2_Sub10_Sub4_1;
				if (this.aClass2_Sub10_Sub2_1.anIntArray128[arg1.anInt3828] == 0) {
					arg1.aClass2_Sub10_Sub4_1 = Static600.method3398(arg1.aClass2_Sub7_Sub1_1, local77.method3382(), local77.method3388(), local77.method3376());
				} else {
					arg1.aClass2_Sub10_Sub4_1 = Static600.method3398(arg1.aClass2_Sub7_Sub1_1, local77.method3382(), 0, local77.method3376());
					this.aClass2_Sub10_Sub2_1.method1550(arg1, arg1.aClass2_Sub45_1.aShortArray120[arg1.anInt3840] < 0);
					arg1.aClass2_Sub10_Sub4_1.method3375(local65, local77.method3388());
				}
				if (arg1.aClass2_Sub45_1.aShortArray120[arg1.anInt3840] < 0) {
					arg1.aClass2_Sub10_Sub4_1.method3403(-1);
				}
				local77.method3399(local65);
				local77.method3363(arg0, arg4, arg2 - arg4);
				if (local77.method3405()) {
					this.aClass2_Sub10_Sub1_1.method1013(local77);
				}
			}
		}
		arg1.aClass2_Sub10_Sub4_1.method3363(arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public Class2_Sub10 method3364() {
		@Pc(9) Class2_Sub21 local9;
		do {
			local9 = (Class2_Sub21) this.aClass8_14.method218();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub10_Sub4_1 == null);
		return local9.aClass2_Sub10_Sub4_1;
	}
}
