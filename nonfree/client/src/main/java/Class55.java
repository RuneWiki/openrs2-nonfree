import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class55 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public final int anInt2468;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
	public final int[] anIntArray298;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public final int[] anIntArray297;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class55() {
		Static45.method869(16);
		this.anInt2468 = Static45.method872() == 0 ? 1 : Static45.method869(4) + 1;
		if (Static45.method872() != 0) {
			Static45.method869(8);
		}
		Static45.method869(2);
		if (this.anInt2468 > 1) {
			this.anInt2467 = Static45.method869(4);
		}
		this.anIntArray298 = new int[this.anInt2468];
		this.anIntArray297 = new int[this.anInt2468];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2468; local42++) {
			Static45.method869(8);
			this.anIntArray298[local42] = Static45.method869(8);
			this.anIntArray297[local42] = Static45.method869(8);
		}
	}
}
