import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Lclient!gs;")
	public final Class92 aClass92_4;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Z")
	private final boolean aBoolean203;

	static {
		new Class174("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIIZIIIIIII)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt775 == 1, Static72.method1299(arg13, arg12));
		this.aClass92_4 = new Class92(arg0, arg1, arg12, arg13, super.aByte101, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean203 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.aClass92_4.method2142(0, false, 0, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		this.aClass92_4.method2144(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aClass92_4.method2140();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
	@Override
	public int method6184() {
		return this.aClass92_4.method2141();
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aClass92_4.anInt2477;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_4.method2142(super.anInt7557, false, super.anInt7560, true, 2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class11 local23 = arg0.method5989();
		local23.C(super.anInt7560, super.anInt7563, super.anInt7557);
		@Pc(33) Class23_Sub5 local33 = null;
		if (this.aBoolean203) {
			local33 = Static217.method1031(1);
		}
		if (this.aClass92_4.aClass23_Sub3_2 == null) {
			local16.method4931(local23, local33 == null ? null : local33.aClass23_Sub6Array1[0], 0);
		} else {
			@Pc(63) Class77 local63 = this.aClass92_4.aClass23_Sub3_2.method2974();
			arg0.method5999(local16, local63, local23, local33 == null ? null : local33.aClass23_Sub6Array1[0]);
		}
		this.aClass92_4.method2147(super.aShort110, super.aShort108, super.aShort107, arg0, true, local16, super.aShort109);
		return local33;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(16) Class108 local16 = this.aClass92_4.method2142(super.anInt7557, false, super.anInt7560, false, 131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(32) Class11 local32 = arg2.method5989();
			local32.C(super.anInt7560, super.anInt7563, super.anInt7557);
			return local16.method4937(arg1, arg0, local32, false);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aClass92_4.anInt2489;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		this.aClass92_4.method2145(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aClass92_4.anInt2485;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_4.method2142(super.anInt7557, true, super.anInt7560, true, 262144, arg0);
		if (local16 != null) {
			this.aClass92_4.method2147(super.aShort110, super.aShort108, super.aShort107, arg0, false, local16, super.aShort109);
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
	}
}
