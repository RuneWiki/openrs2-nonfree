import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class91 {

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!vi;")
	private Class332 aClass332_56 = new Class332(64);

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!pq;")
	private final Class251 aClass251_42;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class91(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_42 = arg2;
		if (this.aClass251_42 != null) {
			@Pc(20) int local20 = this.aClass251_42.method5847() - 1;
			this.aClass251_42.method5849(local20);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public void method1857() {
		@Pc(6) Class332 local6 = this.aClass332_56;
		synchronized (this.aClass332_56) {
			this.aClass332_56.method7510();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
	public void method1858() {
		@Pc(2) Class332 local2 = this.aClass332_56;
		synchronized (this.aClass332_56) {
			this.aClass332_56.method7497(5);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(IB)V")
	public void method1859(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_56;
		synchronized (this.aClass332_56) {
			this.aClass332_56.method7510();
			this.aClass332_56 = new Class332(arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)Lclient!lf;")
	public Class182 method1860(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_56;
		@Pc(16) Class182 local16;
		synchronized (this.aClass332_56) {
			local16 = (Class182) this.aClass332_56.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_42;
		@Pc(42) byte[] local42;
		synchronized (this.aClass251_42) {
			local42 = this.aClass251_42.method5860(Static5.method120(arg0), Static118.method1802(arg0));
		}
		local16 = new Class182();
		if (local42 != null) {
			local16.method4031(new Class6_Sub14(local42));
		}
		@Pc(64) Class332 local64 = this.aClass332_56;
		synchronized (this.aClass332_56) {
			this.aClass332_56.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
	public void method1863() {
		@Pc(6) Class332 local6 = this.aClass332_56;
		synchronized (this.aClass332_56) {
			this.aClass332_56.method7512();
		}
	}
}
