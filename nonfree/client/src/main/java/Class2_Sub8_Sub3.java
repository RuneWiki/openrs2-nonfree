import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class2_Sub8_Sub3 extends Class2_Sub8 {

	@OriginalMember(owner = "client!og", name = "v", descriptor = "Lclient!nj;")
	public final Class181 aClass181_28 = new Class181();

	@OriginalMember(owner = "client!og", name = "A", descriptor = "Lclient!d;")
	public final Class2_Sub8_Sub1 aClass2_Sub8_Sub1_1 = new Class2_Sub8_Sub1();

	@OriginalMember(owner = "client!og", name = "r", descriptor = "Lclient!lp;")
	private final Class2_Sub8_Sub2 aClass2_Sub8_Sub2_3;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!lp;)V")
	public Class2_Sub8_Sub3(@OriginalArg(0) Class2_Sub8_Sub2 arg0) {
		this.aClass2_Sub8_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB[ILclient!nd;II)V")
	private void method4183(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class2_Sub27 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub8_Sub2_3.anIntArray368[arg2.anInt4933] & 0x4) != 0 && arg2.anInt4948 < 0) {
			@Pc(36) int local36 = this.aClass2_Sub8_Sub2_3.anIntArray377[arg2.anInt4933] / Static150.anInt7358;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg2.anInt4932) / local36;
				if (local46 > arg4) {
					arg2.anInt4932 += arg4 * local36;
					break;
				}
				arg2.aClass2_Sub8_Sub4_3.method5281(arg1, arg3, local46);
				arg4 -= local46;
				arg2.anInt4932 += local36 * local46 - 1048576;
				arg3 += local46;
				@Pc(77) int local77 = Static150.anInt7358 / 100;
				@Pc(81) int local81 = 262144 / local36;
				if (local81 < local77) {
					local77 = local81;
				}
				@Pc(93) Class2_Sub8_Sub4 local93 = arg2.aClass2_Sub8_Sub4_3;
				if (this.aClass2_Sub8_Sub2_3.anIntArray366[arg2.anInt4933] == 0) {
					arg2.aClass2_Sub8_Sub4_3 = Static473.method5289(arg2.aClass2_Sub14_Sub1_1, local93.method5296(), local93.method5309(), local93.method5317());
				} else {
					arg2.aClass2_Sub8_Sub4_3 = Static473.method5289(arg2.aClass2_Sub14_Sub1_1, local93.method5296(), 0, local93.method5317());
					this.aClass2_Sub8_Sub2_3.method3325(arg2, arg2.aClass2_Sub46_1.aShortArray118[arg2.anInt4936] < 0);
					arg2.aClass2_Sub8_Sub4_3.method5319(local77, local93.method5309());
				}
				if (arg2.aClass2_Sub46_1.aShortArray118[arg2.anInt4936] < 0) {
					arg2.aClass2_Sub8_Sub4_3.method5298(-1);
				}
				local93.method5325(local77);
				local93.method5281(arg1, arg3, arg0 - arg3);
				if (local93.method5315()) {
					this.aClass2_Sub8_Sub1_1.method1039(local93);
				}
			}
		}
		arg2.aClass2_Sub8_Sub4_3.method5281(arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()I")
	@Override
	public int method5286() {
		return 0;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()Lclient!nu;")
	@Override
	public Class2_Sub8 method5287() {
		@Pc(9) Class2_Sub27 local9;
		do {
			local9 = (Class2_Sub27) this.aClass181_28.method3975();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub8_Sub4_3 == null);
		return local9.aClass2_Sub8_Sub4_3;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
	@Override
	public void method5281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub8_Sub1_1.method5281(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub27 local17 = (Class2_Sub27) this.aClass181_28.method3972(); local17 != null; local17 = (Class2_Sub27) this.aClass181_28.method3975()) {
			if (!this.aClass2_Sub8_Sub2_3.method3311(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt4934 >= local27) {
						this.method4183(local29 + local27, arg0, local17, local29, local27);
						local17.anInt4934 -= local27;
						break;
					}
					this.method4183(local27 + local29, arg0, local17, local29, local17.anInt4934);
					local27 -= local17.anInt4934;
					local29 += local17.anInt4934;
				} while (!this.aClass2_Sub8_Sub2_3.method3304(local29, arg0, local17, local27));
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()Lclient!nu;")
	@Override
	public Class2_Sub8 method5285() {
		@Pc(9) Class2_Sub27 local9 = (Class2_Sub27) this.aClass181_28.method3972();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub8_Sub4_3 == null) {
			return this.method5287();
		} else {
			return local9.aClass2_Sub8_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!nd;II)V")
	private void method4186(@OriginalArg(0) Class2_Sub27 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub8_Sub2_3.anIntArray368[arg0.anInt4933] & 0x4) != 0 && arg0.anInt4948 < 0) {
			@Pc(25) int local25 = this.aClass2_Sub8_Sub2_3.anIntArray377[arg0.anInt4933] / Static150.anInt7358;
			@Pc(34) int local34 = (local25 + 1048575 - arg0.anInt4932) / local25;
			arg0.anInt4932 = arg1 * local25 + arg0.anInt4932 & 0xFFFFF;
			if (local34 <= arg1) {
				if (this.aClass2_Sub8_Sub2_3.anIntArray366[arg0.anInt4933] == 0) {
					arg0.aClass2_Sub8_Sub4_3 = Static473.method5289(arg0.aClass2_Sub14_Sub1_1, arg0.aClass2_Sub8_Sub4_3.method5296(), arg0.aClass2_Sub8_Sub4_3.method5309(), arg0.aClass2_Sub8_Sub4_3.method5317());
				} else {
					arg0.aClass2_Sub8_Sub4_3 = Static473.method5289(arg0.aClass2_Sub14_Sub1_1, arg0.aClass2_Sub8_Sub4_3.method5296(), 0, arg0.aClass2_Sub8_Sub4_3.method5317());
					this.aClass2_Sub8_Sub2_3.method3325(arg0, arg0.aClass2_Sub46_1.aShortArray118[arg0.anInt4936] < 0);
				}
				if (arg0.aClass2_Sub46_1.aShortArray118[arg0.anInt4936] < 0) {
					arg0.aClass2_Sub8_Sub4_3.method5298(-1);
				}
				arg1 = arg0.anInt4932 / local25;
			}
		}
		arg0.aClass2_Sub8_Sub4_3.method5284(arg1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method5284(@OriginalArg(0) int arg0) {
		this.aClass2_Sub8_Sub1_1.method5284(arg0);
		for (@Pc(15) Class2_Sub27 local15 = (Class2_Sub27) this.aClass181_28.method3972(); local15 != null; local15 = (Class2_Sub27) this.aClass181_28.method3975()) {
			if (!this.aClass2_Sub8_Sub2_3.method3311(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4934) {
						this.method4186(local15, local25);
						local15.anInt4934 -= local25;
						break;
					}
					this.method4186(local15, local15.anInt4934);
					local25 -= local15.anInt4934;
				} while (!this.aClass2_Sub8_Sub2_3.method3304(0, null, local15, local25));
			}
		}
	}
}
