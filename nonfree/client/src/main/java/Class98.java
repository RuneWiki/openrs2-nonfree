import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class98 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!lga;")
	private final Class207 aClass207_11 = new Class207(128);

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!sea;")
	private final Class308 aClass308_55;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class98(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_55 = arg2;
		if (this.aClass308_55 != null) {
			@Pc(20) int local20 = this.aClass308_55.method6564() - 1;
			this.aClass308_55.method6568(local20);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)Lclient!iq;")
	public Class162 method2399(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_11;
		@Pc(16) Class162 local16;
		synchronized (this.aClass207_11) {
			local16 = (Class162) this.aClass207_11.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass308_55.method6569(Static538.method6119(arg0), Static449.method6301(arg0));
		local16 = new Class162();
		if (local37 != null) {
			local16.method3392(new Class1_Sub3(local37));
		}
		@Pc(53) Class207 local53 = this.aClass207_11;
		synchronized (this.aClass207_11) {
			this.aClass207_11.method4391((long) arg0, local16);
			return local16;
		}
	}
}
