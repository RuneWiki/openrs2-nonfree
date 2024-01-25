import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class122 {

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!rp;")
	private final Class220 aClass220_20 = new Class220(128);

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!lt;")
	private final Class158 aClass158_34;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class122(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_34 = arg2;
		if (this.aClass158_34 != null) {
			@Pc(20) int local20 = this.aClass158_34.method3695() - 1;
			this.aClass158_34.method3683(local20);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)Lclient!kp;")
	public Class143 method2750(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_20;
		@Pc(16) Class143 local16;
		synchronized (this.aClass220_20) {
			local16 = (Class143) this.aClass220_20.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass158_34.method3672(Static393.method4739(arg0), Static339.method4784(arg0));
		local16 = new Class143();
		if (local37 != null) {
			local16.method3275(new Class6_Sub15(local37));
		}
		@Pc(53) Class220 local53 = this.aClass220_20;
		synchronized (this.aClass220_20) {
			this.aClass220_20.method4996(local16, (long) arg0);
			return local16;
		}
	}
}
