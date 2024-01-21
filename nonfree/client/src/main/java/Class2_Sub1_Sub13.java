import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!p", name = "L", descriptor = "I")
	public int anInt2706 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!va;I)V")
	private void method1921(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 2) {
			this.anInt2706 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!va;I)V")
	public void method1923(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1461();
			if (local5 == 0) {
				return;
			}
			this.method1921(local5, arg0);
		}
	}
}
