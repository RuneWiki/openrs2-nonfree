import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class36 {

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
	public final int anInt676;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "[I")
	public final int[] anIntArray30;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "[I")
	public final int[] anIntArray29;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
	public Class36() {
		Static338.method5170(16);
		this.anInt676 = Static338.method5169() == 0 ? 1 : Static338.method5170(4) + 1;
		if (Static338.method5169() != 0) {
			Static338.method5170(8);
		}
		Static338.method5170(2);
		if (this.anInt676 > 1) {
			this.anInt675 = Static338.method5170(4);
		}
		this.anIntArray30 = new int[this.anInt676];
		this.anIntArray29 = new int[this.anInt676];
		for (@Pc(42) int local42 = 0; local42 < this.anInt676; local42++) {
			Static338.method5170(8);
			this.anIntArray30[local42] = Static338.method5170(8);
			this.anIntArray29[local42] = Static338.method5170(8);
		}
	}
}
