import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class89 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	public int anInt2868 = 1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ud;I)V")
	private void method2469(@OriginalArg(1) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static448.method6635(arg0.method6908());
		} else if (arg1 == 2) {
			this.anInt2868 = 0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ud;)V")
	public void method2471(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6904();
			if (local11 == 0) {
				return;
			}
			this.method2469(arg0, local11);
		}
	}
}
