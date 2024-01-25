import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!am", name = "G", descriptor = "I")
	public int anInt243 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lf;BI)V")
	private void method222(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt243 = arg0.method3401();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method224(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3440();
			if (local9 == 0) {
				return;
			}
			this.method222(arg0, local9);
		}
	}
}
