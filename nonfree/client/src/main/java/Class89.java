import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class89 {

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Lclient!ff;")
	private final Class83 aClass83_17 = new Class83(256);

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Lclient!vh;")
	private final Class250 aClass250_24;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class89(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_24 = arg2;
		this.aClass250_24.method5653(26);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	public void method1809() {
		@Pc(2) Class83 local2 = this.aClass83_17;
		synchronized (this.aClass83_17) {
			this.aClass83_17.method1663(5);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public void method1811() {
		@Pc(6) Class83 local6 = this.aClass83_17;
		synchronized (this.aClass83_17) {
			this.aClass83_17.method1667();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
	public void method1813() {
		@Pc(2) Class83 local2 = this.aClass83_17;
		synchronized (this.aClass83_17) {
			this.aClass83_17.method1669();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)Lclient!ap;")
	public Class1_Sub2_Sub3 method1814(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_17;
		@Pc(16) Class1_Sub2_Sub3 local16;
		synchronized (this.aClass83_17) {
			local16 = (Class1_Sub2_Sub3) this.aClass83_17.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass250_24.method5667(arg0, 26);
		local16 = new Class1_Sub2_Sub3();
		if (local38 != null) {
			local16.method337(new Class1_Sub1(local38));
		}
		@Pc(54) Class83 local54 = this.aClass83_17;
		synchronized (this.aClass83_17) {
			this.aClass83_17.method1675((long) arg0, local16);
			return local16;
		}
	}
}
