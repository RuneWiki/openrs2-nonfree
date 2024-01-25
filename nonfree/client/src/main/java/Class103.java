import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class103 {

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
	public int anInt2754;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!wq;BI)V")
	private void method2566(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static92.method8227(arg0.method7318());
		} else if (arg1 == 2) {
			this.anInt2756 = arg0.method7333();
			this.anInt2752 = arg0.method7291();
			this.anInt2754 = arg0.method7291();
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method2567(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7291();
			if (local9 == 0) {
				return;
			}
			this.method2566(arg0, local9);
		}
	}
}
