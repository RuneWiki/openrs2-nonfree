import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class331 {

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "Lclient!rl;")
	private final Class317 aClass317_61 = new Class317(64);

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "Lclient!rg;")
	private final Class310 aClass310_108;

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
	public final int anInt9369;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class331(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_108 = arg2;
		this.anInt9369 = this.aClass310_108.method7773(19);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)Lclient!vha;")
	public Class376 method8080(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_61;
		@Pc(22) Class376 local22;
		synchronized (this.aClass317_61) {
			local22 = (Class376) this.aClass317_61.method7882((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class310 local36 = this.aClass310_108;
		@Pc(45) byte[] local45;
		synchronized (this.aClass310_108) {
			local45 = this.aClass310_108.method7803(arg0, 19);
		}
		local22 = new Class376();
		if (local45 != null) {
			local22.method9072(new Class14_Sub21(local45));
		}
		@Pc(69) Class317 local69 = this.aClass317_61;
		synchronized (this.aClass317_61) {
			this.aClass317_61.method7875((long) arg0, local22);
			return local22;
		}
	}
}
