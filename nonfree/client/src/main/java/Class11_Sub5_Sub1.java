import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 implements Interface12 {

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "Lclient!em;")
	private Class64 aClass64_3;

	@OriginalMember(owner = "client!hg", name = "gb", descriptor = "Z")
	private final boolean aBoolean206;

	@OriginalMember(owner = "client!hg", name = "bb", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!hg", name = "U", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "Z")
	private final boolean aBoolean203;

	@OriginalMember(owner = "client!hg", name = "P", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "Z")
	private boolean aBoolean204;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "Z")
	private final boolean aBoolean205;

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "Lclient!ka;")
	public Class57 aClass57_3;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "Lclient!ia;")
	private Class4_Sub1_Sub6 aClass4_Sub1_Sub6_3;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIIZIIIIIIZ)V")
	public Class11_Sub5_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4355 == 1, Static402.method5652(arg13, arg12));
		this.aBoolean206 = arg1.anInt4358 != 0 && !arg7;
		this.aByte19 = (byte) arg13;
		this.aByte17 = (byte) arg12;
		this.aShort33 = (short) arg1.anInt4366;
		this.aBoolean203 = arg7;
		this.aByte18 = (byte) arg3;
		this.aBoolean204 = arg14;
		this.aBoolean205 = arg0.method2045() && arg1.aBoolean287 && !this.aBoolean203 && Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean204) {
			local74 |= 0x10000;
		}
		@Pc(89) Class236 local89 = this.method2738(this.aBoolean205, local74, arg0);
		if (local89 != null) {
			this.aClass57_3 = local89.aClass57_6;
			this.aClass4_Sub1_Sub6_3 = local89.aClass4_Sub1_Sub6_5;
			if (this.aBoolean204) {
				this.aClass57_3 = this.aClass57_3.method6075((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aBoolean205;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method6069();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		@Pc(14) Class4_Sub1_Sub6 local14;
		if (this.aClass4_Sub1_Sub6_3 == null && this.aBoolean205) {
			@Pc(25) Class236 local25 = this.method2738(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub1_Sub6_5;
		} else {
			local14 = this.aClass4_Sub1_Sub6_3;
			this.aClass4_Sub1_Sub6_3 = null;
		}
		if (local14 != null) {
			Static175.method3073(local14, this.aByte18, super.anInt7514, super.anInt7515, null);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		this.aBoolean204 = false;
		if (this.aClass57_3 != null) {
			this.aClass57_3.B(this.aClass57_3.ma() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		@Pc(18) Class4_Sub1_Sub6 local18;
		if (this.aClass4_Sub1_Sub6_3 == null && this.aBoolean205) {
			@Pc(29) Class236 local29 = this.method2738(true, 262144, arg0);
			local18 = local29 == null ? null : local29.aClass4_Sub1_Sub6_5;
		} else {
			local18 = this.aClass4_Sub1_Sub6_3;
			this.aClass4_Sub1_Sub6_3 = null;
		}
		if (local18 != null) {
			Static252.method4144(local18, this.aByte18, super.anInt7514, super.anInt7515, null);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.method2736(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aByte17;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		if (this.aClass64_3 == null) {
			this.aClass64_3 = Static456.method6200(super.anInt7511, this.method2736(0, arg0), super.anInt7515, super.anInt7514);
		}
		return this.aClass64_3;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!qa;)Lclient!ka;")
	private Class57 method2736(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass57_3 != null && arg1.method2065(this.aClass57_3.ma(), arg0) == 0) {
			return this.aClass57_3;
		} else {
			@Pc(28) Class236 local28 = this.method2738(false, arg0, arg1);
			return local28 == null ? null : local28.aClass57_6;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)I")
	@Override
	public int method6044() {
		return this.aClass57_3 == null ? 0 : this.aClass57_3.ja();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class11_Sub2_Sub3) {
			@Pc(10) Class11_Sub2_Sub3 local10 = (Class11_Sub2_Sub3) arg4;
			if (this.aClass57_3 != null && local10.aClass57_7 != null) {
				this.aClass57_3.method6080(local10.aClass57_7, arg2, arg0, arg1, arg5);
			}
		} else if (arg4 instanceof Class11_Sub5_Sub1) {
			@Pc(33) Class11_Sub5_Sub1 local33 = (Class11_Sub5_Sub1) arg4;
			if (this.aClass57_3 != null && local33.aClass57_3 != null) {
				this.aClass57_3.method6080(local33.aClass57_3, arg2, arg0, arg1, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		if (this.aClass57_3 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2092();
		local11.C(super.anInt7514, super.anInt7511, super.anInt7515);
		@Pc(21) Class71_Sub3 local21 = null;
		if (this.aBoolean206) {
			local21 = Static127.method2399(1);
		}
		this.aClass57_3.method6073(local11, local21 == null ? null : local21.aClass71_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)I")
	public int method2737() {
		return this.aClass57_3 == null ? 15 : this.aClass57_3.H() / 4;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(14) Class57 local14 = this.method2736(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class72 local19 = arg2.method2092();
			local19.C(super.anInt7514, super.anInt7511, super.anInt7515);
			return local14.method6070(arg1, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZILclient!qa;)Lclient!so;")
	private Class236 method2738(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(13) Class139 local13 = Static146.aClass228_1.method5203(this.aShort33 & 0xFFFF);
		@Pc(41) Class14 local41;
		@Pc(27) Class14 local27;
		if (this.aBoolean203) {
			local27 = Static267.aClass14Array2[0];
			local41 = Static77.aClass14Array1[this.aByte18];
		} else {
			if (this.aByte18 >= 3) {
				local27 = null;
			} else {
				local27 = Static267.aClass14Array2[this.aByte18 + 1];
			}
			local41 = Static267.aClass14Array2[this.aByte18];
		}
		return local13.method3763(local27, arg2, super.anInt7514, local41, this.aByte17 == 11 ? 10 : this.aByte17, arg1, super.anInt7511, super.anInt7515, arg0, this.aByte17 == 11 ? this.aByte19 + 4 : this.aByte19);
	}
}
