import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class181 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public final int anInt5124;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public int anInt5125;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
	public final int[] anIntArray276;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
	public final int[] anIntArray275;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class181() {
		Static425.method6651(16);
		this.anInt5124 = Static425.method6653() == 0 ? 1 : Static425.method6651(4) + 1;
		if (Static425.method6653() != 0) {
			Static425.method6651(8);
		}
		Static425.method6651(2);
		if (this.anInt5124 > 1) {
			this.anInt5125 = Static425.method6651(4);
		}
		this.anIntArray276 = new int[this.anInt5124];
		this.anIntArray275 = new int[this.anInt5124];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5124; local42++) {
			Static425.method6651(8);
			this.anIntArray276[local42] = Static425.method6651(8);
			this.anIntArray275[local42] = Static425.method6651(8);
		}
	}
}
