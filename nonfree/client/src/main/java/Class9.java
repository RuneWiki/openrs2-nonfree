import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class9 {

	@OriginalMember(owner = "client!afa", name = "k", descriptor = "Lclient!iha;")
	private final Class168 aClass168_1 = new Class168(64);

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "Lclient!gda;")
	private final Class126 aClass126_6;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class9(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_6 = arg2;
		if (this.aClass126_6 != null) {
			this.aClass126_6.method3062(54);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)Lclient!ev;")
	public Class103 method150(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_1;
		@Pc(16) Class103 local16;
		synchronized (this.aClass168_1) {
			local16 = (Class103) this.aClass168_1.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_6;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_6) {
			local39 = this.aClass126_6.method3086(arg0, 54);
		}
		local16 = new Class103();
		if (local39 != null) {
			local16.method2567(new Class5_Sub36(local39));
		}
		@Pc(69) Class168 local69 = this.aClass168_1;
		synchronized (this.aClass168_1) {
			this.aClass168_1.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
	public void method152() {
		@Pc(13) Class168 local13 = this.aClass168_1;
		synchronized (this.aClass168_1) {
			this.aClass168_1.method3856();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	public void method153() {
		@Pc(15) Class168 local15 = this.aClass168_1;
		synchronized (this.aClass168_1) {
			this.aClass168_1.method3862();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)V")
	public void method154() {
		@Pc(6) Class168 local6 = this.aClass168_1;
		synchronized (this.aClass168_1) {
			this.aClass168_1.method3852(5);
		}
	}
}
