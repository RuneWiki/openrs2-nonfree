import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class7_Sub4_Sub2 extends Class7_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "[I")
	public static final int[] anIntArray205 = new int[99];

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "S")
	private final short aShort57;

	@OriginalMember(owner = "client!hs", name = "S", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Lclient!j;")
	private Class3_Sub4_Sub4 aClass3_Sub4_Sub4_2;

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "Lclient!c;")
	public Class9 aClass9_2;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray205[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIZIIZ)V")
	public Class7_Sub4_Sub2(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static318.method5505(arg8, arg7));
		this.aByte57 = (byte) arg2;
		this.aByte58 = (byte) arg7;
		this.aBoolean280 = arg9;
		super.anInt6143 = arg5;
		this.aBoolean281 = arg6;
		this.aShort57 = (short) arg1.anInt2747;
		super.anInt6147 = arg3;
		this.aBoolean283 = arg1.anInt2768 != 0 && !arg6;
		this.aByte59 = (byte) arg8;
		this.aBoolean282 = arg0.method5513() && arg1.aBoolean257 && !this.aBoolean281 && Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean280) {
			local71 |= 0x10000;
		}
		@Pc(86) Class157 local86 = this.method2572(this.aBoolean282, local71, arg0);
		if (local86 != null) {
			this.aClass3_Sub4_Sub4_2 = local86.aClass3_Sub4_Sub4_5;
			this.aClass9_2 = local86.aClass9_6;
			if (this.aBoolean280) {
				this.aClass9_2 = this.aClass9_2.method5699((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		this.aBoolean280 = false;
		if (this.aClass9_2 != null) {
			this.aClass9_2.u(this.aClass9_2.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		@Pc(25) Class3_Sub4_Sub4 local25;
		if (this.aClass3_Sub4_Sub4_2 == null && this.aBoolean282) {
			@Pc(18) Class157 local18 = this.method2572(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub4_Sub4_5;
		} else {
			local25 = this.aClass3_Sub4_Sub4_2;
			this.aClass3_Sub4_Sub4_2 = null;
		}
		if (local25 != null) {
			Static218.method3304(local25, this.aByte57, super.anInt6147, super.anInt6143, null);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class9 method2568(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1) {
		if (this.aClass9_2 != null && arg1.method5501(this.aClass9_2.n(), arg0) == 0) {
			return this.aClass9_2;
		} else {
			@Pc(30) Class157 local30 = this.method2572(false, arg0, arg1);
			return local30 == null ? null : local30.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.method2568(arg1, arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class9 local9 = this.method2568(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class107 local14 = arg0.method5495();
			local14.R(super.anInt6147, super.anInt6142, super.anInt6143);
			return local9.method5693(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return this.aBoolean280;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aShort57 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		@Pc(20) Class3_Sub4_Sub4 local20;
		if (this.aClass3_Sub4_Sub4_2 == null && this.aBoolean282) {
			@Pc(31) Class157 local31 = this.method2572(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass3_Sub4_Sub4_5;
		} else {
			local20 = this.aClass3_Sub4_Sub4_2;
			this.aClass3_Sub4_Sub4_2 = null;
		}
		if (local20 != null) {
			Static206.method3200(local20, this.aByte57, super.anInt6147, super.anInt6143, null);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		if (this.aClass9_2 == null) {
			return null;
		}
		@Pc(11) Class107 local11 = arg0.method5495();
		local11.R(super.anInt6147, super.anInt6142, super.anInt6143);
		@Pc(21) Class6_Sub1 local21 = null;
		if (this.aBoolean283) {
			local21 = Static43.method829(1);
		}
		this.aClass9_2.method5695(local11, local21 == null ? null : local21.aClass6_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aBoolean282;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
		if (this.aClass9_2 != null) {
			this.aClass9_2.method5682();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZILclient!qa;)Lclient!mr;")
	private Class157 method2572(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2) {
		@Pc(20) Class93 local20 = Static435.aClass30_4.method769(this.aShort57 & 0xFFFF);
		@Pc(28) Class159 local28;
		@Pc(32) Class159 local32;
		if (this.aBoolean281) {
			local28 = Static85.aClass159Array2[this.aByte57];
			local32 = Static26.aClass159Array1[0];
		} else {
			if (this.aByte57 < 3) {
				local32 = Static26.aClass159Array1[this.aByte57 + 1];
			} else {
				local32 = null;
			}
			local28 = Static26.aClass159Array1[this.aByte57];
		}
		return local20.method2060(super.anInt6147, super.anInt6143, this.aByte59, local32, arg1, arg0, arg2, local28, this.aByte58, super.anInt6142);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class7_Sub4_Sub2) {
			@Pc(32) Class7_Sub4_Sub2 local32 = (Class7_Sub4_Sub2) arg3;
			if (this.aClass9_2 != null && local32.aClass9_2 != null) {
				this.aClass9_2.method5696(local32.aClass9_2, arg0, arg5, arg4, arg2);
			}
		} else if (arg3 instanceof Class7_Sub2_Sub2) {
			@Pc(12) Class7_Sub2_Sub2 local12 = (Class7_Sub2_Sub2) arg3;
			if (this.aClass9_2 != null && local12.aClass9_1 != null) {
				this.aClass9_2.method5696(local12.aClass9_1, arg0, arg5, arg4, arg2);
			}
		}
	}
}
