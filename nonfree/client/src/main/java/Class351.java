import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class351 {

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
	public final int anInt9902;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
	public int anInt9903;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
	public final int[] anIntArray572;

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "[I")
	public final int[] anIntArray571;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
	public Class351() {
		Static281.method4245(16);
		this.anInt9902 = Static281.method4237() == 0 ? 1 : Static281.method4245(4) + 1;
		if (Static281.method4237() != 0) {
			Static281.method4245(8);
		}
		Static281.method4245(2);
		if (this.anInt9902 > 1) {
			this.anInt9903 = Static281.method4245(4);
		}
		this.anIntArray572 = new int[this.anInt9902];
		this.anIntArray571 = new int[this.anInt9902];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9902; local42++) {
			Static281.method4245(8);
			this.anIntArray572[local42] = Static281.method4245(8);
			this.anIntArray571[local42] = Static281.method4245(8);
		}
	}
}
