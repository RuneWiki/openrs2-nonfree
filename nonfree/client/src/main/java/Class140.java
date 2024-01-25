import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class140 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public final int anInt4088;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
	public final int[] anIntArray408;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
	public final int[] anIntArray407;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class140() {
		Static112.method1970(16);
		this.anInt4088 = Static112.method1965() == 0 ? 1 : Static112.method1970(4) + 1;
		if (Static112.method1965() != 0) {
			Static112.method1970(8);
		}
		Static112.method1970(2);
		if (this.anInt4088 > 1) {
			this.anInt4089 = Static112.method1970(4);
		}
		this.anIntArray408 = new int[this.anInt4088];
		this.anIntArray407 = new int[this.anInt4088];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4088; local42++) {
			Static112.method1970(8);
			this.anIntArray408[local42] = Static112.method1970(8);
			this.anIntArray407[local42] = Static112.method1970(8);
		}
	}
}
