import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class153 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public final int anInt4136;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public int anInt4137;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
	public final int[] anIntArray479;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "[I")
	public final int[] anIntArray480;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class153() {
		Static188.method3555(16);
		this.anInt4136 = Static188.method3548() == 0 ? 1 : Static188.method3555(4) + 1;
		if (Static188.method3548() != 0) {
			Static188.method3555(8);
		}
		Static188.method3555(2);
		if (this.anInt4136 > 1) {
			this.anInt4137 = Static188.method3555(4);
		}
		this.anIntArray479 = new int[this.anInt4136];
		this.anIntArray480 = new int[this.anInt4136];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4136; local42++) {
			Static188.method3555(8);
			this.anIntArray479[local42] = Static188.method3555(8);
			this.anIntArray480[local42] = Static188.method3555(8);
		}
	}
}
