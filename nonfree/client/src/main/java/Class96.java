import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class96 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public int anInt2980 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ud;B)V")
	private void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		if (arg0 == 5) {
			this.anInt2980 = arg1.method6884();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method2535(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6904();
			if (local7 == 0) {
				return;
			}
			this.method2534(local7, arg0);
		}
	}
}
