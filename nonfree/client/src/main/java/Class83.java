import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class83 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public int anInt2283 = 1;

	static {
		new Class174("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!nj;)V")
	private void method1978(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static331.method5972(arg1.method4097());
		} else if (arg0 == 2) {
			this.anInt2283 = 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method1979(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method1978(local5, arg0);
		}
	}
}
