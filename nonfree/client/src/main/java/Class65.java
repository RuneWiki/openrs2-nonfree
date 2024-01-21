import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class65 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public final int anInt2816;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
	public final int[] anIntArray250;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "[I")
	public final int[] anIntArray249;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class65() {
		Static177.method2560(16);
		this.anInt2816 = Static177.method2569() == 0 ? 1 : Static177.method2560(4) + 1;
		if (Static177.method2569() != 0) {
			Static177.method2560(8);
		}
		Static177.method2560(2);
		if (this.anInt2816 > 1) {
			this.anInt2817 = Static177.method2560(4);
		}
		this.anIntArray250 = new int[this.anInt2816];
		this.anIntArray249 = new int[this.anInt2816];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2816; local42++) {
			Static177.method2560(8);
			this.anIntArray250[local42] = Static177.method2560(8);
			this.anIntArray249[local42] = Static177.method2560(8);
		}
	}
}
