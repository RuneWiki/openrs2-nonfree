import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class137 {

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "Lclient!fc;")
	public final Class94 aClass94_19 = new Class94(20);

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Lclient!fc;")
	private final Class94 aClass94_20 = new Class94(64);

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_54;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!ni;")
	public final Class223 aClass223_55;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;)V")
	public Class137(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_54 = arg2;
		this.aClass223_55 = arg3;
		this.aClass223_54.method5970(46);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)V")
	public void method4133() {
		@Pc(2) Class94 local2 = this.aClass94_20;
		synchronized (this.aClass94_20) {
			this.aClass94_20.method2958(5);
		}
		local2 = this.aClass94_19;
		synchronized (this.aClass94_19) {
			this.aClass94_19.method2958(5);
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
	public void method4135() {
		@Pc(2) Class94 local2 = this.aClass94_20;
		synchronized (this.aClass94_20) {
			this.aClass94_20.method2964();
		}
		local2 = this.aClass94_19;
		synchronized (this.aClass94_19) {
			this.aClass94_19.method2964();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lclient!fj;")
	public Class102 method4136(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_20;
		@Pc(24) Class102 local24;
		synchronized (this.aClass94_20) {
			local24 = (Class102) this.aClass94_20.method2960((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class223 local37 = this.aClass223_54;
		@Pc(46) byte[] local46;
		synchronized (this.aClass223_54) {
			local46 = this.aClass223_54.method5954(arg0, 46);
		}
		local24 = new Class102();
		local24.aClass137_1 = this;
		if (local46 != null) {
			local24.method3120(new Class6_Sub8(local46));
		}
		@Pc(71) Class94 local71 = this.aClass94_20;
		synchronized (this.aClass94_20) {
			this.aClass94_20.method2963((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
	public void method4139() {
		@Pc(6) Class94 local6 = this.aClass94_20;
		synchronized (this.aClass94_20) {
			this.aClass94_20.method2952();
		}
		local6 = this.aClass94_19;
		synchronized (this.aClass94_19) {
			this.aClass94_19.method2952();
		}
	}
}
