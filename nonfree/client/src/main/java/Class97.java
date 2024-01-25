import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class97 {

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public int anInt2944 = -1;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
	public int anInt2946 = -1;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method2511(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method7548();
			if (local10 == 0) {
				return;
			}
			this.method2512(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BILclient!rt;)V")
	private void method2512(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt2946 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anIntArray287 = new int[arg1.method7548()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray287.length; local36++) {
				this.anIntArray287[local36] = arg1.method7591();
			}
		} else if (arg0 == 3) {
			this.anInt2944 = arg1.method7548();
			return;
		}
	}
}
