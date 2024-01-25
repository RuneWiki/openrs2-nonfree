import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class5_Sub16_Sub2 extends Class5_Sub16 {

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "Lclient!jm;")
	public final Class103 aClass103_59 = new Class103();

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "Lclient!vf;")
	public final Class5_Sub16_Sub4 aClass5_Sub16_Sub4_2 = new Class5_Sub16_Sub4();

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!fl;")
	private final Class5_Sub16_Sub1 aClass5_Sub16_Sub1_1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!fl;)V")
	public Class5_Sub16_Sub2(@OriginalArg(0) Class5_Sub16_Sub1 arg0) {
		this.aClass5_Sub16_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[ILclient!il;)V")
	private void method2042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class5_Sub21 arg4) {
		if ((this.aClass5_Sub16_Sub1_1.anIntArray158[arg4.anInt2644] & 0x4) != 0 && arg4.anInt2647 < 0) {
			@Pc(35) int local35 = this.aClass5_Sub16_Sub1_1.anIntArray150[arg4.anInt2644] / Static226.anInt4449;
			while (true) {
				@Pc(45) int local45 = (local35 + 1048575 - arg4.anInt2652) / local35;
				if (local45 > arg2) {
					arg4.anInt2652 += arg2 * local35;
					break;
				}
				arg4.aClass5_Sub16_Sub3_3.method5787(arg3, arg1, local45);
				arg4.anInt2652 += local45 * local35 - 1048576;
				arg1 += local45;
				arg2 -= local45;
				@Pc(76) int local76 = Static226.anInt4449 / 100;
				@Pc(80) int local80 = 262144 / local35;
				if (local80 < local76) {
					local76 = local80;
				}
				@Pc(92) Class5_Sub16_Sub3 local92 = arg4.aClass5_Sub16_Sub3_3;
				if (this.aClass5_Sub16_Sub1_1.anIntArray149[arg4.anInt2644] == 0) {
					arg4.aClass5_Sub16_Sub3_3 = Static365.method4581(arg4.aClass5_Sub10_Sub1_1, local92.method4602(), local92.method4583(), local92.method4574());
				} else {
					arg4.aClass5_Sub16_Sub3_3 = Static365.method4581(arg4.aClass5_Sub10_Sub1_1, local92.method4602(), 0, local92.method4574());
					this.aClass5_Sub16_Sub1_1.method1694(arg4.aClass5_Sub24_1.aShortArray53[arg4.anInt2650] < 0, arg4);
					arg4.aClass5_Sub16_Sub3_3.method4573(local76, local92.method4583());
				}
				if (arg4.aClass5_Sub24_1.aShortArray53[arg4.anInt2650] < 0) {
					arg4.aClass5_Sub16_Sub3_3.method4592(-1);
				}
				local92.method4586(local76);
				local92.method5787(arg3, arg1, arg0 - arg1);
				if (local92.method4587()) {
					this.aClass5_Sub16_Sub4_2.method5797(local92);
				}
			}
		}
		arg4.aClass5_Sub16_Sub3_3.method5787(arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	public void method5793(@OriginalArg(0) int arg0) {
		this.aClass5_Sub16_Sub4_2.method5793(arg0);
		for (@Pc(13) Class5_Sub21 local13 = (Class5_Sub21) this.aClass103_59.method2756(); local13 != null; local13 = (Class5_Sub21) this.aClass103_59.method2748()) {
			if (!this.aClass5_Sub16_Sub1_1.method1671(local13)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local22 <= local13.anInt2649) {
						this.method2043(local13, local22);
						local13.anInt2649 -= local22;
						break;
					}
					this.method2043(local13, local13.anInt2649);
					local22 -= local13.anInt2649;
				} while (!this.aClass5_Sub16_Sub1_1.method1675(null, 0, local22, local13));
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!il;BI)V")
	private void method2043(@OriginalArg(0) Class5_Sub21 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass5_Sub16_Sub1_1.anIntArray158[arg0.anInt2644] & 0x4) != 0 && arg0.anInt2647 < 0) {
			@Pc(24) int local24 = this.aClass5_Sub16_Sub1_1.anIntArray150[arg0.anInt2644] / Static226.anInt4449;
			@Pc(35) int local35 = (local24 + 1048575 - arg0.anInt2652) / local24;
			arg0.anInt2652 = arg1 * local24 + arg0.anInt2652 & 0xFFFFF;
			if (arg1 >= local35) {
				if (this.aClass5_Sub16_Sub1_1.anIntArray149[arg0.anInt2644] == 0) {
					arg0.aClass5_Sub16_Sub3_3 = Static365.method4581(arg0.aClass5_Sub10_Sub1_1, arg0.aClass5_Sub16_Sub3_3.method4602(), arg0.aClass5_Sub16_Sub3_3.method4583(), arg0.aClass5_Sub16_Sub3_3.method4574());
				} else {
					arg0.aClass5_Sub16_Sub3_3 = Static365.method4581(arg0.aClass5_Sub10_Sub1_1, arg0.aClass5_Sub16_Sub3_3.method4602(), 0, arg0.aClass5_Sub16_Sub3_3.method4574());
					this.aClass5_Sub16_Sub1_1.method1694(arg0.aClass5_Sub24_1.aShortArray53[arg0.anInt2650] < 0, arg0);
				}
				if (arg0.aClass5_Sub24_1.aShortArray53[arg0.anInt2650] < 0) {
					arg0.aClass5_Sub16_Sub3_3.method4592(-1);
				}
				arg1 = arg0.anInt2652 / local24;
			}
		}
		arg0.aClass5_Sub16_Sub3_3.method5793(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class5_Sub16 method5790() {
		@Pc(9) Class5_Sub21 local9 = (Class5_Sub21) this.aClass103_59.method2756();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub16_Sub3_3 == null) {
			return this.method5791();
		} else {
			return local9.aClass5_Sub16_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "()I")
	@Override
	public int method5792() {
		return 0;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "()Lclient!rb;")
	@Override
	public Class5_Sub16 method5791() {
		@Pc(9) Class5_Sub21 local9;
		do {
			local9 = (Class5_Sub21) this.aClass103_59.method2748();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub16_Sub3_3 == null);
		return local9.aClass5_Sub16_Sub3_3;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([III)V")
	@Override
	public void method5787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub16_Sub4_2.method5787(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub21 local17 = (Class5_Sub21) this.aClass103_59.method2756(); local17 != null; local17 = (Class5_Sub21) this.aClass103_59.method2748()) {
			if (!this.aClass5_Sub16_Sub1_1.method1671(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2649 >= local29) {
						this.method2042(local27 + local29, local27, local29, arg0, local17);
						local17.anInt2649 -= local29;
						break;
					}
					this.method2042(local29 + local27, local27, local17.anInt2649, arg0, local17);
					local29 -= local17.anInt2649;
					local27 += local17.anInt2649;
				} while (!this.aClass5_Sub16_Sub1_1.method1675(arg0, local27, local29, local17));
			}
		}
	}
}
