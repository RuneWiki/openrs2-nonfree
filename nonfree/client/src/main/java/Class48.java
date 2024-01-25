import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class48 {

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Lclient!sw;")
	private final Class277 aClass277_13 = new Class277(64);

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!dn;")
	private final Class69 aClass69_17;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class48(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_17 = arg2;
		if (this.aClass69_17 != null) {
			this.aClass69_17.method1884(35);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public void method1523() {
		@Pc(14) Class277 local14 = this.aClass277_13;
		synchronized (this.aClass277_13) {
			this.aClass277_13.method7026();
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public void method1524() {
		@Pc(6) Class277 local6 = this.aClass277_13;
		synchronized (this.aClass277_13) {
			this.aClass277_13.method7019();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)Lclient!dk;")
	public Class67 method1527(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_13;
		@Pc(16) Class67 local16;
		synchronized (this.aClass277_13) {
			local16 = (Class67) this.aClass277_13.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class69 local34 = this.aClass69_17;
		@Pc(43) byte[] local43;
		synchronized (this.aClass69_17) {
			local43 = this.aClass69_17.method1888(arg0, 35);
		}
		local16 = new Class67();
		if (local43 != null) {
			local16.method1834(new Class1_Sub17(local43));
		}
		local16.method1838();
		@Pc(68) Class277 local68 = this.aClass277_13;
		synchronized (this.aClass277_13) {
			this.aClass277_13.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public void method1528() {
		@Pc(6) Class277 local6 = this.aClass277_13;
		synchronized (this.aClass277_13) {
			this.aClass277_13.method7018(5);
		}
	}
}
