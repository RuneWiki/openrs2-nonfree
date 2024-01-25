import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class211 {

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!mq;")
	private Class154 aClass154_46 = new Class154(128);

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "Lclient!mq;")
	public Class154 aClass154_47 = new Class154(64);

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!fc;")
	private final Class71 aClass71_76;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "Lclient!fc;")
	public final Class71 aClass71_77;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;Lclient!fc;)V")
	public Class211(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3) {
		this.aClass71_76 = arg2;
		this.aClass71_77 = arg3;
		this.aClass71_76.method1580(36);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method5047() {
		@Pc(12) Class154 local12 = this.aClass154_46;
		synchronized (this.aClass154_46) {
			this.aClass154_46.method3748();
		}
		local12 = this.aClass154_47;
		synchronized (this.aClass154_47) {
			this.aClass154_47.method3748();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)Lclient!fr;")
	public Class80 method5049(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_46;
		@Pc(16) Class80 local16;
		synchronized (this.aClass154_46) {
			local16 = (Class80) this.aClass154_46.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_76.method1555(36, arg0);
		local16 = new Class80();
		local16.aClass211_3 = this;
		local16.anInt2045 = arg0;
		if (local33 != null) {
			local16.method1842(new Class2_Sub13(local33));
		}
		local16.method1850();
		@Pc(67) Class154 local67 = this.aClass154_46;
		synchronized (this.aClass154_46) {
			this.aClass154_46.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public void method5050() {
		@Pc(6) Class154 local6 = this.aClass154_46;
		synchronized (this.aClass154_46) {
			this.aClass154_46.method3758(5);
		}
		local6 = this.aClass154_47;
		synchronized (this.aClass154_47) {
			this.aClass154_47.method3758(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	public void method5052() {
		@Pc(6) Class154 local6 = this.aClass154_46;
		synchronized (this.aClass154_46) {
			this.aClass154_46.method3746();
		}
		local6 = this.aClass154_47;
		synchronized (this.aClass154_47) {
			this.aClass154_47.method3746();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
	public void method5054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass154_46 = new Class154(arg0);
		this.aClass154_47 = new Class154(arg1);
	}
}
