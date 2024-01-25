import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class253 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[I")
	public int[] anIntArray539;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public int anInt6730 = -1;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public int anInt6734 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method5755(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3118();
			if (local15 == 0) {
				return;
			}
			this.method5758(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!qh;II)V")
	private void method5758(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6734 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anIntArray539 = new int[arg0.method3118()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray539.length; local26++) {
				this.anIntArray539[local26] = arg0.method3109();
			}
		} else if (arg1 == 3) {
			this.anInt6730 = arg0.method3118();
		}
	}
}
