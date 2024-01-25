import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class2_Sub18_Sub3 extends Class2_Sub18 {

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "Lclient!wl;")
	public final Class265 aClass265_43 = new Class265();

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "Lclient!qc;")
	public final Class2_Sub18_Sub4 aClass2_Sub18_Sub4_1 = new Class2_Sub18_Sub4();

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "Lclient!jb;")
	private final Class2_Sub18_Sub2 aClass2_Sub18_Sub2_2;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!jb;)V")
	public Class2_Sub18_Sub3(@OriginalArg(0) Class2_Sub18_Sub2 arg0) {
		this.aClass2_Sub18_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub18 method4451() {
		@Pc(9) Class2_Sub37 local9;
		do {
			local9 = (Class2_Sub37) this.aClass265_43.method6001();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub18_Sub1_4 == null);
		return local9.aClass2_Sub18_Sub1_4;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!rv;IB)V")
	private void method4355(@OriginalArg(0) Class2_Sub37 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub18_Sub2_2.anIntArray238[arg0.anInt6172] & 0x4) != 0 && arg0.anInt6157 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub18_Sub2_2.anIntArray249[arg0.anInt6172] / Static369.anInt6566;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt6171) / local23;
			arg0.anInt6171 = arg0.anInt6171 + local23 * arg1 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass2_Sub18_Sub2_2.anIntArray240[arg0.anInt6172] == 0) {
					arg0.aClass2_Sub18_Sub1_4 = Static458.method2682(arg0.aClass2_Sub41_Sub1_2, arg0.aClass2_Sub18_Sub1_4.method2696(), arg0.aClass2_Sub18_Sub1_4.method2704(), arg0.aClass2_Sub18_Sub1_4.method2681());
				} else {
					arg0.aClass2_Sub18_Sub1_4 = Static458.method2682(arg0.aClass2_Sub41_Sub1_2, arg0.aClass2_Sub18_Sub1_4.method2696(), 0, arg0.aClass2_Sub18_Sub1_4.method2681());
					this.aClass2_Sub18_Sub2_2.method2918(arg0, arg0.aClass2_Sub4_1.aShortArray2[arg0.anInt6163] < 0);
				}
				if (arg0.aClass2_Sub4_1.aShortArray2[arg0.anInt6163] < 0) {
					arg0.aClass2_Sub18_Sub1_4.method2698(-1);
				}
				arg1 = arg0.anInt6171 / local23;
			}
		}
		arg0.aClass2_Sub18_Sub1_4.method4450(arg1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([III)V")
	@Override
	public void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub18_Sub4_1.method4446(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub37 local17 = (Class2_Sub37) this.aClass265_43.method6005(); local17 != null; local17 = (Class2_Sub37) this.aClass265_43.method6001()) {
			if (!this.aClass2_Sub18_Sub2_2.method2917(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt6178) {
						this.method4357(local27 + local29, local27, local17, arg0, local29);
						local17.anInt6178 -= local29;
						break;
					}
					this.method4357(local27 + local29, local27, local17, arg0, local17.anInt6178);
					local27 += local17.anInt6178;
					local29 -= local17.anInt6178;
				} while (!this.aClass2_Sub18_Sub2_2.method2913(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILclient!rv;[II)V")
	private void method4357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub37 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub18_Sub2_2.anIntArray238[arg2.anInt6172] & 0x4) != 0 && arg2.anInt6157 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub18_Sub2_2.anIntArray249[arg2.anInt6172] / Static369.anInt6566;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg2.anInt6171) / local30;
				if (arg4 < local40) {
					arg2.anInt6171 += arg4 * local30;
					break;
				}
				arg2.aClass2_Sub18_Sub1_4.method4446(arg3, arg1, local40);
				arg2.anInt6171 += local40 * local30 - 1048576;
				arg4 -= local40;
				arg1 += local40;
				@Pc(75) int local75 = Static369.anInt6566 / 100;
				@Pc(79) int local79 = 262144 / local30;
				if (local75 > local79) {
					local75 = local79;
				}
				@Pc(91) Class2_Sub18_Sub1 local91 = arg2.aClass2_Sub18_Sub1_4;
				if (this.aClass2_Sub18_Sub2_2.anIntArray240[arg2.anInt6172] == 0) {
					arg2.aClass2_Sub18_Sub1_4 = Static458.method2682(arg2.aClass2_Sub41_Sub1_2, local91.method2696(), local91.method2704(), local91.method2681());
				} else {
					arg2.aClass2_Sub18_Sub1_4 = Static458.method2682(arg2.aClass2_Sub41_Sub1_2, local91.method2696(), 0, local91.method2681());
					this.aClass2_Sub18_Sub2_2.method2918(arg2, arg2.aClass2_Sub4_1.aShortArray2[arg2.anInt6163] < 0);
					arg2.aClass2_Sub18_Sub1_4.method2680(local75, local91.method2704());
				}
				if (arg2.aClass2_Sub4_1.aShortArray2[arg2.anInt6163] < 0) {
					arg2.aClass2_Sub18_Sub1_4.method2698(-1);
				}
				local91.method2689(local75);
				local91.method4446(arg3, arg1, arg0 - arg1);
				if (local91.method2684()) {
					this.aClass2_Sub18_Sub4_1.method4455(local91);
				}
			}
		}
		arg2.aClass2_Sub18_Sub1_4.method4446(arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub18 method4448() {
		@Pc(9) Class2_Sub37 local9 = (Class2_Sub37) this.aClass265_43.method6005();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub18_Sub1_4 == null) {
			return this.method4451();
		} else {
			return local9.aClass2_Sub18_Sub1_4;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	@Override
	public void method4450(@OriginalArg(0) int arg0) {
		this.aClass2_Sub18_Sub4_1.method4450(arg0);
		for (@Pc(15) Class2_Sub37 local15 = (Class2_Sub37) this.aClass265_43.method6005(); local15 != null; local15 = (Class2_Sub37) this.aClass265_43.method6001()) {
			if (!this.aClass2_Sub18_Sub2_2.method2917(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6178) {
						this.method4355(local15, local25);
						local15.anInt6178 -= local25;
						break;
					}
					this.method4355(local15, local15.anInt6178);
					local25 -= local15.anInt6178;
				} while (!this.aClass2_Sub18_Sub2_2.method2913(null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "()I")
	@Override
	public int method4445() {
		return 0;
	}
}
