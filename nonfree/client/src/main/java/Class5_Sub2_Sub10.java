import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
	public int anInt6224 = 0;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!rv;II)V")
	private void method5226(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt6224 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method5227(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3642();
			if (local3 == 0) {
				return;
			}
			this.method5226(arg0, local3);
		}
	}
}
