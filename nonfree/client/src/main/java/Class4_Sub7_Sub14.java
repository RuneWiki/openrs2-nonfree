import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class4_Sub7_Sub14 extends Class4_Sub7 {

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	public int anInt7836 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!eh;I)V")
	private void method6485(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt7836 = arg0.method5982();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!eh;)V")
	public void method6486(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6015();
			if (local16 == 0) {
				return;
			}
			this.method6485(arg0, local16);
		}
	}
}
