import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class75 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public int anInt1841 = 0;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public int anInt1845 = 0;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public int anInt1844 = 2048;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public int anInt1846 = 2048;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!es;IB)V")
	private void method1363(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1841 = arg0.method4325();
		} else if (arg1 == 2) {
			this.anInt1844 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt1846 = arg0.method4294();
		} else if (arg1 == 4) {
			this.anInt1845 = arg0.method4334();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!es;I)V")
	public void method1364(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4325();
			if (local15 == 0) {
				return;
			}
			this.method1363(arg0, local15);
		}
	}
}
