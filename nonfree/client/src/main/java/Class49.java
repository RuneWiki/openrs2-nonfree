import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class49 {

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!pja;")
	private final Class279 aClass279_6 = new Class279(128);

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!gj;")
	private final Class143 aClass143_14;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class49(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_14 = arg2;
		if (this.aClass143_14 != null) {
			@Pc(20) int local20 = this.aClass143_14.method3116() - 1;
			this.aClass143_14.method3123(local20);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!qw;")
	public Class300 method1528(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_6;
		@Pc(16) Class300 local16;
		synchronized (this.aClass279_6) {
			local16 = (Class300) this.aClass279_6.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass143_14.method3125(Static140.method2434(arg0), Static211.method8185(arg0));
		local16 = new Class300();
		if (local37 != null) {
			local16.method7151(new Class3_Sub17(local37));
		}
		@Pc(53) Class279 local53 = this.aClass279_6;
		synchronized (this.aClass279_6) {
			this.aClass279_6.method6635(local16, (long) arg0);
			return local16;
		}
	}
}
