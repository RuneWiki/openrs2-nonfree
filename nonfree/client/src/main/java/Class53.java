import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class53 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public final int anInt2304;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
	public final int[] anIntArray235;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
	public final int[] anIntArray234;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class53() {
		Static5.method90(16);
		this.anInt2304 = Static5.method88() == 0 ? 1 : Static5.method90(4) + 1;
		if (Static5.method88() != 0) {
			Static5.method90(8);
		}
		Static5.method90(2);
		if (this.anInt2304 > 1) {
			this.anInt2303 = Static5.method90(4);
		}
		this.anIntArray235 = new int[this.anInt2304];
		this.anIntArray234 = new int[this.anInt2304];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2304; local42++) {
			Static5.method90(8);
			this.anIntArray235[local42] = Static5.method90(8);
			this.anIntArray234[local42] = Static5.method90(8);
		}
	}
}
