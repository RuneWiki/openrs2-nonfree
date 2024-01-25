import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class12_Sub2_Sub2_Sub2 extends Class12_Sub2_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!ep", name = "U", descriptor = "Lclient!rn;")
	private Class305 aClass305_3;

	@OriginalMember(owner = "client!ep", name = "Y", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!ep", name = "T", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!ep", name = "R", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!ep", name = "qb", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "client!ep", name = "fb", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!ep", name = "cb", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!ep", name = "db", descriptor = "Lclient!ka;")
	public Class80 aClass80_3;

	@OriginalMember(owner = "client!ep", name = "ib", descriptor = "Lclient!r;")
	private Class14_Sub3_Sub14 aClass14_Sub3_Sub14_3;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIIIIIIZ)V")
	public Class12_Sub2_Sub2_Sub2(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6007 == 1, Static473.method6862(arg12, arg13));
		super.aByte145 = (byte) arg3;
		this.aShort33 = (short) arg1.anInt6014;
		this.aBoolean212 = arg7;
		this.aByte53 = (byte) arg13;
		this.aByte52 = (byte) arg12;
		this.aBoolean215 = arg14;
		this.aBoolean214 = arg1.anInt6045 != 0 && !arg7;
		this.aBoolean213 = arg0.method7904() && arg1.aBoolean415 && !this.aBoolean212 && Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean215) {
			local83 |= 0x10000;
		}
		@Pc(98) Class25 local98 = this.method2261(arg0, local83, this.aBoolean213);
		if (local98 != null) {
			this.aClass80_3 = local98.aClass80_2;
			this.aClass14_Sub3_Sub14_3 = local98.aClass14_Sub3_Sub14_2;
			if (this.aBoolean215) {
				this.aClass80_3 = this.aClass80_3.method6378((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(9) Class80 local9 = this.method2259(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class26 local19 = arg2.method7923();
			local19.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			return Static401.aBoolean511 ? local9.method6386(arg0, arg1, local19, false, 0, Static331.anInt6277) : local9.method6380(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		if (this.aClass80_3 == null) {
			return null;
		}
		@Pc(11) Class26 local11 = arg0.method7923();
		local11.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(25) Class12_Sub8 local25 = Static291.method4323(this.aBoolean214, 1);
		if (Static401.aBoolean511) {
			this.aClass80_3.method6375(local11, local25.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			this.aClass80_3.method6391(local11, local25.aClass12_Sub1Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		@Pc(14) Class14_Sub3_Sub14 local14;
		if (this.aClass14_Sub3_Sub14_3 == null && this.aBoolean213) {
			@Pc(25) Class25 local25 = this.method2261(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass14_Sub3_Sub14_2;
		} else {
			local14 = this.aClass14_Sub3_Sub14_3;
			this.aClass14_Sub3_Sub14_3 = null;
		}
		if (local14 != null) {
			Static76.method1427(local14, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class80 method2259(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass80_3 != null && arg0.method7922(this.aClass80_3.ua(), arg1) == 0) {
			return this.aClass80_3;
		} else {
			@Pc(29) Class25 local29 = this.method2261(arg0, arg1, false);
			return local29 == null ? null : local29.aClass80_2;
		}
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 == -1760267218) {
			return this.aClass80_3 == null ? 0 : this.aClass80_3.ma();
		} else {
			return 24;
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
		if (this.aClass80_3 != null) {
			this.aClass80_3.method6389();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return this.aBoolean215;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		if (this.aClass305_3 == null) {
			this.aClass305_3 = Static662.method9180(super.anInt10998, this.method2259(arg0, 0), super.anInt11002, super.anInt10997);
		}
		return this.aClass305_3;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		if (this.aClass80_3 == null) {
			return true;
		} else {
			return !this.aClass80_3.r();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class12_Sub2_Sub1_Sub1) {
			@Pc(32) Class12_Sub2_Sub1_Sub1 local32 = (Class12_Sub2_Sub1_Sub1) arg1;
			if (this.aClass80_3 != null && local32.aClass80_1 != null) {
				this.aClass80_3.method6385(local32.aClass80_1, arg3, arg5, arg2, arg0);
			}
		} else if (arg1 instanceof Class12_Sub2_Sub2_Sub2) {
			@Pc(12) Class12_Sub2_Sub2_Sub2 local12 = (Class12_Sub2_Sub2_Sub2) arg1;
			if (this.aClass80_3 != null && local12.aClass80_3 != null) {
				this.aClass80_3.method6385(local12.aClass80_3, arg3, arg5, arg2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		@Pc(25) Class14_Sub3_Sub14 local25;
		if (this.aClass14_Sub3_Sub14_3 == null && this.aBoolean213) {
			@Pc(18) Class25 local18 = this.method2261(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass14_Sub3_Sub14_2;
		} else {
			local25 = this.aClass14_Sub3_Sub14_3;
			this.aClass14_Sub3_Sub14_3 = null;
		}
		if (local25 != null) {
			Static79.method1495(local25, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		this.aBoolean215 = false;
		if (this.aClass80_3 != null) {
			this.aClass80_3.s(this.aClass80_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!baa;")
	private Class25 method2261(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class203 local13 = Static511.aClass13_2.method86(this.aShort33 & 0xFFFF);
		@Pc(43) Class51 local43;
		@Pc(34) Class51 local34;
		if (this.aBoolean212) {
			local34 = Static343.aClass51Array1[0];
			local43 = Static473.aClass51Array2[super.aByte145];
		} else {
			if (super.aByte145 < 3) {
				local34 = Static343.aClass51Array1[super.aByte145 + 1];
			} else {
				local34 = null;
			}
			local43 = Static343.aClass51Array1[super.aByte145];
		}
		return local13.method5008(this.aByte52 == 11 ? 10 : this.aByte52, arg1, (Class232) null, arg0, local34, local43, arg2, super.anInt10998, super.anInt10997, super.anInt11002, this.aByte52 == 11 ? this.aByte53 + 4 : this.aByte53);
	}

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "(B)I")
	public int method2262() {
		return this.aClass80_3 == null ? 15 : this.aClass80_3.na() / 4;
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aClass80_3 == null ? false : this.aClass80_3.F();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass80_3 == null ? 0 : this.aClass80_3.fa();
	}
}
