import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class19_Sub1_Sub2_Sub1 extends Class19_Sub1_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lclient!dfa;")
	private Class68 lb;

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Z")
	private final boolean aBoolean219;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "S")
	private final short aShort23;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Z")
	private final boolean aBoolean220;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Z")
	private final boolean aBoolean218;

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub13 aClass3_Sub4_Sub13_1;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lclient!ka;")
	public Class157 aClass157_2;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIIZ)V")
	public Class19_Sub1_Sub2_Sub1(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static569.method7901(arg9, arg8));
		this.aBoolean221 = arg10;
		this.aBoolean219 = arg7;
		this.aShort23 = (short) arg1.anInt4397;
		this.aByte42 = (byte) arg9;
		this.aBoolean220 = arg1.anInt4425 != 0 && !arg7;
		this.aByte41 = (byte) arg8;
		super.anInt11211 = arg6;
		super.anInt11204 = arg4;
		this.aBoolean218 = arg0.method7658() && arg1.aBoolean379 && !this.aBoolean219 && Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean221) {
			local80 |= 0x10000;
		}
		@Pc(95) Class179 local95 = this.method2323(this.aBoolean218, arg0, local80);
		if (local95 != null) {
			this.aClass3_Sub4_Sub13_1 = local95.aClass3_Sub4_Sub13_3;
			this.aClass157_2 = local95.aClass157_4;
			if (this.aBoolean221) {
				this.aClass157_2 = this.aClass157_2.method5211((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		this.aBoolean221 = false;
		if (this.aClass157_2 != null) {
			this.aClass157_2.s(this.aClass157_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		if (this.lb == null) {
			this.lb = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, this.method2324(0, arg0));
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aShort23 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aClass157_2 == null ? false : this.aClass157_2.F();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		if (this.aClass157_2 == null) {
			return null;
		}
		@Pc(12) Class181 local12 = arg0.method7693();
		local12.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(26) Class19_Sub8 local26 = Static58.method727(1, this.aBoolean220);
		if (Static568.aBoolean784) {
			this.aClass157_2.method5227(local12, local26.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			this.aClass157_2.method5232(local12, local26.aClass19_Sub6Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass157_2 == null ? 0 : this.aClass157_2.fa();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
		if (this.aClass157_2 != null) {
			this.aClass157_2.method5225();
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		if (this.aClass157_2 == null) {
			return true;
		} else {
			return !this.aClass157_2.r();
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 == 4) {
			return this.aClass157_2 == null ? 0 : this.aClass157_2.ma();
		} else {
			return 32;
		}
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return this.aBoolean221;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		@Pc(24) Class3_Sub4_Sub13 local24;
		if (this.aClass3_Sub4_Sub13_1 == null && this.aBoolean218) {
			@Pc(35) Class179 local35 = this.method2323(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass3_Sub4_Sub13_3;
		} else {
			local24 = this.aClass3_Sub4_Sub13_1;
			this.aClass3_Sub4_Sub13_1 = null;
		}
		if (local24 != null) {
			Static395.method5941(local24, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class157 local15 = this.method2324(131072, arg1);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class181 local20 = arg1.method7693();
			local20.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			return Static568.aBoolean784 ? local15.method5221(arg2, arg0, local20, false, 0, Static705.anInt11029) : local15.method5218(arg2, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		@Pc(16) Class3_Sub4_Sub13 local16;
		if (this.aClass3_Sub4_Sub13_1 == null && this.aBoolean218) {
			@Pc(27) Class179 local27 = this.method2323(true, arg0, 262144);
			local16 = local27 == null ? null : local27.aClass3_Sub4_Sub13_3;
		} else {
			local16 = this.aClass3_Sub4_Sub13_1;
			this.aClass3_Sub4_Sub13_1 = null;
		}
		if (local16 != null) {
			Static108.method1948(local16, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aBoolean218;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!ha;IZ)Lclient!ir;")
	private Class179 method2323(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class144 local20 = Static70.aClass323_1.method7792(this.aShort23 & 0xFFFF);
		@Pc(28) Class313 local28;
		@Pc(41) Class313 local41;
		if (this.aBoolean219) {
			local41 = Static167.aClass313Array1[0];
			local28 = Static711.aClass313Array3[super.aByte145];
		} else {
			local28 = Static167.aClass313Array1[super.aByte145];
			if (super.aByte145 < 3) {
				local41 = Static167.aClass313Array1[super.aByte145 + 1];
			} else {
				local41 = null;
			}
		}
		return local20.method3634(super.anInt11204, arg1, arg0, arg2, super.anInt11208, this.aByte41, super.anInt11211, local41, this.aByte42, local28, (Class241) null);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class19_Sub1_Sub2_Sub1) {
			@Pc(34) Class19_Sub1_Sub2_Sub1 local34 = (Class19_Sub1_Sub2_Sub1) arg4;
			if (this.aClass157_2 != null && local34.aClass157_2 != null) {
				this.aClass157_2.method5231(local34.aClass157_2, arg1, arg3, arg5, arg0);
			}
		} else if (arg4 instanceof Class19_Sub1_Sub3_Sub5) {
			@Pc(10) Class19_Sub1_Sub3_Sub5 local10 = (Class19_Sub1_Sub3_Sub5) arg4;
			if (this.aClass157_2 != null && local10.aClass157_8 != null) {
				this.aClass157_2.method5231(local10.aClass157_8, arg1, arg3, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class157 method2324(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1) {
		if (this.aClass157_2 != null && arg1.method7660(this.aClass157_2.ua(), arg0) == 0) {
			return this.aClass157_2;
		} else {
			@Pc(35) Class179 local35 = this.method2323(false, arg1, arg0);
			return local35 == null ? null : local35.aClass157_4;
		}
	}
}
