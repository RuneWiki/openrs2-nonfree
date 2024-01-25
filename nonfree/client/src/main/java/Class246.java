import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class246 {

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!mq;")
	private final Class154 aClass154_54 = new Class154(64);

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public int anInt6641 = 0;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!fc;")
	private final Class71 aClass71_88;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public final int anInt6637;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class246(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_88 = arg2;
		this.anInt6637 = this.aClass71_88.method1580(4);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!hc;")
	public Class96 method5680(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_54;
		@Pc(16) Class96 local16;
		synchronized (this.aClass154_54) {
			local16 = (Class96) this.aClass154_54.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_88.method1555(4, arg0);
		local16 = new Class96();
		local16.aClass246_3 = this;
		local16.anInt2411 = arg0;
		if (local33 != null) {
			local16.method2283(new Class2_Sub13(local33));
		}
		local16.method2280();
		@Pc(58) Class154 local58 = this.aClass154_54;
		synchronized (this.aClass154_54) {
			this.aClass154_54.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method5682() {
		@Pc(6) Class154 local6 = this.aClass154_54;
		synchronized (this.aClass154_54) {
			this.aClass154_54.method3748();
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public void method5685() {
		@Pc(2) Class154 local2 = this.aClass154_54;
		synchronized (this.aClass154_54) {
			this.aClass154_54.method3746();
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
	public void method5686() {
		@Pc(2) Class154 local2 = this.aClass154_54;
		synchronized (this.aClass154_54) {
			this.aClass154_54.method3758(5);
		}
	}
}
