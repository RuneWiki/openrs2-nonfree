import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class101 {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Lclient!jk;")
	private final Class137 aClass137_22 = new Class137(64);

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!qn;")
	private final Class211 aClass211_37;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "Lclient!qn;")
	public final Class211 aClass211_38;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;Lclient!qn;)V")
	public Class101(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_37 = arg2;
		this.aClass211_38 = arg3;
		this.aClass211_37.method4365(3);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public void method1964() {
		@Pc(6) Class137 local6 = this.aClass137_22;
		synchronized (this.aClass137_22) {
			this.aClass137_22.method2739();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)Lclient!bn;")
	public Class27 method1965(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_22;
		@Pc(16) Class27 local16;
		synchronized (this.aClass137_22) {
			local16 = (Class27) this.aClass137_22.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class211 local37 = this.aClass211_37;
		@Pc(46) byte[] local46;
		synchronized (this.aClass211_37) {
			local46 = this.aClass211_37.method4377(3, arg0);
		}
		local16 = new Class27();
		local16.aClass101_1 = this;
		if (local46 != null) {
			local16.method472(new Class4_Sub9(local46));
		}
		@Pc(71) Class137 local71 = this.aClass137_22;
		synchronized (this.aClass137_22) {
			this.aClass137_22.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public void method1967() {
		@Pc(6) Class137 local6 = this.aClass137_22;
		synchronized (this.aClass137_22) {
			this.aClass137_22.method2737();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public void method1969() {
		@Pc(2) Class137 local2 = this.aClass137_22;
		synchronized (this.aClass137_22) {
			this.aClass137_22.method2745(5);
		}
	}
}
