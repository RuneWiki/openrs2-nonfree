import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!na", name = "pb", descriptor = "I")
	public int anInt2406 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!la;I)V")
	private void method1545(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2406 = arg0.method1963();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!la;)V")
	public void method1548(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1936();
			if (local9 == 0) {
				return;
			}
			this.method1545(arg0, local9);
		}
	}
}
