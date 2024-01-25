import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class3_Sub7_Sub3 extends Class3_Sub7 {

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
	public int anInt1677 = 0;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLclient!ika;I)V")
	private void method1583(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1677 = arg0.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!ika;)V")
	public void method1585(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2048(255);
			if (local7 == 0) {
				return;
			}
			this.method1583(arg0, local7);
		}
	}
}
