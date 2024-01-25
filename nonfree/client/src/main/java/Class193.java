import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class193 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Lclient!jo;")
	private final Class126 aClass126_43 = new Class126(64);

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!ok;")
	private final Class178 aClass178_91;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class193(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_91 = arg2;
		if (this.aClass178_91 != null) {
			this.aClass178_91.method3833(11);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
	public void method4067() {
		@Pc(12) Class126 local12 = this.aClass126_43;
		synchronized (this.aClass126_43) {
			this.aClass126_43.method2828(5);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)Lclient!ve;")
	public Class256 method4068(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_43;
		@Pc(25) Class256 local25;
		synchronized (this.aClass126_43) {
			local25 = (Class256) this.aClass126_43.method2822((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class178 local38 = this.aClass178_91;
		@Pc(47) byte[] local47;
		synchronized (this.aClass178_91) {
			local47 = this.aClass178_91.method3838(arg0, 11);
		}
		local25 = new Class256();
		if (local47 != null) {
			local25.method5445(new Class7_Sub14(local47));
		}
		local6 = this.aClass126_43;
		synchronized (this.aClass126_43) {
			this.aClass126_43.method2824((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method4071() {
		@Pc(10) Class126 local10 = this.aClass126_43;
		synchronized (this.aClass126_43) {
			this.aClass126_43.method2821();
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	public void method4072() {
		@Pc(2) Class126 local2 = this.aClass126_43;
		synchronized (this.aClass126_43) {
			this.aClass126_43.method2827();
		}
	}
}
