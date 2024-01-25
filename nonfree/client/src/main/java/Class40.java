import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class40 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!hn;")
	private final Class102 aClass102_11 = new Class102(128);

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Lclient!fo;")
	private final Class82 aClass82_16;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class40(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_16 = arg2;
		if (this.aClass82_16 != null) {
			@Pc(20) int local20 = this.aClass82_16.method1825() - 1;
			this.aClass82_16.method1823(local20);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)Lclient!lh;")
	public Class144 method983(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_11;
		@Pc(16) Class144 local16;
		synchronized (this.aClass102_11) {
			local16 = (Class144) this.aClass102_11.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass82_16.method1817(Static210.method3092(arg0), Static122.method1925(arg0));
		local16 = new Class144();
		if (local37 != null) {
			local16.method3280(new Class1_Sub28(local37));
		}
		@Pc(58) Class102 local58 = this.aClass102_11;
		synchronized (this.aClass102_11) {
			this.aClass102_11.method2272((long) arg0, local16);
			return local16;
		}
	}
}
