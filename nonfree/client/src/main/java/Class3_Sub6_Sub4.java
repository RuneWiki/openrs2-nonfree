import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class3_Sub6_Sub4 extends Class3_Sub6 {

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "Lclient!hga;")
	public final Class130 aClass130_21 = new Class130();

	@OriginalMember(owner = "client!iaa", name = "C", descriptor = "Lclient!ak;")
	public final Class3_Sub6_Sub1 aClass3_Sub6_Sub1_2 = new Class3_Sub6_Sub1();

	@OriginalMember(owner = "client!iaa", name = "B", descriptor = "Lclient!dp;")
	private final Class3_Sub6_Sub3 aClass3_Sub6_Sub3_2;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!dp;)V")
	public Class3_Sub6_Sub4(@OriginalArg(0) Class3_Sub6_Sub3 arg0) {
		this.aClass3_Sub6_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "()I")
	@Override
	public int method3727() {
		return 0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([III)V")
	@Override
	public void method3728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub6_Sub1_2.method3728(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub7 local17 = (Class3_Sub7) this.aClass130_21.method3543(); local17 != null; local17 = (Class3_Sub7) this.aClass130_21.method3551()) {
			if (!this.aClass3_Sub6_Sub3_2.method2128(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt585 >= local29) {
						this.method3739(local29, local17, arg0, local27, local29 + local27);
						local17.anInt585 -= local29;
						break;
					}
					this.method3739(local17.anInt585, local17, arg0, local27, local27 + local29);
					local29 -= local17.anInt585;
					local27 += local17.anInt585;
				} while (!this.aClass3_Sub6_Sub3_2.method2129(local17, local27, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
	@Override
	public void method3732(@OriginalArg(0) int arg0) {
		this.aClass3_Sub6_Sub1_2.method3732(arg0);
		for (@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) this.aClass130_21.method3543(); local15 != null; local15 = (Class3_Sub7) this.aClass130_21.method3551()) {
			if (!this.aClass3_Sub6_Sub3_2.method2128(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt585 >= local25) {
						this.method3738(local15, local25);
						local15.anInt585 -= local25;
						break;
					}
					this.method3738(local15, local15.anInt585);
					local25 -= local15.anInt585;
				} while (!this.aClass3_Sub6_Sub3_2.method2129(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "()Lclient!oea;")
	@Override
	public Class3_Sub6 method3730() {
		@Pc(9) Class3_Sub7 local9;
		do {
			local9 = (Class3_Sub7) this.aClass130_21.method3551();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub6_Sub2_1 == null);
		return local9.aClass3_Sub6_Sub2_1;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!at;II)V")
	private void method3738(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass3_Sub6_Sub3_2.anIntArray163[arg0.anInt578] & 0x4) != 0 && arg0.anInt573 < 0) {
			@Pc(31) int local31 = this.aClass3_Sub6_Sub3_2.anIntArray149[arg0.anInt578] / Static124.anInt3635;
			@Pc(41) int local41 = (local31 + 1048575 - arg0.anInt582) / local31;
			arg0.anInt582 = local31 * arg1 + arg0.anInt582 & 0xFFFFF;
			if (arg1 >= local41) {
				if (this.aClass3_Sub6_Sub3_2.anIntArray164[arg0.anInt578] == 0) {
					arg0.aClass3_Sub6_Sub2_1 = Static598.method1557(arg0.aClass3_Sub20_Sub1_1, arg0.aClass3_Sub6_Sub2_1.method1567(), arg0.aClass3_Sub6_Sub2_1.method1590(), arg0.aClass3_Sub6_Sub2_1.method1580());
				} else {
					arg0.aClass3_Sub6_Sub2_1 = Static598.method1557(arg0.aClass3_Sub20_Sub1_1, arg0.aClass3_Sub6_Sub2_1.method1567(), 0, arg0.aClass3_Sub6_Sub2_1.method1580());
					this.aClass3_Sub6_Sub3_2.method2133(arg0.aClass3_Sub12_1.aShortArray28[arg0.anInt571] < 0, arg0);
				}
				if (arg0.aClass3_Sub12_1.aShortArray28[arg0.anInt571] < 0) {
					arg0.aClass3_Sub6_Sub2_1.method1582(-1);
				}
				arg1 = arg0.anInt582 / local31;
			}
		}
		arg0.aClass3_Sub6_Sub2_1.method3732(arg1);
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "()Lclient!oea;")
	@Override
	public Class3_Sub6 method3731() {
		@Pc(9) Class3_Sub7 local9 = (Class3_Sub7) this.aClass130_21.method3543();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub6_Sub2_1 == null) {
			return this.method3730();
		} else {
			return local9.aClass3_Sub6_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZILclient!at;[III)V")
	private void method3739(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub6_Sub3_2.anIntArray163[arg1.anInt578] & 0x4) != 0 && arg1.anInt573 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub6_Sub3_2.anIntArray149[arg1.anInt578] / Static124.anInt3635;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt582) / local29;
				if (local39 > arg0) {
					arg1.anInt582 += arg0 * local29;
					break;
				}
				arg1.aClass3_Sub6_Sub2_1.method3728(arg2, arg3, local39);
				arg0 -= local39;
				arg1.anInt582 += local39 * local29 - 1048576;
				arg3 += local39;
				@Pc(74) int local74 = Static124.anInt3635 / 100;
				@Pc(78) int local78 = 262144 / local29;
				if (local78 < local74) {
					local74 = local78;
				}
				@Pc(86) Class3_Sub6_Sub2 local86 = arg1.aClass3_Sub6_Sub2_1;
				if (this.aClass3_Sub6_Sub3_2.anIntArray164[arg1.anInt578] == 0) {
					arg1.aClass3_Sub6_Sub2_1 = Static598.method1557(arg1.aClass3_Sub20_Sub1_1, local86.method1567(), local86.method1590(), local86.method1580());
				} else {
					arg1.aClass3_Sub6_Sub2_1 = Static598.method1557(arg1.aClass3_Sub20_Sub1_1, local86.method1567(), 0, local86.method1580());
					this.aClass3_Sub6_Sub3_2.method2133(arg1.aClass3_Sub12_1.aShortArray28[arg1.anInt571] < 0, arg1);
					arg1.aClass3_Sub6_Sub2_1.method1587(local74, local86.method1590());
				}
				if (arg1.aClass3_Sub12_1.aShortArray28[arg1.anInt571] < 0) {
					arg1.aClass3_Sub6_Sub2_1.method1582(-1);
				}
				local86.method1560(local74);
				local86.method3728(arg2, arg3, arg4 - arg3);
				if (local86.method1577()) {
					this.aClass3_Sub6_Sub1_2.method285(local86);
				}
			}
		}
		arg1.aClass3_Sub6_Sub2_1.method3728(arg2, arg3, arg0);
	}
}
