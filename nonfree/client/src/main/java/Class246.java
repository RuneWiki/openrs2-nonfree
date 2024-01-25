import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class246 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Lclient!ge;")
	private final Class83 aClass83_54 = new Class83(128);

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Lclient!ci;")
	private final Class38 aClass38_83;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class246(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_83 = arg2;
		if (this.aClass38_83 != null) {
			@Pc(20) int local20 = this.aClass38_83.method1035() - 1;
			this.aClass38_83.method1032(local20);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Lclient!cq;")
	public Class43 method5653(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_54;
		@Pc(18) Class43 local18;
		synchronized (this.aClass83_54) {
			local18 = (Class43) this.aClass83_54.method2338((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass38_83.method1039(Static159.method2895(arg0), Static451.method6166(arg0));
		local18 = new Class43();
		if (local39 != null) {
			local18.method1213(new Class4_Sub20(local39));
		}
		@Pc(55) Class83 local55 = this.aClass83_54;
		synchronized (this.aClass83_54) {
			this.aClass83_54.method2337(local18, (long) arg0);
			return local18;
		}
	}
}
