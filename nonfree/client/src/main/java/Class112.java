import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class112 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Lclient!wi;")
	private Class268 aClass268_27 = new Class268(64);

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!uu;")
	private final Class250 aClass250_54;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class112(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_54 = arg2;
		if (this.aClass250_54 != null) {
			@Pc(20) int local20 = this.aClass250_54.method5819() - 1;
			this.aClass250_54.method5815(local20);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)V")
	public void method2858(@OriginalArg(0) int arg0) {
		@Pc(2) Class268 local2 = this.aClass268_27;
		synchronized (this.aClass268_27) {
			this.aClass268_27.method6160();
			this.aClass268_27 = new Class268(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public void method2860() {
		@Pc(6) Class268 local6 = this.aClass268_27;
		synchronized (this.aClass268_27) {
			this.aClass268_27.method6168();
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
	public void method2861() {
		@Pc(11) Class268 local11 = this.aClass268_27;
		synchronized (this.aClass268_27) {
			this.aClass268_27.method6173(5);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)Lclient!sj;")
	public Class223 method2863(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_27;
		@Pc(16) Class223 local16;
		synchronized (this.aClass268_27) {
			local16 = (Class223) this.aClass268_27.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_54;
		@Pc(42) byte[] local42;
		synchronized (this.aClass250_54) {
			local42 = this.aClass250_54.method5806(Static208.method3161(arg0), Static341.method4767(arg0));
		}
		local16 = new Class223();
		if (local42 != null) {
			local16.method5214(new Class3_Sub25(local42));
		}
		@Pc(69) Class268 local69 = this.aClass268_27;
		synchronized (this.aClass268_27) {
			this.aClass268_27.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public void method2865() {
		@Pc(2) Class268 local2 = this.aClass268_27;
		synchronized (this.aClass268_27) {
			this.aClass268_27.method6160();
		}
	}
}
