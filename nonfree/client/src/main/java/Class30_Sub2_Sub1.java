import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class30_Sub2_Sub1 extends Class30_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!cq", name = "D", descriptor = "Lclient!nk;")
	private Class218 aClass218_1;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "Z")
	private final boolean aBoolean133;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "S")
	private final short aShort34;

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "Z")
	private final boolean aBoolean134;

	@OriginalMember(owner = "client!cq", name = "F", descriptor = "Lclient!k;")
	private Class12_Sub4_Sub10 aClass12_Sub4_Sub10_1;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "Lclient!r;")
	public Class26 aClass26_2;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIZIIZ)V")
	public Class30_Sub2_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static52.method1402(arg8, arg7));
		super.anInt9035 = arg3;
		this.aByte30 = (byte) arg8;
		super.anInt9036 = arg5;
		this.aBoolean132 = arg9;
		this.aByte31 = (byte) arg7;
		this.aBoolean133 = arg1.anInt8276 != 0 && !arg6;
		this.aBoolean131 = arg6;
		this.aByte32 = (byte) arg2;
		this.aShort34 = (short) arg1.anInt8315;
		this.aBoolean134 = arg0.method5848() && arg1.aBoolean583 && !this.aBoolean131 && Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean132) {
			local71 |= 0x10000;
		}
		@Pc(86) Class118 local86 = this.method1648(local71, this.aBoolean134, arg0);
		if (local86 != null) {
			this.aClass12_Sub4_Sub10_1 = local86.aClass12_Sub4_Sub10_2;
			this.aClass26_2 = local86.aClass26_3;
			if (this.aBoolean132) {
				this.aClass26_2 = this.aClass26_2.method7992((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!qa;BI)Lclient!r;")
	private Class26 method1642(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass26_2 != null && arg0.method5857(this.aClass26_2.ba(), arg1) == 0) {
			return this.aClass26_2;
		} else {
			@Pc(31) Class118 local31 = this.method1648(arg1, false, arg0);
			return local31 == null ? null : local31.aClass26_3;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aBoolean134;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		@Pc(21) Class12_Sub4_Sub10 local21;
		if (this.aClass12_Sub4_Sub10_1 == null && this.aBoolean134) {
			@Pc(32) Class118 local32 = this.method1648(262144, true, arg0);
			local21 = local32 == null ? null : local32.aClass12_Sub4_Sub10_2;
		} else {
			local21 = this.aClass12_Sub4_Sub10_1;
			this.aClass12_Sub4_Sub10_1 = null;
		}
		if (local21 != null) {
			Static116.method2386(local21, this.aByte32, super.anInt9035, super.anInt9036, null);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.method1642(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
		if (this.aClass26_2 != null) {
			this.aClass26_2.method8004();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		if (arg3 instanceof Class30_Sub2_Sub1) {
			@Pc(9) Class30_Sub2_Sub1 local9 = (Class30_Sub2_Sub1) arg3;
			if (this.aClass26_2 != null && local9.aClass26_2 != null) {
				this.aClass26_2.method7998(local9.aClass26_2, arg4, arg2, arg0, arg1);
			}
		} else if (arg3 instanceof Class30_Sub1_Sub6) {
			@Pc(32) Class30_Sub1_Sub6 local32 = (Class30_Sub1_Sub6) arg3;
			if (this.aClass26_2 != null && local32.aClass26_5 != null) {
				this.aClass26_2.method7998(local32.aClass26_5, arg4, arg2, arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aShort34 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		this.aBoolean132 = false;
		if (this.aClass26_2 != null) {
			this.aClass26_2.m(this.aClass26_2.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		@Pc(14) Class12_Sub4_Sub10 local14;
		if (this.aClass12_Sub4_Sub10_1 == null && this.aBoolean134) {
			@Pc(25) Class118 local25 = this.method1648(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass12_Sub4_Sub10_2;
		} else {
			local14 = this.aClass12_Sub4_Sub10_1;
			this.aClass12_Sub4_Sub10_1 = null;
		}
		if (local14 != null) {
			Static434.method6614(local14, this.aByte32, super.anInt9035, super.anInt9036, null);
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		if (this.aClass26_2 == null) {
			return null;
		}
		@Pc(16) Class91 local16 = arg0.method5847();
		local16.oa(super.anInt9035, super.anInt9034, super.anInt9036);
		@Pc(26) Class7_Sub8 local26 = null;
		if (this.aBoolean133) {
			local26 = Static196.method3703(1);
		}
		this.aClass26_2.method8003(local16, local26 == null ? null : local26.aClass7_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return this.aBoolean132;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		if (this.aClass218_1 == null) {
			this.aClass218_1 = Static368.method5722(super.anInt9034, this.method1642(arg0, 0), super.anInt9035, super.anInt9036);
		}
		return this.aClass218_1;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZLclient!qa;I)Lclient!gm;")
	private Class118 method1648(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class42 arg2) {
		@Pc(21) Class279 local21 = Static49.aClass155_2.method4063(this.aShort34 & 0xFFFF);
		@Pc(29) Class215 local29;
		@Pc(40) Class215 local40;
		if (this.aBoolean131) {
			local29 = Static67.aClass215Array2[this.aByte32];
			local40 = Static155.aClass215Array5[0];
		} else {
			local29 = Static155.aClass215Array5[this.aByte32];
			if (this.aByte32 < 3) {
				local40 = Static155.aClass215Array5[this.aByte32 + 1];
			} else {
				local40 = null;
			}
		}
		return local21.method6874(this.aByte31, arg2, super.anInt9035, local29, this.aByte30, arg1, super.anInt9036, local40, super.anInt9034, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class26 local9 = this.method1642(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(24) Class91 local24 = arg0.method5847();
			local24.oa(super.anInt9035, super.anInt9034, super.anInt9036);
			return local9.method8005(arg1, arg2, local24, false);
		}
	}
}
