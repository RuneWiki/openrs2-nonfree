import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "Lclient!ie;")
	public final Class31 aClass31_36 = new Class31();

	@OriginalMember(owner = "client!jd", name = "fb", descriptor = "Lclient!qb;")
	public final Class1_Sub8_Sub3 aClass1_Sub8_Sub3_2 = new Class1_Sub8_Sub3();

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "Lclient!qe;")
	private final Class1_Sub8_Sub4 aClass1_Sub8_Sub4_1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class1_Sub8_Sub2(@OriginalArg(0) Class1_Sub8_Sub4 arg0) {
		this.aClass1_Sub8_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	@Override
	public void method1739(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_Sub3_2.method1739(arg0);
		for (@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) this.aClass31_36.method1000(); local15 != null; local15 = (Class1_Sub15) this.aClass31_36.method1003()) {
			if (!this.aClass1_Sub8_Sub4_1.method1749(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2049 >= local25) {
						this.method1065(local15, local25);
						local15.anInt2049 -= local25;
						break;
					}
					this.method1065(local15, local15.anInt2049);
					local25 -= local15.anInt2049;
				} while (!this.aClass1_Sub8_Sub4_1.method1748(local15, 0, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "()Lclient!qf;")
	@Override
	public Class1_Sub8 method1734() {
		@Pc(9) Class1_Sub15 local9 = (Class1_Sub15) this.aClass31_36.method1000();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub8_Sub1_3 == null) {
			return this.method1738();
		} else {
			return local9.aClass1_Sub8_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
	@Override
	public int method1733() {
		return 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([III)V")
	@Override
	public void method1736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub8_Sub3_2.method1736(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) this.aClass31_36.method1000(); local17 != null; local17 = (Class1_Sub15) this.aClass31_36.method1003()) {
			if (!this.aClass1_Sub8_Sub4_1.method1749(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2049 >= local29) {
						this.method1059(arg0, local27, local17, local27 + local29, local29);
						local17.anInt2049 -= local29;
						break;
					}
					this.method1059(arg0, local27, local17, local27 + local29, local17.anInt2049);
					local27 += local17.anInt2049;
					local29 -= local17.anInt2049;
				} while (!this.aClass1_Sub8_Sub4_1.method1748(local17, local27, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([IIILclient!ob;II)V")
	private void method1059(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub8_Sub4_1.anIntArray366[arg2.anInt2045] & 0x4) != 0 && arg2.anInt2056 < 0) {
			@Pc(22) int local22 = this.aClass1_Sub8_Sub4_1.anIntArray375[arg2.anInt2045] / Static44.anInt1243;
			while (true) {
				@Pc(31) int local31 = (local22 + 1048575 - arg2.anInt2051) / local22;
				if (local31 > arg4) {
					arg2.anInt2051 += arg4 * local22;
					break;
				}
				arg4 -= local31;
				arg2.aClass1_Sub8_Sub1_3.method1736(arg0, arg1, local31);
				arg2.anInt2051 += local22 * local31 - 1048576;
				arg1 += local31;
				@Pc(65) Class1_Sub8_Sub1 local65 = arg2.aClass1_Sub8_Sub1_3;
				@Pc(69) int local69 = Static44.anInt1243 / 100;
				@Pc(73) int local73 = 262144 / local22;
				if (local73 < local69) {
					local69 = local73;
				}
				if (this.aClass1_Sub8_Sub4_1.anIntArray373[arg2.anInt2045] == 0) {
					arg2.aClass1_Sub8_Sub1_3 = Static131.method920(arg2.aClass1_Sub16_Sub1_1, local65.method950(), local65.method939(), local65.method929());
				} else {
					arg2.aClass1_Sub8_Sub1_3 = Static131.method920(arg2.aClass1_Sub16_Sub1_1, local65.method950(), 0, local65.method929());
					this.aClass1_Sub8_Sub4_1.method1745(arg2.aClass1_Sub17_1.aShortArray7[arg2.anInt2041] < 0, arg2);
					arg2.aClass1_Sub8_Sub1_3.method925(local69, local65.method939());
				}
				if (arg2.aClass1_Sub17_1.aShortArray7[arg2.anInt2041] < 0) {
					arg2.aClass1_Sub8_Sub1_3.method923(-1);
				}
				local65.method951(local69);
				local65.method1736(arg0, arg1, arg3 - arg1);
				if (local65.method952()) {
					this.aClass1_Sub8_Sub3_2.method1640(local65);
				}
			}
		}
		arg2.aClass1_Sub8_Sub1_3.method1736(arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()Lclient!qf;")
	@Override
	public Class1_Sub8 method1738() {
		@Pc(9) Class1_Sub15 local9;
		do {
			local9 = (Class1_Sub15) this.aClass31_36.method1003();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub8_Sub1_3 == null);
		return local9.aClass1_Sub8_Sub1_3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ob;IB)V")
	private void method1065(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub8_Sub4_1.anIntArray366[arg0.anInt2045] & 0x4) != 0 && arg0.anInt2056 < 0) {
			@Pc(24) int local24 = this.aClass1_Sub8_Sub4_1.anIntArray375[arg0.anInt2045] / Static44.anInt1243;
			@Pc(34) int local34 = (local24 + 1048575 - arg0.anInt2051) / local24;
			arg0.anInt2051 = arg0.anInt2051 + local24 * arg1 & 0xFFFFF;
			if (arg1 >= local34) {
				if (this.aClass1_Sub8_Sub4_1.anIntArray373[arg0.anInt2045] == 0) {
					arg0.aClass1_Sub8_Sub1_3 = Static131.method920(arg0.aClass1_Sub16_Sub1_1, arg0.aClass1_Sub8_Sub1_3.method950(), arg0.aClass1_Sub8_Sub1_3.method939(), arg0.aClass1_Sub8_Sub1_3.method929());
				} else {
					arg0.aClass1_Sub8_Sub1_3 = Static131.method920(arg0.aClass1_Sub16_Sub1_1, arg0.aClass1_Sub8_Sub1_3.method950(), 0, arg0.aClass1_Sub8_Sub1_3.method929());
					this.aClass1_Sub8_Sub4_1.method1745(arg0.aClass1_Sub17_1.aShortArray7[arg0.anInt2041] < 0, arg0);
				}
				if (arg0.aClass1_Sub17_1.aShortArray7[arg0.anInt2041] < 0) {
					arg0.aClass1_Sub8_Sub1_3.method923(-1);
				}
				arg1 = arg0.anInt2051 / local24;
			}
		}
		arg0.aClass1_Sub8_Sub1_3.method1739(arg1);
	}
}
