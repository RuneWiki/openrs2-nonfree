import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class277 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!jr;")
	private final Class169 aClass169_48 = new Class169(64);

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!in;")
	private final Class157 aClass157_229;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class277(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_229 = arg2;
		this.aClass157_229.method4561(31);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method7113() {
		@Pc(2) Class169 local2 = this.aClass169_48;
		synchronized (this.aClass169_48) {
			this.aClass169_48.method5006();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lclient!u;")
	public Class334 method7114(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_48;
		@Pc(16) Class334 local16;
		synchronized (this.aClass169_48) {
			local16 = (Class334) this.aClass169_48.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_229;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_229) {
			local38 = this.aClass157_229.method4564(31, arg0);
		}
		local16 = new Class334();
		if (local38 != null) {
			local16.method8315(new Class2_Sub11(local38));
		}
		@Pc(68) Class169 local68 = this.aClass169_48;
		synchronized (this.aClass169_48) {
			this.aClass169_48.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	public void method7115() {
		@Pc(2) Class169 local2 = this.aClass169_48;
		synchronized (this.aClass169_48) {
			this.aClass169_48.method4997(5);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public void method7116() {
		@Pc(2) Class169 local2 = this.aClass169_48;
		synchronized (this.aClass169_48) {
			this.aClass169_48.method5009();
		}
	}
}
