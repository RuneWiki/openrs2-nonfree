import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class73 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public int anInt2586;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	public int anInt2590;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	public int anInt2594;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!p;)V")
	private void method2005(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt2594 = arg1.method1837();
			this.anInt2586 = arg1.method1874();
			this.anInt2590 = arg1.method1874();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!p;)V")
	public void method2007(@OriginalArg(1) Class4_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1874();
			if (local9 == 0) {
				return;
			}
			this.method2005(local9, arg0);
		}
	}
}
