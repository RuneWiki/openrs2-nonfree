import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class88 {

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public final int anInt2385;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
	public int anInt2386;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "[I")
	public final int[] anIntArray153;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[I")
	public final int[] anIntArray154;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V", line = 7)
	public Class88() {
		Static246.method4514(16);
		this.anInt2385 = Static246.method4523() == 0 ? 1 : Static246.method4514(4) + 1;
		if (Static246.method4523() != 0) {
			Static246.method4514(8);
		}
		Static246.method4514(2);
		if (this.anInt2385 > 1) {
			this.anInt2386 = Static246.method4514(4);
		}
		this.anIntArray153 = new int[this.anInt2385];
		this.anIntArray154 = new int[this.anInt2385];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2385; local42++) {
			Static246.method4514(8);
			this.anIntArray153[local42] = Static246.method4514(8);
			this.anIntArray154[local42] = Static246.method4514(8);
		}
	}
}
