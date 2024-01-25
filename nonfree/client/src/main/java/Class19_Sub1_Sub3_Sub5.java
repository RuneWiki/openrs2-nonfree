import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class19_Sub1_Sub3_Sub5 extends Class19_Sub1_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!sr", name = "lb", descriptor = "I")
	public static final int lb = 1409;

	@OriginalMember(owner = "client!sr", name = "W", descriptor = "Lclient!dfa;")
	private Class68 aClass68_4;

	@OriginalMember(owner = "client!sr", name = "bb", descriptor = "B")
	private final byte aByte142;

	@OriginalMember(owner = "client!sr", name = "N", descriptor = "Z")
	private boolean aBoolean700;

	@OriginalMember(owner = "client!sr", name = "Y", descriptor = "Z")
	private final boolean aBoolean699;

	@OriginalMember(owner = "client!sr", name = "P", descriptor = "S")
	private final short aShort125;

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "Z")
	private final boolean aBoolean701;

	@OriginalMember(owner = "client!sr", name = "rb", descriptor = "B")
	private final byte aByte141;

	@OriginalMember(owner = "client!sr", name = "sb", descriptor = "Z")
	private final boolean aBoolean698;

	@OriginalMember(owner = "client!sr", name = "nb", descriptor = "Lclient!ka;")
	public Class157 aClass157_8;

	@OriginalMember(owner = "client!sr", name = "V", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub13 aClass3_Sub4_Sub13_6;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIIIIIIZ)V")
	public Class19_Sub1_Sub3_Sub5(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4421 == 1, Static94.method1280(arg12, arg13));
		this.aByte142 = (byte) arg13;
		this.aBoolean700 = arg14;
		this.aBoolean699 = arg7;
		this.aShort125 = (short) arg1.anInt4397;
		this.aBoolean701 = arg1.anInt4425 != 0 && !arg7;
		super.aByte145 = (byte) arg3;
		this.aByte141 = (byte) arg12;
		this.aBoolean698 = arg0.method7658() && arg1.aBoolean379 && !this.aBoolean699 && Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() != 0;
		@Pc(89) int local89 = 2048;
		if (this.aBoolean700) {
			local89 |= 0x10000;
		}
		@Pc(104) Class179 local104 = this.method8196(this.aBoolean698, arg0, local89);
		if (local104 != null) {
			this.aClass157_8 = local104.aClass157_4;
			this.aClass3_Sub4_Sub13_6 = local104.aClass3_Sub4_Sub13_3;
			if (this.aBoolean700) {
				this.aClass157_8 = this.aClass157_8.method5211((byte) 0, local89, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 != 4) {
			Static595.aClass178Array1 = null;
		}
		return this.aClass157_8 == null ? 0 : this.aClass157_8.ma();
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return this.aBoolean700;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		@Pc(23) Class3_Sub4_Sub13 local23;
		if (this.aClass3_Sub4_Sub13_6 == null && this.aBoolean698) {
			@Pc(34) Class179 local34 = this.method8196(true, arg0, 262144);
			local23 = local34 == null ? null : local34.aClass3_Sub4_Sub13_3;
		} else {
			local23 = this.aClass3_Sub4_Sub13_6;
			this.aClass3_Sub4_Sub13_6 = null;
		}
		if (local23 != null) {
			Static395.method5941(local23, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		if (this.aClass68_4 == null) {
			this.aClass68_4 = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, this.method8197(arg0, 0));
		}
		return this.aClass68_4;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aShort125 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass157_8 == null ? 0 : this.aClass157_8.fa();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aByte142;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aBoolean698;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZLclient!ha;IZ)Lclient!ir;")
	private Class179 method8196(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2) {
		@Pc(22) Class144 local22 = Static70.aClass323_1.method7792(this.aShort125 & 0xFFFF);
		@Pc(30) Class313 local30;
		@Pc(34) Class313 local34;
		if (this.aBoolean699) {
			local30 = Static711.aClass313Array3[super.aByte145];
			local34 = Static167.aClass313Array1[0];
		} else {
			local30 = Static167.aClass313Array1[super.aByte145];
			if (super.aByte145 < 3) {
				local34 = Static167.aClass313Array1[super.aByte145 + 1];
			} else {
				local34 = null;
			}
		}
		return local22.method3634(super.anInt11204, arg1, arg0, arg2, super.anInt11208, this.aByte141 == 11 ? 10 : this.aByte141, super.anInt11211, local34, this.aByte141 == 11 ? this.aByte142 + 4 : this.aByte142, local30, (Class241) null);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		if (this.aClass157_8 == null) {
			return null;
		}
		@Pc(12) Class181 local12 = arg0.method7693();
		local12.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(34) Class19_Sub8 local34 = Static58.method727(1, this.aBoolean701);
		if (Static568.aBoolean784) {
			this.aClass157_8.method5227(local12, local34.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			this.aClass157_8.method5232(local12, local34.aClass19_Sub6Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class19_Sub1_Sub2_Sub1) {
			@Pc(9) Class19_Sub1_Sub2_Sub1 local9 = (Class19_Sub1_Sub2_Sub1) arg4;
			if (this.aClass157_8 != null && local9.aClass157_2 != null) {
				this.aClass157_8.method5231(local9.aClass157_2, arg1, arg3, arg5, arg0);
			}
		} else if (arg4 instanceof Class19_Sub1_Sub3_Sub5) {
			@Pc(38) Class19_Sub1_Sub3_Sub5 local38 = (Class19_Sub1_Sub3_Sub5) arg4;
			if (this.aClass157_8 != null && local38.aClass157_8 != null) {
				this.aClass157_8.method5231(local38.aClass157_8, arg1, arg3, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class157 method8197(@OriginalArg(1) Class67 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass157_8 != null && arg0.method7660(this.aClass157_8.ua(), arg1) == 0) {
			return this.aClass157_8;
		} else {
			@Pc(32) Class179 local32 = this.method8196(false, arg0, arg1);
			return local32 == null ? null : local32.aClass157_4;
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aClass157_8 == null ? false : this.aClass157_8.F();
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		this.aBoolean700 = false;
		if (this.aClass157_8 != null) {
			this.aClass157_8.s(this.aClass157_8.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		if (this.aClass157_8 == null) {
			return true;
		} else {
			return !this.aClass157_8.r();
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		@Pc(16) Class3_Sub4_Sub13 local16;
		if (this.aClass3_Sub4_Sub13_6 == null && this.aBoolean698) {
			@Pc(27) Class179 local27 = this.method8196(true, arg0, 262144);
			local16 = local27 == null ? null : local27.aClass3_Sub4_Sub13_3;
		} else {
			local16 = this.aClass3_Sub4_Sub13_6;
			this.aClass3_Sub4_Sub13_6 = null;
		}
		if (local16 != null) {
			Static108.method1948(local16, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(B)I")
	public int method8200() {
		return this.aClass157_8 == null ? 15 : this.aClass157_8.na() / 4;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return this.aByte141;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class157 local9 = this.method8197(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class181 local20 = arg1.method7693();
			local20.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			return Static568.aBoolean784 ? local9.method5221(arg2, arg0, local20, false, 0, Static705.anInt11029) : local9.method5218(arg2, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
		if (this.aClass157_8 != null) {
			this.aClass157_8.method5225();
		}
	}
}
