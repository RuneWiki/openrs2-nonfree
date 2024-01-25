import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class262 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public final int anInt7078;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public int anInt7079;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
	public final int[] anIntArray628;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
	public final int[] anIntArray629;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class262() {
		Static262.method3516(16);
		this.anInt7078 = Static262.method3517() == 0 ? 1 : Static262.method3516(4) + 1;
		if (Static262.method3517() != 0) {
			Static262.method3516(8);
		}
		Static262.method3516(2);
		if (this.anInt7078 > 1) {
			this.anInt7079 = Static262.method3516(4);
		}
		this.anIntArray628 = new int[this.anInt7078];
		this.anIntArray629 = new int[this.anInt7078];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7078; local42++) {
			Static262.method3516(8);
			this.anIntArray628[local42] = Static262.method3516(8);
			this.anIntArray629[local42] = Static262.method3516(8);
		}
	}
}
