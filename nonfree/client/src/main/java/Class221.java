import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class221 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public int anInt6238 = 1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!wn;Z)V")
	public void method5121(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4614();
			if (local13 == 0) {
				return;
			}
			this.method5125(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!wn;I)V")
	private void method5125(@OriginalArg(1) Class4_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static154.method2864(arg0.method4576());
		} else if (arg1 == 2) {
			this.anInt6238 = 0;
		}
	}
}
