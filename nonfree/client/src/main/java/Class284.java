import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class284 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!lga;")
	private final Class207 aClass207_46 = new Class207(64);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Lclient!sea;")
	private final Class308 aClass308_153;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class284(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_153 = arg2;
		if (this.aClass308_153 != null) {
			this.aClass308_153.method6568(35);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public void method6121() {
		@Pc(2) Class207 local2 = this.aClass207_46;
		synchronized (this.aClass207_46) {
			this.aClass207_46.method4392();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public void method6123() {
		@Pc(6) Class207 local6 = this.aClass207_46;
		synchronized (this.aClass207_46) {
			this.aClass207_46.method4398();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lclient!wi;")
	public Class361 method6124(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_46;
		@Pc(16) Class361 local16;
		synchronized (this.aClass207_46) {
			local16 = (Class361) this.aClass207_46.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_153;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_153) {
			local38 = this.aClass308_153.method6569(35, arg0);
		}
		local16 = new Class361();
		if (local38 != null) {
			local16.method7810(new Class1_Sub3(local38));
		}
		local16.method7811();
		@Pc(65) Class207 local65 = this.aClass207_46;
		synchronized (this.aClass207_46) {
			this.aClass207_46.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
	public void method6125() {
		@Pc(2) Class207 local2 = this.aClass207_46;
		synchronized (this.aClass207_46) {
			this.aClass207_46.method4397(5);
		}
	}
}
