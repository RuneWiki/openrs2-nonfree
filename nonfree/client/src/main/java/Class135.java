import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class135 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public int anInt4015 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!fb;)V")
	public void method3428(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3643();
			if (local9 == 0) {
				return;
			}
			this.method3429(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLclient!fb;)V")
	private void method3429(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt4015 = arg1.method3649();
		}
	}
}
