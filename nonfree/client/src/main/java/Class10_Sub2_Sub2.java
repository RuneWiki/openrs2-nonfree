import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class10_Sub2_Sub2 extends Class10_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!gs", name = "I", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!gs", name = "H", descriptor = "S")
	private final short aShort31;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "Z")
	private final boolean aBoolean175;

	@OriginalMember(owner = "client!gs", name = "W", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!gs", name = "K", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "Z")
	private final boolean aBoolean174;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Z")
	private final boolean aBoolean171;

	@OriginalMember(owner = "client!gs", name = "F", descriptor = "Lclient!as;")
	private Class14_Sub2_Sub2 aClass14_Sub2_Sub2_4;

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "Lclient!id;")
	public Class45 aClass45_5;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIZIIZ)V")
	public Class10_Sub2_Sub2(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static233.method4081(arg8, arg7));
		this.aByte20 = (byte) arg8;
		this.aShort31 = (short) arg1.anInt1951;
		this.aByte19 = (byte) arg7;
		this.aBoolean175 = arg6;
		super.anInt2442 = (short) arg3;
		this.aBoolean176 = arg9;
		this.aByte21 = (byte) arg2;
		super.anInt2438 = (short) arg5;
		this.aBoolean174 = arg1.anInt1955 != 0 && !arg6;
		this.aBoolean171 = arg0.method5187() && arg1.aBoolean133 && !this.aBoolean175 && Static109.anInt2428 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean176) {
			local67 |= 0x8000;
		}
		@Pc(82) Class155 local82 = this.method2378(local67, arg0, this.aBoolean171);
		if (local82 != null) {
			this.aClass14_Sub2_Sub2_4 = local82.aClass14_Sub2_Sub2_6;
			this.aClass45_5 = local82.aClass45_7;
			if (this.aBoolean176) {
				this.aClass45_5 = this.aClass45_5.method1793((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class10_Sub2_Sub2) {
			@Pc(32) Class10_Sub2_Sub2 local32 = (Class10_Sub2_Sub2) arg4;
			if (this.aClass45_5 != null && local32.aClass45_5 != null) {
				this.aClass45_5.method1816(local32.aClass45_5, arg5, arg2, arg0, arg3);
			}
		} else if (arg4 instanceof Class10_Sub3_Sub1) {
			@Pc(12) Class10_Sub3_Sub1 local12 = (Class10_Sub3_Sub1) arg4;
			if (this.aClass45_5 != null && local12.aClass45_1 != null) {
				this.aClass45_5.method1816(local12.aClass45_1, arg5, arg2, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(Lclient!e;IB)Lclient!id;")
	private Class45 method2376(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass45_5 != null && arg0.method5149(this.aClass45_5.method1809(), arg1) == 0) {
			return this.aClass45_5;
		} else {
			@Pc(28) Class155 local28 = this.method2378(arg1, arg0, false);
			return local28 == null ? null : local28.aClass45_7;
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(9) Class45 local9 = this.method2376(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class51 local14 = arg2.method5145();
			local14.method3548(super.anInt2442, super.anInt2443, super.anInt2438);
			return local9.method1823(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		if (this.aClass45_5 == null) {
			return null;
		}
		@Pc(16) Class51 local16 = arg0.method5145();
		local16.method3548(super.anInt2442, super.anInt2443, super.anInt2438);
		@Pc(26) Class1_Sub8 local26 = null;
		if (this.aBoolean174) {
			local26 = Static182.method3510(1);
		}
		this.aClass45_5.method1794(local16, local26 == null ? null : local26.aClass1_Sub3Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aBoolean171;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILclient!e;Z)Lclient!ns;")
	private Class155 method2378(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class59 local12 = Static232.method2200(this.aShort31 & 0xFFFF);
		@Pc(25) Class114 local25;
		@Pc(29) Class114 local29;
		if (this.aBoolean175) {
			local25 = Static341.aClass114Array3[this.aByte21];
			local29 = Static18.aClass114Array1[0];
		} else {
			if (this.aByte21 < 3) {
				local29 = Static18.aClass114Array1[this.aByte21 + 1];
			} else {
				local29 = null;
			}
			local25 = Static18.aClass114Array1[this.aByte21];
		}
		return local12.method1978(local25, arg2, this.aByte20, arg1, local29, this.aByte19, super.anInt2438, super.anInt2442, super.anInt2443, arg0);
	}

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		this.aBoolean176 = false;
		if (this.aClass45_5 != null) {
			this.aClass45_5.method1782(this.aClass45_5.method1809() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		@Pc(25) Class14_Sub2_Sub2 local25;
		if (this.aClass14_Sub2_Sub2_4 == null && this.aBoolean171) {
			@Pc(18) Class155 local18 = this.method2378(131072, arg0, true);
			local25 = local18 == null ? null : local18.aClass14_Sub2_Sub2_6;
		} else {
			local25 = this.aClass14_Sub2_Sub2_4;
			this.aClass14_Sub2_Sub2_4 = null;
		}
		if (local25 != null) {
			Static271.method4609(local25, this.aByte21, super.anInt2442, super.anInt2438, null);
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aShort31 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
		if (this.aClass45_5 != null) {
			this.aClass45_5.method1807();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		@Pc(31) Class14_Sub2_Sub2 local31;
		if (this.aClass14_Sub2_Sub2_4 == null && this.aBoolean171) {
			@Pc(24) Class155 local24 = this.method2378(131072, arg0, true);
			local31 = local24 == null ? null : local24.aClass14_Sub2_Sub2_6;
		} else {
			local31 = this.aClass14_Sub2_Sub2_4;
			this.aClass14_Sub2_Sub2_4 = null;
		}
		if (local31 != null) {
			Static123.method5341(local31, this.aByte21, super.anInt2442, super.anInt2438, null);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.method2376(arg0, arg1);
	}
}
