import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	public int anInt3999 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILclient!lf;)V")
	private void method3343(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 2) {
			this.anInt3999 = arg1.method1386();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!lf;Z)V")
	public void method3348(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1378();
			if (local9 == 0) {
				return;
			}
			this.method3343(local9, arg0);
		}
	}
}
