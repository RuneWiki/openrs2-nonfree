import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class366 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!lga;")
	private final Class207 aClass207_63 = new Class207(64);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!sea;")
	private final Class308 aClass308_198;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class366(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_198 = arg2;
		this.aClass308_198.method6568(5);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Lclient!qs;")
	public Class1_Sub8_Sub13 method7985(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_63;
		@Pc(16) Class1_Sub8_Sub13 local16;
		synchronized (this.aClass207_63) {
			local16 = (Class1_Sub8_Sub13) this.aClass207_63.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_198;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_198) {
			local38 = this.aClass308_198.method6569(5, arg0);
		}
		local16 = new Class1_Sub8_Sub13();
		if (local38 != null) {
			local16.method6194(new Class1_Sub3(local38));
		}
		@Pc(66) Class207 local66 = this.aClass207_63;
		synchronized (this.aClass207_63) {
			this.aClass207_63.method4391((long) arg0, local16);
			return local16;
		}
	}
}
