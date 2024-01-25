import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class25_Sub2_Sub2_Sub3 extends Class25_Sub2_Sub2 implements Interface14 {

	@OriginalMember(owner = "client!jda", name = "db", descriptor = "Lclient!ll;")
	private Class190 aClass190_5;

	@OriginalMember(owner = "client!jda", name = "fb", descriptor = "Z")
	private boolean aBoolean321 = false;

	@OriginalMember(owner = "client!jda", name = "R", descriptor = "Lclient!fb;")
	public final Class97 aClass97_2;

	@OriginalMember(owner = "client!jda", name = "M", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIIIZIIIIIII)V")
	public Class25_Sub2_Sub2_Sub3(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5807 == 1, Static249.method6957(arg12, arg13));
		this.aClass97_2 = new Class97(arg0, arg1, arg12, arg13, super.aByte117, arg3, this, arg7, arg14);
		this.aBoolean320 = arg1.anInt5831 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)I")
	@Override
	public int method4958() {
		return this.aClass97_2.anInt3292;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4957() {
		return this.aClass97_2.method2670();
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(B)I")
	@Override
	public int method4961() {
		return this.aClass97_2.anInt3279;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method4960(@OriginalArg(1) Class31 arg0) {
		this.aClass97_2.method2665(arg0);
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
	@Override
	public void method4963() {
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)I")
	@Override
	public int method4959() {
		return this.aClass97_2.anInt3285;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method4962(@OriginalArg(0) Class31 arg0) {
		this.aClass97_2.method2661(arg0);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return this.aClass190_5;
	}

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 < 108) {
			Static247.method3935(60, 110);
		}
		return this.aClass97_2.method2664(30556);
	}

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class52 local12 = this.aClass97_2.method2660(arg1, false, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class42 local19 = arg1.method8052();
			local19.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			return Static547.aBoolean631 ? local12.method7612(arg2, arg0, local19, false, Static150.anInt3469) : local12.method7635(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.aClass97_2.method2667();
	}

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		@Pc(16) Class52 local16 = this.aClass97_2.method2660(arg0, true, true, 262144);
		if (local16 != null) {
			@Pc(21) Class42 local21 = arg0.method8052();
			local21.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			this.aClass97_2.method2659(local16, super.aShort106, super.aShort107, super.aShort109, false, arg0, super.aShort108, local21);
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		@Pc(14) Class52 local14 = this.aClass97_2.method2660(arg0, false, true, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class42 local21 = arg0.method8052();
		local21.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(31) Class25_Sub10 local31 = null;
		if (this.aBoolean320) {
			local31 = Static65.method1625(1);
		}
		this.aClass97_2.method2659(local14, super.aShort106, super.aShort107, super.aShort109, true, arg0, super.aShort108, local21);
		if (Static547.aBoolean631) {
			local14.method7619(local21, local31 == null ? null : local31.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
		} else {
			local14.method7617(local21, local31 == null ? null : local31.aClass25_Sub1Array1[0], 0);
		}
		if (this.aClass97_2.aClass25_Sub7_2 != null) {
			@Pc(97) Class323 local97 = this.aClass97_2.aClass25_Sub7_2.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local97, Static150.anInt3469);
			} else {
				arg0.method8090(local97);
			}
		}
		this.aBoolean321 = local14.LA() || this.aClass97_2.aClass25_Sub7_2 != null;
		if (this.aClass190_5 == null) {
			this.aClass190_5 = Static560.method7667(local14, super.anInt8482, super.anInt8476, super.anInt8480);
		} else {
			Static561.method7678(this.aClass190_5, super.anInt8480, super.anInt8476, local14, super.anInt8482);
		}
		return local31;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aBoolean321;
	}
}
