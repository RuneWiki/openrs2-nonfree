import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public final int anInt158;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	public final int[] anIntArray25;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	public final int[] anIntArray26;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class2() {
		Static83.method1399(16);
		this.anInt158 = Static83.method1404() == 0 ? 1 : Static83.method1399(4) + 1;
		if (Static83.method1404() != 0) {
			Static83.method1399(8);
		}
		Static83.method1399(2);
		if (this.anInt158 > 1) {
			this.anInt157 = Static83.method1399(4);
		}
		this.anIntArray25 = new int[this.anInt158];
		this.anIntArray26 = new int[this.anInt158];
		for (@Pc(42) int local42 = 0; local42 < this.anInt158; local42++) {
			Static83.method1399(8);
			this.anIntArray25[local42] = Static83.method1399(8);
			this.anIntArray26[local42] = Static83.method1399(8);
		}
	}
}
