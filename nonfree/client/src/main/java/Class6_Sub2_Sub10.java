import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class6_Sub2_Sub10 extends Class6_Sub2 {

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
	public int anInt3232 = 1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method3363(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar7 = Static103.method2106(arg0.method3992());
		} else if (arg1 == 2) {
			this.anInt3232 = 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method3368(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3972();
			if (local16 == 0) {
				return;
			}
			this.method3363(arg0, local16);
		}
	}
}
