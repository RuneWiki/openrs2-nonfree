import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class350 {

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
	public int anInt9522 = 2048;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
	public int anInt9523 = 0;

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
	public int anInt9524 = 0;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	public int anInt9525 = 2048;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method7819(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9523 = arg0.method6015();
		} else if (arg1 == 2) {
			this.anInt9525 = arg0.method5982();
		} else if (arg1 == 3) {
			this.anInt9522 = arg0.method5982();
		} else if (arg1 == 4) {
			this.anInt9524 = arg0.method6003();
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method7822(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6015();
			if (local7 == 0) {
				return;
			}
			this.method7819(arg0, local7);
		}
	}
}
