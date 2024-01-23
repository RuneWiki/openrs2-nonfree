import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class138 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	public int anInt4505;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt4506;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class138() {
		Static142.method2253(16);
		this.anInt4505 = Static142.method2250() == 0 ? 1 : Static142.method2253(4) + 1;
		if (Static142.method2250() != 0) {
			Static142.method2253(8);
		}
		Static142.method2253(2);
		if (this.anInt4505 > 1) {
			this.anInt4506 = Static142.method2253(4);
		}
		this.anIntArray338 = new int[this.anInt4505];
		this.anIntArray337 = new int[this.anInt4505];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4505; local42++) {
			Static142.method2253(8);
			this.anIntArray338[local42] = Static142.method2253(8);
			this.anIntArray337[local42] = Static142.method2253(8);
		}
	}
}
