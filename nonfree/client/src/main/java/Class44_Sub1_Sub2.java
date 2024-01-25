import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class44_Sub1_Sub2 extends Class44_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!tm", name = "bb", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "B")
	private final byte aByte86;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "B")
	private final byte aByte87;

	@OriginalMember(owner = "client!tm", name = "P", descriptor = "Z")
	private final boolean aBoolean389;

	@OriginalMember(owner = "client!tm", name = "R", descriptor = "S")
	private final short aShort84;

	@OriginalMember(owner = "client!tm", name = "Q", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!tm", name = "O", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "Lclient!sr;")
	private Class6_Sub2_Sub17 aClass6_Sub2_Sub17_5;

	@OriginalMember(owner = "client!tm", name = "D", descriptor = "Lclient!rc;")
	private Class78 aClass78_6;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIZIIIII)V")
	public Class44_Sub1_Sub2(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static205.method5725(arg11, arg10));
		this.aBoolean390 = arg6;
		this.aByte86 = (byte) arg11;
		this.aByte87 = (byte) arg2;
		this.aBoolean389 = arg1.anInt1476 != 0;
		this.aShort84 = (short) arg1.anInt1497;
		super.anInt5759 = (short) arg5;
		super.anInt5763 = (short) arg3;
		this.aByte88 = (byte) arg10;
		this.aBoolean388 = arg0.method3011() && arg1.aBoolean108 && !this.aBoolean390 && Static282.anInt5340 != 0;
		@Pc(77) Class150 local77 = this.method5244(1024, this.aBoolean388, arg0);
		if (local77 != null) {
			this.aClass6_Sub2_Sub17_5 = local77.aClass6_Sub2_Sub17_4;
			this.aClass78_6 = local77.aClass78_5;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class78 local15 = this.method5242(arg1, 65536);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class72 local20 = arg1.method2990();
			local20.method4067(super.anInt5763, super.anInt5756, super.anInt5759);
			return local15.method4644(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aShort84 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
		if (this.aClass78_6 != null) {
			this.aClass78_6.method4633();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.method5242(arg1, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aBoolean388;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ja;II)Lclient!rc;")
	private Class78 method5242(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass78_6 != null && arg0.method2958(this.aClass78_6.method4652(), arg1) == 0) {
			return this.aClass78_6;
		} else {
			@Pc(28) Class150 local28 = this.method5244(arg1, false, arg0);
			return local28 == null ? null : local28.aClass78_5;
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		@Pc(29) Class6_Sub2_Sub17 local29;
		if (this.aClass6_Sub2_Sub17_5 == null && this.aBoolean388) {
			@Pc(22) Class150 local22 = this.method5244(131072, true, arg0);
			local29 = local22 == null ? null : local22.aClass6_Sub2_Sub17_4;
		} else {
			local29 = this.aClass6_Sub2_Sub17_5;
			this.aClass6_Sub2_Sub17_5 = null;
		}
		if (local29 != null) {
			Static318.method5322(local29, this.aByte87, super.anInt5763, super.anInt5759, null);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIZLclient!ja;)Lclient!ob;")
	private Class150 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class81 arg2) {
		@Pc(20) Class66 local20 = Static196.method3622(this.aShort84 & 0xFFFF);
		@Pc(45) Class106 local45;
		@Pc(31) Class106 local31;
		if (this.aBoolean390) {
			local45 = Static84.aClass106Array1[this.aByte87];
			local31 = Static99.aClass106Array4[0];
		} else {
			if (this.aByte87 >= 3) {
				local31 = null;
			} else {
				local31 = Static99.aClass106Array4[this.aByte87 + 1];
			}
			local45 = Static99.aClass106Array4[this.aByte87];
		}
		return local20.method1365(this.aByte88, arg2, arg1, super.anInt5756, local31, super.anInt5763, this.aByte86, arg0, local45, super.anInt5759);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		if (this.aClass78_6 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2990();
		local11.method4067(super.anInt5763 + super.anInt5762, super.anInt5756, super.anInt5759 + super.anInt5761);
		@Pc(32) Class20_Sub6 local32 = null;
		if (this.aBoolean389) {
			local32 = Static208.method5776(1);
		}
		this.aClass78_6.method4649(local11, local32 == null ? null : local32.aClass20_Sub8Array1[0], 0);
		return local32;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		@Pc(22) Class6_Sub2_Sub17 local22;
		if (this.aClass6_Sub2_Sub17_5 == null && this.aBoolean388) {
			@Pc(33) Class150 local33 = this.method5244(131072, true, arg0);
			local22 = local33 == null ? null : local33.aClass6_Sub2_Sub17_4;
		} else {
			local22 = this.aClass6_Sub2_Sub17_5;
			this.aClass6_Sub2_Sub17_5 = null;
		}
		if (local22 != null) {
			Static203.method3663(local22, this.aByte87, super.anInt5763, super.anInt5759, null);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aByte86;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)I")
	@Override
	public int method5230() {
		return this.aClass78_6 == null ? 0 : this.aClass78_6.method4639();
	}
}
