import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class26_Sub1_Sub1 extends Class26_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Z")
	private final boolean aBoolean19;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "S")
	private final short aShort2;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
	private final boolean aBoolean16;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "B")
	private final byte aByte4;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Z")
	private boolean aBoolean18;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "Z")
	private final boolean aBoolean17;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!j;")
	private Class1_Sub2_Sub11 aClass1_Sub2_Sub11_1;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "Lclient!c;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIZIIZ)V")
	public Class26_Sub1_Sub1(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static270.method3943(arg8, arg7));
		this.aBoolean19 = arg6;
		this.aShort2 = (short) arg1.anInt5478;
		super.anInt3954 = arg5;
		this.aBoolean16 = arg1.anInt5468 != 0 && !arg6;
		super.anInt3955 = arg3;
		this.aByte3 = (byte) arg8;
		this.aByte2 = (byte) arg2;
		this.aByte4 = (byte) arg7;
		this.aBoolean18 = arg9;
		this.aBoolean17 = arg0.method4734() && arg1.aBoolean362 && !this.aBoolean19 && Static389.aClass128_Sub1_1.method2977(Static285.anInt7839) != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean18) {
			local68 |= 0x10000;
		}
		@Pc(83) Class232 local83 = this.method550(arg0, this.aBoolean17, local68);
		if (local83 != null) {
			this.aClass1_Sub2_Sub11_1 = local83.aClass1_Sub2_Sub11_6;
			this.aClass37_1 = local83.aClass37_6;
			if (this.aBoolean18) {
				this.aClass37_1 = this.aClass37_1.method4221((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aBoolean17;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return this.aBoolean18;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qa;ZII)Lclient!tt;")
	private Class232 method550(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class182 local13 = Static71.aClass105_6.method2336(this.aShort2 & 0xFFFF);
		@Pc(30) Class136 local30;
		@Pc(25) Class136 local25;
		if (this.aBoolean19) {
			local25 = Static328.aClass136Array3[0];
			local30 = Static160.aClass136Array2[this.aByte2];
		} else {
			if (this.aByte2 < 3) {
				local25 = Static328.aClass136Array3[this.aByte2 + 1];
			} else {
				local25 = null;
			}
			local30 = Static328.aClass136Array3[this.aByte2];
		}
		return local13.method4378(super.anInt3955, local30, super.anInt3956, this.aByte4, arg0, this.aByte3, arg1, super.anInt3954, local25, arg2);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		@Pc(29) Class1_Sub2_Sub11 local29;
		if (this.aClass1_Sub2_Sub11_1 == null && this.aBoolean17) {
			@Pc(22) Class232 local22 = this.method550(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass1_Sub2_Sub11_6;
		} else {
			local29 = this.aClass1_Sub2_Sub11_1;
			this.aClass1_Sub2_Sub11_1 = null;
		}
		if (local29 != null) {
			Static225.method3380(local29, this.aByte2, super.anInt3955, super.anInt3954, null);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aByte4;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class37 local9 = this.method551(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class18 local14 = arg0.method4709();
			local14.R(super.anInt3955, super.anInt3956, super.anInt3954);
			return local9.method4228(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
		if (this.aClass37_1 != null) {
			this.aClass37_1.method4236();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.method551(arg1, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		this.aBoolean18 = false;
		if (this.aClass37_1 != null) {
			this.aClass37_1.u(this.aClass37_1.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		if (this.aClass37_1 == null) {
			return null;
		}
		@Pc(11) Class18 local11 = arg0.method4709();
		local11.R(super.anInt3955, super.anInt3956, super.anInt3954);
		@Pc(27) Class39_Sub4 local27 = null;
		if (this.aBoolean16) {
			local27 = Static72.method1208(1);
		}
		this.aClass37_1.method4230(local11, local27 == null ? null : local27.aClass39_Sub7Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 instanceof Class26_Sub1_Sub1) {
			@Pc(40) Class26_Sub1_Sub1 local40 = (Class26_Sub1_Sub1) arg2;
			if (this.aClass37_1 == null || local40.aClass37_1 == null) {
				return;
			}
			this.aClass37_1.method4237(local40.aClass37_1, arg3, arg1, arg0, arg5);
		} else if (arg2 instanceof Class26_Sub2_Sub4) {
			@Pc(21) Class26_Sub2_Sub4 local21 = (Class26_Sub2_Sub4) arg2;
			if (this.aClass37_1 != null && local21.aClass37_5 != null) {
				this.aClass37_1.method4237(local21.aClass37_5, arg3, arg1, arg0, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qa;BI)Lclient!c;")
	private Class37 method551(@OriginalArg(0) Class109 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass37_1 != null && arg0.method4710(this.aClass37_1.n(), arg1) == 0) {
			return this.aClass37_1;
		} else {
			@Pc(29) Class232 local29 = this.method550(arg0, false, arg1);
			return local29 == null ? null : local29.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		@Pc(25) Class1_Sub2_Sub11 local25;
		if (this.aClass1_Sub2_Sub11_1 == null && this.aBoolean17) {
			@Pc(18) Class232 local18 = this.method550(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub2_Sub11_6;
		} else {
			local25 = this.aClass1_Sub2_Sub11_1;
			this.aClass1_Sub2_Sub11_1 = null;
		}
		if (local25 != null) {
			Static349.method1152(local25, this.aByte2, super.anInt3955, super.anInt3954, null);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aShort2 & 0xFFFF;
	}
}
