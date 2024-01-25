import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "Z")
	private final boolean aBoolean311;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "S")
	private final short aShort68;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Z")
	private final boolean aBoolean312;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "Lclient!j;")
	private Class4_Sub1_Sub7 aClass4_Sub1_Sub7_5;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "Lclient!c;")
	public Class7 aClass7_5;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIZIIZ)V")
	public Class6_Sub1_Sub2(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static332.method4501(arg8, arg7));
		this.aByte72 = (byte) arg7;
		super.anInt5380 = arg5;
		this.aBoolean311 = arg1.anInt2194 != 0 && !arg6;
		this.aBoolean314 = arg9;
		super.anInt5378 = arg3;
		this.aBoolean313 = arg6;
		this.aByte70 = (byte) arg8;
		this.aShort68 = (short) arg1.anInt2158;
		this.aByte71 = (byte) arg2;
		this.aBoolean312 = arg0.method4679() && arg1.aBoolean168 && !this.aBoolean313 && Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean314) {
			local71 |= 0x10000;
		}
		@Pc(86) Class82 local86 = this.method3194(this.aBoolean312, local71, arg0);
		if (local86 != null) {
			this.aClass4_Sub1_Sub7_5 = local86.aClass4_Sub1_Sub7_3;
			this.aClass7_5 = local86.aClass7_3;
			if (this.aBoolean314) {
				this.aClass7_5 = this.aClass7_5.method4077((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return this.aBoolean314;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aShort68 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		if (this.aClass7_5 == null) {
			return null;
		}
		@Pc(11) Class116 local11 = arg0.method4678();
		local11.R(super.anInt5378, super.anInt5382, super.anInt5380);
		@Pc(21) Class41_Sub6 local21 = null;
		if (this.aBoolean311) {
			local21 = Static381.method5198(1);
		}
		this.aClass7_5.method4091(local11, local21 == null ? null : local21.aClass41_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.method3191(arg0, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILclient!qa;)Lclient!c;")
	private Class7 method3191(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass7_5 != null && arg1.method4674(this.aClass7_5.n(), arg0) == 0) {
			return this.aClass7_5;
		} else {
			@Pc(32) Class82 local32 = this.method3194(false, arg0, arg1);
			return local32 == null ? null : local32.aClass7_3;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		@Pc(31) Class4_Sub1_Sub7 local31;
		if (this.aClass4_Sub1_Sub7_5 == null && this.aBoolean312) {
			@Pc(24) Class82 local24 = this.method3194(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass4_Sub1_Sub7_3;
		} else {
			local31 = this.aClass4_Sub1_Sub7_5;
			this.aClass4_Sub1_Sub7_5 = null;
		}
		if (local31 != null) {
			Static1.method33(local31, this.aByte71, super.anInt5378, super.anInt5380, null);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(14) Class7 local14 = this.method3191(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class116 local19 = arg2.method4678();
			local19.R(super.anInt5378, super.anInt5382, super.anInt5380);
			return local14.method4082(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		this.aBoolean314 = false;
		if (this.aClass7_5 != null) {
			this.aClass7_5.u(this.aClass7_5.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
		if (this.aClass7_5 != null) {
			this.aClass7_5.method4095();
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class6_Sub1_Sub2) {
			@Pc(9) Class6_Sub1_Sub2 local9 = (Class6_Sub1_Sub2) arg0;
			if (this.aClass7_5 != null && local9.aClass7_5 != null) {
				this.aClass7_5.method4078(local9.aClass7_5, arg4, arg5, arg2, arg3);
			}
		} else if (arg0 instanceof Class6_Sub2_Sub3) {
			@Pc(32) Class6_Sub2_Sub3 local32 = (Class6_Sub2_Sub3) arg0;
			if (this.aClass7_5 != null && local32.aClass7_2 != null) {
				this.aClass7_5.method4078(local32.aClass7_2, arg4, arg5, arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZILclient!qa;I)Lclient!fo;")
	private Class82 method3194(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2) {
		@Pc(19) Class71 local19 = Static2.aClass74_13.method1683(this.aShort68 & 0xFFFF);
		@Pc(27) Class146 local27;
		@Pc(35) Class146 local35;
		if (this.aBoolean313) {
			local35 = Static422.aClass146Array3[0];
			local27 = Static117.aClass146Array1[this.aByte71];
		} else {
			local27 = Static422.aClass146Array3[this.aByte71];
			if (this.aByte71 >= 3) {
				local35 = null;
			} else {
				local35 = Static422.aClass146Array3[this.aByte71 + 1];
			}
		}
		return local19.method1625(arg1, this.aByte72, super.anInt5378, super.anInt5380, this.aByte70, local27, local35, arg0, arg2, super.anInt5382);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		@Pc(22) Class4_Sub1_Sub7 local22;
		if (this.aClass4_Sub1_Sub7_5 == null && this.aBoolean312) {
			@Pc(33) Class82 local33 = this.method3194(true, 262144, arg0);
			local22 = local33 == null ? null : local33.aClass4_Sub1_Sub7_3;
		} else {
			local22 = this.aClass4_Sub1_Sub7_5;
			this.aClass4_Sub1_Sub7_5 = null;
		}
		if (local22 != null) {
			Static13.method320(local22, this.aByte71, super.anInt5378, super.anInt5380, null);
		}
	}
}
