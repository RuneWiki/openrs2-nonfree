import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class106 {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt4174;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt4173;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class106() {
		Static130.method2477(16);
		this.anInt4174 = Static130.method2478() == 0 ? 1 : Static130.method2477(4) + 1;
		if (Static130.method2478() != 0) {
			Static130.method2477(8);
		}
		Static130.method2477(2);
		if (this.anInt4174 > 1) {
			this.anInt4173 = Static130.method2477(4);
		}
		this.anIntArray310 = new int[this.anInt4174];
		this.anIntArray311 = new int[this.anInt4174];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4174; local42++) {
			Static130.method2477(8);
			this.anIntArray310[local42] = Static130.method2477(8);
			this.anIntArray311[local42] = Static130.method2477(8);
		}
	}
}
