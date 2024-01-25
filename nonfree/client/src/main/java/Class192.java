import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class192 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!dc;")
	private final Class44 aClass44_41 = new Class44(128);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!he;")
	private final Class100 aClass100_57;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class192(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_57 = arg2;
		if (this.aClass100_57 != null) {
			@Pc(20) int local20 = this.aClass100_57.method2516() - 1;
			this.aClass100_57.method2523(local20);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lclient!fn;")
	public Class79 method4482(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_41;
		@Pc(16) Class79 local16;
		synchronized (this.aClass44_41) {
			local16 = (Class79) this.aClass44_41.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass100_57.method2520(Static102.method1832(arg0), Static109.method4309(arg0));
		local16 = new Class79();
		if (local39 != null) {
			local16.method2015(new Class6_Sub1(local39));
		}
		@Pc(60) Class44 local60 = this.aClass44_41;
		synchronized (this.aClass44_41) {
			this.aClass44_41.method1349(local16, (long) arg0);
			return local16;
		}
	}
}
