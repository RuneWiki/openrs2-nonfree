import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class255 {

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "Lclient!ui;")
	private final Class359 aClass359_51 = new Class359(128);

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Lclient!lga;")
	private final Class223 aClass223_86;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class255(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_86 = arg2;
		this.aClass223_86.method5264(1);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V")
	public void method6209() {
		@Pc(6) Class359 local6 = this.aClass359_51;
		synchronized (this.aClass359_51) {
			this.aClass359_51.method8511();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)V")
	public void method6210() {
		@Pc(6) Class359 local6 = this.aClass359_51;
		synchronized (this.aClass359_51) {
			this.aClass359_51.method8502(5);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public void method6213() {
		@Pc(9) Class359 local9 = this.aClass359_51;
		synchronized (this.aClass359_51) {
			this.aClass359_51.method8507();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)Lclient!fn;")
	public Class117 method6216(@OriginalArg(1) int arg0) {
		@Pc(14) Class359 local14 = this.aClass359_51;
		@Pc(24) Class117 local24;
		synchronized (this.aClass359_51) {
			local24 = (Class117) this.aClass359_51.method8517((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class223 local38 = this.aClass223_86;
		@Pc(47) byte[] local47;
		synchronized (this.aClass223_86) {
			local47 = this.aClass223_86.method5267(arg0, 1);
		}
		local24 = new Class117();
		if (local47 != null) {
			local24.method3310(new Class6_Sub15(local47));
		}
		@Pc(71) Class359 local71 = this.aClass359_51;
		synchronized (this.aClass359_51) {
			this.aClass359_51.method8515((long) arg0, local24);
			return local24;
		}
	}
}
