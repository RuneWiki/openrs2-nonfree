import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public int anInt6492 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!es;I)V")
	public void method5438(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4325();
			if (local5 == 0) {
				return;
			}
			this.method5439(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!es;II)V")
	private void method5439(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt6492 = arg0.method4294();
		}
	}
}
