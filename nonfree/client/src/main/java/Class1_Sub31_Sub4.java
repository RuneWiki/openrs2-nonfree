import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class1_Sub31_Sub4 extends Class1_Sub31 {

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!ar;")
	public final Class14 aClass14_34 = new Class14();

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "Lclient!qf;")
	public final Class1_Sub31_Sub2 aClass1_Sub31_Sub2_2 = new Class1_Sub31_Sub2();

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!rh;")
	private final Class1_Sub31_Sub3 aClass1_Sub31_Sub3_3;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!rh;)V")
	public Class1_Sub31_Sub4(@OriginalArg(0) Class1_Sub31_Sub3 arg0) {
		this.aClass1_Sub31_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "([III)V")
	@Override
	public void method5516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub31_Sub2_2.method5516(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub10 local17 = (Class1_Sub10) this.aClass14_34.method302(); local17 != null; local17 = (Class1_Sub10) this.aClass14_34.method313()) {
			if (!this.aClass1_Sub31_Sub3_3.method4715(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1250) {
						this.method5519(local27, local29, local17, local29 + local27, arg0);
						local17.anInt1250 -= local27;
						break;
					}
					this.method5519(local17.anInt1250, local29, local17, local29 + local27, arg0);
					local29 += local17.anInt1250;
					local27 -= local17.anInt1250;
				} while (!this.aClass1_Sub31_Sub3_3.method4729(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!dd;ZI[I)V")
	private void method5519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub31_Sub3_3.anIntArray524[arg2.anInt1249] & 0x4) != 0 && arg2.anInt1242 < 0) {
			@Pc(30) int local30 = this.aClass1_Sub31_Sub3_3.anIntArray512[arg2.anInt1249] / Static348.anInt6162;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg2.anInt1248) / local30;
				if (arg0 < local40) {
					arg2.anInt1248 += arg0 * local30;
					break;
				}
				arg2.aClass1_Sub31_Sub1_1.method5516(arg4, arg1, local40);
				arg0 -= local40;
				arg1 += local40;
				arg2.anInt1248 += local30 * local40 - 1048576;
				@Pc(75) int local75 = Static348.anInt6162 / 100;
				@Pc(79) int local79 = 262144 / local30;
				if (local79 < local75) {
					local75 = local79;
				}
				@Pc(87) Class1_Sub31_Sub1 local87 = arg2.aClass1_Sub31_Sub1_1;
				if (this.aClass1_Sub31_Sub3_3.anIntArray520[arg2.anInt1249] == 0) {
					arg2.aClass1_Sub31_Sub1_1 = Static366.method3921(arg2.aClass1_Sub20_Sub1_1, local87.method3913(), local87.method3899(), local87.method3917());
				} else {
					arg2.aClass1_Sub31_Sub1_1 = Static366.method3921(arg2.aClass1_Sub20_Sub1_1, local87.method3913(), 0, local87.method3917());
					this.aClass1_Sub31_Sub3_3.method4714(arg2, arg2.aClass1_Sub33_1.aShortArray60[arg2.anInt1255] < 0);
					arg2.aClass1_Sub31_Sub1_1.method3885(local75, local87.method3899());
				}
				if (arg2.aClass1_Sub33_1.aShortArray60[arg2.anInt1255] < 0) {
					arg2.aClass1_Sub31_Sub1_1.method3919(-1);
				}
				local87.method3886(local75);
				local87.method5516(arg4, arg1, arg3 - arg1);
				if (local87.method3890()) {
					this.aClass1_Sub31_Sub2_2.method4448(local87);
				}
			}
		}
		arg2.aClass1_Sub31_Sub1_1.method5516(arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()Lclient!pl;")
	@Override
	public Class1_Sub31 method5517() {
		@Pc(9) Class1_Sub10 local9 = (Class1_Sub10) this.aClass14_34.method302();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub31_Sub1_1 == null) {
			return this.method5513();
		} else {
			return local9.aClass1_Sub31_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()Lclient!pl;")
	@Override
	public Class1_Sub31 method5513() {
		@Pc(9) Class1_Sub10 local9;
		do {
			local9 = (Class1_Sub10) this.aClass14_34.method313();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub31_Sub1_1 == null);
		return local9.aClass1_Sub31_Sub1_1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!dd;I)V")
	private void method5523(@OriginalArg(1) Class1_Sub10 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub31_Sub3_3.anIntArray524[arg0.anInt1249] & 0x4) != 0 && arg0.anInt1242 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub31_Sub3_3.anIntArray512[arg0.anInt1249] / Static348.anInt6162;
			@Pc(36) int local36 = (local25 + 1048575 - arg0.anInt1248) / local25;
			arg0.anInt1248 = arg0.anInt1248 + arg1 * local25 & 0xFFFFF;
			if (local36 <= arg1) {
				if (this.aClass1_Sub31_Sub3_3.anIntArray520[arg0.anInt1249] == 0) {
					arg0.aClass1_Sub31_Sub1_1 = Static366.method3921(arg0.aClass1_Sub20_Sub1_1, arg0.aClass1_Sub31_Sub1_1.method3913(), arg0.aClass1_Sub31_Sub1_1.method3899(), arg0.aClass1_Sub31_Sub1_1.method3917());
				} else {
					arg0.aClass1_Sub31_Sub1_1 = Static366.method3921(arg0.aClass1_Sub20_Sub1_1, arg0.aClass1_Sub31_Sub1_1.method3913(), 0, arg0.aClass1_Sub31_Sub1_1.method3917());
					this.aClass1_Sub31_Sub3_3.method4714(arg0, arg0.aClass1_Sub33_1.aShortArray60[arg0.anInt1255] < 0);
				}
				if (arg0.aClass1_Sub33_1.aShortArray60[arg0.anInt1255] < 0) {
					arg0.aClass1_Sub31_Sub1_1.method3919(-1);
				}
				arg1 = arg0.anInt1248 / local25;
			}
		}
		arg0.aClass1_Sub31_Sub1_1.method5514(arg1);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0) {
		this.aClass1_Sub31_Sub2_2.method5514(arg0);
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) this.aClass14_34.method302(); local15 != null; local15 = (Class1_Sub10) this.aClass14_34.method313()) {
			if (!this.aClass1_Sub31_Sub3_3.method4715(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1250 >= local25) {
						this.method5523(local15, local25);
						local15.anInt1250 -= local25;
						break;
					}
					this.method5523(local15, local15.anInt1250);
					local25 -= local15.anInt1250;
				} while (!this.aClass1_Sub31_Sub3_3.method4729(0, local25, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
	@Override
	public int method5518() {
		return 0;
	}
}
