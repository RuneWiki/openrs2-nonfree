import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class10_Sub4_Sub1 extends Class10_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "S")
	private final short aShort21;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Z")
	private final boolean aBoolean107;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "Z")
	private final boolean aBoolean109;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "Lclient!id;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!as;")
	private Class14_Sub2_Sub2 aClass14_Sub2_Sub2_3;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIZIIIII)V")
	public Class10_Sub4_Sub1(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static74.method4764(arg10, arg11));
		this.aByte15 = (byte) arg2;
		super.anInt4365 = (short) arg3;
		super.anInt4364 = (short) arg5;
		this.aBoolean108 = arg1.anInt1955 != 0 && !arg6;
		this.aByte14 = (byte) arg11;
		this.aShort21 = (short) arg1.anInt1951;
		this.aBoolean107 = arg6;
		this.aByte13 = (byte) arg10;
		this.aBoolean109 = arg0.method5187() && arg1.aBoolean133 && !this.aBoolean107 && Static109.anInt2428 != 0;
		@Pc(73) Class155 local73 = this.method1706(1024, arg0, this.aBoolean109);
		if (local73 != null) {
			this.aClass45_3 = local73.aClass45_7;
			this.aClass14_Sub2_Sub2_3 = local73.aClass14_Sub2_Sub2_6;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		@Pc(14) Class14_Sub2_Sub2 local14;
		if (this.aClass14_Sub2_Sub2_3 == null && this.aBoolean109) {
			@Pc(25) Class155 local25 = this.method1706(131072, arg0, true);
			local14 = local25 == null ? null : local25.aClass14_Sub2_Sub2_6;
		} else {
			local14 = this.aClass14_Sub2_Sub2_3;
			this.aClass14_Sub2_Sub2_3 = null;
		}
		if (local14 != null) {
			Static123.method5341(local14, this.aByte15, super.anInt4365, super.anInt4364, null);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aShort21 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.method1705(arg0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		if (this.aClass45_3 == null) {
			return null;
		}
		@Pc(11) Class51 local11 = arg0.method5145();
		local11.method3548(super.anInt4365 + super.anInt4377, super.anInt4368, super.anInt4371 + super.anInt4364);
		@Pc(35) Class1_Sub8 local35 = null;
		if (this.aBoolean108) {
			local35 = Static182.method3510(1);
		}
		this.aClass45_3.method1794(local11, local35 == null ? null : local35.aClass1_Sub3Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!e;I)Lclient!id;")
	private Class45 method1705(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass45_3 != null && arg0.method5149(this.aClass45_3.method1809(), arg1) == 0) {
			return this.aClass45_3;
		} else {
			@Pc(33) Class155 local33 = this.method1706(arg1, arg0, false);
			return local33 == null ? null : local33.aClass45_7;
		}
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
	@Override
	public int method3921() {
		return this.aClass45_3 == null ? 0 : this.aClass45_3.method1781();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(9) Class45 local9 = this.method1705(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class51 local14 = arg2.method5145();
			local14.method3548(super.anInt4365, super.anInt4368, super.anInt4364);
			return local9.method1823(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aBoolean109;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		@Pc(22) Class14_Sub2_Sub2 local22;
		if (this.aClass14_Sub2_Sub2_3 == null && this.aBoolean109) {
			@Pc(33) Class155 local33 = this.method1706(131072, arg0, true);
			local22 = local33 == null ? null : local33.aClass14_Sub2_Sub2_6;
		} else {
			local22 = this.aClass14_Sub2_Sub2_3;
			this.aClass14_Sub2_Sub2_3 = null;
		}
		if (local22 != null) {
			Static271.method4609(local22, this.aByte15, super.anInt4365, super.anInt4364, null);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLclient!e;Z)Lclient!ns;")
	private Class155 method1706(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class59 local12 = Static232.method2200(this.aShort21 & 0xFFFF);
		@Pc(24) Class114 local24;
		@Pc(19) Class114 local19;
		if (this.aBoolean107) {
			local19 = Static18.aClass114Array1[0];
			local24 = Static341.aClass114Array3[this.aByte15];
		} else {
			if (this.aByte15 < 3) {
				local19 = Static18.aClass114Array1[this.aByte15 + 1];
			} else {
				local19 = null;
			}
			local24 = Static18.aClass114Array1[this.aByte15];
		}
		return local12.method1978(local24, arg2, this.aByte14, arg1, local19, this.aByte13, super.anInt4364, super.anInt4365, super.anInt4368, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
		if (this.aClass45_3 != null) {
			this.aClass45_3.method1807();
		}
	}
}
