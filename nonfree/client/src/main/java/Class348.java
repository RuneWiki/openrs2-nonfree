import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class348 {

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
	public int anInt9605 = 2048;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	public int anInt9604 = 2048;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public int anInt9607 = 0;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public int anInt9608 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method8277(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4225();
			if (local9 == 0) {
				return;
			}
			this.method8278(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method8278(@OriginalArg(1) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9608 = arg0.method4225();
		} else if (arg1 == 2) {
			this.anInt9604 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt9605 = arg0.method4221();
		} else if (arg1 == 4) {
			this.anInt9607 = arg0.method4209();
		}
	}
}
