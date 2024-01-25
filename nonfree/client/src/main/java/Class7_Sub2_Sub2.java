import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class7_Sub2_Sub2 extends Class7_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!ap", name = "U", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "Z")
	private boolean aBoolean29;

	@OriginalMember(owner = "client!ap", name = "M", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "S")
	private final short aShort20;

	@OriginalMember(owner = "client!ap", name = "N", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!ap", name = "db", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "Z")
	private final boolean aBoolean28;

	@OriginalMember(owner = "client!ap", name = "X", descriptor = "Lclient!j;")
	private Class3_Sub4_Sub4 aClass3_Sub4_Sub4_1;

	@OriginalMember(owner = "client!ap", name = "J", descriptor = "Lclient!c;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIIZIIIIIIZ)V")
	public Class7_Sub2_Sub2(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2752 == 1, Static174.method2789(arg12, arg13));
		this.aBoolean31 = arg1.anInt2768 != 0 && !arg7;
		this.aBoolean29 = arg14;
		this.aBoolean30 = arg7;
		this.aShort20 = (short) arg1.anInt2747;
		this.aByte9 = (byte) arg13;
		this.aByte8 = (byte) arg3;
		this.aByte10 = (byte) arg12;
		this.aBoolean28 = arg0.method5513() && arg1.aBoolean257 && !this.aBoolean30 && Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean29) {
			local77 |= 0x10000;
		}
		@Pc(92) Class157 local92 = this.method362(arg0, this.aBoolean28, local77);
		if (local92 != null) {
			this.aClass3_Sub4_Sub4_1 = local92.aClass3_Sub4_Sub4_5;
			this.aClass9_1 = local92.aClass9_6;
			if (this.aBoolean29) {
				this.aClass9_1 = this.aClass9_1.method5699((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!qa;ZII)Lclient!mr;")
	private Class157 method362(@OriginalArg(0) Class172 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class93 local17 = Static435.aClass30_4.method769(this.aShort20 & 0xFFFF);
		@Pc(41) Class159 local41;
		@Pc(33) Class159 local33;
		if (this.aBoolean30) {
			local33 = Static26.aClass159Array1[0];
			local41 = Static85.aClass159Array2[this.aByte8];
		} else {
			if (this.aByte8 < 3) {
				local33 = Static26.aClass159Array1[this.aByte8 + 1];
			} else {
				local33 = null;
			}
			local41 = Static26.aClass159Array1[this.aByte8];
		}
		return local17.method2060(super.anInt4318, super.anInt4321, this.aByte10 == 11 ? this.aByte9 + 4 : this.aByte9, local33, arg2, arg1, arg0, local41, this.aByte10 == 11 ? 10 : this.aByte10, super.anInt4320);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		@Pc(21) Class3_Sub4_Sub4 local21;
		if (this.aClass3_Sub4_Sub4_1 == null && this.aBoolean28) {
			@Pc(34) Class157 local34 = this.method362(arg0, true, 262144);
			local21 = local34 == null ? null : local34.aClass3_Sub4_Sub4_5;
		} else {
			local21 = this.aClass3_Sub4_Sub4_1;
			this.aClass3_Sub4_Sub4_1 = null;
		}
		if (local21 != null) {
			Static218.method3304(local21, this.aByte8, super.anInt4318, super.anInt4321, null);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	private Class9 method363(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1) {
		if (this.aClass9_1 != null && arg1.method5501(this.aClass9_1.n(), arg0) == 0) {
			return this.aClass9_1;
		} else {
			@Pc(26) Class157 local26 = this.method362(arg1, false, arg0);
			return local26 == null ? null : local26.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
		if (this.aClass9_1 != null) {
			this.aClass9_1.method5682();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class7_Sub4_Sub2) {
			@Pc(35) Class7_Sub4_Sub2 local35 = (Class7_Sub4_Sub2) arg3;
			if (this.aClass9_1 == null || local35.aClass9_2 == null) {
				return;
			}
			this.aClass9_1.method5696(local35.aClass9_2, arg0, arg5, arg4, arg2);
		} else if (arg3 instanceof Class7_Sub2_Sub2) {
			@Pc(16) Class7_Sub2_Sub2 local16 = (Class7_Sub2_Sub2) arg3;
			if (this.aClass9_1 != null && local16.aClass9_1 != null) {
				this.aClass9_1.method5696(local16.aClass9_1, arg0, arg5, arg4, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		if (this.aClass9_1 == null) {
			return null;
		}
		@Pc(11) Class107 local11 = arg0.method5495();
		local11.R(super.anInt4318, super.anInt4320, super.anInt4321);
		@Pc(28) Class6_Sub1 local28 = null;
		if (this.aBoolean31) {
			local28 = Static43.method829(1);
		}
		this.aClass9_1.method5695(local11, local28 == null ? null : local28.aClass6_Sub5Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aByte9;
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)I")
	public int method365() {
		return this.aClass9_1 == null ? 15 : this.aClass9_1.ra() / 4;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return this.aClass9_1 == null ? 0 : this.aClass9_1.b();
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		this.aBoolean29 = false;
		if (this.aClass9_1 != null) {
			this.aClass9_1.u(this.aClass9_1.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		@Pc(29) Class3_Sub4_Sub4 local29;
		if (this.aClass3_Sub4_Sub4_1 == null && this.aBoolean28) {
			@Pc(22) Class157 local22 = this.method362(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass3_Sub4_Sub4_5;
		} else {
			local29 = this.aClass3_Sub4_Sub4_1;
			this.aClass3_Sub4_Sub4_1 = null;
		}
		if (local29 != null) {
			Static206.method3200(local29, this.aByte8, super.anInt4318, super.anInt4321, null);
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aShort20 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return this.aBoolean29;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aBoolean28;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class9 local9 = this.method363(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class107 local14 = arg0.method5495();
			local14.R(super.anInt4318, super.anInt4320, super.anInt4321);
			return local9.method5693(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.method363(arg1, arg0);
	}
}
