import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class214 {

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!fc;")
	private Class94 aClass94_31 = new Class94(64);

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!ni;")
	private final Class223 aClass223_76;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class214(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_76 = arg2;
		if (this.aClass223_76 != null) {
			@Pc(20) int local20 = this.aClass223_76.method5961() - 1;
			this.aClass223_76.method5970(local20);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
	public void method5869(@OriginalArg(0) int arg0) {
		@Pc(12) Class94 local12 = this.aClass94_31;
		synchronized (this.aClass94_31) {
			this.aClass94_31.method2952();
			this.aClass94_31 = new Class94(arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)Lclient!wc;")
	public Class370 method5870(@OriginalArg(0) int arg0) {
		@Pc(11) Class94 local11 = this.aClass94_31;
		@Pc(21) Class370 local21;
		synchronized (this.aClass94_31) {
			local21 = (Class370) this.aClass94_31.method2960((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class223 local34 = this.aClass223_76;
		@Pc(47) byte[] local47;
		synchronized (this.aClass223_76) {
			local47 = this.aClass223_76.method5954(Static67.method2008(arg0), Static415.method6494(arg0));
		}
		local21 = new Class370();
		if (local47 != null) {
			local21.method8528(new Class6_Sub8(local47));
		}
		@Pc(69) Class94 local69 = this.aClass94_31;
		synchronized (this.aClass94_31) {
			this.aClass94_31.method2963((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	public void method5871() {
		@Pc(10) Class94 local10 = this.aClass94_31;
		synchronized (this.aClass94_31) {
			this.aClass94_31.method2958(5);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method5873() {
		@Pc(6) Class94 local6 = this.aClass94_31;
		synchronized (this.aClass94_31) {
			this.aClass94_31.method2964();
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public void method5874() {
		@Pc(6) Class94 local6 = this.aClass94_31;
		synchronized (this.aClass94_31) {
			this.aClass94_31.method2952();
		}
	}
}
