import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class108 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!mq;")
	private final Class154 aClass154_15 = new Class154(128);

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!fc;")
	private final Class71 aClass71_33;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class108(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_33 = arg2;
		this.aClass71_33.method1580(1);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public void method2462() {
		@Pc(6) Class154 local6 = this.aClass154_15;
		synchronized (this.aClass154_15) {
			this.aClass154_15.method3748();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public void method2463() {
		@Pc(6) Class154 local6 = this.aClass154_15;
		synchronized (this.aClass154_15) {
			this.aClass154_15.method3746();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public void method2464() {
		@Pc(2) Class154 local2 = this.aClass154_15;
		synchronized (this.aClass154_15) {
			this.aClass154_15.method3758(5);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lclient!oc;")
	public Class167 method2466(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_15;
		@Pc(16) Class167 local16;
		synchronized (this.aClass154_15) {
			local16 = (Class167) this.aClass154_15.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass71_33.method1555(1, arg0);
		local16 = new Class167();
		if (local38 != null) {
			local16.method3999(new Class2_Sub13(local38));
		}
		@Pc(56) Class154 local56 = this.aClass154_15;
		synchronized (this.aClass154_15) {
			this.aClass154_15.method3745((long) arg0, local16);
			return local16;
		}
	}
}
