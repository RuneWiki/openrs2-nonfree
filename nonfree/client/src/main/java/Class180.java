import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class180 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public int anInt4500 = -1;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
	public int anInt4503 = -1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!es;B)V")
	public void method4068(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8865();
			if (local5 == 0) {
				return;
			}
			this.method4069(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!es;IB)V")
	private void method4069(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4500 = arg0.method8859();
		} else if (arg1 == 2) {
			this.anIntArray344 = new int[arg0.method8865()];
			for (@Pc(33) int local33 = 0; local33 < this.anIntArray344.length; local33++) {
				this.anIntArray344[local33] = arg0.method8859();
			}
		} else if (arg1 == 3) {
			this.anInt4503 = arg0.method8865();
		}
	}
}
