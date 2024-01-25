import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class110 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public final int anInt2659;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public int anInt2660;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
	public final int[] anIntArray304;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
	public final int[] anIntArray303;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class110() {
		Static177.method2862(16);
		this.anInt2659 = Static177.method2865() == 0 ? 1 : Static177.method2862(4) + 1;
		if (Static177.method2865() != 0) {
			Static177.method2862(8);
		}
		Static177.method2862(2);
		if (this.anInt2659 > 1) {
			this.anInt2660 = Static177.method2862(4);
		}
		this.anIntArray304 = new int[this.anInt2659];
		this.anIntArray303 = new int[this.anInt2659];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2659; local42++) {
			Static177.method2862(8);
			this.anIntArray304[local42] = Static177.method2862(8);
			this.anIntArray303[local42] = Static177.method2862(8);
		}
	}
}
