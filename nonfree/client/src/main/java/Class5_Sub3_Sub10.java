import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class5_Sub3_Sub10 extends Class5_Sub3 {

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
	public int anInt5756 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method4771(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt5756 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method4772(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7816();
			if (local14 == 0) {
				return;
			}
			this.method4771(arg0, local14);
		}
	}
}
