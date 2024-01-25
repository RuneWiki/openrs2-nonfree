import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class85 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	public int anInt2510 = 1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method2386(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static431.method6618(arg1.method5179());
		} else if (arg0 == 2) {
			this.anInt2510 = 0;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BLclient!ps;)V")
	public void method2387(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5170();
			if (local14 == 0) {
				return;
			}
			this.method2386(local14, arg0);
		}
	}
}
