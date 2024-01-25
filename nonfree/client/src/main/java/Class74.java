import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class74 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!jt;")
	private final Class166 aClass166_13 = new Class166(64);

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!jt;")
	public final Class166 aClass166_14 = new Class166(2);

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_23;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!vd;")
	public final Class353 aClass353_22;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;)V")
	public Class74(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3) {
		this.aClass353_23 = arg2;
		this.aClass353_22 = arg3;
		this.aClass353_23.method8422(33);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lclient!vb;")
	public Class351 method1972(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_13;
		@Pc(18) Class351 local18;
		synchronized (this.aClass166_13) {
			local18 = (Class351) this.aClass166_13.method4805((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class353 local31 = this.aClass353_23;
		@Pc(40) byte[] local40;
		synchronized (this.aClass353_23) {
			local40 = this.aClass353_23.method8404(33, arg0);
		}
		local18 = new Class351();
		local18.aClass74_2 = this;
		if (local40 != null) {
			local18.method8357(new Class6_Sub40(local40));
		}
		@Pc(65) Class166 local65 = this.aClass166_13;
		synchronized (this.aClass166_13) {
			this.aClass166_13.method4803(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	public void method1973() {
		@Pc(6) Class166 local6 = this.aClass166_13;
		synchronized (this.aClass166_13) {
			this.aClass166_13.method4809(5);
		}
		local6 = this.aClass166_14;
		synchronized (this.aClass166_14) {
			this.aClass166_14.method4809(5);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public void method1974() {
		@Pc(2) Class166 local2 = this.aClass166_13;
		synchronized (this.aClass166_13) {
			this.aClass166_13.method4811();
		}
		local2 = this.aClass166_14;
		synchronized (this.aClass166_14) {
			this.aClass166_14.method4811();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	public void method1977() {
		@Pc(6) Class166 local6 = this.aClass166_13;
		synchronized (this.aClass166_13) {
			this.aClass166_13.method4802();
		}
		local6 = this.aClass166_14;
		synchronized (this.aClass166_14) {
			this.aClass166_14.method4802();
		}
	}
}
