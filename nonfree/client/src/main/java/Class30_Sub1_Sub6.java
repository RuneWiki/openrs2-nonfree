import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class30_Sub1_Sub6 extends Class30_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!waa", name = "bb", descriptor = "Lclient!nk;")
	private Class218 aClass218_7;

	@OriginalMember(owner = "client!waa", name = "T", descriptor = "Z")
	private final boolean aBoolean668;

	@OriginalMember(owner = "client!waa", name = "ab", descriptor = "B")
	private final byte aByte103;

	@OriginalMember(owner = "client!waa", name = "G", descriptor = "B")
	private final byte aByte101;

	@OriginalMember(owner = "client!waa", name = "z", descriptor = "Z")
	private final boolean aBoolean666;

	@OriginalMember(owner = "client!waa", name = "gb", descriptor = "Z")
	private boolean aBoolean669;

	@OriginalMember(owner = "client!waa", name = "K", descriptor = "B")
	private final byte aByte102;

	@OriginalMember(owner = "client!waa", name = "D", descriptor = "S")
	private final short aShort116;

	@OriginalMember(owner = "client!waa", name = "L", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!waa", name = "I", descriptor = "Lclient!r;")
	public Class26 aClass26_5;

	@OriginalMember(owner = "client!waa", name = "A", descriptor = "Lclient!k;")
	private Class12_Sub4_Sub10 aClass12_Sub4_Sub10_4;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIIZIIIIIIZ)V")
	public Class30_Sub1_Sub6(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8286 == 1, Static298.method2937(arg13, arg12));
		this.aBoolean668 = arg1.anInt8276 != 0 && !arg7;
		this.aByte103 = (byte) arg3;
		this.aByte101 = (byte) arg13;
		this.aBoolean666 = arg7;
		this.aBoolean669 = arg14;
		this.aByte102 = (byte) arg12;
		this.aShort116 = (short) arg1.anInt8315;
		this.aBoolean667 = arg0.method5848() && arg1.aBoolean583 && !this.aBoolean666 && Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean669) {
			local79 |= 0x10000;
		}
		@Pc(94) Class118 local94 = this.method7832(this.aBoolean667, local79, arg0);
		if (local94 != null) {
			this.aClass26_5 = local94.aClass26_3;
			this.aClass12_Sub4_Sub10_4 = local94.aClass12_Sub4_Sub10_2;
			if (this.aBoolean669) {
				this.aClass26_5 = this.aClass26_5.method7992((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class26 method7826(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass26_5 != null && arg0.method5857(this.aClass26_5.ba(), arg1) == 0) {
			return this.aClass26_5;
		} else {
			@Pc(28) Class118 local28 = this.method7832(false, arg1, arg0);
			return local28 == null ? null : local28.aClass26_3;
		}
	}

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		this.aBoolean669 = false;
		if (this.aClass26_5 != null) {
			this.aClass26_5.m(this.aClass26_5.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		@Pc(30) Class12_Sub4_Sub10 local30;
		if (this.aClass12_Sub4_Sub10_4 == null && this.aBoolean667) {
			@Pc(23) Class118 local23 = this.method7832(true, 262144, arg0);
			local30 = local23 == null ? null : local23.aClass12_Sub4_Sub10_2;
		} else {
			local30 = this.aClass12_Sub4_Sub10_4;
			this.aClass12_Sub4_Sub10_4 = null;
		}
		if (local30 != null) {
			Static434.method6614(local30, this.aByte103, super.anInt9418, super.anInt9416, null);
		}
	}

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "(I)I")
	@Override
	public int method7815() {
		return this.aClass26_5 == null ? 0 : this.aClass26_5.TA();
	}

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "(I)I")
	public int method7827() {
		return this.aClass26_5 == null ? 15 : this.aClass26_5.e() / 4;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		if (arg3 instanceof Class30_Sub2_Sub1) {
			@Pc(39) Class30_Sub2_Sub1 local39 = (Class30_Sub2_Sub1) arg3;
			if (this.aClass26_5 == null || local39.aClass26_2 == null) {
				return;
			}
			this.aClass26_5.method7998(local39.aClass26_2, arg4, arg2, arg0, arg1);
		} else if (arg3 instanceof Class30_Sub1_Sub6) {
			@Pc(20) Class30_Sub1_Sub6 local20 = (Class30_Sub1_Sub6) arg3;
			if (this.aClass26_5 != null && local20.aClass26_5 != null) {
				this.aClass26_5.method7998(local20.aClass26_5, arg4, arg2, arg0, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.method7826(arg0, arg1);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aShort116 & 0xFFFF;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		if (this.aClass26_5 == null) {
			return null;
		}
		@Pc(11) Class91 local11 = arg0.method5847();
		local11.oa(super.anInt9418, super.anInt9422, super.anInt9416);
		@Pc(21) Class7_Sub8 local21 = null;
		if (this.aBoolean668) {
			local21 = Static196.method3703(1);
		}
		this.aClass26_5.method8003(local11, local21 == null ? null : local21.aClass7_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		@Pc(37) Class12_Sub4_Sub10 local37;
		if (this.aClass12_Sub4_Sub10_4 == null && this.aBoolean667) {
			@Pc(30) Class118 local30 = this.method7832(true, 262144, arg0);
			local37 = local30 == null ? null : local30.aClass12_Sub4_Sub10_2;
		} else {
			local37 = this.aClass12_Sub4_Sub10_4;
			this.aClass12_Sub4_Sub10_4 = null;
		}
		if (local37 != null) {
			Static116.method2386(local37, this.aByte103, super.anInt9418, super.anInt9416, null);
		}
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aBoolean667;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
		if (this.aClass26_5 != null) {
			this.aClass26_5.method8004();
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		if (this.aClass218_7 == null) {
			this.aClass218_7 = Static368.method5722(super.anInt9422, this.method7826(arg0, 0), super.anInt9418, super.anInt9416);
		}
		return this.aClass218_7;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class26 local21 = this.method7826(arg0, 131072);
		if (local21 == null) {
			return false;
		} else {
			@Pc(26) Class91 local26 = arg0.method5847();
			local26.oa(super.anInt9418, super.anInt9422, super.anInt9416);
			return local21.method8005(arg1, arg2, local26, false);
		}
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return this.aBoolean669;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aByte101;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aByte102;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZILclient!qa;B)Lclient!gm;")
	private Class118 method7832(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2) {
		@Pc(13) Class279 local13 = Static49.aClass155_2.method4063(this.aShort116 & 0xFFFF);
		@Pc(36) Class215 local36;
		@Pc(22) Class215 local22;
		if (this.aBoolean666) {
			local22 = Static155.aClass215Array5[0];
			local36 = Static67.aClass215Array2[this.aByte103];
		} else {
			if (this.aByte103 >= 3) {
				local22 = null;
			} else {
				local22 = Static155.aClass215Array5[this.aByte103 + 1];
			}
			local36 = Static155.aClass215Array5[this.aByte103];
		}
		return local13.method6874(this.aByte102 == 11 ? 10 : this.aByte102, arg2, super.anInt9418, local36, this.aByte102 == 11 ? this.aByte101 + 4 : this.aByte101, arg0, super.anInt9416, local22, super.anInt9422, arg1);
	}
}
