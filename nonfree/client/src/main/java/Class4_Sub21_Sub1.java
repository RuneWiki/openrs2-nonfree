import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub21_Sub1 extends Class4_Sub21 {

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Lclient!au;")
	public final Class22 aClass22_20 = new Class22();

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!op;")
	public final Class4_Sub21_Sub3 aClass4_Sub21_Sub3_1 = new Class4_Sub21_Sub3();

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "Lclient!pn;")
	private final Class4_Sub21_Sub4 aClass4_Sub21_Sub4_2;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!pn;)V")
	public Class4_Sub21_Sub1(@OriginalArg(0) Class4_Sub21_Sub4 arg0) {
		this.aClass4_Sub21_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([IIIILclient!rr;I)V")
	private void method2733(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub44 arg4) {
		if ((this.aClass4_Sub21_Sub4_2.anIntArray425[arg4.anInt8854] & 0x4) != 0 && arg4.anInt8871 < 0) {
			@Pc(25) int local25 = this.aClass4_Sub21_Sub4_2.anIntArray436[arg4.anInt8854] / Static544.anInt9957;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg4.anInt8855) / local25;
				if (arg3 < local35) {
					arg4.anInt8855 += arg3 * local25;
					break;
				}
				arg4.aClass4_Sub21_Sub2_4.method6158(arg0, arg2, local35);
				arg4.anInt8855 += local25 * local35 - 1048576;
				arg3 -= local35;
				arg2 += local35;
				@Pc(66) int local66 = Static544.anInt9957 / 100;
				@Pc(70) int local70 = 262144 / local25;
				if (local66 > local70) {
					local66 = local70;
				}
				@Pc(82) Class4_Sub21_Sub2 local82 = arg4.aClass4_Sub21_Sub2_4;
				if (this.aClass4_Sub21_Sub4_2.anIntArray429[arg4.anInt8854] == 0) {
					arg4.aClass4_Sub21_Sub2_4 = Static601.method4643(arg4.aClass4_Sub42_Sub1_4, local82.method4621(), local82.method4652(), local82.method4648());
				} else {
					arg4.aClass4_Sub21_Sub2_4 = Static601.method4643(arg4.aClass4_Sub42_Sub1_4, local82.method4621(), 0, local82.method4648());
					this.aClass4_Sub21_Sub4_2.method6181(arg4.aClass4_Sub16_1.aShortArray25[arg4.anInt8853] < 0, arg4);
					arg4.aClass4_Sub21_Sub2_4.method4637(local66, local82.method4652());
				}
				if (arg4.aClass4_Sub16_1.aShortArray25[arg4.anInt8853] < 0) {
					arg4.aClass4_Sub21_Sub2_4.method4624(-1);
				}
				local82.method4620(local66);
				local82.method6158(arg0, arg2, arg1 - arg2);
				if (local82.method4644()) {
					this.aClass4_Sub21_Sub3_1.method5927(local82);
				}
			}
		}
		arg4.aClass4_Sub21_Sub2_4.method6158(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	@Override
	public void method6156(@OriginalArg(0) int arg0) {
		this.aClass4_Sub21_Sub3_1.method6156(arg0);
		for (@Pc(15) Class4_Sub44 local15 = (Class4_Sub44) this.aClass22_20.method895(); local15 != null; local15 = (Class4_Sub44) this.aClass22_20.method889()) {
			if (!this.aClass4_Sub21_Sub4_2.method6169(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt8859 >= local25) {
						this.method2736(local15, local25);
						local15.anInt8859 -= local25;
						break;
					}
					this.method2736(local15, local15.anInt8859);
					local25 -= local15.anInt8859;
				} while (!this.aClass4_Sub21_Sub4_2.method6185(local25, null, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()Lclient!nr;")
	@Override
	public Class4_Sub21 method6157() {
		@Pc(9) Class4_Sub44 local9 = (Class4_Sub44) this.aClass22_20.method895();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub21_Sub2_4 == null) {
			return this.method6162();
		} else {
			return local9.aClass4_Sub21_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()I")
	@Override
	public int method6160() {
		return 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!rr;I)V")
	private void method2736(@OriginalArg(1) Class4_Sub44 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass4_Sub21_Sub4_2.anIntArray425[arg0.anInt8854] & 0x4) != 0 && arg0.anInt8871 < 0) {
			@Pc(30) int local30 = this.aClass4_Sub21_Sub4_2.anIntArray436[arg0.anInt8854] / Static544.anInt9957;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt8855) / local30;
			arg0.anInt8855 = arg1 * local30 + arg0.anInt8855 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass4_Sub21_Sub4_2.anIntArray429[arg0.anInt8854] == 0) {
					arg0.aClass4_Sub21_Sub2_4 = Static601.method4643(arg0.aClass4_Sub42_Sub1_4, arg0.aClass4_Sub21_Sub2_4.method4621(), arg0.aClass4_Sub21_Sub2_4.method4652(), arg0.aClass4_Sub21_Sub2_4.method4648());
				} else {
					arg0.aClass4_Sub21_Sub2_4 = Static601.method4643(arg0.aClass4_Sub42_Sub1_4, arg0.aClass4_Sub21_Sub2_4.method4621(), 0, arg0.aClass4_Sub21_Sub2_4.method4648());
					this.aClass4_Sub21_Sub4_2.method6181(arg0.aClass4_Sub16_1.aShortArray25[arg0.anInt8853] < 0, arg0);
				}
				if (arg0.aClass4_Sub16_1.aShortArray25[arg0.anInt8853] < 0) {
					arg0.aClass4_Sub21_Sub2_4.method4624(-1);
				}
				arg1 = arg0.anInt8855 / local30;
			}
		}
		arg0.aClass4_Sub21_Sub2_4.method6156(arg1);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "()Lclient!nr;")
	@Override
	public Class4_Sub21 method6162() {
		@Pc(9) Class4_Sub44 local9;
		do {
			local9 = (Class4_Sub44) this.aClass22_20.method889();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub21_Sub2_4 == null);
		return local9.aClass4_Sub21_Sub2_4;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([III)V")
	@Override
	public void method6158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub21_Sub3_1.method6158(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub44 local17 = (Class4_Sub44) this.aClass22_20.method895(); local17 != null; local17 = (Class4_Sub44) this.aClass22_20.method889()) {
			if (!this.aClass4_Sub21_Sub4_2.method6169(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt8859 >= local29) {
						this.method2733(arg0, local27 + local29, local27, local29, local17);
						local17.anInt8859 -= local29;
						break;
					}
					this.method2733(arg0, local29 + local27, local27, local17.anInt8859, local17);
					local27 += local17.anInt8859;
					local29 -= local17.anInt8859;
				} while (!this.aClass4_Sub21_Sub4_2.method6185(local29, arg0, local27, local17));
			}
		}
	}
}
