import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
	public int anInt3156 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!va;I)V")
	public void method2247(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1461();
			if (local13 == 0) {
				return;
			}
			this.method2250(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!va;IB)V")
	private void method2250(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt3156 = arg0.method1456();
		}
	}
}
