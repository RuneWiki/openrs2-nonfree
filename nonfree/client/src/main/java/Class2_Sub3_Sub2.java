import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Lclient!ar;")
	public final Class14 aClass14_26 = new Class14();

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "Lclient!er;")
	public final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1 = new Class2_Sub3_Sub1();

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "Lclient!qu;")
	private final Class2_Sub3_Sub4 aClass2_Sub3_Sub4_3;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!qu;)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class2_Sub3_Sub4 arg0) {
		this.aClass2_Sub3_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub3 method4618() {
		@Pc(9) Class2_Sub34 local9;
		do {
			local9 = (Class2_Sub34) this.aClass14_26.method311();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub3_Sub3_3 == null);
		return local9.aClass2_Sub3_Sub3_3;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ps;BIII[I)V")
	private void method2269(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass2_Sub3_Sub4_3.anIntArray484[arg0.anInt5496] & 0x4) != 0 && arg0.anInt5499 < 0) {
			@Pc(40) int local40 = this.aClass2_Sub3_Sub4_3.anIntArray483[arg0.anInt5496] / Static410.anInt6842;
			while (true) {
				@Pc(50) int local50 = (local40 + 1048575 - arg0.anInt5500) / local40;
				if (arg3 < local50) {
					arg0.anInt5500 += local40 * arg3;
					break;
				}
				arg0.aClass2_Sub3_Sub3_3.method4619(arg4, arg2, local50);
				arg3 -= local50;
				arg0.anInt5500 += local40 * local50 - 1048576;
				arg2 += local50;
				@Pc(85) int local85 = Static410.anInt6842 / 100;
				@Pc(89) int local89 = 262144 / local40;
				if (local89 < local85) {
					local85 = local89;
				}
				@Pc(101) Class2_Sub3_Sub3 local101 = arg0.aClass2_Sub3_Sub3_3;
				if (this.aClass2_Sub3_Sub4_3.anIntArray486[arg0.anInt5496] == 0) {
					arg0.aClass2_Sub3_Sub3_3 = Static460.method2502(arg0.aClass2_Sub10_Sub1_1, local101.method2469(), local101.method2495(), local101.method2500());
				} else {
					arg0.aClass2_Sub3_Sub3_3 = Static460.method2502(arg0.aClass2_Sub10_Sub1_1, local101.method2469(), 0, local101.method2500());
					this.aClass2_Sub3_Sub4_3.method4649(arg0, arg0.aClass2_Sub12_1.aShortArray16[arg0.anInt5491] < 0);
					arg0.aClass2_Sub3_Sub3_3.method2470(local85, local101.method2495());
				}
				if (arg0.aClass2_Sub12_1.aShortArray16[arg0.anInt5491] < 0) {
					arg0.aClass2_Sub3_Sub3_3.method2497(-1);
				}
				local101.method2498(local85);
				local101.method4619(arg4, arg2, arg1 - arg2);
				if (local101.method2503()) {
					this.aClass2_Sub3_Sub1_1.method1827(local101);
				}
			}
		}
		arg0.aClass2_Sub3_Sub3_3.method4619(arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "()I")
	@Override
	public int method4613() {
		return 0;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V")
	@Override
	public void method4616(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_Sub1_1.method4616(arg0);
		for (@Pc(15) Class2_Sub34 local15 = (Class2_Sub34) this.aClass14_26.method309(); local15 != null; local15 = (Class2_Sub34) this.aClass14_26.method311()) {
			if (!this.aClass2_Sub3_Sub4_3.method4654(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt5506) {
						this.method2271(local15, local25);
						local15.anInt5506 -= local25;
						break;
					}
					this.method2271(local15, local15.anInt5506);
					local25 -= local15.anInt5506;
				} while (!this.aClass2_Sub3_Sub4_3.method4646(local25, 0, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ps;BI)V")
	private void method2271(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub3_Sub4_3.anIntArray484[arg0.anInt5496] & 0x4) != 0 && arg0.anInt5499 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub3_Sub4_3.anIntArray483[arg0.anInt5496] / Static410.anInt6842;
			@Pc(39) int local39 = (local30 + 1048575 - arg0.anInt5500) / local30;
			arg0.anInt5500 = arg0.anInt5500 + local30 * arg1 & 0xFFFFF;
			if (local39 <= arg1) {
				if (this.aClass2_Sub3_Sub4_3.anIntArray486[arg0.anInt5496] == 0) {
					arg0.aClass2_Sub3_Sub3_3 = Static460.method2502(arg0.aClass2_Sub10_Sub1_1, arg0.aClass2_Sub3_Sub3_3.method2469(), arg0.aClass2_Sub3_Sub3_3.method2495(), arg0.aClass2_Sub3_Sub3_3.method2500());
				} else {
					arg0.aClass2_Sub3_Sub3_3 = Static460.method2502(arg0.aClass2_Sub10_Sub1_1, arg0.aClass2_Sub3_Sub3_3.method2469(), 0, arg0.aClass2_Sub3_Sub3_3.method2500());
					this.aClass2_Sub3_Sub4_3.method4649(arg0, arg0.aClass2_Sub12_1.aShortArray16[arg0.anInt5491] < 0);
				}
				if (arg0.aClass2_Sub12_1.aShortArray16[arg0.anInt5491] < 0) {
					arg0.aClass2_Sub3_Sub3_3.method2497(-1);
				}
				arg1 = arg0.anInt5500 / local30;
			}
		}
		arg0.aClass2_Sub3_Sub3_3.method4616(arg1);
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub3 method4615() {
		@Pc(9) Class2_Sub34 local9 = (Class2_Sub34) this.aClass14_26.method309();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub3_Sub3_3 == null) {
			return this.method4618();
		} else {
			return local9.aClass2_Sub3_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "([III)V")
	@Override
	public void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub3_Sub1_1.method4619(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub34 local17 = (Class2_Sub34) this.aClass14_26.method309(); local17 != null; local17 = (Class2_Sub34) this.aClass14_26.method311()) {
			if (!this.aClass2_Sub3_Sub4_3.method4654(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt5506 >= local27) {
						this.method2269(local17, local27 + local29, local29, local27, arg0);
						local17.anInt5506 -= local27;
						break;
					}
					this.method2269(local17, local27 + local29, local29, local17.anInt5506, arg0);
					local29 += local17.anInt5506;
					local27 -= local17.anInt5506;
				} while (!this.aClass2_Sub3_Sub4_3.method4646(local27, local29, local17, arg0));
			}
		}
	}
}
