import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class360 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!mq;")
	private final Class223 aClass223_69 = new Class223(128);

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!jn;")
	private final Class176 aClass176_131;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class360(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_131 = arg2;
		this.aClass176_131.method3999(1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lclient!rl;")
	public Class292 method8296(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_69;
		@Pc(16) Class292 local16;
		synchronized (this.aClass223_69) {
			local16 = (Class292) this.aClass223_69.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class176 local34 = this.aClass176_131;
		@Pc(43) byte[] local43;
		synchronized (this.aClass176_131) {
			local43 = this.aClass176_131.method3994(arg0, 1);
		}
		local16 = new Class292();
		if (local43 != null) {
			local16.method6979(new Class4_Sub11(local43));
		}
		@Pc(65) Class223 local65 = this.aClass223_69;
		synchronized (this.aClass223_69) {
			this.aClass223_69.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public void method8297() {
		@Pc(2) Class223 local2 = this.aClass223_69;
		synchronized (this.aClass223_69) {
			this.aClass223_69.method5400();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method8299() {
		@Pc(13) Class223 local13 = this.aClass223_69;
		synchronized (this.aClass223_69) {
			this.aClass223_69.method5398();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
	public void method8303() {
		@Pc(6) Class223 local6 = this.aClass223_69;
		synchronized (this.aClass223_69) {
			this.aClass223_69.method5399(5);
		}
	}
}
