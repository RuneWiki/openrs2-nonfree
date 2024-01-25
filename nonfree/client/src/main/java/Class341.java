import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class341 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
	public final int anInt9122;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
	public int anInt9123;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
	public final int[] anIntArray662;

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
	public final int[] anIntArray661;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
	public Class341() {
		Static178.method3071(16);
		this.anInt9122 = Static178.method3072() == 0 ? 1 : Static178.method3071(4) + 1;
		if (Static178.method3072() != 0) {
			Static178.method3071(8);
		}
		Static178.method3071(2);
		if (this.anInt9122 > 1) {
			this.anInt9123 = Static178.method3071(4);
		}
		this.anIntArray662 = new int[this.anInt9122];
		this.anIntArray661 = new int[this.anInt9122];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9122; local42++) {
			Static178.method3071(8);
			this.anIntArray662[local42] = Static178.method3071(8);
			this.anIntArray661[local42] = Static178.method3071(8);
		}
	}
}
