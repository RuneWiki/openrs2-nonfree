import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class31 {

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "Lclient!fba;")
	private final Class102 aClass102_4 = new Class102(128);

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "Lclient!la;")
	private final Class196 aClass196_14;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class31(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_14 = arg2;
		if (this.aClass196_14 != null) {
			@Pc(20) int local20 = this.aClass196_14.method5125() - 1;
			this.aClass196_14.method5118(local20);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)Lclient!rd;")
	public Class290 method1344(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_4;
		@Pc(18) Class290 local18;
		synchronized (this.aClass102_4) {
			local18 = (Class290) this.aClass102_4.method2677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass196_14.method5102(Static282.method4554(arg0), Static155.method2824(arg0));
		local18 = new Class290();
		if (local39 != null) {
			local18.method7234(new Class3_Sub3(local39));
		}
		@Pc(55) Class102 local55 = this.aClass102_4;
		synchronized (this.aClass102_4) {
			this.aClass102_4.method2674((long) arg0, local18);
			return local18;
		}
	}
}
