import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class48 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public final int anInt881;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
	public int anInt880;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "[I")
	public final int[] anIntArray75;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "[I")
	public final int[] anIntArray76;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class48() {
		Static262.method4628(16);
		this.anInt881 = Static262.method4624() == 0 ? 1 : Static262.method4628(4) + 1;
		if (Static262.method4624() != 0) {
			Static262.method4628(8);
		}
		Static262.method4628(2);
		if (this.anInt881 > 1) {
			this.anInt880 = Static262.method4628(4);
		}
		this.anIntArray75 = new int[this.anInt881];
		this.anIntArray76 = new int[this.anInt881];
		for (@Pc(42) int local42 = 0; local42 < this.anInt881; local42++) {
			Static262.method4628(8);
			this.anIntArray75[local42] = Static262.method4628(8);
			this.anIntArray76[local42] = Static262.method4628(8);
		}
	}
}
