import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class217 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public final int anInt5944;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
	public int anInt5945;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
	public final int[] anIntArray509;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
	public final int[] anIntArray510;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class217() {
		Static403.method5306(16);
		this.anInt5944 = Static403.method5298() == 0 ? 1 : Static403.method5306(4) + 1;
		if (Static403.method5298() != 0) {
			Static403.method5306(8);
		}
		Static403.method5306(2);
		if (this.anInt5944 > 1) {
			this.anInt5945 = Static403.method5306(4);
		}
		this.anIntArray509 = new int[this.anInt5944];
		this.anIntArray510 = new int[this.anInt5944];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5944; local42++) {
			Static403.method5306(8);
			this.anIntArray509[local42] = Static403.method5306(8);
			this.anIntArray510[local42] = Static403.method5306(8);
		}
	}
}
