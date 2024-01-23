import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class144 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public int anInt4655;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public int anInt4657;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method3759(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method3764(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!oe;I)V")
	private void method3764(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4650 = arg0.method2130();
			this.anInt4655 = arg0.method2146();
			this.anInt4657 = arg0.method2146();
		}
	}
}
