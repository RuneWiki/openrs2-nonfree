import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class9_Sub1_Sub3_Sub1 extends Class9_Sub1_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!ln", name = "sb", descriptor = "Lclient!tc;")
	private Class354 aClass354_4;

	@OriginalMember(owner = "client!ln", name = "rb", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!ln", name = "pb", descriptor = "Z")
	private final boolean aBoolean383;

	@OriginalMember(owner = "client!ln", name = "ib", descriptor = "Z")
	private final boolean aBoolean384;

	@OriginalMember(owner = "client!ln", name = "eb", descriptor = "S")
	private final short aShort80;

	@OriginalMember(owner = "client!ln", name = "vb", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!ln", name = "cb", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!ln", name = "W", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_4;

	@OriginalMember(owner = "client!ln", name = "nb", descriptor = "Lclient!ka;")
	private Class170 aClass170_5;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIIII)V")
	public Class9_Sub1_Sub3_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte92 = (byte) arg11;
		super.anInt10695 = arg6;
		super.anInt10694 = arg4;
		this.aBoolean383 = arg1.anInt6278 != 0 && !arg7;
		this.aBoolean384 = arg7;
		this.aShort80 = (short) arg1.anInt6249;
		this.aByte91 = (byte) arg10;
		this.aBoolean385 = arg0.method9346() && arg1.aBoolean422 && !this.aBoolean384 && Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() != 0;
		@Pc(75) Class347 local75 = this.method5206(2048, arg0, this.aBoolean385);
		if (local75 != null) {
			this.aClass3_Sub7_Sub17_4 = local75.aClass3_Sub7_Sub17_6;
			this.aClass170_5 = local75.aClass170_8;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aShort80 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!ha;ZB)Lclient!sr;")
	private Class347 method5206(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class247 local19 = Static216.aClass53_3.method1523(this.aShort80 & 0xFFFF);
		@Pc(27) Class259 local27;
		@Pc(38) Class259 local38;
		if (this.aBoolean384) {
			local27 = Static378.aClass259Array2[super.aByte140];
			local38 = Static43.aClass259Array1[0];
		} else {
			local27 = Static43.aClass259Array1[super.aByte140];
			if (super.aByte140 < 3) {
				local38 = Static43.aClass259Array1[super.aByte140 + 1];
			} else {
				local38 = null;
			}
		}
		return local19.method5446((Class165) null, arg2, super.anInt10690, this.aByte91, arg0, super.anInt10695, arg1, local27, super.anInt10694, local38, this.aByte92);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass170_5 == null ? 0 : this.aClass170_5.fa();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aByte92;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class170 method5208(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass170_5 != null && arg0.method9324(this.aClass170_5.ua(), arg1) == 0) {
			return this.aClass170_5;
		} else {
			@Pc(35) Class347 local35 = this.method5206(arg1, arg0, false);
			return local35 == null ? null : local35.aClass170_8;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aBoolean385;
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 >= -5) {
			this.method9093();
		}
		return this.aClass170_5 == null ? 0 : this.aClass170_5.ma();
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		if (this.aClass170_5 == null) {
			return true;
		} else {
			return !this.aClass170_5.r();
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aClass170_5 == null ? false : this.aClass170_5.F();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class170 local17 = this.method5208(arg0, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class58 local22 = arg0.method9354();
			local22.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			return Static444.aBoolean451 ? local17.method8351(arg1, arg2, local22, false, 0, Static668.anInt10260) : local17.method8349(arg1, arg2, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		if (this.aClass354_4 == null) {
			this.aClass354_4 = Static696.method9207(this.method5208(arg0, 0), super.anInt10690, super.anInt10695, super.anInt10694);
		}
		return this.aClass354_4;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		@Pc(36) Class3_Sub7_Sub17 local36;
		if (this.aClass3_Sub7_Sub17_4 == null && this.aBoolean385) {
			@Pc(28) Class347 local28 = this.method5206(262144, arg0, true);
			local36 = local28 == null ? null : local28.aClass3_Sub7_Sub17_6;
		} else {
			local36 = this.aClass3_Sub7_Sub17_4;
			this.aClass3_Sub7_Sub17_4 = null;
		}
		if (local36 != null) {
			Static436.method5764(local36, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		@Pc(16) Class3_Sub7_Sub17 local16;
		if (this.aClass3_Sub7_Sub17_4 == null && this.aBoolean385) {
			@Pc(27) Class347 local27 = this.method5206(262144, arg0, true);
			local16 = local27 == null ? null : local27.aClass3_Sub7_Sub17_6;
		} else {
			local16 = this.aClass3_Sub7_Sub17_4;
			this.aClass3_Sub7_Sub17_4 = null;
		}
		if (local16 != null) {
			Static325.method4736(local16, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
		if (this.aClass170_5 != null) {
			this.aClass170_5.method8362();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		if (this.aClass170_5 == null) {
			return null;
		}
		@Pc(18) Class58 local18 = arg0.method9354();
		local18.method9524(super.anInt10694 + super.aShort86, super.anInt10690, super.anInt10695 + super.aShort85);
		@Pc(40) Class9_Sub6 local40 = Static135.method9083(1, this.aBoolean383);
		if (Static444.aBoolean451) {
			this.aClass170_5.method8350(local18, local40.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			this.aClass170_5.method8360(local18, local40.aClass9_Sub9Array1[0], 0);
		}
		return local40;
	}
}
