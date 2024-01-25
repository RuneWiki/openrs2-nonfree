import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class92 {

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "Lclient!jt;")
	private final Class166 aClass166_17 = new Class166(64);

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "Lclient!vd;")
	private final Class353 aClass353_29;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class92(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_29 = arg2;
		this.aClass353_29.method8422(31);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)Lclient!ws;")
	public Class383 method2341(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_17;
		@Pc(16) Class383 local16;
		synchronized (this.aClass166_17) {
			local16 = (Class383) this.aClass166_17.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class353 local35 = this.aClass353_29;
		@Pc(44) byte[] local44;
		synchronized (this.aClass353_29) {
			local44 = this.aClass353_29.method8404(31, arg0);
		}
		local16 = new Class383();
		if (local44 != null) {
			local16.method8983(new Class6_Sub40(local44));
		}
		@Pc(66) Class166 local66 = this.aClass166_17;
		synchronized (this.aClass166_17) {
			this.aClass166_17.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(II)V")
	public void method2344() {
		@Pc(2) Class166 local2 = this.aClass166_17;
		synchronized (this.aClass166_17) {
			this.aClass166_17.method4809(5);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
	public void method2346() {
		@Pc(12) Class166 local12 = this.aClass166_17;
		synchronized (this.aClass166_17) {
			this.aClass166_17.method4802();
		}
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
	public void method2347() {
		@Pc(6) Class166 local6 = this.aClass166_17;
		synchronized (this.aClass166_17) {
			this.aClass166_17.method4811();
		}
	}
}
