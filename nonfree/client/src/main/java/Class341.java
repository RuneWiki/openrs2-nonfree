import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class341 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!fc;")
	private Class94 aClass94_59 = new Class94(64);

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!fc;")
	public Class94 aClass94_60 = new Class94(64);

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!ni;")
	private final Class223 aClass223_134;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!ni;")
	public final Class223 aClass223_133;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;)V")
	public Class341(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_134 = arg2;
		this.aClass223_133 = arg3;
		this.aClass223_134.method5970(34);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Lclient!an;")
	public Class17 method7998(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_59;
		@Pc(16) Class17 local16;
		synchronized (this.aClass94_59) {
			local16 = (Class17) this.aClass94_59.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class223 local37 = this.aClass223_134;
		@Pc(46) byte[] local46;
		synchronized (this.aClass223_134) {
			local46 = this.aClass223_134.method5954(arg0, 34);
		}
		local16 = new Class17();
		local16.aClass341_1 = this;
		if (local46 != null) {
			local16.method607(new Class6_Sub8(local46));
		}
		@Pc(71) Class94 local71 = this.aClass94_59;
		synchronized (this.aClass94_59) {
			this.aClass94_59.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public void method7999() {
		@Pc(2) Class94 local2 = this.aClass94_59;
		synchronized (this.aClass94_59) {
			this.aClass94_59.method2958(5);
		}
		local2 = this.aClass94_60;
		synchronized (this.aClass94_60) {
			this.aClass94_60.method2958(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public void method8000() {
		@Pc(2) Class94 local2 = this.aClass94_59;
		synchronized (this.aClass94_59) {
			this.aClass94_59.method2964();
		}
		local2 = this.aClass94_60;
		synchronized (this.aClass94_60) {
			this.aClass94_60.method2964();
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public void method8002() {
		@Pc(2) Class94 local2 = this.aClass94_59;
		synchronized (this.aClass94_59) {
			this.aClass94_59.method2952();
		}
		local2 = this.aClass94_60;
		synchronized (this.aClass94_60) {
			this.aClass94_60.method2952();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public void method8003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass94_59 = new Class94(arg0);
		this.aClass94_60 = new Class94(arg1);
	}
}
