import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class3_Sub1_Sub2_Sub3 extends Class3_Sub1_Sub2 implements Interface20 {

	@OriginalMember(owner = "client!jba", name = "sb", descriptor = "Lclient!oba;")
	private Class261 aClass261_4;

	@OriginalMember(owner = "client!jba", name = "db", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!jba", name = "zb", descriptor = "Z")
	private final boolean aBoolean327;

	@OriginalMember(owner = "client!jba", name = "bb", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!jba", name = "Z", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!jba", name = "qb", descriptor = "S")
	private final short aShort65;

	@OriginalMember(owner = "client!jba", name = "S", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!jba", name = "xb", descriptor = "Z")
	private final boolean aBoolean326;

	@OriginalMember(owner = "client!jba", name = "Y", descriptor = "Lclient!ka;")
	public Class62 aClass62_4;

	@OriginalMember(owner = "client!jba", name = "U", descriptor = "Lclient!r;")
	private Class4_Sub5_Sub9 aClass4_Sub5_Sub9_3;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIIIIIIZ)V")
	public Class3_Sub1_Sub2_Sub3(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8693 == 1, Static21.method508(arg12, arg13));
		this.aByte71 = (byte) arg12;
		this.aBoolean327 = arg1.anInt8742 != 0 && !arg7;
		this.aByte70 = (byte) arg13;
		this.aBoolean325 = arg14;
		this.aShort65 = (short) arg1.anInt8738;
		super.aByte142 = (byte) arg3;
		this.aBoolean324 = arg7;
		this.aBoolean326 = arg0.method8152() && arg1.lb && !this.aBoolean324 && Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean325) {
			local77 |= 0x10000;
		}
		@Pc(92) Class395 local92 = this.method3932(local77, this.aBoolean326, arg0);
		if (local92 != null) {
			this.aClass62_4 = local92.aClass62_7;
			this.aClass4_Sub5_Sub9_3 = local92.aClass4_Sub5_Sub9_6;
			if (this.aBoolean325) {
				this.aClass62_4 = this.aClass62_4.method7329((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		if (this.aClass62_4 == null) {
			return null;
		}
		@Pc(19) Class92 local19 = arg0.method8078();
		local19.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(33) Class3_Sub6 local33 = Static665.method8806(1, this.aBoolean327);
		if (Static499.aBoolean608) {
			this.aClass62_4.method7332(local19, local33.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			this.aClass62_4.method7335(local19, local33.aClass3_Sub4Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aClass62_4 == null ? false : this.aClass62_4.F();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		if (this.aClass261_4 == null) {
			this.aClass261_4 = Static386.method4994(super.anInt9915, super.anInt9925, this.method3927(arg0, 0), super.anInt9917);
		}
		return this.aClass261_4;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class62 method3927(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_4 != null && arg0.method8124(this.aClass62_4.ua(), arg1) == 0) {
			return this.aClass62_4;
		} else {
			@Pc(33) Class395 local33 = this.method3932(arg1, false, arg0);
			return local33 == null ? null : local33.aClass62_7;
		}
	}

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "(I)I")
	public int method3928() {
		return this.aClass62_4 == null ? 15 : this.aClass62_4.na() / 4;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aShort65 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass62_4 != null) {
			this.aClass62_4.method7338();
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		@Pc(14) Class4_Sub5_Sub9 local14;
		if (this.aClass4_Sub5_Sub9_3 == null && this.aBoolean326) {
			@Pc(25) Class395 local25 = this.method3932(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub5_Sub9_6;
		} else {
			local14 = this.aClass4_Sub5_Sub9_3;
			this.aClass4_Sub5_Sub9_3 = null;
		}
		if (local14 != null) {
			Static383.method8453(local14, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			Static271.method3931(81);
		}
		return this.aClass62_4 == null ? 0 : this.aClass62_4.ma();
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIZLclient!ha;)Lclient!wv;")
	private Class395 method3932(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(19) Class342 local19 = Static441.aClass74_169.method2075(this.aShort65 & 0xFFFF);
		@Pc(31) Class42 local31;
		@Pc(26) Class42 local26;
		if (this.aBoolean324) {
			local26 = Static655.aClass42Array5[0];
			local31 = Static146.aClass42Array3[super.aByte142];
		} else {
			if (super.aByte142 < 3) {
				local26 = Static655.aClass42Array5[super.aByte142 + 1];
			} else {
				local26 = null;
			}
			local31 = Static655.aClass42Array5[super.aByte142];
		}
		return local19.method7498(super.anInt9925, super.anInt9917, local31, arg2, local26, arg0, (Class141) null, arg1, this.aByte71 == 11 ? 10 : this.aByte71, this.aByte71 == 11 ? this.aByte70 + 4 : this.aByte70, super.anInt9915);
	}

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass62_4 == null ? 0 : this.aClass62_4.fa();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class4_Sub5_Sub9 local14;
		if (this.aClass4_Sub5_Sub9_3 == null && this.aBoolean326) {
			@Pc(25) Class395 local25 = this.method3932(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub5_Sub9_6;
		} else {
			local14 = this.aClass4_Sub5_Sub9_3;
			this.aClass4_Sub5_Sub9_3 = null;
		}
		if (local14 != null) {
			Static545.method7262(local14, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class3_Sub1_Sub4_Sub2) {
			@Pc(12) Class3_Sub1_Sub4_Sub2 local12 = (Class3_Sub1_Sub4_Sub2) arg0;
			if (this.aClass62_4 != null && local12.aClass62_6 != null) {
				this.aClass62_4.method7339(local12.aClass62_6, arg5, arg3, arg2, arg4);
			}
		} else if (arg0 instanceof Class3_Sub1_Sub2_Sub3) {
			@Pc(35) Class3_Sub1_Sub2_Sub3 local35 = (Class3_Sub1_Sub2_Sub3) arg0;
			if (this.aClass62_4 != null && local35.aClass62_4 != null) {
				this.aClass62_4.method7339(local35.aClass62_4, arg5, arg3, arg2, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		this.aBoolean325 = false;
		if (this.aClass62_4 != null) {
			this.aClass62_4.s(this.aClass62_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		if (this.aClass62_4 == null) {
			return true;
		} else {
			return !this.aClass62_4.r();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(16) Class62 local16 = this.method3927(arg2, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class92 local21 = arg2.method8078();
			local21.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local16.method7341(arg0, arg1, local21, false, 0, Static140.anInt8126) : local16.method7347(arg0, arg1, local21, false, 0);
		}
	}
}
