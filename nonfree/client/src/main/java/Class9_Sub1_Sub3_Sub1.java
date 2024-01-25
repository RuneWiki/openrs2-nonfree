import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class9_Sub1_Sub3_Sub1 extends Class9_Sub1_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!eca", name = "N", descriptor = "Lclient!bm;")
	private Class29 aClass29_3;

	@OriginalMember(owner = "client!eca", name = "W", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!eca", name = "K", descriptor = "Lclient!ui;")
	public final Class335 aClass335_2;

	@OriginalMember(owner = "client!eca", name = "Y", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIZII)V")
	public Class9_Sub1_Sub3_Sub1(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt761);
		this.aClass335_2 = new Class335(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean211 = arg1.anInt772 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.aClass335_2.method7044();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7089(@OriginalArg(1) Class43 arg0) {
		this.aClass335_2.method7040(arg0);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7087(@OriginalArg(0) Class43 arg0) {
		this.aClass335_2.method7041(arg0);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aClass335_2.anInt8405;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)I")
	@Override
	public int method7091() {
		return this.aClass335_2.anInt8396;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return this.aClass29_3;
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aBoolean210;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aClass335_2.method7045();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			Static110.aFloat39 = 1.072816F;
		}
		return this.aClass335_2.method7049();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I")
	@Override
	public int method7088() {
		return this.aClass335_2.anInt8412;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class57 local24 = this.aClass335_2.method7047(131072, super.anInt8980, arg0, false, false, super.anInt8975);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class109 local31 = arg0.method7142();
			local31.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			return Static225.aBoolean335 ? local24.method7509(arg1, arg2, local31, false, Static354.anInt6136) : local24.method7507(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		@Pc(18) Class57 local18 = this.aClass335_2.method7047(2048, super.anInt8980, arg0, false, true, super.anInt8975);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class109 local25 = arg0.method7142();
		local25.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		@Pc(35) Class9_Sub2 local35 = null;
		if (this.aBoolean211) {
			local35 = Static88.method1977(1);
		}
		@Pc(47) int local47 = super.anInt8975 >> 9;
		@Pc(52) int local52 = super.anInt8980 >> 9;
		this.aClass335_2.method7050(local47, local47, local52, arg0, local25, local52, local18, true);
		if (Static225.aBoolean335) {
			local18.method7521(local25, local35 == null ? null : local35.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
		} else {
			local18.method7501(local25, local35 == null ? null : local35.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass335_2.aClass9_Sub6_8 != null) {
			@Pc(107) Class96 local107 = this.aClass335_2.aClass9_Sub6_8.method3053();
			if (Static225.aBoolean335) {
				arg0.method7176(local107, Static354.anInt6136);
			} else {
				arg0.method7189(local107);
			}
		}
		this.aBoolean210 = local18.LA() || this.aClass335_2.aClass9_Sub6_8 != null;
		if (this.aClass29_3 == null) {
			this.aClass29_3 = Static17.method292(super.anInt8980, super.anInt8977, local18, super.anInt8975);
		} else {
			Static175.method3040(super.anInt8975, super.anInt8977, local18, this.aClass29_3, super.anInt8980);
		}
		return local35;
	}

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return false;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
		@Pc(16) Class57 local16 = this.aClass335_2.method7047(262144, super.anInt8980, arg0, true, true, super.anInt8975);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8975 >> 9;
		@Pc(28) int local28 = super.anInt8980 >> 9;
		@Pc(31) Class109 local31 = arg0.method7142();
		local31.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		this.aClass335_2.method7050(local23, local23, local28, arg0, local31, local28, local16, false);
	}
}
