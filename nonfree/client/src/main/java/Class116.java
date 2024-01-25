import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class116 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	public final int anInt2875;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public int anInt2876;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
	public final int[] anIntArray225;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
	public final int[] anIntArray226;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class116() {
		Static287.method3803(16);
		this.anInt2875 = Static287.method3805() == 0 ? 1 : Static287.method3803(4) + 1;
		if (Static287.method3805() != 0) {
			Static287.method3803(8);
		}
		Static287.method3803(2);
		if (this.anInt2875 > 1) {
			this.anInt2876 = Static287.method3803(4);
		}
		this.anIntArray225 = new int[this.anInt2875];
		this.anIntArray226 = new int[this.anInt2875];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2875; local42++) {
			Static287.method3803(8);
			this.anIntArray225[local42] = Static287.method3803(8);
			this.anIntArray226[local42] = Static287.method3803(8);
		}
	}
}
