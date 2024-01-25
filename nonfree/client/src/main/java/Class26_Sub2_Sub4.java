import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class26_Sub2_Sub4 extends Class26_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!lp", name = "eb", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!lp", name = "P", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "S")
	private final short aShort48;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "Z")
	private final boolean aBoolean280;

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "B")
	private final byte aByte47;

	@OriginalMember(owner = "client!lp", name = "db", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "Lclient!j;")
	private Class1_Sub2_Sub11 aClass1_Sub2_Sub11_5;

	@OriginalMember(owner = "client!lp", name = "W", descriptor = "Lclient!c;")
	public Class37 aClass37_5;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIIZIIIIIIZ)V")
	public Class26_Sub2_Sub4(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5470 == 1, Static246.method3621(arg13, arg12));
		this.aByte49 = (byte) arg13;
		this.aBoolean282 = arg1.anInt5468 != 0 && !arg7;
		this.aShort48 = (short) arg1.anInt5478;
		this.aBoolean279 = arg14;
		this.aBoolean280 = arg7;
		this.aByte47 = (byte) arg12;
		this.aByte48 = (byte) arg3;
		this.aBoolean281 = arg0.method4734() && arg1.aBoolean362 && !this.aBoolean280 && Static389.aClass128_Sub1_1.method2977(Static285.anInt7839) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean279) {
			local79 |= 0x10000;
		}
		@Pc(94) Class232 local94 = this.method3484(arg0, local79, this.aBoolean281);
		if (local94 != null) {
			this.aClass1_Sub2_Sub11_5 = local94.aClass1_Sub2_Sub11_6;
			this.aClass37_5 = local94.aClass37_6;
			if (this.aBoolean279) {
				this.aClass37_5 = this.aClass37_5.method4221((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 instanceof Class26_Sub1_Sub1) {
			@Pc(28) Class26_Sub1_Sub1 local28 = (Class26_Sub1_Sub1) arg2;
			if (this.aClass37_5 != null && local28.aClass37_1 != null) {
				this.aClass37_5.method4237(local28.aClass37_1, arg3, arg1, arg0, arg5);
			}
		} else if (arg2 instanceof Class26_Sub2_Sub4) {
			@Pc(8) Class26_Sub2_Sub4 local8 = (Class26_Sub2_Sub4) arg2;
			if (this.aClass37_5 != null && local8.aClass37_5 != null) {
				this.aClass37_5.method4237(local8.aClass37_5, arg3, arg1, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.method3488(arg0, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		@Pc(29) Class1_Sub2_Sub11 local29;
		if (this.aClass1_Sub2_Sub11_5 == null && this.aBoolean281) {
			@Pc(22) Class232 local22 = this.method3484(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass1_Sub2_Sub11_6;
		} else {
			local29 = this.aClass1_Sub2_Sub11_5;
			this.aClass1_Sub2_Sub11_5 = null;
		}
		if (local29 != null) {
			Static349.method1152(local29, this.aByte48, super.anInt7068, super.anInt7065, null);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class37 local16 = this.method3488(131072, arg0);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class18 local21 = arg0.method4709();
			local21.R(super.anInt7068, super.anInt7063, super.anInt7065);
			return local16.method4228(arg1, arg2, local21, false);
		}
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)I")
	@Override
	public int method5522() {
		return this.aClass37_5 == null ? 0 : this.aClass37_5.b();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!qa;IIZ)Lclient!tt;")
	private Class232 method3484(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class182 local13 = Static71.aClass105_6.method2336(this.aShort48 & 0xFFFF);
		@Pc(27) Class136 local27;
		@Pc(31) Class136 local31;
		if (this.aBoolean280) {
			local27 = Static160.aClass136Array2[this.aByte48];
			local31 = Static328.aClass136Array3[0];
		} else {
			local27 = Static328.aClass136Array3[this.aByte48];
			if (this.aByte48 < 3) {
				local31 = Static328.aClass136Array3[this.aByte48 + 1];
			} else {
				local31 = null;
			}
		}
		return local13.method4378(super.anInt7068, local27, super.anInt7063, this.aByte47 == 11 ? 10 : this.aByte47, arg0, this.aByte47 == 11 ? this.aByte49 + 4 : this.aByte49, arg2, super.anInt7065, local31, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		if (this.aClass37_5 == null) {
			return null;
		}
		@Pc(17) Class18 local17 = arg0.method4709();
		local17.R(super.anInt7068, super.anInt7063, super.anInt7065);
		@Pc(27) Class39_Sub4 local27 = null;
		if (this.aBoolean282) {
			local27 = Static72.method1208(1);
		}
		this.aClass37_5.method4230(local17, local27 == null ? null : local27.aClass39_Sub7Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aByte47;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)I")
	public int method3485() {
		return this.aClass37_5 == null ? 15 : this.aClass37_5.ra() / 4;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
		if (this.aClass37_5 != null) {
			this.aClass37_5.method4236();
		}
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		this.aBoolean279 = false;
		if (this.aClass37_5 != null) {
			this.aClass37_5.u(this.aClass37_5.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		@Pc(32) Class1_Sub2_Sub11 local32;
		if (this.aClass1_Sub2_Sub11_5 == null && this.aBoolean281) {
			@Pc(25) Class232 local25 = this.method3484(arg0, 262144, true);
			local32 = local25 == null ? null : local25.aClass1_Sub2_Sub11_6;
		} else {
			local32 = this.aClass1_Sub2_Sub11_5;
			this.aClass1_Sub2_Sub11_5 = null;
		}
		if (local32 != null) {
			Static225.method3380(local32, this.aByte48, super.anInt7068, super.anInt7065, null);
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class37 method3488(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		if (this.aClass37_5 != null && arg1.method4710(this.aClass37_5.n(), arg0) == 0) {
			return this.aClass37_5;
		} else {
			@Pc(28) Class232 local28 = this.method3484(arg1, arg0, false);
			return local28 == null ? null : local28.aClass37_6;
		}
	}
}
