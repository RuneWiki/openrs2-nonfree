import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class154 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public final int anInt4620;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public int anInt4619;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
	public final int[] anIntArray368;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
	public final int[] anIntArray367;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class154() {
		Static334.method5797(16);
		this.anInt4620 = Static334.method5799() == 0 ? 1 : Static334.method5797(4) + 1;
		if (Static334.method5799() != 0) {
			Static334.method5797(8);
		}
		Static334.method5797(2);
		if (this.anInt4620 > 1) {
			this.anInt4619 = Static334.method5797(4);
		}
		this.anIntArray368 = new int[this.anInt4620];
		this.anIntArray367 = new int[this.anInt4620];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4620; local42++) {
			Static334.method5797(8);
			this.anIntArray368[local42] = Static334.method5797(8);
			this.anIntArray367[local42] = Static334.method5797(8);
		}
	}
}
