import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class50 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public int anInt1291 = 2048;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	public int anInt1294 = 0;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public int anInt1292 = 2048;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public int anInt1293 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!si;I)V")
	public void method1100(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5495();
			if (local5 == 0) {
				return;
			}
			this.method1102(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IILclient!si;)V")
	private void method1102(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt1294 = arg1.method5495();
		} else if (arg0 == 2) {
			this.anInt1292 = arg1.method5500();
		} else if (arg0 == 3) {
			this.anInt1291 = arg1.method5500();
		} else if (arg0 == 4) {
			this.anInt1293 = arg1.method5458();
		}
	}
}
