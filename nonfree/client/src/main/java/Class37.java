import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class37 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!jt;")
	private final Class166 aClass166_4 = new Class166(64);

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_7;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class37(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_7 = arg2;
		if (this.aClass353_7 != null) {
			this.aClass353_7.method8422(35);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public void method856() {
		@Pc(11) Class166 local11 = this.aClass166_4;
		synchronized (this.aClass166_4) {
			this.aClass166_4.method4811();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!bd;")
	public Class31 method857(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_4;
		@Pc(16) Class31 local16;
		synchronized (this.aClass166_4) {
			local16 = (Class31) this.aClass166_4.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_7;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_7) {
			local38 = this.aClass353_7.method8404(35, arg0);
		}
		local16 = new Class31();
		if (local38 != null) {
			local16.method617(new Class6_Sub40(local38));
		}
		local16.method618();
		@Pc(63) Class166 local63 = this.aClass166_4;
		synchronized (this.aClass166_4) {
			this.aClass166_4.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	public void method860() {
		@Pc(6) Class166 local6 = this.aClass166_4;
		synchronized (this.aClass166_4) {
			this.aClass166_4.method4809(5);
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public void method861() {
		@Pc(11) Class166 local11 = this.aClass166_4;
		synchronized (this.aClass166_4) {
			this.aClass166_4.method4802();
		}
	}
}
