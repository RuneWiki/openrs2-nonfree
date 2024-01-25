import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class25_Sub2_Sub1_Sub1 extends Class25_Sub2_Sub1 implements Interface14 {

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Lclient!ll;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "S")
	private final short aShort5;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Z")
	private final boolean aBoolean29;

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "Z")
	private final boolean aBoolean28;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_1;

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lclient!da;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZIIII)V")
	public Class25_Sub2_Sub1_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt8476 = arg4;
		this.aShort5 = (short) arg1.anInt5827;
		this.aByte7 = (byte) arg11;
		super.anInt8482 = arg6;
		this.aBoolean29 = arg7;
		this.aBoolean30 = arg1.anInt5831 != 0 && !arg7;
		this.aByte8 = (byte) arg10;
		this.aBoolean28 = arg0.method8069() && arg1.aBoolean400 && !this.aBoolean29 && Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) != 0;
		@Pc(70) Class277 local70 = this.method424(2048, arg0, this.aBoolean28);
		if (local70 != null) {
			this.aClass3_Sub7_Sub3_1 = local70.aClass3_Sub7_Sub3_6;
			this.aClass52_1 = local70.aClass52_7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass52_1 == null ? 0 : this.aClass52_1.J();
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		if (this.aClass190_1 == null) {
			this.aClass190_1 = Static560.method7667(this.method427(arg0, 0), super.anInt8482, super.anInt8476, super.anInt8480);
		}
		return this.aClass190_1;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!r;ZZ)Lclient!raa;")
	private Class277 method424(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class194 local13 = Static536.aClass146_4.method3721(this.aShort5 & 0xFFFF);
		@Pc(31) Class127 local31;
		@Pc(39) Class127 local39;
		if (this.aBoolean29) {
			local31 = Static108.aClass127Array5[super.aByte118];
			local39 = Static420.aClass127Array6[0];
		} else {
			local31 = Static420.aClass127Array6[super.aByte118];
			if (super.aByte118 >= 3) {
				local39 = null;
			} else {
				local39 = Static420.aClass127Array6[super.aByte118 + 1];
			}
		}
		return local13.method4695(super.anInt8476, local31, arg1, arg0, local39, this.aByte7, arg2, super.anInt8480, this.aByte8, super.anInt8482);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		@Pc(14) Class3_Sub7_Sub3 local14;
		if (this.aClass3_Sub7_Sub3_1 == null && this.aBoolean28) {
			@Pc(25) Class277 local25 = this.method424(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub3_6;
		} else {
			local14 = this.aClass3_Sub7_Sub3_1;
			this.aClass3_Sub7_Sub3_1 = null;
		}
		if (local14 != null) {
			Static242.method3819(local14, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
		if (this.aClass52_1 != null) {
			this.aClass52_1.method7624();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aShort5 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		if (this.aClass52_1 == null) {
			return null;
		}
		@Pc(16) Class42 local16 = arg0.method8052();
		local16.NA(super.anInt8476 + super.aShort79, super.anInt8480, super.aShort78 + super.anInt8482);
		@Pc(32) Class25_Sub10 local32 = null;
		if (this.aBoolean30) {
			local32 = Static65.method1625(1);
		}
		if (Static547.aBoolean631) {
			this.aClass52_1.method7619(local16, local32 == null ? null : local32.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			this.aClass52_1.method7617(local16, local32 == null ? null : local32.aClass25_Sub1Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class52 method427(@OriginalArg(1) Class31 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass52_1 != null && arg0.method8050(this.aClass52_1.PA(), arg1) == 0) {
			return this.aClass52_1;
		} else {
			@Pc(28) Class277 local28 = this.method424(arg1, arg0, false);
			return local28 == null ? null : local28.aClass52_7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class52 local15 = this.method427(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class42 local20 = arg1.method8052();
			local20.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			return Static547.aBoolean631 ? local15.method7612(arg2, arg0, local20, false, Static150.anInt3469) : local15.method7635(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 <= 108) {
			this.aClass3_Sub7_Sub3_1 = null;
		}
		return this.aClass52_1 == null ? 0 : this.aClass52_1.RA();
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aClass52_1 == null ? false : this.aClass52_1.LA();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aBoolean28;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		@Pc(31) Class3_Sub7_Sub3 local31;
		if (this.aClass3_Sub7_Sub3_1 == null && this.aBoolean28) {
			@Pc(24) Class277 local24 = this.method424(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass3_Sub7_Sub3_6;
		} else {
			local31 = this.aClass3_Sub7_Sub3_1;
			this.aClass3_Sub7_Sub3_1 = null;
		}
		if (local31 != null) {
			Static293.method4410(local31, super.aByte118, super.anInt8476, super.anInt8482, null);
		}
	}
}
