import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class145 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "Lclient!jr;")
	private final Class169 aClass169_30 = new Class169(128);

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_114;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class145(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_114 = arg2;
		if (this.aClass157_114 != null) {
			@Pc(20) int local20 = this.aClass157_114.method4568() - 1;
			this.aClass157_114.method4561(local20);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)Lclient!nd;")
	public Class218 method4404(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_30;
		@Pc(16) Class218 local16;
		synchronized (this.aClass169_30) {
			local16 = (Class218) this.aClass169_30.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass157_114.method4564(Static552.method8241(arg0), Static428.method5144(arg0));
		local16 = new Class218();
		if (local37 != null) {
			local16.method6194(new Class2_Sub11(local37));
		}
		@Pc(53) Class169 local53 = this.aClass169_30;
		synchronized (this.aClass169_30) {
			this.aClass169_30.method5001(local16, (long) arg0);
			return local16;
		}
	}
}
