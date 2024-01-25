import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class369 {

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "Lclient!fc;")
	private final Class94 aClass94_67 = new Class94(64);

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Lclient!ni;")
	private final Class223 aClass223_142;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class369(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_142 = arg2;
		if (this.aClass223_142 != null) {
			this.aClass223_142.method5970(11);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
	public void method8521() {
		@Pc(6) Class94 local6 = this.aClass94_67;
		synchronized (this.aClass94_67) {
			this.aClass94_67.method2952();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)Lclient!kc;")
	public Class164 method8523(@OriginalArg(1) int arg0) {
		@Pc(11) Class94 local11 = this.aClass94_67;
		@Pc(21) Class164 local21;
		synchronized (this.aClass94_67) {
			local21 = (Class164) this.aClass94_67.method2960((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class223 local34 = this.aClass223_142;
		@Pc(43) byte[] local43;
		synchronized (this.aClass223_142) {
			local43 = this.aClass223_142.method5954(arg0, 11);
		}
		local21 = new Class164();
		if (local43 != null) {
			local21.method4979(new Class6_Sub8(local43));
		}
		@Pc(65) Class94 local65 = this.aClass94_67;
		synchronized (this.aClass94_67) {
			this.aClass94_67.method2963((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)V")
	public void method8526() {
		@Pc(7) Class94 local7 = this.aClass94_67;
		synchronized (this.aClass94_67) {
			this.aClass94_67.method2958(5);
		}
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
	public void method8527() {
		@Pc(6) Class94 local6 = this.aClass94_67;
		synchronized (this.aClass94_67) {
			this.aClass94_67.method2964();
		}
	}
}
