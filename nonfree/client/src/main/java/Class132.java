import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class132 {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public int anInt4826;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public int anInt4825;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
	public int[] anIntArray483;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class132() {
		Static103.method1706(16);
		this.anInt4826 = Static103.method1705() == 0 ? 1 : Static103.method1706(4) + 1;
		if (Static103.method1705() != 0) {
			Static103.method1706(8);
		}
		Static103.method1706(2);
		if (this.anInt4826 > 1) {
			this.anInt4825 = Static103.method1706(4);
		}
		this.anIntArray482 = new int[this.anInt4826];
		this.anIntArray483 = new int[this.anInt4826];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4826; local42++) {
			Static103.method1706(8);
			this.anIntArray482[local42] = Static103.method1706(8);
			this.anIntArray483[local42] = Static103.method1706(8);
		}
	}
}
