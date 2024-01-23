import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class80 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public int anInt2333 = -1;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	public int anInt2338 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!wm;I)V")
	public void method2004(@OriginalArg(1) Class2_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4261();
			if (local5 == 0) {
				return;
			}
			this.method2005(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!wm;III)V")
	private void method2005(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2338 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anIntArray163 = new int[arg0.method4261()];
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray163.length; local28++) {
				this.anIntArray163[local28] = arg0.method4242();
			}
		} else if (arg1 == 3) {
			this.anInt2333 = arg0.method4261();
		}
	}
}
