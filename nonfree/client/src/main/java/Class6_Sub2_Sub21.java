import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class6_Sub2_Sub21 extends Class6_Sub2 {

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
	public int anInt6325 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ec;B)V")
	public void method5768(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3972();
			if (local12 == 0) {
				return;
			}
			this.method5769(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method5769(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt6325 = arg0.method4021();
		}
	}
}
