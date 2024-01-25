import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class263 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!lga;")
	private final Class207 aClass207_43 = new Class207(64);

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!sea;")
	private final Class308 aClass308_140;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class263(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_140 = arg2;
		if (this.aClass308_140 != null) {
			this.aClass308_140.method6568(11);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public void method5590() {
		@Pc(2) Class207 local2 = this.aClass207_43;
		synchronized (this.aClass207_43) {
			this.aClass207_43.method4397(5);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Lclient!fd;")
	public Class94 method5592(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_43;
		@Pc(16) Class94 local16;
		synchronized (this.aClass207_43) {
			local16 = (Class94) this.aClass207_43.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_140;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_140) {
			local38 = this.aClass308_140.method6569(11, arg0);
		}
		local16 = new Class94();
		if (local38 != null) {
			local16.method2326(new Class1_Sub3(local38));
		}
		@Pc(65) Class207 local65 = this.aClass207_43;
		synchronized (this.aClass207_43) {
			this.aClass207_43.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public void method5595() {
		@Pc(10) Class207 local10 = this.aClass207_43;
		synchronized (this.aClass207_43) {
			this.aClass207_43.method4398();
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public void method5597() {
		@Pc(2) Class207 local2 = this.aClass207_43;
		synchronized (this.aClass207_43) {
			this.aClass207_43.method4392();
		}
	}
}
