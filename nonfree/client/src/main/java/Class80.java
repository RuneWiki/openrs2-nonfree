import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class80 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int anInt2191 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void method1744(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2191 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method1748(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4666();
			if (local5 == 0) {
				return;
			}
			this.method1744(arg0, local5);
		}
	}
}
