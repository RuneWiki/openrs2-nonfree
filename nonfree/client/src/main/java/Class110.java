import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class110 {

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!eda;")
	private final Class87 aClass87_84 = new Class87(64);

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Lclient!la;")
	private final Class207 aClass207_35;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public final int anInt2639;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class110(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_35 = arg2;
		if (this.aClass207_35 == null) {
			this.anInt2639 = 0;
		} else {
			this.anInt2639 = this.aClass207_35.method4672(16);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Lclient!gk;")
	public Class127 method2242(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_84;
		@Pc(16) Class127 local16;
		synchronized (this.aClass87_84) {
			local16 = (Class127) this.aClass87_84.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_35;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_35) {
			local38 = this.aClass207_35.method4681(16, arg0);
		}
		local16 = new Class127();
		if (local38 != null) {
			local16.method2797(new Class5_Sub22(local38));
		}
		@Pc(68) Class87 local68 = this.aClass87_84;
		synchronized (this.aClass87_84) {
			this.aClass87_84.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public void method2244() {
		@Pc(2) Class87 local2 = this.aClass87_84;
		synchronized (this.aClass87_84) {
			this.aClass87_84.method1796();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
	public void method2247() {
		@Pc(10) Class87 local10 = this.aClass87_84;
		synchronized (this.aClass87_84) {
			this.aClass87_84.method1793(5);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public void method2248() {
		@Pc(11) Class87 local11 = this.aClass87_84;
		synchronized (this.aClass87_84) {
			this.aClass87_84.method1801();
		}
	}
}
