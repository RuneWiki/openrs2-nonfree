import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class65 {

	@OriginalMember(owner = "client!em", name = "g", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public int anInt2173 = 1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!cu;)V")
	private void method1687(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static35.method718(arg1.method2612());
		} else if (arg0 == 2) {
			this.anInt2173 = 0;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!cu;)V")
	public void method1688(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2582();
			if (local9 == 0) {
				return;
			}
			this.method1687(local9, arg0);
		}
	}
}
