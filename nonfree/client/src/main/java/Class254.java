import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class254 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public int anInt7808 = -1;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	public int anInt7811 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!tn;)V")
	public void method6542(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8401();
			if (local9 == 0) {
				return;
			}
			this.method6543(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!tn;II)V")
	private void method6543(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7811 = arg0.method8414();
		} else if (arg1 == 2) {
			this.anIntArray482 = new int[arg0.method8401()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray482.length; local34++) {
				this.anIntArray482[local34] = arg0.method8414();
			}
		} else if (arg1 == 3) {
			this.anInt7808 = arg0.method8401();
			return;
		}
	}
}
