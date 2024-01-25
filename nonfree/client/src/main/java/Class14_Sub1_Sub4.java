import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class14_Sub1_Sub4 extends Class14_Sub1 {

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!bd;")
	public final Class32 aClass32_40 = new Class32();

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!dka;")
	public final Class14_Sub1_Sub2 aClass14_Sub1_Sub2_2 = new Class14_Sub1_Sub2();

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "Lclient!eba;")
	private final Class14_Sub1_Sub3 aClass14_Sub1_Sub3_2;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!eba;)V")
	public Class14_Sub1_Sub4(@OriginalArg(0) Class14_Sub1_Sub3 arg0) {
		this.aClass14_Sub1_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V")
	@Override
	public void method9318(@OriginalArg(0) int arg0) {
		this.aClass14_Sub1_Sub2_2.method9318(arg0);
		for (@Pc(15) Class14_Sub34 local15 = (Class14_Sub34) this.aClass32_40.method584(); local15 != null; local15 = (Class14_Sub34) this.aClass32_40.method577()) {
			if (!this.aClass14_Sub1_Sub3_2.method1897(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local27 <= local15.anInt7273) {
						this.method6022(local27, local15);
						local15.anInt7273 -= local27;
						break;
					}
					this.method6022(local15.anInt7273, local15);
					local27 -= local15.anInt7273;
				} while (!this.aClass14_Sub1_Sub3_2.method1920(local15, local27, (int[]) null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "([III)V")
	@Override
	public void method9317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14_Sub1_Sub2_2.method9317(arg0, arg1, arg2);
		for (@Pc(17) Class14_Sub34 local17 = (Class14_Sub34) this.aClass32_40.method584(); local17 != null; local17 = (Class14_Sub34) this.aClass32_40.method577()) {
			if (!this.aClass14_Sub1_Sub3_2.method1897(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local29 <= local17.anInt7273) {
						this.method6020(local31, local29 + local31, local29, arg0, local17);
						local17.anInt7273 -= local29;
						break;
					}
					this.method6020(local31, local31 + local29, local17.anInt7273, arg0, local17);
					local29 -= local17.anInt7273;
					local31 += local17.anInt7273;
				} while (!this.aClass14_Sub1_Sub3_2.method1920(local17, local29, arg0, local31));
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "()I")
	@Override
	public int method9321() {
		return 0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIII[ILclient!oca;)V")
	private void method6020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class14_Sub34 arg4) {
		if ((this.aClass14_Sub1_Sub3_2.anIntArray121[arg4.anInt7287] & 0x4) != 0 && arg4.anInt7272 < 0) {
			@Pc(24) int local24 = this.aClass14_Sub1_Sub3_2.anIntArray113[arg4.anInt7287] / Static157.anInt2396;
			while (true) {
				@Pc(34) int local34 = (local24 + 1048575 - arg4.anInt7285) / local24;
				if (local34 > arg2) {
					arg4.anInt7285 += arg2 * local24;
					break;
				}
				arg4.aClass14_Sub1_Sub1_2.method9317(arg3, arg0, local34);
				arg4.anInt7285 += local24 * local34 - 1048576;
				arg2 -= local34;
				arg0 += local34;
				@Pc(69) int local69 = Static157.anInt2396 / 100;
				@Pc(73) int local73 = 262144 / local24;
				if (local69 > local73) {
					local69 = local73;
				}
				@Pc(85) Class14_Sub1_Sub1 local85 = arg4.aClass14_Sub1_Sub1_2;
				if (this.aClass14_Sub1_Sub3_2.anIntArray117[arg4.anInt7287] == 0) {
					arg4.aClass14_Sub1_Sub1_2 = Static692.method188(arg4.aClass14_Sub19_Sub1_2, local85.method160(), local85.method179(), local85.method185());
				} else {
					arg4.aClass14_Sub1_Sub1_2 = Static692.method188(arg4.aClass14_Sub19_Sub1_2, local85.method160(), 0, local85.method185());
					this.aClass14_Sub1_Sub3_2.method1896(arg4, arg4.aClass14_Sub17_1.aShortArray33[arg4.anInt7291] < 0);
					arg4.aClass14_Sub1_Sub1_2.method150(local69, local85.method179());
				}
				if (arg4.aClass14_Sub17_1.aShortArray33[arg4.anInt7291] < 0) {
					arg4.aClass14_Sub1_Sub1_2.method152(-1);
				}
				local85.method181(local69);
				local85.method9317(arg3, arg0, arg1 - arg0);
				if (local85.method175()) {
					this.aClass14_Sub1_Sub2_2.method1805(local85);
				}
			}
		}
		arg4.aClass14_Sub1_Sub1_2.method9317(arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!oca;)V")
	private void method6022(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub34 arg1) {
		if ((this.aClass14_Sub1_Sub3_2.anIntArray121[arg1.anInt7287] & 0x4) != 0 && arg1.anInt7272 < 0) {
			@Pc(37) int local37 = this.aClass14_Sub1_Sub3_2.anIntArray113[arg1.anInt7287] / Static157.anInt2396;
			@Pc(47) int local47 = (local37 + 1048575 - arg1.anInt7285) / local37;
			arg1.anInt7285 = local37 * arg0 + arg1.anInt7285 & 0xFFFFF;
			if (local47 <= arg0) {
				if (this.aClass14_Sub1_Sub3_2.anIntArray117[arg1.anInt7287] == 0) {
					arg1.aClass14_Sub1_Sub1_2 = Static692.method188(arg1.aClass14_Sub19_Sub1_2, arg1.aClass14_Sub1_Sub1_2.method160(), arg1.aClass14_Sub1_Sub1_2.method179(), arg1.aClass14_Sub1_Sub1_2.method185());
				} else {
					arg1.aClass14_Sub1_Sub1_2 = Static692.method188(arg1.aClass14_Sub19_Sub1_2, arg1.aClass14_Sub1_Sub1_2.method160(), 0, arg1.aClass14_Sub1_Sub1_2.method185());
					this.aClass14_Sub1_Sub3_2.method1896(arg1, arg1.aClass14_Sub17_1.aShortArray33[arg1.anInt7291] < 0);
				}
				if (arg1.aClass14_Sub17_1.aShortArray33[arg1.anInt7291] < 0) {
					arg1.aClass14_Sub1_Sub1_2.method152(-1);
				}
				arg0 = arg1.anInt7285 / local37;
			}
		}
		arg1.aClass14_Sub1_Sub1_2.method9318(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9320() {
		@Pc(11) Class14_Sub34 local11;
		do {
			local11 = (Class14_Sub34) this.aClass32_40.method577();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass14_Sub1_Sub1_2 == null);
		return local11.aClass14_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9316() {
		@Pc(9) Class14_Sub34 local9 = (Class14_Sub34) this.aClass32_40.method584();
		if (local9 == null) {
			return null;
		} else if (local9.aClass14_Sub1_Sub1_2 == null) {
			return this.method9320();
		} else {
			return local9.aClass14_Sub1_Sub1_2;
		}
	}
}
