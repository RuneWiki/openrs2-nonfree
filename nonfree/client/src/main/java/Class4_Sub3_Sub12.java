import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class4_Sub3_Sub12 extends Class4_Sub3 {

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	public int anInt2048 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!tf;II)V")
	private void method1395(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2048 = arg0.method816();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!tf;B)V")
	public void method1397(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method773();
			if (local5 == 0) {
				return;
			}
			this.method1395(arg0, local5);
		}
	}
}
