import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class25_Sub2_Sub3_Sub1 extends Class25_Sub2_Sub3 implements Interface14 {

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "Lclient!ll;")
	private Class190 aClass190_2;

	@OriginalMember(owner = "client!bp", name = "J", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!bp", name = "F", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!bp", name = "O", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!bp", name = "R", descriptor = "Z")
	private final boolean aBoolean103;

	@OriginalMember(owner = "client!bp", name = "X", descriptor = "S")
	private final short aShort16;

	@OriginalMember(owner = "client!bp", name = "eb", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!bp", name = "cb", descriptor = "Z")
	private final boolean aBoolean104;

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "Lclient!da;")
	public Class52 aClass52_2;

	@OriginalMember(owner = "client!bp", name = "db", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_2;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZIIZ)V")
	public Class25_Sub2_Sub3_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static20.method212(arg9, arg8));
		this.aByte20 = (byte) arg8;
		this.aByte19 = (byte) arg9;
		super.anInt8482 = arg6;
		this.aBoolean101 = arg10;
		this.aBoolean103 = arg1.anInt5831 != 0 && !arg7;
		this.aShort16 = (short) arg1.anInt5827;
		this.aBoolean105 = arg7;
		super.anInt8476 = arg4;
		this.aBoolean104 = arg0.method8069() && arg1.aBoolean400 && !this.aBoolean105 && Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean101) {
			local72 |= 0x10000;
		}
		@Pc(87) Class277 local87 = this.method1175(local72, arg0, this.aBoolean104);
		if (local87 != null) {
			this.aClass52_2 = local87.aClass52_7;
			this.aClass3_Sub7_Sub3_2 = local87.aClass3_Sub7_Sub3_6;
			if (this.aBoolean101) {
				this.aClass52_2 = this.aClass52_2.method7618((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		this.aBoolean101 = false;
		if (this.aClass52_2 != null) {
			this.aClass52_2.SA(this.aClass52_2.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		@Pc(33) Class3_Sub7_Sub3 local33;
		if (this.aClass3_Sub7_Sub3_2 == null && this.aBoolean104) {
			@Pc(26) Class277 local26 = this.method1175(262144, arg0, true);
			local33 = local26 == null ? null : local26.aClass3_Sub7_Sub3_6;
		} else {
			local33 = this.aClass3_Sub7_Sub3_2;
			this.aClass3_Sub7_Sub3_2 = null;
		}
		if (local33 != null) {
			Static242.method3819(local33, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aClass52_2 == null ? false : this.aClass52_2.LA();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aShort16 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method7624();
		}
	}

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass52_2 == null ? 0 : this.aClass52_2.J();
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		@Pc(25) Class3_Sub7_Sub3 local25;
		if (this.aClass3_Sub7_Sub3_2 == null && this.aBoolean104) {
			@Pc(18) Class277 local18 = this.method1175(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass3_Sub7_Sub3_6;
		} else {
			local25 = this.aClass3_Sub7_Sub3_2;
			this.aClass3_Sub7_Sub3_2 = null;
		}
		if (local25 != null) {
			Static293.method4410(local25, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class52 local9 = this.method1173(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class42 local20 = arg1.method8052();
			local20.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			return Static547.aBoolean631 ? local9.method7612(arg2, arg0, local20, false, Static150.anInt3469) : local9.method7635(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class52 method1173(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		if (this.aClass52_2 != null && arg1.method8050(this.aClass52_2.PA(), arg0) == 0) {
			return this.aClass52_2;
		} else {
			@Pc(29) Class277 local29 = this.method1175(arg0, arg1, false);
			return local29 == null ? null : local29.aClass52_7;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		if (this.aClass52_2 == null) {
			return null;
		}
		@Pc(11) Class42 local11 = arg0.method8052();
		local11.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(21) Class25_Sub10 local21 = null;
		if (this.aBoolean103) {
			local21 = Static65.method1625(1);
		}
		if (Static547.aBoolean631) {
			this.aClass52_2.method7619(local11, local21 == null ? null : local21.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			this.aClass52_2.method7617(local11, local21 == null ? null : local21.aClass25_Sub1Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		if (arg5 instanceof Class25_Sub2_Sub3_Sub1) {
			@Pc(5) Class25_Sub2_Sub3_Sub1 local5 = (Class25_Sub2_Sub3_Sub1) arg5;
			if (this.aClass52_2 != null && local5.aClass52_2 != null) {
				this.aClass52_2.method7634(local5.aClass52_2, arg1, arg0, arg4, arg3);
			}
		} else if (arg5 instanceof Class25_Sub2_Sub2_Sub4) {
			@Pc(28) Class25_Sub2_Sub2_Sub4 local28 = (Class25_Sub2_Sub2_Sub4) arg5;
			if (this.aClass52_2 != null && local28.aClass52_5 != null) {
				this.aClass52_2.method7634(local28.aClass52_5, arg1, arg0, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aBoolean104;
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return this.aBoolean101;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		if (this.aClass190_2 == null) {
			this.aClass190_2 = Static560.method7667(this.method1173(0, arg0), super.anInt8482, super.anInt8476, super.anInt8480);
		}
		return this.aClass190_2;
	}

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 <= 108) {
			return -47;
		} else if (this.aClass52_2 == null) {
			return 0;
		} else {
			return this.aClass52_2.RA();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!r;Z)Lclient!raa;")
	private Class277 method1175(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class194 local18 = Static536.aClass146_4.method3721(this.aShort16 & 0xFFFF);
		@Pc(43) Class127 local43;
		@Pc(34) Class127 local34;
		if (this.aBoolean105) {
			local43 = Static108.aClass127Array5[super.aByte118];
			local34 = Static420.aClass127Array6[0];
		} else {
			if (super.aByte118 < 3) {
				local34 = Static420.aClass127Array6[super.aByte118 + 1];
			} else {
				local34 = null;
			}
			local43 = Static420.aClass127Array6[super.aByte118];
		}
		return local18.method4695(super.anInt8476, local43, arg1, arg0, local34, this.aByte19, arg2, super.anInt8480, this.aByte20, super.anInt8482);
	}
}
