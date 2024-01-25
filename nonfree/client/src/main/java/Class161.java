import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class161 {

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "Lclient!iha;")
	private final Class168 aClass168_41 = new Class168(16);

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_116;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class161(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_116 = arg2;
		this.aClass126_116.method3062(30);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
	public void method3633() {
		@Pc(6) Class168 local6 = this.aClass168_41;
		synchronized (this.aClass168_41) {
			this.aClass168_41.method3852(5);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)Lclient!tha;")
	public Class351 method3634(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_41;
		@Pc(16) Class351 local16;
		synchronized (this.aClass168_41) {
			local16 = (Class351) this.aClass168_41.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_116;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_116) {
			local39 = this.aClass126_116.method3086(arg0, 30);
		}
		local16 = new Class351();
		if (local39 != null) {
			local16.method7757(new Class5_Sub36(local39));
		}
		@Pc(71) Class168 local71 = this.aClass168_41;
		synchronized (this.aClass168_41) {
			this.aClass168_41.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public void method3635() {
		@Pc(2) Class168 local2 = this.aClass168_41;
		synchronized (this.aClass168_41) {
			this.aClass168_41.method3862();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public void method3638() {
		@Pc(6) Class168 local6 = this.aClass168_41;
		synchronized (this.aClass168_41) {
			this.aClass168_41.method3856();
		}
	}
}
