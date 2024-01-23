import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class103 {

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
	public int anInt3541 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method2567(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2199();
			if (local9 == 0) {
				return;
			}
			this.method2568(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!qm;Z)V")
	private void method2568(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 5) {
			this.anInt3541 = arg1.method2244();
		}
	}
}
