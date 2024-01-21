import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Lclient!s;")
	public final Class87 aClass87_19 = new Class87();

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!aj;")
	public final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1();

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Lclient!sb;")
	private final Class1_Sub3_Sub4 aClass1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class1_Sub3_Sub4 arg0) {
		this.aClass1_Sub3_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[ILclient!jg;III)V")
	private void method2048(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class1_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub3_Sub4_2.anIntArray302[arg2.anInt2185] & 0x4) != 0 && arg2.anInt2192 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub3_Sub4_2.anIntArray316[arg2.anInt2185] / Static148.anInt3288;
			while (true) {
				@Pc(33) int local33 = (local23 + 1048575 - arg2.anInt2190) / local23;
				if (local33 > arg0) {
					arg2.anInt2190 += arg0 * local23;
					break;
				}
				arg0 -= local33;
				arg2.aClass1_Sub3_Sub2_3.method2855(arg1, arg4, local33);
				arg4 += local33;
				arg2.anInt2190 += local23 * local33 - 1048576;
				@Pc(64) int local64 = 262144 / local23;
				@Pc(68) int local68 = Static148.anInt3288 / 100;
				if (local64 < local68) {
					local68 = local64;
				}
				@Pc(76) Class1_Sub3_Sub2 local76 = arg2.aClass1_Sub3_Sub2_3;
				if (this.aClass1_Sub3_Sub4_2.anIntArray303[arg2.anInt2185] == 0) {
					arg2.aClass1_Sub3_Sub2_3 = Static215.method1646(arg2.aClass1_Sub9_Sub1_1, local76.method1645(), local76.method1614(), local76.method1638());
				} else {
					arg2.aClass1_Sub3_Sub2_3 = Static215.method1646(arg2.aClass1_Sub9_Sub1_1, local76.method1645(), 0, local76.method1638());
					this.aClass1_Sub3_Sub4_2.method2874(arg2.aClass1_Sub14_1.aShortArray30[arg2.anInt2191] < 0, arg2);
					arg2.aClass1_Sub3_Sub2_3.method1610(local68, local76.method1614());
				}
				if (arg2.aClass1_Sub14_1.aShortArray30[arg2.anInt2191] < 0) {
					arg2.aClass1_Sub3_Sub2_3.method1618(-1);
				}
				local76.method1622(local68);
				local76.method2855(arg1, arg4, arg3 - arg4);
				if (local76.method1620()) {
					this.aClass1_Sub3_Sub1_2.method275(local76);
				}
			}
		}
		arg2.aClass1_Sub3_Sub2_3.method2855(arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!jg;ZI)V")
	private void method2049(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub3_Sub4_2.anIntArray302[arg0.anInt2185] & 0x4) != 0 && arg0.anInt2192 < 0) {
			@Pc(34) int local34 = this.aClass1_Sub3_Sub4_2.anIntArray316[arg0.anInt2185] / Static148.anInt3288;
			@Pc(44) int local44 = (local34 + 1048575 - arg0.anInt2190) / local34;
			arg0.anInt2190 = arg0.anInt2190 + arg1 * local34 & 0xFFFFF;
			if (local44 <= arg1) {
				if (this.aClass1_Sub3_Sub4_2.anIntArray303[arg0.anInt2185] == 0) {
					arg0.aClass1_Sub3_Sub2_3 = Static215.method1646(arg0.aClass1_Sub9_Sub1_1, arg0.aClass1_Sub3_Sub2_3.method1645(), arg0.aClass1_Sub3_Sub2_3.method1614(), arg0.aClass1_Sub3_Sub2_3.method1638());
				} else {
					arg0.aClass1_Sub3_Sub2_3 = Static215.method1646(arg0.aClass1_Sub9_Sub1_1, arg0.aClass1_Sub3_Sub2_3.method1645(), 0, arg0.aClass1_Sub3_Sub2_3.method1638());
					this.aClass1_Sub3_Sub4_2.method2874(arg0.aClass1_Sub14_1.aShortArray30[arg0.anInt2191] < 0, arg0);
				}
				if (arg0.aClass1_Sub14_1.aShortArray30[arg0.anInt2191] < 0) {
					arg0.aClass1_Sub3_Sub2_3.method1618(-1);
				}
				arg1 = arg0.anInt2190 / local34;
			}
		}
		arg0.aClass1_Sub3_Sub2_3.method2858(arg1);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	@Override
	public int method2856() {
		return 0;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()Lclient!rd;")
	@Override
	public Class1_Sub3 method2860() {
		@Pc(9) Class1_Sub12 local9;
		do {
			local9 = (Class1_Sub12) this.aClass87_19.method2830();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub3_Sub2_3 == null);
		return local9.aClass1_Sub3_Sub2_3;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	@Override
	public void method2858(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3_Sub1_2.method2858(arg0);
		for (@Pc(11) Class1_Sub12 local11 = (Class1_Sub12) this.aClass87_19.method2827(); local11 != null; local11 = (Class1_Sub12) this.aClass87_19.method2830()) {
			if (!this.aClass1_Sub3_Sub4_2.method2861(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local11.anInt2200 >= local21) {
						this.method2049(local11, local21);
						local11.anInt2200 -= local21;
						break;
					}
					this.method2049(local11, local11.anInt2200);
					local21 -= local11.anInt2200;
				} while (!this.aClass1_Sub3_Sub4_2.method2885(0, local21, local11, null));
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()Lclient!rd;")
	@Override
	public Class1_Sub3 method2854() {
		@Pc(9) Class1_Sub12 local9 = (Class1_Sub12) this.aClass87_19.method2827();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub3_Sub2_3 == null) {
			return this.method2860();
		} else {
			return local9.aClass1_Sub3_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([III)V")
	@Override
	public void method2855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub3_Sub1_2.method2855(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub12 local17 = (Class1_Sub12) this.aClass87_19.method2827(); local17 != null; local17 = (Class1_Sub12) this.aClass87_19.method2830()) {
			if (!this.aClass1_Sub3_Sub4_2.method2861(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2200 >= local29) {
						this.method2048(local29, arg0, local17, local29 + local27, local27);
						local17.anInt2200 -= local29;
						break;
					}
					this.method2048(local17.anInt2200, arg0, local17, local27 + local29, local27);
					local27 += local17.anInt2200;
					local29 -= local17.anInt2200;
				} while (!this.aClass1_Sub3_Sub4_2.method2885(local27, local29, local17, arg0));
			}
		}
	}
}
