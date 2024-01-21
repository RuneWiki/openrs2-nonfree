import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class77 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public final int anInt2924;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public int anInt2925;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	public final int[] anIntArray361;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
	public final int[] anIntArray362;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class77() {
		Static131.method2029(16);
		this.anInt2924 = Static131.method2030() == 0 ? 1 : Static131.method2029(4) + 1;
		if (Static131.method2030() != 0) {
			Static131.method2029(8);
		}
		Static131.method2029(2);
		if (this.anInt2924 > 1) {
			this.anInt2925 = Static131.method2029(4);
		}
		this.anIntArray361 = new int[this.anInt2924];
		this.anIntArray362 = new int[this.anInt2924];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2924; local42++) {
			Static131.method2029(8);
			this.anIntArray361[local42] = Static131.method2029(8);
			this.anIntArray362[local42] = Static131.method2029(8);
		}
	}
}
