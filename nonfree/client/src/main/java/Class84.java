import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class84 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
	public final int anInt2749;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public int anInt2750;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "[I")
	public final int[] anIntArray203;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "[I")
	public final int[] anIntArray202;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class84() {
		Static32.method840(16);
		this.anInt2749 = Static32.method833() == 0 ? 1 : Static32.method840(4) + 1;
		if (Static32.method833() != 0) {
			Static32.method840(8);
		}
		Static32.method840(2);
		if (this.anInt2749 > 1) {
			this.anInt2750 = Static32.method840(4);
		}
		this.anIntArray203 = new int[this.anInt2749];
		this.anIntArray202 = new int[this.anInt2749];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2749; local42++) {
			Static32.method840(8);
			this.anIntArray203[local42] = Static32.method840(8);
			this.anIntArray202[local42] = Static32.method840(8);
		}
	}
}
