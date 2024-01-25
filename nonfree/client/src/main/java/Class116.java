import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class116 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Lclient!d;")
	private final Class44 aClass44_27 = new Class44(128);

	@OriginalMember(owner = "client!io", name = "h", descriptor = "Lclient!um;")
	private final Class243 aClass243_99;

	static {
		new Class198("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class116(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_99 = arg2;
		this.aClass243_99.method5472(1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)Lclient!gj;")
	public Class89 method2452(@OriginalArg(1) int arg0) {
		@Pc(14) Class44 local14 = this.aClass44_27;
		@Pc(24) Class89 local24;
		synchronized (this.aClass44_27) {
			local24 = (Class89) this.aClass44_27.method1028((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class243 local37 = this.aClass243_99;
		@Pc(46) byte[] local46;
		synchronized (this.aClass243_99) {
			local46 = this.aClass243_99.method5455(arg0, 1);
		}
		local24 = new Class89();
		if (local46 != null) {
			local24.method1947(new Class5_Sub15(local46));
		}
		@Pc(68) Class44 local68 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1017((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)V")
	public void method2454() {
		@Pc(2) Class44 local2 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1025(5);
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
	public void method2455() {
		@Pc(6) Class44 local6 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1031();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public void method2457() {
		@Pc(6) Class44 local6 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1024();
		}
	}
}
