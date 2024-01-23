import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class66 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public int anInt1953 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!aj;)V")
	private void method1485(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 5) {
			this.anInt1953 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!aj;)V")
	public void method1487(@OriginalArg(1) Class8_Sub2 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2334();
			if (local10 == 0) {
				return;
			}
			this.method1485(local10, arg0);
		}
	}
}
