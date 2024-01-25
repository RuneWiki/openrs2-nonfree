import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class43 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!fc;")
	private final Class94 aClass94_9 = new Class94(128);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!ni;")
	private final Class223 aClass223_23;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class43(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_23 = arg2;
		if (this.aClass223_23 != null) {
			@Pc(20) int local20 = this.aClass223_23.method5961() - 1;
			this.aClass223_23.method5970(local20);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!sp;")
	public Class313 method1765(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_9;
		@Pc(16) Class313 local16;
		synchronized (this.aClass94_9) {
			local16 = (Class313) this.aClass94_9.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass223_23.method5954(Static141.method2791(arg0), Static292.method5023(arg0));
		local16 = new Class313();
		if (local37 != null) {
			local16.method7524(new Class6_Sub8(local37));
		}
		@Pc(53) Class94 local53 = this.aClass94_9;
		synchronized (this.aClass94_9) {
			this.aClass94_9.method2963((long) arg0, local16);
			return local16;
		}
	}
}
