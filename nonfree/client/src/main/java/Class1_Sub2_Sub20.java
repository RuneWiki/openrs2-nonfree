import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
	public int anInt3551 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wa;B)V")
	public void method2692(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1738();
			if (local3 == 0) {
				return;
			}
			this.method2696(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wa;IB)V")
	private void method2696(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt3551 = arg0.method1753();
		}
	}
}
