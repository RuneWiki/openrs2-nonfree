import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class380 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!iha;")
	private final Class168 aClass168_94 = new Class168(64);

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Lclient!gda;")
	private final Class126 aClass126_290;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class380(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_290 = arg2;
		if (this.aClass126_290 != null) {
			this.aClass126_290.method3062(11);
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public void method8835() {
		@Pc(2) Class168 local2 = this.aClass168_94;
		synchronized (this.aClass168_94) {
			this.aClass168_94.method3862();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public void method8837() {
		@Pc(2) Class168 local2 = this.aClass168_94;
		synchronized (this.aClass168_94) {
			this.aClass168_94.method3852(5);
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
	public void method8838() {
		@Pc(6) Class168 local6 = this.aClass168_94;
		synchronized (this.aClass168_94) {
			this.aClass168_94.method3856();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)Lclient!av;")
	public Class22 method8839(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_94;
		@Pc(16) Class22 local16;
		synchronized (this.aClass168_94) {
			local16 = (Class22) this.aClass168_94.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_290;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_290) {
			local39 = this.aClass126_290.method3086(arg0, 11);
		}
		local16 = new Class22();
		if (local39 != null) {
			local16.method387(new Class5_Sub36(local39));
		}
		@Pc(65) Class168 local65 = this.aClass168_94;
		synchronized (this.aClass168_94) {
			this.aClass168_94.method3853((long) arg0, local16);
			return local16;
		}
	}
}
