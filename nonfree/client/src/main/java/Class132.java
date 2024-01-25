import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class132 {

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!hn;")
	private final Class102 aClass102_24 = new Class102(64);

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!fo;")
	private final Class82 aClass82_51;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class132(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_51 = arg2;
		this.aClass82_51.method1823(5);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lclient!fg;")
	public Class1_Sub5_Sub5 method2939(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_24;
		@Pc(24) Class1_Sub5_Sub5 local24;
		synchronized (this.aClass102_24) {
			local24 = (Class1_Sub5_Sub5) this.aClass102_24.method2258((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class82 local37 = this.aClass82_51;
		@Pc(46) byte[] local46;
		synchronized (this.aClass82_51) {
			local46 = this.aClass82_51.method1817(5, arg0);
		}
		local24 = new Class1_Sub5_Sub5();
		if (local46 != null) {
			local24.method1710(new Class1_Sub28(local46));
		}
		local6 = this.aClass102_24;
		synchronized (this.aClass102_24) {
			this.aClass102_24.method2272((long) arg0, local24);
			return local24;
		}
	}
}
