import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class372 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!eda;")
	public final Class87 aClass87_246 = new Class87(20);

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!eda;")
	private final Class87 aClass87_247 = new Class87(64);

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!la;")
	private final Class207 aClass207_129;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!la;")
	public final Class207 aClass207_128;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;)V")
	public Class372(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3) {
		this.aClass207_129 = arg2;
		this.aClass207_128 = arg3;
		this.aClass207_129.method4672(46);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method8808() {
		@Pc(2) Class87 local2 = this.aClass87_247;
		synchronized (this.aClass87_247) {
			this.aClass87_247.method1801();
		}
		local2 = this.aClass87_246;
		synchronized (this.aClass87_246) {
			this.aClass87_246.method1801();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lclient!ij;")
	public Class163 method8809(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_247;
		@Pc(16) Class163 local16;
		synchronized (this.aClass87_247) {
			local16 = (Class163) this.aClass87_247.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_129;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_129) {
			local38 = this.aClass207_129.method4681(46, arg0);
		}
		local16 = new Class163();
		local16.aClass372_1 = this;
		if (local38 != null) {
			local16.method3905(new Class5_Sub22(local38));
		}
		@Pc(63) Class87 local63 = this.aClass87_247;
		synchronized (this.aClass87_247) {
			this.aClass87_247.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public void method8810() {
		@Pc(6) Class87 local6 = this.aClass87_247;
		synchronized (this.aClass87_247) {
			this.aClass87_247.method1793(5);
		}
		local6 = this.aClass87_246;
		synchronized (this.aClass87_246) {
			this.aClass87_246.method1793(5);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public void method8811() {
		@Pc(2) Class87 local2 = this.aClass87_247;
		synchronized (this.aClass87_247) {
			this.aClass87_247.method1796();
		}
		local2 = this.aClass87_246;
		synchronized (this.aClass87_246) {
			this.aClass87_246.method1796();
		}
	}
}
