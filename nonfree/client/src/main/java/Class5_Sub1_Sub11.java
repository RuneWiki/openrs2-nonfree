import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	public int anInt5648 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wq;B)V")
	private void method5066(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		if (arg0 == 2) {
			this.anInt5648 = arg1.method7333();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wq;)V")
	public void method5067(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7291();
			if (local12 == 0) {
				return;
			}
			this.method5066(local12, arg0);
		}
	}
}
