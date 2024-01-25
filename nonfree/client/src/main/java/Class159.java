import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class159 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!jk;")
	private final Class137 aClass137_43 = new Class137(64);

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Lclient!qn;")
	private final Class211 aClass211_60;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class159(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_60 = arg2;
		this.aClass211_60.method4365(5);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)Lclient!ct;")
	public Class4_Sub2_Sub7 method3063(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_43;
		@Pc(16) Class4_Sub2_Sub7 local16;
		synchronized (this.aClass137_43) {
			local16 = (Class4_Sub2_Sub7) this.aClass137_43.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_60;
		@Pc(47) byte[] local47;
		synchronized (this.aClass211_60) {
			local47 = this.aClass211_60.method4377(5, arg0);
		}
		local16 = new Class4_Sub2_Sub7();
		if (local47 != null) {
			local16.method864(new Class4_Sub9(local47));
		}
		@Pc(69) Class137 local69 = this.aClass137_43;
		synchronized (this.aClass137_43) {
			this.aClass137_43.method2732((long) arg0, local16);
			return local16;
		}
	}
}
