import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class19_Sub1_Sub5_Sub1 extends Class19_Sub1_Sub5 implements Interface19 {

	@OriginalMember(owner = "client!qda", name = "cb", descriptor = "Lclient!dfa;")
	private Class68 aClass68_3;

	@OriginalMember(owner = "client!qda", name = "Y", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!qda", name = "Z", descriptor = "Z")
	private final boolean aBoolean650;

	@OriginalMember(owner = "client!qda", name = "N", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!qda", name = "db", descriptor = "B")
	private final byte aByte136;

	@OriginalMember(owner = "client!qda", name = "ib", descriptor = "S")
	private final short aShort120;

	@OriginalMember(owner = "client!qda", name = "Q", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!qda", name = "kb", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub13 aClass3_Sub4_Sub13_5;

	@OriginalMember(owner = "client!qda", name = "X", descriptor = "Lclient!ka;")
	private Class157 aClass157_7;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIZ)V")
	public Class19_Sub1_Sub5_Sub1(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4389);
		this.aBoolean651 = arg1.anInt4425 != 0 && !arg7;
		this.aBoolean650 = arg7;
		super.anInt11204 = arg4;
		this.aBoolean649 = arg9;
		super.anInt11211 = arg6;
		this.aByte136 = (byte) arg8;
		this.aShort120 = (short) arg1.anInt4397;
		this.aBoolean648 = arg0.method7658() && arg1.aBoolean379 && !this.aBoolean650 && Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean649) {
			local71 |= 0x10000;
		}
		@Pc(86) Class179 local86 = this.method7315(local71, arg0, this.aBoolean648);
		if (local86 != null) {
			this.aClass3_Sub4_Sub13_5 = local86.aClass3_Sub4_Sub13_3;
			this.aClass157_7 = local86.aClass157_4;
			if (this.aBoolean649) {
				this.aClass157_7 = this.aClass157_7.method5211((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		@Pc(16) Class3_Sub4_Sub13 local16;
		if (this.aClass3_Sub4_Sub13_5 == null && this.aBoolean648) {
			@Pc(27) Class179 local27 = this.method7315(262144, arg0, true);
			local16 = local27 == null ? null : local27.aClass3_Sub4_Sub13_3;
		} else {
			local16 = this.aClass3_Sub4_Sub13_5;
			this.aClass3_Sub4_Sub13_5 = null;
		}
		if (local16 != null) {
			Static108.method1948(local16, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
		if (this.aClass157_7 != null) {
			this.aClass157_7.method5225();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aShort120 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class157 local9 = this.method7318(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class181 local14 = arg1.method7693();
			local14.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			return Static568.aBoolean784 ? local9.method5221(arg2, arg0, local14, false, 0, Static705.anInt11029) : local9.method5218(arg2, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		if (this.aClass157_7 == null) {
			return true;
		} else {
			return !this.aClass157_7.r();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BILclient!ha;Z)Lclient!ir;")
	private Class179 method7315(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class144 local19 = Static70.aClass323_1.method7792(this.aShort120 & 0xFFFF);
		@Pc(31) Class313 local31;
		@Pc(26) Class313 local26;
		if (this.aBoolean650) {
			local26 = Static167.aClass313Array1[0];
			local31 = Static711.aClass313Array3[super.aByte145];
		} else {
			local31 = Static167.aClass313Array1[super.aByte145];
			if (super.aByte145 < 3) {
				local26 = Static167.aClass313Array1[super.aByte145 + 1];
			} else {
				local26 = null;
			}
		}
		return local19.method3634(super.anInt11204, arg1, arg2, arg0, super.anInt11208, 22, super.anInt11211, local26, this.aByte136, local31, (Class241) null);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		if (this.aClass68_3 == null) {
			this.aClass68_3 = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, this.method7318(0, arg0));
		}
		return this.aClass68_3;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aByte136;
	}

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass157_7 == null ? 0 : this.aClass157_7.fa();
	}

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 != 4) {
			Static512.aClass181_11 = null;
		}
		return this.aClass157_7 == null ? 0 : this.aClass157_7.ma();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class157 method7318(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1) {
		if (this.aClass157_7 != null && arg1.method7660(this.aClass157_7.ua(), arg0) == 0) {
			return this.aClass157_7;
		} else {
			@Pc(40) Class179 local40 = this.method7315(arg0, arg1, false);
			return local40 == null ? null : local40.aClass157_4;
		}
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aClass157_7 == null ? false : this.aClass157_7.F();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class19_Sub1_Sub5_Sub1) {
			@Pc(5) Class19_Sub1_Sub5_Sub1 local5 = (Class19_Sub1_Sub5_Sub1) arg4;
			if (this.aClass157_7 != null && local5.aClass157_7 != null) {
				this.aClass157_7.method5231(local5.aClass157_7, arg1, arg3, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		this.aBoolean649 = false;
		if (this.aClass157_7 != null) {
			this.aClass157_7.s(this.aClass157_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return 22;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		@Pc(28) Class3_Sub4_Sub13 local28;
		if (this.aClass3_Sub4_Sub13_5 == null && this.aBoolean648) {
			@Pc(20) Class179 local20 = this.method7315(262144, arg0, true);
			local28 = local20 == null ? null : local20.aClass3_Sub4_Sub13_3;
		} else {
			local28 = this.aClass3_Sub4_Sub13_5;
			this.aClass3_Sub4_Sub13_5 = null;
		}
		if (local28 != null) {
			Static395.method5941(local28, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		if (this.aClass157_7 == null) {
			return null;
		}
		@Pc(12) Class181 local12 = arg0.method7693();
		local12.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(26) Class19_Sub8 local26 = Static58.method727(1, this.aBoolean651);
		if (Static568.aBoolean784) {
			this.aClass157_7.method5227(local12, local26.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			this.aClass157_7.method5232(local12, local26.aClass19_Sub6Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return this.aBoolean649;
	}
}
