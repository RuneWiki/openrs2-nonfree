import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class36 {

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public int anInt1442 = 0;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public int anInt1441 = 0;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	public int anInt1449 = 2048;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	public int anInt1450 = 2048;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!oe;II)V")
	public void method1111(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2146();
			if (local9 == 0) {
				return;
			}
			this.method1113(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILclient!oe;)V")
	private void method1113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt1441 = arg2.method2146();
		} else if (arg1 == 2) {
			this.anInt1449 = arg2.method2130();
		} else if (arg1 == 3) {
			this.anInt1450 = arg2.method2130();
		} else if (arg1 == 4) {
			this.anInt1442 = arg2.method2191();
		}
	}
}
