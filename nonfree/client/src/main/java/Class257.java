import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class257 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt7646 = -1;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt7648 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method6623(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method6626(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method6626(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7646 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anIntArray467 = new int[arg0.method4225()];
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray467.length; local42++) {
				this.anIntArray467[local42] = arg0.method4221();
			}
		} else if (arg1 == 3) {
			this.anInt7648 = arg0.method4225();
			return;
		}
	}
}
