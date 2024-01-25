import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class260 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!lh;")
	private Class151 aClass151_184 = new Class151(64);

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!hh;")
	private final Class109 aClass109_99;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class260(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_99 = arg2;
		if (this.aClass109_99 != null) {
			@Pc(20) int local20 = this.aClass109_99.method2324() - 1;
			this.aClass109_99.method2322(local20);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public void method5909(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_184;
		synchronized (this.aClass151_184) {
			this.aClass151_184.method3298();
			this.aClass151_184 = new Class151(arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
	public void method5911() {
		@Pc(6) Class151 local6 = this.aClass151_184;
		synchronized (this.aClass151_184) {
			this.aClass151_184.method3297(5);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method5912() {
		@Pc(2) Class151 local2 = this.aClass151_184;
		synchronized (this.aClass151_184) {
			this.aClass151_184.method3298();
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public void method5914() {
		@Pc(6) Class151 local6 = this.aClass151_184;
		synchronized (this.aClass151_184) {
			this.aClass151_184.method3299();
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Lclient!oi;")
	public Class183 method5916(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_184;
		@Pc(16) Class183 local16;
		synchronized (this.aClass151_184) {
			local16 = (Class183) this.aClass151_184.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass109_99.method2349(Static194.method5866(arg0), Static75.method1127(arg0));
		local16 = new Class183();
		if (local45 != null) {
			local16.method3911(new Class1_Sub14(local45));
		}
		@Pc(61) Class151 local61 = this.aClass151_184;
		synchronized (this.aClass151_184) {
			this.aClass151_184.method3291((long) arg0, local16);
			return local16;
		}
	}
}
