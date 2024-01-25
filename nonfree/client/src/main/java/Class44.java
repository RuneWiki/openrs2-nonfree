import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class44 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
	public int anInt1232 = 0;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public int anInt1235 = 2048;

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
	public int anInt1237 = 2048;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
	public int anInt1236 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!ol;Z)V")
	private void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1232 = arg1.method5203();
		} else if (arg0 == 2) {
			this.anInt1235 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt1237 = arg1.method5211();
		} else if (arg0 == 4) {
			this.anInt1236 = arg1.method5174();
			return;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method1191(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5203();
			if (local15 == 0) {
				return;
			}
			this.method1188(local15, arg0);
		}
	}
}
