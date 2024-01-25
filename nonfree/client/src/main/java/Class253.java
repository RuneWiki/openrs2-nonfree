import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class253 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
	public int anInt7432;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
	public int anInt7433;

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
	public int anInt7435;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILclient!rba;I)V")
	private void method6219(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static265.method4094(arg0.method5288());
		} else if (arg1 == 2) {
			this.anInt7432 = arg0.method5272();
			this.anInt7435 = arg0.method5322(-126);
			this.anInt7433 = arg0.method5322(-34);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!rba;B)V")
	public void method6221(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-120);
			if (local5 == 0) {
				return;
			}
			this.method6219(arg0, local5);
		}
	}
}
