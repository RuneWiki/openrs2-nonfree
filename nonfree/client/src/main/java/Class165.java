import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class165 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!jp;")
	private Class129 aClass129_44 = new Class129(64);

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!pc;")
	private final Class188 aClass188_68;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class165(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_68 = arg2;
		if (this.aClass188_68 != null) {
			@Pc(20) int local20 = this.aClass188_68.method4299() - 1;
			this.aClass188_68.method4285(local20);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	public void method3910() {
		@Pc(6) Class129 local6 = this.aClass129_44;
		synchronized (this.aClass129_44) {
			this.aClass129_44.method3028(5);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public void method3912() {
		@Pc(6) Class129 local6 = this.aClass129_44;
		synchronized (this.aClass129_44) {
			this.aClass129_44.method3025();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)Lclient!co;")
	public Class39 method3913(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_44;
		@Pc(16) Class39 local16;
		synchronized (this.aClass129_44) {
			local16 = (Class39) this.aClass129_44.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass188_68.method4283(Static19.method261(arg0), Static116.method1711(arg0));
		local16 = new Class39();
		if (local37 != null) {
			local16.method1139(new Class2_Sub20(local37));
		}
		@Pc(61) Class129 local61 = this.aClass129_44;
		synchronized (this.aClass129_44) {
			this.aClass129_44.method3029(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public void method3914() {
		@Pc(2) Class129 local2 = this.aClass129_44;
		synchronized (this.aClass129_44) {
			this.aClass129_44.method3026();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
	public void method3915(@OriginalArg(0) int arg0) {
		@Pc(10) Class129 local10 = this.aClass129_44;
		synchronized (this.aClass129_44) {
			this.aClass129_44.method3025();
			this.aClass129_44 = new Class129(arg0);
		}
	}
}
