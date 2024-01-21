import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class4_Sub2_Sub9 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
	public int anInt1305 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!s;Z)V")
	public void method816(@OriginalArg(0) Class4_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1474();
			if (local5 == 0) {
				return;
			}
			this.method817(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILclient!s;)V")
	private void method817(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub16 arg1) {
		if (arg0 == 5) {
			this.anInt1305 = arg1.method1490();
		}
	}
}
