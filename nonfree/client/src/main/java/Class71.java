import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class71 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public final int anInt2599;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt2600;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
	public final int[] anIntArray290;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
	public final int[] anIntArray291;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class71() {
		Static107.method1884(16);
		this.anInt2599 = Static107.method1876() == 0 ? 1 : Static107.method1884(4) + 1;
		if (Static107.method1876() != 0) {
			Static107.method1884(8);
		}
		Static107.method1884(2);
		if (this.anInt2599 > 1) {
			this.anInt2600 = Static107.method1884(4);
		}
		this.anIntArray290 = new int[this.anInt2599];
		this.anIntArray291 = new int[this.anInt2599];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2599; local42++) {
			Static107.method1884(8);
			this.anIntArray290[local42] = Static107.method1884(8);
			this.anIntArray291[local42] = Static107.method1884(8);
		}
	}
}
