import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class322 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!rl;")
	private final Class317 aClass317_57 = new Class317(128);

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!rg;")
	private final Class310 aClass310_106;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class322(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_106 = arg2;
		if (this.aClass310_106 != null) {
			@Pc(20) int local20 = this.aClass310_106.method7800() - 1;
			this.aClass310_106.method7773(local20);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)Lclient!bea;")
	public Class33 method7940(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_57;
		@Pc(16) Class33 local16;
		synchronized (this.aClass317_57) {
			local16 = (Class33) this.aClass317_57.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass310_106.method7803(Static578.method8260(arg0), Static608.method8583(arg0));
		local16 = new Class33();
		if (local40 != null) {
			local16.method658(new Class14_Sub21(local40));
		}
		@Pc(58) Class317 local58 = this.aClass317_57;
		synchronized (this.aClass317_57) {
			this.aClass317_57.method7875((long) arg0, local16);
			return local16;
		}
	}
}
