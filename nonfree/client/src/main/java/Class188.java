import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class188 {

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public int anInt5730 = -1;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public int anInt5731 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!bg;I)V")
	public void method4902(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method4532();
			if (local9 == 0) {
				return;
			}
			this.method4903(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!bg;ZII)V")
	private void method4903(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5730 = arg0.method4556();
		} else if (arg1 == 2) {
			this.anIntArray480 = new int[arg0.method4532()];
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray480.length; local38++) {
				this.anIntArray480[local38] = arg0.method4556();
			}
		} else if (arg1 == 3) {
			this.anInt5731 = arg0.method4532();
			return;
		}
	}
}
