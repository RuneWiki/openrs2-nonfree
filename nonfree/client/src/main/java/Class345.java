import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class345 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public int anInt9669;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public int anInt9670;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public int anInt9671;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!rba;)V")
	private void method8159(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt9671 = arg1.method5272();
			this.anInt9670 = arg1.method5322(-58);
			this.anInt9669 = arg1.method5322(-76);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!rba;Z)V")
	public void method8160(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5322(-103);
			if (local12 == 0) {
				return;
			}
			this.method8159(local12, arg0);
		}
	}
}
