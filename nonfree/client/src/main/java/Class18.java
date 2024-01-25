import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class Class18 {

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Lclient!rl;")
	private Class317 aClass317_1 = new Class317(64);

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "Lclient!rg;")
	private final Class310 aClass310_5;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class18(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_5 = arg2;
		if (this.aClass310_5 != null) {
			@Pc(20) int local20 = this.aClass310_5.method7800() - 1;
			this.aClass310_5.method7773(local20);
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(II)V")
	public void method280(@OriginalArg(0) int arg0) {
		@Pc(11) Class317 local11 = this.aClass317_1;
		synchronized (this.aClass317_1) {
			this.aClass317_1.method7873();
			this.aClass317_1 = new Class317(arg0);
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(BI)Lclient!fd;")
	public Class112 method281(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_1;
		@Pc(16) Class112 local16;
		synchronized (this.aClass317_1) {
			local16 = (Class112) this.aClass317_1.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_5;
		@Pc(43) byte[] local43;
		synchronized (this.aClass310_5) {
			local43 = this.aClass310_5.method7803(Static74.method1224(arg0), Static161.method1393(arg0));
		}
		local16 = new Class112();
		if (local43 != null) {
			local16.method2241(new Class14_Sub21(local43));
		}
		@Pc(76) Class317 local76 = this.aClass317_1;
		synchronized (this.aClass317_1) {
			this.aClass317_1.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	public void method283() {
		@Pc(2) Class317 local2 = this.aClass317_1;
		synchronized (this.aClass317_1) {
			this.aClass317_1.method7873();
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V")
	public void method284() {
		@Pc(2) Class317 local2 = this.aClass317_1;
		synchronized (this.aClass317_1) {
			this.aClass317_1.method7874();
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(BI)V")
	public void method285() {
		@Pc(2) Class317 local2 = this.aClass317_1;
		synchronized (this.aClass317_1) {
			this.aClass317_1.method7870(5);
		}
	}
}
