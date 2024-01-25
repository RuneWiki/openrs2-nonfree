import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class25 {

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method481(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2380();
			if (local14 == 0) {
				return;
			}
			this.method482(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!tq;B)V")
	private void method482(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt455 = arg1.method2404();
			this.anInt453 = arg1.method2380();
			this.anInt457 = arg1.method2380();
		}
	}
}
