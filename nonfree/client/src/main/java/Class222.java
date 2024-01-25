import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class222 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	public final int anInt6950;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public int anInt6949;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
	public final int[] anIntArray564;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "[I")
	public final int[] anIntArray565;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class222() {
		Static27.method614(16);
		this.anInt6950 = Static27.method608() == 0 ? 1 : Static27.method614(4) + 1;
		if (Static27.method608() != 0) {
			Static27.method614(8);
		}
		Static27.method614(2);
		if (this.anInt6950 > 1) {
			this.anInt6949 = Static27.method614(4);
		}
		this.anIntArray564 = new int[this.anInt6950];
		this.anIntArray565 = new int[this.anInt6950];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6950; local42++) {
			Static27.method614(8);
			this.anIntArray564[local42] = Static27.method614(8);
			this.anIntArray565[local42] = Static27.method614(8);
		}
	}
}
