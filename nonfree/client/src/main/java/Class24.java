import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class24 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public int anInt652 = 2048;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public int anInt657 = 0;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public int anInt659 = 0;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public int anInt660 = 2048;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!p;I)V")
	private void method481(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub17 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt657 = arg1.method1874();
		} else if (arg2 == 2) {
			this.anInt660 = arg1.method1837();
		} else if (arg2 == 3) {
			this.anInt652 = arg1.method1837();
		} else if (arg2 == 4) {
			this.anInt659 = arg1.method1869();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!p;I)V")
	public void method485(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1874();
			if (local5 == 0) {
				return;
			}
			this.method481(arg1, arg0, local5);
		}
	}
}
