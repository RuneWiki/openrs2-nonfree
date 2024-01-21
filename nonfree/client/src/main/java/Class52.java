import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class52 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public final int anInt2641;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	public int anInt2642;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
	public final int[] anIntArray462;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class52() {
		Static36.method880(16);
		this.anInt2641 = Static36.method875() == 0 ? 1 : Static36.method880(4) + 1;
		if (Static36.method875() != 0) {
			Static36.method880(8);
		}
		Static36.method880(2);
		if (this.anInt2641 > 1) {
			this.anInt2642 = Static36.method880(4);
		}
		this.anIntArray463 = new int[this.anInt2641];
		this.anIntArray462 = new int[this.anInt2641];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2641; local42++) {
			Static36.method880(8);
			this.anIntArray463[local42] = Static36.method880(8);
			this.anIntArray462[local42] = Static36.method880(8);
		}
	}
}
