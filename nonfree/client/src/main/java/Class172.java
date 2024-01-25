import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class172 {

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "Lclient!mq;")
	private final Class154 aClass154_33 = new Class154(64);

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!fc;")
	private final Class71 aClass71_62;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public final int anInt4649;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class172(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_62 = arg2;
		this.anInt4649 = this.aClass71_62.method1580(19);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)Lclient!am;")
	public Class11 method4077(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_33;
		@Pc(16) Class11 local16;
		synchronized (this.aClass154_33) {
			local16 = (Class11) this.aClass154_33.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_62.method1555(19, arg0);
		local16 = new Class11();
		if (local33 != null) {
			local16.method247(new Class2_Sub13(local33));
		}
		@Pc(54) Class154 local54 = this.aClass154_33;
		synchronized (this.aClass154_33) {
			this.aClass154_33.method3745((long) arg0, local16);
			return local16;
		}
	}
}
