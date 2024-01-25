import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class298 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!pa;")
	private Class265 aClass265_55 = new Class265(64);

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!cb;")
	private final Class50 aClass50_148;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class298(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_148 = arg2;
		if (this.aClass50_148 != null) {
			@Pc(20) int local20 = this.aClass50_148.method902() - 1;
			this.aClass50_148.method913(local20);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public void method7193() {
		@Pc(7) Class265 local7 = this.aClass265_55;
		synchronized (this.aClass265_55) {
			this.aClass265_55.method6573();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method7194() {
		@Pc(6) Class265 local6 = this.aClass265_55;
		synchronized (this.aClass265_55) {
			this.aClass265_55.method6568();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!pj;")
	public Class274 method7195(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_55;
		@Pc(18) Class274 local18;
		synchronized (this.aClass265_55) {
			local18 = (Class274) this.aClass265_55.method6577((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(38) Class50 local38 = this.aClass50_148;
		@Pc(51) byte[] local51;
		synchronized (this.aClass50_148) {
			local51 = this.aClass50_148.method916(Static458.method6772(arg0), Static443.method6613(arg0));
		}
		local18 = new Class274();
		if (local51 != null) {
			local18.method6721(new Class5_Sub15(local51));
		}
		@Pc(73) Class265 local73 = this.aClass265_55;
		synchronized (this.aClass265_55) {
			this.aClass265_55.method6566(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
	public void method7197(@OriginalArg(1) int arg0) {
		@Pc(7) Class265 local7 = this.aClass265_55;
		synchronized (this.aClass265_55) {
			this.aClass265_55.method6568();
			this.aClass265_55 = new Class265(arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V")
	public void method7198() {
		@Pc(6) Class265 local6 = this.aClass265_55;
		synchronized (this.aClass265_55) {
			this.aClass265_55.method6570(5);
		}
	}
}
