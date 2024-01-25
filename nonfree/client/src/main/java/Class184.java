import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class184 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!mq;")
	private final Class154 aClass154_39 = new Class154(64);

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!fc;")
	private final Class71 aClass71_70;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class184(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_70 = arg2;
		if (this.aClass71_70 != null) {
			this.aClass71_70.method1580(11);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method4400() {
		@Pc(11) Class154 local11 = this.aClass154_39;
		synchronized (this.aClass154_39) {
			this.aClass154_39.method3748();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lclient!ei;")
	public Class61 method4403(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_39;
		@Pc(16) Class61 local16;
		synchronized (this.aClass154_39) {
			local16 = (Class61) this.aClass154_39.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_70.method1555(11, arg0);
		local16 = new Class61();
		if (local33 != null) {
			local16.method1398(new Class2_Sub13(local33));
		}
		@Pc(49) Class154 local49 = this.aClass154_39;
		synchronized (this.aClass154_39) {
			this.aClass154_39.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method4404() {
		@Pc(2) Class154 local2 = this.aClass154_39;
		synchronized (this.aClass154_39) {
			this.aClass154_39.method3746();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)V")
	public void method4408() {
		@Pc(2) Class154 local2 = this.aClass154_39;
		synchronized (this.aClass154_39) {
			this.aClass154_39.method3758(5);
		}
	}
}
