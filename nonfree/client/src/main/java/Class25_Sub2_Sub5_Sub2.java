import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class25_Sub2_Sub5_Sub2 extends Class25_Sub2_Sub5 implements Interface14 {

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "Lclient!ll;")
	private Class190 aClass190_4;

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "Lclient!fb;")
	public final Class97 aClass97_1;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "Z")
	private final boolean aBoolean288;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZII)V")
	public Class25_Sub2_Sub5_Sub2(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5799);
		this.aClass97_1 = new Class97(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean288 = arg1.anInt5831 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass97_1.method2667();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		this.aClass97_1.method2665(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aClass97_1.anInt3279;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		@Pc(19) Class52 local19 = this.aClass97_1.method2660(arg0, false, true, 2048);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class42 local26 = arg0.method8052();
		local26.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(36) Class25_Sub10 local36 = null;
		if (this.aBoolean288) {
			local36 = Static65.method1625(1);
		}
		@Pc(48) int local48 = super.anInt8476 >> 9;
		@Pc(53) int local53 = super.anInt8482 >> 9;
		this.aClass97_1.method2659(local19, local48, local53, local53, true, arg0, local48, local26);
		if (Static547.aBoolean631) {
			local19.method7619(local26, local36 == null ? null : local36.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			local19.method7617(local26, local36 == null ? null : local36.aClass25_Sub1Array1[0], 0);
		}
		if (this.aClass97_1.aClass25_Sub7_2 != null) {
			@Pc(103) Class323 local103 = this.aClass97_1.aClass25_Sub7_2.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local103, Static150.anInt3469);
			} else {
				arg0.method8090(local103);
			}
		}
		this.aBoolean287 = local19.LA() || this.aClass97_1.aClass25_Sub7_2 != null;
		if (this.aClass190_4 == null) {
			this.aClass190_4 = Static560.method7667(local19, super.anInt8482, super.anInt8476, super.anInt8480);
		} else {
			Static561.method7678(this.aClass190_4, super.anInt8480, super.anInt8476, local19, super.anInt8482);
		}
		return local36;
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 < 108) {
			this.method4959();
		}
		return this.aClass97_1.method2664(30556);
	}

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		this.aClass97_1.method2661(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aClass97_1.anInt3292;
	}

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class52 local12 = this.aClass97_1.method2660(arg1, false, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class42 local19 = arg1.method8052();
			local19.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			return Static547.aBoolean631 ? local12.method7612(arg2, arg0, local19, false, Static150.anInt3469) : local12.method7635(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return this.aClass97_1.anInt3285;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		@Pc(16) Class52 local16 = this.aClass97_1.method2660(arg0, true, true, 262144);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8476 >> 9;
		@Pc(28) int local28 = super.anInt8482 >> 9;
		@Pc(31) Class42 local31 = arg0.method8052();
		local31.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		this.aClass97_1.method2659(local16, local23, local28, local28, false, arg0, local23, local31);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aClass97_1.method2670();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return this.aClass190_4;
	}
}
