import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class7_Sub1_Sub20 extends Class7_Sub1 {

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public int anInt6242 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!ap;)V")
	public void method5264(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2772();
			if (local11 == 0) {
				return;
			}
			this.method5265(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!ap;)V")
	private void method5265(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 2) {
			this.anInt6242 = arg1.method2764();
		}
	}
}
