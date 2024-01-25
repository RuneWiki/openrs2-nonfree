import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class50 {

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!rl;")
	private final Class317 aClass317_3 = new Class317(128);

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!rg;")
	private final Class310 aClass310_12;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class50(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_12 = arg2;
		this.aClass310_12.method7773(1);
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	public void method1017() {
		@Pc(2) Class317 local2 = this.aClass317_3;
		synchronized (this.aClass317_3) {
			this.aClass317_3.method7873();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public void method1018() {
		@Pc(6) Class317 local6 = this.aClass317_3;
		synchronized (this.aClass317_3) {
			this.aClass317_3.method7870(5);
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)Lclient!hd;")
	public Class148 method1019(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_3;
		@Pc(16) Class148 local16;
		synchronized (this.aClass317_3) {
			local16 = (Class148) this.aClass317_3.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class310 local38 = this.aClass310_12;
		@Pc(47) byte[] local47;
		synchronized (this.aClass310_12) {
			local47 = this.aClass310_12.method7803(arg0, 1);
		}
		local16 = new Class148();
		if (local47 != null) {
			local16.method3275(new Class14_Sub21(local47));
		}
		@Pc(71) Class317 local71 = this.aClass317_3;
		synchronized (this.aClass317_3) {
			this.aClass317_3.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method1020() {
		@Pc(10) Class317 local10 = this.aClass317_3;
		synchronized (this.aClass317_3) {
			this.aClass317_3.method7874();
		}
	}
}
