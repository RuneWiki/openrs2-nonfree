import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class30_Sub3_Sub3 extends Class30_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "Lclient!nk;")
	private Class218 aClass218_5;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "S")
	private final short aShort109;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
	private final boolean aBoolean632;

	@OriginalMember(owner = "client!uk", name = "I", descriptor = "Z")
	private boolean aBoolean635;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Z")
	private final boolean aBoolean634;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "B")
	private final byte aByte97;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "B")
	private final byte aByte98;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
	private final boolean aBoolean633;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "Lclient!r;")
	private Class26 aClass26_4;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Lclient!k;")
	private Class12_Sub4_Sub10 aClass12_Sub4_Sub10_3;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIZIZ)V")
	public Class30_Sub3_Sub3(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt8278, arg1.aBoolean590, arg1.aBoolean582);
		super.anInt8893 = arg3;
		this.aShort109 = (short) arg1.anInt8315;
		this.aBoolean632 = arg6;
		this.aBoolean635 = arg8;
		this.aBoolean634 = arg1.anInt8276 != 0 && !arg6;
		this.aByte97 = (byte) arg7;
		this.aByte98 = (byte) arg2;
		super.anInt8892 = arg5;
		this.aBoolean633 = arg0.method5848() && arg1.aBoolean583 && !this.aBoolean632 && Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean635) {
			local72 |= 0x10000;
		}
		@Pc(87) Class118 local87 = this.method7333(this.aBoolean633, arg0, local72);
		if (local87 != null) {
			this.aClass26_4 = local87.aClass26_3;
			this.aClass12_Sub4_Sub10_3 = local87.aClass12_Sub4_Sub10_2;
			if (this.aBoolean635) {
				this.aClass26_4 = this.aClass26_4.method7992((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aBoolean633;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!qa;II)Lclient!gm;")
	private Class118 method7333(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class279 local13 = Static49.aClass155_2.method4063(this.aShort109 & 0xFFFF);
		@Pc(38) Class215 local38;
		@Pc(24) Class215 local24;
		if (this.aBoolean632) {
			local24 = Static155.aClass215Array5[0];
			local38 = Static67.aClass215Array2[this.aByte98];
		} else {
			if (this.aByte98 >= 3) {
				local24 = null;
			} else {
				local24 = Static155.aClass215Array5[this.aByte98 + 1];
			}
			local38 = Static155.aClass215Array5[this.aByte98];
		}
		return local13.method6874(22, arg1, super.anInt8893, local38, this.aByte97, arg0, super.anInt8892, local24, super.anInt8895, arg2);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		@Pc(29) Class12_Sub4_Sub10 local29;
		if (this.aClass12_Sub4_Sub10_3 == null && this.aBoolean633) {
			@Pc(22) Class118 local22 = this.method7333(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass12_Sub4_Sub10_2;
		} else {
			local29 = this.aClass12_Sub4_Sub10_3;
			this.aClass12_Sub4_Sub10_3 = null;
		}
		if (local29 != null) {
			Static434.method6614(local29, this.aByte98, super.anInt8893, super.anInt8892, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(BLclient!qa;I)Lclient!r;")
	private Class26 method7334(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass26_4 != null && arg0.method5857(this.aClass26_4.ba(), arg1) == 0) {
			return this.aClass26_4;
		} else {
			@Pc(34) Class118 local34 = this.method7333(false, arg0, arg1);
			return local34 == null ? null : local34.aClass26_3;
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aByte97;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class26 local14 = this.method7334(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class91 local19 = arg0.method5847();
			local19.oa(super.anInt8893, super.anInt8895, super.anInt8892);
			return local14.method8005(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		@Pc(14) Class12_Sub4_Sub10 local14;
		if (this.aClass12_Sub4_Sub10_3 == null && this.aBoolean633) {
			@Pc(25) Class118 local25 = this.method7333(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass12_Sub4_Sub10_2;
		} else {
			local14 = this.aClass12_Sub4_Sub10_3;
			this.aClass12_Sub4_Sub10_3 = null;
		}
		if (local14 != null) {
			Static116.method2386(local14, this.aByte98, super.anInt8893, super.anInt8892, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return this.aBoolean635;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		this.aBoolean635 = false;
		if (this.aClass26_4 != null) {
			this.aClass26_4.m(this.aClass26_4.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		if (this.aClass218_5 == null) {
			this.aClass218_5 = Static368.method5722(super.anInt8895, this.method7334(arg0, 0), super.anInt8893, super.anInt8892);
		}
		return this.aClass218_5;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		if (!(arg3 instanceof Class30_Sub3_Sub3)) {
			return;
		}
		@Pc(16) Class30_Sub3_Sub3 local16 = (Class30_Sub3_Sub3) arg3;
		if (this.aClass26_4 != null && local16.aClass26_4 != null) {
			this.aClass26_4.method7998(local16.aClass26_4, arg4, arg2, arg0, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
		if (this.aClass26_4 != null) {
			this.aClass26_4.method8004();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		if (this.aClass26_4 == null) {
			return null;
		}
		@Pc(16) Class91 local16 = arg0.method5847();
		local16.oa(super.anInt8893, super.anInt8895, super.anInt8892);
		@Pc(26) Class7_Sub8 local26 = null;
		if (this.aBoolean634) {
			local26 = Static196.method3703(1);
		}
		this.aClass26_4.method8003(local16, local26 == null ? null : local26.aClass7_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aShort109 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return 22;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.method7334(arg0, arg1);
	}
}
