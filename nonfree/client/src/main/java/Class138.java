import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class138 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!hn;")
	private final Class102 aClass102_25 = new Class102(64);

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!fo;")
	private final Class82 aClass82_52;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	public final int anInt3904;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class138(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_52 = arg2;
		this.anInt3904 = this.aClass82_52.method1823(19);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Lclient!et;")
	public Class70 method3186(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_25;
		@Pc(16) Class70 local16;
		synchronized (this.aClass102_25) {
			local16 = (Class70) this.aClass102_25.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_52;
		@Pc(38) byte[] local38;
		synchronized (this.aClass82_52) {
			local38 = this.aClass82_52.method1817(19, arg0);
		}
		local16 = new Class70();
		if (local38 != null) {
			local16.method1558(new Class1_Sub28(local38));
		}
		@Pc(66) Class102 local66 = this.aClass102_25;
		synchronized (this.aClass102_25) {
			this.aClass102_25.method2272((long) arg0, local16);
			return local16;
		}
	}
}
