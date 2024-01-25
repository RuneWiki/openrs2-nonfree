import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class58 {

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "Lclient!jt;")
	private final Class166 aClass166_10 = new Class166(64);

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "Lclient!vd;")
	private final Class353 aClass353_17;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "Lclient!vd;")
	public final Class353 aClass353_18;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;)V")
	public Class58(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3) {
		this.aClass353_17 = arg2;
		this.aClass353_18 = arg3;
		this.aClass353_17.method8422(3);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)Lclient!rp;")
	public Class297 method1514(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_10;
		@Pc(16) Class297 local16;
		synchronized (this.aClass166_10) {
			local16 = (Class297) this.aClass166_10.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class353 local34 = this.aClass353_17;
		@Pc(43) byte[] local43;
		synchronized (this.aClass353_17) {
			local43 = this.aClass353_17.method8404(3, arg0);
		}
		local16 = new Class297();
		local16.aClass58_2 = this;
		if (local43 != null) {
			local16.method7441(new Class6_Sub40(local43));
		}
		@Pc(68) Class166 local68 = this.aClass166_10;
		synchronized (this.aClass166_10) {
			this.aClass166_10.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
	public void method1515() {
		@Pc(2) Class166 local2 = this.aClass166_10;
		synchronized (this.aClass166_10) {
			this.aClass166_10.method4811();
		}
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V")
	public void method1516() {
		@Pc(2) Class166 local2 = this.aClass166_10;
		synchronized (this.aClass166_10) {
			this.aClass166_10.method4802();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
	public void method1518() {
		@Pc(2) Class166 local2 = this.aClass166_10;
		synchronized (this.aClass166_10) {
			this.aClass166_10.method4809(5);
		}
	}
}
