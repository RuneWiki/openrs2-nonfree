import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class12 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!vh;")
	private final Class330 aClass330_4 = new Class330(64);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!pj;")
	private final Class248 aClass248_2;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class12(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_2 = arg2;
		this.aClass248_2.method5793(32);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public void method197() {
		@Pc(2) Class330 local2 = this.aClass330_4;
		synchronized (this.aClass330_4) {
			this.aClass330_4.method7688();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lclient!jg;")
	public Class154 method198(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_4;
		@Pc(16) Class154 local16;
		synchronized (this.aClass330_4) {
			local16 = (Class154) this.aClass330_4.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_2;
		@Pc(38) byte[] local38;
		synchronized (this.aClass248_2) {
			local38 = this.aClass248_2.method5797(32, arg0);
		}
		local16 = new Class154();
		if (local38 != null) {
			local16.method3829(new Class6_Sub12(local38));
		}
		@Pc(60) Class330 local60 = this.aClass330_4;
		synchronized (this.aClass330_4) {
			this.aClass330_4.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public void method199() {
		@Pc(12) Class330 local12 = this.aClass330_4;
		synchronized (this.aClass330_4) {
			this.aClass330_4.method7678();
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)V")
	public void method200() {
		@Pc(6) Class330 local6 = this.aClass330_4;
		synchronized (this.aClass330_4) {
			this.aClass330_4.method7680(5);
		}
	}
}
