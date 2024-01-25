import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class170 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public final int anInt5276;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
	public final int[] anIntArray447;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
	public final int[] anIntArray446;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class170() {
		Static205.method3860(16);
		this.anInt5276 = Static205.method3858() == 0 ? 1 : Static205.method3860(4) + 1;
		if (Static205.method3858() != 0) {
			Static205.method3860(8);
		}
		Static205.method3860(2);
		if (this.anInt5276 > 1) {
			this.anInt5277 = Static205.method3860(4);
		}
		this.anIntArray447 = new int[this.anInt5276];
		this.anIntArray446 = new int[this.anInt5276];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5276; local42++) {
			Static205.method3860(8);
			this.anIntArray447[local42] = Static205.method3860(8);
			this.anIntArray446[local42] = Static205.method3860(8);
		}
	}
}
