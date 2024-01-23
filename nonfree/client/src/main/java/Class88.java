import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class88 {

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public int anInt2537 = -1;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public int anInt2538 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILclient!jj;)V")
	public void method2131(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method3122();
			if (local9 == 0) {
				return;
			}
			this.method2135(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!jj;III)V")
	private void method2135(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2538 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anIntArray303 = new int[arg0.method3122()];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray303.length; local24++) {
				this.anIntArray303[local24] = arg0.method3107();
			}
		} else if (arg1 == 3) {
			this.anInt2537 = arg0.method3122();
		}
	}
}
