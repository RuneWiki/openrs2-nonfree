import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class64 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public int anInt2633;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public final int[] anIntArray398;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
	public final int[] anIntArray397;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class64() {
		Static95.method1793(16);
		this.anInt2634 = Static95.method1785() == 0 ? 1 : Static95.method1793(4) + 1;
		if (Static95.method1785() != 0) {
			Static95.method1793(8);
		}
		Static95.method1793(2);
		if (this.anInt2634 > 1) {
			this.anInt2633 = Static95.method1793(4);
		}
		this.anIntArray398 = new int[this.anInt2634];
		this.anIntArray397 = new int[this.anInt2634];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2634; local42++) {
			Static95.method1793(8);
			this.anIntArray398[local42] = Static95.method1793(8);
			this.anIntArray397[local42] = Static95.method1793(8);
		}
	}
}
