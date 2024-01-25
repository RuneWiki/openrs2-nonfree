import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class49 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public final int anInt1231;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	public final int[] anIntArray57;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
	public final int[] anIntArray58;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class49() {
		Static212.method3129(16);
		this.anInt1231 = Static212.method3136() == 0 ? 1 : Static212.method3129(4) + 1;
		if (Static212.method3136() != 0) {
			Static212.method3129(8);
		}
		Static212.method3129(2);
		if (this.anInt1231 > 1) {
			this.anInt1232 = Static212.method3129(4);
		}
		this.anIntArray57 = new int[this.anInt1231];
		this.anIntArray58 = new int[this.anInt1231];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1231; local42++) {
			Static212.method3129(8);
			this.anIntArray57[local42] = Static212.method3129(8);
			this.anIntArray58[local42] = Static212.method3129(8);
		}
	}
}
