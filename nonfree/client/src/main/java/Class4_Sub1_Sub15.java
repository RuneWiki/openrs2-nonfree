import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!u", name = "M", descriptor = "I")
	public int anInt2869 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method1839(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method719();
			if (local17 == 0) {
				return;
			}
			this.method1843(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!jd;II)V")
	private void method1843(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2869 = arg0.method718();
		}
	}
}
