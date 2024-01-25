import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class82 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public final int anInt2422;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public int anInt2423;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "[I")
	public final int[] anIntArray191;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "[I")
	public final int[] anIntArray190;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class82() {
		Static288.method4189(16);
		this.anInt2422 = Static288.method4185() == 0 ? 1 : Static288.method4189(4) + 1;
		if (Static288.method4185() != 0) {
			Static288.method4189(8);
		}
		Static288.method4189(2);
		if (this.anInt2422 > 1) {
			this.anInt2423 = Static288.method4189(4);
		}
		this.anIntArray191 = new int[this.anInt2422];
		this.anIntArray190 = new int[this.anInt2422];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2422; local42++) {
			Static288.method4189(8);
			this.anIntArray191[local42] = Static288.method4189(8);
			this.anIntArray190[local42] = Static288.method4189(8);
		}
	}
}
