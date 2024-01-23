import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class23 {

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	public int anInt493 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!im;II)V")
	private void method403(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt493 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!im;B)V")
	public void method404(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2655();
			if (local9 == 0) {
				return;
			}
			this.method403(arg0, local9);
		}
	}
}
