import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class15 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public final int anInt452;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
	public final int[] anIntArray98;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	public final int[] anIntArray99;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class15() {
		Static73.method1211(16);
		this.anInt452 = Static73.method1209() == 0 ? 1 : Static73.method1211(4) + 1;
		if (Static73.method1209() != 0) {
			Static73.method1211(8);
		}
		Static73.method1211(2);
		if (this.anInt452 > 1) {
			this.anInt453 = Static73.method1211(4);
		}
		this.anIntArray98 = new int[this.anInt452];
		this.anIntArray99 = new int[this.anInt452];
		for (@Pc(42) int local42 = 0; local42 < this.anInt452; local42++) {
			Static73.method1211(8);
			this.anIntArray98[local42] = Static73.method1211(8);
			this.anIntArray99[local42] = Static73.method1211(8);
		}
	}
}
