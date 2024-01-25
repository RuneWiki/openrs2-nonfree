import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class194 {

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	public int anInt5855 = 2048;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public int anInt5856 = 0;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public int anInt5858 = 2048;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public int anInt5861 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!jg;I)V")
	public void method5307(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method2548();
			if (local17 == 0) {
				return;
			}
			this.method5309(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!jg;II)V")
	private void method5309(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt5861 = arg1.method2548();
		} else if (arg0 == 2) {
			this.anInt5855 = arg1.method2498();
		} else if (arg0 == 3) {
			this.anInt5858 = arg1.method2498();
		} else if (arg0 == 4) {
			this.anInt5856 = arg1.method2502();
		}
	}
}
