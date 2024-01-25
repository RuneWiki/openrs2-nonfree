import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class348 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Lclient!iha;")
	private final Class168 aClass168_82 = new Class168(64);

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!gda;")
	private final Class126 aClass126_260;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public final int anInt9003;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class348(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_260 = arg2;
		if (this.aClass126_260 == null) {
			this.anInt9003 = 0;
		} else {
			this.anInt9003 = this.aClass126_260.method3062(16);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	public void method7724() {
		@Pc(6) Class168 local6 = this.aClass168_82;
		synchronized (this.aClass168_82) {
			this.aClass168_82.method3856();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!sk;")
	public Class333 method7726(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_82;
		@Pc(16) Class333 local16;
		synchronized (this.aClass168_82) {
			local16 = (Class333) this.aClass168_82.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_260;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_260) {
			local39 = this.aClass126_260.method3086(arg0, 16);
		}
		local16 = new Class333();
		if (local39 != null) {
			local16.method7503(new Class5_Sub36(local39));
		}
		@Pc(63) Class168 local63 = this.aClass168_82;
		synchronized (this.aClass168_82) {
			this.aClass168_82.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	public void method7728() {
		@Pc(2) Class168 local2 = this.aClass168_82;
		synchronized (this.aClass168_82) {
			this.aClass168_82.method3862();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
	public void method7729() {
		@Pc(2) Class168 local2 = this.aClass168_82;
		synchronized (this.aClass168_82) {
			this.aClass168_82.method3852(5);
		}
	}
}
