import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class25_Sub2_Sub1_Sub2 extends Class25_Sub2_Sub1 implements Interface14 {

	@OriginalMember(owner = "client!mo", name = "X", descriptor = "Lclient!ll;")
	private Class190 aClass190_8;

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "client!mo", name = "K", descriptor = "Lclient!fb;")
	public final Class97 aClass97_4;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "Z")
	private final boolean aBoolean430;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZIIIII)V")
	public Class25_Sub2_Sub1_Sub2(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass97_4 = new Class97(arg0, arg1, arg10, arg11, super.aByte117, arg3, this, arg7, arg12);
		this.aBoolean430 = arg1.anInt5831 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aBoolean431;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		@Pc(19) Class52 local19 = this.aClass97_4.method2660(arg0, false, true, 2048);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class42 local26 = arg0.method8052();
		local26.NA(super.anInt8476 + super.aShort79, super.anInt8480, super.anInt8482 + super.aShort78);
		@Pc(44) Class25_Sub10 local44 = null;
		if (this.aBoolean430) {
			local44 = Static65.method1625(1);
		}
		@Pc(56) int local56 = super.anInt8476 >> 9;
		@Pc(61) int local61 = super.anInt8482 >> 9;
		this.aClass97_4.method2659(local19, local56, local61, local61, true, arg0, local56, local26);
		if (Static547.aBoolean631) {
			local19.method7619(local26, local44 == null ? null : local44.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			local19.method7617(local26, local44 == null ? null : local44.aClass25_Sub1Array1[0], 0);
		}
		if (this.aClass97_4.aClass25_Sub7_2 != null) {
			@Pc(111) Class323 local111 = this.aClass97_4.aClass25_Sub7_2.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local111, Static150.anInt3469);
			} else {
				arg0.method8090(local111);
			}
		}
		this.aBoolean431 = local19.LA() || this.aClass97_4.aClass25_Sub7_2 != null;
		if (this.aClass190_8 == null) {
			this.aClass190_8 = Static560.method7667(local19, super.anInt8482, super.anInt8476, super.anInt8480);
		} else {
			Static561.method7678(this.aClass190_8, super.anInt8480, super.anInt8476, local19, super.anInt8482);
		}
		return local44;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class52 local12 = this.aClass97_4.method2660(arg1, false, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class42 local19 = arg1.method8052();
			local19.NA(super.anInt8476 + super.aShort79, super.anInt8480, super.anInt8482 + super.aShort78);
			return Static547.aBoolean631 ? local12.method7612(arg2, arg0, local19, false, Static150.anInt3469) : local12.method7635(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aClass97_4.method2670();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		this.aClass97_4.method2665(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		this.aClass97_4.method2661(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return this.aClass190_8;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aClass97_4.anInt3279;
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return this.aClass97_4.anInt3285;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass97_4.method2667();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aClass97_4.anInt3292;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		@Pc(12) Class52 local12 = this.aClass97_4.method2660(arg0, false, true, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt8476 >> 9;
		@Pc(24) int local24 = super.anInt8482 >> 9;
		@Pc(27) Class42 local27 = arg0.method8052();
		local27.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		this.aClass97_4.method2659(local12, local19, local24, local24, false, arg0, local19, local27);
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 < 108) {
			this.method4957();
		}
		return this.aClass97_4.method2664(30556);
	}
}
