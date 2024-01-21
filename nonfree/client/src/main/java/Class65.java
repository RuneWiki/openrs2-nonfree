import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class65 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public final int anInt2467;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public int anInt2466;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
	public final int[] anIntArray380;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
	public final int[] anIntArray381;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class65() {
		Static35.method675(16);
		this.anInt2467 = Static35.method668() == 0 ? 1 : Static35.method675(4) + 1;
		if (Static35.method668() != 0) {
			Static35.method675(8);
		}
		Static35.method675(2);
		if (this.anInt2467 > 1) {
			this.anInt2466 = Static35.method675(4);
		}
		this.anIntArray380 = new int[this.anInt2467];
		this.anIntArray381 = new int[this.anInt2467];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2467; local42++) {
			Static35.method675(8);
			this.anIntArray380[local42] = Static35.method675(8);
			this.anIntArray381[local42] = Static35.method675(8);
		}
	}
}
