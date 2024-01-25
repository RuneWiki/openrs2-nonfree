import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class18 {

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public final int anInt348;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	public final int[] anIntArray24;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
	public final int[] anIntArray23;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class18() {
		Static316.method4101(16);
		this.anInt348 = Static316.method4097() == 0 ? 1 : Static316.method4101(4) + 1;
		if (Static316.method4097() != 0) {
			Static316.method4101(8);
		}
		Static316.method4101(2);
		if (this.anInt348 > 1) {
			this.anInt347 = Static316.method4101(4);
		}
		this.anIntArray24 = new int[this.anInt348];
		this.anIntArray23 = new int[this.anInt348];
		for (@Pc(42) int local42 = 0; local42 < this.anInt348; local42++) {
			Static316.method4101(8);
			this.anIntArray24[local42] = Static316.method4101(8);
			this.anIntArray23[local42] = Static316.method4101(8);
		}
	}
}
