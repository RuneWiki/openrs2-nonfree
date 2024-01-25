import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class171 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!d;")
	private final Class44 aClass44_38 = new Class44(64);

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!d;")
	public final Class44 aClass44_39 = new Class44(2);

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!um;")
	private final Class243 aClass243_150;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!um;")
	public final Class243 aClass243_151;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;Lclient!um;)V")
	public Class171(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		this.aClass243_150 = arg2;
		this.aClass243_151 = arg3;
		this.aClass243_150.method5472(33);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method3453() {
		@Pc(2) Class44 local2 = this.aClass44_38;
		synchronized (this.aClass44_38) {
			this.aClass44_38.method1031();
		}
		local2 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1031();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)Lclient!fb;")
	public Class72 method3454(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_38;
		@Pc(18) Class72 local18;
		synchronized (this.aClass44_38) {
			local18 = (Class72) this.aClass44_38.method1028((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class243 local31 = this.aClass243_150;
		@Pc(40) byte[] local40;
		synchronized (this.aClass243_150) {
			local40 = this.aClass243_150.method5455(arg0, 33);
		}
		local18 = new Class72();
		local18.aClass171_1 = this;
		if (local40 != null) {
			local18.method1551(new Class5_Sub15(local40));
		}
		@Pc(70) Class44 local70 = this.aClass44_38;
		synchronized (this.aClass44_38) {
			this.aClass44_38.method1017((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)V")
	public void method3456() {
		@Pc(2) Class44 local2 = this.aClass44_38;
		synchronized (this.aClass44_38) {
			this.aClass44_38.method1025(5);
		}
		local2 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1025(5);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public void method3457() {
		@Pc(6) Class44 local6 = this.aClass44_38;
		synchronized (this.aClass44_38) {
			this.aClass44_38.method1024();
		}
		local6 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1024();
		}
	}
}
