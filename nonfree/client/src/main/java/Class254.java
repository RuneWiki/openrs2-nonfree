import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class254 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	public final int anInt6905;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public int anInt6906;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
	public final int[] anIntArray431;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
	public final int[] anIntArray430;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class254() {
		Static132.method2558(16);
		this.anInt6905 = Static132.method2552() == 0 ? 1 : Static132.method2558(4) + 1;
		if (Static132.method2552() != 0) {
			Static132.method2558(8);
		}
		Static132.method2558(2);
		if (this.anInt6905 > 1) {
			this.anInt6906 = Static132.method2558(4);
		}
		this.anIntArray431 = new int[this.anInt6905];
		this.anIntArray430 = new int[this.anInt6905];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6905; local42++) {
			Static132.method2558(8);
			this.anIntArray431[local42] = Static132.method2558(8);
			this.anIntArray430[local42] = Static132.method2558(8);
		}
	}
}
