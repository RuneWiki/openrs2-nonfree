import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class47_Sub5_Sub1 extends Class47_Sub5 implements Interface11 {

	@OriginalMember(owner = "client!ew", name = "t", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!ew", name = "F", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!ew", name = "N", descriptor = "Z")
	private final boolean aBoolean151;

	@OriginalMember(owner = "client!ew", name = "P", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!ew", name = "G", descriptor = "Z")
	private final boolean aBoolean150;

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!ew", name = "Y", descriptor = "Z")
	private final boolean aBoolean153;

	@OriginalMember(owner = "client!ew", name = "J", descriptor = "Lclient!c;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "Lclient!j;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIZIZ)V")
	public Class47_Sub5_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean52, arg1.aBoolean45);
		this.aShort33 = (short) arg1.anInt545;
		this.aByte24 = (byte) arg2;
		this.aBoolean151 = arg6;
		super.anInt4037 = arg5;
		this.aBoolean152 = arg8;
		super.anInt4036 = arg3;
		this.aBoolean150 = arg1.anInt550 != 0 && !arg6;
		this.aByte23 = (byte) arg7;
		this.aBoolean153 = arg0.method4638() && arg1.aBoolean44 && !this.aBoolean151 && Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) != 0;
		@Pc(70) int local70 = 2048;
		if (this.aBoolean152) {
			local70 |= 0x10000;
		}
		@Pc(85) Class209 local85 = this.method1592(this.aBoolean153, local70, arg0);
		if (local85 != null) {
			this.aClass37_4 = local85.aClass37_6;
			this.aClass1_Sub1_Sub3_3 = local85.aClass1_Sub1_Sub3_5;
			if (this.aBoolean152) {
				this.aClass37_4 = this.aClass37_4.method4155((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aBoolean153;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		@Pc(19) Class1_Sub1_Sub3 local19;
		if (this.aClass1_Sub1_Sub3_3 == null && this.aBoolean153) {
			@Pc(30) Class209 local30 = this.method1592(true, 262144, arg0);
			local19 = local30 == null ? null : local30.aClass1_Sub1_Sub3_5;
		} else {
			local19 = this.aClass1_Sub1_Sub3_3;
			this.aClass1_Sub1_Sub3_3 = null;
		}
		if (local19 != null) {
			Static317.method4368(local19, this.aByte24, super.anInt4036, super.anInt4037, null);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(9) Class37 local9 = this.method1595(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class43 local14 = arg2.method4588();
			local14.R(super.anInt4036, super.anInt4033, super.anInt4037);
			return local9.method4166(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		@Pc(31) Class1_Sub1_Sub3 local31;
		if (this.aClass1_Sub1_Sub3_3 == null && this.aBoolean153) {
			@Pc(24) Class209 local24 = this.method1592(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub3_5;
		} else {
			local31 = this.aClass1_Sub1_Sub3_3;
			this.aClass1_Sub1_Sub3_3 = null;
		}
		if (local31 != null) {
			Static1.method23(local31, this.aByte24, super.anInt4036, super.anInt4037, null);
		}
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		this.aBoolean152 = false;
		if (this.aClass37_4 != null) {
			this.aClass37_4.u(this.aClass37_4.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZIBLclient!qa;)Lclient!rl;")
	private Class209 method1592(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(20) Class29 local20 = Static251.aClass207_2.method4977(this.aShort33 & 0xFFFF);
		@Pc(28) Class70 local28;
		@Pc(39) Class70 local39;
		if (this.aBoolean151) {
			local28 = Static315.aClass70Array3[this.aByte24];
			local39 = Static60.aClass70Array1[0];
		} else {
			local28 = Static60.aClass70Array1[this.aByte24];
			if (this.aByte24 < 3) {
				local39 = Static60.aClass70Array1[this.aByte24 + 1];
			} else {
				local39 = null;
			}
		}
		return local20.method464(arg2, local39, super.anInt4033, 22, super.anInt4036, this.aByte23, arg0, super.anInt4037, arg1, local28);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class47_Sub5_Sub1) {
			@Pc(9) Class47_Sub5_Sub1 local9 = (Class47_Sub5_Sub1) arg4;
			if (this.aClass37_4 != null && local9.aClass37_4 != null) {
				this.aClass37_4.method4165(local9.aClass37_4, arg1, arg0, arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method1595(arg1, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!qa;BI)Lclient!c;")
	private Class37 method1595(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass37_4 != null && arg0.method4634(this.aClass37_4.n(), arg1) == 0) {
			return this.aClass37_4;
		} else {
			@Pc(31) Class209 local31 = this.method1592(false, arg1, arg0);
			return local31 == null ? null : local31.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		if (this.aClass37_4 == null) {
			return null;
		}
		@Pc(11) Class43 local11 = arg0.method4588();
		local11.R(super.anInt4036, super.anInt4033, super.anInt4037);
		@Pc(21) Class36_Sub1 local21 = null;
		if (this.aBoolean150) {
			local21 = Static309.method4241(1);
		}
		this.aClass37_4.method4167(local11, local21 == null ? null : local21.aClass36_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
		if (this.aClass37_4 != null) {
			this.aClass37_4.method4158();
		}
	}

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return this.aBoolean152;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return 22;
	}
}
