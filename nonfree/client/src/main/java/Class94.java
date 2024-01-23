import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class94 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt2917;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class94() {
		Static24.method544(16);
		this.anInt2917 = Static24.method540() == 0 ? 1 : Static24.method544(4) + 1;
		if (Static24.method540() != 0) {
			Static24.method544(8);
		}
		Static24.method544(2);
		if (this.anInt2917 > 1) {
			this.anInt2916 = Static24.method544(4);
		}
		this.anIntArray240 = new int[this.anInt2917];
		this.anIntArray239 = new int[this.anInt2917];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2917; local42++) {
			Static24.method544(8);
			this.anIntArray240[local42] = Static24.method544(8);
			this.anIntArray239[local42] = Static24.method544(8);
		}
	}
}
