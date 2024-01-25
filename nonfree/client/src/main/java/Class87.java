import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class87 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public final int anInt2189;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public int anInt2190;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
	public final int[] anIntArray197;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[I")
	public final int[] anIntArray196;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class87() {
		Static582.method7785(16);
		this.anInt2189 = Static582.method7795() == 0 ? 1 : Static582.method7785(4) + 1;
		if (Static582.method7795() != 0) {
			Static582.method7785(8);
		}
		Static582.method7785(2);
		if (this.anInt2189 > 1) {
			this.anInt2190 = Static582.method7785(4);
		}
		this.anIntArray197 = new int[this.anInt2189];
		this.anIntArray196 = new int[this.anInt2189];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2189; local42++) {
			Static582.method7785(8);
			this.anIntArray197[local42] = Static582.method7785(8);
			this.anIntArray196[local42] = Static582.method7785(8);
		}
	}
}
