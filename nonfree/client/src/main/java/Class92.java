import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class92 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!lga;")
	private final Class207 aClass207_10 = new Class207(128);

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!sea;")
	private final Class308 aClass308_51;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class92(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_51 = arg2;
		this.aClass308_51.method6568(1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Lclient!ij;")
	public Class157 method2279(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_10;
		@Pc(16) Class157 local16;
		synchronized (this.aClass207_10) {
			local16 = (Class157) this.aClass207_10.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_51;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_51) {
			local38 = this.aClass308_51.method6569(1, arg0);
		}
		local16 = new Class157();
		if (local38 != null) {
			local16.method3328(new Class1_Sub3(local38));
		}
		@Pc(60) Class207 local60 = this.aClass207_10;
		synchronized (this.aClass207_10) {
			this.aClass207_10.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public void method2280() {
		@Pc(6) Class207 local6 = this.aClass207_10;
		synchronized (this.aClass207_10) {
			this.aClass207_10.method4392();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public void method2284() {
		@Pc(12) Class207 local12 = this.aClass207_10;
		synchronized (this.aClass207_10) {
			this.aClass207_10.method4398();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method2285() {
		@Pc(2) Class207 local2 = this.aClass207_10;
		synchronized (this.aClass207_10) {
			this.aClass207_10.method4397(5);
		}
	}
}
