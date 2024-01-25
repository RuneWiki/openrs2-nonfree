import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class223 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!hn;")
	private final Class102 aClass102_47 = new Class102(64);

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!fo;")
	private final Class82 aClass82_86;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class223(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_86 = arg2;
		if (this.aClass82_86 != null) {
			this.aClass82_86.method1823(35);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public void method4917() {
		@Pc(12) Class102 local12 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2271();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)V")
	public void method4918() {
		@Pc(2) Class102 local2 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2262(5);
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	public void method4919() {
		@Pc(2) Class102 local2 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2260();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lclient!be;")
	public Class20 method4921(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_47;
		@Pc(16) Class20 local16;
		synchronized (this.aClass102_47) {
			local16 = (Class20) this.aClass102_47.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_86;
		@Pc(38) byte[] local38;
		synchronized (this.aClass82_86) {
			local38 = this.aClass82_86.method1817(35, arg0);
		}
		local16 = new Class20();
		if (local38 != null) {
			local16.method362(new Class1_Sub28(local38));
		}
		local16.method363();
		@Pc(63) Class102 local63 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2272((long) arg0, local16);
			return local16;
		}
	}
}
