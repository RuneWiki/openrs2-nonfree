import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class59 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public final int anInt2522;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
	public final int[] anIntArray261;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public final int[] anIntArray260;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class59() {
		Static112.method1777(16);
		this.anInt2522 = Static112.method1768() == 0 ? 1 : Static112.method1777(4) + 1;
		if (Static112.method1768() != 0) {
			Static112.method1777(8);
		}
		Static112.method1777(2);
		if (this.anInt2522 > 1) {
			this.anInt2521 = Static112.method1777(4);
		}
		this.anIntArray261 = new int[this.anInt2522];
		this.anIntArray260 = new int[this.anInt2522];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2522; local42++) {
			Static112.method1777(8);
			this.anIntArray261[local42] = Static112.method1777(8);
			this.anIntArray260[local42] = Static112.method1777(8);
		}
	}
}
