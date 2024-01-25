import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class53 {

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!jo;")
	private Class126 aClass126_12 = new Class126(64);

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!ok;")
	private final Class178 aClass178_18;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class53(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_18 = arg2;
		if (this.aClass178_18 != null) {
			@Pc(20) int local20 = this.aClass178_18.method3832() - 1;
			this.aClass178_18.method3833(local20);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public void method1175() {
		@Pc(6) Class126 local6 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method2821();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
	public void method1176(@OriginalArg(0) int arg0) {
		@Pc(12) Class126 local12 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method2827();
			this.aClass126_12 = new Class126(arg0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)Lclient!ls;")
	public Class148 method1177(@OriginalArg(0) int arg0) {
		@Pc(11) Class126 local11 = this.aClass126_12;
		@Pc(21) Class148 local21;
		synchronized (this.aClass126_12) {
			local21 = (Class148) this.aClass126_12.method2822((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class178 local34 = this.aClass178_18;
		@Pc(47) byte[] local47;
		synchronized (this.aClass178_18) {
			local47 = this.aClass178_18.method3838(Static31.method419(arg0), Static432.method5602(arg0));
		}
		local21 = new Class148();
		if (local47 != null) {
			local21.method3265(new Class7_Sub14(local47));
		}
		@Pc(69) Class126 local69 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method2824((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1178() {
		@Pc(10) Class126 local10 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method2827();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	public void method1179() {
		@Pc(6) Class126 local6 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method2828(5);
		}
	}
}
