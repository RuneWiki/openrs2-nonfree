import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	public int anInt2025 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!na;II)V")
	private void method1340(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2025 = arg0.method632();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!na;Z)V")
	public void method1344(@OriginalArg(0) Class2_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method640();
			if (local9 == 0) {
				return;
			}
			this.method1340(arg0, local9);
		}
	}
}
