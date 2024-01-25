import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class5_Sub15_Sub3 extends Class5_Sub15 {

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "Lclient!fea;")
	public final Class99 aClass99_68 = new Class99();

	@OriginalMember(owner = "client!sca", name = "E", descriptor = "Lclient!lq;")
	public final Class5_Sub15_Sub2 aClass5_Sub15_Sub2_2 = new Class5_Sub15_Sub2();

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "Lclient!tda;")
	private final Class5_Sub15_Sub4 aClass5_Sub15_Sub4_4;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!tda;)V")
	public Class5_Sub15_Sub3(@OriginalArg(0) Class5_Sub15_Sub4 arg0) {
		this.aClass5_Sub15_Sub4_4 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "()Lclient!ps;")
	@Override
	public Class5_Sub15 method6506() {
		@Pc(9) Class5_Sub37 local9 = (Class5_Sub37) this.aClass99_68.method2526();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub15_Sub1_4 == null) {
			return this.method6511();
		} else {
			return local9.aClass5_Sub15_Sub1_4;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!pc;)V")
	private void method6293(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub37 arg1) {
		if ((this.aClass5_Sub15_Sub4_4.anIntArray605[arg1.anInt6915] & 0x4) != 0 && arg1.anInt6921 < 0) {
			@Pc(36) int local36 = this.aClass5_Sub15_Sub4_4.anIntArray606[arg1.anInt6915] / Static527.anInt8915;
			@Pc(46) int local46 = (local36 + 1048575 - arg1.anInt6905) / local36;
			arg1.anInt6905 = arg0 * local36 + arg1.anInt6905 & 0xFFFFF;
			if (arg0 >= local46) {
				if (this.aClass5_Sub15_Sub4_4.anIntArray610[arg1.anInt6915] == 0) {
					arg1.aClass5_Sub15_Sub1_4 = Static552.method2466(arg1.aClass5_Sub5_Sub1_2, arg1.aClass5_Sub15_Sub1_4.method2460(), arg1.aClass5_Sub15_Sub1_4.method2478(), arg1.aClass5_Sub15_Sub1_4.method2490());
				} else {
					arg1.aClass5_Sub15_Sub1_4 = Static552.method2466(arg1.aClass5_Sub5_Sub1_2, arg1.aClass5_Sub15_Sub1_4.method2460(), 0, arg1.aClass5_Sub15_Sub1_4.method2490());
					this.aClass5_Sub15_Sub4_4.method6540(arg1, arg1.aClass5_Sub9_1.aShortArray27[arg1.anInt6912] < 0);
				}
				if (arg1.aClass5_Sub9_1.aShortArray27[arg1.anInt6912] < 0) {
					arg1.aClass5_Sub15_Sub1_4.method2472(-1);
				}
				arg0 = arg1.anInt6905 / local36;
			}
		}
		arg1.aClass5_Sub15_Sub1_4.method6505(arg0);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	@Override
	public void method6505(@OriginalArg(0) int arg0) {
		this.aClass5_Sub15_Sub2_2.method6505(arg0);
		for (@Pc(15) Class5_Sub37 local15 = (Class5_Sub37) this.aClass99_68.method2526(); local15 != null; local15 = (Class5_Sub37) this.aClass99_68.method2519()) {
			if (!this.aClass5_Sub15_Sub4_4.method6523(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt6917 >= local25) {
						this.method6293(local25, local15);
						local15.anInt6917 -= local25;
						break;
					}
					this.method6293(local15.anInt6917, local15);
					local25 -= local15.anInt6917;
				} while (!this.aClass5_Sub15_Sub4_4.method6531(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "([III)V")
	@Override
	public void method6510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub15_Sub2_2.method6510(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub37 local17 = (Class5_Sub37) this.aClass99_68.method2526(); local17 != null; local17 = (Class5_Sub37) this.aClass99_68.method2519()) {
			if (!this.aClass5_Sub15_Sub4_4.method6523(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt6917) {
						this.method6294(local29 + local27, local27, arg0, local17, local29);
						local17.anInt6917 -= local29;
						break;
					}
					this.method6294(local27 + local29, local27, arg0, local17, local17.anInt6917);
					local29 -= local17.anInt6917;
					local27 += local17.anInt6917;
				} while (!this.aClass5_Sub15_Sub4_4.method6531(local17, local27, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "()Lclient!ps;")
	@Override
	public Class5_Sub15 method6511() {
		@Pc(9) Class5_Sub37 local9;
		do {
			local9 = (Class5_Sub37) this.aClass99_68.method2519();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub15_Sub1_4 == null);
		return local9.aClass5_Sub15_Sub1_4;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIZ[ILclient!pc;I)V")
	private void method6294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class5_Sub37 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub15_Sub4_4.anIntArray605[arg3.anInt6915] & 0x4) != 0 && arg3.anInt6921 < 0) {
			@Pc(22) int local22 = this.aClass5_Sub15_Sub4_4.anIntArray606[arg3.anInt6915] / Static527.anInt8915;
			while (true) {
				@Pc(33) int local33 = (local22 + 1048575 - arg3.anInt6905) / local22;
				if (arg4 < local33) {
					arg3.anInt6905 += local22 * arg4;
					break;
				}
				arg3.aClass5_Sub15_Sub1_4.method6510(arg2, arg1, local33);
				arg4 -= local33;
				arg3.anInt6905 += local22 * local33 - 1048576;
				arg1 += local33;
				@Pc(68) int local68 = Static527.anInt8915 / 100;
				@Pc(72) int local72 = 262144 / local22;
				if (local68 > local72) {
					local68 = local72;
				}
				@Pc(84) Class5_Sub15_Sub1 local84 = arg3.aClass5_Sub15_Sub1_4;
				if (this.aClass5_Sub15_Sub4_4.anIntArray610[arg3.anInt6915] == 0) {
					arg3.aClass5_Sub15_Sub1_4 = Static552.method2466(arg3.aClass5_Sub5_Sub1_2, local84.method2460(), local84.method2478(), local84.method2490());
				} else {
					arg3.aClass5_Sub15_Sub1_4 = Static552.method2466(arg3.aClass5_Sub5_Sub1_2, local84.method2460(), 0, local84.method2490());
					this.aClass5_Sub15_Sub4_4.method6540(arg3, arg3.aClass5_Sub9_1.aShortArray27[arg3.anInt6912] < 0);
					arg3.aClass5_Sub15_Sub1_4.method2489(local68, local84.method2478());
				}
				if (arg3.aClass5_Sub9_1.aShortArray27[arg3.anInt6912] < 0) {
					arg3.aClass5_Sub15_Sub1_4.method2472(-1);
				}
				local84.method2459(local68);
				local84.method6510(arg2, arg1, arg0 - arg1);
				if (local84.method2467()) {
					this.aClass5_Sub15_Sub2_2.method4866(local84);
				}
			}
		}
		arg3.aClass5_Sub15_Sub1_4.method6510(arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "()I")
	@Override
	public int method6508() {
		return 0;
	}
}
