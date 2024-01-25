import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class9_Sub1_Sub4_Sub2 extends Class9_Sub1_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!sea", name = "db", descriptor = "Lclient!tc;")
	private Class354 aClass354_6;

	@OriginalMember(owner = "client!sea", name = "kb", descriptor = "Z")
	private final boolean aBoolean602;

	@OriginalMember(owner = "client!sea", name = "Q", descriptor = "Z")
	private final boolean aBoolean600;

	@OriginalMember(owner = "client!sea", name = "vb", descriptor = "Z")
	private boolean aBoolean599;

	@OriginalMember(owner = "client!sea", name = "fb", descriptor = "B")
	private final byte aByte133;

	@OriginalMember(owner = "client!sea", name = "U", descriptor = "S")
	private final short aShort98;

	@OriginalMember(owner = "client!sea", name = "R", descriptor = "Z")
	private final boolean aBoolean601;

	@OriginalMember(owner = "client!sea", name = "ib", descriptor = "Lclient!ka;")
	private Class170 aClass170_7;

	@OriginalMember(owner = "client!sea", name = "bb", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_5;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIZ)V")
	public Class9_Sub1_Sub4_Sub2(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt6292);
		this.aBoolean602 = arg7;
		this.aBoolean600 = arg1.anInt6278 != 0 && !arg7;
		super.anInt10695 = arg6;
		this.aBoolean599 = arg9;
		this.aByte133 = (byte) arg8;
		super.anInt10694 = arg4;
		this.aShort98 = (short) arg1.anInt6249;
		this.aBoolean601 = arg0.method9346() && arg1.aBoolean422 && !this.aBoolean602 && Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean599) {
			local71 |= 0x10000;
		}
		@Pc(86) Class347 local86 = this.method7557(this.aBoolean601, arg0, local71);
		if (local86 != null) {
			this.aClass170_7 = local86.aClass170_8;
			this.aClass3_Sub7_Sub17_5 = local86.aClass3_Sub7_Sub17_6;
			if (this.aBoolean599) {
				this.aClass170_7 = this.aClass170_7.method8369((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aClass170_7 == null ? false : this.aClass170_7.F();
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aByte133;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		@Pc(24) Class3_Sub7_Sub17 local24;
		if (this.aClass3_Sub7_Sub17_5 == null && this.aBoolean601) {
			@Pc(35) Class347 local35 = this.method7557(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass3_Sub7_Sub17_6;
		} else {
			local24 = this.aClass3_Sub7_Sub17_5;
			this.aClass3_Sub7_Sub17_5 = null;
		}
		if (local24 != null) {
			Static436.method5764(local24, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aBoolean601;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		if (this.aClass170_7 == null) {
			return null;
		}
		@Pc(12) Class58 local12 = arg0.method9354();
		local12.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(26) Class9_Sub6 local26 = Static135.method9083(1, this.aBoolean600);
		if (Static444.aBoolean451) {
			this.aClass170_7.method8350(local12, local26.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			this.aClass170_7.method8360(local12, local26.aClass9_Sub9Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return 22;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass170_7 == null ? 0 : this.aClass170_7.fa();
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class9_Sub1_Sub4_Sub2) {
			@Pc(5) Class9_Sub1_Sub4_Sub2 local5 = (Class9_Sub1_Sub4_Sub2) arg0;
			if (this.aClass170_7 != null && local5.aClass170_7 != null) {
				this.aClass170_7.method8355(local5.aClass170_7, arg4, arg2, arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
		if (this.aClass170_7 != null) {
			this.aClass170_7.method8362();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class170 local16 = this.method7559(arg0, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class58 local21 = arg0.method9354();
			local21.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			return Static444.aBoolean451 ? local16.method8351(arg1, arg2, local21, false, 0, Static668.anInt10260) : local16.method8349(arg1, arg2, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!sea", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 > -5) {
			return -32;
		} else if (this.aClass170_7 == null) {
			return 0;
		} else {
			return this.aClass170_7.ma();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZILclient!ha;I)Lclient!sr;")
	private Class347 method7557(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class247 local22 = Static216.aClass53_3.method1523(this.aShort98 & 0xFFFF);
		@Pc(30) Class259 local30;
		@Pc(38) Class259 local38;
		if (this.aBoolean602) {
			local38 = Static43.aClass259Array1[0];
			local30 = Static378.aClass259Array2[super.aByte140];
		} else {
			local30 = Static43.aClass259Array1[super.aByte140];
			if (super.aByte140 >= 3) {
				local38 = null;
			} else {
				local38 = Static43.aClass259Array1[super.aByte140 + 1];
			}
		}
		return local22.method5446((Class165) null, arg0, super.anInt10690, 22, arg2, super.anInt10695, arg1, local30, super.anInt10694, local38, this.aByte133);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		if (this.aClass354_6 == null) {
			this.aClass354_6 = Static696.method9207(this.method7559(arg0, 0), super.anInt10690, super.anInt10695, super.anInt10694);
		}
		return this.aClass354_6;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		@Pc(36) Class3_Sub7_Sub17 local36;
		if (this.aClass3_Sub7_Sub17_5 == null && this.aBoolean601) {
			@Pc(28) Class347 local28 = this.method7557(true, arg0, 262144);
			local36 = local28 == null ? null : local28.aClass3_Sub7_Sub17_6;
		} else {
			local36 = this.aClass3_Sub7_Sub17_5;
			this.aClass3_Sub7_Sub17_5 = null;
		}
		if (local36 != null) {
			Static325.method4736(local36, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		if (this.aClass170_7 == null) {
			return true;
		} else {
			return !this.aClass170_7.r();
		}
	}

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		this.aBoolean599 = false;
		if (this.aClass170_7 != null) {
			this.aClass170_7.s(this.aClass170_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class170 method7559(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass170_7 != null && arg0.method9324(this.aClass170_7.ua(), arg1) == 0) {
			return this.aClass170_7;
		} else {
			@Pc(33) Class347 local33 = this.method7557(false, arg0, arg1);
			return local33 == null ? null : local33.aClass170_8;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aShort98 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return this.aBoolean599;
	}
}
