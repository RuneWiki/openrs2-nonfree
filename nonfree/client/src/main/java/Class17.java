import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class17 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public final int anInt743;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	public int anInt744;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
	public final int[] anIntArray93;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "[I")
	public final int[] anIntArray92;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class17() {
		Static115.method1781(16);
		this.anInt743 = Static115.method1780() == 0 ? 1 : Static115.method1781(4) + 1;
		if (Static115.method1780() != 0) {
			Static115.method1781(8);
		}
		Static115.method1781(2);
		if (this.anInt743 > 1) {
			this.anInt744 = Static115.method1781(4);
		}
		this.anIntArray93 = new int[this.anInt743];
		this.anIntArray92 = new int[this.anInt743];
		for (@Pc(42) int local42 = 0; local42 < this.anInt743; local42++) {
			Static115.method1781(8);
			this.anIntArray93[local42] = Static115.method1781(8);
			this.anIntArray92[local42] = Static115.method1781(8);
		}
	}
}
