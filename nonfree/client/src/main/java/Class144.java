import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class144 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	public int[] anIntArray498;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	public int anInt4461 = -1;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public int anInt4465 = -1;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!fh;I)V")
	public void method3824(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method3826(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!fh;I)V")
	private void method3826(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4461 = arg1.method1879();
		} else if (arg0 == 2) {
			this.anIntArray498 = new int[arg1.method1853()];
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray498.length; local22++) {
				this.anIntArray498[local22] = arg1.method1879();
			}
		} else if (arg0 == 3) {
			this.anInt4465 = arg1.method1853();
		}
	}
}
