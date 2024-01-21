import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class83 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public final int anInt4012;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public int anInt4011;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
	public final int[] anIntArray579;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
	public final int[] anIntArray578;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class83() {
		Static73.method1408(16);
		this.anInt4012 = Static73.method1406() == 0 ? 1 : Static73.method1408(4) + 1;
		if (Static73.method1406() != 0) {
			Static73.method1408(8);
		}
		Static73.method1408(2);
		if (this.anInt4012 > 1) {
			this.anInt4011 = Static73.method1408(4);
		}
		this.anIntArray579 = new int[this.anInt4012];
		this.anIntArray578 = new int[this.anInt4012];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4012; local42++) {
			Static73.method1408(8);
			this.anIntArray579[local42] = Static73.method1408(8);
			this.anIntArray578[local42] = Static73.method1408(8);
		}
	}
}
