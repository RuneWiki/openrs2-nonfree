import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class166 {

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public int anInt4554 = 1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method4038(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3118();
			if (local5 == 0) {
				return;
			}
			this.method4039(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qh;II)V")
	private void method4039(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static88.method1974(arg0.method3096());
		} else if (arg1 == 2) {
			this.anInt4554 = 0;
		}
	}
}
