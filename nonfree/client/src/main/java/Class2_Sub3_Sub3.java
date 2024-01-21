import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
	public int anInt431 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!me;)V")
	public void method320(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1402();
			if (local9 == 0) {
				return;
			}
			this.method321(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!me;II)V")
	private void method321(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt431 = arg0.method1397();
		}
	}
}
