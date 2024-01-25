import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class325 {

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "[I")
	public int[] anIntArray627;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
	public int anInt8611 = -1;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
	public int anInt8612 = -1;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!es;I)V")
	public void method7193(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4325();
			if (local10 == 0) {
				return;
			}
			this.method7194(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!es;II)V")
	private void method7194(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8611 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anIntArray627 = new int[arg0.method4325()];
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray627.length; local41++) {
				this.anIntArray627[local41] = arg0.method4294();
			}
		} else if (arg1 == 3) {
			this.anInt8612 = arg0.method4325();
		}
	}
}
