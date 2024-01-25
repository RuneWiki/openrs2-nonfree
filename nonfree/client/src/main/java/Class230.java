import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class230 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public final int anInt6826;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	public int anInt6827;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "[I")
	public final int[] anIntArray566;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "[I")
	public final int[] anIntArray567;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class230() {
		Static137.method1944(16);
		this.anInt6826 = Static137.method1937() == 0 ? 1 : Static137.method1944(4) + 1;
		if (Static137.method1937() != 0) {
			Static137.method1944(8);
		}
		Static137.method1944(2);
		if (this.anInt6826 > 1) {
			this.anInt6827 = Static137.method1944(4);
		}
		this.anIntArray566 = new int[this.anInt6826];
		this.anIntArray567 = new int[this.anInt6826];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6826; local42++) {
			Static137.method1944(8);
			this.anIntArray566[local42] = Static137.method1944(8);
			this.anIntArray567[local42] = Static137.method1944(8);
		}
	}
}
