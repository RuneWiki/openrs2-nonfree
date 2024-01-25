import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class309 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!vh;")
	private final Class330 aClass330_61 = new Class330(64);

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!pj;")
	private final Class248 aClass248_100;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class309(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_100 = arg2;
		if (this.aClass248_100 != null) {
			this.aClass248_100.method5793(35);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lclient!dv;")
	public Class80 method6959(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_61;
		@Pc(16) Class80 local16;
		synchronized (this.aClass330_61) {
			local16 = (Class80) this.aClass330_61.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_100;
		@Pc(38) byte[] local38;
		synchronized (this.aClass248_100) {
			local38 = this.aClass248_100.method5797(35, arg0);
		}
		local16 = new Class80();
		if (local38 != null) {
			local16.method1710(new Class6_Sub12(local38));
		}
		local16.method1711();
		@Pc(63) Class330 local63 = this.aClass330_61;
		synchronized (this.aClass330_61) {
			this.aClass330_61.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public void method6960() {
		@Pc(2) Class330 local2 = this.aClass330_61;
		synchronized (this.aClass330_61) {
			this.aClass330_61.method7678();
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	public void method6961() {
		@Pc(2) Class330 local2 = this.aClass330_61;
		synchronized (this.aClass330_61) {
			this.aClass330_61.method7680(5);
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V")
	public void method6963() {
		@Pc(2) Class330 local2 = this.aClass330_61;
		synchronized (this.aClass330_61) {
			this.aClass330_61.method7688();
		}
	}
}
