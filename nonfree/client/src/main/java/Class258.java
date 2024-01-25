import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class258 {

	@OriginalMember(owner = "client!oha", name = "i", descriptor = "Lclient!qr;")
	private final Class293 aClass293_45 = new Class293(64);

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "Lclient!wu;")
	private final Class384 aClass384_101;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class258(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_101 = arg2;
		if (this.aClass384_101 != null) {
			this.aClass384_101.method8862(11);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)V")
	public void method6201() {
		@Pc(6) Class293 local6 = this.aClass293_45;
		synchronized (this.aClass293_45) {
			this.aClass293_45.method6922(5);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)Lclient!mia;")
	public Class230 method6202(@OriginalArg(1) int arg0) {
		@Pc(14) Class293 local14 = this.aClass293_45;
		@Pc(24) Class230 local24;
		synchronized (this.aClass293_45) {
			local24 = (Class230) this.aClass293_45.method6921((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class384 local37 = this.aClass384_101;
		@Pc(46) byte[] local46;
		synchronized (this.aClass384_101) {
			local46 = this.aClass384_101.method8885(11, arg0);
		}
		local24 = new Class230();
		if (local46 != null) {
			local24.method5602(new Class5_Sub12(local46));
		}
		@Pc(68) Class293 local68 = this.aClass293_45;
		synchronized (this.aClass293_45) {
			this.aClass293_45.method6925((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public void method6203() {
		@Pc(7) Class293 local7 = this.aClass293_45;
		synchronized (this.aClass293_45) {
			this.aClass293_45.method6927();
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public void method6204() {
		@Pc(2) Class293 local2 = this.aClass293_45;
		synchronized (this.aClass293_45) {
			this.aClass293_45.method6930();
		}
	}
}
