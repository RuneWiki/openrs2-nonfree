import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class127 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public int anInt3248 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ofa;ZI)V")
	private void method2796(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt3248 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method2797(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5966();
			if (local5 == 0) {
				return;
			}
			this.method2796(arg0, local5);
		}
	}
}
