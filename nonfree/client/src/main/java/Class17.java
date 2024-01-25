import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class Class17 {

	@OriginalMember(owner = "client!aka", name = "f", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!aka", name = "d", descriptor = "I")
	public int anInt385 = -1;

	@OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
	public int anInt387 = -1;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!ol;)V")
	public void method404(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method5203();
			if (local18 == 0) {
				return;
			}
			this.method405(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!ol;BI)V")
	private void method405(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt387 = arg0.method5211();
		} else if (arg1 == 2) {
			this.anIntArray37 = new int[arg0.method5203()];
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray37.length; local46++) {
				this.anIntArray37[local46] = arg0.method5211();
			}
		} else if (arg1 == 3) {
			this.anInt385 = arg0.method5203();
			return;
		}
	}
}
