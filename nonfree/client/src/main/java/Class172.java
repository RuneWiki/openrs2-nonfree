import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class172 {

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "Lclient!oo;")
	private final Class264 aClass264_30 = new Class264(128);

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "Lclient!wia;")
	private final Class386 aClass386_68;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class172(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_68 = arg2;
		if (this.aClass386_68 != null) {
			@Pc(20) int local20 = this.aClass386_68.method9189() - 1;
			this.aClass386_68.method9210(local20);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Lclient!cm;")
	public Class61 method3783(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_30;
		@Pc(16) Class61 local16;
		synchronized (this.aClass264_30) {
			local16 = (Class61) this.aClass264_30.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass386_68.method9196(Static272.method3963(arg0), Static306.method4482(arg0));
		local16 = new Class61();
		if (local42 != null) {
			local16.method1489(new Class14_Sub29(local42));
		}
		@Pc(58) Class264 local58 = this.aClass264_30;
		synchronized (this.aClass264_30) {
			this.aClass264_30.method6364((long) arg0, local16);
			return local16;
		}
	}
}
