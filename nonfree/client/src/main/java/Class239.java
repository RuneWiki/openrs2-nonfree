import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class239 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!jp;")
	private final Class129 aClass129_66 = new Class129(128);

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!pc;")
	private final Class188 aClass188_114;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class239(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_114 = arg2;
		this.aClass188_114.method4285(1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method5401() {
		@Pc(2) Class129 local2 = this.aClass129_66;
		synchronized (this.aClass129_66) {
			this.aClass129_66.method3026();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Lclient!hr;")
	public Class111 method5402(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_66;
		@Pc(16) Class111 local16;
		synchronized (this.aClass129_66) {
			local16 = (Class111) this.aClass129_66.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass188_114.method4283(1, arg0);
		local16 = new Class111();
		if (local40 != null) {
			local16.method2517(new Class2_Sub20(local40));
		}
		@Pc(56) Class129 local56 = this.aClass129_66;
		synchronized (this.aClass129_66) {
			this.aClass129_66.method3029(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public void method5403() {
		@Pc(6) Class129 local6 = this.aClass129_66;
		synchronized (this.aClass129_66) {
			this.aClass129_66.method3025();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(ZI)V")
	public void method5404() {
		@Pc(6) Class129 local6 = this.aClass129_66;
		synchronized (this.aClass129_66) {
			this.aClass129_66.method3028(5);
		}
	}
}
