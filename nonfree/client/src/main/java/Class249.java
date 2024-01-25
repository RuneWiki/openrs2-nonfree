import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class249 {

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "Lclient!mq;")
	private final Class154 aClass154_55 = new Class154(64);

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!fc;")
	private final Class71 aClass71_91;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class249(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_91 = arg2;
		if (this.aClass71_91 != null) {
			this.aClass71_91.method1580(35);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)Lclient!ub;")
	public Class225 method5715(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_55;
		@Pc(16) Class225 local16;
		synchronized (this.aClass154_55) {
			local16 = (Class225) this.aClass154_55.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_91.method1555(35, arg0);
		local16 = new Class225();
		if (local33 != null) {
			local16.method5320(new Class2_Sub13(local33));
		}
		local16.method5319();
		@Pc(52) Class154 local52 = this.aClass154_55;
		synchronized (this.aClass154_55) {
			this.aClass154_55.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)V")
	public void method5716() {
		@Pc(6) Class154 local6 = this.aClass154_55;
		synchronized (this.aClass154_55) {
			this.aClass154_55.method3758(5);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public void method5719() {
		@Pc(11) Class154 local11 = this.aClass154_55;
		synchronized (this.aClass154_55) {
			this.aClass154_55.method3748();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	public void method5723() {
		@Pc(12) Class154 local12 = this.aClass154_55;
		synchronized (this.aClass154_55) {
			this.aClass154_55.method3746();
		}
	}
}
