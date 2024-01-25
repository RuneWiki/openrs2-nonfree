import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class3_Sub1_Sub3_Sub1 extends Class3_Sub1_Sub3 implements Interface20 {

	@OriginalMember(owner = "client!hda", name = "kb", descriptor = "Lclient!oba;")
	private Class261 aClass261_3;

	@OriginalMember(owner = "client!hda", name = "eb", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!hda", name = "rb", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!hda", name = "X", descriptor = "Z")
	private final boolean aBoolean257;

	@OriginalMember(owner = "client!hda", name = "gb", descriptor = "Z")
	private final boolean aBoolean258;

	@OriginalMember(owner = "client!hda", name = "ob", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!hda", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "Lclient!ka;")
	private Class62 aClass62_3;

	@OriginalMember(owner = "client!hda", name = "ab", descriptor = "Lclient!r;")
	private Class4_Sub5_Sub9 aClass4_Sub5_Sub9_2;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIIII)V")
	public Class3_Sub1_Sub3_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt9917 = arg6;
		this.aByte43 = (byte) arg10;
		super.anInt9925 = arg4;
		this.aShort52 = (short) arg1.anInt8738;
		this.aBoolean257 = arg7;
		this.aBoolean258 = arg1.anInt8742 != 0 && !arg7;
		this.aByte44 = (byte) arg11;
		this.lb = arg0.method8152() && arg1.lb && !this.aBoolean257 && Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() != 0;
		@Pc(70) Class395 local70 = this.method3184(2048, arg0, this.lb);
		if (local70 != null) {
			this.aClass62_3 = local70.aClass62_7;
			this.aClass4_Sub5_Sub9_2 = local70.aClass4_Sub5_Sub9_6;
		}
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			Static213.anInt3454 = 31;
		}
		return this.aClass62_3 == null ? 0 : this.aClass62_3.ma();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		if (this.aClass62_3 == null) {
			return true;
		} else {
			return !this.aClass62_3.r();
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		if (this.aClass62_3 == null) {
			return null;
		}
		@Pc(11) Class92 local11 = arg0.method8078();
		local11.method3854(super.anInt9925 + super.aShort87, super.anInt9915, super.aShort88 + super.anInt9917);
		@Pc(40) Class3_Sub6 local40 = Static665.method8806(1, this.aBoolean258);
		if (Static499.aBoolean608) {
			this.aClass62_3.method7332(local11, local40.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			this.aClass62_3.method7335(local11, local40.aClass3_Sub4Array1[0], 0);
		}
		return local40;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZLclient!ha;Z)Lclient!wv;")
	private Class395 method3184(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class342 local19 = Static441.aClass74_169.method2075(this.aShort52 & 0xFFFF);
		@Pc(44) Class42 local44;
		@Pc(30) Class42 local30;
		if (this.aBoolean257) {
			local44 = Static146.aClass42Array3[super.aByte142];
			local30 = Static655.aClass42Array5[0];
		} else {
			if (super.aByte142 >= 3) {
				local30 = null;
			} else {
				local30 = Static655.aClass42Array5[super.aByte142 + 1];
			}
			local44 = Static655.aClass42Array5[super.aByte142];
		}
		return local19.method7498(super.anInt9925, super.anInt9917, local44, arg1, local30, arg0, (Class141) null, arg2, this.aByte43, this.aByte44, super.anInt9915);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass62_3 != null) {
			this.aClass62_3.method7338();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		@Pc(22) Class4_Sub5_Sub9 local22;
		if (this.aClass4_Sub5_Sub9_2 == null && this.lb) {
			@Pc(33) Class395 local33 = this.method3184(262144, arg0, true);
			local22 = local33 == null ? null : local33.aClass4_Sub5_Sub9_6;
		} else {
			local22 = this.aClass4_Sub5_Sub9_2;
			this.aClass4_Sub5_Sub9_2 = null;
		}
		if (local22 != null) {
			Static545.method7262(local22, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aClass62_3 == null ? false : this.aClass62_3.F();
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.lb;
	}

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass62_3 == null ? 0 : this.aClass62_3.fa();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class62 method3185(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass62_3 != null && arg0.method8124(this.aClass62_3.ua(), arg1) == 0) {
			return this.aClass62_3;
		} else {
			@Pc(28) Class395 local28 = this.method3184(arg1, arg0, false);
			return local28 == null ? null : local28.aClass62_7;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(15) Class62 local15 = this.method3185(arg2, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class92 local20 = arg2.method8078();
			local20.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local15.method7341(arg0, arg1, local20, false, 0, Static140.anInt8126) : local15.method7347(arg0, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		if (this.aClass261_3 == null) {
			this.aClass261_3 = Static386.method4994(super.anInt9915, super.anInt9925, this.method3185(arg0, 0), super.anInt9917);
		}
		return this.aClass261_3;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		@Pc(18) Class4_Sub5_Sub9 local18;
		if (this.aClass4_Sub5_Sub9_2 == null && this.lb) {
			@Pc(29) Class395 local29 = this.method3184(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass4_Sub5_Sub9_6;
		} else {
			local18 = this.aClass4_Sub5_Sub9_2;
			this.aClass4_Sub5_Sub9_2 = null;
		}
		if (local18 != null) {
			Static383.method8453(local18, super.aByte142, super.anInt9925, super.anInt9917, (boolean[]) null);
		}
	}
}
