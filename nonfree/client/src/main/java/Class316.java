import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class316 {

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "Lclient!hm;")
	private Class136 aClass136_95 = new Class136(64);

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_117;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class316(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_117 = arg2;
		if (this.aClass251_117 != null) {
			@Pc(20) int local20 = this.aClass251_117.method5755() - 1;
			this.aClass251_117.method5768(local20);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	public void method6783() {
		@Pc(2) Class136 local2 = this.aClass136_95;
		synchronized (this.aClass136_95) {
			this.aClass136_95.method3476();
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)V")
	public void method6786(@OriginalArg(0) int arg0) {
		@Pc(2) Class136 local2 = this.aClass136_95;
		synchronized (this.aClass136_95) {
			this.aClass136_95.method3470();
			this.aClass136_95 = new Class136(arg0);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	public void method6787() {
		@Pc(8) Class136 local8 = this.aClass136_95;
		synchronized (this.aClass136_95) {
			this.aClass136_95.method3470();
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BI)V")
	public void method6788() {
		@Pc(10) Class136 local10 = this.aClass136_95;
		synchronized (this.aClass136_95) {
			this.aClass136_95.method3474(5);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Lclient!ega;")
	public Class81 method6789(@OriginalArg(1) int arg0) {
		@Pc(11) Class136 local11 = this.aClass136_95;
		@Pc(21) Class81 local21;
		synchronized (this.aClass136_95) {
			local21 = (Class81) this.aClass136_95.method3473((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class251 local34 = this.aClass251_117;
		@Pc(47) byte[] local47;
		synchronized (this.aClass251_117) {
			local47 = this.aClass251_117.method5772(Static146.method2827(arg0), Static479.method6616(arg0));
		}
		local21 = new Class81();
		if (local47 != null) {
			local21.method1996(new Class6_Sub21(local47));
		}
		@Pc(69) Class136 local69 = this.aClass136_95;
		synchronized (this.aClass136_95) {
			this.aClass136_95.method3482((long) arg0, local21);
			return local21;
		}
	}
}
