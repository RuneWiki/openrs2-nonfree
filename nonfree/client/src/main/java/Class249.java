import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class249 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Lclient!sw;")
	private final Class277 aClass277_55 = new Class277(128);

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "Lclient!dn;")
	private final Class69 aClass69_80;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class249(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_80 = arg2;
		if (this.aClass69_80 != null) {
			@Pc(20) int local20 = this.aClass69_80.method1895() - 1;
			this.aClass69_80.method1884(local20);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)Lclient!jo;")
	public Class153 method6540(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_55;
		@Pc(16) Class153 local16;
		synchronized (this.aClass277_55) {
			local16 = (Class153) this.aClass277_55.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass69_80.method1888(Static412.method6505(arg0), Static251.method4512(arg0));
		local16 = new Class153();
		if (local39 != null) {
			local16.method4167(new Class1_Sub17(local39));
		}
		@Pc(55) Class277 local55 = this.aClass277_55;
		synchronized (this.aClass277_55) {
			this.aClass277_55.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
