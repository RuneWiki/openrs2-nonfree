import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "I")
	public int anInt938 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!s;)V")
	private void method624(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub16 arg1) {
		if (arg0 == 2) {
			this.anInt938 = arg1.method1490();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!s;)V")
	public void method626(@OriginalArg(1) Class4_Sub16 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1474();
			if (local10 == 0) {
				return;
			}
			this.method624(local10, arg0);
		}
	}
}
