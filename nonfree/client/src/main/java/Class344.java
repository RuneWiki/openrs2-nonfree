import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class344 {

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!vi;")
	private final Class332 aClass332_208 = new Class332(64);

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!pq;")
	public final Class251 aClass251_156;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Lclient!pq;")
	private final Class251 aClass251_155;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;Lclient!pq;)V")
	public Class344(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_156 = arg3;
		this.aClass251_155 = arg2;
		this.aClass251_155.method5849(3);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method7787() {
		@Pc(2) Class332 local2 = this.aClass332_208;
		synchronized (this.aClass332_208) {
			this.aClass332_208.method7510();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!na;")
	public Class206 method7788(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_208;
		@Pc(18) Class206 local18;
		synchronized (this.aClass332_208) {
			local18 = (Class206) this.aClass332_208.method7502((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(37) Class251 local37 = this.aClass251_155;
		@Pc(46) byte[] local46;
		synchronized (this.aClass251_155) {
			local46 = this.aClass251_155.method5860(3, arg0);
		}
		local18 = new Class206();
		local18.aClass344_2 = this;
		if (local46 != null) {
			local18.method4988(new Class6_Sub14(local46));
		}
		@Pc(71) Class332 local71 = this.aClass332_208;
		synchronized (this.aClass332_208) {
			this.aClass332_208.method7498((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V")
	public void method7790() {
		@Pc(2) Class332 local2 = this.aClass332_208;
		synchronized (this.aClass332_208) {
			this.aClass332_208.method7497(5);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public void method7791() {
		@Pc(14) Class332 local14 = this.aClass332_208;
		synchronized (this.aClass332_208) {
			this.aClass332_208.method7512();
		}
	}
}
