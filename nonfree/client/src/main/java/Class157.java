import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class157 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	public final int anInt5143;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	public int anInt5144;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
	public final int[] anIntArray420;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
	public final int[] anIntArray421;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class157() {
		Static300.method5083(16);
		this.anInt5143 = Static300.method5084() == 0 ? 1 : Static300.method5083(4) + 1;
		if (Static300.method5084() != 0) {
			Static300.method5083(8);
		}
		Static300.method5083(2);
		if (this.anInt5143 > 1) {
			this.anInt5144 = Static300.method5083(4);
		}
		this.anIntArray420 = new int[this.anInt5143];
		this.anIntArray421 = new int[this.anInt5143];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5143; local42++) {
			Static300.method5083(8);
			this.anIntArray420[local42] = Static300.method5083(8);
			this.anIntArray421[local42] = Static300.method5083(8);
		}
	}
}
