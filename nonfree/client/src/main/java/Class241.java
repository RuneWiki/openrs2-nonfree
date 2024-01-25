import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class241 {

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_50 = new Class288(128);

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "Lclient!gp;")
	private final Class117 aClass117_163;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class241(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_163 = arg2;
		if (this.aClass117_163 != null) {
			@Pc(20) int local20 = this.aClass117_163.method2972() - 1;
			this.aClass117_163.method2951(local20);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZ)Lclient!rh;")
	public Class254 method5714(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_50;
		@Pc(16) Class254 local16;
		synchronized (this.aClass288_50) {
			local16 = (Class254) this.aClass288_50.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass117_163.method2962(Static529.method7231(arg0), Static208.method3364(arg0));
		local16 = new Class254();
		if (local37 != null) {
			local16.method6090(new Class5_Sub3(local37));
		}
		@Pc(53) Class288 local53 = this.aClass288_50;
		synchronized (this.aClass288_50) {
			this.aClass288_50.method6746(local16, (long) arg0);
			return local16;
		}
	}
}
