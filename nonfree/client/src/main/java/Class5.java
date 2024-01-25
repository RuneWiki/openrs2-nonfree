import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!jk;")
	private final Class137 aClass137_2 = new Class137(64);

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!jk;")
	public final Class137 aClass137_3 = new Class137(2);

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!qn;")
	private final Class211 aClass211_4;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!qn;")
	public final Class211 aClass211_3;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;Lclient!qn;)V")
	public Class5(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_4 = arg2;
		this.aClass211_3 = arg3;
		this.aClass211_4.method4365(33);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)Lclient!qs;")
	public Class214 method75(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_2;
		@Pc(16) Class214 local16;
		synchronized (this.aClass137_2) {
			local16 = (Class214) this.aClass137_2.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_4;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_4) {
			local38 = this.aClass211_4.method4377(33, arg0);
		}
		local16 = new Class214();
		local16.aClass5_1 = this;
		if (local38 != null) {
			local16.method4430(new Class4_Sub9(local38));
		}
		@Pc(68) Class137 local68 = this.aClass137_2;
		synchronized (this.aClass137_2) {
			this.aClass137_2.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public void method76() {
		@Pc(6) Class137 local6 = this.aClass137_2;
		synchronized (this.aClass137_2) {
			this.aClass137_2.method2737();
		}
		local6 = this.aClass137_3;
		synchronized (this.aClass137_3) {
			this.aClass137_3.method2737();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method77() {
		@Pc(6) Class137 local6 = this.aClass137_2;
		synchronized (this.aClass137_2) {
			this.aClass137_2.method2739();
		}
		local6 = this.aClass137_3;
		synchronized (this.aClass137_3) {
			this.aClass137_3.method2739();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public void method79() {
		@Pc(6) Class137 local6 = this.aClass137_2;
		synchronized (this.aClass137_2) {
			this.aClass137_2.method2745(5);
		}
		local6 = this.aClass137_3;
		synchronized (this.aClass137_3) {
			this.aClass137_3.method2745(5);
		}
	}
}
