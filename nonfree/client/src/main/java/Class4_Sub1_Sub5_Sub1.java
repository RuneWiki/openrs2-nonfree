import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class4_Sub1_Sub5_Sub1 extends Class4_Sub1_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!gu", name = "F", descriptor = "Lclient!ro;")
	private Class297 aClass297_4;

	@OriginalMember(owner = "client!gu", name = "eb", descriptor = "Z")
	private final boolean aBoolean253;

	@OriginalMember(owner = "client!gu", name = "db", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!gu", name = "jb", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!gu", name = "S", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!gu", name = "fb", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "Z")
	private final boolean aBoolean251;

	@OriginalMember(owner = "client!gu", name = "E", descriptor = "Lclient!ka;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub5 aClass3_Sub4_Sub5_2;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIZ)V")
	public Class4_Sub1_Sub5_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8672);
		this.aBoolean253 = arg1.anInt8641 != 0 && !arg7;
		this.aByte57 = (byte) arg8;
		this.aBoolean255 = arg9;
		super.anInt8911 = arg6;
		this.aShort52 = (short) arg1.anInt8677;
		this.aBoolean254 = arg7;
		super.anInt8916 = arg4;
		this.aBoolean251 = arg0.method7494() && arg1.aBoolean600 && !this.aBoolean254 && Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean255) {
			local63 |= 0x10000;
		}
		@Pc(78) Class216 local78 = this.method3395(local63, this.aBoolean251, arg0);
		if (local78 != null) {
			this.aClass17_2 = local78.aClass17_6;
			this.aClass3_Sub4_Sub5_2 = local78.aClass3_Sub4_Sub5_6;
			if (this.aBoolean255) {
				this.aClass17_2 = this.aClass17_2.method5409((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
		if (this.aClass17_2 != null) {
			this.aClass17_2.method5426();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZZLclient!ha;)Lclient!mg;")
	private Class216 method3395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) Class299 local13 = Static105.aClass302_1.method7466(this.aShort52 & 0xFFFF);
		@Pc(30) Class51 local30;
		@Pc(25) Class51 local25;
		if (this.aBoolean254) {
			local25 = Static559.aClass51Array4[0];
			local30 = Static2.aClass51Array1[super.aByte124];
		} else {
			if (super.aByte124 < 3) {
				local25 = Static559.aClass51Array4[super.aByte124 + 1];
			} else {
				local25 = null;
			}
			local30 = Static559.aClass51Array4[super.aByte124];
		}
		return local13.method7408(super.anInt8916, this.aByte57, arg1, super.anInt8911, 22, arg0, arg2, super.anInt8915, local30, local25);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aBoolean251;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 > -4) {
			return -1;
		} else if (this.aClass17_2 == null) {
			return 0;
		} else {
			return this.aClass17_2.ma();
		}
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aClass17_2 == null ? false : this.aClass17_2.F();
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		if (this.aClass17_2 == null) {
			return true;
		} else {
			return !this.aClass17_2.r();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(15) Class17 local15 = this.method3397(131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class39 local20 = arg2.method7546();
			local20.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local15.method5420(arg1, arg0, local20, false, 0, Static401.anInt7417) : local15.method5433(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		@Pc(25) Class3_Sub4_Sub5 local25;
		if (this.aClass3_Sub4_Sub5_2 == null && this.aBoolean251) {
			@Pc(18) Class216 local18 = this.method3395(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub4_Sub5_6;
		} else {
			local25 = this.aClass3_Sub4_Sub5_2;
			this.aClass3_Sub4_Sub5_2 = null;
		}
		if (local25 != null) {
			Static112.method2304(local25, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		this.aBoolean255 = false;
		if (this.aClass17_2 != null) {
			this.aClass17_2.s(this.aClass17_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		@Pc(33) Class3_Sub4_Sub5 local33;
		if (this.aClass3_Sub4_Sub5_2 == null && this.aBoolean251) {
			@Pc(26) Class216 local26 = this.method3395(262144, true, arg0);
			local33 = local26 == null ? null : local26.aClass3_Sub4_Sub5_6;
		} else {
			local33 = this.aClass3_Sub4_Sub5_2;
			this.aClass3_Sub4_Sub5_2 = null;
		}
		if (local33 != null) {
			Static145.method2663(local33, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass17_2 == null ? 0 : this.aClass17_2.fa();
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		if (this.aClass297_4 == null) {
			this.aClass297_4 = Static476.method7143(this.method3397(0, arg0), super.anInt8916, super.anInt8915, super.anInt8911);
		}
		return this.aClass297_4;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		if (this.aClass17_2 == null) {
			return null;
		}
		@Pc(11) Class39 local11 = arg0.method7546();
		local11.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(36) Class4_Sub8 local36 = Static271.method4457(this.aBoolean253, 1);
		if (Static279.aBoolean329) {
			this.aClass17_2.method5413(local11, local36.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			this.aClass17_2.method5411(local11, local36.aClass4_Sub5Array1[0], 0);
		}
		return local36;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return 22;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ha;Z)Lclient!ka;")
	private Class17 method3397(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		if (this.aClass17_2 != null && arg1.method7541(this.aClass17_2.ua(), arg0) == 0) {
			return this.aClass17_2;
		} else {
			@Pc(23) Class216 local23 = this.method3395(arg0, false, arg1);
			return local23 == null ? null : local23.aClass17_6;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (!(arg1 instanceof Class4_Sub1_Sub5_Sub1)) {
			return;
		}
		@Pc(15) Class4_Sub1_Sub5_Sub1 local15 = (Class4_Sub1_Sub5_Sub1) arg1;
		if (this.aClass17_2 != null && local15.aClass17_2 != null) {
			this.aClass17_2.method5429(local15.aClass17_2, arg0, arg3, arg5, arg4);
			return;
		}
	}
}
