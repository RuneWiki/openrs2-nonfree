import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class5_Sub17_Sub4 extends Class5_Sub17 {

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!vn;")
	public final Class211 aClass211_31 = new Class211();

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "Lclient!ms;")
	public final Class5_Sub17_Sub3 aClass5_Sub17_Sub3_2 = new Class5_Sub17_Sub3();

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "Lclient!la;")
	private final Class5_Sub17_Sub2 aClass5_Sub17_Sub2_2;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class5_Sub17_Sub4(@OriginalArg(0) Class5_Sub17_Sub2 arg0) {
		this.aClass5_Sub17_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	@Override
	public void method4465(@OriginalArg(0) int arg0) {
		this.aClass5_Sub17_Sub3_2.method4465(arg0);
		for (@Pc(15) Class5_Sub28 local15 = (Class5_Sub28) this.aClass211_31.method5608(); local15 != null; local15 = (Class5_Sub28) this.aClass211_31.method5603()) {
			if (!this.aClass5_Sub17_Sub2_2.method3183(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3786 >= local25) {
						this.method4470(local15, local25);
						local15.anInt3786 -= local25;
						break;
					}
					this.method4470(local15, local15.anInt3786);
					local25 -= local15.anInt3786;
				} while (!this.aClass5_Sub17_Sub2_2.method3185(local25, null, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()Lclient!nf;")
	@Override
	public Class5_Sub17 method4461() {
		@Pc(9) Class5_Sub28 local9;
		do {
			local9 = (Class5_Sub28) this.aClass211_31.method5603();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub17_Sub1_3 == null);
		return local9.aClass5_Sub17_Sub1_3;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "([III)V")
	@Override
	public void method4464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub17_Sub3_2.method4464(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub28 local17 = (Class5_Sub28) this.aClass211_31.method5608(); local17 != null; local17 = (Class5_Sub28) this.aClass211_31.method5603()) {
			if (!this.aClass5_Sub17_Sub2_2.method3183(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3786 >= local27) {
						this.method4472(arg0, local17, local27, local27 + local29, local29);
						local17.anInt3786 -= local27;
						break;
					}
					this.method4472(arg0, local17, local17.anInt3786, local27 + local29, local29);
					local29 += local17.anInt3786;
					local27 -= local17.anInt3786;
				} while (!this.aClass5_Sub17_Sub2_2.method3185(local27, arg0, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!mi;I)V")
	private void method4470(@OriginalArg(1) Class5_Sub28 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass5_Sub17_Sub2_2.anIntArray247[arg0.anInt3774] & 0x4) != 0 && arg0.anInt3783 < 0) {
			@Pc(33) int local33 = this.aClass5_Sub17_Sub2_2.anIntArray255[arg0.anInt3774] / Static344.anInt1063;
			@Pc(43) int local43 = (local33 + 1048575 - arg0.anInt3785) / local33;
			arg0.anInt3785 = arg0.anInt3785 + arg1 * local33 & 0xFFFFF;
			if (arg1 >= local43) {
				if (this.aClass5_Sub17_Sub2_2.anIntArray239[arg0.anInt3774] == 0) {
					arg0.aClass5_Sub17_Sub1_3 = Static361.method2109(arg0.aClass5_Sub15_Sub1_1, arg0.aClass5_Sub17_Sub1_3.method2128(), arg0.aClass5_Sub17_Sub1_3.method2112(), arg0.aClass5_Sub17_Sub1_3.method2111());
				} else {
					arg0.aClass5_Sub17_Sub1_3 = Static361.method2109(arg0.aClass5_Sub15_Sub1_1, arg0.aClass5_Sub17_Sub1_3.method2128(), 0, arg0.aClass5_Sub17_Sub1_3.method2111());
					this.aClass5_Sub17_Sub2_2.method3202(arg0.aClass5_Sub7_1.aShortArray11[arg0.anInt3784] < 0, arg0);
				}
				if (arg0.aClass5_Sub7_1.aShortArray11[arg0.anInt3784] < 0) {
					arg0.aClass5_Sub17_Sub1_3.method2121(-1);
				}
				arg1 = arg0.anInt3785 / local33;
			}
		}
		arg0.aClass5_Sub17_Sub1_3.method4465(arg1);
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "()Lclient!nf;")
	@Override
	public Class5_Sub17 method4463() {
		@Pc(9) Class5_Sub28 local9 = (Class5_Sub28) this.aClass211_31.method5608();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub17_Sub1_3 == null) {
			return this.method4461();
		} else {
			return local9.aClass5_Sub17_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
	@Override
	public int method4459() {
		return 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([ILclient!mi;IIII)V")
	private void method4472(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5_Sub28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub17_Sub2_2.anIntArray247[arg1.anInt3774] & 0x4) != 0 && arg1.anInt3783 < 0) {
			@Pc(28) int local28 = this.aClass5_Sub17_Sub2_2.anIntArray255[arg1.anInt3774] / Static344.anInt1063;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg1.anInt3785) / local28;
				if (arg2 < local38) {
					arg1.anInt3785 += arg2 * local28;
					break;
				}
				arg1.aClass5_Sub17_Sub1_3.method4464(arg0, arg4, local38);
				arg2 -= local38;
				arg1.anInt3785 += local28 * local38 - 1048576;
				arg4 += local38;
				@Pc(69) int local69 = Static344.anInt1063 / 100;
				@Pc(73) int local73 = 262144 / local28;
				if (local69 > local73) {
					local69 = local73;
				}
				@Pc(85) Class5_Sub17_Sub1 local85 = arg1.aClass5_Sub17_Sub1_3;
				if (this.aClass5_Sub17_Sub2_2.anIntArray239[arg1.anInt3774] == 0) {
					arg1.aClass5_Sub17_Sub1_3 = Static361.method2109(arg1.aClass5_Sub15_Sub1_1, local85.method2128(), local85.method2112(), local85.method2111());
				} else {
					arg1.aClass5_Sub17_Sub1_3 = Static361.method2109(arg1.aClass5_Sub15_Sub1_1, local85.method2128(), 0, local85.method2111());
					this.aClass5_Sub17_Sub2_2.method3202(arg1.aClass5_Sub7_1.aShortArray11[arg1.anInt3784] < 0, arg1);
					arg1.aClass5_Sub17_Sub1_3.method2100(local69, local85.method2112());
				}
				if (arg1.aClass5_Sub7_1.aShortArray11[arg1.anInt3784] < 0) {
					arg1.aClass5_Sub17_Sub1_3.method2121(-1);
				}
				local85.method2093(local69);
				local85.method4464(arg0, arg4, arg3 - arg4);
				if (local85.method2120()) {
					this.aClass5_Sub17_Sub3_2.method3547(local85);
				}
			}
		}
		arg1.aClass5_Sub17_Sub1_3.method4464(arg0, arg4, arg2);
	}
}
