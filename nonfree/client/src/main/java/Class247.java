import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class247 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	public int anInt6989;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public int anInt6990;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt6991;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method6101(@OriginalArg(1) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar6 = Static223.method3822(arg0.method7720());
		} else if (arg1 == 2) {
			this.anInt6990 = arg0.method7717(-1978450544);
			this.anInt6989 = arg0.method7695(107);
			this.anInt6991 = arg0.method7695(107);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!jc;)V")
	public void method6104(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7695(96);
			if (local17 == 0) {
				return;
			}
			this.method6101(arg0, local17);
		}
	}
}
