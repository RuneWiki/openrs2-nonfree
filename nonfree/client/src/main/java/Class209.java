import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class209 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public final int anInt5980;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public int anInt5979;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
	public final int[] anIntArray602;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
	public final int[] anIntArray601;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class209() {
		Static239.method4142(16);
		this.anInt5980 = Static239.method4146() == 0 ? 1 : Static239.method4142(4) + 1;
		if (Static239.method4146() != 0) {
			Static239.method4142(8);
		}
		Static239.method4142(2);
		if (this.anInt5980 > 1) {
			this.anInt5979 = Static239.method4142(4);
		}
		this.anIntArray602 = new int[this.anInt5980];
		this.anIntArray601 = new int[this.anInt5980];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5980; local42++) {
			Static239.method4142(8);
			this.anIntArray602[local42] = Static239.method4142(8);
			this.anIntArray601[local42] = Static239.method4142(8);
		}
	}
}
