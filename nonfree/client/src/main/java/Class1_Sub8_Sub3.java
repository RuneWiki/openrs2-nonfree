import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub8_Sub3 extends Class1_Sub8 {

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Lclient!ad;")
	public final Class4 aClass4_10 = new Class4();

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!ef;")
	public final Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2 = new Class1_Sub8_Sub1();

	@OriginalMember(owner = "client!m", name = "P", descriptor = "Lclient!le;")
	private final Class1_Sub8_Sub2 aClass1_Sub8_Sub2_2;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!le;)V")
	public Class1_Sub8_Sub3(@OriginalArg(0) Class1_Sub8_Sub2 arg0) {
		this.aClass1_Sub8_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "()Lclient!qh;")
	@Override
	public Class1_Sub8 method2942() {
		@Pc(9) Class1_Sub5 local9 = (Class1_Sub5) this.aClass4_10.method174();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub8_Sub4_1 == null) {
			return this.method2937();
		} else {
			return local9.aClass1_Sub8_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!bh;I)V")
	private void method2209(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub8_Sub2_2.anIntArray285[arg0.anInt487] & 0x4) != 0 && arg0.anInt501 < 0) {
			@Pc(33) int local33 = this.aClass1_Sub8_Sub2_2.anIntArray282[arg0.anInt487] / Static166.anInt4307;
			@Pc(43) int local43 = (local33 + 1048575 - arg0.anInt497) / local33;
			arg0.anInt497 = arg0.anInt497 + local33 * arg1 & 0xFFFFF;
			if (local43 <= arg1) {
				if (this.aClass1_Sub8_Sub2_2.anIntArray273[arg0.anInt487] == 0) {
					arg0.aClass1_Sub8_Sub4_1 = Static190.method2976(arg0.aClass1_Sub20_Sub1_1, arg0.aClass1_Sub8_Sub4_1.method2974(), arg0.aClass1_Sub8_Sub4_1.method2966(), arg0.aClass1_Sub8_Sub4_1.method2948());
				} else {
					arg0.aClass1_Sub8_Sub4_1 = Static190.method2976(arg0.aClass1_Sub20_Sub1_1, arg0.aClass1_Sub8_Sub4_1.method2974(), 0, arg0.aClass1_Sub8_Sub4_1.method2948());
					this.aClass1_Sub8_Sub2_2.method2172(arg0.aClass1_Sub15_1.aShortArray24[arg0.anInt490] < 0, arg0);
				}
				if (arg0.aClass1_Sub15_1.aShortArray24[arg0.anInt490] < 0) {
					arg0.aClass1_Sub8_Sub4_1.method2968(-1);
				}
				arg1 = arg0.anInt497 / local33;
			}
		}
		arg0.aClass1_Sub8_Sub4_1.method2943(arg1);
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	@Override
	public void method2943(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_Sub1_2.method2943(arg0);
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass4_10.method174(); local15 != null; local15 = (Class1_Sub5) this.aClass4_10.method181()) {
			if (!this.aClass1_Sub8_Sub2_2.method2160(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt494) {
						this.method2209(local15, local25);
						local15.anInt494 -= local25;
						break;
					}
					this.method2209(local15, local15.anInt494);
					local25 -= local15.anInt494;
				} while (!this.aClass1_Sub8_Sub2_2.method2143(null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([III)V")
	@Override
	public void method2941(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub8_Sub1_2.method2941(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass4_10.method174(); local17 != null; local17 = (Class1_Sub5) this.aClass4_10.method181()) {
			if (!this.aClass1_Sub8_Sub2_2.method2160(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt494 >= local29) {
						this.method2210(local29, local29 + local27, arg0, local17, local27);
						local17.anInt494 -= local29;
						break;
					}
					this.method2210(local17.anInt494, local29 + local27, arg0, local17, local27);
					local29 -= local17.anInt494;
					local27 += local17.anInt494;
				} while (!this.aClass1_Sub8_Sub2_2.method2143(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
	@Override
	public int method2938() {
		return 0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()Lclient!qh;")
	@Override
	public Class1_Sub8 method2937() {
		@Pc(9) Class1_Sub5 local9;
		do {
			local9 = (Class1_Sub5) this.aClass4_10.method181();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub8_Sub4_1 == null);
		return local9.aClass1_Sub8_Sub4_1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III[ILclient!bh;I)V")
	private void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub5 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub8_Sub2_2.anIntArray285[arg3.anInt487] & 0x4) != 0 && arg3.anInt501 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub8_Sub2_2.anIntArray282[arg3.anInt487] / Static166.anInt4307;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg3.anInt497) / local26;
				if (arg0 < local36) {
					arg3.anInt497 += arg0 * local26;
					break;
				}
				arg3.aClass1_Sub8_Sub4_1.method2941(arg2, arg4, local36);
				arg4 += local36;
				@Pc(57) int local57 = Static166.anInt4307 / 100;
				@Pc(61) int local61 = 262144 / local26;
				arg3.anInt497 += local36 * local26 - 1048576;
				if (local61 < local57) {
					local57 = local61;
				}
				arg0 -= local36;
				@Pc(87) Class1_Sub8_Sub4 local87 = arg3.aClass1_Sub8_Sub4_1;
				if (this.aClass1_Sub8_Sub2_2.anIntArray273[arg3.anInt487] == 0) {
					arg3.aClass1_Sub8_Sub4_1 = Static190.method2976(arg3.aClass1_Sub20_Sub1_1, local87.method2974(), local87.method2966(), local87.method2948());
				} else {
					arg3.aClass1_Sub8_Sub4_1 = Static190.method2976(arg3.aClass1_Sub20_Sub1_1, local87.method2974(), 0, local87.method2948());
					this.aClass1_Sub8_Sub2_2.method2172(arg3.aClass1_Sub15_1.aShortArray24[arg3.anInt490] < 0, arg3);
					arg3.aClass1_Sub8_Sub4_1.method2967(local57, local87.method2966());
				}
				if (arg3.aClass1_Sub15_1.aShortArray24[arg3.anInt490] < 0) {
					arg3.aClass1_Sub8_Sub4_1.method2968(-1);
				}
				local87.method2979(local57);
				local87.method2941(arg2, arg4, arg1 - arg4);
				if (local87.method2972()) {
					this.aClass1_Sub8_Sub1_2.method1090(local87);
				}
			}
		}
		arg3.aClass1_Sub8_Sub4_1.method2941(arg2, arg4, arg0);
	}
}
