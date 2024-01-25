import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class372 {

	@OriginalMember(owner = "client!wia", name = "g", descriptor = "[I")
	public int[] anIntArray709;

	@OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
	public int anInt10942 = -1;

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public int anInt10938 = -1;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!cea;B)V")
	public void method9134(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8383();
			if (local9 == 0) {
				return;
			}
			this.method9135(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method9135(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10938 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anIntArray709 = new int[arg0.method8383()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray709.length; local34++) {
				this.anIntArray709[local34] = arg0.method8326();
			}
		} else if (arg1 == 3) {
			this.anInt10942 = arg0.method8383();
		}
	}
}
