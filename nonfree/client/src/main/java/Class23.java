import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class23 {

	@OriginalMember(owner = "client!au", name = "h", descriptor = "Lclient!eda;")
	private final Class87 aClass87_16 = new Class87(128);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_7;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class23(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_7 = arg2;
		this.aClass207_7.method4672(1);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)Lclient!rc;")
	public Class297 method312(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_16;
		@Pc(16) Class297 local16;
		synchronized (this.aClass87_16) {
			local16 = (Class297) this.aClass87_16.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_7;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_7) {
			local38 = this.aClass207_7.method4681(1, arg0);
		}
		local16 = new Class297();
		if (local38 != null) {
			local16.method7019(new Class5_Sub22(local38));
		}
		@Pc(65) Class87 local65 = this.aClass87_16;
		synchronized (this.aClass87_16) {
			this.aClass87_16.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public void method313() {
		@Pc(6) Class87 local6 = this.aClass87_16;
		synchronized (this.aClass87_16) {
			this.aClass87_16.method1796();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public void method316() {
		@Pc(2) Class87 local2 = this.aClass87_16;
		synchronized (this.aClass87_16) {
			this.aClass87_16.method1793(5);
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
	public void method317() {
		@Pc(8) Class87 local8 = this.aClass87_16;
		synchronized (this.aClass87_16) {
			this.aClass87_16.method1801();
		}
	}
}
