import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class73 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public final int anInt2272;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public int anInt2273;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
	public final int[] anIntArray248;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
	public final int[] anIntArray249;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class73() {
		Static40.method758(16);
		this.anInt2272 = Static40.method762() == 0 ? 1 : Static40.method758(4) + 1;
		if (Static40.method762() != 0) {
			Static40.method758(8);
		}
		Static40.method758(2);
		if (this.anInt2272 > 1) {
			this.anInt2273 = Static40.method758(4);
		}
		this.anIntArray248 = new int[this.anInt2272];
		this.anIntArray249 = new int[this.anInt2272];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2272; local42++) {
			Static40.method758(8);
			this.anIntArray248[local42] = Static40.method758(8);
			this.anIntArray249[local42] = Static40.method758(8);
		}
	}
}
