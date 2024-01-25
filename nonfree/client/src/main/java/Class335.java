import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class335 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!jt;")
	public final Class166 aClass166_57 = new Class166(20);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!jt;")
	private final Class166 aClass166_58 = new Class166(64);

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Lclient!vd;")
	public final Class353 aClass353_117;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!vd;")
	private final Class353 aClass353_118;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;)V")
	public Class335(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3) {
		this.aClass353_117 = arg3;
		this.aClass353_118 = arg2;
		this.aClass353_118.method8422(46);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!ib;")
	public Class145 method8110(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_58;
		@Pc(16) Class145 local16;
		synchronized (this.aClass166_58) {
			local16 = (Class145) this.aClass166_58.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_118;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_118) {
			local38 = this.aClass353_118.method8404(46, arg0);
		}
		local16 = new Class145();
		local16.aClass335_1 = this;
		if (local38 != null) {
			local16.method3877(new Class6_Sub40(local38));
		}
		@Pc(63) Class166 local63 = this.aClass166_58;
		synchronized (this.aClass166_58) {
			this.aClass166_58.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
	public void method8111() {
		@Pc(7) Class166 local7 = this.aClass166_58;
		synchronized (this.aClass166_58) {
			this.aClass166_58.method4809(5);
		}
		local7 = this.aClass166_57;
		synchronized (this.aClass166_57) {
			this.aClass166_57.method4809(5);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method8112() {
		@Pc(6) Class166 local6 = this.aClass166_58;
		synchronized (this.aClass166_58) {
			this.aClass166_58.method4811();
		}
		local6 = this.aClass166_57;
		synchronized (this.aClass166_57) {
			this.aClass166_57.method4811();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public void method8113() {
		@Pc(6) Class166 local6 = this.aClass166_58;
		synchronized (this.aClass166_58) {
			this.aClass166_58.method4802();
		}
		local6 = this.aClass166_57;
		synchronized (this.aClass166_57) {
			this.aClass166_57.method4802();
		}
	}
}
