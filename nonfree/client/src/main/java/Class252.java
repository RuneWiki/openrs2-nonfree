import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class252 {

	@OriginalMember(owner = "client!us", name = "i", descriptor = "Lclient!jk;")
	private final Class137 aClass137_56 = new Class137(128);

	@OriginalMember(owner = "client!us", name = "d", descriptor = "Lclient!qn;")
	private final Class211 aClass211_93;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class252(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_93 = arg2;
		if (this.aClass211_93 != null) {
			@Pc(20) int local20 = this.aClass211_93.method4368() - 1;
			this.aClass211_93.method4365(local20);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)Lclient!st;")
	public Class233 method5639(@OriginalArg(0) int arg0) {
		@Pc(14) Class137 local14 = this.aClass137_56;
		@Pc(24) Class233 local24;
		synchronized (this.aClass137_56) {
			local24 = (Class233) this.aClass137_56.method2744((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass211_93.method4377(Static377.method3112(arg0), Static363.method4508(arg0));
		local24 = new Class233();
		if (local45 != null) {
			local24.method4919(new Class4_Sub9(local45));
		}
		@Pc(61) Class137 local61 = this.aClass137_56;
		synchronized (this.aClass137_56) {
			this.aClass137_56.method2732((long) arg0, local24);
			return local24;
		}
	}
}
