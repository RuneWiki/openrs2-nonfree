import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class79 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public int anInt1729 = -1;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public int anInt1730 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIILclient!ec;)V")
	private void method1710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt1730 = arg2.method4021();
		} else if (arg1 == 2) {
			this.anIntArray244 = new int[arg2.method3972()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray244.length; local34++) {
				this.anIntArray244[local34] = arg2.method4021();
			}
		} else if (arg1 == 3) {
			this.anInt1729 = arg2.method3972();
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BILclient!ec;)V")
	public void method1712(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method3972();
			if (local9 == 0) {
				return;
			}
			this.method1710(arg0, local9, arg1);
		}
	}
}
