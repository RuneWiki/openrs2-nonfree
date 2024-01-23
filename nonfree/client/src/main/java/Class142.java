import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class142 {

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	public int anInt4382 = 0;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public int anInt4381 = 0;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public int anInt4388 = 2048;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public int anInt4387 = 2048;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!cg;)V")
	public void method3474(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		while (true) {
			@Pc(11) int local11 = arg1.method2690();
			if (local11 == 0) {
				return;
			}
			this.method3477(local11, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILclient!cg;)V")
	private void method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub11 arg2) {
		if (arg0 == 1) {
			this.anInt4382 = arg2.method2690();
		} else if (arg0 == 2) {
			this.anInt4388 = arg2.method2691();
		} else if (arg0 == 3) {
			this.anInt4387 = arg2.method2691();
		} else if (arg0 == 4) {
			this.anInt4381 = arg2.method2632();
		}
	}
}
