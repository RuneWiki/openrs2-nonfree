import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class26_Sub2_Sub6 extends Class26_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!wk", name = "ab", descriptor = "Z")
	private final boolean aBoolean498;

	@OriginalMember(owner = "client!wk", name = "eb", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "B")
	private final byte aByte103;

	@OriginalMember(owner = "client!wk", name = "S", descriptor = "Z")
	private final boolean aBoolean497;

	@OriginalMember(owner = "client!wk", name = "Y", descriptor = "S")
	private final short aShort106;

	@OriginalMember(owner = "client!wk", name = "cb", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!wk", name = "X", descriptor = "Lclient!t;")
	public Class163 aClass163_7;

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "Lclient!ba;")
	private Class7_Sub4_Sub2 aClass7_Sub4_Sub2_6;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIIZIIIIIIZ)V")
	public Class26_Sub2_Sub6(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5054 == 1, Static279.method5722(arg12, arg13));
		this.aByte104 = (byte) arg13;
		this.aBoolean498 = arg1.anInt5106 != 0 && !arg7;
		this.aByte105 = (byte) arg3;
		this.aByte103 = (byte) arg12;
		this.aBoolean497 = arg7;
		this.aShort106 = (short) arg1.anInt5088;
		this.aBoolean499 = arg14;
		this.aBoolean496 = arg0.method5295() && arg1.aBoolean313 && !this.aBoolean497 && Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean499) {
			local74 |= 0x10000;
		}
		@Pc(89) Class221 local89 = this.method5709(this.aBoolean496, local74, arg0);
		if (local89 != null) {
			this.aClass163_7 = local89.aClass163_6;
			this.aClass7_Sub4_Sub2_6 = local89.aClass7_Sub4_Sub2_5;
			if (this.aBoolean499) {
				this.aClass163_7 = this.aClass163_7.method4654((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)I")
	public int method5705() {
		return this.aClass163_7 == null ? 15 : this.aClass163_7.U() / 4;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
		if (this.aClass163_7 != null) {
			this.aClass163_7.method4671();
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		this.aBoolean499 = false;
		if (this.aClass163_7 != null) {
			this.aClass163_7.UA(this.aClass163_7.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte104;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		@Pc(14) Class7_Sub4_Sub2 local14;
		if (this.aClass7_Sub4_Sub2_6 == null && this.aBoolean496) {
			@Pc(25) Class221 local25 = this.method5709(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass7_Sub4_Sub2_5;
		} else {
			local14 = this.aClass7_Sub4_Sub2_6;
			this.aClass7_Sub4_Sub2_6 = null;
		}
		if (local14 != null) {
			Static133.method2104(local14, this.aByte105, super.anInt7388, super.anInt7383, null);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aByte103;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.method5710(arg1, arg0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return this.aClass163_7 == null ? 0 : this.aClass163_7.MA();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZILclient!ya;)Lclient!ro;")
	private Class221 method5709(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51 arg2) {
		@Pc(19) Class189 local19 = Static411.aClass142_4.method3148(this.aShort106 & 0xFFFF);
		@Pc(27) Class165 local27;
		@Pc(38) Class165 local38;
		if (this.aBoolean497) {
			local27 = Static28.aClass165Array1[this.aByte105];
			local38 = Static149.aClass165Array7[0];
		} else {
			local27 = Static149.aClass165Array7[this.aByte105];
			if (this.aByte105 < 3) {
				local38 = Static149.aClass165Array7[this.aByte105 + 1];
			} else {
				local38 = null;
			}
		}
		return local19.method4029(arg1, arg0, super.anInt7390, this.aByte103 == 11 ? this.aByte104 + 4 : this.aByte104, super.anInt7388, arg2, local27, this.aByte103 == 11 ? 10 : this.aByte103, local38, super.anInt7383);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class163 method5710(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass163_7 != null && arg0.method5352(this.aClass163_7.P(), arg1) == 0) {
			return this.aClass163_7;
		} else {
			@Pc(23) Class221 local23 = this.method5709(false, arg1, arg0);
			return local23 == null ? null : local23.aClass163_6;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		@Pc(32) Class7_Sub4_Sub2 local32;
		if (this.aClass7_Sub4_Sub2_6 == null && this.aBoolean496) {
			@Pc(25) Class221 local25 = this.method5709(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass7_Sub4_Sub2_5;
		} else {
			local32 = this.aClass7_Sub4_Sub2_6;
			this.aClass7_Sub4_Sub2_6 = null;
		}
		if (local32 != null) {
			Static294.method3886(local32, this.aByte105, super.anInt7388, super.anInt7383, null);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class26_Sub3_Sub1) {
			@Pc(17) Class26_Sub3_Sub1 local17 = (Class26_Sub3_Sub1) arg4;
			if (this.aClass163_7 != null && local17.aClass163_2 != null) {
				this.aClass163_7.method4658(local17.aClass163_2, arg2, arg1, arg3, arg5);
			}
		} else if (arg4 instanceof Class26_Sub2_Sub6) {
			@Pc(39) Class26_Sub2_Sub6 local39 = (Class26_Sub2_Sub6) arg4;
			if (this.aClass163_7 != null && local39.aClass163_7 != null) {
				this.aClass163_7.method4658(local39.aClass163_7, arg2, arg1, arg3, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aShort106 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class163 local15 = this.method5710(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class33 local20 = arg1.method5285();
			local20.j(super.anInt7388, super.anInt7390, super.anInt7383);
			return local15.method4653(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		if (this.aClass163_7 == null) {
			return null;
		}
		@Pc(11) Class33 local11 = arg0.method5285();
		local11.j(super.anInt7388, super.anInt7390, super.anInt7383);
		@Pc(21) Class28_Sub4 local21 = null;
		if (this.aBoolean498) {
			local21 = Static329.method4328(1);
		}
		this.aClass163_7.method4667(local11, local21 == null ? null : local21.aClass28_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return this.aBoolean499;
	}
}
