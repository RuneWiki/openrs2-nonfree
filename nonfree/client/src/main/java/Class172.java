import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class172 {

	@OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	public int anInt4446 = -1;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "I")
	public int anInt4448 = -1;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!sv;IB)V")
	private void method3661(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4448 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anIntArray378 = new int[arg0.method3580()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray378.length; local19++) {
				this.anIntArray378[local19] = arg0.method3555();
			}
		} else if (arg1 == 3) {
			this.anInt4446 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!sv;)V")
	public void method3662(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3580();
			if (local7 == 0) {
				return;
			}
			this.method3661(arg0, local7);
		}
	}
}
