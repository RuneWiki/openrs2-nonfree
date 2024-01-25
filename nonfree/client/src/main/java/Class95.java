import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class95 {

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!h;")
	private final Class125 aClass125_15 = new Class125(128);

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!an;")
	private final Class16 aClass16_34;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class95(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_34 = arg2;
		if (this.aClass16_34 != null) {
			@Pc(20) int local20 = this.aClass16_34.method407() - 1;
			this.aClass16_34.method399(local20);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Lclient!vo;")
	public Class305 method2637(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_15;
		@Pc(16) Class305 local16;
		synchronized (this.aClass125_15) {
			local16 = (Class305) this.aClass125_15.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass16_34.method408(Static133.method2770(arg0), Static141.method2830(arg0));
		local16 = new Class305();
		if (local45 != null) {
			local16.method7721(new Class12_Sub8(local45));
		}
		@Pc(61) Class125 local61 = this.aClass125_15;
		synchronized (this.aClass125_15) {
			this.aClass125_15.method3437(local16, (long) arg0);
			return local16;
		}
	}
}
