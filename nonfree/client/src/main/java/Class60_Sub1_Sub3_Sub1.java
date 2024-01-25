import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class60_Sub1_Sub3_Sub1 extends Class60_Sub1_Sub3 implements Interface23 {

	@OriginalMember(owner = "client!nl", name = "S", descriptor = "Lclient!sba;")
	private Class323 aClass323_5;

	@OriginalMember(owner = "client!nl", name = "U", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "B")
	private final byte aByte102;

	@OriginalMember(owner = "client!nl", name = "db", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!nl", name = "Q", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!nl", name = "kb", descriptor = "Lclient!ka;")
	public Class54 aClass54_4;

	@OriginalMember(owner = "client!nl", name = "Y", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub18 aClass6_Sub2_Sub18_5;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIIZ)V")
	public Class60_Sub1_Sub3_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static214.method3877(arg9, arg8));
		this.aByte103 = (byte) arg9;
		this.aBoolean527 = arg7;
		super.anInt9048 = arg4;
		this.aByte102 = (byte) arg8;
		super.anInt9057 = arg6;
		this.aBoolean525 = arg10;
		this.aBoolean524 = arg1.anInt3587 != 0 && !arg7;
		this.aShort80 = (short) arg1.anInt3629;
		this.aBoolean526 = arg0.method6658() && arg1.aBoolean288 && !this.aBoolean527 && Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean525) {
			local80 |= 0x10000;
		}
		@Pc(95) Class252 local95 = this.method6207(arg0, -125, this.aBoolean526, local80);
		if (local95 != null) {
			this.aClass54_4 = local95.aClass54_3;
			this.aClass6_Sub2_Sub18_5 = local95.aClass6_Sub2_Sub18_4;
			if (this.aBoolean525) {
				this.aClass54_4 = this.aClass54_4.method7398((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		if (this.aClass54_4 == null) {
			return null;
		}
		@Pc(18) Class109 local18 = arg0.method6643();
		local18.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(32) Class60_Sub9 local32 = Static511.method7383(this.aBoolean524, 1);
		if (Static490.aBoolean634) {
			this.aClass54_4.method7407(local18, local32.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			this.aClass54_4.method7401(local18, local32.aClass60_Sub10Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class54 method6206(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass54_4 != null && arg0.method6712(this.aClass54_4.ua(), arg1) == 0) {
			return this.aClass54_4;
		} else {
			@Pc(37) Class252 local37 = this.method6207(arg0, -122, false, arg1);
			return local37 == null ? null : local37.aClass54_3;
		}
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		if (this.aClass54_4 == null) {
			return true;
		} else {
			return !this.aClass54_4.r();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		@Pc(24) Class6_Sub2_Sub18 local24;
		if (this.aClass6_Sub2_Sub18_5 == null && this.aBoolean526) {
			@Pc(35) Class252 local35 = this.method6207(arg0, -119, true, 262144);
			local24 = local35 == null ? null : local35.aClass6_Sub2_Sub18_4;
		} else {
			local24 = this.aClass6_Sub2_Sub18_5;
			this.aClass6_Sub2_Sub18_5 = null;
		}
		if (local24 != null) {
			Static167.method3308(local24, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.aByte103 = 31;
		}
		return this.aClass54_4 == null ? 0 : this.aClass54_4.ma();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.aBoolean525 = true;
		}
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		this.aBoolean525 = false;
		if (this.aClass54_4 != null) {
			this.aClass54_4.s(this.aClass54_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aClass54_4 == null ? false : this.aClass54_4.F();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aShort80 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!ni;")
	private Class252 method6207(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class125 local13 = Static290.aClass163_5.method4124(125, this.aShort80 & 0xFFFF);
		@Pc(21) Class96 local21;
		@Pc(34) Class96 local34;
		if (this.aBoolean527) {
			local21 = Static216.aClass96Array1[super.aByte134];
			local34 = Static524.aClass96Array2[0];
		} else {
			local21 = Static524.aClass96Array2[super.aByte134];
			if (super.aByte134 < 3) {
				local34 = Static524.aClass96Array2[super.aByte134 + 1];
			} else {
				local34 = null;
			}
		}
		if (arg1 >= -114) {
			this.aShort80 = 70;
		}
		return local13.method3387(this.aByte102, arg0, arg2, local21, this.aByte103, super.anInt9048, (Class22) null, super.anInt9051, local34, super.anInt9057, arg3);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		if (arg2 instanceof Class60_Sub1_Sub3_Sub1) {
			@Pc(17) Class60_Sub1_Sub3_Sub1 local17 = (Class60_Sub1_Sub3_Sub1) arg2;
			if (this.aClass54_4 != null && local17.aClass54_4 != null) {
				this.aClass54_4.method7405(local17.aClass54_4, arg4, arg1, arg0, arg3);
			}
		} else if (arg2 instanceof Class60_Sub1_Sub1_Sub1) {
			@Pc(42) Class60_Sub1_Sub1_Sub1 local42 = (Class60_Sub1_Sub1_Sub1) arg2;
			if (this.aClass54_4 != null && local42.aClass54_1 != null) {
				this.aClass54_4.method7405(local42.aClass54_1, arg4, arg1, arg0, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		if (arg0 < 70) {
			this.method7929(-128);
		}
		return this.aByte102;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class54 local15 = this.method6206(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class109 local20 = arg0.method6643();
			local20.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			return Static490.aBoolean634 ? local15.method7399(arg2, arg1, local20, false, 0, Static377.anInt6468) : local15.method7417(arg2, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aByte103;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.aClass54_4 == null ? 0 : this.aClass54_4.fa();
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return this.aBoolean525;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
		if (this.aClass54_4 != null) {
			this.aClass54_4.method7414();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		if (this.aClass323_5 == null) {
			this.aClass323_5 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, this.method6206(arg0, 0));
		}
		return this.aClass323_5;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aBoolean526;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		@Pc(30) Class6_Sub2_Sub18 local30;
		if (this.aClass6_Sub2_Sub18_5 == null && this.aBoolean526) {
			@Pc(22) Class252 local22 = this.method6207(arg1, arg0 ^ 0x49DD, true, 262144);
			local30 = local22 == null ? null : local22.aClass6_Sub2_Sub18_4;
		} else {
			local30 = this.aClass6_Sub2_Sub18_5;
			this.aClass6_Sub2_Sub18_5 = null;
		}
		if (local30 != null) {
			Static415.method6398(local30, super.aByte134, super.anInt9048, super.anInt9057, (boolean[]) null);
		}
		if (arg0 != -18864) {
			this.aBoolean527 = false;
		}
	}
}
