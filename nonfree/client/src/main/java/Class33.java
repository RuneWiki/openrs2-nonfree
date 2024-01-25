import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class33 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!lga;")
	private Class207 aClass207_3 = new Class207(64);

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!lga;")
	public Class207 aClass207_4 = new Class207(64);

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Lclient!sea;")
	public final Class308 aClass308_19;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Lclient!sea;")
	private final Class308 aClass308_20;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;Lclient!sea;)V")
	public Class33(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Class308 arg3) {
		this.aClass308_19 = arg3;
		this.aClass308_20 = arg2;
		this.aClass308_20.method6568(34);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method790() {
		@Pc(6) Class207 local6 = this.aClass207_3;
		synchronized (this.aClass207_3) {
			this.aClass207_3.method4398();
		}
		local6 = this.aClass207_4;
		synchronized (this.aClass207_4) {
			this.aClass207_4.method4398();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public void method791() {
		@Pc(10) Class207 local10 = this.aClass207_3;
		synchronized (this.aClass207_3) {
			this.aClass207_3.method4392();
		}
		local10 = this.aClass207_4;
		synchronized (this.aClass207_4) {
			this.aClass207_4.method4392();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZII)V")
	public void method792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass207_3 = new Class207(arg1);
		this.aClass207_4 = new Class207(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)Lclient!cg;")
	public Class40 method794(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_3;
		@Pc(16) Class40 local16;
		synchronized (this.aClass207_3) {
			local16 = (Class40) this.aClass207_3.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_20;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_20) {
			local38 = this.aClass308_20.method6569(34, arg0);
		}
		local16 = new Class40();
		local16.aClass33_1 = this;
		if (local38 != null) {
			local16.method998(new Class1_Sub3(local38));
		}
		@Pc(69) Class207 local69 = this.aClass207_3;
		synchronized (this.aClass207_3) {
			this.aClass207_3.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V")
	public void method796() {
		@Pc(2) Class207 local2 = this.aClass207_3;
		synchronized (this.aClass207_3) {
			this.aClass207_3.method4397(5);
		}
		local2 = this.aClass207_4;
		synchronized (this.aClass207_4) {
			this.aClass207_4.method4397(5);
		}
	}
}
