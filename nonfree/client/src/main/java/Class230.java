import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class230 {

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public int anInt6615 = 2048;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	public int anInt6612 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt6614 = 0;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public int anInt6611 = 2048;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method5586(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6904();
			if (local5 == 0) {
				return;
			}
			this.method5592(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBLclient!ud;)V")
	private void method5592(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.anInt6614 = arg1.method6904();
		} else if (arg0 == 2) {
			this.anInt6615 = arg1.method6884();
		} else if (arg0 == 3) {
			this.anInt6611 = arg1.method6884();
		} else if (arg0 == 4) {
			this.anInt6612 = arg1.method6856();
		}
	}
}
