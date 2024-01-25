import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class43 {

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public int anInt1478 = 0;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method1458(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method1460(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILclient!ps;)V")
	private void method1460(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 5) {
			this.anInt1478 = arg1.method5229();
		}
	}
}
