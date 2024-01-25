import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!bb;")
	public final Class16 aClass16_29 = new Class16();

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Lclient!ta;")
	public final Class1_Sub1_Sub4 aClass1_Sub1_Sub4_2 = new Class1_Sub1_Sub4();

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!a;")
	private final Class1_Sub1_Sub1 aClass1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!a;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		this.aClass1_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!qi;Z)V")
	private void method4697(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29 arg1) {
		if ((this.aClass1_Sub1_Sub1_2.anIntArray10[arg1.anInt5265] & 0x4) != 0 && arg1.anInt5255 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub1_Sub1_2.anIntArray2[arg1.anInt5265] / Static38.anInt1250;
			@Pc(37) int local37 = (local27 + 1048575 - arg1.anInt5259) / local27;
			arg1.anInt5259 = local27 * arg0 + arg1.anInt5259 & 0xFFFFF;
			if (arg0 >= local37) {
				if (this.aClass1_Sub1_Sub1_2.anIntArray5[arg1.anInt5265] == 0) {
					arg1.aClass1_Sub1_Sub2_3 = Static370.method4039(arg1.aClass1_Sub15_Sub1_1, arg1.aClass1_Sub1_Sub2_3.method4056(), arg1.aClass1_Sub1_Sub2_3.method4058(), arg1.aClass1_Sub1_Sub2_3.method4023());
				} else {
					arg1.aClass1_Sub1_Sub2_3 = Static370.method4039(arg1.aClass1_Sub15_Sub1_1, arg1.aClass1_Sub1_Sub2_3.method4056(), 0, arg1.aClass1_Sub1_Sub2_3.method4023());
					this.aClass1_Sub1_Sub1_2.method51(arg1, arg1.aClass1_Sub33_1.aShortArray114[arg1.anInt5264] < 0);
				}
				if (arg1.aClass1_Sub33_1.aShortArray114[arg1.anInt5264] < 0) {
					arg1.aClass1_Sub1_Sub2_3.method4049(-1);
				}
				arg0 = arg1.anInt5259 / local27;
			}
		}
		arg1.aClass1_Sub1_Sub2_3.method5034(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()I")
	@Override
	public int method5031() {
		return 0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	@Override
	public void method5034(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1_Sub4_2.method5034(arg0);
		for (@Pc(15) Class1_Sub29 local15 = (Class1_Sub29) this.aClass16_29.method410(); local15 != null; local15 = (Class1_Sub29) this.aClass16_29.method419()) {
			if (!this.aClass1_Sub1_Sub1_2.method27(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5253 >= local25) {
						this.method4697(local25, local15);
						local15.anInt5253 -= local25;
						break;
					}
					this.method4697(local15.anInt5253, local15);
					local25 -= local15.anInt5253;
				} while (!this.aClass1_Sub1_Sub1_2.method55(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public Class1_Sub1 method5033() {
		@Pc(9) Class1_Sub29 local9;
		do {
			local9 = (Class1_Sub29) this.aClass16_29.method419();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub1_Sub2_3 == null);
		return local9.aClass1_Sub1_Sub2_3;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!qi;I[I)V")
	private void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub1_Sub1_2.anIntArray10[arg2.anInt5265] & 0x4) != 0 && arg2.anInt5255 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub1_Sub1_2.anIntArray2[arg2.anInt5265] / Static38.anInt1250;
			while (true) {
				@Pc(37) int local37 = (local26 + 1048575 - arg2.anInt5259) / local26;
				if (local37 > arg1) {
					arg2.anInt5259 += arg1 * local26;
					break;
				}
				arg2.aClass1_Sub1_Sub2_3.method5028(arg4, arg3, local37);
				arg3 += local37;
				arg2.anInt5259 += local26 * local37 - 1048576;
				arg1 -= local37;
				@Pc(72) int local72 = Static38.anInt1250 / 100;
				@Pc(76) int local76 = 262144 / local26;
				if (local76 < local72) {
					local72 = local76;
				}
				@Pc(88) Class1_Sub1_Sub2 local88 = arg2.aClass1_Sub1_Sub2_3;
				if (this.aClass1_Sub1_Sub1_2.anIntArray5[arg2.anInt5265] == 0) {
					arg2.aClass1_Sub1_Sub2_3 = Static370.method4039(arg2.aClass1_Sub15_Sub1_1, local88.method4056(), local88.method4058(), local88.method4023());
				} else {
					arg2.aClass1_Sub1_Sub2_3 = Static370.method4039(arg2.aClass1_Sub15_Sub1_1, local88.method4056(), 0, local88.method4023());
					this.aClass1_Sub1_Sub1_2.method51(arg2, arg2.aClass1_Sub33_1.aShortArray114[arg2.anInt5264] < 0);
					arg2.aClass1_Sub1_Sub2_3.method4029(local72, local88.method4058());
				}
				if (arg2.aClass1_Sub33_1.aShortArray114[arg2.anInt5264] < 0) {
					arg2.aClass1_Sub1_Sub2_3.method4049(-1);
				}
				local88.method4032(local72);
				local88.method5028(arg4, arg3, arg0 - arg3);
				if (local88.method4026()) {
					this.aClass1_Sub1_Sub4_2.method5040(local88);
				}
			}
		}
		arg2.aClass1_Sub1_Sub2_3.method5028(arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([III)V")
	@Override
	public void method5028(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub1_Sub4_2.method5028(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub29 local17 = (Class1_Sub29) this.aClass16_29.method410(); local17 != null; local17 = (Class1_Sub29) this.aClass16_29.method419()) {
			if (!this.aClass1_Sub1_Sub1_2.method27(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt5253 >= local27) {
						this.method4701(local29 + local27, local27, local17, local29, arg0);
						local17.anInt5253 -= local27;
						break;
					}
					this.method4701(local29 + local27, local17.anInt5253, local17, local29, arg0);
					local29 += local17.anInt5253;
					local27 -= local17.anInt5253;
				} while (!this.aClass1_Sub1_Sub1_2.method55(local27, local17, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public Class1_Sub1 method5029() {
		@Pc(9) Class1_Sub29 local9 = (Class1_Sub29) this.aClass16_29.method410();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub1_Sub2_3 == null) {
			return this.method5033();
		} else {
			return local9.aClass1_Sub1_Sub2_3;
		}
	}
}
