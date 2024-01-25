import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class110 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
	public final int anInt2692;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
	public int anInt2693;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "[I")
	public final int[] anIntArray139;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "[I")
	public final int[] anIntArray138;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class110() {
		Static134.method1810(16);
		this.anInt2692 = Static134.method1809() == 0 ? 1 : Static134.method1810(4) + 1;
		if (Static134.method1809() != 0) {
			Static134.method1810(8);
		}
		Static134.method1810(2);
		if (this.anInt2692 > 1) {
			this.anInt2693 = Static134.method1810(4);
		}
		this.anIntArray139 = new int[this.anInt2692];
		this.anIntArray138 = new int[this.anInt2692];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2692; local42++) {
			Static134.method1810(8);
			this.anIntArray139[local42] = Static134.method1810(8);
			this.anIntArray138[local42] = Static134.method1810(8);
		}
	}
}
