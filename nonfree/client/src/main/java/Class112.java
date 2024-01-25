import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class112 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public int anInt2389;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public int anInt2390;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method2239(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2389 = arg0.method7717(-1978450544);
			this.anInt2390 = arg0.method7695(100);
			this.anInt2393 = arg0.method7695(100);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!jc;Z)V")
	public void method2241(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7695(113);
			if (local15 == 0) {
				return;
			}
			this.method2239(arg0, local15);
		}
	}
}
