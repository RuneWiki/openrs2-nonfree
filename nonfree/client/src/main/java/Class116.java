import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class116 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public final int anInt3380;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public int anInt3381;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
	public final int[] anIntArray351;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
	public final int[] anIntArray352;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class116() {
		Static281.method4896(16);
		this.anInt3380 = Static281.method4889() == 0 ? 1 : Static281.method4896(4) + 1;
		if (Static281.method4889() != 0) {
			Static281.method4896(8);
		}
		Static281.method4896(2);
		if (this.anInt3380 > 1) {
			this.anInt3381 = Static281.method4896(4);
		}
		this.anIntArray351 = new int[this.anInt3380];
		this.anIntArray352 = new int[this.anInt3380];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3380; local42++) {
			Static281.method4896(8);
			this.anIntArray351[local42] = Static281.method4896(8);
			this.anIntArray352[local42] = Static281.method4896(8);
		}
	}
}
