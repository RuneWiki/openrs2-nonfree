import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class14 {

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public int anInt543 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBLclient!ac;)V")
	private void method469(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 5) {
			this.anInt543 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method470(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7974();
			if (local12 == 0) {
				return;
			}
			this.method469(local12, arg0);
		}
	}
}
