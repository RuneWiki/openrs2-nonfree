import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class146 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
	public int[] anIntArray402;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public int anInt4518 = -1;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public int anInt4516 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!cg;III)V")
	private void method3565(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4518 = arg0.method2691();
		} else if (arg2 == 2) {
			this.anIntArray402 = new int[arg0.method2690()];
			for (@Pc(39) int local39 = 0; local39 < this.anIntArray402.length; local39++) {
				this.anIntArray402[local39] = arg0.method2691();
			}
		} else if (arg2 == 3) {
			this.anInt4516 = arg0.method2690();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZILclient!cg;)V")
	public void method3566(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method2690();
			if (local15 == 0) {
				return;
			}
			this.method3565(arg1, arg0, local15);
		}
	}
}
