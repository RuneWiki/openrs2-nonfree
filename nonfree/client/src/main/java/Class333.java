import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class333 {

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Lclient!eda;")
	private Class87 aClass87_218 = new Class87(64);

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Lclient!eda;")
	public Class87 aClass87_219 = new Class87(64);

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Lclient!la;")
	public final Class207 aClass207_112;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "Lclient!la;")
	private final Class207 aClass207_113;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;)V")
	public Class333(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3) {
		this.aClass207_112 = arg3;
		this.aClass207_113 = arg2;
		this.aClass207_113.method4672(34);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method7931() {
		@Pc(6) Class87 local6 = this.aClass87_218;
		synchronized (this.aClass87_218) {
			this.aClass87_218.method1796();
		}
		local6 = this.aClass87_219;
		synchronized (this.aClass87_219) {
			this.aClass87_219.method1796();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public void method7933() {
		@Pc(6) Class87 local6 = this.aClass87_218;
		synchronized (this.aClass87_218) {
			this.aClass87_218.method1801();
		}
		local6 = this.aClass87_219;
		synchronized (this.aClass87_219) {
			this.aClass87_219.method1801();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
	public void method7935() {
		@Pc(2) Class87 local2 = this.aClass87_218;
		synchronized (this.aClass87_218) {
			this.aClass87_218.method1793(5);
		}
		local2 = this.aClass87_219;
		synchronized (this.aClass87_219) {
			this.aClass87_219.method1793(5);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)Lclient!ui;")
	public Class348 method7937(@OriginalArg(0) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_218;
		@Pc(16) Class348 local16;
		synchronized (this.aClass87_218) {
			local16 = (Class348) this.aClass87_218.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_113;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_113) {
			local38 = this.aClass207_113.method4681(34, arg0);
		}
		local16 = new Class348();
		local16.aClass333_3 = this;
		if (local38 != null) {
			local16.method8241(new Class5_Sub22(local38));
		}
		@Pc(68) Class87 local68 = this.aClass87_218;
		synchronized (this.aClass87_218) {
			this.aClass87_218.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)V")
	public void method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass87_218 = new Class87(arg0);
		this.aClass87_219 = new Class87(arg1);
	}
}
