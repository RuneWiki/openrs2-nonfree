import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class5_Sub2_Sub21 extends Class5_Sub2 {

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	public int anInt3628 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!ce;)V")
	private void method2738(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		if (arg0 == 2) {
			this.anInt3628 = arg1.method3077();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method2741(@OriginalArg(0) Class5_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3062();
			if (local5 == 0) {
				return;
			}
			this.method2738(local5, arg0);
		}
	}
}
