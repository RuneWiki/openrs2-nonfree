import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class25 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!mq;")
	private final Class154 aClass154_1 = new Class154(64);

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!fc;")
	private final Class71 aClass71_10;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	public final int anInt617;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class25(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_10 = arg2;
		if (this.aClass71_10 == null) {
			this.anInt617 = 0;
		} else {
			this.anInt617 = this.aClass71_10.method1580(16);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	public void method676() {
		@Pc(2) Class154 local2 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3758(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public void method677() {
		@Pc(2) Class154 local2 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3748();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method678() {
		@Pc(13) Class154 local13 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3746();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Lclient!gk;")
	public Class87 method681(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_1;
		@Pc(16) Class87 local16;
		synchronized (this.aClass154_1) {
			local16 = (Class87) this.aClass154_1.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass71_10.method1555(16, arg0);
		local16 = new Class87();
		if (local39 != null) {
			local16.method2161(new Class2_Sub13(local39));
		}
		@Pc(55) Class154 local55 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3745((long) arg0, local16);
			return local16;
		}
	}
}
