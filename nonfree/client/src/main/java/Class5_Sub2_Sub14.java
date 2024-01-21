import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	public int anInt2828 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!pa;Z)V")
	public void method1826(@OriginalArg(0) Class5_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1471();
			if (local9 == 0) {
				return;
			}
			this.method1827(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!pa;II)V")
	private void method1827(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2828 = arg0.method1478();
		}
	}
}
