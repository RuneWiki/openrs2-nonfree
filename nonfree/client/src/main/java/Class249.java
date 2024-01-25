import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class249 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!d;")
	private final Class44 aClass44_68 = new Class44(64);

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!um;")
	private final Class243 aClass243_241;

	static {
		new Class198("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class249(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_241 = arg2;
		if (this.aClass243_241 != null) {
			this.aClass243_241.method5472(35);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
	public void method5642() {
		@Pc(2) Class44 local2 = this.aClass44_68;
		synchronized (this.aClass44_68) {
			this.aClass44_68.method1025(5);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public void method5645() {
		@Pc(2) Class44 local2 = this.aClass44_68;
		synchronized (this.aClass44_68) {
			this.aClass44_68.method1024();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method5646() {
		@Pc(10) Class44 local10 = this.aClass44_68;
		synchronized (this.aClass44_68) {
			this.aClass44_68.method1031();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Lclient!kk;")
	public Class138 method5647(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_68;
		@Pc(22) Class138 local22;
		synchronized (this.aClass44_68) {
			local22 = (Class138) this.aClass44_68.method1028((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class243 local35 = this.aClass243_241;
		@Pc(44) byte[] local44;
		synchronized (this.aClass243_241) {
			local44 = this.aClass243_241.method5455(arg0, 35);
		}
		local22 = new Class138();
		if (local44 != null) {
			local22.method2894(new Class5_Sub15(local44));
		}
		local22.method2893();
		@Pc(69) Class44 local69 = this.aClass44_68;
		synchronized (this.aClass44_68) {
			this.aClass44_68.method1017((long) arg0, local22);
			return local22;
		}
	}
}
