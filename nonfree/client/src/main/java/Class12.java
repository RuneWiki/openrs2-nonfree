import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	public int anInt370 = -1;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	public int anInt375 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!bk;Z)V")
	public void method394(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method1832();
			if (local15 == 0) {
				return;
			}
			this.method395(local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBLclient!bk;)V")
	private void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub1 arg2) {
		if (arg0 == 1) {
			this.anInt370 = arg2.method1845();
		} else if (arg0 == 2) {
			this.anIntArray14 = new int[arg2.method1832()];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray14.length; local31++) {
				this.anIntArray14[local31] = arg2.method1845();
			}
		} else if (arg0 == 3) {
			this.anInt375 = arg2.method1832();
		}
	}
}
