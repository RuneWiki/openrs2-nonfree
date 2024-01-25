import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class27 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public int anInt826;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!bk;I)V")
	private void method761(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt828 = arg0.method1845();
			this.anInt833 = arg0.method1832();
			this.anInt826 = arg0.method1832();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method763(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1832();
			if (local12 == 0) {
				return;
			}
			this.method761(arg0, local12);
		}
	}
}
