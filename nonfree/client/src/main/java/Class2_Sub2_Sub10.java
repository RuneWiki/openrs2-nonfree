import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
	public int anInt1280 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!ic;I)V")
	private void method897(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 2) {
			this.anInt1280 = arg1.method1517();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!ic;)V")
	public void method899(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1514();
			if (local12 == 0) {
				return;
			}
			this.method897(local12, arg0);
		}
	}
}
