import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	public int anInt3462;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
	public int anInt3463;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	public int anInt3467;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method2403(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1534();
			if (local5 == 0) {
				return;
			}
			this.method2406(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILclient!kd;)V")
	private void method2406(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3467 = arg1.method1557();
			this.anInt3462 = arg1.method1534();
			this.anInt3463 = arg1.method1534();
		}
	}
}
