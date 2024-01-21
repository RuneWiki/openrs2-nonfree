import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub10_Sub2 extends Class3_Sub10 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!c;")
	public final Class11 aClass11_9 = new Class11();

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Lclient!he;")
	public final Class3_Sub10_Sub1 aClass3_Sub10_Sub1_2 = new Class3_Sub10_Sub1();

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "Lclient!vc;")
	private final Class3_Sub10_Sub4 aClass3_Sub10_Sub4_1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!vc;)V")
	public Class3_Sub10_Sub2(@OriginalArg(0) Class3_Sub10_Sub4 arg0) {
		this.aClass3_Sub10_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "([III)V")
	@Override
	public void method1870(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub10_Sub1_2.method1870(arg0, arg1, arg2);
		@Pc(15) int local15 = arg1 + arg2;
		for (@Pc(21) Class3_Sub17 local21 = (Class3_Sub17) this.aClass11_9.method189(); local21 != null; local21 = (Class3_Sub17) this.aClass11_9.method187()) {
			if (!this.aClass3_Sub10_Sub4_1.method1881(local21)) {
				@Pc(31) int local31 = arg1;
				@Pc(33) int local33 = arg2;
				do {
					if (local21.anInt2564 >= local33) {
						this.method1380(local33, arg0, local15, local31, local21);
						local21.anInt2564 -= local33;
						break;
					}
					this.method1380(local21.anInt2564, arg0, local15, local31, local21);
					local31 += local21.anInt2564;
					local33 -= local21.anInt2564;
				} while (!this.aClass3_Sub10_Sub4_1.method1892(local21));
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[IIIILclient!ub;)V")
	private void method1380(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub17 arg4) {
		if ((this.aClass3_Sub10_Sub4_1.anIntArray402[arg4.anInt2557] & 0x4) != 0 && arg4.anInt2568 < 0) {
			@Pc(22) int local22 = this.aClass3_Sub10_Sub4_1.anIntArray387[arg4.anInt2557] / Static38.anInt1141;
			while (true) {
				@Pc(32) int local32 = (local22 + 1048575 - arg4.anInt2555) / local22;
				if (local32 > arg0) {
					arg4.anInt2555 += arg0 * local22;
					break;
				}
				arg4.aClass3_Sub10_Sub3_1.method1870(arg1, arg3, local32);
				@Pc(45) int local45 = 262144 / local22;
				arg0 -= local32;
				@Pc(52) Class3_Sub10_Sub3 local52 = arg4.aClass3_Sub10_Sub3_1;
				arg3 += local32;
				@Pc(60) int local60 = Static38.anInt1141 / 100;
				arg4.anInt2555 += local22 * local32 - 1048576;
				if (local60 > local45) {
					local60 = local45;
				}
				if (this.aClass3_Sub10_Sub4_1.anIntArray400[arg4.anInt2557] == 0) {
					arg4.aClass3_Sub10_Sub3_1 = Static132.method1616(arg4.aClass3_Sub2_Sub1_1, local52.method1619(), local52.method1589(), local52.method1597());
				} else {
					arg4.aClass3_Sub10_Sub3_1 = Static132.method1616(arg4.aClass3_Sub2_Sub1_1, local52.method1619(), 0, local52.method1597());
					this.aClass3_Sub10_Sub4_1.method1896(arg4.aClass3_Sub12_1.aShortArray10[arg4.anInt2571] < 0, arg4);
					arg4.aClass3_Sub10_Sub3_1.method1591(local60, local52.method1589());
				}
				if (arg4.aClass3_Sub12_1.aShortArray10[arg4.anInt2571] < 0) {
					arg4.aClass3_Sub10_Sub3_1.method1595(-1);
				}
				local52.method1606(local60);
				local52.method1870(arg1, arg3, arg2 - arg3);
				if (local52.method1601()) {
					this.aClass3_Sub10_Sub1_2.method862(local52);
				}
			}
		}
		arg4.aClass3_Sub10_Sub3_1.method1870(arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()Lclient!hb;")
	@Override
	public Class3_Sub10 method1869() {
		@Pc(9) Class3_Sub17 local9;
		do {
			local9 = (Class3_Sub17) this.aClass11_9.method187();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub10_Sub3_1 == null);
		return local9.aClass3_Sub10_Sub3_1;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()Lclient!hb;")
	@Override
	public Class3_Sub10 method1867() {
		@Pc(9) Class3_Sub17 local9 = (Class3_Sub17) this.aClass11_9.method189();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub10_Sub3_1 == null) {
			return this.method1869();
		} else {
			return local9.aClass3_Sub10_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ub;IB)V")
	private void method1382(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass3_Sub10_Sub4_1.anIntArray402[arg0.anInt2557] & 0x4) != 0 && arg0.anInt2568 < 0) {
			@Pc(30) int local30 = this.aClass3_Sub10_Sub4_1.anIntArray387[arg0.anInt2557] / Static38.anInt1141;
			@Pc(41) int local41 = (local30 + 1048575 - arg0.anInt2555) / local30;
			arg0.anInt2555 = arg1 * local30 + arg0.anInt2555 & 0xFFFFF;
			if (arg1 >= local41) {
				if (this.aClass3_Sub10_Sub4_1.anIntArray400[arg0.anInt2557] == 0) {
					arg0.aClass3_Sub10_Sub3_1 = Static132.method1616(arg0.aClass3_Sub2_Sub1_1, arg0.aClass3_Sub10_Sub3_1.method1619(), arg0.aClass3_Sub10_Sub3_1.method1589(), arg0.aClass3_Sub10_Sub3_1.method1597());
				} else {
					arg0.aClass3_Sub10_Sub3_1 = Static132.method1616(arg0.aClass3_Sub2_Sub1_1, arg0.aClass3_Sub10_Sub3_1.method1619(), 0, arg0.aClass3_Sub10_Sub3_1.method1597());
					this.aClass3_Sub10_Sub4_1.method1896(arg0.aClass3_Sub12_1.aShortArray10[arg0.anInt2571] < 0, arg0);
				}
				if (arg0.aClass3_Sub12_1.aShortArray10[arg0.anInt2571] < 0) {
					arg0.aClass3_Sub10_Sub3_1.method1595(-1);
				}
				arg1 = arg0.anInt2555 / local30;
			}
		}
		arg0.aClass3_Sub10_Sub3_1.method1865(arg1);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()I")
	@Override
	public int method1866() {
		return 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	@Override
	public void method1865(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class3_Sub17 local11 = (Class3_Sub17) this.aClass11_9.method189(); local11 != null; local11 = (Class3_Sub17) this.aClass11_9.method187()) {
			if (!this.aClass3_Sub10_Sub4_1.method1881(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local11.anInt2564 >= local21) {
						this.method1382(local11, local21);
						local11.anInt2564 -= local21;
						break;
					}
					this.method1382(local11, local11.anInt2564);
					local21 -= local11.anInt2564;
				} while (!this.aClass3_Sub10_Sub4_1.method1892(local11));
			}
		}
	}
}
