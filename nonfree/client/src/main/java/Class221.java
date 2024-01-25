import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class221 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public final int anInt6330;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	public int anInt6331;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
	public final int[] anIntArray406;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
	public final int[] anIntArray407;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class221() {
		Static277.method4187(16);
		this.anInt6330 = Static277.method4184() == 0 ? 1 : Static277.method4187(4) + 1;
		if (Static277.method4184() != 0) {
			Static277.method4187(8);
		}
		Static277.method4187(2);
		if (this.anInt6330 > 1) {
			this.anInt6331 = Static277.method4187(4);
		}
		this.anIntArray406 = new int[this.anInt6330];
		this.anIntArray407 = new int[this.anInt6330];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6330; local42++) {
			Static277.method4187(8);
			this.anIntArray406[local42] = Static277.method4187(8);
			this.anIntArray407[local42] = Static277.method4187(8);
		}
	}
}
