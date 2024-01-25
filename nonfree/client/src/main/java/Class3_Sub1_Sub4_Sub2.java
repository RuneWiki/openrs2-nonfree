import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class3_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub4 implements Interface20 {

	@OriginalMember(owner = "client!rm", name = "vb", descriptor = "Lclient!oba;")
	private Class261 aClass261_8;

	@OriginalMember(owner = "client!rm", name = "S", descriptor = "B")
	private final byte aByte113;

	@OriginalMember(owner = "client!rm", name = "eb", descriptor = "B")
	private final byte aByte114;

	@OriginalMember(owner = "client!rm", name = "cb", descriptor = "S")
	private final short aShort107;

	@OriginalMember(owner = "client!rm", name = "mb", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!rm", name = "W", descriptor = "Z")
	private final boolean aBoolean638;

	@OriginalMember(owner = "client!rm", name = "db", descriptor = "Z")
	private boolean aBoolean639;

	@OriginalMember(owner = "client!rm", name = "ub", descriptor = "Z")
	private final boolean aBoolean641;

	@OriginalMember(owner = "client!rm", name = "bb", descriptor = "Lclient!ka;")
	public Class62 aClass62_6;

	@OriginalMember(owner = "client!rm", name = "ib", descriptor = "Lclient!r;")
	private Class4_Sub5_Sub9 aClass4_Sub5_Sub9_5;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIIZ)V")
	public Class3_Sub1_Sub4_Sub2(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static620.method7582(arg8, arg9));
		this.aByte113 = (byte) arg8;
		this.aByte114 = (byte) arg9;
		this.aShort107 = (short) arg1.anInt8738;
		super.anInt9925 = arg4;
		this.aBoolean640 = arg10;
		this.aBoolean638 = arg1.anInt8742 != 0 && !arg7;
		this.aBoolean639 = arg7;
		super.anInt9917 = arg6;
		this.aBoolean641 = arg0.method8152() && arg1.lb && !this.aBoolean639 && Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean640) {
			local69 |= 0x10000;
		}
		@Pc(84) Class395 local84 = this.method7091(arg0, local69, this.aBoolean641);
		if (local84 != null) {
			this.aClass62_6 = local84.aClass62_7;
			this.aClass4_Sub5_Sub9_5 = local84.aClass4_Sub5_Sub9_6;
			if (this.aBoolean640) {
				this.aClass62_6 = this.aClass62_6.method7329((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aClass62_6 == null ? false : this.aClass62_6.F();
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		this.aBoolean640 = false;
		if (this.aClass62_6 != null) {
			this.aClass62_6.s(this.aClass62_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aByte113;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		if (this.aClass62_6 == null) {
			return true;
		} else {
			return !this.aClass62_6.r();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		if (this.aClass261_8 == null) {
			this.aClass261_8 = Static386.method4994(super.anInt9915, super.anInt9925, this.method7094(0, arg0), super.anInt9917);
		}
		return this.aClass261_8;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aBoolean641;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ha;IIZ)Lclient!wv;")
	private Class395 method7091(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class342 local18 = Static441.aClass74_169.method2075(this.aShort107 & 0xFFFF);
		@Pc(41) Class42 local41;
		@Pc(27) Class42 local27;
		if (this.aBoolean639) {
			local41 = Static146.aClass42Array3[super.aByte142];
			local27 = Static655.aClass42Array5[0];
		} else {
			if (super.aByte142 >= 3) {
				local27 = null;
			} else {
				local27 = Static655.aClass42Array5[super.aByte142 + 1];
			}
			local41 = Static655.aClass42Array5[super.aByte142];
		}
		return local18.method7498(super.anInt9925, super.anInt9917, local41, arg0, local27, arg1, (Class141) null, arg2, this.aByte113, this.aByte114, super.anInt9915);
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			this.aBoolean639 = true;
		}
		return this.aClass62_6 == null ? 0 : this.aClass62_6.ma();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(9) Class62 local9 = this.method7094(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class92 local14 = arg2.method8078();
			local14.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local9.method7341(arg0, arg1, local14, false, 0, Static140.anInt8126) : local9.method7347(arg0, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		@Pc(25) Class4_Sub5_Sub9 local25;
		if (this.aClass4_Sub5_Sub9_5 == null && this.aBoolean641) {
			@Pc(18) Class395 local18 = this.method7091(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass4_Sub5_Sub9_6;
		} else {
			local25 = this.aClass4_Sub5_Sub9_5;
			this.aClass4_Sub5_Sub9_5 = null;
		}
		if (local25 != null) {
			Static383.method8453(local25, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class3_Sub1_Sub4_Sub2) {
			@Pc(5) Class3_Sub1_Sub4_Sub2 local5 = (Class3_Sub1_Sub4_Sub2) arg0;
			if (this.aClass62_6 != null && local5.aClass62_6 != null) {
				this.aClass62_6.method7339(local5.aClass62_6, arg5, arg3, arg2, arg4);
			}
		} else if (arg0 instanceof Class3_Sub1_Sub2_Sub3) {
			@Pc(28) Class3_Sub1_Sub2_Sub3 local28 = (Class3_Sub1_Sub2_Sub3) arg0;
			if (this.aClass62_6 != null && local28.aClass62_4 != null) {
				this.aClass62_6.method7339(local28.aClass62_4, arg5, arg3, arg2, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aShort107 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass62_6 != null) {
			this.aClass62_6.method7338();
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		if (this.aClass62_6 == null) {
			return null;
		}
		@Pc(19) Class92 local19 = arg0.method8078();
		local19.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(33) Class3_Sub6 local33 = Static665.method8806(1, this.aBoolean638);
		if (Static499.aBoolean608) {
			this.aClass62_6.method7332(local19, local33.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			this.aClass62_6.method7335(local19, local33.aClass3_Sub4Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass62_6 == null ? 0 : this.aClass62_6.fa();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class62 method7094(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		if (this.aClass62_6 != null && arg1.method8124(this.aClass62_6.ua(), arg0) == 0) {
			return this.aClass62_6;
		} else {
			@Pc(32) Class395 local32 = this.method7091(arg1, arg0, false);
			return local32 == null ? null : local32.aClass62_7;
		}
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return this.aBoolean640;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		@Pc(33) Class4_Sub5_Sub9 local33;
		if (this.aClass4_Sub5_Sub9_5 == null && this.aBoolean641) {
			@Pc(26) Class395 local26 = this.method7091(arg0, 262144, true);
			local33 = local26 == null ? null : local26.aClass4_Sub5_Sub9_6;
		} else {
			local33 = this.aClass4_Sub5_Sub9_5;
			this.aClass4_Sub5_Sub9_5 = null;
		}
		if (local33 != null) {
			Static545.method7262(local33, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aByte114;
	}
}
