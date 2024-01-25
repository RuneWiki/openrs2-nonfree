import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class2_Sub23_Sub4 extends Class2_Sub23 {

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "Lclient!cga;")
	public final Class60 aClass60_165 = new Class60();

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "Lclient!paa;")
	public final Class2_Sub23_Sub3 aClass2_Sub23_Sub3_2 = new Class2_Sub23_Sub3();

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "Lclient!rha;")
	private final Class2_Sub23_Sub5 aClass2_Sub23_Sub5_5;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!rha;)V")
	public Class2_Sub23_Sub4(@OriginalArg(0) Class2_Sub23_Sub5 arg0) {
		this.aClass2_Sub23_Sub5_5 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!kka;)V")
	private void method7345(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub37 arg1) {
		if ((this.aClass2_Sub23_Sub5_5.anIntArray618[arg1.anInt5152] & 0x4) != 0 && arg1.anInt5159 < 0) {
			@Pc(22) int local22 = this.aClass2_Sub23_Sub5_5.anIntArray621[arg1.anInt5152] / Static24.anInt294;
			@Pc(32) int local32 = (local22 + 1048575 - arg1.anInt5166) / local22;
			arg1.anInt5166 = local22 * arg0 + arg1.anInt5166 & 0xFFFFF;
			if (arg0 >= local32) {
				if (this.aClass2_Sub23_Sub5_5.anIntArray630[arg1.anInt5152] == 0) {
					arg1.aClass2_Sub23_Sub2_2 = Static733.method4506(arg1.aClass2_Sub4_Sub1_2, arg1.aClass2_Sub23_Sub2_2.method4490(), arg1.aClass2_Sub23_Sub2_2.method4489(), arg1.aClass2_Sub23_Sub2_2.method4505());
				} else {
					arg1.aClass2_Sub23_Sub2_2 = Static733.method4506(arg1.aClass2_Sub4_Sub1_2, arg1.aClass2_Sub23_Sub2_2.method4490(), 0, arg1.aClass2_Sub23_Sub2_2.method4505());
					this.aClass2_Sub23_Sub5_5.method7708(arg1, arg1.aClass2_Sub56_1.aShortArray147[arg1.anInt5149] < 0);
				}
				if (arg1.aClass2_Sub56_1.aShortArray147[arg1.anInt5149] < 0) {
					arg1.aClass2_Sub23_Sub2_2.method4498(-1);
				}
				arg0 = arg1.anInt5166 / local22;
			}
		}
		arg1.aClass2_Sub23_Sub2_2.method7671(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([IILclient!kka;IBI)V")
	private void method7346(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub37 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub23_Sub5_5.anIntArray618[arg2.anInt5152] & 0x4) != 0 && arg2.anInt5159 < 0) {
			@Pc(42) int local42 = this.aClass2_Sub23_Sub5_5.anIntArray621[arg2.anInt5152] / Static24.anInt294;
			while (true) {
				@Pc(53) int local53 = (local42 + 1048575 - arg2.anInt5166) / local42;
				if (arg3 < local53) {
					arg2.anInt5166 += arg3 * local42;
					break;
				}
				arg2.aClass2_Sub23_Sub2_2.method7675(arg0, arg1, local53);
				arg3 -= local53;
				arg1 += local53;
				arg2.anInt5166 += local53 * local42 - 1048576;
				@Pc(84) int local84 = Static24.anInt294 / 100;
				@Pc(88) int local88 = 262144 / local42;
				if (local88 < local84) {
					local84 = local88;
				}
				@Pc(100) Class2_Sub23_Sub2 local100 = arg2.aClass2_Sub23_Sub2_2;
				if (this.aClass2_Sub23_Sub5_5.anIntArray630[arg2.anInt5152] == 0) {
					arg2.aClass2_Sub23_Sub2_2 = Static733.method4506(arg2.aClass2_Sub4_Sub1_2, local100.method4490(), local100.method4489(), local100.method4505());
				} else {
					arg2.aClass2_Sub23_Sub2_2 = Static733.method4506(arg2.aClass2_Sub4_Sub1_2, local100.method4490(), 0, local100.method4505());
					this.aClass2_Sub23_Sub5_5.method7708(arg2, arg2.aClass2_Sub56_1.aShortArray147[arg2.anInt5149] < 0);
					arg2.aClass2_Sub23_Sub2_2.method4487(local84, local100.method4489());
				}
				if (arg2.aClass2_Sub56_1.aShortArray147[arg2.anInt5149] < 0) {
					arg2.aClass2_Sub23_Sub2_2.method4498(-1);
				}
				local100.method4517(local84);
				local100.method7675(arg0, arg1, arg4 - arg1);
				if (local100.method4511()) {
					this.aClass2_Sub23_Sub3_2.method6795(local100);
				}
			}
		}
		arg2.aClass2_Sub23_Sub2_2.method7675(arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([III)V")
	@Override
	public void method7675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub23_Sub3_2.method7675(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub37 local17 = (Class2_Sub37) this.aClass60_165.method1226(7); local17 != null; local17 = (Class2_Sub37) this.aClass60_165.method1228()) {
			if (!this.aClass2_Sub23_Sub5_5.method7680(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local29 <= local17.anInt5151) {
						this.method7346(arg0, local31, local17, local29, local31 + local29);
						local17.anInt5151 -= local29;
						break;
					}
					this.method7346(arg0, local31, local17, local17.anInt5151, local29 + local31);
					local29 -= local17.anInt5151;
					local31 += local17.anInt5151;
				} while (!this.aClass2_Sub23_Sub5_5.method7678(arg0, local17, local31, local29, 3));
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7677() {
		@Pc(11) Class2_Sub37 local11;
		do {
			local11 = (Class2_Sub37) this.aClass60_165.method1228();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass2_Sub23_Sub2_2 == null);
		return local11.aClass2_Sub23_Sub2_2;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7676() {
		@Pc(9) Class2_Sub37 local9 = (Class2_Sub37) this.aClass60_165.method1226(7);
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub23_Sub2_2 == null) {
			return this.method7677();
		} else {
			return local9.aClass2_Sub23_Sub2_2;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	@Override
	public void method7671(@OriginalArg(0) int arg0) {
		this.aClass2_Sub23_Sub3_2.method7671(arg0);
		for (@Pc(15) Class2_Sub37 local15 = (Class2_Sub37) this.aClass60_165.method1226(7); local15 != null; local15 = (Class2_Sub37) this.aClass60_165.method1228()) {
			if (!this.aClass2_Sub23_Sub5_5.method7680(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local27 <= local15.anInt5151) {
						this.method7345(local27, local15);
						local15.anInt5151 -= local27;
						break;
					}
					this.method7345(local15.anInt5151, local15);
					local27 -= local15.anInt5151;
				} while (!this.aClass2_Sub23_Sub5_5.method7678((int[]) null, local15, 0, local27, 3));
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "()I")
	@Override
	public int method7674() {
		return 0;
	}
}
