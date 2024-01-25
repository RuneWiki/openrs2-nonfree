import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class33 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!d;")
	private final Class44 aClass44_6 = new Class44(64);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!um;")
	private final Class243 aClass243_37;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class33(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_37 = arg2;
		if (this.aClass243_37 != null) {
			this.aClass243_37.method5472(11);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Lclient!mw;")
	public Class166 method788(@OriginalArg(1) int arg0) {
		@Pc(11) Class44 local11 = this.aClass44_6;
		@Pc(23) Class166 local23;
		synchronized (this.aClass44_6) {
			local23 = (Class166) this.aClass44_6.method1028((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class243 local36 = this.aClass243_37;
		@Pc(47) byte[] local47;
		synchronized (this.aClass243_37) {
			local47 = this.aClass243_37.method5455(arg0, 11);
		}
		local23 = new Class166();
		if (local47 != null) {
			local23.method3403(new Class5_Sub15(local47));
		}
		@Pc(69) Class44 local69 = this.aClass44_6;
		synchronized (this.aClass44_6) {
			this.aClass44_6.method1017((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public void method790() {
		@Pc(2) Class44 local2 = this.aClass44_6;
		synchronized (this.aClass44_6) {
			this.aClass44_6.method1025(5);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public void method792() {
		@Pc(6) Class44 local6 = this.aClass44_6;
		synchronized (this.aClass44_6) {
			this.aClass44_6.method1031();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public void method793() {
		@Pc(2) Class44 local2 = this.aClass44_6;
		synchronized (this.aClass44_6) {
			this.aClass44_6.method1024();
		}
	}
}
