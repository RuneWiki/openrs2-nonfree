import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class30 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	public final int anInt614;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public final int[] anIntArray35;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "[I")
	public final int[] anIntArray36;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class30() {
		Static255.method4563(16);
		this.anInt614 = Static255.method4558() == 0 ? 1 : Static255.method4563(4) + 1;
		if (Static255.method4558() != 0) {
			Static255.method4563(8);
		}
		Static255.method4563(2);
		if (this.anInt614 > 1) {
			this.anInt615 = Static255.method4563(4);
		}
		this.anIntArray35 = new int[this.anInt614];
		this.anIntArray36 = new int[this.anInt614];
		for (@Pc(42) int local42 = 0; local42 < this.anInt614; local42++) {
			Static255.method4563(8);
			this.anIntArray35[local42] = Static255.method4563(8);
			this.anIntArray36[local42] = Static255.method4563(8);
		}
	}
}
