import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class67 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public final int anInt2772;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public int anInt2771;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
	public final int[] anIntArray221;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
	public final int[] anIntArray220;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class67() {
		Static22.method492(16);
		this.anInt2772 = Static22.method489() == 0 ? 1 : Static22.method492(4) + 1;
		if (Static22.method489() != 0) {
			Static22.method492(8);
		}
		Static22.method492(2);
		if (this.anInt2772 > 1) {
			this.anInt2771 = Static22.method492(4);
		}
		this.anIntArray221 = new int[this.anInt2772];
		this.anIntArray220 = new int[this.anInt2772];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2772; local42++) {
			Static22.method492(8);
			this.anIntArray221[local42] = Static22.method492(8);
			this.anIntArray220[local42] = Static22.method492(8);
		}
	}
}
