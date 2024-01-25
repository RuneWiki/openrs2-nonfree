import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class253 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!jv;")
	private final Class126 aClass126_59 = new Class126(64);

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!bu;")
	private final Class32 aClass32_85;

	static {
		new Class167("", 73);
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class253(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_85 = arg2;
		if (this.aClass32_85 != null) {
			this.aClass32_85.method790(35);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lclient!ul;")
	public Class246 method5375(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_59;
		@Pc(16) Class246 local16;
		synchronized (this.aClass126_59) {
			local16 = (Class246) this.aClass126_59.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass32_85.method785(arg0, 35);
		local16 = new Class246();
		if (local38 != null) {
			local16.method5251(new Class3_Sub7(local38));
		}
		local16.method5252();
		@Pc(57) Class126 local57 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public void method5378() {
		@Pc(2) Class126 local2 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method3131();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public void method5379() {
		@Pc(6) Class126 local6 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method3135();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public void method5381() {
		@Pc(2) Class126 local2 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method3140(5);
		}
	}
}
