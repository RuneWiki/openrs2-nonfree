import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Lclient!ea;")
	public final Class23 aClass23_9 = new Class23();

	@OriginalMember(owner = "client!kg", name = "S", descriptor = "Lclient!td;")
	public final Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1 = new Class3_Sub3_Sub4();

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "Lclient!kf;")
	private final Class3_Sub3_Sub2 aClass3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kf;)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class3_Sub3_Sub2 arg0) {
		this.aClass3_Sub3_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()Lclient!ch;")
	@Override
	public Class3_Sub3 method2843() {
		@Pc(9) Class3_Sub16 local9;
		do {
			local9 = (Class3_Sub16) this.aClass23_9.method861();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub3_Sub1_1 == null);
		return local9.aClass3_Sub3_Sub1_1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[IIILclient!od;)V")
	private void method1944(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub16 arg4) {
		if ((this.aClass3_Sub3_Sub2_1.anIntArray402[arg4.anInt2870] & 0x4) != 0 && arg4.anInt2861 < 0) {
			@Pc(34) int local34 = this.aClass3_Sub3_Sub2_1.anIntArray397[arg4.anInt2870] / Static96.anInt4194;
			while (true) {
				@Pc(45) int local45 = (local34 + 1048575 - arg4.anInt2873) / local34;
				if (local45 > arg3) {
					arg4.anInt2873 += arg3 * local34;
					break;
				}
				arg4.aClass3_Sub3_Sub1_1.method2838(arg1, arg0, local45);
				arg3 -= local45;
				arg0 += local45;
				@Pc(66) int local66 = Static96.anInt4194 / 100;
				@Pc(70) int local70 = 262144 / local34;
				@Pc(73) Class3_Sub3_Sub1 local73 = arg4.aClass3_Sub3_Sub1_1;
				arg4.anInt2873 += local34 * local45 - 1048576;
				if (local66 > local70) {
					local66 = local70;
				}
				if (this.aClass3_Sub3_Sub2_1.anIntArray404[arg4.anInt2870] == 0) {
					arg4.aClass3_Sub3_Sub1_1 = Static183.method451(arg4.aClass3_Sub13_Sub1_1, local73.method440(), local73.method439(), local73.method461());
				} else {
					arg4.aClass3_Sub3_Sub1_1 = Static183.method451(arg4.aClass3_Sub13_Sub1_1, local73.method440(), 0, local73.method461());
					this.aClass3_Sub3_Sub2_1.method1916(arg4.aClass3_Sub21_1.aShortArray35[arg4.anInt2864] < 0, arg4);
					arg4.aClass3_Sub3_Sub1_1.method450(local66, local73.method439());
				}
				if (arg4.aClass3_Sub21_1.aShortArray35[arg4.anInt2864] < 0) {
					arg4.aClass3_Sub3_Sub1_1.method460(-1);
				}
				local73.method465(local66);
				local73.method2838(arg1, arg0, arg2 - arg0);
				if (local73.method467()) {
					this.aClass3_Sub3_Sub4_1.method2850(local73);
				}
			}
		}
		arg4.aClass3_Sub3_Sub1_1.method2838(arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
	@Override
	public int method2841() {
		return 0;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()Lclient!ch;")
	@Override
	public Class3_Sub3 method2844() {
		@Pc(9) Class3_Sub16 local9 = (Class3_Sub16) this.aClass23_9.method858();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub3_Sub1_1 == null) {
			return this.method2843();
		} else {
			return local9.aClass3_Sub3_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
	@Override
	public void method2838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub3_Sub4_1.method2838(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub16 local17 = (Class3_Sub16) this.aClass23_9.method858(); local17 != null; local17 = (Class3_Sub16) this.aClass23_9.method861()) {
			if (!this.aClass3_Sub3_Sub2_1.method1917(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt2879) {
						this.method1944(local27, arg0, local27 + local29, local29, local17);
						local17.anInt2879 -= local29;
						break;
					}
					this.method1944(local27, arg0, local27 + local29, local17.anInt2879, local17);
					local27 += local17.anInt2879;
					local29 -= local17.anInt2879;
				} while (!this.aClass3_Sub3_Sub2_1.method1929(local17, arg0, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	@Override
	public void method2839(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3_Sub4_1.method2839(arg0);
		for (@Pc(11) Class3_Sub16 local11 = (Class3_Sub16) this.aClass23_9.method858(); local11 != null; local11 = (Class3_Sub16) this.aClass23_9.method861()) {
			if (!this.aClass3_Sub3_Sub2_1.method1917(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt2879) {
						this.method1945(local21, local11);
						local11.anInt2879 -= local21;
						break;
					}
					this.method1945(local11.anInt2879, local11);
					local21 -= local11.anInt2879;
				} while (!this.aClass3_Sub3_Sub2_1.method1929(local11, null, local21, 0));
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!od;)V")
	private void method1945(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub16 arg1) {
		if ((this.aClass3_Sub3_Sub2_1.anIntArray402[arg1.anInt2870] & 0x4) != 0 && arg1.anInt2861 < 0) {
			@Pc(20) int local20 = this.aClass3_Sub3_Sub2_1.anIntArray397[arg1.anInt2870] / Static96.anInt4194;
			@Pc(29) int local29 = (local20 + 1048575 - arg1.anInt2873) / local20;
			arg1.anInt2873 = local20 * arg0 + arg1.anInt2873 & 0xFFFFF;
			if (arg0 >= local29) {
				if (this.aClass3_Sub3_Sub2_1.anIntArray404[arg1.anInt2870] == 0) {
					arg1.aClass3_Sub3_Sub1_1 = Static183.method451(arg1.aClass3_Sub13_Sub1_1, arg1.aClass3_Sub3_Sub1_1.method440(), arg1.aClass3_Sub3_Sub1_1.method439(), arg1.aClass3_Sub3_Sub1_1.method461());
				} else {
					arg1.aClass3_Sub3_Sub1_1 = Static183.method451(arg1.aClass3_Sub13_Sub1_1, arg1.aClass3_Sub3_Sub1_1.method440(), 0, arg1.aClass3_Sub3_Sub1_1.method461());
					this.aClass3_Sub3_Sub2_1.method1916(arg1.aClass3_Sub21_1.aShortArray35[arg1.anInt2864] < 0, arg1);
				}
				if (arg1.aClass3_Sub21_1.aShortArray35[arg1.anInt2864] < 0) {
					arg1.aClass3_Sub3_Sub1_1.method460(-1);
				}
				arg0 = arg1.anInt2873 / local20;
			}
		}
		arg1.aClass3_Sub3_Sub1_1.method2839(arg0);
	}
}
