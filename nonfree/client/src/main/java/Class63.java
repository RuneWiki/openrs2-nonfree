import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class63 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public final int anInt3077;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public int anInt3076;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public final int[] anIntArray279;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
	public final int[] anIntArray278;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class63() {
		Static2.method20(16);
		this.anInt3077 = Static2.method17() == 0 ? 1 : Static2.method20(4) + 1;
		if (Static2.method17() != 0) {
			Static2.method20(8);
		}
		Static2.method20(2);
		if (this.anInt3077 > 1) {
			this.anInt3076 = Static2.method20(4);
		}
		this.anIntArray279 = new int[this.anInt3077];
		this.anIntArray278 = new int[this.anInt3077];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3077; local42++) {
			Static2.method20(8);
			this.anIntArray279[local42] = Static2.method20(8);
			this.anIntArray278[local42] = Static2.method20(8);
		}
	}
}
