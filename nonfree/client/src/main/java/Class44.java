import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class44 {

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
	public final int anInt1119;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "[I")
	public final int[] anIntArray74;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "[I")
	public final int[] anIntArray73;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class44() {
		Static279.method4458(16);
		this.anInt1119 = Static279.method4448() == 0 ? 1 : Static279.method4458(4) + 1;
		if (Static279.method4448() != 0) {
			Static279.method4458(8);
		}
		Static279.method4458(2);
		if (this.anInt1119 > 1) {
			this.anInt1118 = Static279.method4458(4);
		}
		this.anIntArray74 = new int[this.anInt1119];
		this.anIntArray73 = new int[this.anInt1119];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1119; local42++) {
			Static279.method4458(8);
			this.anIntArray74[local42] = Static279.method4458(8);
			this.anIntArray73[local42] = Static279.method4458(8);
		}
	}
}
