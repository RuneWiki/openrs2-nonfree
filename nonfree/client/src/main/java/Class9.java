import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class9 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!hm;")
	private final Class136 aClass136_5 = new Class136(128);

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_5;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class9(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_5 = arg2;
		if (this.aClass251_5 != null) {
			@Pc(20) int local20 = this.aClass251_5.method5755() - 1;
			this.aClass251_5.method5768(local20);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Lclient!cl;")
	public Class49 method207(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_5;
		@Pc(25) Class49 local25;
		synchronized (this.aClass136_5) {
			local25 = (Class49) this.aClass136_5.method3473((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(46) byte[] local46 = this.aClass251_5.method5772(Static72.method1440(arg0), Static340.method5271(arg0));
		local25 = new Class49();
		if (local46 != null) {
			local25.method1304(new Class6_Sub21(local46));
		}
		local6 = this.aClass136_5;
		synchronized (this.aClass136_5) {
			this.aClass136_5.method3482((long) arg0, local25);
			return local25;
		}
	}
}
