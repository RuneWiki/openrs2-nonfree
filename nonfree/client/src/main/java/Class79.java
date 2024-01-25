import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class79 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public int anInt2383 = 0;

	static {
		new Class7("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!hp;)V")
	public void method2119(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5366();
			if (local11 == 0) {
				return;
			}
			this.method2122(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!hp;II)V")
	private void method2122(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt2383 = arg0.method5362();
		}
	}
}
