import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class354 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!jt;")
	private final Class166 aClass166_64 = new Class166(16);

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!vd;")
	private final Class353 aClass353_127;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class354(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_127 = arg2;
		this.aClass353_127.method8422(30);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lclient!mw;")
	public Class214 method8448(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_64;
		@Pc(16) Class214 local16;
		synchronized (this.aClass166_64) {
			local16 = (Class214) this.aClass166_64.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_127;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_127) {
			local38 = this.aClass353_127.method8404(30, arg0);
		}
		local16 = new Class214();
		if (local38 != null) {
			local16.method5728(new Class6_Sub40(local38));
		}
		@Pc(66) Class166 local66 = this.aClass166_64;
		synchronized (this.aClass166_64) {
			this.aClass166_64.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public void method8450() {
		@Pc(6) Class166 local6 = this.aClass166_64;
		synchronized (this.aClass166_64) {
			this.aClass166_64.method4811();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public void method8451() {
		@Pc(6) Class166 local6 = this.aClass166_64;
		synchronized (this.aClass166_64) {
			this.aClass166_64.method4802();
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)V")
	public void method8454() {
		@Pc(2) Class166 local2 = this.aClass166_64;
		synchronized (this.aClass166_64) {
			this.aClass166_64.method4809(5);
		}
	}
}
