import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class199 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Lclient!jda;")
	private final Class165 aClass165_39 = new Class165(64);

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "Lclient!aj;")
	private final Class15 aClass15_89;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class199(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_89 = arg2;
		if (this.aClass15_89 != null) {
			this.aClass15_89.method512(54);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)Lclient!caa;")
	public Class47 method5028(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_39;
		@Pc(16) Class47 local16;
		synchronized (this.aClass165_39) {
			local16 = (Class47) this.aClass165_39.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_89;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_89) {
			local38 = this.aClass15_89.method517(arg0, 54);
		}
		local16 = new Class47();
		if (local38 != null) {
			local16.method1274(new Class3_Sub25(local38));
		}
		@Pc(60) Class165 local60 = this.aClass165_39;
		synchronized (this.aClass165_39) {
			this.aClass165_39.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	public void method5030() {
		@Pc(6) Class165 local6 = this.aClass165_39;
		synchronized (this.aClass165_39) {
			this.aClass165_39.method4403();
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public void method5031() {
		@Pc(8) Class165 local8 = this.aClass165_39;
		synchronized (this.aClass165_39) {
			this.aClass165_39.method4400();
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI)V")
	public void method5032() {
		@Pc(2) Class165 local2 = this.aClass165_39;
		synchronized (this.aClass165_39) {
			this.aClass165_39.method4394(5);
		}
	}
}
