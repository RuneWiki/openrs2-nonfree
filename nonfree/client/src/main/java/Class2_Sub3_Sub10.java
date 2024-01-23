import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
	public int anInt1314;

	@OriginalMember(owner = "client!fk", name = "S", descriptor = "Lclient!qe;")
	public Class78 aClass78_316;

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
	private int anInt1322;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!nh;BI)V")
	private void method1080(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1322 = arg0.method2122();
		} else if (arg1 == 2) {
			this.anInt1314 = arg0.method2133();
		} else if (arg1 == 5) {
			this.aClass78_316 = arg0.method2115();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Z")
	public boolean method1081() {
		return this.anInt1322 == 115;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!nh;B)V")
	public void method1084(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2122();
			if (local3 == 0) {
				return;
			}
			this.method1080(arg0, local3);
		}
	}
}
