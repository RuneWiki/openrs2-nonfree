import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class26_Sub3_Sub2 extends Class26_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "Z")
	private final boolean aBoolean147;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "Z")
	private final boolean aBoolean146;

	@OriginalMember(owner = "client!hr", name = "db", descriptor = "S")
	private final short aShort30;

	@OriginalMember(owner = "client!hr", name = "V", descriptor = "Z")
	private final boolean aBoolean148;

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "Lclient!c;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!hr", name = "R", descriptor = "Lclient!j;")
	private Class1_Sub2_Sub11 aClass1_Sub2_Sub11_3;

	static {
		new Class84(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIZIIIII)V")
	public Class26_Sub3_Sub2(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static87.method1461(arg11, arg10));
		super.anInt5768 = arg3;
		this.aBoolean147 = arg6;
		this.aByte30 = (byte) arg11;
		this.aByte29 = (byte) arg10;
		this.aByte31 = (byte) arg2;
		this.aBoolean146 = arg1.anInt5468 != 0 && !arg6;
		this.aShort30 = (short) arg1.anInt5478;
		super.anInt5760 = arg5;
		this.aBoolean148 = arg0.method4734() && arg1.aBoolean362 && !this.aBoolean147 && Static389.aClass128_Sub1_1.method2977(Static285.anInt7839) != 0;
		@Pc(74) Class232 local74 = this.method2426(2048, arg0, this.aBoolean148);
		if (local74 != null) {
			this.aClass37_3 = local74.aClass37_6;
			this.aClass1_Sub2_Sub11_3 = local74.aClass1_Sub2_Sub11_6;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		@Pc(21) Class1_Sub2_Sub11 local21;
		if (this.aClass1_Sub2_Sub11_3 == null && this.aBoolean148) {
			@Pc(32) Class232 local32 = this.method2426(262144, arg0, true);
			local21 = local32 == null ? null : local32.aClass1_Sub2_Sub11_6;
		} else {
			local21 = this.aClass1_Sub2_Sub11_3;
			this.aClass1_Sub2_Sub11_3 = null;
		}
		if (local21 != null) {
			Static349.method1152(local21, this.aByte31, super.anInt5768, super.anInt5760, null);
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
		if (this.aClass37_3 != null) {
			this.aClass37_3.method4236();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		if (this.aClass37_3 == null) {
			return null;
		}
		@Pc(11) Class18 local11 = arg0.method4709();
		local11.R(super.anInt5768 + super.anInt5755, super.anInt5758, super.anInt5760 + super.anInt5765);
		@Pc(28) Class39_Sub4 local28 = null;
		if (this.aBoolean146) {
			local28 = Static72.method1208(1);
		}
		this.aClass37_3.method4230(local11, local28 == null ? null : local28.aClass39_Sub7Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		@Pc(32) Class1_Sub2_Sub11 local32;
		if (this.aClass1_Sub2_Sub11_3 == null && this.aBoolean148) {
			@Pc(25) Class232 local25 = this.method2426(262144, arg0, true);
			local32 = local25 == null ? null : local25.aClass1_Sub2_Sub11_6;
		} else {
			local32 = this.aClass1_Sub2_Sub11_3;
			this.aClass1_Sub2_Sub11_3 = null;
		}
		if (local32 != null) {
			Static225.method3380(local32, this.aByte31, super.anInt5768, super.anInt5760, null);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.method2430(arg0, arg1);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!qa;Z)Lclient!tt;")
	private Class232 method2426(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class182 local13 = Static71.aClass105_6.method2336(this.aShort30 & 0xFFFF);
		@Pc(43) Class136 local43;
		@Pc(29) Class136 local29;
		if (this.aBoolean147) {
			local43 = Static160.aClass136Array2[this.aByte31];
			local29 = Static328.aClass136Array3[0];
		} else {
			if (this.aByte31 >= 3) {
				local29 = null;
			} else {
				local29 = Static328.aClass136Array3[this.aByte31 + 1];
			}
			local43 = Static328.aClass136Array3[this.aByte31];
		}
		return local13.method4378(super.anInt5768, local43, super.anInt5758, this.aByte29, arg1, this.aByte30, arg2, super.anInt5760, local29, arg0);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aBoolean148;
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)I")
	@Override
	public int method4627() {
		return this.aClass37_3 == null ? 0 : this.aClass37_3.b();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aShort30 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class37 local15 = this.method2430(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class18 local20 = arg0.method4709();
			local20.R(super.anInt5768, super.anInt5758, super.anInt5760);
			return local15.method4228(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBLclient!qa;)Lclient!c;")
	private Class37 method2430(@OriginalArg(0) int arg0, @OriginalArg(2) Class109 arg1) {
		if (this.aClass37_3 != null && arg1.method4710(this.aClass37_3.n(), arg0) == 0) {
			return this.aClass37_3;
		} else {
			@Pc(30) Class232 local30 = this.method2426(arg0, arg1, false);
			return local30 == null ? null : local30.aClass37_6;
		}
	}
}
