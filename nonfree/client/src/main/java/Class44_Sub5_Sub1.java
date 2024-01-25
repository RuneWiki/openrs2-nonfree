import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class44_Sub5_Sub1 extends Class44_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "Z")
	private final boolean aBoolean238;

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "Z")
	private final boolean aBoolean241;

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "S")
	private final short aShort47;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!lk", name = "W", descriptor = "Lclient!rc;")
	public Class78 aClass78_4;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "Lclient!sr;")
	private Class6_Sub2_Sub17 aClass6_Sub2_Sub17_3;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIZIIZ)V")
	public Class44_Sub5_Sub1(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static340.method579(arg7, arg8));
		this.aBoolean238 = arg1.anInt1476 != 0;
		this.aByte50 = (byte) arg7;
		this.aBoolean239 = arg9;
		this.aBoolean241 = arg6;
		this.aShort47 = (short) arg1.anInt1497;
		this.aByte49 = (byte) arg2;
		super.anInt5412 = (short) arg5;
		this.aByte51 = (byte) arg8;
		super.anInt5417 = (short) arg3;
		this.aBoolean240 = arg0.method3011() && arg1.aBoolean108 && !this.aBoolean241 && Static282.anInt5340 != 0;
		@Pc(68) int local68 = 1024;
		if (this.aBoolean239) {
			local68 |= 0x8000;
		}
		@Pc(83) Class150 local83 = this.method3435(local68, this.aBoolean240, arg0);
		if (local83 != null) {
			this.aClass78_4 = local83.aClass78_5;
			this.aClass6_Sub2_Sub17_3 = local83.aClass6_Sub2_Sub17_4;
			if (this.aBoolean239) {
				this.aClass78_4 = this.aClass78_4.method4661((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aShort47 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ja;II)Lclient!rc;")
	private Class78 method3431(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass78_4 != null && arg0.method2958(this.aClass78_4.method4652(), arg1) == 0) {
			return this.aClass78_4;
		} else {
			@Pc(32) Class150 local32 = this.method3435(arg1, false, arg0);
			return local32 == null ? null : local32.aClass78_5;
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return this.aBoolean239;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aBoolean240;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		if (this.aClass78_4 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2990();
		local11.method4067(super.anInt5417, super.anInt5414, super.anInt5412);
		@Pc(30) Class20_Sub6 local30 = null;
		if (this.aBoolean238) {
			local30 = Static208.method5776(1);
		}
		this.aClass78_4.method4649(local11, local30 == null ? null : local30.aClass20_Sub8Array1[0], 0);
		return local30;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZLclient!ja;)Lclient!ob;")
	private Class150 method3435(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class81 arg2) {
		@Pc(12) Class66 local12 = Static196.method3622(this.aShort47 & 0xFFFF);
		@Pc(25) Class106 local25;
		@Pc(33) Class106 local33;
		if (this.aBoolean241) {
			local25 = Static84.aClass106Array1[this.aByte49];
			local33 = Static99.aClass106Array4[0];
		} else {
			local25 = Static99.aClass106Array4[this.aByte49];
			if (this.aByte49 >= 3) {
				local33 = null;
			} else {
				local33 = Static99.aClass106Array4[this.aByte49 + 1];
			}
		}
		return local12.method1365(this.aByte50, arg2, arg1, super.anInt5414, local33, super.anInt5417, this.aByte51, arg0, local25, super.anInt5412);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		this.aBoolean239 = false;
		if (this.aClass78_4 != null) {
			this.aClass78_4.method4624(this.aClass78_4.method4652() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aByte51;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		@Pc(33) Class6_Sub2_Sub17 local33;
		if (this.aClass6_Sub2_Sub17_3 == null && this.aBoolean240) {
			@Pc(26) Class150 local26 = this.method3435(131072, true, arg0);
			local33 = local26 == null ? null : local26.aClass6_Sub2_Sub17_4;
		} else {
			local33 = this.aClass6_Sub2_Sub17_3;
			this.aClass6_Sub2_Sub17_3 = null;
		}
		if (local33 != null) {
			Static203.method3663(local33, this.aByte49, super.anInt5417, super.anInt5412, null);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class78 local9 = this.method3431(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class72 local14 = arg1.method2990();
			local14.method4067(super.anInt5417, super.anInt5414, super.anInt5412);
			return local9.method4644(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		@Pc(14) Class6_Sub2_Sub17 local14;
		if (this.aClass6_Sub2_Sub17_3 == null && this.aBoolean240) {
			@Pc(25) Class150 local25 = this.method3435(131072, true, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub17_4;
		} else {
			local14 = this.aClass6_Sub2_Sub17_3;
			this.aClass6_Sub2_Sub17_3 = null;
		}
		if (local14 != null) {
			Static318.method5322(local14, this.aByte49, super.anInt5417, super.anInt5412, null);
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
		if (this.aClass78_4 != null) {
			this.aClass78_4.method4633();
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aByte50;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		if (arg4 instanceof Class44_Sub5_Sub1) {
			@Pc(32) Class44_Sub5_Sub1 local32 = (Class44_Sub5_Sub1) arg4;
			if (this.aClass78_4 != null && local32.aClass78_4 != null) {
				this.aClass78_4.method4627(local32.aClass78_4, arg2, arg0, arg3, arg1);
			}
		} else if (arg4 instanceof Class44_Sub4_Sub5) {
			@Pc(12) Class44_Sub4_Sub5 local12 = (Class44_Sub4_Sub5) arg4;
			if (this.aClass78_4 != null && local12.aClass78_7 != null) {
				this.aClass78_4.method4627(local12.aClass78_7, arg2, arg0, arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.method3431(arg1, arg0);
	}
}
