import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	public int anInt2445 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ea;B)V")
	public void method1722(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method209();
			if (local17 == 0) {
				return;
			}
			this.method1725(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ea;I)V")
	private void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 2) {
			this.anInt2445 = arg1.method163();
		}
	}
}
