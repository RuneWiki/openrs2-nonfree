import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class104 {

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Lclient!rl;")
	private final Class317 aClass317_17 = new Class317(64);

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!rg;")
	private final Class310 aClass310_36;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class104(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_36 = arg2;
		if (this.aClass310_36 != null) {
			this.aClass310_36.method7773(11);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
	public void method2171() {
		@Pc(6) Class317 local6 = this.aClass317_17;
		synchronized (this.aClass317_17) {
			this.aClass317_17.method7870(5);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	public void method2172() {
		@Pc(2) Class317 local2 = this.aClass317_17;
		synchronized (this.aClass317_17) {
			this.aClass317_17.method7874();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZ)Lclient!fa;")
	public Class108 method2173(@OriginalArg(0) int arg0) {
		@Pc(14) Class317 local14 = this.aClass317_17;
		@Pc(24) Class108 local24;
		synchronized (this.aClass317_17) {
			local24 = (Class108) this.aClass317_17.method7882((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class310 local38 = this.aClass310_36;
		@Pc(47) byte[] local47;
		synchronized (this.aClass310_36) {
			local47 = this.aClass310_36.method7803(arg0, 11);
		}
		local24 = new Class108();
		if (local47 != null) {
			local24.method2203(new Class14_Sub21(local47));
		}
		@Pc(71) Class317 local71 = this.aClass317_17;
		synchronized (this.aClass317_17) {
			this.aClass317_17.method7875((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public void method2175() {
		@Pc(11) Class317 local11 = this.aClass317_17;
		synchronized (this.aClass317_17) {
			this.aClass317_17.method7873();
		}
	}
}
