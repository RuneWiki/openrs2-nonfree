import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class85 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public int anInt2893 = -1;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	public int anInt2897 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!gw;)V")
	public void method2696(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3043();
			if (local13 == 0) {
				return;
			}
			this.method2697(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method2697(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2897 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anIntArray229 = new int[arg0.method3043()];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray229.length; local29++) {
				this.anIntArray229[local29] = arg0.method3056();
			}
			return;
		} else if (arg1 == 3) {
			this.anInt2893 = arg0.method3043();
			return;
		}
	}
}
