import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "Lclient!wq;")
	public final Class216 aClass216_39 = new Class216();

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "Lclient!aj;")
	public final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1 = new Class2_Sub3_Sub1();

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "Lclient!eo;")
	private final Class2_Sub3_Sub3 aClass2_Sub3_Sub3_1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!eo;)V")
	public Class2_Sub3_Sub4(@OriginalArg(0) Class2_Sub3_Sub3 arg0) {
		this.aClass2_Sub3_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "()Lclient!j;")
	@Override
	public Class2_Sub3 method4476() {
		@Pc(9) Class2_Sub18 local9;
		do {
			local9 = (Class2_Sub18) this.aClass216_39.method6000();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub3_Sub2_3 == null);
		return local9.aClass2_Sub3_Sub2_3;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()I")
	@Override
	public int method4474() {
		return 0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLclient!ge;)V")
	private void method4486(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		if ((this.aClass2_Sub3_Sub3_1.anIntArray177[arg1.anInt2286] & 0x4) != 0 && arg1.anInt2283 < 0) {
			@Pc(35) int local35 = this.aClass2_Sub3_Sub3_1.anIntArray170[arg1.anInt2286] / Static65.anInt1429;
			@Pc(44) int local44 = (local35 + 1048575 - arg1.anInt2288) / local35;
			arg1.anInt2288 = arg1.anInt2288 + local35 * arg0 & 0xFFFFF;
			if (local44 <= arg0) {
				if (this.aClass2_Sub3_Sub3_1.anIntArray175[arg1.anInt2286] == 0) {
					arg1.aClass2_Sub3_Sub2_3 = Static360.method1725(arg1.aClass2_Sub12_Sub1_1, arg1.aClass2_Sub3_Sub2_3.method1726(), arg1.aClass2_Sub3_Sub2_3.method1728(), arg1.aClass2_Sub3_Sub2_3.method1697());
				} else {
					arg1.aClass2_Sub3_Sub2_3 = Static360.method1725(arg1.aClass2_Sub12_Sub1_1, arg1.aClass2_Sub3_Sub2_3.method1726(), 0, arg1.aClass2_Sub3_Sub2_3.method1697());
					this.aClass2_Sub3_Sub3_1.method1767(arg1, arg1.aClass2_Sub14_1.aShortArray42[arg1.anInt2292] < 0);
				}
				if (arg1.aClass2_Sub14_1.aShortArray42[arg1.anInt2292] < 0) {
					arg1.aClass2_Sub3_Sub2_3.method1716(-1);
				}
				arg0 = arg1.anInt2288 / local35;
			}
		}
		arg1.aClass2_Sub3_Sub2_3.method4473(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([IIIBLclient!ge;I)V")
	private void method4487(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub18 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub3_Sub3_1.anIntArray177[arg3.anInt2286] & 0x4) != 0 && arg3.anInt2283 < 0) {
			@Pc(32) int local32 = this.aClass2_Sub3_Sub3_1.anIntArray170[arg3.anInt2286] / Static65.anInt1429;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg3.anInt2288) / local32;
				if (local42 > arg2) {
					arg3.anInt2288 += arg2 * local32;
					break;
				}
				arg3.aClass2_Sub3_Sub2_3.method4479(arg0, arg1, local42);
				arg1 += local42;
				arg2 -= local42;
				arg3.anInt2288 += local32 * local42 - 1048576;
				@Pc(77) int local77 = Static65.anInt1429 / 100;
				@Pc(81) int local81 = 262144 / local32;
				if (local77 > local81) {
					local77 = local81;
				}
				@Pc(93) Class2_Sub3_Sub2 local93 = arg3.aClass2_Sub3_Sub2_3;
				if (this.aClass2_Sub3_Sub3_1.anIntArray175[arg3.anInt2286] == 0) {
					arg3.aClass2_Sub3_Sub2_3 = Static360.method1725(arg3.aClass2_Sub12_Sub1_1, local93.method1726(), local93.method1728(), local93.method1697());
				} else {
					arg3.aClass2_Sub3_Sub2_3 = Static360.method1725(arg3.aClass2_Sub12_Sub1_1, local93.method1726(), 0, local93.method1697());
					this.aClass2_Sub3_Sub3_1.method1767(arg3, arg3.aClass2_Sub14_1.aShortArray42[arg3.anInt2292] < 0);
					arg3.aClass2_Sub3_Sub2_3.method1709(local77, local93.method1728());
				}
				if (arg3.aClass2_Sub14_1.aShortArray42[arg3.anInt2292] < 0) {
					arg3.aClass2_Sub3_Sub2_3.method1716(-1);
				}
				local93.method1711(local77);
				local93.method4479(arg0, arg1, arg4 - arg1);
				if (local93.method1701()) {
					this.aClass2_Sub3_Sub1_1.method367(local93);
				}
			}
		}
		arg3.aClass2_Sub3_Sub2_3.method4479(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "([III)V")
	@Override
	public void method4479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub3_Sub1_1.method4479(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub18 local17 = (Class2_Sub18) this.aClass216_39.method5992(); local17 != null; local17 = (Class2_Sub18) this.aClass216_39.method6000()) {
			if (!this.aClass2_Sub3_Sub3_1.method1779(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2279 >= local29) {
						this.method4487(arg0, local27, local29, local17, local27 + local29);
						local17.anInt2279 -= local29;
						break;
					}
					this.method4487(arg0, local27, local17.anInt2279, local17, local27 + local29);
					local29 -= local17.anInt2279;
					local27 += local17.anInt2279;
				} while (!this.aClass2_Sub3_Sub3_1.method1762(local29, local27, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	@Override
	public void method4473(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_Sub1_1.method4473(arg0);
		for (@Pc(15) Class2_Sub18 local15 = (Class2_Sub18) this.aClass216_39.method5992(); local15 != null; local15 = (Class2_Sub18) this.aClass216_39.method6000()) {
			if (!this.aClass2_Sub3_Sub3_1.method1779(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2279) {
						this.method4486(local25, local15);
						local15.anInt2279 -= local25;
						break;
					}
					this.method4486(local15.anInt2279, local15);
					local25 -= local15.anInt2279;
				} while (!this.aClass2_Sub3_Sub3_1.method1762(local25, 0, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()Lclient!j;")
	@Override
	public Class2_Sub3 method4475() {
		@Pc(9) Class2_Sub18 local9 = (Class2_Sub18) this.aClass216_39.method5992();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub3_Sub2_3 == null) {
			return this.method4476();
		} else {
			return local9.aClass2_Sub3_Sub2_3;
		}
	}
}
