import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
	public int anInt344 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mc;)V")
	public void method296(@OriginalArg(1) Class1_Sub12 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1190();
			if (local10 == 0) {
				return;
			}
			this.method298(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mc;B)V")
	private void method298(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		if (arg0 == 2) {
			this.anInt344 = arg1.method1176();
		}
	}
}
