import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class25_Sub2_Sub2_Sub4 extends Class25_Sub2_Sub2 implements Interface14 {

	@OriginalMember(owner = "client!kba", name = "Z", descriptor = "Lclient!ll;")
	private Class190 aClass190_6;

	@OriginalMember(owner = "client!kba", name = "bb", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!kba", name = "kb", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!kba", name = "Q", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!kba", name = "ob", descriptor = "S")
	private final short aShort65;

	@OriginalMember(owner = "client!kba", name = "S", descriptor = "Z")
	private final boolean aBoolean340;

	@OriginalMember(owner = "client!kba", name = "ib", descriptor = "Z")
	private boolean aBoolean343;

	@OriginalMember(owner = "client!kba", name = "gb", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!kba", name = "T", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_5;

	@OriginalMember(owner = "client!kba", name = "R", descriptor = "Lclient!da;")
	public Class52 aClass52_5;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZIIIIIIZ)V")
	public Class25_Sub2_Sub2_Sub4(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5807 == 1, Static308.method4627(arg12, arg13));
		this.aBoolean341 = arg1.anInt5831 != 0 && !arg7;
		this.aByte55 = (byte) arg13;
		super.aByte118 = (byte) arg3;
		this.aByte54 = (byte) arg12;
		this.aShort65 = (short) arg1.anInt5827;
		this.aBoolean340 = arg7;
		this.aBoolean343 = arg14;
		this.aBoolean342 = arg0.method8069() && arg1.aBoolean400 && !this.aBoolean340 && Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean343) {
			local83 |= 0x10000;
		}
		@Pc(98) Class277 local98 = this.method4149(this.aBoolean342, local83, arg0);
		if (local98 != null) {
			this.aClass3_Sub7_Sub3_5 = local98.aClass3_Sub7_Sub3_6;
			this.aClass52_5 = local98.aClass52_7;
			if (this.aBoolean343) {
				this.aClass52_5 = this.aClass52_5.method7618((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aShort65 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "(B)I")
	public int method4144() {
		return this.aClass52_5 == null ? 15 : this.aClass52_5.K() / 4;
	}

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return this.aBoolean343;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBLclient!r;)Lclient!da;")
	private Class52 method4145(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1) {
		if (this.aClass52_5 != null && arg1.method8050(this.aClass52_5.PA(), arg0) == 0) {
			return this.aClass52_5;
		} else {
			@Pc(30) Class277 local30 = this.method4149(false, arg0, arg1);
			return local30 == null ? null : local30.aClass52_7;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		@Pc(33) Class3_Sub7_Sub3 local33;
		if (this.aClass3_Sub7_Sub3_5 == null && this.aBoolean342) {
			@Pc(26) Class277 local26 = this.method4149(true, 262144, arg0);
			local33 = local26 == null ? null : local26.aClass3_Sub7_Sub3_6;
		} else {
			local33 = this.aClass3_Sub7_Sub3_5;
			this.aClass3_Sub7_Sub3_5 = null;
		}
		if (local33 != null) {
			Static242.method3819(local33, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class52 local9 = this.method4145(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class42 local14 = arg1.method8052();
			local14.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			return Static547.aBoolean631 ? local9.method7612(arg2, arg0, local14, false, Static150.anInt3469) : local9.method7635(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass52_5 == null ? 0 : this.aClass52_5.J();
	}

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 <= 108) {
			return -109;
		} else if (this.aClass52_5 == null) {
			return 0;
		} else {
			return this.aClass52_5.RA();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		if (arg5 instanceof Class25_Sub2_Sub3_Sub1) {
			@Pc(5) Class25_Sub2_Sub3_Sub1 local5 = (Class25_Sub2_Sub3_Sub1) arg5;
			if (this.aClass52_5 != null && local5.aClass52_2 != null) {
				this.aClass52_5.method7634(local5.aClass52_2, arg1, arg0, arg4, arg3);
			}
		} else if (arg5 instanceof Class25_Sub2_Sub2_Sub4) {
			@Pc(28) Class25_Sub2_Sub2_Sub4 local28 = (Class25_Sub2_Sub2_Sub4) arg5;
			if (this.aClass52_5 != null && local28.aClass52_5 != null) {
				this.aClass52_5.method7634(local28.aClass52_5, arg1, arg0, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		if (this.aClass190_6 == null) {
			this.aClass190_6 = Static560.method7667(this.method4145(0, arg0), super.anInt8482, super.anInt8476, super.anInt8480);
		}
		return this.aClass190_6;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		if (this.aClass52_5 == null) {
			return null;
		}
		@Pc(16) Class42 local16 = arg0.method8052();
		local16.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(26) Class25_Sub10 local26 = null;
		if (this.aBoolean341) {
			local26 = Static65.method1625(1);
		}
		if (Static547.aBoolean631) {
			this.aClass52_5.method7619(local16, local26 == null ? null : local26.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			this.aClass52_5.method7617(local16, local26 == null ? null : local26.aClass25_Sub1Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		@Pc(20) Class3_Sub7_Sub3 local20;
		if (this.aClass3_Sub7_Sub3_5 == null && this.aBoolean342) {
			@Pc(31) Class277 local31 = this.method4149(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass3_Sub7_Sub3_6;
		} else {
			local20 = this.aClass3_Sub7_Sub3_5;
			this.aClass3_Sub7_Sub3_5 = null;
		}
		if (local20 != null) {
			Static293.method4410(local20, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aBoolean342;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
	}

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return true;
	}

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aClass52_5 == null ? false : this.aClass52_5.LA();
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZILclient!r;B)Lclient!raa;")
	private Class277 method4149(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		@Pc(20) Class194 local20 = Static536.aClass146_4.method3721(this.aShort65 & 0xFFFF);
		@Pc(28) Class127 local28;
		@Pc(32) Class127 local32;
		if (this.aBoolean340) {
			local28 = Static108.aClass127Array5[super.aByte118];
			local32 = Static420.aClass127Array6[0];
		} else {
			local28 = Static420.aClass127Array6[super.aByte118];
			if (super.aByte118 >= 3) {
				local32 = null;
			} else {
				local32 = Static420.aClass127Array6[super.aByte118 + 1];
			}
		}
		return local20.method4695(super.anInt8476, local28, arg2, arg1, local32, this.aByte54 == 11 ? this.aByte55 + 4 : this.aByte55, arg0, super.anInt8480, this.aByte54 == 11 ? 10 : this.aByte54, super.anInt8482);
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
		if (this.aClass52_5 != null) {
			this.aClass52_5.method7624();
		}
	}

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		this.aBoolean343 = false;
		if (this.aClass52_5 != null) {
			this.aClass52_5.SA(this.aClass52_5.PA() & 0xFFFEFFFF);
		}
	}
}
