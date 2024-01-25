import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class171 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!mq;")
	private final Class154 aClass154_32 = new Class154(16);

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!fc;")
	private final Class71 aClass71_61;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class171(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_61 = arg2;
		this.aClass71_61.method1580(30);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method4048() {
		@Pc(2) Class154 local2 = this.aClass154_32;
		synchronized (this.aClass154_32) {
			this.aClass154_32.method3748();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public void method4049() {
		@Pc(8) Class154 local8 = this.aClass154_32;
		synchronized (this.aClass154_32) {
			this.aClass154_32.method3758(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)Lclient!cm;")
	public Class36 method4050(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_32;
		@Pc(16) Class36 local16;
		synchronized (this.aClass154_32) {
			local16 = (Class36) this.aClass154_32.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_61.method1555(30, arg0);
		local16 = new Class36();
		if (local33 != null) {
			local16.method896(new Class2_Sub13(local33));
		}
		@Pc(49) Class154 local49 = this.aClass154_32;
		synchronized (this.aClass154_32) {
			this.aClass154_32.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public void method4052() {
		@Pc(6) Class154 local6 = this.aClass154_32;
		synchronized (this.aClass154_32) {
			this.aClass154_32.method3746();
		}
	}
}
