import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class264 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!rl;")
	private final Class317 aClass317_47 = new Class317(64);

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!rg;")
	private final Class310 aClass310_92;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class264(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_92 = arg2;
		if (this.aClass310_92 != null) {
			this.aClass310_92.method7773(54);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lclient!ne;")
	public Class247 method6446(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_47;
		@Pc(16) Class247 local16;
		synchronized (this.aClass317_47) {
			local16 = (Class247) this.aClass317_47.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class310 local38 = this.aClass310_92;
		@Pc(47) byte[] local47;
		synchronized (this.aClass310_92) {
			local47 = this.aClass310_92.method7803(arg0, 54);
		}
		local16 = new Class247();
		if (local47 != null) {
			local16.method6104(new Class14_Sub21(local47));
		}
		@Pc(71) Class317 local71 = this.aClass317_47;
		synchronized (this.aClass317_47) {
			this.aClass317_47.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public void method6447() {
		@Pc(9) Class317 local9 = this.aClass317_47;
		synchronized (this.aClass317_47) {
			this.aClass317_47.method7874();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method6449() {
		@Pc(14) Class317 local14 = this.aClass317_47;
		synchronized (this.aClass317_47) {
			this.aClass317_47.method7873();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public void method6450() {
		@Pc(6) Class317 local6 = this.aClass317_47;
		synchronized (this.aClass317_47) {
			this.aClass317_47.method7870(5);
		}
	}
}
