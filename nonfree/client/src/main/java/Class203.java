import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class203 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
	public int anInt6499 = 1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!tn;)V")
	public void method5441(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method5444(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!tn;ZI)V")
	private void method5444(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static278.method6290(arg0.method8440());
		} else if (arg1 == 2) {
			this.anInt6499 = 0;
		}
	}
}
