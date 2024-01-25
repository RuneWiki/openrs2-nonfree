import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class150 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public final int anInt4700;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public int anInt4699;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
	public final int[] anIntArray302;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
	public final int[] anIntArray301;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class150() {
		Static427.method5467(16);
		this.anInt4700 = Static427.method5459() == 0 ? 1 : Static427.method5467(4) + 1;
		if (Static427.method5459() != 0) {
			Static427.method5467(8);
		}
		Static427.method5467(2);
		if (this.anInt4700 > 1) {
			this.anInt4699 = Static427.method5467(4);
		}
		this.anIntArray302 = new int[this.anInt4700];
		this.anIntArray301 = new int[this.anInt4700];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4700; local42++) {
			Static427.method5467(8);
			this.anIntArray302[local42] = Static427.method5467(8);
			this.anIntArray301[local42] = Static427.method5467(8);
		}
	}
}
