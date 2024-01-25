import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class26_Sub4_Sub3 extends Class26_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Z")
	private final boolean aBoolean203;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "S")
	private final short aShort38;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Z")
	private final boolean aBoolean204;

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "Z")
	private final boolean aBoolean205;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Lclient!j;")
	private Class1_Sub2_Sub11 aClass1_Sub2_Sub11_4;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "Lclient!c;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIZIZ)V")
	public Class26_Sub4_Sub3(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean348, arg1.aBoolean359);
		this.aBoolean203 = arg6;
		super.anInt3474 = arg5;
		this.aShort38 = (short) arg1.anInt5478;
		this.aByte41 = (byte) arg7;
		this.aBoolean204 = arg1.anInt5468 != 0 && !arg6;
		this.aBoolean206 = arg8;
		super.anInt3476 = arg3;
		this.aByte40 = (byte) arg2;
		this.aBoolean205 = arg0.method4734() && arg1.aBoolean362 && !this.aBoolean203 && Static389.aClass128_Sub1_1.method2977(Static285.anInt7839) != 0;
		@Pc(67) int local67 = 2048;
		if (this.aBoolean206) {
			local67 |= 0x10000;
		}
		@Pc(82) Class232 local82 = this.method2934(this.aBoolean205, local67, arg0);
		if (local82 != null) {
			this.aClass1_Sub2_Sub11_4 = local82.aClass1_Sub2_Sub11_6;
			this.aClass37_4 = local82.aClass37_6;
			if (this.aBoolean206) {
				this.aClass37_4 = this.aClass37_4.method4221((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		@Pc(29) Class1_Sub2_Sub11 local29;
		if (this.aClass1_Sub2_Sub11_4 == null && this.aBoolean205) {
			@Pc(22) Class232 local22 = this.method2934(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass1_Sub2_Sub11_6;
		} else {
			local29 = this.aClass1_Sub2_Sub11_4;
			this.aClass1_Sub2_Sub11_4 = null;
		}
		if (local29 != null) {
			Static349.method1152(local29, this.aByte40, super.anInt3476, super.anInt3474, null);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		@Pc(20) Class1_Sub2_Sub11 local20;
		if (this.aClass1_Sub2_Sub11_4 == null && this.aBoolean205) {
			@Pc(31) Class232 local31 = this.method2934(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass1_Sub2_Sub11_6;
		} else {
			local20 = this.aClass1_Sub2_Sub11_4;
			this.aClass1_Sub2_Sub11_4 = null;
		}
		if (local20 != null) {
			Static225.method3380(local20, this.aByte40, super.anInt3476, super.anInt3474, null);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return 22;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
		if (this.aClass37_4 != null) {
			this.aClass37_4.method4236();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 instanceof Class26_Sub4_Sub3) {
			@Pc(5) Class26_Sub4_Sub3 local5 = (Class26_Sub4_Sub3) arg2;
			if (this.aClass37_4 != null && local5.aClass37_4 != null) {
				this.aClass37_4.method4237(local5.aClass37_4, arg3, arg1, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		this.aBoolean206 = false;
		if (this.aClass37_4 != null) {
			this.aClass37_4.u(this.aClass37_4.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aShort38 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qa;BI)Lclient!c;")
	private Class37 method2932(@OriginalArg(0) Class109 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass37_4 != null && arg0.method4710(this.aClass37_4.n(), arg1) == 0) {
			return this.aClass37_4;
		} else {
			@Pc(26) Class232 local26 = this.method2934(false, arg1, arg0);
			return local26 == null ? null : local26.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return this.aBoolean206;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZBILclient!qa;)Lclient!tt;")
	private Class232 method2934(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class109 arg2) {
		@Pc(13) Class182 local13 = Static71.aClass105_6.method2336(this.aShort38 & 0xFFFF);
		@Pc(46) Class136 local46;
		@Pc(37) Class136 local37;
		if (this.aBoolean203) {
			local46 = Static160.aClass136Array2[this.aByte40];
			local37 = Static328.aClass136Array3[0];
		} else {
			if (this.aByte40 < 3) {
				local37 = Static328.aClass136Array3[this.aByte40 + 1];
			} else {
				local37 = null;
			}
			local46 = Static328.aClass136Array3[this.aByte40];
		}
		return local13.method4378(super.anInt3476, local46, super.anInt3475, 22, arg2, this.aByte41, arg0, super.anInt3474, local37, arg1);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class37 local14 = this.method2932(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class18 local19 = arg0.method4709();
			local19.R(super.anInt3476, super.anInt3475, super.anInt3474);
			return local14.method4228(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aBoolean205;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		if (this.aClass37_4 == null) {
			return null;
		}
		@Pc(16) Class18 local16 = arg0.method4709();
		local16.R(super.anInt3476, super.anInt3475, super.anInt3474);
		@Pc(26) Class39_Sub4 local26 = null;
		if (this.aBoolean204) {
			local26 = Static72.method1208(1);
		}
		this.aClass37_4.method4230(local16, local26 == null ? null : local26.aClass39_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.method2932(arg1, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}
}
