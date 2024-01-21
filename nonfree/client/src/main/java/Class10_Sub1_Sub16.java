import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class10_Sub1_Sub16 extends Class10_Sub1 {

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	public int anInt2623 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!tc;B)V")
	public void method1642(@OriginalArg(0) Class10_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1111();
			if (local9 == 0) {
				return;
			}
			this.method1644(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!tc;)V")
	private void method1644(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub10 arg1) {
		if (arg0 == 5) {
			this.anInt2623 = arg1.method1160();
		}
	}
}
