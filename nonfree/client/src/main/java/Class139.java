import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class139 {

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!eda;")
	private final Class87 aClass87_104 = new Class87(64);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_48;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class139(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_48 = arg2;
		if (this.aClass207_48 != null) {
			this.aClass207_48.method4672(35);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method3546() {
		@Pc(2) Class87 local2 = this.aClass87_104;
		synchronized (this.aClass87_104) {
			this.aClass87_104.method1796();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Lclient!mh;")
	public Class231 method3547(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_104;
		@Pc(16) Class231 local16;
		synchronized (this.aClass87_104) {
			local16 = (Class231) this.aClass87_104.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_48;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_48) {
			local38 = this.aClass207_48.method4681(35, arg0);
		}
		local16 = new Class231();
		if (local38 != null) {
			local16.method5121(new Class5_Sub22(local38));
		}
		local16.method5122();
		@Pc(65) Class87 local65 = this.aClass87_104;
		synchronized (this.aClass87_104) {
			this.aClass87_104.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public void method3548() {
		@Pc(2) Class87 local2 = this.aClass87_104;
		synchronized (this.aClass87_104) {
			this.aClass87_104.method1801();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public void method3549() {
		@Pc(2) Class87 local2 = this.aClass87_104;
		synchronized (this.aClass87_104) {
			this.aClass87_104.method1793(5);
		}
	}
}
