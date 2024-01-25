import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!cr", name = "M", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!cr", name = "V", descriptor = "S")
	private final short aShort34;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "Z")
	private final boolean aBoolean106;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "Lclient!j;")
	private Class4_Sub1_Sub7 aClass4_Sub1_Sub7_2;

	@OriginalMember(owner = "client!cr", name = "T", descriptor = "Lclient!c;")
	public Class7 aClass7_2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIIZIIIIIIZ)V")
	public Class6_Sub2_Sub3(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2174 == 1, Static439.method5663(arg13, arg12));
		this.aByte29 = (byte) arg13;
		this.aBoolean107 = arg14;
		this.aByte31 = (byte) arg3;
		this.aBoolean105 = arg1.anInt2194 != 0 && !arg7;
		this.aBoolean108 = arg7;
		this.aByte30 = (byte) arg12;
		this.aShort34 = (short) arg1.anInt2158;
		this.aBoolean106 = arg0.method4679() && arg1.aBoolean168 && !this.aBoolean108 && Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean107) {
			local77 |= 0x10000;
		}
		@Pc(92) Class82 local92 = this.method1208(arg0, this.aBoolean106, local77);
		if (local92 != null) {
			this.aClass4_Sub1_Sub7_2 = local92.aClass4_Sub1_Sub7_3;
			this.aClass7_2 = local92.aClass7_3;
			if (this.aBoolean107) {
				this.aClass7_2 = this.aClass7_2.method4077((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(16) Class7 local16 = this.method1206(131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class116 local21 = arg2.method4678();
			local21.R(super.anInt6062, super.anInt6067, super.anInt6061);
			return local16.method4082(arg0, arg1, local21, false);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.method1206(arg0, arg1);
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return this.aBoolean107;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class7 method1206(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass7_2 != null && arg1.method4674(this.aClass7_2.n(), arg0) == 0) {
			return this.aClass7_2;
		} else {
			@Pc(27) Class82 local27 = this.method1208(arg1, false, arg0);
			return local27 == null ? null : local27.aClass7_3;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		if (this.aClass7_2 == null) {
			return null;
		}
		@Pc(16) Class116 local16 = arg0.method4678();
		local16.R(super.anInt6062, super.anInt6067, super.anInt6061);
		@Pc(26) Class41_Sub6 local26 = null;
		if (this.aBoolean105) {
			local26 = Static381.method5198(1);
		}
		this.aClass7_2.method4091(local16, local26 == null ? null : local26.aClass41_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "(I)I")
	public int method1207() {
		return this.aClass7_2 == null ? 15 : this.aClass7_2.ra() / 4;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
		if (this.aClass7_2 != null) {
			this.aClass7_2.method4095();
		}
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return this.aClass7_2 == null ? 0 : this.aClass7_2.b();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aShort34 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aBoolean106;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!qa;ZIB)Lclient!fo;")
	private Class82 method1208(@OriginalArg(0) Class30 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class71 local13 = Static2.aClass74_13.method1683(this.aShort34 & 0xFFFF);
		@Pc(29) Class146 local29;
		@Pc(35) Class146 local35;
		if (this.aBoolean108) {
			local29 = Static117.aClass146Array1[this.aByte31];
			local35 = Static422.aClass146Array3[0];
		} else {
			local29 = Static422.aClass146Array3[this.aByte31];
			if (this.aByte31 >= 3) {
				local35 = null;
			} else {
				local35 = Static422.aClass146Array3[this.aByte31 + 1];
			}
		}
		return local13.method1625(arg2, this.aByte30 == 11 ? 10 : this.aByte30, super.anInt6062, super.anInt6061, this.aByte30 == 11 ? this.aByte29 + 4 : this.aByte29, local29, local35, arg1, arg0, super.anInt6067);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class6_Sub1_Sub2) {
			@Pc(9) Class6_Sub1_Sub2 local9 = (Class6_Sub1_Sub2) arg0;
			if (this.aClass7_2 != null && local9.aClass7_5 != null) {
				this.aClass7_2.method4078(local9.aClass7_5, arg4, arg5, arg2, arg3);
			}
		} else if (arg0 instanceof Class6_Sub2_Sub3) {
			@Pc(32) Class6_Sub2_Sub3 local32 = (Class6_Sub2_Sub3) arg0;
			if (this.aClass7_2 != null && local32.aClass7_2 != null) {
				this.aClass7_2.method4078(local32.aClass7_2, arg4, arg5, arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		this.aBoolean107 = false;
		if (this.aClass7_2 != null) {
			this.aClass7_2.u(this.aClass7_2.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		@Pc(25) Class4_Sub1_Sub7 local25;
		if (this.aClass4_Sub1_Sub7_2 == null && this.aBoolean106) {
			@Pc(18) Class82 local18 = this.method1208(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass4_Sub1_Sub7_3;
		} else {
			local25 = this.aClass4_Sub1_Sub7_2;
			this.aClass4_Sub1_Sub7_2 = null;
		}
		if (local25 != null) {
			Static13.method320(local25, this.aByte31, super.anInt6062, super.anInt6061, null);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		@Pc(19) Class4_Sub1_Sub7 local19;
		if (this.aClass4_Sub1_Sub7_2 == null && this.aBoolean106) {
			@Pc(30) Class82 local30 = this.method1208(arg0, true, 262144);
			local19 = local30 == null ? null : local30.aClass4_Sub1_Sub7_3;
		} else {
			local19 = this.aClass4_Sub1_Sub7_2;
			this.aClass4_Sub1_Sub7_2 = null;
		}
		if (local19 != null) {
			Static1.method33(local19, this.aByte31, super.anInt6062, super.anInt6061, null);
		}
	}
}
