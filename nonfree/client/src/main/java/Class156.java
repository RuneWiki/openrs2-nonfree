import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class156 {

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!jk;")
	private Class137 aClass137_42 = new Class137(64);

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!qn;")
	private final Class211 aClass211_59;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class156(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_59 = arg2;
		if (this.aClass211_59 != null) {
			@Pc(20) int local20 = this.aClass211_59.method4368() - 1;
			this.aClass211_59.method4365(local20);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3014() {
		@Pc(2) Class137 local2 = this.aClass137_42;
		synchronized (this.aClass137_42) {
			this.aClass137_42.method2737();
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method3015() {
		@Pc(2) Class137 local2 = this.aClass137_42;
		synchronized (this.aClass137_42) {
			this.aClass137_42.method2739();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V")
	public void method3016() {
		@Pc(14) Class137 local14 = this.aClass137_42;
		synchronized (this.aClass137_42) {
			this.aClass137_42.method2745(5);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lclient!gr;")
	public Class102 method3019(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_42;
		@Pc(18) Class102 local18;
		synchronized (this.aClass137_42) {
			local18 = (Class102) this.aClass137_42.method2744((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class211 local31 = this.aClass211_59;
		@Pc(46) byte[] local46;
		synchronized (this.aClass211_59) {
			local46 = this.aClass211_59.method4377(Static104.method1546(arg0), Static425.method5720(arg0));
		}
		local18 = new Class102();
		if (local46 != null) {
			local18.method1974(new Class4_Sub9(local46));
		}
		@Pc(68) Class137 local68 = this.aClass137_42;
		synchronized (this.aClass137_42) {
			this.aClass137_42.method2732((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
	public void method3021(@OriginalArg(1) int arg0) {
		@Pc(10) Class137 local10 = this.aClass137_42;
		synchronized (this.aClass137_42) {
			this.aClass137_42.method2739();
			this.aClass137_42 = new Class137(arg0);
		}
	}
}
