import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class40 {

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!mq;")
	private final Class154 aClass154_3 = new Class154(64);

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!fc;")
	public final Class71 aClass71_14;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!fc;")
	private final Class71 aClass71_13;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;Lclient!fc;)V")
	public Class40(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3) {
		this.aClass71_14 = arg3;
		this.aClass71_13 = arg2;
		this.aClass71_13.method1580(3);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZI)V")
	public void method913() {
		@Pc(2) Class154 local2 = this.aClass154_3;
		synchronized (this.aClass154_3) {
			this.aClass154_3.method3758(5);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Lclient!ce;")
	public Class31 method914(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_3;
		@Pc(16) Class31 local16;
		synchronized (this.aClass154_3) {
			local16 = (Class31) this.aClass154_3.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass71_13.method1555(3, arg0);
		local16 = new Class31();
		local16.aClass40_2 = this;
		if (local38 != null) {
			local16.method745(new Class2_Sub13(local38));
		}
		@Pc(57) Class154 local57 = this.aClass154_3;
		synchronized (this.aClass154_3) {
			this.aClass154_3.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public void method916() {
		@Pc(6) Class154 local6 = this.aClass154_3;
		synchronized (this.aClass154_3) {
			this.aClass154_3.method3748();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public void method917() {
		@Pc(2) Class154 local2 = this.aClass154_3;
		synchronized (this.aClass154_3) {
			this.aClass154_3.method3746();
		}
	}
}
