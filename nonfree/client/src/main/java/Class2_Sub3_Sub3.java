import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Lclient!en;")
	public Class44 aClass44_4 = new Class44();

	@OriginalMember(owner = "client!co", name = "E", descriptor = "Lclient!wb;")
	public Class2_Sub3_Sub4 aClass2_Sub3_Sub4_1 = new Class2_Sub3_Sub4();

	@OriginalMember(owner = "client!co", name = "A", descriptor = "Lclient!ak;")
	private Class2_Sub3_Sub1 aClass2_Sub3_Sub1_3;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!ak;)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) Class2_Sub3_Sub1 arg0) {
		this.aClass2_Sub3_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "()I")
	@Override
	public int method4651() {
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([IIIZILclient!eh;)V")
	private void method840(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub14 arg4) {
		if ((this.aClass2_Sub3_Sub1_3.anIntArray34[arg4.anInt1580] & 0x4) != 0 && arg4.anInt1586 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub3_Sub1_3.anIntArray31[arg4.anInt1580] / Static107.anInt2456;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg4.anInt1583) / local30;
				if (local40 > arg3) {
					arg4.anInt1583 += local30 * arg3;
					break;
				}
				arg4.aClass2_Sub3_Sub2_1.method4653(arg0, arg2, local40);
				arg3 -= local40;
				arg2 += local40;
				arg4.anInt1583 += local40 * local30 - 1048576;
				@Pc(71) int local71 = Static107.anInt2456 / 100;
				@Pc(75) int local75 = 262144 / local30;
				if (local71 > local75) {
					local71 = local75;
				}
				@Pc(84) Class2_Sub3_Sub2 local84 = arg4.aClass2_Sub3_Sub2_1;
				if (this.aClass2_Sub3_Sub1_3.anIntArray42[arg4.anInt1580] == 0) {
					arg4.aClass2_Sub3_Sub2_1 = Static316.method415(arg4.aClass2_Sub19_Sub1_1, local84.method436(), local84.method407(), local84.method418());
				} else {
					arg4.aClass2_Sub3_Sub2_1 = Static316.method415(arg4.aClass2_Sub19_Sub1_1, local84.method436(), 0, local84.method418());
					this.aClass2_Sub3_Sub1_3.method199(arg4.aClass2_Sub22_1.aShortArray60[arg4.anInt1591] < 0, arg4);
					arg4.aClass2_Sub3_Sub2_1.method414(local71, local84.method407());
				}
				if (arg4.aClass2_Sub22_1.aShortArray60[arg4.anInt1591] < 0) {
					arg4.aClass2_Sub3_Sub2_1.method405(-1);
				}
				local84.method402(local71);
				local84.method4653(arg0, arg2, arg1 - arg2);
				if (local84.method417()) {
					this.aClass2_Sub3_Sub4_1.method4657(local84);
				}
			}
		}
		arg4.aClass2_Sub3_Sub2_1.method4653(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "()Lclient!mh;")
	@Override
	public Class2_Sub3 method4654() {
		@Pc(9) Class2_Sub14 local9;
		do {
			local9 = (Class2_Sub14) this.aClass44_4.method1360();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub3_Sub2_1 == null);
		return local9.aClass2_Sub3_Sub2_1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!eh;)V")
	private void method844(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub14 arg1) {
		if ((this.aClass2_Sub3_Sub1_3.anIntArray34[arg1.anInt1580] & 0x4) != 0 && arg1.anInt1586 < 0) {
			@Pc(22) int local22 = this.aClass2_Sub3_Sub1_3.anIntArray31[arg1.anInt1580] / Static107.anInt2456;
			@Pc(32) int local32 = (local22 + 1048575 - arg1.anInt1583) / local22;
			arg1.anInt1583 = arg0 * local22 + arg1.anInt1583 & 0xFFFFF;
			if (arg0 >= local32) {
				if (this.aClass2_Sub3_Sub1_3.anIntArray42[arg1.anInt1580] == 0) {
					arg1.aClass2_Sub3_Sub2_1 = Static316.method415(arg1.aClass2_Sub19_Sub1_1, arg1.aClass2_Sub3_Sub2_1.method436(), arg1.aClass2_Sub3_Sub2_1.method407(), arg1.aClass2_Sub3_Sub2_1.method418());
				} else {
					arg1.aClass2_Sub3_Sub2_1 = Static316.method415(arg1.aClass2_Sub19_Sub1_1, arg1.aClass2_Sub3_Sub2_1.method436(), 0, arg1.aClass2_Sub3_Sub2_1.method418());
					this.aClass2_Sub3_Sub1_3.method199(arg1.aClass2_Sub22_1.aShortArray60[arg1.anInt1591] < 0, arg1);
				}
				if (arg1.aClass2_Sub22_1.aShortArray60[arg1.anInt1591] < 0) {
					arg1.aClass2_Sub3_Sub2_1.method405(-1);
				}
				arg0 = arg1.anInt1583 / local22;
			}
		}
		arg1.aClass2_Sub3_Sub2_1.method4650(arg0);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "([III)V")
	@Override
	public void method4653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub3_Sub4_1.method4653(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub14 local17 = (Class2_Sub14) this.aClass44_4.method1352(); local17 != null; local17 = (Class2_Sub14) this.aClass44_4.method1360()) {
			if (!this.aClass2_Sub3_Sub1_3.method208(local17)) {
				@Pc(30) int local30 = arg1;
				@Pc(32) int local32 = arg2;
				do {
					if (local32 <= local17.anInt1573) {
						this.method840(arg0, local32 + local30, local30, local32, local17);
						local17.anInt1573 -= local32;
						break;
					}
					this.method840(arg0, local32 + local30, local30, local17.anInt1573, local17);
					local30 += local17.anInt1573;
					local32 -= local17.anInt1573;
				} while (!this.aClass2_Sub3_Sub1_3.method204(local17, arg0, local30, local32));
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	@Override
	public void method4650(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_Sub4_1.method4650(arg0);
		for (@Pc(11) Class2_Sub14 local11 = (Class2_Sub14) this.aClass44_4.method1352(); local11 != null; local11 = (Class2_Sub14) this.aClass44_4.method1360()) {
			if (!this.aClass2_Sub3_Sub1_3.method208(local11)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local11.anInt1573 >= local22) {
						this.method844(local22, local11);
						local11.anInt1573 -= local22;
						break;
					}
					this.method844(local11.anInt1573, local11);
					local22 -= local11.anInt1573;
				} while (!this.aClass2_Sub3_Sub1_3.method204(local11, null, 0, local22));
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()Lclient!mh;")
	@Override
	public Class2_Sub3 method4649() {
		@Pc(9) Class2_Sub14 local9 = (Class2_Sub14) this.aClass44_4.method1352();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub3_Sub2_1 == null) {
			return this.method4654();
		} else {
			return local9.aClass2_Sub3_Sub2_1;
		}
	}
}
