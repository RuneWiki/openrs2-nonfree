import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class100 {

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public int anInt2681;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	public int anInt2686;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBLclient!tl;)V")
	private void method2013(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt2681 = arg1.method4877();
			this.anInt2683 = arg1.method4864();
			this.anInt2686 = arg1.method4864();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLclient!tl;)V")
	public void method2015(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4864();
			if (local17 == 0) {
				return;
			}
			this.method2013(local17, arg0);
		}
	}
}
