import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class313 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!mq;")
	private final Class223 aClass223_63 = new Class223(64);

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!jn;")
	private final Class176 aClass176_120;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class313(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_120 = arg2;
		if (this.aClass176_120 != null) {
			this.aClass176_120.method3999(11);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method7379() {
		@Pc(2) Class223 local2 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method5398();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lclient!fq;")
	public Class106 method7381(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_63;
		@Pc(16) Class106 local16;
		synchronized (this.aClass223_63) {
			local16 = (Class106) this.aClass223_63.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_120;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_120) {
			local38 = this.aClass176_120.method3994(arg0, 11);
		}
		local16 = new Class106();
		if (local38 != null) {
			local16.method2806(new Class4_Sub11(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public void method7382() {
		@Pc(2) Class223 local2 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method5400();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
	public void method7383() {
		@Pc(2) Class223 local2 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method5399(5);
		}
	}
}
