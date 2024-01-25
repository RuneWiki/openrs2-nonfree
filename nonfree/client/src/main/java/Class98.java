import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class98 {

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!wi;")
	private final Class268 aClass268_25 = new Class268(64);

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!wi;")
	public final Class268 aClass268_26 = new Class268(2);

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!uu;")
	private final Class250 aClass250_44;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!uu;")
	public final Class250 aClass250_43;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;Lclient!uu;)V")
	public Class98(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_44 = arg2;
		this.aClass250_43 = arg3;
		this.aClass250_44.method5815(33);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Lclient!oe;")
	public Class173 method2340(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_25;
		@Pc(16) Class173 local16;
		synchronized (this.aClass268_25) {
			local16 = (Class173) this.aClass268_25.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class250 local34 = this.aClass250_44;
		@Pc(43) byte[] local43;
		synchronized (this.aClass250_44) {
			local43 = this.aClass250_44.method5806(33, arg0);
		}
		local16 = new Class173();
		local16.aClass98_2 = this;
		if (local43 != null) {
			local16.method4205(new Class3_Sub25(local43));
		}
		@Pc(68) Class268 local68 = this.aClass268_25;
		synchronized (this.aClass268_25) {
			this.aClass268_25.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public void method2341() {
		@Pc(2) Class268 local2 = this.aClass268_25;
		synchronized (this.aClass268_25) {
			this.aClass268_25.method6173(5);
		}
		local2 = this.aClass268_26;
		synchronized (this.aClass268_26) {
			this.aClass268_26.method6173(5);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method2342() {
		@Pc(11) Class268 local11 = this.aClass268_25;
		synchronized (this.aClass268_25) {
			this.aClass268_25.method6160();
		}
		local11 = this.aClass268_26;
		synchronized (this.aClass268_26) {
			this.aClass268_26.method6160();
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public void method2344() {
		@Pc(2) Class268 local2 = this.aClass268_25;
		synchronized (this.aClass268_25) {
			this.aClass268_25.method6168();
		}
		local2 = this.aClass268_26;
		synchronized (this.aClass268_26) {
			this.aClass268_26.method6168();
		}
	}
}
