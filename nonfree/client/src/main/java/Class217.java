import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class217 {

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public int anInt6345 = 1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BILclient!mc;)V")
	private void method5289(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static144.method2600(arg1.method7861());
		} else if (arg0 == 2) {
			this.anInt6345 = 0;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method5294(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method7816();
			if (local16 == 0) {
				return;
			}
			this.method5289(local16, arg0);
		}
	}
}
