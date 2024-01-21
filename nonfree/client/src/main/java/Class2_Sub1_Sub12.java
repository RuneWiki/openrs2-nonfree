import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
	public int anInt2010 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!wd;IZ)V")
	private void method1459(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2010 = arg0.method1366();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1460(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1399();
			if (local9 == 0) {
				return;
			}
			this.method1459(arg0, local9);
		}
	}
}
