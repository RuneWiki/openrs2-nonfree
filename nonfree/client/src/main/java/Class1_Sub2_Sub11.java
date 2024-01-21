import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	public int anInt2132 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ka;)V")
	public void method1629(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method336();
			if (local9 == 0) {
				return;
			}
			this.method1631(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ka;I)V")
	private void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt2132 = arg1.method359();
		}
	}
}
