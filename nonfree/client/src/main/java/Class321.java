import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class321 {

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "Lclient!jt;")
	private final Class166 aClass166_51 = new Class166(128);

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lclient!vd;")
	private final Class353 aClass353_111;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class321(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_111 = arg2;
		this.aClass353_111.method8422(1);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lclient!ed;")
	public Class76 method7948(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_51;
		@Pc(16) Class76 local16;
		synchronized (this.aClass166_51) {
			local16 = (Class76) this.aClass166_51.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_111;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_111) {
			local38 = this.aClass353_111.method8404(1, arg0);
		}
		local16 = new Class76();
		if (local38 != null) {
			local16.method1989(new Class6_Sub40(local38));
		}
		@Pc(60) Class166 local60 = this.aClass166_51;
		synchronized (this.aClass166_51) {
			this.aClass166_51.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	public void method7949() {
		@Pc(2) Class166 local2 = this.aClass166_51;
		synchronized (this.aClass166_51) {
			this.aClass166_51.method4811();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
	public void method7950() {
		@Pc(2) Class166 local2 = this.aClass166_51;
		synchronized (this.aClass166_51) {
			this.aClass166_51.method4809(5);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
	public void method7952() {
		@Pc(6) Class166 local6 = this.aClass166_51;
		synchronized (this.aClass166_51) {
			this.aClass166_51.method4802();
		}
	}
}
