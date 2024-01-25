import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class124 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!ku;")
	private final Class139 aClass139_34 = new Class139(64);

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!b;")
	private final Class20 aClass20_42;

	static {
		new Class57(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class124(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_42 = arg2;
		this.aClass20_42.method231(32);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)Lclient!cb;")
	public Class36 method2628(@OriginalArg(1) int arg0) {
		@Pc(12) Class139 local12 = this.aClass139_34;
		@Pc(22) Class36 local22;
		synchronized (this.aClass139_34) {
			local22 = (Class36) this.aClass139_34.method3076((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass20_42.method253(arg0, 32);
		local22 = new Class36();
		if (local39 != null) {
			local22.method620(new Class3_Sub5(local39));
		}
		@Pc(55) Class139 local55 = this.aClass139_34;
		synchronized (this.aClass139_34) {
			this.aClass139_34.method3070(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method2629() {
		@Pc(2) Class139 local2 = this.aClass139_34;
		synchronized (this.aClass139_34) {
			this.aClass139_34.method3075();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public void method2630() {
		@Pc(11) Class139 local11 = this.aClass139_34;
		synchronized (this.aClass139_34) {
			this.aClass139_34.method3083(5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	public void method2633() {
		@Pc(6) Class139 local6 = this.aClass139_34;
		synchronized (this.aClass139_34) {
			this.aClass139_34.method3072();
		}
	}
}
