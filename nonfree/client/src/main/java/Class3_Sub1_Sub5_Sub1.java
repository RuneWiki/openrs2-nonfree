import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class3_Sub1_Sub5_Sub1 extends Class3_Sub1_Sub5 implements Interface20 {

	@OriginalMember(owner = "client!ffa", name = "ub", descriptor = "Lclient!oba;")
	private Class261 aClass261_2;

	@OriginalMember(owner = "client!ffa", name = "W", descriptor = "Z")
	private boolean aBoolean210;

	@OriginalMember(owner = "client!ffa", name = "nb", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!ffa", name = "rb", descriptor = "S")
	private final short aShort48;

	@OriginalMember(owner = "client!ffa", name = "cb", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!ffa", name = "kb", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!ffa", name = "T", descriptor = "Z")
	private final boolean aBoolean209;

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "Lclient!r;")
	private Class4_Sub5_Sub9 aClass4_Sub5_Sub9_1;

	@OriginalMember(owner = "client!ffa", name = "bb", descriptor = "Lclient!ka;")
	private Class62 aClass62_2;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIZ)V")
	public Class3_Sub1_Sub5_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8715);
		this.aBoolean210 = arg9;
		this.aBoolean212 = arg7;
		super.anInt9925 = arg4;
		this.aShort48 = (short) arg1.anInt8738;
		this.aBoolean211 = arg1.anInt8742 != 0 && !arg7;
		this.aByte31 = (byte) arg8;
		super.anInt9917 = arg6;
		this.aBoolean209 = arg0.method8152() && arg1.lb && !this.aBoolean212 && Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean210) {
			local60 |= 0x10000;
		}
		@Pc(75) Class395 local75 = this.method2702(arg0, this.aBoolean209, local60);
		if (local75 != null) {
			this.aClass4_Sub5_Sub9_1 = local75.aClass4_Sub5_Sub9_6;
			this.aClass62_2 = local75.aClass62_7;
			if (this.aBoolean210) {
				this.aClass62_2 = this.aClass62_2.method7329((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		if (this.aClass261_2 == null) {
			this.aClass261_2 = Static386.method4994(super.anInt9915, super.anInt9925, this.method2703(arg0, 0), super.anInt9917);
		}
		return this.aClass261_2;
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass62_2 == null ? 0 : this.aClass62_2.fa();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return 22;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class3_Sub1_Sub5_Sub1) {
			@Pc(9) Class3_Sub1_Sub5_Sub1 local9 = (Class3_Sub1_Sub5_Sub1) arg0;
			if (this.aClass62_2 != null && local9.aClass62_2 != null) {
				this.aClass62_2.method7339(local9.aClass62_2, arg5, arg3, arg2, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		if (this.aClass62_2 == null) {
			return null;
		}
		@Pc(11) Class92 local11 = arg0.method8078();
		local11.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(33) Class3_Sub6 local33 = Static665.method8806(1, this.aBoolean211);
		if (Static499.aBoolean608) {
			this.aClass62_2.method7332(local11, local33.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			this.aClass62_2.method7335(local11, local33.aClass3_Sub4Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		@Pc(34) Class4_Sub5_Sub9 local34;
		if (this.aClass4_Sub5_Sub9_1 == null && this.aBoolean209) {
			@Pc(27) Class395 local27 = this.method2702(arg0, true, 262144);
			local34 = local27 == null ? null : local27.aClass4_Sub5_Sub9_6;
		} else {
			local34 = this.aClass4_Sub5_Sub9_1;
			this.aClass4_Sub5_Sub9_1 = null;
		}
		if (local34 != null) {
			Static383.method8453(local34, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		this.aBoolean210 = false;
		if (this.aClass62_2 != null) {
			this.aClass62_2.s(this.aClass62_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass62_2 != null) {
			this.aClass62_2.method7338();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!wv;")
	private Class395 method2702(@OriginalArg(0) Class33 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class342 local19 = Static441.aClass74_169.method2075(this.aShort48 & 0xFFFF);
		@Pc(42) Class42 local42;
		@Pc(33) Class42 local33;
		if (this.aBoolean212) {
			local42 = Static146.aClass42Array3[super.aByte142];
			local33 = Static655.aClass42Array5[0];
		} else {
			if (super.aByte142 < 3) {
				local33 = Static655.aClass42Array5[super.aByte142 + 1];
			} else {
				local33 = null;
			}
			local42 = Static655.aClass42Array5[super.aByte142];
		}
		return local19.method7498(super.anInt9925, super.anInt9917, local42, arg0, local33, arg2, (Class141) null, arg1, 22, this.aByte31, super.anInt9915);
	}

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 == -4798) {
			return this.aClass62_2 == null ? 0 : this.aClass62_2.ma();
		} else {
			return -112;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class62 method2703(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_2 != null && arg0.method8124(this.aClass62_2.ua(), arg1) == 0) {
			return this.aClass62_2;
		} else {
			@Pc(29) Class395 local29 = this.method2702(arg0, false, arg1);
			return local29 == null ? null : local29.aClass62_7;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(14) Class62 local14 = this.method2703(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class92 local19 = arg2.method8078();
			local19.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local14.method7341(arg0, arg1, local19, false, 0, Static140.anInt8126) : local14.method7347(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aClass62_2 == null ? false : this.aClass62_2.F();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aBoolean209;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		if (this.aClass62_2 == null) {
			return true;
		} else {
			return !this.aClass62_2.r();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class4_Sub5_Sub9 local14;
		if (this.aClass4_Sub5_Sub9_1 == null && this.aBoolean209) {
			@Pc(25) Class395 local25 = this.method2702(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass4_Sub5_Sub9_6;
		} else {
			local14 = this.aClass4_Sub5_Sub9_1;
			this.aClass4_Sub5_Sub9_1 = null;
		}
		if (local14 != null) {
			Static545.method7262(local14, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return this.aBoolean210;
	}
}
