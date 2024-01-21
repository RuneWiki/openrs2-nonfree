import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qa", name = "Hb", descriptor = "I")
	public int anInt2131 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ba;I)V")
	public void method1486(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method1487(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!ba;)V")
	private void method1487(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 5) {
			this.anInt2131 = arg1.method792();
		}
	}
}
