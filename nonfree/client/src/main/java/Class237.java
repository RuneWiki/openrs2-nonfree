import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class237 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!wq;")
	public final Class391 aClass391_33 = new Class391(20);

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!wq;")
	private final Class391 aClass391_34 = new Class391(64);

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!la;")
	public final Class208 aClass208_87;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "Lclient!la;")
	private final Class208 aClass208_86;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;)V")
	public Class237(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3) {
		this.aClass208_87 = arg3;
		this.aClass208_86 = arg2;
		this.aClass208_86.method5005(46);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V")
	public void method5447() {
		@Pc(2) Class391 local2 = this.aClass391_34;
		synchronized (this.aClass391_34) {
			this.aClass391_34.method9274(5);
		}
		local2 = this.aClass391_33;
		synchronized (this.aClass391_33) {
			this.aClass391_33.method9274(5);
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public void method5449() {
		@Pc(2) Class391 local2 = this.aClass391_34;
		synchronized (this.aClass391_34) {
			this.aClass391_34.method9286();
		}
		local2 = this.aClass391_33;
		synchronized (this.aClass391_33) {
			this.aClass391_33.method9286();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public void method5451() {
		@Pc(7) Class391 local7 = this.aClass391_34;
		synchronized (this.aClass391_34) {
			this.aClass391_34.method9276(0);
		}
		local7 = this.aClass391_33;
		synchronized (this.aClass391_33) {
			this.aClass391_33.method9276(0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!hd;")
	public Class155 method5452(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_34;
		@Pc(16) Class155 local16;
		synchronized (this.aClass391_34) {
			local16 = (Class155) this.aClass391_34.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_86;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_86) {
			local39 = this.aClass208_86.method4991(46, arg0, -10);
		}
		local16 = new Class155();
		local16.aClass237_1 = this;
		if (local39 != null) {
			local16.method3060(new Class5_Sub23(local39));
		}
		@Pc(72) Class391 local72 = this.aClass391_34;
		synchronized (this.aClass391_34) {
			this.aClass391_34.method9273((long) arg0, local16, 1);
			return local16;
		}
	}
}
