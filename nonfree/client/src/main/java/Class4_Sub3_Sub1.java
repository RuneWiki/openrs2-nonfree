import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!ifa;")
	public final Class163 aClass163_3 = new Class163();

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Lclient!tp;")
	public final Class4_Sub3_Sub5 aClass4_Sub3_Sub5_1 = new Class4_Sub3_Sub5();

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!qq;")
	private final Class4_Sub3_Sub4 aClass4_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class4_Sub3_Sub1(@OriginalArg(0) Class4_Sub3_Sub4 arg0) {
		this.aClass4_Sub3_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7720() {
		@Pc(9) Class4_Sub42 local9;
		do {
			local9 = (Class4_Sub42) this.aClass163_3.method3640();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub3_Sub3_4 == null);
		return local9.aClass4_Sub3_Sub3_4;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([IZLclient!qm;III)V")
	private void method223(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class4_Sub42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub3_Sub4_1.anIntArray525[arg1.anInt7740] & 0x4) != 0 && arg1.anInt7734 < 0) {
			@Pc(36) int local36 = this.aClass4_Sub3_Sub4_1.anIntArray522[arg1.anInt7740] / Static434.anInt6851;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg1.anInt7733) / local36;
				if (local46 > arg4) {
					arg1.anInt7733 += local36 * arg4;
					break;
				}
				arg1.aClass4_Sub3_Sub3_4.method7718(arg0, arg2, local46);
				arg4 -= local46;
				arg2 += local46;
				arg1.anInt7733 += local46 * local36 - 1048576;
				@Pc(77) int local77 = Static434.anInt6851 / 100;
				@Pc(81) int local81 = 262144 / local36;
				if (local77 > local81) {
					local77 = local81;
				}
				@Pc(89) Class4_Sub3_Sub3 local89 = arg1.aClass4_Sub3_Sub3_4;
				if (this.aClass4_Sub3_Sub4_1.anIntArray533[arg1.anInt7740] == 0) {
					arg1.aClass4_Sub3_Sub3_4 = Static683.method5994(arg1.aClass4_Sub4_Sub1_4, local89.method5992(), local89.method6000(), local89.method6001());
				} else {
					arg1.aClass4_Sub3_Sub3_4 = Static683.method5994(arg1.aClass4_Sub4_Sub1_4, local89.method5992(), 0, local89.method6001());
					this.aClass4_Sub3_Sub4_1.method6777(arg1, arg1.aClass4_Sub49_1.aShortArray154[arg1.anInt7730] < 0);
					arg1.aClass4_Sub3_Sub3_4.method6002(local77, local89.method6000());
				}
				if (arg1.aClass4_Sub49_1.aShortArray154[arg1.anInt7730] < 0) {
					arg1.aClass4_Sub3_Sub3_4.method6015(-1);
				}
				local89.method6018(local77);
				local89.method7718(arg0, arg2, arg3 - arg2);
				if (local89.method6019()) {
					this.aClass4_Sub3_Sub5_1.method7724(local89);
				}
			}
		}
		arg1.aClass4_Sub3_Sub3_4.method7718(arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qm;IB)V")
	private void method224(@OriginalArg(0) Class4_Sub42 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass4_Sub3_Sub4_1.anIntArray525[arg0.anInt7740] & 0x4) != 0 && arg0.anInt7734 < 0) {
			@Pc(27) int local27 = this.aClass4_Sub3_Sub4_1.anIntArray522[arg0.anInt7740] / Static434.anInt6851;
			@Pc(37) int local37 = (local27 + 1048575 - arg0.anInt7733) / local27;
			arg0.anInt7733 = arg0.anInt7733 + arg1 * local27 & 0xFFFFF;
			if (local37 <= arg1) {
				if (this.aClass4_Sub3_Sub4_1.anIntArray533[arg0.anInt7740] == 0) {
					arg0.aClass4_Sub3_Sub3_4 = Static683.method5994(arg0.aClass4_Sub4_Sub1_4, arg0.aClass4_Sub3_Sub3_4.method5992(), arg0.aClass4_Sub3_Sub3_4.method6000(), arg0.aClass4_Sub3_Sub3_4.method6001());
				} else {
					arg0.aClass4_Sub3_Sub3_4 = Static683.method5994(arg0.aClass4_Sub4_Sub1_4, arg0.aClass4_Sub3_Sub3_4.method5992(), 0, arg0.aClass4_Sub3_Sub3_4.method6001());
					this.aClass4_Sub3_Sub4_1.method6777(arg0, arg0.aClass4_Sub49_1.aShortArray154[arg0.anInt7730] < 0);
				}
				if (arg0.aClass4_Sub49_1.aShortArray154[arg0.anInt7730] < 0) {
					arg0.aClass4_Sub3_Sub3_4.method6015(-1);
				}
				arg1 = arg0.anInt7733 / local27;
			}
		}
		arg0.aClass4_Sub3_Sub3_4.method7715(arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()I")
	@Override
	public int method7714() {
		return 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	@Override
	public void method7715(@OriginalArg(0) int arg0) {
		this.aClass4_Sub3_Sub5_1.method7715(arg0);
		for (@Pc(15) Class4_Sub42 local15 = (Class4_Sub42) this.aClass163_3.method3639(); local15 != null; local15 = (Class4_Sub42) this.aClass163_3.method3640()) {
			if (!this.aClass4_Sub3_Sub4_1.method6762(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt7726) {
						this.method224(local15, local25);
						local15.anInt7726 -= local25;
						break;
					}
					this.method224(local15, local15.anInt7726);
					local25 -= local15.anInt7726;
				} while (!this.aClass4_Sub3_Sub4_1.method6775(local25, 0, (int[]) null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "([III)V")
	@Override
	public void method7718(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub3_Sub5_1.method7718(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub42 local17 = (Class4_Sub42) this.aClass163_3.method3639(); local17 != null; local17 = (Class4_Sub42) this.aClass163_3.method3640()) {
			if (!this.aClass4_Sub3_Sub4_1.method6762(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt7726) {
						this.method223(arg0, local17, local29, local27 + local29, local27);
						local17.anInt7726 -= local27;
						break;
					}
					this.method223(arg0, local17, local29, local29 + local27, local17.anInt7726);
					local29 += local17.anInt7726;
					local27 -= local17.anInt7726;
				} while (!this.aClass4_Sub3_Sub4_1.method6775(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7719() {
		@Pc(9) Class4_Sub42 local9 = (Class4_Sub42) this.aClass163_3.method3639();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub3_Sub3_4 == null) {
			return this.method7720();
		} else {
			return local9.aClass4_Sub3_Sub3_4;
		}
	}
}
