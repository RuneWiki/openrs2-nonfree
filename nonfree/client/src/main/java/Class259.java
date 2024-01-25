import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class259 {

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "Lclient!vh;")
	private final Class330 aClass330_50 = new Class330(64);

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "Lclient!pj;")
	private final Class248 aClass248_78;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class259(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_78 = arg2;
		if (this.aClass248_78 != null) {
			this.aClass248_78.method5793(11);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	public void method5912() {
		@Pc(6) Class330 local6 = this.aClass330_50;
		synchronized (this.aClass330_50) {
			this.aClass330_50.method7678();
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BI)Lclient!wl;")
	public Class348 method5915(@OriginalArg(1) int arg0) {
		@Pc(11) Class330 local11 = this.aClass330_50;
		@Pc(21) Class348 local21;
		synchronized (this.aClass330_50) {
			local21 = (Class348) this.aClass330_50.method7677((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class248 local34 = this.aClass248_78;
		@Pc(45) byte[] local45;
		synchronized (this.aClass248_78) {
			local45 = this.aClass248_78.method5797(11, arg0);
		}
		local21 = new Class348();
		if (local45 != null) {
			local21.method7863(new Class6_Sub12(local45));
		}
		@Pc(67) Class330 local67 = this.aClass330_50;
		synchronized (this.aClass330_50) {
			this.aClass330_50.method7676(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)V")
	public void method5916() {
		@Pc(2) Class330 local2 = this.aClass330_50;
		synchronized (this.aClass330_50) {
			this.aClass330_50.method7680(5);
		}
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
	public void method5918() {
		@Pc(6) Class330 local6 = this.aClass330_50;
		synchronized (this.aClass330_50) {
			this.aClass330_50.method7688();
		}
	}
}
