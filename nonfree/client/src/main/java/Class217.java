import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class217 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public final int anInt6061;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public int anInt6062;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	public final int[] anIntArray443;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public final int[] anIntArray444;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class217() {
		Static191.method3462(16);
		this.anInt6061 = Static191.method3463() == 0 ? 1 : Static191.method3462(4) + 1;
		if (Static191.method3463() != 0) {
			Static191.method3462(8);
		}
		Static191.method3462(2);
		if (this.anInt6061 > 1) {
			this.anInt6062 = Static191.method3462(4);
		}
		this.anIntArray443 = new int[this.anInt6061];
		this.anIntArray444 = new int[this.anInt6061];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6061; local42++) {
			Static191.method3462(8);
			this.anIntArray443[local42] = Static191.method3462(8);
			this.anIntArray444[local42] = Static191.method3462(8);
		}
	}
}
