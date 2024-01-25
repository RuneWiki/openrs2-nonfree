import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class140 {

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	public int anInt3624 = 1;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method3245(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static151.method2480(arg0.method3116());
		} else if (arg1 == 2) {
			this.anInt3624 = 0;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method3246(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method3245(arg0, local5);
		}
	}
}
