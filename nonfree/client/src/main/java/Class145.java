import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class145 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
	public int anInt4290 = 0;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
	public int anInt4289 = 2048;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
	public int anInt4293 = 2048;

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
	public int anInt4295 = 0;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!os;)V")
	private void method3992(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt4290 = arg1.method4487();
		} else if (arg0 == 2) {
			this.anInt4289 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt4293 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt4295 = arg1.method4447();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!os;)V")
	public void method3995(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4487();
			if (local14 == 0) {
				return;
			}
			this.method3992(local14, arg0);
		}
	}
}
