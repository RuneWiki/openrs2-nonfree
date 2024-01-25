import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class10_Sub5_Sub1 extends Class10_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "Z")
	private final boolean aBoolean75;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "S")
	private final short aShort10;

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "Z")
	private final boolean aBoolean78;

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "Lclient!as;")
	private Class14_Sub2_Sub2 aClass14_Sub2_Sub2_2;

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Lclient!id;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIZIZ)V")
	public Class10_Sub5_Sub1(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean129, arg1.aBoolean127);
		super.anInt4530 = (short) arg5;
		this.aByte10 = (byte) arg7;
		this.aBoolean77 = arg8;
		this.aBoolean75 = arg1.anInt1955 != 0 && !arg6;
		super.anInt4527 = (short) arg3;
		this.aShort10 = (short) arg1.anInt1951;
		this.aByte9 = (byte) arg2;
		this.aBoolean78 = arg6;
		this.aBoolean76 = arg0.method5187() && arg1.aBoolean133 && !this.aBoolean78 && Static109.anInt2428 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean77) {
			local66 |= 0x8000;
		}
		@Pc(81) Class155 local81 = this.method1082(local66, this.aBoolean76, arg0);
		if (local81 != null) {
			this.aClass14_Sub2_Sub2_2 = local81.aClass14_Sub2_Sub2_6;
			this.aClass45_2 = local81.aClass45_7;
			if (this.aBoolean77) {
				this.aClass45_2 = this.aClass45_2.method1793((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(9) Class45 local9 = this.method1080(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class51 local14 = arg2.method5145();
			local14.method3548(super.anInt4527, super.anInt4528, super.anInt4530);
			return local9.method1823(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		@Pc(22) Class14_Sub2_Sub2 local22;
		if (this.aClass14_Sub2_Sub2_2 == null && this.aBoolean76) {
			@Pc(33) Class155 local33 = this.method1082(131072, true, arg0);
			local22 = local33 == null ? null : local33.aClass14_Sub2_Sub2_6;
		} else {
			local22 = this.aClass14_Sub2_Sub2_2;
			this.aClass14_Sub2_Sub2_2 = null;
		}
		if (local22 != null) {
			Static271.method4609(local22, this.aByte9, super.anInt4527, super.anInt4530, null);
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return this.aBoolean77;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		if (this.aClass45_2 == null) {
			return null;
		}
		@Pc(11) Class51 local11 = arg0.method5145();
		local11.method3548(super.anInt4527, super.anInt4528, super.anInt4530);
		@Pc(31) Class1_Sub8 local31 = null;
		if (this.aBoolean75) {
			local31 = Static182.method3510(1);
		}
		this.aClass45_2.method1794(local11, local31 == null ? null : local31.aClass1_Sub3Array1[0], 0);
		return local31;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aShort10 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		@Pc(34) Class14_Sub2_Sub2 local34;
		if (this.aClass14_Sub2_Sub2_2 == null && this.aBoolean76) {
			@Pc(27) Class155 local27 = this.method1082(131072, true, arg0);
			local34 = local27 == null ? null : local27.aClass14_Sub2_Sub2_6;
		} else {
			local34 = this.aClass14_Sub2_Sub2_2;
			this.aClass14_Sub2_Sub2_2 = null;
		}
		if (local34 != null) {
			Static123.method5341(local34, this.aByte9, super.anInt4527, super.anInt4530, null);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BILclient!e;)Lclient!id;")
	private Class45 method1080(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1) {
		if (this.aClass45_2 != null && arg1.method5149(this.aClass45_2.method1809(), arg0) == 0) {
			return this.aClass45_2;
		} else {
			@Pc(28) Class155 local28 = this.method1082(arg0, false, arg1);
			return local28 == null ? null : local28.aClass45_7;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aBoolean76;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return 22;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		if (!(arg4 instanceof Class10_Sub5_Sub1)) {
			return;
		}
		@Pc(12) Class10_Sub5_Sub1 local12 = (Class10_Sub5_Sub1) arg4;
		if (this.aClass45_2 != null && local12.aClass45_2 != null) {
			this.aClass45_2.method1816(local12.aClass45_2, arg5, arg2, arg0, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZBLclient!e;)Lclient!ns;")
	private Class155 method1082(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(18) Class59 local18 = Static232.method2200(this.aShort10 & 0xFFFF);
		@Pc(26) Class114 local26;
		@Pc(30) Class114 local30;
		if (this.aBoolean78) {
			local26 = Static341.aClass114Array3[this.aByte9];
			local30 = Static18.aClass114Array1[0];
		} else {
			local26 = Static18.aClass114Array1[this.aByte9];
			if (this.aByte9 < 3) {
				local30 = Static18.aClass114Array1[this.aByte9 + 1];
			} else {
				local30 = null;
			}
		}
		return local18.method1978(local26, arg1, this.aByte10, arg2, local30, 22, super.anInt4530, super.anInt4527, super.anInt4528, arg0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
		if (this.aClass45_2 != null) {
			this.aClass45_2.method1807();
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		this.aBoolean77 = false;
		if (this.aClass45_2 != null) {
			this.aClass45_2.method1782(this.aClass45_2.method1809() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.method1080(arg1, arg0);
	}
}
