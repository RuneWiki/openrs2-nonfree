import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class231 {

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!wi;")
	private final Class268 aClass268_53 = new Class268(128);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!uu;")
	private final Class250 aClass250_92;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class231(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_92 = arg2;
		this.aClass250_92.method5815(1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public void method5383() {
		@Pc(12) Class268 local12 = this.aClass268_53;
		synchronized (this.aClass268_53) {
			this.aClass268_53.method6160();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!bh;")
	public Class20 method5384(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_53;
		@Pc(16) Class20 local16;
		synchronized (this.aClass268_53) {
			local16 = (Class20) this.aClass268_53.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_92;
		@Pc(46) byte[] local46;
		synchronized (this.aClass250_92) {
			local46 = this.aClass250_92.method5806(1, arg0);
		}
		local16 = new Class20();
		if (local46 != null) {
			local16.method472(new Class3_Sub25(local46));
		}
		@Pc(68) Class268 local68 = this.aClass268_53;
		synchronized (this.aClass268_53) {
			this.aClass268_53.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public void method5385() {
		@Pc(2) Class268 local2 = this.aClass268_53;
		synchronized (this.aClass268_53) {
			this.aClass268_53.method6173(5);
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public void method5388() {
		@Pc(10) Class268 local10 = this.aClass268_53;
		synchronized (this.aClass268_53) {
			this.aClass268_53.method6168();
		}
	}
}
