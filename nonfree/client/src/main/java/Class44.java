import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class44 {

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public int anInt1708 = 2048;

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
	public int anInt1709 = 0;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
	public int anInt1710 = 0;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
	public int anInt1711 = 2048;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!qh;)V")
	private void method1456(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1709 = arg1.method3118();
		} else if (arg0 == 2) {
			this.anInt1708 = arg1.method3109();
		} else if (arg0 == 3) {
			this.anInt1711 = arg1.method3109();
		} else if (arg0 == 4) {
			this.anInt1710 = arg1.method3107();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method1458(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3118();
			if (local10 == 0) {
				return;
			}
			this.method1456(local10, arg0);
		}
	}
}
