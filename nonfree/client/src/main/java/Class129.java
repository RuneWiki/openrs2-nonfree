import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class129 {

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!jk;")
	private final Class137 aClass137_33 = new Class137(16);

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!qn;")
	private final Class211 aClass211_47;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class129(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_47 = arg2;
		this.aClass211_47.method4365(30);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
	public void method2468() {
		@Pc(6) Class137 local6 = this.aClass137_33;
		synchronized (this.aClass137_33) {
			this.aClass137_33.method2739();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public void method2469() {
		@Pc(2) Class137 local2 = this.aClass137_33;
		synchronized (this.aClass137_33) {
			this.aClass137_33.method2737();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V")
	public void method2470() {
		@Pc(6) Class137 local6 = this.aClass137_33;
		synchronized (this.aClass137_33) {
			this.aClass137_33.method2745(5);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lclient!ou;")
	public Class193 method2472(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_33;
		@Pc(16) Class193 local16;
		synchronized (this.aClass137_33) {
			local16 = (Class193) this.aClass137_33.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_47;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_47) {
			local38 = this.aClass211_47.method4377(30, arg0);
		}
		local16 = new Class193();
		if (local38 != null) {
			local16.method3847(new Class4_Sub9(local38));
		}
		@Pc(66) Class137 local66 = this.aClass137_33;
		synchronized (this.aClass137_33) {
			this.aClass137_33.method2732((long) arg0, local16);
			return local16;
		}
	}
}
