import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class152 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public int anInt4456;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public int anInt4455;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	public int[] anIntArray476;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class152() {
		Static231.method3674(16);
		this.anInt4456 = Static231.method3669() == 0 ? 1 : Static231.method3674(4) + 1;
		if (Static231.method3669() != 0) {
			Static231.method3674(8);
		}
		Static231.method3674(2);
		if (this.anInt4456 > 1) {
			this.anInt4455 = Static231.method3674(4);
		}
		this.anIntArray476 = new int[this.anInt4456];
		this.anIntArray477 = new int[this.anInt4456];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4456; local42++) {
			Static231.method3674(8);
			this.anIntArray476[local42] = Static231.method3674(8);
			this.anIntArray477[local42] = Static231.method3674(8);
		}
	}
}
