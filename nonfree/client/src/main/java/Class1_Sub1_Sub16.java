import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
	public int anInt2514 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ka;II)V")
	private void method1729(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2514 = arg0.method1199();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method1732(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1186();
			if (local15 == 0) {
				return;
			}
			this.method1729(arg0, local15);
		}
	}
}
