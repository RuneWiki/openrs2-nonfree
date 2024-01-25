import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Lclient!wo;")
	public final Class266 aClass266_41 = new Class266();

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "Lclient!nt;")
	public final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_2 = new Class1_Sub7_Sub1();

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "Lclient!sf;")
	private final Class1_Sub7_Sub3 aClass1_Sub7_Sub3_2;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class1_Sub7_Sub2(@OriginalArg(0) Class1_Sub7_Sub3 arg0) {
		this.aClass1_Sub7_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!rr;I)V")
	private void method4313(@OriginalArg(1) Class1_Sub39 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub7_Sub3_2.anIntArray499[arg0.anInt6032] & 0x4) != 0 && arg0.anInt6036 < 0) {
			@Pc(20) int local20 = this.aClass1_Sub7_Sub3_2.anIntArray506[arg0.anInt6032] / Static78.anInt1548;
			@Pc(31) int local31 = (local20 + 1048575 - arg0.anInt6040) / local20;
			arg0.anInt6040 = arg1 * local20 + arg0.anInt6040 & 0xFFFFF;
			if (local31 <= arg1) {
				if (this.aClass1_Sub7_Sub3_2.anIntArray496[arg0.anInt6032] == 0) {
					arg0.aClass1_Sub7_Sub4_4 = Static463.method5961(arg0.aClass1_Sub32_Sub1_2, arg0.aClass1_Sub7_Sub4_4.method5939(), arg0.aClass1_Sub7_Sub4_4.method5951(), arg0.aClass1_Sub7_Sub4_4.method5941());
				} else {
					arg0.aClass1_Sub7_Sub4_4 = Static463.method5961(arg0.aClass1_Sub32_Sub1_2, arg0.aClass1_Sub7_Sub4_4.method5939(), 0, arg0.aClass1_Sub7_Sub4_4.method5941());
					this.aClass1_Sub7_Sub3_2.method5002(arg0.aClass1_Sub17_1.aShortArray50[arg0.anInt6042] < 0, arg0);
				}
				if (arg0.aClass1_Sub17_1.aShortArray50[arg0.anInt6042] < 0) {
					arg0.aClass1_Sub7_Sub4_4.method5933(-1);
				}
				arg1 = arg0.anInt6040 / local20;
			}
		}
		arg0.aClass1_Sub7_Sub4_4.method5927(arg1);
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()Lclient!dm;")
	@Override
	public Class1_Sub7 method5930() {
		@Pc(9) Class1_Sub39 local9 = (Class1_Sub39) this.aClass266_41.method6000();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub7_Sub4_4 == null) {
			return this.method5932();
		} else {
			return local9.aClass1_Sub7_Sub4_4;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[ILclient!rr;I)V")
	private void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub39 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub7_Sub3_2.anIntArray499[arg3.anInt6032] & 0x4) != 0 && arg3.anInt6036 < 0) {
			@Pc(43) int local43 = this.aClass1_Sub7_Sub3_2.anIntArray506[arg3.anInt6032] / Static78.anInt1548;
			while (true) {
				@Pc(53) int local53 = (local43 + 1048575 - arg3.anInt6040) / local43;
				if (local53 > arg4) {
					arg3.anInt6040 += arg4 * local43;
					break;
				}
				arg3.aClass1_Sub7_Sub4_4.method5928(arg2, arg1, local53);
				arg1 += local53;
				arg4 -= local53;
				arg3.anInt6040 += local43 * local53 - 1048576;
				@Pc(88) int local88 = Static78.anInt1548 / 100;
				@Pc(92) int local92 = 262144 / local43;
				if (local92 < local88) {
					local88 = local92;
				}
				@Pc(100) Class1_Sub7_Sub4 local100 = arg3.aClass1_Sub7_Sub4_4;
				if (this.aClass1_Sub7_Sub3_2.anIntArray496[arg3.anInt6032] == 0) {
					arg3.aClass1_Sub7_Sub4_4 = Static463.method5961(arg3.aClass1_Sub32_Sub1_2, local100.method5939(), local100.method5951(), local100.method5941());
				} else {
					arg3.aClass1_Sub7_Sub4_4 = Static463.method5961(arg3.aClass1_Sub32_Sub1_2, local100.method5939(), 0, local100.method5941());
					this.aClass1_Sub7_Sub3_2.method5002(arg3.aClass1_Sub17_1.aShortArray50[arg3.anInt6042] < 0, arg3);
					arg3.aClass1_Sub7_Sub4_4.method5960(local88, local100.method5951());
				}
				if (arg3.aClass1_Sub17_1.aShortArray50[arg3.anInt6042] < 0) {
					arg3.aClass1_Sub7_Sub4_4.method5933(-1);
				}
				local100.method5938(local88);
				local100.method5928(arg2, arg1, arg0 - arg1);
				if (local100.method5944()) {
					this.aClass1_Sub7_Sub1_2.method3976(local100);
				}
			}
		}
		arg3.aClass1_Sub7_Sub4_4.method5928(arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
	@Override
	public void method5928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub7_Sub1_2.method5928(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub39 local17 = (Class1_Sub39) this.aClass266_41.method6000(); local17 != null; local17 = (Class1_Sub39) this.aClass266_41.method5994()) {
			if (!this.aClass1_Sub7_Sub3_2.method4995(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt6043) {
						this.method4314(local27 + local29, local29, arg0, local17, local27);
						local17.anInt6043 -= local27;
						break;
					}
					this.method4314(local27 + local29, local29, arg0, local17, local17.anInt6043);
					local29 += local17.anInt6043;
					local27 -= local17.anInt6043;
				} while (!this.aClass1_Sub7_Sub3_2.method4979(local29, local17, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void method5927(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_Sub1_2.method5927(arg0);
		for (@Pc(15) Class1_Sub39 local15 = (Class1_Sub39) this.aClass266_41.method6000(); local15 != null; local15 = (Class1_Sub39) this.aClass266_41.method5994()) {
			if (!this.aClass1_Sub7_Sub3_2.method4995(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6043) {
						this.method4313(local15, local25);
						local15.anInt6043 -= local25;
						break;
					}
					this.method4313(local15, local15.anInt6043);
					local25 -= local15.anInt6043;
				} while (!this.aClass1_Sub7_Sub3_2.method4979(0, local15, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()I")
	@Override
	public int method5926() {
		return 0;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public Class1_Sub7 method5932() {
		@Pc(9) Class1_Sub39 local9;
		do {
			local9 = (Class1_Sub39) this.aClass266_41.method5994();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub7_Sub4_4 == null);
		return local9.aClass1_Sub7_Sub4_4;
	}
}
