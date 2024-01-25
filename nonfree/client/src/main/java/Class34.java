import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class34 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!jt;")
	private final Class166 aClass166_3 = new Class166(64);

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!vd;")
	private final Class353 aClass353_5;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class34(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_5 = arg2;
		this.aClass353_5.method8422(32);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method801() {
		@Pc(2) Class166 local2 = this.aClass166_3;
		synchronized (this.aClass166_3) {
			this.aClass166_3.method4802();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)Lclient!mb;")
	public Class201 method803(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_3;
		@Pc(16) Class201 local16;
		synchronized (this.aClass166_3) {
			local16 = (Class201) this.aClass166_3.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class353 local35 = this.aClass353_5;
		@Pc(44) byte[] local44;
		synchronized (this.aClass353_5) {
			local44 = this.aClass353_5.method8404(32, arg0);
		}
		local16 = new Class201();
		if (local44 != null) {
			local16.method5480(new Class6_Sub40(local44));
		}
		@Pc(66) Class166 local66 = this.aClass166_3;
		synchronized (this.aClass166_3) {
			this.aClass166_3.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
	public void method805() {
		@Pc(11) Class166 local11 = this.aClass166_3;
		synchronized (this.aClass166_3) {
			this.aClass166_3.method4809(5);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public void method806() {
		@Pc(2) Class166 local2 = this.aClass166_3;
		synchronized (this.aClass166_3) {
			this.aClass166_3.method4811();
		}
	}
}
