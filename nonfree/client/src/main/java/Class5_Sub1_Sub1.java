import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "Lclient!tg;")
	public final Class330 aClass330_15 = new Class330();

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "Lclient!mda;")
	public final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_2 = new Class5_Sub1_Sub2();

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "Lclient!ul;")
	private final Class5_Sub1_Sub5 aClass5_Sub1_Sub5_1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!ul;)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class5_Sub1_Sub5 arg0) {
		this.aClass5_Sub1_Sub5_1 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB[ILclient!gfa;I)V")
	private void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class5_Sub23 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub1_Sub5_1.anIntArray544[arg3.anInt3137] & 0x4) != 0 && arg3.anInt3135 < 0) {
			@Pc(25) int local25 = this.aClass5_Sub1_Sub5_1.anIntArray539[arg3.anInt3137] / Static491.anInt8290;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg3.anInt3131) / local25;
				if (local35 > arg1) {
					arg3.anInt3131 += local25 * arg1;
					break;
				}
				arg3.aClass5_Sub1_Sub4_3.method8283(arg2, arg0, local35);
				arg3.anInt3131 += local35 * local25 - 1048576;
				arg1 -= local35;
				arg0 += local35;
				@Pc(70) int local70 = Static491.anInt8290 / 100;
				@Pc(74) int local74 = 262144 / local25;
				if (local74 < local70) {
					local70 = local74;
				}
				@Pc(82) Class5_Sub1_Sub4 local82 = arg3.aClass5_Sub1_Sub4_3;
				if (this.aClass5_Sub1_Sub5_1.anIntArray535[arg3.anInt3137] == 0) {
					arg3.aClass5_Sub1_Sub4_3 = Static654.method7784(arg3.aClass5_Sub37_Sub1_3, local82.method7774(), local82.method7776(), local82.method7791());
				} else {
					arg3.aClass5_Sub1_Sub4_3 = Static654.method7784(arg3.aClass5_Sub37_Sub1_3, local82.method7774(), 0, local82.method7791());
					this.aClass5_Sub1_Sub5_1.method8293(arg3, arg3.aClass5_Sub10_1.aShortArray28[arg3.anInt3139] < 0);
					arg3.aClass5_Sub1_Sub4_3.method7780(local70, local82.method7776());
				}
				if (arg3.aClass5_Sub10_1.aShortArray28[arg3.anInt3139] < 0) {
					arg3.aClass5_Sub1_Sub4_3.method7765(-1);
				}
				local82.method7760(local70);
				local82.method8283(arg2, arg0, arg4 - arg0);
				if (local82.method7768()) {
					this.aClass5_Sub1_Sub2_2.method5055(local82);
				}
			}
		}
		arg3.aClass5_Sub1_Sub4_3.method8283(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8285() {
		@Pc(9) Class5_Sub23 local9;
		do {
			local9 = (Class5_Sub23) this.aClass330_15.method7914();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub1_Sub4_3 == null);
		return local9.aClass5_Sub1_Sub4_3;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8282() {
		@Pc(9) Class5_Sub23 local9 = (Class5_Sub23) this.aClass330_15.method7908();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub1_Sub4_3 == null) {
			return this.method8285();
		} else {
			return local9.aClass5_Sub1_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()I")
	@Override
	public int method8284() {
		return 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
	@Override
	public void method8283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub1_Sub2_2.method8283(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub23 local17 = (Class5_Sub23) this.aClass330_15.method7908(); local17 != null; local17 = (Class5_Sub23) this.aClass330_15.method7914()) {
			if (!this.aClass5_Sub1_Sub5_1.method8324(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3144 >= local27) {
						this.method2816(local29, local27, arg0, local17, local29 + local27);
						local17.anInt3144 -= local27;
						break;
					}
					this.method2816(local29, local17.anInt3144, arg0, local17, local27 + local29);
					local27 -= local17.anInt3144;
					local29 += local17.anInt3144;
				} while (!this.aClass5_Sub1_Sub5_1.method8315(local29, local27, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	@Override
	public void method8287(@OriginalArg(0) int arg0) {
		this.aClass5_Sub1_Sub2_2.method8287(arg0);
		for (@Pc(15) Class5_Sub23 local15 = (Class5_Sub23) this.aClass330_15.method7908(); local15 != null; local15 = (Class5_Sub23) this.aClass330_15.method7914()) {
			if (!this.aClass5_Sub1_Sub5_1.method8324(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3144 >= local25) {
						this.method2818(local15, local25);
						local15.anInt3144 -= local25;
						break;
					}
					this.method2818(local15, local15.anInt3144);
					local25 -= local15.anInt3144;
				} while (!this.aClass5_Sub1_Sub5_1.method8315(0, local25, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!gfa;I)V")
	private void method2818(@OriginalArg(1) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass5_Sub1_Sub5_1.anIntArray544[arg0.anInt3137] & 0x4) != 0 && arg0.anInt3135 < 0) {
			@Pc(24) int local24 = this.aClass5_Sub1_Sub5_1.anIntArray539[arg0.anInt3137] / Static491.anInt8290;
			@Pc(33) int local33 = (local24 + 1048575 - arg0.anInt3131) / local24;
			arg0.anInt3131 = local24 * arg1 + arg0.anInt3131 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass5_Sub1_Sub5_1.anIntArray535[arg0.anInt3137] == 0) {
					arg0.aClass5_Sub1_Sub4_3 = Static654.method7784(arg0.aClass5_Sub37_Sub1_3, arg0.aClass5_Sub1_Sub4_3.method7774(), arg0.aClass5_Sub1_Sub4_3.method7776(), arg0.aClass5_Sub1_Sub4_3.method7791());
				} else {
					arg0.aClass5_Sub1_Sub4_3 = Static654.method7784(arg0.aClass5_Sub37_Sub1_3, arg0.aClass5_Sub1_Sub4_3.method7774(), 0, arg0.aClass5_Sub1_Sub4_3.method7791());
					this.aClass5_Sub1_Sub5_1.method8293(arg0, arg0.aClass5_Sub10_1.aShortArray28[arg0.anInt3139] < 0);
				}
				if (arg0.aClass5_Sub10_1.aShortArray28[arg0.anInt3139] < 0) {
					arg0.aClass5_Sub1_Sub4_3.method7765(-1);
				}
				arg1 = arg0.anInt3131 / local24;
			}
		}
		arg0.aClass5_Sub1_Sub4_3.method8287(arg1);
	}
}
