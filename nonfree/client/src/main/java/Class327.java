import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class327 {

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public int anInt8598 = 2048;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public int anInt8604 = 0;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public int anInt8605 = 2048;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	public int anInt8606 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method7350(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2048(255);
			if (local17 == 0) {
				return;
			}
			this.method7351(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ika;BI)V")
	private void method7351(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8604 = arg0.method2048(255);
		} else if (arg1 == 2) {
			this.anInt8598 = arg0.method2028(-14795);
		} else if (arg1 == 3) {
			this.anInt8605 = arg0.method2028(-14795);
		} else if (arg1 == 4) {
			this.anInt8606 = arg0.method2017();
		}
	}
}
