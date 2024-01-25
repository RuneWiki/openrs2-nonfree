import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class25_Sub2_Sub5_Sub1 extends Class25_Sub2_Sub5 implements Interface14 {

	@OriginalMember(owner = "client!fba", name = "gb", descriptor = "Lclient!ll;")
	private Class190 aClass190_3;

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!fba", name = "W", descriptor = "S")
	private final short aShort39;

	@OriginalMember(owner = "client!fba", name = "U", descriptor = "B")
	private final byte aByte34;

	@OriginalMember(owner = "client!fba", name = "R", descriptor = "Z")
	private final boolean aBoolean238;

	@OriginalMember(owner = "client!fba", name = "eb", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!fba", name = "T", descriptor = "Z")
	private final boolean aBoolean239;

	@OriginalMember(owner = "client!fba", name = "O", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_4;

	@OriginalMember(owner = "client!fba", name = "J", descriptor = "Lclient!da;")
	private Class52 aClass52_4;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZIZ)V")
	public Class25_Sub2_Sub5_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5799);
		super.anInt8476 = arg4;
		this.aBoolean237 = arg9;
		super.anInt8482 = arg6;
		this.aShort39 = (short) arg1.anInt5827;
		this.aByte34 = (byte) arg8;
		this.aBoolean238 = arg1.anInt5831 != 0 && !arg7;
		this.aBoolean240 = arg7;
		this.aBoolean239 = arg0.method8069() && arg1.aBoolean400 && !this.aBoolean240 && Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean237) {
			local63 |= 0x10000;
		}
		@Pc(78) Class277 local78 = this.method2723(local63, this.aBoolean239, arg0);
		if (local78 != null) {
			this.aClass3_Sub7_Sub3_4 = local78.aClass3_Sub7_Sub3_6;
			this.aClass52_4 = local78.aClass52_7;
			if (this.aBoolean237) {
				this.aClass52_4 = this.aClass52_4.method7618((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class52 local9 = this.method2721(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class42 local14 = arg1.method8052();
			local14.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			return Static547.aBoolean631 ? local9.method7612(arg2, arg0, local14, false, Static150.anInt3469) : local9.method7635(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass52_4 == null ? 0 : this.aClass52_4.J();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aShort39 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aBoolean239;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		@Pc(14) Class3_Sub7_Sub3 local14;
		if (this.aClass3_Sub7_Sub3_4 == null && this.aBoolean239) {
			@Pc(27) Class277 local27 = this.method2723(262144, true, arg0);
			local14 = local27 == null ? null : local27.aClass3_Sub7_Sub3_6;
		} else {
			local14 = this.aClass3_Sub7_Sub3_4;
			this.aClass3_Sub7_Sub3_4 = null;
		}
		if (local14 != null) {
			Static293.method4410(local14, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class52 method2721(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		if (this.aClass52_4 != null && arg1.method8050(this.aClass52_4.PA(), arg0) == 0) {
			return this.aClass52_4;
		} else {
			@Pc(31) Class277 local31 = this.method2723(arg0, false, arg1);
			return local31 == null ? null : local31.aClass52_7;
		}
	}

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return this.aBoolean237;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIZLclient!r;)Lclient!raa;")
	private Class277 method2723(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(21) Class194 local21 = Static536.aClass146_4.method3721(this.aShort39 & 0xFFFF);
		@Pc(33) Class127 local33;
		@Pc(28) Class127 local28;
		if (this.aBoolean240) {
			local28 = Static420.aClass127Array6[0];
			local33 = Static108.aClass127Array5[super.aByte118];
		} else {
			if (super.aByte118 >= 3) {
				local28 = null;
			} else {
				local28 = Static420.aClass127Array6[super.aByte118 + 1];
			}
			local33 = Static420.aClass127Array6[super.aByte118];
		}
		return local21.method4695(super.anInt8476, local33, arg2, arg0, local28, this.aByte34, arg1, super.anInt8480, 22, super.anInt8482);
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aByte34;
	}

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aClass52_4 == null ? false : this.aClass52_4.LA();
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		if (this.aClass52_4 == null) {
			return null;
		}
		@Pc(11) Class42 local11 = arg0.method8052();
		local11.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(21) Class25_Sub10 local21 = null;
		if (this.aBoolean238) {
			local21 = Static65.method1625(1);
		}
		if (Static547.aBoolean631) {
			this.aClass52_4.method7619(local11, local21 == null ? null : local21.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			this.aClass52_4.method7617(local11, local21 == null ? null : local21.aClass25_Sub1Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		this.aBoolean237 = false;
		if (this.aClass52_4 != null) {
			this.aClass52_4.SA(this.aClass52_4.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 < 108) {
			Static138.method2727();
		}
		return this.aClass52_4 == null ? 0 : this.aClass52_4.RA();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		@Pc(33) Class3_Sub7_Sub3 local33;
		if (this.aClass3_Sub7_Sub3_4 == null && this.aBoolean239) {
			@Pc(26) Class277 local26 = this.method2723(262144, true, arg0);
			local33 = local26 == null ? null : local26.aClass3_Sub7_Sub3_6;
		} else {
			local33 = this.aClass3_Sub7_Sub3_4;
			this.aClass3_Sub7_Sub3_4 = null;
		}
		if (local33 != null) {
			Static242.method3819(local33, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		if (this.aClass190_3 == null) {
			this.aClass190_3 = Static560.method7667(this.method2721(0, arg0), super.anInt8482, super.anInt8476, super.anInt8480);
		}
		return this.aClass190_3;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
		if (this.aClass52_4 != null) {
			this.aClass52_4.method7624();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return 22;
	}

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return true;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		if (arg5 instanceof Class25_Sub2_Sub5_Sub1) {
			@Pc(11) Class25_Sub2_Sub5_Sub1 local11 = (Class25_Sub2_Sub5_Sub1) arg5;
			if (this.aClass52_4 != null && local11.aClass52_4 != null) {
				this.aClass52_4.method7634(local11.aClass52_4, arg1, arg0, arg4, arg3);
			}
		}
	}
}
