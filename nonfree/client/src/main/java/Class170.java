import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class170 {

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "Lclient!mq;")
	private final Class223 aClass223_30 = new Class223(16);

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "Lclient!jn;")
	private final Class176 aClass176_64;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class170(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_64 = arg2;
		this.aClass176_64.method3999(30);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Lclient!wda;")
	public Class355 method3841(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_30;
		@Pc(21) Class355 local21;
		synchronized (this.aClass223_30) {
			local21 = (Class355) this.aClass223_30.method5388((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class176 local34 = this.aClass176_64;
		@Pc(43) byte[] local43;
		synchronized (this.aClass176_64) {
			local43 = this.aClass176_64.method3994(arg0, 30);
		}
		local21 = new Class355();
		if (local43 != null) {
			local21.method8238(new Class4_Sub11(local43));
		}
		@Pc(65) Class223 local65 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method5394(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
	public void method3842() {
		@Pc(2) Class223 local2 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method5400();
		}
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(Z)V")
	public void method3844() {
		@Pc(2) Class223 local2 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method5398();
		}
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(II)V")
	public void method3845() {
		@Pc(7) Class223 local7 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method5399(5);
		}
	}
}
