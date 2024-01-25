import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class10_Sub3_Sub1 extends Class10_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "S")
	private final short aShort9;

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "Z")
	private final boolean aBoolean44;

	@OriginalMember(owner = "client!ca", name = "W", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!id;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!ca", name = "db", descriptor = "Lclient!as;")
	private Class14_Sub2_Sub2 aClass14_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIIZIIIIIIZ)V")
	public Class10_Sub3_Sub1(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1938 == 1, Static290.method4973(arg13, arg12));
		this.aBoolean43 = arg14;
		this.aShort9 = (short) arg1.anInt1951;
		this.aByte7 = (byte) arg12;
		this.aByte6 = (byte) arg3;
		this.aBoolean45 = arg1.anInt1955 != 0 && !arg7;
		this.aBoolean44 = arg7;
		this.aByte8 = (byte) arg13;
		this.aBoolean42 = arg0.method5187() && arg1.aBoolean133 && !this.aBoolean44 && Static109.anInt2428 != 0;
		@Pc(77) int local77 = 1024;
		if (this.aBoolean43) {
			local77 |= 0x8000;
		}
		@Pc(92) Class155 local92 = this.method834(this.aBoolean42, arg0, local77);
		if (local92 != null) {
			this.aClass45_1 = local92.aClass45_7;
			this.aClass14_Sub2_Sub2_1 = local92.aClass14_Sub2_Sub2_6;
			if (this.aBoolean43) {
				this.aClass45_1 = this.aClass45_1.method1793((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aBoolean42;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
		if (this.aClass45_1 != null) {
			this.aClass45_1.method1807();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)I")
	@Override
	public int method5345() {
		return this.aClass45_1 == null ? 0 : this.aClass45_1.method1781();
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return this.aBoolean43;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		if (this.aClass45_1 == null) {
			return null;
		}
		@Pc(18) Class51 local18 = arg0.method5145();
		local18.method3548(super.anInt5910, super.anInt5907, super.anInt5908);
		@Pc(28) Class1_Sub8 local28 = null;
		if (this.aBoolean45) {
			local28 = Static182.method3510(1);
		}
		this.aClass45_1.method1794(local18, local28 == null ? null : local28.aClass1_Sub3Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		this.aBoolean43 = false;
		if (this.aClass45_1 != null) {
			this.aClass45_1.method1782(this.aClass45_1.method1809() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(9) Class45 local9 = this.method832(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class51 local14 = arg2.method5145();
			local14.method3548(super.anInt5910, super.anInt5907, super.anInt5908);
			return local9.method1823(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!e;B)Lclient!id;")
	private Class45 method832(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		if (this.aClass45_1 != null && arg1.method5149(this.aClass45_1.method1809(), arg0) == 0) {
			return this.aClass45_1;
		} else {
			@Pc(32) Class155 local32 = this.method834(false, arg1, arg0);
			return local32 == null ? null : local32.aClass45_7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class10_Sub2_Sub2) {
			@Pc(34) Class10_Sub2_Sub2 local34 = (Class10_Sub2_Sub2) arg4;
			if (this.aClass45_1 == null || local34.aClass45_5 == null) {
				return;
			}
			this.aClass45_1.method1816(local34.aClass45_5, arg5, arg2, arg0, arg3);
		} else if (arg4 instanceof Class10_Sub3_Sub1) {
			@Pc(15) Class10_Sub3_Sub1 local15 = (Class10_Sub3_Sub1) arg4;
			if (this.aClass45_1 != null && local15.aClass45_1 != null) {
				this.aClass45_1.method1816(local15.aClass45_1, arg5, arg2, arg0, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		@Pc(31) Class14_Sub2_Sub2 local31;
		if (this.aClass14_Sub2_Sub2_1 == null && this.aBoolean42) {
			@Pc(24) Class155 local24 = this.method834(true, arg0, 131072);
			local31 = local24 == null ? null : local24.aClass14_Sub2_Sub2_6;
		} else {
			local31 = this.aClass14_Sub2_Sub2_1;
			this.aClass14_Sub2_Sub2_1 = null;
		}
		if (local31 != null) {
			Static123.method5341(local31, this.aByte6, super.anInt5910, super.anInt5908, null);
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)I")
	public int method833() {
		return this.aClass45_1 == null ? 15 : this.aClass45_1.method1791() / 4;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!e;ZI)Lclient!ns;")
	private Class155 method834(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class59 local18 = Static232.method2200(this.aShort9 & 0xFFFF);
		@Pc(26) Class114 local26;
		@Pc(39) Class114 local39;
		if (this.aBoolean44) {
			local39 = Static18.aClass114Array1[0];
			local26 = Static341.aClass114Array3[this.aByte6];
		} else {
			local26 = Static18.aClass114Array1[this.aByte6];
			if (this.aByte6 < 3) {
				local39 = Static18.aClass114Array1[this.aByte6 + 1];
			} else {
				local39 = null;
			}
		}
		return local18.method1978(local26, arg0, this.aByte7 == 11 ? this.aByte8 + 4 : this.aByte8, arg1, local39, this.aByte7 == 11 ? 10 : this.aByte7, super.anInt5908, super.anInt5910, super.anInt5907, arg2);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aShort9 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		@Pc(22) Class14_Sub2_Sub2 local22;
		if (this.aClass14_Sub2_Sub2_1 == null && this.aBoolean42) {
			@Pc(33) Class155 local33 = this.method834(true, arg0, 131072);
			local22 = local33 == null ? null : local33.aClass14_Sub2_Sub2_6;
		} else {
			local22 = this.aClass14_Sub2_Sub2_1;
			this.aClass14_Sub2_Sub2_1 = null;
		}
		if (local22 != null) {
			Static271.method4609(local22, this.aByte6, super.anInt5910, super.anInt5908, null);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.method832(arg1, arg0);
	}
}
