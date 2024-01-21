import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!jd;")
	public final Class38 aClass38_6 = new Class38();

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!uc;")
	public final Class1_Sub4_Sub4 aClass1_Sub4_Sub4_1 = new Class1_Sub4_Sub4();

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "Lclient!bf;")
	private final Class1_Sub4_Sub1 aClass1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class1_Sub4_Sub2(@OriginalArg(0) Class1_Sub4_Sub1 arg0) {
		this.aClass1_Sub4_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	@Override
	public void method1895(@OriginalArg(0) int arg0) {
		this.aClass1_Sub4_Sub4_1.method1895(arg0);
		for (@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) this.aClass38_6.method1034(); local15 != null; local15 = (Class1_Sub11) this.aClass38_6.method1038()) {
			if (!this.aClass1_Sub4_Sub1_2.method311(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1345) {
						this.method478(local25, local15);
						local15.anInt1345 -= local25;
						break;
					}
					this.method478(local15.anInt1345, local15);
					local25 -= local15.anInt1345;
				} while (!this.aClass1_Sub4_Sub1_2.method323(local15, null, 0, local25));
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!hc;)V")
	private void method478(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if ((this.aClass1_Sub4_Sub1_2.anIntArray40[arg1.anInt1350] & 0x4) != 0 && arg1.anInt1352 < 0) {
			@Pc(38) int local38 = this.aClass1_Sub4_Sub1_2.anIntArray47[arg1.anInt1350] / Static12.anInt553;
			@Pc(48) int local48 = (local38 + 1048575 - arg1.anInt1354) / local38;
			arg1.anInt1354 = arg0 * local38 + arg1.anInt1354 & 0xFFFFF;
			if (arg0 >= local48) {
				if (this.aClass1_Sub4_Sub1_2.anIntArray44[arg1.anInt1350] == 0) {
					arg1.aClass1_Sub4_Sub3_1 = Static137.method1225(arg1.aClass1_Sub17_Sub1_1, arg1.aClass1_Sub4_Sub3_1.method1230(), arg1.aClass1_Sub4_Sub3_1.method1229(), arg1.aClass1_Sub4_Sub3_1.method1238());
				} else {
					arg1.aClass1_Sub4_Sub3_1 = Static137.method1225(arg1.aClass1_Sub17_Sub1_1, arg1.aClass1_Sub4_Sub3_1.method1230(), 0, arg1.aClass1_Sub4_Sub3_1.method1238());
					this.aClass1_Sub4_Sub1_2.method313(arg1, arg1.aClass1_Sub8_1.aShortArray1[arg1.anInt1344] < 0);
				}
				if (arg1.aClass1_Sub8_1.aShortArray1[arg1.anInt1344] < 0) {
					arg1.aClass1_Sub4_Sub3_1.method1239(-1);
				}
				arg0 = arg1.anInt1354 / local38;
			}
		}
		arg1.aClass1_Sub4_Sub3_1.method1895(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([III)V")
	@Override
	public void method1897(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub4_Sub4_1.method1897(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass38_6.method1034(); local17 != null; local17 = (Class1_Sub11) this.aClass38_6.method1038()) {
			if (!this.aClass1_Sub4_Sub1_2.method311(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1345) {
						this.method481(local17, local27, local29, local27 + local29, arg0);
						local17.anInt1345 -= local29;
						break;
					}
					this.method481(local17, local27, local17.anInt1345, local27 + local29, arg0);
					local27 += local17.anInt1345;
					local29 -= local17.anInt1345;
				} while (!this.aClass1_Sub4_Sub1_2.method323(local17, arg0, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!hc;IIII[I)V")
	private void method481(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub4_Sub1_2.anIntArray40[arg0.anInt1350] & 0x4) != 0 && arg0.anInt1352 < 0) {
			@Pc(40) int local40 = this.aClass1_Sub4_Sub1_2.anIntArray47[arg0.anInt1350] / Static12.anInt553;
			while (true) {
				@Pc(50) int local50 = (local40 + 1048575 - arg0.anInt1354) / local40;
				if (arg2 < local50) {
					arg0.anInt1354 += arg2 * local40;
					break;
				}
				arg2 -= local50;
				arg0.aClass1_Sub4_Sub3_1.method1897(arg4, arg1, local50);
				arg1 += local50;
				@Pc(71) int local71 = Static12.anInt553 / 100;
				@Pc(75) int local75 = 262144 / local40;
				if (local75 < local71) {
					local71 = local75;
				}
				arg0.anInt1354 += local40 * local50 - 1048576;
				@Pc(93) Class1_Sub4_Sub3 local93 = arg0.aClass1_Sub4_Sub3_1;
				if (this.aClass1_Sub4_Sub1_2.anIntArray44[arg0.anInt1350] == 0) {
					arg0.aClass1_Sub4_Sub3_1 = Static137.method1225(arg0.aClass1_Sub17_Sub1_1, local93.method1230(), local93.method1229(), local93.method1238());
				} else {
					arg0.aClass1_Sub4_Sub3_1 = Static137.method1225(arg0.aClass1_Sub17_Sub1_1, local93.method1230(), 0, local93.method1238());
					this.aClass1_Sub4_Sub1_2.method313(arg0, arg0.aClass1_Sub8_1.aShortArray1[arg0.anInt1344] < 0);
					arg0.aClass1_Sub4_Sub3_1.method1226(local71, local93.method1229());
				}
				if (arg0.aClass1_Sub8_1.aShortArray1[arg0.anInt1344] < 0) {
					arg0.aClass1_Sub4_Sub3_1.method1239(-1);
				}
				local93.method1253(local71);
				local93.method1897(arg4, arg1, arg3 - arg1);
				if (local93.method1241()) {
					this.aClass1_Sub4_Sub4_1.method1905(local93);
				}
			}
		}
		arg0.aClass1_Sub4_Sub3_1.method1897(arg4, arg1, arg2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public Class1_Sub4 method1894() {
		@Pc(9) Class1_Sub11 local9;
		do {
			local9 = (Class1_Sub11) this.aClass38_6.method1038();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub4_Sub3_1 == null);
		return local9.aClass1_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()I")
	@Override
	public int method1898() {
		return 0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public Class1_Sub4 method1896() {
		@Pc(5) Class1_Sub11 local5 = (Class1_Sub11) this.aClass38_6.method1034();
		if (local5 == null) {
			return null;
		} else if (local5.aClass1_Sub4_Sub3_1 == null) {
			return this.method1894();
		} else {
			return local5.aClass1_Sub4_Sub3_1;
		}
	}
}
