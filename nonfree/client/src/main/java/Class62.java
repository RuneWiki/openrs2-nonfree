import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class62 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public final int anInt2758;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public int anInt2759;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
	public final int[] anIntArray277;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
	public final int[] anIntArray276;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class62() {
		Static20.method401(16);
		this.anInt2758 = Static20.method403() == 0 ? 1 : Static20.method401(4) + 1;
		if (Static20.method403() != 0) {
			Static20.method401(8);
		}
		Static20.method401(2);
		if (this.anInt2758 > 1) {
			this.anInt2759 = Static20.method401(4);
		}
		this.anIntArray277 = new int[this.anInt2758];
		this.anIntArray276 = new int[this.anInt2758];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2758; local42++) {
			Static20.method401(8);
			this.anIntArray277[local42] = Static20.method401(8);
			this.anIntArray276[local42] = Static20.method401(8);
		}
	}
}
