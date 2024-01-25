import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class6_Sub3_Sub5 extends Class6_Sub3 {

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!ada;")
	public final Class8 aClass8_61 = new Class8();

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "Lclient!aga;")
	public final Class6_Sub3_Sub1 aClass6_Sub3_Sub1_2 = new Class6_Sub3_Sub1();

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!jo;")
	private final Class6_Sub3_Sub4 aClass6_Sub3_Sub4_4;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!jo;)V")
	public Class6_Sub3_Sub5(@OriginalArg(0) Class6_Sub3_Sub4 arg0) {
		this.aClass6_Sub3_Sub4_4 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([ILclient!pg;IBII)V")
	private void method7807(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class6_Sub33 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub3_Sub4_4.anIntArray309[arg1.anInt7850] & 0x4) != 0 && arg1.anInt7841 < 0) {
			@Pc(22) int local22 = this.aClass6_Sub3_Sub4_4.anIntArray313[arg1.anInt7850] / Static78.anInt1661;
			while (true) {
				@Pc(33) int local33 = (local22 + 1048575 - arg1.anInt7852) / local22;
				if (arg2 < local33) {
					arg1.anInt7852 += local22 * arg2;
					break;
				}
				arg1.aClass6_Sub3_Sub3_2.method7805(arg0, arg4, local33);
				arg1.anInt7852 += local33 * local22 - 1048576;
				arg4 += local33;
				arg2 -= local33;
				@Pc(68) int local68 = Static78.anInt1661 / 100;
				@Pc(72) int local72 = 262144 / local22;
				if (local68 > local72) {
					local68 = local72;
				}
				@Pc(80) Class6_Sub3_Sub3 local80 = arg1.aClass6_Sub3_Sub3_2;
				if (this.aClass6_Sub3_Sub4_4.anIntArray312[arg1.anInt7850] == 0) {
					arg1.aClass6_Sub3_Sub3_2 = Static653.method3866(arg1.aClass6_Sub37_Sub1_2, local80.method3865(), local80.method3851(), local80.method3840());
				} else {
					arg1.aClass6_Sub3_Sub3_2 = Static653.method3866(arg1.aClass6_Sub37_Sub1_2, local80.method3865(), 0, local80.method3840());
					this.aClass6_Sub3_Sub4_4.method4704(arg1, arg1.aClass6_Sub32_1.aShortArray93[arg1.anInt7853] < 0);
					arg1.aClass6_Sub3_Sub3_2.method3842(local68, local80.method3851());
				}
				if (arg1.aClass6_Sub32_1.aShortArray93[arg1.anInt7853] < 0) {
					arg1.aClass6_Sub3_Sub3_2.method3841(-1);
				}
				local80.method3860(local68);
				local80.method7805(arg0, arg4, arg3 - arg4);
				if (local80.method3853()) {
					this.aClass6_Sub3_Sub1_2.method271(local80);
				}
			}
		}
		arg1.aClass6_Sub3_Sub3_2.method7805(arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBLclient!pg;)V")
	private void method7808(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub33 arg1) {
		if ((this.aClass6_Sub3_Sub4_4.anIntArray309[arg1.anInt7850] & 0x4) != 0 && arg1.anInt7841 < 0) {
			@Pc(26) int local26 = this.aClass6_Sub3_Sub4_4.anIntArray313[arg1.anInt7850] / Static78.anInt1661;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt7852) / local26;
			arg1.anInt7852 = arg1.anInt7852 + arg0 * local26 & 0xFFFFF;
			if (local36 <= arg0) {
				if (this.aClass6_Sub3_Sub4_4.anIntArray312[arg1.anInt7850] == 0) {
					arg1.aClass6_Sub3_Sub3_2 = Static653.method3866(arg1.aClass6_Sub37_Sub1_2, arg1.aClass6_Sub3_Sub3_2.method3865(), arg1.aClass6_Sub3_Sub3_2.method3851(), arg1.aClass6_Sub3_Sub3_2.method3840());
				} else {
					arg1.aClass6_Sub3_Sub3_2 = Static653.method3866(arg1.aClass6_Sub37_Sub1_2, arg1.aClass6_Sub3_Sub3_2.method3865(), 0, arg1.aClass6_Sub3_Sub3_2.method3840());
					this.aClass6_Sub3_Sub4_4.method4704(arg1, arg1.aClass6_Sub32_1.aShortArray93[arg1.anInt7853] < 0);
				}
				if (arg1.aClass6_Sub32_1.aShortArray93[arg1.anInt7853] < 0) {
					arg1.aClass6_Sub3_Sub3_2.method3841(-1);
				}
				arg0 = arg1.anInt7852 / local26;
			}
		}
		arg1.aClass6_Sub3_Sub3_2.method7801(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "([III)V")
	@Override
	public void method7805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub3_Sub1_2.method7805(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub33 local17 = (Class6_Sub33) this.aClass8_61.method149(); local17 != null; local17 = (Class6_Sub33) this.aClass8_61.method155()) {
			if (!this.aClass6_Sub3_Sub4_4.method4706(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt7844 >= local29) {
						this.method7807(arg0, local17, local29, local27 + local29, local27);
						local17.anInt7844 -= local29;
						break;
					}
					this.method7807(arg0, local17, local17.anInt7844, local27 + local29, local27);
					local29 -= local17.anInt7844;
					local27 += local17.anInt7844;
				} while (!this.aClass6_Sub3_Sub4_4.method4714(local27, arg0, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7800() {
		@Pc(9) Class6_Sub33 local9 = (Class6_Sub33) this.aClass8_61.method149();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub3_Sub3_2 == null) {
			return this.method7803();
		} else {
			return local9.aClass6_Sub3_Sub3_2;
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7803() {
		@Pc(9) Class6_Sub33 local9;
		do {
			local9 = (Class6_Sub33) this.aClass8_61.method155();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub3_Sub3_2 == null);
		return local9.aClass6_Sub3_Sub3_2;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public void method7801(@OriginalArg(0) int arg0) {
		this.aClass6_Sub3_Sub1_2.method7801(arg0);
		for (@Pc(15) Class6_Sub33 local15 = (Class6_Sub33) this.aClass8_61.method149(); local15 != null; local15 = (Class6_Sub33) this.aClass8_61.method155()) {
			if (!this.aClass6_Sub3_Sub4_4.method4706(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt7844) {
						this.method7808(local25, local15);
						local15.anInt7844 -= local25;
						break;
					}
					this.method7808(local15.anInt7844, local15);
					local25 -= local15.anInt7844;
				} while (!this.aClass6_Sub3_Sub4_4.method4714(0, (int[]) null, local15, local25));
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "()I")
	@Override
	public int method7804() {
		return 0;
	}
}
