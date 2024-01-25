import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class31_Sub5_Sub1 extends Class31_Sub5 {

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public int anInt7248;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public int anInt7249;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	public int anInt7252;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public int anInt7245 = -1;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public int anInt7253 = -1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class33 local6 = arg0.method4516();
		local6.j(super.anInt7243, super.anInt7244, super.anInt7239);
		@Pc(31) Class105 local31 = Static165.aClass19_1.method560(this.anInt7249).method3492(0, -1, this.anInt7252, null, 0, null, 131072, arg0);
		if (local31 != null && local31.method3526(arg2, arg1, local6, true)) {
			return true;
		}
		if (this.anInt7253 != -1) {
			local31 = Static165.aClass19_1.method560(this.anInt7253).method3492(0, -1, this.anInt7248, null, 0, null, 131072, arg0);
			if (local31 != null && local31.method3526(arg2, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt7245 != -1) {
			local31 = Static165.aClass19_1.method560(this.anInt7245).method3492(0, -1, this.anInt7251, null, 0, null, 131072, arg0);
			if (local31 != null && local31.method3526(arg2, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class33 local6 = arg0.method4516();
		local6.j(super.anInt7243, super.anInt7244, super.anInt7239);
		@Pc(18) Class4_Sub1 local18 = Static241.method3635(3);
		@Pc(39) Class105 local39;
		if (this.anInt7245 != -1) {
			local39 = Static165.aClass19_1.method560(this.anInt7245).method3492(0, -1, this.anInt7251, null, 0, null, 2048, arg0);
			if (local39 != null) {
				local39.method3534(local6, local18.aClass4_Sub5Array1[2], 0);
			}
		}
		if (this.anInt7253 != -1) {
			local39 = Static165.aClass19_1.method560(this.anInt7253).method3492(0, -1, this.anInt7248, null, 0, null, 2048, arg0);
			if (local39 != null) {
				local39.method3534(local6, local18.aClass4_Sub5Array1[1], 0);
			}
		}
		local39 = Static165.aClass19_1.method560(this.anInt7249).method3492(0, -1, this.anInt7252, null, 0, null, 2048, arg0);
		if (local39 != null) {
			local39.method3534(local6, local18.aClass4_Sub5Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}
}
