import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	public int anInt4661 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!tl;)V")
	public void method3546(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method3549(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!tl;I)V")
	private void method3549(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1) {
		if (arg0 == 2) {
			this.anInt4661 = arg1.method4877();
		}
	}
}
