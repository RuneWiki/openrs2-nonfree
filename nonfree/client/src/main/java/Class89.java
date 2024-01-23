import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class89 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public int anInt2617 = 2048;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public int anInt2618 = 0;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public int anInt2622 = 2048;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	public int anInt2625 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ug;I)V")
	public void method2329(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method3915();
			if (local15 == 0) {
				return;
			}
			this.method2331(arg1, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!ug;I)V")
	private void method2331(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2618 = arg1.method3915();
		} else if (arg2 == 2) {
			this.anInt2622 = arg1.method3948();
		} else if (arg2 == 3) {
			this.anInt2617 = arg1.method3948();
		} else if (arg2 == 4) {
			this.anInt2625 = arg1.method3930();
		}
	}
}
