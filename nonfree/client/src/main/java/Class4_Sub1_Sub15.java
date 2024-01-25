import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!np", name = "D", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	public int anInt4450 = 1;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!tq;II)V")
	private void method3716(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static58.method1043(arg0.method2393());
		} else if (arg1 == 2) {
			this.anInt4450 = 0;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!tq;B)V")
	public void method3717(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2380();
			if (local17 == 0) {
				return;
			}
			this.method3716(arg0, local17);
		}
	}
}
