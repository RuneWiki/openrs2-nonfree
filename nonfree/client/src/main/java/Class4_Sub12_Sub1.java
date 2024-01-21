import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "Lclient!vf;")
	public final Class78 aClass78_4 = new Class78();

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!ta;")
	public final Class4_Sub12_Sub4 aClass4_Sub12_Sub4_2 = new Class4_Sub12_Sub4();

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Lclient!ke;")
	private final Class4_Sub12_Sub2 aClass4_Sub12_Sub2_3;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ke;)V")
	public Class4_Sub12_Sub1(@OriginalArg(0) Class4_Sub12_Sub2 arg0) {
		this.aClass4_Sub12_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	@Override
	public void method1693(@OriginalArg(0) int arg0) {
		this.aClass4_Sub12_Sub4_2.method1693(arg0);
		for (@Pc(15) Class4_Sub23 local15 = (Class4_Sub23) this.aClass78_4.method1916(); local15 != null; local15 = (Class4_Sub23) this.aClass78_4.method1920()) {
			if (!this.aClass4_Sub12_Sub2_3.method1070(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2710 >= local25) {
						this.method769(local25, local15);
						local15.anInt2710 -= local25;
						break;
					}
					this.method769(local15.anInt2710, local15);
					local25 -= local15.anInt2710;
				} while (!this.aClass4_Sub12_Sub2_3.method1085(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lclient!ld;")
	@Override
	public Class4_Sub12 method1696() {
		@Pc(5) Class4_Sub23 local5 = (Class4_Sub23) this.aClass78_4.method1916();
		if (local5 == null) {
			return null;
		} else if (local5.aClass4_Sub12_Sub3_3 == null) {
			return this.method1694();
		} else {
			return local5.aClass4_Sub12_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()I")
	@Override
	public int method1691() {
		return 0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V")
	@Override
	public void method1697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub12_Sub4_2.method1697(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub23 local17 = (Class4_Sub23) this.aClass78_4.method1916(); local17 != null; local17 = (Class4_Sub23) this.aClass78_4.method1920()) {
			if (!this.aClass4_Sub12_Sub2_3.method1070(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt2710) {
						this.method767(local27, local29 + local27, local17, arg0, local29);
						local17.anInt2710 -= local27;
						break;
					}
					this.method767(local17.anInt2710, local29 + local27, local17, arg0, local29);
					local27 -= local17.anInt2710;
					local29 += local17.anInt2710;
				} while (!this.aClass4_Sub12_Sub2_3.method1085(local17, local29, local27, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILclient!va;[II)V")
	private void method767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub23 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub12_Sub2_3.anIntArray219[arg2.anInt2695] & 0x4) != 0 && arg2.anInt2707 < 0) {
			@Pc(33) int local33 = this.aClass4_Sub12_Sub2_3.anIntArray206[arg2.anInt2695] / Static106.anInt2355;
			while (true) {
				@Pc(44) int local44 = (local33 + 1048575 - arg2.anInt2706) / local33;
				if (arg0 < local44) {
					arg2.anInt2706 += arg0 * local33;
					break;
				}
				arg0 -= local44;
				arg2.aClass4_Sub12_Sub3_3.method1697(arg3, arg4, local44);
				arg2.anInt2706 += local44 * local33 - 1048576;
				@Pc(75) int local75 = 262144 / local33;
				@Pc(79) int local79 = Static106.anInt2355 / 100;
				arg4 += local44;
				@Pc(86) Class4_Sub12_Sub3 local86 = arg2.aClass4_Sub12_Sub3_3;
				if (local79 > local75) {
					local79 = local75;
				}
				if (this.aClass4_Sub12_Sub2_3.anIntArray207[arg2.anInt2695] == 0) {
					arg2.aClass4_Sub12_Sub3_3 = Static139.method1207(arg2.aClass4_Sub6_Sub1_1, local86.method1209(), local86.method1196(), local86.method1213());
				} else {
					arg2.aClass4_Sub12_Sub3_3 = Static139.method1207(arg2.aClass4_Sub6_Sub1_1, local86.method1209(), 0, local86.method1213());
					this.aClass4_Sub12_Sub2_3.method1060(arg2.aClass4_Sub24_1.aShortArray39[arg2.anInt2702] < 0, arg2);
					arg2.aClass4_Sub12_Sub3_3.method1193(local79, local86.method1196());
				}
				if (arg2.aClass4_Sub24_1.aShortArray39[arg2.anInt2702] < 0) {
					arg2.aClass4_Sub12_Sub3_3.method1197(-1);
				}
				local86.method1198(local79);
				local86.method1697(arg3, arg4, arg1 - arg4);
				if (local86.method1211()) {
					this.aClass4_Sub12_Sub4_2.method1700(local86);
				}
			}
		}
		arg2.aClass4_Sub12_Sub3_3.method1697(arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()Lclient!ld;")
	@Override
	public Class4_Sub12 method1694() {
		@Pc(9) Class4_Sub23 local9;
		do {
			local9 = (Class4_Sub23) this.aClass78_4.method1920();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub12_Sub3_3 == null);
		return local9.aClass4_Sub12_Sub3_3;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!va;)V")
	private void method769(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub23 arg1) {
		if ((this.aClass4_Sub12_Sub2_3.anIntArray219[arg1.anInt2695] & 0x4) != 0 && arg1.anInt2707 < 0) {
			@Pc(34) int local34 = this.aClass4_Sub12_Sub2_3.anIntArray206[arg1.anInt2695] / Static106.anInt2355;
			@Pc(44) int local44 = (local34 + 1048575 - arg1.anInt2706) / local34;
			arg1.anInt2706 = local34 * arg0 + arg1.anInt2706 & 0xFFFFF;
			if (local44 <= arg0) {
				if (this.aClass4_Sub12_Sub2_3.anIntArray207[arg1.anInt2695] == 0) {
					arg1.aClass4_Sub12_Sub3_3 = Static139.method1207(arg1.aClass4_Sub6_Sub1_1, arg1.aClass4_Sub12_Sub3_3.method1209(), arg1.aClass4_Sub12_Sub3_3.method1196(), arg1.aClass4_Sub12_Sub3_3.method1213());
				} else {
					arg1.aClass4_Sub12_Sub3_3 = Static139.method1207(arg1.aClass4_Sub6_Sub1_1, arg1.aClass4_Sub12_Sub3_3.method1209(), 0, arg1.aClass4_Sub12_Sub3_3.method1213());
					this.aClass4_Sub12_Sub2_3.method1060(arg1.aClass4_Sub24_1.aShortArray39[arg1.anInt2702] < 0, arg1);
				}
				if (arg1.aClass4_Sub24_1.aShortArray39[arg1.anInt2702] < 0) {
					arg1.aClass4_Sub12_Sub3_3.method1197(-1);
				}
				arg0 = arg1.anInt2706 / local34;
			}
		}
		arg1.aClass4_Sub12_Sub3_3.method1693(arg0);
	}
}
