import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class257 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public int anInt7471 = 1;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!md;II)V")
	private void method5791(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static82.method1460(arg0.method3693());
		} else if (arg1 == 2) {
			this.anInt7471 = 0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!md;B)V")
	public void method5794(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method5791(arg0, local5);
		}
	}
}
