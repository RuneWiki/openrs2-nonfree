import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!he", name = "E", descriptor = "Lclient!ko;")
	public final Class142 aClass142_18 = new Class142();

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Lclient!bh;")
	public final Class1_Sub5_Sub1 aClass1_Sub5_Sub1_1 = new Class1_Sub5_Sub1();

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!qe;")
	private final Class1_Sub5_Sub4 aClass1_Sub5_Sub4_1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class1_Sub5_Sub3(@OriginalArg(0) Class1_Sub5_Sub4 arg0) {
		this.aClass1_Sub5_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()Lclient!ei;")
	@Override
	public Class1_Sub5 method4447() {
		@Pc(9) Class1_Sub10 local9;
		do {
			local9 = (Class1_Sub10) this.aClass142_18.method3198();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub5_Sub2_1 == null);
		return local9.aClass1_Sub5_Sub2_1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "([III)V")
	@Override
	public void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub5_Sub1_1.method4446(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub10 local17 = (Class1_Sub10) this.aClass142_18.method3199(); local17 != null; local17 = (Class1_Sub10) this.aClass142_18.method3198()) {
			if (!this.aClass1_Sub5_Sub4_1.method4457(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt1257 >= local29) {
						this.method2282(local29 + local27, local17, arg0, local27, local29);
						local17.anInt1257 -= local29;
						break;
					}
					this.method2282(local29 + local27, local17, arg0, local27, local17.anInt1257);
					local27 += local17.anInt1257;
					local29 -= local17.anInt1257;
				} while (!this.aClass1_Sub5_Sub4_1.method4450(arg0, local17, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()Lclient!ei;")
	@Override
	public Class1_Sub5 method4442() {
		@Pc(9) Class1_Sub10 local9 = (Class1_Sub10) this.aClass142_18.method3199();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub5_Sub2_1 == null) {
			return this.method4447();
		} else {
			return local9.aClass1_Sub5_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
	@Override
	public int method4441() {
		return 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!dg;)V")
	private void method2280(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub10 arg1) {
		if ((this.aClass1_Sub5_Sub4_1.anIntArray426[arg1.anInt1254] & 0x4) != 0 && arg1.anInt1252 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub5_Sub4_1.anIntArray432[arg1.anInt1254] / Static3.anInt61;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt1251) / local26;
			arg1.anInt1251 = arg0 * local26 + arg1.anInt1251 & 0xFFFFF;
			if (local36 <= arg0) {
				if (this.aClass1_Sub5_Sub4_1.anIntArray434[arg1.anInt1254] == 0) {
					arg1.aClass1_Sub5_Sub2_1 = Static460.method2005(arg1.aClass1_Sub6_Sub1_1, arg1.aClass1_Sub5_Sub2_1.method1996(), arg1.aClass1_Sub5_Sub2_1.method1981(), arg1.aClass1_Sub5_Sub2_1.method1985());
				} else {
					arg1.aClass1_Sub5_Sub2_1 = Static460.method2005(arg1.aClass1_Sub6_Sub1_1, arg1.aClass1_Sub5_Sub2_1.method1996(), 0, arg1.aClass1_Sub5_Sub2_1.method1985());
					this.aClass1_Sub5_Sub4_1.method4456(arg1.aClass1_Sub24_1.aShortArray55[arg1.anInt1264] < 0, arg1);
				}
				if (arg1.aClass1_Sub24_1.aShortArray55[arg1.anInt1264] < 0) {
					arg1.aClass1_Sub5_Sub2_1.method1972(-1);
				}
				arg0 = arg1.anInt1251 / local26;
			}
		}
		arg1.aClass1_Sub5_Sub2_1.method4445(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!dg;[IIII)V")
	private void method2282(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub10 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub5_Sub4_1.anIntArray426[arg1.anInt1254] & 0x4) != 0 && arg1.anInt1252 < 0) {
			@Pc(28) int local28 = this.aClass1_Sub5_Sub4_1.anIntArray432[arg1.anInt1254] / Static3.anInt61;
			while (true) {
				@Pc(39) int local39 = (local28 + 1048575 - arg1.anInt1251) / local28;
				if (local39 > arg4) {
					arg1.anInt1251 += local28 * arg4;
					break;
				}
				arg1.aClass1_Sub5_Sub2_1.method4446(arg2, arg3, local39);
				arg1.anInt1251 += local39 * local28 - 1048576;
				arg4 -= local39;
				arg3 += local39;
				@Pc(74) int local74 = Static3.anInt61 / 100;
				@Pc(78) int local78 = 262144 / local28;
				if (local78 < local74) {
					local74 = local78;
				}
				@Pc(86) Class1_Sub5_Sub2 local86 = arg1.aClass1_Sub5_Sub2_1;
				if (this.aClass1_Sub5_Sub4_1.anIntArray434[arg1.anInt1254] == 0) {
					arg1.aClass1_Sub5_Sub2_1 = Static460.method2005(arg1.aClass1_Sub6_Sub1_1, local86.method1996(), local86.method1981(), local86.method1985());
				} else {
					arg1.aClass1_Sub5_Sub2_1 = Static460.method2005(arg1.aClass1_Sub6_Sub1_1, local86.method1996(), 0, local86.method1985());
					this.aClass1_Sub5_Sub4_1.method4456(arg1.aClass1_Sub24_1.aShortArray55[arg1.anInt1264] < 0, arg1);
					arg1.aClass1_Sub5_Sub2_1.method1987(local74, local86.method1981());
				}
				if (arg1.aClass1_Sub24_1.aShortArray55[arg1.anInt1264] < 0) {
					arg1.aClass1_Sub5_Sub2_1.method1972(-1);
				}
				local86.method1968(local74);
				local86.method4446(arg2, arg3, arg0 - arg3);
				if (local86.method1989()) {
					this.aClass1_Sub5_Sub1_1.method422(local86);
				}
			}
		}
		arg1.aClass1_Sub5_Sub2_1.method4446(arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	@Override
	public void method4445(@OriginalArg(0) int arg0) {
		this.aClass1_Sub5_Sub1_1.method4445(arg0);
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) this.aClass142_18.method3199(); local15 != null; local15 = (Class1_Sub10) this.aClass142_18.method3198()) {
			if (!this.aClass1_Sub5_Sub4_1.method4457(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1257 >= local25) {
						this.method2280(local25, local15);
						local15.anInt1257 -= local25;
						break;
					}
					this.method2280(local15.anInt1257, local15);
					local25 -= local15.anInt1257;
				} while (!this.aClass1_Sub5_Sub4_1.method4450(null, local15, local25, 0));
			}
		}
	}
}
