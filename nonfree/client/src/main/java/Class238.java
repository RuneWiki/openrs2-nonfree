import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class238 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!wi;")
	private final Class268 aClass268_55 = new Class268(64);

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Lclient!uu;")
	private final Class250 aClass250_94;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class238(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_94 = arg2;
		this.aClass250_94.method5815(32);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public void method5437() {
		@Pc(2) Class268 local2 = this.aClass268_55;
		synchronized (this.aClass268_55) {
			this.aClass268_55.method6173(5);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)Lclient!lt;")
	public Class142 method5438(@OriginalArg(0) int arg0) {
		@Pc(11) Class268 local11 = this.aClass268_55;
		@Pc(21) Class142 local21;
		synchronized (this.aClass268_55) {
			local21 = (Class142) this.aClass268_55.method6166((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class250 local34 = this.aClass250_94;
		@Pc(43) byte[] local43;
		synchronized (this.aClass250_94) {
			local43 = this.aClass250_94.method5806(32, arg0);
		}
		local21 = new Class142();
		if (local43 != null) {
			local21.method3511(new Class3_Sub25(local43));
		}
		@Pc(65) Class268 local65 = this.aClass268_55;
		synchronized (this.aClass268_55) {
			this.aClass268_55.method6164(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public void method5439() {
		@Pc(2) Class268 local2 = this.aClass268_55;
		synchronized (this.aClass268_55) {
			this.aClass268_55.method6168();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public void method5442() {
		@Pc(11) Class268 local11 = this.aClass268_55;
		synchronized (this.aClass268_55) {
			this.aClass268_55.method6160();
		}
	}
}
