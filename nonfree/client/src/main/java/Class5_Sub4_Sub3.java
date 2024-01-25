import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class5_Sub4_Sub3 extends Class5_Sub4 {

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "Lclient!at;")
	public final Class20 aClass20_16 = new Class20();

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "Lclient!ao;")
	public final Class5_Sub4_Sub1 aClass5_Sub4_Sub1_1 = new Class5_Sub4_Sub1();

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!eg;")
	private final Class5_Sub4_Sub2 aClass5_Sub4_Sub2_5;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class5_Sub4_Sub3(@OriginalArg(0) Class5_Sub4_Sub2 arg0) {
		this.aClass5_Sub4_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIILclient!up;[I)V")
	private void method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub51 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass5_Sub4_Sub2_5.anIntArray114[arg3.anInt9869] & 0x4) != 0 && arg3.anInt9885 < 0) {
			@Pc(27) int local27 = this.aClass5_Sub4_Sub2_5.anIntArray119[arg3.anInt9869] / Static417.anInt7038;
			while (true) {
				@Pc(37) int local37 = (local27 + 1048575 - arg3.anInt9877) / local27;
				if (arg0 < local37) {
					arg3.anInt9877 += arg0 * local27;
					break;
				}
				arg3.aClass5_Sub4_Sub4_4.method4713(arg4, arg2, local37);
				arg2 += local37;
				arg3.anInt9877 += local37 * local27 - 1048576;
				arg0 -= local37;
				@Pc(72) int local72 = Static417.anInt7038 / 100;
				@Pc(76) int local76 = 262144 / local27;
				if (local72 > local76) {
					local72 = local76;
				}
				@Pc(88) Class5_Sub4_Sub4 local88 = arg3.aClass5_Sub4_Sub4_4;
				if (this.aClass5_Sub4_Sub2_5.anIntArray107[arg3.anInt9869] == 0) {
					arg3.aClass5_Sub4_Sub4_4 = Static688.method4172(arg3.aClass5_Sub27_Sub1_4, local88.method4153(), local88.method4174(), local88.method4154());
				} else {
					arg3.aClass5_Sub4_Sub4_4 = Static688.method4172(arg3.aClass5_Sub27_Sub1_4, local88.method4153(), 0, local88.method4154());
					this.aClass5_Sub4_Sub2_5.method1811(arg3, arg3.aClass5_Sub30_1.aShortArray74[arg3.anInt9882] < 0);
					arg3.aClass5_Sub4_Sub4_4.method4142(local72, local88.method4174());
				}
				if (arg3.aClass5_Sub30_1.aShortArray74[arg3.anInt9882] < 0) {
					arg3.aClass5_Sub4_Sub4_4.method4168(-1);
				}
				local88.method4155(local72);
				local88.method4713(arg4, arg2, arg1 - arg2);
				if (local88.method4149()) {
					this.aClass5_Sub4_Sub1_1.method334(local88);
				}
			}
		}
		arg3.aClass5_Sub4_Sub4_4.method4713(arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "()I")
	@Override
	public int method4710() {
		return 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4714() {
		@Pc(11) Class5_Sub51 local11;
		do {
			local11 = (Class5_Sub51) this.aClass20_16.method366();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass5_Sub4_Sub4_4 == null);
		return local11.aClass5_Sub4_Sub4_4;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public void method4712(@OriginalArg(0) int arg0) {
		this.aClass5_Sub4_Sub1_1.method4712(arg0);
		for (@Pc(15) Class5_Sub51 local15 = (Class5_Sub51) this.aClass20_16.method378(); local15 != null; local15 = (Class5_Sub51) this.aClass20_16.method366()) {
			if (!this.aClass5_Sub4_Sub2_5.method1805(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local15.anInt9878 >= local27) {
						this.method4107(local27, local15);
						local15.anInt9878 -= local27;
						break;
					}
					this.method4107(local15.anInt9878, local15);
					local27 -= local15.anInt9878;
				} while (!this.aClass5_Sub4_Sub2_5.method1803((int[]) null, local15, local27, 0));
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!up;I)V")
	private void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub51 arg1) {
		if ((this.aClass5_Sub4_Sub2_5.anIntArray114[arg1.anInt9869] & 0x4) != 0 && arg1.anInt9885 < 0) {
			@Pc(29) int local29 = this.aClass5_Sub4_Sub2_5.anIntArray119[arg1.anInt9869] / Static417.anInt7038;
			@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt9877) / local29;
			arg1.anInt9877 = arg0 * local29 + arg1.anInt9877 & 0xFFFFF;
			if (local39 <= arg0) {
				if (this.aClass5_Sub4_Sub2_5.anIntArray107[arg1.anInt9869] == 0) {
					arg1.aClass5_Sub4_Sub4_4 = Static688.method4172(arg1.aClass5_Sub27_Sub1_4, arg1.aClass5_Sub4_Sub4_4.method4153(), arg1.aClass5_Sub4_Sub4_4.method4174(), arg1.aClass5_Sub4_Sub4_4.method4154());
				} else {
					arg1.aClass5_Sub4_Sub4_4 = Static688.method4172(arg1.aClass5_Sub27_Sub1_4, arg1.aClass5_Sub4_Sub4_4.method4153(), 0, arg1.aClass5_Sub4_Sub4_4.method4154());
					this.aClass5_Sub4_Sub2_5.method1811(arg1, arg1.aClass5_Sub30_1.aShortArray74[arg1.anInt9882] < 0);
				}
				if (arg1.aClass5_Sub30_1.aShortArray74[arg1.anInt9882] < 0) {
					arg1.aClass5_Sub4_Sub4_4.method4168(-1);
				}
				arg0 = arg1.anInt9877 / local29;
			}
		}
		arg1.aClass5_Sub4_Sub4_4.method4712(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4711() {
		@Pc(9) Class5_Sub51 local9 = (Class5_Sub51) this.aClass20_16.method378();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub4_Sub4_4 == null) {
			return this.method4714();
		} else {
			return local9.aClass5_Sub4_Sub4_4;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "([III)V")
	@Override
	public void method4713(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub4_Sub1_1.method4713(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub51 local17 = (Class5_Sub51) this.aClass20_16.method378(); local17 != null; local17 = (Class5_Sub51) this.aClass20_16.method366()) {
			if (!this.aClass5_Sub4_Sub2_5.method1805(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local29 <= local17.anInt9878) {
						this.method4105(local29, local29 + local31, local31, local17, arg0);
						local17.anInt9878 -= local29;
						break;
					}
					this.method4105(local17.anInt9878, local31 + local29, local31, local17, arg0);
					local31 += local17.anInt9878;
					local29 -= local17.anInt9878;
				} while (!this.aClass5_Sub4_Sub2_5.method1803(arg0, local17, local29, local31));
			}
		}
	}
}
