import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!p", name = "z", descriptor = "I")
	public int anInt3157 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method2210(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1534();
			if (local10 == 0) {
				return;
			}
			this.method2213(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!kd;BI)V")
	private void method2213(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt3157 = arg0.method1557();
		}
	}
}
