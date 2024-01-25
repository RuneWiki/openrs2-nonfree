import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 implements Interface12 {

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "B")
	private final byte aByte85;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "S")
	private final short aShort189;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "Z")
	private final boolean aBoolean448;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Lclient!j;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_5;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "Lclient!c;")
	public Class31 aClass31_6;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIZIIZ)V")
	public Class1_Sub5_Sub3(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static236.method3702(arg8, arg7));
		super.anInt6405 = arg3;
		this.aByte85 = (byte) arg7;
		this.aByte84 = (byte) arg2;
		this.aByte83 = (byte) arg8;
		this.aBoolean451 = arg1.anInt4009 != 0 && !arg6;
		this.aBoolean449 = arg9;
		super.anInt6404 = arg5;
		this.aShort189 = (short) arg1.anInt4027;
		this.aBoolean450 = arg6;
		this.aBoolean448 = arg0.method2626() && arg1.aBoolean324 && !this.aBoolean450 && Static123.aClass21_Sub1_1.method775(Static347.anInt6318) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean449) {
			local71 |= 0x10000;
		}
		@Pc(86) Class48 local86 = this.method5084(arg0, this.aBoolean448, local71);
		if (local86 != null) {
			this.aClass3_Sub3_Sub4_5 = local86.aClass3_Sub3_Sub4_2;
			this.aClass31_6 = local86.aClass31_2;
			if (this.aBoolean449) {
				this.aClass31_6 = this.aClass31_6.method5710((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aShort189 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		if (this.aClass31_6 == null) {
			return null;
		}
		@Pc(19) Class106 local19 = arg0.method2587();
		local19.R(super.anInt6405, super.anInt6406, super.anInt6404);
		@Pc(29) Class13_Sub7 local29 = null;
		if (this.aBoolean451) {
			local29 = Static120.method2160(1);
		}
		this.aClass31_6.method5704(local19, local29 == null ? null : local29.aClass13_Sub1Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class31 method5082(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		if (this.aClass31_6 != null && arg1.method2610(this.aClass31_6.n(), arg0) == 0) {
			return this.aClass31_6;
		} else {
			@Pc(27) Class48 local27 = this.method5084(arg1, false, arg0);
			return local27 == null ? null : local27.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		this.aBoolean449 = false;
		if (this.aClass31_6 != null) {
			this.aClass31_6.u(this.aClass31_6.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		@Pc(14) Class3_Sub3_Sub4 local14;
		if (this.aClass3_Sub3_Sub4_5 == null && this.aBoolean448) {
			@Pc(25) Class48 local25 = this.method5084(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass3_Sub3_Sub4_2;
		} else {
			local14 = this.aClass3_Sub3_Sub4_5;
			this.aClass3_Sub3_Sub4_5 = null;
		}
		if (local14 != null) {
			Static259.method3926(local14, this.aByte84, super.anInt6405, super.anInt6404, null);
		}
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		@Pc(19) Class3_Sub3_Sub4 local19;
		if (this.aClass3_Sub3_Sub4_5 == null && this.aBoolean448) {
			@Pc(30) Class48 local30 = this.method5084(arg0, true, 262144);
			local19 = local30 == null ? null : local30.aClass3_Sub3_Sub4_2;
		} else {
			local19 = this.aClass3_Sub3_Sub4_5;
			this.aClass3_Sub3_Sub4_5 = null;
		}
		if (local19 != null) {
			Static229.method3575(local19, this.aByte84, super.anInt6405, super.anInt6404, null);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(9) Class31 local9 = this.method5082(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class106 local14 = arg2.method2587();
			local14.R(super.anInt6405, super.anInt6406, super.anInt6404);
			return local9.method5702(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class1_Sub5_Sub3) {
			@Pc(43) Class1_Sub5_Sub3 local43 = (Class1_Sub5_Sub3) arg0;
			if (this.aClass31_6 == null || local43.aClass31_6 == null) {
				return;
			}
			this.aClass31_6.method5700(local43.aClass31_6, arg5, arg3, arg2, arg1);
		} else if (arg0 instanceof Class1_Sub3_Sub2) {
			@Pc(24) Class1_Sub3_Sub2 local24 = (Class1_Sub3_Sub2) arg0;
			if (this.aClass31_6 != null && local24.aClass31_3 != null) {
				this.aClass31_6.method5700(local24.aClass31_3, arg5, arg3, arg2, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aBoolean448;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return this.aByte85;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qa;ZBI)Lclient!df;")
	private Class48 method5084(@OriginalArg(0) Class75 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class128 local16 = Static55.aClass25_1.method855(this.aShort189 & 0xFFFF);
		@Pc(28) Class64 local28;
		@Pc(23) Class64 local23;
		if (this.aBoolean450) {
			local23 = Static205.aClass64Array2[0];
			local28 = Static401.aClass64Array3[this.aByte84];
		} else {
			local28 = Static205.aClass64Array2[this.aByte84];
			if (this.aByte84 >= 3) {
				local23 = null;
			} else {
				local23 = Static205.aClass64Array2[this.aByte84 + 1];
			}
		}
		return local16.method3297(super.anInt6405, arg1, arg2, local23, this.aByte85, super.anInt6406, super.anInt6404, local28, this.aByte83, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.method5082(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
		if (this.aClass31_6 != null) {
			this.aClass31_6.method5716();
		}
	}
}
