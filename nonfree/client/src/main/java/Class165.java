import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class165 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
	public int[] anIntArray399;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public int anInt4806 = -1;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public int anInt4809 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!os;I)V")
	private void method4429(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4809 = arg0.method4494();
		} else if (arg1 == 2) {
			this.anIntArray399 = new int[arg0.method4487()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray399.length; local34++) {
				this.anIntArray399[local34] = arg0.method4494();
			}
		} else if (arg1 == 3) {
			this.anInt4806 = arg0.method4487();
			return;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!os;Z)V")
	public void method4433(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method4429(arg0, local5);
		}
	}
}
