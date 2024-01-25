import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class9_Sub1_Sub2_Sub1 extends Class9_Sub1_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!bg", name = "lb", descriptor = "Lclient!sb;")
	public static final Class298 lb = new Class298(26, 6);

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "Lclient!bm;")
	private Class29 aClass29_2;

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!bg", name = "cb", descriptor = "Lclient!ui;")
	public final Class335 aClass335_1;

	@OriginalMember(owner = "client!bg", name = "Z", descriptor = "Z")
	private final boolean aBoolean81;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIZIIIII)V")
	public Class9_Sub1_Sub2_Sub1(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass335_1 = new Class335(arg0, arg1, arg10, arg11, super.aByte126, arg3, arg4, arg6, arg7, arg12);
		this.aBoolean81 = arg1.anInt772 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aClass335_1.method7049() : 50;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
		@Pc(16) Class57 local16 = this.aClass335_1.method7047(262144, super.anInt8980, arg0, false, true, super.anInt8975);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8975 >> 9;
		@Pc(28) int local28 = super.anInt8980 >> 9;
		@Pc(31) Class109 local31 = arg0.method7142();
		local31.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		this.aClass335_1.method7050(local23, local23, local28, arg0, local31, local28, local16, false);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7087(@OriginalArg(0) Class43 arg0) {
		this.aClass335_1.method7041(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return this.aClass29_2;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aClass335_1.method7045();
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.aClass335_1.method7044();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	@Override
	public int method7088() {
		return this.aClass335_1.anInt8412;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass335_1.method7047(131072, super.anInt8980, arg0, false, false, super.anInt8975);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class109 local31 = arg0.method7142();
			local31.NA(super.anInt8975 + super.aShort47, super.anInt8977, super.aShort46 + super.anInt8980);
			return Static225.aBoolean335 ? local16.method7509(arg1, arg2, local31, false, Static354.anInt6136) : local16.method7507(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		@Pc(18) Class57 local18 = this.aClass335_1.method7047(2048, super.anInt8980, arg0, false, true, super.anInt8975);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class109 local30 = arg0.method7142();
		local30.NA(super.anInt8975 + super.aShort47, super.anInt8977, super.anInt8980 + super.aShort46);
		@Pc(48) Class9_Sub2 local48 = null;
		if (this.aBoolean81) {
			local48 = Static88.method1977(1);
		}
		@Pc(60) int local60 = super.anInt8975 >> 9;
		@Pc(65) int local65 = super.anInt8980 >> 9;
		this.aClass335_1.method7050(local60, local60, local65, arg0, local30, local65, local18, true);
		if (Static225.aBoolean335) {
			local18.method7521(local30, local48 == null ? null : local48.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
		} else {
			local18.method7501(local30, local48 == null ? null : local48.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass335_1.aClass9_Sub6_8 != null) {
			@Pc(115) Class96 local115 = this.aClass335_1.aClass9_Sub6_8.method3053();
			if (Static225.aBoolean335) {
				arg0.method7176(local115, Static354.anInt6136);
			} else {
				arg0.method7189(local115);
			}
		}
		this.aBoolean80 = local18.LA() || this.aClass335_1.aClass9_Sub6_8 != null;
		if (this.aClass29_2 == null) {
			this.aClass29_2 = Static17.method292(super.anInt8980, super.anInt8977, local18, super.anInt8975);
		} else {
			Static175.method3040(super.anInt8975, super.anInt8977, local18, this.aClass29_2, super.anInt8980);
		}
		return local48;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	@Override
	public int method7091() {
		return this.aClass335_1.anInt8396;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aBoolean80;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aClass335_1.anInt8405;
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7089(@OriginalArg(1) Class43 arg0) {
		this.aClass335_1.method7040(arg0);
	}
}
