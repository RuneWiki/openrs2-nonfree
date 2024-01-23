import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	public int anInt1423;

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "Lclient!ia;")
	public Class51 aClass51_437;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
	public boolean method1078() {
		return this.anInt1428 == 115;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!k;)V")
	private void method1081(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt1428 = arg1.method3793();
		} else if (arg0 == 2) {
			this.anInt1423 = arg1.method3784();
			return;
		} else if (arg0 == 5) {
			this.aClass51_437 = arg1.method3781();
			return;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!k;)V")
	public void method1082(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3793();
			if (local15 == 0) {
				return;
			}
			this.method1081(local15, arg0);
		}
	}
}
