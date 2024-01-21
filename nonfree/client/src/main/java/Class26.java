import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class26 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public final int anInt1126;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public int anInt1125;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
	public final int[] anIntArray126;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
	public final int[] anIntArray127;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class26() {
		Static112.method1795(16);
		this.anInt1126 = Static112.method1793() == 0 ? 1 : Static112.method1795(4) + 1;
		if (Static112.method1793() != 0) {
			Static112.method1795(8);
		}
		Static112.method1795(2);
		if (this.anInt1126 > 1) {
			this.anInt1125 = Static112.method1795(4);
		}
		this.anIntArray126 = new int[this.anInt1126];
		this.anIntArray127 = new int[this.anInt1126];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1126; local42++) {
			Static112.method1795(8);
			this.anIntArray126[local42] = Static112.method1795(8);
			this.anIntArray127[local42] = Static112.method1795(8);
		}
	}
}
