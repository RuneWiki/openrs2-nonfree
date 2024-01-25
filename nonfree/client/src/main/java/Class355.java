import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class355 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
	public final int anInt9058;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public int anInt9059;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "[I")
	public final int[] anIntArray639;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
	public final int[] anIntArray640;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class355() {
		Static113.method2136(16);
		this.anInt9058 = Static113.method2133() == 0 ? 1 : Static113.method2136(4) + 1;
		if (Static113.method2133() != 0) {
			Static113.method2136(8);
		}
		Static113.method2136(2);
		if (this.anInt9058 > 1) {
			this.anInt9059 = Static113.method2136(4);
		}
		this.anIntArray639 = new int[this.anInt9058];
		this.anIntArray640 = new int[this.anInt9058];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9058; local42++) {
			Static113.method2136(8);
			this.anIntArray639[local42] = Static113.method2136(8);
			this.anIntArray640[local42] = Static113.method2136(8);
		}
	}
}
