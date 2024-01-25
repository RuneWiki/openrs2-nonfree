import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class327 {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	public final int anInt9453;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	public int anInt9452;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
	public final int[] anIntArray516;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "[I")
	public final int[] anIntArray515;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class327() {
		Static79.method2072(16);
		this.anInt9453 = Static79.method2071() == 0 ? 1 : Static79.method2072(4) + 1;
		if (Static79.method2071() != 0) {
			Static79.method2072(8);
		}
		Static79.method2072(2);
		if (this.anInt9453 > 1) {
			this.anInt9452 = Static79.method2072(4);
		}
		this.anIntArray516 = new int[this.anInt9453];
		this.anIntArray515 = new int[this.anInt9453];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9453; local42++) {
			Static79.method2072(8);
			this.anIntArray516[local42] = Static79.method2072(8);
			this.anIntArray515[local42] = Static79.method2072(8);
		}
	}
}
