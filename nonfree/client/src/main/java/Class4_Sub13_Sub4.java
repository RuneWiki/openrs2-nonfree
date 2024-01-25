import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class4_Sub13_Sub4 extends Class4_Sub13 {

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "Lclient!mk;")
	public final Class130 aClass130_144 = new Class130();

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "Lclient!ia;")
	public final Class4_Sub13_Sub2 aClass4_Sub13_Sub2_3 = new Class4_Sub13_Sub2();

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "Lclient!s;")
	private final Class4_Sub13_Sub3 aClass4_Sub13_Sub3_3;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!s;)V")
	public Class4_Sub13_Sub4(@OriginalArg(0) Class4_Sub13_Sub3 arg0) {
		this.aClass4_Sub13_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "()Lclient!le;")
	@Override
	public Class4_Sub13 method5301() {
		@Pc(9) Class4_Sub9 local9;
		do {
			local9 = (Class4_Sub9) this.aClass130_144.method3512();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub13_Sub1_1 == null);
		return local9.aClass4_Sub13_Sub1_1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIILclient!fa;II)V")
	private void method5308(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub9 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub13_Sub3_3.anIntArray478[arg3.anInt1768] & 0x4) != 0 && arg3.anInt1755 < 0) {
			@Pc(22) int local22 = this.aClass4_Sub13_Sub3_3.anIntArray470[arg3.anInt1768] / Static57.anInt1232;
			while (true) {
				@Pc(31) int local31 = (local22 + 1048575 - arg3.anInt1750) / local22;
				if (arg4 < local31) {
					arg3.anInt1750 += arg4 * local22;
					break;
				}
				arg3.aClass4_Sub13_Sub1_1.method5299(arg0, arg2, local31);
				arg4 -= local31;
				arg3.anInt1750 += local22 * local31 - 1048576;
				arg2 += local31;
				@Pc(62) int local62 = Static57.anInt1232 / 100;
				@Pc(66) int local66 = 262144 / local22;
				if (local62 > local66) {
					local62 = local66;
				}
				@Pc(74) Class4_Sub13_Sub1 local74 = arg3.aClass4_Sub13_Sub1_1;
				if (this.aClass4_Sub13_Sub3_3.lb[arg3.anInt1768] == 0) {
					arg3.aClass4_Sub13_Sub1_1 = Static359.method1925(arg3.aClass4_Sub5_Sub1_1, local74.method1948(), local74.method1922(), local74.method1926());
				} else {
					arg3.aClass4_Sub13_Sub1_1 = Static359.method1925(arg3.aClass4_Sub5_Sub1_1, local74.method1948(), 0, local74.method1926());
					this.aClass4_Sub13_Sub3_3.method4884(arg3.aClass4_Sub31_1.aShortArray67[arg3.anInt1753] < 0, arg3);
					arg3.aClass4_Sub13_Sub1_1.method1920(local62, local74.method1922());
				}
				if (arg3.aClass4_Sub31_1.aShortArray67[arg3.anInt1753] < 0) {
					arg3.aClass4_Sub13_Sub1_1.method1940(-1);
				}
				local74.method1939(local62);
				local74.method5299(arg0, arg2, arg1 - arg2);
				if (local74.method1918()) {
					this.aClass4_Sub13_Sub2_3.method2496(local74);
				}
			}
		}
		arg3.aClass4_Sub13_Sub1_1.method5299(arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!fa;B)V")
	private void method5309(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if ((this.aClass4_Sub13_Sub3_3.anIntArray478[arg1.anInt1768] & 0x4) != 0 && arg1.anInt1755 < 0) {
			@Pc(20) int local20 = this.aClass4_Sub13_Sub3_3.anIntArray470[arg1.anInt1768] / Static57.anInt1232;
			@Pc(30) int local30 = (local20 + 1048575 - arg1.anInt1750) / local20;
			arg1.anInt1750 = arg0 * local20 + arg1.anInt1750 & 0xFFFFF;
			if (local30 <= arg0) {
				if (this.aClass4_Sub13_Sub3_3.lb[arg1.anInt1768] == 0) {
					arg1.aClass4_Sub13_Sub1_1 = Static359.method1925(arg1.aClass4_Sub5_Sub1_1, arg1.aClass4_Sub13_Sub1_1.method1948(), arg1.aClass4_Sub13_Sub1_1.method1922(), arg1.aClass4_Sub13_Sub1_1.method1926());
				} else {
					arg1.aClass4_Sub13_Sub1_1 = Static359.method1925(arg1.aClass4_Sub5_Sub1_1, arg1.aClass4_Sub13_Sub1_1.method1948(), 0, arg1.aClass4_Sub13_Sub1_1.method1926());
					this.aClass4_Sub13_Sub3_3.method4884(arg1.aClass4_Sub31_1.aShortArray67[arg1.anInt1753] < 0, arg1);
				}
				if (arg1.aClass4_Sub31_1.aShortArray67[arg1.anInt1753] < 0) {
					arg1.aClass4_Sub13_Sub1_1.method1940(-1);
				}
				arg0 = arg1.anInt1750 / local20;
			}
		}
		arg1.aClass4_Sub13_Sub1_1.method5300(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "()Lclient!le;")
	@Override
	public Class4_Sub13 method5303() {
		@Pc(9) Class4_Sub9 local9 = (Class4_Sub9) this.aClass130_144.method3499();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub13_Sub1_1 == null) {
			return this.method5301();
		} else {
			return local9.aClass4_Sub13_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		this.aClass4_Sub13_Sub2_3.method5300(arg0);
		for (@Pc(15) Class4_Sub9 local15 = (Class4_Sub9) this.aClass130_144.method3499(); local15 != null; local15 = (Class4_Sub9) this.aClass130_144.method3512()) {
			if (!this.aClass4_Sub13_Sub3_3.method4883(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1751 >= local25) {
						this.method5309(local25, local15);
						local15.anInt1751 -= local25;
						break;
					}
					this.method5309(local15.anInt1751, local15);
					local25 -= local15.anInt1751;
				} while (!this.aClass4_Sub13_Sub3_3.method4867(0, null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "()I")
	@Override
	public int method5305() {
		return 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([III)V")
	@Override
	public void method5299(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub13_Sub2_3.method5299(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub9 local17 = (Class4_Sub9) this.aClass130_144.method3499(); local17 != null; local17 = (Class4_Sub9) this.aClass130_144.method3512()) {
			if (!this.aClass4_Sub13_Sub3_3.method4883(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1751) {
						this.method5308(arg0, local29 + local27, local27, local17, local29);
						local17.anInt1751 -= local29;
						break;
					}
					this.method5308(arg0, local27 + local29, local27, local17, local17.anInt1751);
					local29 -= local17.anInt1751;
					local27 += local17.anInt1751;
				} while (!this.aClass4_Sub13_Sub3_3.method4867(local27, arg0, local29, local17));
			}
		}
	}
}
