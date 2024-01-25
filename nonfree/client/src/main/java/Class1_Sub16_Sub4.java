import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class1_Sub16_Sub4 extends Class1_Sub16 {

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Lclient!bv;")
	public final Class37 aClass37_73 = new Class37();

	@OriginalMember(owner = "client!pt", name = "B", descriptor = "Lclient!fea;")
	public final Class1_Sub16_Sub1 aClass1_Sub16_Sub1_1 = new Class1_Sub16_Sub1();

	@OriginalMember(owner = "client!pt", name = "A", descriptor = "Lclient!om;")
	private final Class1_Sub16_Sub3 aClass1_Sub16_Sub3_2;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!om;)V")
	public Class1_Sub16_Sub4(@OriginalArg(0) Class1_Sub16_Sub3 arg0) {
		this.aClass1_Sub16_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "([III)V")
	@Override
	public void method5753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub16_Sub1_1.method5753(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub49 local17 = (Class1_Sub49) this.aClass37_73.method977(); local17 != null; local17 = (Class1_Sub49) this.aClass37_73.method971()) {
			if (!this.aClass1_Sub16_Sub3_2.method5277(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt8578 >= local27) {
						this.method5756(local29, local17, local29 + local27, arg0, local27);
						local17.anInt8578 -= local27;
						break;
					}
					this.method5756(local29, local17, local27 + local29, arg0, local17.anInt8578);
					local29 += local17.anInt8578;
					local27 -= local17.anInt8578;
				} while (!this.aClass1_Sub16_Sub3_2.method5249(arg0, local17, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "()I")
	@Override
	public int method5749() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!vd;Z)V")
	private void method5755(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub49 arg1) {
		if ((this.aClass1_Sub16_Sub3_2.anIntArray633[arg1.anInt8589] & 0x4) != 0 && arg1.anInt8580 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub16_Sub3_2.anIntArray629[arg1.anInt8589] / Static477.anInt7971;
			@Pc(34) int local34 = (local23 + 1048575 - arg1.anInt8591) / local23;
			arg1.anInt8591 = local23 * arg0 + arg1.anInt8591 & 0xFFFFF;
			if (arg0 >= local34) {
				if (this.aClass1_Sub16_Sub3_2.anIntArray622[arg1.anInt8589] == 0) {
					arg1.aClass1_Sub16_Sub2_4 = Static555.method4082(arg1.aClass1_Sub37_Sub1_2, arg1.aClass1_Sub16_Sub2_4.method4097(), arg1.aClass1_Sub16_Sub2_4.method4103(), arg1.aClass1_Sub16_Sub2_4.method4102());
				} else {
					arg1.aClass1_Sub16_Sub2_4 = Static555.method4082(arg1.aClass1_Sub37_Sub1_2, arg1.aClass1_Sub16_Sub2_4.method4097(), 0, arg1.aClass1_Sub16_Sub2_4.method4102());
					this.aClass1_Sub16_Sub3_2.method5250(arg1, arg1.aClass1_Sub31_1.aShortArray105[arg1.anInt8585] < 0);
				}
				if (arg1.aClass1_Sub31_1.aShortArray105[arg1.anInt8585] < 0) {
					arg1.aClass1_Sub16_Sub2_4.method4083(-1);
				}
				arg0 = arg1.anInt8591 / local23;
			}
		}
		arg1.aClass1_Sub16_Sub2_4.method5754(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "()Lclient!gv;")
	@Override
	public Class1_Sub16 method5748() {
		@Pc(9) Class1_Sub49 local9 = (Class1_Sub49) this.aClass37_73.method977();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub16_Sub2_4 == null) {
			return this.method5752();
		} else {
			return local9.aClass1_Sub16_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "()Lclient!gv;")
	@Override
	public Class1_Sub16 method5752() {
		@Pc(9) Class1_Sub49 local9;
		do {
			local9 = (Class1_Sub49) this.aClass37_73.method971();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub16_Sub2_4 == null);
		return local9.aClass1_Sub16_Sub2_4;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	@Override
	public void method5754(@OriginalArg(0) int arg0) {
		this.aClass1_Sub16_Sub1_1.method5754(arg0);
		for (@Pc(15) Class1_Sub49 local15 = (Class1_Sub49) this.aClass37_73.method977(); local15 != null; local15 = (Class1_Sub49) this.aClass37_73.method971()) {
			if (!this.aClass1_Sub16_Sub3_2.method5277(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt8578) {
						this.method5755(local25, local15);
						local15.anInt8578 -= local25;
						break;
					}
					this.method5755(local15.anInt8578, local15);
					local25 -= local15.anInt8578;
				} while (!this.aClass1_Sub16_Sub3_2.method5249(null, local15, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!vd;BI[II)V")
	private void method5756(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub49 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub16_Sub3_2.anIntArray633[arg1.anInt8589] & 0x4) != 0 && arg1.anInt8580 < 0) {
			@Pc(28) int local28 = this.aClass1_Sub16_Sub3_2.anIntArray629[arg1.anInt8589] / Static477.anInt7971;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg1.anInt8591) / local28;
				if (arg4 < local38) {
					arg1.anInt8591 += arg4 * local28;
					break;
				}
				arg1.aClass1_Sub16_Sub2_4.method5753(arg3, arg0, local38);
				arg1.anInt8591 += local38 * local28 - 1048576;
				arg0 += local38;
				arg4 -= local38;
				@Pc(69) int local69 = Static477.anInt7971 / 100;
				@Pc(73) int local73 = 262144 / local28;
				if (local73 < local69) {
					local69 = local73;
				}
				@Pc(81) Class1_Sub16_Sub2 local81 = arg1.aClass1_Sub16_Sub2_4;
				if (this.aClass1_Sub16_Sub3_2.anIntArray622[arg1.anInt8589] == 0) {
					arg1.aClass1_Sub16_Sub2_4 = Static555.method4082(arg1.aClass1_Sub37_Sub1_2, local81.method4097(), local81.method4103(), local81.method4102());
				} else {
					arg1.aClass1_Sub16_Sub2_4 = Static555.method4082(arg1.aClass1_Sub37_Sub1_2, local81.method4097(), 0, local81.method4102());
					this.aClass1_Sub16_Sub3_2.method5250(arg1, arg1.aClass1_Sub31_1.aShortArray105[arg1.anInt8585] < 0);
					arg1.aClass1_Sub16_Sub2_4.method4110(local69, local81.method4103());
				}
				if (arg1.aClass1_Sub31_1.aShortArray105[arg1.anInt8585] < 0) {
					arg1.aClass1_Sub16_Sub2_4.method4083(-1);
				}
				local81.method4118(local69);
				local81.method5753(arg3, arg0, arg2 - arg0);
				if (local81.method4115()) {
					this.aClass1_Sub16_Sub1_1.method2236(local81);
				}
			}
		}
		arg1.aClass1_Sub16_Sub2_4.method5753(arg3, arg0, arg4);
	}
}
