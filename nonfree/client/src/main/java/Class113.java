import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class113 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!lga;")
	private Class207 aClass207_13 = new Class207(128);

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!lga;")
	public Class207 aClass207_14 = new Class207(64);

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!sea;")
	private final Class308 aClass308_64;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!sea;")
	public final Class308 aClass308_63;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;Lclient!sea;)V")
	public Class113(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Class308 arg3) {
		this.aClass308_64 = arg2;
		this.aClass308_63 = arg3;
		this.aClass308_64.method6568(36);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method2590() {
		@Pc(6) Class207 local6 = this.aClass207_13;
		synchronized (this.aClass207_13) {
			this.aClass207_13.method4392();
		}
		local6 = this.aClass207_14;
		synchronized (this.aClass207_14) {
			this.aClass207_14.method4392();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public void method2591() {
		@Pc(10) Class207 local10 = this.aClass207_13;
		synchronized (this.aClass207_13) {
			this.aClass207_13.method4398();
		}
		local10 = this.aClass207_14;
		synchronized (this.aClass207_14) {
			this.aClass207_14.method4398();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)V")
	public void method2593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass207_13 = new Class207(arg1);
		this.aClass207_14 = new Class207(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public void method2594() {
		@Pc(2) Class207 local2 = this.aClass207_13;
		synchronized (this.aClass207_13) {
			this.aClass207_13.method4397(5);
		}
		local2 = this.aClass207_14;
		synchronized (this.aClass207_14) {
			this.aClass207_14.method4397(5);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lclient!vda;")
	public Class345 method2595(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_13;
		@Pc(16) Class345 local16;
		synchronized (this.aClass207_13) {
			local16 = (Class345) this.aClass207_13.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_64;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_64) {
			local38 = this.aClass308_64.method6569(36, arg0);
		}
		local16 = new Class345();
		local16.anInt9191 = arg0;
		local16.aClass113_4 = this;
		if (local38 != null) {
			local16.method7490(new Class1_Sub3(local38));
		}
		local16.method7488();
		@Pc(69) Class207 local69 = this.aClass207_13;
		synchronized (this.aClass207_13) {
			this.aClass207_13.method4391((long) arg0, local16);
			return local16;
		}
	}
}
