import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 implements Interface15 {

	@OriginalMember(owner = "client!wl", name = "P", descriptor = "Lclient!ew;")
	private Class81 aClass81_7;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!tj;")
	public final Class281 aClass281_3;

	@OriginalMember(owner = "client!wl", name = "O", descriptor = "Z")
	private final boolean aBoolean684;

	static {
		new Class67("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIIZIIIIII)V")
	public Class6_Sub4_Sub3(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static436.method6608(arg11, arg12));
		this.aClass281_3 = new Class281(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean684 = arg1.anInt7164 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return this.aClass81_7;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aClass281_3.anInt8418;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aClass281_3.anInt8412;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aClass281_3.method6977();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		this.aClass281_3.method6970(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(18) Class2 local18 = this.aClass281_3.method6979(super.anInt9336, true, super.anInt9342, 2048, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class205 local25 = arg0.method7448();
		local25.GA(super.anInt9340 + super.anInt9336, super.anInt9337, super.anInt9335 + super.anInt9342);
		@Pc(47) Class4_Sub1 local47 = null;
		if (this.aBoolean684) {
			local47 = Static264.method4641(1);
		}
		@Pc(59) int local59 = super.anInt9336 >> 9;
		@Pc(64) int local64 = super.anInt9342 >> 9;
		this.aClass281_3.method6974(local25, local18, local59, true, local64, local59, arg0, local64);
		if (this.aClass281_3.aClass4_Sub4_7 == null) {
			local18.method5774(local25, local47 == null ? null : local47.aClass4_Sub7Array1[0], 0);
		} else {
			@Pc(85) Class26 local85 = this.aClass281_3.aClass4_Sub4_7.method4590();
			arg0.method7464(local18, local85, local25, local47 == null ? null : local47.aClass4_Sub7Array1[0], 0);
		}
		if (this.aClass81_7 == null) {
			this.aClass81_7 = Static257.method4541(super.anInt9342, super.anInt9337, super.anInt9336, local18);
		} else {
			Static340.method5407(super.anInt9342, this.aClass81_7, local18, super.anInt9336, super.anInt9337);
		}
		return local47;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I")
	@Override
	public int method7720() {
		return this.aClass281_3.method6976();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2 local16 = this.aClass281_3.method6979(super.anInt9336, false, super.anInt9342, 131072, arg1, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class205 local23 = arg1.method7448();
			local23.GA(super.anInt9340 + super.anInt9336, super.anInt9337, super.anInt9335 + super.anInt9342);
			return local16.method5786(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aClass281_3.anInt8427;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		this.aClass281_3.method6973(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.aClass281_3.method6979(0, false, 0, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		@Pc(24) Class2 local24 = this.aClass281_3.method6979(super.anInt9336, true, super.anInt9342, 262144, arg0, false);
		if (local24 == null) {
			return;
		}
		@Pc(31) int local31 = super.anInt9336 >> 9;
		@Pc(36) int local36 = super.anInt9342 >> 9;
		@Pc(39) Class205 local39 = arg0.method7448();
		local39.GA(super.anInt9336, super.anInt9337, super.anInt9342);
		this.aClass281_3.method6974(local39, local24, local31, false, local36, local31, arg0, local36);
	}
}
