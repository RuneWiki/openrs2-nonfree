import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class370 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!eda;")
	private Class87 aClass87_245 = new Class87(64);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_126;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class370(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_126 = arg2;
		if (this.aClass207_126 != null) {
			@Pc(20) int local20 = this.aClass207_126.method4685() - 1;
			this.aClass207_126.method4672(local20);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public void method8786() {
		@Pc(6) Class87 local6 = this.aClass87_245;
		synchronized (this.aClass87_245) {
			this.aClass87_245.method1793(5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Lclient!ta;")
	public Class324 method8787(@OriginalArg(0) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_245;
		@Pc(24) Class324 local24;
		synchronized (this.aClass87_245) {
			local24 = (Class324) this.aClass87_245.method1805((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class207 local37 = this.aClass207_126;
		@Pc(50) byte[] local50;
		synchronized (this.aClass207_126) {
			local50 = this.aClass207_126.method4681(Static353.method5269(arg0), Static82.method1383(arg0));
		}
		local24 = new Class324();
		if (local50 != null) {
			local24.method7828(new Class5_Sub22(local50));
		}
		@Pc(72) Class87 local72 = this.aClass87_245;
		synchronized (this.aClass87_245) {
			this.aClass87_245.method1792((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	public void method8788(@OriginalArg(0) int arg0) {
		@Pc(10) Class87 local10 = this.aClass87_245;
		synchronized (this.aClass87_245) {
			this.aClass87_245.method1801();
			this.aClass87_245 = new Class87(arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public void method8789() {
		@Pc(6) Class87 local6 = this.aClass87_245;
		synchronized (this.aClass87_245) {
			this.aClass87_245.method1801();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public void method8790() {
		@Pc(14) Class87 local14 = this.aClass87_245;
		synchronized (this.aClass87_245) {
			this.aClass87_245.method1796();
		}
	}
}
