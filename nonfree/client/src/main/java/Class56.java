import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class56 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public int anInt1074 = 2048;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	public int anInt1072 = 2048;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	public int anInt1069 = 0;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public int anInt1076 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!wq;)V")
	private void method1078(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.anInt1069 = arg1.method7291();
		} else if (arg0 == 2) {
			this.anInt1074 = arg1.method7333();
		} else if (arg0 == 3) {
			this.anInt1072 = arg1.method7333();
		} else if (arg0 == 4) {
			this.anInt1076 = arg1.method7303();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!wq;)V")
	public void method1079(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method7291();
			if (local16 == 0) {
				return;
			}
			this.method1078(local16, arg0);
		}
	}
}
