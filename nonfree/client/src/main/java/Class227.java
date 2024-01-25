import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class227 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public int anInt5940 = -1;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public int anInt5939 = -1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!fh;)V")
	private void method4734(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt5940 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anIntArray467 = new int[arg1.method5007()];
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray467.length; local40++) {
				this.anIntArray467[local40] = arg1.method5028();
			}
		} else if (arg0 == 3) {
			this.anInt5939 = arg1.method5007();
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!fh;)V")
	public void method4735(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method4734(local5, arg0);
		}
	}
}
