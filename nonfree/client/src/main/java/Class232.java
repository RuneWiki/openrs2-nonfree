import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class232 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!rl;")
	private final Class317 aClass317_33 = new Class317(64);

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!rg;")
	private final Class310 aClass310_77;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class232(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_77 = arg2;
		this.aClass310_77.method7773(5);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lclient!sg;")
	public Class14_Sub2_Sub18 method5791(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_33;
		@Pc(18) Class14_Sub2_Sub18 local18;
		synchronized (this.aClass317_33) {
			local18 = (Class14_Sub2_Sub18) this.aClass317_33.method7882((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class310 local32 = this.aClass310_77;
		@Pc(41) byte[] local41;
		synchronized (this.aClass310_77) {
			local41 = this.aClass310_77.method7803(arg0, 5);
		}
		local18 = new Class14_Sub2_Sub18();
		if (local41 != null) {
			local18.method8036(new Class14_Sub21(local41));
		}
		@Pc(65) Class317 local65 = this.aClass317_33;
		synchronized (this.aClass317_33) {
			this.aClass317_33.method7875((long) arg0, local18);
			return local18;
		}
	}
}
