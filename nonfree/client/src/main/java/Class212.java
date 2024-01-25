import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class212 {

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!aj;")
	private Class10 aClass10_33 = new Class10(64);

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!om;")
	private final Class246 aClass246_163;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class212(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_163 = arg2;
		if (this.aClass246_163 != null) {
			@Pc(20) int local20 = this.aClass246_163.method5682() - 1;
			this.aClass246_163.method5673(local20);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
	public void method5092(@OriginalArg(0) int arg0) {
		@Pc(10) Class10 local10 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method263();
			this.aClass10_33 = new Class10(arg0);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public void method5093() {
		@Pc(2) Class10 local2 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method263();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public void method5094() {
		@Pc(2) Class10 local2 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method262();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lclient!km;")
	public Class190 method5095(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_33;
		@Pc(16) Class190 local16;
		synchronized (this.aClass10_33) {
			local16 = (Class190) this.aClass10_33.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_163;
		@Pc(46) byte[] local46;
		synchronized (this.aClass246_163) {
			local46 = this.aClass246_163.method5653(Static160.method2872(arg0), Static147.method2765(arg0));
		}
		local16 = new Class190();
		if (local46 != null) {
			local16.method4449(new Class3_Sub11(local46));
		}
		@Pc(75) Class10 local75 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
	public void method5097() {
		@Pc(2) Class10 local2 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method258(5);
		}
	}
}
