import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "S")
	private final short aShort67;

	@OriginalMember(owner = "client!jp", name = "M", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "Lclient!c;")
	private Class7 aClass7_4;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Lclient!j;")
	private Class4_Sub1_Sub7 aClass4_Sub1_Sub7_4;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIZIZ)V")
	public Class6_Sub4_Sub2(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean172, arg1.aBoolean173);
		this.aShort67 = (short) arg1.anInt2158;
		this.aBoolean286 = arg6;
		this.aBoolean285 = arg1.anInt2194 != 0 && !arg6;
		super.anInt4001 = arg5;
		super.anInt4003 = arg3;
		this.aByte68 = (byte) arg7;
		this.aBoolean284 = arg8;
		this.aByte67 = (byte) arg2;
		this.aBoolean283 = arg0.method4679() && arg1.aBoolean168 && !this.aBoolean286 && Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) != 0;
		@Pc(67) int local67 = 2048;
		if (this.aBoolean284) {
			local67 |= 0x10000;
		}
		@Pc(82) Class82 local82 = this.method2827(arg0, this.aBoolean283, local67);
		if (local82 != null) {
			this.aClass7_4 = local82.aClass7_3;
			this.aClass4_Sub1_Sub7_4 = local82.aClass4_Sub1_Sub7_3;
			if (this.aBoolean284) {
				this.aClass7_4 = this.aClass7_4.method4077((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBLclient!qa;)Lclient!c;")
	private Class7 method2826(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass7_4 != null && arg1.method4674(this.aClass7_4.n(), arg0) == 0) {
			return this.aClass7_4;
		} else {
			@Pc(31) Class82 local31 = this.method2827(arg1, false, arg0);
			return local31 == null ? null : local31.aClass7_3;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		@Pc(18) Class4_Sub1_Sub7 local18;
		if (this.aClass4_Sub1_Sub7_4 == null && this.aBoolean283) {
			@Pc(29) Class82 local29 = this.method2827(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass4_Sub1_Sub7_3;
		} else {
			local18 = this.aClass4_Sub1_Sub7_4;
			this.aClass4_Sub1_Sub7_4 = null;
		}
		if (local18 != null) {
			Static1.method33(local18, this.aByte67, super.anInt4003, super.anInt4001, null);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(19) Class7 local19 = this.method2826(131072, arg2);
		if (local19 == null) {
			return false;
		} else {
			@Pc(24) Class116 local24 = arg2.method4678();
			local24.R(super.anInt4003, super.anInt4002, super.anInt4001);
			return local19.method4082(arg0, arg1, local24, false);
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
		if (this.aClass7_4 != null) {
			this.aClass7_4.method4095();
		}
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		this.aBoolean284 = false;
		if (this.aClass7_4 != null) {
			this.aClass7_4.u(this.aClass7_4.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		if (this.aClass7_4 == null) {
			return null;
		}
		@Pc(17) Class116 local17 = arg0.method4678();
		local17.R(super.anInt4003, super.anInt4002, super.anInt4001);
		@Pc(27) Class41_Sub6 local27 = null;
		if (this.aBoolean285) {
			local27 = Static381.method5198(1);
		}
		this.aClass7_4.method4091(local17, local27 == null ? null : local27.aClass41_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return 22;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aShort67 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!qa;ZZI)Lclient!fo;")
	private Class82 method2827(@OriginalArg(0) Class30 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class71 local18 = Static2.aClass74_13.method1683(this.aShort67 & 0xFFFF);
		@Pc(30) Class146 local30;
		@Pc(25) Class146 local25;
		if (this.aBoolean286) {
			local25 = Static422.aClass146Array3[0];
			local30 = Static117.aClass146Array1[this.aByte67];
		} else {
			if (this.aByte67 < 3) {
				local25 = Static422.aClass146Array3[this.aByte67 + 1];
			} else {
				local25 = null;
			}
			local30 = Static422.aClass146Array3[this.aByte67];
		}
		return local18.method1625(arg2, 22, super.anInt4003, super.anInt4001, this.aByte68, local30, local25, arg1, arg0, super.anInt4002);
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.method2826(arg0, arg1);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		@Pc(14) Class4_Sub1_Sub7 local14;
		if (this.aClass4_Sub1_Sub7_4 == null && this.aBoolean283) {
			@Pc(25) Class82 local25 = this.method2827(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass4_Sub1_Sub7_3;
		} else {
			local14 = this.aClass4_Sub1_Sub7_4;
			this.aClass4_Sub1_Sub7_4 = null;
		}
		if (local14 != null) {
			Static13.method320(local14, this.aByte67, super.anInt4003, super.anInt4001, null);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!(arg0 instanceof Class6_Sub4_Sub2)) {
			return;
		}
		@Pc(15) Class6_Sub4_Sub2 local15 = (Class6_Sub4_Sub2) arg0;
		if (this.aClass7_4 != null && local15.aClass7_4 != null) {
			this.aClass7_4.method4078(local15.aClass7_4, arg4, arg5, arg2, arg3);
			return;
		}
	}
}
