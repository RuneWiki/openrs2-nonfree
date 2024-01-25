import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class282 {

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "[I")
	public int[] anIntArray470;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	public int anInt7839 = -1;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
	public int anInt7841 = -1;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method6737(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method6738(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!ib;B)V")
	private void method6738(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt7841 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anIntArray470 = new int[arg1.method8529()];
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray470.length; local44++) {
				this.anIntArray470[local44] = arg1.method8519();
			}
		} else if (arg0 == 3) {
			this.anInt7839 = arg1.method8529();
		}
	}
}
