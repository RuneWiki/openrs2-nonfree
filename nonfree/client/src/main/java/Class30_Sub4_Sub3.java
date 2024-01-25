import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class30_Sub4_Sub3 extends Class30_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!wj", name = "U", descriptor = "Lclient!nk;")
	private Class218 aClass218_8;

	@OriginalMember(owner = "client!wj", name = "X", descriptor = "B")
	private final byte aByte109;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "B")
	private final byte aByte107;

	@OriginalMember(owner = "client!wj", name = "W", descriptor = "S")
	private final short aShort117;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "Z")
	private final boolean aBoolean676;

	@OriginalMember(owner = "client!wj", name = "Q", descriptor = "B")
	private final byte aByte108;

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "Z")
	private final boolean aBoolean678;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "Lclient!k;")
	private Class12_Sub4_Sub10 aClass12_Sub4_Sub10_6;

	@OriginalMember(owner = "client!wj", name = "I", descriptor = "Lclient!r;")
	private Class26 aClass26_7;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIZIIIII)V")
	public Class30_Sub4_Sub3(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static511.method7592(arg11, arg10));
		this.aByte109 = (byte) arg10;
		this.aByte107 = (byte) arg11;
		this.aShort117 = (short) arg1.anInt8315;
		this.aBoolean676 = arg6;
		super.anInt9550 = arg5;
		this.aByte108 = (byte) arg2;
		this.aBoolean679 = arg1.anInt8276 != 0 && !arg6;
		super.anInt9546 = arg3;
		this.aBoolean678 = arg0.method5848() && arg1.aBoolean583 && !this.aBoolean676 && Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) != 0;
		@Pc(80) Class118 local80 = this.method7924(this.aBoolean678, arg0, 2048);
		if (local80 != null) {
			this.aClass12_Sub4_Sub10_6 = local80.aClass12_Sub4_Sub10_2;
			this.aClass26_7 = local80.aClass26_3;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aByte109;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.method7922(arg1, arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class26 method7922(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1) {
		if (this.aClass26_7 != null && arg1.method5857(this.aClass26_7.ba(), arg0) == 0) {
			return this.aClass26_7;
		} else {
			@Pc(28) Class118 local28 = this.method7924(false, arg1, arg0);
			return local28 == null ? null : local28.aClass26_3;
		}
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)I")
	@Override
	public int method7910() {
		return this.aClass26_7 == null ? 0 : this.aClass26_7.TA();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aShort117 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		@Pc(33) Class12_Sub4_Sub10 local33;
		if (this.aClass12_Sub4_Sub10_6 == null && this.aBoolean678) {
			@Pc(26) Class118 local26 = this.method7924(true, arg0, 262144);
			local33 = local26 == null ? null : local26.aClass12_Sub4_Sub10_2;
		} else {
			local33 = this.aClass12_Sub4_Sub10_6;
			this.aClass12_Sub4_Sub10_6 = null;
		}
		if (local33 != null) {
			Static434.method6614(local33, this.aByte108, super.anInt9546, super.anInt9550, null);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		if (this.aClass218_8 == null) {
			this.aClass218_8 = Static368.method5722(super.anInt9553, this.method7922(0, arg0), super.anInt9546, super.anInt9550);
		}
		return this.aClass218_8;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aByte107;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZLclient!qa;I)Lclient!gm;")
	private Class118 method7924(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class279 local13 = Static49.aClass155_2.method4063(this.aShort117 & 0xFFFF);
		@Pc(38) Class215 local38;
		@Pc(24) Class215 local24;
		if (this.aBoolean676) {
			local24 = Static155.aClass215Array5[0];
			local38 = Static67.aClass215Array2[this.aByte108];
		} else {
			if (this.aByte108 >= 3) {
				local24 = null;
			} else {
				local24 = Static155.aClass215Array5[this.aByte108 + 1];
			}
			local38 = Static155.aClass215Array5[this.aByte108];
		}
		return local13.method6874(this.aByte109, arg1, super.anInt9546, local38, this.aByte107, arg0, super.anInt9550, local24, super.anInt9553, arg2);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
		if (this.aClass26_7 != null) {
			this.aClass26_7.method8004();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class26 local9 = this.method7922(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class91 local14 = arg0.method5847();
			local14.oa(super.anInt9546, super.anInt9553, super.anInt9550);
			return local9.method8005(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		if (this.aClass26_7 == null) {
			return null;
		}
		@Pc(16) Class91 local16 = arg0.method5847();
		local16.oa(super.anInt9545 + super.anInt9546, super.anInt9553, super.anInt9550 + super.anInt9551);
		@Pc(33) Class7_Sub8 local33 = null;
		if (this.aBoolean679) {
			local33 = Static196.method3703(1);
		}
		this.aClass26_7.method8003(local16, local33 == null ? null : local33.aClass7_Sub4Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		@Pc(34) Class12_Sub4_Sub10 local34;
		if (this.aClass12_Sub4_Sub10_6 == null && this.aBoolean678) {
			@Pc(27) Class118 local27 = this.method7924(true, arg0, 262144);
			local34 = local27 == null ? null : local27.aClass12_Sub4_Sub10_2;
		} else {
			local34 = this.aClass12_Sub4_Sub10_6;
			this.aClass12_Sub4_Sub10_6 = null;
		}
		if (local34 != null) {
			Static116.method2386(local34, this.aByte108, super.anInt9546, super.anInt9550, null);
		}
	}
}
