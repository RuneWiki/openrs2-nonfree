import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class221 {

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "Lclient!jp;")
	private Class129 aClass129_56 = new Class129(64);

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!jp;")
	public Class129 aClass129_57 = new Class129(64);

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!pc;")
	public final Class188 aClass188_100;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "Lclient!pc;")
	private final Class188 aClass188_101;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;Lclient!pc;)V")
	public Class221(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class188 arg3) {
		this.aClass188_100 = arg3;
		this.aClass188_101 = arg2;
		this.aClass188_101.method4285(34);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public void method5013() {
		@Pc(2) Class129 local2 = this.aClass129_56;
		synchronized (this.aClass129_56) {
			this.aClass129_56.method3028(5);
		}
		local2 = this.aClass129_57;
		synchronized (this.aClass129_57) {
			this.aClass129_57.method3028(5);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lclient!gq;")
	public Class99 method5014(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_56;
		@Pc(16) Class99 local16;
		synchronized (this.aClass129_56) {
			local16 = (Class99) this.aClass129_56.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_101.method4283(34, arg0);
		local16 = new Class99();
		local16.aClass221_1 = this;
		if (local33 != null) {
			local16.method2012(new Class2_Sub20(local33));
		}
		@Pc(57) Class129 local57 = this.aClass129_56;
		synchronized (this.aClass129_56) {
			this.aClass129_56.method3029(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
	public void method5016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass129_56 = new Class129(arg0);
		this.aClass129_57 = new Class129(arg1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public void method5017() {
		@Pc(7) Class129 local7 = this.aClass129_56;
		synchronized (this.aClass129_56) {
			this.aClass129_56.method3026();
		}
		local7 = this.aClass129_57;
		synchronized (this.aClass129_57) {
			this.aClass129_57.method3026();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	public void method5019() {
		@Pc(6) Class129 local6 = this.aClass129_56;
		synchronized (this.aClass129_56) {
			this.aClass129_56.method3025();
		}
		local6 = this.aClass129_57;
		synchronized (this.aClass129_57) {
			this.aClass129_57.method3025();
		}
	}
}
