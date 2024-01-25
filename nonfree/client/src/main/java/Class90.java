import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class90 {

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "Lclient!ui;")
	private final Class359 aClass359_14 = new Class359(64);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "Lclient!lga;")
	private final Class223 aClass223_27;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class90(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_27 = arg2;
		this.aClass223_27.method5264(31);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V")
	public void method2202() {
		@Pc(7) Class359 local7 = this.aClass359_14;
		synchronized (this.aClass359_14) {
			this.aClass359_14.method8502(5);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
	public void method2203() {
		@Pc(13) Class359 local13 = this.aClass359_14;
		synchronized (this.aClass359_14) {
			this.aClass359_14.method8511();
		}
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)V")
	public void method2205() {
		@Pc(2) Class359 local2 = this.aClass359_14;
		synchronized (this.aClass359_14) {
			this.aClass359_14.method8507();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IB)Lclient!ir;")
	public Class178 method2207(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_14;
		@Pc(16) Class178 local16;
		synchronized (this.aClass359_14) {
			local16 = (Class178) this.aClass359_14.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_27;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_27) {
			local39 = this.aClass223_27.method5267(arg0, 31);
		}
		local16 = new Class178();
		if (local39 != null) {
			local16.method4532(new Class6_Sub15(local39));
		}
		@Pc(63) Class359 local63 = this.aClass359_14;
		synchronized (this.aClass359_14) {
			this.aClass359_14.method8515((long) arg0, local16);
			return local16;
		}
	}
}
