import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class12_Sub2_Sub1_Sub1 extends Class12_Sub2_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!am", name = "ib", descriptor = "Lclient!rn;")
	private Class305 aClass305_1;

	@OriginalMember(owner = "client!am", name = "rb", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!am", name = "T", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!am", name = "Z", descriptor = "S")
	private final short aShort3;

	@OriginalMember(owner = "client!am", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!am", name = "Q", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!am", name = "R", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!am", name = "N", descriptor = "Z")
	private final boolean aBoolean29;

	@OriginalMember(owner = "client!am", name = "nb", descriptor = "Lclient!ka;")
	public Class80 aClass80_1;

	@OriginalMember(owner = "client!am", name = "sb", descriptor = "Lclient!r;")
	private Class14_Sub3_Sub14 aClass14_Sub3_Sub14_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIIZ)V")
	public Class12_Sub2_Sub1_Sub1(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static582.method8311(arg9, arg8));
		this.aBoolean31 = arg1.anInt6045 != 0 && !arg7;
		super.anInt10998 = arg4;
		this.aBoolean30 = arg10;
		this.aShort3 = (short) arg1.anInt6014;
		this.lb = arg7;
		this.aByte12 = (byte) arg8;
		this.aByte13 = (byte) arg9;
		super.anInt11002 = arg6;
		this.aBoolean29 = arg0.method7904() && arg1.aBoolean415 && !this.lb && Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean30) {
			local72 |= 0x10000;
		}
		@Pc(87) Class25 local87 = this.method338(this.aBoolean29, arg0, local72);
		if (local87 != null) {
			this.aClass80_1 = local87.aClass80_2;
			this.aClass14_Sub3_Sub14_1 = local87.aClass14_Sub3_Sub14_2;
			if (this.aBoolean30) {
				this.aClass80_1 = this.aClass80_1.method6378((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return this.aBoolean30;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return this.aByte12;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLclient!ha;II)Lclient!baa;")
	private Class25 method338(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class203 local13 = Static511.aClass13_2.method86(this.aShort3 & 0xFFFF);
		@Pc(28) Class51 local28;
		@Pc(32) Class51 local32;
		if (this.lb) {
			local28 = Static473.aClass51Array2[super.aByte145];
			local32 = Static343.aClass51Array1[0];
		} else {
			if (super.aByte145 >= 3) {
				local32 = null;
			} else {
				local32 = Static343.aClass51Array1[super.aByte145 + 1];
			}
			local28 = Static343.aClass51Array1[super.aByte145];
		}
		return local13.method5008(this.aByte12, arg2, (Class232) null, arg1, local32, local28, arg0, super.anInt10998, super.anInt10997, super.anInt11002, this.aByte13);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aShort3 & 0xFFFF;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.aBoolean29;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
		if (this.aClass80_1 != null) {
			this.aClass80_1.method6389();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class80 method341(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass80_1 != null && arg0.method7922(this.aClass80_1.ua(), arg1) == 0) {
			return this.aClass80_1;
		} else {
			@Pc(29) Class25 local29 = this.method338(false, arg0, arg1);
			return local29 == null ? null : local29.aClass80_2;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		if (this.aClass305_1 == null) {
			this.aClass305_1 = Static662.method9180(super.anInt10998, this.method341(arg0, 0), super.anInt11002, super.anInt10997);
		}
		return this.aClass305_1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(16) Class80 local16 = this.method341(arg2, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class26 local21 = arg2.method7923();
			local21.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			return Static401.aBoolean511 ? local16.method6386(arg0, arg1, local21, false, 0, Static331.anInt6277) : local16.method6380(arg0, arg1, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		if (this.aClass80_1 == null) {
			return true;
		} else {
			return !this.aClass80_1.r();
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 == -1760267218) {
			return this.aClass80_1 == null ? 0 : this.aClass80_1.ma();
		} else {
			return -4;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		@Pc(33) Class14_Sub3_Sub14 local33;
		if (this.aClass14_Sub3_Sub14_1 == null && this.aBoolean29) {
			@Pc(26) Class25 local26 = this.method338(true, arg0, 262144);
			local33 = local26 == null ? null : local26.aClass14_Sub3_Sub14_2;
		} else {
			local33 = this.aClass14_Sub3_Sub14_1;
			this.aClass14_Sub3_Sub14_1 = null;
		}
		if (local33 != null) {
			Static79.method1495(local33, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class12_Sub2_Sub1_Sub1) {
			@Pc(10) Class12_Sub2_Sub1_Sub1 local10 = (Class12_Sub2_Sub1_Sub1) arg1;
			if (this.aClass80_1 != null && local10.aClass80_1 != null) {
				this.aClass80_1.method6385(local10.aClass80_1, arg3, arg5, arg2, arg0);
			}
		} else if (arg1 instanceof Class12_Sub2_Sub2_Sub2) {
			@Pc(33) Class12_Sub2_Sub2_Sub2 local33 = (Class12_Sub2_Sub2_Sub2) arg1;
			if (this.aClass80_1 != null && local33.aClass80_3 != null) {
				this.aClass80_1.method6385(local33.aClass80_3, arg3, arg5, arg2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		this.aBoolean30 = false;
		if (this.aClass80_1 != null) {
			this.aClass80_1.s(this.aClass80_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aClass80_1 == null ? false : this.aClass80_1.F();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		if (this.aClass80_1 == null) {
			return null;
		}
		@Pc(11) Class26 local11 = arg0.method7923();
		local11.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(31) Class12_Sub8 local31 = Static291.method4323(this.aBoolean31, 1);
		if (Static401.aBoolean511) {
			this.aClass80_1.method6375(local11, local31.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			this.aClass80_1.method6391(local11, local31.aClass12_Sub1Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		@Pc(14) Class14_Sub3_Sub14 local14;
		if (this.aClass14_Sub3_Sub14_1 == null && this.aBoolean29) {
			@Pc(25) Class25 local25 = this.method338(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass14_Sub3_Sub14_2;
		} else {
			local14 = this.aClass14_Sub3_Sub14_1;
			this.aClass14_Sub3_Sub14_1 = null;
		}
		if (local14 != null) {
			Static76.method1427(local14, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass80_1 == null ? 0 : this.aClass80_1.fa();
	}
}
