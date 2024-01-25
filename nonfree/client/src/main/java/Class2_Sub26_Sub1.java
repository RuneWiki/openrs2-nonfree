import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class2_Sub26_Sub1 extends Class2_Sub26 {

	@OriginalMember(owner = "client!er", name = "A", descriptor = "Lclient!ow;")
	public final Class271 aClass271_10 = new Class271();

	@OriginalMember(owner = "client!er", name = "E", descriptor = "Lclient!pj;")
	public final Class2_Sub26_Sub4 aClass2_Sub26_Sub4_1 = new Class2_Sub26_Sub4();

	@OriginalMember(owner = "client!er", name = "D", descriptor = "Lclient!of;")
	private final Class2_Sub26_Sub3 aClass2_Sub26_Sub3_4;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class2_Sub26_Sub1(@OriginalArg(0) Class2_Sub26_Sub3 arg0) {
		this.aClass2_Sub26_Sub3_4 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB[ILclient!mn;I)V")
	private void method2521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class2_Sub40 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub26_Sub3_4.anIntArray387[arg3.anInt7186] & 0x4) != 0 && arg3.anInt7179 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub26_Sub3_4.anIntArray392[arg3.anInt7186] / Static237.anInt4718;
			while (true) {
				@Pc(44) int local44 = (local34 + 1048575 - arg3.anInt7184) / local34;
				if (arg1 < local44) {
					arg3.anInt7184 += arg1 * local34;
					break;
				}
				arg3.aClass2_Sub26_Sub5_4.method9760(arg2, arg4, local44);
				arg3.anInt7184 += local34 * local44 - 1048576;
				arg1 -= local44;
				arg4 += local44;
				@Pc(75) int local75 = Static237.anInt4718 / 100;
				@Pc(79) int local79 = 262144 / local34;
				if (local79 < local75) {
					local75 = local79;
				}
				@Pc(91) Class2_Sub26_Sub5 local91 = arg3.aClass2_Sub26_Sub5_4;
				if (this.aClass2_Sub26_Sub3_4.anIntArray379[arg3.anInt7186] == 0) {
					arg3.aClass2_Sub26_Sub5_4 = Static686.method9797(arg3.aClass2_Sub44_Sub1_4, local91.method9767(), local91.method9792(), local91.method9781());
				} else {
					arg3.aClass2_Sub26_Sub5_4 = Static686.method9797(arg3.aClass2_Sub44_Sub1_4, local91.method9767(), 0, local91.method9781());
					this.aClass2_Sub26_Sub3_4.method6984(arg3, arg3.aClass2_Sub36_1.aShortArray87[arg3.anInt7189] < 0);
					arg3.aClass2_Sub26_Sub5_4.method9787(local75, local91.method9792());
				}
				if (arg3.aClass2_Sub36_1.aShortArray87[arg3.anInt7189] < 0) {
					arg3.aClass2_Sub26_Sub5_4.method9763(-1);
				}
				local91.method9765(local75);
				local91.method9760(arg2, arg4, arg0 - arg4);
				if (local91.method9786()) {
					this.aClass2_Sub26_Sub4_1.method7391(local91);
				}
			}
		}
		arg3.aClass2_Sub26_Sub5_4.method9760(arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public void method9759(@OriginalArg(0) int arg0) {
		this.aClass2_Sub26_Sub4_1.method9759(arg0);
		for (@Pc(15) Class2_Sub40 local15 = (Class2_Sub40) this.aClass271_10.method7177(); local15 != null; local15 = (Class2_Sub40) this.aClass271_10.method7175()) {
			if (!this.aClass2_Sub26_Sub3_4.method7002(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt7181 >= local25) {
						this.method2523(local15, local25);
						local15.anInt7181 -= local25;
						break;
					}
					this.method2523(local15, local15.anInt7181);
					local25 -= local15.anInt7181;
				} while (!this.aClass2_Sub26_Sub3_4.method7011(local15, local25, (int[]) null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9761() {
		@Pc(9) Class2_Sub40 local9 = (Class2_Sub40) this.aClass271_10.method7177();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub26_Sub5_4 == null) {
			return this.method9758();
		} else {
			return local9.aClass2_Sub26_Sub5_4;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
	@Override
	public int method9756() {
		return 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!mn;I)V")
	private void method2523(@OriginalArg(1) Class2_Sub40 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub26_Sub3_4.anIntArray387[arg0.anInt7186] & 0x4) != 0 && arg0.anInt7179 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub26_Sub3_4.anIntArray392[arg0.anInt7186] / Static237.anInt4718;
			@Pc(44) int local44 = (local34 + 1048575 - arg0.anInt7184) / local34;
			arg0.anInt7184 = arg1 * local34 + arg0.anInt7184 & 0xFFFFF;
			if (local44 <= arg1) {
				if (this.aClass2_Sub26_Sub3_4.anIntArray379[arg0.anInt7186] == 0) {
					arg0.aClass2_Sub26_Sub5_4 = Static686.method9797(arg0.aClass2_Sub44_Sub1_4, arg0.aClass2_Sub26_Sub5_4.method9767(), arg0.aClass2_Sub26_Sub5_4.method9792(), arg0.aClass2_Sub26_Sub5_4.method9781());
				} else {
					arg0.aClass2_Sub26_Sub5_4 = Static686.method9797(arg0.aClass2_Sub44_Sub1_4, arg0.aClass2_Sub26_Sub5_4.method9767(), 0, arg0.aClass2_Sub26_Sub5_4.method9781());
					this.aClass2_Sub26_Sub3_4.method6984(arg0, arg0.aClass2_Sub36_1.aShortArray87[arg0.anInt7189] < 0);
				}
				if (arg0.aClass2_Sub36_1.aShortArray87[arg0.anInt7189] < 0) {
					arg0.aClass2_Sub26_Sub5_4.method9763(-1);
				}
				arg1 = arg0.anInt7184 / local34;
			}
		}
		arg0.aClass2_Sub26_Sub5_4.method9759(arg1);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9758() {
		@Pc(9) Class2_Sub40 local9;
		do {
			local9 = (Class2_Sub40) this.aClass271_10.method7175();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub26_Sub5_4 == null);
		return local9.aClass2_Sub26_Sub5_4;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "([III)V")
	@Override
	public void method9760(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub26_Sub4_1.method9760(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub40 local17 = (Class2_Sub40) this.aClass271_10.method7177(); local17 != null; local17 = (Class2_Sub40) this.aClass271_10.method7175()) {
			if (!this.aClass2_Sub26_Sub3_4.method7002(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt7181 >= local29) {
						this.method2521(local27 + local29, local29, arg0, local17, local27);
						local17.anInt7181 -= local29;
						break;
					}
					this.method2521(local27 + local29, local17.anInt7181, arg0, local17, local27);
					local27 += local17.anInt7181;
					local29 -= local17.anInt7181;
				} while (!this.aClass2_Sub26_Sub3_4.method7011(local17, local29, arg0, local27));
			}
		}
	}
}
