import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public int anInt572 = 1;

	static {
		new Class34("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!bg;I)V")
	public void method446(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4532();
			if (local9 == 0) {
				return;
			}
			this.method447(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!bg;B)V")
	private void method447(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static29.method765(arg1.method4558());
		} else if (arg0 == 2) {
			this.anInt572 = 0;
		}
	}
}
