import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class73 {

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public final int anInt1807;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	public int anInt1806;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "[I")
	public final int[] anIntArray90;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "[I")
	public final int[] anIntArray89;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class73() {
		Static258.method3655(16);
		this.anInt1807 = Static258.method3653() == 0 ? 1 : Static258.method3655(4) + 1;
		if (Static258.method3653() != 0) {
			Static258.method3655(8);
		}
		Static258.method3655(2);
		if (this.anInt1807 > 1) {
			this.anInt1806 = Static258.method3655(4);
		}
		this.anIntArray90 = new int[this.anInt1807];
		this.anIntArray89 = new int[this.anInt1807];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1807; local42++) {
			Static258.method3655(8);
			this.anIntArray90[local42] = Static258.method3655(8);
			this.anIntArray89[local42] = Static258.method3655(8);
		}
	}
}
