import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class64 {

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	public int anInt1430 = 0;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public int anInt1427 = 2048;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	public int anInt1428 = 0;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
	public int anInt1431 = 2048;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method1183(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6019();
			if (local15 == 0) {
				return;
			}
			this.method1188(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!jr;IB)V")
	private void method1188(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1428 = arg0.method6019();
		} else if (arg1 == 2) {
			this.anInt1431 = arg0.method6044();
		} else if (arg1 == 3) {
			this.anInt1427 = arg0.method6044();
		} else if (arg1 == 4) {
			this.anInt1430 = arg0.method6023();
		}
	}
}
