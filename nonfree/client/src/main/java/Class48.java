import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class48 {

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public int anInt1787 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!tl;I)V")
	private void method1365(@OriginalArg(1) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1787 = arg0.method4877();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!tl;)V")
	public void method1368(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method1365(arg0, local5);
		}
	}
}
