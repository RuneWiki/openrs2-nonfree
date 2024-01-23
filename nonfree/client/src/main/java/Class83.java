import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class83 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public int anInt3604;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
	public int[] anIntArray474;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class83() {
		Static169.method2754(16);
		this.anInt3604 = Static169.method2758() == 0 ? 1 : Static169.method2754(4) + 1;
		if (Static169.method2758() != 0) {
			Static169.method2754(8);
		}
		Static169.method2754(2);
		if (this.anInt3604 > 1) {
			this.anInt3605 = Static169.method2754(4);
		}
		this.anIntArray475 = new int[this.anInt3604];
		this.anIntArray474 = new int[this.anInt3604];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3604; local42++) {
			Static169.method2754(8);
			this.anIntArray475[local42] = Static169.method2754(8);
			this.anIntArray474[local42] = Static169.method2754(8);
		}
	}
}
