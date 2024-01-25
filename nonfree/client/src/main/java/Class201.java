import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class201 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public int anInt6348 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!tq;)V")
	private void method5315(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 5) {
			this.anInt6348 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!tq;B)V")
	public void method5316(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2380();
			if (local10 == 0) {
				return;
			}
			this.method5315(local10, arg0);
		}
	}
}
