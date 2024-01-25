import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class7_Sub8_Sub2 extends Class7_Sub8 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!fr;")
	public final Class85 aClass85_19 = new Class85();

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Lclient!hw;")
	public final Class7_Sub8_Sub1 aClass7_Sub8_Sub1_1 = new Class7_Sub8_Sub1();

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Lclient!rl;")
	private final Class7_Sub8_Sub3 aClass7_Sub8_Sub3_2;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class7_Sub8_Sub2(@OriginalArg(0) Class7_Sub8_Sub3 arg0) {
		this.aClass7_Sub8_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!cj;[II)V")
	private void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub10 arg3, @OriginalArg(4) int[] arg4) {
		if ((this.aClass7_Sub8_Sub3_2.anIntArray503[arg3.anInt759] & 0x4) != 0 && arg3.anInt757 < 0) {
			@Pc(36) int local36 = this.aClass7_Sub8_Sub3_2.anIntArray500[arg3.anInt759] / Static208.anInt3680;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg3.anInt760) / local36;
				if (arg0 < local46) {
					arg3.anInt760 += arg0 * local36;
					break;
				}
				arg3.aClass7_Sub8_Sub4_1.method4871(arg4, arg1, local46);
				arg0 -= local46;
				arg1 += local46;
				arg3.anInt760 += local36 * local46 - 1048576;
				@Pc(81) int local81 = Static208.anInt3680 / 100;
				@Pc(85) int local85 = 262144 / local36;
				if (local81 > local85) {
					local81 = local85;
				}
				@Pc(93) Class7_Sub8_Sub4 local93 = arg3.aClass7_Sub8_Sub4_1;
				if (this.aClass7_Sub8_Sub3_2.anIntArray509[arg3.anInt759] == 0) {
					arg3.aClass7_Sub8_Sub4_1 = Static467.method4882(arg3.aClass7_Sub31_Sub1_1, local93.method4896(), local93.method4905(), local93.method4877());
				} else {
					arg3.aClass7_Sub8_Sub4_1 = Static467.method4882(arg3.aClass7_Sub31_Sub1_1, local93.method4896(), 0, local93.method4877());
					this.aClass7_Sub8_Sub3_2.method4506(arg3.aClass7_Sub1_1.aShortArray1[arg3.anInt767] < 0, arg3);
					arg3.aClass7_Sub8_Sub4_1.method4908(local81, local93.method4905());
				}
				if (arg3.aClass7_Sub1_1.aShortArray1[arg3.anInt767] < 0) {
					arg3.aClass7_Sub8_Sub4_1.method4883(-1);
				}
				local93.method4885(local81);
				local93.method4871(arg4, arg1, arg2 - arg1);
				if (local93.method4912()) {
					this.aClass7_Sub8_Sub1_1.method2432(local93);
				}
			}
		}
		arg3.aClass7_Sub8_Sub4_1.method4871(arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "([III)V")
	@Override
	public void method4871(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub8_Sub1_1.method4871(arg0, arg1, arg2);
		for (@Pc(17) Class7_Sub10 local17 = (Class7_Sub10) this.aClass85_19.method2010(); local17 != null; local17 = (Class7_Sub10) this.aClass85_19.method2000()) {
			if (!this.aClass7_Sub8_Sub3_2.method4507(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt777 >= local27) {
						this.method2771(local27, local29, local29 + local27, local17, arg0);
						local17.anInt777 -= local27;
						break;
					}
					this.method2771(local17.anInt777, local29, local29 + local27, local17, arg0);
					local27 -= local17.anInt777;
					local29 += local17.anInt777;
				} while (!this.aClass7_Sub8_Sub3_2.method4505(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
	@Override
	public int method4869() {
		return 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()Lclient!bs;")
	@Override
	public Class7_Sub8 method4866() {
		@Pc(9) Class7_Sub10 local9 = (Class7_Sub10) this.aClass85_19.method2010();
		if (local9 == null) {
			return null;
		} else if (local9.aClass7_Sub8_Sub4_1 == null) {
			return this.method4872();
		} else {
			return local9.aClass7_Sub8_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()Lclient!bs;")
	@Override
	public Class7_Sub8 method4872() {
		@Pc(9) Class7_Sub10 local9;
		do {
			local9 = (Class7_Sub10) this.aClass85_19.method2000();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass7_Sub8_Sub4_1 == null);
		return local9.aClass7_Sub8_Sub4_1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!cj;II)V")
	private void method2773(@OriginalArg(0) Class7_Sub10 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass7_Sub8_Sub3_2.anIntArray503[arg0.anInt759] & 0x4) != 0 && arg0.anInt757 < 0) {
			@Pc(21) int local21 = this.aClass7_Sub8_Sub3_2.anIntArray500[arg0.anInt759] / Static208.anInt3680;
			@Pc(31) int local31 = (local21 + 1048575 - arg0.anInt760) / local21;
			arg0.anInt760 = arg0.anInt760 + arg1 * local21 & 0xFFFFF;
			if (arg1 >= local31) {
				if (this.aClass7_Sub8_Sub3_2.anIntArray509[arg0.anInt759] == 0) {
					arg0.aClass7_Sub8_Sub4_1 = Static467.method4882(arg0.aClass7_Sub31_Sub1_1, arg0.aClass7_Sub8_Sub4_1.method4896(), arg0.aClass7_Sub8_Sub4_1.method4905(), arg0.aClass7_Sub8_Sub4_1.method4877());
				} else {
					arg0.aClass7_Sub8_Sub4_1 = Static467.method4882(arg0.aClass7_Sub31_Sub1_1, arg0.aClass7_Sub8_Sub4_1.method4896(), 0, arg0.aClass7_Sub8_Sub4_1.method4877());
					this.aClass7_Sub8_Sub3_2.method4506(arg0.aClass7_Sub1_1.aShortArray1[arg0.anInt767] < 0, arg0);
				}
				if (arg0.aClass7_Sub1_1.aShortArray1[arg0.anInt767] < 0) {
					arg0.aClass7_Sub8_Sub4_1.method4883(-1);
				}
				arg1 = arg0.anInt760 / local21;
			}
		}
		arg0.aClass7_Sub8_Sub4_1.method4870(arg1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public void method4870(@OriginalArg(0) int arg0) {
		this.aClass7_Sub8_Sub1_1.method4870(arg0);
		for (@Pc(15) Class7_Sub10 local15 = (Class7_Sub10) this.aClass85_19.method2010(); local15 != null; local15 = (Class7_Sub10) this.aClass85_19.method2000()) {
			if (!this.aClass7_Sub8_Sub3_2.method4507(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt777 >= local25) {
						this.method2773(local15, local25);
						local15.anInt777 -= local25;
						break;
					}
					this.method2773(local15, local15.anInt777);
					local25 -= local15.anInt777;
				} while (!this.aClass7_Sub8_Sub3_2.method4505(local25, 0, null, local15));
			}
		}
	}
}
