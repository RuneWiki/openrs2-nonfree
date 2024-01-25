import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class84 {

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
	public int anInt2261;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBLclient!jc;)V")
	private void method2158(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static383.method5912(arg1.method3027());
		} else if (arg0 == 2) {
			this.anInt2263 = arg1.method3018();
			this.anInt2265 = arg1.method3030();
			this.anInt2261 = arg1.method3030();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!jc;)V")
	public void method2159(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3030();
			if (local5 == 0) {
				return;
			}
			this.method2158(local5, arg0);
		}
	}
}
