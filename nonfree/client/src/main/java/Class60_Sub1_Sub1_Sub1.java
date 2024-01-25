import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class60_Sub1_Sub1_Sub1 extends Class60_Sub1_Sub1 implements Interface23 {

	@OriginalMember(owner = "client!cn", name = "V", descriptor = "Lclient!sba;")
	private Class323 aClass323_1;

	@OriginalMember(owner = "client!cn", name = "X", descriptor = "S")
	private final short aShort25;

	@OriginalMember(owner = "client!cn", name = "db", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!cn", name = "cb", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!cn", name = "R", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!cn", name = "vb", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!cn", name = "jb", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!cn", name = "sb", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!cn", name = "nb", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub18 aClass6_Sub2_Sub18_1;

	@OriginalMember(owner = "client!cn", name = "S", descriptor = "Lclient!ka;")
	public Class54 aClass54_1;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIIIIIIZ)V")
	public Class60_Sub1_Sub1_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3613 == 1, Static230.method4097(arg13, arg12));
		this.aShort25 = (short) arg1.anInt3629;
		this.aBoolean101 = arg14;
		this.aBoolean99 = arg7;
		this.aByte19 = (byte) arg12;
		this.aBoolean102 = arg1.anInt3587 != 0 && !arg7;
		super.aByte134 = (byte) arg3;
		this.aByte20 = (byte) arg13;
		this.aBoolean100 = arg0.method6658() && arg1.aBoolean288 && !this.aBoolean99 && Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() != 0;
		@Pc(86) int local86 = 2048;
		if (this.aBoolean101) {
			local86 |= 0x10000;
		}
		@Pc(101) Class252 local101 = this.method1186(arg0, local86, this.aBoolean100, 4);
		if (local101 != null) {
			this.aClass6_Sub2_Sub18_1 = local101.aClass6_Sub2_Sub18_4;
			this.aClass54_1 = local101.aClass54_3;
			if (this.aBoolean101) {
				this.aClass54_1 = this.aClass54_1.method7398((byte) 0, local86, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aBoolean100;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.aClass54_1 == null ? 0 : this.aClass54_1.fa();
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return this.aBoolean101;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		if (arg0 <= 70) {
			this.method7909((Class75) null, -104);
		}
		return this.aByte19;
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		if (this.aClass54_1 == null) {
			return true;
		} else {
			return !this.aClass54_1.r();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		if (this.aClass323_1 == null) {
			this.aClass323_1 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, this.method1185(0, arg0));
		}
		return this.aClass323_1;
	}

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)I")
	public int method1182() {
		return this.aClass54_1 == null ? 15 : this.aClass54_1.na() / 4;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class6_Sub2_Sub18 local16;
		if (this.aClass6_Sub2_Sub18_1 == null && this.aBoolean100) {
			@Pc(27) Class252 local27 = this.method1186(arg0, 262144, true, 4);
			local16 = local27 == null ? null : local27.aClass6_Sub2_Sub18_4;
		} else {
			local16 = this.aClass6_Sub2_Sub18_1;
			this.aClass6_Sub2_Sub18_1 = null;
		}
		if (local16 != null) {
			Static167.method3308(local16, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aShort25 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class54 local9 = this.method1185(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(26) Class109 local26 = arg0.method6643();
			local26.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			return Static490.aBoolean634 ? local9.method7399(arg2, arg1, local26, false, 0, Static377.anInt6468) : local9.method7417(arg2, arg1, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		if (arg2 instanceof Class60_Sub1_Sub3_Sub1) {
			@Pc(42) Class60_Sub1_Sub3_Sub1 local42 = (Class60_Sub1_Sub3_Sub1) arg2;
			if (this.aClass54_1 != null && local42.aClass54_4 != null) {
				this.aClass54_1.method7405(local42.aClass54_4, arg4, arg1, arg0, arg3);
			}
		} else if (arg2 instanceof Class60_Sub1_Sub1_Sub1) {
			@Pc(18) Class60_Sub1_Sub1_Sub1 local18 = (Class60_Sub1_Sub1_Sub1) arg2;
			if (this.aClass54_1 != null && local18.aClass54_1 != null) {
				this.aClass54_1.method7405(local18.aClass54_1, arg4, arg1, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aClass54_1 == null ? false : this.aClass54_1.F();
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
		if (this.aClass54_1 != null) {
			this.aClass54_1.method7414();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		if (this.aClass54_1 == null) {
			return null;
		}
		@Pc(12) Class109 local12 = arg0.method6643();
		local12.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(34) Class60_Sub9 local34 = Static511.method7383(this.aBoolean102, 1);
		if (Static490.aBoolean634) {
			this.aClass54_1.method7407(local12, local34.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			this.aClass54_1.method7401(local12, local34.aClass60_Sub10Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		this.aBoolean101 = false;
		if (this.aClass54_1 != null) {
			this.aClass54_1.s(this.aClass54_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (arg0 != -18864) {
			return;
		}
		@Pc(35) Class6_Sub2_Sub18 local35;
		if (this.aClass6_Sub2_Sub18_1 == null && this.aBoolean100) {
			@Pc(27) Class252 local27 = this.method1186(arg1, 262144, true, arg0 ^ 0xFFFFB654);
			local35 = local27 == null ? null : local27.aClass6_Sub2_Sub18_4;
		} else {
			local35 = this.aClass6_Sub2_Sub18_1;
			this.aClass6_Sub2_Sub18_1 = null;
		}
		if (local35 != null) {
			Static415.method6398(local35, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZILclient!ha;)Lclient!ka;")
	private Class54 method1185(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1) {
		if (this.aClass54_1 != null && arg1.method6712(this.aClass54_1.ua(), arg0) == 0) {
			return this.aClass54_1;
		} else {
			@Pc(26) Class252 local26 = this.method1186(arg1, arg0, false, 4);
			return local26 == null ? null : local26.aClass54_3;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!ni;")
	private Class252 method1186(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 4) {
			this.method7918();
		}
		@Pc(24) Class125 local24 = Static290.aClass163_5.method4124(arg3 + 117, this.aShort25 & 0xFFFF);
		@Pc(36) Class96 local36;
		@Pc(31) Class96 local31;
		if (this.aBoolean99) {
			local31 = Static524.aClass96Array2[0];
			local36 = Static216.aClass96Array1[super.aByte134];
		} else {
			local36 = Static524.aClass96Array2[super.aByte134];
			if (super.aByte134 < 3) {
				local31 = Static524.aClass96Array2[super.aByte134 + 1];
			} else {
				local31 = null;
			}
		}
		return local24.method3387(this.aByte19 == 11 ? 10 : this.aByte19, arg0, arg2, local36, this.aByte19 == 11 ? this.aByte20 + 4 : this.aByte20, super.anInt9048, (Class22) null, super.anInt9051, local31, super.anInt9057, arg1);
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.aByte19 = 120;
		}
		return this.aClass54_1 == null ? 0 : this.aClass54_1.ma();
	}
}
