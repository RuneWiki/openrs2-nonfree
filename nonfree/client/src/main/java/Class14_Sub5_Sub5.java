import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class14_Sub5_Sub5 extends Class14_Sub5 {

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!ok;")
	public final Class262 aClass262_71 = new Class262();

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!nr;")
	public final Class14_Sub5_Sub3 aClass14_Sub5_Sub3_2 = new Class14_Sub5_Sub3();

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!jc;")
	private final Class14_Sub5_Sub2 aClass14_Sub5_Sub2_3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class14_Sub5_Sub5(@OriginalArg(0) Class14_Sub5_Sub2 arg0) {
		this.aClass14_Sub5_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method8688(@OriginalArg(0) int arg0) {
		this.aClass14_Sub5_Sub3_2.method8688(arg0);
		for (@Pc(15) Class14_Sub20 local15 = (Class14_Sub20) this.aClass262_71.method6318(); local15 != null; local15 = (Class14_Sub20) this.aClass262_71.method6311()) {
			if (!this.aClass14_Sub5_Sub2_3.method3890(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2800 >= local25) {
						this.method8697(local25, local15);
						local15.anInt2800 -= local25;
						break;
					}
					this.method8697(local15.anInt2800, local15);
					local25 -= local15.anInt2800;
				} while (!this.aClass14_Sub5_Sub2_3.method3874(0, local25, local15, (int[]) null));
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILclient!eu;I[I)V")
	private void method8694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14_Sub20 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass14_Sub5_Sub2_3.anIntArray363[arg3.anInt2798] & 0x4) != 0 && arg3.anInt2804 < 0) {
			@Pc(28) int local28 = this.aClass14_Sub5_Sub2_3.anIntArray372[arg3.anInt2798] / Static515.anInt9036;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg3.anInt2814) / local28;
				if (local38 > arg0) {
					arg3.anInt2814 += local28 * arg0;
					break;
				}
				arg3.aClass14_Sub5_Sub4_1.method8693(arg4, arg2, local38);
				arg0 -= local38;
				arg3.anInt2814 += local28 * local38 - 1048576;
				arg2 += local38;
				@Pc(69) int local69 = Static515.anInt9036 / 100;
				@Pc(73) int local73 = 262144 / local28;
				if (local69 > local73) {
					local69 = local73;
				}
				@Pc(85) Class14_Sub5_Sub4 local85 = arg3.aClass14_Sub5_Sub4_1;
				if (this.aClass14_Sub5_Sub2_3.anIntArray357[arg3.anInt2798] == 0) {
					arg3.aClass14_Sub5_Sub4_1 = Static684.method7205(arg3.aClass14_Sub14_Sub1_1, local85.method7208(), local85.method7218(), local85.method7186());
				} else {
					arg3.aClass14_Sub5_Sub4_1 = Static684.method7205(arg3.aClass14_Sub14_Sub1_1, local85.method7208(), 0, local85.method7186());
					this.aClass14_Sub5_Sub2_3.method3888(arg3.aClass14_Sub53_1.aShortArray158[arg3.anInt2796] < 0, arg3);
					arg3.aClass14_Sub5_Sub4_1.method7191(local69, local85.method7218());
				}
				if (arg3.aClass14_Sub53_1.aShortArray158[arg3.anInt2796] < 0) {
					arg3.aClass14_Sub5_Sub4_1.method7192(-1);
				}
				local85.method7188(local69);
				local85.method8693(arg4, arg2, arg1 - arg2);
				if (local85.method7207()) {
					this.aClass14_Sub5_Sub3_2.method6027(local85);
				}
			}
		}
		arg3.aClass14_Sub5_Sub4_1.method8693(arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
	@Override
	public int method8687() {
		return 0;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8692() {
		@Pc(9) Class14_Sub20 local9;
		do {
			local9 = (Class14_Sub20) this.aClass262_71.method6311();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass14_Sub5_Sub4_1 == null);
		return local9.aClass14_Sub5_Sub4_1;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "([III)V")
	@Override
	public void method8693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14_Sub5_Sub3_2.method8693(arg0, arg1, arg2);
		for (@Pc(17) Class14_Sub20 local17 = (Class14_Sub20) this.aClass262_71.method6318(); local17 != null; local17 = (Class14_Sub20) this.aClass262_71.method6311()) {
			if (!this.aClass14_Sub5_Sub2_3.method3890(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt2800 >= local27) {
						this.method8694(local27, local27 + local29, local29, local17, arg0);
						local17.anInt2800 -= local27;
						break;
					}
					this.method8694(local17.anInt2800, local27 + local29, local29, local17, arg0);
					local29 += local17.anInt2800;
					local27 -= local17.anInt2800;
				} while (!this.aClass14_Sub5_Sub2_3.method3874(local29, local27, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8691() {
		@Pc(9) Class14_Sub20 local9 = (Class14_Sub20) this.aClass262_71.method6318();
		if (local9 == null) {
			return null;
		} else if (local9.aClass14_Sub5_Sub4_1 == null) {
			return this.method8692();
		} else {
			return local9.aClass14_Sub5_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!eu;)V")
	private void method8697(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub20 arg1) {
		if ((this.aClass14_Sub5_Sub2_3.anIntArray363[arg1.anInt2798] & 0x4) != 0 && arg1.anInt2804 < 0) {
			@Pc(34) int local34 = this.aClass14_Sub5_Sub2_3.anIntArray372[arg1.anInt2798] / Static515.anInt9036;
			@Pc(44) int local44 = (local34 + 1048575 - arg1.anInt2814) / local34;
			arg1.anInt2814 = arg1.anInt2814 + local34 * arg0 & 0xFFFFF;
			if (local44 <= arg0) {
				if (this.aClass14_Sub5_Sub2_3.anIntArray357[arg1.anInt2798] == 0) {
					arg1.aClass14_Sub5_Sub4_1 = Static684.method7205(arg1.aClass14_Sub14_Sub1_1, arg1.aClass14_Sub5_Sub4_1.method7208(), arg1.aClass14_Sub5_Sub4_1.method7218(), arg1.aClass14_Sub5_Sub4_1.method7186());
				} else {
					arg1.aClass14_Sub5_Sub4_1 = Static684.method7205(arg1.aClass14_Sub14_Sub1_1, arg1.aClass14_Sub5_Sub4_1.method7208(), 0, arg1.aClass14_Sub5_Sub4_1.method7186());
					this.aClass14_Sub5_Sub2_3.method3888(arg1.aClass14_Sub53_1.aShortArray158[arg1.anInt2796] < 0, arg1);
				}
				if (arg1.aClass14_Sub53_1.aShortArray158[arg1.anInt2796] < 0) {
					arg1.aClass14_Sub5_Sub4_1.method7192(-1);
				}
				arg0 = arg1.anInt2814 / local34;
			}
		}
		arg1.aClass14_Sub5_Sub4_1.method8688(arg0);
	}
}
