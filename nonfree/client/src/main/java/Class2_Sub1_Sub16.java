import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	public int anInt2755 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!fe;)V")
	private void method1696(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt2755 = arg1.method1396();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!fe;)V")
	public void method1699(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1410();
			if (local5 == 0) {
				return;
			}
			this.method1696(local5, arg0);
		}
	}
}
