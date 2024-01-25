import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Lclient!dc;")
	public final Class70 aClass70_2 = new Class70();

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!tq;")
	public final Class2_Sub3_Sub4 aClass2_Sub3_Sub4_1 = new Class2_Sub3_Sub4();

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!fn;")
	private final Class2_Sub3_Sub2 aClass2_Sub3_Sub2_3;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!fn;)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) Class2_Sub3_Sub2 arg0) {
		this.aClass2_Sub3_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public Class2_Sub3 method6701() {
		@Pc(9) Class2_Sub47 local9 = (Class2_Sub47) this.aClass70_2.method1264();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub3_Sub3_4 == null) {
			return this.method6703();
		} else {
			return local9.aClass2_Sub3_Sub3_4;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "()I")
	@Override
	public int method6699() {
		return 0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!uf;I)V")
	private void method586(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub47 arg1) {
		if ((this.aClass2_Sub3_Sub2_3.anIntArray201[arg1.anInt8818] & 0x4) != 0 && arg1.anInt8813 < 0) {
			@Pc(24) int local24 = this.aClass2_Sub3_Sub2_3.anIntArray205[arg1.anInt8818] / Static591.anInt9580;
			@Pc(34) int local34 = (local24 + 1048575 - arg1.anInt8819) / local24;
			arg1.anInt8819 = arg1.anInt8819 + local24 * arg0 & 0xFFFFF;
			if (arg0 >= local34) {
				if (this.aClass2_Sub3_Sub2_3.anIntArray198[arg1.anInt8818] == 0) {
					arg1.aClass2_Sub3_Sub3_4 = Static599.method4313(arg1.aClass2_Sub13_Sub1_4, arg1.aClass2_Sub3_Sub3_4.method4302(), arg1.aClass2_Sub3_Sub3_4.method4330(), arg1.aClass2_Sub3_Sub3_4.method4311());
				} else {
					arg1.aClass2_Sub3_Sub3_4 = Static599.method4313(arg1.aClass2_Sub13_Sub1_4, arg1.aClass2_Sub3_Sub3_4.method4302(), 0, arg1.aClass2_Sub3_Sub3_4.method4311());
					this.aClass2_Sub3_Sub2_3.method2043(arg1.aClass2_Sub48_1.aShortArray133[arg1.anInt8825] < 0, arg1);
				}
				if (arg1.aClass2_Sub48_1.aShortArray133[arg1.anInt8825] < 0) {
					arg1.aClass2_Sub3_Sub3_4.method4331(-1);
				}
				arg0 = arg1.anInt8819 / local24;
			}
		}
		arg1.aClass2_Sub3_Sub3_4.method6700(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	@Override
	public void method6700(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_Sub4_1.method6700(arg0);
		for (@Pc(15) Class2_Sub47 local15 = (Class2_Sub47) this.aClass70_2.method1264(); local15 != null; local15 = (Class2_Sub47) this.aClass70_2.method1261()) {
			if (!this.aClass2_Sub3_Sub2_3.method2072(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt8822 >= local25) {
						this.method586(local25, local15);
						local15.anInt8822 -= local25;
						break;
					}
					this.method586(local15.anInt8822, local15);
					local25 -= local15.anInt8822;
				} while (!this.aClass2_Sub3_Sub2_3.method2038(local25, 0, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([III)V")
	@Override
	public void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub3_Sub4_1.method6697(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub47 local17 = (Class2_Sub47) this.aClass70_2.method1264(); local17 != null; local17 = (Class2_Sub47) this.aClass70_2.method1261()) {
			if (!this.aClass2_Sub3_Sub2_3.method2072(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt8822) {
						this.method587(arg0, local17, local29 + local27, local29, local27);
						local17.anInt8822 -= local27;
						break;
					}
					this.method587(arg0, local17, local29 + local27, local29, local17.anInt8822);
					local29 += local17.anInt8822;
					local27 -= local17.anInt8822;
				} while (!this.aClass2_Sub3_Sub2_3.method2038(local27, local29, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([ILclient!uf;IIII)V")
	private void method587(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub47 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub3_Sub2_3.anIntArray201[arg1.anInt8818] & 0x4) != 0 && arg1.anInt8813 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub3_Sub2_3.anIntArray205[arg1.anInt8818] / Static591.anInt9580;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt8819) / local29;
				if (local39 > arg4) {
					arg1.anInt8819 += arg4 * local29;
					break;
				}
				arg1.aClass2_Sub3_Sub3_4.method6697(arg0, arg3, local39);
				arg4 -= local39;
				arg3 += local39;
				arg1.anInt8819 += local29 * local39 - 1048576;
				@Pc(74) int local74 = Static591.anInt9580 / 100;
				@Pc(78) int local78 = 262144 / local29;
				if (local74 > local78) {
					local74 = local78;
				}
				@Pc(86) Class2_Sub3_Sub3 local86 = arg1.aClass2_Sub3_Sub3_4;
				if (this.aClass2_Sub3_Sub2_3.anIntArray198[arg1.anInt8818] == 0) {
					arg1.aClass2_Sub3_Sub3_4 = Static599.method4313(arg1.aClass2_Sub13_Sub1_4, local86.method4302(), local86.method4330(), local86.method4311());
				} else {
					arg1.aClass2_Sub3_Sub3_4 = Static599.method4313(arg1.aClass2_Sub13_Sub1_4, local86.method4302(), 0, local86.method4311());
					this.aClass2_Sub3_Sub2_3.method2043(arg1.aClass2_Sub48_1.aShortArray133[arg1.anInt8825] < 0, arg1);
					arg1.aClass2_Sub3_Sub3_4.method4324(local74, local86.method4330());
				}
				if (arg1.aClass2_Sub48_1.aShortArray133[arg1.anInt8825] < 0) {
					arg1.aClass2_Sub3_Sub3_4.method4331(-1);
				}
				local86.method4306(local74);
				local86.method6697(arg0, arg3, arg2 - arg3);
				if (local86.method4300()) {
					this.aClass2_Sub3_Sub4_1.method6706(local86);
				}
			}
		}
		arg1.aClass2_Sub3_Sub3_4.method6697(arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "()Lclient!ac;")
	@Override
	public Class2_Sub3 method6703() {
		@Pc(9) Class2_Sub47 local9;
		do {
			local9 = (Class2_Sub47) this.aClass70_2.method1261();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub3_Sub3_4 == null);
		return local9.aClass2_Sub3_Sub3_4;
	}
}
