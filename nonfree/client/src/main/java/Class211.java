import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class211 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public int anInt5353;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
	public int anInt5354;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public int anInt5357;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!wq;)V")
	public void method4812(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7291();
			if (local12 == 0) {
				return;
			}
			this.method4813(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZLclient!wq;)V")
	private void method4813(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static92.method8227(arg1.method7318());
		} else if (arg0 == 3) {
			this.anInt5353 = arg1.method7333();
			this.anInt5354 = arg1.method7291();
			this.anInt5357 = arg1.method7291();
		}
	}
}
