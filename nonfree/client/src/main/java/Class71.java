import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class71 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public int anInt1850 = -1;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	public int anInt1856 = -1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!ud;)V")
	private void method1617(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.anInt1850 = arg1.method6884();
		} else if (arg0 == 2) {
			this.anIntArray165 = new int[arg1.method6904()];
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray165.length; local28++) {
				this.anIntArray165[local28] = arg1.method6884();
			}
		} else if (arg0 == 3) {
			this.anInt1856 = arg1.method6904();
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method1618(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method6904();
			if (local10 == 0) {
				return;
			}
			this.method1617(local10, arg0);
		}
	}
}
