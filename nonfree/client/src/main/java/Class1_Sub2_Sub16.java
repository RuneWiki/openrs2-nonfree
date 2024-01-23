import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
	public int anInt3778 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!cg;)V")
	public void method3031(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2690();
			if (local17 == 0) {
				return;
			}
			this.method3033(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!cg;BI)V")
	private void method3033(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt3778 = arg0.method2691();
		}
	}
}
