import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class324 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!jt;")
	private final Class166 aClass166_52 = new Class166(256);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!vd;")
	private final Class353 aClass353_112;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class324(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_112 = arg2;
		this.aClass353_112.method8422(26);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public void method7962() {
		@Pc(10) Class166 local10 = this.aClass166_52;
		synchronized (this.aClass166_52) {
			this.aClass166_52.method4809(5);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public void method7964() {
		@Pc(6) Class166 local6 = this.aClass166_52;
		synchronized (this.aClass166_52) {
			this.aClass166_52.method4811();
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	public void method7965() {
		@Pc(6) Class166 local6 = this.aClass166_52;
		synchronized (this.aClass166_52) {
			this.aClass166_52.method4802();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Lclient!pca;")
	public Class6_Sub2_Sub17 method7966(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_52;
		@Pc(16) Class6_Sub2_Sub17 local16;
		synchronized (this.aClass166_52) {
			local16 = (Class6_Sub2_Sub17) this.aClass166_52.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class353 local34 = this.aClass353_112;
		@Pc(43) byte[] local43;
		synchronized (this.aClass353_112) {
			local43 = this.aClass353_112.method8404(26, arg0);
		}
		local16 = new Class6_Sub2_Sub17();
		if (local43 != null) {
			local16.method6696(new Class6_Sub40(local43));
		}
		@Pc(65) Class166 local65 = this.aClass166_52;
		synchronized (this.aClass166_52) {
			this.aClass166_52.method4803(local16, (long) arg0);
			return local16;
		}
	}
}
