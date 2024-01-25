import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class243 {

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!mq;")
	private final Class223 aClass223_48 = new Class223(64);

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Lclient!mq;")
	public final Class223 aClass223_49 = new Class223(2);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!jn;")
	private final Class176 aClass176_99;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!jn;")
	public final Class176 aClass176_98;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;Lclient!jn;)V")
	public Class243(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Class176 arg3) {
		this.aClass176_99 = arg2;
		this.aClass176_98 = arg3;
		this.aClass176_99.method3999(33);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public void method5942() {
		@Pc(6) Class223 local6 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method5399(5);
		}
		local6 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method5399(5);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method5943() {
		@Pc(2) Class223 local2 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method5400();
		}
		local2 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method5400();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public void method5944() {
		@Pc(7) Class223 local7 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method5398();
		}
		local7 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method5398();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lclient!baa;")
	public Class26 method5945(@OriginalArg(0) int arg0) {
		@Pc(14) Class223 local14 = this.aClass223_48;
		@Pc(24) Class26 local24;
		synchronized (this.aClass223_48) {
			local24 = (Class26) this.aClass223_48.method5388((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class176 local37 = this.aClass176_99;
		@Pc(46) byte[] local46;
		synchronized (this.aClass176_99) {
			local46 = this.aClass176_99.method3994(arg0, 33);
		}
		local24 = new Class26();
		local24.aClass243_1 = this;
		if (local46 != null) {
			local24.method366(new Class4_Sub11(local46));
		}
		@Pc(71) Class223 local71 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method5394(local24, (long) arg0);
			return local24;
		}
	}
}
