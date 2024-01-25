import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class9_Sub1_Sub2_Sub1 extends Class9_Sub1_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!bv", name = "nb", descriptor = "Lclient!tc;")
	private Class354 aClass354_2;

	@OriginalMember(owner = "client!bv", name = "K", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!bv", name = "T", descriptor = "S")
	private final short aShort29;

	@OriginalMember(owner = "client!bv", name = "cb", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!bv", name = "R", descriptor = "Z")
	private final boolean aBoolean113;

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!bv", name = "mb", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!bv", name = "eb", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!bv", name = "V", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_2;

	@OriginalMember(owner = "client!bv", name = "qb", descriptor = "Lclient!ka;")
	public Class170 aClass170_2;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIIZ)V")
	public Class9_Sub1_Sub2_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static498.method6808(arg8, arg9));
		this.aBoolean114 = arg7;
		this.aShort29 = (short) arg1.anInt6249;
		this.aBoolean115 = arg10;
		this.aBoolean113 = arg1.anInt6278 != 0 && !arg7;
		this.aByte40 = (byte) arg8;
		super.anInt10694 = arg4;
		super.anInt10695 = arg6;
		this.aByte41 = (byte) arg9;
		this.aBoolean112 = arg0.method9346() && arg1.aBoolean422 && !this.aBoolean114 && Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean115) {
			local77 |= 0x10000;
		}
		@Pc(92) Class347 local92 = this.method1478(this.aBoolean112, arg0, local77);
		if (local92 != null) {
			this.aClass3_Sub7_Sub17_2 = local92.aClass3_Sub7_Sub17_6;
			this.aClass170_2 = local92.aClass170_8;
			if (this.aBoolean115) {
				this.aClass170_2 = this.aClass170_2.method8369((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		@Pc(24) Class3_Sub7_Sub17 local24;
		if (this.aClass3_Sub7_Sub17_2 == null && this.aBoolean112) {
			@Pc(35) Class347 local35 = this.method1478(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass3_Sub7_Sub17_6;
		} else {
			local24 = this.aClass3_Sub7_Sub17_2;
			this.aClass3_Sub7_Sub17_2 = null;
		}
		if (local24 != null) {
			Static436.method5764(local24, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aClass170_2 == null ? false : this.aClass170_2.F();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return this.aBoolean115;
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 > -5) {
			this.method9105();
		}
		return this.aClass170_2 == null ? 0 : this.aClass170_2.ma();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
		if (this.aClass170_2 != null) {
			this.aClass170_2.method8362();
		}
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		if (this.aClass170_2 == null) {
			return true;
		} else {
			return !this.aClass170_2.r();
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class170 method1477(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		if (this.aClass170_2 != null && arg1.method9324(this.aClass170_2.ua(), arg0) == 0) {
			return this.aClass170_2;
		} else {
			@Pc(37) Class347 local37 = this.method1478(false, arg1, arg0);
			return local37 == null ? null : local37.aClass170_8;
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class170 local9 = this.method1477(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(23) Class58 local23 = arg0.method9354();
			local23.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			return Static444.aBoolean451 ? local9.method8351(arg1, arg2, local23, false, 0, Static668.anInt10260) : local9.method8349(arg1, arg2, local23, false, 0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!ha;II)Lclient!sr;")
	private Class347 method1478(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class247 local15 = Static216.aClass53_3.method1523(this.aShort29 & 0xFFFF);
		@Pc(32) Class259 local32;
		@Pc(36) Class259 local36;
		if (this.aBoolean114) {
			local32 = Static378.aClass259Array2[super.aByte140];
			local36 = Static43.aClass259Array1[0];
		} else {
			local32 = Static43.aClass259Array1[super.aByte140];
			if (super.aByte140 >= 3) {
				local36 = null;
			} else {
				local36 = Static43.aClass259Array1[super.aByte140 + 1];
			}
		}
		return local15.method5446((Class165) null, arg0, super.anInt10690, this.aByte40, arg2, super.anInt10695, arg1, local32, super.anInt10694, local36, this.aByte41);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aBoolean112;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class9_Sub1_Sub2_Sub1) {
			@Pc(5) Class9_Sub1_Sub2_Sub1 local5 = (Class9_Sub1_Sub2_Sub1) arg0;
			if (this.aClass170_2 != null && local5.aClass170_2 != null) {
				this.aClass170_2.method8355(local5.aClass170_2, arg4, arg2, arg5, arg3);
			}
		} else if (arg0 instanceof Class9_Sub1_Sub1_Sub1) {
			@Pc(34) Class9_Sub1_Sub1_Sub1 local34 = (Class9_Sub1_Sub1_Sub1) arg0;
			if (this.aClass170_2 != null && local34.aClass170_1 != null) {
				this.aClass170_2.method8355(local34.aClass170_1, arg4, arg2, arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass170_2 == null ? 0 : this.aClass170_2.fa();
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		this.aBoolean115 = false;
		if (this.aClass170_2 != null) {
			this.aClass170_2.s(this.aClass170_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aShort29 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		@Pc(37) Class3_Sub7_Sub17 local37;
		if (this.aClass3_Sub7_Sub17_2 == null && this.aBoolean112) {
			@Pc(29) Class347 local29 = this.method1478(true, arg0, 262144);
			local37 = local29 == null ? null : local29.aClass3_Sub7_Sub17_6;
		} else {
			local37 = this.aClass3_Sub7_Sub17_2;
			this.aClass3_Sub7_Sub17_2 = null;
		}
		if (local37 != null) {
			Static325.method4736(local37, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		if (this.aClass354_2 == null) {
			this.aClass354_2 = Static696.method9207(this.method1477(0, arg0), super.anInt10690, super.anInt10695, super.anInt10694);
		}
		return this.aClass354_2;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		if (this.aClass170_2 == null) {
			return null;
		}
		@Pc(21) Class58 local21 = arg0.method9354();
		local21.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(35) Class9_Sub6 local35 = Static135.method9083(1, this.aBoolean113);
		if (Static444.aBoolean451) {
			this.aClass170_2.method8350(local21, local35.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			this.aClass170_2.method8360(local21, local35.aClass9_Sub9Array1[0], 0);
		}
		return local35;
	}
}
