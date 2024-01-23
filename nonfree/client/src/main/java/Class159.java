import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class159 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt4874 = 0;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	public int anInt4875 = 0;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public int anInt4883 = 2048;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
	public int anInt4882 = 2048;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!wm;II)V")
	private void method3942(@OriginalArg(1) Class2_Sub26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4875 = arg0.method4261();
		} else if (arg2 == 2) {
			this.anInt4882 = arg0.method4242();
		} else if (arg2 == 3) {
			this.anInt4883 = arg0.method4242();
		} else if (arg2 == 4) {
			this.anInt4874 = arg0.method4255();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!wm;)V")
	public void method3943(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method4261();
			if (local15 == 0) {
				return;
			}
			this.method3942(arg1, arg0, local15);
		}
	}
}
