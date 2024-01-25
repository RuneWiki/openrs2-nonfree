import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class1_Sub7_Sub3 extends Class1_Sub7 {

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "Lclient!wba;")
	public final Class353 aClass353_15 = new Class353();

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "Lclient!bfa;")
	public final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_1 = new Class1_Sub7_Sub1();

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Lclient!bh;")
	private final Class1_Sub7_Sub2 aClass1_Sub7_Sub2_3;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!bh;)V")
	public Class1_Sub7_Sub3(@OriginalArg(0) Class1_Sub7_Sub2 arg0) {
		this.aClass1_Sub7_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)V")
	@Override
	public void method6132(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub7_Sub1_1.method6132(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub21 local17 = (Class1_Sub21) this.aClass353_15.method7677(); local17 != null; local17 = (Class1_Sub21) this.aClass353_15.method7687()) {
			if (!this.aClass1_Sub7_Sub2_3.method506(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt3175 >= local29) {
						this.method2517(arg0, local29 + local27, local17, local29, local27);
						local17.anInt3175 -= local29;
						break;
					}
					this.method2517(arg0, local29 + local27, local17, local17.anInt3175, local27);
					local29 -= local17.anInt3175;
					local27 += local17.anInt3175;
				} while (!this.aClass1_Sub7_Sub2_3.method511(local29, local17, local27, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "()Lclient!pda;")
	@Override
	public Class1_Sub7 method6136() {
		@Pc(9) Class1_Sub21 local9;
		do {
			local9 = (Class1_Sub21) this.aClass353_15.method7687();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub7_Sub4_2 == null);
		return local9.aClass1_Sub7_Sub4_2;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z[IILclient!hb;II)V")
	private void method2517(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub7_Sub2_3.anIntArray64[arg2.anInt3168] & 0x4) != 0 && arg2.anInt3181 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub7_Sub2_3.anIntArray72[arg2.anInt3168] / Class1_Sub30_Sub1.lb;
			while (true) {
				@Pc(36) int local36 = (local25 + 1048575 - arg2.anInt3174) / local25;
				if (arg3 < local36) {
					arg2.anInt3174 += local25 * arg3;
					break;
				}
				arg2.aClass1_Sub7_Sub4_2.method6132(arg0, arg4, local36);
				arg2.anInt3174 += local25 * local36 - 1048576;
				arg4 += local36;
				arg3 -= local36;
				@Pc(67) int local67 = Class1_Sub30_Sub1.lb / 100;
				@Pc(71) int local71 = 262144 / local25;
				if (local71 < local67) {
					local67 = local71;
				}
				@Pc(79) Class1_Sub7_Sub4 local79 = arg2.aClass1_Sub7_Sub4_2;
				if (this.aClass1_Sub7_Sub2_3.anIntArray69[arg2.anInt3168] == 0) {
					arg2.aClass1_Sub7_Sub4_2 = Static606.method6143(arg2.aClass1_Sub17_Sub1_2, local79.method6145(), local79.method6174(), local79.method6165());
				} else {
					arg2.aClass1_Sub7_Sub4_2 = Static606.method6143(arg2.aClass1_Sub17_Sub1_2, local79.method6145(), 0, local79.method6165());
					this.aClass1_Sub7_Sub2_3.method507(arg2, arg2.aClass1_Sub39_1.aShortArray110[arg2.anInt3177] < 0);
					arg2.aClass1_Sub7_Sub4_2.method6166(local67, local79.method6174());
				}
				if (arg2.aClass1_Sub39_1.aShortArray110[arg2.anInt3177] < 0) {
					arg2.aClass1_Sub7_Sub4_2.method6178(-1);
				}
				local79.method6142(local67);
				local79.method6132(arg0, arg4, arg1 - arg4);
				if (local79.method6175()) {
					this.aClass1_Sub7_Sub1_1.method470(local79);
				}
			}
		}
		arg2.aClass1_Sub7_Sub4_2.method6132(arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!hb;I)V")
	private void method2518(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub7_Sub2_3.anIntArray64[arg0.anInt3168] & 0x4) != 0 && arg0.anInt3181 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub7_Sub2_3.anIntArray72[arg0.anInt3168] / Class1_Sub30_Sub1.lb;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt3174) / local23;
			arg0.anInt3174 = local23 * arg1 + arg0.anInt3174 & 0xFFFFF;
			if (arg1 >= local33) {
				if (this.aClass1_Sub7_Sub2_3.anIntArray69[arg0.anInt3168] == 0) {
					arg0.aClass1_Sub7_Sub4_2 = Static606.method6143(arg0.aClass1_Sub17_Sub1_2, arg0.aClass1_Sub7_Sub4_2.method6145(), arg0.aClass1_Sub7_Sub4_2.method6174(), arg0.aClass1_Sub7_Sub4_2.method6165());
				} else {
					arg0.aClass1_Sub7_Sub4_2 = Static606.method6143(arg0.aClass1_Sub17_Sub1_2, arg0.aClass1_Sub7_Sub4_2.method6145(), 0, arg0.aClass1_Sub7_Sub4_2.method6165());
					this.aClass1_Sub7_Sub2_3.method507(arg0, arg0.aClass1_Sub39_1.aShortArray110[arg0.anInt3177] < 0);
				}
				if (arg0.aClass1_Sub39_1.aShortArray110[arg0.anInt3177] < 0) {
					arg0.aClass1_Sub7_Sub4_2.method6178(-1);
				}
				arg1 = arg0.anInt3174 / local23;
			}
		}
		arg0.aClass1_Sub7_Sub4_2.method6138(arg1);
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "()I")
	@Override
	public int method6135() {
		return 0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	@Override
	public void method6138(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_Sub1_1.method6138(arg0);
		for (@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) this.aClass353_15.method7677(); local15 != null; local15 = (Class1_Sub21) this.aClass353_15.method7687()) {
			if (!this.aClass1_Sub7_Sub2_3.method506(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3175 >= local25) {
						this.method2518(local15, local25);
						local15.anInt3175 -= local25;
						break;
					}
					this.method2518(local15, local15.anInt3175);
					local25 -= local15.anInt3175;
				} while (!this.aClass1_Sub7_Sub2_3.method511(local25, local15, 0, null));
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public Class1_Sub7 method6134() {
		@Pc(9) Class1_Sub21 local9 = (Class1_Sub21) this.aClass353_15.method7677();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub7_Sub4_2 == null) {
			return this.method6136();
		} else {
			return local9.aClass1_Sub7_Sub4_2;
		}
	}
}
