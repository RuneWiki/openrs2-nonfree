import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	public int anInt2273 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!be;I)V")
	private void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt2273 = arg1.method896();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!be;)V")
	public void method1649(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method933();
			if (local5 == 0) {
				return;
			}
			this.method1645(local5, arg0);
		}
	}
}
