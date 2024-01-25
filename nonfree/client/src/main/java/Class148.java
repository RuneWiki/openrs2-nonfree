import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class148 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public int anInt3858 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!fh;BI)V")
	private void method3038(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt3858 = arg0.method5598();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method3040(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5539();
			if (local17 == 0) {
				return;
			}
			this.method3038(arg0, local17);
		}
	}
}
