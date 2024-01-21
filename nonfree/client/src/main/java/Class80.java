import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class80 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public final int anInt2870;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public int anInt2869;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	public final int[] anIntArray411;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
	public final int[] anIntArray410;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class80() {
		Static118.method1747(16);
		this.anInt2870 = Static118.method1756() == 0 ? 1 : Static118.method1747(4) + 1;
		if (Static118.method1756() != 0) {
			Static118.method1747(8);
		}
		Static118.method1747(2);
		if (this.anInt2870 > 1) {
			this.anInt2869 = Static118.method1747(4);
		}
		this.anIntArray411 = new int[this.anInt2870];
		this.anIntArray410 = new int[this.anInt2870];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2870; local42++) {
			Static118.method1747(8);
			this.anIntArray411[local42] = Static118.method1747(8);
			this.anIntArray410[local42] = Static118.method1747(8);
		}
	}
}
