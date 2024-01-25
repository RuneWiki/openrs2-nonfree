import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class215 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public int anInt5427 = 2048;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
	public int anInt5424 = 0;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	public int anInt5429 = 2048;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public int anInt5426 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ofa;II)V")
	private void method4864(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5426 = arg0.method5966();
		} else if (arg1 == 2) {
			this.anInt5429 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt5427 = arg0.method5968();
		} else if (arg1 == 4) {
			this.anInt5424 = arg0.method5956();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method4865(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5966();
			if (local5 == 0) {
				return;
			}
			this.method4864(arg0, local5);
		}
	}
}
