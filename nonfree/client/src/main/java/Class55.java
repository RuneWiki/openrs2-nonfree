import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class55 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public int anInt1732 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!bk;B)V")
	private void method1523(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		if (arg0 == 5) {
			this.anInt1732 = arg1.method1845();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!bk;)V")
	public void method1525(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1832();
			if (local9 == 0) {
				return;
			}
			this.method1523(local9, arg0);
		}
	}
}
