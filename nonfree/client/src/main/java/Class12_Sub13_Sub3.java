import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class12_Sub13_Sub3 extends Class12_Sub13 {

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Lclient!dm;")
	public final Class73 aClass73_64 = new Class73();

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "Lclient!el;")
	public final Class12_Sub13_Sub1 aClass12_Sub13_Sub1_2 = new Class12_Sub13_Sub1();

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Lclient!kb;")
	private final Class12_Sub13_Sub2 aClass12_Sub13_Sub2_2;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class12_Sub13_Sub3(@OriginalArg(0) Class12_Sub13_Sub2 arg0) {
		this.aClass12_Sub13_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "()Lclient!ff;")
	@Override
	public Class12_Sub13 method7674() {
		@Pc(9) Class12_Sub9 local9 = (Class12_Sub9) this.aClass73_64.method2005();
		if (local9 == null) {
			return null;
		} else if (local9.aClass12_Sub13_Sub4_1 == null) {
			return this.method7673();
		} else {
			return local9.aClass12_Sub13_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "()I")
	@Override
	public int method7672() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	@Override
	public void method7675(@OriginalArg(0) int arg0) {
		this.aClass12_Sub13_Sub1_2.method7675(arg0);
		for (@Pc(15) Class12_Sub9 local15 = (Class12_Sub9) this.aClass73_64.method2005(); local15 != null; local15 = (Class12_Sub9) this.aClass73_64.method2009()) {
			if (!this.aClass12_Sub13_Sub2_2.method4252(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2154) {
						this.method6143(local15, local25);
						local15.anInt2154 -= local25;
						break;
					}
					this.method6143(local15, local15.anInt2154);
					local25 -= local15.anInt2154;
				} while (!this.aClass12_Sub13_Sub2_2.method4245(0, local25, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!dg;IB[I)V")
	private void method6141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass12_Sub13_Sub2_2.anIntArray369[arg2.anInt2144] & 0x4) != 0 && arg2.anInt2140 < 0) {
			@Pc(28) int local28 = this.aClass12_Sub13_Sub2_2.anIntArray358[arg2.anInt2144] / Static426.anInt6103;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg2.anInt2141) / local28;
				if (arg0 < local38) {
					arg2.anInt2141 += local28 * arg0;
					break;
				}
				arg2.aClass12_Sub13_Sub4_1.method7676(arg4, arg1, local38);
				arg0 -= local38;
				arg2.anInt2141 += local28 * local38 - 1048576;
				arg1 += local38;
				@Pc(69) int local69 = Static426.anInt6103 / 100;
				@Pc(73) int local73 = 262144 / local28;
				if (local69 > local73) {
					local69 = local73;
				}
				@Pc(81) Class12_Sub13_Sub4 local81 = arg2.aClass12_Sub13_Sub4_1;
				if (this.aClass12_Sub13_Sub2_2.anIntArray366[arg2.anInt2144] == 0) {
					arg2.aClass12_Sub13_Sub4_1 = Static560.method7698(arg2.aClass12_Sub29_Sub1_1, local81.method7686(), local81.method7694(), local81.method7689());
				} else {
					arg2.aClass12_Sub13_Sub4_1 = Static560.method7698(arg2.aClass12_Sub29_Sub1_1, local81.method7686(), 0, local81.method7689());
					this.aClass12_Sub13_Sub2_2.method4246(arg2.aClass12_Sub25_1.aShortArray74[arg2.anInt2158] < 0, arg2);
					arg2.aClass12_Sub13_Sub4_1.method7683(local69, local81.method7694());
				}
				if (arg2.aClass12_Sub25_1.aShortArray74[arg2.anInt2158] < 0) {
					arg2.aClass12_Sub13_Sub4_1.method7711(-1);
				}
				local81.method7693(local69);
				local81.method7676(arg4, arg1, arg3 - arg1);
				if (local81.method7682()) {
					this.aClass12_Sub13_Sub1_2.method2445(local81);
				}
			}
		}
		arg2.aClass12_Sub13_Sub4_1.method7676(arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "()Lclient!ff;")
	@Override
	public Class12_Sub13 method7673() {
		@Pc(9) Class12_Sub9 local9;
		do {
			local9 = (Class12_Sub9) this.aClass73_64.method2009();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass12_Sub13_Sub4_1 == null);
		return local9.aClass12_Sub13_Sub4_1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([III)V")
	@Override
	public void method7676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass12_Sub13_Sub1_2.method7676(arg0, arg1, arg2);
		for (@Pc(17) Class12_Sub9 local17 = (Class12_Sub9) this.aClass73_64.method2005(); local17 != null; local17 = (Class12_Sub9) this.aClass73_64.method2009()) {
			if (!this.aClass12_Sub13_Sub2_2.method4252(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2154 >= local29) {
						this.method6141(local29, local27, local17, local29 + local27, arg0);
						local17.anInt2154 -= local29;
						break;
					}
					this.method6141(local17.anInt2154, local27, local17, local29 + local27, arg0);
					local27 += local17.anInt2154;
					local29 -= local17.anInt2154;
				} while (!this.aClass12_Sub13_Sub2_2.method4245(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!dg;I)V")
	private void method6143(@OriginalArg(1) Class12_Sub9 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass12_Sub13_Sub2_2.anIntArray369[arg0.anInt2144] & 0x4) != 0 && arg0.anInt2140 < 0) {
			@Pc(33) int local33 = this.aClass12_Sub13_Sub2_2.anIntArray358[arg0.anInt2144] / Static426.anInt6103;
			@Pc(43) int local43 = (local33 + 1048575 - arg0.anInt2141) / local33;
			arg0.anInt2141 = local33 * arg1 + arg0.anInt2141 & 0xFFFFF;
			if (local43 <= arg1) {
				if (this.aClass12_Sub13_Sub2_2.anIntArray366[arg0.anInt2144] == 0) {
					arg0.aClass12_Sub13_Sub4_1 = Static560.method7698(arg0.aClass12_Sub29_Sub1_1, arg0.aClass12_Sub13_Sub4_1.method7686(), arg0.aClass12_Sub13_Sub4_1.method7694(), arg0.aClass12_Sub13_Sub4_1.method7689());
				} else {
					arg0.aClass12_Sub13_Sub4_1 = Static560.method7698(arg0.aClass12_Sub29_Sub1_1, arg0.aClass12_Sub13_Sub4_1.method7686(), 0, arg0.aClass12_Sub13_Sub4_1.method7689());
					this.aClass12_Sub13_Sub2_2.method4246(arg0.aClass12_Sub25_1.aShortArray74[arg0.anInt2158] < 0, arg0);
				}
				if (arg0.aClass12_Sub25_1.aShortArray74[arg0.anInt2158] < 0) {
					arg0.aClass12_Sub13_Sub4_1.method7711(-1);
				}
				arg1 = arg0.anInt2141 / local33;
			}
		}
		arg0.aClass12_Sub13_Sub4_1.method7675(arg1);
	}
}
