import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class265 {

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!d;")
	private final Class44 aClass44_75 = new Class44(64);

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!um;")
	private final Class243 aClass243_249;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class265(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_249 = arg2;
		this.aClass243_249.method5472(31);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
	public void method5911() {
		@Pc(6) Class44 local6 = this.aClass44_75;
		synchronized (this.aClass44_75) {
			this.aClass44_75.method1025(5);
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Lclient!kj;")
	public Class137 method5913(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_75;
		@Pc(16) Class137 local16;
		synchronized (this.aClass44_75) {
			local16 = (Class137) this.aClass44_75.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_249;
		@Pc(47) byte[] local47;
		synchronized (this.aClass243_249) {
			local47 = this.aClass243_249.method5455(arg0, 31);
		}
		local16 = new Class137();
		if (local47 != null) {
			local16.method2889(new Class5_Sub15(local47));
		}
		@Pc(69) Class44 local69 = this.aClass44_75;
		synchronized (this.aClass44_75) {
			this.aClass44_75.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public void method5914() {
		@Pc(6) Class44 local6 = this.aClass44_75;
		synchronized (this.aClass44_75) {
			this.aClass44_75.method1031();
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method5916() {
		@Pc(6) Class44 local6 = this.aClass44_75;
		synchronized (this.aClass44_75) {
			this.aClass44_75.method1024();
		}
	}
}
