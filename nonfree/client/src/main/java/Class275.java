import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class275 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Lclient!qr;")
	private final Class293 aClass293_53 = new Class293(128);

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "Lclient!wu;")
	private final Class384 aClass384_107;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class275(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_107 = arg2;
		if (this.aClass384_107 != null) {
			@Pc(20) int local20 = this.aClass384_107.method8865() - 1;
			this.aClass384_107.method8862(local20);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)Lclient!nb;")
	public Class238 method6617(@OriginalArg(0) int arg0) {
		@Pc(16) Class293 local16 = this.aClass293_53;
		@Pc(26) Class238 local26;
		synchronized (this.aClass293_53) {
			local26 = (Class238) this.aClass293_53.method6921((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(47) byte[] local47 = this.aClass384_107.method8885(Static352.method5590(arg0), Static376.method5854(arg0));
		local26 = new Class238();
		if (local47 != null) {
			local26.method5739(new Class5_Sub12(local47));
		}
		@Pc(63) Class293 local63 = this.aClass293_53;
		synchronized (this.aClass293_53) {
			this.aClass293_53.method6925((long) arg0, local26);
			return local26;
		}
	}
}
