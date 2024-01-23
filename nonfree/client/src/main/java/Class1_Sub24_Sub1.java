import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class1_Sub24_Sub1 extends Class1_Sub24 {

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!gj;")
	public Class59 aClass59_30 = new Class59();

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "Lclient!vf;")
	public Class1_Sub24_Sub3 aClass1_Sub24_Sub3_2 = new Class1_Sub24_Sub3();

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "Lclient!wd;")
	private Class1_Sub24_Sub4 aClass1_Sub24_Sub4_2;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class1_Sub24_Sub1(@OriginalArg(0) Class1_Sub24_Sub4 arg0) {
		this.aClass1_Sub24_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()I")
	@Override
	public int method4623() {
		return 0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "([III)V")
	@Override
	public void method4624(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub24_Sub3_2.method4624(arg0, arg1, arg2);
		for (@Pc(13) Class1_Sub11 local13 = (Class1_Sub11) this.aClass59_30.method1704(); local13 != null; local13 = (Class1_Sub11) this.aClass59_30.method1701()) {
			if (!this.aClass1_Sub24_Sub4_2.method4660(local13)) {
				@Pc(24) int local24 = arg2;
				@Pc(26) int local26 = arg1;
				do {
					if (local24 <= local13.anInt1053) {
						this.method3294(local26, local26 + local24, local13, arg0, local24);
						local13.anInt1053 -= local24;
						break;
					}
					this.method3294(local26, local26 + local24, local13, arg0, local13.anInt1053);
					local24 -= local13.anInt1053;
					local26 += local13.anInt1053;
				} while (!this.aClass1_Sub24_Sub4_2.method4641(local13, local24, arg0, local26));
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	@Override
	public void method4619(@OriginalArg(0) int arg0) {
		this.aClass1_Sub24_Sub3_2.method4619(arg0);
		for (@Pc(11) Class1_Sub11 local11 = (Class1_Sub11) this.aClass59_30.method1704(); local11 != null; local11 = (Class1_Sub11) this.aClass59_30.method1701()) {
			if (!this.aClass1_Sub24_Sub4_2.method4660(local11)) {
				@Pc(23) int local23 = arg0;
				do {
					if (local23 <= local11.anInt1053) {
						this.method3292(local11, local23);
						local11.anInt1053 -= local23;
						break;
					}
					this.method3292(local11, local11.anInt1053);
					local23 -= local11.anInt1053;
				} while (!this.aClass1_Sub24_Sub4_2.method4641(local11, local23, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!e;IB)V")
	private void method3292(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub24_Sub4_2.anIntArray497[arg0.anInt1069] & 0x4) != 0 && arg0.anInt1071 < 0) {
			@Pc(34) int local34 = this.aClass1_Sub24_Sub4_2.anIntArray483[arg0.anInt1069] / Static303.anInt5383;
			@Pc(44) int local44 = (local34 + 1048575 - arg0.anInt1052) / local34;
			arg0.anInt1052 = arg0.anInt1052 + local34 * arg1 & 0xFFFFF;
			if (arg1 >= local44) {
				if (this.aClass1_Sub24_Sub4_2.anIntArray496[arg0.anInt1069] == 0) {
					arg0.aClass1_Sub24_Sub2_3 = Static323.method3724(arg0.aClass1_Sub5_Sub1_1, arg0.aClass1_Sub24_Sub2_3.method3708(), arg0.aClass1_Sub24_Sub2_3.method3727(), arg0.aClass1_Sub24_Sub2_3.method3707());
				} else {
					arg0.aClass1_Sub24_Sub2_3 = Static323.method3724(arg0.aClass1_Sub5_Sub1_1, arg0.aClass1_Sub24_Sub2_3.method3708(), 0, arg0.aClass1_Sub24_Sub2_3.method3707());
					this.aClass1_Sub24_Sub4_2.method4625(arg0.aClass1_Sub23_1.aShortArray65[arg0.anInt1055] < 0, arg0);
				}
				if (arg0.aClass1_Sub23_1.aShortArray65[arg0.anInt1055] < 0) {
					arg0.aClass1_Sub24_Sub2_3.method3722(-1);
				}
				arg1 = arg0.anInt1052 / local34;
			}
		}
		arg0.aClass1_Sub24_Sub2_3.method4619(arg1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!e;I[II)V")
	private void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub11 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub24_Sub4_2.anIntArray497[arg2.anInt1069] & 0x4) != 0 && arg2.anInt1071 < 0) {
			@Pc(29) int local29 = this.aClass1_Sub24_Sub4_2.anIntArray483[arg2.anInt1069] / Static303.anInt5383;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg2.anInt1052) / local29;
				if (local39 > arg4) {
					arg2.anInt1052 += arg4 * local29;
					break;
				}
				arg4 -= local39;
				arg2.aClass1_Sub24_Sub2_3.method4624(arg3, arg0, local39);
				@Pc(55) Class1_Sub24_Sub2 local55 = arg2.aClass1_Sub24_Sub2_3;
				@Pc(59) int local59 = Static303.anInt5383 / 100;
				@Pc(63) int local63 = 262144 / local29;
				if (local63 < local59) {
					local59 = local63;
				}
				arg2.anInt1052 += local29 * local39 - 1048576;
				if (this.aClass1_Sub24_Sub4_2.anIntArray496[arg2.anInt1069] == 0) {
					arg2.aClass1_Sub24_Sub2_3 = Static323.method3724(arg2.aClass1_Sub5_Sub1_1, local55.method3708(), local55.method3727(), local55.method3707());
				} else {
					arg2.aClass1_Sub24_Sub2_3 = Static323.method3724(arg2.aClass1_Sub5_Sub1_1, local55.method3708(), 0, local55.method3707());
					this.aClass1_Sub24_Sub4_2.method4625(arg2.aClass1_Sub23_1.aShortArray65[arg2.anInt1055] < 0, arg2);
					arg2.aClass1_Sub24_Sub2_3.method3712(local59, local55.method3727());
				}
				if (arg2.aClass1_Sub23_1.aShortArray65[arg2.anInt1055] < 0) {
					arg2.aClass1_Sub24_Sub2_3.method3722(-1);
				}
				local55.method3723(local59);
				arg0 += local39;
				local55.method4624(arg3, arg0, arg1 - arg0);
				if (local55.method3735()) {
					this.aClass1_Sub24_Sub3_2.method4514(local55);
				}
			}
		}
		arg2.aClass1_Sub24_Sub2_3.method4624(arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()Lclient!qd;")
	@Override
	public Class1_Sub24 method4618() {
		@Pc(9) Class1_Sub11 local9 = (Class1_Sub11) this.aClass59_30.method1704();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub24_Sub2_3 == null) {
			return this.method4622();
		} else {
			return local9.aClass1_Sub24_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()Lclient!qd;")
	@Override
	public Class1_Sub24 method4622() {
		@Pc(9) Class1_Sub11 local9;
		do {
			local9 = (Class1_Sub11) this.aClass59_30.method1701();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub24_Sub2_3 == null);
		return local9.aClass1_Sub24_Sub2_3;
	}
}
