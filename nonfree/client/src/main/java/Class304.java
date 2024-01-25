import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class304 {

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "Lclient!jt;")
	private Class166 aClass166_48 = new Class166(64);

	@OriginalMember(owner = "client!sha", name = "h", descriptor = "Lclient!jt;")
	public Class166 aClass166_49 = new Class166(64);

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "Lclient!vd;")
	private final Class353 aClass353_106;

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "Lclient!vd;")
	public final Class353 aClass353_107;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;)V")
	public Class304(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3) {
		this.aClass353_106 = arg2;
		this.aClass353_107 = arg3;
		this.aClass353_106.method8422(34);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
	public void method7756() {
		@Pc(11) Class166 local11 = this.aClass166_48;
		synchronized (this.aClass166_48) {
			this.aClass166_48.method4802();
		}
		local11 = this.aClass166_49;
		synchronized (this.aClass166_49) {
			this.aClass166_49.method4802();
		}
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	public void method7757() {
		@Pc(2) Class166 local2 = this.aClass166_48;
		synchronized (this.aClass166_48) {
			this.aClass166_48.method4811();
		}
		local2 = this.aClass166_49;
		synchronized (this.aClass166_49) {
			this.aClass166_49.method4811();
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IB)Lclient!or;")
	public Class246 method7759(@OriginalArg(0) int arg0) {
		@Pc(14) Class166 local14 = this.aClass166_48;
		@Pc(24) Class246 local24;
		synchronized (this.aClass166_48) {
			local24 = (Class246) this.aClass166_48.method4805((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class353 local37 = this.aClass353_106;
		@Pc(46) byte[] local46;
		synchronized (this.aClass353_106) {
			local46 = this.aClass353_106.method8404(34, arg0);
		}
		local24 = new Class246();
		local24.aClass304_3 = this;
		if (local46 != null) {
			local24.method6526(new Class6_Sub40(local46));
		}
		@Pc(71) Class166 local71 = this.aClass166_48;
		synchronized (this.aClass166_48) {
			this.aClass166_48.method4803(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)V")
	public void method7760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass166_48 = new Class166(arg1);
		this.aClass166_49 = new Class166(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZI)V")
	public void method7761() {
		@Pc(2) Class166 local2 = this.aClass166_48;
		synchronized (this.aClass166_48) {
			this.aClass166_48.method4809(5);
		}
		local2 = this.aClass166_49;
		synchronized (this.aClass166_49) {
			this.aClass166_49.method4809(5);
		}
	}
}
