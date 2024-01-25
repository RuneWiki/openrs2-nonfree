import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class231 {

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
	public int anInt5850 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!ika;)V")
	private void method5114(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 5) {
			this.anInt5850 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ika;Z)V")
	public void method5115(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2048(255);
			if (local17 == 0) {
				return;
			}
			this.method5114(local17, arg0);
		}
	}
}
