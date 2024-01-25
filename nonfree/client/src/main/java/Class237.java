import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class237 {

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "Lclient!iha;")
	private final Class168 aClass168_51 = new Class168(128);

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "Lclient!gda;")
	private final Class126 aClass126_166;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class237(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_166 = arg2;
		if (this.aClass126_166 != null) {
			@Pc(20) int local20 = this.aClass126_166.method3082() - 1;
			this.aClass126_166.method3062(local20);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)Lclient!ge;")
	public Class127 method5240(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_51;
		@Pc(16) Class127 local16;
		synchronized (this.aClass168_51) {
			local16 = (Class127) this.aClass168_51.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass126_166.method3086(Static527.method7215(arg0), Static57.method1025(arg0));
		local16 = new Class127();
		if (local38 != null) {
			local16.method3104(new Class5_Sub36(local38));
		}
		@Pc(67) Class168 local67 = this.aClass168_51;
		synchronized (this.aClass168_51) {
			this.aClass168_51.method3853((long) arg0, local16);
			return local16;
		}
	}
}
