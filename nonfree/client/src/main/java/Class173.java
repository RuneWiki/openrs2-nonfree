import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class173 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public int anInt5376 = 0;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public int anInt5379 = 2048;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public int anInt5378 = 2048;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	public int anInt5380 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!lf;II)V")
	public void method4621(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method4623(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!lf;I)V")
	private void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub11 arg2) {
		if (arg0 == 1) {
			this.anInt5376 = arg2.method3440();
		} else if (arg0 == 2) {
			this.anInt5379 = arg2.method3401();
		} else if (arg0 == 3) {
			this.anInt5378 = arg2.method3401();
		} else if (arg0 == 4) {
			this.anInt5380 = arg2.method3447();
		}
	}
}
