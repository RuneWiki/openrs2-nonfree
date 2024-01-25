import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class206 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!wi;")
	private final Class268 aClass268_50 = new Class268(64);

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!uu;")
	private final Class250 aClass250_87;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class206(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_87 = arg2;
		if (this.aClass250_87 != null) {
			this.aClass250_87.method5815(35);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public void method4881() {
		@Pc(2) Class268 local2 = this.aClass268_50;
		synchronized (this.aClass268_50) {
			this.aClass268_50.method6173(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lclient!jb;")
	public Class115 method4882(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_50;
		@Pc(23) Class115 local23;
		synchronized (this.aClass268_50) {
			local23 = (Class115) this.aClass268_50.method6166((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class250 local36 = this.aClass250_87;
		@Pc(45) byte[] local45;
		synchronized (this.aClass250_87) {
			local45 = this.aClass250_87.method5806(35, arg0);
		}
		local23 = new Class115();
		if (local45 != null) {
			local23.method2910(new Class3_Sub25(local45));
		}
		local23.method2908();
		@Pc(70) Class268 local70 = this.aClass268_50;
		synchronized (this.aClass268_50) {
			this.aClass268_50.method6164(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method4883() {
		@Pc(11) Class268 local11 = this.aClass268_50;
		synchronized (this.aClass268_50) {
			this.aClass268_50.method6168();
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public void method4885() {
		@Pc(6) Class268 local6 = this.aClass268_50;
		synchronized (this.aClass268_50) {
			this.aClass268_50.method6160();
		}
	}
}
