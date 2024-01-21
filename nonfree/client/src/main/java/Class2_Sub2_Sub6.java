import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	public int anInt1155 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ja;I)V")
	public void method899(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2962();
			if (local9 == 0) {
				return;
			}
			this.method903(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ja;II)V")
	private void method903(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt1155 = arg0.method2933();
		}
	}
}
