import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class321 {

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "Lclient!wq;")
	private final Class391 aClass391_54 = new Class391(16);

	@OriginalMember(owner = "client!sja", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_124;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class321(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_124 = arg2;
		this.aClass208_124.method5005(30);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)V")
	public void method7942() {
		@Pc(2) Class391 local2 = this.aClass391_54;
		synchronized (this.aClass391_54) {
			this.aClass391_54.method9276(0);
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(BI)V")
	public void method7943() {
		@Pc(2) Class391 local2 = this.aClass391_54;
		synchronized (this.aClass391_54) {
			this.aClass391_54.method9274(5);
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
	public void method7944() {
		@Pc(2) Class391 local2 = this.aClass391_54;
		synchronized (this.aClass391_54) {
			this.aClass391_54.method9286();
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IB)Lclient!vh;")
	public Class369 method7947(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_54;
		@Pc(16) Class369 local16;
		synchronized (this.aClass391_54) {
			local16 = (Class369) this.aClass391_54.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_124;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_124) {
			local39 = this.aClass208_124.method4991(30, arg0, 70);
		}
		local16 = new Class369();
		if (local39 != null) {
			local16.method8848(new Class5_Sub23(local39));
		}
		@Pc(63) Class391 local63 = this.aClass391_54;
		synchronized (this.aClass391_54) {
			this.aClass391_54.method9273((long) arg0, local16, 1);
			return local16;
		}
	}
}
