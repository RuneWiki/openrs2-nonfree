import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class237 {

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public int anInt6668 = 1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!iv;B)V")
	public void method5214(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method5218(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BILclient!iv;)V")
	private void method5218(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static260.method3771(arg1.method2542());
		} else if (arg0 == 2) {
			this.anInt6668 = 0;
		}
	}
}
