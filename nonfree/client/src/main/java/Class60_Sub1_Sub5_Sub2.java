import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class60_Sub1_Sub5_Sub2 extends Class60_Sub1_Sub5 implements Interface23 {

	@OriginalMember(owner = "client!sfa", name = "lb", descriptor = "I")
	public static int lb = 0;

	@OriginalMember(owner = "client!sfa", name = "S", descriptor = "Lclient!sba;")
	private Class323 aClass323_7;

	@OriginalMember(owner = "client!sfa", name = "Q", descriptor = "B")
	private final byte aByte133;

	@OriginalMember(owner = "client!sfa", name = "M", descriptor = "S")
	private final short aShort114;

	@OriginalMember(owner = "client!sfa", name = "fb", descriptor = "Z")
	private final boolean aBoolean678;

	@OriginalMember(owner = "client!sfa", name = "Z", descriptor = "B")
	private final byte aByte132;

	@OriginalMember(owner = "client!sfa", name = "cb", descriptor = "Z")
	private final boolean aBoolean677;

	@OriginalMember(owner = "client!sfa", name = "N", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!sfa", name = "ab", descriptor = "Lclient!ka;")
	private Class54 aClass54_7;

	@OriginalMember(owner = "client!sfa", name = "L", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub18 aClass6_Sub2_Sub18_6;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIIII)V")
	public Class60_Sub1_Sub5_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt9057 = arg6;
		this.aByte133 = (byte) arg10;
		this.aShort114 = (short) arg1.anInt3629;
		super.anInt9048 = arg4;
		this.aBoolean678 = arg7;
		this.aByte132 = (byte) arg11;
		this.aBoolean677 = arg1.anInt3587 != 0 && !arg7;
		this.aBoolean679 = arg0.method6658() && arg1.aBoolean288 && !this.aBoolean678 && Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() != 0;
		@Pc(78) Class252 local78 = this.method7849(arg0, this.aBoolean679, 2048);
		if (local78 != null) {
			this.aClass54_7 = local78.aClass54_3;
			this.aClass6_Sub2_Sub18_6 = local78.aClass6_Sub2_Sub18_4;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aClass54_7 == null ? false : this.aClass54_7.F();
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.method7845((Class75) null, 104);
		}
		return this.aClass54_7 == null ? 0 : this.aClass54_7.ma();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (arg0 != -18864) {
			return;
		}
		@Pc(21) Class6_Sub2_Sub18 local21;
		if (this.aClass6_Sub2_Sub18_6 == null && this.aBoolean679) {
			@Pc(32) Class252 local32 = this.method7849(arg1, true, 262144);
			local21 = local32 == null ? null : local32.aClass6_Sub2_Sub18_4;
		} else {
			local21 = this.aClass6_Sub2_Sub18_6;
			this.aClass6_Sub2_Sub18_6 = null;
		}
		if (local21 != null) {
			Static415.method6398(local21, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			Static553.aClass241_108 = null;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		@Pc(28) Class6_Sub2_Sub18 local28;
		if (this.aClass6_Sub2_Sub18_6 == null && this.aBoolean679) {
			@Pc(20) Class252 local20 = this.method7849(arg0, true, 262144);
			local28 = local20 == null ? null : local20.aClass6_Sub2_Sub18_4;
		} else {
			local28 = this.aClass6_Sub2_Sub18_6;
			this.aClass6_Sub2_Sub18_6 = null;
		}
		if (local28 != null) {
			Static167.method3308(local28, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class54 local11 = this.method7845(arg0, 131072);
		if (local11 == null) {
			return false;
		} else {
			@Pc(16) Class109 local16 = arg0.method6643();
			local16.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			return Static490.aBoolean634 ? local11.method7399(arg2, arg1, local16, false, 0, Static377.anInt6468) : local11.method7417(arg2, arg1, local16, false, 0);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		if (this.aClass54_7 == null) {
			return true;
		} else {
			return !this.aClass54_7.r();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aByte132;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		if (this.aClass323_7 == null) {
			this.aClass323_7 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, this.method7845(arg0, 0));
		}
		return this.aClass323_7;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		if (this.aClass54_7 == null) {
			return null;
		}
		@Pc(20) Class109 local20 = arg0.method6643();
		local20.method4606(super.aShort113 + super.anInt9048, super.anInt9051, super.aShort112 + super.anInt9057);
		@Pc(40) Class60_Sub9 local40 = Static511.method7383(this.aBoolean677, 1);
		if (Static490.aBoolean634) {
			this.aClass54_7.method7407(local20, local40.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			this.aClass54_7.method7401(local20, local40.aClass60_Sub10Array1[0], 0);
		}
		return local40;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
		if (this.aClass54_7 != null) {
			this.aClass54_7.method7414();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class54 method7845(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass54_7 != null && arg0.method6712(this.aClass54_7.ua(), arg1) == 0) {
			return this.aClass54_7;
		} else {
			@Pc(34) Class252 local34 = this.method7849(arg0, false, arg1);
			return local34 == null ? null : local34.aClass54_3;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aShort114 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aBoolean679;
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		return arg0 < 70 ? 9 : this.aByte133;
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.aClass54_7 == null ? 0 : this.aClass54_7.fa();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;ZIB)Lclient!ni;")
	private Class252 method7849(@OriginalArg(0) Class75 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(22) Class125 local22 = Static290.aClass163_5.method4124(124, this.aShort114 & 0xFFFF);
		@Pc(47) Class96 local47;
		@Pc(38) Class96 local38;
		if (this.aBoolean678) {
			local38 = Static524.aClass96Array2[0];
			local47 = Static216.aClass96Array1[super.aByte134];
		} else {
			if (super.aByte134 < 3) {
				local38 = Static524.aClass96Array2[super.aByte134 + 1];
			} else {
				local38 = null;
			}
			local47 = Static524.aClass96Array2[super.aByte134];
		}
		return local22.method3387(this.aByte133, arg0, arg1, local47, this.aByte132, super.anInt9048, (Class22) null, super.anInt9051, local38, super.anInt9057, arg2);
	}
}
