import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class70 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public int anInt1839 = 1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method1558(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method1559(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLclient!ug;I)V")
	private void method1559(@OriginalArg(1) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static276.method3830(arg0.method5367());
		} else if (arg1 == 2) {
			this.anInt1839 = 0;
		}
	}
}
