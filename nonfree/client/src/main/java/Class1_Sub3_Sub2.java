import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	private final boolean aBoolean155;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "B")
	private final byte aByte33;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Z")
	private final boolean aBoolean156;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "Z")
	private final boolean aBoolean154;

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!c;")
	public Class31 aClass31_3;

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "Lclient!j;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_3;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIIZIIIIIIZ)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4007 == 1, Static366.method5146(arg13, arg12));
		this.aBoolean155 = arg7;
		this.aByte33 = (byte) arg3;
		this.aByte32 = (byte) arg12;
		this.aShort60 = (short) arg1.anInt4027;
		this.aByte31 = (byte) arg13;
		this.aBoolean157 = arg14;
		this.aBoolean156 = arg1.anInt4009 != 0 && !arg7;
		this.aBoolean154 = arg0.method2626() && arg1.aBoolean324 && !this.aBoolean155 && Static123.aClass21_Sub1_1.method775(Static347.anInt6318) != 0;
		@Pc(76) int local76 = 2048;
		if (this.aBoolean157) {
			local76 |= 0x10000;
		}
		@Pc(91) Class48 local91 = this.method1520(local76, this.aBoolean154, arg0);
		if (local91 != null) {
			this.aClass31_3 = local91.aClass31_2;
			this.aClass3_Sub3_Sub4_3 = local91.aClass3_Sub3_Sub4_2;
			if (this.aBoolean157) {
				this.aClass31_3 = this.aClass31_3.method5710((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aBoolean154;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		this.aBoolean157 = false;
		if (this.aClass31_3 != null) {
			this.aClass31_3.u(this.aClass31_3.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)I")
	@Override
	public int method4828() {
		return this.aClass31_3 == null ? 0 : this.aClass31_3.b();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		@Pc(25) Class3_Sub3_Sub4 local25;
		if (this.aClass3_Sub3_Sub4_3 == null && this.aBoolean154) {
			@Pc(18) Class48 local18 = this.method1520(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub3_Sub4_2;
		} else {
			local25 = this.aClass3_Sub3_Sub4_3;
			this.aClass3_Sub3_Sub4_3 = null;
		}
		if (local25 != null) {
			Static229.method3575(local25, this.aByte33, super.anInt6053, super.anInt6055, null);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.method1522(arg0, arg1);
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return this.aBoolean157;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		if (this.aClass31_3 == null) {
			return null;
		}
		@Pc(11) Class106 local11 = arg0.method2587();
		local11.R(super.anInt6053, super.anInt6045, super.anInt6055);
		@Pc(29) Class13_Sub7 local29 = null;
		if (this.aBoolean156) {
			local29 = Static120.method2160(1);
		}
		this.aClass31_3.method5704(local11, local29 == null ? null : local29.aClass13_Sub1Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IZILclient!qa;)Lclient!df;")
	private Class48 method1520(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(11) Class128 local11 = Static55.aClass25_1.method855(this.aShort60 & 0xFFFF);
		@Pc(27) Class64 local27;
		@Pc(31) Class64 local31;
		if (this.aBoolean155) {
			local27 = Static401.aClass64Array3[this.aByte33];
			local31 = Static205.aClass64Array2[0];
		} else {
			local27 = Static205.aClass64Array2[this.aByte33];
			if (this.aByte33 < 3) {
				local31 = Static205.aClass64Array2[this.aByte33 + 1];
			} else {
				local31 = null;
			}
		}
		return local11.method3297(super.anInt6053, arg1, arg0, local31, this.aByte32 == 11 ? 10 : this.aByte32, super.anInt6045, super.anInt6055, local27, this.aByte32 == 11 ? this.aByte31 + 4 : this.aByte31, arg2);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
	public int method1521() {
		return this.aClass31_3 == null ? 15 : this.aClass31_3.ra() / 4;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class31 method1522(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (this.aClass31_3 != null && arg1.method2610(this.aClass31_3.n(), arg0) == 0) {
			return this.aClass31_3;
		} else {
			@Pc(35) Class48 local35 = this.method1520(arg0, false, arg1);
			return local35 == null ? null : local35.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		@Pc(31) Class3_Sub3_Sub4 local31;
		if (this.aClass3_Sub3_Sub4_3 == null && this.aBoolean154) {
			@Pc(24) Class48 local24 = this.method1520(262144, true, arg0);
			local31 = local24 == null ? null : local24.aClass3_Sub3_Sub4_2;
		} else {
			local31 = this.aClass3_Sub3_Sub4_3;
			this.aClass3_Sub3_Sub4_3 = null;
		}
		if (local31 != null) {
			Static259.method3926(local31, this.aByte33, super.anInt6053, super.anInt6055, null);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(9) Class31 local9 = this.method1522(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class106 local14 = arg2.method2587();
			local14.R(super.anInt6053, super.anInt6045, super.anInt6055);
			return local9.method5702(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class1_Sub5_Sub3) {
			@Pc(14) Class1_Sub5_Sub3 local14 = (Class1_Sub5_Sub3) arg0;
			if (this.aClass31_3 != null && local14.aClass31_6 != null) {
				this.aClass31_3.method5700(local14.aClass31_6, arg5, arg3, arg2, arg1);
			}
		} else if (arg0 instanceof Class1_Sub3_Sub2) {
			@Pc(36) Class1_Sub3_Sub2 local36 = (Class1_Sub3_Sub2) arg0;
			if (this.aClass31_3 != null && local36.aClass31_3 != null) {
				this.aClass31_3.method5700(local36.aClass31_3, arg5, arg3, arg2, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
		if (this.aClass31_3 != null) {
			this.aClass31_3.method5716();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aByte31;
	}
}
