import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class156 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "Lclient!mq;")
	private final Class154 aClass154_30 = new Class154(64);

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!fc;")
	private final Class71 aClass71_56;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class156(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_56 = arg2;
		this.aClass71_56.method1580(31);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)Lclient!vj;")
	public Class238 method3773(@OriginalArg(0) int arg0) {
		@Pc(14) Class154 local14 = this.aClass154_30;
		@Pc(24) Class238 local24;
		synchronized (this.aClass154_30) {
			local24 = (Class238) this.aClass154_30.method3751((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass71_56.method1555(31, arg0);
		local24 = new Class238();
		if (local41 != null) {
			local24.method5545(new Class2_Sub13(local41));
		}
		@Pc(57) Class154 local57 = this.aClass154_30;
		synchronized (this.aClass154_30) {
			this.aClass154_30.method3745((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public void method3774() {
		@Pc(14) Class154 local14 = this.aClass154_30;
		synchronized (this.aClass154_30) {
			this.aClass154_30.method3748();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
	public void method3775() {
		@Pc(2) Class154 local2 = this.aClass154_30;
		synchronized (this.aClass154_30) {
			this.aClass154_30.method3758(5);
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
	public void method3776() {
		@Pc(2) Class154 local2 = this.aClass154_30;
		synchronized (this.aClass154_30) {
			this.aClass154_30.method3746();
		}
	}
}
