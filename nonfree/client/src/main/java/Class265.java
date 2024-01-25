import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class265 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public int anInt7681 = 1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLclient!rba;)V")
	private void method6434(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static265.method4094(arg1.method5288());
		} else if (arg0 == 2) {
			this.anInt7681 = 0;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!rba;)V")
	public void method6435(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-107);
			if (local5 == 0) {
				return;
			}
			this.method6434(local5, arg0);
		}
	}
}
