import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class12_Sub2_Sub3_Sub2 extends Class12_Sub2_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!wi", name = "V", descriptor = "Lclient!rn;")
	private Class305 aClass305_8;

	@OriginalMember(owner = "client!wi", name = "cb", descriptor = "Z")
	private final boolean aBoolean760;

	@OriginalMember(owner = "client!wi", name = "X", descriptor = "Z")
	private final boolean aBoolean759;

	@OriginalMember(owner = "client!wi", name = "kb", descriptor = "S")
	private final short aShort121;

	@OriginalMember(owner = "client!wi", name = "Z", descriptor = "B")
	private final byte aByte147;

	@OriginalMember(owner = "client!wi", name = "ob", descriptor = "B")
	private final byte aByte148;

	@OriginalMember(owner = "client!wi", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "Lclient!r;")
	private Class14_Sub3_Sub14 aClass14_Sub3_Sub14_6;

	@OriginalMember(owner = "client!wi", name = "Q", descriptor = "Lclient!ka;")
	private Class80 aClass80_7;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIIII)V")
	public Class12_Sub2_Sub3_Sub2(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10998 = arg4;
		this.aBoolean760 = arg7;
		this.aBoolean759 = arg1.anInt6045 != 0 && !arg7;
		this.aShort121 = (short) arg1.anInt6014;
		this.aByte147 = (byte) arg11;
		this.aByte148 = (byte) arg10;
		super.anInt11002 = arg6;
		this.lb = arg0.method7904() && arg1.aBoolean415 && !this.aBoolean760 && Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() != 0;
		@Pc(70) Class25 local70 = this.method9182(2048, arg0, this.lb);
		if (local70 != null) {
			this.aClass14_Sub3_Sub14_6 = local70.aClass14_Sub3_Sub14_2;
			this.aClass80_7 = local70.aClass80_2;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		@Pc(25) Class14_Sub3_Sub14 local25;
		if (this.aClass14_Sub3_Sub14_6 == null && this.lb) {
			@Pc(18) Class25 local18 = this.method9182(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass14_Sub3_Sub14_2;
		} else {
			local25 = this.aClass14_Sub3_Sub14_6;
			this.aClass14_Sub3_Sub14_6 = null;
		}
		if (local25 != null) {
			Static76.method1427(local25, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
		if (this.aClass80_7 != null) {
			this.aClass80_7.method6389();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.lb;
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aClass80_7 == null ? false : this.aClass80_7.F();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(9) Class80 local9 = this.method9179(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class26 local20 = arg2.method7923();
			local20.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			return Static401.aBoolean511 ? local9.method6386(arg0, arg1, local20, false, 0, Static331.anInt6277) : local9.method6380(arg0, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass80_7 == null ? 0 : this.aClass80_7.fa();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		if (this.aClass80_7 == null) {
			return null;
		}
		@Pc(11) Class26 local11 = arg0.method7923();
		local11.method6457(super.anInt10998 + super.aShort119, super.anInt10997, super.aShort120 + super.anInt11002);
		@Pc(32) Class12_Sub8 local32 = Static291.method4323(this.aBoolean759, 1);
		if (Static401.aBoolean511) {
			this.aClass80_7.method6375(local11, local32.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			this.aClass80_7.method6391(local11, local32.aClass12_Sub1Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class80 method9179(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass80_7 != null && arg0.method7922(this.aClass80_7.ua(), arg1) == 0) {
			return this.aClass80_7;
		} else {
			@Pc(29) Class25 local29 = this.method9182(arg1, arg0, false);
			return local29 == null ? null : local29.aClass80_2;
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBLclient!ha;Z)Lclient!baa;")
	private Class25 method9182(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class203 local13 = Static511.aClass13_2.method86(this.aShort121 & 0xFFFF);
		@Pc(41) Class51 local41;
		@Pc(32) Class51 local32;
		if (this.aBoolean760) {
			local41 = Static473.aClass51Array2[super.aByte145];
			local32 = Static343.aClass51Array1[0];
		} else {
			if (super.aByte145 < 3) {
				local32 = Static343.aClass51Array1[super.aByte145 + 1];
			} else {
				local32 = null;
			}
			local41 = Static343.aClass51Array1[super.aByte145];
		}
		return local13.method5008(this.aByte148, arg0, (Class232) null, arg1, local32, local41, arg2, super.anInt10998, super.anInt10997, super.anInt11002, this.aByte147);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		if (this.aClass305_8 == null) {
			this.aClass305_8 = Static662.method9180(super.anInt10998, this.method9179(arg0, 0), super.anInt11002, super.anInt10997);
		}
		return this.aClass305_8;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		if (this.aClass80_7 == null) {
			return true;
		} else {
			return !this.aClass80_7.r();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aShort121 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return this.aByte148;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.method9172((Class137) null);
		}
		return this.aClass80_7 == null ? 0 : this.aClass80_7.ma();
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aByte147;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		@Pc(22) Class14_Sub3_Sub14 local22;
		if (this.aClass14_Sub3_Sub14_6 == null && this.lb) {
			@Pc(33) Class25 local33 = this.method9182(262144, arg0, true);
			local22 = local33 == null ? null : local33.aClass14_Sub3_Sub14_2;
		} else {
			local22 = this.aClass14_Sub3_Sub14_6;
			this.aClass14_Sub3_Sub14_6 = null;
		}
		if (local22 != null) {
			Static79.method1495(local22, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}
}
