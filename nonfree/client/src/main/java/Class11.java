import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class11 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!ka;")
	private final Class132 aClass132_2 = new Class132(128);

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!dk;")
	private final Class54 aClass54_4;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class11(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_4 = arg2;
		if (this.aClass54_4 != null) {
			@Pc(20) int local20 = this.aClass54_4.method1107() - 1;
			this.aClass54_4.method1123(local20);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Lclient!ui;")
	public Class244 method172(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_2;
		@Pc(16) Class244 local16;
		synchronized (this.aClass132_2) {
			local16 = (Class244) this.aClass132_2.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass54_4.method1126(Static398.method5066(arg0), Static275.method3688(arg0));
		local16 = new Class244();
		if (local37 != null) {
			local16.method5159(new Class2_Sub13(local37));
		}
		@Pc(58) Class132 local58 = this.aClass132_2;
		synchronized (this.aClass132_2) {
			this.aClass132_2.method2711(local16, (long) arg0);
			return local16;
		}
	}
}
