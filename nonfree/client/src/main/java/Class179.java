import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class179 {

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "Lclient!jt;")
	private final Class166 aClass166_30 = new Class166(64);

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "Lclient!vd;")
	private final Class353 aClass353_53;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class179(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_53 = arg2;
		if (this.aClass353_53 != null) {
			this.aClass353_53.method8422(11);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)V")
	public void method5146() {
		@Pc(2) Class166 local2 = this.aClass166_30;
		synchronized (this.aClass166_30) {
			this.aClass166_30.method4809(5);
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IB)Lclient!nha;")
	public Class223 method5148(@OriginalArg(0) int arg0) {
		@Pc(11) Class166 local11 = this.aClass166_30;
		@Pc(21) Class223 local21;
		synchronized (this.aClass166_30) {
			local21 = (Class223) this.aClass166_30.method4805((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class353 local34 = this.aClass353_53;
		@Pc(43) byte[] local43;
		synchronized (this.aClass353_53) {
			local43 = this.aClass353_53.method8404(11, arg0);
		}
		local21 = new Class223();
		if (local43 != null) {
			local21.method5909(new Class6_Sub40(local43));
		}
		@Pc(65) Class166 local65 = this.aClass166_30;
		synchronized (this.aClass166_30) {
			this.aClass166_30.method4803(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V")
	public void method5150() {
		@Pc(2) Class166 local2 = this.aClass166_30;
		synchronized (this.aClass166_30) {
			this.aClass166_30.method4811();
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
	public void method5152() {
		@Pc(6) Class166 local6 = this.aClass166_30;
		synchronized (this.aClass166_30) {
			this.aClass166_30.method4802();
		}
	}
}
