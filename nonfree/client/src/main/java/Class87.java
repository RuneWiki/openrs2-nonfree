import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class87 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!wi;")
	private final Class268 aClass268_22 = new Class268(64);

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!uu;")
	private final Class250 aClass250_40;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class87(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_40 = arg2;
		this.aClass250_40.method5815(31);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lclient!sq;")
	public Class228 method2045(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_22;
		@Pc(16) Class228 local16;
		synchronized (this.aClass268_22) {
			local16 = (Class228) this.aClass268_22.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class250 local37 = this.aClass250_40;
		@Pc(46) byte[] local46;
		synchronized (this.aClass250_40) {
			local46 = this.aClass250_40.method5806(31, arg0);
		}
		local16 = new Class228();
		if (local46 != null) {
			local16.method5287(new Class3_Sub25(local46));
		}
		@Pc(68) Class268 local68 = this.aClass268_22;
		synchronized (this.aClass268_22) {
			this.aClass268_22.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public void method2046() {
		@Pc(2) Class268 local2 = this.aClass268_22;
		synchronized (this.aClass268_22) {
			this.aClass268_22.method6168();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public void method2047() {
		@Pc(6) Class268 local6 = this.aClass268_22;
		synchronized (this.aClass268_22) {
			this.aClass268_22.method6160();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
	public void method2049() {
		@Pc(2) Class268 local2 = this.aClass268_22;
		synchronized (this.aClass268_22) {
			this.aClass268_22.method6173(5);
		}
	}
}
