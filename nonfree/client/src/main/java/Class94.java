import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class94 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!jk;")
	private final Class137 aClass137_18 = new Class137(64);

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!qn;")
	private final Class211 aClass211_34;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class94(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_34 = arg2;
		if (this.aClass211_34 != null) {
			this.aClass211_34.method4365(35);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lclient!fl;")
	public Class82 method1763(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_18;
		@Pc(16) Class82 local16;
		synchronized (this.aClass137_18) {
			local16 = (Class82) this.aClass137_18.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_34;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_34) {
			local38 = this.aClass211_34.method4377(35, arg0);
		}
		local16 = new Class82();
		if (local38 != null) {
			local16.method1673(new Class4_Sub9(local38));
		}
		local16.method1675();
		@Pc(71) Class137 local71 = this.aClass137_18;
		synchronized (this.aClass137_18) {
			this.aClass137_18.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public void method1769() {
		@Pc(6) Class137 local6 = this.aClass137_18;
		synchronized (this.aClass137_18) {
			this.aClass137_18.method2739();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	public void method1770() {
		@Pc(6) Class137 local6 = this.aClass137_18;
		synchronized (this.aClass137_18) {
			this.aClass137_18.method2737();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public void method1771() {
		@Pc(2) Class137 local2 = this.aClass137_18;
		synchronized (this.aClass137_18) {
			this.aClass137_18.method2745(5);
		}
	}
}
