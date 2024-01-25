import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class2_Sub11_Sub5 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "Lclient!fh;")
	public final Class114 aClass114_37 = new Class114();

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!fq;")
	public final Class2_Sub11_Sub2 aClass2_Sub11_Sub2_1 = new Class2_Sub11_Sub2();

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Lclient!cea;")
	private final Class2_Sub11_Sub1 aClass2_Sub11_Sub1_4;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class2_Sub11_Sub5(@OriginalArg(0) Class2_Sub11_Sub1 arg0) {
		this.aClass2_Sub11_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6157() {
		@Pc(9) Class2_Sub21 local9;
		do {
			local9 = (Class2_Sub21) this.aClass114_37.method2762();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub11_Sub4_1 == null);
		return local9.aClass2_Sub11_Sub4_1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([ILclient!gga;IIII)V")
	private void method6163(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub11_Sub1_4.anIntArray134[arg1.anInt3656] & 0x4) != 0 && arg1.anInt3646 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub11_Sub1_4.anIntArray135[arg1.anInt3656] / Static489.anInt8544;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg1.anInt3658) / local30;
				if (local40 > arg4) {
					arg1.anInt3658 += local30 * arg4;
					break;
				}
				arg1.aClass2_Sub11_Sub4_1.method6155(arg0, arg2, local40);
				arg4 -= local40;
				arg2 += local40;
				arg1.anInt3658 += local40 * local30 - 1048576;
				@Pc(71) int local71 = Static489.anInt8544 / 100;
				@Pc(75) int local75 = 262144 / local30;
				if (local75 < local71) {
					local71 = local75;
				}
				@Pc(83) Class2_Sub11_Sub4 local83 = arg1.aClass2_Sub11_Sub4_1;
				if (this.aClass2_Sub11_Sub1_4.anIntArray125[arg1.anInt3656] == 0) {
					arg1.aClass2_Sub11_Sub4_1 = Static653.method3343(arg1.aClass2_Sub14_Sub1_1, local83.method3372(), local83.method3365(), local83.method3344());
				} else {
					arg1.aClass2_Sub11_Sub4_1 = Static653.method3343(arg1.aClass2_Sub14_Sub1_1, local83.method3372(), 0, local83.method3344());
					this.aClass2_Sub11_Sub1_4.method1509(arg1.aClass2_Sub9_1.aShortArray17[arg1.anInt3654] < 0, arg1);
					arg1.aClass2_Sub11_Sub4_1.method3353(local71, local83.method3365());
				}
				if (arg1.aClass2_Sub9_1.aShortArray17[arg1.anInt3654] < 0) {
					arg1.aClass2_Sub11_Sub4_1.method3341(-1);
				}
				local83.method3348(local71);
				local83.method6155(arg0, arg2, arg3 - arg2);
				if (local83.method3361()) {
					this.aClass2_Sub11_Sub2_1.method2952(local83);
				}
			}
		}
		arg1.aClass2_Sub11_Sub4_1.method6155(arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([III)V")
	@Override
	public void method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub11_Sub2_1.method6155(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub21 local17 = (Class2_Sub21) this.aClass114_37.method2772(); local17 != null; local17 = (Class2_Sub21) this.aClass114_37.method2762()) {
			if (!this.aClass2_Sub11_Sub1_4.method1529(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt3663) {
						this.method6163(arg0, local17, local29, local27 + local29, local27);
						local17.anInt3663 -= local27;
						break;
					}
					this.method6163(arg0, local17, local29, local29 + local27, local17.anInt3663);
					local27 -= local17.anInt3663;
					local29 += local17.anInt3663;
				} while (!this.aClass2_Sub11_Sub1_4.method1502(local27, arg0, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0) {
		this.aClass2_Sub11_Sub2_1.method6159(arg0);
		for (@Pc(13) Class2_Sub21 local13 = (Class2_Sub21) this.aClass114_37.method2772(); local13 != null; local13 = (Class2_Sub21) this.aClass114_37.method2762()) {
			if (!this.aClass2_Sub11_Sub1_4.method1529(local13)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local13.anInt3663 >= local22) {
						this.method6165(local22, local13);
						local13.anInt3663 -= local22;
						break;
					}
					this.method6165(local13.anInt3663, local13);
					local22 -= local13.anInt3663;
				} while (!this.aClass2_Sub11_Sub1_4.method1502(local22, (int[]) null, local13, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!gga;I)V")
	private void method6165(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if ((this.aClass2_Sub11_Sub1_4.anIntArray134[arg1.anInt3656] & 0x4) != 0 && arg1.anInt3646 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub11_Sub1_4.anIntArray135[arg1.anInt3656] / Static489.anInt8544;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt3658) / local23;
			arg1.anInt3658 = local23 * arg0 + arg1.anInt3658 & 0xFFFFF;
			if (local33 <= arg0) {
				if (this.aClass2_Sub11_Sub1_4.anIntArray125[arg1.anInt3656] == 0) {
					arg1.aClass2_Sub11_Sub4_1 = Static653.method3343(arg1.aClass2_Sub14_Sub1_1, arg1.aClass2_Sub11_Sub4_1.method3372(), arg1.aClass2_Sub11_Sub4_1.method3365(), arg1.aClass2_Sub11_Sub4_1.method3344());
				} else {
					arg1.aClass2_Sub11_Sub4_1 = Static653.method3343(arg1.aClass2_Sub14_Sub1_1, arg1.aClass2_Sub11_Sub4_1.method3372(), 0, arg1.aClass2_Sub11_Sub4_1.method3344());
					this.aClass2_Sub11_Sub1_4.method1509(arg1.aClass2_Sub9_1.aShortArray17[arg1.anInt3654] < 0, arg1);
				}
				if (arg1.aClass2_Sub9_1.aShortArray17[arg1.anInt3654] < 0) {
					arg1.aClass2_Sub11_Sub4_1.method3341(-1);
				}
				arg0 = arg1.anInt3658 / local23;
			}
		}
		arg1.aClass2_Sub11_Sub4_1.method6159(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6156() {
		@Pc(9) Class2_Sub21 local9 = (Class2_Sub21) this.aClass114_37.method2772();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub11_Sub4_1 == null) {
			return this.method6157();
		} else {
			return local9.aClass2_Sub11_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "()I")
	@Override
	public int method6161() {
		return 0;
	}
}
