import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class282 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!pa;")
	private final Class265 aClass265_51 = new Class265(64);

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_133;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class282(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_133 = arg2;
		if (this.aClass50_133 != null) {
			this.aClass50_133.method913(11);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method6900() {
		@Pc(6) Class265 local6 = this.aClass265_51;
		synchronized (this.aClass265_51) {
			this.aClass265_51.method6568();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!cd;")
	public Class53 method6901(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_51;
		@Pc(22) Class53 local22;
		synchronized (this.aClass265_51) {
			local22 = (Class53) this.aClass265_51.method6577((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class50 local35 = this.aClass50_133;
		@Pc(44) byte[] local44;
		synchronized (this.aClass50_133) {
			local44 = this.aClass50_133.method916(arg0, 11);
		}
		local22 = new Class53();
		if (local44 != null) {
			local22.method954(new Class5_Sub15(local44));
		}
		@Pc(66) Class265 local66 = this.aClass265_51;
		synchronized (this.aClass265_51) {
			this.aClass265_51.method6566(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method6903() {
		@Pc(2) Class265 local2 = this.aClass265_51;
		synchronized (this.aClass265_51) {
			this.aClass265_51.method6573();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public void method6905() {
		@Pc(11) Class265 local11 = this.aClass265_51;
		synchronized (this.aClass265_51) {
			this.aClass265_51.method6570(5);
		}
	}
}
