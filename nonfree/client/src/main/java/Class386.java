import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class386 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public int anInt10651 = 0;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public int anInt10652 = 2048;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	public int anInt10654 = 2048;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public int anInt10655 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ib;II)V")
	private void method9169(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt10655 = arg0.method8529();
		} else if (arg1 == 2) {
			this.anInt10654 = arg0.method8519();
		} else if (arg1 == 3) {
			this.anInt10652 = arg0.method8519();
		} else if (arg1 == 4) {
			this.anInt10651 = arg0.method8516();
			return;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method9170(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8529();
			if (local12 == 0) {
				return;
			}
			this.method9169(arg0, local12);
		}
	}
}
