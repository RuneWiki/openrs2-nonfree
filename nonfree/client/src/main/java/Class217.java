import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class217 {

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!jo;")
	private final Class126 aClass126_52 = new Class126(16);

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!ok;")
	private final Class178 aClass178_106;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class217(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_106 = arg2;
		this.aClass178_106.method3833(30);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public void method4443() {
		@Pc(2) Class126 local2 = this.aClass126_52;
		synchronized (this.aClass126_52) {
			this.aClass126_52.method2827();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public void method4446() {
		@Pc(10) Class126 local10 = this.aClass126_52;
		synchronized (this.aClass126_52) {
			this.aClass126_52.method2821();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V")
	public void method4451() {
		@Pc(2) Class126 local2 = this.aClass126_52;
		synchronized (this.aClass126_52) {
			this.aClass126_52.method2828(5);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Lclient!vm;")
	public Class259 method4452(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_52;
		@Pc(16) Class259 local16;
		synchronized (this.aClass126_52) {
			local16 = (Class259) this.aClass126_52.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_106;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_106) {
			local38 = this.aClass178_106.method3838(arg0, 30);
		}
		local16 = new Class259();
		if (local38 != null) {
			local16.method5565(new Class7_Sub14(local38));
		}
		@Pc(60) Class126 local60 = this.aClass126_52;
		synchronized (this.aClass126_52) {
			this.aClass126_52.method2824((long) arg0, local16);
			return local16;
		}
	}
}
