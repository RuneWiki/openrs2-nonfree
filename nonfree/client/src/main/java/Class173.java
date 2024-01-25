import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class173 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!tb;")
	private final Class313 aClass313_27 = new Class313(128);

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!pl;")
	private final Class259 aClass259_76;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class173(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_76 = arg2;
		this.aClass259_76.method5969(1);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method3819() {
		@Pc(2) Class313 local2 = this.aClass313_27;
		synchronized (this.aClass313_27) {
			this.aClass313_27.method6983();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public void method3821() {
		@Pc(6) Class313 local6 = this.aClass313_27;
		synchronized (this.aClass313_27) {
			this.aClass313_27.method6982(5);
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public void method3823() {
		@Pc(2) Class313 local2 = this.aClass313_27;
		synchronized (this.aClass313_27) {
			this.aClass313_27.method6977();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZI)Lclient!gda;")
	public Class121 method3825(@OriginalArg(1) int arg0) {
		@Pc(13) Class313 local13 = this.aClass313_27;
		@Pc(23) Class121 local23;
		synchronized (this.aClass313_27) {
			local23 = (Class121) this.aClass313_27.method6989((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class259 local36 = this.aClass259_76;
		@Pc(45) byte[] local45;
		synchronized (this.aClass259_76) {
			local45 = this.aClass259_76.method5985(arg0, 1);
		}
		local23 = new Class121();
		if (local45 != null) {
			local23.method2889(new Class2_Sub15(local45));
		}
		@Pc(67) Class313 local67 = this.aClass313_27;
		synchronized (this.aClass313_27) {
			this.aClass313_27.method6980((long) arg0, local23);
			return local23;
		}
	}
}
