import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public int anInt1472;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	public int anInt1473;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	public int anInt1481;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!me;II)V")
	private void method955(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1472 = arg0.method1397();
			this.anInt1481 = arg0.method1402();
			this.anInt1473 = arg0.method1402();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!me;)V")
	public void method958(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(21) int local21 = arg0.method1402();
			if (local21 == 0) {
				return;
			}
			this.method955(arg0, local21);
		}
	}
}
