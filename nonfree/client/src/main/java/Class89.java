import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class89 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "Lclient!hm;")
	private final Class136 aClass136_30 = new Class136(64);

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_31;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class89(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_31 = arg2;
		if (this.aClass251_31 != null) {
			this.aClass251_31.method5768(35);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)V")
	public void method2567() {
		@Pc(2) Class136 local2 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3474(5);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	public void method2568() {
		@Pc(6) Class136 local6 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3470();
		}
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
	public void method2569() {
		@Pc(6) Class136 local6 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3476();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)Lclient!mba;")
	public Class204 method2570(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_30;
		@Pc(16) Class204 local16;
		synchronized (this.aClass136_30) {
			local16 = (Class204) this.aClass136_30.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_31;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_31) {
			local38 = this.aClass251_31.method5772(arg0, 35);
		}
		local16 = new Class204();
		if (local38 != null) {
			local16.method4803(new Class6_Sub21(local38));
		}
		local16.method4805();
		@Pc(63) Class136 local63 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3482((long) arg0, local16);
			return local16;
		}
	}
}
