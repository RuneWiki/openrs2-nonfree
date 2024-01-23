import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class63 {

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public int anInt2181 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!pg;Z)V")
	private void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		if (arg0 == 5) {
			this.anInt2181 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!pg;)V")
	public void method1731(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2142();
			if (local5 == 0) {
				return;
			}
			this.method1727(local5, arg0);
		}
	}
}
