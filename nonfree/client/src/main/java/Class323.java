import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class323 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!lga;")
	private final Class207 aClass207_53 = new Class207(64);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!sea;")
	private final Class308 aClass308_175;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!sea;")
	public final Class308 aClass308_176;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;Lclient!sea;)V")
	public Class323(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Class308 arg3) {
		this.aClass308_175 = arg2;
		this.aClass308_176 = arg3;
		this.aClass308_175.method6568(3);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)Lclient!tt;")
	public Class326 method7153(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_53;
		@Pc(16) Class326 local16;
		synchronized (this.aClass207_53) {
			local16 = (Class326) this.aClass207_53.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class308 local34 = this.aClass308_175;
		@Pc(43) byte[] local43;
		synchronized (this.aClass308_175) {
			local43 = this.aClass308_175.method6569(3, arg0);
		}
		local16 = new Class326();
		local16.aClass323_2 = this;
		if (local43 != null) {
			local16.method7167(new Class1_Sub3(local43));
		}
		@Pc(68) Class207 local68 = this.aClass207_53;
		synchronized (this.aClass207_53) {
			this.aClass207_53.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method7154() {
		@Pc(6) Class207 local6 = this.aClass207_53;
		synchronized (this.aClass207_53) {
			this.aClass207_53.method4392();
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
	public void method7156() {
		@Pc(2) Class207 local2 = this.aClass207_53;
		synchronized (this.aClass207_53) {
			this.aClass207_53.method4397(5);
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
	public void method7158() {
		@Pc(6) Class207 local6 = this.aClass207_53;
		synchronized (this.aClass207_53) {
			this.aClass207_53.method4398();
		}
	}
}
