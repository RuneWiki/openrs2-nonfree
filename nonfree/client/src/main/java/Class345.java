import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class345 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!fc;")
	private Class94 aClass94_63 = new Class94(128);

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!fc;")
	public Class94 aClass94_64 = new Class94(64);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Lclient!ni;")
	public final Class223 aClass223_136;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_137;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;)V")
	public Class345(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_136 = arg3;
		this.aClass223_137 = arg2;
		this.aClass223_137.method5970(36);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
	public void method8043() {
		@Pc(7) Class94 local7 = this.aClass94_63;
		synchronized (this.aClass94_63) {
			this.aClass94_63.method2958(5);
		}
		local7 = this.aClass94_64;
		synchronized (this.aClass94_64) {
			this.aClass94_64.method2958(5);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Lclient!bq;")
	public Class36 method8044(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_63;
		@Pc(16) Class36 local16;
		synchronized (this.aClass94_63) {
			local16 = (Class36) this.aClass94_63.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class223 local37 = this.aClass223_137;
		@Pc(46) byte[] local46;
		synchronized (this.aClass223_137) {
			local46 = this.aClass223_137.method5954(arg0, 36);
		}
		local16 = new Class36();
		local16.anInt1742 = arg0;
		local16.aClass345_1 = this;
		if (local46 != null) {
			local16.method1629(new Class6_Sub8(local46));
		}
		local16.method1630();
		@Pc(77) Class94 local77 = this.aClass94_63;
		synchronized (this.aClass94_63) {
			this.aClass94_63.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public void method8045() {
		@Pc(2) Class94 local2 = this.aClass94_63;
		synchronized (this.aClass94_63) {
			this.aClass94_63.method2952();
		}
		local2 = this.aClass94_64;
		synchronized (this.aClass94_64) {
			this.aClass94_64.method2952();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
	public void method8046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass94_63 = new Class94(arg1);
		this.aClass94_64 = new Class94(arg0);
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	public void method8050() {
		@Pc(2) Class94 local2 = this.aClass94_63;
		synchronized (this.aClass94_63) {
			this.aClass94_63.method2964();
		}
		local2 = this.aClass94_64;
		synchronized (this.aClass94_64) {
			this.aClass94_64.method2964();
		}
	}
}
