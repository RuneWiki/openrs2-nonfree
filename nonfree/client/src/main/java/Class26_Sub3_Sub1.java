import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class26_Sub3_Sub1 extends Class26_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "B")
	private final byte aByte11;

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "S")
	private final short aShort15;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "Z")
	private final boolean aBoolean41;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "Lclient!t;")
	public Class163 aClass163_2;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "Lclient!ba;")
	private Class7_Sub4_Sub2 aClass7_Sub4_Sub2_2;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIZIIZ)V")
	public Class26_Sub3_Sub1(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static417.method5226(arg8, arg7));
		super.anInt5727 = arg3;
		this.aByte10 = (byte) arg7;
		this.aBoolean44 = arg9;
		this.aBoolean43 = arg1.anInt5106 != 0 && !arg6;
		this.aByte11 = (byte) arg8;
		this.aShort15 = (short) arg1.anInt5088;
		this.aBoolean41 = arg6;
		super.anInt5726 = arg5;
		this.aByte9 = (byte) arg2;
		this.aBoolean42 = arg0.method5295() && arg1.aBoolean313 && !this.aBoolean41 && Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean44) {
			local71 |= 0x10000;
		}
		@Pc(86) Class221 local86 = this.method677(arg0, local71, this.aBoolean42);
		if (local86 != null) {
			this.aClass163_2 = local86.aClass163_6;
			this.aClass7_Sub4_Sub2_2 = local86.aClass7_Sub4_Sub2_5;
			if (this.aBoolean44) {
				this.aClass163_2 = this.aClass163_2.method4654((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!ya;B)Lclient!t;")
	private Class163 method674(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		if (this.aClass163_2 != null && arg1.method5352(this.aClass163_2.P(), arg0) == 0) {
			return this.aClass163_2;
		} else {
			@Pc(26) Class221 local26 = this.method677(arg1, arg0, false);
			return local26 == null ? null : local26.aClass163_6;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		if (this.aClass163_2 == null) {
			return null;
		}
		@Pc(16) Class33 local16 = arg0.method5285();
		local16.j(super.anInt5727, super.anInt5725, super.anInt5726);
		@Pc(26) Class28_Sub4 local26 = null;
		if (this.aBoolean43) {
			local26 = Static329.method4328(1);
		}
		this.aClass163_2.method4667(local16, local26 == null ? null : local26.aClass28_Sub6Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		@Pc(25) Class7_Sub4_Sub2 local25;
		if (this.aClass7_Sub4_Sub2_2 == null && this.aBoolean42) {
			@Pc(18) Class221 local18 = this.method677(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass7_Sub4_Sub2_5;
		} else {
			local25 = this.aClass7_Sub4_Sub2_2;
			this.aClass7_Sub4_Sub2_2 = null;
		}
		if (local25 != null) {
			Static133.method2104(local25, this.aByte9, super.anInt5727, super.anInt5726, null);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.method674(arg0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		@Pc(35) Class7_Sub4_Sub2 local35;
		if (this.aClass7_Sub4_Sub2_2 == null && this.aBoolean42) {
			@Pc(28) Class221 local28 = this.method677(arg0, 262144, true);
			local35 = local28 == null ? null : local28.aClass7_Sub4_Sub2_5;
		} else {
			local35 = this.aClass7_Sub4_Sub2_2;
			this.aClass7_Sub4_Sub2_2 = null;
		}
		if (local35 != null) {
			Static294.method3886(local35, this.aByte9, super.anInt5727, super.anInt5726, null);
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
		if (this.aClass163_2 != null) {
			this.aClass163_2.method4671();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte11;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		this.aBoolean44 = false;
		if (this.aClass163_2 != null) {
			this.aClass163_2.UA(this.aClass163_2.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class26_Sub3_Sub1) {
			@Pc(32) Class26_Sub3_Sub1 local32 = (Class26_Sub3_Sub1) arg4;
			if (this.aClass163_2 != null && local32.aClass163_2 != null) {
				this.aClass163_2.method4658(local32.aClass163_2, arg2, arg1, arg3, arg5);
			}
		} else if (arg4 instanceof Class26_Sub2_Sub6) {
			@Pc(12) Class26_Sub2_Sub6 local12 = (Class26_Sub2_Sub6) arg4;
			if (this.aClass163_2 != null && local12.aClass163_7 != null) {
				this.aClass163_2.method4658(local12.aClass163_7, arg2, arg1, arg3, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aBoolean42;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aShort15 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!ya;IZ)Lclient!ro;")
	private Class221 method677(@OriginalArg(1) Class51 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class189 local13 = Static411.aClass142_4.method3148(this.aShort15 & 0xFFFF);
		@Pc(25) Class165 local25;
		@Pc(20) Class165 local20;
		if (this.aBoolean41) {
			local20 = Static149.aClass165Array7[0];
			local25 = Static28.aClass165Array1[this.aByte9];
		} else {
			local25 = Static149.aClass165Array7[this.aByte9];
			if (this.aByte9 < 3) {
				local20 = Static149.aClass165Array7[this.aByte9 + 1];
			} else {
				local20 = null;
			}
		}
		return local13.method4029(arg1, arg2, super.anInt5725, this.aByte11, super.anInt5727, arg0, local25, this.aByte10, local20, super.anInt5726);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class163 local23 = this.method674(131072, arg1);
		if (local23 == null) {
			return false;
		} else {
			@Pc(28) Class33 local28 = arg1.method5285();
			local28.j(super.anInt5727, super.anInt5725, super.anInt5726);
			return local23.method4653(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return this.aBoolean44;
	}
}
