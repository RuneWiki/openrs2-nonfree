import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class172 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!wi;")
	private final Class268 aClass268_41 = new Class268(16);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!uu;")
	private final Class250 aClass250_71;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class172(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_71 = arg2;
		this.aClass250_71.method5815(30);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)Lclient!ed;")
	public Class56 method4192(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_41;
		@Pc(16) Class56 local16;
		synchronized (this.aClass268_41) {
			local16 = (Class56) this.aClass268_41.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass250_71) {
			local38 = this.aClass250_71.method5806(30, arg0);
		}
		local16 = new Class56();
		if (local38 != null) {
			local16.method1533(new Class3_Sub25(local38));
		}
		@Pc(60) Class268 local60 = this.aClass268_41;
		synchronized (this.aClass268_41) {
			this.aClass268_41.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)V")
	public void method4196() {
		@Pc(2) Class268 local2 = this.aClass268_41;
		synchronized (this.aClass268_41) {
			this.aClass268_41.method6173(5);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method4198() {
		@Pc(10) Class268 local10 = this.aClass268_41;
		synchronized (this.aClass268_41) {
			this.aClass268_41.method6168();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public void method4199() {
		@Pc(6) Class268 local6 = this.aClass268_41;
		synchronized (this.aClass268_41) {
			this.aClass268_41.method6160();
		}
	}
}
