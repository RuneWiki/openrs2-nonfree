import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class17 {

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	public int anInt409 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!lf;B)V")
	private void method381(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 5) {
			this.anInt409 = arg1.method1386();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!lf;)V")
	public void method384(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1378();
			if (local5 == 0) {
				return;
			}
			this.method381(local5, arg0);
		}
	}
}
