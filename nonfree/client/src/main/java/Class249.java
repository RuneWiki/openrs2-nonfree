import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class249 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Lclient!vh;")
	private final Class330 aClass330_47 = new Class330(64);

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Lclient!vh;")
	public final Class330 aClass330_48 = new Class330(2);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!pj;")
	public final Class248 aClass248_71;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!pj;")
	private final Class248 aClass248_72;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;Lclient!pj;)V")
	public Class249(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3) {
		this.aClass248_71 = arg3;
		this.aClass248_72 = arg2;
		this.aClass248_72.method5793(33);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public void method5805() {
		@Pc(2) Class330 local2 = this.aClass330_47;
		synchronized (this.aClass330_47) {
			this.aClass330_47.method7688();
		}
		local2 = this.aClass330_48;
		synchronized (this.aClass330_48) {
			this.aClass330_48.method7688();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	public void method5808() {
		@Pc(6) Class330 local6 = this.aClass330_47;
		synchronized (this.aClass330_47) {
			this.aClass330_47.method7680(5);
		}
		local6 = this.aClass330_48;
		synchronized (this.aClass330_48) {
			this.aClass330_48.method7680(5);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lclient!bk;")
	public Class35 method5809(@OriginalArg(0) int arg0) {
		@Pc(14) Class330 local14 = this.aClass330_47;
		@Pc(24) Class35 local24;
		synchronized (this.aClass330_47) {
			local24 = (Class35) this.aClass330_47.method7677((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class248 local37 = this.aClass248_72;
		@Pc(46) byte[] local46;
		synchronized (this.aClass248_72) {
			local46 = this.aClass248_72.method5797(33, arg0);
		}
		local24 = new Class35();
		local24.aClass249_1 = this;
		if (local46 != null) {
			local24.method725(new Class6_Sub12(local46));
		}
		@Pc(71) Class330 local71 = this.aClass330_47;
		synchronized (this.aClass330_47) {
			this.aClass330_47.method7676(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	public void method5810() {
		@Pc(2) Class330 local2 = this.aClass330_47;
		synchronized (this.aClass330_47) {
			this.aClass330_47.method7678();
		}
		local2 = this.aClass330_48;
		synchronized (this.aClass330_48) {
			this.aClass330_48.method7678();
		}
	}
}
