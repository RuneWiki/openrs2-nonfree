import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class2_Sub5_Sub16 extends Class2_Sub5 {

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
	public int anInt7144 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!ud;)V")
	public void method6052(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6904();
			if (local5 == 0) {
				return;
			}
			this.method6054(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ud;IB)V")
	private void method6054(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt7144 = arg0.method6884();
		}
	}
}
