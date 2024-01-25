import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class41 {

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public int anInt1092 = -1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	public int anInt1091 = -1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!ug;IB)V")
	private void method1000(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1092 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anIntArray53 = new int[arg0.method5337()];
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray53.length; local41++) {
				this.anIntArray53[local41] = arg0.method5335();
			}
		} else if (arg1 == 3) {
			this.anInt1091 = arg0.method5337();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ug;)V")
	public void method1001(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5337();
			if (local9 == 0) {
				return;
			}
			this.method1000(arg0, local9);
		}
	}
}
