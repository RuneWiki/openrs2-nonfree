import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class263 {

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!hn;")
	private Class102 aClass102_59 = new Class102(64);

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!hn;")
	public Class102 aClass102_60 = new Class102(64);

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!fo;")
	public final Class82 aClass82_103;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!fo;")
	private final Class82 aClass82_102;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;Lclient!fo;)V")
	public Class263(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3) {
		this.aClass82_103 = arg3;
		this.aClass82_102 = arg2;
		this.aClass82_102.method1823(34);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	public void method5829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass102_59 = new Class102(arg1);
		this.aClass102_60 = new Class102(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public void method5832() {
		@Pc(11) Class102 local11 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2262(5);
		}
		local11 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2262(5);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public void method5834() {
		@Pc(2) Class102 local2 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2260();
		}
		local2 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2260();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lclient!qp;")
	public Class204 method5835(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_59;
		@Pc(16) Class204 local16;
		synchronized (this.aClass102_59) {
			local16 = (Class204) this.aClass102_59.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_102;
		@Pc(38) byte[] local38;
		synchronized (this.aClass82_102) {
			local38 = this.aClass82_102.method1817(34, arg0);
		}
		local16 = new Class204();
		local16.aClass263_3 = this;
		if (local38 != null) {
			local16.method4498(new Class1_Sub28(local38));
		}
		@Pc(71) Class102 local71 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method5836() {
		@Pc(6) Class102 local6 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2271();
		}
		local6 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2271();
		}
	}
}
