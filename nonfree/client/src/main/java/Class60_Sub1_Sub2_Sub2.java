import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class60_Sub1_Sub2_Sub2 extends Class60_Sub1_Sub2 implements Interface23 {

	@OriginalMember(owner = "client!gea", name = "P", descriptor = "Lclient!sba;")
	private Class323 aClass323_3;

	@OriginalMember(owner = "client!gea", name = "ib", descriptor = "B")
	private byte aByte58;

	@OriginalMember(owner = "client!gea", name = "N", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!gea", name = "eb", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!gea", name = "ab", descriptor = "Z")
	private final boolean aBoolean312;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "S")
	private final short aShort46;

	@OriginalMember(owner = "client!gea", name = "Q", descriptor = "Z")
	private final boolean aBoolean314;

	@OriginalMember(owner = "client!gea", name = "lb", descriptor = "Lclient!ka;")
	private Class54 lb;

	@OriginalMember(owner = "client!gea", name = "Y", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub18 aClass6_Sub2_Sub18_2;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIZ)V")
	public Class60_Sub1_Sub2_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt3612);
		this.aByte58 = (byte) arg8;
		super.anInt9048 = arg4;
		this.aBoolean313 = arg7;
		this.aBoolean311 = arg9;
		super.anInt9057 = arg6;
		this.aBoolean312 = arg1.anInt3587 != 0 && !arg7;
		this.aShort46 = (short) arg1.anInt3629;
		this.aBoolean314 = arg0.method6658() && arg1.aBoolean288 && !this.aBoolean313 && Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean311) {
			local71 |= 0x10000;
		}
		@Pc(86) Class252 local86 = this.method3519(local71, arg0, this.aBoolean314);
		if (local86 != null) {
			this.lb = local86.aClass54_3;
			this.aClass6_Sub2_Sub18_2 = local86.aClass6_Sub2_Sub18_4;
			if (this.aBoolean311) {
				this.lb = this.lb.method7398((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		@Pc(28) Class6_Sub2_Sub18 local28;
		if (this.aClass6_Sub2_Sub18_2 == null && this.aBoolean314) {
			@Pc(20) Class252 local20 = this.method3519(262144, arg1, true);
			local28 = local20 == null ? null : local20.aClass6_Sub2_Sub18_4;
		} else {
			local28 = this.aClass6_Sub2_Sub18_2;
			this.aClass6_Sub2_Sub18_2 = null;
		}
		if (arg0 == -18864 && local28 != null) {
			Static415.method6398(local28, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aBoolean314;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		if (arg2 instanceof Class60_Sub1_Sub2_Sub2) {
			@Pc(5) Class60_Sub1_Sub2_Sub2 local5 = (Class60_Sub1_Sub2_Sub2) arg2;
			if (this.lb != null && local5.lb != null) {
				this.lb.method7405(local5.lb, arg4, arg1, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!ni;")
	private Class252 method3519(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) Class125 local20 = Static290.aClass163_5.method4124(125, this.aShort46 & 0xFFFF);
		@Pc(32) Class96 local32;
		@Pc(27) Class96 local27;
		if (this.aBoolean313) {
			local27 = Static524.aClass96Array2[0];
			local32 = Static216.aClass96Array1[super.aByte134];
		} else {
			if (super.aByte134 >= 3) {
				local27 = null;
			} else {
				local27 = Static524.aClass96Array2[super.aByte134 + 1];
			}
			local32 = Static524.aClass96Array2[super.aByte134];
		}
		return local20.method3387(22, arg1, arg2, local32, this.aByte58, super.anInt9048, (Class22) null, super.anInt9051, local27, super.anInt9057, arg0);
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		this.aBoolean311 = false;
		if (this.lb != null) {
			this.lb.s(this.lb.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aShort46 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class54 method3521(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1) {
		if (this.lb != null && arg1.method6712(this.lb.ua(), arg0) == 0) {
			return this.lb;
		} else {
			@Pc(39) Class252 local39 = this.method3519(arg0, arg1, false);
			return local39 == null ? null : local39.aClass54_3;
		}
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.lb == null ? false : this.lb.F();
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.lb == null ? 0 : this.lb.fa();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class54 local9 = this.method3521(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class109 local22 = arg0.method6643();
			local22.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			return Static490.aBoolean634 ? local9.method7399(arg2, arg1, local22, false, 0, Static377.anInt6468) : local9.method7417(arg2, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		if (this.lb == null) {
			return true;
		} else {
			return !this.lb.r();
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
		if (this.lb != null) {
			this.lb.method7414();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		@Pc(36) Class6_Sub2_Sub18 local36;
		if (this.aClass6_Sub2_Sub18_2 == null && this.aBoolean314) {
			@Pc(28) Class252 local28 = this.method3519(262144, arg0, true);
			local36 = local28 == null ? null : local28.aClass6_Sub2_Sub18_4;
		} else {
			local36 = this.aClass6_Sub2_Sub18_2;
			this.aClass6_Sub2_Sub18_2 = null;
		}
		if (local36 != null) {
			Static167.method3308(local36, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		if (this.lb == null) {
			return null;
		}
		@Pc(21) Class109 local21 = arg0.method6643();
		local21.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(35) Class60_Sub9 local35 = Static511.method7383(this.aBoolean312, 1);
		if (Static490.aBoolean634) {
			this.lb.method7407(local21, local35.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			this.lb.method7401(local21, local35.aClass60_Sub10Array1[0], 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.method7933();
		}
		return this.lb == null ? 0 : this.lb.ma();
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		return arg0 < 70 ? -88 : 22;
	}

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return this.aBoolean311;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.aByte58 = 47;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		if (this.aClass323_3 == null) {
			this.aClass323_3 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, this.method3521(0, arg0));
		}
		return this.aClass323_3;
	}
}
