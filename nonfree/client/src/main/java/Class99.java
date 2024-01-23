import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class99 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
	public int anInt3525;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public int anInt3524;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class99() {
		Static51.method986(16);
		this.anInt3525 = Static51.method989() == 0 ? 1 : Static51.method986(4) + 1;
		if (Static51.method989() != 0) {
			Static51.method986(8);
		}
		Static51.method986(2);
		if (this.anInt3525 > 1) {
			this.anInt3524 = Static51.method986(4);
		}
		this.anIntArray319 = new int[this.anInt3525];
		this.anIntArray320 = new int[this.anInt3525];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3525; local42++) {
			Static51.method986(8);
			this.anIntArray319[local42] = Static51.method986(8);
			this.anIntArray320[local42] = Static51.method986(8);
		}
	}
}
