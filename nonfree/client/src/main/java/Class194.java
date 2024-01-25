import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class194 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!mq;")
	private final Class154 aClass154_42 = new Class154(64);

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "Lclient!mq;")
	public final Class154 aClass154_43 = new Class154(2);

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!fc;")
	private final Class71 aClass71_73;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!fc;")
	public final Class71 aClass71_72;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;Lclient!fc;)V")
	public Class194(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3) {
		this.aClass71_73 = arg2;
		this.aClass71_72 = arg3;
		this.aClass71_73.method1580(33);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method4725() {
		@Pc(14) Class154 local14 = this.aClass154_42;
		synchronized (this.aClass154_42) {
			this.aClass154_42.method3748();
		}
		local14 = this.aClass154_43;
		synchronized (this.aClass154_43) {
			this.aClass154_43.method3748();
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method4726() {
		@Pc(2) Class154 local2 = this.aClass154_42;
		synchronized (this.aClass154_42) {
			this.aClass154_42.method3746();
		}
		local2 = this.aClass154_43;
		synchronized (this.aClass154_43) {
			this.aClass154_43.method3746();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lclient!h;")
	public Class94 method4729(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_42;
		@Pc(16) Class94 local16;
		synchronized (this.aClass154_42) {
			local16 = (Class94) this.aClass154_42.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_73.method1555(33, arg0);
		local16 = new Class94();
		local16.aClass194_1 = this;
		if (local33 != null) {
			local16.method2258(new Class2_Sub13(local33));
		}
		@Pc(52) Class154 local52 = this.aClass154_42;
		synchronized (this.aClass154_42) {
			this.aClass154_42.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V")
	public void method4730() {
		@Pc(2) Class154 local2 = this.aClass154_42;
		synchronized (this.aClass154_42) {
			this.aClass154_42.method3758(5);
		}
		local2 = this.aClass154_43;
		synchronized (this.aClass154_43) {
			this.aClass154_43.method3758(5);
		}
	}
}
