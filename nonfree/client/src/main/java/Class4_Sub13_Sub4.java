import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class4_Sub13_Sub4 extends Class4_Sub13 {

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "Lclient!gj;")
	public final Class124 aClass124_47 = new Class124();

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "Lclient!ds;")
	public final Class4_Sub13_Sub1 aClass4_Sub13_Sub1_2 = new Class4_Sub13_Sub1();

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Lclient!nb;")
	private final Class4_Sub13_Sub3 aClass4_Sub13_Sub3_3;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class4_Sub13_Sub4(@OriginalArg(0) Class4_Sub13_Sub3 arg0) {
		this.aClass4_Sub13_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	@Override
	public void method6215(@OriginalArg(0) int arg0) {
		this.aClass4_Sub13_Sub1_2.method6215(arg0);
		for (@Pc(15) Class4_Sub10 local15 = (Class4_Sub10) this.aClass124_47.method3267(); local15 != null; local15 = (Class4_Sub10) this.aClass124_47.method3273()) {
			if (!this.aClass4_Sub13_Sub3_3.method5130(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1191) {
						this.method6224(local15, local25);
						local15.anInt1191 -= local25;
						break;
					}
					this.method6224(local15, local15.anInt1191);
					local25 -= local15.anInt1191;
				} while (!this.aClass4_Sub13_Sub3_3.method5137(local15, null, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "()Lclient!sda;")
	@Override
	public Class4_Sub13 method6220() {
		@Pc(9) Class4_Sub10 local9 = (Class4_Sub10) this.aClass124_47.method3267();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub13_Sub2_2 == null) {
			return this.method6216();
		} else {
			return local9.aClass4_Sub13_Sub2_2;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "([III)V")
	@Override
	public void method6221(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub13_Sub1_2.method6221(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub10 local17 = (Class4_Sub10) this.aClass124_47.method3267(); local17 != null; local17 = (Class4_Sub10) this.aClass124_47.method3273()) {
			if (!this.aClass4_Sub13_Sub3_3.method5130(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1191) {
						this.method6223(local29 + local27, arg0, local27, local29, local17);
						local17.anInt1191 -= local29;
						break;
					}
					this.method6223(local27 + local29, arg0, local27, local17.anInt1191, local17);
					local27 += local17.anInt1191;
					local29 -= local17.anInt1191;
				} while (!this.aClass4_Sub13_Sub3_3.method5137(local17, arg0, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I[IIIZLclient!cfa;)V")
	private void method6223(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub10 arg4) {
		if ((this.aClass4_Sub13_Sub3_3.anIntArray493[arg4.anInt1188] & 0x4) != 0 && arg4.anInt1197 < 0) {
			@Pc(26) int local26 = this.aClass4_Sub13_Sub3_3.anIntArray497[arg4.anInt1188] / Static379.anInt7010;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg4.anInt1185) / local26;
				if (local36 > arg3) {
					arg4.anInt1185 += local26 * arg3;
					break;
				}
				arg4.aClass4_Sub13_Sub2_2.method6221(arg1, arg2, local36);
				arg3 -= local36;
				arg4.anInt1185 += local36 * local26 - 1048576;
				arg2 += local36;
				@Pc(71) int local71 = Static379.anInt7010 / 100;
				@Pc(75) int local75 = 262144 / local26;
				if (local75 < local71) {
					local71 = local75;
				}
				@Pc(87) Class4_Sub13_Sub2 local87 = arg4.aClass4_Sub13_Sub2_2;
				if (this.aClass4_Sub13_Sub3_3.anIntArray498[arg4.anInt1188] == 0) {
					arg4.aClass4_Sub13_Sub2_2 = Static604.method3921(arg4.aClass4_Sub16_Sub1_2, local87.method3935(), local87.method3929(), local87.method3925());
				} else {
					arg4.aClass4_Sub13_Sub2_2 = Static604.method3921(arg4.aClass4_Sub16_Sub1_2, local87.method3935(), 0, local87.method3925());
					this.aClass4_Sub13_Sub3_3.method5135(arg4, arg4.aClass4_Sub14_1.aShortArray54[arg4.anInt1201] < 0);
					arg4.aClass4_Sub13_Sub2_2.method3928(local71, local87.method3929());
				}
				if (arg4.aClass4_Sub14_1.aShortArray54[arg4.anInt1201] < 0) {
					arg4.aClass4_Sub13_Sub2_2.method3914(-1);
				}
				local87.method3911(local71);
				local87.method6221(arg1, arg2, arg0 - arg2);
				if (local87.method3909()) {
					this.aClass4_Sub13_Sub1_2.method2272(local87);
				}
			}
		}
		arg4.aClass4_Sub13_Sub2_2.method6221(arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!cfa;ZI)V")
	private void method6224(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass4_Sub13_Sub3_3.anIntArray493[arg0.anInt1188] & 0x4) != 0 && arg0.anInt1197 < 0) {
			@Pc(27) int local27 = this.aClass4_Sub13_Sub3_3.anIntArray497[arg0.anInt1188] / Static379.anInt7010;
			@Pc(37) int local37 = (local27 + 1048575 - arg0.anInt1185) / local27;
			arg0.anInt1185 = arg1 * local27 + arg0.anInt1185 & 0xFFFFF;
			if (arg1 >= local37) {
				if (this.aClass4_Sub13_Sub3_3.anIntArray498[arg0.anInt1188] == 0) {
					arg0.aClass4_Sub13_Sub2_2 = Static604.method3921(arg0.aClass4_Sub16_Sub1_2, arg0.aClass4_Sub13_Sub2_2.method3935(), arg0.aClass4_Sub13_Sub2_2.method3929(), arg0.aClass4_Sub13_Sub2_2.method3925());
				} else {
					arg0.aClass4_Sub13_Sub2_2 = Static604.method3921(arg0.aClass4_Sub16_Sub1_2, arg0.aClass4_Sub13_Sub2_2.method3935(), 0, arg0.aClass4_Sub13_Sub2_2.method3925());
					this.aClass4_Sub13_Sub3_3.method5135(arg0, arg0.aClass4_Sub14_1.aShortArray54[arg0.anInt1201] < 0);
				}
				if (arg0.aClass4_Sub14_1.aShortArray54[arg0.anInt1201] < 0) {
					arg0.aClass4_Sub13_Sub2_2.method3914(-1);
				}
				arg1 = arg0.anInt1185 / local27;
			}
		}
		arg0.aClass4_Sub13_Sub2_2.method6215(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()Lclient!sda;")
	@Override
	public Class4_Sub13 method6216() {
		@Pc(9) Class4_Sub10 local9;
		do {
			local9 = (Class4_Sub10) this.aClass124_47.method3273();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub13_Sub2_2 == null);
		return local9.aClass4_Sub13_Sub2_2;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "()I")
	@Override
	public int method6217() {
		return 0;
	}
}
