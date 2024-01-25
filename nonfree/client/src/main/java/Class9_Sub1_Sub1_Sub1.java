import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class9_Sub1_Sub1_Sub1 extends Class9_Sub1_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Lclient!tc;")
	private Class354 aClass354_1;

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "S")
	private final short aShort9;

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!af", name = "qb", descriptor = "Z")
	private final boolean aBoolean15;

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!af", name = "R", descriptor = "Z")
	private final boolean aBoolean17;

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "Z")
	private final boolean aBoolean16;

	@OriginalMember(owner = "client!af", name = "Ab", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_1;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Lclient!ka;")
	public Class170 aClass170_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIIIZIIIIIIZ)V")
	public Class9_Sub1_Sub1_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6259 == 1, Static212.method3173(arg13, arg12));
		this.aShort9 = (short) arg1.anInt6249;
		this.aByte9 = (byte) arg12;
		this.aBoolean15 = arg7;
		this.aByte10 = (byte) arg13;
		super.aByte140 = (byte) arg3;
		this.lb = arg14;
		this.aBoolean17 = arg1.anInt6278 != 0 && !arg7;
		this.aBoolean16 = arg0.method9346() && arg1.aBoolean422 && !this.aBoolean15 && Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() != 0;
		@Pc(86) int local86 = 2048;
		if (this.lb) {
			local86 |= 0x10000;
		}
		@Pc(101) Class347 local101 = this.method364(this.aBoolean16, arg0, local86);
		if (local101 != null) {
			this.aClass3_Sub7_Sub17_1 = local101.aClass3_Sub7_Sub17_6;
			this.aClass170_1 = local101.aClass170_8;
			if (this.lb) {
				this.aClass170_1 = this.aClass170_1.method8369((byte) 0, local86, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		if (this.aClass170_1 == null) {
			return true;
		} else {
			return !this.aClass170_1.r();
		}
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 > -5) {
			Static10.method359((Class3_Sub2) null);
		}
		return this.aClass170_1 == null ? 0 : this.aClass170_1.ma();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return this.lb;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.aClass170_1 == null ? 0 : this.aClass170_1.fa();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		if (this.aClass354_1 == null) {
			this.aClass354_1 = Static696.method9207(this.method363(0, arg0), super.anInt10690, super.anInt10695, super.anInt10694);
		}
		return this.aClass354_1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9104() {
		return this.aBoolean16;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
	@Override
	public int method9105() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		if (this.aClass170_1 == null) {
			return null;
		}
		@Pc(12) Class58 local12 = arg0.method9354();
		local12.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(26) Class9_Sub6 local26 = Static135.method9083(1, this.aBoolean17);
		if (Static444.aBoolean451) {
			this.aClass170_1.method8350(local12, local26.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			this.aClass170_1.method8360(local12, local26.aClass9_Sub9Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I")
	@Override
	public int method9107() {
		return this.aShort9 & 0xFFFF;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9108(@OriginalArg(1) Class22 arg0) {
		@Pc(28) Class3_Sub7_Sub17 local28;
		if (this.aClass3_Sub7_Sub17_1 == null && this.aBoolean16) {
			@Pc(20) Class347 local20 = this.method364(true, arg0, 262144);
			local28 = local20 == null ? null : local20.aClass3_Sub7_Sub17_6;
		} else {
			local28 = this.aClass3_Sub7_Sub17_1;
			this.aClass3_Sub7_Sub17_1 = null;
		}
		if (local28 != null) {
			Static436.method5764(local28, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)I")
	public int method362() {
		return this.aClass170_1 == null ? 15 : this.aClass170_1.na() / 4;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class170 method363(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		if (this.aClass170_1 != null && arg1.method9324(this.aClass170_1.ua(), arg0) == 0) {
			return this.aClass170_1;
		} else {
			@Pc(38) Class347 local38 = this.method364(false, arg1, arg0);
			return local38 == null ? null : local38.aClass170_8;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	@Override
	public void method9103() {
		if (this.aClass170_1 != null) {
			this.aClass170_1.method8362();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class9_Sub1_Sub2_Sub1) {
			@Pc(5) Class9_Sub1_Sub2_Sub1 local5 = (Class9_Sub1_Sub2_Sub1) arg0;
			if (this.aClass170_1 != null && local5.aClass170_2 != null) {
				this.aClass170_1.method8355(local5.aClass170_2, arg4, arg2, arg5, arg3);
			}
		} else if (arg0 instanceof Class9_Sub1_Sub1_Sub1) {
			@Pc(34) Class9_Sub1_Sub1_Sub1 local34 = (Class9_Sub1_Sub1_Sub1) arg0;
			if (this.aClass170_1 != null && local34.aClass170_1 != null) {
				this.aClass170_1.method8355(local34.aClass170_1, arg4, arg2, arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)I")
	@Override
	public int method9102() {
		return this.aByte9;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class170 local9 = this.method363(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class58 local20 = arg0.method9354();
			local20.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			return Static444.aBoolean451 ? local9.method8351(arg1, arg2, local20, false, 0, Static668.anInt10260) : local9.method8349(arg1, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9106(@OriginalArg(1) Class22 arg0) {
		@Pc(28) Class3_Sub7_Sub17 local28;
		if (this.aClass3_Sub7_Sub17_1 == null && this.aBoolean16) {
			@Pc(20) Class347 local20 = this.method364(true, arg0, 262144);
			local28 = local20 == null ? null : local20.aClass3_Sub7_Sub17_6;
		} else {
			local28 = this.aClass3_Sub7_Sub17_1;
			this.aClass3_Sub7_Sub17_1 = null;
		}
		if (local28 != null) {
			Static325.method4736(local28, super.aByte140, super.anInt10694, super.anInt10695, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!ha;II)Lclient!sr;")
	private Class347 method364(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class247 local21 = Static216.aClass53_3.method1523(this.aShort9 & 0xFFFF);
		@Pc(29) Class259 local29;
		@Pc(33) Class259 local33;
		if (this.aBoolean15) {
			local29 = Static378.aClass259Array2[super.aByte140];
			local33 = Static43.aClass259Array1[0];
		} else {
			local29 = Static43.aClass259Array1[super.aByte140];
			if (super.aByte140 < 3) {
				local33 = Static43.aClass259Array1[super.aByte140 + 1];
			} else {
				local33 = null;
			}
		}
		return local21.method5446((Class165) null, arg0, super.anInt10690, this.aByte9 == 11 ? 10 : this.aByte9, arg2, super.anInt10695, arg1, local29, super.anInt10694, local33, this.aByte9 == 11 ? this.aByte10 + 4 : this.aByte10);
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aClass170_1 == null ? false : this.aClass170_1.F();
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		this.lb = false;
		if (this.aClass170_1 != null) {
			this.aClass170_1.s(this.aClass170_1.ua() & 0xFFFEFFFF);
		}
	}
}
