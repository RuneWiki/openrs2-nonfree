import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class146 {

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
	public int anInt4429 = 2048;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
	public int anInt4426 = 0;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
	public int anInt4425 = 2048;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	public int anInt4430 = 0;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!ek;II)V")
	private void method3414(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4430 = arg0.method7004();
		} else if (arg1 == 2) {
			this.anInt4425 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt4429 = arg0.method7054();
		} else if (arg1 == 4) {
			this.anInt4426 = arg0.method7043();
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLclient!ek;)V")
	public void method3417(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7004();
			if (local14 == 0) {
				return;
			}
			this.method3414(arg0, local14);
		}
	}
}
