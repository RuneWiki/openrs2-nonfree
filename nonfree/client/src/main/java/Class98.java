import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class98 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
	public int anInt2817 = 0;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
	public int anInt2816 = 2048;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
	public int anInt2815 = 2048;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
	public int anInt2820 = 0;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!so;B)V")
	public void method2331(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method2332(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!so;II)V")
	private void method2332(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2820 = arg0.method5866();
		} else if (arg1 == 2) {
			this.anInt2816 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt2815 = arg0.method5900();
		} else if (arg1 == 4) {
			this.anInt2817 = arg0.method5890();
		}
	}
}
