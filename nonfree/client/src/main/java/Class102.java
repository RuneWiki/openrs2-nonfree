import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class102 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public int anInt2952 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!rba;ZI)V")
	private void method2553(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2952 = arg0.method5272();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!rba;)V")
	public void method2554(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5322(-69);
			if (local13 == 0) {
				return;
			}
			this.method2553(arg0, local13);
		}
	}
}
