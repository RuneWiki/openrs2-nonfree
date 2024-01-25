import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class252 {

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!eda;")
	private final Class87 aClass87_159 = new Class87(64);

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!la;")
	private final Class207 aClass207_79;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!la;")
	public final Class207 aClass207_80;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;)V")
	public Class252(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3) {
		this.aClass207_79 = arg2;
		this.aClass207_80 = arg3;
		this.aClass207_79.method4672(3);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)Lclient!gi;")
	public Class124 method5617(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_159;
		@Pc(16) Class124 local16;
		synchronized (this.aClass87_159) {
			local16 = (Class124) this.aClass87_159.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_79) {
			local38 = this.aClass207_79.method4681(3, arg0);
		}
		local16 = new Class124();
		local16.aClass252_1 = this;
		if (local38 != null) {
			local16.method2788(new Class5_Sub22(local38));
		}
		@Pc(70) Class87 local70 = this.aClass87_159;
		synchronized (this.aClass87_159) {
			this.aClass87_159.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
	public void method5618() {
		@Pc(2) Class87 local2 = this.aClass87_159;
		synchronized (this.aClass87_159) {
			this.aClass87_159.method1793(5);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	public void method5619() {
		@Pc(6) Class87 local6 = this.aClass87_159;
		synchronized (this.aClass87_159) {
			this.aClass87_159.method1801();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method5620() {
		@Pc(13) Class87 local13 = this.aClass87_159;
		synchronized (this.aClass87_159) {
			this.aClass87_159.method1796();
		}
	}
}
