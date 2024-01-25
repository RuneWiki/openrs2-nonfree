import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class105 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!mq;")
	private final Class154 aClass154_13 = new Class154(128);

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Lclient!fc;")
	private final Class71 aClass71_31;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class105(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_31 = arg2;
		if (this.aClass71_31 != null) {
			@Pc(20) int local20 = this.aClass71_31.method1553() - 1;
			this.aClass71_31.method1580(local20);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)Lclient!fa;")
	public Class69 method2446(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_13;
		@Pc(16) Class69 local16;
		synchronized (this.aClass154_13) {
			local16 = (Class69) this.aClass154_13.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass71_31.method1555(Static1.method33(arg0), Static105.method1810(arg0));
		local16 = new Class69();
		if (local37 != null) {
			local16.method1533(new Class2_Sub13(local37));
		}
		@Pc(58) Class154 local58 = this.aClass154_13;
		synchronized (this.aClass154_13) {
			this.aClass154_13.method3745((long) arg0, local16);
			return local16;
		}
	}
}
