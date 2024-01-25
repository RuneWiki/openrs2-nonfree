import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class33 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
	public int anInt1109 = 0;

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public int anInt1110 = 0;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
	public int anInt1115 = 2048;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
	public int anInt1118 = 2048;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!ps;BI)V")
	private void method1075(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1109 = arg0.method5170();
		} else if (arg1 == 2) {
			this.anInt1118 = arg0.method5229();
		} else if (arg1 == 3) {
			this.anInt1115 = arg0.method5229();
		} else if (arg1 == 4) {
			this.anInt1110 = arg0.method5231();
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method1079(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method1075(arg0, local5);
		}
	}
}
