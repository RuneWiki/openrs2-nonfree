import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class133 {

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Lclient!qr;")
	private final Class293 aClass293_22 = new Class293(256);

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_48;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class133(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_48 = arg2;
		this.aClass384_48.method8862(26);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public void method3124() {
		@Pc(2) Class293 local2 = this.aClass293_22;
		synchronized (this.aClass293_22) {
			this.aClass293_22.method6927();
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method3125() {
		@Pc(2) Class293 local2 = this.aClass293_22;
		synchronized (this.aClass293_22) {
			this.aClass293_22.method6930();
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)Lclient!gia;")
	public Class5_Sub4_Sub8 method3127(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_22;
		@Pc(24) Class5_Sub4_Sub8 local24;
		synchronized (this.aClass293_22) {
			local24 = (Class5_Sub4_Sub8) this.aClass293_22.method6921((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class384 local37 = this.aClass384_48;
		@Pc(46) byte[] local46;
		synchronized (this.aClass384_48) {
			local46 = this.aClass384_48.method8885(26, arg0);
		}
		local24 = new Class5_Sub4_Sub8();
		if (local46 != null) {
			local24.method2971(new Class5_Sub12(local46));
		}
		@Pc(68) Class293 local68 = this.aClass293_22;
		synchronized (this.aClass293_22) {
			this.aClass293_22.method6925((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public void method3128() {
		@Pc(10) Class293 local10 = this.aClass293_22;
		synchronized (this.aClass293_22) {
			this.aClass293_22.method6922(5);
		}
	}
}
