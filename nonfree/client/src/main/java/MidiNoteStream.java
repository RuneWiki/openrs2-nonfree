import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "Lclient!wd;")
	public final Class82 aClass82_3 = new Class82();

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lclient!qe;")
	public final Class4_Sub4_Sub4 aClass4_Sub4_Sub4_2 = new Class4_Sub4_Sub4();

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Lclient!c;")
	private final Class4_Sub4_Sub1 aClass4_Sub4_Sub1_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!c;)V")
	public Class4_Sub4_Sub2(@OriginalArg(0) Class4_Sub4_Sub1 arg0) {
		this.aClass4_Sub4_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lclient!fd;")
	@Override
	public Class4_Sub4 method1638() {
		@Pc(9) Class4_Sub15 local9;
		do {
			local9 = (Class4_Sub15) this.aClass82_3.method2023();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub4_Sub3_1 == null);
		return local9.aClass4_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!la;)V")
	private void method570(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub15 arg1) {
		if ((this.aClass4_Sub4_Sub1_1.anIntArray28[arg1.anInt1842] & 0x4) != 0 && arg1.anInt1843 < 0) {
			@Pc(25) int local25 = this.aClass4_Sub4_Sub1_1.anIntArray32[arg1.anInt1842] / Static116.anInt2873;
			@Pc(34) int local34 = (local25 + 1048575 - arg1.anInt1831) / local25;
			arg1.anInt1831 = arg1.anInt1831 + arg0 * local25 & 0xFFFFF;
			if (local34 <= arg0) {
				if (this.aClass4_Sub4_Sub1_1.anIntArray25[arg1.anInt1842] == 0) {
					arg1.aClass4_Sub4_Sub3_1 = Static140.method1229(arg1.aClass4_Sub13_Sub1_1, arg1.aClass4_Sub4_Sub3_1.method1240(), arg1.aClass4_Sub4_Sub3_1.method1249(), arg1.aClass4_Sub4_Sub3_1.method1245());
				} else {
					arg1.aClass4_Sub4_Sub3_1 = Static140.method1229(arg1.aClass4_Sub13_Sub1_1, arg1.aClass4_Sub4_Sub3_1.method1240(), 0, arg1.aClass4_Sub4_Sub3_1.method1245());
					this.aClass4_Sub4_Sub1_1.method208(arg1.aClass4_Sub14_1.aShortArray17[arg1.anInt1833] < 0, arg1);
				}
				if (arg1.aClass4_Sub14_1.aShortArray17[arg1.anInt1833] < 0) {
					arg1.aClass4_Sub4_Sub3_1.method1232(-1);
				}
				arg0 = arg1.anInt1831 / local25;
			}
		}
		arg1.aClass4_Sub4_Sub3_1.method1639(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "([III)V")
	@Override
	public void method1637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub4_Sub4_2.method1637(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub15 local17 = (Class4_Sub15) this.aClass82_3.method2025(); local17 != null; local17 = (Class4_Sub15) this.aClass82_3.method2023()) {
			if (!this.aClass4_Sub4_Sub1_1.method227(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1823) {
						this.method575(local17, arg0, local27, local29 + local27, local29);
						local17.anInt1823 -= local29;
						break;
					}
					this.method575(local17, arg0, local27, local27 + local29, local17.anInt1823);
					local27 += local17.anInt1823;
					local29 -= local17.anInt1823;
				} while (!this.aClass4_Sub4_Sub1_1.method222(local17, local27, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()Lclient!fd;")
	@Override
	public Class4_Sub4 method1640() {
		@Pc(9) Class4_Sub15 local9 = (Class4_Sub15) this.aClass82_3.method2025();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub4_Sub3_1 == null) {
			return this.method1638();
		} else {
			return local9.aClass4_Sub4_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()I")
	@Override
	public int method1635() {
		return 0;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	@Override
	public void method1639(@OriginalArg(0) int arg0) {
		this.aClass4_Sub4_Sub4_2.method1639(arg0);
		for (@Pc(15) Class4_Sub15 local15 = (Class4_Sub15) this.aClass82_3.method2025(); local15 != null; local15 = (Class4_Sub15) this.aClass82_3.method2023()) {
			if (!this.aClass4_Sub4_Sub1_1.method227(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1823 >= local25) {
						this.method570(local25, local15);
						local15.anInt1823 -= local25;
						break;
					}
					this.method570(local15.anInt1823, local15);
					local25 -= local15.anInt1823;
				} while (!this.aClass4_Sub4_Sub1_1.method222(local15, 0, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!la;[IIIII)V")
	private void method575(@OriginalArg(0) Class4_Sub15 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub4_Sub1_1.anIntArray28[arg0.anInt1842] & 0x4) != 0 && arg0.anInt1843 < 0) {
			@Pc(29) int local29 = this.aClass4_Sub4_Sub1_1.anIntArray32[arg0.anInt1842] / Static116.anInt2873;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt1831) / local29;
				if (local39 > arg4) {
					arg0.anInt1831 += local29 * arg4;
					break;
				}
				arg4 -= local39;
				@Pc(54) int local54 = 262144 / local29;
				arg0.aClass4_Sub4_Sub3_1.method1637(arg1, arg2, local39);
				arg0.anInt1831 += local39 * local29 - 1048576;
				arg2 += local39;
				@Pc(77) Class4_Sub4_Sub3 local77 = arg0.aClass4_Sub4_Sub3_1;
				@Pc(81) int local81 = Static116.anInt2873 / 100;
				if (local54 < local81) {
					local81 = local54;
				}
				if (this.aClass4_Sub4_Sub1_1.anIntArray25[arg0.anInt1842] == 0) {
					arg0.aClass4_Sub4_Sub3_1 = Static140.method1229(arg0.aClass4_Sub13_Sub1_1, local77.method1240(), local77.method1249(), local77.method1245());
				} else {
					arg0.aClass4_Sub4_Sub3_1 = Static140.method1229(arg0.aClass4_Sub13_Sub1_1, local77.method1240(), 0, local77.method1245());
					this.aClass4_Sub4_Sub1_1.method208(arg0.aClass4_Sub14_1.aShortArray17[arg0.anInt1833] < 0, arg0);
					arg0.aClass4_Sub4_Sub3_1.method1226(local81, local77.method1249());
				}
				if (arg0.aClass4_Sub14_1.aShortArray17[arg0.anInt1833] < 0) {
					arg0.aClass4_Sub4_Sub3_1.method1232(-1);
				}
				local77.method1230(local81);
				local77.method1637(arg1, arg2, arg3 - arg2);
				if (local77.method1264()) {
					this.aClass4_Sub4_Sub4_2.method1647(local77);
				}
			}
		}
		arg0.aClass4_Sub4_Sub3_1.method1637(arg1, arg2, arg4);
	}
}
