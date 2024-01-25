import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class12_Sub2_Sub4_Sub1 extends Class12_Sub2_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "Lclient!rn;")
	private Class305 aClass305_5;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "Z")
	private boolean aBoolean291;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "B")
	private final byte aByte79;

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "S")
	private final short aShort62;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Z")
	private final boolean aBoolean288;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lclient!ka;")
	private Class80 aClass80_4;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lclient!r;")
	private Class14_Sub3_Sub14 aClass14_Sub3_Sub14_4;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIZ)V")
	public Class12_Sub2_Sub4_Sub1(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt6060);
		this.aBoolean289 = arg7;
		this.aBoolean291 = arg9;
		super.anInt11002 = arg6;
		this.aByte79 = (byte) arg8;
		this.aBoolean290 = arg1.anInt6045 != 0 && !arg7;
		super.anInt10998 = arg4;
		this.aShort62 = (short) arg1.anInt6014;
		this.aBoolean288 = arg0.method7904() && arg1.aBoolean415 && !this.aBoolean289 && Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean291) {
			local63 |= 0x10000;
		}
		@Pc(78) Class25 local78 = this.method3322(arg0, local63, this.aBoolean288);
		if (local78 != null) {
			this.aClass80_4 = local78.aClass80_2;
			this.aClass14_Sub3_Sub14_4 = local78.aClass14_Sub3_Sub14_2;
			if (this.aBoolean291) {
				this.aClass80_4 = this.aClass80_4.method6378((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
		if (this.aClass80_4 != null) {
			this.aClass80_4.method6389();
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		if (this.aClass80_4 == null) {
			return true;
		} else {
			return !this.aClass80_4.r();
		}
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		this.aBoolean291 = false;
		if (this.aClass80_4 != null) {
			this.aClass80_4.s(this.aClass80_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		if (this.aClass80_4 == null) {
			return null;
		}
		@Pc(18) Class26 local18 = arg0.method7923();
		local18.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(34) Class12_Sub8 local34 = Static291.method4323(this.aBoolean290, 1);
		if (Static401.aBoolean511) {
			this.aClass80_4.method6375(local18, local34.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			this.aClass80_4.method6391(local18, local34.aClass12_Sub1Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.aBoolean288;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aByte79;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		@Pc(22) Class14_Sub3_Sub14 local22;
		if (this.aClass14_Sub3_Sub14_4 == null && this.aBoolean288) {
			@Pc(33) Class25 local33 = this.method3322(arg0, 262144, true);
			local22 = local33 == null ? null : local33.aClass14_Sub3_Sub14_2;
		} else {
			local22 = this.aClass14_Sub3_Sub14_4;
			this.aClass14_Sub3_Sub14_4 = null;
		}
		if (local22 != null) {
			Static76.method1427(local22, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		if (this.aClass305_5 == null) {
			this.aClass305_5 = Static662.method9180(super.anInt10998, this.method3321(arg0, 0), super.anInt11002, super.anInt10997);
		}
		return this.aClass305_5;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aShort62 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return this.aBoolean291;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return 22;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class12_Sub2_Sub4_Sub1) {
			@Pc(9) Class12_Sub2_Sub4_Sub1 local9 = (Class12_Sub2_Sub4_Sub1) arg1;
			if (this.aClass80_4 != null && local9.aClass80_4 != null) {
				this.aClass80_4.method6385(local9.aClass80_4, arg3, arg5, arg2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		@Pc(25) Class14_Sub3_Sub14 local25;
		if (this.aClass14_Sub3_Sub14_4 == null && this.aBoolean288) {
			@Pc(18) Class25 local18 = this.method3322(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass14_Sub3_Sub14_2;
		} else {
			local25 = this.aClass14_Sub3_Sub14_4;
			this.aClass14_Sub3_Sub14_4 = null;
		}
		if (local25 != null) {
			Static79.method1495(local25, super.aByte145, super.anInt10998, super.anInt11002, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.aBoolean289 = false;
		}
		return this.aClass80_4 == null ? 0 : this.aClass80_4.ma();
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aClass80_4 == null ? false : this.aClass80_4.F();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class80 method3321(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass80_4 != null && arg0.method7922(this.aClass80_4.ua(), arg1) == 0) {
			return this.aClass80_4;
		} else {
			@Pc(23) Class25 local23 = this.method3322(arg0, arg1, false);
			return local23 == null ? null : local23.aClass80_2;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ha;IZZ)Lclient!baa;")
	private Class25 method3322(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class203 local13 = Static511.aClass13_2.method86(this.aShort62 & 0xFFFF);
		@Pc(36) Class51 local36;
		@Pc(22) Class51 local22;
		if (this.aBoolean289) {
			local36 = Static473.aClass51Array2[super.aByte145];
			local22 = Static343.aClass51Array1[0];
		} else {
			if (super.aByte145 >= 3) {
				local22 = null;
			} else {
				local22 = Static343.aClass51Array1[super.aByte145 + 1];
			}
			local36 = Static343.aClass51Array1[super.aByte145];
		}
		return local13.method5008(22, arg1, (Class232) null, arg0, local22, local36, arg2, super.anInt10998, super.anInt10997, super.anInt11002, this.aByte79);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass80_4 == null ? 0 : this.aClass80_4.fa();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(17) Class80 local17 = this.method3321(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class26 local22 = arg2.method7923();
			local22.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			return Static401.aBoolean511 ? local17.method6386(arg0, arg1, local22, false, 0, Static331.anInt6277) : local17.method6380(arg0, arg1, local22, false, 0);
		}
	}
}
