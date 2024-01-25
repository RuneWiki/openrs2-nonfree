import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class338 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "Lclient!qr;")
	private Class293 aClass293_63 = new Class293(64);

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_127;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class338(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_127 = arg2;
		if (this.aClass384_127 != null) {
			@Pc(20) int local20 = this.aClass384_127.method8865() - 1;
			this.aClass384_127.method8862(local20);
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public void method8028() {
		@Pc(2) Class293 local2 = this.aClass293_63;
		synchronized (this.aClass293_63) {
			this.aClass293_63.method6927();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public void method8029() {
		@Pc(2) Class293 local2 = this.aClass293_63;
		synchronized (this.aClass293_63) {
			this.aClass293_63.method6930();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lclient!pc;")
	public Class267 method8030(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_63;
		@Pc(25) Class267 local25;
		synchronized (this.aClass293_63) {
			local25 = (Class267) this.aClass293_63.method6921((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class384 local38 = this.aClass384_127;
		@Pc(51) byte[] local51;
		synchronized (this.aClass384_127) {
			local51 = this.aClass384_127.method8885(Static280.method4192(arg0), Static85.method1341(arg0));
		}
		local25 = new Class267();
		if (local51 != null) {
			local25.method6387(new Class5_Sub12(local51));
		}
		local6 = this.aClass293_63;
		synchronized (this.aClass293_63) {
			this.aClass293_63.method6925((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V")
	public void method8031() {
		@Pc(6) Class293 local6 = this.aClass293_63;
		synchronized (this.aClass293_63) {
			this.aClass293_63.method6922(5);
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
	public void method8032(@OriginalArg(0) int arg0) {
		@Pc(9) Class293 local9 = this.aClass293_63;
		synchronized (this.aClass293_63) {
			this.aClass293_63.method6930();
			this.aClass293_63 = new Class293(arg0);
		}
	}
}
