import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class4_Sub18_Sub3 extends Class4_Sub18 {

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Lclient!vr;")
	public final Class258 aClass258_46 = new Class258();

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "Lclient!jj;")
	public final Class4_Sub18_Sub1 aClass4_Sub18_Sub1_2 = new Class4_Sub18_Sub1();

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!wo;")
	private final Class4_Sub18_Sub4 aClass4_Sub18_Sub4_3;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class4_Sub18_Sub3(@OriginalArg(0) Class4_Sub18_Sub4 arg0) {
		this.aClass4_Sub18_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
	@Override
	public int method5754() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	@Override
	public void method5749(@OriginalArg(0) int arg0) {
		this.aClass4_Sub18_Sub1_2.method5749(arg0);
		for (@Pc(15) Class4_Sub45 local15 = (Class4_Sub45) this.aClass258_46.method5538(); local15 != null; local15 = (Class4_Sub45) this.aClass258_46.method5528()) {
			if (!this.aClass4_Sub18_Sub4_3.method5770(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt7436) {
						this.method5474(local15, local25);
						local15.anInt7436 -= local25;
						break;
					}
					this.method5474(local15, local15.anInt7436);
					local25 -= local15.anInt7436;
				} while (!this.aClass4_Sub18_Sub4_3.method5762(0, local25, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "([III)V")
	@Override
	public void method5755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub18_Sub1_2.method5755(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub45 local17 = (Class4_Sub45) this.aClass258_46.method5538(); local17 != null; local17 = (Class4_Sub45) this.aClass258_46.method5528()) {
			if (!this.aClass4_Sub18_Sub4_3.method5770(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt7436) {
						this.method5475(arg0, local17, local29, local27, local27 + local29);
						local17.anInt7436 -= local27;
						break;
					}
					this.method5475(arg0, local17, local29, local17.anInt7436, local29 + local27);
					local27 -= local17.anInt7436;
					local29 += local17.anInt7436;
				} while (!this.aClass4_Sub18_Sub4_3.method5762(local29, local27, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wm;BI)V")
	private void method5474(@OriginalArg(0) Class4_Sub45 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass4_Sub18_Sub4_3.anIntArray670[arg0.anInt7439] & 0x4) != 0 && arg0.anInt7452 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub18_Sub4_3.anIntArray658[arg0.anInt7439] / Static410.anInt6810;
			@Pc(38) int local38 = (local28 + 1048575 - arg0.anInt7446) / local28;
			arg0.anInt7446 = arg0.anInt7446 + arg1 * local28 & 0xFFFFF;
			if (arg1 >= local38) {
				if (this.aClass4_Sub18_Sub4_3.anIntArray669[arg0.anInt7439] == 0) {
					arg0.aClass4_Sub18_Sub2_4 = Static463.method4563(arg0.aClass4_Sub35_Sub1_2, arg0.aClass4_Sub18_Sub2_4.method4574(), arg0.aClass4_Sub18_Sub2_4.method4564(), arg0.aClass4_Sub18_Sub2_4.method4555());
				} else {
					arg0.aClass4_Sub18_Sub2_4 = Static463.method4563(arg0.aClass4_Sub35_Sub1_2, arg0.aClass4_Sub18_Sub2_4.method4574(), 0, arg0.aClass4_Sub18_Sub2_4.method4555());
					this.aClass4_Sub18_Sub4_3.method5763(arg0, arg0.aClass4_Sub24_1.aShortArray60[arg0.anInt7442] < 0);
				}
				if (arg0.aClass4_Sub24_1.aShortArray60[arg0.anInt7442] < 0) {
					arg0.aClass4_Sub18_Sub2_4.method4578(-1);
				}
				arg1 = arg0.anInt7446 / local28;
			}
		}
		arg0.aClass4_Sub18_Sub2_4.method5749(arg1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([ILclient!wm;IZII)V")
	private void method5475(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub45 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub18_Sub4_3.anIntArray670[arg1.anInt7439] & 0x4) != 0 && arg1.anInt7452 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub18_Sub4_3.anIntArray658[arg1.anInt7439] / Static410.anInt6810;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg1.anInt7446) / local28;
				if (arg3 < local38) {
					arg1.anInt7446 += local28 * arg3;
					break;
				}
				arg1.aClass4_Sub18_Sub2_4.method5755(arg0, arg2, local38);
				arg1.anInt7446 += local28 * local38 - 1048576;
				arg2 += local38;
				arg3 -= local38;
				@Pc(73) int local73 = Static410.anInt6810 / 100;
				@Pc(77) int local77 = 262144 / local28;
				if (local73 > local77) {
					local73 = local77;
				}
				@Pc(89) Class4_Sub18_Sub2 local89 = arg1.aClass4_Sub18_Sub2_4;
				if (this.aClass4_Sub18_Sub4_3.anIntArray669[arg1.anInt7439] == 0) {
					arg1.aClass4_Sub18_Sub2_4 = Static463.method4563(arg1.aClass4_Sub35_Sub1_2, local89.method4574(), local89.method4564(), local89.method4555());
				} else {
					arg1.aClass4_Sub18_Sub2_4 = Static463.method4563(arg1.aClass4_Sub35_Sub1_2, local89.method4574(), 0, local89.method4555());
					this.aClass4_Sub18_Sub4_3.method5763(arg1, arg1.aClass4_Sub24_1.aShortArray60[arg1.anInt7442] < 0);
					arg1.aClass4_Sub18_Sub2_4.method4552(local73, local89.method4564());
				}
				if (arg1.aClass4_Sub24_1.aShortArray60[arg1.anInt7442] < 0) {
					arg1.aClass4_Sub18_Sub2_4.method4578(-1);
				}
				local89.method4558(local73);
				local89.method5755(arg0, arg2, arg4 - arg2);
				if (local89.method4572()) {
					this.aClass4_Sub18_Sub1_2.method2787(local89);
				}
			}
		}
		arg1.aClass4_Sub18_Sub2_4.method5755(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()Lclient!ho;")
	@Override
	public Class4_Sub18 method5751() {
		@Pc(9) Class4_Sub45 local9 = (Class4_Sub45) this.aClass258_46.method5538();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub18_Sub2_4 == null) {
			return this.method5752();
		} else {
			return local9.aClass4_Sub18_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()Lclient!ho;")
	@Override
	public Class4_Sub18 method5752() {
		@Pc(9) Class4_Sub45 local9;
		do {
			local9 = (Class4_Sub45) this.aClass258_46.method5528();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub18_Sub2_4 == null);
		return local9.aClass4_Sub18_Sub2_4;
	}
}
