import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class184 {

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public int anInt5649 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!ap;I)V")
	private void method4748(@OriginalArg(1) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt5649 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ap;I)V")
	public void method4751(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2772();
			if (local15 == 0) {
				return;
			}
			this.method4748(arg0, local15);
		}
	}
}
