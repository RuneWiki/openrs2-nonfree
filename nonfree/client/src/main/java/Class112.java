import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class112 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public final int anInt2923;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt2924;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
	public final int[] anIntArray162;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
	public final int[] anIntArray163;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class112() {
		Static416.method5488(16);
		this.anInt2923 = Static416.method5491() == 0 ? 1 : Static416.method5488(4) + 1;
		if (Static416.method5491() != 0) {
			Static416.method5488(8);
		}
		Static416.method5488(2);
		if (this.anInt2923 > 1) {
			this.anInt2924 = Static416.method5488(4);
		}
		this.anIntArray162 = new int[this.anInt2923];
		this.anIntArray163 = new int[this.anInt2923];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2923; local42++) {
			Static416.method5488(8);
			this.anIntArray162[local42] = Static416.method5488(8);
			this.anIntArray163[local42] = Static416.method5488(8);
		}
	}
}
