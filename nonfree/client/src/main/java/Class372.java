import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class372 {

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
	public int anInt9771 = 1;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!fca;)V")
	public void method8317(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method8318(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLclient!fca;I)V")
	private void method8318(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar6 = Static669.method8682(arg0.method4861());
		} else if (arg1 == 2) {
			this.anInt9771 = 0;
		}
	}
}
